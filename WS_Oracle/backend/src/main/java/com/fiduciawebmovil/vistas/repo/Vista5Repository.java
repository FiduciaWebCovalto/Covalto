package com.fiduciawebmovil.vistas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.vistas.entity.Vista5;


public interface Vista5Repository extends JpaRepository<Vista5, String> {
    List<Vista5> findByFiso(Long id);
}
