package com.fiduciawebmovil.subcuenta.services;

import com.fiduciawebmovil.subcuenta.entity.FSubcuenta;
import com.fiduciawebmovil.subcuenta.repo.FSubcuentaRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FSubcuentaServiceImpl implements FSubcuentaService {
    @Autowired
    private FSubcuentaRepository repositorio; // Inyección del repositorio 


    @Override
    @Transactional(readOnly = true)
    public List<FSubcuenta> findByIdFsctIdFideicomiso(Long fsctIdFideicomiso){
        return (List<FSubcuenta>) repositorio.findByIdFsctIdFideicomiso(fsctIdFideicomiso);
    }

}









