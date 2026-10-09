package com.fiduciawebmovil.contrato.repo;

import com.fiduciawebmovil.contrato.entity.Contrato;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ContratoRepository extends JpaRepository<Contrato, Long> {
    List<Contrato> findByCtoNumContrato(Long ctoNumContrato);
    boolean existsByCtoNumContrato(Long ctoNumContrato);
    //List<Contrato> findByFsubcuentaFsctIdFideicomiso(Long ctoNumContrato);
}
