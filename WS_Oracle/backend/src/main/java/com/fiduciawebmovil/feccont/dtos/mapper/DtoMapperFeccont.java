package com.fiduciawebmovil.feccont.dtos.mapper;


import com.fiduciawebmovil.contrato.dtos.ContratoDTO;
import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.feccont.dtos.FeccontDTO;
import com.fiduciawebmovil.feccont.entity.Feccont;

public class DtoMapperFeccont {

    private Feccont feccont;
    
    private DtoMapperFeccont() {
    }

    public static DtoMapperFeccont builder() {
        return new DtoMapperFeccont();
    }

    public DtoMapperFeccont setFecha(Feccont feccont) {
        this.feccont = feccont;
        return this;
    }

    public FeccontDTO build() {
        if (feccont == null) {
            throw new RuntimeException("Debe pasar el entity!");
        }
        return new FeccontDTO(this.feccont.getFcoFecha());
    }
    

}
