package com.fiduciawebmovil.operacion.repo;

import com.fiduciawebmovil.operacion.entity.FTipoper;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FTipoperRepository extends JpaRepository<FTipoper, String> {
    @Query(value = "SELECT * FROM F_TIPOPER WHERE  FTOP_TIPO_SOL=2 AND SUBSTR(FTOP_NUM_OPER,1,1)='2' ORDER BY FTOP_NOMBRE_TIPOPER ASC", nativeQuery = true)   
    List<FTipoper> findAll();

}
