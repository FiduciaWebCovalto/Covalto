package com.fiduciawebmovil.pagoshon.services;

import com.fiduciawebmovil.pagoshon.entity.Pagoshon;
import com.fiduciawebmovil.pagoshon.repo.PagoshonRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class PagoshonServiceImpl implements PagoshonService {
    @Autowired
    private PagoshonRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Pagoshon> findAll() {
        return (List<Pagoshon>) repositorio.findAll();
    }

}









