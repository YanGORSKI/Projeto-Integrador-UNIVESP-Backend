package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.RefConducao;

public class RefConducaoDTO {
    private Long id;
    private String descricao;

    public RefConducaoDTO(RefConducao conducao) {
        this.id = conducao.getId();
        this.descricao = conducao.getDescricao();
    }

    // Getters e Setters
}