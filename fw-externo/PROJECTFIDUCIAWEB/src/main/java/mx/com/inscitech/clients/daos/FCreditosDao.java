package mx.com.inscitech.clients.daos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.beans.FCreditosBean;
import mx.com.inscitech.clients.negocio.nFiducia;
import mx.com.inscitech.clients.util.StringFormatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.DecimalFormat; 
import java.text.NumberFormat;
import java.util.Locale;

public class FCreditosDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(FCreditosDao.class);


    //VARIABLES GLOBALES//////////////////////////////////////////////////////////////////////////////////
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String generaTabla(int fcreIdFideicomiso,String fcreIdCredito,String fcreTipoCredito) 
    {
      /*SELECT FCRE_ID_FIDEICOMISO,
       FCRE_ID_CREDITO,
       FCRE_TIPO_CREDITO,
       FCRE_IMP_CREDITO,
       FCRE_PAGOS,
       FCRE_IMP_APERTURA
       FROM F_CREDITO
      WHERE FCRE_ID_FIDEICOMISO = ?
      AND FCRE_ID_CREDITO = ?
      AND FCRE_TIPO_CREDITO = ?*/
      
      StringFormatter stringFormatter = new StringFormatter();
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      
       stringBufferSQL.append("SELECT FCRE_ID_FIDEICOMISO, ");
       stringBufferSQL.append("FCRE_ID_CREDITO, ");
       stringBufferSQL.append("FCRE_TIPO_CREDITO, ");
       stringBufferSQL.append("TO_CHAR(FCRE_IMP_CREDITO,'999,999,999,999,999,999.99'), ");
       stringBufferSQL.append("FCRE_TASA, ");
       stringBufferSQL.append("FCRE_PAGOS, ");
       stringBufferSQL.append("FCRE_PERIODICIDAD ");
       stringBufferSQL.append("FROM F_CREDITO WHERE 1=1");
       if(fcreIdFideicomiso!=-1)
       {
         stringBufferSQL.append("AND FCRE_ID_FIDEICOMISO = "+String.valueOf(fcreIdFideicomiso));
       }
       if(!fcreIdCredito.equals(""))
       {
         stringBufferSQL.append("AND FCRE_ID_CREDITO = '"+fcreIdCredito+"'");
       }
       if(!fcreTipoCredito.equals(""))
       {
         stringBufferSQL.append("AND FCRE_TIPO_CREDITO LIKE '"+fcreTipoCredito+"'");
       }
       stringBufferSQL.append(" ORDER BY FCRE_FECHA_PAGO DESC ");
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
                        String keys = String.valueOf(resultSet.getInt(1))+"-"+resultSet.getString(2);
                        sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\" rowspan=2>");
                        sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioKeysCreditos\"  value=\"" +keys+"\"/></td>\n");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getInt(1)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(2)) + "</td>");
                        //sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getDouble(5)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getDouble(6)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(7)) + "</td>");
                        sbTabla.append("</tr>\n");
                  }
                  statement.close();
                  resultSet.close();
                  connection.close();
                  fiduciaConnection.CloseBD();
        } catch (Exception e) {
          LOGGER.error("Exception: ", e);
        }
         return sbTabla.toString();
    }
    
    public int insertar(FCreditosBean fcb)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        
        stringBufferSQL.append("INSERT INTO F_CREDITO ( ");
          stringBufferSQL.append("FCRE_ID_FIDEICOMISO, ");                             
          stringBufferSQL.append("FCRE_ID_CREDITO, ");                            
          stringBufferSQL.append("FCRE_TIPO_CREDITO, ");                            
          stringBufferSQL.append("FCRE_IMP_CREDITO, ");                        
          stringBufferSQL.append("FCRE_TASA, ");                         
          stringBufferSQL.append("FCRE_PAGOS, ");                         
          stringBufferSQL.append("FCRE_PERIODICIDAD, ");                         
          stringBufferSQL.append("FCRE_IMP_APERTURA, ");                         
          stringBufferSQL.append("FCRE_IMP_NETO, ");                         
          stringBufferSQL.append("FCRE_IMP_SALDO, ");                        
          stringBufferSQL.append("FCRE_FEC_APERTURA, ");                        
          stringBufferSQL.append("FCRE_FECHA_PAGO, ");                        
          stringBufferSQL.append("FCRE_FORMULA_CAL, ");                         
          stringBufferSQL.append("FCRE_MONEDA, ");                         
          stringBufferSQL.append("FCRE_IMP_MONEDA, ");                         
          stringBufferSQL.append("FCRE_TASA_MORA, ");                         
          stringBufferSQL.append("FCRE_TEX_COMENTARIO, ");                         
          stringBufferSQL.append("FCRE_FEC_RESERVA_TRAS, ");                         
          stringBufferSQL.append("FCRE_IMP_RESERVA_TRAS, ");                         
          stringBufferSQL.append("FCRE_PLAZO_TRAS, ");                         
          stringBufferSQL.append("FCRE_FEC_RESERVA_LIM, ");                         
          stringBufferSQL.append("FCRE_PLAZO_LIM, ");                         
          stringBufferSQL.append("FCRE_ST_CREDITO ");
         stringBufferSQL.append(")VALUES( ");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreIdFideicomiso())+",");
          stringBufferSQL.append(" "+fcb.getfcreIdCredito()+",");
          stringBufferSQL.append(" '"+fcb.getfcreTipoCredito()+"',");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreImpCredito())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreTasa())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcrePagos())+",");
          stringBufferSQL.append(" '"+fcb.getfcrePeriodicidad()+"',");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreImpApertura())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreImpNeto())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreImpSaldo())+",");
          stringBufferSQL.append(" TO_DATE('"+fcb.getfcreFecApertura()+"','DD/MM/YYYY'),");
          stringBufferSQL.append(" TO_DATE('"+fcb.getfcreFechaPago()+"','DD/MM/YYYY'),");
          stringBufferSQL.append(" '"+fcb.getfcreFormulaCal()+"',");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreMoneda())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreImpMoneda())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreTasaMora())+",");
          stringBufferSQL.append(" '"+fcb.getfcreTexComentario()+"',");
          stringBufferSQL.append(" TO_DATE('"+fcb.getfcreFecReservaTras()+"','DD/MM/YYYY'),");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcreImpReservaTras())+",");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcrePlazoTras())+",");
          stringBufferSQL.append(" TO_DATE('"+fcb.getfcreFecReservaLim()+"','DD/MM/YYYY'),");
          stringBufferSQL.append(" "+String.valueOf(fcb.getfcrePlazoLim())+",");
          stringBufferSQL.append(" '"+fcb.getfcreStCredito()+"')");
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
              resultado = statement.executeUpdate(stringBufferSQL.toString());
              statement.close();
              connection.close();
              fiduciaConnection.CloseBD();
              return resultado;
        } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.insertar(): " + e.getMessage());
          return -1;
        }
    }
    
    public int modificar(FCreditosBean fcb)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        stringBufferSQL.append("UPDATE F_CREDITO SET ");
        /*stringBufferSQL.append("FCRE_ID_FIDEICOMISO = "+String.valueOf(fcb.getfcreIdFideicomiso())+", ");                             
          stringBufferSQL.append("FCRE_ID_CREDITO = "+fcb.getfcreIdCredito()+", "); */                           
          stringBufferSQL.append("FCRE_TIPO_CREDITO = '"+fcb.getfcreTipoCredito()+"', ");                            
          stringBufferSQL.append("FCRE_IMP_CREDITO = "+String.valueOf(fcb.getfcreImpCredito())+", ");                        
          stringBufferSQL.append("FCRE_TASA = "+String.valueOf(fcb.getfcreTasa())+", ");                         
          stringBufferSQL.append("FCRE_PAGOS = "+String.valueOf(fcb.getfcrePagos())+", ");                         
          stringBufferSQL.append("FCRE_PERIODICIDAD = '"+fcb.getfcrePeriodicidad()+"', ");                         
          stringBufferSQL.append("FCRE_IMP_APERTURA = "+String.valueOf(fcb.getfcreImpApertura())+", ");                         
          stringBufferSQL.append("FCRE_IMP_NETO = "+String.valueOf(fcb.getfcreImpNeto())+", ");                         
          stringBufferSQL.append("FCRE_IMP_SALDO = "+String.valueOf(fcb.getfcreImpSaldo())+", ");                        
          stringBufferSQL.append("FCRE_FEC_APERTURA = TO_DATE('"+fcb.getfcreFecApertura()+"','DD/MM/YYYY'), ");                        
          stringBufferSQL.append("FCRE_FECHA_PAGO = TO_DATE('"+fcb.getfcreFechaPago()+"','DD/MM/YYYY'), ");                        
          stringBufferSQL.append("FCRE_FORMULA_CAL = '"+fcb.getfcreFormulaCal()+"', ");                         
          stringBufferSQL.append("FCRE_MONEDA = "+String.valueOf(fcb.getfcreMoneda())+", ");                         
          stringBufferSQL.append("FCRE_IMP_MONEDA = "+String.valueOf(fcb.getfcreImpMoneda())+", ");                         
          stringBufferSQL.append("FCRE_TASA_MORA = "+String.valueOf(fcb.getfcreTasaMora())+", ");                         
          stringBufferSQL.append("FCRE_TEX_COMENTARIO = '"+fcb.getfcreTexComentario()+"', ");                         
          stringBufferSQL.append("FCRE_FEC_RESERVA_TRAS = TO_DATE('"+fcb.getfcreFecReservaTras()+"','DD/MM/YYYY'), ");                         
          stringBufferSQL.append("FCRE_IMP_RESERVA_TRAS = "+String.valueOf(fcb.getfcreImpReservaTras())+", ");                         
          stringBufferSQL.append("FCRE_PLAZO_TRAS = "+String.valueOf(fcb.getfcrePlazoTras())+", ");                         
          stringBufferSQL.append("FCRE_FEC_RESERVA_LIM = TO_DATE('"+fcb.getfcreFecReservaLim()+"','DD/MM/YYYY'), ");                         
          stringBufferSQL.append("FCRE_PLAZO_LIM = "+String.valueOf(fcb.getfcrePlazoLim())+", ");                         
          stringBufferSQL.append("FCRE_ST_CREDITO = '"+fcb.getfcreStCredito()+"' ");
          stringBufferSQL.append("WHERE 1=1 AND FCRE_ID_FIDEICOMISO = "+String.valueOf(fcb.getfcreIdFideicomiso())+" ");
          stringBufferSQL.append("AND FCRE_ID_CREDITO = "+fcb.getfcreIdCredito()+" ");
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
              resultado = statement.executeUpdate(stringBufferSQL.toString());
              statement.close();
              connection.close();
              fiduciaConnection.CloseBD();
              return resultado;
        } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.modificar(): " + e.getMessage());
          return -1;
        }
    }
    
    public FCreditosBean consultar(int fcreIdFideicomiso,String fcreIdCredito)
    {
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        FCreditosBean fcb = null;
        
        /* SELECT  
        FCRE_ID_FIDEICOMISO,                             
        FCRE_ID_CREDITO,                            
        FCRE_TIPO_CREDITO,                            
        FCRE_IMP_CREDITO,                        
        FCRE_TASA,                         
        FCRE_PAGOS,                         
        FCRE_PERIODICIDAD,                         
        FCRE_IMP_APERTURA,                         
        FCRE_IMP_NETO,                         
        FCRE_IMP_SALDO,                         
        TO_CHAR(FCRE_FEC_APERTURA,'DD/MM/YYYY'),                        
        TO_CHAR(FCRE_FECHA_PAGO,'DD/MM/YYYY'),                        
        FCRE_FORMULA_CAL,                         
        FCRE_MONEDA,                         
        FCRE_IMP_MONEDA,                         
        FCRE_TASA_MORA,                         
        FCRE_TEX_COMENTARIO,                         
        TO_CHAR(FCRE_FEC_RESERVA_TRAS,'DD/MM/YYYY'),                         
        FCRE_IMP_RESERVA_TRAS,                         
        FCRE_PLAZO_TRAS,                         
        TO_CHAR(FCRE_FEC_RESERVA_LIM,'DD/MM/YYYY'),                         
        FCRE_PLAZO_LIM,                         
        FCRE_ST_CREDITO
      FROM F_CREDITO 
         WHERE 1=1
         AND FCRE_ID_FIDEICOMISO=567
         AND FCRE_ID_CREDITO = 'SDF'*/
         
         stringBufferSQL.append("SELECT ");  
          stringBufferSQL.append("FCRE_ID_FIDEICOMISO, ");                             
          stringBufferSQL.append("FCRE_ID_CREDITO, ");                            
          stringBufferSQL.append("FCRE_TIPO_CREDITO, ");                            
          stringBufferSQL.append("FCRE_IMP_CREDITO, ");                        
          stringBufferSQL.append("FCRE_TASA, ");                         
          stringBufferSQL.append("FCRE_PAGOS, ");                         
          stringBufferSQL.append("FCRE_PERIODICIDAD,  ");                        
          stringBufferSQL.append("FCRE_IMP_APERTURA, ");                         
          stringBufferSQL.append("FCRE_IMP_NETO, ");                         
          stringBufferSQL.append("FCRE_IMP_SALDO, ");                         
          stringBufferSQL.append("TO_CHAR(FCRE_FEC_APERTURA,'DD/MM/YYYY'), ");                        
          stringBufferSQL.append("TO_CHAR(FCRE_FECHA_PAGO,'DD/MM/YYYY'), ");                        
          stringBufferSQL.append("FCRE_FORMULA_CAL, ");                         
          stringBufferSQL.append("FCRE_MONEDA, ");                         
          stringBufferSQL.append("FCRE_IMP_MONEDA, ");                         
          stringBufferSQL.append("FCRE_TASA_MORA, ");                         
          stringBufferSQL.append("FCRE_TEX_COMENTARIO, ");                         
          stringBufferSQL.append("TO_CHAR(FCRE_FEC_RESERVA_TRAS,'DD/MM/YYYY'), ");                         
          stringBufferSQL.append("FCRE_IMP_RESERVA_TRAS, ");                         
          stringBufferSQL.append("FCRE_PLAZO_TRAS, ");                         
          stringBufferSQL.append("TO_CHAR(FCRE_FEC_RESERVA_LIM,'DD/MM/YYYY'), ");                         
          stringBufferSQL.append("FCRE_PLAZO_LIM, ");                         
          stringBufferSQL.append("FCRE_ST_CREDITO ");
          stringBufferSQL.append("FROM F_CREDITO  ");
          stringBufferSQL.append("WHERE 1=1 ");
          stringBufferSQL.append("AND FCRE_ID_FIDEICOMISO="+String.valueOf(fcreIdFideicomiso)+" ");
          stringBufferSQL.append("AND FCRE_ID_CREDITO = "+fcreIdCredito+" ");
          
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
              fcb = new FCreditosBean();
              if (resultSet.next())
                {
                    fcb.setfcreIdFideicomiso(resultSet.getInt(1));
                    fcb.setfcreIdCredito(resultSet.getString(2));
                    fcb.setfcreTipoCredito(resultSet.getString(3));
                    fcb.setfcreImpCredito(resultSet.getDouble(4));
                    fcb.setfcreTasa(resultSet.getDouble(5));
                    fcb.setfcrePagos(resultSet.getDouble(6));
                    fcb.setfcrePeriodicidad(resultSet.getString(7));
                    fcb.setfcreImpApertura(resultSet.getDouble(8));
                    fcb.setfcreImpNeto(resultSet.getDouble(9));
                    fcb.setfcreImpSaldo(resultSet.getDouble(10));
                    fcb.setfcreFecApertura(resultSet.getString(11));
                    fcb.setfcreFechaPago(resultSet.getString(12));
                    fcb.setfcreFormulaCal(resultSet.getString(13));
                    fcb.setfcreMoneda(resultSet.getInt(14));
                    fcb.setfcreImpMoneda(resultSet.getDouble(15));
                    fcb.setfcreTasaMora(resultSet.getDouble(16));
                    fcb.setfcreTexComentario(resultSet.getString(17));
                    fcb.setfcreFecReservaTras(resultSet.getString(18));
                    fcb.setfcreImpReservaTras(resultSet.getDouble(19));
                    fcb.setfcrePlazoTras(resultSet.getInt(20));
                    fcb.setfcreFecReservaLim(resultSet.getString(21));
                    fcb.setfcrePlazoLim(resultSet.getInt(22));
                    fcb.setfcreStCredito(resultSet.getString(23));
                } else 
                {
                  fcb = null;
                }
              
              
              statement.close();
              resultSet.close();
              connection.close();
              fiduciaConnection.CloseBD();
              
         } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.consultar: " + e.getMessage());
         }
      
    return fcb;
    }
    
    
    public int borrar(String keys)
    {
      int resultado;
      String Arreglokeys[]=null;
      StringBuffer stringBufferSQL = new StringBuffer();
      PreparedStatement ps;
      Arreglokeys = keys.split("-");
      
      stringBufferSQL.append("DELETE FROM F_CREDITO WHERE FCRE_ID_FIDEICOMISO = ? AND FCRE_ID_CREDITO = ?");
       try {
              //Se crea una instancia de la clase que se conecta hacia la base de datos
              nFiducia fiduciaConnection = new nFiducia();
              //Manda llamar al metodo que crea la conexion
              fiduciaConnection.conectarBD();
              //Asigna el valor de la conexion a la variable declarada
              connection = fiduciaConnection.conBD;
              //Crea un statement
              ps = connection.prepareStatement(stringBufferSQL.toString());
              ps.setInt(1,Integer.parseInt(Arreglokeys[0]));
              ps.setString(2,Arreglokeys[1]);
              resultado = ps.executeUpdate();
              ps.close();
              connection.close();
              fiduciaConnection.CloseBD();
              return resultado;
      } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.baja: " + e.getMessage());
          return -1;
         }
    }
    
    
    public String[] cargaCombos(int opcQry)
    {
      String sentenciaSql=null;
      String subSentenciaSql=null;
      String count = "SELECT COUNT(*) ";
      String sentenciaSqlconCount;
      int indice;
      boolean hayDatos = true;
      String[] arrfideicomisos = null;
      
      switch(opcQry)
      {
        case 31 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS ESTATUS FROM CLAVES  WHERE CVE_NUM_CLAVE = 31 "; break; //estatus
        case 52 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS PERIODICIDAD FROM CLAVES  WHERE CVE_NUM_CLAVE = 52 "; break;// PERIODICIDAD
        case 64 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS ESTATUS2 FROM CLAVES  WHERE CVE_NUM_CLAVE = 64 "; break;// ESTATUS2
        case 171 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS FONDO FROM CLAVES  WHERE CVE_NUM_CLAVE = 171 "; break;// FONDO
        case 172 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS CREDITO FROM CLAVES  WHERE CVE_NUM_CLAVE = 172 "; break;// CREDITO
        case 1000 : sentenciaSql = "SELECT MON_NUM_PAIS||'-'||MON_NOM_MONEDA AS MONEDA FROM MONEDAS ORDER BY MON_NUM_PAIS "; break; //MONEDA
        case 1001 : sentenciaSql = "SELECT FOR_NUM_FORMULA||'-'||FOR_PROP_FORMULA AS FORMULA FROM FORMULAS "; break;// FORMULA
       
      }
      
      indice = sentenciaSql.toUpperCase().indexOf("FROM");//obtenemos el indice donde inicia FROM en la sentenciaSql
      subSentenciaSql=sentenciaSql.substring(indice);//partimos la sentenciaSql Y LA USAMOS desde donde empieza FROM
      sentenciaSqlconCount=count+subSentenciaSql.toUpperCase();//reconstruimos la sentenciaSql para que sea un "SELECT COUNT(*) FROM ..."
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
              resultSet = statement.executeQuery(sentenciaSqlconCount);
              
              if(resultSet.next())
              {
                 if(resultSet.getInt(1)!=0)
                    arrfideicomisos = new String [resultSet.getInt(1)];
                 else{
                      arrfideicomisos = new String [1];
                      hayDatos = false; //SI EL QUERY ARROJA CERO, ES QUE NO HAY DATOS EN LA TABLA 
                 }
              } else 
              {
                arrfideicomisos = new String [1];
              }
              
              resultSet.close();
              statement.close();
              
              
              //Crea un statement
              statement = connection.createStatement();
              //Ejecuta el query
              resultSet = statement.executeQuery(sentenciaSql);
              indice = 0;
              if(hayDatos){
                  while(resultSet.next())
                  {
                    arrfideicomisos[indice]=resultSet.getString(1);
                    indice ++;
                  }
              } else 
              {
                arrfideicomisos[0]="";
              }
              statement.close();
              resultSet.close();
              connection.close();
              fiduciaConnection.CloseBD();
              
      } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.consultar: " + e.getMessage());
       }
       
       return arrfideicomisos;
    }
    
    public int valoraLLavePrimaria(int opcQry,String[] valores)
    {
        String sentenciaSql=null;
        int numero=0;
        switch(opcQry)
      {
        case 1 : 
              sentenciaSql = "SELECT COUNT(*) FROM F_CREDITO  WHERE FCRE_ID_FIDEICOMISO = "+valores[0]+" AND FCRE_ID_CREDITO = '"+valores[1]+"'"; 
        break; 
         
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
              resultSet = statement.executeQuery(sentenciaSql);
              
              if(resultSet.next())
              {
                 numero=resultSet.getInt(1);
              } else 
              {
                numero=-1;
              }
              
             
              statement.close();
              resultSet.close();
              connection.close();
              fiduciaConnection.CloseBD();
              
      } catch (Exception e) {
          LOGGER.debug("Error en FAmortizacionDao.getCount(): " + e.getMessage());
          return  numero=-1;
       }
       
       return numero;
      
    }
    
    public String fixValCombo(String valorCombo, String caracter) 
    {
      String valor[];
      int v = valorCombo.indexOf("selecc");
      if(valorCombo.indexOf("selecc")>=0||valorCombo.equals(""))
      {
        return caracter;
      }
      else {
          if(valorCombo.indexOf("-")>=0){
              valor=valorCombo.split("-");
              return valor[0];
          }
          else
              return valorCombo;
      }
    }
    
    public String fixValCombo(String valorCombo, String caracter, boolean dividir) 
    {
      String valor[];
      int v = valorCombo.indexOf("Selecc");
      if(valorCombo.indexOf("Selecc")>=0||valorCombo.equals(""))
      {
        return caracter;
      }
      else {
          if(dividir){
              if(valorCombo.indexOf("-")>=0){
                  valor=valorCombo.split("-");
                  return valor[0];
              }
              else
                  return valorCombo;
          } else 
                  return valorCombo;
      }
    }
    
    public String formatear(String val)
    {
        String valor=String.valueOf(desformatear(val));
      return NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(valor.equals("")?"0.0":valor));
    }
    
    public double desformatear(String valor)
    {
      String trozo[]=null;
      String cifra="";
      if(valor.equals(""))
        valor="0.0";
      trozo=valor.replace('$',' ').replace(',',' ').split(" ");
      for(int x=0;x<trozo.length;x++)
      {
        cifra+=trozo[x];
      }
      
      return Double.parseDouble(cifra);
    }
    
}
