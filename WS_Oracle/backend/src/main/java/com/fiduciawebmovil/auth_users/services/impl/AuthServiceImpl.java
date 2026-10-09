package com.fiduciawebmovil.auth_users.services.impl;

import com.fiduciawebmovil.auth_users.dtos.LoginRequest;
import com.fiduciawebmovil.auth_users.dtos.LoginResponse;
import com.fiduciawebmovil.auth_users.dtos.RegistrationRequest;
import com.fiduciawebmovil.auth_users.dtos.ResetPasswordRequest;
import com.fiduciawebmovil.auth_users.entity.EnviaCorreo;
import com.fiduciawebmovil.auth_users.entity.PasswordResetCode;
import com.fiduciawebmovil.auth_users.repo.PasswordResetCodeRepo;
import com.fiduciawebmovil.auth_users.services.AuthService;
import com.fiduciawebmovil.auth_users.services.CodeGenerator;
import com.fiduciawebmovil.exceptions.BadRequestException;
import com.fiduciawebmovil.exceptions.NotFoundException;
import com.fiduciawebmovil.feccont.dtos.FeccontDTO;
import com.fiduciawebmovil.feccont.repo.FeccontRepository;
import com.fiduciawebmovil.feccont.services.FeccontService;
import com.fiduciawebmovil.notification.dtos.NotificationDTO;
import com.fiduciawebmovil.notification.services.NotificationService;
import com.fiduciawebmovil.password.repo.FPpasswordRepository;
import com.fiduciawebmovil.personal.entity.Personal;
import com.fiduciawebmovil.personal.repo.PersonalRepository;
import com.fiduciawebmovil.res.Response;
import com.fiduciawebmovil.role.entity.Role;
import com.fiduciawebmovil.role.repo.RoleRepo;
import com.fiduciawebmovil.security.TokenService;
import com.fiduciawebmovil.usuarios.entity.Usuarios;
import com.fiduciawebmovil.usuarios.repo.UsuariosRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final UsuariosRepository userRepo;
    private final FeccontRepository fechaRepo;
    private final RoleRepo roleRepo;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private final NotificationService notificationService;
    private final PersonalRepository perRepo;
    @Autowired
    private FeccontService feccontService;
    @Autowired
    private FPpasswordRepository repoPassword;
    private final CodeGenerator codeGenerator;
    private final PasswordResetCodeRepo passwordResetCodeRepo;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Value("${password.reset.link}")
    private String resetLink;


    @Override
    public Response<String> register(RegistrationRequest request) {

        List<Role> roles;

        if (request.getRoles() == null || request.getRoles().isEmpty()) {
            //DEFAULT TO CUSTOMER
            Role defaultRole = roleRepo.findByName("CUSTOMER")
                    .orElseThrow(() -> new NotFoundException("CUSTOMER ROLE NOT FOUND"));

            roles = Collections.singletonList(defaultRole);
        } else {
            roles = request.getRoles().stream()
                    .map(roleName -> roleRepo.findByName(roleName)
                            .orElseThrow(() -> new NotFoundException("ROLE NOT FOUND" + roleName)))
                    .toList();
        }

        if (userRepo.findByUsuEmail(request.getUsuEmail()).isPresent()) {
            throw new BadRequestException("El correo ya se encuentra registrado.");
        }
        log.debug("Rol default: {}", roles);
        log.debug("Antes de insertar spring boot: {}", request);
        //devuelve el password configurado en la bd
        String PasswordInicial=repoPassword.devuelveContrasena(Long.parseLong("1"));
        Personal personal = new Personal();
        personal.setPerNumUsuario(request.getUsuNumUsuario());
        personal.setPerNomUsuario(request.getUsuNomUsuario());
        personal.setPerDireccion(request.getPerDireccion());
        personal.setPerExpLaboral(request.getPerExpLaboral());
        personal.setPerNivelEstudios(request.getUsuEmail());
        personal.setPerRfc(request.getPerRfc());
        personal.setPerTelefono(request.getPerTelefono());
        perRepo.save(personal);
        LocalDate localDate = LocalDate.parse(request.getUsuFechaUltAcceso(), formatter);
        LocalDateTime localDateTime = localDate.atStartOfDay();
        Usuarios usuario = new Usuarios();
        usuario.setUsuNumUsuario(request.getUsuNumUsuario());
        usuario.setUsuNomUsuario(request.getUsuNomUsuario());
        usuario.setUsuNumPuesto(request.getUsuNumPuesto());
        usuario.setUsuNomPuesto(request.getUsuNomPuesto());
        usuario.setUsuEmail(request.getUsuEmail());
        usuario.setUsuToken(request.getUsuToken());
        usuario.setUsuCveStUsuario(request.getUsuCveStUsuario());
        usuario.setUsuMontoAutorizado(request.getUsuMontoAutorizado());
        usuario.setUsuFechaUltAcceso(localDateTime);
        usuario.setUsuTipoUsuario(request.getUsuTipoUsuario());
        usuario.setUsuPassword(passwordEncoder.encode(PasswordInicial));
        usuario.setRoles(roles);
        Usuarios savedUser = userRepo.save(usuario);
        /*Usuarios user = Usuarios.builder()
                .usuNumUsuario(request.getUsuNumUsuario())
                .usuNomUsuario(request.getUsuNomUsuario())
                .usuNumPuesto(request.getUsuNumPuesto())
                .usuNomPuesto(request.getUsuNomPuesto())
                .usuEmail(request.getUsuEmail())
                .usuToken(request.getUsuToken())
                .usuCveStUsuario(request.getUsuCveStUsuario())
                .usuMontoAutorizado(request.getUsuMontoAutorizado())
                .usuPassword(passwordEncoder.encode(request.getUsuPassword()))
                .roles(roles)
                .build();

        Usuarios savedUser = userRepo.save(user);*/

        //SEND WELCOME EMAIL
        Map<String, Object> vars = new HashMap<>();
        vars.put("name", savedUser.getUsuNomUsuario());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(savedUser.getUsuEmail())
                .subject("Bienvenido a FiduciaWeb 🎉")
                .templateName("welcome")
                .templateVariables(vars)
                .build();

        notificationService.sendEmail(notificationDTO, savedUser);

        return Response.<String>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Tu cuenta ha sido creada correctamente!")
                .data("Un Corre de confirmación te ha sido enviado!")
                .build();
    }

    @Override
    public Response<LoginResponse> login(LoginRequest loginRequest) {

        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        Usuarios user = userRepo.findByUsuEmail(email).orElseThrow(() -> new NotFoundException("Email No registrado"));

        if (!passwordEncoder.matches(password, user.getUsuPassword())) {
            throw new BadRequestException("La contraseña no coincide.");
        }

        String token = tokenService.generateToken(user.getUsuEmail());
        String fecha = "";
        List<FeccontDTO> listaDTO = feccontService.findAll();
        for (FeccontDTO dto : listaDTO) {
                fecha=dto.getFcoFecha();
                // Accede a los valores usando los getters de tu DTO
                log.debug("Valor del campo Fecha: {}", dto.getFcoFecha());
        }
        LoginResponse loginResponse = LoginResponse.builder()
                .roles(user.getRoles().stream().map(Role::getName).toList())
                .usuNomPuesto(user.getUsuNomPuesto())
                .usuNomUsuario(user.getUsuNomUsuario())
                .usuNumPuesto(user.getUsuNumPuesto().toString())
                .usuNumUsuario(user.getUsuNumUsuario().toString())
                .token(token)
                .fecha(fecha)
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

        Usuarios user = userRepo.findByUsuEmail(email).orElseThrow(() -> new NotFoundException("User Not Found"));
        passwordResetCodeRepo.deleteByUserUsuNumUsuario(user.getUsuNumUsuario());

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
        templateVariables.put("name", user.getUsuNomUsuario());
        templateVariables.put("resetLink", resetLink + code);


        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(user.getUsuEmail())
                .subject("Codigo de Reestablecimiendo de Contraseña")
                .templateName("password-reset")
                .templateVariables(templateVariables)
                .build();

        notificationService.sendEmail(notificationDTO, user);


        return Response.builder()
                .statusCode(HttpStatus.OK.value())
                .message("El codigo para reestablecer tu Contraseña ha sido enviado.")
                .build();

    }

    @Override
    @Transactional
    public Response<?> updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest) {
        String code = resetPasswordRequest.getCode();
        String newPassword = resetPasswordRequest.getNewPassword();

        // Find and validate code

        PasswordResetCode resetCode = passwordResetCodeRepo.findByCode(code)
                .orElseThrow(() -> new BadRequestException("Codigo invalido."));

        // Check expiration first
        if (resetCode.getExpiryDate().isBefore(LocalDateTime.now())) {
            passwordResetCodeRepo.delete(resetCode); // Clean up expired code
            throw new BadRequestException("El codigo para resetear la Contraseña ha expirado.");
        }


        //update the pasword
        Usuarios user = resetCode.getUser();
        user.setUsuPassword(passwordEncoder.encode(newPassword));
        userRepo.save(user);

        // Delete the code immediately after successful use
        passwordResetCodeRepo.delete(resetCode);


        // Send confirmation email
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("name", user.getUsuNomUsuario());

        NotificationDTO confirmationEmail = NotificationDTO.builder()
                .recipient(user.getUsuEmail())
                .subject("Contraseña Actualizada Correctamente!")
                .templateName("password-update-confirmation")
                .templateVariables(templateVariables)
                .build();

        notificationService.sendEmail(confirmationEmail, user);

        return Response.builder()
                .statusCode(HttpStatus.OK.value())
                .message("Contraseña actualizada Correctamente!")
                .build();
    }


    private LocalDateTime calculateExpiryDate() {
        return LocalDateTime.now().plusHours(5);
    }

     @Override
    public Response<String> notificasolicitud(EnviaCorreo request) {
        //SEND WELCOME EMAIL
        Map<String, Object> vars = new HashMap<>();
        vars.put("name", request.usuario());
        vars.put("fideicomiso", request.fideicomiso());
        vars.put("tipo", request.tipo());
        vars.put("descripcion", request.descripcion());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(request.usuario())
                .subject("Envio de Solicitud "+request.tipo())
                .templateName("solicitudP")
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
    public Response<String> notificasolicitudCuenta(EnviaCorreo request) {
        //SEND WELCOME EMAIL
        Map<String, Object> vars = new HashMap<>();
        vars.put("usuario", request.usuario());
        vars.put("fiso", request.fideicomiso());
        vars.put("cuenta", request.tipo());
        vars.put("fecha", request.descripcion());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(request.usuario())
                .subject("Envio de Notificacion de Alta de Cuenta de Cheques")
                .templateName("account-created")
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








