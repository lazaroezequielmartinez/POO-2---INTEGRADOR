package com.springboot.bootstrap.Controladores;


import com.springboot.bootstrap.modelos.Pedido;
import com.springboot.bootstrap.repositorio.PedidoRepositorio;
import com.springboot.bootstrap.repositorio.UsuarioRepositorio;
import com.springboot.bootstrap.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PedidoControlador {

	@Autowired
	private PedidoServicio servicio;

	@Autowired
	PedidoRepositorio pedidoRepositorio;

	@GetMapping({ "/pedidos"})
	public String listarPedido(ModelMap modelo, @PageableDefault(size = 10)@SortDefault("categoria") Pageable pageable) {
		Page page = pedidoRepositorio.findAll(pageable);
		modelo.addAttribute("pedidos", page);
		return "/pages/pedidos";
	}

	@GetMapping("/pedidos/nuevo")
	public String mostrarFormularioDeRegistrtarPedido(Model modelo) {
		Pedido pedido = new Pedido();
		modelo.addAttribute("pedidos", pedido);
		return "/pages/crear_pedido";
	}

	@PostMapping("/pedidos")
	public String guardarPedido(@ModelAttribute("pedidos") Pedido pedido) {
		servicio.guardarPedido(pedido);
		return "redirect:/pedidos";
	}

	@GetMapping("/pedidos/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("pedidos", servicio.obtenerPedidoPorId(id));
		return "/pages/editar_pedido";
	}

	@PostMapping("/pedidos/{id}")
	public String actualizarPedido(@PathVariable Long id, @ModelAttribute("pedidos") Pedido pedido,
								   Model modelo) {
		Pedido pedidoExistente = servicio.obtenerPedidoPorId(id);
		pedidoExistente.setId(id);
		pedidoExistente.setCategoria(pedido.getCategoria());
		pedidoExistente.setFechapedido(pedido.getFechapedido());
		pedidoExistente.setObservaciones(pedido.getObservaciones());
		servicio.actualizarPedido(pedidoExistente);
		return "redirect:/pedidos";
	}

	@GetMapping("/pedidos/{id}")
	public String eliminarPedido(@PathVariable Long id) {
		servicio.eliminarPedido(id);
		return "redirect:/pedidos";
	}
}