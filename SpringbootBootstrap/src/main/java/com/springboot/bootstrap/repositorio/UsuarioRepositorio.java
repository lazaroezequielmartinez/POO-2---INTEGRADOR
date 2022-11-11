package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

    List<Usuario> findByNombre(String nombre);
}