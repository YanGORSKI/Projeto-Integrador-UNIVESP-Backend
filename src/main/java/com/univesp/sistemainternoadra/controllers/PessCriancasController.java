package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.model.DAO.Crianca;
import com.univesp.sistemainternoadra.model.DAO.CriancaShort;
import com.univesp.sistemainternoadra.model.DTO.CriancaDTO;
import com.univesp.sistemainternoadra.model.repositories.PessCriancaRepository;
import com.univesp.sistemainternoadra.model.repositories.PessCriancaShortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/pessoas/criancas")
public class PessCriancasController {

    @Autowired
    private PessCriancaRepository criancaRepository;

    @Autowired
    private PessCriancaShortRepository criancaShortRepository;

    @GetMapping("/lista")
    public ResponseEntity<List<CriancaDTO>> listarCriancas() {
        List<Crianca> criancas = criancaRepository.findAll();
        List<CriancaDTO> criancaDTOs = criancas.stream().map(crianca -> {
            CriancaDTO dto = new CriancaDTO();
            dto.setId(crianca.getId());
            dto.setNome(crianca.getNome());
            dto.setNascimento(crianca.getNascimento());
            dto.setSexo(crianca.getFkSexo() == 1 ? "M" : "F"); // Ajuste de acordo com sua tabela de sexo
            return dto;
        }).collect(Collectors.toList());
        return ResponseEntity.ok(criancaDTOs);
    }

    @PostMapping("/salvar")
    public ResponseEntity<String> cadastrarCrianca(@RequestBody Crianca crianca) {
        criancaRepository.save(crianca);

        // Criar uma entrada de Crianca_short para a nova Crianca
        CriancaShort criancaShort = new CriancaShort();
        criancaShort.setCrianca(crianca);
        criancaShortRepository.save(criancaShort);

        return new ResponseEntity<>("Criança cadastrada com sucesso", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCrianca(@PathVariable Long id) {
        criancaRepository.deleteById(id);
        return new ResponseEntity<>("Criança deletada com sucesso", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Crianca> getCriancaById(@PathVariable Long id) {
        Optional<Crianca> criancaOptional = criancaRepository.findById(id);
        return criancaOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/crianca-short")
    public ResponseEntity<String> adicionarCriancaShort(@PathVariable Long id, @RequestBody CriancaShort criancaShort) {
        Optional<Crianca> criancaOptional = criancaRepository.findById(id);
        if (criancaOptional.isPresent()) {
            Crianca crianca = criancaOptional.get();
            criancaShort.setCrianca(crianca);
            criancaShortRepository.save(criancaShort);
            return new ResponseEntity<>("Criança short cadastrada com sucesso", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Criança não encontrada", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}/crianca-short/{shortId}")
    public ResponseEntity<String> deletarCriancaShort(@PathVariable Long id, @PathVariable Long shortId) {
        Optional<CriancaShort> criancaShortOptional = criancaShortRepository.findById(shortId);
        if (criancaShortOptional.isPresent()) {
            criancaShortRepository.deleteById(shortId);
            return new ResponseEntity<>("Criança short deletada com sucesso", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Criança short não encontrada", HttpStatus.NOT_FOUND);
        }
    }

//    @GetMapping
//    public ResponseEntity<List<Crianca>> consultarCriancas() {
//        List<Crianca> criancas = criancaRepository.findAll();
//        return new ResponseEntity<>(criancas, HttpStatus.OK);
//    }

    // Outros endpoints conforme necessário
}