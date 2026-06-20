package com.fiduciawebmovil.FileContrato.entity;

import java.io.Serializable;
import jakarta.persistence.Embeddable;


import  java.util.Objects;
@Embeddable
public class PdfDocumentContratoId implements Serializable {
    private Long folio;
    private Long fiso;
    private Long persona;
    
        public PdfDocumentContratoId() {
    }

        public Long getFolio() {
        return folio;
    }

    public Long getPersona() {
            return persona;
        }

        public void setPersona(Long persona) {
            this.persona = persona;
        }

    public PdfDocumentContratoId(Long folio, Long fiso) {
            this.folio = folio;
            this.fiso = fiso;
        }

    public PdfDocumentContratoId(Long folio, Long fiso, Long persona) {
        this.folio = folio;
        this.fiso = fiso;
        this.persona = persona;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public Long getFiso() {
        return fiso;
    }

    public void setFiso(Long fiso) {
        this.fiso = fiso;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PdfDocumentContratoId that = (PdfDocumentContratoId) o;
        return Objects.equals(folio, that.folio) &&
         Objects.equals(fiso, that.fiso) &&
         Objects.equals(persona, that.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folio, fiso,persona);
    }

}
