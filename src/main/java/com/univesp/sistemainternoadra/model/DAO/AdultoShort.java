package com.univesp.sistemainternoadra.model.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Adulto_Short")
public class AdultoShort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adulto_short")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "fk_sexo")
    private Long fkSexo;

    @Column(name = "fk_endereco")
    private Long fkEndereco;

    @Column(name = "is_empregado")
    private boolean isEmpregado;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "renda_mensal")
    private double rendaMensal;

    @Column(name = "fk_escolaridade")
    private Long fkEscolaridade;

    @Column(name = "fk_privacao")
    private Long fkPrivacao;

    @Column(name = "fk_acolhimento")
    private Long fkAcolhimento;

    @Column(name = "fk_saude_pessoal")
    private Long fkSaudePessoal;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Long getFkSexo() {
        return fkSexo;
    }

    public Long getFkEndereco() {
        return fkEndereco;
    }

    public boolean isEmpregado() {
        return isEmpregado;
    }

    public String getProfissao() {
        return profissao;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public Long getFkEscolaridade() {
        return fkEscolaridade;
    }

    public Long getFkPrivacao() {
        return fkPrivacao;
    }

    public Long getFkAcolhimento() {
        return fkAcolhimento;
    }

    public Long getFkSaudePessoal() {
        return fkSaudePessoal;
    }
}