package com.fiduciawebmovil.feccont.repo;

import com.fiduciawebmovil.feccont.entity.Feccont;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    

public interface FeccontRepository extends JpaRepository<Feccont, String> {

    String findByFcoFecha(String fcoFecha);
}
