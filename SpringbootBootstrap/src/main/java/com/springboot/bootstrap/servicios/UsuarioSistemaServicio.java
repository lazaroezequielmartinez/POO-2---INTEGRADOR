package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.configuraciones.UsuarioRegistro;
import com.springboot.bootstrap.configuraciones.Usuario_Sistema;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioSistemaServicio extends UserDetailsService {

    public Usuario_Sistema guardarUsuario(UsuarioRegistro registro);

}
