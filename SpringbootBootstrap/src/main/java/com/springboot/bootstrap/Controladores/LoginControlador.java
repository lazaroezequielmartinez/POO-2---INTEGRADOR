package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControlador {

    @RequestMapping("/")
    public String loginPage(){
        return "Login";
    }

    @RequestMapping("/homeAtenPub")
    public String loginSubmit(){
        return "/pages/AtenPubPrin";
    }

    @RequestMapping("/Roles")
    public String Roles() {return "/pages/Roles";}

    @RequestMapping("/RolesError")
    public String RolesError() {return "/pages/RolesError";}

}
