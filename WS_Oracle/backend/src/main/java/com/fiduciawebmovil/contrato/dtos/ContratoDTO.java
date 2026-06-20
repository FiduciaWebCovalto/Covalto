package com.fiduciawebmovil.contrato.dtos;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fiduciawebmovil.cueban.entity.FCueban;
import com.fiduciawebmovil.fusuario.entity.FUsuario;
import com.fiduciawebmovil.subcuenta.entity.FSubcuenta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class ContratoDTO {

    private Long ctoNumContrato;

    private String ctoNomContrato;
    private List<FUsuario> f_usuario;    
    private List<FCueban> f_cueban;
    @JsonManagedReference// if helps avoid recursion loop by ignoring the userDTO withing the AccountDTO
   private List<FSubcuenta> fsubcuenta;
}
