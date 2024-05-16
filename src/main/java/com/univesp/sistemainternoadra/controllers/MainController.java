package com.univesp.sistemainternoadra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/sidebar")
    public String showSidebar() {
        return "partials/sidebar";
    }
}