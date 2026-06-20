package com.fiduciawebmovil.cueban.services;

import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.cueban.repo.FCuebanRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FCuebanServiceImpl implements FCuebanService {
    @Autowired
    private FCuebanRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FCueban> findAll() {
        return (List<FCueban>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<FCueban> findByFcbaClabeCba(String fcbaClabeCba){
        return (List<FCueban>) repositorio.findByFcbaClabeCba(fcbaClabeCba);
    }

}









