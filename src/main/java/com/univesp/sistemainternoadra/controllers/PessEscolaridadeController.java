package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.model.DAO.PessEscolaridade;
import com.univesp.sistemainternoadra.model.repositories.PessEscolaridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas/escolaridade")
public class PessEscolaridadeController {

    @Autowired
    private PessEscolaridadeRepository escolaridadeRepository;

    // Endpoint para cadastrar uma entrada na tabela PessEscolaridade
    @PostMapping
    public ResponseEntity<PessEscolaridade> cadastrarEscolaridade(@RequestBody PessEscolaridade escolaridade) {
        PessEscolaridade savedEscolaridade = escolaridadeRepository.save(escolaridade);
        return new ResponseEntity<>(savedEscolaridade, HttpStatus.CREATED);
    }

    // Endpoint para deletar uma entrada da tabela PessEscolaridade pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEscolaridade(@PathVariable Long id) {
        escolaridadeRepository.deleteById(id);
        return new ResponseEntity<>("Entrada de escolaridade deletada com sucesso", HttpStatus.OK);
    }

    // Endpoint para consultar todas as entradas da tabela PessEscolaridade
    @GetMapping
    public ResponseEntity<List<PessEscolaridade>> consultarEscolaridades() {
        List<PessEscolaridade> escolaridades = escolaridadeRepository.findAll();
        return new ResponseEntity<>(escolaridades, HttpStatus.OK);
    }
}