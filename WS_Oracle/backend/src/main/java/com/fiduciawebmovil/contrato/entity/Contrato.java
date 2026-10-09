package com.fiduciawebmovil.contrato.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiduciawebmovil.cuentasinversion.entity.FCuentasInversion;
import com.fiduciawebmovil.fusuario.entity.FUsuario;


@Entity
@Table(name = "contrato")
@NoArgsConstructor
public class Contrato {

    @Id
    @Column(nullable = false, updatable = false)
    private Long ctoNumContrato;

    @JsonIgnoreProperties({"contrato", "handler", "hibernateLazyInitializer"})
    @ManyToMany(mappedBy = "contrato")
    private List<FUsuario> f_usuario;    

    @JsonIgnoreProperties({"contrato", "handler", "hibernateLazyInitializer"})
    @ManyToMany(mappedBy = "contrato")
    private List<FCuentasInversion> f_cuentas_inversion;     
   

    @Column(length = 1000)
    private String ctoNomContrato;


    public Long getCtoNumContrato() {
        return ctoNumContrato;
    }


    public void setCtoNumContrato(Long ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public String getCtoNomContrato() {
        return ctoNomContrato;
    }

    public void setCtoNomContrato(String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }
}
