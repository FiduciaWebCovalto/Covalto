package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.VistaMov;


public interface VistaMovRepository extends JpaRepository<VistaMov, Long> {

    List<VistaMov> findByFiso(Long id);

}
