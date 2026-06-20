package com.fiduciawebmovil.personal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fiduciawebmovil.personal.entity.Personal;
import com.fiduciawebmovil.personal.services.PersonalService;


@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService servicio;

    @GetMapping
    public List<Personal> findAll(){
       return servicio.findAll(); 
    }

}
