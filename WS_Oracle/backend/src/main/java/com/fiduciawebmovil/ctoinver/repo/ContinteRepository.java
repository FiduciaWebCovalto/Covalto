package com.fiduciawebmovil.ctoinver.repo;

import com.fiduciawebmovil.ctoinver.entity.Continte;
import com.fiduciawebmovil.ctoinver.entity.ContinteId;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ContinteRepository extends JpaRepository<Continte, ContinteId> {
    @Query("SELECT oi FROM Continte oi WHERE oi.id.cprNumContrato = :cprNumContrato AND oi.cprCveStContint=\"ACTIVO\"")
    List<Continte> findByIdCprNumContrato(Long cprNumContrato);

    List<Continte> findByIdCprNumContratoAndIdCprContratoInter(Long cprNumContrato,Long cprContratoInter);
}
