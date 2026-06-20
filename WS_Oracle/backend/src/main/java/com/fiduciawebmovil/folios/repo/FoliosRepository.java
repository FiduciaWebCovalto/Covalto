package com.fiduciawebmovil.folios.repo;

import com.fiduciawebmovil.folios.entity.Folios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
    

public interface FoliosRepository extends JpaRepository<Folios, Long> {
    List<Folios> findByFolTipoFolio(Long folTipoFolio);
    @Query(value = "SELECT seq_folios.NEXTVAL AS FOLIO FROM DUAL", nativeQuery = true)
    Long obtenerSiguienteValor();
}
