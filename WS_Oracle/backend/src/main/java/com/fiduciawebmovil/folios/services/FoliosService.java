package com.fiduciawebmovil.folios.services;

import com.fiduciawebmovil.folios.entity.Folios;

import java.util.List;

public interface FoliosService {
        
    List<Folios> findByFolTipoFolio(Long folTipoFolio);
     public Long getNextId();
    
}
