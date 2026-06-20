package com.fiduciawebmovil.insnovalor.controller;

import lombok.RequiredArgsConstructor;


import com.fiduciawebmovil.insnovalor.entity.FConinsnomonValor;
import com.fiduciawebmovil.insnovalor.services.FConinsnomonValorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/nomonvalor")
public class FConinsnomonValorController {

    @Autowired
    private FConinsnomonValorService servicio;


    @PostMapping
    public FConinsnomonValor insertar(@RequestBody FConinsnomonValor id) {
        return servicio.save(id);
    }
    
}
