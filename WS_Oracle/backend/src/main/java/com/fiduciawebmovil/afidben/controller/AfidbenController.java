package com.fiduciawebmovil.afidben.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.afidben.entity.Afidben;
import com.fiduciawebmovil.afidben.services.AfidbenService;
import com.fiduciawebmovil.benefici.entity.Benefici;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/afidben")
public class AfidbenController {

    @Autowired
    private AfidbenService servicio;


    @GetMapping
    public List<Afidben> list() {
        return servicio.findAll();
    }

    @GetMapping("/buscarnombre")
    public boolean findPersona(@RequestParam("id") Long id,
    @RequestParam("id2") String id2,
        @RequestParam("id3") BigDecimal id3) {
        return servicio.findPersona(id,id2,id3);
    } 

}
