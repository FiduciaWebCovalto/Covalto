package com.fiduciawebmovil.cuentasinversion.services;

import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;
import com.fiduciawebmovil.cuentasinversion.repo.FCuentasInversionRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FCuentasInversionServiceImpl implements FCuentasInversionService {
    @Autowired
    private FCuentasInversionRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FCuentasInversion> findAll() {
        return (List<FCuentasInversion>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<FCuentasInversion> findByFciNumCta(String fciNumCta){
        return (List<FCuentasInversion>) repositorio.findByFciNumCta(fciNumCta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FCuentasInversion> findByFciNumFideicomiso(Long fciNumFideicomiso,String fciTipoCta){
        return (List<FCuentasInversion>) repositorio.findByFciNumFideicomiso(fciNumFideicomiso,fciTipoCta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FCuentasInversion> BuscaFisoCuenta(Long fiso,Long cuenta){
        return (List<FCuentasInversion>) repositorio.findByFciNumFideicomisoAndFciNumCta(fiso,cuenta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FCuentasInversion> BuscaCuentaTitular(Long fiso,String titular){
        return (List<FCuentasInversion>) 
        repositorio.findByFciNumFideicomisoAndFciTitDeCta(fiso,titular);
    }

}









