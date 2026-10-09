package com.fiduciawebmovil.indices.repo;

import com.fiduciawebmovil.indices.entity.FIndices;
import com.fiduciawebmovil.indices.entity.FIndicesId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FIndicesRepository extends JpaRepository<FIndices, FIndicesId> {

    List<FIndices> findByIdEindIdIndice(Long eindIdIndice);

    @Query(value = "SELECT * FROM F_INDICES p WHERE  p.EIND_ID_INDICE=581 and p.EIND_DESCRIPCION=:eindDescripcion", nativeQuery = true)   
    List<FIndices> findByEindDescripcion(String eindDescripcion);


}
