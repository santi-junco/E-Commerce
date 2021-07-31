package com.tiendaS.tienda.controller;

import com.tiendaS.tienda.entity.Usuario;
import com.tiendaS.tienda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuarios")
    public @ResponseBody Iterable<Usuario> findUsuario(){
        return usuarioRepository.findAll();
    }

}
