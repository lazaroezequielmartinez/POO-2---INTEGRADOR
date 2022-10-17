package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.modelos.usuarios;
import com.springboot.bootstrap.servicios.usuariosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class usuariosControlador {

    @Autowired
    private usuariosServicio servicio;

    @GetMapping({ "/usuarios", })
    public String listarUsuarios(Model modelo) {
        modelo.addAttribute("estudiantes", servicio.listarTodosLosUsuarios());
        return "/pages/usuarios"; // nos retorna al archivo estudiantes
    }

    @GetMapping("/usuarios/nuevo")
    public String mostrarFormularioRegistrarUsuario(Model modelo) {
        usuarios usuarios = new usuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "/pages/crear_usuarios";
    }

    @PostMapping("/usuarios")
    public String guardarUsuario(@ModelAttribute("usuarios") usuarios usuarios) {
        servicio.guardarUsuario(usuarios);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("usuarios", servicio.obtenerUsuarioPorId(id));
        return "/pages/editar_usuarios";
    }

    @PostMapping("/usuarios/{id}")
    public String actualizarUsuario(@PathVariable Long id, @ModelAttribute("usuarios") usuarios usuarios,
                                    Model modelo) {
        usuarios usuariosExistente = servicio.obtenerUsuarioPorId(id);
        usuariosExistente.setId(id);
        usuariosExistente.setDni(usuarios.getDni());
        usuariosExistente.setNombre(usuarios.getNombre());
        usuariosExistente.setApellido(usuarios.getApellido());
        usuariosExistente.setTelefono(usuarios.getTelefono());
        usuariosExistente.setDireccion(usuarios.getDireccion());
        usuariosExistente.setEmail(usuarios.getEmail());

        servicio.actualizarUsuario(usuariosExistente);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        servicio.eliminarUsuario(id);
        return "redirect:/usuarios";
    }
}