package com.fiduciawebmovil.Excel.repo;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.Excel.entity.ArchivosPlanosTas;

public interface ArchivosPlanosTasRepository extends JpaRepository<ArchivosPlanosTas, BigDecimal> {
    
}
