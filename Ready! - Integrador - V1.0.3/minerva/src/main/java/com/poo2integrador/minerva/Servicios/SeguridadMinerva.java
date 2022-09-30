package com.poo2integrador.minerva.Servicios;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity

public class SeguridadMinerva extends WebSecurityConfigurerAdapter {

    /* habilito la seguridad web */

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        /*
         * Aqui deberiamos conectar con una base de datos donde tenemos usuarios
         * registrados, con contraseña y rol, pero
         * pero eso lo haremos mas adelante, de momento creamos usuarios a manopla,
         * hasta que
         * tengamos la base de datos
         */

        UserBuilder usuarios = User.withDefaultPasswordEncoder();
        /*
         * Este metodo aparece tachado porque está obsoleto, porque las contraseñas que
         * implementaremos
         * aquí para las pruebas están sin encriptar
         */
        auth.inMemoryAuthentication()
                .withUser(usuarios.username("Laza").password("123").roles("IMPRESION"))
                .withUser(usuarios.username("Lauu").password("123").roles("ADMINISTRADOR"))
                .withUser(usuarios.username("Ayee").password("123").roles("ATENCIONPUBLICO"))
                .withUser(usuarios.username("Silvia").password("123").roles("ATENCIONPUBLICO"))
                .withUser(usuarios.username("luciano").password("123").roles("IMPRESION"))
                .withUser(usuarios.username("Carlos").password("123").roles("ENCARGADO"));
        /*
         * Cuando tengamos la base de datos funcinando, sustituiremos este método
         */

    }

}