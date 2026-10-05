package mx.com.inscitech.cuentas.individuales.negocio;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.cuentas.individuales.negocio.nAcuerdos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat;
import java.text.DecimalFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class nInstrucciones extends nFiducia {
    private static final Logger LOGGER = LoggerFactory.getLogger(nInstrucciones.class);


	private String[] ctas=new String[18];	
	private	Statement stSaldos=null;//stSaldos
	private	Statement stSaldosAnt=null;//stSaldosAnt
	private	ResultSet rsSaldos=null;//rsQuery
	private DecimalFormat num = new DecimalFormat("############0.00");
	private boolean bContabilizado=false;
	static Calendar cal;
	static Date dFechaHon;
	nAcuerdos n=new nAcuerdos();
		/*
    Metodo: folioAutorizado
    Funcion: Validar que la instrucionno este autorizada (ACTIVO)
    Autor: Jannett Jiménez Ruiz
    Fecha:26/08/2004
    */
    
	public boolean folioAutorizado(String numFid,String folio,int tipo)
	{
		try
		{
			if (conBD == null) if (!OpenBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			switch(tipo)
					{
					case 1://deposito
					case 2://retiro
					case 3://traspaso
							sQuery  = "select "
									+ "INS_CVE_ST_INSTRUC "
									+ " from  "
									+ " instrucc "
									+ " where " 
									+ " INS_NUM_CONTRATO= "+numFid
									+ " and "
									+ "INS_NUM_FOLIO_INST="+folio;
							break;
					
					case 5://compromisos
					case 6://cancelacion de compromisos				
					case 7://reprogramaciones
					case 8://asignacion de rendimientos
							sQuery  = "select "
									+ " MFO_CVE_ST_MOVIMFO "
									+ " from  "
									+ " MOVIMIFOSEG "
									+ " where " 
									+ " MFO_NUM_AUX1= "+numFid
									+ " and "
									+ " MFO_FOLIO="+folio;
							break;
					}
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				{			
				if(!rsQuery.getString(1).trim().equals("ESPERA"))
				    return true;
				else
					return false;
				}
			else 
				  return false;
		}
		catch(Exception ex)
		{
			LOGGER.debug("validaStatus: "+ex);
			return false;
		}
		finally
		{			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}		
	}


    /*
    Metodo: existeFolio
    Funcion: Validar exista una instruccion con el folio por asiganr a una nueva instruccion
    Autor: Jannett Jimènez Ruiz
    Fecha:26/08/2004
    */
	public boolean existeFolio(String folio,int tipoInstruccion)
	{
		boolean bReturn= false;
		try
		{
			if (conBD == null) if (!OpenBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			switch(tipoInstruccion)
					{
					case 1://deposito
					case 2://retiro
					case 3://traspaso
					case 4://pago de honorarios
							sQuery  = "select "
									+ " NVL(COUNT(1),0) "
									+ " from  "
									+ " instrucc "
									+ " where " 
									+ "INS_NUM_FOLIO_INST="+folio;
							break;
					case 22://Retiro Foseg
					case 5://compromisos
					case 6://cancelacion de compromisos				
					case 7://reprogramaciones
					case 8://asignacion de rendimientos
							sQuery  = " select "
									+ " NVL(COUNT(1),0) "
									+ " from  "
									+ " MOVIMIFOSEG "
									+ " where " 
									+ " MFO_FOLIO="+folio;
							break;
					}
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				if(rsQuery.getInt(1)>0)
					bReturn=true;
		
			
		}
		catch(Exception ex)
		{
			LOGGER.debug("existeFolio: "+ex);
			
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			
		return bReturn;	
		}		
	}

	
	/*
		
	Metodo:	insertaRetiro
	Funcion: Registra las instrucciones de liquidacion(retiro)
	Parametros: Un arreglo con toda la información del retiro
		sdata[0] = fecha
		sdata[1] = folio
		sdata[2] = fiso
		sdata[3] = contrato 
		sdata[4] = importe del retiro
		sdata[5] = tipo de operacion (SI=RUTINARIA, NO= NO RUTINARIA)
		sdata[6] = concepto del retiro
		sdata[7] = forma de liquidacion
	Modifico: Jannett Jiménez Ruiz
	Fecha:Agosto,2004	
	*/
	
	public boolean insertaRetiro( String[] sData,
																String[] bitacora,
																String[] strFirma,
                                String[] honorarios)
	{
			
	 String  query="";
	 int dia,mes,anio;
	 dia = Integer.parseInt(sData[0].substring(0,2));//dia
	 mes = Integer.parseInt(sData[0].substring(3,5));//mes
 	 anio = Integer.parseInt(sData[0].substring(6,10));//año
   
     boolean tipoFiso=getTipoFiso(sData[2]);//valida si es un fiso de FOSEG
     boolean bComiteTecnico= n.aplica(Integer.parseInt(sData[2]));
	 String tipoPersFid="",sDetLiq="", sDetSWIFT="",sAcuerdo="", sCveConcepto="0", sSecOperacion="0";
	 String sDetFoSeg="", sStatus="ACTIVO";
	 String sHonorarios="";       
   iRows=0;
	 boolean bInstruccion=false;

	 /*
	 ESPERA = 'USUARIO DE CAPTURA'
	 ACTIVO = 'USUARIO OPERATIVO'
	 */
	 
	 boolean bFirmasM = firmasMancomunadas(sData[2] );	
	 if(bFirmasM || strFirma[0].equals("1"))
			sStatus="ESPERA";

 	 try{      
		if (conBD == null) if (!OpenBD()) return false;
		if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			
			stInstrucc = conBD.createStatement();
			conBD.setAutoCommit(false);	
			
			//Operacion no rutinaria, obtener la clave y el secuencial asignado a la operacion
		    if ((sData[5]).equals("SI")) {
			    	//Clave
			    	sCveConcepto=getKey(2,sData[6]); 
			    	//Secuencial
			    	sSecOperacion=getKey(4,sData[2] + " AND oaf_num_operacion=" + sCveConcepto + " AND oaf_automatico=0"); 
			  	}

			//JJR 16/02/2006
			//SE INCORPORAN LOS PK DE LA TABLA DE ACUERDOS_CT
			//PARA PODER REALIZAR EL MANEJO DE ACUEDOS EN INSTRUCCIONES DE RETIRO			  	
			sInstrucc 	=  "INSERT INTO instrucc"
						+ "(ins_num_contrato,"
						+ "ins_num_folio_inst,"
					  	+ "ins_sub_contrato,"
					  	+ "ins_txt_comentario,"
					  	+ "ins_cve_tipo_instr,"
						+ "ins_num_miembro,"
						+ "ins_nom_miembro,"
						+ "ins_ano_alta_reg,"
						+ "ins_mes_alta_reg,"
						+ "ins_dia_alta_reg,"
						+ "ins_ano_ult_mod,"
						+ "ins_mes_ult_mod,"
						+ "ins_dia_ult_mod,"
						+ "ins_cve_st_instruc,"
						+ "ins_cve_st_cont,"
						+ "ins_fecha_contable,"
						+ "ses_fecha,"
						+ "ses_tipo,"
						+ "acu_id)"
						+ " VALUES(" 
						+ sData[2] 
						+ "," + sData[1] 
						+ "," + "0"
						+ "," + "0"
						+ "," + "'LIQUIDACION INTERNET'"
						+ "," + "0"
						+ "," + "0" 
						+ "," +  anio
						+ "," + mes 
						+ "," + dia
						+ "," + anio 
						+ "," + mes
						+ "," + dia 
						+ "," +"'"+ sStatus + "'"
						+ "," + "'PENDIENTE',''";
						
			if (bComiteTecnico)
				{
			   	sInstrucc = sInstrucc	+ "," + "to_date('"+sData[56]+"','dd/mm/yyyy')" 	//SES_FECHA
									  	+ "," + "'"+sData[57]+"'"					//SES_TIPO
								  		+ "," + "'"+sData[58]+"')";	
				}
			else
				{
				sInstrucc = sInstrucc	+ ",null" 
										+ ",null" 
										+ ",null)"; 
				}
						
							//ACU_ID
					
						
			 			
		
				sDetLiq = "INSERT INTO detliqui " 
						+ "(del_folio_opera,"
						+ "del_num_operacion,"
						+ "del_num_sec_opera,"
						+ "del_num_modulo,"
						+ "del_num_transac,"
						+ "del_num_contrato,"
						+ "del_sub_contrato,"
						+ "del_sub_programa,"
						+ "del_num_pers_fid,"
						+ "del_nom_pers_fid,"
						+ "del_tipo_pers_fid,"
						+ "del_folio_oper_sis,"
						+ "del_benef_xtercer,"
						+ "del_imp_liquidar,"
						+ "del_paridad,"
						+ "del_cve_tipo_liq,"
						+ "del_num_moneda,"
						+ "del_cve_tipo_cta,"
						+ "del_num_banco,"
						+ "del_nom_banco,"
						+ "del_num_plaza,"
						+ "del_nom_plaza,"
						+ "del_num_sucursal,"
						+ "del_num_cuenta,"
						+ "del_num_pais,"
						+ "del_num_cheque,"
						+ "del_cta_banxico,"
						+ "del_dir_aper_cta,"
						+ "del_codigo_trans,"
						+ "del_num_iniciativa,"
						+ "del_num_ctam,"
						+ "del_num_scta,"
						+ "del_num_sscta,"
						+ "del_num_ssscta,"
						+ "del_nom_area,"
						+ "del_concepto,"
						+ "del_ano_alta_reg,"
						+ "del_mes_alta_reg,"
						+ "del_dia_alta_reg,"
						+ "del_ano_ult_mod,"
						+ "del_mes_ult_mod,"
						+ "del_dia_ult_mod,"
						+ "del_cve_st_detliqu,"
						+ "del_rubro,"
						+ "del_entidad_fin,"
						+ "del_contrato_inter) "
						+ "VALUES(";
					
		  tipoPersFid= sData[47];
			
		sDetSWIFT = "";
			
			//sData[7]=CLAVE FORMA DE LIQUIDACION
			
			if(sData[7].equals("3")) //CHEQUE
									{
        		 		sDetLiq += sData[1] + ","+ sData[50] + ",1,0,0," + sData[2] + ",0,'"+sData[48]+"','" +sData[51] +"','" + sData[8]
							 	+ "','"+sData[47]+"',"+ sData[1] + ",0," + sData[4] + ",1,3,1,' ',"+ getKey(5,sData[9]) +",'"+ sData[9] 
								+ "',0,' ',0,0,1,0,0,' ', '',0,0,0,0,0,'','" + sData[6] + "',"+ anio + "," + mes+ "," + dia 
								+ "," + anio+ "," + mes + "," + dia
						 		//+ ",'" + sStatus + "'," + sCveConcepto + ",0,"+sData[3]+")" ;								
 					 	 		+ ",'" + sStatus + "'," + sData[52] + "," + sData[53]+ ","+sData[3]+")";
									}
										
			if(sData[7].equals("18"))//SIAC
									{	
        				sDetLiq += sData[1] + ","+ sData[50] + ",1,0,0," + sData[2] + ",0,'"+sData[48]+"','" +sData[51] +"','" + sData[9]
								+ "','"+sData[47]+ "'," + sData[1] + ",0," + sData[4] + ",1,18,1,' '," + getKey(5,sData[54]) +",'" + sData[54] +"',"
						 		+ "0,' ',0,0,1,0,'"+ sData[8] + "','','',0,0,0,0,0,' ','" + sData[6] + "',"
						 		+ anio + "," + mes
						 		+ "," + dia + "," + anio
						 		+ "," + mes + "," + dia 
					 	 		+ ",'" + sStatus + "'," + sData[52] + "," + sData[53]+ ","+sData[3]+")";
        							}
			
      		if(sData[7].equals("19"))//TBC-BANCOMER
      								{
         				sDetLiq += sData[1] + ","+ sData[50] + ",1,0,0," + sData[2] + ",0,'"+sData[48]+"','" +sData[51] +"','" + sData[10]
            					+ "','"+sData[47]+"',"+ sData[1] +",0," + sData[4] + ",1,19,1,' ',"+ getKey(5,sData[54]) +",'" + sData[54] + "',"
            					+ "0,'',0,'"+ sData[9] + "',1,0,0,' ',' ',0,0,0,0,0,' ','" + sData[6] + "',"
            					+ anio + "," + mes
            					+ "," + dia + "," + anio
            					+ "," + mes + "," + dia 
            					+ ",'" + sStatus + "'," + sData[52] + "," + sData[53]+ ","+sData[3]+")";
      								}		
			
      		if(sData[7].equals("20"))// TEF
      								{
         				sDetLiq += sData[1] + ","+ sData[50] + ",1,0,0," + sData[2] + ",0,'"+sData[48]+"','" +sData[51] +"','" + sData[11]
								+ "','"+tipoPersFid+"'," + sData[1] + ",0," + sData[4] + ",1,20,1,' ',"+ sData[8] + ",'" + sData[9]
								+ "',0,"+"''"+",0,'"+ sData[10] + "',1,0,0,'" + sData[12] + "',' ',0,0,0,0,0,' ','" + sData[6] + "',"
								+ anio + "," + mes
								+ "," + dia + "," +  anio
								+ "," + mes + "," + dia 
            					+ ",'" + sStatus + "'," + sData[52] + "," + sData[53]+ ","+sData[3]+")";
      								}
				
			// JJR 11/04/2005
			// SE INCORPORA NUERVA FORMA DE LIQUIDACION, CON LA CUAL SERA REEMPLAZADA LA FORMA POR  SPEUA
			// ESTA FORMA REQUIERE LA MISMA INFORMACION QUE TEF
			
			if(sData[7].equals("23"))//SPEI
									{
		        		sDetLiq += sData[1] + ","+ sData[50] + ",1,0,0," + sData[2] + ",0,'"+sData[48]+"','" +sData[51] +"','" + sData[11]
								+ "','"+sData[47]+"',"+ sData[1] +",0," + sData[4] + ",1,23,1,' ',"+ sData[8] + ",'" + sData[9]
								+ "',0,"+"''"+",0,'"+ sData[10] + "',1,0,0,'" + sData[12] + "',' ',0,0,0,0,0,' ','" + sData[6] + "',"
								+ anio + "," + mes
								+ "," + dia + "," +  anio
								+ "," + mes + "," + dia 
								+ ",'" + sStatus + "'," + sData[52] + "," + sData[53]+ ","+sData[3]+")";
        							}
						
			if(sData[7].equals("SPEUA")) // CLAVE 5
										{
		        		sDetLiq += sData[1] + ","+ sSecOperacion + ",0,0,0," + sData[2] + ",0,0,0,'" + sData[12]
								+ "','"+tipoPersFid+"',"+ sData[1] +",0," + sData[4] + ",0,5,0,' ',"
								+ sData[8] +",'" + sData[9] +"',"
								+ "0,'"+sData[11]+"',0,'"+sData[10] + "',0,0,0,' ',' ',0,0,0,0,0,' ','" + sData[6] + "',"
								+ anio + "," + mes
								+ "," + dia + "," + anio
								+ "," + mes + "," + dia 
								+ ",'" + sStatus + "'," + sCveConcepto + ",0,"+sData[3]+")" ;
        								}
				
			if(sData[7].equals("21"))//SWIFT
									{
		        		//sDetLiq += sData[1] + ","+ sSecOperacion + ",0,0,0," + sData[2] + ",0,0,"
						sDetLiq += sData[1] + ","+ 0 + ",0,0,0," + sData[2] + ",0,0,"
								+ getKey(1,sData[9]) + ",'" + sData[17] + "','"+tipoPersFid
								+ "',"+ sData[1] +",0," +  sData[4] + ",0,21," + getKey(3,sData[15]) + ",'"+sData[21]+"',0,'"
								+ sData[8] + "',0,'" + sData[19] + "',"
								+ sData[12] + ",'" + sData[13] + "'," + getKey(1,sData[18])
								+ ",0,0,'" + sData[15] + "','" + sData[16] + "',0,0,0,0,0,'"
								+ sData[11] + "','" + sData[6] + "',"
								+ anio + "," + mes
								+ "," + dia + "," + anio
								+ "," + mes + "," + dia + ",'" + sStatus + "'," + sCveConcepto + ",0,"+sData[3]+")";
		
						sDetSWIFT = "INSERT INTO detswift"
								  + " (del_folio_opera, "
								  + "swi_branch,"
								  + "swi_domicilio,"
								  + "swi_nom_plaza) "
								  + "VALUES("
						  		  + sData[1] + ",'" 
						  		  + sData[14] + "','" 
						  		  + sData[20] + "','"
						  		  +sData[10]+"')";
									}
			 
			if(sData[7].equals("PM"))// PAGOS MULTIPLES 
								{
				 				String clave="";	      
								//if(sData[29].equals("19"))
								//	clave = "1";
								//else
								clave="1";
					
						sDetLiq  += sData[1] + ","+ sData[50] + ",1,0,0," + sData[2] + ",0,'"+sData[48]+"','" +sData[51] +"','" + sData[10]
								 + " ','"+sData[47]+"',0,0," + sData[4] + ",1,"+sData[29]+"," + clave +",' ',0,'"
								 + " ',0,' ',0,0,0,0,0,' ', '',1,0,0,0,0,'','" + sData[6] + "',"
								 + anio + "," + mes
								 + "," + dia + "," + anio
								 + "," + mes + "," + dia 
								 + ",'" + sStatus + "'," + sData[52] + "," + sData[53]+ ","+sData[3]+")";
								}
								
 
         if( honorarios != null ) 
         						{
          
	           		sHonorarios =  "INSERT INTO DETLIQUI_HONO"
	           					+ "(DETH_NUM_CONTRATO,"
	           					+ "DETH_FOLIO_OPERA, "
								+ "DETH_IMP_TOT,"
								+ "DETH_IMP_HONOR,"
								+ "DETH_IVA,"
								+ "DETH_RET_ISR, "
								+ "DETH_RET_IVA)"
								+ " VALUES(" 
								+ honorarios[0] + "," 
								+ honorarios[1] + "," 
								+ honorarios[6] + "," 
								+ honorarios[2] + "," 
								+ honorarios[3] + "," 
								+ honorarios[4] + "," 
								+ honorarios[5] + ")";     
           						}
           	
        //no aplica para SWIFT  
        
		if (bComiteTecnico && !sStatus.equals("ESPERA") && !sData[7].equals("21"))
						{
						
           				sAcuerdo = "UPDATE acuerdos_ct a "
   								 + " SET a.acu_monto_disponible = (a.acu_monto_disponible -"+  sData[4] + "),"
       							 + "a.acu_monto_ejercido   = (a.acu_monto_ejercido + "+ sData[4] + "),"
       							 + "a.acu_status='EN PROCESO'"
								 + " WHERE "
								 + "a.ses_num_contrato="+ sData[2] 
								 + " AND "
								 + "a.ses_fecha=to_date('"+sData[56]+"','dd/mm/yyyy')"
								 + " AND "
								 + "a.ses_tipo='"+sData[57]+"'"
								 + " AND "
								 + "a.acu_id='"+sData[58]+"'"
								 + " AND "
								 + "a.acu_monto_disponible>="+  sData[4];
							
								 
								 
					//LOGGER.debug(sAcuerdo)	;		 
						}
							           	
           
			query=sInstrucc;	
			iRows = stInstrucc.executeUpdate(sInstrucc);//inserta en instrucc
			
			if (iRows>0) 
				{
				query=sDetLiq;
				iRows = stInstrucc.executeUpdate(sDetLiq);//inserta en detliqui
				}
			if (iRows>0 && bComiteTecnico && !sStatus.equals("ESPERA")&& !sData[7].equals("21"))
				{
				query=sAcuerdo;
				iRows = stInstrucc.executeUpdate(sAcuerdo);//Actualiza acuerdo
				}
			
          if( iRows>0 && honorarios != null ) 
          		{
          		query=sHonorarios;
            	iRows = stInstrucc.executeUpdate(sHonorarios);
          		}
			
				
     
    		if(tipoFiso)
				{										
				sDetFoSeg   = "INSERT INTO detfoseg (dfo_folio_opera,dfo_importe1,dfo_contrato1,"
							+ "dfo_importe2,dfo_contrato2,dfo_importe3,dfo_contrato3,"
							+ "dfo_dia_alta_reg,dfo_mes_alta_reg,dfo_ano_alta_reg"
							+ ",dfo_dia_ult_mod,dfo_mes_ult_mod,dfo_ano_ult_mod,"
							+ "dfo_cve_st_detfoseg)"
							+ " VALUES("+sData[1]+","+sData[23]+","+ sData[26]+","
							+ sData[24]+","+ sData[27]+","
							+ sData[25]+","+sData[28]+","
							+ dia + ","
							+ mes + ","
							+ anio + ","
							+ dia + ","
							+ mes + ","
							+ anio + ","
							+ "'"+sStatus+"')";
        
						
				query=sDetFoSeg;	
				if (iRows>0)
					iRows = stInstrucc.executeUpdate(sDetFoSeg);//inserta en detfoseg
					
		    if (iRows>0 && !sData[41].equals("")) 
				    iRows=contabilizaFoseg(sData[41],bFirmasM);//estatal
				    
				if (iRows>0 && !sData[42].equals("")) 
				    iRows=contabilizaFoseg(sData[42],bFirmasM);//federal
				    
				if (iRows>0 && !sData[43].equals(""))
					iRows=contabilizaFoseg(sData[43],bFirmasM);//rendimientos
				
				}	
		   	
		    if (!sDetSWIFT.equals("")){
		    	query=sDetSWIFT;
		    	if (iRows>0)
					iRows = stInstrucc.executeUpdate(sDetSWIFT);//inserta en detswift		    		
		    	}
		    	
			 //Inserta un registro de la operación en la bitacora
			 if(iRows>0)
			    iRows=insertaBitacora(bitacora);
			 
			 if(iRows>0)
					    	{
					    	if(bFirmasM)// firmas mancomunadas
					    		{
						    	if(insertaFirma(strFirma))
						    		{	
						      		conBD.commit();
						      		LOGGER.debug("Retiro con Folio:"+ sData[1]+ " SATISFACTORIO");
						      		bInstruccion=true;
						      		}
						      	else
						      		{
						      		conBD.rollback();
						      		conBD.commit();
						      		LOGGER.debug("Retiro con Folio:"+ sData[1]+ " NO SATISFACTORIO");
						      		LOGGER.debug(query);
						      	    bInstruccion=false;
						      		}	
						      	}
						    else{
						    	conBD.commit();
						    	LOGGER.debug("Retiro con Folio:"+ sData[1]+ " SATISFACTORIO");
						      	bInstruccion=true;
						    	}  		
					      	}
					    else
					    	{
					      	conBD.rollback();
					      	conBD.commit();
					      	LOGGER.debug("Retiro con Folio:"+ sData[1]+ " NO SATISFACTORIO");
					      	LOGGER.debug(query);
					      	bInstruccion=false;
					     	}
		}
		catch(SQLException ex)
		{
			LOGGER.debug("Error de insertaRetiro:"+ex);
			LOGGER.debug("Retiro con Folio:"+ sData[1]+ " NO SATISFACTORIO");
			LOGGER.debug(query);
			
			try{
				conBD.rollback();
				conBD.commit();
				LOGGER.debug("rollback");
				}
			catch(SQLException e)
				{
						
				LOGGER.debug("Error al realizar el roll back: :"+e);	
				}
			bInstruccion=false;
		}
		finally
		{
		//LOGGER.debug("Cerrando Finally de la base de InsertRetiro");
		try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaRetiro");LOGGER.error("Exception: ", ex); }
		try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaRetiro");LOGGER.error("Exception: ", ex); }
		return bInstruccion;
		}		
	}
	

	
	
	/*
	Inicia proceso de Deposito
	Creada:Agosto del 2002
	Por: Jannett Jiménez Ruiz
	Modificada: 15/07/2003
	Por: BRG
	Detalle: Se incorporó un parámetro más para poder manejar los depositos en espera de autorización (FOSEG)
					sEstatus
						
	
	Modificada por: Jannett Jiménez Ruiz
	Fecha:23/07/2004
	*/
	
	
		
	/*
  public boolean insertaDeposito (String fecha,
																 String folio,
																 String iNumFid,
																 String nomUsuario,
																 String iNumCta,
																 String iImpDeposi,
																 String sConceptoR,
																 String sConceptoNR,
																 String iCtoInver,
																 String sInstrume, 
																 String[] bitacora,
																 String[] strFirma)
	{					
			  	int d,m,a;
			  	String ImporteD;
			  	String cuenta;
					d=Integer.parseInt(fecha.substring(0,2));//dia
					m=Integer.parseInt(fecha.substring(3,5));//mes
					a=Integer.parseInt(fecha.substring(6,10));//año
					iRows=0;
					boolean bFirmasM = firmasMancomunadas(iNumFid);	//valida si el fiso requiere firmas mancomunadas
					boolean bInstruccion=false;
					String sEstatus="ACTIVO";

					if(bFirmasM || strFirma[0].equals("1"))
						sEstatus="ESPERA";
					try
					{
						if (conBD == null) if (!OpenBD()) return false;
						if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
						
						stInstrucc = conBD.createStatement();
						conBD.setAutoCommit(false);	
						
						//Se recupera la clave de la operacion rutinaria
						if (sConceptoR!=null)
			   				{
				   				sQuery = "SELECT opf_num_operacion FROM operfid WHERE opf_descripcion='"+ sConceptoR +"'"; 
				   				rsQuery = stInstrucc.executeQuery(sQuery);
				   				if(rsQuery.next())	
				   				   sConceptoNR =rsQuery.getString(1);  				
			   			  }
			   			    
						if(sConceptoR==null)
						{
							sConceptoR = sConceptoNR;
			   			sConceptoNR ="0"; 				
		 				}
				 										
						if(sInstrume==null)
			   				sInstrume ="0";
			   						   			
			   			int j = iNumCta.length();
			   			iNumCta=iNumCta.trim();
			   			int cont=0;
			   			for(j=(iNumCta.length()-1);j>=0&&cont==0;j--)
					   	if(iNumCta.charAt(j)==' ')
					    {
					    	cont++;
					   	}
					   				   
			   			String cuentaS=iNumCta.substring((j+2),iNumCta.length());			   					   				
						 
							sInstrucc="Insert into Instrucc (ins_num_contrato, ins_num_folio_inst,"
							+ "ins_sub_contrato, ins_txt_comentario,ins_cve_tipo_instr,"
							+ "ins_num_miembro, ins_nom_miembro, ins_ano_alta_reg,"
							+ "ins_mes_alta_reg, ins_dia_alta_reg, ins_ano_ult_mod,"
							+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc)"
							+ " values ("
							+ iNumFid + "," + folio + ",0,0,'RECEPCION INTERNET',"
							+ "0,'0',"
							+  a +","+ m +","+ d +","
							+  a +","+ m +","+ d +","
							+ "'" + sEstatus + "')";
			            
			        iRows = stInstrucc.executeUpdate(sInstrucc);
			            
					if(iNumCta == "2311")
					{				
						int iEntFin = 0;
						int iRubro=28;	
						String SQL = "",sQuery2="";
							
						SQL= "SELECT  CPR_ENTIDAD_FIN from continte"
						+ " WHERE CPR_NUM_CONTRATO = " + iNumFid
						+ " AND CPR_CVE_ST_CONTINT = 'ACTIVO' "
						+ " AND CPR_CONTRATO_INTER = " + iCtoInver ;
						
						sQuery2= "SELECT  CTO_NOM_CONTRATO	FROM   CONTRATO"
						+ " WHERE CTO_NUM_CONTRATO = " + sConceptoNR;
													
		   				rsQuery = stInstrucc.executeQuery(sQuery);
		   				
		   				if(rsQuery.next())
		   				{				   			    
		   				   iEntFin = rsQuery.getInt(1);  		   				   
			   				 if(iEntFin ==1) 
				   				 	iRubro =20;
			   				 else
				   				 	iRubro =28;
		   				}
		   				
							sConceptoR = sConceptoR +" / TRASPASO INTERNO DEL FIDEICOMISO " + sConceptoNR + " , CONTRATO: " + sInstrume;
							   
						sInstrucc =  "Insert into Deposit values ("
							+ "0," + folio +",0,0,0,0," + 
							iNumFid +""+ ",0,8,0,0,0,0,'0','0',9,"+ 
							iImpDeposi +"," + "0,0,'" 
							+ "" + "',0,'',1001,'DF',0,"
							+ "0,'','','" +sConceptoR + "',"
							+ 2351 + ",'0',''," + "0,0,'',0,2311,90,33,0,3427,'FIDUCIARIA',"
							+ iEntFin + ","
							+ iCtoInver  +","
							+ "1,"+ a +","+m +","+ d +","+ 
							a +","+ m +","+ d +","+ a +","+ m +","+ d +","+ "'" 
							+ sEstatus + "',0,0,0," + iRubro + ")";
					}
				else
					{
					sInstrucc =  "Insert into Deposit values ("
						+ "0," + folio +",0,0,0,0," + iNumFid +""
						+ ",0,0,0,0,0,0,'0','0',0,"+ iImpDeposi +","
						+ "0,0,'" + sInstrume +"',0,'0',0,'0',0,"
						+ "0,'0','0','"+ sConceptoR +"',"+ cuentaS +",'0','0',"
						+ "0,0,'0',0,0,0,0,0,0,'0',0,"+ iCtoInver  +","
						+ "0,"+ a +","+ m +","+ d +","+ a +","+ m +","+ d +","
						+ a +","+ m +","+ d +","
						+ "'" + sEstatus + "',0,0,0," + sConceptoNR + ")";
				}			
			
						if(iRows>0)
							iRows = stInstrucc.executeUpdate(sInstrucc);
			
						//Inserta un registro de la operación en la bitacora
						if(iRows>0)
			 			    iRows=insertaBitacora(bitacora);

					    if(iRows>0)
					    	{
					    	if(bFirmasM)
					    		{
										if(insertaFirma(strFirma)){
												LOGGER.debug("Se registro Deposito con Folio:"+folio);	
												conBD.commit();
												bInstruccion=true;
											}
										else{
													LOGGER.debug("No se registro Deposito con Folio:"+folio);	
													conBD.rollback();
													conBD.commit();
													bInstruccion=false;
												}	
						      	}
						    else{
								    	LOGGER.debug("Se registro Deposito con Folio:"+folio);	
								    	conBD.commit();
							      	bInstruccion=true;
							    	}  		
					      	}
					    else
					    	{
									LOGGER.debug("No se registro Deposito con Folio:"+folio);	
									conBD.rollback();
									conBD.commit();
									bInstruccion=false;
					     	}
					
					}
					catch (Exception ex)
					{
						LOGGER.debug("Funcion: insertaDeposito");
						LOGGER.debug("Error: "+ex);
						LOGGER.error("Exception: ", ex);
						LOGGER.debug(sInstrucc);
						LOGGER.debug(sQuery);
						try{
							LOGGER.debug("No se registro Deposito con Folio:"+folio);	
							conBD.rollback();
							conBD.commit();
							LOGGER.debug("rollback");
							}
						catch(SQLException e)
							{				
								LOGGER.debug("Error al realizar el roll back: :"+e);	
							}	
						bInstruccion=false;
					}
					finally
					{
						try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
						try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
						return bInstruccion;						
					}										
				}
*/	


 
 public boolean insertaDeposito ( String[] Datos, String[] bitacora, String[] strFirma) 
 {					
		int d,m,a;
    String ImporteD;
		String cuenta;
    String sEstatus="ACTIVO";
    String sNumPlaza = "";
    String sNomInsti = "";
    String sNumCuenta = "";
    String sRubro = "";
    String sNumRefe = "";
    
    d=Integer.parseInt(Datos[17].substring(0,2));//dia
		m=Integer.parseInt(Datos[17].substring(3,5));//mes
		a=Integer.parseInt(Datos[17].substring(6,10));//año
          
		iRows=0;
		boolean bFirmasM = firmasMancomunadas(Datos[3]);	//valida si el fiso requiere firmas mancomunadas
    boolean bInstruccion=false;
					
    if(bFirmasM || strFirma[0].equals("1"))
			sEstatus="ESPERA";
      
    //************************* INFOTEC ****************************//
    //   El cámpo  DPO_FOLIO_OPER_SIS es utilizado para diferenciar //
    //   depósitos en Internet y no duplicar operaciones en SORI    //
    //**************************************************************//
					
    try {
						if (conBD == null) if (!OpenBD()) return false;
						if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
						
						stInstrucc = conBD.createStatement();
						conBD.setAutoCommit(false);	
						
						if(Datos[13]==null)
			   				Datos[13] ="0";
			   						   			
			   		if( Datos[5].equals("") )
                Datos[5] = "0";
            else
                Datos[5] = Datos[5];
                  
            if( Datos[8].equals("4") ) {
                sNumPlaza += "10001";
                //Datos[16] = Datos[16];
                Datos[11] = Datos[11];
                Datos[12] = Datos[12];
            } else {
                sNumPlaza += "1001";    
                //Datos[16] = "0";    
                Datos[11] = "0";
                Datos[12] = "";
            }                  
            
            if( Datos[8].equals("6") )
                sNomInsti = "BANXICO";
            else    
                sNomInsti = "";
              
            if( Datos[8].equals("7") )
                sNumRefe = Datos[3]; 
            else
                sNumRefe = "0"; 
                  
            if( Datos[18].equals("1") )    
                sRubro = "20";
						else
                sRubro = "28";
                
            if( Datos[15].equals(""))     
                Datos[14] = Datos[14];
            else
                Datos[14] = Datos[14] + "/" + Datos[15];
                
            sInstrucc="Insert into Instrucc (ins_num_contrato, ins_num_folio_inst,"
						+ "ins_sub_contrato, ins_txt_comentario,ins_cve_tipo_instr,"
						+ "ins_num_miembro, ins_nom_miembro, ins_ano_alta_reg,"
						+ "ins_mes_alta_reg, ins_dia_alta_reg, ins_ano_ult_mod,"
						+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc,ins_cve_st_cont, ins_fecha_contable)"
						+ " values ("
						+ Datos[3] + "," + Datos[1] + ",0,0,'RECEPCION INTERNET',"
						+ "0,'0',"
						+  a +","+ m +","+ d +","
						+  a +","+ m +","+ d +","
						+ "'" + sEstatus + "'" + ",'PENDIENTE','')";
			            
			      iRows = stInstrucc.executeUpdate(sInstrucc);
			            
					  if(Datos[16] == "2311") {				
						  int iEntFin = 0;
						  int iRubro=28;	
						  String SQL = "",sQuery2="";
							
						  SQL = "SELECT  CPR_ENTIDAD_FIN from continte"
						      + " WHERE CPR_NUM_CONTRATO = " + Datos[3]
						      + " AND CPR_CVE_ST_CONTINT = 'ACTIVO' "
						      + " AND CPR_CONTRATO_INTER = " + Datos[19] ;
						
						  sQuery2 = "SELECT  CTO_NOM_CONTRATO	FROM   CONTRATO"
						          + " WHERE CTO_NUM_CONTRATO = " + Datos[15];
													
		   				rsQuery = stInstrucc.executeQuery(sQuery);
		   				
		          if(rsQuery.next()) {				   			    
		   				   iEntFin = rsQuery.getInt(1);  
                 
			   				 if(iEntFin ==1) 
				   				 	iRubro = 20;
			   				 else
				   				 	iRubro = 28;
		   				}
		   				
							Datos[14] = Datos[14] +" / TRASPASO INTERNO DEL FIDEICOMISO " + Datos[15] + " , CONTRATO: " + Datos[13];
							   
						  sInstrucc =  "Insert into Deposit values ("
							+ "0," + Datos[1] +",0,0,0,0," + 
							Datos[3] +""+ ",0,8,0,0,0,0,'0','0',9,"+ 
							Datos[9] +"," + "0,0,'" 
							+ "" + "',0,'',1001,'DF',0,"
							+ "0,'','','" + Datos[8] + "',"
							+ 2351 + ",'0',''," + "0,0,'',0,2311,90,33,0,3427,'FIDUCIARIA',"
							+ iEntFin + ","
							+ Datos[19]  +","
							+ "1,"+ a +","+m +","+ d +","+ 
							a +","+ m +","+ d +","+ a +","+ m +","+ d +","+ "'" 
							+ sEstatus + "',0,0,0," + iRubro + ")";
          }    
    			else
					{
					    sInstrucc =  "Insert into Deposit values (";
              sInstrucc += Datos[0] + "," + Datos[1] + "," + Datos[2] + ",0,0,0," + Datos[3];
						  sInstrucc += ",0," + Datos[4] + "," + Datos[5] + "," + Datos[1] + ",0," + Datos[21] + ",'"+ Datos[6]  + "','" + Datos[7];
						  sInstrucc += "'," + Datos[8] + "," + Datos[9] + "," + Datos[10] + ",0,'" + Datos[13] + "',";
              sInstrucc += Datos[11]+ ",'" + Datos[12] + "'," + sNumPlaza + ",'DF',0,0,'','','" + Datos[14] + "'," + Datos[16] + ",'" + Datos[17] + "','";
              sInstrucc += sNomInsti + "'," + sNumRefe + ",";
              sInstrucc += "0,'',0,0,0,0,0,0,'',";
              sInstrucc += Datos[18] + "," + Datos[19] + ",1,";
						  sInstrucc += a +","+ m +","+ d +","+ a +","+ m +","+ d +",";
						  sInstrucc += a +","+ m +","+ d + ",'";
						  sInstrucc += sEstatus + "',0,0," + Datos[20] + "," + sRubro + ")";
				}			
			  
        //LOGGER.debug("DEPOSITO: " + sInstrucc);
        
				if(iRows>0)
				  iRows = stInstrucc.executeUpdate(sInstrucc);
			
				//Inserta un registro de la operación en la bitacora
				if(iRows>0)
			 	   iRows=insertaBitacora(bitacora);

				if(iRows>0) {
					 if(bFirmasM) {
							if(insertaFirma(strFirma)) {
								LOGGER.debug("Se registro Deposito con Folio:"+Datos[1]);	
								conBD.commit();
								bInstruccion=true;
							} else{
								LOGGER.debug("No se registro Deposito con Folio:"+Datos[1]);	
								conBD.rollback();
								conBD.commit();
								bInstruccion=false;
							}	
					} else {
				     LOGGER.debug("Se registro Deposito con Folio:"+Datos[1]);	
				     conBD.commit();
				   	 bInstruccion=true;
				  }  		
				} else {
					   LOGGER.debug("No se registro Deposito con Folio:"+Datos[1]);	
						 conBD.rollback();
						 conBD.commit();
						 bInstruccion=false;
				}
		}catch (Exception ex) {
						LOGGER.debug("Funcion: insertaDeposito");
						LOGGER.debug("Error: "+ex);
						LOGGER.error("Exception: ", ex);
						LOGGER.debug(sInstrucc);
						LOGGER.debug(sQuery);
						try{
						  	LOGGER.debug("No se registro Deposito con Folio:"+Datos[1]);	
							  conBD.rollback();
							  conBD.commit();
							  LOGGER.debug("rollback");
						} catch(SQLException e) {				
								LOGGER.debug("Error al realizar el roll back: :"+e);	
						}	
						  bInstruccion=false;
		} finally {
				try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
				try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
				return bInstruccion;						
		}										
 }
  
	  /*
	  Metodo:insertaTraspaso
	  Funcion:Registro de Traspasos
	  Modificada por: Jannett Jiménez Ruiz
	  fecha: Agosto,2004	  
	  */
    
    
	public boolean insertaTraspaso(
									String fecha,
									String tFolio,
									String tFideicomiso,
									String nomUsuario,
									String tContratoOrigen,
									String tContratoDestino,
									String tImporte,
									String tInstrumento,
									String sEstatus,
									String[] bitacora,
									String[] strFirma
									)
		{

		int d,m,a;
	  	
		d=Integer.parseInt(fecha.substring(0,2));//dia
		m=Integer.parseInt(fecha.substring(3,5));//mes
		a=Integer.parseInt(fecha.substring(6,10));//año
	
		iRows=0;
		boolean bInstruccion=false;
		sEstatus="ACTIVO";
		/*
		ESPERA = 'USUARIO DE CAPTURA' (1
		ACTIVO = 'USUARIO OPERATIVO' (2)
		*/
		int tipoUsuario=Integer.parseInt(sEstatus.equals("ESPERA")?"1":"2");
		boolean bFirmasM = firmasMancomunadas(tFideicomiso);	

	 	if(bFirmasM || strFirma[0].equals("1"))
			sEstatus="ESPERA";
	
		try
		    {
		
			if (conBD == null) if (!OpenBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			
			stInstrucc = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			conBD.setAutoCommit(false);	
			
			//inserta registro en la tabla INSTRUCC
			
			sQuery="INSERT INTO instrucc(ins_num_contrato,ins_num_miembro,";
			sQuery+="ins_num_folio_inst,ins_cve_tipo_instr,ins_ano_alta_reg,";
			sQuery+="ins_mes_alta_reg,ins_dia_alta_reg,ins_ano_ult_mod,";
			sQuery+="ins_mes_ult_mod,ins_dia_ult_mod,ins_cve_st_instruc) ";
			sQuery+="VALUES("+tFideicomiso+",0,"+tFolio+",'TRASPASO INTERNET',";
			sQuery+=a+","+m+","+d+","+a+","+m+","+d+",'"+sEstatus+"')";
			
			iRows=stInstrucc.executeUpdate(sQuery);

			
			//inserta registro en la tabla DETLIQUI
					
			sQuery="INSERT INTO detliqui(del_folio_opera,del_num_operacion,";
			sQuery+="del_num_sec_opera,del_num_modulo,del_num_transac,";
			sQuery+="del_num_contrato,del_sub_contrato,del_sub_programa,";
			sQuery+="del_num_pers_fid,del_tipo_pers_fid,del_folio_oper_sis,";
			sQuery+="del_imp_liquidar,del_cve_tipo_liq,del_num_moneda,";
			sQuery+="del_num_cheque,del_ano_alta_reg,del_mes_alta_reg,";
			sQuery+="del_dia_alta_reg,del_ano_ult_mod,del_mes_ult_mod,";
			sQuery+="del_dia_ult_mod,del_cve_st_detliqu,del_contrato_inter) VALUES("+tFolio+",";
			sQuery+="0,0,0,0,"+tFideicomiso+",0,0,0,'0',0,"+tImporte+",0,0,0,";
			sQuery+=a+","+m+","+d+","+a+","+m+","+d+",'"+sEstatus+"',"+tContratoOrigen+")";
			
			if(iRows>0)
				iRows=stInstrucc.executeUpdate(sQuery); 

			//inserta registro en la tabla DEPOSIT
			
			sQuery="INSERT INTO deposit(dpo_folio_rcp,dpo_folio_opera,";
			sQuery+="dpo_num_operacion,dpo_num_sec_opera,dpo_num_contrato,";
			sQuery+="dpo_cve_tipo_dep,dpo_imp_deposito,dpo_num_moneda,";
			sQuery+="dpo_cve_tipo_cta,dpo_entidad_fin,dpo_contrato_inter,";
			sQuery+="dpo_politica,dpo_ano_rcp,dpo_mes_rcp,dpo_dia_rcp,";
			sQuery+="dpo_ano_alta_reg,dpo_mes_alta_reg,dpo_dia_alta_reg,dpo_ano_ult_mod,";
			sQuery+="dpo_mes_ult_mod,dpo_dia_ult_mod,dpo_cve_st_deposi) ";
			sQuery+="VALUES(0,"+tFolio+",0,0,"+tFideicomiso+",0,"+tImporte;
			sQuery+=",0,'"+tInstrumento+"',0,"+tContratoDestino+",0,"+a+","+m+","+d+",";
			sQuery+=a+","+m+","+d+","+a+","+m+","+d+",'"+sEstatus+"')";
			
			if(iRows>0)
				iRows=stInstrucc.executeUpdate(sQuery); 
			
			
			//Inserta un registro de la operación en la bitacora
			if(iRows>0)
		       iRows=insertaBitacora(bitacora);

	
		    if(iRows>0)
		    	{
		    	if(bFirmasM)
		    		{
		    		
			    	if(insertaFirma(strFirma))
			    		{	
			      		conBD.commit();
			      		bInstruccion=true;
			      		LOGGER.debug("Transpaso con Folio:"+tFolio);
			      		}
			      	else
			      		{
			      		conBD.rollback();
			      		conBD.commit();
			      	    bInstruccion=false;
			      	    LOGGER.debug("No se Registro el Transpaso con Folio:"+tFolio);
			      		}	
			      	}
			    else{
			    	conBD.commit();
			    	LOGGER.debug("Transpaso con Folio:"+tFolio);
			      	bInstruccion=true;
			    	}  		
		      	}
		    else
		    	{
		      	conBD.rollback();
		      	conBD.commit();
		      	bInstruccion=false;
		     	}		
		
		}
		catch (Exception ex)
		{	
			try	{
			conBD.rollback();
			conBD.commit();
			LOGGER.debug("No se Registro el Transpaso con Folio:"+tFolio);
			LOGGER.debug("Error: "+ex);
				}
			catch (Exception error)
				{
				LOGGER.debug("No se realizo el rollback");
				LOGGER.debug("Error: "+ex+"\n"+sQuery);	
				
				}
			bInstruccion=false;
		}
		finally
		{
			
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
			return bInstruccion;	
		
		}
		
			
	}		
	
	
	/*	
	Metodo:insertaPagoHonorarios
	Funcion: Registar el Pago de Honorarios Pendientes
	Modificada por: Jannett Jiménez Ruiz
	Fecha:27/08/2004
	*/
	
	public boolean insertaPagoHonorarios(String SFiso,
										 String Scuenta,
										 String Scontrato,
										 String SImporte_cad,
										 String FolioOpera,
										 String[] bitacora)
		{	
			
			String query="";
			String[] sData = new String[8];
			String sFechaOper=null;
			String sAdeudo=null;
			double dImporteParcial=0.0,dImporteParcIva=0.0,SImporte=0.0;
			int i=0,inumpago=0;		
			boolean bInstruccion=false;	
					
			SImporte=Double.valueOf(SImporte_cad).doubleValue();
			
			
			//formato cuenta
			
			if(Scuenta!=null)
			{
				int j = Scuenta.length();
	   			Scuenta=Scuenta.trim();
	   			int cont=0;
	   			for(j=(Scuenta.length()-1);j>=0&&cont==0;j--)
	   			if(Scuenta.charAt(j)==' ')
	                   {
	                   	cont++;
	   				   }
	   			Scuenta=Scuenta.substring((j+2),Scuenta.length());
   			}
   			
			//se obtiene fecha de operacion
			sFechaOper=getFecha();
			
		try
			{
				
				//Importe PARCIAL
				//Se recuperan todas las provisiones pendientes	
				//y se almacenan en un arreglo
				
				if (conBD == null) if (!OpenBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
				
				stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);							
				stInstrucc = conBD.createStatement();
			    conBD.setAutoCommit(false);	

				
				query   = " SELECT DISTINCT "
				        + " DEC_NUM_CONTRATO,"
				        + " DEC_CVE_PERS_FID,"
						+ " DEC_NUM_PERS_FID,"
						+ " DEC_CVE_TIPO_HONO,"
						+ " DEC_FEC_CALC_HONO,"
						+ " DEC_NUM_SECUENCIAL,"
						+ " DEC_IMP_REM_HONOR,"
						+ " DEC_REM_IVA_HONOR "
						+ " FROM "
						+ " DETCART "
						+ " WHERE"
						+ " DEC_NUM_CONTRATO=" + SFiso
						+ " AND "
						+ " DEC_CVE_CALIF_HONO='PENDIENTE'"
						+ " ORDER BY TO_DATE(DEC_FEC_CALC_HONO,'DD/MM/YYYY') ASC";
				
				rsQuery= stQuery.executeQuery(query); 
				if(rsQuery.next())
					{
						
					sData[0] = rsQuery.getString(1);
					sData[1] = rsQuery.getString(2);
					sData[2] = rsQuery.getString(3);
					sData[3] = rsQuery.getString(4);
					sData[4] = rsQuery.getString(5);
					sData[5] = rsQuery.getString(6);
					sData[6] = rsQuery.getString(7);
					sData[7] = rsQuery.getString(8);
				
					inumpago=1;				
					dImporteParcial=0;
					dImporteParcIva=0;
					rsQuery.close();				
					if( Integer.valueOf(sData[4].substring(6,10)).intValue() > 2001 )
						{
						//ejercicio nuevo	
						//dImporteParcial=SImporte/1.15;
						dImporteParcial=SImporte;
						iRows=registraPago(SFiso,Scuenta,Scontrato,sData[1],sData[2],sData[3],sData[4],sData[5],sFechaOper,num.format(dImporteParcial),"0",FolioOpera,String.valueOf(inumpago),"PAGADO");
					
						}		
					else
						{
						//Ejercicio Anterior"
						//dImporteParcial=SImporte/1.15;
						//dImporteParcIva=SImporte-(SImporte/1.15);
						dImporteParcial=SImporte;
						dImporteParcIva= (SImporte/1.15)*.15;
						iRows=registraPago(SFiso,Scuenta,Scontrato,sData[1],sData[2],sData[3],sData[4],sData[5],sFechaOper,num.format(dImporteParcial),num.format(dImporteParcIva),FolioOpera,String.valueOf(inumpago),"PAGADO");
					
						}		
			
		}
		
		if(iRows>0)
			iRows=insertaBitacora(bitacora);

		if(iRows>0)
		   	{
		   	LOGGER.debug("El Pago de Honorarios con Folio: "+ FolioOpera+ " SATISFACTORIO");
		   	conBD.commit();
		   	bInstruccion=true;
		   	}
		 else
		   	{
		   	LOGGER.debug("El Pago de Honorarios con Folio: "+ FolioOpera+ " NO SATISFACTORIO");
		   	conBD.rollback();
		   	conBD.commit();
		   	bInstruccion=false;
		   	}
		}
		catch (Exception ex)
		{
			try	{
			conBD.rollback();
			conBD.commit();
			LOGGER.debug("No se Registro el Transpaso con Folio:"+FolioOpera);
			LOGGER.debug("Error: "+ex);
				}
			catch (Exception error)
				{
				LOGGER.debug("No se realizo el rollback");
				LOGGER.debug("Error: "+error+"\n"+sQuery);	
				
				}
			bInstruccion=false;
		    
		}
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonorarios");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonorarios");LOGGER.error("Exception: ", ex); }

			
			return bInstruccion;
		}
		
	}
	
	
	/*
	Metodo:registraPago
	Funcion: Insertar los datos de honorarios provenientes insertaPagoHonorarios
	*/
	
	private int registraPago     (String sFiso,
								  String Scuenta,
								  String Scontrato,
								  String scve_pers,
								  String inum_pers,
								  String sTipo_hono,
								  String sFeccalc,
								  String sNumSec,
								  String sFechaOper,
								  String sImporte,
								  String sIva,
								  String sFoliooper,
								  String sNumpagos,
								  String status)
	    {
	  	int d,m,a;
	  	String 	dImporteParcial= "0.0";//JJR 13/09/2006
		d=Integer.parseInt(sFechaOper.substring(0,2));//dia
		m=Integer.parseInt(sFechaOper.substring(3,5));//mes
		a=Integer.parseInt(sFechaOper.substring(6,10));//año

		String query="";
		try
		{	
			int sec_pago=0;
			sec_pago=getSecuencialPago(sFiso,scve_pers,inum_pers,sTipo_hono,sFeccalc,sNumSec,sFechaOper);
			LOGGER.debug("registra  Pago: "+sec_pago);

	
			Locale currentLocale = new Locale("sp","US");
								
			if(Integer.valueOf(sNumpagos).intValue()==1)
			  { 
				//se procede a insertar la instruccion correspondiente
				query   = "INSERT INTO INSTRUCC ("
						+ "INS_NUM_CONTRATO,"
						+ "INS_NUM_FOLIO_INST,"
						+ "INS_SUB_CONTRATO,"
						+  "INS_TXT_COMENTARIO,"
						+  "INS_CVE_TIPO_INSTR,"
						+  "INS_NUM_MIEMBRO,"
						+  "INS_NOM_MIEMBRO,"    
						+  "INS_ANO_ALTA_REG,"      
						+  "INS_MES_ALTA_REG,"    
						+  "INS_DIA_ALTA_REG,"    
						+  "INS_ANO_ULT_MOD,"  
						+  "INS_MES_ULT_MOD,"     
						+  "INS_DIA_ULT_MOD,"   
						+  "INS_CVE_ST_INSTRUC)"
						+  " VALUES ("
						+  sFiso + ","
						+  sFoliooper + ","
						+  "0,'',"
						+  "'HONORARIOS INTERNET',"
						+  "0,'',"
						+  a + ","
						+  m + ","
						+  d + ","
						+  a + ","
						+  m + ","
					    +  d + ","
						+ "'ACTIVO')";
						
				iRows = stInstrucc.executeUpdate(query);
								
			}
			
			//JJR 13/09/2006
			dImporteParcial=num.format(Double.valueOf(sImporte).doubleValue() / 1.15);	    
			
			
			//se procede a actualizar cartera
			query =   "UPDATE CARTERA SET"
					+ " CAR_IMP_HONOR=CAR_IMP_HONOR-"+sImporte
					//jjr 02/10/2006 + ",CAR_IMP_IVA_HONOR=CAR_IMP_IVA_HONOR-"+sIva
					+ ",CAR_NUM_REG_DET=CAR_NUM_REG_DET-1"
					+ ",CAR_IMP_REG_DET=CAR_IMP_REG_DET-"+num.format(Double.valueOf(sImporte).doubleValue()+Double.valueOf(sIva).doubleValue())
					+ ",CAR_NUM_PAGOS_FEC=CAR_NUM_PAGOS_FEC+1"
					+ ",CAR_IMP_PAGOS_FEC=CAR_IMP_PAGOS_FEC+"+num.format(Double.valueOf(sImporte).doubleValue()+Double.valueOf(sIva).doubleValue())
					+ " WHERE"
					+ " CAR_NUM_CONTRATO = "+sFiso
					+ " AND CAR_CVE_PERS_FID  = '"+scve_pers + "'"
					+ " AND CAR_NUM_PERS_FID = " + inum_pers
					+ " AND CAR_CVE_TIPO_HONO = '" + sTipo_hono + "'";

			if(iRows>0)
				iRows = stInstrucc.executeUpdate(query);

			
			//se procede a actualizar el detalle de cartera
			query="UPDATE DETCART SET";
			
			if(status.equals("PAGADO"))
				{
				query += " DEC_IMP_REM_HONOR=0"
					  + " ,DEC_REM_IVA_HONOR=0";
				}
			else
				{
				query += " DEC_IMP_REM_HONOR=DEC_IMP_REM_HONOR-"+sImporte;
				
				//JJR 02/10/2006 + " ,DEC_REM_IVA_HONOR=DEC_REM_IVA_HONOR-"+sIva;
				}
					
			query += " ,DEC_IMP_PAGOS_EFE=DEC_IMP_PAGOS_EFE+"+num.format(Double.valueOf(sImporte).doubleValue()) //JJR 02/10/2006 +Double.valueOf(sIva).doubleValue())
				  + " ,DEC_NUM_PAGOS_EFE=DEC_NUM_PAGOS_EFE+1";				
			//verificar este status
			if(status.equals("PAGADO"))
				{
				query+=  ",DEC_CVE_CALIF_HONO='PAGADO'";
				query+=  ",DEC_CVE_PER_PAGADO= -1";
				}
				
								
			query   += " WHERE"
					+ " DEC_NUM_CONTRATO= "+sFiso
					+" AND DEC_CVE_PERS_FID ='"+scve_pers + "'"
					+ " AND DEC_NUM_PERS_FID ="+ inum_pers
					+ " AND DEC_CVE_TIPO_HONO ='" + sTipo_hono + "'"
					+ " AND DEC_FEC_CALC_HONO ='"+sFeccalc+"'"
					+ " AND DEC_NUM_SECUENCIAL="+sNumSec;

			if(iRows>0)
				iRows = stInstrucc.executeUpdate(query);

			//se procede a insertar el pago correspondiente
			query   = "INSERT INTO PAGOSHON ("
					+ "PAG_NUM_CONTRATO,"
					+ "PAG_CVE_PERS_FID,"
					+ "PAG_NUM_PERS_FID,"
					+ "PAG_CVE_TIPO_HONO,"
					+ "PAG_FEC_CALC_HONO,"
					+ "PAG_NUM_SECUENCIAL,"
					+ "PAG_FEC_PAGO,"
					+ "PAG_NUM_PAGO,"
					+ "PAG_NUM_SERVICIO,"
					+ "PAG_NUM_TRAMITE,"
					+ "PAG_IMP_PAGO,"
					+ "PAG_IMP_IVA_HONOR,"
					+ "PAG_IMP_EXTEMP,"
					+ "PAG_NUM_MONEDA,"
					+ "PAG_DOCTO_REF,"
					+ "PAG_FEC_DOCTO_REF,"
					+ "PAG_ANO_ALTA_REG,"
					+ "PAG_MES_ALTA_REG,"
					+ "PAG_DIA_ALTA_REG,"
					+ "PAG_ANO_ULT_MOD,"
					+ "PAG_MES_ULT_MOD,"
					+ "PAG_DIA_ULT_MOD,"
					+ "PAG_CVE_ST_PAGOSHO,"
					+ "PAG_FOLIO_OPERA,"
					+ "PAG_IMP_TOTAL)"
					+ " VALUES ("
					+ sFiso + ",'"
					+ scve_pers + "',"
					+ inum_pers + ",'"
					+ sTipo_hono + "','"
					+ sFeccalc + "',"
					+ sNumSec + ",'"
					+ sFechaOper + "',"
					+ String.valueOf(sec_pago) + ","
					+ "0,";
					
			//se especifica el contrato de inversión
			
			if(Scontrato==null)
				query+="0,";
			else
				query+= Scontrato + ",";
			//JJR 02/10/2006
			//SE COMENTA PARA REPLICAR FUCNIONALIDAD FOSEG							
			//query+=  sImporte + ",";
			//query+=  sIva + ",";
			
		    query+=  dImporteParcial + ",";
			query+=  0 + ",";
			//moneda nacional
			
			query+=  "0,1,";
			
			if (Scuenta==null)
			//se especifica la cuenta nafin donde se ubicarán los recursos
				query+=  "null,'";
			else
				query+=  "'"+Scuenta + "','";
				
			query   += sFechaOper + "',"
				    + sFechaOper.substring(6,10) + ","
					+ sFechaOper.substring(3,5) + ","
					+ sFechaOper.substring(0,2) + ","
					+ sFechaOper.substring(6,10) + ","
					+ sFechaOper.substring(3,5) + ","
					+ sFechaOper.substring(0,2) + ","
					+ "'ACTIVO',"
					+ sFoliooper+ "," 
					+ sImporte + ")";
		
			if(iRows>0)
				iRows = stInstrucc.executeUpdate(query);
		
		}						
		catch (Exception ex)
			{
			LOGGER.debug("Error en el Metodo:registraPago");
			LOGGER.debug(query);
		    iRows=0;
			}
		finally
			{
			return iRows;			
			}
		
	}
	
	/*
	Metodo:getSecuencialPago
	Funcion:Regresa el numeo de secuencial de pago de honorarios a realizar
	
	*/
	private int getSecuencialPago(	   String sFiso,
								   String scve_pers,
								   String inum_pers,
								   String sTipo_hono,
								   String sFeccalc,
								   String sNumSec,
								   String sFechaOper)
		{
		String query="";
		try
		{
			query   ="SELECT MAX(PAG_NUM_PAGO)+1 FROM PAGOSHON WHERE"
					+ " PAG_NUM_CONTRATO ="+sFiso
					+ " AND PAG_CVE_PERS_FID='"+scve_pers+"'"
					+ " AND PAG_NUM_PERS_FID="+inum_pers      
					+ " AND PAG_CVE_TIPO_HONO='"+sTipo_hono+"'"    
					+ " AND PAG_FEC_CALC_HONO='"+sFeccalc+"'"  
					+ " AND PAG_NUM_SECUENCIAL="+sNumSec;
					//+ " AND PAG_FEC_PAGO='"+sFechaOper+"'"; 
								
			rsQuery=stQuery.executeQuery(query); 
		   
			if(	rsQuery.next())
				return rsQuery.getInt(1);
			else {
				 
				 return 0;	
				 }
		}
		catch (Exception ex)
		{
			
			LOGGER.debug("Error en el Metodo:secuencialPago\n"+ex+"\n"+query);
			return 0;
		}

	}

	/*
	Metodo: insertaInstruccFoseg
	Funcion: Registro de movimientos presupuestales FOSEG
	Parametros:
				strPresupuesto (cadenas del presupuestal)
				bitacora	   (arreglo con el detalle de la bitacora)
				strFirma       (arreglo con el detalle de las firmas mancomunadas)
				tipoInstruccion (num clave para la instruccion)
				
	Autor: Jannett Jiménez Ruiz
	e-mail: jannett_jr@hotmail.com
	
	*/

	public boolean insertaInstruccFoseg(String[] strPresupuesto, 
								        String [] bitacora,
								        String [] strFirma,
								        int tipoInstruccion)
		{
		boolean bInstruccion=false;
	  	iRows=0;
		String query="";
	    boolean bFirmasM = firmasMancomunadas(strFirma[2]);	
		try
		{
			if (conBD == null) if (!OpenBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			
			stInstrucc = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			conBD.setAutoCommit(false);	


			switch( tipoInstruccion )
					{
					case 5:
					case 6://Registro de Compromisos y Cancelación de Compromisos
							if(!strPresupuesto[0].trim().equals(""))//Federal
								iRows=contabilizaFoseg(strPresupuesto[0],bFirmasM);
							
							if(!strPresupuesto[1].trim().equals("") && 
								(
								(!strPresupuesto[0].trim().equals("") && iRows>0) 
								|| 
								(strPresupuesto[0].trim().equals("") && iRows==0)
								)
							   )//Estatal
								iRows=contabilizaFoseg(strPresupuesto[1],bFirmasM);
							
							if(!strPresupuesto[2].trim().equals("") && 
							   (
							   (!strPresupuesto[0].trim().equals("") && !strPresupuesto[1].trim().equals("") && iRows>0) 
							   ||
							   (!strPresupuesto[0].trim().equals("") && strPresupuesto[1].trim().equals("") && iRows>0) 
							   ||
							   (strPresupuesto[0].trim().equals("") && !strPresupuesto[1].trim().equals("") && iRows>0) 
							   ||
							   (strPresupuesto[0].trim().equals("") && strPresupuesto[1].trim().equals("") && iRows==0) 
							   )
							   )//Rendimientos
								iRows=contabilizaFoseg(strPresupuesto[2],bFirmasM);
							
							
						  break;
						  
						
					case 7://Reprogramación Presupuestal
							iRows=contabilizaFoseg(strPresupuesto[0],bFirmasM);//ORIGEN
							if(iRows>0)
							iRows=contabilizaFoseg(strPresupuesto[1],bFirmasM);//DESTINO						
						  break;
					case 8:	//Asignación de Rendimientos
							
							iRows=contabilizaFoseg(strPresupuesto[0],bFirmasM);//PRESUESTAL AL QUE SE LE ASIGNAN LOS RENDIMIENTOS
							if(iRows>0 && bContabilizado)
							  {
							   //LOGGER.debug("IMPORTE R:"+ strPresupuesto[4]);
				  			   query = " UPDATE "
				   					 + " rendimi_foseg "
				   					 + " SET REN_IMP_X_ASIGNAR = REN_IMP_X_ASIGNAR-" + strPresupuesto[4]
		                    		 + " WHERE  "
		                    		 + " REN_NUM_FID =" + strPresupuesto[1]
									 + " AND "
									 + " REN_NUM_CONTRATO="+strPresupuesto[2]
									 + "  AND "
									 + " REN_EJERCICIO="+strPresupuesto[3];
							   
							   iRows = stInstrucc.executeUpdate(query);	
							  }
							  
						 break;
						
					}

		   		
			if(iRows>0)
				iRows=insertaBitacora(bitacora);
			
		   			
			if(iRows>0)
		    	{
		    	if(bFirmasM)
		    		{
		    		
			    	if(insertaFirma(strFirma))
			    		{
			    	    conBD.commit();
			      		bInstruccion=true;
			      		LOGGER.debug("Se registo instruccion FOSEG tipo "+tipoInstruccion+" :"+ bitacora[1]);
			      		}
			      	else
			      		{
			      		conBD.rollback();
			      		conBD.commit();
			      	    bInstruccion=false;
			      	    LOGGER.debug("No se registo instruccion FOSEG tipo"+tipoInstruccion+ " con Folio:"+bitacora[1]);
			      		}	
			      	}
			    else{
			    	conBD.commit();
			    	LOGGER.debug("Se registo instruccion FOSEG tipo "+tipoInstruccion+" :"+ bitacora[1]);
			      	bInstruccion=true;
			    	}  		
		      	}
		    else
		    	{
		        LOGGER.debug("No se registo instruccion FOSEG tipo"+tipoInstruccion+" :"+ bitacora[1]);
		      	conBD.rollback();
		      	conBD.commit();
		      	bInstruccion=false;
		     	}		
								
            
		}
		catch(Exception ex)
		{
			LOGGER.debug("insertaInstruccFoseg: "+ex);
			LOGGER.debug("Query:\n "+query);
			iRows=0;
			bInstruccion=false;
						try	{
			conBD.rollback();
			conBD.commit();
			LOGGER.debug("No se Registro el insertaInstruccFoseg");
			LOGGER.debug("Error: "+ex);
				}
			catch (Exception error)
				{
				LOGGER.debug("No se realizo el rollback");
				LOGGER.debug("Error: "+ex);	
				
				}

		}
		finally
		{
		bContabilizado=false;			
		try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
		try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
		return bInstruccion;
	
		}		
	}	
	
	/*
	Metodo: insertaBitacora
	Funcion:Registro en la bitacora de las instrucciones que se realizan por internet
	Creada por: Jannett Jiménez Ruiz
	fecha: Agosto, 2002
	fecha Modificación: Agosto, 2004
	bitacora[0]=fecha
	bitacora[1]=folio
	bitacora[2]=numero de usuario
	bitacora[3]=detalle bitacora
	
	*/
    
	private int insertaBitacora(String[] bitacora)
	    {
	    String fecha=bitacora[0];
	    String folio=bitacora[1];
	    String numUsuario=bitacora[2];
	    String detalle=bitacora[3];
	    	
		
		String queryBitacora="";
		int dia,mes,anio;
		dia = Integer.parseInt(fecha.substring(0,2));//dia
		mes = Integer.parseInt(fecha.substring(3,5));//mes
 	 	anio = Integer.parseInt(fecha.substring(6,10));//año

		try
		{
			
			queryBitacora  = "INSERT INTO BITACORA ("
							+ " BIT_ANO_TRANSAC,"
							+ " BIT_MES_TRANSAC,"
							+ " BIT_DIA_TRANSAC,"
							+ " BIT_HORA_TRANSAC,"
							+ " BIT_MIN_TRANSAC,"
							+ " BIT_SEG_TRANSAC,"
							+ " BIT_ID_TERMINAL,"
							+ " BIT_NUM_USUARIO,"
							+ " BIT_NOM_PGM,"
							+ " BIT_CVE_FUNCION,"
							+ " BIT_DET_BITACORA,"
							+ " BIT_ANO_ALTA_REG,"
							+ " BIT_MES_ALTA_REG,"
							+ " BIT_DIA_ALTA_REG,"
							+ " BIT_ANO_ULT_MOD,"
							+ " BIT_MES_ULT_MOD,"
							+ " BIT_DIA_ULT_MOD,"
							+ " BIT_CVE_ST_BITACOR)"
							+ "  VALUES ("
							+ anio + ","
							+ mes  + ","
							+ dia  + ","
							+ "TO_NUMBER(TO_CHAR(sysdate,'HH24')),"
							+ "TO_NUMBER(TO_CHAR(sysdate,'MI')),"
							+ folio + ","
							+ "'INTERNET',"
							+ numUsuario + ",'INTERNET',"
							+ "'INSTRUCCION INTERNET','"
							+ detalle + "',"
							+ anio + ","
							+ mes  + ","
							+ dia  + ","
							+ anio + ","
							+ mes  + ","
							+ dia  + ","
							+ "'ACTIVO')";
			
			iRows = stInstrucc.executeUpdate(queryBitacora);					
			
		}
		catch (Exception ex)
		{
			iRows=0;
			LOGGER.debug("Metodo: insertaBitacora");
			LOGGER.debug("Error: \n"+ex);
		}
		finally
		{
			
			 return iRows;
		}
	}
  
  /**************************************************************************************/
	/**********************************FOSEG'S*********************************************/
	
	/*
	Metodo: identificaCta
	Función: Separa parametros para él metodo que contabiliza los movimientos presupuestales
	Creada por: Erick Omana Mingüer
	*/
	
	private void identificaCta(String cuentas)
	     {
		try
		{
			int i,indic_ctas=0;
			String tempo = " ,";

			//se limpia el arreglo de valores
			for(i=0;i<=17;i++)
				ctas[i]="";
				
			/*los parametros de entrada vendrán constituidos en una sola cadena
			donde las cuentas estan separadas por comas para su identificación
			la lectura de cuentas será de izquierda a derecha representando esto
			de ctam hasta aux3*/
			
			//i=cuentas.length();
			for (i=0;i<cuentas.length();i++)
			{
				if(tempo.compareTo(" "+cuentas.charAt(i))!=0)
					ctas[indic_ctas]+=cuentas.charAt(i);
				else
					indic_ctas+=1;
			}
		}
		catch (Exception ex)
		{
			LOGGER.debug("identificaCta: " + ex);
		}
		finally
		{
			//LOGGER.debug("Cerrando finally de la base de identificaCta");
		}  
	}
	
    
  	/*
	Metodo: subeNivelCtas
	Función: Sube el nivel de ctas para la contabilización presupuestal recursiva
	Creada por: Erick Omana Mingüer
	*/

    private String subeNivelCtas(int ctam,int scta,int sscta,int ssscta,int sssscta,int ssssscta)
			{
				try
				{
					if (ssssscta != 0)
						ssssscta = 0;
					else if (sssscta != 0)
						sssscta = 0;
					else if (ssscta != 0)
						ssscta = 0;
					else if (sscta != 0)
						sscta = 0;
					else if (scta != 0)
						scta = 0;
					else if (ctam != 0)
						ctam = 0;
		
					return String.valueOf(ctam) + "," + String.valueOf(scta) + "," +
						String.valueOf(sscta) + "," + String.valueOf(ssscta) + "," +
						String.valueOf(sssscta) + "," + String.valueOf(ssssscta)+",";
				}
				catch (Exception ex)
				{
		      		return "Ha ocurrido el siguiente error"+ ex;
				}		
			}
  
  
  
   	/*
	Metodo: contabilizaFoseg
	Función: contabilización presupuestal
	Creada por: Erick Omana Mingüer
	fecha: Agosto,2003
	Modificada por: Jannett Jiménez Ruiz
	fecha: Agosto, 2004
	*/

    private  int contabilizaFoseg (String cuentas,
    							  							boolean bFirmasMancomunadas)
  		{  			
				int d,m,a;
				
				identificaCta(cuentas);
				
				d=Integer.parseInt(ctas[10].substring(0,2));//dia
				m=Integer.parseInt(ctas[10].substring(3,5));//mes
				a=Integer.parseInt(ctas[10].substring(6,10));//año

	  	 try
			{       

			sInstrucc   = "insert into movimifoseg"
					+ " (MFO_NUM_CTAM,"
					+ " MFO_NUM_SCTA,"
					+ " MFO_NUM_SSCTA,"
					+ " MFO_NUM_SSSCTA,"
					+ " MFO_NUM_SSSSCTA,"
					+ " MFO_NUM_SSSSSCTA,"
					+ " MFO_NUM_AUX1,"
					+ " MFO_NUM_AUX2,"
					+ " MFO_NUM_AUX3,"
					+ " MFO_FOLIO,"
					+ " MFO_fecha,"
					+ " MFO_IMPORTE,"
					+ " MFO_TIPO_OPER,"
					+ " MFO_COMPROMETIDO,"
					+ " MFO_FOLIO_DETLIQUI,"
					+ " MFO_ANO_ALTA_REG,"
					+ " MFO_MES_ALTA_REG,"
					+ " MFO_DIA_ALTA_REG,"
					+ " MFO_ANO_ULT_MOD,"
					+ " MFO_MES_ULT_MOD,"
					+ " MFO_DIA_ULT_MOD,"
					+ " MFO_CVE_ST_MOVIMFO,"
					+ " MFO_ACUERDO,MFO_CONCEPTO)"
					+ " values ("
					+ ctas[0]+ "," 
					+ ctas[1] + "," 
					+ ctas[2] + ","
					+ ctas[3] + "," 
					+ ctas[4] + "," 
					+ ctas[5] + ","
					+ ctas[6] + "," 
					+ ctas[7] + "," 
					+ ctas[8] + ","
					+ ctas[9] + ","
					+ "to_date('" + ctas[10] + " '||TO_CHAR(sysdate,'hh24:mi:ss'),'dd/mm/yyyy hh24:mi:ss')," 
					+ ctas[11] + ",'"
					+ ctas[12] + "','" 
					+ ctas[13] + "'," 
					+ ctas[14] + ","
					+ a + "," 
					+ m + "," 
					+ d + ","
					+ a + "," 
					+ m + "," 
					+ d + ",";
		

			if(ctas[17].equals("SI") || bFirmasMancomunadas)
			  {
			  sInstrucc += "'ESPERA',";
			  if(bFirmasMancomunadas)//si el fiso requiere firmas mancomunadas
			    ctas[17]="SI";
			  }
		    else if(ctas[17].equals("SW")) //Es una instruccion SWIFT, debe quedar pendiente
			 		sInstrucc += "'PENDIENTE',";
		    else 
		      		sInstrucc += "'ACTIVO',";

			sInstrucc += (ctas[15].equals("null")?"null": "'" + ctas[15] + "'" ) + ",";
			sInstrucc += (ctas[16].equals("null")?"null": "'" + ctas[16] + "'" ) + ")";
        
        	
			iRows = stInstrucc.executeUpdate(sInstrucc);		   
		   
		   if(iRows>0 && ctas[17].equals("NO")) // Si el movimiento no esta en espera de autorizacion, actualizar saldos
			   {					
		        //se realizará una funcion que actualice el saldo empleando un mecanismo recursivo
		 		iRows = actualizaSaldo(cuentas);
		 		if(iRows>0)
		 			bContabilizado=true;
				}
		}
		catch (Exception ex)
		{
			LOGGER.debug("contabilizaFoseg:" + ex);
			LOGGER.debug(sInstrucc);
			iRows=0;
		}

		finally
		{
			return iRows;
		}  
	}	

   	/*
	Metodo: actualizaSaldo
	Función: Actualiza el saldo del presupuesto de una cuenta
	Creada por: Erick Omana Mingüer
	fecha: Agosto,2003
	Modificada por: Jannett Jiménez Ruiz
	fecha: Agosto, 2004
	*/

	private int actualizaSaldo(String cuentas)
			{
			String querySaldos="";
			try
			{	
			String sqlprinc;
			identificaCta(cuentas);    
			//se valida si se ha llegado al nivel mas alto de la estructura para
			//detener la actualizacion del saldo y señalar que la actualización
			//ha sido exitosa
			if(Integer. valueOf(ctas[0]).intValue()==0)
        		return 1;
			//se verifica que exista la cuenta en cuestión, de lo contrario
			//proceder a crearla
			stSaldosAnt = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        
        	querySaldos = "select * from saldos"
	       			    + " where SAL_NUM_AUX2=" + ctas[7]
			        	+ " and SAL_NUM_AUX3=" + ctas[8]
			        	+ " and SAL_NUM_AUX1=" + ctas[6]
			        	+ " and SAL_NUM_CTAM=" + ctas[0]
			        	+ " and SAL_NUM_SCTA=" + ctas[1]
			        	+ " and SAL_NUM_SSCTA=" + ctas[2]
			        	+ " and SAL_NUM_SSSCTA=" + ctas[3]
			        	+ " and SAL_NUM_SSSSCTA=" + ctas[4]
			        	+ " and SAL_NUM_SSSSSCTA=" + ctas[5] ;
	        
	        rsSaldos=stSaldosAnt.executeQuery(querySaldos); 
			
        	if (!rsSaldos.next())//si no existe el saldo del presupuesto, lo inserta
    	        {
    	        	
             	sQuery  = "insert into saldos ("
		            	+"SAL_NUM_CTAM,SAL_NUM_SCTA,SAL_NUM_SSCTA,SAL_NUM_SSSCTA,"
		            	+"SAL_NUM_SSSSCTA,SAL_NUM_SSSSSCTA,SAL_NUM_AUX1,SAL_NUM_AUX2,"
		            	+"SAL_NUM_AUX3,SAL_SALDO_INI_PER,SAL_CARGOS_PER,SAL_ABONOS_PER,"
		            	+"SAL_IMP_INI_EJE,SAL_IMP_CAR_EJER,SAL_IMP_ABO_EJER,SAL_IMP_SALDO_ACT,"
		            	+"SAL_FEC_ULT_MOVTO,SAL_MOVTOS_CAR_PER,SAL_MOVTOS_ABO_PER,SAL_MOVTOS_CAR_EJE,"
		            	+"SAL_MOVTOS_ABO_EJE,SAL_ANO_ALTA_REG,SAL_MES_ALTA_REG,SAL_DIA_ALTA_REG,"
		            	+"SAL_ANO_ULT_MOD,SAL_MES_ULT_MOD,SAL_DIA_ULT_MOD,SAL_CVE_ST_SALDO) values ("
		            	+ctas[0] + "," + ctas[1] + "," + ctas[2] + ","
		            	+ctas[3] + "," + ctas[4] + "," + ctas[5] + ","
		            	+ctas[6] + "," + ctas[7] + "," + ctas[8] + ","
		            	+"0,0,0,"
		            	+ ( ctas[12].equals("I") ? ctas[11] + "," : "0,")
		            	+ ( ctas[12].equals("R") ? ctas[11] + ",":"0,")
		            	+ ( ctas[12].equals("D") || ctas[12].equals("A") ? ctas[11] + ",": "0" + ",")
		            	+ ( ctas[12].equals("R") ? "-" : "" ) + ctas[11] + ",'" + ctas[10] + "',0,0,0,0,"
		            	+ ctas[10].substring(6,10) + "," + ctas[10].substring(3,5) + "," + ctas[10].substring(0,2) + ","
		            	+ ctas[10].substring(6,10) + "," + ctas[10].substring(3,5) + "," + ctas[10].substring(0,2) + ","
		            	+"'ACTIVO')";            

				iRows = stInstrucc.executeUpdate(sQuery);    
    			rsSaldos.close();	
    			}
        	else // si existe el presupuesto
        		{
        		//LOGGER.debug("con saldos");
            	//se actualizan los rubros por separado, para que posteriormente se efectue
            	//el calculo del saldo actual basandose en dichos datos
            
	            sqlprinc = "update saldos set ";
    	        sQuery = ctas[12].equals("I") ? "SAL_IMP_INI_EJE=SAL_IMP_INI_EJE+" + ctas[11] : "";
        	    
				if(sQuery.length()!=0)
				  sQuery += ",";

				sQuery += ctas[12].equals("C")?"SAL_CARGOS_PER=SAL_CARGOS_PER+"+ctas[11]:ctas[12].equals("R") && ctas[13].equals("S")?"SAL_CARGOS_PER=SAL_CARGOS_PER-"+ctas[11] : "" ;
				
				// Honorarios
				if( sQuery.length()!=0 && ctas[12].equals("H") ) sQuery += ",";

				sQuery += ctas[12].equals("H")?"SAL_IMP_CAR_EJER=SAL_IMP_CAR_EJER+"+ctas[11] : "";
				
				

				if( sQuery.length()!=0 && ctas[12].equals("R") ) sQuery += ",";

				sQuery += ctas[12].equals("R")?"SAL_IMP_CAR_EJER=SAL_IMP_CAR_EJER+"+ctas[11] : "";

				if( sQuery.length()!=0 && ctas[12].equals("D"))
					sQuery += ",";

				sQuery += (ctas[12].equals("D") || ctas[12].equals("A"))?"SAL_IMP_ABO_EJER=SAL_IMP_ABO_EJER+"+ctas[11] : "";

				if( sQuery.length()!=0 && ctas[12].equals("S"))	sQuery += ",";
					
				sQuery += ctas[12].equals("S") ?"SAL_CARGOS_PER=SAL_CARGOS_PER-"+ctas[11] : "";
					//",SAL_IMP_ABO_EJER=SAL_IMP_ABO_EJER+"+ctas[11] : "";
				
				if( sQuery.length()!=0 && ctas[12].equals("P"))sQuery += ",";

				sQuery += ctas[12].equals("P") ? "SAL_IMP_ABO_EJER=SAL_IMP_ABO_EJER-"+ctas[11] : "";
					
				if(sQuery.length()!=0) sQuery += ",";
               
				sQuery  += "SAL_FEC_ULT_MOVTO='" + ctas[10] +"'"
					    + " where SAL_NUM_AUX2=" + ctas[7]
						+ " and SAL_NUM_AUX3=" + ctas[8]
						+ " and SAL_NUM_AUX1=" + ctas[6]
						+ " and SAL_NUM_CTAM=" + ctas[0]
						+ " and SAL_NUM_SCTA=" + ctas[1]
						+ " and SAL_NUM_SSCTA=" + ctas[2]
						+ " and SAL_NUM_SSSCTA=" + ctas[3]
						+ " and SAL_NUM_SSSSCTA=" + ctas[4]
						+ " and SAL_NUM_SSSSSCTA=" + ctas[5];    

				iRows = stInstrucc.executeUpdate(sqlprinc+sQuery);                
				//LOGGER.debug("irows saldo 1:"+iRows);
				//se actualiza saldo actual
				sQuery = "update saldos set"
						+ " SAL_IMP_SALDO_ACT=SAL_IMP_INI_EJE-SAL_CARGOS_PER-SAL_IMP_CAR_EJER+SAL_IMP_ABO_EJER"
						+" where SAL_NUM_AUX2=" + ctas[7]
						+ " and SAL_NUM_AUX3=" + ctas[8]
						+ " and SAL_NUM_AUX1=" + ctas[6]
						+ " and SAL_NUM_CTAM=" + ctas[0]
						+ " and SAL_NUM_SCTA=" + ctas[1]
						+ " and SAL_NUM_SSCTA=" + ctas[2]
						+ " and SAL_NUM_SSSCTA=" + ctas[3]
						+ " and SAL_NUM_SSSSCTA=" + ctas[4]
						+ " and SAL_NUM_SSSSSCTA=" + ctas[5];            
				if(iRows>0)
				  iRows = stInstrucc.executeUpdate(sQuery);                
		 	   }  

			//se procede a subir en el nivel de cuentas para posteriormente afectarlo
			//a nivel de saldos 
		if(iRows>0)	       
		   iRows = actualizaSaldo(
						subeNivelCtas(
										Integer.valueOf(ctas[0]).intValue(),
										Integer.valueOf(ctas[1]).intValue(),
										Integer.valueOf(ctas[2]).intValue(),
										Integer.valueOf(ctas[3]).intValue(),
										Integer.valueOf(ctas[4]).intValue(),
										Integer.valueOf(ctas[5]).intValue()
										)+
										ctas[6]+","+
										ctas[7]+","+
										ctas[8]+","+
										ctas[9]+","+
										ctas[10]+","+
										ctas[11]+","+
										ctas[12]+","+
										ctas[13]
						            );
		}
		catch (Exception ex)
		{	
			LOGGER.debug("actualizaSaldo: " + ex);
			iRows=0;
		}
		finally
		{
			//LOGGER.debug("Cerrando finally de la base de actualizaSaldo");
			try { if(stSaldosAnt != null ) stSaldosAnt.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			
			return iRows;
		}  
	}


	 /*
	 Metodo: validaCtas
	 Funcion: Validar que los conceptos de las cuentas existan	 
	 */
	 
	 private boolean validaCtas(String cuentas)
  	    {
		try
		{
			identificaCta(cuentas);

        	// conectandose a la base
        	if (conBD == null) if (!OpenBD()) return false;
        	if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
		
	        stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

	        sQuery  = "select * from cuentaco"
		    	    + " where "
		        	+ " and CUE_NUM_CTAM=" + ctas[0]
		        	+ " and CUE_NUM_SCTA=" + ctas[1]
		        	+ " and CUE_NUM_SSCTA=" + ctas[2]
		        	+ " and CUE_NUM_SSSCTA=" + ctas[3]
		        	+ " and CUE_NUM_SSSSCTA=" + ctas[4]
		        	+ " and CUE_NUM_SSSSSCTA=" + ctas[5];
			
	        rsQuery=stQuery.executeQuery(sQuery); 

	        if (rsQuery.next())
    	    	return true;
        	else
          		return false;
    	}
		catch (Exception ex)
    	{
			LOGGER.debug("validaCtas: " + ex);
      		return false;
		}
		finally
		{
			//LOGGER.debug("Cerrando finally de la base de validaCtas");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
      		return true;
		}  
  	}
  	
  	
 	/************************************************************************************************************/
	
	
	/*
	Metodo: insertaFirma
	Funcion: LLena la tabla de Firmas Mancomunadas
	Autor:Jannett Jiménez Ruiz
	tipoUsuario=1 // USUARIO DE CAPTURA
	tipoUsuario=2 // USUARIO OPERATIVO
	
	*/
	
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
						          + "TO_DATE('"+fecha+"','DD/MM/YYYY')"
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
						          + "TO_DATE('"+fecha.trim()+"','DD/MM/YYYY'),"
						          + "TO_DATE('"+fecha.trim()+"','DD/MM/YYYY')"
						          + ")";
						break;				          
			}
					
		
	    if(stInstrucc.executeUpdate(sInstrucc)>0)
				binsertaFirma=true;
			
		}
		catch (SQLException ex)
		{
			LOGGER.debug("Error al insertaFirma");
			LOGGER.error("Exception: ", ex);
			LOGGER.debug(sInstrucc);
		}
			catch (Exception ex)
		{
			LOGGER.debug("Error al insertaFirma");
			LOGGER.error("Exception: ", ex);
			LOGGER.debug(sInstrucc);
		}
		finally
		{
			return binsertaFirma;
		}
	}







	
	/*
	Metodo: autorizacion
	Funcion: Se registra la autorización y cancelacion de las instrucciones pendientes(DEPOSITO,RETIRO Y TRASPASOS).
	Autor: Jannett Jimènez Ruiz
	Parametros:(strDatos,StrBitacora)
				strDatos[0]=tipo de operacion
				strDatos[1]=folio
				strDatos[2]=fiso
				strDatos[3]=fecha
				strDatos[4]=numUsuario
				strDatos[5]=status
				strDatos[6]=numero de firma 1 o 2 (solo para firmas mancomunadas),  0 en otros fisos
	
	
	*/
	
	
	public boolean autorizacion( String[] strDatos, 
								 String[] strBitacora)
	{
		iRows=0;
		String query="";
		boolean bInstruccion=false;
		int tipoOperacion=Integer.parseInt(strDatos[0]);
		int dia = Integer.parseInt(strDatos[3].substring(0,2));//dia
		int mes = Integer.parseInt(strDatos[3].substring(3,5));//mes
 	 	int anio = Integer.parseInt(strDatos[3].substring(6,10));//año
		String sAccion=strDatos[5].trim();
		int numFirma=Integer.parseInt(strDatos[6]);
		
		//JJR 17/02/2006
		//ACTUALIZACION DE SALDOS DEL ACUERDO DEL CT
		boolean bComiteTecnico= n.aplica(Integer.parseInt(strDatos[2]));
		
		String[] strDatosAcuerdoCT=null;
		if (bComiteTecnico)
			{
			strDatosAcuerdoCT=getDatosAcuerdoCT(strDatos[2],strDatos[1]);
			}
		
		try
		{
			
			String sNumFolio;
			if (conBD == null) if (!OpenBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			stInstrucc = conBD.createStatement();
			conBD.setAutoCommit(false);	
			
			
			//Registra el usuario y los datos de la aoutorización, para fisos que requieren firmas mancomunadas
			switch (numFirma)
					{
					case 0://fiso sin firmas mancomunadas	
							iRows = 1;
							break;
					case 1://firma de autorización 1
					
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
					
					case 2://firma de autorización 2
											
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
							case 1://Depositos
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
									
									query = " UPDATE deposit set DPO_CVE_ST_DEPOSI='"+strDatos[5].trim()+"'"
										  + ",DPO_ANO_ULT_MOD=" + anio
										  + ",DPO_MES_ULT_MOD=" + mes
										  + ",DPO_DIA_ULT_MOD=" + dia
										  + ",DPO_ANO_RCP=" + anio
										  + ",DPO_MES_RCP=" + mes
										  + ",DPO_DIA_RCP=" + dia
										  + " WHERE "
										  + " DPO_NUM_CONTRATO="+strDatos[2]
										  + " AND "
										  + " DPO_FOLIO_OPERA="+strDatos[1];

									if (iRows>0)	
										iRows=stInstrucc.executeUpdate(query);	
									
									
									break;
								 
								 
							case 2://Retiros
							
									query = " UPDATE instrucc set INS_CVE_ST_INSTRUC='"+strDatos[5].trim()+"'"
										  + ",INS_ANO_ULT_MOD=" + anio
										  + ",INS_MES_ULT_MOD=" + mes
										  + ",INS_DIA_ULT_MOD=" + dia
										  + " WHERE "
										  + " INS_NUM_CONTRATO="+strDatos[2]
										  + " AND "
										  + " INS_NUM_FOLIO_INST="+strDatos[1];

									if (iRows>0)	
											iRows=stInstrucc.executeUpdate(query);	
																			
									query = " UPDATE DETLIQUI set  DEL_CVE_ST_DETLIQU='"+strDatos[5].trim()+"'"
										  + ",DEL_ANO_ULT_MOD=" + anio
										  + ",DEL_MES_ULT_MOD=" + mes
										  + ",DEL_DIA_ULT_MOD=" + dia
										  + " WHERE "
										  + " DEL_NUM_CONTRATO="+strDatos[2]
										  + " AND "
										  + " DEL_FOLIO_OPERA="+strDatos[1];
							
									if (iRows>0)	
											iRows=stInstrucc.executeUpdate(query);	
									
									//JJR 17/02/2006
									//Actualiza monto ejecido y disponible del Acuerdo del que se disponen los recursos		
									//Nota: Esta actualización no incluye la forma de liquidación SWIFT
									if( bComiteTecnico &&  strDatosAcuerdoCT[0]!=null &&  sAccion.equals("ACTIVO") && iRows>0)
									   {
							   	       query = "UPDATE acuerdos_ct a "
											 + " SET a.acu_monto_disponible = (a.acu_monto_disponible -"+  strDatosAcuerdoCT[3] + "),"
											 + "a.acu_monto_ejercido   = (a.acu_monto_ejercido + "+ strDatosAcuerdoCT[3] + "), "
											 + "a.acu_status='EN PROCESO'"
											 + " WHERE "
											 + "a.ses_num_contrato="+ strDatos[2]
											 + " AND "
											 + "a.ses_fecha=to_date('"+strDatosAcuerdoCT[0]+"','dd/mm/yyyy')"
											 + " AND "
											 + "a.ses_tipo='"+strDatosAcuerdoCT[1]+"'"
											 + " AND "
											 + "a.acu_id='"+strDatosAcuerdoCT[2]+"'"
											 + " AND "
								 			 + "a.acu_monto_disponible>="+ strDatosAcuerdoCT[3] ;
										iRows=stInstrucc.executeUpdate(query);						 
									   }		
																		 
								break;
								
								
								
							case 3://Traspasos
							
									query = " UPDATE instrucc set INS_CVE_ST_INSTRUC='"+strDatos[5].trim()+"'"
										  + ",INS_ANO_ULT_MOD=" + anio
										  + ",INS_MES_ULT_MOD=" + mes
										  + ",INS_DIA_ULT_MOD=" + dia
										  + " WHERE "
										  + " INS_NUM_CONTRATO="+strDatos[2]
										  + " AND "
										  + " INS_NUM_FOLIO_INST="+strDatos[1];

									if (iRows>0)	
											iRows=stInstrucc.executeUpdate(query);	
										
											
									 query = " UPDATE DETLIQUI set  DEL_CVE_ST_DETLIQU='"+strDatos[5].trim()+"'"
									 	   + ",DEL_ANO_ULT_MOD=" + anio
										   + ",DEL_MES_ULT_MOD=" + mes
										   + ",DEL_DIA_ULT_MOD=" + dia
										   + " WHERE "
										   + " DEL_NUM_CONTRATO="+strDatos[2]
										   + " AND "
										   + " DEL_FOLIO_OPERA="+strDatos[1];


									if (iRows>0)	
											iRows=stInstrucc.executeUpdate(query);	
										    
										query = " UPDATE deposit set DPO_CVE_ST_DEPOSI='"+strDatos[5].trim()+"'"
											  + ",DPO_ANO_ULT_MOD=" + anio
											  + ",DPO_MES_ULT_MOD=" + mes
											  + ",DPO_DIA_ULT_MOD=" + dia
											  + ",DPO_ANO_RCP=" + anio
											  + ",DPO_MES_RCP=" + mes
											  + ",DPO_DIA_RCP=" + dia
											  + " WHERE "
											  + " DPO_NUM_CONTRATO="+strDatos[2]
											  + " AND "
											  + " DPO_FOLIO_OPERA="+strDatos[1];										  
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
				    LOGGER.debug("FirmaAutoriza  con Folio:"+strDatos[1]);
				    bInstruccion=true;
				   }	
				else{
					conBD.rollback();
				   	bInstruccion=false;
				   	LOGGER.debug("No se Registro la FirmaAutoriza con Folio:"+strDatos[1]);
				    }
		}
		catch (Exception ex)
		{
			try	{
				conBD.rollback();
				LOGGER.debug("No se Registro la FirmaAutoriza con Folio:"+strDatos[1]);
				LOGGER.debug("Error: "+ex);
				LOGGER.debug("Query: \n"+query);
				}
			catch (Exception error)
				{
				LOGGER.debug("No se realizo la FirmaAutoriza rollback");
				LOGGER.debug("Error: "+ex);	
				
				}
			bInstruccion=false;
		
		}
		finally
		{
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: autoriza");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: autoriza");LOGGER.error("Exception: ", ex); }
			return bInstruccion;
		}
	}
	

  	/*
    Metodo Anterior de autorizacion: ActualizaInstFOSEG(Cresdo por Betzabe Rodriguez)
    Metodo Nuevo: firmaAutorizaFOSEG
    Autor: Jannett Jiménez Ruiz
    Funcion: Se registra la autorización de las instrucciones pendientes(DEPOSITO,RETIRO Y TRASPASOS)
	
	Parametros:(strDatos,StrBitacora)
				strDatos[0]=tipo de operacion
				strDatos[1]=folio
				strDatos[2]=fiso
				strDatos[3]=fecha
				strDatos[4]=numUsuario
				strDatos[5]=status
				strDatos[6]=numero de firma 1 o 2 (solo para firmas mancomunadas),  0 en otros fisos
				strDatos[7]=forma de liquidacion

	*/
	
	public boolean autorizacionFOSEG( String [] strDatos,
									  String [] strBitacora)
	  {
	  
	  boolean bInstruccion=false;
	  String query="";		
	  int iTipo=Integer.parseInt( strDatos[0]);
	  String folio=strDatos[1];
	  String numFid=strDatos[2];
	  String fecha=strDatos[3];
  	  int dia = Integer.parseInt(strDatos[3].substring(0,2));//dia
	  int mes = Integer.parseInt(strDatos[3].substring(3,5));//mes
 	  int anio = Integer.parseInt(strDatos[3].substring(6,10));//año
	  String numUsuario=strDatos[4];
	  String sAccion=strDatos[5];
	  int numFirma=Integer.parseInt(strDatos[6]);
	  String formaLiq=strDatos[7];
      String numCto="";
      if(iTipo==8)
	  	numCto = getNumContrato(numFid,"RENDIMIENTOS");	
	  //JJR 17/02/2006
	  //ACTUALIZACION DE SALDOS DEL ACUERDO DEL CT
	  
	  boolean bComiteTecnico= n.aplica(Integer.parseInt(strDatos[2]));
	  String[] strDatosAcuerdoCT=null;
	  if (bComiteTecnico)
	  	 {
	  	 strDatosAcuerdoCT=getDatosAcuerdoCT(strDatos[2],strDatos[1]);
	  	 }
  	  try
		{	

   		if (conBD == null) if (!OpenBD()) return false;
		if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
		
		stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stInstrucc = conBD.createStatement();
        conBD.setAutoCommit(false);	
		
	    //Registra el usuario y los datos de la aoutorización, para fisos que requieren firmas mancomunadas
		switch (numFirma)
				{
				case 0://fiso sin firmas mancomunadas	
						iRows = 1;
						break;
				case 1://firma de autorización 1
				
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
					
		     	case 2://firma de autorización 2
									
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
					}
		
		if((sAccion.equals("CANCELADO") || (sAccion.equals("ACTIVO") && (numFirma==2 || numFirma==0))) && iRows>0)									
		  {
		  switch(iTipo)
			{
			case 1://Deposito
				
					query = " UPDATE instrucc set INS_CVE_ST_INSTRUC='"+sAccion+"'"
						  + ",INS_ANO_ULT_MOD=" + anio
						  + ",INS_MES_ULT_MOD=" + mes
						  + ",INS_DIA_ULT_MOD=" + dia
						  + " WHERE "
						  + " INS_NUM_CONTRATO="+numFid
						  + " AND "
						  + " INS_NUM_FOLIO_INST="+folio;
	
				   iRows = stInstrucc.executeUpdate(query);
				   if(iRows>0)
				   	{
				   	query  = "UPDATE deposit SET dpo_cve_st_deposi='" + sAccion+"'"
							+ ",dpo_ano_ult_mod=" + anio 
							+ ",dpo_mes_ult_mod=" + mes
							+ ",dpo_dia_ult_mod=" + dia
							+ ",DPO_ANO_RCP=" + anio
						    + ",DPO_MES_RCP=" + mes
						    + ",DPO_DIA_RCP=" + dia
							+ " WHERE "
							+ " dpo_folio_opera=" + folio
							+ " AND "
							+ " dpo_num_contrato="+numFid;
	
					iRows = stInstrucc.executeUpdate(query);	
				   		
				   	}
				
				break;
		   case 2://Retiro
									
				query = " UPDATE instrucc set INS_CVE_ST_INSTRUC='"+sAccion+"'"
					  + ",INS_ANO_ULT_MOD=" + anio
					  + ",INS_MES_ULT_MOD=" + mes
					  + ",INS_DIA_ULT_MOD=" + dia
					  + " WHERE "
					  + " INS_NUM_CONTRATO="+numFid
					  + " AND "
					  + " INS_NUM_FOLIO_INST="+folio;

			   iRows = stInstrucc.executeUpdate(query);
			   if(iRows>0)
			   	{
				query   = "UPDATE detliqui SET del_cve_st_detliqu='" +sAccion+ "'"
						+ " ,del_ano_ult_mod=" + anio
						+ ",del_mes_ult_mod=" + mes
						+ ",del_dia_ult_mod=" + dia 
						+ " WHERE del_folio_opera=" + folio
						+ " AND "
						+ " del_num_contrato="+numFid;

				iRows = stInstrucc.executeUpdate(query);
		
				}
			   if(iRows>0)
			   	{
				query   = "UPDATE detfoseg SET dfo_cve_st_detfoseg='" +sAccion+ "'"
						+ " ,dfo_ano_ult_mod=" + anio
						+ ",dfo_mes_ult_mod=" + mes
						+ ",dfo_dia_ult_mod=" + dia 
						+ " WHERE dfo_folio_opera=" + folio;

				iRows = stInstrucc.executeUpdate(query);
		
				}	
			   if(iRows>0)
			   	{
			   	query = "UPDATE movimifoseg SET "
				      + "mfo_fecha=TO_DATE('" + fecha +" '||TO_CHAR(sysdate,'hh24:mi:ss'),'dd/mm/yyyy hh24:mi:ss')"
					  + ",mfo_ano_ult_mod=" + anio
					  + ",mfo_mes_ult_mod=" + mes
					  + ",mfo_dia_ult_mod=" + dia
					  + ",mfo_cve_st_movimfo='"+ (formaLiq.equals("SWIFT") && sAccion.equals("ACTIVO")?"PENDIENTE":sAccion)+"'" 
					  + " WHERE "
				      + " mfo_folio_detliqui="+folio
				      + " AND "
				      + " mfo_num_aux1="+numFid;	
				      
			   	iRows = stInstrucc.executeUpdate(query);	
			   	}
			   	//actualiza presupuestal
			    if(iRows>0 && sAccion.equals("ACTIVO") && !formaLiq.equals("SWIFT"))
					{
		        	query   = "SELECT '7000,' || mfo_num_scta || ',' || "
		        		    + " mfo_num_sscta || ',' || mfo_num_ssscta || ',' ||"
				          	+ " mfo_num_sssscta || ',' || mfo_num_ssssscta || ',' ||"
				          	+ " mfo_num_aux1 || ',' || mfo_num_aux2 || ',' ||"
				            + " mfo_num_aux3 || ',' || mfo_folio || ',' || "
				            + " TO_CHAR(mfo_fecha,'dd/mm/yyyy') || ',' || "
				           	+ " LTRIM(TO_CHAR(mfo_importe,'999999999999.00')) || ',' || "
				           	+ " mfo_tipo_oper || ',' || mfo_comprometido"
				            + ",mfo_num_aux2,mfo_importe FROM movimifoseg WHERE "
				            + " mfo_folio_detliqui="+folio
				            + " AND "
				            + " mfo_num_aux1="+numFid
				            + " AND "
				            + "mfo_tipo_oper='R'";
				            
				    rsQuery=stQuery.executeQuery(query);       
					while(rsQuery.next() && iRows>0)
						{
						iRows= actualizaSaldo(rsQuery.getString(1));				
						}
					}
				
				    //JJR 17/02/2006
					//Actualiza monto ejecido y disponible del Acuerdo del que se disponen los recursos		
					//Nota: Esta actualización no incluye la forma de liquidación SWIFT
					if( bComiteTecnico && strDatosAcuerdoCT[0]!=null && sAccion.equals("ACTIVO") && iRows>0)
					   {
			   	       query = "UPDATE acuerdos_ct a "
							 + " SET a.acu_monto_disponible = (a.acu_monto_disponible -"+  strDatosAcuerdoCT[3] + "),"
							 + "a.acu_monto_ejercido   = (a.acu_monto_ejercido + "+ strDatosAcuerdoCT[3] + "), "
							 + "a.acu_status='EN PROCESO'"
							 + " WHERE "
							 + "a.ses_num_contrato="+ strDatos[2]
							 + " AND "
							 + "a.ses_fecha=to_date('"+strDatosAcuerdoCT[0]+"','dd/mm/yyyy')"
							 + " AND "
							 + "a.ses_tipo='"+strDatosAcuerdoCT[1]+"'"
							 + " AND "
							 + "a.acu_id='"+strDatosAcuerdoCT[2]+"'"
							 + " AND "
							 + "a.acu_monto_disponible>="+strDatosAcuerdoCT[3] ;
							 
							 iRows=stInstrucc.executeUpdate(query);						 
					   }	
					
					
			   break;
		 case 5:
		 case 6:
		 case 7:
		 case 8:
		 		query = "UPDATE movimifoseg SET "
				      + "mfo_fecha=TO_DATE('" + fecha +" '||TO_CHAR(sysdate,'hh24:mi:ss'),'dd/mm/yyyy hh24:mi:ss')"
					  + ",mfo_ano_ult_mod=" + anio
					  + ",mfo_mes_ult_mod=" + mes
					  + ",mfo_dia_ult_mod=" + dia
					  + ",mfo_cve_st_movimfo='"+ (formaLiq.equals("SWIFT") && sAccion.equals("ACTIVO")?"PENDIENTE":sAccion)+"'" 
					  + " WHERE "
				      + " mfo_folio="+folio
				      + "AND "
				      + "mfo_num_aux1="+numFid;
				      
				iRows = stInstrucc.executeUpdate(query); 
				
				//actualiza presupuestal
				if(iRows>0 && sAccion.equals("ACTIVO"))
					{
		        	query   = "SELECT '7000,' || mfo_num_scta || ',' || "
		        		    + " mfo_num_sscta || ',' || mfo_num_ssscta || ',' ||"
				          	+ " mfo_num_sssscta || ',' || mfo_num_ssssscta || ',' ||"
				          	+ " mfo_num_aux1 || ',' || mfo_num_aux2 || ',' ||"
				            + " mfo_num_aux3 || ',' || mfo_folio || ',' || "
				            + " TO_CHAR(mfo_fecha,'dd/mm/yyyy') || ',' || "
				           	+ " LTRIM(TO_CHAR(mfo_importe,'999999999999.00')) || ',' || "
				           	+ " mfo_tipo_oper || ',' || mfo_comprometido,"
				            + " mfo_num_aux2,"
				            + " mfo_importe "
				            + " FROM movimifoseg WHERE "
				            + " mfo_folio="+folio
				            + " AND "
				            + " mfo_num_aux1="+numFid;        
				            
				    rsQuery=stQuery.executeQuery(query);       
				    
					while(rsQuery.next() && iRows>0)
						{
						iRows= actualizaSaldo(rsQuery.getString(1));
						if(iTipo==8 && iRows>0)//Asignacion de Rendimientos
			     			{
		                    query = " UPDATE "
			   					 + " rendimi_foseg "
			   					 + " SET REN_IMP_X_ASIGNAR = REN_IMP_X_ASIGNAR-" + rsQuery.getDouble(3)
		            		     + " WHERE  "
		            		     + " REN_NUM_FID =" + numFid
								 + " AND "
								 + " REN_NUM_CONTRATO="+numCto
								 + "  AND "
								 + " REN_EJERCICIO="+rsQuery.getString(2);
				   
				   			iRows = stInstrucc.executeUpdate(query);	
							}				
						}
					}
		 		break;
		 		
		 		case 9: //Honorarios
                  query = " UPDATE instrucc set INS_CVE_ST_INSTRUC='"+sAccion+"'"
					        + ",INS_ANO_ULT_MOD=" + anio
					        + ",INS_MES_ULT_MOD=" + mes
					        + ",INS_DIA_ULT_MOD=" + dia
					        + " WHERE "
					        + " INS_NUM_CONTRATO="+numFid
					        + " AND "
					        + " INS_NUM_FOLIO_INST="+folio;
                  iRows = stInstrucc.executeUpdate(query);
                 
                  if(iRows>0) {
				            query   = "UPDATE detfoseg SET dfo_cve_st_detfoseg='" +sAccion+ "'"
						        + " ,dfo_ano_ult_mod=" + anio
						        + ",dfo_mes_ult_mod=" + mes
						        + ",dfo_dia_ult_mod=" + dia 
						        + " WHERE dfo_folio_opera=" + folio;
                    iRows = stInstrucc.executeUpdate(query);
	                }	
                 
                  if(iRows>0) {
			   	          query = "UPDATE movimifoseg SET "
				            + "mfo_fecha=TO_DATE('" + fecha +" '||TO_CHAR(sysdate,'hh24:mi:ss'),'dd/mm/yyyy hh24:mi:ss')"
					          + ",mfo_ano_ult_mod=" + anio
					          + ",mfo_mes_ult_mod=" + mes
					          + ",mfo_dia_ult_mod=" + dia
					          + ",mfo_cve_st_movimfo='"+ (formaLiq.equals("SWIFT") && sAccion.equals("ACTIVO")?"PENDIENTE":sAccion)+"'" 
					          + " WHERE "
				            + " mfo_folio_detliqui="+folio
				            + " AND "
				            + " mfo_num_aux1="+numFid;	
				            iRows = stInstrucc.executeUpdate(query);	
			   	       }
			   	
                 //actualiza presupuestal
			           if(iRows>0 && sAccion.equals("ACTIVO") && !formaLiq.equals("SWIFT")) {
		        	      query = "SELECT '7000,' || mfo_num_scta || ',' || "
		        		    + " mfo_num_sscta || ',' || mfo_num_ssscta || ',' ||"
				            + " mfo_num_sssscta || ',' || mfo_num_ssssscta || ',' ||"
				            + " mfo_num_aux1 || ',' || mfo_num_aux2 || ',' ||"
				            + " mfo_num_aux3 || ',' || mfo_folio || ',' || "
				            + " TO_CHAR(mfo_fecha,'dd/mm/yyyy') || ',' || "
				            + " LTRIM(TO_CHAR(mfo_importe,'999999999999.00')) || ',' || "
				            + " mfo_tipo_oper || ',' || mfo_comprometido"
				            + ",mfo_num_aux2,mfo_importe FROM movimifoseg WHERE "
				            + " mfo_folio_detliqui="+folio
				            + " AND "
				            + " mfo_num_aux1="+numFid
				            + " AND "
				            + "mfo_tipo_oper='R'";
				            rsQuery=stQuery.executeQuery(query);       
					
                    while(rsQuery.next() && iRows>0)
		                {
						          iRows= actualizaSaldo(rsQuery.getString(1));				
						        }
					       }
			           break;                 
		 		 }//fin switch(iTipo) (Tipo de Intruccion)
      }//fin if sAccion
		
	  if(iRows>0)
	 	   iRows=insertaBitacora(strBitacora);
	  
	  if(iRows>0)
		   {
		   	conBD.commit();
		    LOGGER.debug("FirmaAutoriza  con Folio:"+strDatos[1]);
		    bInstruccion=true;
		   }	
		else{
			conBD.rollback();
		   	bInstruccion=false;
		   	LOGGER.debug("No se Registro la FirmaAutoriza con Folio:"+strDatos[1]);
		    }

		
	}
	catch(Exception ex)
		{
			try	{
				conBD.rollback();
				LOGGER.debug("No se Registro la FirmaAutoriza con Folio:"+strDatos[1]);
				LOGGER.debug("Error: "+ex);
				LOGGER.debug("Query: \n"+query);
				}
			catch (Exception error)
				{
				LOGGER.debug("No se realizo la FirmaAutoriza rollback");
				LOGGER.debug("Error: "+ex);	
				
				}
			bInstruccion=false;
		
		}
		finally
		{
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("Funcion: autorizaFOSEG");LOGGER.error("Exception: ", ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: autorizaFOSEG");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: autorizaFOSEG");LOGGER.error("Exception: ", ex); }
			return bInstruccion;
		}	
	}


						
	
  	/******************* 		
				Metodos para obtener los honorarios FOSEG	
	******************/			
	
	/* 	Metodo que obtiene el contrato de Rendimienbto
		de un fideicomiso FOSEG */
	public String getContRendimientos(String iFiso)	
		{
				String sDato = null;
		try
		{					
				 // CONTINTE
					sQuery = "  SELECT DISTINCT cpr_contrato_inter FROM continte "; 
					sQuery += " WHERE cpr_num_contrato = " + iFiso;
					sQuery += " AND CPR_CVE_ORIG_REC = 'RENDIMIENTOS'";
					sQuery += " AND cpr_contrato_inter <> 1000 AND cpr_cve_st_contint='ACTIVO'";
					sQuery += " ORDER BY cpr_contrato_inter ASC";
			
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
				rsQuery.last();			
				rsQuery.first();			
				sDato=rsQuery.getString(1);
			}
	}
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
		}
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
		return sDato;
	}
	
	
			
