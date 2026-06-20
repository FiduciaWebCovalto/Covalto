package com.fiduciawebmovil.fideicom.controller;

import lombok.RequiredArgsConstructor;
import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.services.FideicomService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/fideicom")
public class FideicomController {

    @Autowired
    private FideicomService servicio;


    @GetMapping
    public List<Fideicom> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<Fideicom> findByIdFidNumContrato(@RequestParam Long id) {
        return servicio.findByIdFidNumContrato(id);
    } 
    @GetMapping("/{buscarnombre}/{id}")
    public List<Fideicom> findByIdFidNumContratoAndFidNomFideicom(@RequestParam("id") Long id,@RequestParam("id2") String id2) {
        return servicio.findByIdFidNumContratoAndFidNomFideicom(id,id2);
    } 
}
