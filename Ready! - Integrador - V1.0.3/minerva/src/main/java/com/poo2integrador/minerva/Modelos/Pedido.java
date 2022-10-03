package com.poo2integrador.minerva.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column( name ="tipo")
    private String  tipo;
    @Column (name = "cantidad")
    private Integer cantidad;
    @Column(name ="nombreCliente")
    private String  nombreCliente;
    @Column(name = "telefoCliente")
    private String telefonoCliente;
    @Column(name="fechaPedido")
    private Date fechaPedidos;
    @Column(name ="presupuesto")
    private  float presupuesto;

    @ManyToOne
    private Usuario usuario;







}
