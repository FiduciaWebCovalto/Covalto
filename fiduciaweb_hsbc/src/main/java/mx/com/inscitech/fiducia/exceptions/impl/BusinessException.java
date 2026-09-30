package mx.com.inscitech.fiducia.exceptions.impl;

/**
 * Excepcion que se lanza cuando ocurre un error de negocio
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class BusinessException extends Exception {

    // TODO: Opcion a contener la url de ayuda ...

    /**
     * Variable que indica el codigo del error
     */
    private String errorCode;

    /**
     * Variable que contiene el mensaje de error
     */
    private String errorMessage;

    public BusinessException() {
        super();
    }

    /**
     * Constructor que permite crear una instancia de la excepcion indicando el codigo de error
     * @param errorCode El codigo de error
     */
    public BusinessException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    /**
     * Constructor que permite crear una instancia de la excepcion indicando el codigo de error y el mensaje
     * @param errorCode El codigo de error
     * @param errorMessage El mensaje de error
     */
    public BusinessException(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Setter de la propiedad errorCode
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter de la propiedad errorCode
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter de la propiedad errorMessage
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Getter de la propiedad errorMessage
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}
