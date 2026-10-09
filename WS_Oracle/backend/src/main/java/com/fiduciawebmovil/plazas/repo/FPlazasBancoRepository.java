package com.fiduciawebmovil.plazas.repo;

import com.fiduciawebmovil.plazas.entity.FPlazasBanco;
import com.fiduciawebmovil.plazas.entity.FPlazasBancoId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface FPlazasBancoRepository extends JpaRepository<FPlazasBanco, FPlazasBancoId> {

    List<FPlazasBanco> findByIdFplbIdBancoAndIdFplbIdPlaza(Long fplbIdBanco,Long fplbIdPlaza);


}
