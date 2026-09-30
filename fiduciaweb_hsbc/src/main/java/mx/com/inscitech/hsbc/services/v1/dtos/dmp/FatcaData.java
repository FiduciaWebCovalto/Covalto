package mx.com.inscitech.hsbc.services.v1.dtos.dmp;


public class FatcaData {
    
    private String estatusFAT;
    
    public FatcaData() {
        super();
    }

    public FatcaData(String estatusFAT) {
        this.estatusFAT = estatusFAT;
    }

    public void setEstatusFAT(String estatusFAT) {
        this.estatusFAT = estatusFAT;
    }

    public String getEstatusFAT() {
        return estatusFAT;
    }
}
