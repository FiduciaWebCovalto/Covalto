package com.fiduciawebmovil.ayuda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fiduciawebmovil.ayuda.repo.TemaAyudaRepository;
import com.fiduciawebmovil.ayuda.entity.TemaAyuda;
import java.util.List;

@RestController
@RequestMapping("/api/ayuda")
public class TemaAyudaController {

    @Autowired
    private TemaAyudaRepository repository;

    @GetMapping
    public List<TemaAyuda> obtenerTemas() {
        return repository.findAll();
    }
}