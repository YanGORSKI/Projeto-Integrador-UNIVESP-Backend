package com.univesp.sistemainternoadra.model.DAO.financeiro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "financ_categoria")
@Getter
@Setter
@ToString
public class CategoriaEntity {
    @Id
    @Column(name = "id_categoria")  // Mapeia o campo idCategoria para a coluna id_categoria
    private Long idCategoria;

    private String descricao;
    private String cor;
}
