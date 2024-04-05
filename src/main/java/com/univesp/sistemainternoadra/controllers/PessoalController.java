package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.model.DAO.PessEscolaridade;
import com.univesp.sistemainternoadra.model.repositories.PessEscolaridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoal")
public class PessoalController {

    @Autowired
    private PessEscolaridadeRepository escolaridadeRepository;

    // Endpoint para cadastrar uma entrada na tabela PessEscolaridade
    @PostMapping("/escolaridade")
    public ResponseEntity<String> cadastrarEscolaridade(@RequestBody PessEscolaridade escolaridade) {
        System.out.println("Objeto PessEscolaridade recebido: " + escolaridade.toString());
        escolaridadeRepository.save(escolaridade);
        return new ResponseEntity<>("Entrada de escolaridade cadastrada com sucesso", HttpStatus.CREATED);
    }

    // Endpoint para deletar uma entrada da tabela PessEscolaridade pelo ID
    @DeleteMapping("/escolaridade")
    public ResponseEntity<String> deletarEscolaridade(@RequestParam Long id) {
        escolaridadeRepository.deleteById(id);
        return new ResponseEntity<>("Entrada de escolaridade deletada com sucesso", HttpStatus.OK);
    }

    // Endpoint para consultar todas as entradas da tabela PessEscolaridade
    @GetMapping("/escolaridade")
    public ResponseEntity<List<PessEscolaridade>> consultarEscolaridades() {
        List<PessEscolaridade> escolaridades = escolaridadeRepository.findAll();
        return new ResponseEntity<>(escolaridades, HttpStatus.OK);
    }
}