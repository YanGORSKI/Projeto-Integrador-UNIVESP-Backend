package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Nucleo")
public class FamiliaNucleo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_familia")
    private Long id;

    @Column(name = "arr_fk_adulto_short")
    private String arrFkAdultoShort;

    @Column(name = "arr_fk_crianca_short")
    private String arrFkCriancaShort;

    @Column(name = "nome")
    private String nome;

    @Column(name = "fk_econ_familia")
    private Long fkEconFamilia;

    @Column(name = "fk_social_familia")
    private Long fkSocialFamilia;

    @Column(name = "fk_situacao_bairro")
    private Long fkSituacaoBairro;

    @Column(name = "fk_situacao_casa")
    private Long fkSituacaoCasa;

    @Column(name = "fk_bens")
    private Long fkBens;

    @Column(name = "fk_despesas_casa")
    private Long fkDespesasCasa;

    @Column(name = "arr_fk_animal")
    private String arrFkAnimal;

    @Column(name = "motivo_is_trabalho_infantil_domestico")
    private Boolean motivoIsTrabalhoInfantilDomestico;

    @Column(name = "motivo_is_trabalho_infantil_externo")
    private Boolean motivoIsTrabalhoInfantilExterno;

    @Column(name = "motivo_is_exploracao_sexual")
    private Boolean motivoIsExploracaoSexual;

    @Column(name = "motivo_is_atividades_ilicitas")
    private Boolean motivoIsAtividadesIlicitas;

    @Column(name = "motivo_is_outros")
    private Boolean motivoIsOutros;

    @Column(name = "desc_motivo")
    private String descMotivo;

    @Column(name = "relacionamento_familiar")
    private String relacionamentoFamiliar;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public String getArrFkAdultoShort() {
        return arrFkAdultoShort;
    }

    public String getArrFkCriancaShort() {
        return arrFkCriancaShort;
    }

    public String getNome() {
        return nome;
    }

    public Long getFkEconFamilia() {
        return fkEconFamilia;
    }

    public Long getFkSocialFamilia() {
        return fkSocialFamilia;
    }

    public Long getFkSituacaoBairro() {
        return fkSituacaoBairro;
    }

    public Long getFkSituacaoCasa() {
        return fkSituacaoCasa;
    }

    public Long getFkBens() {
        return fkBens;
    }

    public Long getFkDespesasCasa() {
        return fkDespesasCasa;
    }

    public String getArrFkAnimal() {
        return arrFkAnimal;
    }

    public Boolean getMotivoIsTrabalhoInfantilDomestico() {
        return motivoIsTrabalhoInfantilDomestico;
    }

    public Boolean getMotivoIsTrabalhoInfantilExterno() {
        return motivoIsTrabalhoInfantilExterno;
    }

    public Boolean getMotivoIsExploracaoSexual() {
        return motivoIsExploracaoSexual;
    }

    public Boolean getMotivoIsAtividadesIlicitas() {
        return motivoIsAtividadesIlicitas;
    }

    public Boolean getMotivoIsOutros() {
        return motivoIsOutros;
    }

    public String getDescMotivo() {
        return descMotivo;
    }

    public String getRelacionamentoFamiliar() {
        return relacionamentoFamiliar;
    }
}