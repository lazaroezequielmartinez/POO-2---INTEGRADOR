package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControlador {

    @GetMapping("/index")
    public String postInicioSesion(){
        return "/pages/index";
    }

    @RequestMapping("/Roles")
    public String Roles() {return "/pages/Roles";}

    @RequestMapping("/RolesError")
    public String RolesError() {return "/pages/RolesError";}


}
