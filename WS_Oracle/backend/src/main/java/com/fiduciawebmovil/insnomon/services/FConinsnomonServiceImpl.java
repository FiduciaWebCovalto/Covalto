package com.fiduciawebmovil.insnomon.services;

import com.fiduciawebmovil.insnomon.entity.FConinsnomon;
import com.fiduciawebmovil.insnomon.repo.FConinsnomonRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FConinsnomonServiceImpl implements FConinsnomonService {
    @Autowired
    private FConinsnomonRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FConinsnomon> findAll() {
        return (List<FConinsnomon>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<FConinsnomon> findByIdFtopNumOper(String ftopNumOper){
        return (List<FConinsnomon>) repositorio.findByIdFtopNumOper(ftopNumOper);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FConinsnomon> findNumOperSinPadre(String ftopNumOper){
        return (List<FConinsnomon>) repositorio.findNumOperSinPadre(ftopNumOper);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FConinsnomon> findByConpNombreAndIdFtopNumOper(String conpNombre,String ftopNumOper){
        return (List<FConinsnomon>) repositorio.findByConpNombreAndIdFtopNumOper(conpNombre,ftopNumOper);
    }

}









