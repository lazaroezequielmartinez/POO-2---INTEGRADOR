package com.poo2integrador.minerva.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Informe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name ="estadoInforme")
    private String estadoInforme;
    @Column(name ="descripcion")
    private String descripcion;



    @OneToOne
    private Informe informe;
}
