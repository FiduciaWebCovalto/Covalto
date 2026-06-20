package com.fiduciawebmovil.indices.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.indices.entity.FIndices;
import com.fiduciawebmovil.indices.services.FIndicesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/indices")
public class FIndicesController {

    @Autowired
    private FIndicesService servicio;


    @GetMapping
    public List<FIndices> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<FIndices> findByIdEindIdIndice(@RequestParam Long id) {
        return servicio.findByIdEindIdIndice(id);
    } 

    @GetMapping("/id/{id}")
    public List<FIndices> findByEindDescripcion(@PathVariable("id") String id) {
        return servicio.findByEindDescripcion(id);
    } 
}
