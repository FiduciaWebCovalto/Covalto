package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.beans.FAmortizacionBean;
import mx.com.inscitech.clients.util.StringFormatter;

import mx.com.inscitech.clients.negocio.nFiducia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.NumberFormat;
import java.util.Locale;

public class FAmortizacionDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(FAmortizacionDao.class);


    //VARIABLES GLOBALES//////////////////////////////////////////////////////////////////////////////////
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    //////////////////////////////////////////////////////////////////////////////////////////////////////
     public String generaTabla(int fccrIdFideicomiso,int fccrIdCredito,String fccrIdPago, String fccrFechaPago) //double fccrImpPago
    {
     
      
      StringFormatter stringFormatter = new StringFormatter();
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      
      stringBufferSQL.append("SELECT FCCR_ID_FIDEICOMISO, ");
      stringBufferSQL.append("FCCR_ID_CREDITO, ");
      stringBufferSQL.append("FCCR_ID_PAGO, ");
      stringBufferSQL.append("TO_CHAR(FCCR_FECHA_PAGO,'DD/MM/YYYY'), ");
      stringBufferSQL.append("TO_CHAR(FCCR_IMP_PAGO,'999,999,999,999,999,999,999,999.99') ");
      stringBufferSQL.append("FROM F_CALCRED WHERE 1=1 ");
      
       if(fccrIdFideicomiso!=-1)
       {
         stringBufferSQL.append("AND FCCR_ID_FIDEICOMISO = "+String.valueOf(fccrIdFideicomiso)+" ");
       }
       if(fccrIdCredito!=-1)
       {
         stringBufferSQL.append("AND FCCR_ID_CREDITO = "+String.valueOf(fccrIdCredito)+" ");
       }
       if(!fccrIdPago.equals(""))
       {
          stringBufferSQL.append("AND FCCR_ID_PAGO = '"+fccrIdPago+"' ");
       }
       if(!fccrFechaPago.equals(""))
       {
         stringBufferSQL.append("AND FCCR_FECHA_PAGO = TO_DATE('"+fccrFechaPago+"','DD/MM/YYYY' ");
       }
        /*if(fccrImpPago!=-1)
       {
         stringBufferSQL.append("AND FCCR_IMP_PAGO = "+String.valueOf(fccrImpPago));
       }*/
       stringBufferSQL.append(" ORDER BY FCCR_ID_FIDEICOMISO DESC ");
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
                        String keys = String.valueOf(resultSet.getInt(1))+"-"+resultSet.getInt(2)+"-"+resultSet.getString(3);
                        sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\" rowspan=2>");
                        sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioKeys\"  value=\"" +keys+"\"/></td>\n");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getInt(1)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getInt(2)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(5)) + "</td>");
                        
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
    
    public int insertar(FAmortizacionBean bean)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        
        
          stringBufferSQL.append("INSERT INTO F_CALCRED ( ");
          stringBufferSQL.append("FCCR_ID_FIDEICOMISO, ");                              
          stringBufferSQL.append("FCCR_ID_CREDITO, ");                              
          stringBufferSQL.append("FCCR_ID_PAGO, ");                            
          stringBufferSQL.append("FCCR_FECHA_PAGO, ");                         
          stringBufferSQL.append("FCCR_IMP_PAGO, ");                         
          stringBufferSQL.append("FCCR_IMP_CAPITAL, ");                         
          stringBufferSQL.append("FCCR_IMP_INTERESES, ");                         
          stringBufferSQL.append("FCCR_FEC_PAGADO, ");                         
          stringBufferSQL.append("FCCR_TASA, ");                        
          stringBufferSQL.append("FCCR_MONEDA, ");                         
          stringBufferSQL.append("FCCR_IMP_MONEDA, ");                         
          stringBufferSQL.append("FCCR_TIPO_CAMBIO, ");                         
          stringBufferSQL.append("FCCR_TEX_COMENTARIO, ");                         
          //stringBufferSQL.append("FCCR_IMP_INT_MORA, ");                         
          //stringBufferSQL.append("FCCR_ANT_SALDO, ");                         
          stringBufferSQL.append("FCCR_ST_PAGO ");
          stringBufferSQL.append(") VALUES ( ");
          
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrIdFideicomiso())+", ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrIdCredito())+", ");
          stringBufferSQL.append(" '"+bean.getfccrIdPago()+"', ");
          stringBufferSQL.append(" TO_DATE('"+bean.getfccrFechaPago()+"', 'DD/MM/YYYY'), ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrImpPago())+", ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrImpCapital())+", ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrImpIntereses())+", ");
          stringBufferSQL.append(" TO_DATE('"+bean.getfccrFecPagado()+"', 'DD/MM/YYYY'), ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrTasa()+", "));
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrMoneda())+", ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrImpMoneda())+", ");
          stringBufferSQL.append(" "+String.valueOf(bean.getfccrTipoCambio())+", ");
          stringBufferSQL.append(" '"+bean.getfccrTexComentario()+"', ");
          //stringBufferSQL.append(" "+String.valueOf(bean.getfccrImpIntMora())+", ");
          //stringBufferSQL.append(" '"+bean.getfccrAntSaldo()+"', ");
          stringBufferSQL.append(" '"+bean.getfccrStPago()+"' ");
          
          stringBufferSQL.append(") ");
         
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
          LOGGER.debug("Error en FAmortizacionesDao.insertar(): " + e.getMessage());
          return -1;
        }
    }
  
    public int modificar(FAmortizacionBean bean)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        
        stringBufferSQL.append("UPDATE F_CALCRED SET ");
        stringBufferSQL.append("FCCR_FECHA_PAGO = TO_DATE('"+bean.getfccrFechaPago()+"', 'DD/MM/YYYY'), ");                         
        stringBufferSQL.append("FCCR_IMP_PAGO = "+String.valueOf(bean.getfccrImpPago())+" , ");                         
        stringBufferSQL.append("FCCR_IMP_CAPITAL = "+String.valueOf(bean.getfccrImpCapital())+" , ");                         
        stringBufferSQL.append("FCCR_IMP_INTERESES = "+String.valueOf(bean.getfccrImpIntereses())+" , ");                         
        stringBufferSQL.append("FCCR_FEC_PAGADO = TO_DATE('"+bean.getfccrFecPagado()+"', 'DD/MM/YYYY'), ");                         
        stringBufferSQL.append("FCCR_TASA = "+String.valueOf(bean.getfccrTasa())+" , ");                         
        stringBufferSQL.append("FCCR_MONEDA = "+String.valueOf(bean.getfccrMoneda())+" ,  ");                        
        stringBufferSQL.append("FCCR_IMP_MONEDA = "+String.valueOf(bean.getfccrImpMoneda())+" , ");                        
        stringBufferSQL.append("FCCR_TIPO_CAMBIO = "+String.valueOf(bean.getfccrTipoCambio())+" , ");                         
        stringBufferSQL.append("FCCR_TEX_COMENTARIO = '"+bean.getfccrTexComentario()+"' , ");                         
        //stringBufferSQL.append("FCCR_IMP_INT_MORA = "+String.valueOf(bean.getfccrImpIntMora())+" , ");                         
        //stringBufferSQL.append("FCCR_ANT_SALDO = "+bean.getfccrAntSaldo()+" , ");                         
        stringBufferSQL.append("FCCR_ST_PAGO = '"+(bean.getfccrStPago()!=null?bean.getfccrStPago():"ACTIVO")+"'  ");
        stringBufferSQL.append("WHERE ");
        stringBufferSQL.append("FCCR_ID_FIDEICOMISO = "+String.valueOf(bean.getfccrIdFideicomiso())+" ");
        stringBufferSQL.append("AND FCCR_ID_CREDITO = "+String.valueOf(bean.getfccrIdCredito())+" ");
        stringBufferSQL.append("AND FCCR_ID_PAGO = '"+bean.getfccrIdPago()+"' ");
        
       
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
          LOGGER.debug("Error en FAmortizacionDao.modificar(): " + e.getMessage());
          return -1;
        }
    }
    
    public FAmortizacionBean consultar(int fccrIdFideicomiso,int fccrIdCredito,String fccrIdPago)
    {
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        FAmortizacionBean bean = new FAmortizacionBean();
        
        stringBufferSQL.append("SELECT "); 
        stringBufferSQL.append("FCCR_ID_FIDEICOMISO, ");                              
        stringBufferSQL.append("FCCR_ID_CREDITO, ");                              
        stringBufferSQL.append("FCCR_ID_PAGO, ");                            
        stringBufferSQL.append("TO_CHAR(FCCR_FECHA_PAGO,'DD/MM/YYYY'), ");                         
        stringBufferSQL.append("FCCR_IMP_PAGO, ");                         
        stringBufferSQL.append("FCCR_IMP_CAPITAL, ");                         
        stringBufferSQL.append("FCCR_IMP_INTERESES, ");                         
        stringBufferSQL.append("TO_CHAR(FCCR_FEC_PAGADO,'DD/MM/YYYY'), ");                         
        stringBufferSQL.append("FCCR_TASA, ");                         
        stringBufferSQL.append("FCCR_MONEDA, ");                         
        stringBufferSQL.append("FCCR_IMP_MONEDA, ");                         
        stringBufferSQL.append("FCCR_TIPO_CAMBIO, ");                         
        stringBufferSQL.append("NVL(FCCR_TEX_COMENTARIO,'SIN COMENTARIOS'),  ");                        
        stringBufferSQL.append("FCCR_IMP_INT_MORA, ");                         
        stringBufferSQL.append("FCCR_ANT_SALDO, ");                         
        stringBufferSQL.append("FCCR_ST_PAGO ");
        stringBufferSQL.append("FROM F_CALCRED WHERE 1 = 1 ");
        stringBufferSQL.append("AND FCCR_ID_FIDEICOMISO = "+String.valueOf(fccrIdFideicomiso)+" ");
        stringBufferSQL.append("AND FCCR_ID_CREDITO = "+String.valueOf(fccrIdCredito)+" ");
        stringBufferSQL.append("AND FCCR_ID_PAGO = '"+fccrIdPago+"' ");

          
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
                    bean.setfccrIdFideicomiso(resultSet.getInt(1));
                    bean.setfccrIdCredito(resultSet.getInt(2));
                    bean.setfccrIdPago(resultSet.getString(3));
                    bean.setfccrFechaPago(resultSet.getString(4)!=null?resultSet.getString(4):"");
                    bean.setfccrImpPago(resultSet.getDouble(5));
                    bean.setfccrImpCapital(resultSet.getDouble(6));
                    bean.setfccrImpIntereses(resultSet.getDouble(7));
                    bean.setfccrFecPagado(resultSet.getString(8)!=null?resultSet.getString(8):"");
                    bean.setfccrTasa(resultSet.getDouble(9));
                    bean.setfccrMoneda(resultSet.getInt(10));
                    bean.setfccrImpMoneda(resultSet.getDouble(11));
                    bean.setfccrTipoCambio(resultSet.getDouble(12));
                        bean.setfccrTexComentario(resultSet.getString(13));
                    bean.setfccrImpIntMora(resultSet.getDouble(14));
                    bean.setfccrAntSaldo(resultSet.getString(15));
                    bean.setfccrStPago(resultSet.getString(16));
                } else 
                {
                  bean = null;
                }
              
              
              statement.close();
              resultSet.close();
              connection.close();
              fiduciaConnection.CloseBD();
              
         } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.consultar: " + e.getMessage());
         }
      
    return bean;
    }
    
    public int borrar(String keys)
    {
      int resultado;
      String Arreglokeys[]=null;
      StringBuffer stringBufferSQL = new StringBuffer();
      PreparedStatement ps;
      Arreglokeys = keys.split("-");
      
      stringBufferSQL.append("DELETE FROM F_CALCRED WHERE FCCR_ID_FIDEICOMISO = ? AND  FCCR_ID_CREDITO = ? AND FPRO_ID_CTO_INVER = ?");
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
              ps.setInt(2,Integer.parseInt(Arreglokeys[1]));
              ps.setString(3,Arreglokeys[2]);
              resultado = ps.executeUpdate();
              ps.close();
              connection.close();
              fiduciaConnection.CloseBD();
              return resultado;
      } catch (Exception e) {
          LOGGER.debug("Error en FAmortizacionDao.baja: " + e.getMessage());
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
        case 31 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS ESTATUS FROM CLAVES  WHERE CVE_NUM_CLAVE = 31 "; break; //CLAVES
        case 52 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS PERIODICIDAD FROM CLAVES  WHERE CVE_NUM_CLAVE = 52 "; break;// PERIODICIDAD
        case 64 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS ESTATUS2 FROM CLAVES  WHERE CVE_NUM_CLAVE = 64 "; break;// ESTATUS2
        case 171 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS FONDO FROM CLAVES  WHERE CVE_NUM_CLAVE = 171 "; break;// FONDO
        case 172 : sentenciaSql = "SELECT CVE_DESC_CLAVE AS CREDITO FROM CLAVES  WHERE CVE_NUM_CLAVE = 172 "; break;// CREDITO
        case 1000 : sentenciaSql = "SELECT MON_NUM_PAIS||'-'||MON_NOM_MONEDA AS MONEDA FROM MONEDAS ORDER BY MON_NUM_PAIS "; break; //MONEDA
        case 1001 : sentenciaSql = "SELECT FOR_NUM_FORMULA||'-'||FOR_PROP_FORMULA AS FORMULA FROM FORMULAS "; break;// FORMULA
        case 1002 : sentenciaSql = "SELECT FCRE_ID_CREDITO AS CREDITO FROM F_CREDITO "; break;// CREITO
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
              sentenciaSql = "SELECT COUNT(*) FROM F_CALCRED WHERE FCCR_ID_FIDEICOMISO = "+valores[0]; 
              sentenciaSql+=" AND FCCR_ID_CREDITO = "+valores[1]+ "AND FCCR_ID_PAGO = "+valores[2];
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
