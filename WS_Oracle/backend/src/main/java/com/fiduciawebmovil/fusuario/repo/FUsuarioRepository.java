package com.fiduciawebmovil.fusuario.repo;

import com.fiduciawebmovil.fusuario.dtos.FUsuarioDTO;
import com.fiduciawebmovil.fusuario.entity.FUsuario;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FUsuarioRepository extends JpaRepository<FUsuario, String> {

    List<FUsuario> findByFusuIdUsuario(String fusuIdUsuario);


}
