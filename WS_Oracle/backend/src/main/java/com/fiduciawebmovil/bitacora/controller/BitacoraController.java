package com.fiduciawebmovil.bitacora.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.bitacora.entity.Bitacora;
import com.fiduciawebmovil.bitacora.services.BitacoraService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bitacora")
public class BitacoraController {

    @Autowired
    private BitacoraService servicio;


    @PostMapping
    public Bitacora insertar(@RequestBody Bitacora id) {
        return servicio.save(id);
    }
    
}
