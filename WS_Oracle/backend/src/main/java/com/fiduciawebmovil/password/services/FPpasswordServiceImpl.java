package com.fiduciawebmovil.password.services;

import com.fiduciawebmovil.feccont.dtos.*;
import com.fiduciawebmovil.feccont.dtos.mapper.DtoMapperFeccont;
import com.fiduciawebmovil.feccont.entity.*;
import com.fiduciawebmovil.feccont.repo.*;
import com.fiduciawebmovil.paises.entity.Paises;
import com.fiduciawebmovil.password.entity.FPpassword;
import com.fiduciawebmovil.password.repo.FPpasswordRepository;
import com.fiduciawebmovil.contrato.dtos.ContratoDTO;
import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.exceptions.BadRequestException;
import com.fiduciawebmovil.exceptions.NotFoundException;
import com.fiduciawebmovil.res.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Optional;


@Service
@Transactional
@Slf4j
public class FPpasswordServiceImpl implements FPpasswordService {

    @Autowired
    private FPpasswordRepository repositorio; // Inyección del repositorio

    @Override
    @Transactional(readOnly = true)
    public List<FPpassword> findAll() {
        return (List<FPpassword>) repositorio.findAll();
    }


}









