package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.configuraciones.UsuarioRegistro;
import com.springboot.bootstrap.servicios.UsuarioSistemaServicio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

    private UsuarioSistemaServicio usuarioSisServicio;

    public RegistroUsuarioControlador(UsuarioSistemaServicio usuarioSisServicio) {
        super();
        this.usuarioSisServicio = usuarioSisServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistro retornarNuevoUsuarioRegistro(){
        return new UsuarioRegistro();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "/pages/registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistro registro){
        usuarioSisServicio.guardarUsuario(registro);
        return "redirect:/registro?exito";
    }

}
