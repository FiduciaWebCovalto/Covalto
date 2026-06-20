package com.fiduciawebmovil.posicion.repo;


import com.fiduciawebmovil.posicion.entity.Posicion;
import com.fiduciawebmovil.posicion.entity.PosicionId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PosicionRepository extends JpaRepository<Posicion, PosicionId> {

    List<Posicion> findByIdPosNumContrato(Long posNumContrato);
    @Query(value = "SELECT SUM(p.pos_costo_historic) FROM posicion p where p.pos_num_contrato=:posNumContrato and p.pos_contrato_inter=:posContratoInter", nativeQuery = true)
    List<Posicion> findSumaPosicion
    (Long posNumContrato,Long posContratoInter);

    List<Posicion> findByIdPosNumContratoAndIdPosContratoInter(Long posNumContrato,Long posContratoInter);

}
