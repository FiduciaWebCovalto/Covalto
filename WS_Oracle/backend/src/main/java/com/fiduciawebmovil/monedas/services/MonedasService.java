package com.fiduciawebmovil.monedas.services;

import com.fiduciawebmovil.fusuario.entity.FUsuario;
import com.fiduciawebmovil.monedas.entity.Monedas;

import java.util.List;

public interface MonedasService {
    List<Monedas> findAll();    
    List<Monedas> monNumPais(Long monNumPais);
    List<Monedas> findByMonNomMoneda(String monNomMoneda);

    
}
