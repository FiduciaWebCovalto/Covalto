package com.fiduciawebmovil.personal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.math.BigDecimal;


@Entity
public class Personal {

    @Id
    private Long perNumUsuario;

    @Column(length = 50)
    private String perNomUsuario;

    private String perTelefono;
    private String perExpLaboral;
    private String perNivelEstudios;
    private String perRfc;
    private String perDireccion;
    

    public String getPerTelefono() {
        return perTelefono;
    }

    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    public String getPerExpLaboral() {
        return perExpLaboral;
    }

    public void setPerExpLaboral(String perExpLaboral) {
        this.perExpLaboral = perExpLaboral;
    }

    public String getPerNivelEstudios() {
        return perNivelEstudios;
    }

    public void setPerNivelEstudios(String perNivelEstudios) {
        this.perNivelEstudios = perNivelEstudios;
    }

    public String getPerRfc() {
        return perRfc;
    }

    public void setPerRfc(String perRfc) {
        this.perRfc = perRfc;
    }

    public String getPerDireccion() {
        return perDireccion;
    }

    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public Long getPerNumUsuario() {
        return perNumUsuario;
    }

    public void setPerNumUsuario(Long perNumUsuario) {
        this.perNumUsuario = perNumUsuario;
    }

    public String getPerNomUsuario() {
        return perNomUsuario;
    }

    public void setPerNomUsuario(String perNomUsuario) {
        this.perNomUsuario = perNomUsuario;
    }
}
