package com.springboot.bootstrap.servicios;

import com.springboot.bootstrap.configuraciones.Rol;
import com.springboot.bootstrap.configuraciones.UsuarioRegistro;
import com.springboot.bootstrap.configuraciones.Usuario_Sistema;
import com.springboot.bootstrap.repositorio.Usuario_sis_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UsuarioSistemaServicioImpl implements UsuarioSistemaServicio{

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    private Usuario_sis_repositorio usuarioSisRepositorio;

    public UsuarioSistemaServicioImpl(Usuario_sis_repositorio usuarioSisRepositorio) {
        super();
        this.usuarioSisRepositorio = usuarioSisRepositorio;
    }

    @Override
    public Usuario_Sistema guardarUsuario(UsuarioRegistro registro) {
        Usuario_Sistema usuario_sistema = new Usuario_Sistema(registro.getNombre(), registro.getApellido(), registro.getEmail(), passwordEncoder.encode(registro.getPassword()), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioSisRepositorio.save(usuario_sistema);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario_Sistema usuario = usuarioSisRepositorio.findByEmail(username);
        if(usuario == null){
            throw new UsernameNotFoundException("Email o contraseña inválidos");
        }
        return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }

}
