package mx.com.inscitech.clients.daos;

import mx.com.inscitech.clients.beans.FPerfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import mx.com.inscitech.clients.negocio.nFiducia;
import java.util.Vector;

public class FPerfilDAO 
{

  //Querys ocupados en esta clase
  //SELECT FPER_ID_PERFIL, FPER_NOMBRE_PERFIL, FPER_IMPORTE_DISP_OPMON, FPER_TIPO_OPEMON_AUT FROM F_PERFIL ORDER BY FPER_NOMBRE_PERFIL  
  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;

  /**
   * 
   * @return 
   */
  public Vector selectAll() 
  { 
  FPerfil fPerfil = null;
  Vector fPerfilVector = null;
  StringBuffer stringBufferSQL = new StringBuffer();
  stringBufferSQL.append("SELECT FPER_ID_PERFIL, FPER_NOMBRE_PERFIL, FPER_IMPORTE_DISP_OPMON, FPER_TIPO_OPEMON_AUT ");
  stringBufferSQL.append("FROM F_PERFIL ");
  stringBufferSQL.append("ORDER BY FPER_NOMBRE_PERFIL ");
  String sql = stringBufferSQL.toString();
 
  try {
      //Se conecta a la base de datos
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();

      connection = fiduciaConnection.conBD;
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);    
      fPerfilVector = new Vector();
      
      while (resultSet.next()) 
      {
        fPerfil = new FPerfil();
        fPerfil.setFperIdPerfil(resultSet.getInt(1));
        fPerfil.setFperNombrePerfil(resultSet.getString(2));
        fPerfil.setFperImporteDispOpmon(resultSet.getInt(3));    
        fPerfil.setFperTipoOpemonAut(resultSet.getInt(4));
        fPerfilVector.add(fPerfil);
      }
      
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
    return fPerfilVector;
  }
  
 /**
   * 
   * @return 
   */
  public String generarSelect(int fperIdPerfil) 
  { 
    FPerfil fPerfil = null;
    Vector fPerfilVector = null;
    String codigoSelect = new String();
    String label = null;
    int value = 0;
     
    StringBuffer stringBufferSQL = new StringBuffer();
    stringBufferSQL.append("SELECT FPER_ID_PERFIL, FPER_NOMBRE_PERFIL ");
    stringBufferSQL.append("FROM F_PERFIL ");
    stringBufferSQL.append("ORDER BY FPER_NOMBRE_PERFIL ");
    String sql = stringBufferSQL.toString();
    
    try {
        //Se conecta a la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
  
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);    
        fPerfilVector = new Vector();
        
        while (resultSet.next()) 
        {
          value = resultSet.getInt(1);
          label = resultSet.getString(2)==null?"":resultSet.getString(2);
          System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));       
            System.out.println("fperIdPerfil:"+fperIdPerfil);       
          if (fperIdPerfil == value) 
          {
            codigoSelect += "<option value=\"" + value + "\" selected=\"selected\">" + label.trim() + "</option>\n";  
          } else 
          {
            codigoSelect += "<option value=\"" + value + "\">" + label.trim() + "</option>\n";  
          }  
        }//while
        System.out.println("LLego aqui");
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
   
    return codigoSelect;
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    FPerfilDAO fPerfilDAO = new FPerfilDAO();
    //fPerfilDAO.selectAll();
    fPerfilDAO.generarSelect(0);
  }
}