package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.modelos.Pedido;
import com.springboot.bootstrap.repositorio.PedidoRepositorio;
import com.springboot.bootstrap.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class configDiseñadorGrafico {

    @Autowired
    private PedidoServicio servicio;

    @Autowired
    PedidoRepositorio pedidoRepositorio;
    @RequestMapping("/configDisenadorGrafico")
    public String configDiseñador() {return "/pages/configDiseñadorGrafico";}

    @RequestMapping("/DisGrafVisPedido")
    public String listarPedidosVisualizacion(ModelMap modelo, @PageableDefault(size = 10)@SortDefault("categoria") Pageable pageable) {
        Page page = pedidoRepositorio.findAll(pageable);
        modelo.addAttribute("pedidos", page);
        return "/pages/DisGrafVisPedido";}

    @RequestMapping("/DisGrafModifPedido")
    public String listarPedidosModificacion(ModelMap modelo, @PageableDefault(size = 10)@SortDefault("categoria") Pageable pageable) {
        Page page = pedidoRepositorio.findAll(pageable);
        modelo.addAttribute("pedidos", page);
        return "/pages/DisGrafModifPedido";}

    @GetMapping("/pedidos_dis_grafico/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("pedidos", servicio.obtenerPedidoPorId(id));
        return "/pages/editar_pedido_DisGrafico";}

    @PostMapping("/pedidos_dis_grafico/{id}")
    public String actualizarPedido(@PathVariable Long id, @ModelAttribute("pedidos") Pedido pedido,
                                   Model modelo) {
        Pedido pedidoExistente = servicio.obtenerPedidoPorId(id);
        pedidoExistente.setEstado_diseno(pedido.getEstado_diseno());
        servicio.actualizarPedido(pedidoExistente);
        return "redirect:/configDisenadorGrafico";    }

    @PostMapping("/pedidos_dis_grafico")
    public String guardarPedido(@ModelAttribute("pedidos") Pedido pedido) {
        servicio.guardarPedido(pedido);
        return "redirect:/configDisenadorGrafico";
    }

}
