package com.fiduciawebmovil.auth_users.controller;

import com.fiduciawebmovil.auth_users.dtos.LoginRequest;
import com.fiduciawebmovil.auth_users.dtos.LoginResponse;
import com.fiduciawebmovil.auth_users.dtos.OtpRequest;
import com.fiduciawebmovil.auth_users.dtos.RegistrationRequest;
import com.fiduciawebmovil.auth_users.dtos.ResetPasswordRequest;
import com.fiduciawebmovil.auth_users.entity.EnviaCorreo;
import com.fiduciawebmovil.auth_users.services.AuthService;
import com.fiduciawebmovil.auth_users.services.OtpService;
import com.fiduciawebmovil.res.Response;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private OtpService otpService;

    @PostMapping("/register")
    public ResponseEntity<Response<String>> register(@RequestBody @Valid RegistrationRequest registrationRequest ){
        return ResponseEntity.ok(authService.register(registrationRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Response<LoginResponse>> login(@RequestBody @Valid LoginRequest loginRequest ){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<Response<?>> forgotPassword(@RequestBody ResetPasswordRequest resetPasswordRequest ){
        return ResponseEntity.ok(authService.forgetPassword(resetPasswordRequest.getEmail()));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<Response<?>> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest ){
        return ResponseEntity.ok(authService.updatePasswordViaResetCode(resetPasswordRequest));
    }

    @PostMapping("/send-email")
    public ResponseEntity<Response<?>> resetPassword(@RequestBody EnviaCorreo request){
        return ResponseEntity.ok(authService.notificasolicitud(request));
    }

    @PostMapping("/enviar-otp")
    public ResponseEntity<String> solicitarOtp(@RequestBody OtpRequest request) {
        // Disparar el servicio asíncrono
        otpService.generarYEnviarOtp(request.getEmail());
        
        return ResponseEntity.ok("OTP generado. Revisa tu bandeja de entrada.");
    }

    @PostMapping("/validar-otp")
    public ResponseEntity<String> validarOtp(@RequestParam String email, 
        @RequestParam String otp) {
        boolean esValido = otpService.validarOtp(email, otp);
        
        if (esValido) {
            return ResponseEntity.ok("Validación exitosa. Acceso concedido.");
        } else {
            return ResponseEntity.status(400).body("OTP inválido o ha expirado.");
        }
    }
}
