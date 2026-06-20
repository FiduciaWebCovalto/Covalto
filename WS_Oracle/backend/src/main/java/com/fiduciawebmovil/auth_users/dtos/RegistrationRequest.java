package com.fiduciawebmovil.auth_users.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class RegistrationRequest {

    @NotBlank(message = "El Nombre es requerido")
    private String usuNomUsuario;

    private Long usuNumUsuario;

    private Boolean usuToken;

    private BigDecimal usuNumPuesto;

    @NotBlank(message = "Email is required")
    @Email
    private String usuEmail;
    private String usuNomPuesto;
    private List<String> roles;

    @NotBlank(message = "Password is required")

    private String usuCveStUsuario;
    private BigDecimal usuMontoAutorizado;
    private String perTelefono;
    private String perExpLaboral;
    private String perNivelEstudios;
    private String perRfc;
    private String perDireccion;
    private String usuFechaUltAcceso;
    private String usuTipoUsuario;
}
