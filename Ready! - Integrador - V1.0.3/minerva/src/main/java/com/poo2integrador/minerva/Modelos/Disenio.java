package com.poo2integrador.minerva.Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Disenio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name ="estado")
    private String estado;
    @Column(name ="tipoDisenio")
    private String tipoDisenio;

    @ManyToOne
    private Disenio disenio;

}
