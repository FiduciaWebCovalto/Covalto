package com.fiduciawebmovilp.fusuario.controller;

import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.fusuario.services.FUsuarioService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class FUsuarioController {

    @Autowired
    private FUsuarioService servicio;


    @PostMapping
    public FUsuario insertar(@RequestBody FUsuario id) {
        return servicio.save(id);
    }
}
