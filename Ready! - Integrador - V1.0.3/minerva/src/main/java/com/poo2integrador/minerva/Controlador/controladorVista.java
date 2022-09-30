package com.poo2integrador.minerva.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controladorVista {

    @GetMapping("/")
    public String muestraIncio() {

        return "inicio";

    }

}
