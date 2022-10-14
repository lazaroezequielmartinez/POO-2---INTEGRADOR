package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtenPubConfControlador {

    @RequestMapping("/configAtenPub")
    public String loginSubmit(){
        return "/pages/configAtenPub";}

    @RequestMapping("/AtenPubConCli")
    public String holi(){
        return "/pages/AtenPubConCli";}

    @RequestMapping("/AtenPubRegCli")
    public String RegCliente(){
        return "/pages/AtenPubRegCli";}

    @RequestMapping("/regiscli")
    public String RegCl(){
        return "/pages/regiscli";}
}
