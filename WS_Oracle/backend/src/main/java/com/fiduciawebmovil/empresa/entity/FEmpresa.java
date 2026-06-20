package com.fiduciawebmovil.empresa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "f_empresa")
@NoArgsConstructor
public class FEmpresa {

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
    private Long empNumEmpresa;

    @Column(length = 125)
    private String empNomEmpresa;

    @Column(length = 125)
    private String empNomArea;

    @Column(length = 125)
    private String empDireccion;

    @Column(length = 125)
    private String empNomAutoriza;

    @Column(length = 125)
    private String empNomFirma;

    @Column(length = 125)
    private String empIdioma;

    @Column(length = 25)
    private String empEstilo;

    @Column
    private LocalDate empFecCambio;

    @Column(length = 125)
    private String empLlaveEmpresa;

    @Column(length = 125)
    private String empNomAutoriza2;

    @Column(length = 125)
    private String empNomFirma2;

    @Column(length = 1200)
    private String empLeyendaEdosfin;

    @Column(length = 1200)
    private String empLeyendaEdores;

    @Column(precision = 10, scale = 0)
    private BigDecimal empConfirma;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterValores;

    @Column(length = 1200)
    private String empNombreValores;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterConta;

    @Column(length = 1200)
    private String empNombreConta;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterLavado;

    @Column(length = 1200)
    private String empNombreLavado;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterVector;

    @Column(length = 1200)
    private String empNombreVector;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterClientes;

    @Column(length = 1200)
    private String empNombreClientes;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterCreditos;

    @Column(length = 1200)
    private String empNombreCreditos;

    @Column(precision = 10, scale = 0)
    private BigDecimal empProcedimiento;

    public Long getEmpNumEmpresa() {
        return empNumEmpresa;
    }

    public void setEmpNumEmpresa(final Long empNumEmpresa) {
        this.empNumEmpresa = empNumEmpresa;
    }

    public String getEmpNomEmpresa() {
        return empNomEmpresa;
    }

    public void setEmpNomEmpresa(final String empNomEmpresa) {
        this.empNomEmpresa = empNomEmpresa;
    }

    public String getEmpNomArea() {
        return empNomArea;
    }

    public void setEmpNomArea(final String empNomArea) {
        this.empNomArea = empNomArea;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(final String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpNomAutoriza() {
        return empNomAutoriza;
    }

    public void setEmpNomAutoriza(final String empNomAutoriza) {
        this.empNomAutoriza = empNomAutoriza;
    }

    public String getEmpNomFirma() {
        return empNomFirma;
    }

    public void setEmpNomFirma(final String empNomFirma) {
        this.empNomFirma = empNomFirma;
    }

    public String getEmpIdioma() {
        return empIdioma;
    }

    public void setEmpIdioma(final String empIdioma) {
        this.empIdioma = empIdioma;
    }

    public String getEmpEstilo() {
        return empEstilo;
    }

    public void setEmpEstilo(final String empEstilo) {
        this.empEstilo = empEstilo;
    }

    public LocalDate getEmpFecCambio() {
        return empFecCambio;
    }

    public void setEmpFecCambio(final LocalDate empFecCambio) {
        this.empFecCambio = empFecCambio;
    }

    public String getEmpLlaveEmpresa() {
        return empLlaveEmpresa;
    }

    public void setEmpLlaveEmpresa(final String empLlaveEmpresa) {
        this.empLlaveEmpresa = empLlaveEmpresa;
    }

    public String getEmpNomAutoriza2() {
        return empNomAutoriza2;
    }

    public void setEmpNomAutoriza2(final String empNomAutoriza2) {
        this.empNomAutoriza2 = empNomAutoriza2;
    }

    public String getEmpNomFirma2() {
        return empNomFirma2;
    }

    public void setEmpNomFirma2(final String empNomFirma2) {
        this.empNomFirma2 = empNomFirma2;
    }

    public String getEmpLeyendaEdosfin() {
        return empLeyendaEdosfin;
    }

    public void setEmpLeyendaEdosfin(final String empLeyendaEdosfin) {
        this.empLeyendaEdosfin = empLeyendaEdosfin;
    }

    public String getEmpLeyendaEdores() {
        return empLeyendaEdores;
    }

    public void setEmpLeyendaEdores(final String empLeyendaEdores) {
        this.empLeyendaEdores = empLeyendaEdores;
    }

    public BigDecimal getEmpConfirma() {
        return empConfirma;
    }

    public void setEmpConfirma(final BigDecimal empConfirma) {
        this.empConfirma = empConfirma;
    }

    public BigDecimal getEmpInterValores() {
        return empInterValores;
    }

    public void setEmpInterValores(final BigDecimal empInterValores) {
        this.empInterValores = empInterValores;
    }

    public String getEmpNombreValores() {
        return empNombreValores;
    }

    public void setEmpNombreValores(final String empNombreValores) {
        this.empNombreValores = empNombreValores;
    }

    public BigDecimal getEmpInterConta() {
        return empInterConta;
    }

    public void setEmpInterConta(final BigDecimal empInterConta) {
        this.empInterConta = empInterConta;
    }

    public String getEmpNombreConta() {
        return empNombreConta;
    }

    public void setEmpNombreConta(final String empNombreConta) {
        this.empNombreConta = empNombreConta;
    }

    public BigDecimal getEmpInterLavado() {
        return empInterLavado;
    }

    public void setEmpInterLavado(final BigDecimal empInterLavado) {
        this.empInterLavado = empInterLavado;
    }

    public String getEmpNombreLavado() {
        return empNombreLavado;
    }

    public void setEmpNombreLavado(final String empNombreLavado) {
        this.empNombreLavado = empNombreLavado;
    }

    public BigDecimal getEmpInterVector() {
        return empInterVector;
    }

    public void setEmpInterVector(final BigDecimal empInterVector) {
        this.empInterVector = empInterVector;
    }

    public String getEmpNombreVector() {
        return empNombreVector;
    }

    public void setEmpNombreVector(final String empNombreVector) {
        this.empNombreVector = empNombreVector;
    }

    public BigDecimal getEmpInterClientes() {
        return empInterClientes;
    }

    public void setEmpInterClientes(final BigDecimal empInterClientes) {
        this.empInterClientes = empInterClientes;
    }

    public String getEmpNombreClientes() {
        return empNombreClientes;
    }

    public void setEmpNombreClientes(final String empNombreClientes) {
        this.empNombreClientes = empNombreClientes;
    }

    public BigDecimal getEmpInterCreditos() {
        return empInterCreditos;
    }

    public void setEmpInterCreditos(final BigDecimal empInterCreditos) {
        this.empInterCreditos = empInterCreditos;
    }

    public String getEmpNombreCreditos() {
        return empNombreCreditos;
    }

    public void setEmpNombreCreditos(final String empNombreCreditos) {
        this.empNombreCreditos = empNombreCreditos;
    }

    public BigDecimal getEmpProcedimiento() {
        return empProcedimiento;
    }

    public void setEmpProcedimiento(final BigDecimal empProcedimiento) {
        this.empProcedimiento = empProcedimiento;
    }

}
