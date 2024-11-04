package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessEscolaridade;

public class PessEscolaridadeDTO {
    private Long id;
    private int ano;
    private int grau;
    private int periodo;
    private int situacao;
    private boolean isMatriculado;
    private String nomeEscola;
    private boolean isMunicipal;
    private boolean isEstadual;
    private boolean isParticular;
    private boolean isBolsista;

    public PessEscolaridadeDTO(PessEscolaridade pessEscolaridade) {
        this.id = pessEscolaridade.getId();
        this.ano = pessEscolaridade.getAno();
        this.grau = pessEscolaridade.getGrau();
        this.periodo = pessEscolaridade.getPeriodo();
        this.situacao = pessEscolaridade.getSituacao();
        this.isMatriculado = pessEscolaridade.getIsMatriculado();
        this.nomeEscola = pessEscolaridade.getNomeEscola();
        this.isMunicipal = pessEscolaridade.getIsMunicipal();
        this.isEstadual = pessEscolaridade.getIsEstadual();
        this.isParticular = pessEscolaridade.getIsParticular();
        this.isBolsista = pessEscolaridade.getIsBolsista();
    }

    // Getters e Setters
}