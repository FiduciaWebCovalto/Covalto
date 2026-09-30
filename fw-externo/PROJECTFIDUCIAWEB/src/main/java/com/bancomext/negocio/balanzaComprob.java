/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.negocio;  
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import oracle.jdbc.driver.*;
import java.util.*;
import java.text.NumberFormat;
import java.lang.Double;
import java.lang.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.*;
import java.util.*;
import javax.naming.*;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import com.bancomext.lib.conexion;

public class balanzaComprob  {
	private Connection conBD;
	private ResourceBundle resBundle;
	private NumberFormat formatoMonto;
	private NumberFormat formatoCuentas;
	
	/*
	public balanzaComprob() {
	    conBD = null;
		  resBundle = ResourceBundle.getBundle("FiduciaBDParams");
	    DriverIni();
	}

	private void DriverIni() {
		try {
    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		}catch(SQLException e){
    		System.out.print(e);
		}
	}
*/
	public boolean conectarBD() throws NamingException 
	                                                {
	                                                        try
	                                                        {
                    conexion ds = new conexion();
	            conBD = ds.conectarBD();
	           
	         //} catch (Exception e) {
	         //   e.printStackTrace();
	          //}
	          if(conBD!=null){
	            return true;
	          }  
	          else
	            return false;
	            
	          //conBD = DriverManager.getConnection (resBundle.getString( "db.url" ),resBundle.getString( "db.user" ),resBundle.getString( "db.pwd" ));
	                                                                //return true;
	                                                        }
	                                                        catch (Exception e)
	                                                        {
	                                                                System.out.print(e);
	                                                                return false;
	                                                        }
	                                                }
		
	public void CloseBD() throws SQLException
							{
								try
								{
									if(conBD != null && conBD.isClosed() == false ) conBD.close();
								}
								catch (SQLException e)
								{
									System.out.print(e);
								}
							}

/*****************************CONEXION A BASE DE DATOS**********************************/
/*
    public boolean conectarBD() {
    	ResourceBundle resBundle;
        try {
    		resBundle = ResourceBundle.getBundle("FiduciaBDParams");
            conBD = DriverManager.getConnection (resBundle.getString( "db.url" ),resBundle.getString( "db.user" ),resBundle.getString( "db.pwd" ));
            return true;
        } catch (SQLException e){
            System.out.print(e);
            return false;
        }
    }
		
    public void CloseBD() throws SQLException {
        try {
            if(conBD != null && conBD.isClosed() == false ) conBD.close();
        }catch (SQLException e){
            System.out.print(e);
        }
    }
	*(						
   /************************ FIN METODOS DE CONEXION A BASE DE DATOS**********************/							
		
