package com.fiduciawebmovil.subcuenta.services;

import com.fiduciawebmovil.subcuenta.entity.FSubcuenta;

import java.util.List;

public interface FSubcuentaService {
        
    List<FSubcuenta> findByIdFsctIdFideicomiso(Long fsctIdFideicomiso);
    
}
