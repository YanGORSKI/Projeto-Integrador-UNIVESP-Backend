package com.univesp.sistemainternoadra.controllers.financeiro.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class DemonstrativoResponse {
    private List<DemonstrativoLancamentoResponse> entradas;
    private List<DemonstrativoLancamentoResponse> saidas;
    private BigDecimal saldoTotal;
    private BigDecimal totalEntradaAtual;
    private BigDecimal totalSaidaAtual;
    private BigDecimal entradasMesAnterior;
    private BigDecimal saidasMesAnterior;
    private BigDecimal percentualEntrada;
    private BigDecimal percentualSaida;
}
