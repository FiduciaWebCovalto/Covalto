package com.fiduciawebmovil.contrato.services;

import com.fiduciawebmovil.contrato.entity.Contrato;

import java.util.List;

public interface ContratoService {
    List<Contrato> findAll();
    List<Contrato> findByCtoNumContrato(Long ctoNumContrato);        
    //List<Contrato> findByFSubcuentaFsctIdFideicomiso(Long ctoNumContrato);
}
