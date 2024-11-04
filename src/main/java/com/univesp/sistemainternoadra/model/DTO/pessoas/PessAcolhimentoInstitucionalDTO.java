package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessAcolhimentoInstitucional;

public class PessAcolhimentoInstitucionalDTO {
    private Long id;
    private String situacaoAcolhimento;
    private String localidadeAcolhimento;

    public PessAcolhimentoInstitucionalDTO(PessAcolhimentoInstitucional pessAcolhimentoInstitucional) {
        this.id = pessAcolhimentoInstitucional.getId();
        this.situacaoAcolhimento = pessAcolhimentoInstitucional.getSituacaoAcolhimento();
        this.localidadeAcolhimento = pessAcolhimentoInstitucional.getLocalidadeAcolhimento();
    }

    // Getters e Setters
}