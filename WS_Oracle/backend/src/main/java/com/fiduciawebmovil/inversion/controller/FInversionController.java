package com.fiduciawebmovil.inversion.controller;
import lombok.RequiredArgsConstructor;


import com.fiduciawebmovil.inversion.entity.FInversion;
import com.fiduciawebmovil.inversion.services.FInversionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/inversion")
public class FInversionController {

    @Autowired
    private FInversionService servicio;


    @PostMapping
    public FInversion insertar(@RequestBody FInversion id) {
        return servicio.save(id);
    }
    
}
