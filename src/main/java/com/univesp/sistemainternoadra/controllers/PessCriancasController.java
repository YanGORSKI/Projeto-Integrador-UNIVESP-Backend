package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.model.DAO.Crianca;
import com.univesp.sistemainternoadra.model.DTO.CriancaDTO;
import com.univesp.sistemainternoadra.model.repositories.PessCriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoas/criancas")
public class PessCriancasController {

    @Autowired
    private PessCriancaRepository criancaRepository;

    @GetMapping("/lista")
    public ResponseEntity<List<CriancaDTO>> listarCriancas() {
        List<Crianca> criancas = criancaRepository.findAll();
        List<CriancaDTO> criancaDTOs = criancas.stream().map(crianca -> {
            CriancaDTO dto = new CriancaDTO();
            dto.setNome(crianca.getNome());
            dto.setNascimento(crianca.getNascimento());
            dto.setSexo(crianca.getFkSexo() == 1 ? "M" : "F"); // Ajuste de acordo com sua tabela de sexo
            return dto;
        }).collect(Collectors.toList());
        return ResponseEntity.ok(criancaDTOs);
    }

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

//    @GetMapping
//    public ResponseEntity<List<Crianca>> consultarCriancas() {
//        List<Crianca> criancas = criancaRepository.findAll();
//        return new ResponseEntity<>(criancas, HttpStatus.OK);
//    }

    // Outros endpoints conforme necessário
}