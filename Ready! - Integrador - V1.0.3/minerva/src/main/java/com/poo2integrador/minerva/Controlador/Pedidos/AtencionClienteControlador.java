package com.poo2integrador.minerva.Controlador.Pedidos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/atencionCliente")
@Controller
public class AtencionClienteControlador {//carga pedidos

    @GetMapping("/cargarPedido")
    public String cargarPedidos(Model model){

        return "AtenPublicoRegCli";
    }

    @PostMapping("/nuevoPedido")//registra nuevo pedido
    public String nuevoPedido(){
        return "AtenPublicoRegCli";
    }
}
