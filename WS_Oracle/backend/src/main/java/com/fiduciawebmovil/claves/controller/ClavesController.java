package com.fiduciawebmovil.claves.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.claves.services.ClavesService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/conceptos")
public class ClavesController {

    @Autowired
    private ClavesService servicio;


    @GetMapping
    public List<Claves> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<Claves> findByIdCveNumClave(@RequestParam Long id) {
        return servicio.findByIdCveNumClave(id);
    } 
    @GetMapping("/nombre")
    public List<Claves> findByIdCveNumClaveAndCveDescClave(@RequestParam("id") Long id,@RequestParam("id2") String id2) {
        return servicio.findByIdCveNumClaveAndCveDescClave(id,id2);
    } 
    @GetMapping("/id/{sec}")
    public List<Claves>  findDescripcionClave
    (@RequestParam("id") Long id,@RequestParam("id2") Long id2) {
        return servicio.findDescripcionClave(id,id2);
    } 
}
