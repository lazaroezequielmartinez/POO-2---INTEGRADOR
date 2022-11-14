
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
@Table(name = "informes")
public class Informe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_informe", nullable = false)
    private Integer id;

    @Column(name="estado")
    private String estado;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="Lunes")
    private String Lunes;

    @Column(name="Martes")
    private String Martes;

    @Column(name="Miercoles")
    private String Miercoles;

    @Column(name="Jueves")
    private String Jueves;

    @Column(name="Viernes")
    private String Viernes;

    @OneToOne
    @JoinColumn(name="id_pedido")
    private Pedido pedidos;

}
