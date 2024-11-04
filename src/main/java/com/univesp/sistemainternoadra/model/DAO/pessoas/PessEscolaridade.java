package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "pess_escolaridade")
public class PessEscolaridade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_escolaridade")
    private Long id;

    @Column(name = "ano")
    private int ano;

    @Column(name = "grau")
    private int grau;

    @Column(name = "periodo")
    private int periodo;

    @Column(name = "situacao")
    private int situacao;

    @Column(name = "is_matriculado")
    private boolean isMatriculado;

    @Column(name = "nome_escola")
    private String nomeEscola;

    @Column(name = "is_municipal")
    private boolean isMunicipal;

    @Column(name = "is_estadual")
    private boolean isEstadual;

    @Column(name = "is_particular")
    private boolean isParticular;

    @Column(name = "is_bolsista")
    private boolean isBolsista;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public int getGrau() {
        return grau;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getSituacao() {
        return situacao;
    }

    public boolean getIsMatriculado() {
        return isMatriculado;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public boolean getIsMunicipal() {
        return isMunicipal;
    }

    public boolean getIsEstadual() {
        return isEstadual;
    }

    public boolean getIsParticular() {
        return isParticular;
    }

    public boolean getIsBolsista() { return isBolsista; }

    @Override
    public String toString() {
        return "PessEscolaridade{" +
                "\nid=" + id +
                "\nano=" + ano +
                "\ngrau=" + grau +
                "\nperiodo=" + periodo +
                "\nsituacao=" + situacao +
                "\nisMatriculado=" + isMatriculado +
                "\nnomeEscola='" + nomeEscola + '\'' +
                "\nisMunicipal=" + isMunicipal +
                "\nisEstadual=" + isEstadual +
                "\nisParticular=" + isParticular +
                "\nisBolsista=" + isBolsista +
                '}';
    }
}