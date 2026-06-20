
/*
Clase:   nInstrucciones
Funcion: Insertar las Intrucciones:

								  1.- Otros Servicios 
							  
 * Autor:  inscitech M�xico
 * mail: eminguer@inscitechmexico.com
 * Fecha: 29/06/2009
 **/

package com.bancomext.negocio;

import com.bancomext.lib.serviciosenvio;

import java.sql.*;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.util.Calendar;


public class nInstruccionesMDC extends nFiducia
	{

	private String[] ctas=new String[18];	
	private	Statement stSaldos=null;//stSaldos
	private	Statement stSaldosAnt=null;//stSaldosAnt
	private	ResultSet rsSaldos=null;//rsQuery
	private DecimalFormat num = new DecimalFormat("############0.00");
	private boolean bContabilizado=false;
	static Calendar cal;
	static Date dFechaHon;
	nAcuerdos n=new nAcuerdos();
        serviciosenvio envio = new serviciosenvio();

	
 public boolean insertaOtrosServicios( String[] Datos, String[] bitacora, String[] strFirma) 
    {					
		int d,m,a;
    String ImporteD;
		String cuenta;
    
    String sNumPlaza = "";
    String sNomInsti = "";
    String sNumCuenta = "";
    String sRubro = "";
    String sNumRefe = "";
    String sEstatus="ACTIVO";
    
    d=Integer.parseInt(Datos[17].substring(0,2));//dia
		m=Integer.parseInt(Datos[17].substring(3,5));//mes
		a=Integer.parseInt(Datos[17].substring(6,10));//a�o
        String []sProv={null};
		iRows=0;
		boolean bFirmasM = false;//firmasMancomunadas(Datos[3]);	//valida si el fiso requiere firmas mancomunadas
    boolean bInstruccion=false;
					
    //if(bFirmasM || strFirma[0].equals("1"))
    if(bFirmasM)
			sEstatus="ESPERA";
      
    try {
						if (conBD == null) if (!conectarBD()) return false;
						if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
						
						stInstrucc = conBD.createStatement();
						conBD.setAutoCommit(false);	
						
            sInstrucc="Insert into Instrucc (ins_num_contrato, ins_num_folio_inst,"
						+ "ins_sub_contrato, ins_txt_comentario,ins_cve_tipo_instr,"
						+ "ins_num_miembro, ins_nom_miembro, ins_ano_alta_reg,"
						+ "ins_mes_alta_reg, ins_dia_alta_reg, ins_ano_ult_mod,"
						+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc,ins_cve_st_cont, ins_fecha_contable,INS_NUM_OPER)"
						+ " values ("
						+ Datos[3] + "," + Datos[1] + ",0,'','INSTRUCCION NO MONETARIA',"
						+ "0,'0',"
						+  a +","+ m +","+ d +","
						+  a +","+ m +","+ d +","
						+ "'" + sEstatus + "'" + ",'PENDIENTE',NULL,'"+Datos[18]+"')";
		    sProv=new String[8];
		    sProv[0]="5";//"no monetaria"
		    sProv[1]=Datos[3];//fiso
		    sProv[2]=Datos[1];//folios
		    sProv[3]=a+"";
		    sProv[4]=m+"";
		    sProv[5]=d+"";
		    sProv[6]=sEstatus;
		    sProv[7]=Datos[18];//operacion
			      iRows = stInstrucc.executeUpdate(sInstrucc);
		    //envio informacion
                    envio.consumo(12, sProv);
			            
				//Inserta un registro de la operaci�n en la bitacora
				if(iRows>0){
           //Inserta en Bitacora de la solicitud
            sInstrucc="Insert into f_bitacora_sol (ins_num_contrato, ins_mum_folio_inst,"
						+ "fbis_num_etapa, usu_num_usuario,fbis_fecha_ini,"
						+ "fbis_fecha_fin, fbis_observacion, fbis_firma_dig)"
						+ " values ("
						+ Datos[3] + "," + Datos[1] + ",0,"+bitacora[2]+","
						+ "TO_TIMESTAMP('"+ bitacora[0] +" '||(SELECT to_char(NOW(), 'HH24:MI:SS') FROM DUAL),'DD/MM/YYYY HH24:MI:SS'),NULL,"
						+ "'',0)";
			      System.out.println("InsNoMon: "+sInstrucc);      
			      iRows = stInstrucc.executeUpdate(sInstrucc);
                              sProv=new String[5];
                              sProv[0]=Datos[3];  
                              sProv[1]=Datos[1];  
                              sProv[2]=bitacora[2];  
                              sProv[3]="0";  
                              sProv[4]=bitacora[0];                    
                              //envio informacion
                              envio.consumo(3, sProv);
           if(iRows>0) 
            iRows=insertaBitacora(bitacora);
        }
				if(iRows>0) {
					 
				     System.out.println("Se registro Deposito con Folio:"+Datos[1]);	
				     conBD.commit();
				   	 bInstruccion=true;
				} else {
					   System.out.println("No se registro Deposito con Folio:"+Datos[1]);	
						 conBD.rollback();
						 conBD.commit();
						 bInstruccion=false;
				}
		}catch (Exception ex) {
						System.out.println("Funcion: insertaDeposito");
						System.out.println("Error: "+ex);
						System.out.println(ex);
						System.out.println(sInstrucc);
						System.out.println(sQuery);
						try{
						  	System.out.println("No se registro Deposito con Folio:"+Datos[1]);	
							  conBD.rollback();
							  conBD.commit();
							  System.out.println("rollback");
						} catch(SQLException e) {				
								System.out.println("Error al realizar el roll back: :"+e);	
						}	
						  bInstruccion=false;
		} finally {
				try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { System.out.println("Funcion: ProcesoDeposito");System.out.println(ex); }
				try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Funcion: insertaDeposito");System.out.println(ex); }
				return bInstruccion;						
		}										
 }
 
	private int insertaBitacora(String[] bitacora)
	    {
	    String fecha = bitacora[0];
	    String folio = bitacora[1];
	    String numUsuario = bitacora[4];
	    String detalle = bitacora[3];
	    	
		
		String queryBitacora="";
		int dia,mes,anio;
		dia = Integer.parseInt(fecha.substring(0,2));//dia
		mes = Integer.parseInt(fecha.substring(3,5));//mes
 	 	anio = Integer.parseInt(fecha.substring(6,10));//a�o

		try
		{

      queryBitacora = "insert into f_bitacora "
                    + " (FBIT_FECHA,"
                    + " FUSU_ID_USUARIO,"
                    + " FBIT_SECUENCIAL_FOLIO,"
                    + " FBIT_DESCRIPCION)"
                    + " values"
                    + " ("
                    + " (TO_TIMESTAMP('"+ fecha +" '||(SELECT to_char(NOW(), 'HH24:MI:SS') FROM DUAL),'DD/MM/YYYY HH24:MI:SS')), '"
                    + bitacora[4] + "'," 
                    + folio + "," 
                    + "'bit_detalle'"
                    +")";
        System.out.println("InsNoMon f_bitacora: "+queryBitacora);
       iRows = stInstrucc.executeUpdate(queryBitacora);		
		    //envio informacion
		    bitacora[2]=bitacora[4];
		    envio.consumo(2, bitacora);
          
		}
		catch (Exception ex)
		{
			iRows=0;
			System.out.println("Metodo: insertaBitacora");
			System.out.println("Error: \n"+ex);
		}
		finally
		{
			
			 return iRows;
		}
	}
	
	private boolean insertaFirma(String[] strParametros)
		{
		boolean binsertaFirma=false;
		int tipoUsuario=Integer.parseInt(strParametros[0]);
		String folioOpera=strParametros[1];
		String numFiso=strParametros[2];
		String numUsuario=strParametros[3];
		String fecha=strParametros[4];
		try
		{
		switch(tipoUsuario)
				{					
				case 1:
						sInstrucc = "INSERT INTO FIRMAS"
						          + "(fir_folio, "
						          + "fir_num_contrato,"
						          + "fir_usuario_captura,"
						          + "fir_usuario_firma1,"
						          + "fir_usuario_firma2,"
						          + "fir_st_firma1,"
						          + "fir_st_firma2,"
						          + "fir_fecha_captura"					          
						          + ") "
						          + " VALUES "
						          + "("
						          + folioOpera + ","
						          + numFiso + ","
						          + numUsuario + ","
						          + "0,"
						          + "0,"
						          + "'ESPERA',"
						          + "'ESPERA',"
						          + "TO_TIMESTAMP('"+fecha+"','DD/MM/YYYY')"
						          + ")";
					          
						break;
				case 2:
						sInstrucc = "INSERT INTO FIRMAS"
						          + "(fir_folio, "
						          + "fir_num_contrato,"
						          + "fir_usuario_captura,"
						          + "fir_usuario_firma1,"
						          + "fir_usuario_firma2,"
						          + "fir_st_firma1,"
						          + "fir_st_firma2,"
						          + "fir_fecha_captura,"
						          + "fir_fecha_firma1"					          
						          + ") "
						          + " VALUES "
						          + "("
						          + folioOpera + ","
						          + numFiso + ","
						          + numUsuario + ","
						          + numUsuario+ ","
						          + "0,"
						          + "'ACTIVO',"
						          + "'ESPERA',"
						          + "TO_TIMESTAMP('"+fecha.trim()+"','DD/MM/YYYY'),"
						          + "TO_TIMESTAMP('"+fecha.trim()+"','DD/MM/YYYY')"
						          + ")";
						break;				          
			}
					
		
	    if(stInstrucc.executeUpdate(sInstrucc)>0)
				binsertaFirma=true;
			
		}
		catch (SQLException ex)
		{
			System.out.println("Error al insertaFirma");
			System.out.println(ex);
			System.out.println(sInstrucc);
		}
			catch (Exception ex)
		{
			System.out.println("Error al insertaFirma");
			System.out.println(ex);
			System.out.println(sInstrucc);
		}
		finally
		{
			return binsertaFirma;
		}
	}
  
