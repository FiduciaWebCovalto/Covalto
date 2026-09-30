package mx.com.inscitech.fiducia.exceptions.impl;

import mx.com.inscitech.fiducia.business.services.BitacoraService;

/**
 * Excepcion que es arrojada cuando se consulta un usuario y no es encontrado en la tabla de usuarios del sistema.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class InvalidUserException extends Exception {
    public InvalidUserException(String usuario) {
        super();
        BitacoraService.getInstance().registraBitacora(BitacoraService.ERROR, "login.jsp", "Intento de Acceso Fallido para el usuario", usuario, 0);
    }
}
