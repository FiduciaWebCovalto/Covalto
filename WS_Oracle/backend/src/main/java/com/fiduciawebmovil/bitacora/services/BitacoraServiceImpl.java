package com.fiduciawebmovil.bitacora.services;

import com.fiduciawebmovil.bitacora.entity.Bitacora;
import com.fiduciawebmovil.bitacora.repo.BitacoraRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class BitacoraServiceImpl implements BitacoraService {
    @Autowired
    private BitacoraRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public Bitacora save(Bitacora id) {
        return repositorio.save(id);
    }

}









