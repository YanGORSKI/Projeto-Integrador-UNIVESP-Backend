package com.univesp.sistemainternoadra.controllers.financeiro.requests;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString
public class LancamentosRequest {

    private Integer tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String conta;
    private String categoria;
    private Integer parcelas;
    private BigDecimal valor;
    private String descricao;

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LancamentosRequest(String tipo, String dataInicio, String dataFim, String conta, String categoria, String parcelas, String valor, String descricao, int exibirPorPagina) {
    }
}
