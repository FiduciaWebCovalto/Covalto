package com.fiduciawebmovil.fbitacora.services;


import com.fiduciawebmovil.fbitacora.entity.FBitacora;
import com.fiduciawebmovil.fbitacora.repo.FBitacoraRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FBitacoraServiceImpl implements FBitacoraService {
    @Autowired
    private FBitacoraRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FBitacora save(FBitacora id) {
        return repositorio.save(id);
    }

}









