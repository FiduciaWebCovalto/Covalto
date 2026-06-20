package com.fiduciawebmovil.pagoshon.repo;

import com.fiduciawebmovil.claves.entity.Claves;
import com.fiduciawebmovil.insnomon.entity.FConinsnomon;
import com.fiduciawebmovil.insnomon.entity.FConinsnomonId;
import com.fiduciawebmovil.pagoshon.entity.Pagoshon;
import com.fiduciawebmovil.pagoshon.entity.PagoshonId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PagoshonRepository extends JpaRepository<Pagoshon, PagoshonId> {

}
