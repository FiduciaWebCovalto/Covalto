package mx.com.inscitech.fiducia.business.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.DateTimeUtils;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;

import mx.com.inscitech.fiducia.common.beans.UsersInformation;
import mx.com.inscitech.fiducia.common.services.UserInformationService;
import mx.com.inscitech.fiducia.exceptions.impl.InvalidUserException;

import org.apache.log4j.Level;

/**
 * Servicio que se encarga de registrar en bitacora las operaciones realizadas.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class BitacoraService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BitacoraService.class);


    /**
     * Sirve para indicar que se realiza una alta.
     */
    public static final String ALTA = "ALTA";

    /**
     * Sirve para indicar que se realiza una baja.
     */
    public static final String BAJA = "BAJA";

    /**
     * Sirve para indicar que se realiza una modificacion.
     */
    public static final String MODIFICACION = "MODIFICACION";

    /**
     * Sirve para indicar que se realiza una consulta.
     */
    public static final String CONSULTA = "CONSULTA";

    /**
     * Sirve para indicar que se realiza una consulta.
     */
    public static final String ERROR = "ERROR";

    /**
     * Instancia que provee el servicio de bitacora por medio del metodo @see getInstance()
     */
    private static BitacoraService _instance;

    /**
     * Instancia del servicio de logging para imprimir los eventos
     */
    private LoggingService logger;

    static {
        _instance = new BitacoraService();
    }

    /**
     * Constructor del Servicio de bitacora. Aqui se instancia el servicio de Logging.
     */
    private BitacoraService() {
        logger = LoggingService.getInstance();
    }

    /**
     * Metodo para obtener la instancia del singleton de bitacora.
     * @return la instancia del servicio de bitacora.
     */
    public static BitacoraService getInstance() {
        return _instance;
    }

    /**
     * Metodo para registrar en la bitacora un evento.
     * @param usuarioId Id del usuario que genera el evento
     * @param usuario Nombre de usuario que genera el evento
     * @param descripcion Descripcion del evento que se genero
     * @param componente Componente que se invoco para generar el evento
     * @param tipoFuncion El tipo de funcion u operacion que realiza el componente y/o evento. Usar BitacoraService.ALTA, BitacoraService.BAJA, BitacoraService.MODIFICACION, BitacoraService.CONUSLTA
     */
    public void registraBitacora(String tipoFuncion, String componente, String descripcion, String usuario, int usuarioId) {
        UserInformationService userService = null;
        UsersInformation userInfo = null;
        /*
    try {

      userService = UserInformationService.getInstance();
      userInfo = userService.getUserInfo(usuario);
    } catch(InvalidUserException e) {}

    String[] fecha = userInfo.getFechaContable().split("/");
    int dia = Integer.parseInt(fecha[0]);
    int mes = Integer.parseInt(fecha[1]);
    int año = Integer.parseInt(fecha[2]);
    String componenteRel = new String();
      String strSQL = "{? = call OPERATIVAS.F_OPE_GENERA_BITACORA(?, ?, ?, ?, ?, ?, ?, ?)}";

    Connection cn = null;
    CallableStatement cs = null;

    try {
      cn = ServiceLocator.getInstance().getDatasource(ConfigurationService.getInstance().getProperty("systemDataSource")).getConnection();
      cs = cn.prepareCall(strSQL);
      componenteRel = componente.substring(componente.lastIndexOf("/") + 1);
      componenteRel = componenteRel.substring(0,componenteRel.length()-3);
      cs.registerOutParameter(1, Types.NUMERIC);//VARCHAR
      cs.setString(2, tipoFuncion);// VARCHAR
      cs.setString(3, componenteRel);// SIN EL .DO
      cs.setString(4, descripcion);// SIEMPRE 0 VARCHAR
      cs.setString(5, usuario);
      cs.setInt(6, usuarioId);
      cs.setInt(7, año);
      cs.setInt(8, mes);
      cs.setInt(9, dia);

      cs.execute();

      int resultadoBitacora = cs.getInt(1);

      //LOGGER.debug("Se llamo a la funcion de bitacora. Resultado: " + resultadoBitacora);

    } catch(SQLException e) {
      logger.log(this, Thread.currentThread(), Level.ERROR, e);
    } finally {
      if(cs != null) try { cs.close(); } catch(Exception e) {}
      if(cn != null) try { cn.close(); } catch(Exception e) {}

      cs = null;
      cn = null;
    }*/
    }
}
