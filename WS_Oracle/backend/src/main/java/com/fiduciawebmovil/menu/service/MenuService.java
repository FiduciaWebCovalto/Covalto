package com.fiduciawebmovil.menu.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.fiduciawebmovil.menu.dtos.FuncionMenuDTO;
import com.fiduciawebmovil.menu.entity.FFuncion;
import com.fiduciawebmovil.menu.repo.MenuRepository;
@Service
public class MenuService {
       @Autowired
    private MenuRepository menuRepository;

    public List<FFuncion> obtenerMenuPorPerfil(Long idPerfil) {
        return menuRepository.findMenuPadreByPerfil(idPerfil);
    }
}
