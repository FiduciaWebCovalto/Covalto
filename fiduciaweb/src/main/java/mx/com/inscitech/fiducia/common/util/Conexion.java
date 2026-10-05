package mx.com.inscitech.fiducia.common.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.SQLException;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;

public class Conexion {
    private static final Logger LOGGER = LoggerFactory.getLogger(Conexion.class);


    private Connection con;
    private String strUrl, strUser, strPass;

    public Connection conectarBD() throws SQLException, ClassNotFoundException {
        try {
            con = ServiceLocator.getInstance()
                                .getDatasource(ConfigurationService.getInstance().getProperty("systemDataSource"))
                                .getConnection();
            return con;
        } catch (Exception error) {
            LOGGER.debug("error en coenctarBD: " + error);
            return null;
        }
    }
}
