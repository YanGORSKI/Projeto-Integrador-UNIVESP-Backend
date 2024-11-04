package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.Crianca;

public class CriancaDTO {
    private Long id;
    private Long fkCriancaShort;
    private String nome;
    private Long fkEndereco;
    private String nascimento;
    private Long idade;
    private Long fkSexo;
    private String sexo;
    private Long fkEtnia;
    private Long fkPai;
    private Long fkMae;
    private Long fkResponsavel;
    private Long fkEscolaridade;
    private Boolean hasLazer;
    private String[] arrDescLazer;

    public CriancaDTO() {}

    public CriancaDTO(Crianca crianca) {
        this.id = crianca.getId();
        this.fkCriancaShort = crianca.getFkCriancaShort();
        this.nome = crianca.getNome();
        this.fkEndereco = crianca.getFkEndereco();
        this.nascimento = crianca.getNascimento();
        this.fkSexo = crianca.getFkSexo();
        this.fkEtnia = crianca.getFkEtnia();
        this.fkPai = crianca.getFkPai();
        this.fkMae = crianca.getFkMae();
        this.fkResponsavel = crianca.getFkResponsavel();
        this.fkEscolaridade = crianca.getFkEscolaridade();
        this.hasLazer = crianca.getHasLazer();
        this.arrDescLazer = crianca.getArrDescLazer().split(";");
    }
    // Getters e Setters


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkCriancaShort() {
        return fkCriancaShort;
    }

    public void setFkCriancaShort(Long fkCriancaShort) {
        this.fkCriancaShort = fkCriancaShort;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(Long fkEndereco) {
        this.fkEndereco = fkEndereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public Long getFkSexo() {
        return fkSexo;
    }

    public void setFkSexo(Long fkSexo) {
        this.fkSexo = fkSexo;
    }

    public Long getFkEtnia() {
        return fkEtnia;
    }

    public void setFkEtnia(Long fkEtnia) {
        this.fkEtnia = fkEtnia;
    }

    public Long getFkPai() {
        return fkPai;
    }

    public void setFkPai(Long fkPai) {
        this.fkPai = fkPai;
    }

    public Long getFkMae() {
        return fkMae;
    }

    public void setFkMae(Long fkMae) {
        this.fkMae = fkMae;
    }

    public Long getFkResponsavel() {
        return fkResponsavel;
    }

    public void setFkResponsavel(Long fkResponsavel) {
        this.fkResponsavel = fkResponsavel;
    }

    public Long getFkEscolaridade() {
        return fkEscolaridade;
    }

    public void setFkEscolaridade(Long fkEscolaridade) {
        this.fkEscolaridade = fkEscolaridade;
    }

    public Boolean getHasLazer() {
        return hasLazer;
    }

    public void setHasLazer(Boolean hasLazer) {
        this.hasLazer = hasLazer;
    }

    public String[] getArrDescLazer() {
        return arrDescLazer;
    }

    public void setArrDescLazer(String[] arrDescLazer) {
        this.arrDescLazer = arrDescLazer;
    }
}