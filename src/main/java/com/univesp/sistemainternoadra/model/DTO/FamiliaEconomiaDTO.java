package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.FamiliaEconomia;

public class FamiliaEconomiaDTO {
    private Long id;
    private Boolean hasTransferenciaRenda;
    private Boolean isBolsaFamilia;
    private Double valorBolsaFamilia;
    private Boolean isRendaCidada;
    private Double valorRendaCidada;
    private Boolean isBPC_PCD;
    private Double valorBPC_PCD;
    private Boolean isAcaoJovem;
    private Double valorAcaoJovem;
    private Boolean isBPC_ID;
    private Double valorBPC_ID;
    private Boolean isOutrasRendas;
    private Double valorOutrasRendas;
    private String situacaoImovel;
    private Double gastoImovel;
    private Boolean hasOutrosImoveis;
    private Boolean hasConducao;
    private Long fkConducao;
    private Integer qtdVeiculos;
    private Boolean isQuitado;
    private Boolean isFinanciado;
    private Double valorPrestacao;

    public FamiliaEconomiaDTO(FamiliaEconomia familiaEconomia) {
        this.id = familiaEconomia.getId();
        this.hasTransferenciaRenda = familiaEconomia.getHasTransferenciaRenda();
        this.isBolsaFamilia = familiaEconomia.getIsBolsaFamilia();
        this.valorBolsaFamilia = familiaEconomia.getValorBolsaFamilia();
        this.isRendaCidada = familiaEconomia.getIsRendaCidada();
        this.valorRendaCidada = familiaEconomia.getValorRendaCidada();
        this.isBPC_PCD = familiaEconomia.getIsBPC_PCD();
        this.valorBPC_PCD = familiaEconomia.getValorBPC_PCD();
        this.isAcaoJovem = familiaEconomia.getIsAcaoJovem();
        this.valorAcaoJovem = familiaEconomia.getValorAcaoJovem();
        this.isBPC_ID = familiaEconomia.getIsBPC_ID();
        this.valorBPC_ID = familiaEconomia.getValorBPC_ID();
        this.isOutrasRendas = familiaEconomia.getIsOutrasRendas();
        this.valorOutrasRendas = familiaEconomia.getValorOutrasRendas();
        this.situacaoImovel = familiaEconomia.getSituacaoImovel();
        this.gastoImovel = familiaEconomia.getGastoImovel();
        this.hasOutrosImoveis = familiaEconomia.getHasOutrosImoveis();
        this.hasConducao = familiaEconomia.getHasConducao();
        this.fkConducao = familiaEconomia.getFkConducao();
        this.qtdVeiculos = familiaEconomia.getQtdVeiculos();
        this.isQuitado = familiaEconomia.getIsQuitado();
        this.isFinanciado = familiaEconomia.getIsFinanciado();
        this.valorPrestacao = familiaEconomia.getValorPrestacao();
    }

    // Getters e Setters
}