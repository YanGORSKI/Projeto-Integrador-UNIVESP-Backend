package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Bens")
public class FamiliaBens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bens")
    private Long id;

    @Column(name = "has_sofa")
    private Boolean hasSofa;

    @Column(name = "qtd_sofa")
    private Integer qtdSofa;

    @Column(name = "has_tv")
    private Boolean hasTV;

    @Column(name = "qtd_tv")
    private Integer qtdTV;

    @Column(name = "has_dvd")
    private Boolean hasDVD;

    @Column(name = "has_internet")
    private Boolean hasInternet;

    @Column(name = "has_computador")
    private Boolean hasComputador;

    @Column(name = "qtd_computador")
    private Integer qtdComputador;

    @Column(name = "has_aparelho_som")
    private Boolean hasAparelhoSom;

    @Column(name = "qtd_aparelho_som")
    private Integer qtdAparelhoSom;

    @Column(name = "has_notebook")
    private Boolean hasNotebook;

    @Column(name = "qtd_notebook")
    private Integer qtdNotebook;

    @Column(name = "has_fogao")
    private Boolean hasFogao;

    @Column(name = "qtd_bocas_fogao")
    private Integer qtdBocasFogao;

    @Column(name = "has_armario_cozinha")
    private Boolean hasArmarioCozinha;

    @Column(name = "qtd_armario_cozinha")
    private Integer qtdArmarioCozinha;

    @Column(name = "has_mesa")
    private Boolean hasMesa;

    @Column(name = "qtd_mesa")
    private Integer qtdMesa;

    @Column(name = "has_cadeira")
    private Boolean hasCadeira;

    @Column(name = "qtd_cadeira")
    private Integer qtdCadeira;

    @Column(name = "has_lava_louca")
    private Boolean hasLavaLouca;

    @Column(name = "qtd_lava_louca")
    private Integer qtdLavaLouca;

    @Column(name = "has_geladeira")
    private Boolean hasGeladeira;

    @Column(name = "qtd_geladeira")
    private Integer qtdGeladeira;

    @Column(name = "has_filtro")
    private Boolean hasFiltro;

    @Column(name = "qtd_filtro")
    private Integer qtdFiltro;

    @Column(name = "has_freezer")
    private Boolean hasFreezer;

    @Column(name = "qtd_freezer")
    private Integer qtdFreezer;

    @Column(name = "has_microondas")
    private Boolean hasMicroondas;

    @Column(name = "qtd_microondas")
    private Integer qtdMicroondas;

    @Column(name = "has_cama")
    private Boolean hasCama;

    @Column(name = "qtd_cama")
    private Integer qtdCama;

    @Column(name = "has_guarda_roupa")
    private Boolean hasGuardaRoupa;

    @Column(name = "qtd_guarda_roupa")
    private Integer qtdGuardaRoupa;

    @Column(name = "has_escrivaninha")
    private Boolean hasEscrivaninha;

    @Column(name = "qtd_escrivaninha")
    private Integer qtdEscrivaninha;

    @Column(name = "has_comoda")
    private Boolean hasComoda;

    @Column(name = "qtd_comoda")
    private Integer qtdComoda;

    @Column(name = "has_vaso_sanitario")
    private Boolean hasVasoSanitario;

    @Column(name = "qtd_vaso_sanitario")
    private Integer qtdVasoSanitario;

    @Column(name = "has_chuveiro")
    private Boolean hasChuveiro;

    @Column(name = "qtd_chuveiro")
    private Integer qtdChuveiro;

    @Column(name = "has_azulejo")
    private Boolean hasAzulejo;

    @Column(name = "has_box")
    private Boolean hasBox;

    @Column(name = "qtd_box")
    private Integer qtdBox;

    @Column(name = "has_armario_banheiro")
    private Boolean hasArmarioBanheiro;

    @Column(name = "qtd_armario_banheiro")
    private Integer qtdArmarioBanheiro;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Boolean getHasSofa() {
        return hasSofa;
    }

    public Integer getQtdSofa() {
        return qtdSofa;
    }

    public Boolean getHasTV() {
        return hasTV;
    }

    public Integer getQtdTV() {
        return qtdTV;
    }

    public Boolean getHasDVD() {
        return hasDVD;
    }

    public Boolean getHasInternet() {
        return hasInternet;
    }

    public Boolean getHasComputador() {
        return hasComputador;
    }

    public Integer getQtdComputador() {
        return qtdComputador;
    }

    public Boolean getHasAparelhoSom() {
        return hasAparelhoSom;
    }

    public Integer getQtdAparelhoSom() {
        return qtdAparelhoSom;
    }

    public Boolean getHasNotebook() {
        return hasNotebook;
    }

    public Integer getQtdNotebook() {
        return qtdNotebook;
    }

    public Boolean getHasFogao() {
        return hasFogao;
    }

    public Integer getQtdBocasFogao() {
        return qtdBocasFogao;
    }

    public Boolean getHasArmarioCozinha() {
        return hasArmarioCozinha;
    }

    public Integer getQtdArmarioCozinha() {
        return qtdArmarioCozinha;
    }

    public Boolean getHasMesa() {
        return hasMesa;
    }

    public Integer getQtdMesa() {
        return qtdMesa;
    }

    public Boolean getHasCadeira() {
        return hasCadeira;
    }

    public Integer getQtdCadeira() {
        return qtdCadeira;
    }

    public Boolean getHasLavaLouca() {
        return hasLavaLouca;
    }

    public Integer getQtdLavaLouca() {
        return qtdLavaLouca;
    }

    public Boolean getHasGeladeira() {
        return hasGeladeira;
    }

    public Integer getQtdGeladeira() {
        return qtdGeladeira;
    }

    public Boolean getHasFiltro() {
        return hasFiltro;
    }

    public Integer getQtdFiltro() {
        return qtdFiltro;
    }

    public Boolean getHasFreezer() {
        return hasFreezer;
    }

    public Integer getQtdFreezer() {
        return qtdFreezer;
    }

    public Boolean getHasMicroondas() {
        return hasMicroondas;
    }

    public Integer getQtdMicroondas() {
        return qtdMicroondas;
    }

    public Boolean getHasCama() {
        return hasCama;
    }

    public Integer getQtdCama() {
        return qtdCama;
    }

    public Boolean getHasGuardaRoupa() {
        return hasGuardaRoupa;
    }

    public Integer getQtdGuardaRoupa() {
        return qtdGuardaRoupa;
    }

    public Boolean getHasEscrivaninha() {
        return hasEscrivaninha;
    }

    public Integer getQtdEscrivaninha() {
        return qtdEscrivaninha;
    }

    public Boolean getHasComoda() {
        return hasComoda;
    }

    public Integer getQtdComoda() {
        return qtdComoda;
    }

    public Boolean getHasVasoSanitario() {
        return hasVasoSanitario;
    }

    public Integer getQtdVasoSanitario() {
        return qtdVasoSanitario;
    }

    public Boolean getHasChuveiro() {
        return hasChuveiro;
    }

    public Integer getQtdChuveiro() {
        return qtdChuveiro;
    }

    public Boolean getHasAzulejo() {
        return hasAzulejo;
    }

    public Boolean getHasBox() {
        return hasBox;
    }

    public Integer getQtdBox() {
        return qtdBox;
    }

    public Boolean getHasArmarioBanheiro() {
        return hasArmarioBanheiro;
    }

    public Integer getQtdArmarioBanheiro() {
        return qtdArmarioBanheiro;
    }
}