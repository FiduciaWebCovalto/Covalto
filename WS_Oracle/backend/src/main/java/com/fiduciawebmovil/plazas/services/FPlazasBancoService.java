package com.fiduciawebmovil.plazas.services;

import com.fiduciawebmovil.plazas.entity.FPlazasBanco;
import com.fiduciawebmovil.terceros.entity.Terceros;

import java.util.List;

public interface FPlazasBancoService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<FPlazasBanco> findAll();
    List<FPlazasBanco> findByFplbIdBanco(Long fplbIdBanco,Long fplbIdPlaza);
    
}
