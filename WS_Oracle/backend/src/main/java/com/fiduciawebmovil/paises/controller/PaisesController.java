package com.fiduciawebmovil.paises.controller;

import com.fiduciawebmovil.paises.entity.Paises;
import com.fiduciawebmovil.paises.services.PaisesService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/paises")
public class PaisesController {

    @Autowired
    private PaisesService servicio;

    @GetMapping
    public List<Paises> findAll(){
       return servicio.findAll(); 
    }
    @GetMapping("/id/{id}")
    public List<Paises> findByPaiNumPais(@PathVariable("id") Long id) {
        return servicio.findByPaiNumPais(id);
    } 
    @GetMapping("/nombre")
    public List<Paises> findByPaiNomPais(@RequestParam("id") String id){
        return servicio.findByPaiNomPais(id);
    } 

}
