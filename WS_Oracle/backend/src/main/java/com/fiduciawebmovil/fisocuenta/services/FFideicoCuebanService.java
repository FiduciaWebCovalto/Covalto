package com.fiduciawebmovil.fisocuenta.services;

import com.fiduciawebmovil.fisocuenta.entity.FFideicoCueban;

import java.util.List;

public interface FFideicoCuebanService {
        
    List<FFideicoCueban> findByIdFfidIdFideicomiso(Long ffidIdFideicomiso);
    List<FFideicoCueban> findByFcbaTitular(Long id,String fcbaTitular);
    List<FFideicoCueban> validaFisoyCuenta(Long id,String id2);
}
