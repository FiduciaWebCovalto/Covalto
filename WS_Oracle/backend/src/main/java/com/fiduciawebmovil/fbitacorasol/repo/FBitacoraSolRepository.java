package com.fiduciawebmovil.fbitacorasol.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSol;
import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSolId;


public interface FBitacoraSolRepository extends JpaRepository<FBitacoraSol, FBitacoraSolId> {

}
