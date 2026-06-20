package com.fiduciawebmovil.fbitacorasol.controller;

import lombok.RequiredArgsConstructor;


import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSol;
import com.fiduciawebmovil.fbitacorasol.services.FBitacoraSolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/fbitacorasol")
public class FBitacoraSolController {

    @Autowired
    private FBitacoraSolService servicio;


    @PostMapping
    public FBitacoraSol insertar(@RequestBody FBitacoraSol id) {
        return servicio.save(id);
    }
    
}
