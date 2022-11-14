
package com.springboot.bootstrap.modelos;



import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "categoria", length = 50)
    @Nullable
    private String categoria;

    @Column(name = "dni", length = 50)
    @Nullable
    private Integer dni;

    @Column(name = "fechapedido", length = 50)
    @Nullable
    private String fechapedido;

    @Column(name = "estado", length = 50)
    @Nullable
    private String estado;

    @Column(name = "observaciones", length = 240)
    @Nullable
    private String observaciones;

    public Pedido() {

    }

    public Pedido(Long id, String categoria, Integer dni, String fechapedido, String estado, String observaciones, List<Insumo> insumos) {
        this.id = id;
        this.categoria = categoria;
        this.dni = dni;
        this.fechapedido = fechapedido;
        this.estado = estado;
        this.observaciones = observaciones;
        this.insumos = insumos;
    }

    public Pedido(String categoria, Integer dni, String fechapedido, String estado, String observaciones, List<Insumo> insumos) {
        this.categoria = categoria;
        this.dni = dni;
        this.fechapedido = fechapedido;
        this.estado = estado;
        this.observaciones = observaciones;
        this.insumos = insumos;
    }

    public Long getId() {
        return id;
    }
    // ver los set no van ya que no se debe permitir  cambiar
    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
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
    // no  combiare pero recorda  que los get y set no va en las id
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
                ", dni=" + dni +
                ", fechapedido='" + fechapedido + '\'' +
                ", estado='" + estado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", insumos=" + insumos +
                '}';
    }

    @ManyToMany
    @JoinTable(
            name = "pedido_tiene_insumos",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_insumo"))
    List<Insumo> insumos;
}
