package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.Vista4;


public interface Vista4Repository extends JpaRepository<Vista4, String> {

    List<Vista4> findByFiso(Long id);

}
