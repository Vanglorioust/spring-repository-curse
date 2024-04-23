package com.jose.curso.springboot.webapp.springbootweb.controllers;
import com.jose.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Gonzalez", "Jose");
        model.addAttribute("title", "User Details");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "List of Users");
        return "list"; // Return the view
    }

    @ModelAttribute("users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>(); // List of users
        users.add(new User("Gonzalez", "Jose"));
        users.add(new User("Lopez", "Maria", "maria@correo.com"));
        users.add(new User("Peña", "Juan"));
        users.add(new User("Gonzalez", "Maria"));
        return users;
        }
}
