package com.poo2integrador.minerva.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtenPublicRegCliControlador {

    @GetMapping("/AtencionPublico")
    public String AtencionPublico() {
        return "AtenPublicoEditCli";
    }
}