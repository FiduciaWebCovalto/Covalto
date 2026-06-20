package com.fiduciawebmovil.fPerfil.services;

import com.fiduciawebmovil.fPerfil.dtos.FPerfilDTO;
import com.fiduciawebmovil.fPerfil.dtos.mapper.DtoMapperFPerfil;
import com.fiduciawebmovil.fPerfil.entity.FPerfil;
import com.fiduciawebmovil.fPerfil.repo.FPerfilRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;


@Service
@Transactional
@Slf4j
public class FPerfilServiceImpl implements FPerfilService {

    @Autowired
    private FPerfilRepository fperfilRepository; // Inyección del repositorio

   @Override
    @Transactional(readOnly = true)
    public List<FPerfilDTO> findAll() {
        List<FPerfil> fperfil = (List<FPerfil>) 
        fperfilRepository.findAll();
        return fperfil
                .stream()
                .map(u -> DtoMapperFPerfil.builder().setMapper(u).build())
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<FPerfilDTO> findById(Long id) {
        return fperfilRepository.findById(id).map(u ->
             DtoMapperFPerfil
                .builder()
                .setMapper(u)
                .build());

    }


}









