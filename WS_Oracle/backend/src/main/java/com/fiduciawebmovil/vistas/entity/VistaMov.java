package com.fiduciawebmovil.vistas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "VW_MOVIMIEN")
@NoArgsConstructor
public class VistaMov {

    @Id
    private Long folio;
    private Long fiso;
    private String fecha;
    private String tipo;
    private String importe;
    public Long getFolio() {
        return folio;
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
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getImporte() {
        return importe;
    }
    public void setImporte(String importe) {
        this.importe = importe;
    }
}
