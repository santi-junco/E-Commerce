package com.tiendaS.tienda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String categoria;

//    Setters
    public void setId(Long id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(BigDecimal precio){
        this.precio = precio;
    }
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    public void setCategorai(String categoria){
        this.categoria = categoria;
    }

//    Getters
    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDEscriopcion(){
        return descripcion;
    }
    public BigDecimal getPrecio(){
        return precio;
    }
    public Long getCodigo(){
        return codigo;
    }
    public String getCategoria(){
        return categoria;
    }
}

