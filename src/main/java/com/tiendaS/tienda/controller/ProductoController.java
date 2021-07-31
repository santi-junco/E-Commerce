package com.tiendaS.tienda.controller;

import com.tiendaS.tienda.entity.Producto;
import com.tiendaS.tienda.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping(value = "/productos")
    public @ResponseBody Iterable<Producto> findProducto(){
        return productoRepository.findAll();
    }
}
