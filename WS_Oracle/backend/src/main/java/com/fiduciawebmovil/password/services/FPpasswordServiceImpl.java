package com.fiduciawebmovil.password.services;

import com.fiduciawebmovil.feccont.dtos.*;
import com.fiduciawebmovil.feccont.entity.*;
import com.fiduciawebmovil.feccont.repo.*;
import com.fiduciawebmovil.password.entity.FPpassword;
import com.fiduciawebmovil.password.repo.FPpasswordRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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









