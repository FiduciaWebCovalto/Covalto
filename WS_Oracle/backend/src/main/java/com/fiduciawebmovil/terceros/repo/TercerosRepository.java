package com.fiduciawebmovil.terceros.repo;

import com.fiduciawebmovil.terceros.entity.Terceros;
import com.fiduciawebmovil.terceros.entity.TercerosId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;


public interface TercerosRepository extends JpaRepository<Terceros, TercerosId> {

    ResponseEntity<Terceros> findById(Long terNumContrato);
     List<Terceros> findByIdTerNumContrato(Long terNumContrato);
     List<Terceros> findByIdTerNumContratoAndTerNomTercero(Long terNumContrato,String terNomTercero);
}
