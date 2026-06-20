package com.fiduciawebmovil.reporteador.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.reporteador.entity.ConfigReporte;
public interface ConfigReporteRepository extends JpaRepository<ConfigReporte, Long> {
}