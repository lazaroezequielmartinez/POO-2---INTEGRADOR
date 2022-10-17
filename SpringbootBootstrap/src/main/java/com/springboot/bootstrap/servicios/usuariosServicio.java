package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.modelos.usuarios;

import java.util.List;

public interface usuariosServicio {

    public List<usuarios> listarTodosLosUsuarios();

    public usuarios guardarUsuario(usuarios usuarios);

    public usuarios obtenerUsuarioPorId(Long id);

    public usuarios actualizarUsuario(usuarios usuarios);

    public void eliminarUsuario(Long id);
}