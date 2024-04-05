package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Crianca")
public class Crianca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_crianca")
    private Long id;

    @Column(name = "fk_crianca_short")
    private Long fkCriancaShort;

    @Column(name = "nome")
    private String nome;

    @Column(name = "fk_endereco")
    private Long fkEndereco;

    @Column(name = "nascimento")
    private String nascimento;

    @Column(name = "fk_sexo")
    private Long fkSexo;

    @Column(name = "fk_etnia")
    private Long fkEtnia;

    @Column(name = "fk_pai")
    private Long fkPai;

    @Column(name = "fk_mae")
    private Long fkMae;

    @Column(name = "fk_responsavel")
    private Long fkResponsavel;

    @Column(name = "fk_escolaridade")
    private Long fkEscolaridade;

    @Column(name = "hasLazer")
    private Boolean hasLazer;

    @Column(name = "arr_descLazer")
    private String arrDescLazer;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public Long getFkCriancaShort() {
        return fkCriancaShort;
    }

    public String getNome() {
        return nome;
    }

    public Long getFkEndereco() {
        return fkEndereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public Long getFkSexo() {
        return fkSexo;
    }

    public Long getFkEtnia() {
        return fkEtnia;
    }

    public Long getFkPai() {
        return fkPai;
    }

    public Long getFkMae() {
        return fkMae;
    }

    public Long getFkResponsavel() {
        return fkResponsavel;
    }

    public Long getFkEscolaridade() {
        return fkEscolaridade;
    }

    public Boolean getHasLazer() {
        return hasLazer;
    }

    public String getArrDescLazer() {
        return arrDescLazer;
    }
}