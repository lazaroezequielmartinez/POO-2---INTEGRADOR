package com.poo2integrador.minerva.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name ="nombre")
    private String nombre;
    @Column(name = "descripcione")
    private String descripcion;
    @Column(name ="cantidad")
    private Integer cantidad;


}
