package com.fiduciawebmovil.paises.repo;

import com.fiduciawebmovil.paises.entity.Paises;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    

public interface PaisesRepository extends JpaRepository<Paises, Long> {
    List<Paises> findByPaiNumPais(Long paiNumPais);
    List<Paises> findByPaiNomPais(String paiNomPais);
}
