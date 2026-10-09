package com.fiduciawebmovil.terceros.services;

import com.fiduciawebmovil.terceros.entity.Terceros;
import com.fiduciawebmovil.terceros.entity.TercerosId;
import com.fiduciawebmovil.terceros.repo.TercerosRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class TercerosServiceImpl implements TercerosService {
    @Autowired
    private TercerosRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Terceros> findAll() {
        return (List<Terceros>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<Terceros> findById(Long terNumContrato){
        TercerosId id = new TercerosId(terNumContrato);
        return repositorio.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
        //return (List<Terceros>) repositorio.findByTerNumContrato(terNumContrato);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Terceros> findByIdTerNumContrato(Long terNumContrato){
        return (List<Terceros>) repositorio.findByIdTerNumContrato(terNumContrato);
    }    

        @Override
    @Transactional(readOnly = true)
    public List<Terceros> findByIdTerNumContratoAndTerNomTercero(Long terNumContrato,String terNomTercero){
        return (List<Terceros>) repositorio.findByIdTerNumContratoAndTerNomTercero( terNumContrato, terNomTercero);
    }    


}









