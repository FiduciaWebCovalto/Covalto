package mx.com.inscitech.fiducia.common.beans;


/**
 * Clase que contiene la informacion de un error generado en la parte de negocio
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ErrorBean {

    /**
     * Variable estatica para indicar que el error es de tipo advertencia
     */
    public static final String WARNING = "WARNING";

    /**
     * Variable estatica para indicar que el error es de tipo informativo
     */
    public static final String INFO = "INFORMATION";

    /**
     * Variable estatica para indicar que el error es de tipo error
     */
    public static final String ERROR = "ERROR";

    /**
     * Variable para indicar que la operacion ha sido realizada exitosamente.
     * Asignar este valor a la propiedad tipo cuando una operacion se haya realizado exitosamente.
     */
    public static final String SUCCESS = "SUCCESS";

    public static final ErrorBean ERROR_SUCCESS = new ErrorBean(ErrorBean.SUCCESS, "0", "");

    /**
     * Variable que indica el tipo de error
     */
    private String tipoError;

    /**
     * Variable que sirve para indicar el codigo del error
     */
    private String codigoError;

    /**
     * Variable que sirve para indicar el mensaje a mostrar
     */
    private String mensajeError;

    private String detalleError;
    
    /**
     * Variable para que contiene el stackTrace de la excepcion generada.
     * Usar unicamente para errores no contemplados
     */
    private String stackTrace;

    public ErrorBean() {
    }

    public ErrorBean(String tipoError, String codigoError, String mensajeError, String detalleError, String stackTrace) {
        this.tipoError = tipoError;
        this.codigoError = codigoError;
        this.mensajeError = mensajeError;
        this.detalleError = detalleError;
        this.stackTrace = stackTrace;
    }

    public ErrorBean(String tipoError, String codigoError, String mensajeError, String detalleError) {
        this.tipoError = tipoError;
        this.codigoError = codigoError;
        this.mensajeError = mensajeError;
        this.detalleError = detalleError;
    }

    public ErrorBean(String tipoError, String codigoError, String mensajeError) {
        this.tipoError = tipoError;
        this.codigoError = codigoError;
        this.mensajeError = mensajeError;
    }


    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }


    public String getStackTrace() {
        return stackTrace;
    }


    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }


    public String getTipoError() {
        return tipoError;
    }


    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }


    public String getCodigoError() {
        return codigoError;
    }


    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }


    public String getMensajeError() {
        return mensajeError;
    }

    public void setDetalleError(String detalleError) {
        this.detalleError = detalleError;
    }

    public String getDetalleError() {
        return detalleError;
    }

}
