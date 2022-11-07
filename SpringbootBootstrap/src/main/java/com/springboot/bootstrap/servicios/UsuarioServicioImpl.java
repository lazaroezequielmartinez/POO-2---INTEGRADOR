package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.modelos.Usuario;
import com.springboot.bootstrap.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> listarTodosLosUsuarios() {

        return repositorio.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario Usuario) {

        return repositorio.save(Usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {

        return repositorio.findById(id).get();
    }

    @Override
    public Usuario actualizarUsuario(Usuario Usuario) {

        return repositorio.save(Usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {

        repositorio.deleteById(id);

    }

}