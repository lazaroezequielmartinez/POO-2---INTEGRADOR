package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.modelos.Pedido;
import com.springboot.bootstrap.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EncImpresionConfControlador {

    @Autowired
    private PedidoServicio servicio;
    @RequestMapping("/configEncImpresion")
    public String configEncImpresion(){
        return "/pages/configEncImpresion";}

    @RequestMapping("/EncImpresionVis")
    public String visualizarPedidos(Model modelo) {
        modelo.addAttribute("pedidos", servicio.listarTodosLosPedidos());
    return "/pages/EncImpresionVis";}

    @RequestMapping("/EncImpresionCon")
    public String consultarPedidos(Model modelo) {
        modelo.addAttribute("pedidos", servicio.listarTodosLosPedidos());
        return "/pages/EncImpresionCon";}

    @GetMapping("/pedidos_enc_impresion/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("pedidos", servicio.obtenerPedidoPorId(id));
        return "/pages/editar_pedido_EncImpresion";}

    @PostMapping("/pedidos_enc_impresion/{id}")
    public String actualizarPedido(@PathVariable Long id, @ModelAttribute("pedidos") Pedido pedido,
                                   Model modelo) {
        Pedido pedidoExistente = servicio.obtenerPedidoPorId(id);
        pedidoExistente.setEstado(pedido.getEstado());
        servicio.actualizarPedido(pedidoExistente);
        return "redirect:/configEncImpresion";
    }

    @PostMapping("/pedidos_enc_impresion")
    public String guardarPedido(@ModelAttribute("pedidos") Pedido pedido) {
        servicio.guardarPedido(pedido);
        return "redirect:/configEncImpresion";
    }

}
