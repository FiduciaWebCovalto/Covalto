package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.beans.FProporcionesBean;
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

import java.text.DecimalFormat; 
import java.text.NumberFormat;
import java.util.Locale;

public class FProporcionesDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(FProporcionesDao.class);


    //VARIABLES GLOBALES//////////////////////////////////////////////////////////////////////////////////
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    //////////////////////////////////////////////////////////////////////////////////////////////////////
     public String generaTabla(int fproIdFideicomiso,String fproIdCredito,int fproIdCtoInver,String fproTipoFondo,String fproConcepto) 
    {
     
      
      StringFormatter stringFormatter = new StringFormatter();
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      
      stringBufferSQL.append("SELECT FPRO_ID_FIDEICOMISO, ");
      stringBufferSQL.append("FPRO_ID_CREDITO, ");
      stringBufferSQL.append("FPRO_ID_CTO_INVER, ");
      stringBufferSQL.append("FPRO_TIPO_FONDO, ");
      stringBufferSQL.append("FPRO_FORMULA, ");
      stringBufferSQL.append("TO_CHAR(FPRO_SALDO_OBJETIVO,'999,999,999,999,999.99'), ");
      stringBufferSQL.append("TO_CHAR(FPRO_SALDO,'999,999,999,999,999.99'), ");
      stringBufferSQL.append("FPRO_CONCEPTO, ");
      stringBufferSQL.append("FPRO_CUENTA_CLABE ");
      stringBufferSQL.append("FROM F_PROPORCIONES ");
      stringBufferSQL.append("WHERE 1=1 ");
      
       if(fproIdFideicomiso!=-1)
       {
         stringBufferSQL.append("AND FPRO_ID_FIDEICOMISO = "+String.valueOf(fproIdFideicomiso)+" ");
       }
       if(!fproIdCredito.equals(""))
       {
         stringBufferSQL.append("AND FPRO_ID_CREDITO = '"+fproIdCredito+"' ");
       }
       if(fproIdCtoInver!=-1)
       {
          stringBufferSQL.append("AND FPRO_ID_CTO_INVER = "+String.valueOf(fproIdCtoInver)+" ");
       }
       if(!fproTipoFondo.equals(""))
       {
         stringBufferSQL.append("AND FPRO_TIPO_FONDO = '"+fproTipoFondo+"' ");
       }
        if(!fproConcepto.equals(""))
       {
         stringBufferSQL.append("AND FPRO_CONCEPTO = '"+fproConcepto+"' ");
       }
       stringBufferSQL.append(" ORDER BY FPRO_ID_FIDEICOMISO DESC ");
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
                        String keys = String.valueOf(resultSet.getInt(1))+"-"+resultSet.getString(2)+"-"+resultSet.getString(3);
                        sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\" rowspan=2>");
                        sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioKeys\"  value=\"" +keys+"\"/></td>\n");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getInt(1)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(2)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getInt(3)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString("FPRO_CUENTA_CLABE")) + "</td>");
                        sbTabla.append("<td align=\"center\">" + (resultSet.getString(6)) + "</td>");
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
    
     public int insertar(FProporcionesBean fpropb)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        
        
        stringBufferSQL.append("INSERT INTO F_PROPORCIONES( ");
        stringBufferSQL.append("FPRO_ID_FIDEICOMISO, ");                              
        stringBufferSQL.append("FPRO_ID_CREDITO, ");                            
        stringBufferSQL.append("FPRO_ID_CTO_INVER, ");                              
        stringBufferSQL.append("FPRO_TIPO_FONDO, ");                            
        stringBufferSQL.append("FPRO_FORMULA, ");                         
        stringBufferSQL.append("FPRO_SALDO_OBJETIVO, ");                         
        stringBufferSQL.append("FPRO_SALDO, ");                         
        stringBufferSQL.append("FPRO_PORCENTAJE, ");                         
        stringBufferSQL.append("FPRO_CONCEPTO, ");                         
        stringBufferSQL.append("FPRO_PERIODICIDAD,  ");                        
        stringBufferSQL.append("FPRO_RECEPTOR, ");                         
        stringBufferSQL.append("FPRO_PAGADOR, ");                         
        stringBufferSQL.append("FPRO_TEX_COMENTARIO, ");
        stringBufferSQL.append("FCRE_FEC_RESERVA_TRAS, ");                         
        stringBufferSQL.append("FCRE_IMP_RESERVA_TRAS, ");                         
        stringBufferSQL.append("FCRE_FEC_HONO, ");                        
        stringBufferSQL.append("FCRE_PAGA_HONO, ");                        
        stringBufferSQL.append("FCRE_PAGA_CREDITO, ");
        stringBufferSQL.append("FPRO_ST_PROPOR, ");
        stringBufferSQL.append("FPRO_CUENTA_CLABE ");
        stringBufferSQL.append(") VALUES ( ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproIdFideicomiso())+", ");
        stringBufferSQL.append(" '"+fpropb.getfproIdCredito()+"', ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproIdCtoInver())+", ");
        stringBufferSQL.append(" '"+fpropb.getfproTipoFondo()+"', ");
        stringBufferSQL.append(" '"+fpropb.getfproFormula()+"', ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproSaldoObjetivo())+", ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproSaldo())+", ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproPorcentaje())+", ");
        stringBufferSQL.append(" '"+fpropb.getfproConcepto()+"', ");
        stringBufferSQL.append(" '"+fpropb.getfproPeriodicidad()+"', ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproReceptor())+", ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproPagador())+", ");
        stringBufferSQL.append(" '"+fpropb.getfproTexComentario()+"', ");
        
        stringBufferSQL.append(" TO_DATE('"+fpropb.getfproFecReservaTras()+"','DD/MM/YYYY'), ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproImpReservaTras())+", ");
        stringBufferSQL.append(" TO_DATE('"+fpropb.getfproFecHono()+"', 'DD/MM/YYYY'), ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproPagaHono())+", ");
        stringBufferSQL.append(" "+String.valueOf(fpropb.getfproPagaCredito())+", ");
        
        stringBufferSQL.append(" '"+fpropb.gefproStPropor()+"', ");
         stringBufferSQL.append(" '"+fpropb.getfproCuentaClave()+"' ");
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
          LOGGER.debug("Error en FProporcionesDao.insertar(): " + e.getMessage());
          return -1;
        }
    }
    
    public int modificar(FProporcionesBean fpropb)
    {
        int resultado;
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        
        stringBufferSQL.append("UPDATE F_PROPORCIONES SET ");
        stringBufferSQL.append("FPRO_TIPO_FONDO = '"+fpropb.getfproTipoFondo()+"', ");                            
        stringBufferSQL.append(" FPRO_FORMULA = '"+fpropb.getfproFormula()+"', ");                         
        stringBufferSQL.append("FPRO_SALDO_OBJETIVO = "+String.valueOf(fpropb.getfproSaldoObjetivo())+", ");                         
        stringBufferSQL.append("FPRO_SALDO = "+String.valueOf(fpropb.getfproSaldo())+", ");                         
        stringBufferSQL.append("FPRO_PORCENTAJE = "+String.valueOf(fpropb.getfproPorcentaje())+", ");                         
        stringBufferSQL.append("FPRO_CONCEPTO = '"+fpropb.getfproConcepto()+"', ");                         
        stringBufferSQL.append("FPRO_PERIODICIDAD = '"+fpropb.getfproPeriodicidad()+"', ");                         
        stringBufferSQL.append("FPRO_RECEPTOR = "+String.valueOf(fpropb.getfproReceptor())+", ");                         
        stringBufferSQL.append("FPRO_PAGADOR = "+String.valueOf(fpropb.getfproPagador())+", ");                         
        stringBufferSQL.append("FPRO_TEX_COMENTARIO = '"+fpropb.getfproTexComentario()+"', ");
        
        stringBufferSQL.append("FCRE_FEC_RESERVA_TRAS = TO_DATE('"+fpropb.getfproFecReservaTras()+"','DD/MM/YYYY'), ");                         
        stringBufferSQL.append("FCRE_IMP_RESERVA_TRAS = "+String.valueOf(fpropb.getfproImpReservaTras())+", ");                         
        stringBufferSQL.append("FCRE_FEC_HONO = TO_DATE('"+fpropb.getfproFecHono()+"','DD/MM/YYYY'), ");                         
        stringBufferSQL.append("FCRE_PAGA_HONO = "+String.valueOf(fpropb.getfproPagaHono())+", ");                         
        stringBufferSQL.append("FCRE_PAGA_CREDITO = "+String.valueOf(fpropb.getfproPagaCredito())+", ");
        
        stringBufferSQL.append("FPRO_ST_PROPOR = '"+fpropb.gefproStPropor()+"', "); 
        stringBufferSQL.append("FPRO_CUENTA_CLABE = '"+fpropb.getfproCuentaClave()+"' ");
        stringBufferSQL.append("WHERE 1=1 ");
        stringBufferSQL.append("AND FPRO_ID_FIDEICOMISO = "+String.valueOf(fpropb.getfproIdFideicomiso())+" ");
        stringBufferSQL.append("AND FPRO_ID_CREDITO = '"+fpropb.getfproIdCredito()+"' ");
        stringBufferSQL.append("AND FPRO_ID_CTO_INVER = "+String.valueOf(fpropb.getfproIdCtoInver())+" ");
        
       
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
          LOGGER.debug("Error en FProporcionesDao.modificar(): " + e.getMessage());
          return -1;
        }
    }
    
    public FProporcionesBean consultar(int fproIdFideicomiso,String fproIdCredito,int fproIdCtoInver)
    {
        StringFormatter stringFormatter = new StringFormatter();
        StringBuffer stringBufferSQL = new StringBuffer();
        //FProporcionesBean fpropb = null;
        FProporcionesBean fpropb = new FProporcionesBean();
        stringBufferSQL.append("SELECT ");
        stringBufferSQL.append("FPRO_ID_FIDEICOMISO, ");                              
        stringBufferSQL.append("FPRO_ID_CREDITO, ");                            
        stringBufferSQL.append("FPRO_ID_CTO_INVER, ");                              
        stringBufferSQL.append("NVL(FPRO_TIPO_FONDO,0), ");                            
        stringBufferSQL.append("NVL(FPRO_FORMULA,'SIN FORMULA'), ");                         
        stringBufferSQL.append("NVL(FPRO_SALDO_OBJETIVO,0), ");                         
        stringBufferSQL.append("NVL(FPRO_SALDO,0), ");                         
        stringBufferSQL.append("NVL(FPRO_PORCENTAJE,0), ");                         
        stringBufferSQL.append("NVL(FPRO_CONCEPTO,'SIN CONCEPTO'), ");                         
        stringBufferSQL.append("NVL(FPRO_PERIODICIDAD,'SIN PERIODICIDAD'), ");                         
        stringBufferSQL.append("NVL(FPRO_RECEPTOR,0), ");                         
        stringBufferSQL.append("NVL(FPRO_PAGADOR,0), ");                         
        stringBufferSQL.append("NVL(FPRO_TEX_COMENTARIO,'SIN COMENTARIO'), ");
        
        stringBufferSQL.append("NVL(TO_CHAR(FCRE_FEC_RESERVA_TRAS,'DD/MM/YYYY'),''), ");                         
        stringBufferSQL.append("NVL(FCRE_IMP_RESERVA_TRAS, 0), ");                         
        stringBufferSQL.append("NVL(TO_CHAR(FCRE_FEC_HONO,'DD/MM/YYYY'),''), ");                         
        stringBufferSQL.append("NVL(FCRE_PAGA_HONO,0), ");                         
        stringBufferSQL.append("NVL(FCRE_PAGA_CREDITO,'0'), ");
        
        stringBufferSQL.append("NVL(FPRO_ST_PROPOR,'SIN STATUS'), ");
        stringBufferSQL.append("NVL(FPRO_CUENTA_CLABE,'SIN CTA CLABE') ");
        stringBufferSQL.append("FROM  F_PROPORCIONES WHERE 1=1 ");
        stringBufferSQL.append("AND FPRO_ID_FIDEICOMISO = "+String.valueOf(fproIdFideicomiso)+" ");
        stringBufferSQL.append("AND FPRO_ID_CREDITO = '"+fproIdCredito+"' ");
        stringBufferSQL.append("AND FPRO_ID_CTO_INVER = "+String.valueOf(fproIdCtoInver)+" ");

          
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
                    fpropb.setfproIdFideicomiso(resultSet.getInt(1));
                    fpropb.setfproIdCredito(resultSet.getString(2));
                    fpropb.setfproIdCtoInver(resultSet.getInt(3));
                    fpropb.setfproTipoFondo(resultSet.getString(4));
                    fpropb.setfproFormula(resultSet.getString(5));
                    fpropb.setfproSaldoObjetivo(resultSet.getDouble(6));
                    fpropb.setfproSaldo(resultSet.getDouble(7));
                    fpropb.setfproPorcentaje(resultSet.getDouble(8));
                    fpropb.setfproConcepto(resultSet.getString(9));
                    fpropb.setfproPeriodicidad(resultSet.getString(10));
                    fpropb.setfproReceptor(resultSet.getInt(11));
                    fpropb.setfproPagador(resultSet.getInt(12));
                    fpropb.setfproTexComentario(resultSet.getString(13));
                    fpropb.setfproFecReservaTras(resultSet.getString(14)!=null?resultSet.getString(14):"");
                    fpropb.setfproImpReservaTras(resultSet.getDouble(15));
                    fpropb.setfproFecHono(resultSet.getString(16)!=null?resultSet.getString(16):"");
                    fpropb.setfproPagaHono(resultSet.getInt(17));
                    fpropb.setfproPagaCredito(resultSet.getInt(18));
                    fpropb.setfproStPropor(resultSet.getString(19));
                    fpropb.setfproCuentaClave(resultSet.getString(20));
                } else 
                {
                  fpropb = null;
                }
              
              
              statement.close();
              resultSet.close();
              connection.close();
              fiduciaConnection.CloseBD();
              
         } catch (Exception e) {
          LOGGER.debug("Error en FCreditosDao.consultar: " + e.getMessage());
         }
      
    return fpropb;
    }
    
    public int borrar(String keys)
    {
      int resultado;
      String Arreglokeys[]=null;
      StringBuffer stringBufferSQL = new StringBuffer();
      PreparedStatement ps;
      Arreglokeys = keys.split("-");
      
      stringBufferSQL.append("DELETE FROM F_PROPORCIONES WHERE FPRO_ID_FIDEICOMISO = ? AND  FPRO_ID_CREDITO = ? AND FPRO_ID_CTO_INVER = ?");
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
              ps.setInt(3,Integer.parseInt(Arreglokeys[2]));
              resultado = ps.executeUpdate();
              ps.close();
              connection.close();
              fiduciaConnection.CloseBD();
              return resultado;
      } catch (Exception e) {
          LOGGER.debug("Error en FProporcionesDao.baja: " + e.getMessage());
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
        case 1003 : sentenciaSql = "SELECT FCBA_CLABE_CBA FROM F_CUEBAN"; break;// CTA CLABE;
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
              sentenciaSql = "SELECT COUNT(*) FROM F_PROPORCIONES WHERE FPRO_ID_FIDEICOMISO = "+valores[0]+" AND FPRO_ID_CREDITO = '"+valores[1]+"' AND FPRO_ID_CTO_INVER = "+valores[2]; 
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
