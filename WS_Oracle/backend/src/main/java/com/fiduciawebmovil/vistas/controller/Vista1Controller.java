package com.fiduciawebmovil.vistas.controller;

import com.fiduciawebmovil.vistas.entity.Vista1;
import com.fiduciawebmovil.vistas.entity.Vista2;
import com.fiduciawebmovil.vistas.entity.Vista3;
import com.fiduciawebmovil.vistas.entity.Vista4;
import com.fiduciawebmovil.vistas.entity.Vista5;
import com.fiduciawebmovil.vistas.entity.Vista6;
import com.fiduciawebmovil.vistas.entity.VistaCom;
import com.fiduciawebmovil.vistas.entity.VistaMov;
import com.fiduciawebmovil.vistas.services.Vista1Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vistas")
public class Vista1Controller {

    @Autowired
    private Vista1Service servicio;


    @GetMapping(value = "/vista1", params = "id")
    public List<Vista1> buscar(@RequestParam Long id) {
    return servicio.buscar(id);
    } 
    
    @GetMapping(value = "/vista2", params = "id2")
    public List<Vista2> buscar2(@RequestParam Long id2) {
    return servicio.buscar2(id2);
    } 

        @GetMapping(value = "/vista3", params = "id3")
    public List<Vista3> buscar3(@RequestParam Long id3) {
    return servicio.buscar3(id3);
    } 
        @GetMapping(value = "/vista4", params = "id4")
    public List<Vista4> buscar4(@RequestParam Long id4) {
    return servicio.buscar4(id4);
    } 
        @GetMapping(value = "/vista5", params = "id5")
    public List<Vista5> buscar5(@RequestParam Long id5) {
    return servicio.buscar5(id5);
    } 
        @GetMapping(value = "/vista6", params = "id6")
    public List<Vista6> buscar6(@RequestParam Long id6) {
    return servicio.buscar6(id6);
    } 
        @GetMapping(value = "/vista7", params = "id7")
    public List<VistaMov> buscar7(@RequestParam Long id7) {
    return servicio.buscar7(id7);
    } 
        @GetMapping(value = "/vista8", params = "id8")
    public List<VistaCom> buscar8(@RequestParam Long id8) {
    return servicio.buscar8(id8);
    } 

}
