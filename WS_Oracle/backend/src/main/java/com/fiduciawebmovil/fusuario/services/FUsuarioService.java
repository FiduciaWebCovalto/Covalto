package com.fiduciawebmovil.fusuario.services;

import com.fiduciawebmovil.fusuario.dtos.FUsuarioDTO;
import com.fiduciawebmovil.fusuario.entity.FUsuario;
import com.fiduciawebmovil.res.Response;

import java.util.List;
import java.util.Optional;

public interface FUsuarioService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<FUsuario> findAll();
    List<FUsuario> findByFusuIdUsuario(String fusuIdUsuario);
    
}
