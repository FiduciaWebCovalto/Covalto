package com.fiduciawebmovil.fbitacorasol.services;


import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSol;
import com.fiduciawebmovil.fbitacorasol.repo.FBitacoraSolRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FBitacoraServiceSolImpl implements FBitacoraSolService {
    @Autowired
    private FBitacoraSolRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FBitacoraSol save(FBitacoraSol id) {
        return repositorio.save(id);
    }

}









