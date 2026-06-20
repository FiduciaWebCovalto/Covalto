package com.fiduciawebmovil.fisocuenta.services;

import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.repo.FideicomRepository;
import com.fiduciawebmovil.fisocuenta.entity.FFideicoCueban;
import com.fiduciawebmovil.fisocuenta.repo.FFideicoCuebanRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class FFideicoCuebanServiceImpl implements FFideicoCuebanService {
    @Autowired
    private FFideicoCuebanRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FFideicoCueban> findByIdFfidIdFideicomiso(Long ffidIdFideicomiso){
        return (List<FFideicoCueban>) repositorio.findByIdFfidIdFideicomiso(ffidIdFideicomiso);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FFideicoCueban> findByFcbaTitular(Long id,String fcbaTitular){
        return (List<FFideicoCueban>) repositorio.findByFcbaTitular(id,fcbaTitular);
    }

        @Override
    @Transactional(readOnly = true)
    public List<FFideicoCueban> validaFisoyCuenta(Long id,String id2){
        return (List<FFideicoCueban>) repositorio.findByIdFfidIdFideicomisoAndIdFcbaClabeCba(id,id2);
    }
}









