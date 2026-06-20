package mx.com.inscitech.fiducia.common.util;

import java.sql.Connection;
import java.sql.SQLException;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;

public class Conexion {

    private Connection con;
    private String strUrl, strUser, strPass;

    public Connection conectarBD() throws SQLException, ClassNotFoundException {
        try {
            con = ServiceLocator.getInstance()
                                .getDatasource(ConfigurationService.getInstance().getProperty("systemDataSource"))
                                .getConnection();
            return con;
        } catch (Exception error) {
            System.out.println("error en coenctarBD: " + error);
            return null;
        }
    }
}
