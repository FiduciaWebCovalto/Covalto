package com.fiduciawebmovil.fbitacora.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.fbitacora.entity.FBitacora;
import com.fiduciawebmovil.fbitacora.services.FBitacoraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/fbitacora")
public class FBitacoraController {

    @Autowired
    private FBitacoraService servicio;


    @PostMapping
    public FBitacora insertar(@RequestBody FBitacora id) {
        return servicio.save(id);
    }
    
}
