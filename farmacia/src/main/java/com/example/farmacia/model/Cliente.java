package com.example.farmacia.model;

import jakarta.persistence.*;


@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    private String telefono;
    private String direccion;

    // Getters y Setters
    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
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
}