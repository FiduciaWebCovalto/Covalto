package com.fiduciawebmovil.tipocamb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.terceros.entity.TercerosId;
import  java.util.Objects;


@Embeddable
public class TipocambId implements Serializable{

   

    @Column(precision = 10, scale = 0)
    private Long ticNumPais;

    @Column(precision = 4, scale = 0)
    private Long ticAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private Long ticMesAltaReg;

    @Column(precision = 2, scale = 0)
    private Long ticDiaAltaReg;

    @Column(precision = 10, scale = 0)
    private Long ticHoraAlta;

    @Column(precision = 10, scale = 0)
    private Long ticMinutoAlta;



        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipocambId that = (TipocambId) o;
        return Objects.equals(ticNumPais, that.ticNumPais) &&
         Objects.equals(ticAnoAltaReg, that.ticAnoAltaReg) &&
          Objects.equals(ticMesAltaReg, that.ticMesAltaReg) &&
         Objects.equals(ticDiaAltaReg, that.ticDiaAltaReg) &&
          Objects.equals(ticHoraAlta, that.ticHoraAlta) &&
         Objects.equals(ticMinutoAlta, that.ticMinutoAlta);
    }


    public TipocambId() {
        }


    @Override
    public int hashCode() {
        return Objects.hash(ticNumPais, ticAnoAltaReg,ticMesAltaReg,
            ticDiaAltaReg,ticHoraAlta,ticMinutoAlta
        );
    }


    public TipocambId(Long ticNumPais, Long ticAnoAltaReg, Long ticMesAltaReg, Long ticDiaAltaReg, Long ticHoraAlta,
            Long ticMinutoAlta) {
        this.ticNumPais = ticNumPais;
        this.ticAnoAltaReg = ticAnoAltaReg;
        this.ticMesAltaReg = ticMesAltaReg;
        this.ticDiaAltaReg = ticDiaAltaReg;
        this.ticHoraAlta = ticHoraAlta;
        this.ticMinutoAlta = ticMinutoAlta;
    }


    public Long getTicNumPais() {
        return ticNumPais;
    }


    public void setTicNumPais(Long ticNumPais) {
        this.ticNumPais = ticNumPais;
    }


    public Long getTicAnoAltaReg() {
        return ticAnoAltaReg;
    }


    public void setTicAnoAltaReg(Long ticAnoAltaReg) {
        this.ticAnoAltaReg = ticAnoAltaReg;
    }


    public Long getTicMesAltaReg() {
        return ticMesAltaReg;
    }


    public void setTicMesAltaReg(Long ticMesAltaReg) {
        this.ticMesAltaReg = ticMesAltaReg;
    }


    public Long getTicDiaAltaReg() {
        return ticDiaAltaReg;
    }


    public void setTicDiaAltaReg(Long ticDiaAltaReg) {
        this.ticDiaAltaReg = ticDiaAltaReg;
    }


    public Long getTicHoraAlta() {
        return ticHoraAlta;
    }


    public void setTicHoraAlta(Long ticHoraAlta) {
        this.ticHoraAlta = ticHoraAlta;
    }


    public Long getTicMinutoAlta() {
        return ticMinutoAlta;
    }


    public void setTicMinutoAlta(Long ticMinutoAlta) {
        this.ticMinutoAlta = ticMinutoAlta;
    }
  
}
