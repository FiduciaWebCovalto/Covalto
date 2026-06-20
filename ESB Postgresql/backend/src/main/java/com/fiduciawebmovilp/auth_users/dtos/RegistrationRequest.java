package com.fiduciawebmovilp.auth_users.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RegistrationRequest {
    
    private List<String> roles;
    private Long id;
    @NotBlank(message = "Password is required")
    private String password;

    @Column(length = 150)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String fusuNombreUsuario;

    private String fusuStatus;

    private String fusuImpMaximo;
    @NotBlank(message = "El email is required")
    private String email;
    private Long fperIdPerfil;

    @Column(nullable = true)
    private LocalDateTime fusuUltAcceso;
    @Column(nullable = true)
    private LocalDateTime fusuCreacion;
}
