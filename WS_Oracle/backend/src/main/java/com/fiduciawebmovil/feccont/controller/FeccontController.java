package com.fiduciawebmovil.feccont.controller;

import com.fiduciawebmovil.feccont.entity.*;
import com.fiduciawebmovil.feccont.services.*;
import com.fiduciawebmovil.contrato.dtos.ContratoDTO;
import com.fiduciawebmovil.feccont.dtos.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/feccont")
public class FeccontController {

    @Autowired
    private FeccontService feccontService;


    @GetMapping
    public List<FeccontDTO> list() {
        return feccontService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable String id) {
        Optional<FeccontDTO> feccont = feccontService.findById(id);

        if (feccont.isPresent()) {
            return ResponseEntity.ok(feccont.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
}
