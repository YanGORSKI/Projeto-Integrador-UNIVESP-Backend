package com.univesp.sistemainternoadra.model.DAO.pessoas;

import jakarta.persistence.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@Entity
@Table(name = "Pess_Saude")
public class PessSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_saude")
    private Long id;

    @Column(name = "isInternado")
    private Boolean isInternado;

    @Column(name = "situacaoInternacao")
    private String situacaoInternacao;

    @Column(name = "localidadeInternacao")
    private String localidadeInternacao;

    @Column(name = "arr_fk_abuso_substancias")
    private String abusoSubstancias;

    @Column(name = "hasTratamento")
    private Boolean hasTratamento;

    @Column(name = "medicamentos")
    private String medicamentos; // Armazenado como uma única String

    @Column(name = "custoMedicamentos")
    private Double custoMedicamentos;

    @Column(name = "doencas")
    private String doencas; // Armazenado como uma única String

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public Boolean getIsInternado() {
        return isInternado;
    }

    public String getSituacaoInternacao() {
        return situacaoInternacao;
    }

    public String getLocalidadeInternacao() {
        return localidadeInternacao;
    }

    public String getAbusoSubstancias() {
        return abusoSubstancias;
    }

    public Boolean getHasTratamento() {
        return hasTratamento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public Double getCustoMedicamentos() {
        return custoMedicamentos;
    }

    public String getDoencas() {
        return doencas;
    }
}