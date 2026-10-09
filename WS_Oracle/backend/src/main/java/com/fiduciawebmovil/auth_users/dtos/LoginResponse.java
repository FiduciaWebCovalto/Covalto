package com.fiduciawebmovil.auth_users.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LoginResponse {

    private String token;
    private List<String> roles;
    private String usuNomPuesto;
    private String usuNomUsuario;
    private String usuNumPuesto;
    private String fecha;
    private String usuNumUsuario;
}
