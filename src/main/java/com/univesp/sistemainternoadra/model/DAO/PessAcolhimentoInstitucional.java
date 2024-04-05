package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Pess_Acolhimento_Institucional")
public class PessAcolhimentoInstitucional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acolhimento")
    private Long id;

    @Column(name = "situacaoAcolhimento")
    private String situacaoAcolhimento;

    @Column(name = "localidadeAcolhimento")
    private String localidadeAcolhimento;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSituacaoAcolhimento() {
        return situacaoAcolhimento;
    }

    public String getLocalidadeAcolhimento() {
        return localidadeAcolhimento;
    }
}