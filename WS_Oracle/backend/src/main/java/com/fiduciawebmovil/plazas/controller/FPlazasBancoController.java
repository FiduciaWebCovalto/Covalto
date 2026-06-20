package com.fiduciawebmovil.plazas.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.plazas.entity.FPlazasBanco;
import com.fiduciawebmovil.plazas.services.FPlazasBancoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/plazas")
public class FPlazasBancoController {

    @Autowired
    private FPlazasBancoService servicio;


    @GetMapping
    public List<FPlazasBanco> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<FPlazasBanco> findByFplbIdBanco(@RequestParam Long id,@RequestParam Long id2) {
        return servicio.findByFplbIdBanco(id,id2);
    } 
}
