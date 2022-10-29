package com.springboot.bootstrap.repositorio;


import com.springboot.bootstrap.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

}
