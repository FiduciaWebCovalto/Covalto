package com.fiduciawebmovil.claves.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fiduciawebmovil.benefici.entity.BeneficiId;

import  java.util.Objects;



@Embeddable
public class ClavesId  implements Serializable {

    private Long cveNumClave;

    @Column(precision = 10, scale = 0)
    private Long cveNumSecClave;

   public Long getCveNumClave() {
        return cveNumClave;
    }

    public void setCveNumClave(final Long cveNumClave) {
        this.cveNumClave = cveNumClave;
    }

    public Long getCveNumSecClave() {
        return cveNumSecClave;
    }

    public void setCveNumSecClave(final Long cveNumSecClave) {
        this.cveNumSecClave = cveNumSecClave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClavesId that = (ClavesId) o;
        return Objects.equals(cveNumClave, that.cveNumClave) &&
         Objects.equals(cveNumSecClave, that.cveNumSecClave);
    }

    public ClavesId() {
    }

    public ClavesId(Long cveNumClave, Long cveNumSecClave) {
        this.cveNumClave = cveNumClave;
        this.cveNumSecClave = cveNumSecClave;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveNumClave, cveNumSecClave);
    }
}
