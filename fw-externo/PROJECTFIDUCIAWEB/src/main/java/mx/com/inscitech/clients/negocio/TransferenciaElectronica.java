/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

//REPORTE: 89621(PERMITE REGISTRAR CON DISTINTO RFC EL MISMO No. de CUENTA)
    
package mx.com.inscitech.clients.negocio;  
import com.mysql.cj.jdbc.MysqlDataSource;

import oracle.jdbc.driver.*;
import java.sql.*;
import java.util.*;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import mx.com.inscitech.clients.lib.conexion;

public class TransferenciaElectronica extends nConsultas {
      private Connection conBD;
      private ResourceBundle resBundle;
     
      Statement st = null;
      String    sQuery;
      int NumUsuario=0;
    
    	
      public TransferenciaElectronica()
      {
    	  conBD = null;
    	  //resBundle = ResourceBundle.getBundle("FiduciaBDParams");
    	  DriverIni();
      }

/*****************************CONEXION A BASE DE DATOS**********************************/

      private void DriverIni() {
    	   try {
              DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    	   }catch(SQLException e){
                System.out.print(e);
    	   }
      }
    	
      public boolean conectarBD() {
    	  ResourceBundle resBundle;
          try {
              conexion conecta = new conexion();
              conBD = conecta.conectarBD();
              /*Context ctx = null;
              Hashtable ht = new Hashtable();
              
              ctx = new InitialContext(ht);
              javax.sql.DataSource ds = (javax.sql.DataSource) ctx.lookup ("jdbc/fiduciaDS");  
              conBD = ds.getConnection();
              */  

              return true;
          }  catch (Exception e) {
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
							
   /************************ FIN METODOS DE CONEXION A BASE DE DATOS**********************/							
   
   /********************************** ESCRIBE EN LA TABLA *******************************/     
    
      public boolean registraCuenta( String folio,
	      	                          String cveCuendep,
	      	                          String numUsuario,
	      	                          String fideicomiso, 
                                    String moneda, 
                                    String cuenta, 
                                    String banco, 
	                                  String plaza, String sucursal,
                                    String titular,
                                    String clasTipoPersona,
                                    String numTipoPersona,
	                                  String rfc,  
	                                  boolean validacion,
	                                  String sStatus,String detBitacora)  
	                                  {
        
        		boolean bCta=false;
        		int iRows=0;
            String sPlaza="";
        		boolean bValidaAsignacion=validaAsignacion(cveCuendep,fideicomiso);
		        try {   
		        
		             if (conBD == null) if(!conectarBD()) throw new Exception();
		             if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
		                 
		             st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		             conBD.setAutoCommit(false);	                
		             if( validacion == true )  //ALTA CUENTA NUEVA
		             		{
                    
                      if (plaza!=null&&plaza.length()>0)
                        sPlaza = plaza;
                      else
                        sPlaza = "";
                    
		                  sQuery =  " INSERT INTO "                      
                        +  " F_CUEBAN ("                      
                        +  " FCBA_NUMERO_CTA_BAN,"
                        +  " FCBA_MONEDA,"
                        +  " FCBA_BANCO,"
                        +  " FCBA_PLAZA_CBA,"
                        +  " FCBA_CLABE_CBA,"
                        +  " FCBA_RFC,"
                        +  " FCBA_TITULAR,"
                        +  " FCBA_STATUS,"
                        +  " FCBA_CLAS_TIPO,"
                        +  " FCBA_NUM_TIPO,"
                        +  " FCBA_SUB_CUENTA ) VALUES ( "                    
                        +  cveCuendep+"," 
                        +  moneda +","
                        +  banco  + ","
                        + "'" + sPlaza + "',"
                        +  "'" + cuenta  + "',"
                        +  "'" + rfc + "',"                          
                        +  "'" + titular + "'," 
                        + "'"+sStatus+"',"
                        +  "" + clasTipoPersona  + ","
                        +  "" + ((numTipoPersona.trim().split("-")[0].equals(""))?"0":numTipoPersona.trim().split("-")[0]) + ","
                        + "0"
                        + ")";  
		                  
		                 	iRows = st.executeUpdate(sQuery); 
		   					}
		   				else
		   					{
		   					iRows=1;// LA CUENTA YA ESTA REGISTRADA EN LA BASE DE DATOS	
		   					}
		
		
		            if (bValidaAsignacion)// SI LA ASIGNACION EXISTE CANCELADA O RECHAZADA
		            	{

		            	sQuery  =  " UPDATE F_FIDEICO_CUEBAN SET  "
				            	+  " FFCB_STATUS='"+sStatus+"'"
				            	+  " WHERE "	
				            	+  " FFID_ID_FIDEICOMISO = " + fideicomiso
				            	+  " AND "
				            	+  " FCBA_CLABE_CBA = '"  + cuenta + "'";
				            		
		            	}
		            else{
		            			            	
		            	sQuery 	=  " INSERT INTO F_FIDEICO_CUEBAN( FFID_ID_FIDEICOMISO, FCBA_CLABE_CBA, FFCB_STATUS) " 
				            	+  " VALUES( " + fideicomiso + ",'"  + cuenta + "','"+sStatus+"')";
		            	}	

		            
		            if(iRows>0)iRows = st.executeUpdate(sQuery); 
                
		                //Recuperacion de numero de usuario
		                //se graba en bitacora
		                   sQuery  = "INSERT INTO F_BITACORA ("
				                   + " FBIT_SECUENCIAL_FOLIO,"
				                   + " FBIT_FECHA,"
				                   + " FUSU_ID_USUARIO,"
				                   + " FBIT_DESCRIPCION) "
				                   + "  VALUES ("
                           + folio + ","
				                   + "(SELECT TO_DATE(REPLACE(TO_CHAR(FCO_DIA_APLI_CONTA,'00')||'/'||"
                           + " TO_CHAR(FCO_MES_APLI_CONTA,'00')||'/'|| "
                           + " TO_CHAR(FCO_ANO_APLI_CONTA,'0000'),' ' ,''),'DD/MM/YYYY') "
                           + " FROM FECCONT ),"
				                   + "'" + numUsuario + "'," //USUARIO
				                   + "'"+ cuenta +"'" //detalle - CLABE BANCARIA
				                   + ")";             
		                   
		                  if(iRows>0) iRows = st.executeUpdate(sQuery); 
		                 	
		                  if(iRows>0) 
			                  	{
			                  	System.out.println("Registro de Cta con Folio:"+ folio + " SATISFACTORIO" );
			                  	conBD.commit();
			                  	bCta=true;
			                  	}
	                  	 else
					      		{
					      		conBD.rollback();
					      		conBD.commit();
					      		System.out.println("Registro de Cta con Folio:"+ folio + " NO SATISFACTORIO" );
					      		bCta=false;
					      		}	
			       		} 
			       		
			       catch (Exception ex)
			       		{ 
			           		System.out.println("Error en registraCuenta:"+ex);
							System.out.println("Registro de Cta con Folio:"+ folio + " NO SATISFACTORIO" );
							System.out.println(sQuery);
							
							try{
								conBD.rollback();
								conBD.commit();
								System.out.println("rollback");
								}
							catch(SQLException e)
								{
										
								System.out.println("Error al realizar el roll back: :"+e);	
								}
							bCta=false;
			       		} 
			       		finally {
			           
					           try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println("Metodo: registraCuenta");System.out.println(ex);   }
					           try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Metodo: registraCuenta");System.out.println(ex); }
							   return bCta;
			       				}
			}    /******************************* ESCRIBE TABLA *********************************************/	
		       /*
		  public void escribeTablaPerfirdi(String folio, String fideicomiso, String cveCuendep, String usuSolicit ,String sStatus )  {
		        Statement st = null;
		    	//ResultSet rs = null;
		    	  String    sQuery;
		        
		        try {   
		             
		 
		        } catch (Exception ex){ 
		            System.out.println(ex);
		        } finally {
		           // try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
		            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
		            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); } 
		        }
		    }	/****************************** ESCRIBE TABLA PERFIRDI *********************************/
    

/*Metodos del Alta de Terceros*/

     public String validaStTercero( String RFC,String fideicomiso)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        String stCta="";
        int nContTercero=0;
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


            sQuery =  " SELECT TER_CVE_ST_TERCERO "
             	   + " FROM TERCEROS " 
            	   + " WHERE TER_RFC = '" + RFC + "'"
            	   + " AND TER_NUM_CONTRATO="+fideicomiso ;

                 
	        rs=st.executeQuery(sQuery);         
            if(rs.next())
      
      			stCta=rs.getString(1);
        
            
        } catch (Exception ex){ 
        
            System.out.println("Error en validaStTercero: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return stCta;
     } /************************************** AUTORIZACION validaStTercero *******************************/ 


    public int existeTercero( String RFC,String fideicomiso)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        int existeTercero= 0;
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            sQuery =  " SELECT COUNT (1) "
             	   + " FROM TERCEROS " 
            	   + " WHERE TER_RFC = '" + RFC + "'"
            	   + " AND TER_NUM_CONTRATO="+fideicomiso ;
                 //" AND TER_CVE_ST_TERCERO='ACTIVO'";

            rs=st.executeQuery(sQuery);
            rs.next(); 
            
            if( rs.getInt(1) == 0 ) 
            	{
            		existeTercero = 1;// SI NO EXISTE, REGISTRA NUEVO TERCERO
            	}
            else 
            	{
             	existeTercero = 3;// EL FISO YA TIENE ASIGNADO EL TERCERO
              }
            
        } catch (Exception ex){ 
        
            System.out.println("Error en existeTercero: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return existeTercero;
     } /************************************** VALIDACION ESCRITURA *******************************/ 

    public boolean validaTercero(String RFC,String fideicomiso)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        boolean validaTercero= false;
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            sQuery =  " SELECT COUNT (1) "
             	   + " FROM TERCEROS " 
            	   + " WHERE TER_RFC = '" + RFC + "'"
            	   + " AND TER_NUM_CONTRATO="+fideicomiso +
                 " AND TER_CVE_ST_TERCERO='ACTIVO'";

            rs=st.executeQuery(sQuery);
            if(rs.next())
            	{
               	if( rs.getInt(1) > 0 ) 
                 		validaTercero = true;// SI NO EXISTE, REGISTRA NUEVA  CTA
            	else
            			validaTercero=false;
            	}					
           
            
        } catch (Exception ex){ 
        
            System.out.println("Error en validaTercero: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return validaTercero;
     } /************************************** VALIDACION ESCRITURA *******************************/ 
     
      public boolean registraTercero( String folio,
	      	                          String Tercero,
	      	                          String numUsuario,
	      	                          String fideicomiso, 
                                    String RFC,
	                                  String sStatus,
                                    String fecha,int accion,String nTercero,
                                    String Convenio)  
	                                  {
        
        		boolean bCta=false;
        		int iRows=0;
            ResultSet rs = null;                  
            int nContTercero=1;
		        try {   
		        		             if (conBD == null) if(!conectarBD()) throw new Exception();
		             if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
		                 
		             st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		             conBD.setAutoCommit(false);	                
                 
                  int d,m,a;
                    
                  d=Integer.parseInt(fecha.substring(0,2));//dia
                  m=Integer.parseInt(fecha.substring(3,5));//mes
                  a=Integer.parseInt(fecha.substring(6,10));//a�o
                 
                  sQuery =  " SELECT MAX(TER_NUM_TERCERO) AS ContTercero "
                  + " FROM TERCEROS WHERE " 
                  + " TER_NUM_CONTRATO="+fideicomiso ;
    	
                  rs=st.executeQuery(sQuery);         
                  if(rs.next())
                    nContTercero=rs.getInt("ContTercero")+1;
                  rs.close();

                 
                 if (accion==1){
		                  sQuery =  " INSERT INTO "                      
                        +  " TERCEROS ("                      
                        +  " TER_NUM_CONTRATO,"
                        +  " TER_NUM_TERCERO,"
                        +  " TER_NOM_TERCERO,"
                        +  " TER_RFC,"
                        +  " TER_CVE_ST_TERCERO,"
                        +  " TER_NUM_EXT_FAX,"
                        +  " TER_ANO_ALTA_REG,"
                        +  " TER_MES_ALTA_REG,"
                        +  " TER_DIA_ALTA_REG,"
                        +  " TER_ANO_ULT_MOD,"     
                        +  " TER_MES_ULT_MOD,"        
                        +  " TER_DIA_ULT_MOD)"        
                        +  " VALUES ( "                    
                        +  fideicomiso+"," 
                        +  String.valueOf(nContTercero)+","
                        +  "'" + Tercero + "',"
                        +  "'" + RFC  + "',"
                        + "'"+sStatus+"'," 
                        + "'"+folio+"'," 
                        + a + "," + m + "," + d + ","
                        + a + "," + m + "," + d + ")";                          
                        iRows = st.executeUpdate(sQuery); 
                   if(Convenio.length()>0){  
                      sQuery = "INSERT INTO CUENTAS ("
                              + "CBA_NUM_CONTRATO,"
                              + "CBA_CVE_PERSON_FID,"
                              + "CBA_NUM_PERSON_FID,"
                              + "CBA_NUM_SEC_CTA,"
                              + "CBA_CVE_TIPO_CTA,"
                              + "CBA_NUM_BANCO,"
                              + "CBA_NUM_SUCURSAL,"
                              + "CBA_NUM_CUENTA,"
                              + "CBA_ANO_ALTA_REG,"
                              + "CBA_MES_ALTA_REG,"
                              + "CBA_DIA_ALTA_REG,"
                              + "CBA_ANO_ULT_MOD,"
                              + "CBA_MES_ULT_MOD,"
                              + "CBA_DIA_ULT_MOD,"
                              + "CBA_CVE_ST_CUENTA) VALUES ("
                              + fideicomiso+"," 
                              + "'TERCERO',"
                              + String.valueOf(nContTercero)+","
                              + "0,'CONVENIO CIE',"
                              + "12,0,"
                              + (Convenio.length()==0?"''":Convenio) + ","
                              + a + "," + m + "," + d + ","
                              + a + "," + m + "," + d + ",'"+sStatus+"')";                          
                 }
		             }
                 else{
                  sQuery =  " UPDATE TERCEROS SET TER_CVE_ST_TERCERO='ACEPTADA' WHERE "
                            + " TER_NUM_CONTRATO="+fideicomiso
                            + " AND TER_NUM_TERCERO="+nTercero;
                  }
		                 	iRows = st.executeUpdate(sQuery); 

		                //Recuperacion de numero de usuario
		                //se graba en bitacora
		                   sQuery  = "INSERT INTO F_BITACORA ("
				                   + " FBIT_SECUENCIAL_FOLIO,"
				                   + " FBIT_FECHA,"
				                   + " FUSU_ID_USUARIO,"
				                   + " FBIT_DESCRIPCION) "
				                   + "  VALUES ("
                           + folio + ","
				                   + "(SELECT TO_DATE(REPLACE(TO_CHAR(FCO_DIA_APLI_CONTA,'00')||'/'||"
                           + " TO_CHAR(FCO_MES_APLI_CONTA,'00')||'/'|| "
                           + " TO_CHAR(FCO_ANO_APLI_CONTA,'0000'),' ' ,''),'DD/MM/YYYY') "
                           + " FROM FECCONT ),"
				                   + "'" + numUsuario + "'," //USUARIO
				                   + "'" + (accion==1?"ALTA":"AUTORIZACION") + " DE TERCERO CON NOMBRE "+ Tercero +"'" //detalle - nombre de tercero
				                   + ")";             
		                   
    		                  if(iRows>0) iRows = st.executeUpdate(sQuery); 
		                 	
		                  if(iRows>0) 
			                  	{
			                  	System.out.println("Registro de Tercero con Folio:"+ folio + " SATISFACTORIO" );
			                  	conBD.commit();
			                  	bCta=true;
			                  	}
	                  	 else
					      		{
					      		conBD.rollback();
					      		conBD.commit();
					      		System.out.println("Registro de Tercero con Folio:"+ folio + " NO SATISFACTORIO" );
					      		bCta=false;
					      		}	
			       		} 
			       		
			       catch (Exception ex)
			       		{ 
			           		System.out.println("Error en registraTercero:"+ex);
							System.out.println("Registro de Cta con Folio:"+ folio + " NO SATISFACTORIO" );
							System.out.println(sQuery);
							
							try{
								conBD.rollback();
								conBD.commit();
								System.out.println("rollback");
								}
							catch(SQLException e)
								{
										
								System.out.println("Error al realizar el roll back: :"+e);	
								}
							bCta=false;
			       		} 
			       		finally {
			           
					           try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println("Metodo: registraTercero");System.out.println(ex);   }
					           try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Metodo: registraCuenta");System.out.println(ex); }
							   return bCta;
			       				}
			}    /******************************* ESCRIBE TABLA *********************************************/	
/******/
    
