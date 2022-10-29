
package com.springboot.bootstrap.modelos;



import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "categoria",nullable = false,length = 50)
    private String categoria;

    @Column(name = "fechapedido",nullable = false,length = 50)
    private String fechapedido;

    @Column(name = "estado",nullable = false,length = 50)
    private String estado;

    @Column(name = "observaciones",nullable = false,length = 50,unique = true)
    private String observaciones;

    public Pedido() {

    }

    public Pedido(Long id, String categoria, String fechapedido, String estado, String observaciones) {
        this.id = id;
        this.categoria = categoria;
        this.fechapedido = fechapedido;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public Pedido(String categoria, String fechapedido, String estado, String observaciones) {
        this.categoria = categoria;
        this.fechapedido = fechapedido;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(String fechapedido) {
        this.fechapedido = fechapedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", fechapedido='" + fechapedido + '\'' +
                ", estado='" + estado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    @ManyToMany
    @JoinTable(
            name = "pedido_tiene_insumos",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_insumo"))
    List<Insumo> insumos;
}
