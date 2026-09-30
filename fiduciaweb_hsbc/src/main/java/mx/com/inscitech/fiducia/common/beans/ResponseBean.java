package mx.com.inscitech.fiducia.common.beans;

/**
 * Clase que contiene la informacion de respuesta para peticiones que solicitan objetos JavaScript
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ResponseBean {

    /**
     * Objeto de error que contiene la informacion sobre el resultado de la operacion
     */
    private GenericResponseBean error;

    /**
     * El objeto a regresar
     */
    private Object object;

    /**
     * La clase del objeto a regresar. Ej. mx.com.inscitech.fiducia.common.beans.ResponseBean
     */
    private String objectClass;

    public ResponseBean() {
    }


    public void setError(GenericResponseBean error) {
        this.error = error;
    }


    public GenericResponseBean getError() {
        return error;
    }


    public void setObject(Object object) {
        this.object = object;
    }


    public Object getObject() {
        return object;
    }


    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }


    public String getObjectClass() {
        return objectClass;
    }
}
