package com.tiendaS.tienda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fecha;

//  Setters
    public void setId(Long id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

//  Getters
    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDireccion(){
        return direccion;
    }
    public LocalDate getFecha(){
        return fecha;
    }
}