package com.fiduciawebmovil.fusuario.repo;

import com.fiduciawebmovil.fusuario.entity.FUsuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FUsuarioRepository extends JpaRepository<FUsuario, String> {

    List<FUsuario> findByFusuIdUsuario(String fusuIdUsuario);


}
