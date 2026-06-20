package com.fiduciawebmovil.tipocamb.controller;

import lombok.RequiredArgsConstructor;
import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.services.FideicomService;
import com.fiduciawebmovil.tipocamb.entity.Tipocamb;
import com.fiduciawebmovil.tipocamb.services.TipocambService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tipocamb")
public class TipocambController {

    @Autowired
    private TipocambService servicio;


    @GetMapping("/{buscar}")
    public List<Tipocamb> findByIdFidNumContratoAndFidNomFideicom
    (@RequestParam("id") Long id,@RequestParam("id2") Long id2,
    @RequestParam("id3") Long id3,@RequestParam("id4") Long id4) {
        return servicio.findByIdTicNumPaisAndTicAnoAltaRegAndTicMesAltaRegAndTicDiaAltaReg
        (id,id2,id3,id4);
    } 
}
