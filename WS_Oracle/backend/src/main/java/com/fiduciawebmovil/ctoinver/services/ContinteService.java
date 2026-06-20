package com.fiduciawebmovil.ctoinver.services;

import com.fiduciawebmovil.ctoinver.entity.Continte;

import java.util.List;

public interface ContinteService {
        
   List<Continte> findByIdCprNumContrato(Long cprNumContrato);
   List<Continte> findFisoInversion(Long id,Long id2);
    
}
