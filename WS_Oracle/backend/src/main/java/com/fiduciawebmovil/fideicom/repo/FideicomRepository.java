package com.fiduciawebmovil.fideicom.repo;

import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.entity.FideicomId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FideicomRepository extends JpaRepository<Fideicom, FideicomId> {

    List<Fideicom> findByIdFidNumContrato(Long fidNumContrato);
    List<Fideicom> findByIdFidNumContratoAndFidNomFideicom(Long fidNumContrato,String fidNomFideicom);

}
