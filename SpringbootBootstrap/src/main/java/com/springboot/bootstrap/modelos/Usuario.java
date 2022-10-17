
package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "usuarios_minerva")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre", nullable = false, length = 45)
    private String nombres;

    @Column(name="apellido", nullable = false, length = 45)
    private String apellidos;

    @Column(name="email", nullable = false, unique = true, length = 45)
    private String email;

    @Column(name="rol", nullable = false, length = 15)
    private String rol;
}
