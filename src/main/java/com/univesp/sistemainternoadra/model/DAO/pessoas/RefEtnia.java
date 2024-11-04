package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Ref_Etnia")
public class RefEtnia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etnia")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}