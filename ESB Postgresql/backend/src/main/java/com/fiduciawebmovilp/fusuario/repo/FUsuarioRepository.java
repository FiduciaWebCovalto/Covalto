package com.fiduciawebmovilp.fusuario.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovilp.fusuario.entity.FUsuario;


public interface FUsuarioRepository extends JpaRepository<FUsuario, Long> {
    Optional<FUsuario> findByEmail(String email);
}
