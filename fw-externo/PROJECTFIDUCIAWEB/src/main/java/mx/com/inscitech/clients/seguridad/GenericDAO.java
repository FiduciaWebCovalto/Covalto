package mx.com.inscitech.clients.seguridad;

import mx.com.inscitech.clients.lib.conexion;
import mx.com.inscitech.clients.lib.conexion;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.*;
import java.util.*;
import javax.naming.*;


/**
 * Clase para crear una conexion via JNDI a Oracle 10
 *
 * @author INSCITECH MEXICO
 * @version v1.0
 */
public class GenericDAO {
	/**
	 * Metodo para crear y configurar una conexion
	 * @return Devuelve un objeto del tipo Connection con la conexion ya configurada
	 * @throws NamingException
	 */
	public Connection getConnection() throws NamingException {
	        java.sql.Connection conn = null;
	/*
	Context ctx = new InitialContext();
	Hashtable ht = new Hashtable();
	ht.put(Context.INITIAL_CONTEXT_FACTORY,
	 "weblogic.jndi.WLInitialContextFactory");
	//ht.put(Context.PROVIDER_URL,
	//     "t3://atlas.bancomext.gob.mx:7031");
	 ht.put(Context.PROVIDER_URL, "t3://localhost:7001");
	 //10.1.25.6
	*/
	Statement stmt = null;
	ResultSet rs = null;
	try {
	
        
	    Context ctx = null;
	    Hashtable ht = new Hashtable();
	    
	    //ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
	    //  ht.put(Context.PROVIDER_URL, "t3://atlas.bancomext.gob.mx:7031");
	    //ht.put(Context.PROVIDER_URL, "t3://localhost:7001");
	    
	    //try {
            
	    conexion conecta = new conexion();
	    conn = conecta.conectarBD();
            
	      /*ctx = new InitialContext(ht);
	      javax.sql.DataSource ds = (javax.sql.DataSource) ctx.lookup ("jdbc/fiduciaDS");  

	Connection c = ds.getConnection();
	
	stmt = conn.createStatement();
	stmt.execute("select sysdate from dual");
	rs = stmt.getResultSet();
	System.out.print(rs.getInt(1));

	//Close JDBC objects as soon as possible
	stmt.close();
	stmt=null;
        */
	//conn.close();
	
	} catch (Exception e) {
	// a failure occurred
	e.printStackTrace();
	}
	return conn;
	

	
	}

  
  public static void main (String args[]) 
  {
  try {
   GenericDAO g = new GenericDAO();
   g.getConnection();
  } catch (Exception e) 
  {
    e.printStackTrace();
  }
  }
}

