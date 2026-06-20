package com.fiduciawebmovil.folios.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Table(name = "folios")
@Entity
@NoArgsConstructor
public class Folios {

    @Id
    @Column(precision = 10, scale = 0)
    private Long folTipoFolio;

    @Column(precision = 10, scale = 0)
    private BigDecimal folNumFolio;

    @Column(length = 25)
    private String folCveStFolio;

    @Column(precision = 10, scale = 0)
    private BigDecimal folNumPrueba;

    public Long getFolTipoFolio() {
        return folTipoFolio;
    }

    public void setFolTipoFolio(final Long folTipoFolio) {
        this.folTipoFolio = folTipoFolio;
    }

    public BigDecimal getFolNumFolio() {
        return folNumFolio;
    }

    public void setFolNumFolio(final BigDecimal folNumFolio) {
        this.folNumFolio = folNumFolio;
    }

    public String getFolCveStFolio() {
        return folCveStFolio;
    }

    public void setFolCveStFolio(final String folCveStFolio) {
        this.folCveStFolio = folCveStFolio;
    }

    public BigDecimal getFolNumPrueba() {
        return folNumPrueba;
    }

    public void setFolNumPrueba(final BigDecimal folNumPrueba) {
        this.folNumPrueba = folNumPrueba;
    }

}
