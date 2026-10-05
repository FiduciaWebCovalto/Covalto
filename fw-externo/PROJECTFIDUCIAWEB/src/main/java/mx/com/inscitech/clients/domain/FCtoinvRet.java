package mx.com.inscitech.clients.domain;



import java.math.BigDecimal;



public class FCtoinvRet {


    
    private BigDecimal fcvrImporteXCtoinv;

    public FCtoinvRetDTO id;


    public void setId(FCtoinvRetDTO id) {
        this.id = id;
    }

    public FCtoinvRetDTO getId() {
        return id;
    }

    public FCtoinvRet(BigDecimal fcvrImporteXCtoinv, FCtoinvRetDTO id) {
        this.fcvrImporteXCtoinv = fcvrImporteXCtoinv;
        this.id = id;
    }

    public BigDecimal getFcvrImporteXCtoinv() {
        return fcvrImporteXCtoinv;
    }

    public void setFcvrImporteXCtoinv(final BigDecimal fcvrImporteXCtoinv) {
        this.fcvrImporteXCtoinv = fcvrImporteXCtoinv;
    }



}
