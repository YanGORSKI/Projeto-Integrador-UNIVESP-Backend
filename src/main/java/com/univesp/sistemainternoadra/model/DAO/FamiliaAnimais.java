package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Animais")
public class FamiliaAnimais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal")
    private Long idAnimal;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "raca")
    private String raca;

    @Column(name = "nome")
    private String nome;

    // Getters e Setters

    public Long getIdAnimal() {
        return idAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

}