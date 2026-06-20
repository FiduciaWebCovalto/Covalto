package com.bancomext.daos;

import com.bancomext.beans.FDeposito;
import com.bancomext.beans.FRetiro;
import com.bancomext.beans.Instrucc;
import com.bancomext.beans.Traspaso;
import com.bancomext.negocio.nFiducia;
import com.bancomext.lib.conexion;
import com.bancomext.beans.Honorarios;
import java.util.StringTokenizer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class InstruccDAO
{

  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null,resultSet2=null;
  
  public String generarTablaInstrucciones(String insCveStInstruc, String fecha) 
  {   
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();

    sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, ");//1
    sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");//2
    sbSQL.append("TO_CHAR(TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");//3
    sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'RECEPCION INTERNET', 'DEPOSITO', 'LIQUIDACION INTERNET', 'RETIRO', 'TRASPASO INTERNET', 'TRASPASO','HONORARIOS INTERNET','HONORARIOS',INS_CVE_TIPO_INSTR||' '||INS_TXT_COMENTARIO) AS INSTRUCCION, ");//4
    sbSQL.append("DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2, 'TRASPASO INTERNET',3,'HONORARIOS INTERNET',4,'VALIDA OPERACION',5) AS TIPO, ");//5
    sbSQL.append("TO_CHAR(DECODE(NVL(D.FDPO_IMPORTE_DEPOSITO,0),0,DECODE(NVL(R.FRET_IMP_RETIRO,0),0,NVL(D.DVA_IMP_DATO1,0),NVL(R.FRET_IMP_RETIRO,0)),NVL(D.FDPO_IMPORTE_DEPOSITO,0)),'999,999,999,999,990.00') AS IMPORTE, ");
    sbSQL.append("TO_CHAR(NVL(FTSP_IMPORTE_TRASPASO,0),'999,999,999,999,990.00') AS IMPORTE_TRASPASO, ");
    sbSQL.append("DECODE(NVL(D.FDEP_MONEDA,0),1,'MONEDA NACIONAL',2,'DOLAR AMERICANO',54,'DOLAR AMERICANO',46,'EUROS') AS MONDEPOSITO, ");
    sbSQL.append("DECODE(NVL(R.FRET_MONEDA,0),1,'MONEDA NACIONAL',2,'DOLAR AMERICANO',54,'DOLAR AMERICANO',46,'EUROS') AS MONRETIRO, ");
    sbSQL.append("(SELECT MON_NOM_MONEDA FROM CONTINTE,MONEDAS WHERE CPR_NUM_PAIS=MON_NUM_PAIS AND CPR_CONTRATO_INTER=FCIN_ID_CTO_INVERSION_DESTINO AND CPR_NUM_CONTRATO=INS_NUM_CONTRATO AND CPR_ENTIDAD_FIN=1) AS MONEDA_TRASPASO, ");
    sbSQL.append("DECODE(INS_CVE_ST_INSTRUC, 'ACTIVO', 'PEND. VALIDACIÓN LEGAL', ");
    sbSQL.append("'ENVIO A FIDUCIA', 'PEND. ENVÍO A FIDUCIA',  ");
    sbSQL.append("'RECHAZADA', 'RECHAZADA',  "); 
    sbSQL.append("INS_CVE_ST_INSTRUC) AS STATUS ");
    sbSQL.append(",TO_CHAR(NVL(C.FCOH_IMPORTE_CIVA,0),'999,999,999,999,990.00') AS IMPORTE_HONORARIOS "); 
    sbSQL.append(",DECODE(NVL(C.FCOH_MONEDA,0),1,'MONEDA NACIONAL',2,'DOLAR AMERICANO',54,'DOLAR AMERICANO',46,'EUROS') AS MONHONORARIOS ");    
    sbSQL.append("FROM INSTRUCC, F_DEPOSITO D, F_RETIRO R, F_TRASPASO T,F_COBRO C,DATOVAL D ");
    sbSQL.append("WHERE ");
    sbSQL.append("INS_CVE_ST_INSTRUC IN ('" + insCveStInstruc + "') AND ");
    sbSQL.append("INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET','HONORARIOS INTERNET','VALIDA OPERACION' ,'LIQUIDACION DE CREACIONES EN T3','LIQUIDACION DE REDENCIONES EN T3','LIQUIDACION DE NAFTRACS EN T3','LIQUIDACION MERCADO DE CAPITALES','LIQUIDACION COMISION INTERMEDIACION') AND ");
    sbSQL.append("R.FRET_ID_RETIRO(+)=INS_NUM_FOLIO_INST AND ");
    sbSQL.append("D.FDPO_ID_DEPOSITO(+)=INS_NUM_FOLIO_INST AND ");
    sbSQL.append("FTSP_ID_TRASPASO(+)=INS_NUM_FOLIO_INST ");
    sbSQL.append("AND FCOH_ID_COBRO(+)=INS_NUM_FOLIO_INST "); 
    sbSQL.append("AND D.DVA_FOLIO_OPERA(+)= INS_NUM_FOLIO_INST "); 
    sbSQL.append("AND TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy')= TO_DATE('" + fecha + "','dd/mm/yyyy') ");
    sbSQL.append("ORDER BY 4, FOLIO ASC "); 

    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        conexion fiduciaConnection = new conexion();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conectarBD();
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(sbSQL.toString());    
        /*
        1-FIDEICOMISO
        2-FOLIO
        3-FECHA
        4-INSTRUCCION
        5-TIPO
        6-IMPORTE
        7-IMPORTE_TRASPASO
        8-MONEDA DEPOSITO
        9-MONEDA RETIRO
        10-MONEDA_TRASPASO	
        11-STATUS
        */
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" >");
          if (insCveStInstruc.equals("ENVIO A FIDUCIA")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");          
          } else if (insCveStInstruc.equals("TRANSITO")) {          
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoAsignado\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>"); 
          } else if (insCveStInstruc.equals("AUTORIZADA")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");     
          }else if (insCveStInstruc.equals("INUSUAL','RELEVANTE','24 HORAS")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");     
          } else if (insCveStInstruc.equals("ACTIVO','ENVIO A FIDUCIA','TRANSITO','AUTORIZADA")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");     
          } else if (insCveStInstruc.equals("ACTIVO','ENVIO A FIDUCIA','TRANSITO','RELEVANTE','INUSUAL','24 HORAS','AUTORIZADA")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");     
          } else {
            sbTabla.append("<td align=\"center\">"+(resultSet.getString(1)==null?"":resultSet.getString(1))+"</td>");
          }
          
          sbTabla.append("<td align=\"center\"><a href=\"javascript:detalle("+ (resultSet.getString(2)==null?"":resultSet.getString(2))+",'");
          sbTabla.append(resultSet.getString(4)==null?"":resultSet.getString(4) + "');\">");
          sbTabla.append((resultSet.getString(2)==null?"":resultSet.getString(2))+"</td>");
          
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
          //sbTabla.append("<td align=\"center\">" + (resultSet.getString(5)==null?"":resultSet.getString(5)) + "</td>");
          if (resultSet.getString(6) != null && resultSet.getString(8) == null && resultSet.getString(9) == null && resultSet.getString(10) == null) { //F_OPETRACK  
              sbTabla.append("<td align=\"center\">" + resultSet.getString(6) + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(8)==null?"":resultSet.getString(8)) + "</td>");
          }
          else if (resultSet.getString(6) != null && resultSet.getString(6).length() > 0 && 
            resultSet.getString(8) != null && resultSet.getString(8).length() > 0) { //DEPOSITO  
              sbTabla.append("<td align=\"center\">" + resultSet.getString(6) + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(8)==null?"":resultSet.getString(8)) + "</td>");
          }else if  (resultSet.getString(6) != null && resultSet.getString(6).length() > 0 && 
            resultSet.getString(9) != null && resultSet.getString(9).length() > 0) { //RETIRO
              sbTabla.append("<td align=\"center\">" + resultSet.getString(6) + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(9)==null?"":resultSet.getString(9)) + "</td>");              
          } else if  (resultSet.getString("IMPORTE_HONORARIOS") != null && resultSet.getString("IMPORTE_HONORARIOS").length() > 0 && 
            resultSet.getString("MONHONORARIOS") != null && resultSet.getString("MONHONORARIOS").length() > 0) { //
              sbTabla.append("<td align=\"center\">" + resultSet.getString("IMPORTE_HONORARIOS") + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString("MONHONORARIOS")==null?"":resultSet.getString("MONHONORARIOS")) + "</td>");              
          } else {  
          //String a = resultSet.getString(7);
            sbTabla.append("<td align=\"center\">" + resultSet.getString(7) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(10)==null?"":resultSet.getString(10)) + "</td>");
          }  
          if (!insCveStInstruc.equals("TRANSITO")) { 
            //STATUS
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(11)==null?"":resultSet.getString(11)) + "</td>");
          }          
          sbTabla.append("</tr>\n");
        }//while          
        

        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
      
      } catch (Exception e) {
          e.printStackTrace();
      } 
      		finally
		{
			
			try { if(resultSet != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(statement != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(connection != null ) connection.close(); } catch (Exception ex) { System.out.println(ex); }
     
		}
    return sbTabla.toString();
  }



  /**
   * 
   * @return 
   * @param fdpoIdDeposito
   * @param ffidIdFideicomiso
   */
  public FDeposito obtenerDetalleDeposito(String fdpoIdDeposito) 
  {
    
    FDeposito fDeposito = new FDeposito();
    StringBuffer sbSQL = new StringBuffer();
    
    sbSQL.append("SELECT TO_CHAR(FDEP_FECHA,'DD/MM/YYYY') as fecha, ");//1
    sbSQL.append("'SI' as rutinaria, ");//2
    sbSQL.append("c2.cve_desc_clave as concepto, ");//3
    sbSQL.append("FDPO_ID_DEPOSITO as folio, ");//4
    sbSQL.append("FCIN_ID_CTO_INVERSION as contrato, ");//5
    sbSQL.append("FDPO_IMPORTE_DEPOSITO as importe, ");//6
    sbSQL.append("FDPO_CBA_INSTITUCION As numCuenta, ");//7
    sbSQL.append("c1.cve_desc_clave as nomcuenta, ");//8
    sbSQL.append("MON_NOM_MONEDA as moneda, ");//9
    sbSQL.append("'PERSONA' as persona, ");//10
    sbSQL.append("DECODE(FDEP_STATUS, 'ACTIVO', 'PEND. VALIDACIÓN LEGAL', FDEP_STATUS) AS STATUS, ");//11
    sbSQL.append("FDEP_DESCRIPCION, ");//12
    sbSQL.append("FDPO_TIPO_CAMBIO_PROV, ");//13
    sbSQL.append("FDPO_TIPO_CAMBIO_FIRME, ");//14
    sbSQL.append("TO_CHAR(FFID_ID_FIDEICOMISO)||'-'||CTO_NOM_CONTRATO AS FIDEICOMISO,");//15
    sbSQL.append("TO_CHAR(FSCT_ID_SUB_CUENTA)||'-'||FSCT_NOMBRE_SUB_CUENTA AS SUBCUENTA ");//16
    sbSQL.append("FROM F_DEPOSITO, claves c1, CLAVES C2, MONEDAS, CONTRATO,F_SUBCUENTA ");
    sbSQL.append("WHERE 1=1 ");
    sbSQL.append("AND FDPO_ID_DEPOSITO = '"+fdpoIdDeposito+"'  ");
    sbSQL.append("AND FDPO_SUBCTA = FSCT_ID_SUB_CUENTA (+)  ");
    sbSQL.append("AND FFID_ID_FIDEICOMISO = FSCT_ID_FIDEICOMISO (+) ");
    sbSQL.append("AND C2.CVE_NUM_SEC_CLAVE = FDPO_CONCEPTO_DEP ");
    sbSQL.append("AND c1.CVE_LIMSUP_CLAVE = FDPO_CBA_INSTITUCION ");
    sbSQL.append("AND FDEP_MONEDA= MON_NUM_PAIS ");
    sbSQL.append("AND c1.cve_num_clave = 403 ");
    sbSQL.append("AND c2.cve_num_clave = 75  ");
    sbSQL.append("AND CTO_NUM_CONTRATO=FFID_ID_FIDEICOMISO ");
    
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString()); 
        if (resultSet.next()) 
        { 
          fDeposito = new FDeposito();
          fDeposito.setValor1(resultSet.getString(1));
          fDeposito.setValor2(resultSet.getString(2));
          fDeposito.setValor3(resultSet.getString(3));
          fDeposito.setValor4(resultSet.getString(4));
          fDeposito.setValor5(resultSet.getString(5));
          fDeposito.setValor6(resultSet.getString(6));
          fDeposito.setValor7(resultSet.getString(7));
          fDeposito.setValor8(resultSet.getString(8));
          fDeposito.setValor9(resultSet.getString(9));
          fDeposito.setValor10(resultSet.getString(10));
          fDeposito.setValor11(resultSet.getString(11));
          fDeposito.setValor12(resultSet.getString(12));
          fDeposito.setValor13(resultSet.getString(13));
          fDeposito.setValor14(resultSet.getString(14));
          fDeposito.setValor15(resultSet.getString(15));
          fDeposito.setValor16(resultSet.getString(16));
          
        }//while          
        
          
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
     fiduciaConnection.conectarBD().close();
    int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
       
      } catch (Exception e) {
          e.printStackTrace();
      }
    return fDeposito;
  }


  public int agregarInstruccion(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {

      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='TRANSITO' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");   
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DETLIQUI ");
      sbSQL.append("SET DEL_CVE_ST_DETLIQU='TRANSITO' ");
      sbSQL.append("WHERE DEL_FOLIO_OPERA = ? "); 
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DEPOSIT ");
      sbSQL.append("SET DPO_CVE_ST_DEPOSI = 'TRANSITO' ");
      sbSQL.append("WHERE DPO_FOLIO_RCP = ? "); 
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_RETIRO ");
      sbSQL.append("SET FRET_STATUS_RET = 'TRANSITO' ");
      sbSQL.append("WHERE FRET_ID_RETIRO = ? ");  
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }      
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_DEPOSITO ");
      sbSQL.append("SET FDEP_STATUS = 'TRANSITO' ");
      sbSQL.append("WHERE FDPO_ID_DEPOSITO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }   
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_TRASPASO ");
      sbSQL.append("SET FTSP_STATUS = 'TRANSITO' ");
      sbSQL.append("WHERE FTSP_ID_TRASPASO = ? "); 
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      } 
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_COBRO ");
      sbSQL.append("SET FCOH_STATUS = 'TRANSITO' ");
      sbSQL.append("WHERE FCOH_ID_COBRO = ? "); 
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
      fiduciaConnection.conectarBD().close();
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }
  
  
  public int quitarInstruccion(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");      
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DETLIQUI ");
      sbSQL.append("SET DEL_CVE_ST_DETLIQU='PENDIENTE' ");
      sbSQL.append("WHERE DEL_FOLIO_OPERA = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DEPOSIT ");
      sbSQL.append("SET DPO_CVE_ST_DEPOSI = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE DPO_FOLIO_RCP = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }              

      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_RETIRO ");
      sbSQL.append("SET FRET_STATUS_RET = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FRET_ID_RETIRO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_DEPOSITO ");
      sbSQL.append("SET FDEP_STATUS = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FDPO_ID_DEPOSITO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_TRASPASO ");
      sbSQL.append("SET FTSP_STATUS = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FTSP_ID_TRASPASO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_COBRO ");
      sbSQL.append("SET FCOH_STATUS = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FCOH_ID_COBRO = ? "); 
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      } 
      
        if (connection != null)
          connection.close();
        if (preparedStatement != null)
          preparedStatement.close();
    fiduciaConnection.conectarBD().close();
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
   * @param usuario
   * @param folio
   */
  public int autorizarFirma(String folio, String usuario, String fdpoTipoCambioFirme, String tipo,String sComentario)
  {
    int res = 0;
    StringBuffer sbSQL = new StringBuffer();
    String secuencia = new String();
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        //SELECT MAX(F_AUI_SECUENCIAL+1) FROM F_AUTORIZA_INSTRUCC
        sbSQL.append("SELECT NVL(MAX(F_AUI_SECUENCIAL+1), 1) FROM F_AUTORIZA_INSTRUCC WHERE F_AUI_ID_INSTRUCC = '" + folio+"'");
        resultSet = statement.executeQuery(sbSQL.toString());    
        if (resultSet.next()) 
        { 
          secuencia = resultSet.getString(1);
        }
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();

        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();        
        sbSQL = new StringBuffer();
        sbSQL.append("INSERT INTO F_AUTORIZA_INSTRUCC(F_AUI_ID_INSTRUCC, F_AUI_ID_USUARIO, F_AUI_SECUENCIAL) VALUES(?, ?, ?) ");
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, folio);
        preparedStatement.setString(2, usuario);
        preparedStatement.setString(3, secuencia);
        res = preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();

          //se actualiza el comentario en la tabla instrucc campo ins_nom_miembro  
          connection = fiduciaConnection.conectarBD();
          statement = connection.createStatement();        
          sbSQL = new StringBuffer();
          sbSQL.append("UPDATE INSTRUCC SET INS_NOM_MIEMBRO=? WHERE INS_NUM_FOLIO_INST=?");
          preparedStatement = connection.prepareStatement(sbSQL.toString());
          preparedStatement.setString(1, sComentario);
          preparedStatement.setString(2, folio);        
          res = preparedStatement.executeUpdate();
          if (preparedStatement != null)
          preparedStatement.close();
          if (resultSet != null)
            resultSet.close();
          if (statement != null)
            statement.close();
          if (connection != null)
            connection.close();


        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();        
        if (tipo != null && tipo.equals("DEPOSITO")) {
          sbSQL = new StringBuffer();
          sbSQL.append("UPDATE F_DEPOSITO SET FDPO_TIPO_CAMBIO_FIRME = ? WHERE FDPO_ID_DEPOSITO = ? ");
          preparedStatement = connection.prepareStatement(sbSQL.toString());
          preparedStatement.setString(1, fdpoTipoCambioFirme);
          preparedStatement.setString(2, folio);
          res = preparedStatement.executeUpdate();
          if (preparedStatement != null)
          preparedStatement.close();
          
        } else if (tipo != null && tipo.equals("RETIRO") && fdpoTipoCambioFirme!=null) {
          sbSQL = new StringBuffer();
          sbSQL.append("UPDATE F_RETIRO SET FRET_TIPO_CAMBIO_FIRME = ? WHERE FRET_ID_RETIRO = ? ");
          preparedStatement = connection.prepareStatement(sbSQL.toString());
          preparedStatement.setDouble(1, Double.valueOf(fdpoTipoCambioFirme).doubleValue());
          preparedStatement.setInt(2, Integer.valueOf(folio).intValue());
          res = preparedStatement.executeUpdate();          
          if (preparedStatement != null)
          preparedStatement.close();
        }
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        
        cambiarStatusAutorizarFirma(folio);
        
        if (resultSet != null)
          resultSet.close();
        if (preparedStatement != null)
          preparedStatement.close();          
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();      
    fiduciaConnection.conectarBD().close();
        int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }

        
      } catch (Exception e) {
          e.printStackTrace();
      }
    return res;
  }
  

 /**
   * 
   * @return 
   * @param usuario
   * @param folio
   */
  public int rechazarFirma(String folio, String usuario,String sComentario)
  {
    int res = 0;
    StringBuffer sbSQL = new StringBuffer();
    String secuencia = new String();
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        //SELECT MAX(F_AUI_SECUENCIAL+1) FROM F_AUTORIZA_INSTRUCC
        sbSQL.append("SELECT NVL(MAX(F_AUI_SECUENCIAL+1), 1) FROM F_AUTORIZA_INSTRUCC WHERE F_AUI_ID_INSTRUCC = '" + folio+"'");
        resultSet = statement.executeQuery(sbSQL.toString());    
        if (resultSet.next()) 
        { 
          secuencia = resultSet.getString(1);
          if (resultSet != null)
          resultSet.close();
        }
        
        sbSQL = new StringBuffer();
        sbSQL.append("INSERT INTO F_AUTORIZA_INSTRUCC(F_AUI_ID_INSTRUCC, F_AUI_ID_USUARIO, F_AUI_SECUENCIAL) VALUES(?, ?, ?) ");
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, folio);
        preparedStatement.setString(2, usuario);
        preparedStatement.setString(3, secuencia);
        res = preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();

            //se actualiza el comentario en la tabla instrucc campo ins_nom_miembro  
          sbSQL = new StringBuffer();
          sbSQL.append("UPDATE INSTRUCC SET INS_NOM_MIEMBRO=? WHERE INS_NUM_FOLIO_INST=?");
          preparedStatement = connection.prepareStatement(sbSQL.toString());
          preparedStatement.setString(1, sComentario);
          preparedStatement.setString(2, folio);       
          res = preparedStatement.executeUpdate();
          if (preparedStatement != null)
          preparedStatement.close();

        
        cambiarStatusRechazarFirma(folio);
        
        
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        if (preparedStatement != null)
        preparedStatement.close();
        fiduciaConnection.conectarBD().close();
      
      } catch (Exception e) {
          e.printStackTrace();
      }
    return res;
  }  
  
  public int cambiarStatusAutorizarFirma(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");      
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
      if (connection != null)
        connection.close();

      connection = fiduciaConnection.conectarBD();            
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DETLIQUI ");
      sbSQL.append("SET DEL_CVE_ST_DETLIQU='ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE DEL_FOLIO_OPERA = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
      if (connection != null)
        connection.close();

      connection = fiduciaConnection.conectarBD();                
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DEPOSIT ");
      sbSQL.append("SET DPO_CVE_ST_DEPOSI = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE DPO_FOLIO_RCP = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
      if (connection != null)
        connection.close();

      connection = fiduciaConnection.conectarBD();                      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_RETIRO ");
      sbSQL.append("SET FRET_STATUS_RET = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FRET_ID_RETIRO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
      if (connection != null)
        connection.close();

      connection = fiduciaConnection.conectarBD();                              
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_DEPOSITO ");
      sbSQL.append("SET FDEP_STATUS = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FDPO_ID_DEPOSITO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
      if (connection != null)
        connection.close();

      connection = fiduciaConnection.conectarBD();                                    
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_TRASPASO ");
      sbSQL.append("SET FTSP_STATUS = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FTSP_ID_TRASPASO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
        
      connection = fiduciaConnection.conectarBD();                                      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_COBRO ");
      sbSQL.append("SET FCOH_STATUS = 'ENVIO A FIDUCIA' ");
      sbSQL.append("WHERE FCOH_ID_COBRO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate(); 
      if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
     fiduciaConnection.conectarBD().close();
    int i=0;
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
    while(preparedStatement!=null&&i!=10)
    {
      preparedStatement.close();i++;
    }
    
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;  }

  
  public int cambiarStatusRechazarFirma(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='RECHAZADA' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");      
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DETLIQUI ");
      sbSQL.append("SET DEL_CVE_ST_DETLIQU='RECHAZADA' ");
      sbSQL.append("WHERE DEL_FOLIO_OPERA = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
    
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DEPOSIT ");
      sbSQL.append("SET DPO_CVE_ST_DEPOSI = 'RECHAZADA' ");
      sbSQL.append("WHERE DPO_FOLIO_RCP = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();

      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_RETIRO ");
      sbSQL.append("SET FRET_STATUS_RET = 'RECHAZADA' ");
      sbSQL.append("WHERE FRET_ID_RETIRO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate(); 
      if (preparedStatement != null)
        preparedStatement.close();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_DEPOSITO ");
      sbSQL.append("SET FDEP_STATUS = 'RECHAZADA' ");
      sbSQL.append("WHERE FDPO_ID_DEPOSITO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();       
      if (preparedStatement != null)
        preparedStatement.close();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_TRASPASO ");
      sbSQL.append("SET FTSP_STATUS = 'RECHAZADA' ");
      sbSQL.append("WHERE FTSP_ID_TRASPASO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
        
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_COBRO ");
      sbSQL.append("SET FCOH_STATUS = 'RECHAZADA' ");
      sbSQL.append("WHERE FCOH_ID_COBRO = ? ");
      preparedStatement = connection.prepareStatement(sbSQL.toString());
      preparedStatement.setString(1, insNumFolioInst);
      resultado += preparedStatement.executeUpdate();
      if (preparedStatement != null)
        preparedStatement.close();
        
      
      if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
    fiduciaConnection.conectarBD().close();
    int i=0;
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
    while(preparedStatement!=null&&i!=10)
    {
      preparedStatement.close();i++;
    }
    
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
    } 
  
  
  public String obtenerFirmas(String folio)
  {
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();
    
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        sbSQL.append("SELECT B.FUSU_NOMBRE_USUARIO FROM F_AUTORIZA_INSTRUCC A, F_USUARIO B WHERE A.F_AUI_ID_USUARIO = B.FUSU_ID_USUARIO AND F_AUI_ID_INSTRUCC = '" + folio + "' ORDER BY F_AUI_SECUENCIAL ");
        resultSet = statement.executeQuery(sbSQL.toString());    
        int i=0;
        while (resultSet.next())
        { 
          i++;
          sbTabla.append("<tr class=\"celda02\">");
          sbTabla.append("  <td>Firma " + i +" :</td>");
          sbTabla.append("  <td>"+resultSet.getString(1)+"</td>");
          sbTabla.append("</tr>");
        } 
        if (i==0) 
        {
          sbTabla.append("<tr class=\"celda02\"><td>Firma 1 :</td><td>&nbsp;</td></tr>");
          sbTabla.append("<tr class=\"celda02\"><td>Firma 2 :</td><td>&nbsp;</td></tr>");
          sbTabla.append("<tr class=\"celda02\"><td>Firma 3 :</td><td>&nbsp;</td></tr>");
        }
                
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
        
      } catch (Exception e) {
          e.printStackTrace();
      }
    return sbTabla.toString();
  }  
  
  
  public int verificarUsuarioFirma(String folio, String usuario)
  {
    int res = 0;
    StringBuffer sbSQL = new StringBuffer();
  
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        sbSQL.append("SELECT F_AUI_SECUENCIAL FROM F_AUTORIZA_INSTRUCC WHERE F_AUI_ID_USUARIO = '"+ usuario +"' AND F_AUI_ID_INSTRUCC = '" + folio+"' ");
        resultSet = statement.executeQuery(sbSQL.toString());    
        if (resultSet.next())
        { 
          res = resultSet.getInt(1);
        }        
        
        
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
        int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
      
      } catch (Exception e) {
          e.printStackTrace();
      }
    return res;
  }  
 
 /**
   * Obtiene el detalle del Retiro 
   * @return 
   * @param  folio
   */
  public FRetiro obtenerDetalleRetiro(String folio) {
  
    FRetiro fRetiro = new FRetiro();
    StringBuffer sbSQL = new StringBuffer();
    
 		sbSQL.append("SELECT TO_CHAR(R.FRET_FECHA,'DD/MM/YYYY') as fecha, ");//1
    sbSQL.append(" CXR.FCIN_ID_CTO_INVERSION as contrato,");//2
    sbSQL.append(" R.FRET_IMP_RETIRO as importe,");//3
		sbSQL.append(" 'SI' as rutinaria,");//4
		sbSQL.append(" C2.CVE_DESC_CLAVE AS concepto,");//5
		sbSQL.append(" C1.CVE_DESC_CLAVE as formaLiq,");//6
		sbSQL.append(" R.FRET_TIPO_LIQUIDACION AS claveLiquid,");//7
		sbSQL.append(" 'BANCO' AS banco,");//8
		sbSQL.append(" R.FCBA_CLABE_CBA AS numCta,");//9
		sbSQL.append(" R.FRET_NOM_BENEFICIARIO AS numCtaBanxico,");//10
		sbSQL.append(" R.FRET_NOM_BENEFICIARIO AS beneficiario,");//11
		sbSQL.append(" 'PLAZA' AS plaza,");//12
		sbSQL.append(" 'RFC' AS rfcTEF, ");//13
		sbSQL.append(" NVL(TO_CHAR(R.SES_FECHA,'DD/MM/YYYY'),'')  As fechaSesion,");//14
		sbSQL.append(" DECODE(R.SES_TIPO,'O','ORDINARIA','E','EXTRAORDINARIA',R.SES_TIPO) As tipoSesion,");//15
		sbSQL.append(" R.ACU_ID As noAcuerdo," );//16
    sbSQL.append(" R.FRET_REFERENCIA_CIE AS REFERENCIA,");//17
    sbSQL.append(" R.FRET_CONVENIO_CIE AS CONVENIO,");//18
    sbSQL.append(" R.FRET_TIPO_CAMBIO_PROV,");//19
    sbSQL.append(" R.FRET_TIPO_CAMBIO_FIRME,");//20             
    sbSQL.append(" TO_CHAR(R.FFID_ID_FIDEICOMISO)||'-'||C.CTO_NOM_CONTRATO AS FIDEICOMISO, ");//21
    sbSQL.append(" R.FRET_DESCRIPCION,");//22
    sbSQL.append(" R.FRET_NOM_BENEFICIARIO,");//23
    sbSQL.append(" MON_NOM_MONEDA as moneda,");//24
    sbSQL.append(" DECODE(FRET_STATUS_RET, 'ACTIVO', 'PEND. VALIDACIÓN LEGAL', FRET_STATUS_RET) AS STATUS, ");//25
    sbSQL.append(" TO_CHAR(R.FRET_SUBCTA)||'-'||S.FSCT_NOMBRE_SUB_CUENTA AS SUBCUENTA ");//26
    sbSQL.append(" FROM ");
    sbSQL.append(" instrucc I, F_RETIRO R, CLAVES C1, CLAVES C2, F_CTOINV_RET CXR, CONTRATO C, MONEDAS, F_SUBCUENTA S");
		sbSQL.append(" WHERE ");
		sbSQL.append(" R.FRET_ID_RETIRO = '"+folio+"' ");
		sbSQL.append(" AND I.ins_num_folio_inst=R.FRET_ID_RETIRO ");
		sbSQL.append(" AND I.ins_num_contrato=R.FFID_ID_FIDEICOMISO ");
		sbSQL.append(" AND R.FRET_ID_RETIRO=CXR.FRET_ID_RETIRO ");                  
		sbSQL.append(" AND C1.CVE_NUM_CLAVE=81 AND C1.CVE_NUM_SEC_CLAVE=R.FRET_TIPO_LIQUIDACION");
		sbSQL.append(" AND C2.CVE_NUM_CLAVE=128 AND C2.CVE_NUM_SEC_CLAVE=R.FRET_CONCEPTO");
    sbSQL.append(" AND C.CTO_NUM_CONTRATO=R.FFID_ID_FIDEICOMISO");
    sbSQL.append(" AND R.FRET_SUBCTA = S.FSCT_ID_SUB_CUENTA (+) ");
    sbSQL.append(" AND R.FFID_ID_FIDEICOMISO = S.FSCT_ID_FIDEICOMISO (+) ");
    sbSQL.append(" AND FRET_MONEDA= MON_NUM_PAIS");
    //sbSQL.append(" AND R.FRET_ID_RETIRO(+)=I.INS_NUM_FOLIO_INST");
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString());    
        if (resultSet.next())
        { 
         fRetiro = new FRetiro();
         fRetiro.setValor1(resultSet.getString(1));
         fRetiro.setValor2(resultSet.getString(2));
         fRetiro.setValor3(resultSet.getString(3));
         fRetiro.setValor4(resultSet.getString(4));
         fRetiro.setValor5(resultSet.getString(5));
         fRetiro.setValor6(resultSet.getString(6));
         fRetiro.setValor7(resultSet.getString(7));
         fRetiro.setValor8(resultSet.getString(8));
         fRetiro.setValor9(resultSet.getString(9));
         fRetiro.setValor10(resultSet.getString(10));
         fRetiro.setValor11(resultSet.getString(11));
         fRetiro.setValor12(resultSet.getString(12));
         fRetiro.setValor13(resultSet.getString(13));
         fRetiro.setValor14(resultSet.getString(14));
         fRetiro.setValor15(resultSet.getString(15));
         fRetiro.setValor16(resultSet.getString(16));
         fRetiro.setValor17(resultSet.getString(17));
         fRetiro.setValor18(resultSet.getString(18));
         fRetiro.setValor19(resultSet.getString(19));
         fRetiro.setValor20(resultSet.getString(20));
         fRetiro.setValor21(resultSet.getString(21));
         fRetiro.setValor22(resultSet.getString(22));
         fRetiro.setValor23(resultSet.getString(23));
         fRetiro.setValor24(resultSet.getString(24));
         fRetiro.setValor25(resultSet.getString(25));
         fRetiro.setValor26(resultSet.getString(26));
         
        }        
    
        
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
    int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
      
      } catch (Exception e) {
          e.printStackTrace();
      }
    return fRetiro;
  
  }
  

  public Instrucc obtenerInstruccion(String insNumFolioInst) 
  {   
    StringBuffer sbSQL = new StringBuffer();
    Instrucc instrucc = null;

    sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, ");//1
    sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");//2
    sbSQL.append("TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");//3
    sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'RECEPCION INTERNET', 'DEPOSITO', 'LIQUIDACION INTERNET', 'RETIRO', 'TRASPASO INTERNET', 'TRASPASO','HONORARIOS INTERNET','HONORARIOS') AS INSTRUCCION, ");//4
    sbSQL.append("DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2, 'TRASPASO INTERNET',3,'HONORARIOS INTERNET',4) AS TIPO, ");//5    
    sbSQL.append("TO_CHAR(DECODE(NVL(D.FDPO_IMPORTE_DEPOSITO,0),0,NVL(R.FRET_IMP_RETIRO,0),NVL(D.FDPO_IMPORTE_DEPOSITO,0)),'999,999,999,999,990.00') AS IMPORTE, ");//6
    sbSQL.append("TO_CHAR(NVL(FTSP_IMPORTE_TRASPASO,0),'999,999,999,999,990.00') AS IMPORTE_TRASPASO, ");//7
    sbSQL.append("DECODE(NVL(D.FDEP_MONEDA,0),1,'MONEDA NACIONAL',2,'DOLAR AMERICANO') AS MONDEPOSITO, ");//8
    sbSQL.append("DECODE(NVL(R.FRET_MONEDA,0),1,'MONEDA NACIONAL',2,'DOLAR AMERICANO') AS MONRETIRO, ");//9
    sbSQL.append("(SELECT MON_NOM_MONEDA FROM CONTINTE,MONEDAS WHERE CPR_NUM_PAIS=MON_NUM_PAIS AND CPR_CONTRATO_INTER=FCIN_ID_CTO_INVERSION_DESTINO AND CPR_NUM_CONTRATO=INS_NUM_CONTRATO AND CPR_ENTIDAD_FIN=1) AS MONEDA_TRASPASO, ");//10
    sbSQL.append("DECODE(INS_CVE_ST_INSTRUC, 'ACTIVO', 'PEND. VALIDACIÓN LEGAL', ");//11
    sbSQL.append("'AUTORIZADA', 'PEND. VALIDACIÓN OPERATIVA',  ");
    sbSQL.append("'TRANSITO', 'LISTA PARA ENVÍO A FIDUCIA', INS_CVE_ST_INSTRUC) AS STATUS ");
    sbSQL.append(",TO_CHAR(NVL(C.FCOH_IMPORTE_CIVA,0),'999,999,999,999,990.00') AS IMPORTE_HONORARIOS "); //12
    sbSQL.append(",DECODE(NVL(C.FCOH_MONEDA,0),1,'MONEDA NACIONAL',2,'DOLAR AMERICANO') AS MONHONORARIOS ");  //13  
    sbSQL.append("FROM INSTRUCC, F_DEPOSITO D, F_RETIRO R, F_TRASPASO T ,F_COBRO C ");
    sbSQL.append("WHERE 1=1 AND INS_NUM_FOLIO_INST = '" + insNumFolioInst + "' ");
    sbSQL.append("AND INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET','HONORARIOS INTERNET','VALIDA OPERACION') ");
    sbSQL.append("AND R.FRET_ID_RETIRO(+)=INS_NUM_FOLIO_INST ");
    sbSQL.append(" AND D.FDPO_ID_DEPOSITO(+)=INS_NUM_FOLIO_INST ");
    sbSQL.append(" AND T.FTSP_ID_TRASPASO(+)=INS_NUM_FOLIO_INST ");
    sbSQL.append(" AND C.FCOH_ID_COBRO(+)=INS_NUM_FOLIO_INST "); 

    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString());    
        /*
        1-FIDEICOMISO
        2-FOLIO
        3-FECHA
        4-INSTRUCCION
        5-TIPO
        6-IMPORTE
        7-IMPORTE_TRASPASO
        8-MONEDA DEPOSITO
        9-MONEDA RETIRO
        10-MONEDA_TRASPASO	
        11-STATUS
        */
        if (resultSet.next()) 
        { 
         instrucc = new Instrucc();
         instrucc.setValor1(resultSet.getString(1));
         instrucc.setValor2(resultSet.getString(2));
         instrucc.setValor3(resultSet.getString(3));
         instrucc.setValor4(resultSet.getString(4));
         instrucc.setValor5(resultSet.getString(5));
         instrucc.setValor6(resultSet.getString(6));
         instrucc.setValor7(resultSet.getString(7));
         instrucc.setValor8(resultSet.getString(8));
         instrucc.setValor9(resultSet.getString(9));
         instrucc.setValor10(resultSet.getString(10));
         instrucc.setValor11(resultSet.getString(11));
         instrucc.setValor12(resultSet.getString(12));
         instrucc.setValor13(resultSet.getString(13));
         
        }//while          
        
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
          
    int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
     
      } catch (Exception e) {
          e.printStackTrace();
      }
    return instrucc;
  }


  public String generarArchivo(String fecha, String moneda) 
  {
    StringBuffer sb = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();
    Instrucc instrucc = null;

    sbSQL.append("SELECT DISTINCT TO_CHAR(FRET_FECHA,'DD/MM/YYYY'), 'RETIRO', TO_CHAR(C.FCIN_ID_CTO_INVERSION), TO_CHAR(R.FRET_IMP_RETIRO,'999,999,999,999,999,999,999,990.00') AS DETALLE, M.MON_NOM_MONEDA ");
    sbSQL.append("FROM F_RETIRO R, F_CTOINV_RET C, MONEDAS M WHERE ");
    sbSQL.append("C.FRET_ID_RETIRO = R.FRET_ID_RETIRO AND ");
    sbSQL.append("M.MON_NUM_PAIS = R.FRET_MONEDA AND ");
    sbSQL.append("TO_CHAR(FRET_FECHA,'DD/MM/YYYY') = ? ");
    if (moneda!=null && moneda.equals("1"))
      sbSQL.append("AND R.FRET_MONEDA = ? ");
    else 
      sbSQL.append("AND R.FRET_MONEDA <> 1 ");
    sbSQL.append("UNION ");
    sbSQL.append("SELECT DISTINCT TO_CHAR(FDEP_FECHA,'DD/MM/YYYY'), 'DEPOSITO', TO_CHAR(FCIN_ID_CTO_INVERSION), TO_CHAR(FDPO_IMPORTE_DEPOSITO,'999,999,999,999,999,999,999,990.00') AS DETALLE, M.MON_NOM_MONEDA ");
    sbSQL.append("FROM F_DEPOSITO, MONEDAS M ");
    sbSQL.append("WHERE F_DEPOSITO.FDEP_MONEDA = M.MON_NUM_PAIS ");
    sbSQL.append("AND TO_CHAR(FDEP_FECHA,'DD/MM/YYYY') = ? ");
    if (moneda!=null && moneda.equals("1"))
      sbSQL.append("AND f_deposito.fdep_moneda = ? ");
    else 
      sbSQL.append("AND f_deposito.fdep_moneda <> 1 ");

//PARA TRASPASO PARA DEPOSITO
    sbSQL.append("UNION ");
    sbSQL.append("SELECT DISTINCT TO_CHAR(FTSP_FECHA,'DD/MM/YYYY'), 'DEPOSITO', TO_CHAR(FCIN_ID_CTO_INVERSION_DESTINO), TO_CHAR(FTSP_IMPORTE_TRASPASO,'999,999,999,999,999,999,999,990.00') AS DETALLE, M.MON_NOM_MONEDA ");
    sbSQL.append("FROM F_TRASPASO, MONEDAS M,CONTINTE ");
    sbSQL.append("WHERE ");
    sbSQL.append("TO_CHAR(FTSP_FECHA,'DD/MM/YYYY') = ? ");
    sbSQL.append("AND FCIN_ID_CTO_INVERSION_DESTINO=CPR_CONTRATO_INTER ");
    sbSQL.append("AND FFID_ID_FIDEICOMISO=CPR_NUM_CONTRATO AND CONTINTE.CPR_NUM_PAIS = M.MON_NUM_PAIS ");
    if (moneda!=null && moneda.equals("1"))
      sbSQL.append("AND CONTINTE.CPR_NUM_PAIS = ? ");
    else
      sbSQL.append("AND CONTINTE.CPR_NUM_PAIS <> 1 ");
    //PARA TRASPASO PARA RETIRO
    sbSQL.append("UNION ");
    sbSQL.append("SELECT DISTINCT TO_CHAR(FTSP_FECHA,'DD/MM/YYYY'), 'RETIRO', TO_CHAR(FCIN_ID_CTO_INVERSION_ORIGEN), TO_CHAR(FTSP_IMPORTE_TRASPASO,'999,999,999,999,999,999,999,990.00') AS DETALLE, M.MON_NOM_MONEDA ");
    sbSQL.append("FROM F_TRASPASO, MONEDAS M,CONTINTE ");
    sbSQL.append("WHERE  ");
    sbSQL.append("TO_CHAR(FTSP_FECHA,'DD/MM/YYYY') = ? ");
    sbSQL.append("AND FCIN_ID_CTO_INVERSION_ORIGEN=CPR_CONTRATO_INTER ");
    sbSQL.append("AND FFID_ID_FIDEICOMISO=CPR_NUM_CONTRATO AND CONTINTE.CPR_NUM_PAIS = M.MON_NUM_PAIS ");
    if (moneda!=null && moneda.equals("1"))
      sbSQL.append("AND CONTINTE.CPR_NUM_PAIS = ? ");
    else
      sbSQL.append("AND CONTINTE.CPR_NUM_PAIS <> 1 ");
      
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();

        preparedStatement = connection.prepareStatement(sbSQL.toString());
        if (moneda!=null && moneda.equals("1")) {
          preparedStatement.setString(1, fecha);
          preparedStatement.setString(2, moneda);
          preparedStatement.setString(3, fecha);
          preparedStatement.setString(4, moneda);
          preparedStatement.setString(5, fecha);
          preparedStatement.setString(6, moneda);
          preparedStatement.setString(7, fecha);
          preparedStatement.setString(8, moneda);
          
        } else 
        {
          preparedStatement.setString(1, fecha);
          preparedStatement.setString(2, fecha);
        }
        resultSet = preparedStatement.executeQuery();
        
        sb.append("<table border=1>");
        while (resultSet.next()) 
        { 
          sb.append("<tr><td>" + resultSet.getString(1)+"</td>" );
          sb.append("<td>" + resultSet.getString(2)+"</td>" );
          sb.append("<td>" + resultSet.getString(3)+"</td>" );
          sb.append("<td>" + resultSet.getString(4)+"</td>" );
          sb.append("<td>" + resultSet.getString(5)+"</td></tr>" );
        }//while          
        sb.append("</table>");
        
        
        if (resultSet != null)
          resultSet.close();
        if (connection != null)
          connection.close();
        if (preparedStatement != null)
        preparedStatement.close();
      fiduciaConnection.conectarBD().close();
      } catch (Exception e) {
          e.printStackTrace();
      }
   
    return sb.toString();
  }
  
/**
   * Obtiene el detalle del Traspaso 
   * @return 
   * @param ftspIdTraspaso
   */
   
   public Traspaso obtenerDetalleTraspaso(String ftspIdTraspaso) 
{
    Traspaso fTraspaso = new Traspaso();
    StringBuffer sbSQL = new StringBuffer();

    sbSQL.append("SELECT TO_CHAR(T.FTSP_FECHA,'DD/MM/YYYY') as fecha, ");//1
    sbSQL.append("(SELECT DISTINCT TO_CHAR(T.FCIN_ID_CTO_INVERSION_ORIGEN,'9999999999') FROM CONTINTE C1 WHERE C1.CPR_NUM_CONTRATO=T.FFID_ID_FIDEICOMISO) as ctoOrigen, ");//2
    sbSQL.append("(SELECT DISTINCT TO_CHAR(T.FCIN_ID_CTO_INVERSION_DESTINO,'9999999999') FROM CONTINTE C2 WHERE C2.CPR_NUM_CONTRATO=T.FFID_ID_FIDEICOMISO) as ctoDestino, ");//3
    sbSQL.append("TO_CHAR(T.FTSP_IMPORTE_TRASPASO,'999,999,999,999,999.00') as importe,T.FTSP_STATUS AS status, ");//4 Y 5
    sbSQL.append("TO_CHAR(T.FFID_ID_FIDEICOMISO)||'-'||C.CTO_NOM_CONTRATO AS FIDEICOMISO, ");//6
    sbSQL.append("(SELECT S1.FSCT_ID_SUB_CUENTA||'-'||S1.FSCT_NOMBRE_SUB_CUENTA FROM F_SUBCUENTA S1 WHERE S1.FSCT_ID_FIDEICOMISO=T.FFID_ID_FIDEICOMISO AND S1.FSCT_ID_SUB_CUENTA=T.FTSP_SUBCTA_ORIGEN) AS SCTAORIGEN, ");//7
    sbSQL.append("(SELECT S2.FSCT_ID_SUB_CUENTA||'-'||S2.FSCT_NOMBRE_SUB_CUENTA FROM F_SUBCUENTA S2 WHERE S2.FSCT_ID_FIDEICOMISO=T.FFID_ID_FIDEICOMISO and S2.FSCT_ID_SUB_CUENTA= T.FTSP_SUBCTA_DESTINO) AS SCTADESTINO  ");//8
    sbSQL.append("FROM F_TRASPASO T, CONTRATO C ");
    sbSQL.append(" where ");
    sbSQL.append("T.FTSP_ID_TRASPASO='"+ftspIdTraspaso+"'");
    sbSQL.append("AND C.CTO_NUM_CONTRATO=T.FFID_ID_FIDEICOMISO");

    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString());    
        if (resultSet.next()) 
        { 
          fTraspaso = new Traspaso();
          fTraspaso.setValor1(resultSet.getString(1));
          fTraspaso.setValor2(resultSet.getString(2));
          fTraspaso.setValor3(resultSet.getString(3));
          fTraspaso.setValor4(resultSet.getString(4));
          fTraspaso.setValor5(resultSet.getString(5));
          fTraspaso.setValor6(resultSet.getString(6));
          fTraspaso.setValor7(resultSet.getString(7));
          fTraspaso.setValor8(resultSet.getString(8));
          
        }//while          
        
        
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
          fiduciaConnection.conectarBD().close();
    int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
      
      } catch (Exception e) {
          e.printStackTrace();
      }
    return fTraspaso;
}
  
  
  public int aceptarMovimiento(String insNumFolioInst, String usuario) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {
    
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        aceptarInstruccion(st.nextElement().toString(), usuario);
      }  
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
   * @param insNumFolioInst
   */
  public int rechazarInstruccion(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='RECHAZADA' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");      
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DETLIQUI ");
      sbSQL.append("SET DEL_CVE_ST_DETLIQU='RECHAZADA' ");
      sbSQL.append("WHERE DEL_FOLIO_OPERA = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DEPOSIT ");
      sbSQL.append("SET DPO_CVE_ST_DEPOSI = 'RECHAZADA' ");
      sbSQL.append("WHERE DPO_FOLIO_RCP = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }              

      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_RETIRO ");
      sbSQL.append("SET FRET_STATUS_RET = 'RECHAZADA' ");
      sbSQL.append("WHERE FRET_ID_RETIRO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_DEPOSITO ");
      sbSQL.append("SET FDEP_STATUS = 'RECHAZADA' ");
      sbSQL.append("WHERE FDPO_ID_DEPOSITO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_TRASPASO ");
      sbSQL.append("SET FTSP_STATUS = 'RECHAZADA' ");
      sbSQL.append("WHERE FTSP_ID_TRASPASO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_COBRO ");
      sbSQL.append("SET FCOH_STATUS = 'RECHAZADA' ");
      sbSQL.append("WHERE FCOH_ID_COBRO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {      
       preparedStatement = connection.prepareStatement(sbSQL.toString());
       preparedStatement.setString(1, st.nextElement().toString());
       resultado += preparedStatement.executeUpdate();
       if (preparedStatement != null)
        preparedStatement.close();
      }
      
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {  
        cambiarStatusRechazarFirma(st.nextElement().toString());
      }

        
        if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
      fiduciaConnection.conectarBD().close();
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }


  public String contabilizarInstruccion(String insNumFolioInst) {
    
    String resultado = null;
    
    try { 
      
          conexion fiduciaConnection = new conexion();
          connection = fiduciaConnection.conectarBD();
          StringTokenizer st = new StringTokenizer("");
          CallableStatement spContabiliza;

          spContabiliza = connection.prepareCall( "{CALL CONTABILIDAD_FIDUCIAWEB.SP_CONTABILIZA(?,?)}" );
          spContabiliza.clearParameters();   
          spContabiliza.setInt(1, Integer.parseInt(insNumFolioInst));          
          spContabiliza.registerOutParameter(2, Types.INTEGER);            
          spContabiliza.execute();
          
          long res = spContabiliza.getLong(2);
          resultado=String.valueOf(res);
			
          if (connection != null)
            connection.close();   
          fiduciaConnection.conectarBD().close();                 
      } catch (Exception ex){ 
        System.out.println(ex); 
      }
        return resultado;  
   } 


  public boolean aceptarInstruccion(String insNumFolioInst, String usuario) {
    
    boolean resultado = false;
    
    try { 
          conexion fiduciaConnection = new conexion();
          connection = fiduciaConnection.conectarBD();
          StringTokenizer st = new StringTokenizer("");
          CallableStatement spContabiliza;

          spContabiliza = connection.prepareCall( "{CALL CONTABILIDAD_FIDUCIAWEB.SP_ACEPTA_INSTRUCCION(?, ?)}" );
          spContabiliza.clearParameters();   
          spContabiliza.setString(1, insNumFolioInst); 
          spContabiliza.setString(2, usuario);           
          resultado = spContabiliza.execute();
          System.out.println(resultado);

          if (connection != null)
            connection.close();   
          fiduciaConnection.conectarBD().close();                 
      } catch (Exception ex){ 
        System.out.println(ex); 
      }
        return resultado;  
     } 

  /**
   * 
   * @return 
   * @param fdpoIdHonorarios
   */
  public Honorarios obtenerDetalleHonorarios(String fcohIdCobro)
  {
    Honorarios fHonorarios = new Honorarios();
    StringBuffer sbSQL = new StringBuffer();
    
    sbSQL.append("SELECT TO_CHAR(FCOH_FECHA_PROVISION,'DD/MM/YYYY') as fecha, ");//1
    sbSQL.append("FCOH_TIPO_PERSONA as TIPOPERSONA, ");//2
    sbSQL.append("TO_CHAR(FCOH_ID_PERSONA) as NUMEROPERSONA, ");//3
    sbSQL.append("TO_CHAR(FPRO_ID_PROVISION) as SECUENCIALPROVISION, ");//4
    sbSQL.append("FCOH_TIPO_HONO as TIPOHONORARIO, ");//5
    sbSQL.append("TO_CHAR(FCOH_IMPORTE_CIVA,'999,999,999,999,999.00') as importe, ");//6
    sbSQL.append("DECODE(FCOH_STATUS, 'ACTIVO', 'PEND. VALIDACIÓN LEGAL', FCOH_STATUS) AS STATUS, ");//7
    sbSQL.append("TO_CHAR(FFID_ID_FIDEICOMISO)||'-'||CTO_NOM_CONTRATO AS FIDEICOMISO ");//8
    sbSQL.append(",MON_NOM_MONEDA as moneda, ");//9
    sbSQL.append("TO_CHAR(FCOH_FECHA_COBRO) as fechaCobro ");//10
    sbSQL.append("FROM F_COBRO, CONTRATO, MONEDAS ");
    sbSQL.append("WHERE ");
    sbSQL.append("FCOH_ID_COBRO = '"+fcohIdCobro+"'  ");
    sbSQL.append("AND FCOH_MONEDA= MON_NUM_PAIS ");
    sbSQL.append("AND CTO_NUM_CONTRATO=FFID_ID_FIDEICOMISO ");
    
    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString()); 
        if (resultSet.next()) 
        { 
          fHonorarios = new Honorarios();
          fHonorarios.setValor1(resultSet.getString(1));
          fHonorarios.setValor2(resultSet.getString(2));
          fHonorarios.setValor3(resultSet.getString(3));
          fHonorarios.setValor4(resultSet.getString(4));
          fHonorarios.setValor5(resultSet.getString(5));
          fHonorarios.setValor6(resultSet.getString(6));
          fHonorarios.setValor7(resultSet.getString(7));
          fHonorarios.setValor8(resultSet.getString(8));
          fHonorarios.setValor9(resultSet.getString(9));
          fHonorarios.setValor10(resultSet.getString(10));
        }//while          
        

        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
          fiduciaConnection.conectarBD().close();
    int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
      
      } catch (Exception e) {
          e.printStackTrace();
      }
    return fHonorarios;
   } 
   
   
  public Instrucc obtenerDetalleCompraVenta(String insNumFolioInst) 
  {   
    StringBuffer sbSQL = new StringBuffer();
    Instrucc instrucc = null;

    sbSQL.append("SELECT I.INS_TXT_COMENTARIO AS DESCRIPCION, ");//16
    sbSQL.append("TRIM(TO_CHAR(NVL(D.DVA_IMP_DATO1,0),'999,999,999,999,999,999.99')) AS IMPORTE, ");//17
    sbSQL.append("D.DVA_IMP_DATO5||'-'||C.CTO_NOM_CONTRATO AS FIDEICOMISO, ");//18
    sbSQL.append("D.DVA_NUM_DATO6||'-'||S.FSCT_NOMBRE_SUB_CUENTA AS SUBCTA,  ");//19
    sbSQL.append("D.DVA_NUM_DATO8 AS CTOINVER, ");//20
   sbSQL.append("TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");//3
    sbSQL.append("DECODE(INS_CVE_ST_INSTRUC, 'ACTIVO', 'PEND. VALIDACIÓN LEGAL', ");
    sbSQL.append("'AUTORIZADA', 'PEND. VALIDACIÓN OPERATIVA',  ");
    sbSQL.append("'TRANSITO', 'LISTA PARA ENVÍO A FIDUCIA', INS_CVE_ST_INSTRUC) AS STATUS ");//11
    sbSQL.append("FROM INSTRUCC I,DATOVAL D, CONTRATO C, F_SUBCUENTA S ");
    sbSQL.append("WHERE D.DVA_FOLIO_OPERA = I.INS_NUM_FOLIO_INST");
    sbSQL.append(" AND C.CTO_NUM_CONTRATO = D.DVA_IMP_DATO5 ");
    sbSQL.append(" AND S.FSCT_ID_FIDEICOMISO = D.DVA_IMP_DATO5 ");
    sbSQL.append(" AND S.FSCT_ID_SUB_CUENTA = D.DVA_NUM_DATO6 ");
    sbSQL.append("  AND D.DVA_FOLIO_OPERA = "+insNumFolioInst);

    try {
        conexion fiduciaConnection = new conexion();
        connection = fiduciaConnection.conectarBD();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString());    
        /*
         3-FECHA
         11-STATUS
        16-DESCRIPCION
        17-IMPORTE
        18-FIDEICOMISO
        19-SUBCTA
        20-CTOINVER
        */
        if (resultSet.next()) 
        { 
         instrucc = new Instrucc();
         instrucc.setValor16(resultSet.getString(1));
         instrucc.setValor17(resultSet.getString(2));
         instrucc.setValor18(resultSet.getString(3));
         instrucc.setValor19(resultSet.getString(4));
         instrucc.setValor20(resultSet.getString(5));
         instrucc.setValor3(resultSet.getString(6));
         instrucc.setValor11(resultSet.getString(7));
         
        }//while          
        
        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
          
    int i=0;
    while(resultSet!=null&&i!=10)
    {
      resultSet.close();i++;
    }
    while(statement!=null&&i!=10)
    {
      statement.close();i++;
    }
    while(connection!=null&&i!=10)
    {
      connection.close();i++;
    }
     
      } catch (Exception e) {
          e.printStackTrace();
      }
    return instrucc;
  }
   
