package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminControlador {

    @Autowired
    private UsuarioServicio servicio;
    @RequestMapping("/configAdmin")
    public String configAdmin(){
        return "/pages/configAdmin";
    }

    @RequestMapping("/AdminInformeVentas")
    public String AdminInformeVentas(){
        return "/pages/AdminInformeVentas";
    }
    @RequestMapping("/AdminInformeClientes")
    public String AdminInformeClientes(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarTodosLosUsuarios());
        return "/pages/AdminInformeClientes";
    }

    @RequestMapping("/AdminInformeStock")
    public String AdminInformeStock() {
        return "/pages/AdminInformeStock";
    }
}
