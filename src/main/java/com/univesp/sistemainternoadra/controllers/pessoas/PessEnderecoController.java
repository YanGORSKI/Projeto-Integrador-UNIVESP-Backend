package com.univesp.sistemainternoadra.controllers.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessEndereco;
import com.univesp.sistemainternoadra.model.repositories.PessEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas/endereco")
public class PessEnderecoController {

    @Autowired
    private PessEnderecoRepository enderecoRepository;

    // Endpoint para cadastrar uma entrada na tabela PessEndereco
    @PostMapping
    public ResponseEntity<PessEndereco> cadastrarEndereco(@RequestBody PessEndereco endereco) {
        PessEndereco savedEndereco = enderecoRepository.save(endereco);
        return new ResponseEntity<>(savedEndereco, HttpStatus.CREATED);
    }

    // Endpoint para deletar uma entrada da tabela PessEndereco pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEndereco(@PathVariable Long id) {
        enderecoRepository.deleteById(id);
        return new ResponseEntity<>("Entrada de endereco deletada com sucesso", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessEndereco> getPessEndereco(@PathVariable Long id) {
        Optional<PessEndereco> endereco = enderecoRepository.findById(id);
        if (endereco.isPresent()) {
            return ResponseEntity.ok(endereco.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint para consultar todas as entradas da tabela PessEndereco
    @GetMapping
    public ResponseEntity<List<PessEndereco>> consultarEnderecos() {
        List<PessEndereco> enderecos = enderecoRepository.findAll();
        return new ResponseEntity<>(enderecos, HttpStatus.OK);
    }
}