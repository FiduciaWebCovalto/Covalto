package com.fiduciawebmovil.detcart.services;

import com.fiduciawebmovil.detcart.entity.Detcart;
import com.fiduciawebmovil.detcart.repo.DetcartRepository;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Service
@Transactional
@Slf4j
public class DetcartServiceImpl implements DetcartService {
    @Autowired
    private DetcartRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Detcart> findAll() {
        return (List<Detcart>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public BigDecimal findImporteFolio(Long folio) {
        return repositorio.findImporteFolio(folio);
    }

        @Override
    @Transactional(readOnly = true)
    public List<Detcart> findfisoperiodo
    (Long decNumContrato, String fechaInicio, String fechaFin) {
        return repositorio.
        findByIdDecNumContratoAndIdDecFecCalcHonoBetween(decNumContrato,fechaInicio,fechaFin);
    }

}









