package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.FamiliaSituacaoBairro;

public class FamiliaSituacaoBairroDTO {
    private Long id;
    private String nome;
    private Boolean hasColetaLixo;
    private Boolean hasRedeEsgoto;
    private Boolean hasAsfalto;
    private Boolean hasTransporteColetivo;
    private Boolean hasEscola;
    private Boolean hasCreche;
    private Boolean hasUBS;
    private Boolean hasCRAS;
    private String[] arrOutros;

    public FamiliaSituacaoBairroDTO(FamiliaSituacaoBairro situacaoBairro) {
        this.id = situacaoBairro.getId();
        this.nome = situacaoBairro.getNome();
        this.hasColetaLixo = situacaoBairro.getHasColetaLixo();
        this.hasRedeEsgoto = situacaoBairro.getHasRedeEsgoto();
        this.hasAsfalto = situacaoBairro.getHasAsfalto();
        this.hasTransporteColetivo = situacaoBairro.getHasTransporteColetivo();
        this.hasEscola = situacaoBairro.getHasEscola();
        this.hasCreche = situacaoBairro.getHasCreche();
        this.hasUBS = situacaoBairro.getHasUBS();
        this.hasCRAS = situacaoBairro.getHasCRAS();
        this.arrOutros = situacaoBairro.getArrOutros().split(";");
    }

    // Getters e Setters
}