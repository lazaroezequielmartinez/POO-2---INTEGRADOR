package com.poo2integrador.poo2.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcome {
    
    @RequestMapping(value = "/")
    @GetMapping("/")
    public String Home(){                
        return "index";
    }
}
