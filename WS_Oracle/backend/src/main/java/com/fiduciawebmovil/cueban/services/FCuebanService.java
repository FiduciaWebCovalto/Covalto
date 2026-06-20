package com.fiduciawebmovil.cueban.services;

import com.fiduciawebmovil.cueban.entity.FCueban;

import java.util.List;

public interface FCuebanService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<FCueban> findAll();
    List<FCueban> findByFcbaClabeCba(String fcbaClabeCba);
    
}
