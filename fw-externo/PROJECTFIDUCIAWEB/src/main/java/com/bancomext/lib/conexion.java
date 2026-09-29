/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.lib;

import org.postgresql.ds.PGSimpleDataSource;
import com.bancomext.lib.servicios;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.lang.System;
import java.io.*;
import java.text.*;
import java.util.*;
import java.sql.*;
import oracle.jdbc.driver.*;
import java.io.IOException;
import java.io.InputStream;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.*;
import java.util.*;
import javax.naming.*;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class conexion {
    
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
		System.out.println ("error en conectarBD: " + error);
		return null;
	}
        return conn;
  }  
}