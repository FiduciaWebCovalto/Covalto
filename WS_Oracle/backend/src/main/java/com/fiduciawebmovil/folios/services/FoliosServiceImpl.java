package com.fiduciawebmovil.folios.services;

import com.fiduciawebmovil.folios.entity.Folios;
import com.fiduciawebmovil.folios.repo.FoliosRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
@Slf4j
public class FoliosServiceImpl implements FoliosService {

    @Autowired
    private FoliosRepository repositorio; // Inyección del repositorio


    @Override
    @Transactional(readOnly = true)
    public List<Folios> findByFolTipoFolio(Long folTipoFolio){
        return (List<Folios>) repositorio.findByFolTipoFolio(folTipoFolio);
    } 

    public Long getNextId() {
        return repositorio.obtenerSiguienteValor();
    }

}









