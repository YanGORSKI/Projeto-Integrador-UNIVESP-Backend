package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Pess_Abuso_Substancias")
public class PessAbusoSubstancias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_abuso_substancias")
    private Long id;

    @Column(name = "descSubstancia")
    private String descSubstancia;

    @Column(name = "qtdUsoSemanal")
    private Integer qtdUsoSemanal;

    @Column(name = "hasCAPS_AD")
    private Boolean hasCAPS_AD;

    @Column(name = "hasNA")
    private Boolean hasNA;

    @Column(name = "hasAA")
    private Boolean hasAA;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getDescSubstancia() {
        return descSubstancia;
    }

    public Integer getQtdUsoSemanal() {
        return qtdUsoSemanal;
    }

    public Boolean getHasCAPS_AD() {
        return hasCAPS_AD;
    }

    public Boolean getHasNA() {
        return hasNA;
    }

    public Boolean getHasAA() {
        return hasAA;
    }
}