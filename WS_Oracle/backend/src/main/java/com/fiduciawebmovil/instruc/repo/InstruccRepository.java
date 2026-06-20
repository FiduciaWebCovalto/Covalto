package com.fiduciawebmovil.instruc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.instruc.entity.Instrucc;

public interface InstruccRepository extends JpaRepository<Instrucc, Long> {

}
