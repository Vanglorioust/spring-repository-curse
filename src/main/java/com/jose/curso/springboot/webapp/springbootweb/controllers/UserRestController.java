package com.jose.curso.springboot.webapp.springbootweb.controllers;

import com.jose.curso.springboot.webapp.springbootweb.models.User;
import com.jose.curso.springboot.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Gonzalez", "Jose");
        UserDto userDto = new UserDto();

        userDto.setUser(user);
        userDto.setTitle("User Details");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Gonzalez", "Alejandro");
        User user2 = new User("Gonzalez", "Katherine");
        User user3 = new User("Gonzalez", "Oscar");
        User user4 = new User("Gonzalez", "Ursula");

        List<User> users = Arrays.asList(user, user2, user3, user4); // This is a more concise way to create a list - class helper

//        List<User> users = new ArrayList<>(); // This is a more verbose way to create a list
//        users.add(user); // This is a more verbose way to add an element to a list
//        users.add(user2); // This is a more verbose way to add an element to a list
//        users.add(user3); // This is a more verbose way to add an element to a list
//        users.add(user4);  // This is a more verbose way to add an element to a list

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Gonzalez", "Jose");
        Map<String,Object> body = new HashMap<>();
        body.put("user", user);
        return body;
    }
}
