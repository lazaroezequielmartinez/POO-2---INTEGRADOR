package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtenPubConfControlador {

    @RequestMapping("/configAtenPub")
    public String loginSubmit(){
        return "/pages/configAtenPub";}

    @RequestMapping("/AtenPubRegCli")
    public String RegCliente(){
        return "/pages/AtenPubRegCli";}

    @RequestMapping("/AtenPubConCli")
    public String consulCli(){
        return "/pages/AtenPubConCli";}

    @RequestMapping("/AtenPubRegPed")
    public String regPedido(){
        return "/pages/AtenPubRegPed";}

    @RequestMapping("/AtenPubConPed")
    public String consulPed(){
        return "/pages/AtenPubConPed";}

}
