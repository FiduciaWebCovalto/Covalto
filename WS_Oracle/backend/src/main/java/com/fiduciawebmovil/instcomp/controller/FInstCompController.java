package com.fiduciawebmovil.instcomp.controller;
import lombok.RequiredArgsConstructor;


import com.fiduciawebmovil.instcomp.entity.FInstComp;
import com.fiduciawebmovil.instcomp.services.FInstCompService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/instcomp")
public class FInstCompController {

    @Autowired
    private FInstCompService servicio;


    @PostMapping
    public FInstComp insertar(@RequestBody FInstComp id) {
        return servicio.save(id);
    }
    
}
