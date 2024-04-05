package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Familia_Social")
public class FamiliaSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_social_familia")
    private Long id;

    @Column(name = "has_cadastro_unico")
    private Boolean hasCadastroUnico;

    @Column(name = "data_att_cadastro_unico")
    private LocalDate dataAttCadastroUnico;

    @Column(name = "ref_cras")
    private String refCRAS;

    @Column(name = "data_ref_cras")
    private LocalDate dataRefCRAS;

    @Column(name = "ref_creas")
    private String refCREAS;

    @Column(name = "data_ref_creas")
    private LocalDate dataRefCREAS;

    @Column(name = "has_servico_convivencia")
    private Boolean hasServicoConvivencia;

    @Column(name = "categoria_servico_convivencia")
    private String categoriaServicoConvivencia;

    @Column(name = "unidade_servico_convivencia")
    private String unidadeServicoConvivencia;

    @Column(name = "arr_fk_adulto_short_privacao_liberdade")
    private String arrFkAdultoShortPrivacaoLiberdade;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Boolean getHasCadastroUnico() {
        return hasCadastroUnico;
    }

    public LocalDate getDataAttCadastroUnico() {
        return dataAttCadastroUnico;
    }

    public String getRefCRAS() {
        return refCRAS;
    }

    public LocalDate getDataRefCRAS() {
        return dataRefCRAS;
    }

    public String getRefCREAS() {
        return refCREAS;
    }

    public LocalDate getDataRefCREAS() {
        return dataRefCREAS;
    }

    public Boolean getHasServicoConvivencia() {
        return hasServicoConvivencia;
    }

    public String getCategoriaServicoConvivencia() {
        return categoriaServicoConvivencia;
    }

    public String getUnidadeServicoConvivencia() {
        return unidadeServicoConvivencia;
    }

    public String getArrFkAdultoShortPrivacaoLiberdade() {
        return arrFkAdultoShortPrivacaoLiberdade;
    }
}