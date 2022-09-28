package com.poo2integrador.poo2.modelo;

public class Administrador {

    private int dni;
    private String apellido;
    private String nombre;
    private char telefono;
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getTelefono() {
        return telefono;
    }
    public void setTelefono(char telefono) {
        this.telefono = telefono;
    }
    public Administrador(int dni, String apellido, String nombre, char telefono) {
        super();
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
}
