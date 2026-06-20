package com.fiduciawebmovil.usuarios.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiduciawebmovil.usuarios.entity.Usuarios;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    Optional<Usuarios> findByUsuEmail(String usuEmail);
}
