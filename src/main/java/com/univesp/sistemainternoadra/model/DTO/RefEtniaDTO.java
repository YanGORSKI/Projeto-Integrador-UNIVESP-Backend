package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.RefEtnia;

public class RefEtniaDTO {
    private Long id;
    private String descricao;

    public RefEtniaDTO(RefEtnia etnia) {
        this.id = etnia.getId();
        this.descricao = etnia.getDescricao();
    }

    // Getters e Setters
}