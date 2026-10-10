package com.fiduciawebmovilp.fusuario.services;

import com.fiduciawebmovilp.auth_users.dtos.UpdatePasswordRequest;
import com.fiduciawebmovilp.exceptions.BadRequestException;
import com.fiduciawebmovilp.exceptions.NotFoundException;
import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.fusuario.repo.FUsuarioRepository;
import com.fiduciawebmovilp.notification.dtos.NotificationDTO;
import com.fiduciawebmovilp.notification.services.NotificationService;
import com.fiduciawebmovilp.res.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class FUsuarioServiceImpl implements FUsuarioService {

    private final FUsuarioRepository userRepo;
    private final NotificationService notificationService;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public FUsuario save(FUsuario id) {
        log.info("Guardando usuario: {}", id.getFusuNombreUsuario());
        return userRepo.save(id);
    }

    @Override
    public Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest) {
        FUsuario user = getCurrentLoggedInUser();
        log.info("Actualizando contraseña para el usuario: {}", user.getEmail());

        String newPassword = updatePasswordRequest.getNewPassword();
        String oldPassword = updatePasswordRequest.getOldPassword();

        if (oldPassword == null || newPassword == null) {
            throw new BadRequestException("Se requiere la antigua y la nueva Contraseña");
        }

        // Validate the old password.
        if (!passwordEncoder.matches(oldPassword, user.getPassword())) {
            throw new BadRequestException("La antigua Contraseña es Incorrecta.");
        }
        user.setPassword(passwordEncoder.encode(newPassword));
        user.setFusuUltAcceso(LocalDateTime.now());

        userRepo.save(user);

        // Send password change confirmation email.
        Map<String, Object> templateVariables = Map.of("name", user.getFusuNombreUsuario());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(user.getEmail())
                .subject("Tu Contraseña fue cambiada.")
                .templateName("password-change")
                .templateVariables(templateVariables)
                .build();

        notificationService.sendEmail(notificationDTO, user);

        return Response.builder()
                .statusCode(HttpStatus.OK.value())
                .message("Contraseña cambiada satisfactoriamente!")
                .build();
    }

    @Override
    public FUsuario getCurrentLoggedInUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null) {
            throw new NotFoundException("Usuario no autenticado");
        }
        String email = authentication.getName();
        log.debug("Obteniendo usuario autenticado: {}", email);

        return userRepo.findByEmail(email).orElseThrow(() -> new NotFoundException("Usuario no Valido!"));
    }
}









