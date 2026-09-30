package mx.com.inscitech.clients.daos;

import mx.com.inscitech.clients.negocio.nFiducia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;

public class FCalcredDAO 
{

  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  //ResultSet resultSet2 = null;
  
  public FCalcredDAO()
  {
  }
  
  public String generarTablaCalcred(String fideicomiso, String deudor) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();
    int value = 0;    
    DecimalFormat format = new DecimalFormat("###,##0.00");
    String a[] = new String[1];
    a=fideicomiso.split("-");
    
    stringBufferSQL.append("SELECT FCCR_ID_FIDEICOMISO, FCCR_ID_CREDITO, FCCR_ID_PAGO, FCCR_FECHA_PAGO, FCCR_IMP_PAGO, ");
    stringBufferSQL.append("FCCR_IMP_CAPITAL, FCCR_IMP_INTERESES, FCCR_FEC_PAGADO, FCCR_TASA, FCCR_MONEDA, ");
    stringBufferSQL.append("FCCR_IMP_MONEDA, FCCR_TIPO_CAMBIO, FCCR_TEX_COMENTARIO, FCCR_IMP_INT_MORA, FCCR_ANT_SALDO, "); 
    stringBufferSQL.append("FCCR_ST_PAGO ");
    stringBufferSQL.append("FROM F_CALCRED ");
    stringBufferSQL.append("WHERE 1=1 ");
    //stringBufferSQL.append("AND FCCR_ST_PAGO='PAGADO' ");
   if (fideicomiso != null && fideicomiso.length() > 0) {
      stringBufferSQL.append(" AND FCCR_ID_FIDEICOMISO='" + a[0].trim() + "' ");  
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
         //System.out.println(stringBufferSQL.toString());  
        
        sbTabla.append("<table width=\"90%\" height=\"67\">");
        sbTabla.append("<tr class=\"celda01\" bgcolor=\"#999966\">");
        sbTabla.append("<td>&nbsp;</td>");
        sbTabla.append("<td>Fideicomiso</td>");
        sbTabla.append("<td>N�mero de pago</td>");
        sbTabla.append("<td>Pago Fijo</td>");
        sbTabla.append("<td>Amortizaci�n de capital</td>");
        sbTabla.append("<td>Intereses sin IVA</td>");
        sbTabla.append("<td>Saldo de capital</td>");
        sbTabla.append("</tr>");                        
        
        //double adeudo = 14500.00;
        int valor=Integer.parseInt(a[0].trim());
        int deu=Integer.parseInt(deudor);
        sbSQL.append("SELECT FCRE_IMP_CREDITO FROM F_CREDITO WHERE FCRE_ID_FIDEICOMISO=" + Integer.parseInt(a[0].trim()) + " AND FCRE_ID_DEUDOR=" + Integer.parseInt(deudor) + " ");
        double adeudo=0.0;
        resultSet = statement.executeQuery(sbSQL.toString());  
        if (resultSet.next()) 
        { 
          adeudo = resultSet.getDouble(1);
        }
        
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());
          
        while (resultSet.next()) 
        { 
          adeudo = adeudo-Double.parseDouble(resultSet.getString("FCCR_IMP_PAGO"));
          sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\">");
          sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radiocalcred\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString("FCCR_ID_FIDEICOMISO")==null?"":resultSet.getString("FCCR_ID_FIDEICOMISO")) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString("FCCR_ID_PAGO")==null?"":resultSet.getString("FCCR_ID_PAGO")) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString("FCCR_IMP_PAGO")==null?"":resultSet.getString("FCCR_IMP_PAGO")) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString("FCCR_IMP_CAPITAL")==null?"":resultSet.getString("FCCR_IMP_CAPITAL")) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString("FCCR_IMP_INTERESES")==null?"":resultSet.getString("FCCR_IMP_INTERESES")) + "</td>");
          sbTabla.append("<td align=\"center\">" + format.format(adeudo) + "</td>");
          //sbTabla.append("<td align=\"center\">" + (resultSet.getString(7)==null?"":resultSet.getString(7)) + "</td>");
          sbTabla.append("</tr>\n");
        }//while          
        sbTabla.append("</table>");
        if (statement != null)
          statement.close();  
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          e.printStackTrace();
      }
      //System.out.println(sbTabla.toString());
    return sbTabla.toString();
  }  

}

