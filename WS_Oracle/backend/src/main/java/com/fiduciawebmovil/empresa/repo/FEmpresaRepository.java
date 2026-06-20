package com.fiduciawebmovil.empresa.repo;

import com.fiduciawebmovil.empresa.entity.FEmpresa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    

public interface FEmpresaRepository extends JpaRepository<FEmpresa, Long> {
    List<FEmpresa> findByEmpNumEmpresa(Long empNumEmpresa);
}
