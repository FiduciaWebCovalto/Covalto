package com.fiduciawebmovil.bienes.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fiduciawebmovil.bienes.entity.FAdquirentes;
import com.fiduciawebmovil.bienes.entity.FAdquirentesId;

public interface FAdquirentesRepository 
extends JpaRepository<FAdquirentes, FAdquirentesId> 
{
 
    @Query(value = "SELECT COUNT(*) FROM F_ADQUIRENTES WHERE FADQ_ID_FIDEICOMISO = :fiso AND FADQ_ID_SUBCUENTA = :subfiso AND FADQ_ID_BIEN = :bien AND FADQ_ID_EDIFICIO=:edificio AND FADQ_ID_DEPTO=:depto", nativeQuery = true)
    Long ExisteBien
    (@Param("fiso") Long fiso,
    @Param("subfiso")  Long subfiso,
    @Param("bien") String bien,
    @Param("edificio") String edificio,
    @Param("depto") String depto);     
}
