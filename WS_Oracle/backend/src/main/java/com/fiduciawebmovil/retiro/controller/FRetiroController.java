package com.fiduciawebmovil.retiro.controller;
import lombok.RequiredArgsConstructor;


import com.fiduciawebmovil.retiro.entity.FRetiro;
import com.fiduciawebmovil.retiro.services.FRetiroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/retiro")
public class FRetiroController {

    @Autowired
    private FRetiroService servicio;


    @PostMapping
    public FRetiro insertar(@RequestBody FRetiro id) {
        return servicio.save(id);
    }
    
}
