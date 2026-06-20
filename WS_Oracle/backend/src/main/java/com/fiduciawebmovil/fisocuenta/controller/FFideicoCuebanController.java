package com.fiduciawebmovil.fisocuenta.controller;

import lombok.RequiredArgsConstructor;
import com.fiduciawebmovil.fisocuenta.entity.FFideicoCueban;
import com.fiduciawebmovil.fisocuenta.services.FFideicoCuebanService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/fisocuenta")
public class FFideicoCuebanController {

    @Autowired
    private FFideicoCuebanService servicio;

    @GetMapping("/{buscar}")
    public List<FFideicoCueban> findByIdFfidIdFideicomiso(@RequestParam Long id) {
        return servicio.findByIdFfidIdFideicomiso(id);
    } 

    @GetMapping("/{buscar}/{id}")
    public List<FFideicoCueban> findByFcbaTitular(@RequestParam Long id,@RequestParam String id2) {
        return servicio.findByFcbaTitular(id,id2);
    } 

    @GetMapping("/{buscar}/{id}/{buscar2}/{id2}")
    public List<FFideicoCueban> validaFisoyCuenta(@PathVariable Long id,@PathVariable String id2) {
        return servicio.validaFisoyCuenta(id,id2);
    }     

    
}
