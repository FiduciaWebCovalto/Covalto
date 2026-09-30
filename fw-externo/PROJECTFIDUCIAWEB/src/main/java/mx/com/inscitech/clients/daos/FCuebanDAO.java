package mx.com.inscitech.clients.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import mx.com.inscitech.clients.beans.FCueban;
import mx.com.inscitech.clients.negocio.nFiducia;

public class FCuebanDAO 
{
  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  
  /**
   * 
   * @return 
   */
  public String generarSelectStatus(int cveNumSecClave) 
  { 
    String strSelect = new String();
    String label = null;
    int value = 0;
     
    StringBuffer stringBufferSQL = new StringBuffer();
    stringBufferSQL.append("SELECT CVE_NUM_SEC_CLAVE, CVE_DESC_CLAVE ");
    stringBufferSQL.append("FROM CLAVES ");
    stringBufferSQL.append("WHERE CVE_NUM_CLAVE = 40 ");
    stringBufferSQL.append("ORDER BY CVE_DESC_CLAVE ");
    String sql = stringBufferSQL.toString();
    
    try {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
  
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);    
        
        while (resultSet.next()) 
        {
          //System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));       
          value = resultSet.getInt(1);
          label = resultSet.getString(2);
          if (cveNumSecClave == value) 
          {
            strSelect += "<option value=\"" + value + "\" selected=\"selected\">" + label.trim() + "</option>\n";  
          } else 
          {
            strSelect += "<option value=\"" + value + "\">" + label.trim() + "</option>\n";  
          }  
        }//while
        
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
   
    return strSelect;
  }

  //fcbaClabeCba  FCBA_CLABE_CBA 
  public String generarTablaCuentasDisponibles(String fcbaNumeroCtaBan, String fcbaClabeCba, String fcbaStatus) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;
    
    stringBufferSQL.append("SELECT DISTINCT A.FCBA_CLABE_CBA, A.FCBA_NUMERO_CTA_BAN, B.CVE_DESC_CLAVE, A.FCBA_TITULAR, A.FCBA_RFC, TO_CHAR(C.FBIT_FECHA,'DD/MM/YYYY'), A.FCBA_STATUS ");
    stringBufferSQL.append("FROM F_CUEBAN A, CLAVES B, F_BITACORA C ");
    stringBufferSQL.append("WHERE B.CVE_NUM_SEC_CLAVE = A.FCBA_BANCO ");
    stringBufferSQL.append("AND B.CVE_NUM_CLAVE = 27 ");
    stringBufferSQL.append("AND C.FBIT_DESCRIPCION = A.FCBA_CLABE_CBA ");
    
    if (fcbaStatus!=null && fcbaStatus.length()>0 && !fcbaStatus.equals("-1")) 
    {
      stringBufferSQL.append("AND A.FCBA_STATUS = '" + fcbaStatus + "' ");
    }
    if (fcbaNumeroCtaBan!=null && fcbaNumeroCtaBan.length()>0) 
    {
      stringBufferSQL.append("AND UPPER(A.FCBA_NUMERO_CTA_BAN) LIKE '" + fcbaNumeroCtaBan.toUpperCase() + "%' ");
    }
    if (fcbaClabeCba!=null && fcbaClabeCba.length()>0) 
    {
      stringBufferSQL.append("AND UPPER(A.FCBA_CLABE_CBA) LIKE '" + fcbaClabeCba.toUpperCase() + "%' ");
    }
    
