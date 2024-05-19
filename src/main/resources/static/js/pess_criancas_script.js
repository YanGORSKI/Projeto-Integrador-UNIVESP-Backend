$(document).ready(function() {
    loadCriancas();

    $('#entries').change(function() {
        loadCriancas();
    });
});

function loadCriancas() {
    let entries = $('#entries').val();

    $.ajax({
        url: '/pessoas/criancas/lista',
        type: 'GET',
        success: function(data) {
            let criancasList = $('#criancas-list');
            criancasList.empty();
            data.forEach(crianca => {
                let idade = calcularIdade(crianca.nascimento);
                let sexo = crianca.sexo;
                criancasList.append(`<tr>
                    <td><a href="detalhes_crianca.html?id=${crianca.id}">${crianca.nome}</a></td>
                    <td>${idade}</td>
                    <td>${sexo}</td>
                </tr>`);
            });
        },
        error: function(err) {
            console.error('Erro ao buscar a lista de crianças', err);
        }
    });
}

function calcularIdade(nascimento) {
    let dataNascimento = new Date(nascimento);
    let diferenca = Date.now() - dataNascimento.getTime();
    let idade = new Date(diferenca).getUTCFullYear() - 1970;
    return idade;
}