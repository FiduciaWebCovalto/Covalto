package com.fiduciawebmovil.bienes.repo;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fiduciawebmovil.bienes.entity.FBienesgar;
import com.fiduciawebmovil.bienes.entity.FBienesgarId;

public interface FBienesgarRepository extends JpaRepository<FBienesgar, FBienesgarId> {
    @Query(value = "SELECT  COUNT(*) FROM F_BIENESGAR WHERE FGRS_ID_FIDEICOMISO = :fgrsIdFideicomiso AND FGRS_ID_SUBCUENTA = :fgrsIdSubcuenta AND FORS_CVE_TIPO_BIEN = :forsCveTipoBien", nativeQuery = true)
    Long existeBien
    (@Param("fgrsIdFideicomiso") Long fgrsIdFideicomiso,
    @Param("fgrsIdSubcuenta")  BigDecimal fgrsIdSubcuenta,
    @Param("forsCveTipoBien") String forsCveTipoBien);
}
