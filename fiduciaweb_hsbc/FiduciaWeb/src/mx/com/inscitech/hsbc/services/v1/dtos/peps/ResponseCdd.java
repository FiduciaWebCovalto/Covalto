package mx.com.inscitech.hsbc.services.v1.dtos.peps;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.StringUtils;

public class ResponseCdd implements Serializable {

    @SuppressWarnings("compatibility:-632010644544397314")
    private static final long serialVersionUID = 1L;

    private String errorCode = StringUtils.EMPTY;
    private String desError = StringUtils.EMPTY;
    private String desMessage = StringUtils.EMPTY;
    private String messageCode = StringUtils.EMPTY;
    private String statusCIS = StringUtils.EMPTY;
    private String desSCC = StringUtils.EMPTY;
    private String name = StringUtils.EMPTY;
    private String lastName = StringUtils.EMPTY;
    private String relacion = StringUtils.EMPTY;

    @JsonProperty("nFolio")
    private String nFolio = StringUtils.EMPTY;
    private String valGeneric = StringUtils.EMPTY;

    public ResponseCdd() {
        super();
    }

    public ResponseCdd(String messageCode, String desMessage, String valGeneric) {
        this.messageCode = messageCode;
        this.desMessage = desMessage;
        this.valGeneric = valGeneric;
    }

    public ResponseCdd(String errorCode, String desError, String desMessage, String messageCode, String statusCIS, String desSCC, String name, String lastName, String relacion,
                       String nFolio, String valGeneric) {
        this.errorCode = errorCode;
        this.desError = desError;
        this.desMessage = desMessage;
        this.messageCode = messageCode;
        this.statusCIS = statusCIS;
        this.desSCC = desSCC;
        this.name = name;
        this.lastName = lastName;
        this.relacion = relacion;
        this.nFolio = nFolio;
        this.valGeneric = valGeneric;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setDesError(String desError) {
        this.desError = desError;
    }

    public String getDesError() {
        return desError;
    }

    public void setDesMessage(String desMessage) {
        this.desMessage = desMessage;
    }

    public String getDesMessage() {
        return desMessage;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setStatusCIS(String statusCIS) {
        this.statusCIS = statusCIS;
    }

    public String getStatusCIS() {
        return statusCIS;
    }

    public void setDesSCC(String desSCC) {
        this.desSCC = desSCC;
    }

    public String getDesSCC() {
        return desSCC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setNFolio(String nFolio) {
        this.nFolio = nFolio;
    }

    public String getNFolio() {
        return nFolio;
    }

    public void setValGeneric(String valGeneric) {
        this.valGeneric = valGeneric;
    }

    public String getValGeneric() {
        return valGeneric;
    }
}
