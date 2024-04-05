package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Situacao_Bairro")
public class FamiliaSituacaoBairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_situacao_bairro")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "has_coleta_lixo")
    private Boolean hasColetaLixo;

    @Column(name = "has_rede_esgoto")
    private Boolean hasRedeEsgoto;

    @Column(name = "has_asfalto")
    private Boolean hasAsfalto;

    @Column(name = "has_transporte_coletivo")
    private Boolean hasTransporteColetivo;

    @Column(name = "has_escola")
    private Boolean hasEscola;

    @Column(name = "has_creche")
    private Boolean hasCreche;

    @Column(name = "has_ubs")
    private Boolean hasUBS;

    @Column(name = "has_cras")
    private Boolean hasCRAS;

    @Column(name = "arr_outros")
    private String arrOutros;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getHasColetaLixo() {
        return hasColetaLixo;
    }

    public Boolean getHasRedeEsgoto() {
        return hasRedeEsgoto;
    }

    public Boolean getHasAsfalto() {
        return hasAsfalto;
    }

    public Boolean getHasTransporteColetivo() {
        return hasTransporteColetivo;
    }

    public Boolean getHasEscola() {
        return hasEscola;
    }

    public Boolean getHasCreche() {
        return hasCreche;
    }

    public Boolean getHasUBS() {
        return hasUBS;
    }

    public Boolean getHasCRAS() {
        return hasCRAS;
    }

    public String getArrOutros() {
        return arrOutros;
    }
}