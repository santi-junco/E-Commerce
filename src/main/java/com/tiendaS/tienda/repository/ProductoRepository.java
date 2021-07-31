package com.tiendaS.tienda.repository;

import com.tiendaS.tienda.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
