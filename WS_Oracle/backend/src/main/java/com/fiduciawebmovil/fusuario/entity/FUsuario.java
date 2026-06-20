package com.fiduciawebmovil.fusuario.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiduciawebmovil.contrato.entity.Contrato;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Data
@Builder
@Table(name = "f_usuario")
@AllArgsConstructor
@NoArgsConstructor
public class FUsuario {


    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private String fusuIdUsuario;

    @Column(length = 150)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String fusuNombreUsuario;

   @JsonIgnoreProperties({"users", "handler", "hibernateLazyInitializer"})
    @ManyToMany
    @JoinTable(
        name = "f_usufid",
        joinColumns = @JoinColumn(name="fusu_id_usuario"),
        inverseJoinColumns = @JoinColumn(name="ffid_id_fideicomiso"),
        uniqueConstraints = { @UniqueConstraint(columnNames = {"fusu_id_usuario", "ffid_id_fideicomiso"})}
    )
    private List<Contrato> contrato;


    public String getFusuIdUsuario(){
        return fusuIdUsuario;
    }    

    public FUsuario(String fusuIdUsuario) {
        //this.fusuIdUsuario = fusuIdUsuario;
    }

    public void setFusuIdUsuario(final String fusuIdusuario){
         this.fusuIdUsuario = fusuIdusuario;   
    }
    public String getFusuNombreUsuario() {
        return fusuNombreUsuario;
    }

    public void setFusuNombreUsuario(final String fusuNombreUsuario) {
        this.fusuNombreUsuario = fusuNombreUsuario;
    }

    public List<Contrato> getContrato() {
        return contrato;
    }

    public void setContrato(List<Contrato> contrato) {
        this.contrato = contrato;
    }




}
