package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.modelos.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuariosRepositorio extends JpaRepository<usuarios, Long>{

}