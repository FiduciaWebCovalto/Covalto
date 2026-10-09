package com.fiduciawebmovil.retinver.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import  java.util.Objects;


@Embeddable
public class FCtoinvRetId  implements Serializable {

    private Long fcinIdCtoInversion;
    private Long fretIdRetiro;


        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FCtoinvRetId that = (FCtoinvRetId) o;
        return Objects.equals(fcinIdCtoInversion, that.fcinIdCtoInversion) &&
         Objects.equals(fretIdRetiro, that.fretIdRetiro);
    }


    public FCtoinvRetId(Long fcinIdCtoInversion, Long fretIdRetiro) {
            this.fcinIdCtoInversion = fcinIdCtoInversion;
            this.fretIdRetiro = fretIdRetiro;
        }


    public FCtoinvRetId() {
        }


    public Long getFcinIdCtoInversion() {
            return fcinIdCtoInversion;
        }


        public void setFcinIdCtoInversion(Long fcinIdCtoInversion) {
            this.fcinIdCtoInversion = fcinIdCtoInversion;
        }


        public Long getFretIdRetiro() {
            return fretIdRetiro;
        }


        public void setFretIdRetiro(Long fretIdRetiro) {
            this.fretIdRetiro = fretIdRetiro;
        }


    @Override
    public int hashCode() {
        return Objects.hash(fcinIdCtoInversion, fretIdRetiro
        );
    }


}
