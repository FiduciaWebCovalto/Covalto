package com.fiduciawebmovil.insnovalor.services;



import com.fiduciawebmovil.insnovalor.entity.FConinsnomonValor;
import com.fiduciawebmovil.insnovalor.repo.FConinsnomonValorRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FConinsnomonValorImpl implements FConinsnomonValorService {
    @Autowired
    private FConinsnomonValorRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FConinsnomonValor save(FConinsnomonValor id) {
        return repositorio.save(id);
    }

}









