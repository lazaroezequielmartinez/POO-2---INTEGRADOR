package com.springboot.bootstrap.modelos;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "DISENIO")
public class Disenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disenio", nullable = false)
    private Integer id;
    @Column(name="estado")
    private String estado;
    @Column(name="tipo_disenio")
    private String tipo_disenio;

   /* @Basic
    @Column(name = "ciudad", length = 100)
    private String ciudad;
/bueno cuidate okay
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_provincia", nullable = false)
    private Provincia idProvincia;*/


}
