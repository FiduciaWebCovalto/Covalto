package com.fiduciawebmovil.retcomp2.services;


import com.fiduciawebmovil.retcomp2.entity.FRetComp2;
import com.fiduciawebmovil.retcomp2.repo.FRetComp2Repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class FRetComp2Impl implements FRetComp2Service {
    @Autowired
    private FRetComp2Repository repositorio; // Inyección del repositorio 

    @Override
    @Transactional
    public FRetComp2 save(FRetComp2 id) {
        return repositorio.save(id);
    }

}









