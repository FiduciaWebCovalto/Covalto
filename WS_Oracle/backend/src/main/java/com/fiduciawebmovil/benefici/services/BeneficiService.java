package com.fiduciawebmovil.benefici.services;

import com.fiduciawebmovil.benefici.entity.Benefici;

import java.util.List;

public interface BeneficiService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Benefici> findAll();
    //List<Benefici> findByBenNumContrato(Long benNumContrato);
    List<Benefici> findByIdBenNumContrato(Long benNumContrato);
    List<Benefici> findByIdBenNumContratoAndBenNomBenef(Long benNumContrato,String benNomBenef);
}
