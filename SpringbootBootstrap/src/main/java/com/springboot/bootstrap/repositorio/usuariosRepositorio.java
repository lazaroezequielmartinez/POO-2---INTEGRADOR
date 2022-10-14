package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.modelos.usuarios;
import org.springframework.data.repository.CrudRepository;

public interface usuariosRepositorio extends CrudRepository<usuarios, Integer> {
}
