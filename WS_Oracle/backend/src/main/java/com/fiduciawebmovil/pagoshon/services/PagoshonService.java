package com.fiduciawebmovil.pagoshon.services;
import com.fiduciawebmovil.pagoshon.entity.Pagoshon;

import java.util.List;

public interface PagoshonService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Pagoshon> findAll();
   
}
