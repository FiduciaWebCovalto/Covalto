package com.fiduciawebmovil.password.repo;

import com.fiduciawebmovil.password.entity.FPpassword;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
    

public interface FPpasswordRepository extends JpaRepository<FPpassword, Long> {
    @Query(value = "SELECT DISTINCT FPA_PASSWORD_DFL FROM F_Ppassword WHERE FPA_NUM_INSTITUCION=:institucion", nativeQuery = true)
    String devuelveContrasena
    (@Param("institucion") Long institucion);
}
