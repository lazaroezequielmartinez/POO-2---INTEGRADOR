package com.springboot.bootstrap.repositorio;

import com.springboot.bootstrap.configuraciones.Usuario_Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_sis_repositorio extends JpaRepository<Usuario_Sistema, Long> {
    public Usuario_Sistema findByEmail(String email);

}
