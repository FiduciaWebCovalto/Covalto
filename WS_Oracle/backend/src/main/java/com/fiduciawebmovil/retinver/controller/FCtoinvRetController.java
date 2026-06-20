package com.fiduciawebmovil.retinver.controller;
import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.retinver.entity.FCtoinvRet;
import com.fiduciawebmovil.retinver.services.FCtoinvRetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/retinver")
public class FCtoinvRetController {

    @Autowired
    private FCtoinvRetService servicio;


    @PostMapping
    public FCtoinvRet insertar(@RequestBody FCtoinvRet id) {
        return servicio.save(id);
    }
    
}
