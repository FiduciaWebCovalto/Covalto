package com.fiduciawebmovil.personal.services;


import com.fiduciawebmovil.personal.entity.Personal;
import com.fiduciawebmovil.personal.repo.PersonalRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@Slf4j
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository repositorio; // Inyección del repositorio

    @Override
    @Transactional(readOnly = true)
    public List<Personal> findAll() {
        return (List<Personal>) repositorio.findAll();
    }

}









