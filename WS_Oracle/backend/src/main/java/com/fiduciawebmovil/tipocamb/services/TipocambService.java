package com.fiduciawebmovil.tipocamb.services;

import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.tipocamb.entity.Tipocamb;

import java.util.List;

public interface TipocambService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    List<Tipocamb> findByIdTicNumPaisAndTicAnoAltaRegAndTicMesAltaRegAndTicDiaAltaReg
    (Long ticNumPais,Long ticAnoAltaReg,Long ticMesAltaReg,Long ticDiaAltaReg);
}
