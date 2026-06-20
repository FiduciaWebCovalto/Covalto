package com.bancomext.domain;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import java.util.List;

public class ClavesDTO {
    
    public Claves id;
    
    public String cveDescClave;

    public BigDecimal cveLiminfClave;

    public ClavesDTO() {

    }
    @Override
    public String toString() {
        return  this.id.cveNumClave+"-"+this.id.cveNumSecClave+"-"+this.cveDescClave;
    }  
    
    public Long cveLimsupClave;

    
    public String cveFormaEmpCve;

    
    public BigDecimal cveAnoAltaReg;

    
    public BigDecimal cveMesAltaReg;

    
    public BigDecimal cveDiaAltaReg;

    
    public BigDecimal cveAnoUltMod;

    
    public BigDecimal cveMesUltMod;

    
    public BigDecimal cveDiaUltMod;

    
    public String cveCveStClave;

    
    public String cveParam1;

    
    public String cveDescParam1;

    
    public String cveParam2;

    
    public String cveDescParam2;

    
    public String cveParam3;

    
    public String cveDescParam3;

    public Claves getId() { return id; }
    public void setId(Claves id) { this.id = id;}

    
    public String getCveDescClave() {
        return cveDescClave;
    }

    public void setCveDescClave(final String cveDescClave) {
        this.cveDescClave = cveDescClave;
    }


    public BigDecimal getCveLiminfClave() {
        return cveLiminfClave;
    }

    public void setCveLiminfClave(final BigDecimal cveLiminfClave) {
        this.cveLiminfClave = cveLiminfClave;
    }

    public Long getCveLimsupClave() {
        return cveLimsupClave;
    }

    public void setCveLimsupClave(final Long cveLimsupClave) {
        this.cveLimsupClave = cveLimsupClave;
    }

    public String getCveFormaEmpCve() {
        return cveFormaEmpCve;
    }

    public void setCveFormaEmpCve(final String cveFormaEmpCve) {
        this.cveFormaEmpCve = cveFormaEmpCve;
    }

    public BigDecimal getCveAnoAltaReg() {
        return cveAnoAltaReg;
    }

    public void setCveAnoAltaReg(final BigDecimal cveAnoAltaReg) {
        this.cveAnoAltaReg = cveAnoAltaReg;
    }

    public BigDecimal getCveMesAltaReg() {
        return cveMesAltaReg;
    }

    public void setCveMesAltaReg(final BigDecimal cveMesAltaReg) {
        this.cveMesAltaReg = cveMesAltaReg;
    }

    public BigDecimal getCveDiaAltaReg() {
        return cveDiaAltaReg;
    }

    public void setCveDiaAltaReg(final BigDecimal cveDiaAltaReg) {
        this.cveDiaAltaReg = cveDiaAltaReg;
    }

    public BigDecimal getCveAnoUltMod() {
        return cveAnoUltMod;
    }

    public void setCveAnoUltMod(final BigDecimal cveAnoUltMod) {
        this.cveAnoUltMod = cveAnoUltMod;
    }

    public BigDecimal getCveMesUltMod() {
        return cveMesUltMod;
    }

    public void setCveMesUltMod(final BigDecimal cveMesUltMod) {
        this.cveMesUltMod = cveMesUltMod;
    }

    public BigDecimal getCveDiaUltMod() {
        return cveDiaUltMod;
    }

    public void setCveDiaUltMod(final BigDecimal cveDiaUltMod) {
        this.cveDiaUltMod = cveDiaUltMod;
    }

    public String getCveCveStClave() {
        return cveCveStClave;
    }

    public void setCveCveStClave(final String cveCveStClave) {
        this.cveCveStClave = cveCveStClave;
    }

    public String getCveParam1() {
        return cveParam1;
    }

    public void setCveParam1(final String cveParam1) {
        this.cveParam1 = cveParam1;
    }

    public String getCveDescParam1() {
        return cveDescParam1;
    }

    public void setCveDescParam1(final String cveDescParam1) {
        this.cveDescParam1 = cveDescParam1;
    }

    public String getCveParam2() {
        return cveParam2;
    }

    public void setCveParam2(final String cveParam2) {
        this.cveParam2 = cveParam2;
    }

    public String getCveDescParam2() {
        return cveDescParam2;
    }

    public void setCveDescParam2(final String cveDescParam2) {
        this.cveDescParam2 = cveDescParam2;
    }

    public String getCveParam3() {
        return cveParam3;
    }

    public void setCveParam3(final String cveParam3) {
        this.cveParam3 = cveParam3;
    }

    public String getCveDescParam3() {
        return cveDescParam3;
    }

    public void setCveDescParam3(final String cveDescParam3) {
        this.cveDescParam3 = cveDescParam3;
    }

}
