package com.fiduciawebmovil.claves.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import com.fiduciawebmovil.benefici.entity.BeneficiId;


@Entity
@Table(name = "claves")
@NoArgsConstructor
public class Claves {

    @EmbeddedId
    private ClavesId id;

    @Column(length = 70)
    private String cveDescClave;

    private Long cveLiminfClave;


    public String getCveDescClave() {
        return cveDescClave;
    }

    public void setCveDescClave(final String cveDescClave) {
        this.cveDescClave = cveDescClave;
    }


    public ClavesId getId() {
        return id;
    }

    public void setId(ClavesId id) {
        this.id = id;
    }

    public Long getCveLiminfClave() {
        return cveLiminfClave;
    }

    public void setCveLiminfClave(Long cveLiminfClave) {
        this.cveLiminfClave = cveLiminfClave;
    }

}
