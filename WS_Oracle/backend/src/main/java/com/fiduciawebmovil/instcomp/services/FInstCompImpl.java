package com.fiduciawebmovil.instcomp.services;

import com.fiduciawebmovil.instcomp.entity.FInstComp;
import com.fiduciawebmovil.instcomp.repo.FInstCompRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FInstCompImpl implements FInstCompService {
    @Autowired
    private FInstCompRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FInstComp save(FInstComp id) {
        return repositorio.save(id);
    }

}









