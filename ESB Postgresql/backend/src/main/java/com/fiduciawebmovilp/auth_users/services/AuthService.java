package com.fiduciawebmovilp.auth_users.services;

import com.fiduciawebmovilp.auth_users.dtos.LoginRequest;
import com.fiduciawebmovilp.auth_users.dtos.LoginResponse;
import com.fiduciawebmovilp.auth_users.dtos.RegistrationRequest;
import com.fiduciawebmovilp.auth_users.dtos.ResetPasswordRequest;
import com.fiduciawebmovilp.auth_users.entity.EnviaCorreo;
import com.fiduciawebmovilp.auth_users.entity.EnviaCorreoCuenta;
import com.fiduciawebmovilp.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
    Response<String> notificasolicitud(EnviaCorreo request);
    public Response<String> notificasolicitudCuenta(EnviaCorreoCuenta request) ;

}
