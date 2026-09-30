package mx.com.inscitech.clients.services.v1.dtos.hogan;


public class ReturnCodes {

    private String codigoRetorno;
    private String aplicacion;
    private String conditionCode;
    private String descripcion;

    public ReturnCodes() {
        super();
    }

    public ReturnCodes(String codigoRetorno, String aplicacion, String conditionCode, String descripcion) {
        this.codigoRetorno = codigoRetorno;
        this.aplicacion = aplicacion;
        this.conditionCode = conditionCode;
        this.descripcion = descripcion;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
