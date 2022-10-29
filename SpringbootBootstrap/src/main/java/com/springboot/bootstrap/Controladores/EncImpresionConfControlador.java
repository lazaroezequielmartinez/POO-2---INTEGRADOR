package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncImpresionConfControlador {

    @RequestMapping("/configEncImpresion")
    public String configEncImpresion(){
        return "/pages/configEncImpresion";}

    @RequestMapping("/EncImpresionVis")
    public String visualizarPedidos(){
        return "/pages/EncImpresionVis";}

    @RequestMapping("/EncImpresionCon")
    public String consultarPedidos(){
        return "/pages/EncImpresionCon";}
}
