package com.fiduciawebmovil.traspaso.services;


import com.fiduciawebmovil.retcomp2.entity.FRetComp2;
import com.fiduciawebmovil.retcomp2.repo.FRetComp2Repository;
import com.fiduciawebmovil.retiro.entity.FRetiro;
import com.fiduciawebmovil.retiro.repo.FRetiroRepository;
import com.fiduciawebmovil.traspaso.entity.FTraspaso;
import com.fiduciawebmovil.traspaso.repo.FTraspasoRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FTraspasoImpl implements FTraspasoService {
    @Autowired
    private FTraspasoRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FTraspaso save(FTraspaso id) {
        return repositorio.save(id);
    }

}









