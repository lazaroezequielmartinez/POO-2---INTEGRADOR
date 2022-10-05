package com.poo2integrador.minerva.Controlador.insumos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class Insumos {

    @RequestMapping("/")
    @Controller
    public class insumos {//carga insumos

        @GetMapping("/")
        public String cargarinsumos(Model model){//falta pantalla

            return "";
        }

        @PostMapping("/nuevoinsumos")//registra insumos
        public String nuevoinsumos(){
            return "";
        }
    }

}
