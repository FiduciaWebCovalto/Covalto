package com.fiduciawebmovil.insnomon.repo;

import com.fiduciawebmovil.insnomon.entity.FConinsnomon;
import com.fiduciawebmovil.insnomon.entity.FConinsnomonId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FConinsnomonRepository extends JpaRepository<FConinsnomon, FConinsnomonId> {

    @Query(value = "SELECT * FROM F_CONINSNOMON p WHERE p.FTOP_NUM_OPER=:ftopNumOper ORDER BY CONP_ID_CONCEPTO ASC", nativeQuery = true)
    List<FConinsnomon> findByIdFtopNumOper(String ftopNumOper);
 
    @Query(value = "SELECT * FROM F_CONINSNOMON p WHERE  p.CONP_PADRE=0 and p.FTOP_NUM_OPER=:ftopNumOper ORDER BY CONP_ID_CONCEPTO ASC", nativeQuery = true)   
    List<FConinsnomon> findNumOperSinPadre(String ftopNumOper);
    
    //@Query(value = "SELECT * FROM F_CONINSNOMON WHERE  CONP_PADRE=0 and FTOP_NUM_OPER=:ftopNumOper ORDER BY CONP_ID_CONCEPTO ASC", nativeQuery = true)   
    List<FConinsnomon> findByConpNombreAndIdFtopNumOper(String conpNombre,String ftopNumOper);
}
