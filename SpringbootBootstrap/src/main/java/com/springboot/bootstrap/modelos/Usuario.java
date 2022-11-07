package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dni",nullable = false,length = 50, unique = true)
    private Integer dni;

    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;

    @Column(name = "telefono",nullable = false, length = 255)
    private String telefono;

    @Column(name = "direccion",nullable = false,length = 50)
    private String direccion;

    @Column(name = "email",nullable = false,length = 50,unique = true)
    private String email;

    public Usuario() {

    }

    public Usuario(Long id, Integer dni, String nombre, String apellido, String telefono, String direccion, String email) {
        super();
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public Usuario(Integer dni, String nombre, String apellido, String telefono, String direccion, String email) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
