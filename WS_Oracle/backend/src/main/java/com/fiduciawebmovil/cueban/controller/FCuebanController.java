package com.fiduciawebmovil.cueban.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.cueban.services.FCuebanService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cuentas")
public class FCuebanController {

    @Autowired
    private FCuebanService servicio;


    @GetMapping
    public List<FCueban> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<FCueban> findByFcbaClabeCba(@RequestParam String id) {
        return servicio.findByFcbaClabeCba(id);
    } 
}
