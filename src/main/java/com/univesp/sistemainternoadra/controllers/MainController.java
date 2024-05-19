package com.univesp.sistemainternoadra.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping(value = {"/pessoas/index"})
    public String pessoasIndex() {
        return "pessoas/index";
    }

    @GetMapping(value = {"/pessoas/criancas"})
    public String pessoasCriancas() {
        return "pessoas/criancas";
    }
}