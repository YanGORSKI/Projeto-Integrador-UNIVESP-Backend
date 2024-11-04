package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Pess_Medida_Socioeducativa")
public class PessMedidaSocioeducativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medida_socioeducativa")
    private Long id;

    @Column(name = "situacaoMedida")
    private String situacaoMedida;

    @Column(name = "localidadeMedida")
    private String localidadeMedida;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSituacaoMedida() {
        return situacaoMedida;
    }

    public String getLocalidadeMedida() {
        return localidadeMedida;
    }
}