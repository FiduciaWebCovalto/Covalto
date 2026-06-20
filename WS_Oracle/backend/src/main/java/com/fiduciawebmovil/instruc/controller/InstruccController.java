package com.fiduciawebmovil.instruc.controller;
import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.instruc.entity.Instrucc;
import com.fiduciawebmovil.instruc.services.InstruccService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/instruc")
public class InstruccController {

    @Autowired
    private InstruccService servicio;


    @PostMapping
    public Instrucc insertar(@RequestBody Instrucc id) {
        return servicio.save(id);
    }
    
}
