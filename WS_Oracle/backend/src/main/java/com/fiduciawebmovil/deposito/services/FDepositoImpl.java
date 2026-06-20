package com.fiduciawebmovil.deposito.services;

import com.fiduciawebmovil.deposito.entity.FDeposito;
import com.fiduciawebmovil.deposito.repo.FDepositoRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FDepositoImpl implements FDepositoService {
    @Autowired
    private FDepositoRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FDeposito save(FDeposito id) {
        return repositorio.save(id);
    }

}









