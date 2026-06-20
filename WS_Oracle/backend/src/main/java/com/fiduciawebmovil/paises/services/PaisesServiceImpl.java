package com.fiduciawebmovil.paises.services;

import com.fiduciawebmovil.paises.entity.Paises;
import com.fiduciawebmovil.paises.repo.PaisesRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
@Slf4j
public class PaisesServiceImpl implements PaisesService {

    @Autowired
    private PaisesRepository repositorio; // Inyección del repositorio

    @Override
    @Transactional(readOnly = true)
    public List<Paises> findAll() {
        return (List<Paises>) repositorio.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public List<Paises> findByPaiNumPais(Long monNumPais){
        return (List<Paises>) repositorio.findByPaiNumPais(monNumPais);
    } 
    @Override
    @Transactional(readOnly = true)
    public List<Paises> findByPaiNomPais(String monNomMoneda){
        return (List<Paises>) repositorio.findByPaiNomPais(monNomMoneda);
    } 

}









