/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.lib;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.text.*;
import java.util.*;
import java.sql.*;
import oracle.jdbc.driver.*;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.naming.*;


import java.sql.Connection;
import java.sql.SQLException;



import javax.sql.DataSource;


public class conexion {
    private static final Logger LOGGER = LoggerFactory.getLogger(conexion.class);

    
   private Connection conn=null;
    // Inyecci�n de recursos       
  public Connection conectarBD () throws SQLException, ClassNotFoundException
  {
        //servicios serv = new servicios();
  	try
  	{            

            //serv.consumo();
	    Context initialContext = new InitialContext();  
	    Class.forName("org.postgresql.Driver");
	    //Context envContext  = (Context)initialContext.lookup("java:/comp/env");
	    //DataSource ds = (DataSource)envContext.lookup("jdbc/fiduciaDSP");
	    DataSource ds = (DataSource)
            initialContext.lookup("jdbc/fiduciaDSP");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            if(conn==null)
                conn = ds.getConnection();
            

	}
	catch (Exception error)
	{
		LOGGER.debug("error en conectarBD: " + error);
		return null;
	}
        return conn;
  }  
}