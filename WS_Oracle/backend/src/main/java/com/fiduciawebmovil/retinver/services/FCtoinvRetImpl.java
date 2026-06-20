package com.fiduciawebmovil.retinver.services;

import com.fiduciawebmovil.retinver.entity.FCtoinvRet;
import com.fiduciawebmovil.retinver.repo.FCtoinvRetRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FCtoinvRetImpl implements FCtoinvRetService {
    @Autowired
    private FCtoinvRetRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FCtoinvRet save(FCtoinvRet id) {
        return repositorio.save(id);
    }

}