	public Boolean tieneAdministracion (int numFiso) {
    	
    	Statement st = null;
    	ResultSet rs = null;
    	String    sQuery;
    	
        try {   
            if (conBD == null)if(!conectarBD()) return null;
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            sQuery =  " SELECT DECODE(CTO_TIPO_ADMON,'SI',1,0) "; 
            sQuery += " FROM CONTRATO"; 
            sQuery += " WHERE CTO_NUM_CONTRATO = " + numFiso;
            
            rs=st.executeQuery(sQuery); 
            rs.next();
            return Boolean.valueOf(rs.getBoolean(1));
        } catch (Exception ex){ 
            System.out.println(ex);
            return null;
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
    }		
/*****************************VERIFICA SI TIENE ADMINISTRACION PROPIA************************/
	
	public Vector generaBalanzaCom(int noCuenta, int anio, int mes, int moneda) {
		      Vector    reporte = new Vector();
        	Statement st = null;
        	ResultSet rs = null;
        	String    sQuery;
            try {
                if (conBD == null) if (!conectarBD()) return null;
                if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
            
                st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


                  sQuery = " (SELECT ";
                  sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
                  sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
                  sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
                  sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
                  sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,0,";
                  sQuery += " CUE_NOM_CTA,";
                  sQuery += " ' ',";
                  sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
                  sQuery += " DECODE(SALDOSH.SAL_NUM_AUX3,0,'',SALDOSH.SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
                  sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
                  sQuery += " SAL_ABONOS_PER,";
                  
                  sQuery += " NVL( DECODE(NVL(CUE_CVE_ACREEDORA,0),0,0,SAL_IMP_SALDO_ACT) ,0) AS DEUDOR,";
                  sQuery += " NVL(DECODE(NVL(CUE_CVE_DEUDORA,0),0,0,SAL_IMP_SALDO_ACT) ,0) AS ACREEDOR";
                  
                  sQuery += " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
                  sQuery += " FROM";
                  sQuery += " SALDOSH,";
                  
               
                  if (anio<=2007) 
	                  {
	                  	if (mes>9 && anio==2007)
	                  		{
	                  		 sQuery += " CUENTACO,";	
	                  		}
	                  	else
	                  		{
	                  		 sQuery += " CUENTACO,";	
	                  		}	
	                  }	
                  else
                  		{
                  		sQuery += " CUENTACO,";	
                  		}
                  		
                  sQuery += " CONTRATO";
                  sQuery += " WHERE ";
                  sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
                  sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND ";
                  sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND ";
                  sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND ";
                  sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND ";
                  sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND ";
                  sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO  ";
                  sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
                  sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                  sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
                  sQuery += " AND SAL_NUM_SSSSSCTA= " + Integer.toString(moneda);
                  sQuery += " AND SAL_NUM_CTAM NOT BETWEEN 8000 AND 8999";
                  sQuery += " ) ORDER BY ORDEN ASC ";

                rs=st.executeQuery(sQuery); 
                while ( rs.next() ){
        		    Vector reg = new Vector();

                    reg.add( Integer.valueOf(rs.getInt(1)) );
                    reg.add( Integer.valueOf(rs.getInt(2)) );
                    reg.add( Integer.valueOf(rs.getInt(3)) );
                    reg.add( Integer.valueOf(rs.getInt(4)) );
                    reg.add( Integer.valueOf(rs.getInt(5)) );
                    reg.add( Integer.valueOf(rs.getInt(6)) );
                    reg.add( (rs.getString(7)) );
                    reg.add( (rs.getString(8)) );
                    reg.add( (Math.round(rs.getDouble(9)))+"" );
                    //INSCITECH JULIO 2008
                    //reg.add( Integer.valueOf(rs.getInt(10)) );
                    reg.add( (Math.round(rs.getDouble(10)))+"");
                    reg.add( Double.valueOf(rs.getDouble(11)) );
                    reg.add( Double.valueOf(rs.getDouble(12)) );
                    reg.add( Double.valueOf(rs.getDouble(13)) );
                    reg.add( Double.valueOf(rs.getDouble(15)) );                    
                    reg.add( Double.valueOf(rs.getDouble(14)) );
                    reporte.add(reg);
                }
            
                return reporte;
            } catch (Exception ex) {
                System.out.println(ex);
                return null;
            } finally {
                try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
                try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
                try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
            }
        }
        
/************************OBTIENE LOS DATOS DE LA BALANZA DE COMPROBACION********************/
        public String escribeBalanza( Vector reporte, int pagina ) {
           StringBuffer escribe = new StringBuffer();
           int columna;
           
           try {
               formatoCuentas = NumberFormat.getInstance();
               formatoCuentas.setMaximumIntegerDigits(16);
               formatoCuentas.setMinimumIntegerDigits(1);
               formatoCuentas.setMaximumFractionDigits(2);
               formatoCuentas.setMinimumFractionDigits(2);
           
               int posIni = (((pagina * 16) - 15) - 1);
               int posFin = ( pagina * 16 - 1);
               
               if( posFin >= reporte.size() ) 
                   posFin = (int) reporte.size() - 1;
                   
               
               for(int fila=posIni; fila <= posFin; fila++ ) { 
                    escribe.append("<tr height='30'>");
                    Vector reg = (Vector) reporte.get(fila);
                    for (columna=0; columna < reg.size(); columna++) {
                        if( (columna >= 0) && (columna <= 9) ) { 
                        escribe.append("<td align='center'>" + reg.get(columna).toString() + "</td>");
                        }   
                        else { 
                           escribe.append("<td align='right'>");
                           escribe.append(formatoCuentas.format( ((Double)reg.get(columna)).doubleValue() ));
                           escribe.append("</td>");
                        }
                    }
                    escribe.append("</tr>");
               }
           } catch (Exception ex) {
                System.out.println(ex);
           }
           return escribe.toString();        
        }
/**************************ESCRIBE LOS DATOS EN LA BALANZA DE COMPROBACION*******************/ 
        
        public Vector generaSumas( int noCuenta, int anio, int mes, int moneda ) {
          Vector sumas = new Vector();
          Statement st = null;
        	ResultSet rs = null;
        	String    sQuery;
          
            try {
                if (conBD == null) if (!conectarBD()) return null;
                if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
            
                st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                
                sQuery = " SELECT SUM( SAL_SALDO_INI_PER ),";
                sQuery += " SUM( SAL_CARGOS_PER ) , ";
                sQuery += " SUM( SAL_ABONOS_PER ) , ";
                sQuery += " NVL(SUM( DECODE(CUE_CVE_ACREEDORA,0,0,-1,SAL_IMP_SALDO_ACT) ),0) AS ACREEDOR,";
                sQuery += " NVL(SUM( DECODE(CUE_CVE_DEUDORA,0,0,-1,SAL_IMP_SALDO_ACT) ),0) AS DUEDOR";
                sQuery += " FROM SALDOSH, CONTRATO, CUENTACO ";
                sQuery += " WHERE SAL_NUM_AUX1 = CTO_NUM_CONTRATO ";
                sQuery += " AND SAL_NUM_SCTA = 0 ";
                sQuery += " AND SAL_NUM_SSCTA = 0 ";
                sQuery += " AND SAL_NUM_SSSCTA = 0 ";
                sQuery += " AND SAL_NUM_SSSSCTA = 0 ";
                sQuery += " AND SAL_NUM_AUX2 = 0";
                sQuery += " AND SAL_NUM_AUX3 = 0";
                sQuery += " AND CUE_NUM_CTAM=SAL_NUM_CTAM AND";
                sQuery += " CUE_NUM_SCTA=SAL_NUM_SCTA AND";           
                sQuery += " CUE_NUM_SSCTA=SAL_NUM_SSCTA AND";
                sQuery += " CUE_NUM_SSSCTA=SAL_NUM_SSSCTA AND";
                sQuery += " CUE_NUM_SSSSCTA=SAL_NUM_SSSSCTA ";
                sQuery += " AND SAL_NUM_CTAM NOT IN (6205,6505,6206,6506) ";
                sQuery += " AND CTO_CVE_ST_CONTRAT = 'ACTIVO' AND CUE_CVE_ST_CUENTA='ACTIVO' ";
                sQuery += " AND SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
                sQuery += " AND SAL_ANO_MOVTO = " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO = " + Integer.toString(mes);
                sQuery += " AND SAL_NUM_SSSSSCTA= " + Integer.toString(moneda);
                sQuery += " AND SAL_NUM_CTAM NOT BETWEEN 8000 AND 8999";
                rs=st.executeQuery(sQuery); 
                while ( rs.next() ) {
                    
                   sumas.add( Double.valueOf(rs.getDouble(1)) );
                   sumas.add( Double.valueOf(rs.getDouble(2)) );
                   sumas.add( Double.valueOf(rs.getDouble(3)) );
                   sumas.add( Double.valueOf(rs.getDouble(5)) );//DEUDOR
                   sumas.add( Double.valueOf(rs.getDouble(4)) );//ACREEDOR
                }
                
                return sumas;
                } catch (Exception ex) {
                     System.out.println(ex);
                     return null;
                } finally {
                try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
                try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
                try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
               }
        }
/******************************* OBTIENE LA SUMA DE LA BALANZA DE COMPROBACION****************/   
      
      public String escribeSumasBalanza( Vector sumas ) {
           StringBuffer escribe = new StringBuffer();
           formatoMonto = NumberFormat.getInstance();
           formatoMonto.setMaximumIntegerDigits(16);
           formatoMonto.setMinimumIntegerDigits(1);
           formatoMonto.setMaximumFractionDigits(2);
           formatoMonto.setMinimumFractionDigits(2);
           
           try {
               for (int columna=0; columna < sumas.size(); columna++) {
                    escribe.append("<td align='right'>"); 
                    escribe.append( formatoMonto.format( Double.valueOf( sumas.get(columna).toString()).doubleValue()));
                    escribe.append("</td>");
                }
           }catch (Exception ex) {
                System.out.println(ex);
           }
           return escribe.toString();        
      }
/****************************************ESCRIBE LAS SUMAS EN EL REPORTE*********************/
      
      public Integer obtenPaginas(int noCuenta, int anio, int mes )  {
         Statement st = null;
         ResultSet rs = null;
         String    sQuery;
         Integer   numeroRegistro = null;
         Double    suma = Double.valueOf(0);
         
            try {
                if (conBD == null) if (!conectarBD()) return null;
                if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
            
                st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

                sQuery = " (SELECT";
                sQuery += " COUNT(*)";
                sQuery += " FROM";
                sQuery += " SALDOSH,";
                                  if (anio<=2007) 
	                  {
	                  	if (mes>9 && anio==2007)
	                  		{
	                  		 sQuery += " CUENTACO,";	
	                  		}
	                  	else
	                  		{
	                  		 sQuery += " CUENTACO,";	
	                  		}	
	                  }	
                  else
                  		{
                  		sQuery += " CUENTACO,";	
                  		}
                sQuery += " CONTRATO";
                sQuery += " WHERE ";
                sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
                sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND ";
                sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND ";
                sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND ";
                sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND ";
                sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND ";
                sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO  ";
                sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
                sQuery += " AND SAL_NUM_CTAM NOT BETWEEN 8000 AND 8999";
                sQuery += " )";
                
                rs=st.executeQuery(sQuery);
                
                while ( rs.next() ) {
                      suma = Double.valueOf(suma.doubleValue() + rs.getDouble(1));
                }
                
            numeroRegistro = Integer.valueOf((int) Math.ceil(suma.doubleValue() / 16.0));              
            } catch (Exception ex){ 
                 System.out.println(ex);
            } finally {
                 try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
                 try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
                 try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
            }       
                return numeroRegistro; 
         }
/*************************************OBTIENE LAS PAGINAS A IMPRIMIR*********************************/         
         
         
         public String escribeEncabezado(String fideicomiso, String anio, String mesCompleto, int pag , int moneda) {
            StringBuffer escribe = new StringBuffer();
            try {
                escribe.append("<table width='899' border='0' bordercolor='#000000' bgcolor='#FFFFFF'>"); 

                escribe.append("<tr>"); 
                escribe.append("<td width='100' rowspan='4'><img src='imagenes/logo_bn.GIF' alt=''></td>"); 
                escribe.append("<td colspan='7'  align='center'  style='font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;'>Banco Nacional del Comercio Exterior S.N.C.</td>"); 
                escribe.append("<td width='100'  align='center'  style='font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;'>&nbsp;</td>"); 
                escribe.append("</tr>"); 

                escribe.append("</blockquote></div></td></tr><tr><td><div align='center' class='style15'>Direcci&oacute;n Fiduciaria </div></td></tr>");
                escribe.append("<td><div align='center' class='style15'>FIDEICOMISO " + fideicomiso.toUpperCase() + "</div></td>");
                escribe.append("</tr><tr><td><div align='center' class='style15'><span class='style16'>BALANZA DE COMPROBACION AL CIERRE DEL MES DE " + mesCompleto ); 
                escribe.append(" DEL " + anio + " </span></div></td></tr>");
                escribe.append("<tr><td>&nbsp;</td><td><div align='center' class='style15'>"+ (moneda==1?"MONEDA NACIONAL":"DOLAR AMERICANO")+"</div></td>");
                escribe.append("</tr><tr><td height='23'>&nbsp;</td></tr></table>");                
                escribe.append("<tr><td><div align='center' class='style18'>DETALLE DE SALDOS </div></td>");
                escribe.append("</tr><tr><td height='23'>&nbsp;</td></tr></table>");
                if( pag == 1 )
                   escribe.append("<table width='900' height='25' border='0' bgcolor='#FFFFFF'>");    
                else
                   escribe.append("<table width='900' height='25' border='0' bgcolor='#FFFFFF' style='page-break-after:always;'>");
                   escribe.append("<tr class='textohome2'>");
                   escribe.append("<th width='25'>");
                   escribe.append("<div align='center'><span class='style26'>CUENTA</span></div></th>");
                   escribe.append("<th width='21'><div align='center'><span class='style26'>SCTA</span></div></th>");
                   escribe.append("<th width='25'><div align='center'><span class='style26'>S2CTA</span></div></th>");
                   escribe.append("<th width='25'><div align='center'><span class='style26'>S3CTA</span></div></th>");
                   escribe.append("<th width='25'><div align='center'><span class='style26'>S4CTA</span></div></th>");
                   escribe.append("<th width='25'><div align='center'><span class='style26'>S5CTA</span></div></th>");
                   escribe.append("<th width='232' height='30'><div align='center'>");
                   escribe.append("<p align='center'><span class='style26'>NOMBRE</span></p>");      
                   escribe.append("</div></td>");
                   escribe.append("<th width='20'><div align='center'><span class='style26'>&nbsp;&nbsp;&nbsp;</span></div></th>");
                   escribe.append("<th width='20'><div align='center'><span class='style26'>AUX2</span></div></th>");
                   escribe.append("<th width='26'><div align='center'><span class='style26'>&nbsp;&nbsp;&nbsp;AUX3</span></div></th>");
                   escribe.append("<th width='89'><div align='center'>");
                   escribe.append("<p><span class='style26'>&nbsp;&nbsp;SALDO&nbsp;&nbsp;ANTERIOR</span></p>");
                   escribe.append("</div></th>");
                   escribe.append("<th width='88'><div align='center'>");
                   escribe.append("<p><span class='style26'>CARGO</span></p>");
                   escribe.append("</div></td>");
                   escribe.append("<th width='88'><div align='center'><span class='style26'> ABONO</span></div></th>");
                   escribe.append("<th width='93'><div align='center'>");
                   escribe.append("<p><span class='style26'>&nbsp;&nbsp;SALDO&nbsp;&nbsp;DEUDOR</span></p>");
                   escribe.append("</div></th>");
                   escribe.append("<th width='93'><div align='center'>");
                   escribe.append("<p><span class='style26'>&nbsp;&nbsp;SALDO&nbsp;&nbsp;ACREEDOR</span></p>");
                   escribe.append("</div></th>");                   
                   escribe.append("</tr>");
          
         }catch (Exception ex) {
                System.out.println(ex);
         }
           return escribe.toString();        
      }
/*****************************ESCRIBE LOS ENCABEZADOS EN EL REPORTE****************************/      
/**************************************TERMINA CLASE*******************************************/      
}            