package com.fiduciawebmovil.indices.services;

import com.fiduciawebmovil.indices.entity.FIndices;

import java.util.List;

public interface FIndicesService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<FIndices> findAll();
    List<FIndices> findByIdEindIdIndice(Long eindIdIndice);
    List<FIndices> findByEindDescripcion(String eindDescripcion);
}
