package com.fiduciawebmovil.plazas.services;

import com.fiduciawebmovil.plazas.entity.FPlazasBanco;
import com.fiduciawebmovil.plazas.repo.FPlazasBancoRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FPlazasBancoServiceImpl implements FPlazasBancoService {
    @Autowired
    private FPlazasBancoRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FPlazasBanco> findAll() {
        return (List<FPlazasBanco>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<FPlazasBanco> findByFplbIdBanco(Long fplbIdBanco,Long fplbIdPlaza){
        return (List<FPlazasBanco>) 
        repositorio.findByIdFplbIdBancoAndIdFplbIdPlaza(fplbIdBanco,fplbIdPlaza);
    }

}









