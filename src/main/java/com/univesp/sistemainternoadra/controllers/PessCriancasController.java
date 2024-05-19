package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.model.DAO.Crianca;
import com.univesp.sistemainternoadra.model.DAO.PessEscolaridade;
import com.univesp.sistemainternoadra.model.repositories.PessCriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas/criancas")
public class PessCriancasController {

    @Autowired
    private PessCriancaRepository criancaRepository;

    @PostMapping
    public ResponseEntity<String> cadastrarCrianca(@RequestBody Crianca crianca) {
        criancaRepository.save(crianca);
        return new ResponseEntity<>("Criança cadastrada com sucesso", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCrianca(@PathVariable Long id) {
        criancaRepository.deleteById(id);
        return new ResponseEntity<>("Criança deletada com sucesso", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Crianca>> consultarCriancas() {
        List<Crianca> criancas = criancaRepository.findAll();
        return new ResponseEntity<>(criancas, HttpStatus.OK);
    }

    // Outros endpoints conforme necessário
}