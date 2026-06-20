package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.Vista3;


public interface Vista3Repository extends JpaRepository<Vista3, String> {

    List<Vista3> findByFiso(Long id);

}