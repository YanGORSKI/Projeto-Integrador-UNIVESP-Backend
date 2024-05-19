package com.univesp.sistemainternoadra.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class CorrelacoesConfig {

    @Value("#{${correlacoes.situacao_imovel}}")
    private Map<Integer, String> situacaoImovel;

    @Value("#{${correlacoes.categoria_servico_convivencia}}")
    private Map<Integer, String> categoriaServicoConvivencia;

    @Value("#{${correlacoes.situacao_acolhimento}}")
    private Map<Integer, String> situacaoAcolhimento;

    @Value("#{${correlacoes.escolaridade.grau}}")
    private Map<Integer, String> escolaridadeGrau;

    @Value("#{${correlacoes.escolaridade.periodo}}")
    private Map<Integer, String> escolaridadePeriodo;

    @Value("#{${correlacoes.escolaridade.situacao}}")
    private Map<Integer, String> escolaridadeSituacao;

    @Value("#{${correlacoes.situacao_medida}}")
    private Map<Integer, String> situacaoMedida;

    @Value("#{${correlacoes.situacao_privacao}}")
    private Map<Integer, String> situacaoPrivacao;

    @Value("#{${correlacoes.situacao_internacao}}")
    private Map<Integer, String> situacaoInternacao;

    // Getters

    public Map<Integer, String> getSituacaoImovel() {
        return situacaoImovel;
    }

    public Map<Integer, String> getCategoriaServicoConvivencia() {
        return categoriaServicoConvivencia;
    }

    public Map<Integer, String> getSituacaoAcolhimento() {
        return situacaoAcolhimento;
    }

    public Map<Integer, String> getEscolaridadeGrau() {
        return escolaridadeGrau;
    }

    public Map<Integer, String> getEscolaridadePeriodo() {
        return escolaridadePeriodo;
    }

    public Map<Integer, String> getEscolaridadeSituacao() {
        return escolaridadeSituacao;
    }

    public Map<Integer, String> getSituacaoMedida() {
        return situacaoMedida;
    }

    public Map<Integer, String> getSituacaoPrivacao() {
        return situacaoPrivacao;
    }

    public Map<Integer, String> getSituacaoInternacao() {
        return situacaoInternacao;
    }
}