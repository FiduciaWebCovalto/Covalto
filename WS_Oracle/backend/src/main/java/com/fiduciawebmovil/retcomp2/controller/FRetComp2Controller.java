package com.fiduciawebmovil.retcomp2.controller;
import lombok.RequiredArgsConstructor;


import com.fiduciawebmovil.retcomp2.entity.FRetComp2;
import com.fiduciawebmovil.retcomp2.services.FRetComp2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/retcomp2")
public class FRetComp2Controller {

    @Autowired
    private FRetComp2Service servicio;


    @PostMapping
    public FRetComp2 insertar(@RequestBody FRetComp2 id) {
        return servicio.save(id);
    }
    
}
