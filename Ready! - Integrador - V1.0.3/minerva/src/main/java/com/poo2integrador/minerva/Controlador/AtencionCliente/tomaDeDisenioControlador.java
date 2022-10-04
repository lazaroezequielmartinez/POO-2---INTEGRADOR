package com.poo2integrador.minerva.Controlador.AtencionCliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class tomaDeDisenioControlador {

    @GetMapping ("/tomadedisenio")

    public String tomaDeDisenio(Model model){

        return "";

    }//falta las vistas
    @PostMapping("/nuevoDisenio")//registra nuevo disenio
    public String nuevoDisenio(){
        return "";
    }

}
