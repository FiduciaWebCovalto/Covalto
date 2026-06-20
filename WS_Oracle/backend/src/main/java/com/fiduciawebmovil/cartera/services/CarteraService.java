package com.fiduciawebmovil.cartera.services;

import com.fiduciawebmovil.cartera.entity.Cartera;

import java.util.List;

public interface CarteraService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Cartera> findAll();
    List<Cartera> findByIdCarNumContrato(Long fiso);
}

