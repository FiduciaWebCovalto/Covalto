package com.fiduciawebmovil.tipocamb.repo;

import com.fiduciawebmovil.tipocamb.entity.Tipocamb;
import com.fiduciawebmovil.tipocamb.entity.TipocambId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TipocambRepository extends JpaRepository<Tipocamb, TipocambId> {

    List<Tipocamb> findByIdTicNumPaisAndIdTicAnoAltaRegAndIdTicMesAltaRegAndIdTicDiaAltaReg
    (Long ticNumPais,Long ticAnoAltaReg,Long ticMesAltaReg,Long ticDiaAltaReg);

}
