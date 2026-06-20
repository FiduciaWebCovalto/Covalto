package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.Vista6;


public interface Vista6Repository extends JpaRepository<Vista6, String> {

    List<Vista6> findByFiso(Long id);

}
