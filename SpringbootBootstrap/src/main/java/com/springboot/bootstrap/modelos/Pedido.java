
package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pedidosMinerva")
public class Pedido {
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

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    @ManyToMany
    @JoinTable(
            name = "pedido_tiene_insumos",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_insumo"))
    List<Insumo> insumos;
}
