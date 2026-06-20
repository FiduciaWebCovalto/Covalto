package com.fiduciawebmovil.cuentasinversion.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;
import com.fiduciawebmovil.cuentasinversion.services.FCuentasInversionService;
import com.fiduciawebmovil.fisocuenta.entity.FFideicoCueban;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cuentasinversion")
public class FCuentasInversionController {

    @Autowired
    private FCuentasInversionService servicio;


    @GetMapping
    public List<FCuentasInversion> list() {
        return servicio.findAll();
    }
    /*@GetMapping("/{buscarcuenta}")
    public List<FCuentasInversion> findByFciNumCta(@RequestParam String id) {
        return servicio.findByFciNumCta(id);
    } */
    @GetMapping("/{buscarfiso}")
    public List<FCuentasInversion> findByFciNumFideicomiso(@RequestParam Long id,
        @RequestParam String id2
    ) {
        return servicio.findByFciNumFideicomiso(id,id2);
    }   
    
    @GetMapping("/{buscar}/{id}/{buscar2}/{id2}")
    public List<FCuentasInversion> BuscaFisoCuenta(@PathVariable Long id,@PathVariable Long id2) {
        return servicio.BuscaFisoCuenta(id,id2);
    }  

    @GetMapping("/{consultatitular}/{id}")
    public List<FCuentasInversion> BuscaCuentaTitular(@RequestParam("id") Long id,
    @RequestParam("id2") String id2){
        return servicio.BuscaCuentaTitular(id,id2);
    }  
}
