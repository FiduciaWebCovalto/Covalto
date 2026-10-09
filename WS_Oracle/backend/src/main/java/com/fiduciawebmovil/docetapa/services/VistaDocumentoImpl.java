package com.fiduciawebmovil.docetapa.services;


import com.fiduciawebmovil.docetapa.entity.VistaDocumento;
import com.fiduciawebmovil.docetapa.repo.VistaDocumentoRepository;


import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class VistaDocumentoImpl implements VistaDocumentoService {
    @Autowired
    private VistaDocumentoRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public  List<VistaDocumento> buscar(String id) {
        return repositorio.findByOperacion(id);
    }

}









