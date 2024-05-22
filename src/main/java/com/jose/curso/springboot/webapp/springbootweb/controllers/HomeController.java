package com.jose.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"", "/", "/home"})
    public String home() {
        return "redirect:/list"; // This will redirect the request to the list endpoint
//        return "forward:/list"; // This will forward the request to the list endpoint
    }
}
