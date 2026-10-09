package com.fiduciawebmovil.unidades.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.util.Objects;



@Embeddable
public class FUnidadesId {
     private Long funiIdFideicomiso;

    @Column(precision = 10, scale = 0)
    private Long funiIdSubcuenta;

    @Column(length = 50)
    private String funiIdBien;

    @Column(length = 50)
    private String funiIdEdificio;

    @Column(length = 50)
    private String funiIdDepto;

            @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FUnidadesId that = (FUnidadesId) o;
        return Objects.equals(funiIdFideicomiso, that.funiIdFideicomiso) &&
         Objects.equals(funiIdBien, that.funiIdBien) &&
         Objects.equals(funiIdEdificio, that.funiIdEdificio)&&
         Objects.equals(funiIdDepto, that.funiIdDepto)&&
         Objects.equals(funiIdSubcuenta, that.funiIdSubcuenta);
    }
     @Override
    public int hashCode() {
        return Objects.hash(funiIdFideicomiso, funiIdBien,funiIdEdificio,funiIdDepto,funiIdSubcuenta);
    }
     public Long getFuniIdSubcuenta() {
        return funiIdSubcuenta;
    }
     public void setFuniIdSubcuenta(Long funiIdSubcuenta) {
         this.funiIdSubcuenta = funiIdSubcuenta;
     }
     public Long getFuniIdFideicomiso() {
                return funiIdFideicomiso;
            }

            public FUnidadesId() {
    }
            public FUnidadesId(Long funiIdFideicomiso, Long funiIdSubcuenta, 
            String funiIdBien, String funiIdEdificio,
            String funiIdDepto) {
        this.funiIdFideicomiso = funiIdFideicomiso;
        this.funiIdSubcuenta = funiIdSubcuenta;
        this.funiIdBien = funiIdBien;
        this.funiIdEdificio = funiIdEdificio;
        this.funiIdDepto = funiIdDepto;
    }
            public void setFuniIdFideicomiso(Long funiIdFideicomiso) {
                this.funiIdFideicomiso = funiIdFideicomiso;
            }


            public String getFuniIdBien() {
                return funiIdBien;
            }

            public void setFuniIdBien(String funiIdBien) {
                this.funiIdBien = funiIdBien;
            }

            public String getFuniIdEdificio() {
                return funiIdEdificio;
            }

            public void setFuniIdEdificio(String funiIdEdificio) {
                this.funiIdEdificio = funiIdEdificio;
            }

            public String getFuniIdDepto() {
                return funiIdDepto;
            }

            public void setFuniIdDepto(String funiIdDepto) {
                this.funiIdDepto = funiIdDepto;
            }


}
