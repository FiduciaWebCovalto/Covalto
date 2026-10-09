package com.fiduciawebmovil.cartera.services;

import com.fiduciawebmovil.cartera.entity.Cartera;
import com.fiduciawebmovil.cartera.repo.CarteraRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class CarteraServiceImpl implements CarteraService {
    @Autowired
    private CarteraRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Cartera> findAll() {
        return (List<Cartera>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cartera> findByIdCarNumContrato(Long fiso) {
        return (List<Cartera>) repositorio.findByIdCarNumContrato(fiso);
    }

}









