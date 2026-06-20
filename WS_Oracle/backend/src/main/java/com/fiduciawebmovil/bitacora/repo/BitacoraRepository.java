package com.fiduciawebmovil.bitacora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.bitacora.entity.Bitacora;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;


public interface BitacoraRepository extends JpaRepository<Bitacora, BitacoraId> {

}
