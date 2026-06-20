package com.fiduciawebmovil.menu.entity;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
@Entity
@Table(name = "f_funcion")
public class FFuncion {
    @Id
    @Column(nullable = false, updatable = false)
    private Long ffunIdFuncion;

    @Column(length = 100)
    private String ffunNomMenu;

    @Column(name = "NIVEL")
    private Integer nivel;
    
    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Column
    private String ffunNombreFuncion;

    @Column(precision = 2, scale = 0)
    private BigDecimal ffunOrden;

    @Column
    private Boolean estado;

    @Column(length = 50)
    private String icono;    

    public Long getFfunIdFuncion() {
        return ffunIdFuncion;
    }

    public void setFfunIdFuncion(Long ffunIdFuncion) {
        this.ffunIdFuncion = ffunIdFuncion;
    }

    public String getFfunNomMenu() {
        return ffunNomMenu;
    }

    public void setFfunNomMenu(String ffunNomMenu) {
        this.ffunNomMenu = ffunNomMenu;
    }

    public String getFfunNombreFuncion() {
        return ffunNombreFuncion;
    }

    public void setFfunNombreFuncion(String ffunNombreFuncion) {
        this.ffunNombreFuncion = ffunNombreFuncion;
    }

    public BigDecimal getFfunOrden() {
        return ffunOrden;
    }

    public void setFfunOrden(BigDecimal ffunOrden) {
        this.ffunOrden = ffunOrden;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public FFuncion getPadre() {
        return padre;
    }

    public void setPadre(FFuncion padre) {
        this.padre = padre;
    }

    public List<FFuncion> getSubmenus() {
        return submenus;
    }

    public void setSubmenus(List<FFuncion> submenus) {
        this.submenus = submenus;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FFUN_ID_PADRE")
    @JsonBackReference
    public FFuncion padre;

    @OneToMany(mappedBy = "padre", fetch = FetchType.LAZY)
    @JsonManagedReference
    @JsonInclude(JsonInclude.Include.NON_EMPTY) // Oculta la lista si está vacía
    @OrderBy("FFUN_ORDEN ASC")
    public List<FFuncion> submenus;    
}
