package com.fiduciawebmovil.unidades.repo;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.insnomon.entity.FConinsnomon;
import com.fiduciawebmovil.insnomon.entity.FConinsnomonId;
import com.fiduciawebmovil.unidades.entity.FUnidades;
import com.fiduciawebmovil.unidades.entity.FUnidadesId;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FUnidadesRepository extends JpaRepository<FUnidades, FUnidadesId> {
    //@Query(value = "SELECT * FROM F_CONINSNOMON WHERE  CONP_PADRE=0 and FTOP_NUM_OPER=:ftopNumOper ORDER BY CONP_ID_CONCEPTO ASC", nativeQuery = true)   
    List<FUnidades> findByIdFuniIdFideicomiso(Long funiIdFideicomiso);

    @Query(value = "SELECT  NVL(FUNI_STATUS,'ACTIVO') as FUNI_STATUS FROM F_UNIDADES WHERE FUNI_ID_FIDEICOMISO = :fiso AND FUNI_ID_SUBCUENTA = :subfiso AND FUNI_ID_BIEN = :bien  AND FUNI_ID_EDIFICIO=:edificio AND FUNI_ID_DEPTO=:depto", nativeQuery = true)
    String StatusBien
    (@Param("fiso") Long fiso,
    @Param("subfiso")  Long subfiso,
    @Param("bien") String bien,
    @Param("edificio") String edificio,
    @Param("depto") String depto);

    @Query(value = "SELECT COUNT(*) FROM F_UNIDADES WHERE FUNI_ID_FIDEICOMISO = :fiso AND FUNI_ID_SUBCUENTA = :subfiso AND FUNI_ID_BIEN = :bien AND FUNI_ID_EDIFICIO=:edificio AND FUNI_ID_DEPTO=:depto", nativeQuery = true)
    Long ExisteBien
    (@Param("fiso") Long fiso,
    @Param("subfiso")  Long subfiso,
    @Param("bien") String bien,
    @Param("edificio") String edificio,
    @Param("depto") String depto);    
}
