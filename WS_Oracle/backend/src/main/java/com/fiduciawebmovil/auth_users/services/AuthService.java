package com.fiduciawebmovil.auth_users.services;

import com.fiduciawebmovil.auth_users.dtos.LoginRequest;
import com.fiduciawebmovil.auth_users.dtos.LoginResponse;
import com.fiduciawebmovil.auth_users.dtos.RegistrationRequest;
import com.fiduciawebmovil.auth_users.dtos.ResetPasswordRequest;
import com.fiduciawebmovil.auth_users.entity.EnviaCorreo;
import com.fiduciawebmovil.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
    Response<String> notificasolicitud(EnviaCorreo request);
    public Response<String> notificasolicitudCuenta(EnviaCorreo request) ;
}
