package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.CriancaShort;

public class CriancaShortDTO {
    private Long id;
    private String nome;
    private Long fkSexo;
    private Long fkEscolaridade;
    private Long fkMedidaSocioeducativa;
    private Long fkAcolhimento;
    private Long fkSaude;

    public CriancaShortDTO(CriancaShort criancaShort) {
        this.id = criancaShort.getId();
        this.nome = criancaShort.getNome();
        this.fkSexo = criancaShort.getFkSexo();
        this.fkEscolaridade = criancaShort.getFkEscolaridade();
        this.fkMedidaSocioeducativa = criancaShort.getFkMedidaSocioeducativa();
        this.fkAcolhimento = criancaShort.getFkAcolhimento();
        this.fkSaude = criancaShort.getFkSaude();
    }

    // Getters e Setters
}