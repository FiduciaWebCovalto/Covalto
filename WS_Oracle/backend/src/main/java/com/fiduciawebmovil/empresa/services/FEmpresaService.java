package com.fiduciawebmovil.empresa.services;

import com.fiduciawebmovil.empresa.entity.FEmpresa;

import java.util.List;

public interface FEmpresaService {
        

    List<FEmpresa> findByEmpNumEmpresa(Long empNumEmpresa);
    
}
