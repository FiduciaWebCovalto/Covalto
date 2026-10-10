package com.fiduciawebmovilp.fusuario.controller;

import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.fusuario.services.FUsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class FUsuarioController {

    private final FUsuarioService servicio;

    @PostMapping
    public FUsuario insertar(@RequestBody FUsuario usuario) {
        log.info("Insertando usuario: {}", usuario.getFusuNombreUsuario());
        return servicio.save(usuario);
    }
}
