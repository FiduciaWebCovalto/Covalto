package com.fiduciawebmovil.detcart.services;
import com.fiduciawebmovil.detcart.entity.Detcart;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.query.Param;

public interface DetcartService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Detcart> findAll();
    BigDecimal findImporteFolio(Long folio); 
    List<Detcart> findfisoperiodo(Long decNumContrato, String fechaInicio, String fechaFin);
}
