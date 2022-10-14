package modelos;

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
@Table(name = "pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedidos", nullable = false)
    private Integer id;
    @Column(name="tipo")
    private String tipo;
    @Column(name="cantidad")
    private Integer cantidad;
    @Column(name="nombre_cliente")
    private String nombre_cliente;
    @Column(name="telefono")
    private String telefono;
    @Column(name="fecha_pedido")
    private Date fecha_pedido;
    @Column(name="fecha_entrega")
    private Date fecha_entrega;
    @Column(name="presupuesto")
    private Float presupuesto;

}
