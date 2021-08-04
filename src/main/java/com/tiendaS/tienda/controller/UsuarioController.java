package com.tiendaS.tienda.controller;

import com.tiendaS.tienda.entity.Usuario;
import com.tiendaS.tienda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(value = "/usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping(value = "/usuario")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(usuarioRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/usuario/{id}")
    public Usuario getUsuarioPorId(@PathVariable("id") Long id){
        return usuarioRepository.findById(id).get();
    }

    @PutMapping(value = "/usuario/{id}")
    public Usuario modificarUsuario(@PathVariable("id") Long id, @RequestBody Usuario usuario){
        Usuario usuarioExiste = usuarioRepository.findById(id).get();
        usuarioExiste.setNombre(usuario.getNombre());
        usuarioExiste.setApellido(usuario.getApellido());
        usuarioExiste.setDireccion(usuario.getDireccion());
        return usuarioRepository.save(usuarioExiste);
    }

    @DeleteMapping(value = "/usuario/{id}")
    public void borrarUserId(@PathVariable("id") Long id){
        usuarioRepository.deleteById(id);
    }

}
