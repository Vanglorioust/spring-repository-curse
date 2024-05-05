package com.jose.curso.springboot.webapp.springbootweb.controllers;

import com.jose.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;
import com.jose.curso.springboot.webapp.springbootweb.models.dto.ParamMixDTO;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
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

    @GetMapping("bar")
    public ParamMixDTO bar(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDTO paramDTO = new ParamMixDTO();
        paramDTO.setMessage(text);
        paramDTO.setCode(code);
        return paramDTO;
    }

    @GetMapping ("request")
    public ParamMixDTO request(HttpServletRequest request) {
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            code = 0;
        }
        ParamMixDTO paramMixDTO = new ParamMixDTO();
        paramMixDTO.setMessage(request.getParameter("text"));
        paramMixDTO.setCode(code);
        return paramMixDTO;
    }
}
