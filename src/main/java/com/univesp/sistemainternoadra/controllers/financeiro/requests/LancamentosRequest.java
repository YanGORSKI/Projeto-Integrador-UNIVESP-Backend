package com.univesp.sistemainternoadra.controllers.financeiro.requests;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class LancamentosRequest {
    private Integer tipo;
    private LocalDate data;
    private BigDecimal valor;
    private Long contaId;
    private Integer parcelas;
    private Long categoriaId;
    private String descricao;
}
