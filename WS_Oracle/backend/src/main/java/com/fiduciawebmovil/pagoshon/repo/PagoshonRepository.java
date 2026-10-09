package com.fiduciawebmovil.pagoshon.repo;

import com.fiduciawebmovil.pagoshon.entity.Pagoshon;
import com.fiduciawebmovil.pagoshon.entity.PagoshonId;


import org.springframework.data.jpa.repository.JpaRepository;


public interface PagoshonRepository extends JpaRepository<Pagoshon, PagoshonId> {

}
