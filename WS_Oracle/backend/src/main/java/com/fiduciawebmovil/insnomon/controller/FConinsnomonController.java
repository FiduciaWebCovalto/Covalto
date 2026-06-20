package com.fiduciawebmovil.insnomon.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.insnomon.entity.FConinsnomon;
import com.fiduciawebmovil.insnomon.services.FConinsnomonService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/insno")
public class FConinsnomonController {

    @Autowired
    private FConinsnomonService servicio;


    @GetMapping
    public List<FConinsnomon> list() {
        return servicio.findAll();
    }
    @GetMapping("/id/{id}")
    public List<FConinsnomon> findByIdFtopNumOper(@PathVariable("id") String id) {
        return servicio.findByIdFtopNumOper(id);
    } 
    @GetMapping("/{buscar}/{id}")
    public List<FConinsnomon> findNumOperSinPadre(@RequestParam("id") String id) {
        return servicio.findNumOperSinPadre(id);
    } 
    @GetMapping("/{buscarnombre}")
    public List<FConinsnomon> findByConpNombreAndIdFtopNumOper(@RequestParam("id") String id,@RequestParam("id2") String id2) {
        return servicio.findByConpNombreAndIdFtopNumOper(id,id2);
    } 
    
}
