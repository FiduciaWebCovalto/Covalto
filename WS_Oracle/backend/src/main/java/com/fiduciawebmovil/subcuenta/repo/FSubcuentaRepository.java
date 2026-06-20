package com.fiduciawebmovil.subcuenta.repo;

import com.fiduciawebmovil.subcuenta.entity.FSubcuenta;
import com.fiduciawebmovil.subcuenta.entity.FSubcuentaId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface FSubcuentaRepository extends JpaRepository<FSubcuenta, FSubcuentaId> {

    //@Query("SELECT p FROM FSubcuenta p WHERE p.fsctIdFideicomiso = :fsctIdFideicomiso AND p.fsctStatus=\"ACTIVO\"")
    List<FSubcuenta> findByIdFsctIdFideicomiso(Long fsctIdFideicomiso);
    

}
