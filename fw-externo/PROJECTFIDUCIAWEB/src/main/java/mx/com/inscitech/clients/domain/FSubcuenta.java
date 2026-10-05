package mx.com.inscitech.clients.domain;







import java.math.BigDecimal;



public class FSubcuenta {

    public Long id;

    
    public BigDecimal fsctIdFideicomiso;

    
    public BigDecimal fsctIdSubCuenta;

    

    
    public String fsctStatus;

    @Override
    public String toString() {
        return  this.fsctIdSubCuenta+"";
    }  
    
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public BigDecimal getFsctIdFideicomiso() {
        return fsctIdFideicomiso;
    }

    public void setFsctIdFideicomiso(final BigDecimal fsctIdFideicomiso) {
        this.fsctIdFideicomiso = fsctIdFideicomiso;
    }

    public BigDecimal getFsctIdSubCuenta() {
        return fsctIdSubCuenta;
    }

    public void setFsctIdSubCuenta(final BigDecimal fsctIdSubCuenta) {
        this.fsctIdSubCuenta = fsctIdSubCuenta;
    }

    public String getFsctStatus() {
        return fsctStatus;
    }

    public void setFsctStatus(final String fsctStatus) {
        this.fsctStatus = fsctStatus;
    }

}
