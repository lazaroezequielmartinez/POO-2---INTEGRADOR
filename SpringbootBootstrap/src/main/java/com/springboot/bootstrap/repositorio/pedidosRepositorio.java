package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.modelos.Pedidos;
import org.springframework.data.repository.CrudRepository;

public interface pedidosRepositorio extends CrudRepository<Pedidos, Integer> {
}
