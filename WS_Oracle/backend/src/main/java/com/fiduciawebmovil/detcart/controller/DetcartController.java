package com.fiduciawebmovil.detcart.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.detcart.entity.Detcart;
import com.fiduciawebmovil.detcart.services.DetcartService;
import com.fiduciawebmovil.fideicom.entity.Fideicom;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/detcart")
public class DetcartController {

    @Autowired
    private DetcartService servicio;


    @GetMapping
    public List<Detcart> list() {
        return servicio.findAll();
    }

    @GetMapping("/{buscar}")
    public List<Detcart> findfisoperiodo( @RequestParam("fiso") Long fiso,
            @RequestParam("fechaInicio") String fechaInicio,
            @RequestParam("fechaFin") String fechaFin) 
            {
        return servicio.findfisoperiodo(fiso,fechaInicio,fechaFin);
    }  
    
}
