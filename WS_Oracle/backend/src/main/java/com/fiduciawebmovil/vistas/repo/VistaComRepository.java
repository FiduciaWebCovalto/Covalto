package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.VistaCom;


public interface VistaComRepository extends JpaRepository<VistaCom, Long> {

    List<VistaCom> findByFiso(Long id);

}
