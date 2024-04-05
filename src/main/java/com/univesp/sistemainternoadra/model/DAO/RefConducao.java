package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Ref_Conducao")
public class RefConducao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conducao")
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