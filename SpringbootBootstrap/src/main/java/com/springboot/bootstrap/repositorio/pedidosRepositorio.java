package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.modelos.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface pedidosRepositorio extends CrudRepository<Pedido, Integer> {
}
