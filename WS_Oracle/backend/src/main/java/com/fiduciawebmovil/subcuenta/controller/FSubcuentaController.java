package com.fiduciawebmovil.subcuenta.controller;

import lombok.RequiredArgsConstructor;
import com.fiduciawebmovil.subcuenta.entity.FSubcuenta;
import com.fiduciawebmovil.subcuenta.services.FSubcuentaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/subfiso")
public class FSubcuentaController {

    @Autowired
    private FSubcuentaService servicio;

    @GetMapping("/{buscar}")
    public List<FSubcuenta> findByIdFsctIdFideicomiso(@RequestParam Long id) {
        return servicio.findByIdFsctIdFideicomiso(id);
    } 
}
