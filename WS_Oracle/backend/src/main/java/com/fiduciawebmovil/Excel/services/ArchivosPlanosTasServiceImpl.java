package com.fiduciawebmovil.Excel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiduciawebmovil.Excel.entity.ArchivosPlanosTas;
import com.fiduciawebmovil.Excel.repo.ArchivosPlanosTasRepository;


import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ArchivosPlanosTasServiceImpl implements ArchivosPlanosTasService{
    @Autowired
    private ArchivosPlanosTasRepository repositorio; // Inyección del repositorio 

    @Override
    public List<ArchivosPlanosTas> findAll() {
        return (List<ArchivosPlanosTas>) repositorio.findAll();
    }    
}
