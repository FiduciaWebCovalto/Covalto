package com.fiduciawebmovil.empresa.controller;


import com.fiduciawebmovil.empresa.entity.FEmpresa;
import com.fiduciawebmovil.empresa.services.FEmpresaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/empresa")
public class FEmpresaController {

    @Autowired
    private FEmpresaService servicio;

    @GetMapping("/{buscar}")
    public List<FEmpresa> findByEmpNumEmpresa(@RequestParam Long id) {
        return servicio.findByEmpNumEmpresa(id);
    } 

}
