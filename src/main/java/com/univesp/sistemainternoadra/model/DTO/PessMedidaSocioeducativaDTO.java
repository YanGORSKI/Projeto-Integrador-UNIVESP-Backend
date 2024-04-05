package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.PessMedidaSocioeducativa;

public class PessMedidaSocioeducativaDTO {
    private Long id;
    private String situacaoMedida;
    private String localidadeMedida;

    public PessMedidaSocioeducativaDTO(PessMedidaSocioeducativa medidaSocioeducativa) {
        this.id = medidaSocioeducativa.getId();
        this.situacaoMedida = medidaSocioeducativa.getSituacaoMedida();
        this.localidadeMedida = medidaSocioeducativa.getLocalidadeMedida();
    }

    // Getters e Setters
}