package com.fiduciawebmovil.benefici.services;

import com.fiduciawebmovil.benefici.entity.Benefici;
import com.fiduciawebmovil.benefici.repo.BeneficiRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class BeneficiServiceImpl implements BeneficiService {
    @Autowired
    private BeneficiRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Benefici> findAll() {
        return (List<Benefici>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Benefici> findByIdBenNumContrato(Long benNumContrato){
        return (List<Benefici>) repositorio.findByIdBenNumContrato(benNumContrato);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Benefici> findByIdBenNumContratoAndBenNomBenef(Long benNumContrato,String benNomBenef){
        return (List<Benefici>) repositorio.findByIdBenNumContratoAndBenNomBenef(benNumContrato,benNomBenef);
    }
}









