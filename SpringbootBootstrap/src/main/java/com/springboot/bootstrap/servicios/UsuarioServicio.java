package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.modelos.Usuario;

import java.util.List;

public interface UsuarioServicio {

    public List<Usuario> listarTodosLosUsuarios();

    public Usuario guardarUsuario(Usuario usuario);

    public Usuario obtenerUsuarioPorId(Long id);

    public Usuario actualizarUsuario(Usuario usuario);

    public void eliminarUsuario(Long id);

    List<Usuario> findByNombre(String nombre);
}