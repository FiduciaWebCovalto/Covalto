package com.fiduciawebmovilp.auth_users.services.impl;

import com.fiduciawebmovilp.auth_users.dtos.LoginRequest;
import com.fiduciawebmovilp.auth_users.dtos.LoginResponse;
import com.fiduciawebmovilp.auth_users.dtos.RegistrationRequest;
import com.fiduciawebmovilp.auth_users.dtos.ResetPasswordRequest;
import com.fiduciawebmovilp.auth_users.entity.EnviaCorreo;
import com.fiduciawebmovilp.auth_users.entity.EnviaCorreoCuenta;
import com.fiduciawebmovilp.auth_users.entity.PasswordResetCode;
import com.fiduciawebmovilp.auth_users.repo.PasswordResetCodeRepo;
import com.fiduciawebmovilp.auth_users.services.AuthService;
import com.fiduciawebmovilp.auth_users.services.CodeGenerator;
import com.fiduciawebmovilp.enums.AccountType;
import com.fiduciawebmovilp.enums.Currency;
import com.fiduciawebmovilp.exceptions.BadRequestException;
import com.fiduciawebmovilp.exceptions.NotFoundException;
import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.fusuario.repo.FUsuarioRepository;
import com.fiduciawebmovilp.notification.dtos.NotificationDTO;
import com.fiduciawebmovilp.notification.services.NotificationService;
import com.fiduciawebmovilp.res.Response;
import com.fiduciawebmovilp.role.entity.Role;
import com.fiduciawebmovilp.role.repo.RoleRepo;
import com.fiduciawebmovilp.security.TokenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final FUsuarioRepository userRepo;
    private final RoleRepo roleRepo;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private final NotificationService notificationService;


    private final CodeGenerator codeGenerator;
    private final PasswordResetCodeRepo passwordResetCodeRepo;


    @Value("${password.reset.link}")
    private String resetLink;


    @Override
    public Response<String> register(RegistrationRequest request) {
        log.info("Registrando nuevo usuario: {}", request.getEmail());

        List<Role> roles;

        if (request.getRoles() == null || request.getRoles().isEmpty()) {
            //DEFAULT TO CUSTOMER
            Role defaultRole = roleRepo.findByName("CUSTOMER")
                    .orElseThrow(() -> new NotFoundException("CUSTOMER ROLE NOT FOUND"));

            roles = List.of(defaultRole);
        } else {
            roles = request.getRoles().stream()
                    .map(roleName -> roleRepo.findByName(roleName)
                            .orElseThrow(() -> new NotFoundException("ROLE NOT FOUND" + roleName)))
                    .toList();
        }

        if (userRepo.findByEmail(request.getEmail()).isPresent()) {
            throw new BadRequestException("El Email ya se encuentra registrado.");
        }

        FUsuario user = FUsuario.builder()
                .fusuNombreUsuario(request.getFusuNombreUsuario())
                .email(request.getEmail())
                .fusuImpMaximo(request.getFusuImpMaximo())
                .fusuStatus("ACTIVO")
                .fperIdPerfil(request.getFperIdPerfil())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(roles)
                .build();

        FUsuario savedUser = userRepo.save(user);


        //SEND WELCOME EMAIL
        Map<String, Object> vars = new HashMap<>();
        vars.put("name", savedUser.getFusuNombreUsuario());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(savedUser.getEmail())
                .subject("Bienvenido a FiduciaWebMovil 🎉")
                .templateName("welcome")
                .templateVariables(vars)
                .build();

        notificationService.sendEmail(notificationDTO, savedUser);


        //SEND ACCOUNT CREATION/DETAILS EMAIL
        Map<String, Object> accountVars = new HashMap<>();
        accountVars.put("name", savedUser.getFusuNombreUsuario());
        accountVars.put("accountNumber", "0");
        accountVars.put("accountType", AccountType.SAVINGS.name());
        accountVars.put("currency", Currency.USD);

        NotificationDTO accountCreatedEmail = NotificationDTO.builder()
                .recipient(savedUser.getEmail())
                .subject("Ha sido creada tu nueva cuenta en FiduciaWebMovil ✅")
                .templateName("account-created")
                .templateVariables(accountVars)
                .build();

        notificationService.sendEmail(accountCreatedEmail, savedUser);

        return Response.<String>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Tu nueva cuenta en FiduciaWebMovil ha sido creada correctamente.")
                .data("Un correo se envio con los detalles.")
                .build();
    }

    @Override
    public Response<LoginResponse> login(LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        log.info("Intento de inicio de sesión para el usuario: {}", email);

        FUsuario user = userRepo.findByEmail(email).orElseThrow(() -> new NotFoundException("Email Not Found"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            log.warn("Contraseña incorrecta para el usuario: {}", email);
            throw new BadRequestException("Contraseña Incorrecta!");
        }

        String token = tokenService.generateToken(user.getEmail());

        LoginResponse loginResponse = LoginResponse.builder()
                .roles(user.getRoles().stream().map(Role::getName).toList())
                .token(token)
                .build();

        return Response.<LoginResponse>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Login Successful")
                .data(loginResponse)
                .build();
    }

    @Override
    @Transactional
    public Response<?> forgetPassword(String email) {
        log.info("Solicitud de recuperación de contraseña para: {}", email);
        FUsuario user = userRepo.findByEmail(email).orElseThrow(() -> new NotFoundException("Usuario no Valido!"));
        passwordResetCodeRepo.deleteByUserId(user.getId());

        String code = codeGenerator.generateUniqueCode();

        PasswordResetCode resetCode = PasswordResetCode.builder()
                .user(user)
                .code(code)
                .expiryDate(calculateExpiryDate())
                .used(false)
                .build();

        passwordResetCodeRepo.save(resetCode);

        //send email reset link out
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("name", user.getFusuNombreUsuario());
        templateVariables.put("resetLink", code);


        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(user.getEmail())
                .subject("Password Reset Code")
                .templateName("password-reset")
                .templateVariables(templateVariables)
                .build();

        notificationService.sendEmail(notificationDTO, user);


        return Response.builder()
                .statusCode(HttpStatus.OK.value())
                .message("Password reset code sent to your email")
                .build();

    }

    @Override
    @Transactional
    public Response<?> updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest) {
        String code = resetPasswordRequest.getCode();
        String newPassword = resetPasswordRequest.getNewPassword();

        // Find and validate code

        PasswordResetCode resetCode = passwordResetCodeRepo.findByCode(code)
                .orElseThrow(() -> new BadRequestException("Invalid reset code"));

        // Check expiration first
        if (resetCode.getExpiryDate().isBefore(LocalDateTime.now())) {
            passwordResetCodeRepo.delete(resetCode); // Clean up expired code
            throw new BadRequestException("Reset code has expired");
        }


        //update the pasword
        FUsuario user = resetCode.getUser();
        log.info("Actualizando contraseña via reset code para: {}", user.getEmail());
        user.setPassword(passwordEncoder.encode(newPassword));
        userRepo.save(user);

        // Delete the code immediately after successful use
        passwordResetCodeRepo.delete(resetCode);


        // Send confirmation email
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("name", user.getFusuNombreUsuario());

        NotificationDTO confirmationEmail = NotificationDTO.builder()
                .recipient(user.getEmail())
                .subject("Contraseña actualizada correctamente")
                .templateName("password-update-confirmation")
                .templateVariables(templateVariables)
                .build();

        notificationService.sendEmail(confirmationEmail, user);

        return Response.builder()
                .statusCode(HttpStatus.OK.value())
                .message("Contraseña actualizada correctamente")
                .build();
    }


    private LocalDateTime calculateExpiryDate() {
        return LocalDateTime.now().plusHours(5);
    }

 @Override
    public Response<String> notificasolicitud(EnviaCorreo request) {
        log.info("Enviando correo de notificación de solicitud tipo {} para: {}", request.tipo(), request.usuario());
        BigDecimal montof = new BigDecimal(request.monto());
        DecimalFormat formato = new DecimalFormat("#,###.00");
        //SEND WELCOME EMAIL
        Map<String, Object> vars = new HashMap<>();
        vars.put("name", request.usuario());
        vars.put("folio", request.folio());
        vars.put("tipo", request.tipo());
        vars.put("monto", formato.format(montof));
        vars.put("descripcion", request.descripcion());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(request.usuario())
                .subject("Envio de Solicitud "+request.tipo())
                .templateName("solicitud")
                .templateVariables(vars)
                .build();

        notificationService.sendEmailSolicitud(notificationDTO);

        return Response.<String>builder()
                .statusCode(HttpStatus.OK.value())
                .message("La solicitud ha sido enviada correctamente.")
                .data("Un correo se envio con los detalles.")
                .build();
    }

     @Override
    public Response<String> notificasolicitudCuenta(EnviaCorreoCuenta request) {
        log.info("Enviando correo de notificación de alta de cuenta para: {}", request.usuario());
        //SEND WELCOME EMAIL
        Map<String, Object> vars = new HashMap<>();
        vars.put("usuario", request.usuario());
        vars.put("fiso", request.fiso());
        vars.put("cuenta", request.cuenta());
        vars.put("fecha", request.fecha());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(request.usuario())
                .subject("Envio de Notificacion de Alta de Cuenta de Cheques")
                .templateName("CuentaNueva")
                .templateVariables(vars)
                .build();

        notificationService.sendEmailSolicitudCuenta(notificationDTO);

        return Response.<String>builder()
                .statusCode(HttpStatus.OK.value())
                .message("La solicitud ha sido enviada correctamente.")
                .data("Un correo se envio con los detalles.")
                .build();
    }
}








