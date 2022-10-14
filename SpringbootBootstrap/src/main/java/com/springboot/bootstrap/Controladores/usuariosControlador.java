package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.servicios.usuariosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class usuariosControlador {
    @Autowired private usuariosServicios servicios;
}
