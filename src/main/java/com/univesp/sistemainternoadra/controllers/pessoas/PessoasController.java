package com.univesp.sistemainternoadra.controllers.pessoas;

import com.univesp.sistemainternoadra.model.repositories.PessCriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/pessoas/criancas/detalhes")
    public String redirecionaDetalhesCrianca(@RequestParam Long id, Model model) {
        model.addAttribute("criancaId", id);
        return "pessoas/detalhes_criancas";
    }
//
//    @PostMapping("/atualizar/{id}")
//    public String atualizarCrianca(@PathVariable("id") Long id, @ModelAttribute Crianca crianca) {
//        // Atualizar criança existente
//        crianca.setId(id);
//        criancaService.updateCrianca(crianca);
//        return "redirect:/pessoas/criancas";
//    }
}