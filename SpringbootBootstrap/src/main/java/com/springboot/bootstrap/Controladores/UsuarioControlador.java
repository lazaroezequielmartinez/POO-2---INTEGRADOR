package com.springboot.bootstrap.Controladores;

import com.springboot.bootstrap.modelos.Usuario;
import com.springboot.bootstrap.repositorio.UsuarioRepositorio;
import com.springboot.bootstrap.servicios.UsuarioServicio;
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
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @GetMapping({ "/usuarios", })
    public String listarUsuarios(ModelMap modelo, @PageableDefault(size = 10)@SortDefault("nombre")Pageable pageable) {
        Page page = usuarioRepositorio.findAll(pageable);
        modelo.addAttribute("usuarios", page);
        return "/pages/usuarios";
    }

    @GetMapping("/usuarios/nuevo")
    public String mostrarFormularioRegistrarUsuario(Model modelo) {
        Usuario Usuario = new Usuario();
        modelo.addAttribute("usuarios", Usuario);
        return "/pages/crear_usuarios";
    }

    @PostMapping("/usuarios")
    public String guardarUsuario(@ModelAttribute("usuarios") Usuario Usuario) {
        servicio.guardarUsuario(Usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/editar/{id}")// el id no se puede modificar en nungun caso
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("usuarios", servicio.obtenerUsuarioPorId(id));
        return "/pages/editar_usuarios";
    }

    @PostMapping("/usuarios/{id}")
    public String actualizarUsuario(@PathVariable Long id, @ModelAttribute("usuarios") Usuario Usuario,
                                    Model modelo) {
        Usuario usuariosExistente = servicio.obtenerUsuarioPorId(id);
        usuariosExistente.setId(id);
        usuariosExistente.setDni(Usuario.getDni());
        usuariosExistente.setNombre(Usuario.getNombre());
        usuariosExistente.setApellido(Usuario.getApellido());
        usuariosExistente.setTelefono(Usuario.getTelefono());
        usuariosExistente.setDireccion(Usuario.getDireccion());
        usuariosExistente.setEmail(Usuario.getEmail());

        servicio.actualizarUsuario(usuariosExistente);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        servicio.eliminarUsuario(id);
        return "redirect:/usuarios";
    }
}