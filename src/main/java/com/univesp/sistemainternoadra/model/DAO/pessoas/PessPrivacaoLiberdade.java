package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Pess_Privacao_Liberdade")
public class PessPrivacaoLiberdade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_privacao")
    private Long id;

    @Column(name = "situacaoPrivacao")
    private String situacaoPrivacao;

    @Column(name = "localidadePrivacao")
    private String localidadePrivacao;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSituacaoPrivacao() {
        return situacaoPrivacao;
    }

    public String getLocalidadePrivacao() {
        return localidadePrivacao;
    }
}