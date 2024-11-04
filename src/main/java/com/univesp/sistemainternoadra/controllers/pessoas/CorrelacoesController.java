package com.univesp.sistemainternoadra.controllers.pessoas;

import com.univesp.sistemainternoadra.config.CorrelacoesPessoasConfig;
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
    private CorrelacoesPessoasConfig correlacoesPessoasConfig;

    @GetMapping("/situacao-imovel")
    public ResponseEntity<Map<Integer, String>> getSituacaoImovelOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getSituacaoImovel());
    }

    @GetMapping("/categoria-servico-convivencia")
    public ResponseEntity<Map<Integer, String>> getCategoriaServicoConvivenciaOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getCategoriaServicoConvivencia());
    }

    @GetMapping("/situacao-acolhimento")
    public ResponseEntity<Map<Integer, String>> getSituacaoAcolhimentoOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getSituacaoAcolhimento());
    }

    @GetMapping("/escolaridade/grau")
    public ResponseEntity<Map<Integer, String>> getGrauEscolaridadeOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getEscolaridade().getGrau());
    }

    @GetMapping("/escolaridade/periodo")
    public ResponseEntity<Map<Integer, String>> getPeriodoEscolaridadeOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getEscolaridade().getPeriodo());
    }

    @GetMapping("/escolaridade/situacao")
    public ResponseEntity<Map<Integer, String>> getSituacaoEscolaridadeOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getEscolaridade().getSituacao());
    }

    @GetMapping("/situacao-medida")
    public ResponseEntity<Map<Integer, String>> getSituacaoMedidaOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getSituacaoMedida());
    }

    @GetMapping("/situacao-privacao")
    public ResponseEntity<Map<Integer, String>> getSituacaoPrivacaoOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getSituacaoPrivacao());
    }

    @GetMapping("/situacao-internacao")
    public ResponseEntity<Map<Integer, String>> getSituacaoInternacaoOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getSituacaoInternacao());
    }

    @GetMapping("/sexo")
    public ResponseEntity<Map<Integer, String>> getSexoOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getSexo());
    }

    @GetMapping("/etnia")
    public ResponseEntity<Map<Integer, String>> getEtniaOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getEtnia());
    }

    @GetMapping("/conducao")
    public ResponseEntity<Map<Integer, String>> getConducaoOptions() {
        return ResponseEntity.ok(correlacoesPessoasConfig.getConducao());
    }
}