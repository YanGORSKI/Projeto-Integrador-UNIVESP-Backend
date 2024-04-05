package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.FamiliaSocial;

import java.time.LocalDate;

public class FamiliaSocialDTO {

    private Long id;
    private Boolean hasCadastroUnico;
    private LocalDate dataAttCadastroUnico;
    private String refCRAS;
    private LocalDate dataRefCRAS;
    private String refCREAS;
    private LocalDate dataRefCREAS;
    private Boolean hasServicoConvivencia;
    private String categoriaServicoConvivencia;
    private String unidadeServicoConvivencia;
    private String[] arrFkAdultoShortPrivacaoLiberdade;

    public FamiliaSocialDTO() {
    }

    public FamiliaSocialDTO(FamiliaSocial familiaSocial) {
        this.id = familiaSocial.getId();
        this.hasCadastroUnico = familiaSocial.getHasCadastroUnico();
        this.dataAttCadastroUnico = familiaSocial.getDataAttCadastroUnico();
        this.refCRAS = familiaSocial.getRefCRAS();
        this.dataRefCRAS = familiaSocial.getDataRefCRAS();
        this.refCREAS = familiaSocial.getRefCREAS();
        this.dataRefCREAS = familiaSocial.getDataRefCREAS();
        this.hasServicoConvivencia = familiaSocial.getHasServicoConvivencia();
        this.categoriaServicoConvivencia = familiaSocial.getCategoriaServicoConvivencia();
        this.unidadeServicoConvivencia = familiaSocial.getUnidadeServicoConvivencia();
        this.arrFkAdultoShortPrivacaoLiberdade = familiaSocial.getArrFkAdultoShortPrivacaoLiberdade().split(";");
    }
}