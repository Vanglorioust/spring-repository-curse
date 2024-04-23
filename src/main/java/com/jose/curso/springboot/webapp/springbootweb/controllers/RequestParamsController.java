package com.jose.curso.springboot.webapp.springbootweb.controllers;

import com.jose.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("foo")
    public ParamDTO foo(@RequestParam (required = false, defaultValue = "Please, insert a message") String message) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(message);
        return paramDTO;
    }
}
