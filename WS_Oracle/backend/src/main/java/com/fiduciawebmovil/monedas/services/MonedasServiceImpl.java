package com.fiduciawebmovil.monedas.services;

import com.fiduciawebmovil.folios.entity.Folios;
import com.fiduciawebmovil.folios.repo.FoliosRepository;
import com.fiduciawebmovil.fusuario.entity.FUsuario;
import com.fiduciawebmovil.monedas.entity.Monedas;
import com.fiduciawebmovil.monedas.repo.MonedasRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
@Slf4j
public class MonedasServiceImpl implements MonedasService {

    @Autowired
    private MonedasRepository repositorio; // Inyección del repositorio

    @Override
    @Transactional(readOnly = true)
    public List<Monedas> findAll() {
        return (List<Monedas>) repositorio.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public List<Monedas> monNumPais(Long monNumPais){
        return (List<Monedas>) repositorio.monNumPais(monNumPais);
    } 
    @Override
    @Transactional(readOnly = true)
    public List<Monedas> findByMonNomMoneda(String monNomMoneda){
        return (List<Monedas>) repositorio.monNomMoneda(monNomMoneda);
    } 

}









