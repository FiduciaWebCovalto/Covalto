package com.fiduciawebmovil.indices.services;

import com.fiduciawebmovil.indices.entity.FIndices;
import com.fiduciawebmovil.indices.repo.FIndicesRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FIndicesServiceImpl implements FIndicesService {
    @Autowired
    private FIndicesRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FIndices> findAll() {
        return (List<FIndices>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<FIndices> findByIdEindIdIndice(Long eindIdIndice){
        return (List<FIndices>) repositorio.findByIdEindIdIndice(eindIdIndice);
    }


    @Override
    @Transactional(readOnly = true)
    public List<FIndices> findByEindDescripcion(String eindDescripcion){
        return (List<FIndices>) repositorio.findByEindDescripcion(eindDescripcion);
    }

}









