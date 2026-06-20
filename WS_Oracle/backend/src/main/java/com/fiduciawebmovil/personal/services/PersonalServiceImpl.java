package com.fiduciawebmovil.personal.services;


import com.fiduciawebmovil.exceptions.BadRequestException;
import com.fiduciawebmovil.exceptions.NotFoundException;
import com.fiduciawebmovil.personal.entity.Personal;
import com.fiduciawebmovil.personal.repo.PersonalRepository;
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
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository repositorio; // Inyección del repositorio

    @Override
    @Transactional(readOnly = true)
    public List<Personal> findAll() {
        return (List<Personal>) repositorio.findAll();
    }

}









