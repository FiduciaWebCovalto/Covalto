package com.fiduciawebmovilp.fusuario.dtos;


import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovilp.role.entity.Role;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FUsuarioDTO {
    private Long id;
    private List<Role> roles;


    @Column(length = 150)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String fusuNombreUsuario;
private Long fperIdPerfil;
    @Column(length = 20)
    private String fusuStatus;
    private String password;

    @NotBlank(message = "El email no puede estar vacío")
    @Column(length = 100)
    private String fusuEmail;

    @Column
    private String fusuImpMaximo;

    @Column(nullable = true)
    private LocalDate fusuUltAcceso;
    @Column(nullable = true)
    private LocalDate fusuCreacion;
}
