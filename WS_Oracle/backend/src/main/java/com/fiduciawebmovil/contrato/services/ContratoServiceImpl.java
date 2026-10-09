package com.fiduciawebmovil.contrato.services;

import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.contrato.repo.ContratoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@Slf4j
public class ContratoServiceImpl implements ContratoService {

    @Autowired
    private ContratoRepository repositorio; // Inyección del repositorio


        @Override
    @Transactional(readOnly = true)
    public List<Contrato> findAll() {
        return (List<Contrato>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Contrato> findByCtoNumContrato(Long ctoNumContrato){
        return (List<Contrato>) repositorio.findByCtoNumContrato(ctoNumContrato);
    }

    /*@Override
    @Transactional(readOnly = true)
    public List<Contrato> findByFSubcuentaFsctIdFideicomiso(Long ctoNumContrato){
        return (List<Contrato>) repositorio.findByFsubcuentaFsctIdFideicomiso(ctoNumContrato);
    }*/
}









