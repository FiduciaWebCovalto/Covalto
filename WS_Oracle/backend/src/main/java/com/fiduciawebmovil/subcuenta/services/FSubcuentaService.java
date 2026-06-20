package com.fiduciawebmovil.subcuenta.services;

import com.fiduciawebmovil.plazas.entity.FPlazasBanco;
import com.fiduciawebmovil.subcuenta.entity.FSubcuenta;
import com.fiduciawebmovil.terceros.entity.Terceros;

import java.util.List;

public interface FSubcuentaService {
        
    List<FSubcuenta> findByIdFsctIdFideicomiso(Long fsctIdFideicomiso);
    
}
