package com.fiduciawebmovil.reporteador.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiduciawebmovil.reporteador.entity.Reporte;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Long> {
}