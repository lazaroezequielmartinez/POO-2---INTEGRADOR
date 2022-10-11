package com.springboot.bootstrap.Controladores.ControlDeStock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ContorlDeStock")
@Controller

public class ControlDeStock {//carga stock

    @GetMapping("/")
    public String cargarstock(Model model){

        return "";
    }
//faltan pantallas
    @PostMapping("/")//informa stock
    public String nuevostock(){
        return "";
    }
}
