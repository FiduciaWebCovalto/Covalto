package com.fiduciawebmovil.fbitacora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.fbitacora.entity.FBitacora;
import com.fiduciawebmovil.fbitacora.entity.FBitacoraId;


public interface FBitacoraRepository extends JpaRepository<FBitacora, FBitacoraId> {

}
