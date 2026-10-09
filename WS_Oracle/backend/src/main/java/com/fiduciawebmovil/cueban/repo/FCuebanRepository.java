package com.fiduciawebmovil.cueban.repo;

import com.fiduciawebmovil.cueban.entity.FCueban;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FCuebanRepository extends JpaRepository<FCueban, String> {

    @Query("SELECT p FROM FCueban p WHERE p.fcbaClabeCba = :fcbaClabeCba AND p.fcbaStatus=\"AUTORIZADA\"")
    List<FCueban> findByFcbaClabeCba(String fcbaClabeCba);


}
