package com.fiduciawebmovil.retiro.services;


import com.fiduciawebmovil.retiro.entity.FRetiro;
import com.fiduciawebmovil.retiro.repo.FRetiroRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FRetiroImpl implements FRetiroService {
    @Autowired
    private FRetiroRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FRetiro save(FRetiro id) {
        return repositorio.save(id);
    }

}









