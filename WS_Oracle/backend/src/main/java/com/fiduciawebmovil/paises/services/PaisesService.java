package com.fiduciawebmovil.paises.services;

import com.fiduciawebmovil.paises.entity.Paises;

import java.util.List;

public interface PaisesService {
    List<Paises> findAll();    
    List<Paises> findByPaiNumPais(Long paiNumPais);
    List<Paises> findByPaiNomPais(String paiNomPais);

    
}
