package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.FamiliaAnimais;

public class FamiliaAnimaisDTO {
    private Long idAnimal;
    private String tipo;
    private String raca;
    private String nome;

    public FamiliaAnimaisDTO(FamiliaAnimais familiaAnimais) {
        this.idAnimal = familiaAnimais.getIdAnimal();
        this.tipo = familiaAnimais.getTipo();
        this.raca = familiaAnimais.getRaca();
        this.nome = familiaAnimais.getNome();
    }

    // Getters e Setters
}