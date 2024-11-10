package com.univesp.sistemainternoadra.controllers.financeiro.requests;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ToString
@Getter
@Setter
public class FiltroRequest {

    private Integer tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String conta;
    private String categoria;
    private Integer parcelas;
    private BigDecimal valor;
    private String descricao;

    public FiltroRequest(String tipo, String dataInicio, String dataFim, String conta, String categoria, String parcelas, String valor, String descricao, int exibirPorPagina) {
        this.tipo = convertToInteger(tipo);
        this.dataInicio = convertToLocalDate(dataInicio);
        this.dataFim = convertToLocalDate(dataFim);
        this.conta = convertToString(conta);
        this.categoria = convertToString(categoria);
        this.parcelas = convertToInteger(parcelas);
        this.valor = convertToBigDecimal(valor);
        this.descricao = convertToString(descricao);
    }

    private Integer convertToInteger(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private LocalDate convertToLocalDate(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return LocalDate.parse(value, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (Exception e) {
            return null;
        }
    }

    private BigDecimal convertToBigDecimal(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private String convertToString(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        return value;
    }
}