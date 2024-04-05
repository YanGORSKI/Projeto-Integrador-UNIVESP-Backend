package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia_Situacao_Casa")
public class FamiliaSituacaoCasa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_situacao_casa")
    private Long id;

    @Column(name = "qtd_sala_de_estar")
    private Integer qtdSalaDeEstar;

    @Column(name = "qtd_quartos")
    private Integer qtdQuartos;

    @Column(name = "qtd_sala_de_jantar")
    private Integer qtdSalaDeJantar;

    @Column(name = "qtd_banheiros")
    private Integer qtdBanheiros;

    @Column(name = "qtd_cozinhas")
    private Integer qtdCozinhas;

    @Column(name = "qtd_lavanderia")
    private Integer qtdLavanderia;

    @Column(name = "arr_outro_comodos")
    private String arrOutroComodos;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Integer getQtdSalaDeEstar() {
        return qtdSalaDeEstar;
    }

    public Integer getQtdQuartos() {
        return qtdQuartos;
    }

    public Integer getQtdSalaDeJantar() {
        return qtdSalaDeJantar;
    }

    public Integer getQtdBanheiros() {
        return qtdBanheiros;
    }

    public Integer getQtdCozinhas() {
        return qtdCozinhas;
    }

    public Integer getQtdLavanderia() {
        return qtdLavanderia;
    }

    public String getArrOutroComodos() {
        return arrOutroComodos;
    }
}