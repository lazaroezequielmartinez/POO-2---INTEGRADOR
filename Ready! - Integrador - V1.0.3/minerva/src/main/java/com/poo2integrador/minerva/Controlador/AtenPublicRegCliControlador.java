package com.poo2integrador.minerva.Controlador;

import com.poo2integrador.minerva.Controlador.Pedidos.AtencionClienteControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class AtenPublicRegCliControlador {
    @Autowired
    AtenPublicEditCliControlador atenPublicRegCliControlador;
    @Autowired
    AtencionClienteControlador cliente;
    public String AtenPublicRegCliControlador(AtenPublicEditCliControlador atenPublicRegCliControlador, AtenPublicEditCliControlador cliente) {
        this.atenPublicRegCliControlador=atenPublicRegCliControlador;


        return "";
    }
  //@GetMapping("/Cliente")

}