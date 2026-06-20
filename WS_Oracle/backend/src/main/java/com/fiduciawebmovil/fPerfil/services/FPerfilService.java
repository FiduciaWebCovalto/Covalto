package com.fiduciawebmovil.fPerfil.services;

import com.fiduciawebmovil.fPerfil.dtos.FPerfilDTO;

import java.util.List;
import java.util.Optional;

public interface FPerfilService {
        
    List<FPerfilDTO> findAll();

    Optional<FPerfilDTO> findById(Long id);
    
}
