package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.Crianca;

public class CriancaDTO {
    private Long id;
    private Long fkCriancaShort;
    private String nome;
    private Long fkEndereco;
    private String nascimento;
    private Long fkSexo;
    private Long fkEtnia;
    private Long fkPai;
    private Long fkMae;
    private Long fkResponsavel;
    private Long fkEscolaridade;
    private Boolean hasLazer;
    private String[] arrDescLazer;

    public CriancaDTO(Crianca crianca) {
        this.id = crianca.getId();
        this.fkCriancaShort = crianca.getFkCriancaShort();
        this.nome = crianca.getNome();
        this.fkEndereco = crianca.getFkEndereco();
        this.nascimento = crianca.getNascimento();
        this.fkSexo = crianca.getFkSexo();
        this.fkEtnia = crianca.getFkEtnia();
        this.fkPai = crianca.getFkPai();
        this.fkMae = crianca.getFkMae();
        this.fkResponsavel = crianca.getFkResponsavel();
        this.fkEscolaridade = crianca.getFkEscolaridade();
        this.hasLazer = crianca.getHasLazer();
        this.arrDescLazer = crianca.getArrDescLazer().split(";");
    }

    // Getters e Setters
}