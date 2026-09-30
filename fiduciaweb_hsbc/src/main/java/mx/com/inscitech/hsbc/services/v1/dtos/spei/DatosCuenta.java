package mx.com.inscitech.hsbc.services.v1.dtos.spei;

import mx.com.inscitech.hsbc.services.v1.dtos.MQMessage;
import mx.com.inscitech.hsbc.services.v1.dtos.MQMessageData;

public class DatosCuenta extends MQMessageData implements MQMessage {

    public enum TipoCuenta {
        Cheques("1"),
        TDB("3"),
        Vostro("4"),
        CustodiaValores("5"),
        Vostro1("6"), 
        Vostro2("7"), 
        Vostro3("8"), 
        Vostro4("9"), 
        CLABE("40");

        public final String id;
        
        private TipoCuenta(String id) {
            this.id = id;
        }        
    }

    private String nombre = "";
    private TipoCuenta tipoCuenta = TipoCuenta.Cheques;
    private String numeroCuenta = "";
    private String curpRFC = "";
    private boolean isVostro = false;

    @Override
    public String getRequestMessage() {
        StringBuffer sb = new StringBuffer();
        
        //getFormattedField(String value, int length, String fillWith)
        if(!isVostro) {
            sb.append(getFormattedField(this.nombre, 40, " "));
            sb.append(getFormattedField(this.tipoCuenta.id, 2, " "));
            sb.append(getFormattedField(this.numeroCuenta, 20, " "));
            sb.append(getFormattedField(this.curpRFC, 18, " "));
        } else {
            sb.append(getFormattedField(this.nombre, 40, " "));
            sb.append(getFormattedField(this.curpRFC, 18, " "));            
            sb.append(getFormattedField(this.tipoCuenta.id, 2, " "));
            sb.append(getFormattedField(this.numeroCuenta, 20, " "));
        }
        
        return sb.toString();    
    }

    @Override
    public String getResponseMessage() {
        // TODO Implement this method
        return null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setCurpRFC(String curpRFC) {
        this.curpRFC = curpRFC;
    }

    public String getCurpRFC() {
        return curpRFC;
    }

    public void setIsVostro(boolean isVostro) {
        this.isVostro = isVostro;
    }

    public boolean isIsVostro() {
        return isVostro;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof DatosCuenta)) {
            return false;
        }
        final DatosCuenta other = (DatosCuenta) object;
        if (!(nombre == null ? other.nombre == null : nombre.equals(other.nombre))) {
            return false;
        }
        if (!(tipoCuenta == null ? other.tipoCuenta == null : tipoCuenta.equals(other.tipoCuenta))) {
            return false;
        }
        if (!(numeroCuenta == null ? other.numeroCuenta == null : numeroCuenta.equals(other.numeroCuenta))) {
            return false;
        }
        if (!(curpRFC == null ? other.curpRFC == null : curpRFC.equals(other.curpRFC))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = PRIME * result + ((tipoCuenta == null) ? 0 : tipoCuenta.hashCode());
        result = PRIME * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
        result = PRIME * result + ((curpRFC == null) ? 0 : curpRFC.hashCode());
        return result;
    }

}
