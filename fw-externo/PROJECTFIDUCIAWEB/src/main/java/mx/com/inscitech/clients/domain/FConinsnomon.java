package mx.com.inscitech.clients.domain;
import java.math.BigDecimal;

public class FConinsnomon {

    public FConinsnomonDTO id;
    
    public String conpNombre;

    
    public String conpComentario;

    @Override
    public String toString() {
        return  this.id.conpIdConcepto+"-"+this.conpNombre;
    }  

    public void setId(FConinsnomonDTO id) {
        this.id = id;
    }

    public FConinsnomonDTO getId() {
        return id;
    }

    public String conpTipoDato;

    
    public BigDecimal conpBase;

    
    public String conpTabla;

    
    public String conpEstatus;

    
    public BigDecimal conpPadre;

    
    public Boolean conpObligatorio;


    public String getConpNombre() {
        return conpNombre;
    }

    public void setConpNombre(final String conpNombre) {
        this.conpNombre = conpNombre;
    }

    public String getConpComentario() {
        return conpComentario;
    }

    public void setConpComentario(final String conpComentario) {
        this.conpComentario = conpComentario;
    }

    public String getConpTipoDato() {
        return conpTipoDato;
    }

    public void setConpTipoDato(final String conpTipoDato) {
        this.conpTipoDato = conpTipoDato;
    }

    public BigDecimal getConpBase() {
        return conpBase;
    }

    public void setConpBase(final BigDecimal conpBase) {
        this.conpBase = conpBase;
    }

    public String getConpTabla() {
        return conpTabla;
    }

    public void setConpTabla(final String conpTabla) {
        this.conpTabla = conpTabla;
    }

    public String getConpEstatus() {
        return conpEstatus;
    }

    public void setConpEstatus(final String conpEstatus) {
        this.conpEstatus = conpEstatus;
    }

    public BigDecimal getConpPadre() {
        return conpPadre;
    }

    public void setConpPadre(final BigDecimal conpPadre) {
        this.conpPadre = conpPadre;
    }

    public Boolean getConpObligatorio() {
        return conpObligatorio;
    }

    public void setConpObligatorio(final Boolean conpObligatorio) {
        this.conpObligatorio = conpObligatorio;
    }

}
