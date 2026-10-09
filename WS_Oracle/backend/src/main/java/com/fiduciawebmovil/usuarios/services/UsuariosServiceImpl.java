package com.fiduciawebmovil.usuarios.services;

import com.fiduciawebmovil.notification.services.*;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.fiduciawebmovil.auth_users.dtos.UpdatePasswordRequest;
import com.fiduciawebmovil.exceptions.BadRequestException;
import com.fiduciawebmovil.exceptions.NotFoundException;
import com.fiduciawebmovil.notification.dtos.NotificationDTO;
import com.fiduciawebmovil.res.Response;
import com.fiduciawebmovil.usuarios.entity.Usuarios;
import com.fiduciawebmovil.usuarios.repo.UsuariosRepository;



@Service
@Transactional
@Slf4j
@Builder
public class UsuariosServiceImpl implements UsuariosService {
    private final UsuariosRepository userRepo = null;
    private final NotificationService notificationService = null;
    private final PasswordEncoder passwordEncoder = null;

    @Autowired
    private UsuariosRepository repositorio; // Inyección del repositorio 

    /*@Override
    @Transactional
    public Usuarios save(Usuarios id) {
        return repositorio.save(id);
    }*/

       @Override
    public Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest) {
        Usuarios user = getCurrentLoggedInUser();

        String newPassword = updatePasswordRequest.getNewPassword();
        String oldPassword = updatePasswordRequest.getOldPassword();

        if (oldPassword == null || newPassword == null) {
            throw new BadRequestException("Se requiere la antigua y la nueva Contraseña");
        }

        // Validate the old password.
        if (!passwordEncoder.matches(oldPassword, user.getUsuPassword())) {
            throw new BadRequestException("La antigua Contraseña es Incorrecta.");
        }
        user.setUsuPassword(passwordEncoder.encode(newPassword));
        user.setUsuFechaUltAcceso(LocalDateTime.now());

        repositorio.save(user);


        // Send password change confirmation email.
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("name", user.getUsuNomUsuario());

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(user.getUsuEmail())
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
    public Usuarios getCurrentLoggedInUser() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null) {
            throw new NotFoundException("Usuario no autenticado");
        }
        String email = authentication.getName();

        return userRepo.findByUsuEmail(email).orElseThrow(() -> new NotFoundException("Usuario no Valido!"));
    }

}









