package com.univesp.sistemainternoadra.config;

import com.univesp.sistemainternoadra.model.DAO.PessEscolaridade;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "correlacoes")
public class CorrelacoesConfig {
    private Map<Integer, String> situacaoImovel;
    private Map<Integer, String> categoriaServicoConvivencia;
    private Map<Integer, String> situacaoAcolhimento;
    private PessEscolaridade escolaridade;
    private Map<Integer, String> situacaoMedida;
    private Map<Integer, String> situacaoPrivacao;
    private Map<Integer, String> situacaoInternacao;

    // Getters and Setters
}