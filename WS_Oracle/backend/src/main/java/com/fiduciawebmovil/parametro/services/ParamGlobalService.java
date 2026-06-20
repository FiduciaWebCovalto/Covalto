package com.fiduciawebmovil.parametro.services;

import com.fiduciawebmovil.parametro.entity.ParamGlobal;

import java.util.List;

public interface ParamGlobalService {
        
    List<ParamGlobal> findByParamClave(Long paramClave);
    List<ParamGlobal> findByParamDescripcion(String paramDescripcion);
    
    
}
