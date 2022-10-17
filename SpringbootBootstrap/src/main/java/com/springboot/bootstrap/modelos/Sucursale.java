
//Anotacion: Para esta iteraciòn solamente se utilizaran los modelos usuarios y pedidos

package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "sucursales")
public class Sucursale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grafica", nullable = false)
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="razon_social")
    private Integer razon_social;

    @Column(name="calle")
    private String calle;

    @Column(name="altura")
    private String altura;


}

