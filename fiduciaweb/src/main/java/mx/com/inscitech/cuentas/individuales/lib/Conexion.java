package mx.com.inscitech.cuentas.individuales.lib;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.SQLException;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;

public class Conexion {
    private static final Logger LOGGER = LoggerFactory.getLogger(Conexion.class);


    private LoggingService logger = null;
    private Connection con = null;
    
    private boolean configured = false;
    private static String DATA_SOURCE = null;
    
    public Conexion() {
        super();
        logger = LoggingService.getNewInstance();
    }

    public Connection conectarBD() throws SQLException, ClassNotFoundException {
        //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "conectarBD()");
        
        try {

            if(!configured || DATA_SOURCE == null) {
                DATA_SOURCE = ConfigurationService.getInstance().getProperty("systemDataSource");
                //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "DATA_SOURCE: " + DATA_SOURCE);
                if(DATA_SOURCE == null) {
                    //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.WARN, "DATA_SOURCE configuration not found! Set DS to jdbc/fiduciaDS");    
                    DATA_SOURCE = "jdbc/fiduciaDS";
                }
                configured = true;
            }

            con = ServiceLocator.getInstance()
                                .getDatasource(DATA_SOURCE)
                                .getConnection();

        } catch (Exception e) {
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.ERROR, e);       
            LOGGER.debug("e: " + e);
        }
        
        return con;
    }
}
