package com.fiduciawebmovil.empresa.services;

import com.fiduciawebmovil.feccont.dtos.*;
import com.fiduciawebmovil.feccont.entity.*;
import com.fiduciawebmovil.feccont.repo.*;
import com.fiduciawebmovil.empresa.entity.FEmpresa;
import com.fiduciawebmovil.empresa.repo.FEmpresaRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@Slf4j
public class FEmpresaServiceImpl implements FEmpresaService {

    @Autowired
    private FEmpresaRepository repositorio; // Inyección del repositorio


    @Override
    @Transactional(readOnly = true)
    public List<FEmpresa> findByEmpNumEmpresa(Long empNumEmpresa){
        return (List<FEmpresa>) repositorio.findByEmpNumEmpresa(empNumEmpresa);
    } 


}









