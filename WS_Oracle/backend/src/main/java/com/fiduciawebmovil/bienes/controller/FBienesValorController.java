package com.fiduciawebmovil.bienes.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.bienes.entity.FBienesValor;
import com.fiduciawebmovil.bienes.services.FBienesValorService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bienes")
public class FBienesValorController {

    @Autowired
    private FBienesValorService servicio;


    @PostMapping
    public FBienesValor insertar(@RequestBody FBienesValor id) {
        return servicio.save(id);
    }
    
}
