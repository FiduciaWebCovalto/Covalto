package com.fiduciawebmovil.Excel.repo;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.Excel.entity.FArchivosExcel;

public interface FArchivosExcelRepository extends JpaRepository<FArchivosExcel, BigDecimal> {
}


