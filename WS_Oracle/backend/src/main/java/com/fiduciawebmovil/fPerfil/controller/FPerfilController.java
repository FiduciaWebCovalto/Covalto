package com.fiduciawebmovil.fPerfil.controller;

import com.fiduciawebmovil.fPerfil.services.FPerfilService;
import com.fiduciawebmovil.fPerfil.dtos.FPerfilDTO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/perfil")
public class FPerfilController {

    @Autowired
    private FPerfilService servicio;


    @GetMapping
    public List<FPerfilDTO> list() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Optional<FPerfilDTO> entidad = servicio.findById(id);

        if (entidad.isPresent()) {
            return ResponseEntity.ok(entidad.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
}
