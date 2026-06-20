package mx.com.inscitech.fiducia.common;

/**
 * Excepcion que sirve para notificar errores al cargar la configuracion del sistema.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConfigurationException extends Exception {
    public ConfigurationException() {
        super();
    }

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(Exception e) {
        super(e);
    }
}
