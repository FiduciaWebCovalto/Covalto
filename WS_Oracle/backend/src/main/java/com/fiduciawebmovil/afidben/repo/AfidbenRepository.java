package com.fiduciawebmovil.afidben.repo;

import com.fiduciawebmovil.afidben.entity.Afidben;
import com.fiduciawebmovil.afidben.entity.AfidbenId;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AfidbenRepository extends JpaRepository<Afidben, AfidbenId> {
boolean existsByIdAfbAnteproyectoAndIdAfbCvePersonaAndIdAfbNumFidben
(Long afbAnteproyecto,String afbCvePersona,BigDecimal afbNumFidben);
}
