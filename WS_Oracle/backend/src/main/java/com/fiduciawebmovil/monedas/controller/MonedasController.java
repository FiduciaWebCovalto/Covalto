package com.fiduciawebmovil.monedas.controller;

import com.fiduciawebmovil.monedas.entity.Monedas;
import com.fiduciawebmovil.monedas.services.MonedasService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/monedas")
public class MonedasController {

    @Autowired
    private MonedasService servicio;

    @GetMapping
    public List<Monedas> findAll(){
       return servicio.findAll(); 
    }
    @GetMapping("/id/{id}")
    public List<Monedas> monNumPais(@PathVariable("id") Long id) {
        return servicio.monNumPais(id);
    } 
    @GetMapping("/nombre/{id}")
    public List<Monedas> findByMonNomMoneda(@RequestParam("id") String id){
        return servicio.findByMonNomMoneda(id);
    } 

}
