package com.fiduciawebmovil.docetapa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.docetapa.entity.VistaDocumento;


public interface VistaDocumentoRepository extends JpaRepository<VistaDocumento, Long> {
    List<VistaDocumento> findByOperacion(String operacion);
}
