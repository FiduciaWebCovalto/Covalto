package com.fiduciawebmovil.fideicom.services;

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
public class FideicomServiceImpl implements FideicomService {
    @Autowired
    private FideicomRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Fideicom> findAll() {
        return (List<Fideicom>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Fideicom> findByIdFidNumContrato(Long fidNumContrato){
        return (List<Fideicom>) repositorio.findByIdFidNumContrato(fidNumContrato);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Fideicom> findByIdFidNumContratoAndFidNomFideicom(Long fidNumContrato,String fidNomFideicom){
        return (List<Fideicom>) repositorio.findByIdFidNumContratoAndFidNomFideicom(fidNumContrato,fidNomFideicom);
    }

}









