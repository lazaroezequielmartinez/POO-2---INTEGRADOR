package com.poo2integrador.minerva.Modelos;

import com.sun.istack.NotNull;
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

//    @NotBlank(message = "El campo estado es obligatorio ")
    @Column(name ="estado")
//    @NotBlank
    private String estado;
//    @NotBlank
    @Column(name ="tipoDisenio")
    private String tipoDisenio;

    @ManyToOne
    private Disenio disenio;

}
