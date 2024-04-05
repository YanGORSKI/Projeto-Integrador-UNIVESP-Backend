package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.FamiliaDespesasCasa;

public class FamiliaDespesasCasaDTO {
    private Long id;
    private Double valorEnergia;
    private Double valorTelefonia;
    private Double valorAlimentacao;
    private Double valorAluguel;
    private Double valorCondominio;
    private Double valorPlanoDeSaude;
    private Double valorIPTU;
    private Double valorIPVA;
    private Double valorTransporte;
    private Double valorInternet;
    private Double valorEducacao;
    private Double valorFinanciamento;
    private Double valorOutrasDespesas;

    public FamiliaDespesasCasaDTO(FamiliaDespesasCasa familiaDespesasCasa) {
        this.id = familiaDespesasCasa.getId();
        this.valorEnergia = familiaDespesasCasa.getValorEnergia();
        this.valorTelefonia = familiaDespesasCasa.getValorTelefonia();
        this.valorAlimentacao = familiaDespesasCasa.getValorAlimentacao();
        this.valorAluguel = familiaDespesasCasa.getValorAluguel();
        this.valorCondominio = familiaDespesasCasa.getValorCondominio();
        this.valorPlanoDeSaude = familiaDespesasCasa.getValorPlanoDeSaude();
        this.valorIPTU = familiaDespesasCasa.getValorIPTU();
        this.valorIPVA = familiaDespesasCasa.getValorIPVA();
        this.valorTransporte = familiaDespesasCasa.getValorTransporte();
        this.valorInternet = familiaDespesasCasa.getValorInternet();
        this.valorEducacao = familiaDespesasCasa.getValorEducacao();
        this.valorFinanciamento = familiaDespesasCasa.getValorFinanciamento();
        this.valorOutrasDespesas = familiaDespesasCasa.getValorOutrasDespesas();
    }

    // Getters e Setters
}