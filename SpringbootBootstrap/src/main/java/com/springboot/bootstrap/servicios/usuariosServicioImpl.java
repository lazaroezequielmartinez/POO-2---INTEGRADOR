package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.modelos.usuarios;
import com.springboot.bootstrap.repositorio.usuariosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuariosServicioImpl implements usuariosServicio {

    @Autowired
    private usuariosRepositorio repositorio;

    @Override
    public List<usuarios> listarTodosLosUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public usuarios guardarUsuario(usuarios usuarios) {
        return repositorio.save(usuarios);
    }

    @Override
    public usuarios obtenerUsuarioPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public usuarios actualizarUsuario(usuarios usuarios) {
        return repositorio.save(usuarios);
    }

    @Override
    public void eliminarUsuario(Long id) {
        repositorio.deleteById(id);

    }

}