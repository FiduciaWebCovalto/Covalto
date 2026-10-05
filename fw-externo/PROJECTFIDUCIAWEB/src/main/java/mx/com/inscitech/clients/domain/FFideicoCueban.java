package mx.com.inscitech.clients.domain;




import java.math.BigDecimal;



public class FFideicoCueban {

    public String fcbaClabeCba;

    
    public String ffcbStatus;

    
    public BigDecimal ffidIdFideicomiso;

    
    public BigDecimal fcbaClasTipo;

    
    public BigDecimal fcbaNumTipo;

    
    public BigDecimal fcbaSubCuenta;
    
    @Override
    public String toString() {
        return  this.fcbaClabeCba;
    }  

    public String getFcbaClabeCba() {
        return fcbaClabeCba;
    }

    public void setFcbaClabeCba(final String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

    public String getFfcbStatus() {
        return ffcbStatus;
    }

    public void setFfcbStatus(final String ffcbStatus) {
        this.ffcbStatus = ffcbStatus;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(final BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFcbaClasTipo() {
        return fcbaClasTipo;
    }

    public void setFcbaClasTipo(final BigDecimal fcbaClasTipo) {
        this.fcbaClasTipo = fcbaClasTipo;
    }

    public BigDecimal getFcbaNumTipo() {
        return fcbaNumTipo;
    }

    public void setFcbaNumTipo(final BigDecimal fcbaNumTipo) {
        this.fcbaNumTipo = fcbaNumTipo;
    }

    public BigDecimal getFcbaSubCuenta() {
        return fcbaSubCuenta;
    }

    public void setFcbaSubCuenta(final BigDecimal fcbaSubCuenta) {
        this.fcbaSubCuenta = fcbaSubCuenta;
    }

}