public boolean autorizacion( String[] strDatos, 
								 String[] strBitacora)
	{
		iRows=0;
		String query="";
		boolean bInstruccion=false;
		int tipoOperacion=Integer.parseInt(strDatos[0]);
		int dia = Integer.parseInt(strDatos[3].substring(0,2));//dia
		int mes = Integer.parseInt(strDatos[3].substring(3,5));//mes
 	 	int anio = Integer.parseInt(strDatos[3].substring(6,10));//a�o
		String sAccion=strDatos[5].trim();
		int numFirma=Integer.parseInt(strDatos[6]);

		boolean bComiteTecnico= n.aplica(Integer.parseInt(strDatos[2]));
		
		String[] strDatosAcuerdoCT=null;
		if (bComiteTecnico)
			{
			strDatosAcuerdoCT=getDatosAcuerdoCT(strDatos[2],strDatos[1]);
			}
		
		try
		{
			
			String sNumFolio;
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			stInstrucc=conBD.createStatement();
			stQuery=conBD.createStatement();
			conBD.setAutoCommit(false);	
			
			
			//Registra el usuario y los datos de la aoutorizaci�n, para fisos que requieren firmas mancomunadas
			switch (numFirma)
					{
					case 0://fiso sin firmas mancomunadas	
							iRows = 1;
							break;
					case 1://firma de autorizaci�n 1
					
						  query = " update " 
								+	" firmas "
								+	" set "
								+	" FIR_USUARIO_FIRMA1="+ strDatos[4] +", " 
								+	" FIR_ST_FIRMA1='"+strDatos[5].trim()+"', "
								+	" FIR_fecha_FIRMA1=TO_DATE('"+strDatos[3]+"','DD/MM/YYYY') "
								+	" WHERE FIR_FOLIO="+strDatos[1]
								+	" AND "
								+	" FIR_NUM_CONTRATO="+strDatos[2];
						  iRows = stInstrucc.executeUpdate(query);
			
						  
						  
		 				  break;
					
					case 2://firma de autorizaci�n 2
											
							query = " update " 
									+	" firmas "
									+	" set "
									+	" FIR_USUARIO_FIRMA2="+ strDatos[4] +", " 
									+	" FIR_ST_FIRMA2='"+strDatos[5].trim()+"', "
									+	" FIR_fecha_FIRMA2=TO_DATE('"+strDatos[3]+"','DD/MM/YYYY') "
									+	" WHERE FIR_FOLIO="+strDatos[1]
									+	" AND "
									+	" FIR_NUM_CONTRATO="+strDatos[2];
							iRows = stInstrucc.executeUpdate(query);
					 	    break;	
					}//switch(numero de firma de autorizacion)
			
				
			
			
			

			//Actualiza el estatus de la instruccion
			if((sAccion.equals("CANCELADO") || (sAccion.equals("ACTIVO") && (numFirma==2 || numFirma==0))) && iRows>0)						
				{
						
				switch(tipoOperacion)
							{
							case 5://Otros Servicios
									query = " UPDATE instrucc set INS_CVE_ST_INSTRUC='"+strDatos[5].trim()+"'"
									      + ",INS_ANO_ULT_MOD=" + anio
										  + ",INS_MES_ULT_MOD=" + mes
										  + ",INS_DIA_ULT_MOD=" + dia
									      + " WHERE "
										  + " INS_NUM_CONTRATO=" + strDatos[2]
										  + " AND "
										  + " INS_NUM_FOLIO_INST=" + strDatos[1];
										  
									if (iRows>0)		
										iRows=stInstrucc.executeUpdate(query);	
									
									break;

							}	
					}//fin if sAccion			
									
				//Registra en la bitacora		
				if(iRows>0)
			 	   iRows=insertaBitacora(strBitacora);
		
				if(iRows>0)
				   {
				   	conBD.commit();
				    System.out.println("FirmaAutoriza  con Folio:"+strDatos[1]);
				    bInstruccion=true;
				   }	
				else{
					conBD.rollback();
				   	bInstruccion=false;
				   	System.out.println("No se Registro la FirmaAutoriza con Folio:"+strDatos[1]);
				    }
		}
		catch (Exception ex)
		{
			try	{
				conBD.rollback();
				System.out.println("No se Registro la FirmaAutoriza con Folio:"+strDatos[1]);
				System.out.println("Error: "+ex);
				System.out.println("Query: \n"+query);
				}
			catch (Exception error)
				{
				System.out.println("No se realizo la FirmaAutoriza rollback");
				System.out.println("Error: "+ex);	
				
				}
			bInstruccion=false;
		
		}
		finally
		{
    
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { System.out.println("Funcion: autoriza");System.out.println(ex); }
      try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println("Funcion: autoriza");System.out.println(ex); }
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Funcion: autoriza");System.out.println(ex); }
			return bInstruccion;
		}
	}  

