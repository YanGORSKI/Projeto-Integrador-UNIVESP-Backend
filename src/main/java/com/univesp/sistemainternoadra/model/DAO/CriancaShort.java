package com.univesp.sistemainternoadra.model.DAO;


import jakarta.persistence.*;

@Entity
@Table(name = "Crianca_Short")
public class CriancaShort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_crianca_short")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "fk_sexo")
    private Long fkSexo;

    @Column(name = "fk_escolaridade")
    private Long fkEscolaridade;

    @Column(name = "fk_medida_socioeducativa")
    private Long fkMedidaSocioeducativa;

    @Column(name = "fk_acolhimento")
    private Long fkAcolhimento;

    @Column(name = "fk_saude")
    private Long fkSaude;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getFkSexo() {
        return fkSexo;
    }

    public Long getFkEscolaridade() {
        return fkEscolaridade;
    }

    public Long getFkMedidaSocioeducativa() {
        return fkMedidaSocioeducativa;
    }

    public Long getFkAcolhimento() {
        return fkAcolhimento;
    }

    public Long getFkSaude() {
        return fkSaude;
    }

    public void setCrianca(Crianca crianca) {
    }
}