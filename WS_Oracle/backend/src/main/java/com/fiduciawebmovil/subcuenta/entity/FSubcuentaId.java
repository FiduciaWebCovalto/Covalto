package com.fiduciawebmovil.subcuenta.entity;

import com.fiduciawebmovil.contrato.entity.Contrato;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Embeddable
public class FSubcuentaId implements Serializable{

    @Column(precision = 10, scale = 0)
    private Long fsctIdSubCuenta;

    
    @Column(precision = 10, scale = 0)
    private Long fsctIdFideicomiso;


    public Long getFsctIdSubCuenta() {
        return fsctIdSubCuenta;
    }

    public Long getFsctIdFideicomiso() {
        return fsctIdFideicomiso;
    }

    public void setFsctIdFideicomiso(Long fsctIdFideicomiso) {
        this.fsctIdFideicomiso = fsctIdFideicomiso;
    }

    public void setFsctIdSubCuenta(final Long fsctIdSubCuenta) {
        this.fsctIdSubCuenta = fsctIdSubCuenta;
    }


}
