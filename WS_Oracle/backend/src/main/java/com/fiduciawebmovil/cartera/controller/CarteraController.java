package com.fiduciawebmovil.cartera.controller;
import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.cartera.entity.Cartera;
import com.fiduciawebmovil.cartera.services.CarteraService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cartera")
public class CarteraController {

    @Autowired
    private CarteraService servicio;


    @GetMapping
    public List<Cartera> list() {
        return servicio.findAll();
    }

    @GetMapping("/{buscar}")
    public List<Cartera> findByIdCarNumContrato( @RequestParam("fiso") Long fiso) {
        return servicio.findByIdCarNumContrato(fiso);
    } 
    
}
