package com.fiduciawebmovil.parametro.controller;

import com.fiduciawebmovil.parametro.entity.ParamGlobal;
import com.fiduciawebmovil.parametro.services.ParamGlobalService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/parametro")
public class ParamGlobalController {

    @Autowired
    private ParamGlobalService servicio;

     @GetMapping("/id/{id}")
    public List<ParamGlobal> findByParamClave(@PathVariable("id") Long id) {
        return servicio.findByParamClave(id);
    } 

     @GetMapping("/nombre/{id}")
    public List<ParamGlobal> findByParamDescripcion(@PathVariable("id") String id) {
        return servicio.findByParamDescripcion(id);
    } 


}
