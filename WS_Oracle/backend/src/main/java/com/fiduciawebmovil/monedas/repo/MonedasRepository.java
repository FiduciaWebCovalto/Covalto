package com.fiduciawebmovil.monedas.repo;

import com.fiduciawebmovil.monedas.entity.Monedas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    

public interface MonedasRepository extends JpaRepository<Monedas, Long> {
    List<Monedas> monNumPais(Long monNumPais);
    List<Monedas> monNomMoneda(String monNomMoneda);
}
