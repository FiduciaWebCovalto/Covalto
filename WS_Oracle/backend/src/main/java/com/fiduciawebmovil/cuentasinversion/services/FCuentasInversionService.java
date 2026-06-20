package com.fiduciawebmovil.cuentasinversion.services;

import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;

import java.math.BigDecimal;
import java.util.List;

public interface FCuentasInversionService {
        
    List<FCuentasInversion> findAll();
    List<FCuentasInversion> findByFciNumCta(String fciNumCta);
    List<FCuentasInversion> findByFciNumFideicomiso(Long fciNumFideicomiso,String fciTipoCta);
    List<FCuentasInversion> BuscaFisoCuenta(Long fiso,Long cuenta);
    List<FCuentasInversion> BuscaCuentaTitular(Long fiso,String titular);
    
}
