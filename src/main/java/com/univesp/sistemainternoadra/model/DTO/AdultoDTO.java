package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.Adulto;

public class AdultoDTO {
    private Long id;
    private Long fkAdultoShort;
    private String nome;
    private Integer idade;
    private Long fkSexo;
    private Boolean isPresente;
    private Boolean isAusente;
    private Boolean isFalecido;
    private Boolean isSeparado;
    private Boolean isOutro;
    private String descOutro;
    private Long fkEndereco;
    private String telefone;
    private String nisPis;
    private String rg;
    private String orgaoEmissor;
    private String cpf;
    private Boolean isEmpregado;
    private String localTrabalho;
    private Double rendaMensal;
    private Long fkEscolaridade;

    public AdultoDTO(Adulto adulto) {
        this.id = adulto.getId();
        this.fkAdultoShort = adulto.getFkAdultoShort();
        this.nome = adulto.getNome();
        this.idade = adulto.getIdade();
        this.fkSexo = adulto.getFkSexo();
        this.isPresente = adulto.getIsPresente();
        this.isAusente = adulto.getIsAusente();
        this.isFalecido = adulto.getIsFalecido();
        this.isSeparado = adulto.getIsSeparado();
        this.isOutro = adulto.getIsOutro();
        this.descOutro = adulto.getDescOutro();
        this.fkEndereco = adulto.getFkEndereco();
        this.telefone = adulto.getTelefone();
        this.nisPis = adulto.getNisPis();
        this.rg = adulto.getRg();
        this.orgaoEmissor = adulto.getOrgaoEmissor();
        this.cpf = adulto.getCpf();
        this.isEmpregado = adulto.getIsEmpregado();
        this.localTrabalho = adulto.getLocalTrabalho();
        this.rendaMensal = adulto.getRendaMensal();
        this.fkEscolaridade = adulto.getFkEscolaridade();
    }

    // Getters e Setters
}