private String[] getDatosAcuerdoCT(String numfiso,String numfolio)
		{	
		String[] sDatos = new String[4];
		try
		{
			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sDatos;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sDatos;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			sQuery = " SELECT /*+ index(instrucc,detliqui)*/ to_char(i.ses_fecha,'dd/mm/yyyy'), i.ses_tipo, i.acu_id,TRIM(TO_CHAR(d.del_imp_liquidar,'9999999999999999999.99'))"
					 + " from instrucc i, detliqui d"
					 + " WHERE "
					 + " i.ins_num_contrato = " + numfiso + " AND "
					 + " i.ins_num_folio_inst = " + numfolio + " AND "
					 + " d.del_folio_opera= i.ins_num_folio_inst AND "
					 + " d.del_num_contrato=i.ins_num_contrato AND "
					 + " d.del_cve_tipo_liq<>21 AND " // NO INCLUYE LA FORMA DE LIQ SWIFT DEBIDO AL TIPO DE CAMBIO
					 + " i.ses_fecha is not null AND "
					 + " i.ses_tipo is not null AND "
					 + " i.acu_id is not null ";
					 
          	rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
				{
				sDatos[0] = rsQuery.getString(1);
				sDatos[1] = rsQuery.getString(2);
				sDatos[2] = rsQuery.getString(3);
				sDatos[3] = rsQuery.getString(4);
			
				}

		
		}
		catch (Exception ex)
				{
			System.out.println(ex);
    			}
		finally
				{
					try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
					try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
					try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
				}
		return sDatos;
	} 

	    public int insertaOtrosServiciosDatos( String sOperacion,String sConcepto,String sDato,String sFolio,String sBienes,String sEdificio) 
	       {                                   

	                   iRows=0;
	       boolean bInstruccion=false;
                String []sArregloDatos={null};
	                                           
	                                           
	       try {
	                                                   if (conBD == null) if (!conectarBD()) return -1;
	                                                   if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return -1;
	                                                   
	                                                   stInstrucc = conBD.createStatement();
	                                                   conBD.setAutoCommit(false);     
	                       
                               if(sBienes.equals("1"))   
                                   {
                               sInstrucc="Insert into F_BIENES_VALOR (FTOP_NUM_OPER, FBV_FOLIO,FBV_EDIFICIO)"
                                                                   + " values ('"
                                                                   + sOperacion + "'," + sFolio + "," + sEdificio + ")";
                                       sArregloDatos=new String[3];
                                       sArregloDatos[0]=sOperacion;
                                       sArregloDatos[1]=sFolio;
                                       sArregloDatos[2]=sEdificio;
                                       //envio informacion
                                       envio.consumo(1, sArregloDatos);
                                   }
                                    else{
	                       sInstrucc="Insert into F_CONINSNOMON_VALOR (FTOP_NUM_OPER, CONV_FOLIO,CONV_ID_CONCEPTO,"
	                                                           + "CONV_VALOR)"
	                                                           + " values ('"
	                                                           + sOperacion + "'," + sFolio + "," + sConcepto + ",'" + sDato +"')";
	                           sArregloDatos=new String[4];
	                           sArregloDatos[0]=sOperacion;
	                           sArregloDatos[1]=sFolio;
	                           sArregloDatos[2]=sConcepto;
	                           sArregloDatos[3]=sDato;
	                           //envio informacion
	                           envio.consumo(4, sArregloDatos);

	                       }                
	                                 iRows = stInstrucc.executeUpdate(sInstrucc);
	                       
	                   }catch (Exception ex) {
	                                                   System.out.println("Funcion: insertaDeposito");
	                                                   System.out.println("Error: "+ex);
	                                                   System.out.println(ex);
	                                                   System.out.println(sInstrucc);
	                                                   System.out.println(sQuery);
	                                                   try{

	                                                             conBD.rollback();
	                                                             conBD.commit();

	                                                   } catch(SQLException e) {                               
	                                                                   System.out.println("Error al realizar el roll back: :"+e);      
	                                                   }       
	                   } finally {
	                                   try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { System.out.println("Funcion: ProcesoDeposito");System.out.println(ex); }
	                                   try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Funcion: insertaDeposito");System.out.println(ex); }
	                                   return iRows;                                            
	                   }                                                                               
	    }


	}
	

