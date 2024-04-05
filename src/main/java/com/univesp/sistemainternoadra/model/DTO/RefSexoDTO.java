package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.RefEtnia;
import com.univesp.sistemainternoadra.model.DAO.RefSexo;

public class RefSexoDTO {
    private Long id;
    private String descricao;

    public RefSexoDTO(RefSexo sexo) {
        this.id = sexo.getId();
        this.descricao = sexo.getDescricao();
    }

    // Getters e Setters
}