package com.fiduciawebmovil.ctoinver.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.ctoinver.entity.Continte;
import com.fiduciawebmovil.ctoinver.services.ContinteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ctoinver")
public class ContinteController {

    @Autowired
    private ContinteService servicio;

    @GetMapping("/{buscar}")
    public List<Continte> findByIdCprNumContrato(@RequestParam Long id) {
        return servicio.findByIdCprNumContrato(id);
    } 

        @GetMapping("/{inver}/{id}")
    public List<Continte> findFisoInversion(@RequestParam("id") Long id,
    @RequestParam("id2") Long id2) {
        return servicio.findFisoInversion(id,id2);
    }

}
