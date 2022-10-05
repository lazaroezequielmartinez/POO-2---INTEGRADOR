package com.poo2integrador.minerva.Controlador.Infrome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class generarInforme {

    @RequestMapping("/")
    @Controller
    public class GenerarInforme {//carga informe

        @GetMapping("/cargarPedido")
        public String cargarInforme(Model model){

            return "";//falta pantallas
        }

        @PostMapping("/")//registra informe
        public String nuevoInforme(){
            return "";
        }
    }

}
