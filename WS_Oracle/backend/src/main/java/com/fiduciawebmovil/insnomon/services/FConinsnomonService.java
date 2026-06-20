package com.fiduciawebmovil.insnomon.services;

import com.fiduciawebmovil.insnomon.entity.FConinsnomon;

import java.util.List;

public interface FConinsnomonService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<FConinsnomon> findAll();
    List<FConinsnomon> findByIdFtopNumOper(String ftopNumOper);
    List<FConinsnomon> findNumOperSinPadre(String ftopNumOper);
    List<FConinsnomon> findByConpNombreAndIdFtopNumOper(String conpNombre,String ftopNumOper);
}
