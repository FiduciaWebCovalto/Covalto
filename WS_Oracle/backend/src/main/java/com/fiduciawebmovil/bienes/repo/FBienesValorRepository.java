package com.fiduciawebmovil.bienes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.bienes.entity.FBienesValor;
import com.fiduciawebmovil.bienes.entity.FBienesValorId;


public interface FBienesValorRepository extends JpaRepository<FBienesValor, FBienesValorId> {

}
