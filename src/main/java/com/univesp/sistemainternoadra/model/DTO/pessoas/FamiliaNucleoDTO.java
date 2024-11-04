package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.FamiliaNucleo;

public class FamiliaNucleoDTO {
    private Long id;
    private String arrFkAdultoShort;
    private String arrFkCriancaShort;
    private String nome;
    private Long fkEconFamilia;
    private Long fkSocialFamilia;
    private Long fkSituacaoBairro;
    private Long fkSituacaoCasa;
    private Long fkBens;
    private Long fkDespesasCasa;
    private String arrFkAnimal;
    private Boolean motivoIsTrabalhoInfantilDomestico;
    private Boolean motivoIsTrabalhoInfantilExterno;
    private Boolean motivoIsExploracaoSexual;
    private Boolean motivoIsAtividadesIlicitas;
    private Boolean motivoIsOutros;
    private String descMotivo;
    private String relacionamentoFamiliar;

    public FamiliaNucleoDTO(FamiliaNucleo familiaNucleo) {
        this.id = familiaNucleo.getId();
        this.arrFkAdultoShort = familiaNucleo.getArrFkAdultoShort();
        this.arrFkCriancaShort = familiaNucleo.getArrFkCriancaShort();
        this.nome = familiaNucleo.getNome();
        this.fkEconFamilia = familiaNucleo.getFkEconFamilia();
        this.fkSocialFamilia = familiaNucleo.getFkSocialFamilia();
        this.fkSituacaoBairro = familiaNucleo.getFkSituacaoBairro();
        this.fkSituacaoCasa = familiaNucleo.getFkSituacaoCasa();
        this.fkBens = familiaNucleo.getFkBens();
        this.fkDespesasCasa = familiaNucleo.getFkDespesasCasa();
        this.arrFkAnimal = familiaNucleo.getArrFkAnimal();
        this.motivoIsTrabalhoInfantilDomestico = familiaNucleo.getMotivoIsTrabalhoInfantilDomestico();
        this.motivoIsTrabalhoInfantilExterno = familiaNucleo.getMotivoIsTrabalhoInfantilExterno();
        this.motivoIsExploracaoSexual = familiaNucleo.getMotivoIsExploracaoSexual();
        this.motivoIsAtividadesIlicitas = familiaNucleo.getMotivoIsAtividadesIlicitas();
        this.motivoIsOutros = familiaNucleo.getMotivoIsOutros();
        this.descMotivo = familiaNucleo.getDescMotivo();
        this.relacionamentoFamiliar = familiaNucleo.getRelacionamentoFamiliar();
    }

    // Getters e Setters
}