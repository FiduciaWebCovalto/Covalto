package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.negocio.nFiducia;
import mx.com.inscitech.clients.beans.FEncuesta;
import java.util.StringTokenizer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FEncuestaDAO 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FEncuestaDAO.class);


  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  
  public String generarTabla(int fencIdEncuesta, String fencDescripcion) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;

    stringBufferSQL.append("SELECT FENC_ID_ENCUESTA, FENC_DESCRIPCION ");
    stringBufferSQL.append("FROM F_ENCUESTA ");
    stringBufferSQL.append("WHERE 1=1 ");
    if (fencIdEncuesta > 0) {
      stringBufferSQL.append(" AND FENC_ID_ENCUESTA = " + fencIdEncuesta);
    }
    if (fencDescripcion != null && fencDescripcion.length() > 0) {
      stringBufferSQL.append(" AND UPPER(FENC_DESCRIPCION) LIKE '%"+ fencDescripcion.toUpperCase() + "%' ");
    }
     stringBufferSQL.append("ORDER BY FENC_ID_ENCUESTA");
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
          sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioFencIdEncuesta\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
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
  
  
  public int insertar(FEncuesta fEncuesta) {
    StringBuffer sbSQL = new StringBuffer();
    sbSQL.append("INSERT INTO F_ENCUESTA(FENC_ID_ENCUESTA, FENC_DESCRIPCION) ");
    sbSQL.append("VALUES (?, ?) ");

    int resultado = 0;

   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setInt(1, fEncuesta.getFencIdEncuesta());
        preparedStatement.setString(2, fEncuesta.getFencDescripcion());
        resultado = preparedStatement.executeUpdate(); 
        if (statement != null)
          statement.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
        
   } catch (Exception e) 
   {
      LOGGER.error("Exception: ", e);
   }
   return resultado;
 }


  public FEncuesta consultar(String fencIdEncuesta) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    FEncuesta fEncuesta = null;
    int value = 0;
    
    stringBufferSQL.append("SELECT FENC_ID_ENCUESTA, FENC_DESCRIPCION FROM F_ENCUESTA ");
    stringBufferSQL.append("WHERE FENC_ID_ENCUESTA = " + fencIdEncuesta + "");
    
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
          fEncuesta = new FEncuesta();
          fEncuesta.setFencIdEncuesta(resultSet.getInt(1));
          fEncuesta.setFencDescripcion(resultSet.getString(2)==null?"":resultSet.getString(2));
          
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
      
    return fEncuesta;
  } 

 public int eliminar(String fencIdEncuesta) {
 
    String stringSQL = "DELETE F_OPCENC_ENCUES WHERE FENC_ID_ENCUESTA = '" + fencIdEncuesta + "'";
    String stringSQLEncuesta = "DELETE F_ENCUESTA WHERE FENC_ID_ENCUESTA = '" + fencIdEncuesta + "'";
    int resultado = 0;
    
   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        statement.executeUpdate(stringSQL);
        resultado = statement.executeUpdate(stringSQLEncuesta);
        if (statement != null)
          statement.close();
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


  public int modificar(FEncuesta fEncuesta) {
  
    StringBuffer sbSQL = new StringBuffer();
    sbSQL.append("UPDATE F_ENCUESTA ");
    sbSQL.append("SET FENC_DESCRIPCION = ? ");
    sbSQL.append("WHERE FENC_ID_ENCUESTA = ? " );

    int resultado = 0;

   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, fEncuesta.getFencDescripcion());
        preparedStatement.setInt(2, fEncuesta.getFencIdEncuesta());
    
        resultado = preparedStatement.executeUpdate(); 
        fiduciaConnection.CloseBD();
        connection.close();
        
   } catch (Exception e) 
   {
      LOGGER.error("Exception: ", e);
   }
   return resultado;
 }
 /*
 SELECT FOPC_ID_OPCION, FENC_ID_ENCUESTA FROM F_OPCENC_ENCUES A

SELECT A.FOPC_ID_OPCION, A.FOPC_DESCRIPCION FROM F_OPCENC A
*/

  public String generarTablaOpcionesDisponibles(String fencIdEncuesta) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    stringBufferSQL.append("SELECT A.FOPC_ID_OPCION, A.FOPC_DESCRIPCION ");
    stringBufferSQL.append("FROM F_OPCENC A ");
    stringBufferSQL.append("WHERE A.FOPC_ID_OPCION NOT IN ");
    stringBufferSQL.append("( ");
    stringBufferSQL.append("    SELECT A.FOPC_ID_OPCION ");
    stringBufferSQL.append("    FROM F_OPCENC_ENCUES A, F_OPCENC B ");
    stringBufferSQL.append("    WHERE A.FOPC_ID_OPCION = B.FOPC_ID_OPCION ");
    stringBufferSQL.append("    AND FENC_ID_ENCUESTA = '" + fencIdEncuesta + "' ");
    stringBufferSQL.append(") ");
    stringBufferSQL.append("ORDER BY A.FOPC_ID_OPCION ");

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
          sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkOpcionDisponible\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"left\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
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
  
 
  public String generarTablaOpcionesAsignadas(String fencIdEncuesta) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();

    stringBufferSQL.append("SELECT A.FOPC_ID_OPCION, B.FOPC_DESCRIPCION "); 
    stringBufferSQL.append("FROM F_OPCENC_ENCUES A, F_OPCENC B "); 
    stringBufferSQL.append("WHERE A.FOPC_ID_OPCION = B.FOPC_ID_OPCION ");
    stringBufferSQL.append("AND FENC_ID_ENCUESTA = '" + fencIdEncuesta + "' ");
    stringBufferSQL.append("ORDER BY A.FOPC_ID_OPCION ");

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
          sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkOpcionAsignado\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"left\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
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

  
  public int asignarOpcion(String fopcIdOpcion, String fencIdEncuesta) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fopcIdOpcion, "|");
    try 
    {
      sbSQL.append("INSERT INTO F_OPCENC_ENCUES (FOPC_ID_OPCION, FENC_ID_ENCUESTA) ");
      sbSQL.append("VALUES (?, ?) ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        preparedStatement.setString(2, fencIdEncuesta);
        resultado += preparedStatement.executeUpdate();
      }
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
  
  public int quitarOpcion(String fopcIdOpcion, String fencIdEncuesta) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fopcIdOpcion, "|");
    try 
    {
      sbSQL.append("DELETE F_OPCENC_ENCUES ");
      sbSQL.append("WHERE FOPC_ID_OPCION = ? ");
      sbSQL.append("AND FENC_ID_ENCUESTA = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        preparedStatement.setString(2, fencIdEncuesta);
        resultado += preparedStatement.executeUpdate();
      }
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
  
}