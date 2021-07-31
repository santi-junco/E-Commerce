package com.tiendaS.tienda.config;

import com.tiendaS.tienda.entity.Usuario;
import com.tiendaS.tienda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UsuarioRunner implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setApellido("Junco");
        usuario.setNombre("Santiago");
        usuario.setDireccion("Av Paraguay 240");
        usuario.setFecha(LocalDate.now());
        usuarioRepository.save(usuario);
    }
}
