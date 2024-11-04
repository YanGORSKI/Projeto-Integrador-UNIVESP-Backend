package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.FamiliaSituacaoCasa;

public class FamiliaSituacaoCasaDTO {
    private Long id;
    private Integer qtdSalaDeEstar;
    private Integer qtdQuartos;
    private Integer qtdSalaDeJantar;
    private Integer qtdBanheiros;
    private Integer qtdCozinhas;
    private Integer qtdLavanderia;
    private String[] arrOutroComodos;

    public FamiliaSituacaoCasaDTO(FamiliaSituacaoCasa situacaoCasa) {
        this.id = situacaoCasa.getId();
        this.qtdSalaDeEstar = situacaoCasa.getQtdSalaDeEstar();
        this.qtdQuartos = situacaoCasa.getQtdQuartos();
        this.qtdSalaDeJantar = situacaoCasa.getQtdSalaDeJantar();
        this.qtdBanheiros = situacaoCasa.getQtdBanheiros();
        this.qtdCozinhas = situacaoCasa.getQtdCozinhas();
        this.qtdLavanderia = situacaoCasa.getQtdLavanderia();
        this.arrOutroComodos = situacaoCasa.getArrOutroComodos().split(";");
    }

    // Getters e Setters
}