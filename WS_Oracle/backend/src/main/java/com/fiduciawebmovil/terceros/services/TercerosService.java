package com.fiduciawebmovil.terceros.services;

import com.fiduciawebmovil.terceros.entity.Terceros;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface TercerosService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Terceros> findAll();
    //List<Terceros> findByTerNumContrato(Long terNumContrato);
    public ResponseEntity<Terceros> findById(Long terNumContrato);
    List<Terceros> findByIdTerNumContrato(Long terNumContrato);
    List<Terceros> findByIdTerNumContratoAndTerNomTercero(Long terNumContrato,String terNomTercero);
}
