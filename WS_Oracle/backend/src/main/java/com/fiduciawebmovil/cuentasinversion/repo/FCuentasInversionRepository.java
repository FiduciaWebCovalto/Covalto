package com.fiduciawebmovil.cuentasinversion.repo;

import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FCuentasInversionRepository extends JpaRepository<FCuentasInversion, String> {

    @Query("SELECT p FROM FCuentasInversion p WHERE p.fciNumCta = :fciNumCta AND p.fciEstatus=\"AUTORIZADA\"")
    List<FCuentasInversion> findByFciNumCta(String fciNumCta);

    @Query("SELECT p FROM FCuentasInversion p WHERE p.fciNumFideicomiso = :fciNumFideicomiso AND p.fciTipoCta=:fciTipoCta AND p.fciEstatus=\"AUTORIZADA\"")
    List<FCuentasInversion> findByFciNumFideicomiso(Long fciNumFideicomiso,String fciTipoCta);

    List<FCuentasInversion> findByFciNumFideicomisoAndFciNumCta(Long fciNumFideicomiso,Long fciNumCta);
@Query(value = "SELECT * FROM f_cuentas_inversion u WHERE u.fci_num_fideicomiso=:id AND u.fci_Estatus='AUTORIZADA' AND UPPER(u.FCI_TIT_DE_CTA) LIKE UPPER('%' || :nombre || '%')", 
           nativeQuery = true)
    List<FCuentasInversion> findByFciNumFideicomisoAndFciTitDeCta(Long id,String nombre);

}
