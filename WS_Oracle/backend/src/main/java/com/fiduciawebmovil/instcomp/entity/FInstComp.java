package com.fiduciawebmovil.instcomp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "F_INST_COMP")
@NoArgsConstructor
public class FInstComp {

    @Id
    private Long insNumFolioInst;

    @Column(length = 50)
    private String ficNumCheque;

    @Column
    private String ficNombreRazonSocial;

    @Column
    private String ficTipoPago;

    @Column
    private String ficConvenioServCie;

    @Column
    private String ficReferencia;

    @Column
    private String ficBeneficiario;

    @Column
    private String ficLineaCaptura;

    @Column
    private String ficRfcContribuyente;

    @Column
    private String ficFechaCump;

    @Column
    private String ficFechaVenc;

    @Column
    private String ficClabeNva;

    @Column
    private String ficTitularNvo;

    public Long getInsNumFolioInst() {
        return insNumFolioInst;
    }

    public void setInsNumFolioInst(final Long insNumFolioInst) {
        this.insNumFolioInst = insNumFolioInst;
    }

    public String getFicNumCheque() {
        return ficNumCheque;
    }

    public void setFicNumCheque(final String ficNumCheque) {
        this.ficNumCheque = ficNumCheque;
    }

    public String getFicNombreRazonSocial() {
        return ficNombreRazonSocial;
    }

    public void setFicNombreRazonSocial(final String ficNombreRazonSocial) {
        this.ficNombreRazonSocial = ficNombreRazonSocial;
    }

    public String getFicTipoPago() {
        return ficTipoPago;
    }

    public void setFicTipoPago(final String ficTipoPago) {
        this.ficTipoPago = ficTipoPago;
    }

    public String getFicConvenioServCie() {
        return ficConvenioServCie;
    }

    public void setFicConvenioServCie(final String ficConvenioServCie) {
        this.ficConvenioServCie = ficConvenioServCie;
    }

    public String getFicReferencia() {
        return ficReferencia;
    }

    public void setFicReferencia(final String ficReferencia) {
        this.ficReferencia = ficReferencia;
    }

    public String getFicBeneficiario() {
        return ficBeneficiario;
    }

    public void setFicBeneficiario(final String ficBeneficiario) {
        this.ficBeneficiario = ficBeneficiario;
    }

    public String getFicLineaCaptura() {
        return ficLineaCaptura;
    }

    public void setFicLineaCaptura(final String ficLineaCaptura) {
        this.ficLineaCaptura = ficLineaCaptura;
    }

    public String getFicRfcContribuyente() {
        return ficRfcContribuyente;
    }

    public void setFicRfcContribuyente(final String ficRfcContribuyente) {
        this.ficRfcContribuyente = ficRfcContribuyente;
    }

    public String getFicFechaCump() {
        return ficFechaCump;
    }

    public void setFicFechaCump(final String ficFechaCump) {
        this.ficFechaCump = ficFechaCump;
    }

    public String getFicFechaVenc() {
        return ficFechaVenc;
    }

    public void setFicFechaVenc(final String ficFechaVenc) {
        this.ficFechaVenc = ficFechaVenc;
    }

    public String getFicClabeNva() {
        return ficClabeNva;
    }

    public void setFicClabeNva(final String ficClabeNva) {
        this.ficClabeNva = ficClabeNva;
    }

    public String getFicTitularNvo() {
        return ficTitularNvo;
    }

    public void setFicTitularNvo(final String ficTitularNvo) {
        this.ficTitularNvo = ficTitularNvo;
    }

}
