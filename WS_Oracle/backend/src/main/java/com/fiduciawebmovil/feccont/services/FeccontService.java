package com.fiduciawebmovil.feccont.services;

import com.fiduciawebmovil.feccont.dtos.FeccontDTO;

import java.util.List;
import java.util.Optional;

public interface FeccontService {
        
    List<FeccontDTO> findAll();

    Optional<FeccontDTO> findById(String id);
    
}
