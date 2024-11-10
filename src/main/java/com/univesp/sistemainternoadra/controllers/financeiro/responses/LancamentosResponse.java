package com.univesp.sistemainternoadra.controllers.financeiro.responses;


import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class LancamentosResponse {
    private Long id;
    private Integer tipo;
    private LocalDate data;
    private BigDecimal valor;
    private String conta;
    private Integer parcelas;
    private String categoria;
    private String descricao;


    public LancamentosResponse(LancamentosEntity lancamento) {
    }
}
