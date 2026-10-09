package com.fiduciawebmovil.password.controller;

import com.fiduciawebmovil.feccont.entity.*;
import com.fiduciawebmovil.feccont.services.*;
import com.fiduciawebmovil.password.entity.FPpassword;
import com.fiduciawebmovil.password.services.FPpasswordService;
import com.fiduciawebmovil.feccont.dtos.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/password")
public class FPpasswordController {

    @Autowired
    private FPpasswordService servicio;


    @GetMapping
    public List<FPpassword> list() {
        return servicio.findAll();
    }

}
