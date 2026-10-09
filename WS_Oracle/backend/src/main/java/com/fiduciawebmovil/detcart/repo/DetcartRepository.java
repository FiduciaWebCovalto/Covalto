package com.fiduciawebmovil.detcart.repo;

import com.fiduciawebmovil.detcart.entity.Detcart;
import com.fiduciawebmovil.detcart.entity.DetcartId;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface DetcartRepository extends JpaRepository<Detcart, DetcartId> {
    boolean existsByIdDecNumContratoAndIdDecCvePersFidAndIdDecNumPersFidAndIdDecNumSecuencialAndDecFolioOpera(
        Long decNumContrato,String decCvePersFid,BigDecimal decNumPersFid,
        BigDecimal decNumSecuencial,BigDecimal decFolioOpera);

   @Query(value = "SELECT dec_imp_rem_honor FROM detcart u WHERE u.DEC_FOLIO_OPERA = :folio", nativeQuery = true)
    BigDecimal findImporteFolio(@Param("folio") Long folio);   
    
    boolean existsByDecFolioOpera(Double folio);

@Query(value = "SELECT * FROM detcart u WHERE u.DEC_NUM_CONTRATO = :fiso AND TO_DATE(u.DEC_FEC_CALC_HONO,'DD/MM/YYYY') BETWEEN TO_DATE( :fecini,'DD/MM/YYYY') AND TO_DATE( :fecfin,'DD/MM/YYYY') ", nativeQuery = true)
    List<Detcart> findByIdDecNumContratoAndIdDecFecCalcHonoBetween
    (@Param("fiso") Long fiso, 
    @Param("fecini") String fecini,
    @Param("fecfin") String fecfin);
}
