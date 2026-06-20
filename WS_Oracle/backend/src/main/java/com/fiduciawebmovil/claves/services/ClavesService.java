package com.fiduciawebmovil.claves.services;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.terceros.entity.Terceros;

import java.util.List;

public interface ClavesService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Claves> findAll();
    List<Claves> findByIdCveNumClave(Long cveNumClave);
    List<Claves> findByIdCveNumClaveAndCveDescClave(Long cveNumClave,String cveDescClave);
    List<Claves> findDescripcionClave(Long id,Long id2);
}
