package com.fiduciawebmovil.tipocamb.services;

import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.repo.FideicomRepository;
import com.fiduciawebmovil.tipocamb.entity.Tipocamb;
import com.fiduciawebmovil.tipocamb.repo.TipocambRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
@Slf4j
public class TipocambServiceImpl implements TipocambService {
    @Autowired
    private TipocambRepository repositorio; // Inyección del repositorio 

    @Override
    @Transactional(readOnly = true)
    public List<Tipocamb> findByIdTicNumPaisAndTicAnoAltaRegAndTicMesAltaRegAndTicDiaAltaReg
    (Long ticNumPais,Long ticAnoAltaReg,Long ticMesAltaReg,Long ticDiaAltaReg){
        return (List<Tipocamb>) repositorio.findByIdTicNumPaisAndIdTicAnoAltaRegAndIdTicMesAltaRegAndIdTicDiaAltaReg
        ( ticNumPais, ticAnoAltaReg, ticMesAltaReg, ticDiaAltaReg);
    }

}









