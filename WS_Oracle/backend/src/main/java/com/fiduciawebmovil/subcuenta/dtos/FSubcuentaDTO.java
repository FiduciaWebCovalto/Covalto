package com.fiduciawebmovil.subcuenta.dtos;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fiduciawebmovil.posicion.entity.PosicionId;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FSubcuentaDTO {

    private PosicionId id;

    @Column(length = 500)
    private String fsctNombreSubCuenta;

    @Column(length = 25)
    private String fsctStatus;

    
}
