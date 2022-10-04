package com.poo2integrador.minerva.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtenPublicEditCliControlador {

    @GetMapping("/AtencionPublicoRegCli")
    public String AtencionPublico() {
        return "AtenPublicoRegCli";
    }
}
