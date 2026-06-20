package com.fiduciawebmovil.contrato.controller;

import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.contrato.services.ContratoService;
import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.contrato.dtos.ContratoDTO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/contrato")
public class ContratoController {

    @Autowired
    private ContratoService servicio;

    @GetMapping
    public List<Contrato> findAll() {
        return servicio.findAll();
    }
  
    @GetMapping("/{buscar}")
    public List<Contrato> findByCtoNumContrato(@RequestParam Long id) {
        return servicio.findByCtoNumContrato(id);
    }     
}
