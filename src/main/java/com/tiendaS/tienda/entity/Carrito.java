package com.tiendaS.tienda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaCreacion;
    private Long userId;
    private Long prodId;
//    private tipo estado; este campo tiene que tener uno de dos valores 'en curso' o 'cerrado' averiguar como hacer

//    Setters
    public void setId(Long id){
        this.id = id;
    }
    public void setFechaCreacion(LocalDate fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }
    public void setUserId(Long userId){
        this.userId = userId;
    }
    public void setProdId(Long prodId){
        this.prodId = prodId;
    }
//    public void setEstado(tipo estado){
//        this.estado = estado;
//    }

//    Getters
    public Long getId(){
        return id;
    }
    public LocalDate getFechaCreacion(){
        return fechaCreacion;
    }
    public Long getUserId(){
        return userId;
    }
    public Long getProdId(){
        return prodId;
    }
//    public Tipo getEstado(){
//        return estado;
//    }
}
