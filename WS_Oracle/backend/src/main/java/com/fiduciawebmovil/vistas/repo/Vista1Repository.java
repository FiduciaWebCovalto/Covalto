package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.Vista1;


public interface Vista1Repository extends JpaRepository<Vista1, String> {

    List<Vista1> findByFiso(Long id);

}