    stringBufferSQL.append("ORDER BY A.FCBA_NUMERO_CTA_BAN ");

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
          sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioFcbaClabeCba\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(5)==null?"":resultSet.getString(5)) + "</td>");
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
          e.printStackTrace();
      }
      //System.out.println(sbTabla.toString());
    return sbTabla.toString();
  }


  public int asignarConcepto(String fcmaIdPadre, String fideicomisoAsignar, String ffidIdFideicomiso) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fideicomisoAsignar, "|");
    try 
    {
      sbSQL.append("INSERT INTO F_CATMAES_FIDEIC (FCMA_ID_PADRE, FCMA_ID_SEC_CATMA, FFID_ID_FIDEICOMISO) ");
      sbSQL.append("VALUES (?, ?, ?) ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, fcmaIdPadre);
        preparedStatement.setString(2, st.nextElement().toString());
        preparedStatement.setString(3, ffidIdFideicomiso);
        resultado += preparedStatement.executeUpdate();
      }
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }
  
  
  /**
   * 
   * @return 
   * @param ffidIdFideicomiso
   * @param fideicomisoQuitar
   * @param fcmaIdPadre
   */
  public int quitarConcepto(String fcmaIdPadre, String fideicomisoQuitar, String ffidIdFideicomiso) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fideicomisoQuitar, "|");
    try 
    {
      sbSQL.append("DELETE F_CATMAES_FIDEIC ");
      sbSQL.append("WHERE FCMA_ID_PADRE = ? ");
      sbSQL.append("AND FCMA_ID_SEC_CATMA = ? ");
      sbSQL.append("AND FFID_ID_FIDEICOMISO = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, fcmaIdPadre);
        preparedStatement.setString(2, st.nextElement().toString());
        preparedStatement.setString(3, ffidIdFideicomiso);
        resultado += preparedStatement.executeUpdate();
      }
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }  
  
  public FCueban seleccionarCuenta(String fcbaClabeCba) 
  {
    FCueban fCueban = null;
    StringBuffer sbSQL = new StringBuffer();
    sbSQL.append("SELECT C.FCBA_CLABE_CBA AS CLABE, ");
    sbSQL.append("CLV.CVE_DESC_CLAVE AS BANCO, C.FCBA_NUMERO_CTA_BAN AS CUENTA, C.FCBA_PLAZA_CBA AS PLAZA, ");
    sbSQL.append("C.FCBA_TITULAR AS TITULAR, C.FCBA_RFC AS RFC, TO_CHAR(B.FBIT_FECHA, 'DD/MM/YYYY') AS FECHA, C.FCBA_STATUS ");
    sbSQL.append("FROM F_CUEBAN C, F_BITACORA B, CLAVES CLV ");
    sbSQL.append("WHERE C.FCBA_CLABE_CBA = '"+ fcbaClabeCba + "' " );
    sbSQL.append("AND C.FCBA_CLABE_CBA = B.FBIT_DESCRIPCION ");
    sbSQL.append("AND CLV.CVE_NUM_SEC_CLAVE = C.FCBA_BANCO ");
    sbSQL.append("AND CLV.CVE_NUM_CLAVE = 27 ");
    sbSQL.append("ORDER BY C.FCBA_NUMERO_CTA_BAN ");
    
    try {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
  
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString());      
        
        if (resultSet.next()) 
        {
          fCueban = new FCueban();
          fCueban.setFcbaClabeCba(resultSet.getString(1));
          fCueban.setFcbaDescBanco(resultSet.getString(2));
          fCueban.setFcbaNumeroCtaBan(resultSet.getString(3));
          fCueban.setFcbaTitular(resultSet.getString(5));
          fCueban.setFcbaRfc(resultSet.getString(6));
          fCueban.setFcbaFechaCaptura(resultSet.getString(7));          
          fCueban.setFcbaStatus(resultSet.getString(8));          
        }//if
        
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
    return fCueban;
  }


  public int modificar(String fcbaTitular, String fcbaRFC, String fcbaClabeCba) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    
    try 
    {
      sbSQL.append("UPDATE F_CUEBAN ");
      sbSQL.append("SET FCBA_TITULAR = ?, FCBA_RFC = ? ");
      sbSQL.append("WHERE FCBA_CLABE_CBA = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, fcbaTitular);
      preparedStatement.setString(2, fcbaRFC);
      preparedStatement.setString(3, fcbaClabeCba);
      resultado = preparedStatement.executeUpdate();
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }


  public int autorizar(String fcbaClabeCba) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    
    try 
    {
      sbSQL.append("UPDATE F_CUEBAN ");
      sbSQL.append("SET FCBA_STATUS = ? ");
      sbSQL.append("WHERE FCBA_CLABE_CBA = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, "AUTORIZADA");
      preparedStatement.setString(2, fcbaClabeCba);
      resultado = preparedStatement.executeUpdate();
      fiduciaConnection.CloseBD();
      if (connection != null)
        connection.close();
      
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }


  public int rechazar(String fcbaClabeCba) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    
    try 
    {
      sbSQL.append("UPDATE F_CUEBAN ");
      sbSQL.append("SET FCBA_STATUS = ? ");
      sbSQL.append("WHERE FCBA_CLABE_CBA = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, "RECHAZADA");
      preparedStatement.setString(2, fcbaClabeCba);
      resultado = preparedStatement.executeUpdate();
      fiduciaConnection.CloseBD();
      if (connection != null)
        connection.close();
      
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  } 
}