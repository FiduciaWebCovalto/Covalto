package com.fiduciawebmovil.posicion.controller;

import lombok.RequiredArgsConstructor;
import com.fiduciawebmovil.posicion.entity.Posicion;
import com.fiduciawebmovil.posicion.services.PosicionService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posicion")
public class PosicionController {

    @Autowired
    private PosicionService servicio;

    @GetMapping("/{buscar}")
    public List<Posicion> findByIdPosNumContrato(@RequestParam Long id) {
        return servicio.findByIdPosNumContrato(id);
    } 

    @GetMapping("/{buscar}/{id}")
    public List<Posicion> findPosicion(@RequestParam("id") Long id,
    @RequestParam("id2") Long id2) {
        return servicio.findPosicion(id,id2);
    } 
    
}
