package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
import mx.com.inscitech.clients.beans.FCueban;
import mx.com.inscitech.clients.negocio.nFiducia;
import java.io.*;
import java.util.ArrayList; 
import mx.com.inscitech.clients.util.StringFormatter;


public class FCreditoDAO 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FCreditoDAO.class);


  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  
  public FCreditoDAO()
  {
  }
  
  public String generarTablaCredito(String fideicomiso, String deudor) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;
    DecimalFormat format = new DecimalFormat("###,##0.00");
    
    stringBufferSQL.append("SELECT FCRE_ID_FIDEICOMISO, FCRE_ID_DEUDOR, FCRE_ID_CREDITO, FCRE_TIPO_CREDITO, FCRE_IMP_CREDITO, ");
    stringBufferSQL.append(" FCRE_TASA, FCRE_PERIODICIDAD ");
    stringBufferSQL.append(" FROM F_CREDITO ");
    stringBufferSQL.append(" WHERE 1=1 ");
    if (fideicomiso != null && fideicomiso.length() > 0) {
     String a[] = new String[1];
     a=fideicomiso.split("-");
      stringBufferSQL.append(" AND FCRE_ID_FIDEICOMISO='" + a[0].trim() + "' ");  
    }
    if (deudor != null && deudor.length() > 0) {
      stringBufferSQL.append(" AND FCRE_ID_DEUDOR='" + deudor + "' ");  
    }
  

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
        LOGGER.debug(stringBufferSQL.toString());
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\">");
          sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"id2\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" onclick=\"javascript:consultar2();\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (format.format(Double.parseDouble(resultSet.getString(5)))==null?"":format.format(Double.parseDouble(resultSet.getString(5)))) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(6)==null?"":resultSet.getString(6)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(7)==null?"":resultSet.getString(7)) + "</td>");
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

}