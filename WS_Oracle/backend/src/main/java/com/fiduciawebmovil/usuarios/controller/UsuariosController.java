package com.fiduciawebmovil.usuarios.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fiduciawebmovil.usuarios.entity.Usuarios;
import com.fiduciawebmovil.usuarios.services.UsuariosService;


@RequiredArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService servicio;


    /*@PostMapping
    public Usuarios insertar(@RequestBody Usuarios id) {
        return servicio.save(id);
    }*/
}
