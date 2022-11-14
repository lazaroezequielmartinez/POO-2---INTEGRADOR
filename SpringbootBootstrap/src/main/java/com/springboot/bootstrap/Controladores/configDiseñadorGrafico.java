package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class configDiseñadorGrafico {

    @Autowired
    private PedidoServicio servicio;
    @RequestMapping("/configDiseñador")
    public String configDiseñador() {return "/pages/configDiseñadorGrafico";}

    @RequestMapping("/DisGrafVisPedido")
    public String visualizarPedidos(Model modelo) {
        modelo.addAttribute("pedidos", servicio.listarTodosLosPedidos());
        return "/pages/DisGrafVisPedido";}

    @RequestMapping("/DisGrafModifPedido")
    public String editarPedidos(Model modelo) {
        modelo.addAttribute("pedidos", servicio.listarTodosLosPedidos());
        return "/pages/DisGrafModifPedido";}

}
