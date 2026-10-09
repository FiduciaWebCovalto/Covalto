package com.fiduciawebmovil.fusuario.services;

import com.fiduciawebmovil.fusuario.entity.FUsuario;

import java.util.List;

public interface FUsuarioService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<FUsuario> findAll();
    List<FUsuario> findByFusuIdUsuario(String fusuIdUsuario);
    
}
