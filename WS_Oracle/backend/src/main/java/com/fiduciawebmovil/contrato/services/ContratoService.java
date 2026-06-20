package com.fiduciawebmovil.contrato.services;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.contrato.dtos.ContratoDTO;
import com.fiduciawebmovil.contrato.entity.Contrato;

import java.util.List;
import java.util.Optional;

public interface ContratoService {
    List<Contrato> findAll();
    List<Contrato> findByCtoNumContrato(Long ctoNumContrato);        
    //List<Contrato> findByFSubcuentaFsctIdFideicomiso(Long ctoNumContrato);
}
