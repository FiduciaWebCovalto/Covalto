package com.fiduciawebmovil.fisocuenta.repo;

import com.fiduciawebmovil.fisocuenta.entity.FFideicoCueban;
import com.fiduciawebmovil.fisocuenta.entity.FFideicoCuebanId;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface FFideicoCuebanRepository extends JpaRepository<FFideicoCueban, FFideicoCuebanId> {

    List<FFideicoCueban> findByIdFfidIdFideicomiso(Long ffidIdFideicomiso);
    @Query(value = "SELECT FFCB_STATUS,FCBA_CLAS_TIPO,FCBA_NUM_TIPO,FCBA_SUB_CUENTA,FCBA_CLABE_CBA,NVL(FCBA_TITULAR,'SIN TITULAR') AS FCBA_TITULAR,FFID_ID_FIDEICOMISO FROM F_FIDEICO_CUEBAN u WHERE FFID_ID_FIDEICOMISO=:id AND UPPER(u.FCBA_TITULAR) LIKE UPPER('%' || :nombre || '%')", 
           nativeQuery = true)
    List<FFideicoCueban> findByFcbaTitular(@Param("id") Long id,@Param("nombre") String nombre);

    List<FFideicoCueban> findByIdFfidIdFideicomisoAndIdFcbaClabeCba(Long ffidIdFideicomiso,String fcbaClabeCba);


}
