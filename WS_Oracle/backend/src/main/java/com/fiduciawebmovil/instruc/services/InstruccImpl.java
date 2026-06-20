package com.fiduciawebmovil.instruc.services;


import com.fiduciawebmovil.instruc.entity.Instrucc;
import com.fiduciawebmovil.instruc.repo.InstruccRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class InstruccImpl implements InstruccService {
    @Autowired
    private InstruccRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public Instrucc save(Instrucc id) {
        return repositorio.save(id);
    }

}









