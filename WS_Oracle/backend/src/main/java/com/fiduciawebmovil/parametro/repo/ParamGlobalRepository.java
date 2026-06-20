package com.fiduciawebmovil.parametro.repo;

import com.fiduciawebmovil.parametro.entity.ParamGlobal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    

public interface ParamGlobalRepository extends JpaRepository<ParamGlobal, Long> {
    List<ParamGlobal> findByParamClave(Long paramClave);
    List<ParamGlobal> findByParamDescripcion(String paramDescripcion);
}
