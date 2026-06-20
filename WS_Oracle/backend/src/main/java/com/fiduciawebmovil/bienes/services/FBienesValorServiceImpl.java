package com.fiduciawebmovil.bienes.services;

import com.fiduciawebmovil.bienes.entity.FBienesValor;
import com.fiduciawebmovil.bienes.repo.FBienesValorRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FBienesValorServiceImpl implements FBienesValorService {
    @Autowired
    private FBienesValorRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FBienesValor save(FBienesValor id) {
        return repositorio.save(id);
    }

}









