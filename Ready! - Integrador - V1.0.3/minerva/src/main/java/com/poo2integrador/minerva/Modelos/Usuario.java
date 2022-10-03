package com.poo2integrador.minerva.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name ="nombre")
    private String nombre;
    @Column( name = "apellido")
    private String  apellido;
    @Column( name ="dni")
    private Integer dni;
    @Column( name ="email")
    private String email;
    @Column( name="rol")
    private Integer rol;

}
