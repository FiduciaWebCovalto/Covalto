package com.fiduciawebmovil.fisocuenta.dtos;


import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.fisocuenta.entity.FFideicoCuebanId;
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
public class FFideicoCuebanDTO {
    private FFideicoCuebanId id;

    @Column(length = 25)
    private String ffcbStatus;
 @Column
    private String fcbaTitular;
    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaClasTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaNumTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaSubCuenta;
}
