package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.Vista2;


public interface Vista2Repository extends JpaRepository<Vista2, String> {

    List<Vista2> findByFiso(Long id);

}
