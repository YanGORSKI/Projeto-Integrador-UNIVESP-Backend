package com.univesp.sistemainternoadra.controllers.financeiro.responses;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class DemonstrativoLancamentoResponse {
    private String categoria;
    private BigDecimal total;
    private String cor;

    public DemonstrativoLancamentoResponse(String categoria, BigDecimal total, String cor) {
        this.categoria = categoria;
        this.total = total;
        this.cor = cor;
    }
}
