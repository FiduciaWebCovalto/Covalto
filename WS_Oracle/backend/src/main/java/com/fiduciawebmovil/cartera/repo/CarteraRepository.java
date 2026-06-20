package com.fiduciawebmovil.cartera.repo;

import com.fiduciawebmovil.cartera.entity.Cartera;
import com.fiduciawebmovil.cartera.entity.CarteraId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CarteraRepository extends JpaRepository<Cartera, CarteraId> {
    List<Cartera> findByIdCarNumContrato(Long carNumContrato);
}
