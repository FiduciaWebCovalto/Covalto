package com.fiduciawebmovil.fideicom.services;

import com.fiduciawebmovil.fideicom.entity.Fideicom;

import java.util.List;

public interface FideicomService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Fideicom> findAll();
    List<Fideicom> findByIdFidNumContrato(Long fidNumContrato);
    List<Fideicom> findByIdFidNumContratoAndFidNomFideicom(Long fidNumContrato,String fidNomFideicom);
    
}
