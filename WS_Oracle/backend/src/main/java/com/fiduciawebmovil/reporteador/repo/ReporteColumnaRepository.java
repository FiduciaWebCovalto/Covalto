package com.fiduciawebmovil.reporteador.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiduciawebmovil.reporteador.entity.ReporteColumna;

@Repository
public interface ReporteColumnaRepository extends JpaRepository<ReporteColumna, Long> {
}

