package mx.com.inscitech.cuentas.individuales.lib;

import java.sql.Connection;
import java.sql.SQLException;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;

public class Conexion {

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
            System.out.println("e: " + e);
        }
        
        return con;
    }
}
