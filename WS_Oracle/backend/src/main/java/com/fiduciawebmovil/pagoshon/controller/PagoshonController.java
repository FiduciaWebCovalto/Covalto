package com.fiduciawebmovil.pagoshon.controller;

import lombok.RequiredArgsConstructor;
import com.fiduciawebmovil.pagoshon.entity.Pagoshon;
import com.fiduciawebmovil.pagoshon.services.PagoshonService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pagoshon")
public class PagoshonController {

    @Autowired
    private PagoshonService servicio;


    @GetMapping
    public List<Pagoshon> list() {
        return servicio.findAll();
    }
}
