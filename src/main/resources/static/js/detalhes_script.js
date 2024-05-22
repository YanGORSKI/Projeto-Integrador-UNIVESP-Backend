document.addEventListener('DOMContentLoaded', function() {
    const formDetalhesCrianca = document.getElementById('form-detalhes-crianca');

    const urlParams = new URLSearchParams(window.location.search);
    const criancaId = urlParams.get('id');

    function fetchCriancaDetails(id) {
        fetch(`/pessoas/criancas/${id}`)
            .then(response => response.json())
            .then(crianca => {
                document.getElementById('nome').value = crianca.nome;
                document.getElementById('nascimento').value = crianca.nascimento;
                document.getElementById('fk_sexo').value = crianca.fkSexo;
                document.getElementById('fk_etnia').value = crianca.fkEtnia;
                document.getElementById('fk_responsavel').value = crianca.fkResponsavel;
                document.getElementById('has_lazer').checked = crianca.hasLazer;
                document.getElementById('arr_desc_lazer').value = crianca.arrDescLazer;
                document.getElementById('fk_pai').value = crianca.fkPai;
                document.getElementById('fk_mae').value = crianca.fkMae;

                fetchEscolaridade(crianca.fkEscolaridade);
                fetchEndereco(crianca.fkEndereco);

                populateDropdown('/api/correlacoes/sexo', 'fk_sexo', crianca.fkSexo);
                populateDropdown('/api/correlacoes/etnia', 'fk_etnia', crianca.fkEtnia);
            })
            .catch(error => {
                console.error('Erro ao buscar detalhes da criança:', error);
                alert('Erro ao buscar detalhes da criança');
            });
    }

    function fetchEscolaridade(id) {
        fetch(`/pessoas/escolaridade/${id}`)
            .then(response => response.json())
            .then(escolaridade => {
                Promise.all([
                    fetch('/api/correlacoes/escolaridade/grau').then(res => res.json()),
                    fetch('/api/correlacoes/escolaridade/periodo').then(res => res.json()),
                    fetch('/api/correlacoes/escolaridade/situacao').then(res => res.json())
                ]).then(([graus, periodos, situacoes]) => {
                    const resumoEscolaridade = `Ano: ${escolaridade.ano}, ${graus[escolaridade.grau]}, ${periodos[escolaridade.periodo]}, ${situacoes[escolaridade.situacao]}, ${escolaridade.isMatriculado ? 'Matriculado' : 'Não Matriculado'}, ${escolaridade.nomeEscola}, ${escolaridade.tipoEscola}`;
                    document.getElementById('fk_escolaridade').value = resumoEscolaridade;
                }).catch(error => {
                    console.error('Erro ao buscar correlações da escolaridade:', error);
                });
            })
            .catch(error => {
                console.error('Erro ao buscar detalhes da escolaridade:', error);
                alert('Erro ao buscar detalhes da escolaridade');
            });
    }

    function fetchEndereco(id) {
        fetch(`/pessoas/endereco/${id}`)
            .then(response => response.json())
            .then(endereco => {
                const resumoEndereco = `${endereco.endereco}, ${endereco.numero}, ${endereco.bairro}, ${endereco.cidade} - ${endereco.estado}, CEP: ${endereco.cep}`;
                document.getElementById('fk_endereco').value = resumoEndereco;
            })
            .catch(error => {
                console.error('Erro ao buscar detalhes do endereço:', error);
                alert('Erro ao buscar detalhes do endereço');
            });
    }

    function populateDropdown(endpoint, dropdownId, selectedValue) {
        fetch(endpoint)
            .then(response => response.json())
            .then(data => {
                const dropdown = document.getElementById(dropdownId);
                if (dropdown) {
                    dropdown.innerHTML = '';
                    for (const [value, text] of Object.entries(data)) {
                        const option = document.createElement('option');
                        option.value = value;
                        option.text = text;
                        if (value == selectedValue) {
                            option.selected = true;
                        }
                        dropdown.appendChild(option);
                    }
                }
            })
            .catch(error => console.error(`Erro ao preencher o dropdown ${dropdownId}:`, error));
    }

    if (criancaId) {
        fetchCriancaDetails(criancaId);
    } else {
        alert('ID da criança não fornecido');
    }
});