package com.fiduciawebmovil.fPerfil.dtos.mapper;


import com.fiduciawebmovil.fPerfil.dtos.FPerfilDTO;
import com.fiduciawebmovil.fPerfil.entity.FPerfil;

public class DtoMapperFPerfil {

    private FPerfil fperfil;
    
    private DtoMapperFPerfil() {
    }

    public static DtoMapperFPerfil builder() {
        return new DtoMapperFPerfil();
    }

    public DtoMapperFPerfil setMapper(FPerfil fperfil) {
        this.fperfil = fperfil;
        return this;
    }

    public FPerfilDTO build() {
        if (fperfil == null) {
            throw new RuntimeException("Debe pasar el entity!");
        }
        return new FPerfilDTO(this.fperfil.getFperIdPerfil(),
        this.fperfil.getFperNombrePerfil());
    }
    

}
