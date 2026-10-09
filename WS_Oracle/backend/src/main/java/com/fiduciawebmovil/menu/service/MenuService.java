package com.fiduciawebmovil.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
