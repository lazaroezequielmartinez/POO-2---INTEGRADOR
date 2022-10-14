
package com.springboot.bootstrap.modelos;

import javax.persistence.*;

@Entity
@Table(name = "usuarios_minerva")
public class usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre", nullable = false, length = 45)
    private String nombres;

    @Column(name="apellido", nullable = false, length = 45)
    private String apellidos;

    @Column(name="email", nullable = false, unique = true, length = 45)
    private String email;

    @Column(name="rol", nullable = false, length = 15)
    private String rol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
