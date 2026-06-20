package com.fiduciawebmovil.fideicom.repo;

import com.fiduciawebmovil.fideicom.dtos.FideicomDTO;
import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.entity.FideicomId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FideicomRepository extends JpaRepository<Fideicom, FideicomId> {

    List<Fideicom> findByIdFidNumContrato(Long fidNumContrato);
    List<Fideicom> findByIdFidNumContratoAndFidNomFideicom(Long fidNumContrato,String fidNomFideicom);

}
