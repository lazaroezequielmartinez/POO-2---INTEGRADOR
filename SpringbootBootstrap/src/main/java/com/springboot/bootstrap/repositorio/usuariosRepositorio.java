package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.modelos.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface usuariosRepositorio extends CrudRepository<Usuario, Integer> {
}