    public int existeCuenta( String NoCuenta,String fideicomiso)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        int existeCuenta= 0;
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            sQuery =  " SELECT COUNT (1) "
             	   + " FROM F_CUEBAN " 
            	   + " WHERE FCBA_CLABE_CBA = '" + NoCuenta + "'"
            	   + " AND FCBA_STATUS NOT IN ('CANCELADA','RECHAZADA')";

            rs=st.executeQuery(sQuery);
            rs.next(); 
            
            if( rs.getInt(1) == 0 ) 
            	{
            		existeCuenta = 1;// SI NO EXISTE, REGISTRA NUEVA  CTA
            	}
            else 
            	{
            	
                sQuery =  " SELECT COUNT(1) "
		                + " FROM  F_CUEBAN C,F_FIDEICO_CUEBAN FC" 	
		                + " WHERE C.FCBA_CLABE_CBA = '" + NoCuenta + "'"
		                + " AND C.FCBA_CLABE_CBA = FC.FCBA_CLABE_CBA "
		                + " AND FC.FFID_ID_FIDEICOMISO = " + fideicomiso
                        + " AND FFCB_STATUS NOT IN ('CANCELADA','RECHAZADA')";
                        
                rs=st.executeQuery(sQuery); 
                if(rs.next())
                	{	   
                if( rs.getInt(1) == 0 )
                	{
                    existeCuenta = 2 ;// SI NO ESTA ASIGNADA A ESE FISO, ASIGNA UNICAMENTE LA CTA	    	
                    }
                else 
                	{
                	existeCuenta = 3;// EL FISO YA TIENE ASIGNADA LA CUENTA
                	}
             		}
            }
            
        } catch (Exception ex){ 
        
            System.out.println("Error en existeCuenta: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return existeCuenta;
     } /************************************** VALIDACION ESCRITURA *******************************/ 
    
    
     
          
     public String DatosBanco()  {
        Statement st = null; 
    	  ResultSet rs = null;
     	  String    sQuery;    
        Vector opcionesCombo;
        
        StringBuffer s = new StringBuffer();
        
        try {
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
            sQuery =  " SELECT DISTINCT( CVE_DESC_CLAVE ), CVE_NUM_SEC_CLAVE ";
            sQuery += " FROM CLAVES ";
            sQuery += " WHERE CVE_NUM_CLAVE = 27 ";
            sQuery += " AND CVE_NUM_SEC_CLAVE NOT IN( 169, 170 ) ";
            
            rs = st.executeQuery(sQuery); 
            
            while ( rs.next() ){
                 s.append("<option value='" + rs.getString(2) + "'>" + rs.getString(1) + "</option>" );   
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return s.toString();
    } /********************************** COMBO BANCOS ************************/
    
    public String claveCuenta(String cuenta)
       {
			Statement st = null; 
			ResultSet rs = null;
			String    sQuery;
			String id = "0";          
			int numId; 
        try {   
             if (conBD == null) if(!conectarBD()) throw new Exception();
             if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
                 
            	  st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                  sQuery = " SELECT FCBA_NUMERO_CTA_BAN"; 
                  sQuery += " FROM F_CUEBAN ";
                  sQuery += " WHERE FCBA_CLABE_CBA = REPLACE('" + cuenta + "',' ','')";
                  sQuery += " AND FCBA_STATUS NOT IN ('CANCELADA','RECHAZADA')";
                  rs = st.executeQuery(sQuery);
      			  //SI LA CUENTA ELECTRONICA EXISTE REGRESO EL ID DE LA CUENTA	
                  if(rs.next())
                 	{
                 	id = Integer.toString(rs.getInt(1));
          			}		
              
        }
        catch (Exception ex) 
        	{
            System.out.println("claveCuenta:"+ ex);
            return null;
        	}	
        finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }          
        		}
        return id;
    } /**************************************OBTEN CVE CUENDEP *************************/
    
    
    
     public String validaSt( String folio)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        String stCta="";
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


            sQuery =  " SELECT FCBA_STATUS "
             	   + " FROM F_CUEBAN " 
            	   + " WHERE "
                 + " FCBA_NUMERO_CTA_BAN = " + folio;
                 
	        rs=st.executeQuery(sQuery);         
            if(rs.next())
      
      			stCta=rs.getString(1);
        
            
        } catch (Exception ex){ 
        
            System.out.println("Error en validaSt: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return stCta;
     } /************************************** AUTORIZACION CUENTA *******************************/ 


	public boolean autorizaCuenta( String folio,String cveCuendep,String accion, String numUsuario, String detBitacora)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        String stCta="";
        int iRows=0;
        boolean bAutorizaCuenta=false;
        
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			conBD.setAutoCommit(false);
			//si la cuenta tiene status de CAPTURADA se procede a acutalizarla a PENDIENTE
            sQuery =  " SELECT FCBA_STATUS "
             	   + " FROM F_CUEBAN " 
            	   + " WHERE "
                 + " FCBA_NUMERO_CTA_BAN = " + cveCuendep;
	        rs=st.executeQuery(sQuery);         
            if(rs.next())      
      			{
      			stCta=rs.getString(1);
				}
				
            if(stCta.equals("CAPTURADA")) 
				{
        		sQuery  =  " UPDATE F_CUEBAN C SET "
		                + " C.FCBA_STATUS='" + accion +"'"
		                + " WHERE "
		                + " C.FCBA_NUMERO_CTA_BAN = " + cveCuendep;
		          if (accion.equals("CANCELADA"))
		          	{
		          	sQuery = sQuery + " AND (SELECT COUNT(1) FROM F_FIDEICO_CUEBAN P"
                + " WHERE P.FCBA_CLABE_CBA=C.FCBA_CLABE_CBA AND "
                + " P.FFCB_STATUS IN ('CAPTURADA','PENDIENTE','ACEPTADA','NO ASIGNADA'))=1";
    				}
        		iRows=st.executeUpdate(sQuery); 	
				}
			else
				{
				iRows=1;//La cuenta tiene un st Diferente a capturada	
				}	
			
			
		
            sQuery =  " UPDATE F_FIDEICO_CUEBAN FC SET "
	                + " FC.FFCB_STATUS='" + accion +"'"
	                + " WHERE "
	                + " FC.FCBA_CLABE_CBA = ("
                  + " SELECT C.FCBA_CLABE_CBA FROM F_CUEBAN C WHERE C.FCBA_NUMERO_CTA_BAN="+cveCuendep+")" ;
	        
	        
	                
            if(iRows>0) iRows=st.executeUpdate(sQuery);
            
            
		                //se graba en bitacora
		                   sQuery  = "INSERT INTO F_BITACORA ("
				                   + " FBIT_SECUENCIAL_FOLIO,"
				                   + " FBIT_FECHA,"
				                   + " FUSU_ID_USUARIO,"
				                   + " FBIT_DESCRIPCION) "
				                   + "  VALUES ("
                           + folio + ","
				                   + "(SELECT TO_DATE(REPLACE(TO_CHAR(FCO_DIA_APLI_CONTA,'00')||'/'||"
                           + " TO_CHAR(FCO_MES_APLI_CONTA,'00')||'/'|| "
                           + " TO_CHAR(FCO_ANO_APLI_CONTA,'0000'),' ' ,''),'DD/MM/YYYY') "
                           + " FROM FECCONT ),"
				                   + "'" + numUsuario + "'," //USUARIO
                           //+ "'AUTORIZA CUENTA PENDIENTE'"
				                   + "(SELECT C.FCBA_CLABE_CBA FROM F_CUEBAN C WHERE C.FCBA_NUMERO_CTA_BAN="+cveCuendep+")" //detalle - CLABE BANCARIA
				                   + ")";             
		                   
		                  if(iRows>0) iRows = st.executeUpdate(sQuery); 
           
			     if(iRows>0) 
		              	{
		              	System.out.println("Autorizaci�n ("+accion+") de Cta con Folio:"+ folio + "  SATISFACTORIO" );
		              	conBD.commit();
		              	bAutorizaCuenta=true;
		              	}
		      	 else
			      		{
			      		conBD.rollback();
			      		conBD.commit();
			      		System.out.println("Autorizaci�n ("+accion+") de Cta con Folio:"+ folio + " NO SATISFACTORIO" );
			      		bAutorizaCuenta=false;
			      		}	
		                 
            
        } catch (Exception ex){ 
        
			           		System.out.println("Error en autorizaCuenta:"+ex);
							System.out.println("Autorizaci�n ("+accion+") de Cta con Folio:"+ folio + " NO SATISFACTORIO" );
							System.out.println(sQuery);
							
							try{
								conBD.rollback();
								conBD.commit();
								System.out.println("rollback");
								}
							catch(SQLException e)
								{
										
								System.out.println("Error al realizar el roll back: :"+e);	
								}
							bAutorizaCuenta=false;
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println("Metodo: autorizaCuenta");System.out.println(ex); }
       		try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println("Metodo: autorizaCuenta");System.out.println(ex);   }
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Metodo: autorizaCuenta");System.out.println(ex); }
			return bAutorizaCuenta;
        }
 	}         
    
   private boolean validaAsignacion(String cveCuendep,String fideicomiso)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        boolean validaAsignacion= false;
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                	
	        sQuery =  " SELECT COUNT(*) "
	                + " FROM  CUENDEP,PERFIRDI " 	
	                + " WHERE CDP_CVE_CUENDEP = " + cveCuendep 
	                + " AND PFD_CVE_CUENDEP = CDP_CVE_CUENDEP "
	                + " AND PFD_NUM_CONTRATO = " + fideicomiso
	                + " AND PFD_ST IN ('CANCELADA','RECHAZADA')";
	                
	        rs=st.executeQuery(sQuery); 
	        if(rs.next())
	        	{	   
	        	if( rs.getInt(1) > 0 )
	            validaAsignacion = true ;// SI NO ESTA ASIGNADA A ESE FISO, ASIGNA UNICAMENTE LA CTA	    	
	     		}
            
            
        } catch (Exception ex){ 
        
            System.out.println("Error en existeCuenta: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return validaAsignacion;
     } /************************************** VALIDACION ESCRITURA *******************************/ 
      
    
    /******************************* FUNCION QUE REGRESA EL NOMBRE DEL BANCO ********************/
 
    
     public String getBanco(int cve)  {
          Statement st = null; 
    	  ResultSet rs = null;
     	  String    sQuery;    
          String getBanco=null;
        
        StringBuffer s = new StringBuffer();
        
        try {
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
            sQuery 	=  " SELECT DISTINCT( CVE_DESC_CLAVE ) as nombreBanco "
		            +  " FROM CLAVES "
		            +  " WHERE CVE_NUM_CLAVE = 27 "
		            +  " AND CVE_NUM_SEC_CLAVE NOT IN( 169, 170 ) "
		            +  " AND CVE_NUM_SEC_CLAVE="+cve;
            
            rs = st.executeQuery(sQuery); 
            
            if ( rs.next() )
            	{
                getBanco=rs.getString("nombreBanco");
            	}
           
            
        } 
        
        catch (Exception ex) 
        	{
            System.out.println(ex);
        	} 
        finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return getBanco;
    } /********************************** NOMBRE BANCO ************************/
    
    
    
    public boolean validaCta(String NoCuenta)                                     
          {
    	Statement st = null; 
    	ResultSet rs = null;
     	String  sQuery="";
        boolean validaCta= false;
     	
        try {   
            if (conBD == null)if(!conectarBD()) throw new Exception();
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
            
            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            sQuery =  " SELECT COUNT (1) "
             	   + " FROM F_CUEBAN " 
            	   + " WHERE FCBA_CLABE_CBA = '" + NoCuenta + "'"
            	   + " AND FCBA_STATUS ='ACEPTADA'";

            rs=st.executeQuery(sQuery);
            if(rs.next())
            	{
               	if( rs.getInt(1) > 0 ) 
                 		validaCta = true;// SI NO EXISTE, REGISTRA NUEVA  CTA
            	else
            			validaCta=false;
            	}					
           
            
        } catch (Exception ex){ 
        
            System.out.println("Error en existeCuenta: "+ex);
            System.out.println("Query:\n"+sQuery);
        } finally {
            try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println(ex); }
            try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println(ex); }
            try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
        }
        return validaCta;
     } /************************************** VALIDACION ESCRITURA *******************************/ 
    
    
     /**************************************** TERMINA CLASE **************************************/                           
     
     
     
}      
      
                                