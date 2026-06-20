package com.fiduciawebmovil.docetapa.controller;
import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.docetapa.entity.VistaDocumento;
import com.fiduciawebmovil.docetapa.services.VistaDocumentoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/documento")
public class VistaDocumentoController {

    @Autowired
    private VistaDocumentoService servicio;


    @GetMapping("/{buscar}")
    public List<VistaDocumento> buscar(@RequestParam String id) {
    return servicio.buscar(id);
    } 
    
}
