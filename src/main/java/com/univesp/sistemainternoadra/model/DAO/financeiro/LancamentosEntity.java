package com.univesp.sistemainternoadra.model.DAO.financeiro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString
@Entity
@Getter
@Setter
@Table(name = "financ_lancamentos")
public class LancamentosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer tipo;
    private LocalDate data;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "conta_id", referencedColumnName = "id_conta")
    private ContaEntity conta;

    private Integer parcelas;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id_categoria")
    private CategoriaEntity categoria;

    private String descricao;
}
