package com.fiduciawebmovil.unidades.services;

import com.fiduciawebmovil.unidades.entity.FUnidades;
import com.fiduciawebmovil.unidades.repo.FUnidadesRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FUnidadesServiceImpl implements FUnidadesService {
    @Autowired
    private FUnidadesRepository repositorio; // Inyección del repositorio 


    @Override
    @Transactional(readOnly = true)
    public List<FUnidades> findByIdFuniIdFideicomiso(Long funiIdFideicomiso){
        return (List<FUnidades>) repositorio.findByIdFuniIdFideicomiso(funiIdFideicomiso);
    }

}









