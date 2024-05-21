document.addEventListener('DOMContentLoaded', function() {
    const formCrianca = document.getElementById('form-crianca');

    function closePopup(popupId) {
        const popup = document.getElementById(popupId);
        if (popup) {
            popup.style.display = 'none';
        }
    }

    // Fechar popups ao clicar no botão de fechar
    const closeButtons = document.querySelectorAll('.close-popup');
    closeButtons.forEach(button => {
        button.addEventListener('click', function() {
            const popup = button.closest('.popup');
            if (popup) {
                popup.style.display = 'none';
            }
        });
    });

    // Manipulador de envio de formulário
    if (formCrianca) {
        formCrianca.addEventListener('submit', function(event) {
            event.preventDefault(); // Previne o envio padrão do formulário

            // Coletando dados dos campos do formulário
            const nome = document.getElementById('nome')?.value || '';
            const nascimento = document.getElementById('nascimento')?.value || '';
            const fkSexo = document.getElementById('fk_sexo')?.value || '';
            const fkEnderecoId = document.getElementById('fk_endereco_id')?.value || '';
            const fkEscolaridadeId = document.getElementById('fk_escolaridade_id')?.value || '';
            const fkEtnia = document.getElementById('fk_etnia')?.value || '';
            const fkResponsavel = document.getElementById('fk_responsavel')?.value || '';
            const hasLazer = document.getElementById('has_lazer')?.checked || false;
            const arrDescLazer = document.getElementById('arr_desc_lazer')?.value || '';
            const fkPai = document.getElementById('fk_pai')?.value || '';
            const fkMae = document.getElementById('fk_mae')?.value || '';

            console.log("nome=" + nome + ", ",
                        "nascimento=" + nascimento + ", ",
                        "fkSexo=" + fkSexo + ", ",
                        "fkEnderecoId=" + fkEnderecoId + ", ",
                        "fkEscolaridadeId=" + fkEscolaridadeId + ", ",
                        "fkEtnia=" + fkEtnia + ", ",
                        "hasLazer=" + hasLazer + ", ",
                        "arrDescLazer=" + arrDescLazer + ", ",
                        "fkResponsavel=" + fkResponsavel + ", ",
                        "fkPai=" + fkPai + ", ",
                        "fkMae=" + fkMae)

            // Verificar campos obrigatórios
            if (nome === '' || nascimento === '' || fkEnderecoId === '' || fkEscolaridadeId === '' || fkEtnia === '') {
                alert('Por favor, preencha todos os campos obrigatórios.');
                return;
            }

            // Montando o corpo da solicitação JSON
            const data = {
                nome: nome,
                nascimento: nascimento,
                fkSexo: fkSexo,
                fkEndereco: fkEnderecoId,
                fkEscolaridade: fkEscolaridadeId,
                fkEtnia: fkEtnia,
                fkResponsavel: fkResponsavel,
                hasLazer: hasLazer,
                arrDescLazer: arrDescLazer,
                fkPai: fkPai,
                fkMae: fkMae
            };

            // Enviando a solicitação via fetch
            fetch('/pessoas/criancas/salvar', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            })
            .then(response => {
                if (response.ok) {
                    alert('Criança cadastrada com sucesso');
                    window.location.href = '/pessoas/index'; // Redireciona para a página de listagem ou outra página desejada
                } else {
                    return response.text().then(text => { throw new Error(text); });
                }
            })
            .catch(error => {
                console.error('Erro ao cadastrar criança:', error);
                alert('Erro ao cadastrar criança: ' + error.message);
            });
        });
    }

    // Handle the Endereco popup
    const addEnderecoBtn = document.getElementById('add-endereco-btn');
    const enderecoPopup = document.getElementById('endereco-popup');
    const addEnderecoSaveBtn = document.getElementById('add-endereco-save-btn');
    const enderecoField = document.getElementById('fk_endereco');
    const enderecoIdField = document.getElementById('fk_endereco_id');

    if (addEnderecoBtn && enderecoPopup && addEnderecoSaveBtn && enderecoField && enderecoIdField) {
        addEnderecoBtn.addEventListener('click', function() {
            enderecoPopup.style.display = 'block';
        });

        addEnderecoSaveBtn.addEventListener('click', function() {
            const logradouro = document.getElementById('endereco-logradouro')?.value || '';
            const numero = document.getElementById('endereco-numero')?.value || '';
            const bairro = document.getElementById('endereco-bairro')?.value || '';
            const cidade = document.getElementById('endereco-cidade')?.value || '';
            const estado = document.getElementById('endereco-estado')?.value || '';
            const cep = document.getElementById('endereco-cep')?.value || '';

            const data = {
                endereco: logradouro,
                numero: numero,
                bairro: bairro,
                cidade: cidade,
                estado: estado,
                cep: cep
            };

            fetch('/pessoas/endereco', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            })
            .then(response => response.json())
            .then(endereco => {
                console.log('Endereço adicionado:', endereco);

                enderecoIdField.value = endereco.id;

                const resumo = `${endereco.endereco}, ${endereco.numero}, ${endereco.bairro}, ${endereco.cidade} - ${endereco.estado}, CEP: ${endereco.cep}`;
                enderecoField.innerHTML = `<option value="${endereco.id}">${resumo}</option>`;
                enderecoField.value = resumo;

                enderecoPopup.style.display = 'none';
            })
            .catch(error => {
                console.error('Erro ao adicionar endereço:', error);
            });
        });
    }

    const searchCepBtn = document.getElementById('search-cep-btn');
    if (searchCepBtn) {
        searchCepBtn.addEventListener('click', function() {
            const cepInput = document.getElementById('endereco-cep');
            if (cepInput) {
                const cep = cepInput.value;

                fetch(`https://viacep.com.br/ws/${cep}/json/`)
                .then(response => response.json())
                .then(data => {
                    if (data.erro) {
                        alert('CEP não encontrado!');
                    } else {
                        document.getElementById('endereco-logradouro').value = data.logradouro;
                        document.getElementById('endereco-bairro').value = data.bairro;
                        document.getElementById('endereco-cidade').value = data.localidade;
                        document.getElementById('endereco-estado').value = data.uf;
                    }
                })
                .catch(error => console.error('Erro ao buscar CEP:', error));
            }
        });
    }

    // Handle the Escolaridade popup
    const addEscolaridadeBtn = document.getElementById('add-escolaridade-btn');
    const escolaridadePopup = document.getElementById('escolaridade-popup');
    const addEscolaridadeSaveBtn = document.getElementById('add-escolaridade-save-btn');
    const escolaridadeField = document.getElementById('fk_escolaridade');
    const escolaridadeIdField = document.getElementById('fk_escolaridade_id'); // Campo oculto para o ID da escolaridade

    if (escolaridadeField && addEscolaridadeBtn && escolaridadePopup && addEscolaridadeSaveBtn) {
        addEscolaridadeBtn.addEventListener('click', function() {
            escolaridadePopup.style.display = 'block';
        });

        addEscolaridadeSaveBtn.addEventListener('click', function() {
            const ano = document.getElementById('ano')?.value || '';
            const grau = document.getElementById('grau')?.value || '';
            const periodo = document.getElementById('periodo')?.value || '';
            const situacao = document.getElementById('situacao')?.value || '';
            const isMatriculado = document.getElementById('is_matriculado')?.checked || false;
            const nomeEscola = document.getElementById('nome_escola')?.value || '';
            const tipoEscola = document.getElementById('tipo_escola')?.value || '';


            const data = {
                ano: parseInt(ano),
                grau: parseInt(grau),
                periodo: parseInt(periodo),
                situacao: parseInt(situacao),
                isMatriculado: isMatriculado,
                nomeEscola: nomeEscola,
                isMunicipal: tipoEscola === 'municipal',
                isEstadual: tipoEscola === 'estadual',
                isParticular: tipoEscola === 'particular',
                isBolsista: document.getElementById('is_bolsista').checked
            };

            fetch('/pessoas/escolaridade', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            })
            .then(response => response.json())
            .then(escolaridade => {
                console.log('Escolaridade adicionada:', escolaridade);

                // Vincular o ID da escolaridade ao campo oculto
                escolaridadeIdField.value = escolaridade.id;

                // Exibir um resumo da escolaridade no campo visível
                const resumo = `Ano: ${escolaridade.ano}, ${getGrauText(escolaridade.grau)}, ${getPeriodoText(escolaridade.periodo)}, ${getSituacaoText(escolaridade.situacao)}, ${escolaridade.isMatriculado ? 'Matriculado' : 'Não Matriculado'}, ${escolaridade.nomeEscola}, ${getTipoEscolaText(escolaridade)}`;
                escolaridadeField.innerHTML = `<option value="${escolaridade.id}">${resumo}</option>`;
                escolaridadeField.value = resumo;

                escolaridadePopup.style.display = 'none';
            })
            .catch(error => {
                console.error('Erro ao adicionar escolaridade:', error);
            });
        });
    }

    function getGrauText(grau) {
        // Replace with actual logic to get grau text
        return `Grau: ${grau}`;
    }

    function getPeriodoText(periodo) {
        // Replace with actual logic to get periodo text
        return `Período: ${periodo}`;
    }

    function getSituacaoText(situacao) {
        // Replace with actual logic to get situacao text
        return `Situação: ${situacao}`;
    }

    function getTipoEscolaText(escolaridade) {
        if (escolaridade.isMunicipal) return 'Municipal';
        if (escolaridade.isEstadual) return 'Estadual';
        if (escolaridade.isParticular) return 'Particular';
        return '';
    }

    // Search and add buttons logic for Responsavel, Pai, Mae
    const searchResponsavelBtn = document.getElementById('search-responsavel-btn');
    const addResponsavelBtn = document.getElementById('add-responsavel-btn');
    const searchPaiBtn = document.getElementById('search-pai-btn');
    const addPaiBtn = document.getElementById('add-pai-btn');
    const searchMaeBtn = document.getElementById('search-mae-btn');
    const addMaeBtn = document.getElementById('add-mae-btn');

    if (searchResponsavelBtn) {
        searchResponsavelBtn.addEventListener('click', function() {
            // Add logic to search for responsavel
        });
    }

    if (addResponsavelBtn) {
        addResponsavelBtn.addEventListener('click', function() {
            // Add logic to add a new responsavel
        });
    }

    if (searchPaiBtn) {
        searchPaiBtn.addEventListener('click', function() {
            // Add logic to search for pai
        });
    }

    if (addPaiBtn) {
        addPaiBtn.addEventListener('click', function() {
            // Add logic to add a new pai
        });
    }

    if (searchMaeBtn) {
        searchMaeBtn.addEventListener('click', function() {
            // Add logic to search for mae
        });
    }

    if (addMaeBtn) {
        addMaeBtn.addEventListener('click', function() {
            // Add logic to add a new mae
        });
    }

    function fetchDropdownOptions(endpoint, dropdownId) {
        fetch(endpoint)
            .then(response => response.json())
            .then(data => {
                const dropdown = document.getElementById(dropdownId);
                if (dropdown) {
                    dropdown.innerHTML = '';  // Clear existing options
                    for (const [value, text] of Object.entries(data)) {
                        const option = document.createElement('option');
                        option.value = value;
                        option.text = text;
                        dropdown.appendChild(option);
                    }
                } else {
                    console.error(`Dropdown with id ${dropdownId} not found.`);
                }
            })
            .catch(error => console.error('Error fetching dropdown options:', error));
    }

    fetchDropdownOptions('/api/correlacoes/etnia', 'fk_etnia');
    fetchDropdownOptions('/api/correlacoes/sexo', 'fk_sexo');
    fetchDropdownOptions('/api/correlacoes/escolaridade/grau', 'grau');
    fetchDropdownOptions('/api/correlacoes/escolaridade/periodo', 'periodo');
    fetchDropdownOptions('/api/correlacoes/escolaridade/situacao', 'situacao');
});