// --------------- INTERNA SOSPECHOSA ---------------


public int internaSospechosa(String insNumFolioInst,int iEjecutivo, String sComment,String status) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("DELETE FROM F_INTERNA_PREOCUPANTE ");
      sbSQL.append("WHERE FIP_ID_FOLIO = ? AND FIP_CVE_STATUS='"+status+"'");      
      //sbSQL.append("AND FIP_CVE_STATUS = '"+status+"' ");      
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
    
      sbSQL = new StringBuffer();
      sbSQL.append("INSERT INTO F_INTERNA_PREOCUPANTE ");
      sbSQL.append("(FIP_ID_FOLIO,FIP_EJECUTIVO,FIP_COMENTARIO,FIP_CVE_STATUS) ");
      sbSQL.append("VALUES (?,?,?,'"+status+"') ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) 
      {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        preparedStatement.setInt(2, iEjecutivo);
        preparedStatement.setString(3, sComment);
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
        
      if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
        
      fiduciaConnection.conectarBD().close();
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }


    // --------------- INUSUALES, RELEVANTES Y 24 HORAS ---------------


    public int inusual_relevante_24horas(String insNumFolioInst,int iEjecutivo, String sComment,String status,String sReporta) 
      {
        StringBuffer sbSQL = null;
        int resultado = 0;
        StringTokenizer st = new StringTokenizer("");
        try 
        {   
          conexion fiduciaConnection = new conexion();
          connection = fiduciaConnection.conectarBD();
          
          sbSQL = new StringBuffer();
          sbSQL.append("DELETE FROM F_OP_INUREL24 ");
          sbSQL.append("WHERE FIR_ID_FOLIO = ? ");      
          st = new StringTokenizer(insNumFolioInst, "|");
          while(st.hasMoreTokens()) {
            preparedStatement = connection.prepareStatement(sbSQL.toString());
            preparedStatement.setString(1, st.nextElement().toString());
            resultado += preparedStatement.executeUpdate();
            if (preparedStatement != null)
            preparedStatement.close();
          }
        
          sbSQL = new StringBuffer();
          sbSQL.append("INSERT INTO F_OP_INUREL24 ");
          sbSQL.append("(FIR_ID_FOLIO,FIR_EJECUTIVO,FIR_COMENTARIO,FIR_REPORTA) ");
          sbSQL.append("VALUES (?,?,?,?) ");
          st = new StringTokenizer(insNumFolioInst, "|");
          while(st.hasMoreTokens()) 
          {
            preparedStatement = connection.prepareStatement(sbSQL.toString());
            preparedStatement.setString(1, st.nextElement().toString());
            preparedStatement.setInt(2, iEjecutivo);
            preparedStatement.setString(3, sComment);
            preparedStatement.setString(4, sReporta);  
            resultado += preparedStatement.executeUpdate();
            if (preparedStatement != null)
            preparedStatement.close();
          }
            
          if (connection != null)
            connection.close();
          if (preparedStatement != null)
            preparedStatement.close();
            
          fiduciaConnection.conectarBD().close();
         } 
         catch (Exception e) 
         {
            e.printStackTrace();
         }
        return resultado;
      }

// ---------------  ACEPTA INTERNA----------------------

public int aceptaInstruccion(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='ACTIVO' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");      
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DETLIQUI ");
      sbSQL.append("SET DEL_CVE_ST_DETLIQU='ACTIVO' ");
      sbSQL.append("WHERE DEL_FOLIO_OPERA = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE DEPOSIT ");
      sbSQL.append("SET DPO_CVE_ST_DEPOSI = 'ACTIVO' ");
      sbSQL.append("WHERE DPO_FOLIO_RCP = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }              

      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_RETIRO ");
      sbSQL.append("SET FRET_STATUS_RET = 'ACTIVO' ");
      sbSQL.append("WHERE FRET_ID_RETIRO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_DEPOSITO ");
      sbSQL.append("SET FDEP_STATUS = 'ACTIVO' ");
      sbSQL.append("WHERE FDPO_ID_DEPOSITO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }    
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_TRASPASO ");
      sbSQL.append("SET FTSP_STATUS = 'ACTIVO' ");
      sbSQL.append("WHERE FTSP_ID_TRASPASO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE F_COBRO ");
      sbSQL.append("SET FCOH_STATUS = 'ACTIVO' ");
      sbSQL.append("WHERE FCOH_ID_COBRO = ? ");
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {      
       preparedStatement = connection.prepareStatement(sbSQL.toString());
       preparedStatement.setString(1, st.nextElement().toString());
       resultado += preparedStatement.executeUpdate();
       if (preparedStatement != null)
        preparedStatement.close();
      }
        
        if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
      fiduciaConnection.conectarBD().close();
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }

  
  public int autorizaInstruccion(String insNumFolioInst) 
  {
    StringBuffer sbSQL = null;
    int resultado = 0;
    StringTokenizer st = new StringTokenizer("");
    try 
    {
      conexion fiduciaConnection = new conexion();
      connection = fiduciaConnection.conectarBD();
      
      sbSQL = new StringBuffer();
      sbSQL.append("UPDATE INSTRUCC ");
      sbSQL.append("SET INS_CVE_ST_INSTRUC='AUTORIZADA' ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST = ? ");      
      st = new StringTokenizer(insNumFolioInst, "|");
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        resultado += preparedStatement.executeUpdate();
        if (preparedStatement != null)
        preparedStatement.close();
      }
      
      if (connection != null)
        connection.close();
      if (preparedStatement != null)
        preparedStatement.close();
      fiduciaConnection.conectarBD().close();
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }


  public String generarTablaInstruccionesNoMonetarias(String insCveStInstruc, String fecha) 
  {   
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();

    sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, "); 
    sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");
    sbSQL.append("TO_CHAR(TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");
    sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'INSTRUCCION NO MONETARIA', 'INSTRUCCION NO MONETARIA',INS_CVE_TIPO_INSTR||' '||INS_TXT_COMENTARIO) AS INSTRUCCION, ");
    sbSQL.append("FTOP_NOMBRE_TIPOPER AS TIPO, ");
    sbSQL.append("DECODE(INS_CVE_ST_INSTRUC, 'ACTIVO', 'ACTIVO', 'RECHAZADA', 'RECHAZADA',  INS_CVE_ST_INSTRUC) AS STATUS   ");  
    sbSQL.append("FROM INSTRUCC, F_TIPOPER ");
    sbSQL.append("WHERE INS_NUM_OPER  = FTOP_NUM_OPER ");
    sbSQL.append("AND INS_CVE_TIPO_INSTR IN ('INSTRUCCION NO MONETARIA') ");
    sbSQL.append("AND INS_CVE_ST_INSTRUC IN ('"+insCveStInstruc+"') ");
    sbSQL.append("AND TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy')= TO_DATE('"+fecha+"','dd/mm/yyyy') "); 
    sbSQL.append("ORDER BY FOLIO ASC"); 

    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        conexion fiduciaConnection = new conexion();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conectarBD();
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(sbSQL.toString());    
        /*
        1-FIDEICOMISO
        2-FOLIO
        3-FECHA
        4-INSTRUCCION
        5-TIPO
        6-STATUS
        */
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" >");
          if (insCveStInstruc.equals("ACTIVO")||insCveStInstruc.equals("RECHAZADA")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(2)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(5)==null?"":resultSet.getString(5)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(6)==null?"":resultSet.getString(6)) + "</td>");
          }
          sbTabla.append("</tr>\n");
        }//while          
        

        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
      
      } catch (Exception e) {
          e.printStackTrace();
      } 
      		finally
		{
			
			try { if(resultSet != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(statement != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(connection != null ) connection.close(); } catch (Exception ex) { System.out.println(ex); }
     
		}
    return sbTabla.toString();
  }

// -------------------------------------------------- 
   
// CONSULTA DE OPERACIONES PLD
  public String generarTablaInstruccionesOpePLD(String insCveStInstruc, String fecha,String sFolio,String sRFC,String sFideicomiso) 
  {   
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();

    sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, "); 
    sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");
    sbSQL.append("TO_CHAR(TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");
    sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'INSTRUCCION NO MONETARIA', 'INSTRUCCION NO MONETARIA',INS_CVE_TIPO_INSTR||' '||INS_TXT_COMENTARIO) AS INSTRUCCION, ");
    sbSQL.append("'SIN TIPO' AS TIPO, ");
    sbSQL.append("FIC_STATUS AS STATUS,FIR_COMENTARIO COMENTARIO   ");  
    sbSQL.append("FROM INSTRUCC, F_OP_INUREL24INP, BENEFICI,F_OP_INUREL24 ");
    sbSQL.append("WHERE INS_NUM_FOLIO_INST  = FIC_ID_FOLIO ");
    sbSQL.append(" AND (FIC_TIPO_PERSONA='FIDEICOMISARIO' OR FIC_TIPO_PERSONA='BENEFICIARIO') ");
    sbSQL.append(" AND INS_NUM_CONTRATO = BEN_NUM_CONTRATO");
    sbSQL.append(" AND BEN_BENEFICIARIO = FIC_NUM_PERSONA");
    sbSQL.append(" AND FIR_ID_FOLIO(+) = FIC_ID_FOLIO");
      if(sFolio!=""&&sFolio!=null&&!sFolio.equals(""))
          sbSQL.append(" AND INS_NUM_FOLIO_INST = "+sFolio);
      if(sRFC!=""&&sRFC!=null&&!sRFC.equals(""))
          sbSQL.append(" AND FID_RFC = "+sRFC);
      if(sFideicomiso!=""&&sFideicomiso!=null&&!sFideicomiso.equals(""))
          sbSQL.append(" AND INS_NUM_CONTRATO = "+sFideicomiso);

    sbSQL.append(" AND TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy')= TO_DATE('"+fecha+"','dd/mm/yyyy') "); 

      sbSQL.append(" UNION ");

      sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, "); 
      sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");
      sbSQL.append("TO_CHAR(TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");
      sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'INSTRUCCION NO MONETARIA', 'INSTRUCCION NO MONETARIA',INS_CVE_TIPO_INSTR||' '||INS_TXT_COMENTARIO) AS INSTRUCCION, ");
      sbSQL.append("'SIN TIPO' AS TIPO, ");
      sbSQL.append("FIC_STATUS AS STATUS,FIR_COMENTARIO COMENTARIO   ");  
      sbSQL.append("FROM INSTRUCC, F_OP_INUREL24INP, FIDEICOM, F_OP_INUREL24 ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST  = FIC_ID_FOLIO ");
      sbSQL.append(" AND (FIC_TIPO_PERSONA='FIDEICOMITENTE') ");
      sbSQL.append(" AND INS_NUM_CONTRATO = FID_NUM_CONTRATO");
      sbSQL.append(" AND FID_FIDEICOMITENTE = FIC_NUM_PERSONA");
      sbSQL.append(" AND FIR_ID_FOLIO(+) = FIC_ID_FOLIO");      
      if(sFolio!=""&&sFolio!=null&&!sFolio.equals(""))
          sbSQL.append(" AND INS_NUM_FOLIO_INST = "+sFolio);
      if(sRFC!=""&&sRFC!=null&&!sRFC.equals(""))
          sbSQL.append(" AND FID_RFC = "+sRFC);
      if(sFideicomiso!=""&&sFideicomiso!=null&&!sFideicomiso.equals(""))
          sbSQL.append(" AND INS_NUM_CONTRATO = "+sFideicomiso);

      sbSQL.append(" AND TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy')= TO_DATE('"+fecha+"','dd/mm/yyyy') "); 

    sbSQL.append(" ORDER BY 2 ASC"); 

    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        conexion fiduciaConnection = new conexion();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conectarBD();
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(sbSQL.toString());    
        /*
        1-FIDEICOMISO
        2-FOLIO
        3-FECHA
        4-INSTRUCCION
        5-TIPO
        6-STATUS
        */
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" >");
          //if (insCveStInstruc.equals("ACTIVO")||insCveStInstruc.equals("RECHAZADA")) {
            sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
            sbTabla.append("<td align=\"center\"><a href=\"javascript:detalle("+ (resultSet.getString(2)==null?"":resultSet.getString(2))+",'");
            sbTabla.append(resultSet.getString(4)==null?"":resultSet.getString(4) + "');\">");
            sbTabla.append((resultSet.getString(2)==null?"":resultSet.getString(2))+"</td>");            
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
            //sbTabla.append("<td align=\"center\">" + (resultSet.getString(5)==null?"":resultSet.getString(5)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(6)==null?"":resultSet.getString(6)) + "</td>");
            sbTabla.append("<td align=\"center\">" + (resultSet.getString(7)==null?"":resultSet.getString(7)) + "</td>");
          //}
            
          sbTabla.append("</tr>\n");
        }//while          
        

        if (resultSet != null)
          resultSet.close();
        if (statement != null)
          statement.close();
        if (connection != null)
          connection.close();
        fiduciaConnection.conectarBD().close();
      
      } catch (Exception e) {
          e.printStackTrace();
      } 
      		finally
		{
			
			try { if(resultSet != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(statement != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(connection != null ) connection.close(); } catch (Exception ex) { System.out.println(ex); }
     
		}
    return sbTabla.toString();
  }  
   


    public String generarTablaInstruccionesOpePLD(String insCveStInstruc, String fecha) 
    {   
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer sbSQL = new StringBuffer();

      sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, "); 
      sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");
      sbSQL.append("TO_CHAR(TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");
      sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'INSTRUCCION NO MONETARIA', 'INSTRUCCION NO MONETARIA',INS_CVE_TIPO_INSTR||' '||INS_TXT_COMENTARIO) AS INSTRUCCION, ");
      sbSQL.append("'SIN TIPO' AS TIPO, ");
      sbSQL.append("FIC_STATUS AS STATUS,FIR_COMENTARIO COMENTARIO   ");  
      sbSQL.append("FROM INSTRUCC, F_OP_INUREL24INP, BENEFICI,F_OP_INUREL24 ");
      sbSQL.append("WHERE INS_NUM_FOLIO_INST  = FIC_ID_FOLIO ");
      sbSQL.append(" AND (FIC_TIPO_PERSONA='FIDEICOMISARIO' OR FIC_TIPO_PERSONA='BENEFICIARIO') ");
      sbSQL.append(" AND INS_NUM_CONTRATO = BEN_NUM_CONTRATO");
      sbSQL.append(" AND BEN_BENEFICIARIO = FIC_NUM_PERSONA");
      sbSQL.append(" AND FIR_ID_FOLIO(+) = FIC_ID_FOLIO");

      sbSQL.append(" AND TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy')= TO_DATE('"+fecha+"','dd/mm/yyyy') "); 

        sbSQL.append(" UNION ");

        sbSQL.append("SELECT INS_NUM_CONTRATO AS FIDEICOMISO, "); 
        sbSQL.append("INS_NUM_FOLIO_INST AS FOLIO, ");
        sbSQL.append("TO_CHAR(TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA, ");
        sbSQL.append("DECODE(INS_CVE_TIPO_INSTR, 'INSTRUCCION NO MONETARIA', 'INSTRUCCION NO MONETARIA',INS_CVE_TIPO_INSTR||' '||INS_TXT_COMENTARIO) AS INSTRUCCION, ");
        sbSQL.append("'SIN TIPO' AS TIPO, ");
        sbSQL.append("FIC_STATUS AS STATUS,FIR_COMENTARIO COMENTARIO   ");  
        sbSQL.append("FROM INSTRUCC, F_OP_INUREL24INP, FIDEICOM, F_OP_INUREL24 ");
        sbSQL.append("WHERE INS_NUM_FOLIO_INST  = FIC_ID_FOLIO ");
        sbSQL.append(" AND (FIC_TIPO_PERSONA='FIDEICOMITENTE') ");
        sbSQL.append(" AND INS_NUM_CONTRATO = FID_NUM_CONTRATO");
        sbSQL.append(" AND FID_FIDEICOMITENTE = FIC_NUM_PERSONA");
        sbSQL.append(" AND FIR_ID_FOLIO(+) = FIC_ID_FOLIO");      

        sbSQL.append(" AND TO_DATE(REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ',''),'dd/mm/yyyy')= TO_DATE('"+fecha+"','dd/mm/yyyy') "); 

      sbSQL.append(" ORDER BY 2 ASC"); 

      try {
          //Se crea una instancia de la clase que se conecta hacia la base de datos
          conexion fiduciaConnection = new conexion();
          //Asigna el valor de la conexion a la variable declarada
          connection = fiduciaConnection.conectarBD();
          //Crea un statement
          statement = connection.createStatement();
          //Ejecuta el query
          resultSet = statement.executeQuery(sbSQL.toString());    
          /*
          1-FIDEICOMISO
          2-FOLIO
          3-FECHA
          4-INSTRUCCION
          5-TIPO
          6-STATUS
          */
          while (resultSet.next()) 
          { 
            sbTabla.append("<tr class=\"celda02\" >");
            //if (insCveStInstruc.equals("ACTIVO")||insCveStInstruc.equals("RECHAZADA")) {
              sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "\" /></td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
              sbTabla.append("<td align=\"center\"><a href=\"javascript:detalle("+ (resultSet.getString(2)==null?"":resultSet.getString(2))+",'");
              sbTabla.append(resultSet.getString(4)==null?"":resultSet.getString(4) + "');\">");
              sbTabla.append((resultSet.getString(2)==null?"":resultSet.getString(2))+"</td>");            
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(3)==null?"":resultSet.getString(3)) + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(4)==null?"":resultSet.getString(4)) + "</td>");
              //sbTabla.append("<td align=\"center\">" + (resultSet.getString(5)==null?"":resultSet.getString(5)) + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(6)==null?"":resultSet.getString(6)) + "</td>");
              sbTabla.append("<td align=\"center\">" + (resultSet.getString(7)==null?"":resultSet.getString(7)) + "</td>");
            //}
              
            sbTabla.append("</tr>\n");
          }//while          
          

          if (resultSet != null)
            resultSet.close();
          if (statement != null)
            statement.close();
          if (connection != null)
            connection.close();
          fiduciaConnection.conectarBD().close();
        
        } catch (Exception e) {
            e.printStackTrace();
        } 
                  finally
                  {
                          
                          try { if(resultSet != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
                          try { if(statement != null ) statement.close(); } catch (Exception ex) { System.out.println(ex); }
                          try { if(connection != null ) connection.close(); } catch (Exception ex) { System.out.println(ex); }
       
                  }
      return sbTabla.toString();
    }  


    public Instrucc obtenerDatosPLD(String insNumFolioInst) 
    {   
      StringBuffer sbSQL = new StringBuffer();
      Instrucc instrucc = null;
    
    sbSQL.append("SELECT FIR_COMENTARIO,TO_CHAR(NVL(FIR_REPORTA,0)) ");//16
    sbSQL.append("FROM F_OP_INUREL24 ");//17
    sbSQL.append("  WHERE FIR_ID_FOLIO = "+(insNumFolioInst!=null?insNumFolioInst:"0"));
    
      try {
            instrucc = new Instrucc();
          conexion fiduciaConnection = new conexion();
          connection = fiduciaConnection.conectarBD();
          statement = connection.createStatement();
          resultSet = statement.executeQuery(sbSQL.toString());    
          if (resultSet.next()) 
          { 

           instrucc.setValor1(resultSet.getString(1));
           instrucc.setValor2(resultSet.getString(2));           
          }
          else{
              instrucc.setValor1("0");
              instrucc.setValor2("0");                         
          }//while          
          
          if (resultSet != null)
            resultSet.close();
          if (statement != null)
            statement.close();
          if (connection != null)
            connection.close();
          fiduciaConnection.conectarBD().close();
            
      int i=0;
      while(resultSet!=null&&i!=10)
      {
        resultSet.close();i++;
      }
      while(statement!=null&&i!=10)
      {
        statement.close();i++;
      }
      while(connection!=null&&i!=10)
      {
        connection.close();i++;
      }
       
        } catch (Exception e) {
            e.printStackTrace();
        }
     return instrucc;
    }

   
}

