package com.fiduciawebmovil.vistas.services;

import com.fiduciawebmovil.vistas.entity.Vista1;
import com.fiduciawebmovil.vistas.entity.Vista2;
import com.fiduciawebmovil.vistas.entity.Vista3;
import com.fiduciawebmovil.vistas.entity.Vista4;
import com.fiduciawebmovil.vistas.entity.Vista5;
import com.fiduciawebmovil.vistas.entity.Vista6;
import com.fiduciawebmovil.vistas.entity.VistaCom;
import com.fiduciawebmovil.vistas.entity.VistaMov;
import com.fiduciawebmovil.vistas.repo.Vista1Repository;
import com.fiduciawebmovil.vistas.repo.Vista2Repository;
import com.fiduciawebmovil.vistas.repo.Vista3Repository;
import com.fiduciawebmovil.vistas.repo.Vista4Repository;
import com.fiduciawebmovil.vistas.repo.Vista5Repository;
import com.fiduciawebmovil.vistas.repo.Vista6Repository;
import com.fiduciawebmovil.vistas.repo.VistaComRepository;
import com.fiduciawebmovil.vistas.repo.VistaMovRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class Vista1Impl implements Vista1Service {
    @Autowired
    private Vista1Repository repositorio; // Inyección del repositorio 
    @Autowired
    private Vista2Repository repositorio2;
    @Autowired
    private Vista3Repository repositorio3;
        @Autowired
    private Vista4Repository repositorio4;
        @Autowired
    private Vista5Repository repositorio5;
        @Autowired
    private Vista6Repository repositorio6;
        @Autowired
    private VistaMovRepository repositorio7;    
        @Autowired
    private VistaComRepository repositorio8;    

    @Override
    @Transactional
    public  List<Vista1> buscar(Long id) {
        return repositorio.findByFiso(id);
    }

    @Override
    public List<Vista2> buscar2(Long id) {
        return repositorio2.findByFiso(id);
    }

        @Override
    public List<Vista3> buscar3(Long id) {
        return repositorio3.findByFiso(id);
    }
    @Override
    public List<Vista4> buscar4(Long id) {
        return repositorio4.findByFiso(id);
    }   
     @Override
    public List<Vista5> buscar5(Long id) {
        return repositorio5.findByFiso(id);
    }    
    @Override
    public List<Vista6> buscar6(Long id) {
        return repositorio6.findByFiso(id);
    }
    @Override
    public List<VistaMov> buscar7(Long id) {
        return repositorio7.findByFiso(id);
    }
    @Override
    public List<VistaCom> buscar8(Long id) {
        return repositorio8.findByFiso(id);
    }    
}










