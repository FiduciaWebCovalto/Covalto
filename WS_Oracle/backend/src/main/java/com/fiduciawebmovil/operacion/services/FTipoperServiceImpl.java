package com.fiduciawebmovil.operacion.services;
import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;
import com.fiduciawebmovil.operacion.entity.FTipoper;
import com.fiduciawebmovil.operacion.repo.FTipoperRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@Slf4j
public class FTipoperServiceImpl implements FTipoperService {
    @Autowired
    private FTipoperRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FTipoper> findAll() {
        return (List<FTipoper>) repositorio.findAll();
    }

}









