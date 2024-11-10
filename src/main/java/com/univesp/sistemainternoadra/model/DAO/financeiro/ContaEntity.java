package com.univesp.sistemainternoadra.model.DAO.financeiro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "financ_conta")
@Getter
@Setter
@ToString
public class ContaEntity {
    @Id
    @Column(name = "id_conta")  // Mapeia o campo idConta para a coluna id_conta
    private Long idConta;

    private String descricao;
}
