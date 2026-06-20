package com.fiduciawebmovil.terceros.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.benefici.entity.Benefici;
import com.fiduciawebmovil.terceros.entity.Terceros;
import com.fiduciawebmovil.terceros.services.TercerosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Otros")
public class TercerosController {

    @Autowired
    private TercerosService servicio;


    @GetMapping
    public List<Terceros> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<Terceros> findByIdTerNumContrato(@RequestParam Long id) {
        return servicio.findByIdTerNumContrato(id);
    } 
    @GetMapping("/buscarnombre/{id}")
    public List<Terceros> findByIdTerNumContratoAndTerNomTercero(@RequestParam("id") Long id,@RequestParam("id2") String id2) {
        return servicio.findByIdTerNumContratoAndTerNomTercero(id,id2);
    } 
    
}
