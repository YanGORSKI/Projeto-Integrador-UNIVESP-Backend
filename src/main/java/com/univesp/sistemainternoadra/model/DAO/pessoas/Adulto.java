package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;

@Entity
@Table(name = "Adulto")
public class Adulto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adulto")
    private Long id;

    @Column(name = "fk_adulto_short")
    private Long fkAdultoShort;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "fk_sexo")
    private Long fkSexo;

    @Column(name = "is_presente")
    private Boolean isPresente;

    @Column(name = "is_ausente")
    private Boolean isAusente;

    @Column(name = "is_falecido")
    private Boolean isFalecido;

    @Column(name = "is_separado")
    private Boolean isSeparado;

    @Column(name = "is_outro")
    private Boolean isOutro;

    @Column(name = "desc_outro")
    private String descOutro;

    @Column(name = "fk_endereco")
    private Long fkEndereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "nis_pis")
    private String nisPis;

    @Column(name = "rg")
    private String rg;

    @Column(name = "orgao_emissor")
    private String orgaoEmissor;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "is_empregado")
    private Boolean isEmpregado;

    @Column(name = "local_trabalho")
    private String localTrabalho;

    @Column(name = "renda_mensal")
    private Double rendaMensal;

    @Column(name = "fk_escolaridade")
    private Long fkEscolaridade;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public Long getFkAdultoShort() {
        return fkAdultoShort;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Long getFkSexo() {
        return fkSexo;
    }

    public Boolean getIsPresente() {
        return isPresente;
    }

    public Boolean getIsAusente() {
        return isAusente;
    }

    public Boolean getIsFalecido() {
        return isFalecido;
    }

    public Boolean getIsSeparado() {
        return isSeparado;
    }

    public Boolean getIsOutro() {
        return isOutro;
    }

    public String getDescOutro() {
        return descOutro;
    }

    public Long getFkEndereco() {
        return fkEndereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNisPis() {
        return nisPis;
    }

    public String getRg() {
        return rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public String getCpf() {
        return cpf;
    }

    public Boolean getIsEmpregado() {
        return isEmpregado;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public Long getFkEscolaridade() {
        return fkEscolaridade;
    }
}