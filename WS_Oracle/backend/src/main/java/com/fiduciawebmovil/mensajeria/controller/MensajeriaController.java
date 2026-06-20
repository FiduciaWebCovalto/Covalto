package com.fiduciawebmovil.mensajeria.controller;
import lombok.RequiredArgsConstructor;

import com.fiduciawebmovil.mensajeria.services.MensajeriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mensajeria")
public class MensajeriaController {

@Autowired
private MensajeriaService servicio;


@PostMapping("/enviar-correo")
    public String enviarEmail(
            @RequestParam String destinatario,
            @RequestParam String asunto,
            @RequestParam String cuerpo) {
        
        try {
            servicio.sendEmail(destinatario, asunto, cuerpo);
            return "Correo enviado exitosamente a: " + destinatario;
        } catch (Exception e) {
            return "Error al enviar el correo: " + e.getMessage();
        }
    }
    
}
