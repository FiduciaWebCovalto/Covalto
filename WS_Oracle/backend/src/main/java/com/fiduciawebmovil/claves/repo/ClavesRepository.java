package com.fiduciawebmovil.claves.repo;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.claves.entity.ClavesId;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClavesRepository extends JpaRepository<Claves, ClavesId> {

    List<Claves> findByIdCveNumClave(Long cveNumClave);
    List<Claves> findByIdCveNumClaveAndCveDescClave(Long cveNumClave,String cveDescClave);
    List<Claves> findByIdCveNumClaveAndIdCveNumSecClave(Long cveNumClave,Long cveNumSecClave);
    
    


}
