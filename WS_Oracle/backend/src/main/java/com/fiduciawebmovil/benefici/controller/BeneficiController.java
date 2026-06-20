package com.fiduciawebmovil.benefici.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.benefici.entity.Benefici;
import com.fiduciawebmovil.benefici.services.BeneficiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/beneficiario")
public class BeneficiController {

    @Autowired
    private BeneficiService servicio;


    @GetMapping
    public List<Benefici> list() {
        return servicio.findAll();
    }
    @GetMapping("/{buscar}")
    public List<Benefici> findByIdBenNumContrato(@RequestParam Long id) {
        return servicio.findByIdBenNumContrato(id);
    } 

    @GetMapping("/buscarnombre")
    public List<Benefici> findByIdBenNumContratoAndBenNomBenef(@RequestParam("id") Long id,@RequestParam("id2") String id2) {
        return servicio.findByIdBenNumContratoAndBenNomBenef(id,id2);
    } 

}
