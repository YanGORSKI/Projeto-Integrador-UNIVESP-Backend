package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Economia")
public class FamiliaEconomia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_econ_familia")
    private Long id;

    @Column(name = "has_transferencia_renda")
    private Boolean hasTransferenciaRenda;

    @Column(name = "is_bolsa_familia")
    private Boolean isBolsaFamilia;

    @Column(name = "valor_bolsa_familia")
    private Double valorBolsaFamilia;

    @Column(name = "is_renda_cidada")
    private Boolean isRendaCidada;

    @Column(name = "valor_renda_cidada")
    private Double valorRendaCidada;

    @Column(name = "is_bpc_pcd")
    private Boolean isBPC_PCD;

    @Column(name = "valor_bpc_pcd")
    private Double valorBPC_PCD;

    @Column(name = "is_acao_jovem")
    private Boolean isAcaoJovem;

    @Column(name = "valor_acao_jovem")
    private Double valorAcaoJovem;

    @Column(name = "is_bpc_id")
    private Boolean isBPC_ID;

    @Column(name = "valor_bpc_id")
    private Double valorBPC_ID;

    @Column(name = "is_outras_rendas")
    private Boolean isOutrasRendas;

    @Column(name = "valor_outras_rendas")
    private Double valorOutrasRendas;

    @Column(name = "situacao_imovel")
    private String situacaoImovel;

    @Column(name = "gasto_imovel")
    private Double gastoImovel;

    @Column(name = "has_outros_imoveis")
    private Boolean hasOutrosImoveis;

    @Column(name = "has_conducao")
    private Boolean hasConducao;

    @Column(name = "fk_conducao")
    private Long fkConducao;

    @Column(name = "qtd_veiculos")
    private Integer qtdVeiculos;

    @Column(name = "is_quitado")
    private Boolean isQuitado;

    @Column(name = "is_financiado")
    private Boolean isFinanciado;

    @Column(name = "valor_prestacao")
    private Double valorPrestacao;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Boolean getHasTransferenciaRenda() {
        return hasTransferenciaRenda;
    }

    public Boolean getIsBolsaFamilia() {
        return isBolsaFamilia;
    }

    public Double getValorBolsaFamilia() {
        return valorBolsaFamilia;
    }

    public Boolean getIsRendaCidada() {
        return isRendaCidada;
    }

    public Double getValorRendaCidada() {
        return valorRendaCidada;
    }

    public Boolean getIsBPC_PCD() {
        return isBPC_PCD;
    }

    public Double getValorBPC_PCD() {
        return valorBPC_PCD;
    }

    public Boolean getIsAcaoJovem() {
        return isAcaoJovem;
    }

    public Double getValorAcaoJovem() {
        return valorAcaoJovem;
    }

    public Boolean getIsBPC_ID() {
        return isBPC_ID;
    }

    public Double getValorBPC_ID() {
        return valorBPC_ID;
    }

    public Boolean getIsOutrasRendas() {
        return isOutrasRendas;
    }

    public Double getValorOutrasRendas() {
        return valorOutrasRendas;
    }

    public String getSituacaoImovel() {
        return situacaoImovel;
    }

    public Double getGastoImovel() {
        return gastoImovel;
    }

    public Boolean getHasOutrosImoveis() {
        return hasOutrosImoveis;
    }

    public Boolean getHasConducao() {
        return hasConducao;
    }

    public Long getFkConducao() {
        return fkConducao;
    }

    public Integer getQtdVeiculos() {
        return qtdVeiculos;
    }

    public Boolean getIsQuitado() {
        return isQuitado;
    }

    public Boolean getIsFinanciado() {
        return isFinanciado;
    }

    public Double getValorPrestacao() {
        return valorPrestacao;
    }
}