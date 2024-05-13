package com.jose.curso.springboot.webapp.springbootweb.controllers;

import com.jose.curso.springboot.webapp.springbootweb.models.User;
import com.jose.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
//..
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    @Value("${config.code}")
    private Integer code;

    @GetMapping("baz/{message}")
     public ParamDTO baz(@PathVariable String message){
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(message);
        return  paramDTO;
    }

    @GetMapping("mix/{product}/{id}")
    public Map<String,Object> mixPathVar(@PathVariable String product, @PathVariable Long id){
        Map<String,Object> json = new HashMap<>();
        json.put("product",product);
        json.put("id",id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return user;
    }

    @GetMapping("/values")
    public Map<String,Object> values(){
        Map<String,Object> json = new HashMap<>();
        json.put("username",username);
        json.put("message",message);
        json.put("listOfValues",listOfValues);
        json.put("code",code);
        return json;
    }

}
