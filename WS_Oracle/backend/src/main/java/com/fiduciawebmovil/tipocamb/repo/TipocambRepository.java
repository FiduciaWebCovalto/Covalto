package com.fiduciawebmovil.tipocamb.repo;

import com.fiduciawebmovil.fideicom.dtos.FideicomDTO;
import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.fideicom.entity.FideicomId;
import com.fiduciawebmovil.tipocamb.entity.Tipocamb;
import com.fiduciawebmovil.tipocamb.entity.TipocambId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TipocambRepository extends JpaRepository<Tipocamb, TipocambId> {

    List<Tipocamb> findByIdTicNumPaisAndIdTicAnoAltaRegAndIdTicMesAltaRegAndIdTicDiaAltaReg
    (Long ticNumPais,Long ticAnoAltaReg,Long ticMesAltaReg,Long ticDiaAltaReg);

}
