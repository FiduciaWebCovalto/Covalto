package com.fiduciawebmovil.traspaso.controller;
import lombok.RequiredArgsConstructor;



import com.fiduciawebmovil.traspaso.entity.FTraspaso;
import com.fiduciawebmovil.traspaso.services.FTraspasoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/traspaso")
public class FTraspasoController {

    @Autowired
    private FTraspasoService servicio;


    @PostMapping
    public FTraspaso insertar(@RequestBody FTraspaso id) {
        return servicio.save(id);
    }
    
}
