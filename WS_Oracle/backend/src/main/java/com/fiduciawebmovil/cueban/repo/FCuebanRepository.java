package com.fiduciawebmovil.cueban.repo;

import com.fiduciawebmovil.cueban.entity.FCueban;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FCuebanRepository extends JpaRepository<FCueban, String> {

    @Query("SELECT p FROM FCueban p WHERE p.fcbaClabeCba = :fcbaClabeCba AND p.fcbaStatus=\"AUTORIZADA\"")
    List<FCueban> findByFcbaClabeCba(String fcbaClabeCba);


}
