
package com.springboot.bootstrap.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pedidosMin")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedidos", nullable = false)
    private Integer id;

    @Column(name="tipo", nullable = false, length = 45)
    private String tipo;

    @Column(name="cantidad", nullable = false, length = 200)
    private Integer cantidad;

    @Column(name="nombre_cliente", nullable = false, length = 45)
    private String nombre_cliente;

    @Column(name="telefono", nullable = false, length = 45)
    private String telefono;

    @Column(name="fecha_pedido", nullable = false)
    private Date fecha_pedido;

    @Column(name="fecha_entrega", nullable = false)
    private Date fecha_entrega;

    @Column(name="presupuesto", nullable = false)
    private Float presupuesto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Float presupuesto) {
        this.presupuesto = presupuesto;
    }
}
