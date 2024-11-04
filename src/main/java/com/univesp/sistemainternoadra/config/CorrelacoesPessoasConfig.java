package com.univesp.sistemainternoadra.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "correlacoes.pessoas")
public class CorrelacoesPessoasConfig {
    private Map<Integer, String> situacaoImovel;
    private Map<Integer, String> categoriaServicoConvivencia;
    private Map<Integer, String> situacaoAcolhimento;
    private CorrelacaoEscolaridade escolaridade;
    private Map<Integer, String> situacaoMedida;
    private Map<Integer, String> situacaoPrivacao;
    private Map<Integer, String> situacaoInternacao;
    private Map<Integer, String> sexo;
    private Map<Integer, String> etnia;
    private Map<Integer, String> conducao;

    public Map<Integer, String> getSituacaoImovel() {
        return situacaoImovel;
    }

    public void setSituacaoImovel(Map<Integer, String> situacaoImovel) {
        this.situacaoImovel = situacaoImovel;
    }

    public Map<Integer, String> getCategoriaServicoConvivencia() {
        return categoriaServicoConvivencia;
    }

    public void setCategoriaServicoConvivencia(Map<Integer, String> categoriaServicoConvivencia) {
        this.categoriaServicoConvivencia = categoriaServicoConvivencia;
    }

    public Map<Integer, String> getSituacaoAcolhimento() {
        return situacaoAcolhimento;
    }

    public void setSituacaoAcolhimento(Map<Integer, String> situacaoAcolhimento) {
        this.situacaoAcolhimento = situacaoAcolhimento;
    }

    public CorrelacaoEscolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(CorrelacaoEscolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Map<Integer, String> getSituacaoMedida() {
        return situacaoMedida;
    }

    public void setSituacaoMedida(Map<Integer, String> situacaoMedida) {
        this.situacaoMedida = situacaoMedida;
    }

    public Map<Integer, String> getSituacaoPrivacao() {
        return situacaoPrivacao;
    }

    public void setSituacaoPrivacao(Map<Integer, String> situacaoPrivacao) {
        this.situacaoPrivacao = situacaoPrivacao;
    }

    public Map<Integer, String> getSituacaoInternacao() {
        return situacaoInternacao;
    }

    public void setSituacaoInternacao(Map<Integer, String> situacaoInternacao) {
        this.situacaoInternacao = situacaoInternacao;
    }

    public Map<Integer, String> getSexo() {
        return sexo;
    }

    public void setSexo(Map<Integer, String> sexo) {
        this.sexo = sexo;
    }

    public Map<Integer, String> getEtnia() {
        return etnia;
    }

    public void setEtnia(Map<Integer, String> etnia) {
        this.etnia = etnia;
    }

    public Map<Integer, String> getConducao() {
        return conducao;
    }

    public void setConducao(Map<Integer, String> conducao) {
        this.conducao = conducao;
    }

    @ConfigurationProperties(prefix = "correlacoes.escolaridade")
    public static class CorrelacaoEscolaridade {
        private Map<Integer, String> grau;
        private Map<Integer, String> periodo;
        private Map<Integer, String> situacao;

        public Map<Integer, String> getGrau() {
            return grau;
        }

        public void setGrau(Map<Integer, String> grau) {
            this.grau = grau;
        }

        public Map<Integer, String> getPeriodo() {
            return periodo;
        }

        public void setPeriodo(Map<Integer, String> periodo) {
            this.periodo = periodo;
        }

        public Map<Integer, String> getSituacao() {
            return situacao;
        }

        public void setSituacao(Map<Integer, String> situacao) {
            this.situacao = situacao;
        }
    }
}