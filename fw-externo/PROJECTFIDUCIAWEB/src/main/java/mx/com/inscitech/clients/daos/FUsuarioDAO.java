package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.beans.FUsuario;
import mx.com.inscitech.clients.lib.MasterServices;
import mx.com.inscitech.clients.lib.serviciosenvio;
import mx.com.inscitech.clients.negocio.nFiducia;
import mx.com.inscitech.clients.util.StringFormatter;
import java.time.LocalDateTime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.OffsetDateTime;
public class FUsuarioDAO 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FUsuarioDAO.class);

  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
    String[] resultado  ={null};  
  /**
   * 
   * @return 
   */
  public String generarTabla(int fperIdPerfil, String fusuNombreUsuario, String ctoNumContrato, String ctoNomContrato) 
  { 
    StringFormatter stringFormatter = new StringFormatter();
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer(); 
    stringBufferSQL.append("SELECT A.ID, A.FUSU_NOMBRE_USUARIO, B.FPER_NOMBRE_PERFIL, A.EMAIL, COALESCE (A.FUSU_IMP_MAXIMO,'0'), TO_CHAR(COALESCE(A.fusu_ult_acceso,CURRENT_DATE), 'DD/MM/YYYY') ");
    stringBufferSQL.append("FROM F_USUARIO A, F_PERFIL B ");
    stringBufferSQL.append("WHERE A.FPER_ID_PERFIL = B.FPER_ID_PERFIL ");
    if (fperIdPerfil > 0) {
      stringBufferSQL.append(" AND A.FPER_ID_PERFIL = " + fperIdPerfil);
    }
    if (fusuNombreUsuario != null && fusuNombreUsuario.length() > 0) {
      stringBufferSQL.append(" AND UPPER(A.FUSU_NOMBRE_USUARIO) LIKE '%"+ fusuNombreUsuario.toUpperCase() + "%' ");
    }
    stringBufferSQL.append(" GROUP BY A.ID, A.FUSU_NOMBRE_USUARIO, B.FPER_NOMBRE_PERFIL, A.EMAIL, A.FUSU_IMP_MAXIMO,  TO_CHAR(COALESCE(A.fusu_ult_acceso,CURRENT_DATE), 'DD/MM/YYYY') ");
    stringBufferSQL.append(" ORDER BY A.ID ");
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
          sbTabla.append("<tr>");
          sbTabla.append("<td><input type=\"radio\" name=\"radioFusuIdUsuarios\" value=\"" + (resultSet.getString(4)==null?"":resultSet.getString(1)+"-"+resultSet.getString(4)) + "\" /></td>\n");
          sbTabla.append("<td>" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td>" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("<td>" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
          sbTabla.append("<td>" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
            sbTabla.append("<td>" + (resultSet.getString(5)==null?"":stringFormatter.formatMoney(resultSet.getString(5).length()==0?"0":resultSet.getString(5))) + "</td>");
          sbTabla.append("<td>" + (resultSet.getString(6)==null?"":resultSet.getString(6)) + "</td>");
          sbTabla.append("<td><a href=\"FI_Administracion.jsp?menu=5&fusuIdUsuario="+(resultSet.getString(4)==null?"":resultSet.getString(4))+"&fusuNombreUsuario="+ (resultSet.getString(2)==null?"":resultSet.getString(2))+"\">Fideicomisos Asignados</a></td>");
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
 
 
 public int eliminar(String fusuIdUsuario) {
     String []sProv={null};
    String stringSQL = "";
    String stringSQLFUsufid = "";
    String sRoles="";
    int resultado = 0;
   try 
   {
        LOGGER.debug("eliminar fusuIdUsuario: "+fusuIdUsuario);
        sProv= new String[2];
        sProv=fusuIdUsuario.split("-");
        
        stringSQL="DELETE FROM F_USUARIO WHERE EMAIL = '" + sProv[1] + "'";
        stringSQLFUsufid = "DELETE FROM F_USUFID WHERE FUSU_ID_USUARIO = '" + sProv[1] + "'";
        sRoles="DELETE FROM users_roles WHERE USER_ID="+sProv[0];
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        statement.executeUpdate(sRoles);
        resultado = statement.executeUpdate(stringSQLFUsufid);
        resultado = statement.executeUpdate(stringSQL);
        connection.close();       
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
 
  /**
   * 
   * @return 
   * @param fusuario
   */
  public int insertar(FUsuario fusuario) {
      
     MasterServices serv = new MasterServices();
     serviciosenvio envio = new serviciosenvio();      

    int resultado = 0;
    String []sProv={null};
   try 
   {
       
       //envio informacion
       sProv=new String[4];
       sProv[0]=fusuario.getEmail().toLowerCase();  //email
       sProv[1]=fusuario.getFusuNombreUsuario();  //nombre
       sProv[2]=fusuario.getFusuImpMaximo();//importe
       sProv[3]=fusuario.getFperIdPerfil()+"";//perfil
       envio.consumo(13, sProv);
       
   } catch (Exception e) 
   {
      LOGGER.error("Exception: ", e);
   }
   return resultado;
 }
 
   /**
   * 
   * @return 
   */
  public FUsuario consultar(String fusuIdUsuario) 
  { 
       LOGGER.debug("consultar usuario: "+fusuIdUsuario);
       String []sProv={null};
       String usuario="";
    StringFormatter stringFormatter = new StringFormatter();
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    FUsuario fUsuario = null;
    int value = 0;
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LOGGER.debug("eliminar fusuIdUsuario: "+fusuIdUsuario);
      sProv= new String[2];
      sProv=fusuIdUsuario.split("-");
      if(sProv.length==1)
          usuario=sProv[0].toUpperCase();
      else
          usuario=sProv[1].toUpperCase();
    stringBufferSQL.append("SELECT ID, FUSU_NOMBRE_USUARIO, ");
    stringBufferSQL.append("FUSU_STATUS, EMAIL, FPER_ID_PERFIL, ");
    stringBufferSQL.append("COALESCE(FUSU_IMP_MAXIMO,'0'), to_char(FUSU_ULT_ACCESO,'DD/MM/YYYY') ");
    stringBufferSQL.append("FROM F_USUARIO ");
    stringBufferSQL.append("WHERE UPPER(EMAIL) = '" + usuario + "'");
    
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
          fUsuario = new FUsuario();
          fUsuario.setId(resultSet.getString(1)==null?"":resultSet.getString(1));
          fUsuario.setFusuNombreUsuario(resultSet.getString(2)==null?"":resultSet.getString(2));
          fUsuario.setFusuStatus(resultSet.getString(3)==null?"":resultSet.getString(3));
          fUsuario.setEmail(resultSet.getString(4)==null?"":resultSet.getString(4));
          fUsuario.setFperIdPerfil(resultSet.getInt(5));
          fUsuario.setFusuImpMaximo(resultSet.getString(6)); 
          fUsuario.setFusuUltAcceso(LocalDateTime.parse(resultSet.getString(7), formatter));
          LOGGER.debug("Entro arecuperar informacion de usuarios");
        }//if
        
        if (statement != null)
          statement.close();
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          LOGGER.debug("Error en FUsuarioDAO.consultar: " + e.getMessage());
      }
      
    return fUsuario;
  }


  /**
   * 
   * @return 
   * @param fusuario
   */
  public int modificar(FUsuario fusuario) {
    StringBuffer sbSQL = new StringBuffer();
    sbSQL.append("UPDATE F_USUARIO ");
    sbSQL.append("SET FUSU_NOMBRE_USUARIO = ?, ");
    sbSQL.append("FUSU_STATUS = ?, ");
    sbSQL.append("FPER_ID_PERFIL = ?, ");
    sbSQL.append("FUSU_IMP_MAXIMO = ? ");
    sbSQL.append("WHERE email = ? " );

    int resultado = 0;

   try 
   {
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1,fusuario.getFusuNombreUsuario());
        preparedStatement.setString(2, fusuario.getFusuStatus());
        preparedStatement.setInt(3, fusuario.getFperIdPerfil());
        preparedStatement.setString(4, fusuario.getFusuImpMaximo());
        preparedStatement.setString(5, fusuario.getEmail());
    
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
 
 
  /**
   * 
   * @return 
   */
  public String generarSelectStatus(String clave) 
  { 
    String strSelect = new String();
    String label = null;
    String value = null;
    
    try {
        
          MasterServices serv = new MasterServices();
          resultado=serv.consumo(6,"31");  
          String []elemento=new String[resultado.length];
          for (String subconjunto : resultado) {
              LOGGER.debug("subconjunto: " + subconjunto);              
              elemento=subconjunto.split("-");  
              value = elemento[2];
              label = elemento[2];
              if (clave.equals(label) || clave.equals(value)) 
              {
                strSelect += "<option value=\"" + value.trim() + "\" selected=\"selected\">" + label.trim() + "</option>\n";  
              } else 
              {
                strSelect += "<option value=\"" + value + "\">" + label.trim() + "</option>\n";  
              }  
          }   

      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
   
    return strSelect;
  }
  
  
 public static void main (String arg[]) 
 {
 //FUsuarioDAO f = new FUsuarioDAO();
 //f.generarTabla(0, "");
 }
     
}