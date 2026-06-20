package com.fiduciawebmovil.posicion.services;

import com.fiduciawebmovil.posicion.entity.Posicion;

import java.util.List;

public interface PosicionService {
        
    List<Posicion> findByIdPosNumContrato(Long posNumContrato);
    List<Posicion> findPosicion(Long id,Long id2);
    
}
