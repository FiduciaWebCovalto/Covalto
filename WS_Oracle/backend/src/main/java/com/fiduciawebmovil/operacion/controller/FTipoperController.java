package com.fiduciawebmovil.operacion.controller;

import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;
import com.fiduciawebmovil.operacion.entity.FTipoper;
import com.fiduciawebmovil.operacion.services.FTipoperService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/operacion")
public class FTipoperController {

    @Autowired
    private FTipoperService servicio;


    @GetMapping
    public List<FTipoper> list() {
        return servicio.findAll();
    }
 
}
