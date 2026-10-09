package com.fiduciawebmovil.afidben.services;

import com.fiduciawebmovil.afidben.entity.Afidben;
import com.fiduciawebmovil.afidben.repo.AfidbenRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Service
@Transactional
@Slf4j
public class AfidbenServiceImpl implements AfidbenService {
    @Autowired
    private AfidbenRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Afidben> findAll() {
        return (List<Afidben>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public boolean findPersona(Long id,String id2,BigDecimal id3) {
        return 
        repositorio.
        existsByIdAfbAnteproyectoAndIdAfbCvePersonaAndIdAfbNumFidben(id,id2,id3);
    }    

}









