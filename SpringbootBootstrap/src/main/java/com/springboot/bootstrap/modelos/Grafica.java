package com.springboot.bootstrap.modelos;

import jdk.jfr.SettingDefinition;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "GRAFICA")
public class Grafica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grafica", nullable = false)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="razon_social")
    private Integer razon_social;
    @Column(name="calle")
    private String calle;
    @Column(name="altura")
    private String altura;


}

