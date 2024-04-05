package com.univesp.sistemainternoadra.model.DTO;

import com.univesp.sistemainternoadra.model.DAO.PessSaude;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PessSaudeDTO {
    private Long id;
    private Boolean isInternado;
    private String situacaoInternacao;
    private String localidadeInternacao;
    private List<String> abusoSubstancias;
    private Boolean hasTratamento;
    private List<String> medicamentos;
    private Double custoMedicamentos;
    private List<String> doencas;

    public PessSaudeDTO(PessSaude saude) {
        this.id = saude.getId();
        this.isInternado = saude.getIsInternado();
        this.situacaoInternacao = saude.getSituacaoInternacao();
        this.localidadeInternacao = saude.getLocalidadeInternacao();
        this.abusoSubstancias = Arrays.asList(saude.getAbusoSubstancias().split(";"));
        this.hasTratamento = saude.getHasTratamento();
        this.medicamentos = Arrays.asList(saude.getMedicamentos().split(";"));
        this.custoMedicamentos = saude.getCustoMedicamentos();
        this.doencas = Arrays.asList(saude.getDoencas().split(";"));
    }

    // Getters e Setters
}