package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Despesas_Casa")
public class FamiliaDespesasCasa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despesas")
    private Long id;

    @Column(name = "valor_energia")
    private Double valorEnergia;

    @Column(name = "valor_telefonia")
    private Double valorTelefonia;

    @Column(name = "valor_alimentacao")
    private Double valorAlimentacao;

    @Column(name = "valor_aluguel")
    private Double valorAluguel;

    @Column(name = "valor_condominio")
    private Double valorCondominio;

    @Column(name = "valor_plano_de_saude")
    private Double valorPlanoDeSaude;

    @Column(name = "valor_iptu")
    private Double valorIPTU;

    @Column(name = "valor_ipva")
    private Double valorIPVA;

    @Column(name = "valor_transporte")
    private Double valorTransporte;

    @Column(name = "valor_internet")
    private Double valorInternet;

    @Column(name = "valor_educacao")
    private Double valorEducacao;

    @Column(name = "valor_financiamento")
    private Double valorFinanciamento;

    @Column(name = "valor_outras_despesas")
    private Double valorOutrasDespesas;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Double getValorEnergia() {
        return valorEnergia;
    }

    public Double getValorTelefonia() {
        return valorTelefonia;
    }

    public Double getValorAlimentacao() {
        return valorAlimentacao;
    }

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public Double getValorCondominio() {
        return valorCondominio;
    }

    public Double getValorPlanoDeSaude() {
        return valorPlanoDeSaude;
    }

    public Double getValorIPTU() {
        return valorIPTU;
    }

    public Double getValorIPVA() {
        return valorIPVA;
    }

    public Double getValorTransporte() {
        return valorTransporte;
    }

    public Double getValorInternet() {
        return valorInternet;
    }

    public Double getValorEducacao() {
        return valorEducacao;
    }

    public Double getValorFinanciamento() {
        return valorFinanciamento;
    }

    public Double getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }
}