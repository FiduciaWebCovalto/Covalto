package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.negocio.nFiducia;
import mx.com.inscitech.clients.beans.FOpciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FOpcionesDAO 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FOpcionesDAO.class);


  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  
  public String generarTabla(int fopcIdOpcion, String fopcDescripcion) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;

    stringBufferSQL.append("SELECT FOPC_ID_OPCION, FOPC_DESCRIPCION ");
    stringBufferSQL.append("FROM F_OPCENC ");
    stringBufferSQL.append("WHERE 1=1 ");
    if (fopcIdOpcion > 0) {
      stringBufferSQL.append(" AND FOPC_ID_OPCION = " + fopcIdOpcion);
    }
    if (fopcDescripcion != null && fopcDescripcion.length() > 0) {
      stringBufferSQL.append(" AND UPPER(FOPC_DESCRIPCION) LIKE '%"+ fopcDescripcion.toUpperCase() + "%' ");
    }
     stringBufferSQL.append("ORDER BY FOPC_ID_OPCION");
    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\">");
          sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioFopcIdOpcion\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("</tr>\n");
        }//while          
        if (statement != null)
          statement.close();
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      //LOGGER.debug(sbTabla.toString());
    return sbTabla.toString();
  }
  
  
  public int insertar(FOpciones fOpciones) {
    StringBuffer sbSQL = new StringBuffer();
    sbSQL.append("INSERT INTO F_OPCENC(FOPC_ID_OPCION, FOPC_DESCRIPCION) ");
    sbSQL.append("VALUES (?, ?) ");

    int resultado = 0;

   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setInt(1, fOpciones.getFopcIdOpcion());
        preparedStatement.setString(2, fOpciones.getFopcDescripcion());
        resultado = preparedStatement.executeUpdate(); 
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
        
   } catch (Exception e) 
   {
      LOGGER.error("Exception: ", e);
   }
   return resultado;
 }


  public FOpciones consultar(String fopcIdOpcion) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    FOpciones fOpciones = null;
    int value = 0;
    
    stringBufferSQL.append("SELECT FOPC_ID_OPCION, FOPC_DESCRIPCION FROM F_OPCENC ");
    stringBufferSQL.append("WHERE FOPC_ID_OPCION = " + fopcIdOpcion + "");
    
    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        
        if (resultSet.next()) 
        { 
          fOpciones = new FOpciones();
          fOpciones.setFopcIdOpcion(resultSet.getInt(1));
          fOpciones.setFopcDescripcion(resultSet.getString(2)==null?"":resultSet.getString(2));
          
        }//if
        
        if (statement != null)
          statement.close();
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      
    return fOpciones;
  } 

 public int eliminar(String fopcIdOpcion) {
 
    String stringSQL = "DELETE F_OPCENC WHERE FOPC_ID_OPCION = '" + fopcIdOpcion + "'";
   
    int resultado = 0;
    
   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        resultado = statement.executeUpdate(stringSQL);
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
        
   } 
   catch (Exception e) 
   {
      LOGGER.error("Exception: ", e);
   }
   return resultado;
 } 


  public int modificar(FOpciones fOpciones) {
  
    StringBuffer sbSQL = new StringBuffer();
    sbSQL.append("UPDATE F_OPCENC ");
    sbSQL.append("SET FOPC_DESCRIPCION = ? ");
    sbSQL.append("WHERE FOPC_ID_OPCION = ? " );

    int resultado = 0;

   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, fOpciones.getFopcDescripcion());
        preparedStatement.setInt(2, fOpciones.getFopcIdOpcion());
    
        resultado = preparedStatement.executeUpdate(); 
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
        
   } catch (Exception e) 
   {
      LOGGER.error("Exception: ", e);
   }
   return resultado;
 }
 
 
}