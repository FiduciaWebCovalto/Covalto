package com.fiduciawebmovil.fusuario.services;

import com.fiduciawebmovil.fusuario.dtos.FUsuarioDTO;
import com.fiduciawebmovil.fusuario.entity.FUsuario;
import com.fiduciawebmovil.fusuario.repo.FUsuarioRepository;
import com.fiduciawebmovil.res.Response;

import lombok.extern.slf4j.Slf4j;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;


@Service
@Transactional
@Slf4j
public class FUsuarioServiceImpl implements FUsuarioService {
    private final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private FUsuarioRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<FUsuario> findAll() {
        return (List<FUsuario>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<FUsuario> findByFusuIdUsuario(String fusuIdUsuario) {
        return (List<FUsuario>) repositorio.findByFusuIdUsuario(fusuIdUsuario);
    }

}









