package com.springboot.bootstrap.Controladores.Graficas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class Graficas {

    @RequestMapping("/")
    @Controller
    public class graficas {//carga pedidos

        @GetMapping("/cargarDisenio")
        public String cargarPedidosDeDisenio(Model model){

            return "";
        }//falta las pantallas

        @PostMapping("/nuevoDisenio")//registra nuevo pedido de disenio
        public String nuevoPedidoDeDisenio(){
            return "";
        }
    }

}
