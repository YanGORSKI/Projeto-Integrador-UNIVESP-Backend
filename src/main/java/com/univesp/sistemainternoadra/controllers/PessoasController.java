package com.univesp.sistemainternoadra.controllers;

import com.univesp.sistemainternoadra.model.DAO.Crianca;
import com.univesp.sistemainternoadra.model.repositories.PessCriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoasController {

    @Autowired
    private PessCriancaRepository criancaRepository;

    @GetMapping(value = {"/pessoas/index"})
    public String pessoasIndex() {
        return "pessoas/index";
    }

    @GetMapping(value = {"/pessoas/criancas"})
    public String pessoasCriancas() {
        return "pessoas/criancas";
    }

    @GetMapping("/pessoas/criancas/adicionar")
    public String adicionarCrianca(Model model) {
        // Carregar dados necessários para o formulário, se houver
        return "pessoas/adicionar_crianca";
    }

//    @GetMapping(value = {"/pessoas/criancas/detalhes/{id}"})
//    public String detalhesCrianca(@PathVariable("id") Long id, Model model) {
//        // Carregar dados da criança pelo ID e adicionar ao modelo
//        Crianca crianca = criancaService.getCriancaById(id);
//        model.addAttribute("crianca", crianca);
//        return "pessoas/detalhes_crianca";
//    }
//
//    @PostMapping("/atualizar/{id}")
//    public String atualizarCrianca(@PathVariable("id") Long id, @ModelAttribute Crianca crianca) {
//        // Atualizar criança existente
//        crianca.setId(id);
//        criancaService.updateCrianca(crianca);
//        return "redirect:/pessoas/criancas";
//    }
}