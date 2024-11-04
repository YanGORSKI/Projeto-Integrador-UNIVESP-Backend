package com.univesp.sistemainternoadra.controllers.financeiro.responses;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class LancamentosResponse {
    private Long id;
    private Integer tipo;
    private LocalDate data;
    private BigDecimal valor;
    private String conta;
    private Integer parcelas;
    private String categoria;
    private String descricao;


}
