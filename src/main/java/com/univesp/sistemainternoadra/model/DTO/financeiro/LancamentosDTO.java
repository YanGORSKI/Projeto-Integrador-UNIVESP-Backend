package com.univesp.sistemainternoadra.model.DTO.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LancamentosDTO {
    private Long id;
    private Integer tipo;
    private LocalDate data;
    private BigDecimal valor;
    private ContaDTO conta;
    private Integer parcelas;
    private CategoriaDTO categoria;
    private String descricao;
}
