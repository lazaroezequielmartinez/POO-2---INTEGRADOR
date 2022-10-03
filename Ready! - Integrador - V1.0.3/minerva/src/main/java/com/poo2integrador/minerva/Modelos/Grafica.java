package com.poo2integrador.minerva.Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Grafica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column (name = "nombre")
    private String nombres;
    @Column (name = "razonSocial")
    private Integer  razonSocial;
    @Column (name = "calle")
    private String calle;
    @Column (name = "altura")
    private String altura;
    @Column (name = "cuit")
    private Integer cuit;







}
