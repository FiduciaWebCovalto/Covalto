package com.fiduciawebmovil.indices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.math.BigDecimal;


@Table(name = "f_indices")
@Entity
public class FIndices {
    @EmbeddedId
    private FIndicesId id;

    @Column
    private String eindDescripcion;

    @Column(length = 150)
    private String eindFormaEmp;

    @Column(length = 50)
    private String eindParam1;

    @Column(length = 50)
    private String eindDesParam1;

    @Column(length = 50)
    private String eindParam2;

    @Column(length = 50)
    private String eindDesParam2;

    @Column(length = 25)
    private String eindStIndices;

    public FIndicesId getId() {
        return id;
    }

    public void setId(FIndicesId id) {
        this.id = id;
    }

    public String getEindDescripcion() {
        return eindDescripcion;
    }

    public void setEindDescripcion(final String eindDescripcion) {
        this.eindDescripcion = eindDescripcion;
    }

    public String getEindFormaEmp() {
        return eindFormaEmp;
    }

    public void setEindFormaEmp(final String eindFormaEmp) {
        this.eindFormaEmp = eindFormaEmp;
    }

    public String getEindParam1() {
        return eindParam1;
    }

    public void setEindParam1(final String eindParam1) {
        this.eindParam1 = eindParam1;
    }

    public String getEindDesParam1() {
        return eindDesParam1;
    }

    public void setEindDesParam1(final String eindDesParam1) {
        this.eindDesParam1 = eindDesParam1;
    }

    public String getEindParam2() {
        return eindParam2;
    }

    public void setEindParam2(final String eindParam2) {
        this.eindParam2 = eindParam2;
    }

    public String getEindDesParam2() {
        return eindDesParam2;
    }

    public void setEindDesParam2(final String eindDesParam2) {
        this.eindDesParam2 = eindDesParam2;
    }

    public String getEindStIndices() {
        return eindStIndices;
    }

    public void setEindStIndices(final String eindStIndices) {
        this.eindStIndices = eindStIndices;
    }

}
