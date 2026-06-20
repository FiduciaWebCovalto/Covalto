package com.fiduciawebmovil.folios.controller;


import com.fiduciawebmovil.folios.entity.Folios;
import com.fiduciawebmovil.folios.services.FoliosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/folios")
public class FoliosController {

    @Autowired
    private FoliosService servicio;

    @GetMapping("/{buscar}")
    public List<Folios> findByFolTipoFolio(@RequestParam Long id) {
        return servicio.findByFolTipoFolio(id);
    } 

    @GetMapping("/siguiente/")
    public Long obtenerSiguiente() {
        return servicio.getNextId();
    }

}
