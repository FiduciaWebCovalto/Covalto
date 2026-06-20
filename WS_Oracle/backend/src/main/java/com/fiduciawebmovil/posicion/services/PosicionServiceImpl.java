package com.fiduciawebmovil.posicion.services;


import com.fiduciawebmovil.posicion.entity.Posicion;
import com.fiduciawebmovil.posicion.repo.PosicionRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class PosicionServiceImpl implements PosicionService {
    @Autowired
    private PosicionRepository repositorio; // Inyección del repositorio 


    @Override
    @Transactional(readOnly = true)
    public List<Posicion> findByIdPosNumContrato(Long posNumContrato){
        return (List<Posicion>) repositorio.findByIdPosNumContrato(posNumContrato);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Posicion> findPosicion(Long id,Long id2){
        return (List<Posicion>) repositorio.
        findByIdPosNumContratoAndIdPosContratoInter(id,id2);
    }    
}









