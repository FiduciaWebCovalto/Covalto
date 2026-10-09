package com.fiduciawebmovil.parametro.services;

import com.fiduciawebmovil.parametro.entity.ParamGlobal;
import com.fiduciawebmovil.parametro.repo.ParamGlobalRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
@Slf4j
public class ParamGlobalServiceImpl implements ParamGlobalService {

    @Autowired
    private ParamGlobalRepository repositorio; // Inyección del repositorio


    @Override
    @Transactional(readOnly = true)
    public List<ParamGlobal> findByParamClave(Long paramClave){
        return (List<ParamGlobal>) repositorio.findByParamClave(paramClave);
    } 

    @Override
    @Transactional(readOnly = true)
    public List<ParamGlobal> findByParamDescripcion(String paramDescripcion){
        return (List<ParamGlobal>) repositorio.findByParamDescripcion(paramDescripcion);
    }     


}









