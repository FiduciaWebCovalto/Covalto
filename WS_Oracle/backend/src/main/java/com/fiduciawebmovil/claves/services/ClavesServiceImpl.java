package com.fiduciawebmovil.claves.services;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.claves.repo.ClavesRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class ClavesServiceImpl implements ClavesService {
    @Autowired
    private ClavesRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Claves> findAll() {
        return (List<Claves>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Claves> findByIdCveNumClave(Long cveNumClave){
        return (List<Claves>) repositorio.findByIdCveNumClave(cveNumClave);
    }

        @Override
    @Transactional(readOnly = true)
    public List<Claves> findByIdCveNumClaveAndCveDescClave(Long cveNumClave,String cveDescClave){
        return (List<Claves>) repositorio.findByIdCveNumClaveAndCveDescClave(cveNumClave,cveDescClave);
    }

            @Override
    @Transactional(readOnly = true)
    public List<Claves> findDescripcionClave(Long id,Long id2){
        return (List<Claves>) repositorio.findByIdCveNumClaveAndIdCveNumSecClave(id,id2);
    }

}









