package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.modelos.Usuario;
import com.springboot.bootstrap.repositorio.usuariosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuariosServicios {

    @Autowired private usuariosRepositorio repositorio;
    public List<Usuario> listAll(){
        return (List<Usuario>) repositorio.findAll();
    }

}
