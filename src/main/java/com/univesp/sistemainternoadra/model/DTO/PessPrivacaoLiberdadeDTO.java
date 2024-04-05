package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.PessPrivacaoLiberdade;

public class PessPrivacaoLiberdadeDTO {
    private Long id;
    private String situacaoPrivacao;
    private String localidadePrivacao;

    public PessPrivacaoLiberdadeDTO(PessPrivacaoLiberdade privacaoLiberdade) {
        this.id = privacaoLiberdade.getId();
        this.situacaoPrivacao = privacaoLiberdade.getSituacaoPrivacao();
        this.localidadePrivacao = privacaoLiberdade.getLocalidadePrivacao();
    }

    // Getters e Setters
}