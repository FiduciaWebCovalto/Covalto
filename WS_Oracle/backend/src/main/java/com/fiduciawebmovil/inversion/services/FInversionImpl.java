package com.fiduciawebmovil.inversion.services;


import com.fiduciawebmovil.inversion.entity.FInversion;
import com.fiduciawebmovil.inversion.repo.FInversionRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FInversionImpl implements FInversionService {
    @Autowired
    private FInversionRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FInversion save(FInversion id) {
        return repositorio.save(id);
    }

}









