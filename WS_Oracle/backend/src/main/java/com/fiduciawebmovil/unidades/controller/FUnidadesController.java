package com.fiduciawebmovil.unidades.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.unidades.entity.FUnidades;
import com.fiduciawebmovil.unidades.services.FUnidadesService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/unidades")
public class FUnidadesController {

    @Autowired
    private FUnidadesService servicio;

    @GetMapping("/{buscar}")
    public List<FUnidades> findByIdFuniIdFideicomiso(@RequestParam Long id) {
        return servicio.findByIdFuniIdFideicomiso(id);
    } 
    
}
