package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.PessAbusoSubstancias;

public class PessAbusoSubstanciasDTO {
    private Long id;
    private String descSubstancia;
    private Integer qtdUsoSemanal;
    private Boolean hasCAPS_AD;
    private Boolean hasNA;
    private Boolean hasAA;

    public PessAbusoSubstanciasDTO(PessAbusoSubstancias pessAbusoSubstancias) {
        this.id = pessAbusoSubstancias.getId();
        this.descSubstancia = pessAbusoSubstancias.getDescSubstancia();
        this.qtdUsoSemanal = pessAbusoSubstancias.getQtdUsoSemanal();
        this.hasCAPS_AD = pessAbusoSubstancias.getHasCAPS_AD();
        this.hasNA = pessAbusoSubstancias.getHasNA();
        this.hasAA = pessAbusoSubstancias.getHasAA();
    }

    // Getters e Setters
}