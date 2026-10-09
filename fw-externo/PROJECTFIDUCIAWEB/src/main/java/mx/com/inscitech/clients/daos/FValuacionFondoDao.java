package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.beans.FValuacionFondoBean;
import mx.com.inscitech.clients.util.StringFormatter;

import mx.com.inscitech.clients.negocio.nFiducia;
import mx.com.inscitech.clients.lib.conexion;
import java.util.StringTokenizer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class FValuacionFondoDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(FValuacionFondoDao.class);


    //VARIABLES GLOBALES//////////////////////////////////////////////////////////////////////////////////
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
   public String ejecutaFuncionValuacionFondosYgeneraTabla(int proceso, String fecha, int fiso, String idCredito)
   {      String resultado;
          String indiceResultado[];
          String tabla = " ";
          StringBuffer sbTabla = new StringBuffer();
          try {
              conexion fiduciaConnection = new conexion();
              connection = fiduciaConnection.conectarBD();
              StringTokenizer st = new StringTokenizer("");
              CallableStatement CalStValFdos;
              
              CalStValFdos=connection.prepareCall( "{? = call PRESTAMOS.VALUACION_FONDOS(?,?)}" );
              CalStValFdos.clearParameters();
              CalStValFdos.setInt(2 , proceso);
              CalStValFdos.setString(3, fecha);
              CalStValFdos.registerOutParameter(1, Types.VARCHAR);
              CalStValFdos.execute();
              resultado = CalStValFdos.getString(1);
              connection.close();   
              fiduciaConnection.conectarBD().close();
              indiceResultado=resultado.split("-");
               if(indiceResultado[0].equals("0")){
                  tabla=generaTabla(fiso,idCredito,fecha);
               } else 
               {
                 sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\" rowspan=2>");
                 sbTabla.append("<td align=\"center\" COLSPAN=\"8\">OCURRIO EL SIGUIENTE ERROR EN EL PROCESO: '"+indiceResultado[1]+"' Y POR ESO NO PUDO GENERARSE LA TABLA</td>");
                 sbTabla.append("</tr>\n");
                 tabla=sbTabla.toString();
               }
              
          } catch (Exception ex){ 
              LOGGER.error("Exception: ", ex); 
          }finally{
              try { if(resultSet != null ) statement.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
              try { if(statement != null ) statement.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
              try { if(connection != null ) connection.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
          }
          
          return tabla;
   }
   
   
   
    public String generaTabla(int fiso, String idCredito, String fecVal) 
    {
      StringFormatter stringFormatter = new StringFormatter();
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      
       stringBufferSQL.append("SELECT FHCC_ID_FIDEICOMISO, ");
       stringBufferSQL.append("FHCC_ID_CREDITO, ");
       stringBufferSQL.append("FHCC_ID_FEC_VALUACION, ");
       stringBufferSQL.append("FHCC_ID_CTO_INVER, ");
       stringBufferSQL.append("FHCC_ID_SECUENCIAL, ");
       stringBufferSQL.append("FHRO_TEX_COMENTARIO, ");
       stringBufferSQL.append("TO_CHAR(FHCC_SALDO_INICIO,'999,999,999,999,999,999,999,999.99'), ");
       stringBufferSQL.append("TO_CHAR(FHCC_SALDO_FINAL,'999,999,999,999,999,999,999,999.99'), ");
       stringBufferSQL.append("FHCC_MONEDA ");
       stringBufferSQL.append("FROM F_VAL_FONDO ");
       stringBufferSQL.append("WHERE 1=1 ");
       if(fiso!=0)
       {
         stringBufferSQL.append("AND FHCC_ID_FIDEICOMISO = "+String.valueOf(fiso)+" ");
       }
       if(!idCredito.equals(""))
       {
         stringBufferSQL.append("AND FHCC_ID_CREDITO = '"+idCredito+"' ");
       }
       if(!fecVal.equals(""))
       {
         stringBufferSQL.append("AND FHCC_ID_FEC_VALUACION = '"+fecVal+"' ");
       }
       stringBufferSQL.append("ORDER BY  FHCC_ID_FIDEICOMISO, FHCC_ID_CREDITO, FHCC_ID_CTO_INVER, FHCC_ID_SECUENCIAL ");
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
                      String keys = String.valueOf(resultSet.getInt(1))+"-"+resultSet.getString(2)+"-"+resultSet.getString(3)+"-"+String.valueOf(resultSet.getInt(4)+"-"+String.valueOf(resultSet.getInt(5)));
                      sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\" rowspan=2>");
                      sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioKeysCreditos\"  value=\"" +keys+"\"/></td>\n");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getInt(1)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getString(2)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getInt(4)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getInt(5)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getString(6)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getString(7)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getString(8)) + "</td>");
                      sbTabla.append("<td align=\"center\">" + (resultSet.getInt(9)) + "</td>");
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
    
    public FValuacionFondoBean consultar(int fhccIdFideicomiso,String fhccIdCredito,String fhccIdFecValuacion, int fhccIdCtoInver,int secuencial)
    {
        FValuacionFondoBean fvfb = null;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        
        stringBufferSQL.append("SELECT FHCC_ID_FIDEICOMISO, ");
        stringBufferSQL.append("FHCC_ID_CREDITO, ");
        stringBufferSQL.append("FHCC_ID_FEC_VALUACION, ");
        stringBufferSQL.append("FHCC_ID_CTO_INVER, ");
        stringBufferSQL.append("FHCC_ID_SECUENCIAL, ");
        stringBufferSQL.append("FHCC_SALDO_INICIO, ");
        stringBufferSQL.append("FHCC_SALDO_FINAL, ");
        stringBufferSQL.append("FHCC_MONEDA, ");
        stringBufferSQL.append("FHCC_TIPO_CAMBIO, ");
        stringBufferSQL.append("FHCC_FOLIO_MOVTO, ");
        stringBufferSQL.append("FHRO_TEX_COMENTARIO, ");
        stringBufferSQL.append("FHRO_ST_PROPOR ");
        stringBufferSQL.append("FROM F_VAL_FONDO ");
        stringBufferSQL.append("WHERE FHCC_ID_FIDEICOMISO = "+String.valueOf(fhccIdFideicomiso)+" "); 
        stringBufferSQL.append("AND FHCC_ID_CREDITO = '"+fhccIdCredito+"' "); 
        stringBufferSQL.append("AND FHCC_ID_FEC_VALUACION = '"+fhccIdFecValuacion+"' "); 
        stringBufferSQL.append("AND FHCC_ID_CTO_INVER  =  "+String.valueOf(fhccIdCtoInver)+" ");
        stringBufferSQL.append("AND FHCC_ID_SECUENCIAL  =  "+String.valueOf(secuencial)+" ");
       
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
            if(resultSet.next())
            {
              fvfb = new FValuacionFondoBean();
              
              fvfb.setfhccIdFideicomiso(resultSet.getInt(1));
              fvfb.setfhccIdCredito(resultSet.getString(2));
              fvfb.setfhccIdFecValuacion(resultSet.getString(3));
              fvfb.setfhccIdCtoInver(resultSet.getInt(4));
              fvfb.setfhccIdSecuencial(resultSet.getInt(5));
              fvfb.setfhccSaldoInicio(resultSet.getFloat(6));
              fvfb.setfhccSaldoFinal(resultSet.getFloat(7));
              fvfb.setfhccMoneda(resultSet.getInt(8));
              fvfb.setfhccTipoCambio(resultSet.getInt(9));
              fvfb.setfhccFolioMovto(resultSet.getInt(10));
              fvfb.setfhccTxComentario(resultSet.getString(11));
              fvfb.setfhccStPropor(resultSet.getString(12));
              
            }
            statement.close();
            resultSet.close();
            connection.close();
            fiduciaConnection.CloseBD();
        } catch (Exception e) {
          LOGGER.error("Exception: ", e);
        }
        
        return fvfb;
    }
    
   /* public int insertar(FCreditosBean fcb)
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
    }*/
    
   /* public int modificar(FCreditosBean fcb)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        stringBufferSQL.append("UPDATE F_CREDITO SET ");
                                   
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
    }*/
    
   /* public FCreditosBean consultar(int fcreIdFideicomiso,String fcreIdCredito)
    {
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        FCreditosBean fcb = null;*/
        
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
         
        /* stringBufferSQL.append("SELECT ");  
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
      String[] arrfideicomisos = null;
      
      switch(opcQry)
      {
        case 1 : sentenciaSql = "SELECT CVE_DESC_CLAVE FROM CLAVES  WHERE CVE_NUM_SEC_CLAVE = 52 "; break;
        case 2 : sentenciaSql = "SELECT CVE_DESC_CLAVE FROM CLAVES  WHERE CVE_NUM_CLAVE = 52 "; break;
        case 3 : sentenciaSql = "SELECT MON_NUM_PAIS||'-'||MON_NOM_MONEDA AS MONEDA FROM MONEDAS ORDER BY MON_NUM_PAIS "; break;
        case 4 : sentenciaSql = "SELECT CVE_DESC_CLAVE FROM CLAVES  WHERE CVE_NUM_CLAVE = 64 "; break;
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
                 arrfideicomisos = new String [resultSet.getInt(1)];
              }
              
              resultSet.close();
              statement.close();
              
              
              //Crea un statement
              statement = connection.createStatement();
              //Ejecuta el query
              resultSet = statement.executeQuery(sentenciaSql);
              indice = 0;
              while(resultSet.next())
              {
                arrfideicomisos[indice]=resultSet.getString(1);
                indice ++;
              }
              statement.close();
              resultSet.close();
              connection.close();
              fiduciaConnection.CloseBD();
              
      } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.consultar: " + e.getMessage());
       }
       
       return arrfideicomisos;
    }*/
    
}
