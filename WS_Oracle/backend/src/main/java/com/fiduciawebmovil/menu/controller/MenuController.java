package com.fiduciawebmovil.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiduciawebmovil.menu.entity.FFuncion;
import com.fiduciawebmovil.menu.repo.MenuRepository;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "*") // Permite peticiones desde el frontend
public class MenuController {
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/usuario/{idPerfil}")
    public ResponseEntity<List<FFuncion>> obtenerMenuUsuario(@PathVariable Long idPerfil) {
        // Retorna la estructura de árbol (Padre y sus hijos se cargan automáticamente por FetchType.EAGER)
        List<FFuncion> menus = menuRepository.findMenuPadreByPerfil(idPerfil);
        return ResponseEntity.ok(menus);
    }
}
