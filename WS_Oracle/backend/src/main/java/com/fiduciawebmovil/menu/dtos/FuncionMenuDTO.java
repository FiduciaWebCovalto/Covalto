package com.fiduciawebmovil.menu.dtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class FuncionMenuDTO {
    @Id
    @Column(nullable = false, updatable = false)
    private Long ffunIdFuncion;

    @Column(length = 100)
    private String ffunNomMenu;

    @Column(precision = 10, scale = 0)
    private BigDecimal ffunIdPadre;

    @Column
    private String ffunNombreFuncion;

    @Column(precision = 2, scale = 0)
    private BigDecimal ffunOrden;

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
    public BigDecimal getFfunIdPadre() {
        return ffunIdPadre;
    }
    public void setFfunIdPadre(BigDecimal ffunIdPadre) {
        this.ffunIdPadre = ffunIdPadre;
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
    public List<FuncionMenuDTO> getSubmenus() {
        return submenus;
    }
    public void setSubmenus(List<FuncionMenuDTO> submenus) {
        this.submenus = submenus;
    }
    @Column
    private Boolean estado;

    @Column(length = 50)
    private String icono;
    private List<FuncionMenuDTO> submenus = new ArrayList<>();
}