/* Metodo que ob obtiene el Saldo cn el Contaro de Rendimientos FOSEG*/			
	public String getSaldoContRen(String iFiso, int iCol)	
		{
				String sDato = null;
				String sCtos = null;
				sCtos = getContRendimientos(iFiso);
		try
		{					
					sQuery =  "SELECT  RTRIM(LTRIM(TO_CHAR(DEC_DIA_PER_DEL,'00')||'/'||TO_CHAR(DEC_MES_PER_DEL,'00')||'/'||TO_CHAR(DEC_ANO_PER_DEL,'0000'))) || ' AL ' ||  RTRIM(LTRIM(TO_CHAR(DEC_DIA_PER_AL,'00')||LTRIM(RTRIM('/'||TO_CHAR(DEC_MES_PER_AL,'00')||'/'))||TO_CHAR(DEC_ANO_PER_AL,'0000'))) AS PERIODO, ";
					sQuery += "DEC_IMP_ORIG_HONOR AS IMP, ";
					sQuery += "DEC_ORIG_IVA_HONOR AS IVA, ";
					sQuery += "(DEC_IMP_ORIG_HONOR+DEC_ORIG_IVA_HONOR) AS TOTAL ";
					sQuery += "FROM 	DETCART ";
					sQuery += "WHERE  DEC_CVE_CALIF_HONO='PENDIENTE' ";
					sQuery += "AND    DEC_NUM_CONTRATO = "+ sCtos ;
					sQuery += " ORDER BY	DEC_ANO_PER_DEL ASC, " ;
					sQuery += "DEC_MES_PER_DEL ASC " ;
			
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
				rsQuery.last();			
				rsQuery.first();			
				sDato=rsQuery.getString(iCol);
			}
	}
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
			LOGGER.debug("Error en el metodo getSaldoContRen");
			LOGGER.debug(sQuery);
		}
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
		return sDato;
	}


	/*
		Metodo que obtine datos para pintar la pagina
		de pago de honorarios foseg
	*/						
		public String[] getHeader(String iFiso)	
		{
				String   sDato  = null;
				String   sDatos[]  = null;
		try
		{					
				 //DETCART									
					sQuery =  "SELECT  RTRIM(LTRIM(TO_CHAR(DEC_DIA_PER_DEL,'00')||'/'||TO_CHAR(DEC_MES_PER_DEL,'00')||'/'||TO_CHAR(DEC_ANO_PER_DEL,'0000'))) || ' AL ' ||  RTRIM(LTRIM(TO_CHAR(DEC_DIA_PER_AL,'00')||LTRIM(RTRIM('/'||TO_CHAR(DEC_MES_PER_AL,'00')||'/'))||TO_CHAR(DEC_ANO_PER_AL,'0000'))) AS PERIODO, ";
					sQuery += "DEC_IMP_REM_HONOR AS IMP, ";
					sQuery += "ROUND(DEC_IMP_REM_HONOR * .15,2) AS IVA, ";
					sQuery += "DEC_IMP_REM_HONOR + ROUND(DEC_IMP_REM_HONOR * .15,2) AS TOTAL ";
					
					sQuery += "FROM 	DETCART ";
					sQuery += "WHERE  DEC_CVE_CALIF_HONO='PENDIENTE' ";
					sQuery += "AND    DEC_NUM_CONTRATO = " + iFiso ;
					sQuery += " ORDER BY	DEC_ANO_PER_DEL ASC, " ;
					sQuery += "DEC_MES_PER_DEL ASC " ;
			
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
				rsQuery.last();			
				sDatos= new String[4];
				rsQuery.first();	
				
			   sDatos[0] = rsQuery.getString(1);
			   sDatos[1] = rsQuery.getString(2);
			   sDatos[2] = rsQuery.getString(3);
			   sDatos[3] = rsQuery.getString(4);			   		   
			}
			
	}
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
			LOGGER.debug("Error en el metodo: getHeader");
			LOGGER.debug(sQuery);
			return null;
		}
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
		return sDatos;
	}

	/*
		Metodo que obtien informacion  para pintar el codigo html de 
		radio botones
	*/			
	public String[][] getDatos(String iFiso)
	{
		String[][] sData = null;
		try
		{
			int i;						
			// Saldos					
			sQuery = "SELECT SAL_NUM_AUX2, SAL_IMP_SALDO_ACT ";
			sQuery += " from  SALDOS";
			sQuery += " where SAL_NUM_CTAM=7000";
			sQuery += " and SAL_NUM_AUX1="+iFiso;
			sQuery += " and SAL_NUM_SCTA		= 14"; 		// Eje
			sQuery += " and SAL_NUM_SSCTA		= 2"; 		//Programa
			sQuery += " and SAL_NUM_SSSCTA	= 1";			// Proyecto
			sQuery += " and SAL_NUM_SSSSCTA	=	1";			//Accion
			sQuery += " and SAL_NUM_AUX3		= 3";			//Origen;
			sQuery += " and SAL_IMP_SALDO_ACT		> 0";			//Presenta saldo mayor que 0;
										
			
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
			rsQuery.last();			
			sData = new String[rsQuery.getRow()][2];

			rsQuery.first();
			i=0;
			do
				{
				sData[i][0] = rsQuery.getString(1);			// Año
				sData[i][1] = rsQuery.getString(2);			// Saldo
				i++;
				}
		   while(rsQuery.next());
			}
			
		}
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
			LOGGER.debug("Error en el metodo: getDatos");
			LOGGER.debug(sQuery);
			return null;
		}
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
		return sData;
	}
	
	/* genera una cadena con el codigo en html 
	para generar un option buton simple
	Creada por:INFOTEC
	*/
	public String DataRadio(String iFiso)
	{
		String[][] sData=getDatos(iFiso);
		StringBuffer s = new StringBuffer();
		String sImp = null;
		int iAnio = 0;
		int i;

		if(sData!=null)
		{
			s.append("<table width='100%' border='0' cellspacing='2' cellpadding='4'> <tr> <td class='subtitulo'>14-2-1-1 Honorarios Fiduciarios</td> <td class='subtitulo'>A&ntilde;o:</td> <td class='subtitulo'>Saldo</td><tr>" );			
			for(i=0;i<sData.length;i++)
				{
					Double dSaldo=Double.valueOf(sData[i][1]);
					sImp=nfFormato.format(dSaldo);			// Saldo formateado 			
					s.append("<tr> <td width='40%'><input type='hidden' name ='" + sData[i][0] + "' value='" + sData[i][1] + "'" + "></td> <td width='20%' class='subtitulo'><input type='radio'         name='optAnio' value='" + sData[i][0] + "' onClick='Valida(" + " 1 , " + sData[i][1] + ");'>" + sData[i][0] + "</td> <td width='35%' class='subtitulo'>" + sImp + "</td><tr>" );
					sImp = null;
				}									
			s.append("</table> " );
			return s.toString();
			}
		else
		    return null;	
	}  	

		
	/*Obtiene el saldo actual 
	de un contrato de Rendimientos
	*/
	public double getSalContRendimiento(String sNumFid)
	{
		String sFechasig=null,sFechaact=null;	
		sFechaact=getFecha();
		sFechasig=getFechaHabil(sFechaact);
		String sCtoInv = null;
		sCtoInv = getContRendimientos(sNumFid);
		int i;
		double dImp = 0, dTotal = 0;
		String sImp = null;
				
		try
		{
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return 0;	
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			sQuery = "SELECT NVL(SUM(pos_costo_historic),0)";
			sQuery += " FROM posicion";
			sQuery +=" WHERE pos_num_contrato=" + sNumFid ;
			sQuery +=" AND pos_contrato_inter=" + sCtoInv;			
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				{
				dImp = rsQuery.getDouble(1);
				}
				
			//se valida que la fecha del reporte corresponda
			//con la fecha de operacion o del día posterior	
			sQuery = "SELECT NVL(SUM(cre_imp_reporto),0)" ;
			sQuery += "FROM conrepor WHERE cre_num_contrato=";
			sQuery += sNumFid + " AND cre_contrato_inter=" + sCtoInv +" AND cre_cve_st_conrepo = 'ACTIVO'";	
			sQuery += " and (to_date(to_char(CRE_DIA_VENCIM)||'/'||to_char(CRE_MES_VENCIM)||'/'||to_char(CRE_ANO_VENCIM),'DD/MM/YYYY')=to_date('"+sFechasig+"','DD/MM/YYYY')";
			sQuery += " or to_date(to_char(CRE_DIA_VENCIM)||'/'||to_char(CRE_MES_VENCIM)||'/'||to_char(CRE_ANO_VENCIM),'DD/MM/YYYY')=to_date('"+sFechaact+"','DD/MM/YYYY'))";		
			
			rsQuery=stQuery.executeQuery(sQuery); 
						
			if(rsQuery.next())
				{
				dImp = dImp + rsQuery.getDouble(1);				
				}
				
			return dImp; 
	            
		}
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
			LOGGER.debug("Error de getSalContRendimiento");
			LOGGER.debug(sQuery);
			return 0;
		}				
		finally
		{
			//LOGGER.debug("Cerrando finally de la base de getSalContRendimiento");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
	}		

		
	/*
		Obtiene el saldo actual de un 
		contrato de rendimiento
	*/
	public String getRendimiento(String sNumFid)
	{
		String sFechasig=null,sFechaact=null;	
		sFechaact=getFecha();
		sFechasig=getFechaHabil(sFechaact);
		String sCtoInv = null;
		sCtoInv = getContRendimientos(sNumFid);
		int i;
		double dImp = 0, dTotal = 0;
		String sImp = null;
				
		try
		{
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;	
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			sQuery = "SELECT NVL(SUM(pos_costo_historic),0)";
			sQuery += " FROM posicion";
			sQuery +=" WHERE pos_num_contrato=" + sNumFid ;
			sQuery +=" AND pos_contrato_inter=" + sCtoInv;			
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				{
				dImp = rsQuery.getDouble(1);
				}
				
			//se valida que la fecha del reporte corresponda
			//con la fecha de operacion o del día posterior	
			sQuery = "SELECT NVL(SUM(cre_imp_reporto),0)" ;
			sQuery += "FROM conrepor WHERE cre_num_contrato=";
			sQuery += sNumFid + " AND cre_contrato_inter=" + sCtoInv +" AND cre_cve_st_conrepo = 'ACTIVO'";	
			sQuery += " and (to_date(to_char(CRE_DIA_VENCIM)||'/'||to_char(CRE_MES_VENCIM)||'/'||to_char(CRE_ANO_VENCIM),'DD/MM/YYYY')=to_date('"+sFechasig+"','DD/MM/YYYY')";
			sQuery += " or to_date(to_char(CRE_DIA_VENCIM)||'/'||to_char(CRE_MES_VENCIM)||'/'||to_char(CRE_ANO_VENCIM),'DD/MM/YYYY')=to_date('"+sFechaact+"','DD/MM/YYYY'))";
			
			rsQuery=stQuery.executeQuery(sQuery); 
						
			if(rsQuery.next())
				{
				dImp = dImp + rsQuery.getDouble(1);				
				}							
				
			sImp = nfFormato.format(dImp);		
			
			return sImp; 	            
		}
		catch (Exception ex)
		{
			LOGGER.debug("Error de getRendimiento");
			LOGGER.error("Exception: ", ex);
			LOGGER.debug(sQuery);
			return null;
		}				
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
	}		

			
	/*
	Metodo:registraPago
	Funcion: Insertar los datos de honorarios 
	provenientes insertaPagoHonFOSEG
	*/
	private int registraPagoHonFos     (String sFiso,
																		  String Scuenta,
																		  String Scontrato,
																		  String scve_pers,
																		  String inum_pers,
																		  String sTipo_hono,
																		  String sFeccalc,
																		  String sNumSec,
																		  String sFechaOper,
																		  String sImporte,
																		  String sIva,
																		  String sFoliooper,
																		  String sNumpagos,
																		  String status,
																		  String sEstatus,
																		  String[] sData,
 																		  String[] strFirma)
	    {
				int d,m,a;
				String sPrint=null;				
				String 	dImporteParcial= "0.0",
								sImporteTotal="0.00",
								sImporteParcIva= "0.0";
				double	dImporteParcIva=0.0;
				
				String sDetFoSeg="", sStatus="ACTIVO";
				d=Integer.parseInt(sFechaOper.substring(0,2));//dia
				m=Integer.parseInt(sFechaOper.substring(3,5));//mes
				a=Integer.parseInt(sFechaOper.substring(6,10));//año
								
				String query="";
				
				boolean bFirmasM = firmasMancomunadas(sFiso);	
				
		try
		{										 	   
				if (conBD == null) if (!OpenBD()) return 0;
				if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return 0;
					stInstrucc=conBD.createStatement();
					stQuery=conBD.createStatement();
								
				int sec_pago=0;
				sec_pago=getSecuencialPago(sFiso,scve_pers,inum_pers,sTipo_hono,sFeccalc,sNumSec,sFechaOper);
												
				if(bFirmasM || strFirma[0].equals("1"))
					sEstatus="ESPERA";

			Locale currentLocale = new Locale("sp","US");
								
			if(Integer.valueOf(sNumpagos).intValue()==1)
			  { 
				//se procede a insertar la instruccion correspondiente
				query   = "INSERT INTO INSTRUCC ("
								+ "INS_NUM_CONTRATO,"
								+ "INS_NUM_FOLIO_INST,"
								+ "INS_SUB_CONTRATO,"
								+  "INS_TXT_COMENTARIO,"
								+  "INS_CVE_TIPO_INSTR,"
								+  "INS_NUM_MIEMBRO,"
								+  "INS_NOM_MIEMBRO,"    
								+  "INS_ANO_ALTA_REG,"      
								+  "INS_MES_ALTA_REG,"    
								+  "INS_DIA_ALTA_REG,"    
								+  "INS_ANO_ULT_MOD,"  
								+  "INS_MES_ULT_MOD,"     
								+  "INS_DIA_ULT_MOD,"   
								+  "INS_CVE_ST_INSTRUC)"
								+  " VALUES ("
								+  sFiso + ","
								+  sFoliooper + ","
								+  "0,'',"
								+  "'HONORARIOS INTERNET',"
								+  "0,'',"
								+  a + ","
								+  m + ","
								+  d + ","
								+  a + ","
								+  m + ","
								+  d + ","
								+ "'"+sEstatus+"')";
								
				iRows = stInstrucc.executeUpdate(query);								
			}
		
			// Comentario AEF				
			dImporteParcial=num.format(Double.valueOf(sImporte).doubleValue() / 1.15);
			dImporteParcIva= (Double.valueOf(sImporte).doubleValue() / 1.15)*.15;
			sImporteParcIva= num.format(dImporteParcIva);			
				
			query = "";
			//se procede a actualizar cartera
			query =   "UPDATE CARTERA SET"
					+ " CAR_IMP_HONOR=CAR_IMP_HONOR-"+dImporteParcial
					+ ",CAR_NUM_REG_DET=CAR_NUM_REG_DET-1"
					+ ",CAR_IMP_REG_DET=CAR_IMP_REG_DET-"+ num.format(Double.valueOf(sImporte).doubleValue() / 1.15 + Double.valueOf(sIva).doubleValue())
					+ ",CAR_NUM_PAGOS_FEC=CAR_NUM_PAGOS_FEC+1"
					+ ",CAR_IMP_PAGOS_FEC=CAR_IMP_PAGOS_FEC+"+num.format(Double.valueOf(sImporte).doubleValue() / 1.15 +Double.valueOf(sIva).doubleValue())
					+ " WHERE"
					+ " CAR_NUM_CONTRATO = "+sFiso
					+ " AND CAR_CVE_PERS_FID  = '"+scve_pers + "'"
					+ " AND CAR_NUM_PERS_FID = " + inum_pers
					+ " AND CAR_CVE_TIPO_HONO = '" + sTipo_hono + "'";

			if(iRows>0)
				iRows = stInstrucc.executeUpdate(query);			
			//se procede a actualizar el detalle de cartera
			query = "";
			query="UPDATE DETCART SET";
						
			if(status.equals("PAGADO"))
				{
					query += " DEC_IMP_REM_HONOR=0"
					+ " ,DEC_REM_IVA_HONOR=0";
				}
			else
				{					
					query += " DEC_IMP_REM_HONOR=DEC_IMP_REM_HONOR-"+ dImporteParcial; 
				}
					
			query += ",DEC_IMP_PAGOS_EFE=DEC_IMP_PAGOS_EFE + " +  num.format(Double.valueOf(sImporte).doubleValue())  
			+ " ,DEC_NUM_PAGOS_EFE=DEC_NUM_PAGOS_EFE+1";																	

			//verificar este status
			if(status.equals("PAGADO"))
			{
				query+=  ",DEC_CVE_CALIF_HONO='PAGADO'";
        query+=  ",DEC_CVE_PER_PAGADO= -1";
      }
								
			query   += " WHERE"
					+ " DEC_NUM_CONTRATO= "+sFiso
					+" AND DEC_CVE_PERS_FID ='"+scve_pers + "'"
					+ " AND DEC_NUM_PERS_FID ="+ inum_pers
					+ " AND DEC_CVE_TIPO_HONO ='" + sTipo_hono + "'"
					+ " AND DEC_FEC_CALC_HONO ='"+sFeccalc+"'"
					+ " AND DEC_NUM_SECUENCIAL="+sNumSec;
					
			if(iRows>0)
				iRows = stInstrucc.executeUpdate(query);				

			//se procede a insertar el pago correspondiente
			query = "";
			query   = "INSERT INTO PAGOSHON ("
					+ "PAG_NUM_CONTRATO,"
					+ "PAG_CVE_PERS_FID,"
					+ "PAG_NUM_PERS_FID,"
					+ "PAG_CVE_TIPO_HONO,"
					+ "PAG_FEC_CALC_HONO,"
					+ "PAG_NUM_SECUENCIAL,"
					+ "PAG_FEC_PAGO,"
					+ "PAG_NUM_PAGO,"
					+ "PAG_NUM_SERVICIO,"
					+ "PAG_NUM_TRAMITE,"
					+ "PAG_IMP_PAGO,"
					+ "PAG_IMP_IVA_HONOR,"
					+ "PAG_IMP_EXTEMP,"
					+ "PAG_NUM_MONEDA,"
					+ "PAG_DOCTO_REF,"
					+ "PAG_FEC_DOCTO_REF,"
					+ "PAG_ANO_ALTA_REG,"
					+ "PAG_MES_ALTA_REG,"
					+ "PAG_DIA_ALTA_REG,"
					+ "PAG_ANO_ULT_MOD,"
					+ "PAG_MES_ULT_MOD,"
					+ "PAG_DIA_ULT_MOD,"
					+ "PAG_CVE_ST_PAGOSHO,"
					+ "PAG_FOLIO_OPERA,"
					+ "PAG_IMP_TOTAL)"
					+ " VALUES ("
					+ sFiso + ",'"
					+ scve_pers + "',"
					+ inum_pers + ",'"
					+ sTipo_hono + "','"
					+ sFeccalc + "',"
					+ sNumSec + ",'"
					+ sFechaOper + "',"
					+ String.valueOf(sec_pago) + ","
					+ "0,";
					
			//se especifica el contrato de inversión			
			if(Scontrato==null)
				query+="0,";
			else
				query+= Scontrato + ",";														
			
			// Se comento para no  pagar el iva	
		 //query+=  num.format(Double.valueOf(sImporte).doubleValue()) + ",";
		  query+=  dImporteParcial + ",";
			query+=  0 + ",";			
			//moneda nacional			
			query+=  "0,1,";
			
			if (Scuenta==null)
			//se especifica la cuenta nafin donde se ubicarán los recursos
				query+=  "null,'";
			else
				query+=  "'"+Scuenta + "','";
				
			query += sFechaOper + "',"
						+ sFechaOper.substring(6,10) + ","
						+ sFechaOper.substring(3,5) + ","
						+ sFechaOper.substring(0,2) + ","
						+ sFechaOper.substring(6,10) + ","
						+ sFechaOper.substring(3,5) + ","
						+ sFechaOper.substring(0,2) + ","
						+ "'ACTIVO',"
						+ sFoliooper+ "," 
						+ sImporte + ")";
					
			if(iRows>0)
				iRows = stInstrucc.executeUpdate(query);														
									
		// Empieza		
		
		//JJR 21/04/2005
		// SE AGREGAN ESTOS VALORES EN LO QUE INFOTEC CORRIGUE FUNCIONALIDAD	
			// bFirmasM = super.firmasMancomunadas(sFiso);	
			// NOTA super.firmasMancomunadas(sFiso); SE DEBE EJECUTAR ANTES DE INICIAR LA TRANSACCION EN EL METODO ANTERIOR
			//if(bFirmasM || strFirma[0].equals("1"))
			//	sStatus="ESPERA";								
							
			//boolean	bFirmasM=false;	
			//		sStatus="ACTIVO";						
			
			// NO SE PIERDE LA CONECCION SI NO SE VALIDA LO DE FIRMAS
			// Vuelve a conectarse
			//if (conBD == null) if (!OpenBD()) return 0;
			//if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return 0;
			
			//stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);							
			//stInstrucc = conBD.createStatement();
			//conBD.setAutoCommit(false);	
						
			// Inserta regsitro el DETFOSEG			
				sDetFoSeg   = "INSERT INTO detfoseg (dfo_folio_opera,dfo_importe1,dfo_contrato1,"
				+ "dfo_importe2,dfo_contrato2,dfo_importe3,dfo_contrato3,"
				+ "dfo_dia_alta_reg,dfo_mes_alta_reg,dfo_ano_alta_reg"
				+ ",dfo_dia_ult_mod,dfo_mes_ult_mod,dfo_ano_ult_mod,"
				+ "dfo_cve_st_detfoseg)"
				+ " VALUES("+sFoliooper+","+0+","+ 0+","
				+ 0+","+ 0+","
				+ (Double.valueOf(sImporte).doubleValue()) +","+Scontrato+","
				+ d + ","
				+ m + ","
				+ a + ","
				+ d + ","
				+ m + ","
				+ a + ","
				+ "'"+sEstatus+"')";
					
		query=sDetFoSeg;	
		if (iRows>0)
			iRows = stInstrucc.executeUpdate(sDetFoSeg);//inserta en detfoseg
			
		// Si no hub error al Insertar en DETFOSEG CONTABILIZA
		if (iRows>0 && !sData[0].equals(""))
			iRows=contabilizaFoseg(sData[0],bFirmasM);//rendimientos  	
		// Finaliza										
		}						
		catch (Exception ex)
			{
				LOGGER.error("Exception: ", ex);
				LOGGER.debug("Error en el Metodo: registraPagoHonFos");
				LOGGER.debug(query);
			  iRows=0;
			}
		finally
			{
				return iRows;			
			}		
	}


	/*	
			Metodo:insertaPagoHonorarios
			Funcion: Registar el Pago de Honorarios Pendientes FOSEG
			Modificada por: 
			Fecha:14/12/2004
	*/
	public boolean insertaPagoHonFOSEG (String SFiso,
																		  String Scuenta,
																		  String Scontrato,
																		  String SImporte_cad,
																		  String FolioOpera,	
																		  String[] sCont,																	  
																		  String[] bitacora,
																		  String[] strFirma)
		{				
			String query="";
			String[] sData = new String[8];
			String sFechaOper=null;
			String sAdeudo=null;
			String sCalculo=null;			
			String sEstatus="ACTIVO";
			double dImporteParcial=0.0,
						 dImporteParcIva=0.0,
						 SImporte=0.0;
						
			int i=0,inumpago=0;		
			boolean bInstruccion=false;	
			boolean bFirmasM=false;
											
		  SImporte=Double.valueOf(SImporte_cad).doubleValue();			
			
			//formato cuenta			
			if(Scuenta!=null)
			{
				int j = Scuenta.length();
	   			Scuenta=Scuenta.trim();
	   			int cont=0;
	   			for(j=(Scuenta.length()-1);j>=0&&cont==0;j--)
		   			if(Scuenta.charAt(j)==' ')
						{
							cont++;
						}
		   			Scuenta=Scuenta.substring((j+2),Scuenta.length());
  		}   			
			sFechaOper=getFecha();			 //se obtiene fecha de operacion
			
		try
			{								
				if (conBD == null) if (!OpenBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
				
				stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);							
				stInstrucc = conBD.createStatement();
				conBD.setAutoCommit(false);	
			   				
				query   = " SELECT DISTINCT "
				        + " DEC_NUM_CONTRATO,"
				        + " DEC_CVE_PERS_FID,"
								+ " DEC_NUM_PERS_FID,"
								+ " DEC_CVE_TIPO_HONO,"
								+ " DEC_FEC_CALC_HONO,"
								+ " DEC_NUM_SECUENCIAL,"
								+ " DEC_IMP_REM_HONOR,"
								+ " DEC_REM_IVA_HONOR, "
								+ " DEC_ANO_PER_DEL,DEC_MES_PER_DEL "
								+ " FROM "
								+ " DETCART "
								+ " WHERE"
								+ " DEC_NUM_CONTRATO=" + SFiso
								+ " AND "
								+ " DEC_CVE_CALIF_HONO='PENDIENTE'"
								+ " ORDER BY	DEC_ANO_PER_DEL ASC,"
								+ " DEC_MES_PER_DEL ASC ";								
					
				rsQuery= stQuery.executeQuery(query); 
				if(rsQuery.next())
					{																						
						sData[0] = rsQuery.getString(1);
						sData[1] = rsQuery.getString(2);
						sData[2] = rsQuery.getString(3);
						sData[3] = rsQuery.getString(4);
						sData[4] = rsQuery.getString(5);
						sData[5] = rsQuery.getString(6);
						sData[6] = rsQuery.getString(7);
						sData[7] = rsQuery.getString(8);	// iva
					
						inumpago=1;				
						dImporteParcial=0;
						dImporteParcIva=0;
						rsQuery.close();	
						
						String dImpPago, dImpHon;	
				
						dImpPago = num.format(Double.parseDouble(SImporte_cad)/1.15);
						dImpHon  = num.format(Double.parseDouble(sData[6])) ;
						
						//LOGGER.debug("Importe del pago = " + dImpPago);
 						//LOGGER.debug("Adeudo de Honorarios = " + dImpHon);
 						
						bFirmasM = firmasMancomunadas(SFiso);	
						
						if (conBD == null) if (!OpenBD()) return false;
						if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
						
						if(bFirmasM || strFirma[0].equals("1"))
							sEstatus="ESPERA";			 						
 						
						if( dImpPago.equals(dImpHon))
							sCalculo  = "PAGADO";
						else
							sCalculo = "PARCIAL";				
											
						if( Integer.valueOf(sData[4].substring(6,10)).intValue() > 2001 )
							{
								//ejercicio nuevo	
								dImporteParcial=SImporte;
								iRows=registraPagoHonFos(SFiso,Scuenta,Scontrato,sData[1],sData[2],sData[3],sData[4],sData[5],sFechaOper,num.format(dImporteParcial),"0",FolioOpera,String.valueOf(inumpago),sCalculo,sEstatus,sCont,strFirma);													
							}		
						else
							{
								//Ejercicio Anterior"
								dImporteParcial=SImporte;
								dImporteParcIva= (SImporte/1.15)*.15;																
								iRows=registraPagoHonFos(SFiso,Scuenta,Scontrato,sData[1],sData[2],sData[3],sData[4],sData[5],sFechaOper,num.format(dImporteParcial),num.format(dImporteParcIva),FolioOpera,String.valueOf(inumpago),sCalculo,sEstatus,sCont,strFirma);					
							}					
				}
						
		if(iRows>0)			
			iRows=insertaBitacora(bitacora);

		// Inserta Firmas
    if(iRows>0){
    	if(bFirmasM){
					if(!insertaFirma(strFirma)){
							iRows=0;
	      	}  		
	  	}
  	}

		if(iRows>0)
		   	{
			   	LOGGER.debug("El Pago de Honorarios FOSEG con Folio: "+ FolioOpera+ " SATISFACTORIO");
			   	conBD.commit();
			   	bInstruccion=true;
		   	}
		 else
		   	{
			   	LOGGER.debug("El Pago de Honorarios FOSEG con Folio: "+ FolioOpera+ " NO SATISFACTORIO");
			   	conBD.rollback();
			   	conBD.commit();
			   	bInstruccion=false;
		   	}
		}
		catch (Exception ex)
		{
			try	
			{
				conBD.rollback();
				conBD.commit();
				LOGGER.debug("No se Registro el Pago de Honorarios FOSEG con Folio:"+FolioOpera);
				LOGGER.debug("Error: "+ex);
			}
			catch (Exception error)
			{
				LOGGER.debug("No se realizo el rollback");
				LOGGER.debug("Error: "+error+"\n"+sQuery);					
				}
			bInstruccion=false;
		    
		}
		finally
		{
			bContabilizado=false;
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonorarios");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonorarios");LOGGER.error("Exception: ", ex); }
			
			return bInstruccion;
		}		
	}		
	
	
	/* Metodo que obtiene el saldo de los movimientos
		 efectuados entre dos fechas, de acuerdo a si 
		 es fin de semana o si es dia feriado
		 sNumFid Numero d eFideicomiso
	*/
	public String[][] getCRen(String sNumFid)
	{	
		Calendar calHoy = Calendar.getInstance();		
		DateFormat formatoD;
    formatoD = DateFormat.getDateInstance();
  	String sFechaact=null;	
  	String[] sData2 = new String[1];
  	String[][] sData = null;
  	
  	char c;    
		int idia = 0;
		int d,m,a;
		
		String Sfecha ;
		String dFechaIni, dFechaFin;
		
		int i;
		double dImp = 0;
		String sImp = null;
				
		// Verifica fecha del sistema
		sFechaact=getFecha();				
		d=Integer.parseInt(sFechaact.substring(0,2));//dia
		m=Integer.parseInt(sFechaact.substring(3,5));//mes
		a=Integer.parseInt(sFechaact.substring(6,10));//año
		
		Sfecha  = a+"/"+m+"/"+ d; // Se construye la fecha
		calHoy.setTime(new Date(Sfecha));
		
		// Verifica que dia de la semana es
		cal = (Calendar)calHoy.clone();
		cal.getTime();
		dFechaHon= cal.getTime();	  										
		dFechaIni=formatoD.format(dFechaHon); // Fecha Inicial
		
		try
		{
		if(dFechaHon.getDay()== 1) 
			{
				// Si es lunes le resta tres dias
				cal.add(Calendar.DAY_OF_MONTH, -3);
			}		
		
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;	
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			m=0;
			cal.add(Calendar.DAY_OF_MONTH, -1); // Resta un dia para verificar si el dia es feriado
			// Verifica que si los dias anteriores son feriados			
			while ( m != -1)
				{						
					dFechaHon= cal.getTime();
					Sfecha = formatoD.format(dFechaHon); 
					idia=0;
					sData2[0] = "";
					c = Sfecha.charAt(idia);
					while(c!= '/')					
					{
							sData2[0]+=Sfecha.charAt(idia);
							idia++;
							c = Sfecha.charAt(idia);
					}
					
					sQuery = "SELECT COUNT(*) ";
					sQuery += " FROM feriados";
					sQuery +=" WHERE fer_num_pais=1 "  ;
					sQuery +=" AND fer_fec_mes=" + (dFechaHon.getMonth()+1);	
					sQuery +=" AND fer_fec_dia=" + sData2[0];						

					rsQuery=stQuery.executeQuery(sQuery); 
					
					if(rsQuery.next())	
						m=rsQuery.getInt(1);
						if(m!=0)				
						{							
							cal.add(Calendar.DAY_OF_MONTH, -1);
							// Verifica si el dia es lunes
							if(dFechaHon.getDay()== 1) 
								{
									// Si es lunes le resta tres dias
									cal.add(Calendar.DAY_OF_MONTH, -3);
								}		
							m = 0;
						}
					else
						{
							m = -1;
						}											
				}
				
			dFechaHon= cal.getTime();
			dFechaFin = formatoD.format(dFechaHon);	// Fecha Final
				
			sQuery = "SELECT ORIGEN, SUM(MOVIMIENTO) ";
			sQuery += "FROM MOV_CONTRATO_INV, BITACORA ";
			sQuery += "WHERE MOV_CONTRATO_INV.\"ANO_ULT_MOD\" = bitacora.\"BIT_ANO_TRANSAC\" ";
			sQuery += "AND MOV_CONTRATO_INV.\"MES_ULT_MOD\" = bitacora.\"BIT_MES_TRANSAC\" " ;
			sQuery += "AND MOV_CONTRATO_INV.\"DIA_ULT_MOD\" = bitacora.\"BIT_DIA_TRANSAC\" ";
			sQuery += "AND MOV_CONTRATO_INV.\"INS_NUM_FOLIO_INST\" = bitacora.\"BIT_SEG_TRANSAC\" ";
			sQuery += "AND BITACORA.BIT_DET_BITACORA NOT LIKE '%espera%' ";
			sQuery += "AND ((TO_DATE(BIT_DIA_TRANSAC||'/'||BIT_MES_TRANSAC||'/'||BIT_ANO_TRANSAC,'DD/MM/YYYY') = TO_DATE('" + dFechaIni + "','DD/MM/YYYY')) ";
			sQuery += "OR(TO_DATE(BIT_DIA_TRANSAC||'/'||BIT_MES_TRANSAC||'/'||BIT_ANO_TRANSAC,'DD/MM/YYYY') = TO_DATE('" + dFechaFin + "','DD/MM/YYYY') ";
			sQuery += "AND   TO_DATE(TO_CHAR(BIT_HORA_TRANSAC,'00')||':'||TO_CHAR(BIT_MIN_TRANSAC,'00'),'hh24:mi') > TO_DATE(HORARIO,'hh24:mi'))) ";
			sQuery += "AND MOV_CONTRATO_INV.INS_NUM_CONTRATO=" +sNumFid;
			sQuery += " GROUP BY CONTRATO_INTER, ORIGEN"	;	

			dImp=0;			
			rsQuery=stQuery.executeQuery(sQuery); 

			if(rsQuery.next())
			 {
					rsQuery.last();	
		 			sData = new String[rsQuery.getRow()][2];						
					rsQuery.first();
					a=0;
					do
						{
							sData[a][0]= rsQuery.getString(1).trim();
							dImp=rsQuery.getDouble(2);
							Sfecha=nfFormato.format(dImp);
							sData[a][1]= Sfecha;							
							a++;
						}while(rsQuery.next()); 	 // fin de while(rsQuery.next())
				}				 											// fin de if(rsQuery.next())									
				
			return sData;	            
		}
		
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
			LOGGER.debug("Error de getCRen");
			LOGGER.debug(sQuery);
			return sData;	
		}				
		finally
		{
			//LOGGER.debug("Cerrando finally de la base de getCRen");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		}
	}		
	
	/***************************************************** 		
				Fin Metodos para obtener los honorarios FOSEG	
	*******************************************************/	
    
	

			/*	
				Metodo:	insertaInterFid
				Funcion: Registra las instrucciones de Traspaso entre FIdeicomisos
									Retito y Deposito
				Parametros: 
				
					Un arreglo con toda la información del retiro
						sDataR[0] = fecha
						sDataR[1] = folio
						sDataR[2] = fiso
						sDataR[3] = contrato 
						sDataR[4] = importe del retiro
						sDataR[5] = tipo de operacion (SI=RUTINARIA, NO= NO RUTINARIA)
						sDataR[6] = concepto del retiro
						sDataR[7] = forma de liquidacion
					
					Un arreglo con toda la información del deposito
						sDataD[0] = fecha				fecha,
						sDataD[1] = folio				folio,
						sDataD[2] = iNumFid			Numero de fideicomiso,
						sDataD[3] = nomUsuario	Usuario,
						sDataD[4] = iNumCta ,
						sDataD[5] = iImpDeposi	importe del deposito,
						sDataD[6] = sConceptoR,
						sDataD[7] = sConceptoNR,
						sDataD[8] = iCtoInver		Contrato de Inversion,
						sDataD[9] = sInstrume		Instrumento 	
					
				Fecha:Abril,2005
			*/
			
			
			public boolean insertaInterFid( String[] sDataR,
											String[] sDataD,
											String[] bitacoraR,
											String[] bitacoraD)
				{				
				String  query="";
				int dia,mes,anio;
				dia = Integer.parseInt(sDataR[0].substring(0,2));//dia
				mes = Integer.parseInt(sDataR[0].substring(3,5));//mes
				anio = Integer.parseInt(sDataR[0].substring(6,10));//año
				
				int d,m,a;
				String ImporteD;
				String cuenta;
				d=Integer.parseInt(sDataD[0].substring(0,2));//dia
				m=Integer.parseInt(sDataD[0].substring(3,5));//mes
				a=Integer.parseInt(sDataD[0].substring(6,10));//año
				
				boolean tipoFiso=getTipoFiso(sDataR[2]);//valida si es un fiso de FOSEG
				
				String 	tipoPersFid="",
								sDetLiq="",  
								sCveConcepto="0", 
								sSecOperacion="0";
								
				String sDetFoSeg="";
			
				String sMovimi="",
							sfolio= "";
				
				iRows=0;
				boolean bInstruccion=false;
				boolean bError=false;
				
					
				 try{  
			 	   
				if (conBD == null) if (!OpenBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
					
					stInstrucc = conBD.createStatement();
					conBD.setAutoCommit(false);	
					
					//Operacion no rutinaria, obtener la clave y el secuencial asignado a la operacion
				    if ((sDataR[5]).equals("SI")){
					    	sCveConcepto=getKey(2,sDataR[6]);  			    	//Clave
					    	sSecOperacion=getKey(4,sDataR[2] + 
					    								" AND oaf_num_operacion=" +
					    								sCveConcepto + 
					    								" AND oaf_automatico=0"); 			//Secuencial
					  	}
					sfolio = sDataR[1];	
					sInstrucc 	=  "INSERT INTO instrucc (ins_num_contrato, ins_num_folio_inst, "
									  	+ "ins_sub_contrato, ins_txt_comentario,ins_cve_tipo_instr,"
											+ "ins_num_miembro, ins_nom_miembro, ins_ano_alta_reg,"
											+ "ins_mes_alta_reg, ins_dia_alta_reg, ins_ano_ult_mod,"
											+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc)"
											+ " VALUES(" + sDataR[2] + "," + sDataR[1] + ",0,0,'"
											+ "LIQUIDACION INTERNET',0,0," + anio
											+ "," + mes + "," + dia
											+ "," + anio + "," + mes
											+ "," + dia + ",'ACTIVO')";
									
					sMovimi = "Retiro ";
					sDetLiq = "INSERT INTO detliqui (del_folio_opera, del_num_operacion,"
									+ "del_num_sec_opera, del_num_modulo, del_num_transac,"
									+ "del_num_contrato,del_sub_contrato,del_sub_programa,"
									+ "del_num_pers_fid, del_nom_pers_fid, del_tipo_pers_fid,"
									+ "del_folio_oper_sis,del_benef_xtercer, del_imp_liquidar,"
									+ "del_paridad, del_cve_tipo_liq, del_num_moneda,"
									+ "del_cve_tipo_cta, del_num_banco, del_nom_banco,"
									+ "del_num_plaza, del_nom_plaza, del_num_sucursal,"
									+ "del_num_cuenta, del_num_pais,del_num_cheque,"
									+ "del_cta_banxico, del_dir_aper_cta, del_codigo_trans,"
									+ "del_num_iniciativa, del_num_ctam, del_num_scta,"
									+ "del_num_sscta, del_num_ssscta, del_nom_area, del_concepto,"
									+ "del_ano_alta_reg, del_mes_alta_reg,del_dia_alta_reg,"
									+ "del_ano_ult_mod, del_mes_ult_mod, del_dia_ult_mod,"
									+ "del_cve_st_detliqu, del_rubro, del_entidad_fin,"
									+ "del_contrato_inter) VALUES(";
							
					if(tipoFiso)
						tipoPersFid	= sDataR[22];
					else
						tipoPersFid= " ";			
				
					// Nuevo codigo para insretar traspasos interfideicomisos
					if(sDataR[7].equals("2311"))
					{
						int iEntFin = 0;	
						String SQL = "",sQuery2="",sCpto="";
						int iRubro=28;
							
						SQL= "SELECT  CPR_ENTIDAD_FIN from continte"
						+ " WHERE CPR_NUM_CONTRATO = " + sDataR[2]
						+ " AND CPR_CVE_ST_CONTINT = 'ACTIVO' "
						+ " AND CPR_CONTRATO_INTER = "+ sDataR[3];				
			
							sQuery2= "SELECT  CTO_NOM_CONTRATO	FROM   CONTRATO"
						+ " WHERE CTO_NUM_CONTRATO = " + sDataR[8];					
			
						rsQuery = stInstrucc.executeQuery(SQL);
						if(rsQuery.next())	
						   iEntFin =rsQuery.getInt(1);  
						   
						 if(iEntFin ==1) 
						 	iRubro =20;
						 else
						 	iRubro =28;											   
						 	
						// Descripcion del nombre del contrato origen				
						rsQuery = stInstrucc.executeQuery(sQuery2);
						if(rsQuery.next())	
						   sCpto =rsQuery.getString(1);  
								
						sDetLiq +=sDataR[1] 	+ "," 
							+ 0 + ", 1,0,0," 
							+  sDataR[2] 
							+ ",0,31,0,'" 
							+ sCpto + "','" + tipoPersFid 
							+ "',0,0," + sDataR[4] 
							+ ",0,9,0,' ',0,'"
							+ sDataR[9] + "', 0,'',0,'',1,0,'','', '',0,"
							+ sDataR[10] + "," 
							+ sDataR[11] + "," 
							+ sDataR[12] + ",0,'" 
							+ sDataR[13] + "','" 
							+ sDataR[6] + "'," 
							+ anio + "," + mes + "," + dia + "," + anio+ "," 
							+ mes + "," + dia + ",'ACTIVO'" + "," 
							+ iRubro + "," + iEntFin + "," + sDataR[3] + ")" ;						
					}
					
					query=sInstrucc;	
					iRows = stInstrucc.executeUpdate(sInstrucc);//inserta en instrucc
					query=sDetLiq;
					if (iRows>0)
						iRows = stInstrucc.executeUpdate(sDetLiq);//inserta en detliqui				
				   			    	
					 //Inserta un registro de la operación en la bitacora
					if(iRows>0)
					    iRows=insertaBitacora(bitacoraR);
			
							    					
								
					//Se recupera la clave de la operacion rutinaria
					if (sDataD[6]!=null){
			   				sQuery = "SELECT opf_num_operacion FROM operfid WHERE opf_descripcion='"
			   				+ sDataD[6] +"'"; 
			   				rsQuery = stInstrucc.executeQuery(sQuery);
			   				if(rsQuery.next())	
			   				   sDataD[7] =rsQuery.getString(1);  				
		   			  }
		   			    
					if(sDataD[6]==null){
							sDataD[6] = sDataD[7];
		   				sDataD[7] ="0"; 				
	 					}
			 										
					if(sDataD[9]==null)
		   				sDataD[9] ="0";
		   						   			
		   			int j = sDataD[4].length();
		   			sDataD[4]=sDataD[4].trim();
		   			int cont=0;
		   			for(j=(sDataD[4].length()-1);j>=0&&cont==0;j--)
				   	if(sDataD[4].charAt(j)==' ')
						    {
						    	cont++;
						   	}
							   				   
		   			String cuentaS=sDataD[4].substring((j+2),sDataD[4].length());			   					   				
		   			
			 		sfolio = sDataD[1];
						 			
					sInstrucc="Insert into Instrucc (ins_num_contrato, ins_num_folio_inst,"
							+ "ins_sub_contrato, ins_txt_comentario,ins_cve_tipo_instr,"
							+ "ins_num_miembro, ins_nom_miembro, ins_ano_alta_reg,"
							+ "ins_mes_alta_reg, ins_dia_alta_reg, ins_ano_ult_mod,"
							+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc)"
							+ " values ("
							+ sDataD[2] + "," + sDataD[1] + ",0,0,'RECEPCION INTERNET',"
							+ "0,'0',"
							+  a +","+ m +","+ d +","
							+  a +","+ m +","+ d +","
							+ "'ACTIVO')";
						
					            
			        if(iRows>0)
			        	iRows = stInstrucc.executeUpdate(sInstrucc);
			             
					int iEntFin = 0;
					int iRubro=28;	
					String SQL = "",sQuery2="";
						
					SQL	= "SELECT  CPR_ENTIDAD_FIN from continte"
						+ " WHERE CPR_NUM_CONTRATO = " + sDataD[2]
						+ " AND CPR_CVE_ST_CONTINT = 'ACTIVO' "
						+ " AND CPR_CONTRATO_INTER = " + sDataD[8] ;
						
					sQuery2	= "SELECT  CTO_NOM_CONTRATO	FROM   CONTRATO"
							+ " WHERE CTO_NUM_CONTRATO = " + sDataD[7];
												
	   				rsQuery = stInstrucc.executeQuery(sQuery);
	   				
	   				if(rsQuery.next())
		   				{				   			    
		   				     iEntFin = rsQuery.getInt(1);  		   				   
			   				 if(iEntFin ==1) 
				   				 	iRubro =20;
			   				 else
				   				 	iRubro =28;
		   				}
		   				
					sDataD[6] = sDataD[6] +" / TRASPASO INTERNO DEL FIDEICOMISO " + sDataD[7] + " , CONTRATO: " + sDataD[9];
						   
					sMovimi = "Deposito ";							
					sInstrucc 	=  "Insert into Deposit values ("
								+ "0," + sDataD[1] +",0,0,0,0," + 
								sDataD[2] +""+ ",0,8,0,0,0,0,'0','0',9,"+ 
								sDataD[5] +"," + "0,0,'" 
								+ "" + "',0,'',1001,'DF',0,"
								+ "0,'','','" +sDataD[6] + "',"
								+ 2351 + ",'0',''," + "0,0,'',0,2311,90,33,0,3427,'FIDUCIARIA',"
								+ iEntFin + ","
								+ sDataD[8]  +","
								+ "1,"+ a +","+m +","+ d +","+ 
								a +","+ m +","+ d +","+ a +","+ m +","+ d +","+ "'" 
								+ "ACTIVO" + "',0,0,0," + iRubro + ")";								
						
		
					if(iRows>0)
						iRows = stInstrucc.executeUpdate(sInstrucc);
		
					//Inserta un registro de la operación en la bitacora
					if(iRows>0)
		 			    iRows=insertaBitacora(bitacoraD);	
		 			    
		 			    
		 			    
		 				if(iRows>0) 
		 						{
								 LOGGER.debug("Traspaso Inter Fideicomiso:");	
								 LOGGER.debug("		Retiro   con Folio: " + sDataR[1]);	
								 LOGGER.debug("		Deposito con Folio: " + sDataD[1]);
							     conBD.commit();
							   	 bInstruccion=true;
							  		
								} 
						else 	{
								 LOGGER.debug("No se registro el Traspaso Inter Fideicomiso:");	
								 LOGGER.debug("		Retiro   con Folio: " + sDataR[1]);	
								 LOGGER.debug("		Deposito con Folio: " + sDataD[1]);
							     
								conBD.rollback();
								conBD.commit();
								bInstruccion=false;
								}	    				
					}
							catch (Exception ex)
							{
								LOGGER.debug("Funcion: insertaInterFid");
								LOGGER.debug("Error: "+ex);
								LOGGER.error("Exception: ", ex);
								LOGGER.debug(sInstrucc);
								LOGGER.debug(sQuery);
								try{
									LOGGER.debug("No se registro el Traspaso Inter Fideicomiso:");	
									LOGGER.debug("		Retiro   con Folio: " + sDataR[1]);	
									LOGGER.debug("		Deposito con Folio: " + sDataD[1]);
									conBD.rollback();
									conBD.commit();
									LOGGER.debug("rollback");
									}
								catch(SQLException e)
									{				
										LOGGER.debug("Error al realizar el roll back: :"+e);	
									}	
								bInstruccion=false;
							}
							finally
							{
							try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
							try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaInterFid");LOGGER.error("Exception: ", ex); }
							try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaInterFid");LOGGER.error("Exception: ", ex); }
							return bInstruccion;
							}																
	}
	
	
	/*
		
	Metodo:	insertaPagoHonor
	Funcion: Registra el pago de honorarios de programas)
	Parametros: Un arreglo con toda la información del pago
		sdata[0] = fiso
		sdata[1] = folio
		sdata[2] = importe honorarios
		sdata[3] = iva 
		sdata[4] = retencion iva 
		sdata[5] = retencion isr
		
	Modifico: 

	
	public boolean insertaPagoHonor( String[] sData)
	{			
	 String  query="";
	         
   iRows=0;
	 boolean bInstruccion=false;

 	 try{      
		if (conBD == null) if (!OpenBD()) return false;
		if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return false;
			
			stInstrucc = conBD.createStatement();
			conBD.setAutoCommit(false);	
			
			  	
			sInstrucc 	=  "INSERT INTO DETLIQUI_HONO (DETH_NUM_CONTRATO, DETH_FOLIO_OPERA, "
									+ "DETH_IMP_TOT, DETH_IMP_HONOR,DETH_IVA,"
									+ "DETH_RET_ISR, DETH_RET_IVA)"
									+ " VALUES(" + sData[0] + "," + sData[1] + "," + sData[6] 
									+"," + sData[2] + "," + sData[3] +"," + sData[4]+"," + sData[5] + ")";												


			LOGGER.debug("Pago de honorarios con Folio "+ sData[1]); 					
			query=sInstrucc;	
			iRows = stInstrucc.executeUpdate(sInstrucc);//inserta en instrucc				
			 
				if(iRows>0) 	{
					conBD.commit();
					LOGGER.debug("Pago con Folio:"+ sData[1]+ " SATISFACTORIO");
					bInstruccion=true;
				}  		
				else	{
					conBD.rollback();
					conBD.commit();
					LOGGER.debug("Pago con Folio:"+ sData[1]+ " NO SATISFACTORIO");
					bInstruccion=false;
				}
			}
		catch(SQLException ex){
			LOGGER.debug("Error de insertaPagoHonor:"+ex);
			LOGGER.debug("Pago con Folio:"+ sData[1]+ " NO SATISFACTORIO");
			LOGGER.debug(query);
			
			try{
				conBD.rollback();
				conBD.commit();
				LOGGER.debug("rollback");
				}
			catch(SQLException e)	{						
				LOGGER.debug("Error al realizar el roll back: :"+e);	
				}
			bInstruccion=false;
		}
		finally {
		//LOGGER.debug("Cerrando Finally de la base de insertaPagoHonor");
		try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonor");LOGGER.error("Exception: ", ex); }
		try { conBD.setAutoCommit(false);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonor");LOGGER.error("Exception: ", ex); }
		return bInstruccion;
		}		
	}

*/		
/**************************************************************************************/


	/*
	Metodo: getDatosAcuerdoCT
	Funcion: Regresa los datos que son parte del PK de un acuerdo
	Autor: Jannett Jimènez Ruiz
	Fecha:17/02/2006
	Parametros:(strDatos,StrBitacora)
				sDatos[0]=Fecha de Sesion
				sDatos[1]=Tipo de Sesion
				sDatos[2]=No de Acuerdo
	*/
	
	private String[] getDatosAcuerdoCT(String numfiso,String numfolio)
		{	
		String[] sDatos = new String[4];
		try
		{
			
			// conectandose a la base
			if (conBD == null) if (!OpenBD()) return sDatos;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return sDatos;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			sQuery = " SELECT to_char(i.ses_fecha,'dd/mm/yyyy'), i.ses_tipo, i.acu_id,TRIM(TO_CHAR(d.del_imp_liquidar,'9999999999999999999.99'))"
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
			LOGGER.error("Exception: ", ex);
    			}
		finally
				{
					try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
					try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
					try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
				}
		return sDatos;
	}
	
	
	    	/*
	Metodo: insertaFirmaTrasp
	Funcion: Llena la tabla de Firmas Mancomunadas
					Con dos campos nuevos, solo para los traspasos
						InterFideicomidos
	Autor:
	tipoUsuario=1 // USUARIO DE CAPTURA
	tipoUsuario=2 // USUARIO OPERATIVO
	
	*/
	/*
	private boolean insertaFirmaTrasp(String[] strParametros,String FolioD,String FisoD)
		{
		boolean insertaFirmaTrasp=false;
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
						          + "fir_fecha_captura,"		
						          + "FIR_FISO_DEST,"
						          + "FIR_FOLIO_DEST"			          
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
						          + "TO_DATE('"+fecha+"','DD/MM/YYYY'),"
						          + FisoD +"," +FolioD
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
						          + "fir_fecha_firma1,"					          
						          + "FIR_FISO_DEST,"
						          + "FIR_FOLIO_DEST"
						          +") "
						          + " VALUES "
						          + "("
						          + folioOpera + ","
						          + numFiso + ","
						          + numUsuario + ","
						          + numUsuario+ ","
						          + "0,"
						          + "'ACTIVO',"
						          + "'ESPERA',"
						          + "TO_DATE('"+fecha.trim()+"','DD/MM/YYYY'),"
						          + "TO_DATE('"+fecha.trim()+"','DD/MM/YYYY'),"
						          + FisoD +"," +FolioD
						          + ")";
						break;				          
			}

		
	    if(stInstrucc.executeUpdate(sInstrucc)>0)
				insertaFirmaTrasp=true;
			
		}
		catch (SQLException ex)
		{
			LOGGER.debug("Error al insertaFirmaTrasp");
			LOGGER.error("Exception: ", ex);
			LOGGER.debug(sInstrucc);
		}
			catch (Exception ex)
		{
			LOGGER.debug("Error al insertaFirmaTrasp");
			LOGGER.error("Exception: ", ex);
			LOGGER.debug(sInstrucc);
		}
		finally
		{
			return insertaFirmaTrasp;
		}
	}	
	*/
	}
	

