package com.fiduciawebmovil.ctoinver.services;

import com.fiduciawebmovil.ctoinver.entity.Continte;
import com.fiduciawebmovil.ctoinver.repo.ContinteRepository;
import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.repo.FideicomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class ContinteServiceImpl implements ContinteService {
    @Autowired
    private ContinteRepository repositorio; // Inyección del repositorio 


    @Override
    @Transactional(readOnly = true)
    public List<Continte> findByIdCprNumContrato(Long fidNumContrato){
        return (List<Continte>) repositorio.findByIdCprNumContrato(fidNumContrato);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Continte> findFisoInversion(Long id,Long id2){
        return (List<Continte>) repositorio.
        findByIdCprNumContratoAndIdCprContratoInter(id,id2);
    }

}









