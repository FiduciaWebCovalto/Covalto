package com.fiduciawebmovil.fusuario.controller;

import com.fiduciawebmovil.fusuario.services.FUsuarioService;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.fusuario.entity.FUsuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class FUsuarioController {

    @Autowired
    private FUsuarioService servicio;


    @GetMapping
    public List<FUsuario> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<FUsuario> findByFusuIdUsuario(@RequestParam String id) {
        return servicio.findByFusuIdUsuario(id);
    } 
}
