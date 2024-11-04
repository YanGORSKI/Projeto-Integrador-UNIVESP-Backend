package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessEndereco;

public class PessEnderecoDTO {
    private Long id;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;

    public PessEnderecoDTO(PessEndereco pessEndereco) {
        this.id = pessEndereco.getId();
        this.endereco = pessEndereco.getEndereco();
        this.numero = pessEndereco.getNumero();
        this.bairro = pessEndereco.getBairro();
        this.cidade = pessEndereco.getCidade();
        this.estado = pessEndereco.getEstado();
        this.CEP = pessEndereco.getCEP();
    }

    // Getters e Setters
}