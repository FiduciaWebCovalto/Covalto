package com.fiduciawebmovil.deposito.controller;
import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.deposito.entity.FDeposito;
import com.fiduciawebmovil.deposito.services.FDepositoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/deposito")
public class FDepositoController {

    @Autowired
    private FDepositoService servicio;


    @PostMapping
    public FDeposito insertar(@RequestBody FDeposito id) {
        return servicio.save(id);
    }
    
}
