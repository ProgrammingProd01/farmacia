package com.example.farmacia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(Model model) {
        return "index"; // Renderiza index.html
    }

    @GetMapping("/contactanos")
    public String contactanos(Model model) {
        return "contactanos"; // Renderiza contactanos.html
    }

    @GetMapping("/acerca")
    public String acerca(Model model) {
        return "acerca"; // Renderiza acerca.html
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login"; // Renderiza login.html
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "dashboard"; // Renderiza dashboard.html
    }
}