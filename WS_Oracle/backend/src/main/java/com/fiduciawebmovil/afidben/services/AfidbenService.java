package com.fiduciawebmovil.afidben.services;

import com.fiduciawebmovil.afidben.entity.Afidben;

import java.math.BigDecimal;
import java.util.List;


public interface AfidbenService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Afidben> findAll();
    boolean findPersona(Long id,String id2,BigDecimal id3);
   
}
