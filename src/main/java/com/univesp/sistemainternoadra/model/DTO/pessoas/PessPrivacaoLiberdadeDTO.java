package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessPrivacaoLiberdade;

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