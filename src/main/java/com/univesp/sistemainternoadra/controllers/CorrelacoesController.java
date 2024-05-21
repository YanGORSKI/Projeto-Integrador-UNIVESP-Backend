package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.config.CorrelacoesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/correlacoes")
public class CorrelacoesController {

    @Autowired
    private CorrelacoesConfig correlacoesConfig;

    @GetMapping("/situacao-imovel")
    public ResponseEntity<Map<Integer, String>> getSituacaoImovelOptions() {
        return ResponseEntity.ok(correlacoesConfig.getSituacaoImovel());
    }

    @GetMapping("/categoria-servico-convivencia")
    public ResponseEntity<Map<Integer, String>> getCategoriaServicoConvivenciaOptions() {
        return ResponseEntity.ok(correlacoesConfig.getCategoriaServicoConvivencia());
    }

    @GetMapping("/situacao-acolhimento")
    public ResponseEntity<Map<Integer, String>> getSituacaoAcolhimentoOptions() {
        return ResponseEntity.ok(correlacoesConfig.getSituacaoAcolhimento());
    }

    @GetMapping("/escolaridade/grau")
    public ResponseEntity<Map<Integer, String>> getGrauEscolaridadeOptions() {
        return ResponseEntity.ok(correlacoesConfig.getEscolaridade().getGrau());
    }

    @GetMapping("/escolaridade/periodo")
    public ResponseEntity<Map<Integer, String>> getPeriodoEscolaridadeOptions() {
        return ResponseEntity.ok(correlacoesConfig.getEscolaridade().getPeriodo());
    }

    @GetMapping("/escolaridade/situacao")
    public ResponseEntity<Map<Integer, String>> getSituacaoEscolaridadeOptions() {
        return ResponseEntity.ok(correlacoesConfig.getEscolaridade().getSituacao());
    }

    @GetMapping("/situacao-medida")
    public ResponseEntity<Map<Integer, String>> getSituacaoMedidaOptions() {
        return ResponseEntity.ok(correlacoesConfig.getSituacaoMedida());
    }

    @GetMapping("/situacao-privacao")
    public ResponseEntity<Map<Integer, String>> getSituacaoPrivacaoOptions() {
        return ResponseEntity.ok(correlacoesConfig.getSituacaoPrivacao());
    }

    @GetMapping("/situacao-internacao")
    public ResponseEntity<Map<Integer, String>> getSituacaoInternacaoOptions() {
        return ResponseEntity.ok(correlacoesConfig.getSituacaoInternacao());
    }

    @GetMapping("/sexo")
    public ResponseEntity<Map<Integer, String>> getSexoOptions() {
        return ResponseEntity.ok(correlacoesConfig.getSexo());
    }

    @GetMapping("/etnia")
    public ResponseEntity<Map<Integer, String>> getEtniaOptions() {
        return ResponseEntity.ok(correlacoesConfig.getEtnia());
    }

    @GetMapping("/conducao")
    public ResponseEntity<Map<Integer, String>> getConducaoOptions() {
        return ResponseEntity.ok(correlacoesConfig.getConducao());
    }
}