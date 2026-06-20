package com.fiduciawebmovilp.auth_users.services;

public interface OtpService {
    public void generarYEnviarOtp(String email);
    public boolean validarOtp(String email, String codigoIngresado);
}
