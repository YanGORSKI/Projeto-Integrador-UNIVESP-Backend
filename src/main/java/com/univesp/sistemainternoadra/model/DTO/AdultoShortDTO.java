package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.AdultoShort;

public class AdultoShortDTO {
    private Long id;
    private String nome;
    private int idade;
    private Long fkSexo;
    private Long fkEndereco;
    private boolean isEmpregado;
    private String profissao;
    private double rendaMensal;
    private Long fkEscolaridade;
    private Long fkPrivacao;
    private Long fkAcolhimento;
    private Long fkSaudePessoal;

    public AdultoShortDTO(AdultoShort adultoShort) {
        this.id = adultoShort.getId();
        this.nome = adultoShort.getNome();
        this.idade = adultoShort.getIdade();
        this.fkSexo = adultoShort.getFkSexo();
        this.fkEndereco = adultoShort.getFkEndereco();
        this.isEmpregado = adultoShort.isEmpregado();
        this.profissao = adultoShort.getProfissao();
        this.rendaMensal = adultoShort.getRendaMensal();
        this.fkEscolaridade = adultoShort.getFkEscolaridade();
        this.fkPrivacao = adultoShort.getFkPrivacao();
        this.fkAcolhimento = adultoShort.getFkAcolhimento();
        this.fkSaudePessoal = adultoShort.getFkSaudePessoal();
    }

    // Getters e Setters
}