package com.crud.proyecto_crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {

    @GetMapping("/index")
    public String hola(Model model) {
        model.addAttribute("mensaje", "Hola Mundo!");
        return "index";
    }
}