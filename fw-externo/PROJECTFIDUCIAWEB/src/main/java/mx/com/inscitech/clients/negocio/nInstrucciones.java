/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

/*
Clase:   nInstrucciones
Funcion: Insertar las Intrucciones:

								  1.- Deposito 
								  2.- Retiro   
								  3.- Traspaso  
								  4.- Pago de Honorarios
								  5.- Autorizaci?n de Instrucciones Pendientes								  
*/

package mx.com.inscitech.clients.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.lib.MasterServices;

import mx.com.inscitech.clients.lib.serviciosenvio;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.util.Calendar;


import javax.mail.*;
import javax.mail.internet.*;
import javax.naming.*;

public class nInstrucciones extends nFiducia
	{
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
        String[] resultado={null},sArreglo={null};
        MasterServices serv = new MasterServices();
        serviciosenvio envio = new serviciosenvio();
		/*
    Metodo: folioAutorizado
    Funcion: Validar que la instrucionno este autorizada (ACTIVO)
    */
    
	public boolean folioAutorizado(String numFid,String folio,int tipo)
	{
		try
		{
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
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
    */
	public boolean existeFolio(String folio,int tipoInstruccion)
	{
		boolean bReturn= false;
		try
		{
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			switch(tipoInstruccion)
					{
					case 1://deposito
					case 2://retiro
					case 3://traspaso
					case 4://pago de honorarios
							sQuery  = "select "
									+ " COALESCE(COUNT(1),0) "
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
		
	Metodo: insertaRetiro
	Funcion: Registra las instrucciones de liquidacion(retiro)
	Parametros: Un arreglo con toda la informaci?n del retiro
	        sdata[0] = fecha
	        sdata[1] = folio
	        sdata[2] = fiso
	        sdata[3] = contrato 
	        sdata[4] = importe del retiro
	        sdata[5] = tipo de operacion (SI=RUTINARIA, NO= NO RUTINARIA)
	        sdata[6] = concepto del retiro
	        sdata[7] = forma de liquidacion
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
	 anio = Integer.parseInt(sData[0].substring(6,10));//a?o
	
	boolean tipoFiso=getTipoFiso(sData[2]);//valida si es un fiso de FOSEG
	boolean bComiteTecnico= n.aplica(Integer.parseInt(sData[2]),sData[62]);
	 String tipoPersFid="",sDetLiq="", sDetSWIFT="",sAcuerdo="", sCveConcepto="0", sSecOperacion="0",sDetRetiro="",sDetRetxCtoInver="";
	 String sDetFoSeg="", sStatus="ACTIVO";
	
	//------ I. PREOCUPANTE ---------
	String sfiso = sData[2];
	BigDecimal bdimporte = new BigDecimal(sData[4]);
	String cveMov = "RETIRO";
	String stInterna = "INUSUAL";
	String st24Horas = "24 HORAS";
	String cveMoneda = sData[65];
	String numPais = sData[55];
	String sfecha = sData[0];
	
	cveMoneda=(sData[55].equals("1")?"MONEDA NACIONAL":"DOLAR AMERICANO");
        String []sProv={null};
	//------------------------------
	
	 String sHonorarios="",dFechaAcuerd="";       
	iRows=0;
	 boolean bInstruccion=false;
	 /*
	 ESPERA = 'USUARIO DE CAPTURA'
	 ACTIVO = 'USUARIO OPERATIVO'
	 */
	 
	 boolean bFirmasM = false;//firmasMancomunadas(sData[2] );      
	 if(strFirma[0].equals("1"))
	                sStatus="ESPERA";

	 try{      
	        if (conBD == null) if (!conectarBD()) return false;
	        if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
	                
	                stInstrucc = conBD.createStatement();
	                conBD.setAutoCommit(false);     
	                
	                //FIN SE INCORPORA UNA BITACORA DE PLD PARA CONSULTAS HISTORICAS

	                //SE INCORPORAN LOS PK DE LA TABLA DE ACUERDOS_CT
	                //PARA PODER REALIZAR EL MANEJO DE ACUEDOS EN INSTRUCCIONES DE RETIRO                           
	                sInstrucc       =  "INSERT INTO instrucc"
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
	                                        + "ins_cve_st_instruc,INS_NUM_OPER)"
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
	                                        + "," +"'"+ sStatus + "'";
	            if(sData[7].equals("3"))
                                    sInstrucc+=",'10002')";                    
	            else if(sData[7].equals("31"))
	                            sInstrucc+=",'10008')";             
	            else if(sData[7].equals("11"))
	                            sInstrucc+=",'10009')";             
	            else if(sData[7].equals("2"))
	                            sInstrucc+=",'10010')";             
	            else if(sData[7].equals("21"))
	                            sInstrucc+=",'10015')";             
                                sProv=new String[8];
                                sProv[0]="2";//"retiro"
                                sProv[1]=sData[2];//fiso
                                sProv[2]=sData[1];//folios
                                sProv[3]=anio+"";
                                sProv[4]=mes+"";
                                sProv[5]=dia+"";
                                sProv[6]=sStatus;
                                sProv[7]=sData[7];//operacion

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
	            LOGGER.debug("Entro a realizar el retiro");                               
	//SE INSERTA EN LA TABLA DE RETIRO DE FIDUCIAWEB
	  sDetRetiro = "INSERT INTO F_RETIRO (FRET_ID_RETIRO,"
	  + "FRET_IMP_RETIRO,"
	  + "FRET_FECHA,"
	  + "FRET_MONEDA,"
	  + "FRET_DESCRIPCION,"
	  + "SES_FECHA,"
	  + "SES_TIPO,"
	  + "ACU_ID,"          
	  + "FFID_ID_FIDEICOMISO,"
	  + "FRET_CONCEPTO,"
	  + "FRET_TIPO_LIQUIDACION,"
	  + "FRET_STATUS_RET,"
	  + "FRET_NOM_BENEFICIARIO,"
	  + "FRET_REFERENCIA_CIE,"
	  + "FRET_PAIS_DOMICILIARIO_SWIFT,"
	  + "FCBA_CLABE_CBA,"
	  + "FRET_CIUDAD_DOMICILIARIO_SWIFT,"
	  + "FRET_PLAZA_DOMICILIARIO_SWIFT,"
	  + "FRET_SUCURSAL_DOMICILIA_SWIFT,"
	  + "FRET_BANCO_DOMICILIARIO_SWIFT,"
	  + "FRET_CUENTA_DOMICILIARIO_SWIFT,"
	  + "FRET_BRANCH_DOMICILIARIO_SWIFT,"
	  + "FRET_MONEDA_DOMICILIARIO_SWIFT,"
	  + "FRET_IMPORTE_ME_SWIFT,"
	  + "FRET_CODIGO_SAI_SWIFT,"
	  + "FRET_TIPO_ABA_IBAN_SWIFT,"
	  + "FRET_NOM_BENEFICI_SWIFT,"
	  + "FRET_PAIS_BENEFICI_SWIFT,"
	  + "FRET_CIUDAD_BENEFICI_SWIFT,"
	  + "FRET_DIMICILIO_BENEFICI_SWIFT,"
	  + "FRET_TELEFONO_BENEFICI_SWIFT,"
	  + "FRET_TIPO_CAMBIO_PROV,FRET_CONVENIO_CIE,FRET_CTA_CHEQUES,FRET_SUBCTA) VALUES (";
	  dFechaAcuerd=sData[56]!=null&&!sData[56].equals("")?"TO_DATE('" + sData[56] + "','DD/MM/YYYY'),":"null,";
	            LOGGER.debug("dFechaAcuerd: "+dFechaAcuerd);
	            
          String smoneda=getKey(3,cveMoneda);
          LOGGER.debug("smoneda: "+smoneda);
          String sCuenta="";
         
         if(sData[63].indexOf("-")!=-1)
            sCuenta=(sData[63]!=null&&sData[63].length()>0&&sData[63]!="0"?sData[63].substring(0, sData[63].indexOf("-")):"0");
         else
            sCuenta=sData[63];
	 
        LOGGER.debug("Cuenta Retiro: "+sCuenta);
             
          //DETALLE DEL RETIRO
             int i=0;
         for(String item : sData){
                LOGGER.debug("sData"+i+": "+item);
             i++;
          }   
            LOGGER.debug("Contrato inversion: "+ sData[3]);
            LOGGER.debug("Folios: "+ sData[1]);
	  sDetRetiro += sData[1] + ","+ sData[4] + ",TO_DATE('" + sData[0] + "','DD/MM/YYYY')," + 
	  sData[55] + ",'"+ sData[6] + "'," +
	  dFechaAcuerd + 
	  "'" + sData[57] + "','" +  
	  sData[58] + "',"+ sData[2] + "," + sData[48] + "," + 
	  sData[7] + ",'"+ sStatus + "','" + sData[51] + "','" + //'" + sData[8] + "','" + 
	  sData[10] + "','"+ sData[9] + "','" + sData[10] + "','" + 
	  sData[11] + "','"+ sData[10] + "','" + sData[12] + "','" + 
	  sData[8] + "',"+ sData[13] + ",'" + sData[14] + "'," + 
	  smoneda + ","+ sData[4] + ",'" + sData[16] + "'," + 
	  sData[59] + ",'"+ sData[17] + "','" + sData[18] + "','" + 
	  sData[19] + "','"+ sData[20] + "','" + sData[21] + "'," + sData[60] + ",'" +
	  sData[61]+"',"+sCuenta
          +
          ","+sData[64]+")"; 
	            LOGGER.debug("Entro a realizar el retiro 2");
	sDetRetxCtoInver="INSERT INTO F_CTOINV_RET (FRET_ID_RETIRO,FCIN_ID_CTO_INVERSION,FCVR_IMPORTE_X_CTOINV) " +
	                " VALUES ( " + sData[1] + "," + sData[3] + "," + sData[4] + ")";
	            
	          tipoPersFid= sData[47];
	                
                        sDetSWIFT = "";
	                query=sInstrucc;        
                        LOGGER.debug("Entro a realizar la instruccion: "+sInstrucc);
	                iRows = stInstrucc.executeUpdate(sInstrucc);//inserta en instrucc
	                //envio informacion
	                envio.consumo(12, sProv);
	                if (iRows>0) 
	                        {
	                        //query=sDetLiq;
	                        //iRows = stInstrucc.executeUpdate(sDetLiq);//inserta en detliqui
	LOGGER.debug("Inserta retiro: "+sDetRetiro);
	if (iRows>0) 
	  iRows = stInstrucc.executeUpdate(sDetRetiro);//inserta en f_retiro  
	  //envio informacion
	  envio.consumo(10, sData);
        //se inserta en tabla complementaria 2
    sDetRetiro="INSERT INTO F_RET_COMP2 (FRC_FOLIO,FRC_PAGOUNICO,FRC_NOMBRESW,FRC_REFERENCIA1,FRC_REFERENCIA2,"+
    "FRC_REFERENCIA3,FRC_CALLE,FRC_NUMEXT,FRC_NUMINT,FRC_COLONIA,FRC_DELEGACION,FRC_CODIGOPOSTAL,FRC_ESTADO, FRC_CIUDAD) "+
    " VALUES ("+ sData[1] +",'"+sData[100]+"','"+sData[101]+"',"+
    "'"+sData[102]+"','"+sData[103]+"','"+sData[104]+"','"+sData[105]+"',"+          
	                            "'"+sData[106]+"','"+sData[107]+"','"+sData[108]+"','"+sData[109]+"',"+          
	                            //"'"+sData[110]+"','"+sData[111]+"','"+sData[112]+"','"+sData[113]+"',"+          
	                            "'"+sData[110]+"','"+sData[111]+"','"+sData[112]+"')";  
	                            if (iRows>0) 
	                              iRows = stInstrucc.executeUpdate(sDetRetiro);//inserta en F_RET_COMP2  
	                              //envio informacion
	                              envio.consumo(9, sData);
        
	if (iRows>0){ 
	  //en caso de que no venga contrato de inversion
	  if(sData[3].length()!=0&&sData[3]!=null)
	    iRows = stInstrucc.executeUpdate(sDetRetxCtoInver);//inserta en F_CTOINV_RET el detalle por contrato de inversion  
	  else
	    iRows = 1;
          
            //ctoinverret
	    //envio informacion
            String sValidaprov="";
	    sValidaprov=sData[3].length()==0?"0":sData[3];
            LOGGER.debug("Valor CtoInver por retiro:"+sValidaprov);
            sProv=new String[3];
            sProv[0]=sData[3];  //ctoinver
            sProv[1]=sData[1];  //folio
            sProv[2]=sData[4];//importe
            if(!sValidaprov.equals("0"))
                envio.consumo(5, sProv);
            LOGGER.debug("Nuevo punto de control.");
	}
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
	                
	                 //Inserta un registro de la operaci?n en la bitacora
	                 if(iRows>0)
	                    iRows=insertaBitacora(bitacora);
	                 
	            //MESA DE CONTROL
	            if(iRows>0){
	               //Inserta en Bitacora de la solicitud
	               sInstrucc="Insert into f_bitacora_sol (ins_num_contrato, ins_mum_folio_inst,"
	               + "fbis_num_etapa, usu_num_usuario,fbis_fecha_ini,"
	               + "fbis_fecha_fin, fbis_observacion, fbis_firma_dig)"
	               + " values ("
	               + sData[2] + "," + sData[1] + ",4,"+sData[31]+","
	               + "TO_TIMESTAMP('"+ bitacora[0] +" '||(SELECT to_char(NOW(), 'HH24:MI:SS') FROM DUAL),'DD/MM/YYYY HH24:MI:SS'),NULL,"
	               + "'',0)";
                       LOGGER.debug("REtiro bitacorasol: "+sInstrucc);
	               iRows = stInstrucc.executeUpdate(sInstrucc); 
	                sProv=new String[5];
	                  sProv[0]=sData[2];  
	                  sProv[1]=sData[1];  
	                  sProv[2]=sData[31];  
	                  sProv[3]="4";  
	                  sProv[4]=bitacora[0]; 
	                //envio informacion
	                //envio informacion
	                envio.consumo(3, sProv);
	            }                         
	                 
                    //AQUI SE GRABA EN LA TABLA COMPLEMENTARIA 2     
                         
	                 if(iRows>0)
	                                        {
	                                        if(bFirmasM)// firmas mancomunadas
	                                                {
	                                                if(insertaFirma(strFirma))
	                                                        {       
	                                                        conBD.commit();
	                                                        LOGGER.debug("Retiro con Folio:"+ sData[1]+ " SATISFACTORIO");
	                                                        bInstruccion=true;
	              conBD.close();
	                                                        }
	                                                else
	                                                        {
	                                                        conBD.rollback();
	                                                        conBD.commit();
	                                                        LOGGER.debug("Retiro con Folio:"+ sData[1]+ " NO SATISFACTORIO");
	                                                        LOGGER.debug(query);
	                                                  bInstruccion=false;
	              conBD.close();
	                                                        }       
	                                                }
	                                            else{
	                                                conBD.commit();
	                                                LOGGER.debug("Retiro con Folio:"+ sData[1]+ " SATISFACTORIO");
	                                              bInstruccion=true;
	          conBD.close();
	                                                }               
	                                        }
	                                    else
	                                        {
	                                        conBD.rollback();
	                                        conBD.commit();
	                                        LOGGER.debug("Retiro con Folio:"+ sData[1]+ " NO SATISFACTORIO");
	                                        LOGGER.debug(query);
	                                        bInstruccion=false;
	          conBD.close();
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
	        try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaRetiro");LOGGER.error("Exception: ", ex); }
	        return bInstruccion;
	        }               
	}

	
 public boolean insertaDeposito ( String[] Datos, String[] bitacora, String[] strFirma) 
 {					
		int d,m,a;
    String ImporteD;
		String cuenta;
    
    String sEstatus= "ACTIVO";
    
    //------ I. PREOCUPANTE ---------
    String sfiso = Datos[3];
    BigDecimal bdimporte = new BigDecimal(Datos[9]);
    String cveMov = "DEPOSITO";
    String stInterna = "INUSUAL";
    String st24Horas = "24 HORAS";
    String stRelevante = "RELEVANTE";
    String stEfectivo = "RELEVANTE";
    String cveMoneda = Datos[24];
    String cveFormaL = Datos[25];
    String numPais = Datos[10];
    String sfecha = Datos[17];
    String query = "";        
    
    String sNumPlaza = "";
    String sNomInsti = "";
    String sNumCuenta = "";
    String sRubro = "";
    String sNumRefe = "";
    int numTipoPersona=0;
    
    if (Datos[7].equals("FIDEICOMITENTE"))
      numTipoPersona=1;
    else if (Datos[7].equals("BENEFICIARIO")||Datos[7].equals("FIDEICOMISARIO"))  
      numTipoPersona=2;
    else
      numTipoPersona=3;
      
    d=Integer.parseInt(Datos[17].substring(0,2));//dia
		m=Integer.parseInt(Datos[17].substring(3,5));//mes
		a=Integer.parseInt(Datos[17].substring(6,10));//a?o
          
		iRows=0;
		boolean bFirmasM = false;//firmasMancomunadas(Datos[3]);	//valida si el fiso requiere firmas mancomunadas
    boolean bInstruccion=false;
    String []sProv={null};					
    if(strFirma[0].equals("1"))
			sEstatus="ESPERA";
      
    //**************************************************************//
    //   El c?mpo  DPO_FOLIO_OPER_SIS es utilizado para diferenciar //
    //   dep?sitos en Internet y no duplicar operaciones en SORI    //
    //**************************************************************//
					
    try {
            if (conBD == null) if (!conectarBD()) return false;
            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
            
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
            LOGGER.debug("Folio asignado al deposito: "+Datos[1]);
            sInstrucc="Insert into Instrucc (ins_num_contrato, ins_num_folio_inst,"
						+ "ins_sub_contrato, ins_txt_comentario,ins_cve_tipo_instr,"
						+ "ins_num_miembro, ins_nom_miembro, ins_ano_alta_reg,"
						+ "ins_mes_alta_reg, ins_dia_alta_reg, ins_ano_ult_mod,"
						+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc,INS_NUM_OPER)"
						+ " values ("
						+ Datos[3] + "," + Datos[1] + ",0,0,'RECEPCION INTERNET',"
						+ "0,'0',"
						+  a +","+ m +","+ d +","
						+  a +","+ m +","+ d +","
						+ "'" + sEstatus + "','12000')";
                    LOGGER.debug("LLego a la seccion de asignacion");
		    sProv=new String[8];
		    sProv[0]="1";//"deposito"
		    sProv[1]=Datos[3];//fiso
		    sProv[2]= Datos[1];//folios
		    sProv[3]=a+"";
		    sProv[4]=m+"";
		    sProv[5]=d+"";
		    sProv[6]=sEstatus;
		    sProv[7]="12000";//operacion			   

			      iRows = stInstrucc.executeUpdate(sInstrucc);
		    LOGGER.debug("Salio de la seccion de asignacion");
                                //envio informacion
                                envio.consumo(12, sProv);

            LOGGER.debug("contenido de query de la tabla instrucc:"+sInstrucc);	
			            
            sInstrucc =  "Insert into Deposit values (";
            sInstrucc += "0," + Datos[1] + "," + Datos[2] + ",0,0,0," + Datos[3];
            sInstrucc += ",0," + Datos[4] + "," + Datos[5] + "," + Datos[1] + ",0," + Datos[21] + ",'','" + Datos[7];
            sInstrucc += "',0," + Datos[9] + "," + Datos[10] + ",0,'" + Datos[13] + "',";
            sInstrucc += Datos[11]+ ",'" + Datos[12] + "'," + sNumPlaza + ",'"+cveFormaL+"',0,0,'','','',0,'" + Datos[17] + "','";
            sInstrucc += sNomInsti + "'," + sNumRefe + ",";
            sInstrucc += "0,'',0,0,0,0,0,0,'',";
            sInstrucc += Datos[18] + "," + Datos[19] + ",1,";
            sInstrucc += a +","+ m +","+ d +","+ a +","+ m +","+ d +",";
            sInstrucc += a +","+ m +","+ d + ",'";
            sInstrucc += sEstatus + "',0,0," + Datos[20] + "," + sRubro + ")";
        
				//if(iRows>0)
				  //iRows = stInstrucc.executeUpdate(sInstrucc);
          //LOGGER.debug("contenido de query de la tabla deposit:"+sInstrucc);	
        
        //se graba en la tabla de deposito de FiduciaWeb
          if(iRows>0){
          sInstrucc = "INSERT INTO F_DEPOSITO VALUES (";
          sInstrucc += Datos[1] + "," + Datos[9] + ",";
          sInstrucc += "TO_DATE('"+Datos[17] + "','DD/MM/YYYY'),";
          sInstrucc += Datos[10] + "," + Double.valueOf((Datos[4])) + ",";
          sInstrucc += (Datos[19].length()==0?"0":Datos[19]) + ",'" + Datos[15] + "','" + sEstatus +"',";
          sInstrucc += numTipoPersona + "," + Datos[5].replaceAll(" ","") + ",";
          sInstrucc += Datos[3] + "," + Datos[21] + ",0, "+(Datos[23].length()==0?"0":Datos[23])+",'" + Datos[8] +"','"+Datos[22] +"')";
          iRows = stInstrucc.executeUpdate(sInstrucc);
          LOGGER.debug("contenido de query de f_deposito:"+sInstrucc);	
          LOGGER.debug("1:"+Datos[1]);	
          LOGGER.debug("2:"+Datos[9]);	
          LOGGER.debug("3:"+Datos[17]);	
          LOGGER.debug("4:"+Datos[8]);	
          LOGGER.debug("5:"+Datos[10]);	
          LOGGER.debug("6:"+Datos[4]);	
          LOGGER.debug("7:"+Datos[19]);	
          LOGGER.debug("8:"+Datos[15]);	
          LOGGER.debug("9:"+sEstatus);	
          LOGGER.debug("10:"+numTipoPersona);	
          LOGGER.debug("11:"+Datos[5]);	
          LOGGER.debug("12:"+Datos[3]);	
          LOGGER.debug("13:"+Datos[21]);	
        }

				//Inserta un registro de la operaci?n en la bitacora
				if(iRows>0)
			 	   iRows=insertaBitacora(bitacora);
                                //envio informacion
                                envio.consumo(6, Datos);
                                //MESA DE CONTROL
                                if(iRows>0){
                                   //Inserta en Bitacora de la solicitud
                                   sInstrucc="Insert into f_bitacora_sol (ins_num_contrato, ins_mum_folio_inst,"
                                   + "fbis_num_etapa, usu_num_usuario,fbis_fecha_ini,"
                                   + "fbis_fecha_fin, fbis_observacion, fbis_firma_dig)"
                                   + " values ("
                                   + Datos[3] + "," + Datos[1] + ",4,"+strFirma[3]+","
                                   + "TO_TIMESTAMP('"+ bitacora[0] +" ' ||(SELECT to_char(NOW(), 'HH24:MI:SS')),'DD/MM/YYYY HH24:MI:SS'),NULL,"
                                   + "'',0)";
                                   LOGGER.debug("Deposito FBItacorasol "+sInstrucc);
                                   iRows = stInstrucc.executeUpdate(sInstrucc); 
                                    sProv=new String[5];
                                      sProv[0]=Datos[3];  
                                      sProv[1]=Datos[1];  
                                      sProv[2]=strFirma[3];  
                                      sProv[3]="4";  
                                      sProv[4]=bitacora[0]; 
                                    //envio informacion
                                    envio.consumo(3, sProv);
                                }

				if(iRows>0) {
				     LOGGER.debug("Se registro Deposito con Folio:"+Datos[1]);	
				     conBD.commit();
				   	 bInstruccion=true;
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
				try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
                return (iRows>0?true:false);						
		}										
 }
  
    public boolean insertaDepositoComp (int iTipo,String sFideicomiso, String sFolio, String sCheque,String sBeneficiario) 
    {                                      
                   int d,m,a;
       String ImporteD;
                   String cuenta;
       
       String sEstatus= "ACTIVO";
       
       //------ I. PREOCUPANTE ---------
       String query = "";
       boolean bInstruccion=false;
       String []sProv={null};  
       //**************************************************************//
       //   El c?mpo  DPO_FOLIO_OPER_SIS es utilizado para diferenciar //
       //   dep?sitos en Internet y no duplicar operaciones en SORI    //
       //**************************************************************//
                                           
       try {
                                                   if (conBD == null) if (!conectarBD()) return false;
                                                   if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                                   
                                                   stInstrucc = conBD.createStatement();
                                                   conBD.setAutoCommit(false);     
                                                   
           if(iTipo==1){//Depositos                    
               sInstrucc="Insert into F_INST_COMP (INS_NUM_FOLIO_INST, FIC_NUM_CHEQUE,"
                                                   + "FIC_NOMBRE_RAZON_SOCIAL)"
                                                   + " values ("
                                                   + sFolio + ",'" + sCheque +"','"+ sBeneficiario + "')";
                                                    sProv=new String[4];
                                                    sProv[0]="1";
                                                    sProv[1]=sFolio;
                                                    sProv[2]=sCheque;
                                                    sProv[3]=sBeneficiario;     
               }                            
            iRows = stInstrucc.executeUpdate(sInstrucc);
            LOGGER.debug("contenido de query de la tabla sInstrucc:"+sInstrucc);   
                   }catch (Exception ex) {
                                                   LOGGER.debug("Funcion: insertaDeposito");
                                                   LOGGER.debug("Error: "+ex);
                                                   LOGGER.error("Exception: ", ex);
                                                   LOGGER.debug(sInstrucc);
                                                   LOGGER.debug(sQuery);
                                                   try{                                                             conBD.rollback();
                                                             conBD.commit();
                                                             LOGGER.debug("rollback");
                                                   } catch(SQLException e) {                               
                                                                   LOGGER.debug("Error al realizar el roll back: :"+e);      
                                                   }       
                                                     bInstruccion=false;
                   } finally {
                                   try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
                                   try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
                                   return (iRows>0?true:false);                                            
                   }                                                                               
    }  
    
    public boolean insertaRetiroComp (int iTipo,String sFideicomiso, String sFolio, String sTipo,String sConvenio,String sReferencia,
                                      String sBeneficiario,String sLinea,
                                      String sRfc,String sFechaC,String sFechaV,String sClabe,String sTitular) 
    {                                      
                   int d,m,a;
       String ImporteD;
                   String cuenta;
       
       String sEstatus= "ACTIVO";
       
       String query = "";
       boolean bInstruccion=false;
       String []sProv={null};                                          
       try {
                                                   if (conBD == null) if (!conectarBD()) return false;
                                                   if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                                   
                                                   stInstrucc = conBD.createStatement();
                                                   conBD.setAutoCommit(false);     
                                                   
           if(iTipo==2){//Retiros                    
           sInstrucc="Insert into F_INST_COMP (INS_NUM_FOLIO_INST, FIC_TIPO_PAGO,FIC_CONVENIO_SERV_CIE,FIC_REFERENCIA,"
                                               + "FIC_BENEFICIARIO,FIC_LINEA_CAPTURA,FIC_RFC_CONTRIBUYENTE,FIC_FECHA_CUMP," +
               "FIC_FECHA_VENC,FIC_CLABE_NVA,FIC_TITULAR_NVO)"
                                               + " values ("
                                               + sFolio + ",'"+ sConvenio +"','"+sTipo+"','"+
                                               sReferencia +"','"+                      
                                               sBeneficiario +"','"+
                                              sLinea +"','"+
                                              sRfc +"','"+
                                                sFechaC +"','"+ sFechaV +"','"+
                                                sClabe +"','"+ sTitular +"')";      
                                                sProv=new String[12];
                                                sProv[0]="2";
                                                sProv[1]=sFolio;
                                                sProv[2]=sConvenio;
                                                sProv[3]=sTipo;
                                                sProv[4]=sReferencia;
                                                sProv[5]=sBeneficiario;
                                                sProv[6]=sLinea;
                                                sProv[7]=sRfc;
                                                sProv[8]=sFechaC;
                                                sProv[9]=sFechaV;
                                                sProv[10]=sClabe;
                                                sProv[11]=sTitular;

           }
            iRows = stInstrucc.executeUpdate(sInstrucc);
            LOGGER.debug("contenido de query de la tabla sInstrucc:"+sInstrucc);   
                   }catch (Exception ex) {
                                                   LOGGER.debug("Funcion: insertaDeposito");
                                                   LOGGER.debug("Error: "+ex);
                                                   LOGGER.error("Exception: ", ex);
                                                   LOGGER.debug(sInstrucc);
                                                   LOGGER.debug(sQuery);
                                                   try{                                                             conBD.rollback();
                                                             conBD.commit();
                                                             LOGGER.debug("rollback");
                                                   } catch(SQLException e) {                               
                                                                   LOGGER.debug("Error al realizar el roll back: :"+e);      
                                                   }       
                                                     bInstruccion=false;
                   } finally {
                                   try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
                                   try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
                                   return (iRows>0?true:false);                                            
                   }                                                                               
    }      
    
    public boolean insertaRetiroAgenda (int iTipo,String sFideicomiso, String sFolio, String sFeriado,
                                        String sFin,String sEspecial,String sHabil,String sPeriodicidad,
                                        String sUltimo,String sFecha,String sUsuario1,String sUsuario2,
                                        String sAsunto) 
    {                                      
       
       String sEstatus= "ACTIVO";
       
       String query = "";
       boolean bInstruccion=false;
        int resultado = 0;                                      
       try {
                                                   if (conBD == null) if (!conectarBD()) return false;
                                                   if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                                   
                                                   stInstrucc = conBD.createStatement();
                                                   conBD.setAutoCommit(false);     
                                                   
           if(iTipo==2){//Retiros                    
           sInstrucc="Insert into F_EVENTOS (EAGE_ID_FOLIO,EAGE_FIDEICOMISO,EAGE_CVE_FERIADO,EAGE_FEC_FIN_EVENTO,EAGE_PERIODO_ESPECIAL," +
               "EAGE_DIA_HABIL,EAGE_PERIODICIDAD,EAGE_ULTIMO_DIA,EAGE_FEC_EVENTO,EAGE_NUM_USUARIO,EAGE_NUM_USUARIO2,EAGE_DES_EVENTO)"
                                               + " values ("
                                                + sFolio + ","+ sFideicomiso +",'"+//+sFolio+",'"+
                                               sFeriado.substring(sFeriado.indexOf("-")+1,sFeriado.length()) +"',TO_DATE('"+                      
                                               sFin +"','DD/MM/YYYY'),"+
                                              sEspecial +","+
                                              sHabil +",'"+
                                                sPeriodicidad +"',"+ sUltimo +",TO_DATE('"+
                                                sFecha +"','DD/MM/YYYY'),"+ sUsuario1.substring(0,sUsuario1.indexOf("-")) +","+ sUsuario2.substring(0,sUsuario2.indexOf("-")) +",'"+sAsunto+"')";               

           }
            iRows = stInstrucc.executeUpdate(sInstrucc);
           if(iRows>0){
                conBD.commit();
               CallableStatement spContabiliza;

               spContabiliza = conBD.prepareCall( "begin ? := OPERATIVAS.F_PROYECTA_AGENDA(?, ?,?, ?); end;" );
               spContabiliza.clearParameters();
               spContabiliza.registerOutParameter(1, Types.INTEGER); 
               spContabiliza.setInt(2, Integer.valueOf(sFolio)); 
               spContabiliza.setInt(3, 0);  
               spContabiliza.setString(4, ""); 
               spContabiliza.setString(5, "");                
               spContabiliza.execute();           
               resultado = spContabiliza.getInt(1);
            }
               
            LOGGER.debug("contenido de query de la tabla sInstrucc:"+sInstrucc);   
                   }catch (Exception ex) {
                                                   LOGGER.debug("Funcion: insertaDeposito");
                                                   LOGGER.debug("Error: "+ex);
                                                   LOGGER.error("Exception: ", ex);
                                                   LOGGER.debug(sInstrucc);
                                                   LOGGER.debug(sQuery);
                                                   try{                                                             conBD.rollback();
                                                             conBD.commit();
                                                             LOGGER.debug("rollback");
                                                   } catch(SQLException e) {                               
                                                                   LOGGER.debug("Error al realizar el roll back: :"+e);      
                                                   }       
                                                     bInstruccion=false;
                   } finally {
                                   try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: ProcesoDeposito");LOGGER.error("Exception: ", ex); }
                                   try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
                                   return (iRows>0?true:false);                                            
                   }                                                                               
    }       
	  /*
	  Metodo:insertaTraspaso
	  Funcion:Registro de Traspasos
	  */
    
    
	public boolean insertaTraspaso(
									String fecha,
									String tFolio,
									String tFideicomiso,
									String nomUsuario,
									String tContratoOrigen,
									String tContratoDestino,
									String tSubCtaOrigen,
									String tSubCtaDestino,                  
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
		a=Integer.parseInt(fecha.substring(6,10));//a?o
	
		iRows=0;
		boolean bInstruccion=false;
    String sQueryTraspaso="";
		sEstatus="ACTIVO";
        String []sProv={null};
		/*
		ESPERA = 'USUARIO DE CAPTURA' (1
		ACTIVO = 'USUARIO OPERATIVO' (2)
		*/
		int tipoUsuario=Integer.parseInt(sEstatus.equals("ESPERA")?"1":"2");
		boolean bFirmasM = false;//firmasMancomunadas(tFideicomiso);	

	 	if(bFirmasM || strFirma[0].equals("1"))
			sEstatus="ESPERA";
	
		try
		    {
		
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
			stInstrucc = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			conBD.setAutoCommit(false);	
			
			//inserta registro en la tabla INSTRUCC
			
			sQuery="INSERT INTO instrucc(ins_num_contrato,ins_num_miembro,";
			sQuery+="ins_num_folio_inst,ins_cve_tipo_instr,ins_ano_alta_reg,";
			sQuery+="ins_mes_alta_reg,ins_dia_alta_reg,ins_ano_ult_mod,";
			sQuery+="ins_mes_ult_mod,ins_dia_ult_mod,ins_cve_st_instruc,INS_NUM_OPER) ";
			sQuery+="VALUES("+tFideicomiso+",0,"+tFolio+",'TRASPASO INTERNET',";
			sQuery+=a+","+m+","+d+","+a+","+m+","+d+",'"+sEstatus+"','13000')";
		    sProv=new String[8];
		    sProv[0]="4";
		    sProv[1]=tFideicomiso;
		    sProv[2]=tFolio;
		    sProv[3]=a+"";
		    sProv[4]=m+"";
		    sProv[5]=d+"";
		    sProv[6]=sEstatus;
		    sProv[7]="13000";
			iRows=stInstrucc.executeUpdate(sQuery);
		    //envio informacion
		    envio.consumo(12, sProv);
      //INSERTA EN F_TRASPASO
      sQueryTraspaso="INSERT INTO F_TRASPASO (FTSP_ID_TRASPASO,FTSP_IMPORTE_TRASPASO,FCIN_ID_CTO_INVERSION_ORIGEN,FCIN_ID_CTO_INVERSION_DESTINO,";
      sQueryTraspaso+="FFID_ID_FIDEICOMISO,FTSP_STATUS,FTSP_FECHA,FTSP_SUBCTA_ORIGEN,FTSP_SUBCTA_DESTINO) VALUES (";
			sQueryTraspaso+=tFolio+","+tImporte+","+tContratoOrigen+","+
      tContratoDestino+","+tFideicomiso+",'"+sEstatus+"',TO_DATE('"+fecha+"','DD/MM/YYYY'),"
      +tSubCtaOrigen+","+tSubCtaDestino+")";
		    sProv=new String[9];
                    sProv[0]=tFolio;
		    sProv[1]=tImporte;
		    sProv[2]=tContratoOrigen;
		    sProv[3]=tContratoDestino;
		    sProv[4]=tFideicomiso;
		    sProv[5]=sEstatus;
		    sProv[6]=fecha;
		    sProv[7]=tSubCtaOrigen;
		    sProv[8]=tSubCtaDestino;
                    
      if(iRows>0)
        iRows=stInstrucc.executeUpdate(sQueryTraspaso); 
		    //envio informacion
		    envio.consumo(11, sProv);
			//inserta registro en la tabla DETLIQUI
					
			sQuery="INSERT INTO detliqui(del_folio_opera,del_num_operacion,";
			sQuery+="del_num_sec_opera,del_num_modulo,del_num_transac,";
			sQuery+="del_num_contrato,del_sub_contrato,del_sub_programa,";
			sQuery+="del_num_pers_fid,del_tipo_pers_fid,del_folio_oper_sis,";
			sQuery+="del_imp_liquidar,del_cve_tipo_liq,del_num_moneda,";
			sQuery+="del_num_cheque,del_ano_alta_reg,del_mes_alta_reg,";
			sQuery+="del_dia_alta_reg,del_ano_ult_mod,del_mes_ult_mod,";
			sQuery+="del_dia_ult_mod,del_cve_st_detliqu,del_contrato_inter) VALUES("+tFolio+",";
			sQuery+="0,0,0,0,"+tFideicomiso+",0,0,0,'0',0,"+tImporte.replaceAll(",","").replaceAll(" ","")+",0,0,0,";
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
						
			//Inserta un registro de la operaci?n en la bitacora
			if(iRows>0)
		       iRows=insertaBitacora(bitacora);

		    //MESA DE CONTROL
		    if(iRows>0){
		       //Inserta en Bitacora de la solicitud
		       sInstrucc="Insert into f_bitacora_sol (ins_num_contrato, ins_mum_folio_inst,"
		       + "fbis_num_etapa, usu_num_usuario,fbis_fecha_ini,"
		       + "fbis_fecha_fin, fbis_observacion, fbis_firma_dig)"
		       + " values ("
		       + tFideicomiso + "," + tFolio + ",4,"+nomUsuario+","//falta recuperar el id del usaurio
		       + "TO_TIMESTAMP('"+ bitacora[0] +" '||(SELECT to_char(NOW(), 'HH24:MI:SS')),'DD/MM/YYYY HH24:MI:SS'),NULL,"
		       + "'',0)";
                       LOGGER.debug("Query Traspaso bitacora "+sInstrucc);
		       iRows = stInstrucc.executeUpdate(sInstrucc); 
		        sProv=new String[5];
                          sProv[0]=tFideicomiso;  
                          sProv[1]=tFolio;  
                          sProv[2]=nomUsuario;  
                          sProv[3]="4";  
                          sProv[4]=bitacora[0];                    
                          //envio informacion
                          envio.consumo(3, sProv);
		    } 

	
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
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
			return bInstruccion;	
		
		}
		
			
	}		
	
    /*
    Metodo:insertaInversion
    Funcion:Registro de Inversion
    */
    
    
    public boolean insertaInversion(
                                                                  String fecha,
                                                                  String sFolio,
                                                                  String sFideicomiso,
                                                                  String sTipo,
                                                                  String sConcepto,
                                                                  String sObservaciones,              
                                                                  String sImporte,
                                                                  String sInstrumento,
                                                                  String sTipoInsOrigen,
                                                                  String sTipoInsDestino,
                                                                  String sCuentaOrigen,
                                                                  String sCuentaDestino,
                                                                  String sCajonIndeval,
                                                                  String sPlazo,
                                                                  String sInstitucion,
                                                                  String sContratoBursatil,
                                                                  String sMoneda,
                                                                  String sTipoPersona,
                                                                  String sBeneficiario,
                                                                  String sPizarra,
                                                                  String sLiquidez,
                                                                  String sPrecioTecho,
                                                                  String sPrecioPiso,
                                                                  String sPrecioMercado,
                                                                  String sUsuario,String []bitacora
                                                                  )
          {

          int d,m,a;
          
          d=Integer.parseInt(fecha.substring(0,2));//dia
          m=Integer.parseInt(fecha.substring(3,5));//mes
          a=Integer.parseInt(fecha.substring(6,10));//a?o
          String []sProv={null};
          iRows=0;
          boolean bInstruccion=false;
          String sQueryTraspaso="";
          String sEstatus="ACTIVO";
          try
              {
          
                  if (conBD == null) if (!conectarBD()) return false;
                  if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                  
                  stInstrucc = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                  conBD.setAutoCommit(false);     
                  
                  //inserta registro en la tabla INSTRUCC
                  
                  sQuery="INSERT INTO instrucc(ins_num_contrato,ins_num_miembro,";
                  sQuery+="ins_num_folio_inst,ins_cve_tipo_instr,ins_ano_alta_reg,";
                  sQuery+="ins_mes_alta_reg,ins_dia_alta_reg,ins_ano_ult_mod,";
                  sQuery+="ins_mes_ult_mod,ins_dia_ult_mod,ins_cve_st_instruc,INS_NUM_OPER) ";
                  sQuery+="VALUES("+sFideicomiso+",0,"+sFolio+",'INVERSION INTERNET',";
              sQuery+=a+","+m+","+d+","+a+","+m+","+d+",'"+
                      sEstatus+(sTipo.equals("1")? "','11231')":
                      (sTipo.equals("2")?"','11232')":"','11233')" ) );
              sProv=new String[8];
              sProv[0]="3";
              sProv[1]=sFideicomiso;
              sProv[2]=sFolio;
              sProv[3]=a+"";
              sProv[4]=m+"";
              sProv[5]=d+"";
              sProv[6]=sEstatus;
                sProv[7]=(sTipo.equals("1")? "11231":
                (sTipo.equals("2")?"11232":"11233" )).replaceAll(" ","");
              
                 
                  iRows=stInstrucc.executeUpdate(sQuery);
                  //envio informacion
                  envio.consumo(12, sProv);
    //INSERTA EN F_INVERSION
    sQueryTraspaso="INSERT INTO F_INVERSION (INS_NUM_CONTRATO,INS_NUM_FOLIO_INST,FIN_TIPO,FIN_CONCEPTO," +
        "FIN_OBSERVACIONES,FIN_IMPORTE,FIN_INSTRUMENTO,FIN_TIPO_INSTRUMENTO_ORIG,FIN_TIPO_INSTRUMENTO_DEST,";
    sQueryTraspaso+="FIN_CUENTA_ORIGEN,FIN_CUENTA_DESTINO,FIN_CAJON_INDEVAL,FIN_PLAZO_DIAS,FIN_INSTITUCION," +
        "FIN_CONTRATO_BURSATIL,FIN_MONEDA,FIN_TIPO_PERSONA,FIN_BENEFICIARIO,FIN_PIZARRA," +
        "FIN_LIQUIDEZ,FIN_PRECIO_TECHO,FIN_PRECIO_PISO,FIN_PRECIO_MERCADO) VALUES (";
    sQueryTraspaso+=sFideicomiso+","+sFolio+","+sTipo+",'"+sConcepto+"','"+
    sObservaciones+"','"+sImporte+"','"+sInstrumento+"','"+
    sTipoInsOrigen+"','"+sTipoInsDestino+"','"+sCuentaOrigen+"','"+
    sCuentaDestino+"','"+sCajonIndeval+"','"+sPlazo+"','"+
    sInstitucion+"','"+sContratoBursatil+"','"+sMoneda+"','"+
    sTipoPersona+"','"+sBeneficiario+"','"+sPizarra+"','"+
    sLiquidez+"','"+sPrecioTecho+"','"+sPrecioPiso+"','"+sPrecioMercado+"')";
    if(iRows>0)
    iRows=stInstrucc.executeUpdate(sQueryTraspaso);
              sProv=new String[23];
              sProv[0]=sFideicomiso;  
              sProv[1]=sFolio;  
              sProv[2]=sTipo;  
              sProv[3]=sConcepto;  
              sProv[4]=sObservaciones;  
              sProv[5]=sImporte;  
              sProv[6]=sInstrumento;  
              sProv[7]=sTipoInsOrigen;  
              sProv[8]=sTipoInsDestino;  
              sProv[9]=sCuentaOrigen;  
              sProv[10]=sCuentaDestino;  
              sProv[11]=sCajonIndeval;  
              sProv[12]=sPlazo;  
              sProv[13]=sInstitucion;  
              sProv[14]=sContratoBursatil;  
              sProv[15]=sMoneda;  
              sProv[16]=sTipoPersona;  
              sProv[17]=sBeneficiario;  
              sProv[18]=sPizarra;  
              sProv[19]=sLiquidez;  
              sProv[20]=sPrecioTecho;  
              sProv[21]=sPrecioPiso;  
              sProv[22]=sPrecioMercado;  
              //envio informacion
              envio.consumo(8, sProv);
              if(iRows>0)
                 iRows=insertaBitacora(bitacora);
              //MESA DE CONTROL
              if(iRows>0){
                 //Inserta en Bitacora de la solicitud
                 sInstrucc="Insert into f_bitacora_sol (ins_num_contrato, ins_mum_folio_inst,"
                 + "fbis_num_etapa, usu_num_usuario,fbis_fecha_ini,"
                 + "fbis_fecha_fin, fbis_observacion, fbis_firma_dig)"
                 + " values ("
                 + sFideicomiso + "," + sFolio + ",4,"+sUsuario+","
                 + "TO_TIMESTAMP('"+fecha +" ' ||(SELECT to_char(NOW(), 'HH24:MI:SS')),'DD/MM/YYYY HH24:MI:SS'),NULL,"
                 + "'',0)";
                 iRows = stInstrucc.executeUpdate(sInstrucc); 
                  sProv=new String[5];
                  sProv[0]=sFideicomiso;  
                  sProv[1]=sFolio;  
                  sProv[2]=sUsuario;  
                  sProv[3]="4";  
                  sProv[4]=fecha;                    
                  //envio informacion
                  envio.consumo(3, sProv);
              }              
          
          }
          catch (Exception ex)
          {       
                  try     {
                  conBD.rollback();
                  conBD.commit();
                  LOGGER.debug("No se Registro la Inversion con Folio:"+sFolio);
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
                  try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
                  return (iRows>0?true:false);   
          
          }
          
                  
    }            
	
	/*	
	Metodo:insertaPagoHonorarios
	Funcion: Registar el Pago de Honorarios Pendientes
	*/
	
	public boolean insertaPagoHonorarios(String SFiso,
										 String Scuenta,
										 String Scontrato,
										 String SImporte_cad,
										 String FolioOpera,
										 String[] bitacora,
                     String sFecha,
                     String sMoneda)
		{	
			
			String query="";
			String[] sData = new String[8];
			String sFechaOper=null;
			String sAdeudo=null;
			double dImporteParcial=0.0,dImporteParcIva=0.0,SImporte=0.0;
			int i=0,inumpago=0;		
			boolean bInstruccion=false;	
					
			SImporte=Double.valueOf(SImporte_cad.replaceAll(",","").replaceAll(" ","")).doubleValue();
			
			
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
				
				if (conBD == null) if (!conectarBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
				
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
					//if( Integer.valueOf(sData[4].substring(6,10)).intValue() > 2001 )
					//	{
						//ejercicio nuevo	
						//dImporteParcial=SImporte/1.15;
						dImporteParcial=SImporte;
						iRows=registraPago(SFiso,Scuenta,Scontrato,sData[1],sData[2],sData[3],sData[4],sData[5],sFecha,String.valueOf(dImporteParcial),"0",FolioOpera,String.valueOf(inumpago),"PAGADO",sMoneda);
					
						}		
				/*	else
						{
						//Ejercicio Anterior"
						//dImporteParcial=SImporte/1.15;
						//dImporteParcIva=SImporte-(SImporte/1.15);
						dImporteParcial=SImporte;
						dImporteParcIva= (SImporte/1.15)*.15;
						iRows=registraPago(SFiso,Scuenta,Scontrato,sData[1],sData[2],sData[3],sData[4],sData[5],sFecha,num.format(dImporteParcial),num.format(dImporteParcIva),FolioOpera,String.valueOf(inumpago),"PAGADO");
					
						}		
			
		}*/
		
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
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonorarios");LOGGER.error("Exception: ", ex); }

			
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
								  String status,
                  String sMoneda)
	    {
	  	int d,m,a;
	  	String 	dImporteParcial= "0.0";
		d=Integer.parseInt(sFechaOper.substring(0,2));//dia
		m=Integer.parseInt(sFechaOper.substring(3,5));//mes
		a=Integer.parseInt(sFechaOper.substring(6,10));//a?o

		String query="";
		try
		{	
			int sec_pago=0;
			sec_pago=getSecuencialPago(sFiso,scve_pers,inum_pers,sTipo_hono,sFeccalc,sNumSec,sFechaOper);
			LOGGER.debug("registra  Pago: "+sec_pago);

	
			Locale currentLocale = new Locale("sp","US");
								
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
        +  "INS_CVE_ST_INSTRUC,INS_NUM_OPER)"
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
        + "'ACTIVO','0')";
						
				iRows = stInstrucc.executeUpdate(query);
			
			dImporteParcial=num.format(Double.valueOf(sImporte).doubleValue() / 1.15);	    
			
			//se procede a incorporar la informacion en la tabla de cobro de honorarios
      query ="INSERT INTO F_COBRO ("+
      "FFID_ID_FIDEICOMISO,"+      
      "FPRO_ID_PROVISION,"+
      "FCOH_TIPO_PERSONA,"+      
      "FCOH_ID_PERSONA,"+  
      "FCOH_TIPO_HONO,"+      
      "FCOH_FECHA_PROVISION,"+      
      "FCOH_ID_COBRO,"+
      "FCOH_IMPORTE_COB,"+
      "FCOH_IVA_COB,"+
      "FCOH_IMPORTE_CIVA,"+
      "FCOH_STATUS,"+
      "FCOH_FECHA_COBRO,"+
      "FCOH_MONEDA ) VALUES ("+
      sFiso + "," +
      sNumSec + "," +
      "'" + scve_pers + "'," +
      inum_pers + "," +      
      "'" + sTipo_hono + "'," +
			"TO_DATE('" + sFeccalc + "','DD/MM/YYYY')," +
			sFoliooper + "," +
      sImporte + "," +
      sIva + "," +
      //sImporte + "," +
      String.valueOf(Double.valueOf(sImporte).doubleValue()+Double.valueOf(sIva).doubleValue())  + "," +
			"'ACTIVO',(SELECT TO_Date(to_char(fco_dia_dia,'00')||'/'||TO_CHAR(fco_mes_dia,'00')||'/'||TO_CHAR(fco_ano_dia,'0000'),'dd/mm/yyyy') FROM feccont),"+sMoneda+")";
      
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
			query   ="SELECT NVL(MAX(PAG_NUM_PAGO),0)+1 FROM PAGOSHON WHERE"
					+ " PAG_NUM_CONTRATO ="+sFiso
					+ " AND PAG_CVE_PERS_FID='"+scve_pers+"'"
					+ " AND PAG_NUM_PERS_FID="+inum_pers      
					+ " AND PAG_CVE_TIPO_HONO='"+sTipo_hono+"'"    
					+ " AND PAG_FEC_CALC_HONO='"+sFeccalc+"'"  
					+ " AND PAG_NUM_SECUENCIAL="+sNumSec;
								
			rsQuery=stQuery.executeQuery(query); 
		   
			if(	rsQuery.next())
				return rsQuery.getInt(1);
			else {		 
				 return 1;	
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
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
			stInstrucc = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			conBD.setAutoCommit(false);	


			switch( tipoInstruccion )
					{
					case 5:
					case 6://Registro de Compromisos y Cancelaci?n de Compromisos
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
						  
						
					case 7://Reprogramaci?n Presupuestal
							iRows=contabilizaFoseg(strPresupuesto[0],bFirmasM);//ORIGEN
							if(iRows>0)
							iRows=contabilizaFoseg(strPresupuesto[1],bFirmasM);//DESTINO						
						  break;
					case 8:	//Asignaci?n de Rendimientos
							
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
		try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaDeposito");LOGGER.error("Exception: ", ex); }
		return bInstruccion;
	
		}		
	}	
	
	/*
	Metodo: insertaBitacora
	Funcion:Registro en la bitacora de las instrucciones que se realizan por internet
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

		try
		{
			
			queryBitacora  = "INSERT INTO F_BITACORA ("
							+ " FBIT_SECUENCIAL_FOLIO,"
							+ " FUSU_ID_USUARIO,"
							+ " FBIT_FECHA,"
							+ " FBIT_DESCRIPCION)"
							+ "  VALUES ("
              + folio + ","
              + "'" + numUsuario + "',"
              + "TO_TIMESTAMP('" + fecha + "','DD/MM/YYYY HH24:MI:SS'),'"
              + detalle + "')";

			
			iRows = stInstrucc.executeUpdate(queryBitacora);
      LOGGER.debug("query bitacora:"+queryBitacora);
		    //envio informacion
		    envio.consumo(2, bitacora);			
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
	Funci?n: Separa parametros para ?l metodo que contabiliza los movimientos presupuestales
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
				
			/*los parametros de entrada vendr?n constituidos en una sola cadena
			donde las cuentas estan separadas por comas para su identificaci?n
			la lectura de cuentas ser? de izquierda a derecha representando esto
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
	Funci?n: Sube el nivel de ctas para la contabilizaci?n presupuestal recursiva
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
	Funci?n: contabilizaci?n presupuestal
	*/

    private  int contabilizaFoseg (String cuentas,
    							  							boolean bFirmasMancomunadas)
  		{  			
				int d,m,a;
				
				identificaCta(cuentas);
				
				d=Integer.parseInt(ctas[10].substring(0,2));//dia
				m=Integer.parseInt(ctas[10].substring(3,5));//mes
				a=Integer.parseInt(ctas[10].substring(6,10));//a?o

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
		        //se realizar? una funcion que actualice el saldo empleando un mecanismo recursivo
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
	Funci?n: Actualiza el saldo del presupuesto de una cuenta
	Creada por: Erick Omana Ming?er
	*/

	private int actualizaSaldo(String cuentas)
			{
			String querySaldos="";
			try
			{	
			String sqlprinc;
			identificaCta(cuentas);    
			//se valida si se ha llegado al nivel mas alto de la estructura para
			//detener la actualizacion del saldo y se?alar que la actualizaci?n
			//ha sido exitosa
			if(Integer. valueOf(ctas[0]).intValue()==0)
        		return 1;
			//se verifica que exista la cuenta en cuesti?n, de lo contrario
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
        	if (conBD == null) if (!conectarBD()) return false;
        	if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
		
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
	Funcion: Se registra la autorizaci?n y cancelacion de las instrucciones pendientes(DEPOSITO,RETIRO Y TRASPASOS).
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
 	 	int anio = Integer.parseInt(strDatos[3].substring(6,10));//a?o
		String sAccion=strDatos[5].trim();
		int numFirma=Integer.parseInt(strDatos[6]);
		
	
		//ACTUALIZACION DE SALDOS DEL ACUERDO DEL CT
		boolean bComiteTecnico= n.aplica(Integer.parseInt(strDatos[2]),strDatos[6]);
		
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
			stInstrucc = conBD.createStatement();
			conBD.setAutoCommit(false);	
			
			
			//Actualiza el estatus de la instruccion
			if((sAccion.equals("CANCELADO") || (sAccion.equals("ACTIVO"))))						
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
									
									query = " UPDATE F_DEPOSITO set FDEP_STATUS='"+strDatos[5].trim()+"'"
										  + " WHERE "
										  + " FFID_ID_FIDEICOMISO="+strDatos[2]
										  + " AND "
										  + " FDPO_ID_DEPOSITO="+strDatos[1];
                      
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

									query = " UPDATE F_RETIRO set FRET_STATUS_RET='"+strDatos[5].trim()+"'"
										  + " WHERE "
										  + " FFID_ID_FIDEICOMISO="+strDatos[2]
										  + " AND "
										  + " FRET_ID_RETIRO="+strDatos[1];
                      
									if (iRows>0)	
										iRows=stInstrucc.executeUpdate(query);	

									
									//JJR 
									//Actualiza monto ejecido y disponible del Acuerdo del que se disponen los recursos		
									//Nota: Esta actualizaci?n no incluye la forma de liquidaci?n SWIFT
									if( bComiteTecnico &&  strDatosAcuerdoCT[0]!=null &&  sAccion.equals("ACTIVO") && iRows>0)
									   {
							   	       query = "UPDATE acuerdos_ct a "
											 + " SET a.acu_monto_disponible = (a.acu_monto_disponible -"+  strDatosAcuerdoCT[3] + "),"
											 + "a.acu_monto_ejercido   = (a.acu_monto_ejercido + "+ strDatosAcuerdoCT[3] + "), "
											 + "a.acu_status=DECODE((a.acu_monto_disponible -"+  strDatosAcuerdoCT[3] + "),0,'CUMPLIDO','EN PROCESO')"
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

									query = " UPDATE F_TRASPASO set FTSP_STATUS='"+strDatos[5].trim()+"'"
										  + " WHERE "
										  + " FFID_ID_FIDEICOMISO="+strDatos[2]
										  + " AND "
										  + " FTSP_ID_TRASPASO="+strDatos[1];
                      
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
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: autoriza");LOGGER.error("Exception: ", ex); }
			return bInstruccion;
		}
	}
	

  	/*
    Funcion: Se registra la autorizaci?n de las instrucciones pendientes(DEPOSITO,RETIRO Y TRASPASOS)
	
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
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
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
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
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
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
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
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
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
				sData[i][0] = rsQuery.getString(1);			// A?o
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
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;	
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
			//con la fecha de operacion o del d?a posterior	
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
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;	
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
			//con la fecha de operacion o del d?a posterior	
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
				a=Integer.parseInt(sFechaOper.substring(6,10));//a?o
								
				String query="";
				
				boolean bFirmasM = false;	
				//JJR 05112007 SE BLOQUEA EN USO DE FIRMAS MANCOMUNADAS PARA PAGOS DE HONORARIOS FOSEG 
				//bFirmasM = firmasMancomunadas(sFiso);	
				
		try
		{										 	   
				if (conBD == null) if (!conectarBD()) return 0;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
					stInstrucc=conBD.createStatement();
					stQuery=conBD.createStatement();
								
				int sec_pago=0;
				sec_pago=getSecuencialPago(sFiso,scve_pers,inum_pers,sTipo_hono,sFeccalc,sNumSec,sFechaOper);
				//JJR SE BLOQUEA EN USO DE FIRMAS MANCOMUNADAS PARA PAGOS DE HONORARIOS FOSEG 
				//if(bFirmasM || strFirma[0].equals("1"))
				//sEstatus="ESPERA";

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
					
			//se especifica el contrato de inversi?n			
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
			//se especifica la cuenta bancomext donde se ubicar?n los recursos
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
				if (conBD == null) if (!conectarBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
				
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
 						
 						//JJR 05112007 SE BLOQUEA EN USO DE FIRMAS MANCOMUNADAS PARA PAGOS DE HONORARIOS FOSEG 
						//bFirmasM = firmasMancomunadas(SFiso);	
						
						if (conBD == null) if (!conectarBD()) return false;
						if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
						
						// SE BLOQUEA EN USO DE FIRMAS MANCOMUNADAS PARA PAGOS DE HONORARIOS FOSEG 
						//if(bFirmasM || strFirma[0].equals("1"))
						//	sEstatus="ESPERA";			 						
 						
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
        //SE BLOQUEA EN USO DE FIRMAS MANCOMUNADAS PARA PAGOS DE HONORARIOS FOSEG 
		// Inserta Firmas
		//    if(iRows>0){
		//    	if(bFirmasM){
		//					if(!insertaFirma(strFirma)){
		//							iRows=0;
		//	      	}  		
		//	  	}
		//  	}

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
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonorarios");LOGGER.error("Exception: ", ex); }
			
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
		a=Integer.parseInt(sFechaact.substring(6,10));//a?o
		
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
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;	
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
				
					Un arreglo con toda la informaci?n del retiro
						sDataR[0] = fecha
						sDataR[1] = folio
						sDataR[2] = fiso
						sDataR[3] = contrato 
						sDataR[4] = importe del retiro
						sDataR[5] = tipo de operacion (SI=RUTINARIA, NO= NO RUTINARIA)
						sDataR[6] = concepto del retiro
						sDataR[7] = forma de liquidacion
					
					Un arreglo con toda la informaci?n del deposito
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
				anio = Integer.parseInt(sDataR[0].substring(6,10));//a?o
				
				int d,m,a;
				String ImporteD;
				String cuenta;
				d=Integer.parseInt(sDataD[0].substring(0,2));//dia
				m=Integer.parseInt(sDataD[0].substring(3,5));//mes
				a=Integer.parseInt(sDataD[0].substring(6,10));//a?o
				
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
			 	   
				if (conBD == null) if (!conectarBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
					
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
											+ "ins_mes_ult_mod, ins_dia_ult_mod, ins_cve_st_instruc,INS_NUM_OPER)"
											+ " VALUES(" + sDataR[2] + "," + sDataR[1] + ",0,0,'"
											+ "LIQUIDACION INTERNET',0,0," + anio
											+ "," + mes + "," + dia
											+ "," + anio + "," + mes
											+ "," + dia + ",'ACTIVO','0')";
									
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
				   			    	
					 //Inserta un registro de la operaci?n en la bitacora
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
		
					//Inserta un registro de la operaci?n en la bitacora
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
							try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaInterFid");LOGGER.error("Exception: ", ex); }
							return bInstruccion;
							}																
	}
	
	
	/*
		
	Metodo:	insertaPagoHonor
	Funcion: Registra el pago de honorarios de programas)
	Parametros: Un arreglo con toda la informaci?n del pago
		sdata[0] = fiso
		sdata[1] = folio
		sdata[2] = importe honorarios
		sdata[3] = iva 
		sdata[4] = retencion iva 
		sdata[5] = retencion isr
	
	
	public boolean insertaPagoHonor( String[] sData)
	{			
	 String  query="";
	         
   iRows=0;
	 boolean bInstruccion=false;

 	 try{      
		if (conBD == null) if (!conectarBD()) return false;
		if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
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
		try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaPagoHonor");LOGGER.error("Exception: ", ex); }
		return bInstruccion;
		}		
	}

*/		
/**************************************************************************************/


	/*
	Metodo: getDatosAcuerdoCT
	Funcion: Regresa los datos que son parte del PK de un acuerdo
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
			if (conBD == null) if (!conectarBD()) return sDatos;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sDatos;
			
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
  
  // Inusual---------
  

  private boolean esInternaPreocupante( String sfiso, BigDecimal bdimporte , String cveMov ,String cveMoneda, String numPais, String sfecha )
  {
      boolean resInterna = false; // resultado interna
      BigDecimal bdimporteMensual = new BigDecimal(0);
      BigDecimal impMovtoMensual = new BigDecimal(0);
      
      try
                          {
                                  
                                  if (conBD == null) if (!conectarBD()) return false;
                                  if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                  
                                  stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);                                                 
                                  stInstrucc = conBD.createStatement();
                            conBD.setAutoCommit(false);   
          
          int validaMovto = 0;
          String monedaFiso = getMonedaFiso(sfiso); 
          String tipoCambio = "1";
          
          if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL"))
            tipoCambio = obtenTipoCambio("0",monedaFiso,sfecha);
          else if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL"))
            tipoCambio =obtenTipoCambio(numPais,"XXXXX",sfecha);
          
          
          BigDecimal bdtipoCambio = new BigDecimal(tipoCambio);
          //boolean mismaMonedaFiso = esMismaMonedaFiso(sfiso,smoneda); // es la misma moneda que el fideicomiso
          BigDecimal impMovto = new BigDecimal(0);
                                  
                      String query   = " SELECT FAR_VALIDA_DEPOSITO,FAR_IMP_DEPOSITO,FAR_IMP_MES_DEPOSITO, "+
                      "FAR_VALIDA_RETIRO,FAR_IMP_RETIRO,FAR_IMP_MES_RETIRO, "+
                      " FAR_IMP_DEPOSITO_EXT,FAR_IMP_MES_DEPOSITO_EXT, "+
                      "FAR_IMP_RETIRO_EXT,FAR_IMP_MES_RETIRO_EXT, "+
                      //"FAR_VALIDA_DEPOSITO_EFTVO,FAR_IMP_DEPOSITO_EFTVO,FAR_IMP_MES_DEPOSITO_EFTVO, "+
                      //"FAR_VALIDA_MONEDA_EFTVO,FAR_IMP_DEPOSITO_EFTVO_EXT,FAR_IMP_MES_DEPOSITO_EFTVO_EXT, "+
                      "FAR_CVE_ST_ACTIVIDAD "+         
                      "FROM F_ACTIVIDADES_RELEVANTES " +
                      "WHERE FAR_ID_TIPO_OPERACION = 3 "+ // INUSUAL
                        "AND FAR_ID_CONTRATO = '" + sfiso +"'";
                                  
                                  rsQuery= stQuery.executeQuery(query); 
                                  if(rsQuery.next())
                                          {
                                  if(cveMov.equals("DEPOSITO"))
                                  {          
                                    validaMovto = rsQuery.getInt(1);
                                    impMovto = rsQuery.getBigDecimal(2);
                                    impMovtoMensual = rsQuery.getBigDecimal(3);
                                    
                                    //se obtiene el acumulado a la fecha
                                    if(!sfiso.equals("0"))
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);
                                    
                                    // moneda extranjera
                                    if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
                                    {
                                      //individual  
                                      impMovto = rsQuery.getBigDecimal(2);
                                      bdimporte = bdimporte.multiply(bdtipoCambio);
                                      
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(3);
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);
                                    } 
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
                                    {
                                      //individual  
                                      impMovto = rsQuery.getBigDecimal(7);
                                      bdimporte = bdimporte.divide(bdtipoCambio,2);
                                        //mensual
                                        impMovtoMensual = rsQuery.getBigDecimal(8);
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                                    
                                    } 
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(7);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(8);
                                    }
                                    
                                  }
                                  else if(cveMov.equals("RETIRO"))
                                  { 
                                    validaMovto = rsQuery.getInt(4);
                                    impMovto = rsQuery.getBigDecimal(5);
                                    impMovtoMensual = rsQuery.getBigDecimal(6);
                                    
                                      //se obtiene el acumulado a la fecha
                                      if(!sfiso.equals("0"))
                                          bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);
                                      
                                    // moneda extranjera
                                    if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(5);
                                      bdimporte = bdimporte.multiply(bdtipoCambio);
                                        //mensual
                                        impMovtoMensual = rsQuery.getBigDecimal(6);
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio); 
                                    } 
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(9);
                                      bdimporte = bdimporte.divide(bdtipoCambio,2);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(10);
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                                   
                                    }
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(9);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(10);
                                    }
                                    
                                  }
                                  
                                  if(validaMovto > 0)// valida movimiento
                                  {
                                      //individual    
                                      if(impMovto.compareTo(bdimporte)<0 && impMovto.doubleValue()>0)// importe movimiento mayor al permitido
                                        resInterna = true;
                                      
                                      //mensual
                                      if(impMovtoMensual.compareTo(new BigDecimal(bdimporte.doubleValue() + bdimporteMensual.doubleValue()))<0 && impMovtoMensual.doubleValue()>0)// importe movimiento mayor al permitido
                                        resInterna = true;                                    
                                  }
                                  
                                  rsQuery.close();            
                                          }               
                                  
                  
                  }
                  catch (Exception ex)
                  {
                          LOGGER.debug("Error: "+ex);   
                  }
                  finally
                  {
                          try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
                          try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
                          try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
                          try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
        
        return resInterna;
                  }
  
  }// FIN Inusual
  
  // Operacion Relevante ---------
  
//Para las operaciones en efectivo se consideran las relevantes
  private boolean esEfectivo( String sfiso, BigDecimal bdimporte , String cveMov ,String cveMoneda, String numPais, String sfecha )
  {
    boolean resInterna = false; // resultado interna
    BigDecimal bdimporteMensual = new BigDecimal(0);
    BigDecimal impMovtoMensual = new BigDecimal(0);    
  
    try
			{
				
				if (conBD == null) if (!conectarBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
				
				stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);							
				stInstrucc = conBD.createStatement();
			  conBD.setAutoCommit(false);	
        
        int validaMovto = 0;
        String monedaFiso = getMonedaFiso(sfiso); 
        String tipoCambio = "1";
        
        if(cveMoneda.equals("MONEDA NACIONAL")){
            tipoCambio = obtenTipoCambio("300",monedaFiso,sfecha);
        }
        
        
        /*if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL"))
          tipoCambio = obtenTipoCambio("0",monedaFiso,sfecha);
        else if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL"))
          tipoCambio =obtenTipoCambio(numPais,"XXXXX",sfecha);*/
        
        
        BigDecimal bdtipoCambio = new BigDecimal(tipoCambio);
        //boolean mismaMonedaFiso = esMismaMonedaFiso(sfiso,smoneda); // es la misma moneda que el fideicomiso
        BigDecimal impMovto = new BigDecimal(0);
		
                        //CAMBIO DEL 13 DE OCTUBRE DE 2014 LAS OPERACIONES RELEVANTES SIEMPRE ES EN CARACTER DE
        //DE DISPOSICION, ES DECIR, ES UNA REGLA GENERICA NO POR FISO
                        String query   = " SELECT FAR_VALIDA_DEPOSITO_EFTVO,NVL(FAR_IMP_DEPOSITO_EFTVO,0),NVL(FAR_IMP_MES_DEPOSITO_EFTVO,0), "+
                        "FAR_VALIDA_MONEDA_EFTVO,NVL(FAR_IMP_DEPOSITO_EFTVO_EXT,0),NVL(FAR_IMP_MES_DEPOSITO_EFTVO_EXT,0), "+
                        "FAR_CVE_ST_ACTIVIDAD "+         
                        "FROM F_ACTIVIDADES_RELEVANTES " + 
                        "WHERE FAR_ID_TIPO_OPERACION = 1 "+ // RELEVANTE
                        "AND FAR_TIPO_NEGOCIO='FIDEICOMISO'"+                 
                        "AND FAR_TIPO_PERSONA='NINGUNO'"+                 
                        "AND FAR_VALIDA_MONEDA_EFTVO=54"+                 
                        "AND FAR_ID_CONTRATO = '" + 0 +"'";
				
				rsQuery= stQuery.executeQuery(query); 
				if(rsQuery.next())
					{
            if(cveMov.equals("DEPOSITO"))
            {          
              validaMovto = rsQuery.getInt(1);
              impMovto = rsQuery.getBigDecimal(5);
              impMovtoMensual = rsQuery.getBigDecimal(6);
              //impMovto = rsQuery.getBigDecimal(2);

              //se obtiene el acumulado a la fecha
              //se obtiene el acumulado a la fecha
              if(!sfiso.equals("0"))
                  bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);              
              
              /*// moneda extranjera
              if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
              {
                //individual    
                impMovto = rsQuery.getBigDecimal(5);
                //impMovto = rsQuery.getBigDecimal(2);
                bdimporte = bdimporte.multiply(bdtipoCambio);
                
                //mensual
                impMovtoMensual = rsQuery.getBigDecimal(6);
                bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);                
              } 
              else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
              {
                //individual  
                impMovto = rsQuery.getBigDecimal(5);
                bdimporte = bdimporte.divide(bdtipoCambio,2);
                //mensual
                impMovtoMensual = rsQuery.getBigDecimal(6);
                bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                 
              } 
              else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
              {
                 //individual   
                impMovto = rsQuery.getBigDecimal(5);
                  //mensual
                  impMovtoMensual = rsQuery.getBigDecimal(6);  
              }*/
              //CAMBIO DEL 13 DE OCTUBRE DE 2014
              //REGLA TODO SE COMPARA EN DOLARES Y SI ES MONEDA NACIONAL SE MULTIPLICA POR EL TIPO DE CAMBIO
              //DE DOLARES AMERICANOS PLD (TIPO DE CAMBIO ESPECIAL PARA PLD)
              if(cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
              {
                  bdimporte = bdimporte.divide(bdtipoCambio);
                  
                  bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio);                                  
              }
                  
            }
            
            if(validaMovto > 0)// valida movimiento
            {
                //individual    
                if(impMovto.compareTo(bdimporte)<0 && impMovto.doubleValue()>0)// importe movimiento mayor al permitido
                  resInterna = true;
                
                //mensual
                if(impMovtoMensual.compareTo(new BigDecimal(bdimporte.doubleValue() + bdimporteMensual.doubleValue()))<0 && impMovtoMensual.doubleValue()>0)// importe movimiento mayor al permitido
                  resInterna = true;                  
            }
            
            rsQuery.close();		
					}		
				
		
		}
		catch (Exception ex)
		{
			LOGGER.debug("Error: "+ex);   
		}
		finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
      
      return resInterna;
		}
  
  }// FIN esRelevante


  private boolean esRelevante( String sfiso, BigDecimal bdimporte , String cveMov ,String cveMoneda, String numPais, String sfecha )
  {
      boolean resInterna = false; // resultado interna
      BigDecimal bdimporteMensual = new BigDecimal(0);
      BigDecimal impMovtoMensual = new BigDecimal(0);
      
      try
                          {
                                  
                                  if (conBD == null) if (!conectarBD()) return false;
                                  if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                  
                                  stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);                                                 
                                  stInstrucc = conBD.createStatement();
                            conBD.setAutoCommit(false);   
          
          int validaMovto = 0;
          String monedaFiso = getMonedaFiso(sfiso); 
          String tipoCambio = "1";
          
          if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL"))
            tipoCambio = obtenTipoCambio("0",monedaFiso,sfecha);
          else if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL"))
            tipoCambio =obtenTipoCambio(numPais,"XXXXX",sfecha);
          
          
          BigDecimal bdtipoCambio = new BigDecimal(tipoCambio);
          //boolean mismaMonedaFiso = esMismaMonedaFiso(sfiso,smoneda); // es la misma moneda que el fideicomiso
          BigDecimal impMovto = new BigDecimal(0);
                                  
                      String query   = " SELECT FAR_VALIDA_DEPOSITO,FAR_IMP_DEPOSITO,FAR_IMP_MES_DEPOSITO, "+
                      "FAR_VALIDA_RETIRO,FAR_IMP_RETIRO,FAR_IMP_MES_RETIRO, "+
                      " FAR_IMP_DEPOSITO_EXT,FAR_IMP_MES_DEPOSITO_EXT, "+
                      "FAR_IMP_RETIRO_EXT,FAR_IMP_MES_RETIRO_EXT, "+
                      //"FAR_VALIDA_DEPOSITO_EFTVO,FAR_IMP_DEPOSITO_EFTVO,FAR_IMP_MES_DEPOSITO_EFTVO, "+
                      //"FAR_VALIDA_MONEDA_EFTVO,FAR_IMP_DEPOSITO_EFTVO_EXT,FAR_IMP_MES_DEPOSITO_EFTVO_EXT, "+
                      "FAR_CVE_ST_ACTIVIDAD "+         
                      "FROM F_ACTIVIDADES_RELEVANTES " +
                      "WHERE FAR_ID_TIPO_OPERACION = 1 "+ // RELEVANTE
                      "AND FAR_ID_CONTRATO = '" + sfiso +"'";
                                  
                                  rsQuery= stQuery.executeQuery(query); 
                                  if(rsQuery.next())
                                          {
                                  if(cveMov.equals("DEPOSITO"))
                                  {          
                                    validaMovto = rsQuery.getInt(1);
                                    impMovto = rsQuery.getBigDecimal(2);
                                    impMovtoMensual = rsQuery.getBigDecimal(3);
                                    
                                    //se obtiene el acumulado a la fecha
                                    if(!sfiso.equals("0"))
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);   
                                    
                                    // moneda extranjera
                                    if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
                                    {
                                      //individual  
                                      impMovto = rsQuery.getBigDecimal(2);
                                      bdimporte = bdimporte.multiply(bdtipoCambio);
                                      
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(3);
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);
                                    } 
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
                                    {
                                      //individual  
                                      impMovto = rsQuery.getBigDecimal(7);
                                      bdimporte = bdimporte.divide(bdtipoCambio,2);
                                        //mensual
                                        impMovtoMensual = rsQuery.getBigDecimal(8);
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                                    
                                    } 
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(7);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(8);
                                    }
                                    
                                  }
                                  else if(cveMov.equals("RETIRO"))
                                  { 
                                    validaMovto = rsQuery.getInt(4);
                                    impMovto = rsQuery.getBigDecimal(5);
                                    impMovtoMensual = rsQuery.getBigDecimal(6);
                                    
                                      if(!sfiso.equals("0"))
                                          bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);   
                                      
                                    // moneda extranjera
                                    if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(5);
                                      bdimporte = bdimporte.multiply(bdtipoCambio);
                                        //mensual
                                        impMovtoMensual = rsQuery.getBigDecimal(6);
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio); 
                                    } 
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(9);
                                      bdimporte = bdimporte.divide(bdtipoCambio,2);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(10);
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                                   
                                    }
                                    else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
                                    {
                                      //individual    
                                      impMovto = rsQuery.getBigDecimal(9);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(10);
                                    }
                                    
                                  }
                                  
                                  if(validaMovto > 0)// valida movimiento
                                  {
                                      //individual    
                                      if(impMovto.compareTo(bdimporte)<0 && impMovto.doubleValue()>0)// importe movimiento mayor al permitido
                                        resInterna = true;
                                      
                                      //mensual
                                      if(impMovtoMensual.compareTo(new BigDecimal(bdimporte.doubleValue() + bdimporteMensual.doubleValue()))<0 && impMovtoMensual.doubleValue()>0)// importe movimiento mayor al permitido
                                        resInterna = true;                                    
                                  }
                                  
                                  rsQuery.close();            
                                          }               
                                  
                  
                  }
                  catch (Exception ex)
                  {
                          LOGGER.debug("Error: "+ex);   
                  }
                  finally
                  {
                          try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
                          try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
                          try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
                          try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
        
        return resInterna;
                  }
  
  }// FIN esRelevante

  // Operacion 24 horas ---------
  

  private boolean es24Horas( String sfiso, BigDecimal bdimporte , String cveMov ,String cveMoneda, String numPais, String sfecha )
  {
    boolean resInterna = false; // resultado interna
    BigDecimal bdimporteMensual = new BigDecimal(0);
    BigDecimal impMovtoMensual = new BigDecimal(0);
    
    try
                        {
                                
                                if (conBD == null) if (!conectarBD()) return false;
                                if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                
                                stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);                                                 
                                stInstrucc = conBD.createStatement();
                          conBD.setAutoCommit(false);   
        
        int validaMovto = 0;
        String monedaFiso = getMonedaFiso(sfiso); 
        String tipoCambio = "1";
        
        if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL"))
          tipoCambio = obtenTipoCambio("0",monedaFiso,sfecha);
        else if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL"))
          tipoCambio =obtenTipoCambio(numPais,"XXXXX",sfecha);
        
        
        BigDecimal bdtipoCambio = new BigDecimal(tipoCambio);
        //boolean mismaMonedaFiso = esMismaMonedaFiso(sfiso,smoneda); // es la misma moneda que el fideicomiso
        BigDecimal impMovto = new BigDecimal(0);
                                
                    String query   = " SELECT FAR_VALIDA_DEPOSITO,FAR_IMP_DEPOSITO,FAR_IMP_MES_DEPOSITO, "+
                    "FAR_VALIDA_RETIRO,FAR_IMP_RETIRO,FAR_IMP_MES_RETIRO, "+
                    " FAR_IMP_DEPOSITO_EXT,FAR_IMP_MES_DEPOSITO_EXT, "+
                    "FAR_IMP_RETIRO_EXT,FAR_IMP_MES_RETIRO_EXT, "+
                    //"FAR_VALIDA_DEPOSITO_EFTVO,FAR_IMP_DEPOSITO_EFTVO,FAR_IMP_MES_DEPOSITO_EFTVO, "+
                    //"FAR_VALIDA_MONEDA_EFTVO,FAR_IMP_DEPOSITO_EFTVO_EXT,FAR_IMP_MES_DEPOSITO_EFTVO_EXT, "+
                    "FAR_CVE_ST_ACTIVIDAD "+         
                    "FROM F_ACTIVIDADES_RELEVANTES " +
                    "WHERE FAR_ID_TIPO_OPERACION = 4 "+ // 24 HORAS
                      "AND FAR_ID_CONTRATO = " + sfiso;
                                
                                rsQuery= stQuery.executeQuery(query); 
                                if(rsQuery.next())
                                        {
                                if(cveMov.equals("DEPOSITO"))
                                {          
                                  validaMovto = rsQuery.getInt(1);
                                  impMovto = rsQuery.getBigDecimal(2);
                                  impMovtoMensual = rsQuery.getBigDecimal(3);
                                  
                                  //se obtiene el acumulado a la fecha
                                  if(!sfiso.equals("0"))
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);   
                                  
                                  // moneda extranjera
                                  if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
                                  {
                                    //individual  
                                    impMovto = rsQuery.getBigDecimal(2);
                                    bdimporte = bdimporte.multiply(bdtipoCambio);
                                    
                                    //mensual
                                    impMovtoMensual = rsQuery.getBigDecimal(3);
                                    bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);
                                  } 
                                  else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
                                  {
                                    //individual  
                                    impMovto = rsQuery.getBigDecimal(7);
                                    bdimporte = bdimporte.divide(bdtipoCambio,2);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(8);
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                                    
                                  } 
                                  else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
                                  {
                                    //individual    
                                    impMovto = rsQuery.getBigDecimal(7);
                                    //mensual
                                    impMovtoMensual = rsQuery.getBigDecimal(8);
                                  }
                                  
                                }
                                else if(cveMov.equals("RETIRO"))
                                { 
                                  validaMovto = rsQuery.getInt(4);
                                  impMovto = rsQuery.getBigDecimal(5);
                                  impMovtoMensual = rsQuery.getBigDecimal(6);
                                  
                                    if(!sfiso.equals("0"))
                                        bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio);                                     
                                  
                                  // moneda extranjera
                                  if(monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera movto -> m nacional fiso
                                  {
                                    //individual    
                                    impMovto = rsQuery.getBigDecimal(5);
                                    bdimporte = bdimporte.multiply(bdtipoCambio);
                                      //mensual
                                      impMovtoMensual = rsQuery.getBigDecimal(6);
                                      bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).multiply(bdtipoCambio); 
                                  } 
                                  else if(!monedaFiso.equals("MONEDA NACIONAL")&&cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m nacional movto
                                  {
                                    //individual    
                                    impMovto = rsQuery.getBigDecimal(9);
                                    bdimporte = bdimporte.divide(bdtipoCambio,2);
                                    //mensual
                                    impMovtoMensual = rsQuery.getBigDecimal(10);
                                    bdimporteMensual=obtenMontoMensual(sfiso,cveMov,numPais,sfecha).divide(bdtipoCambio,2);                                   
                                  }
                                  else if(!monedaFiso.equals("MONEDA NACIONAL")&&!cveMoneda.equals("MONEDA NACIONAL")&&!sfiso.equals("0")) // m extanjera fiso-> m extanjera movto
                                  {
                                    //individual    
                                    impMovto = rsQuery.getBigDecimal(9);
                                    //mensual
                                    impMovtoMensual = rsQuery.getBigDecimal(10);
                                  }
                                  
                                }
                                
                                if(validaMovto > 0)// valida movimiento
                                {
                                    //individual    
                                    if(impMovto.compareTo(bdimporte)<0 && impMovto.doubleValue()>0)// importe movimiento mayor al permitido
                                      resInterna = true;
                                    
                                    //mensual
                                    if(impMovtoMensual.compareTo(new BigDecimal(bdimporte.doubleValue() + bdimporteMensual.doubleValue()))<0 && impMovtoMensual.doubleValue()>0)// importe movimiento mayor al permitido
                                      resInterna = true;                                    
                                }
                                
                                rsQuery.close();            
                                        }               
                                
                
                }
                catch (Exception ex)
                {
                        LOGGER.debug("Error: "+ex);   
                }
                finally
                {
                        try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
                        try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
                        try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
                        try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
      
      return resInterna;
                }
  
  }// FIN Operacion 24 horas

  private boolean es24HorasNivelRiesgo( String sNumPers, String sTipoPersona, String sFideicomiso)
  {
    boolean res24Horas = false; // resultado interna
    BigDecimal bdimporteMensual = new BigDecimal(0);
    BigDecimal impMovtoMensual = new BigDecimal(0);
      String query="";
    try
                        {
                                
                                if (conBD == null) if (!conectarBD()) return false;
                                if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
                                
                                stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);                                                 
                                stInstrucc = conBD.createStatement();
                          conBD.setAutoCommit(false);   
        
                                if(sTipoPersona.equals("FIDEICOMITENTE")){
                                    query = " SELECT DISTINCT FID_CURP FROM FIDEICOM "
                                    +" WHERE FID_FIDEICOMITENTE="+sNumPers
                                    +" AND FID_NUM_CONTRATO="+sFideicomiso;                                                                                                                
                                }
                                else{
                                    query = " SELECT DISTINCT BEN_CURP FROM BENEFICI "
                                    +" WHERE BEN_BENEFICIARIO="+sNumPers 
                                    +" AND BEN_NUM_CONTRATO="+sFideicomiso;                                                                        
                                }
                                
                                rsQuery= stQuery.executeQuery(query); 
                                if(rsQuery.next())
                                        {
                                            if(rsQuery.getString(1).equalsIgnoreCase("ALTO RIESGO"))
                                            {          
                                                res24Horas=true;
                                            }
                                
                                            rsQuery.close();            
                                        }               
                                
                
                }
                catch (Exception ex)
                {
                        LOGGER.debug("Error: "+ex);   
                }
                finally
                {
                        try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
                        try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
                        try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
                        try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: esInternaPreocupante");LOGGER.error("Exception: ", ex); }
      
      return res24Horas;
                }
  
  }// FIN Operacion 24 horas

  
  private String getMonedaFiso( String sfiso)
  {
    String monedaFiso = "SIN DEFINIR"; // resultado interna
  
    try
			{
				
				if (conBD == null) if (!conectarBD()) return monedaFiso;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return monedaFiso;
				
				stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);							
				stInstrucc = conBD.createStatement();
			  conBD.setAutoCommit(false);	
        
				String query   = " SELECT NVL(ANT_MONEDA,'SIN DEFINIR') AS ANT_MONEDA "+      
                          "FROM ANTEPROY " + 
                              "WHERE ANT_NUM_CONTRATO = "+ sfiso +" "; // moneda del proyecto
				
				rsQuery = stQuery.executeQuery(query); 
				if(rsQuery.next())
					{
            monedaFiso = rsQuery.getString(1);
            rsQuery.close();		
					}		
				
		
		}
		catch (Exception ex)
		{
			LOGGER.debug("Error: "+ex);   
		}
		finally
		{
			/*try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: getMonedaFiso");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: getMonedaFiso");LOGGER.error("Exception: ", ex); }
      */
      return monedaFiso;
		}
  
  }// FIN getMonedaFiso
  
  private String obtenTipoCambio(String scvemoneda,String snommoneda, String sfecha) {
    String sTipoCambio = "1";
    int d,m,a;
    
    d=Integer.parseInt(sfecha.substring(0,2));//dia
		m=Integer.parseInt(sfecha.substring(3,5));//mes
		a=Integer.parseInt(sfecha.substring(6,10));//a�o
    
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      
      sQuery = " SELECT TIC_IMP_TIPO_CAMB "
             + " FROM TIPOCAMB,MONEDAS "
             + " WHERE TIC_NUM_PAIS = MON_NUM_PAIS " 
             + " AND (TIC_NUM_PAIS = " + scvemoneda +" OR MON_NOM_MONEDA = '" + snommoneda +"')"
             + " AND TIC_ANO_ALTA_REG = " + a 
             + " AND TIC_MES_ALTA_REG = " + m
             + " AND TIC_DIA_ALTA_REG = " + d
             + " ORDER BY TIC_HORA_ALTA*100+TIC_MINUTO_ALTA DESC";
    
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   sTipoCambio = rsQuery.getString(1);
      
      
    }catch (Exception ex) {
			LOGGER.error("Exception: ", ex);
      LOGGER.debug("Excepci�n en obtenTipoCambio");
    } finally 
    {
			/*try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: obtenTipoCambio");LOGGER.error("Exception: ", ex); }
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: obtenTipoCambio");LOGGER.error("Exception: ", ex); }
      */
		}
		return sTipoCambio;
  }// FIN obtenTipoCambio
  
  
    //se obtiene el monto mensual para el fiso en cuestion
    private BigDecimal obtenMontoMensual( String sfiso, String cveMov , String numPais, String sfecha) {
      BigDecimal dMontoMensual  = new BigDecimal(0);
      
      try {
                          // conectandose a la base
        if (conBD == null) if (!conectarBD()) new BigDecimal(0);
                          if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) new BigDecimal(0);
                          
                          stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        if(cveMov.equals("DEPOSITO")) {//depositos
            sQuery = " select nvl(sum(nvl(fdpo_importe_deposito,0)),0) from f_deposito where "+
                " ffid_id_fideicomiso="+sfiso+
                " and fdep_moneda=" +  numPais +
                " and fdep_status='NO CONTABILIZADA'" +     
                " and fdep_fecha between to_date(replace('01/"+sfecha.substring(3,10)+"',' ',''),'DD/MM/YYYY') AND "+
                " to_date(replace('"+sfecha+"',' ',''),'DD/MM/YYYY')";            
        }
        else{//retiros
            sQuery = " select nvl(sum(nvl(fret_imp_retiro,0)),0) from f_retiro where "+
                " ffid_id_fideicomiso="+sfiso+
                " and fret_moneda=" +  numPais + 
                " and fret_status_ret='NO CONTABILIZADA'" +     
                " and fret_fecha between to_date(replace('01/"+sfecha.substring(3,10)+"',' ',''),'DD/MM/YYYY') AND "+
                " to_date(replace('"+sfecha+"',' ',''),'DD/MM/YYYY')";             
        }
        

      
        rsQuery=stQuery.executeQuery(sQuery);
                          if(rsQuery.next())
                             dMontoMensual = rsQuery.getBigDecimal(1);
        
        
      }catch (Exception ex) {
                          LOGGER.error("Exception: ", ex);
        LOGGER.debug("Excepci�n en obtenTipoCambio");
      } finally 
      {
                          /*try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
                          try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
                          try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: obtenTipoCambio");LOGGER.error("Exception: ", ex); }
                          try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: obtenTipoCambio");LOGGER.error("Exception: ", ex); }
        */
                  }
                  return dMontoMensual;
    }// FIN obtenTipoCambio  
  
  // -----------------------------

  public String getAlertamiento( String sFolio)
  {
    String sClasifica = "SIN DEFINIR"; // resultado interna
    int nConta= 0;
    

    try
                        {

                                
                                LOGGER.debug("Done");                
                }
                catch (Exception ex)
                {
                        LOGGER.debug("Error: "+ex);   
                }
                finally
                {
                        /*try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
                        try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
                        try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: getMonedaFiso");LOGGER.error("Exception: ", ex); }
                        try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: getMonedaFiso");LOGGER.error("Exception: ", ex); }
      */
      return sClasifica;
                }
  
  }// FIN getMonedaFiso

  public String[] sEjecutaQuery(String sQuery,String sCondicion)
  {
          String[] sArreglo=null;  
          int dcont=0;
          //PreparedStatement prepared=null;
          try
          {
                    LOGGER.debug("sEjecutaQuery 27:"+sQuery);
                  sArreglo=serv.consumo(27,sQuery);
                  /*if (conBD == null) 
                      if (!conectarBD()) 
                        dcont=0;
                  if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) dcont=0;
                  
                  //stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                  LOGGER.debug("sEjecutaQuery: "+sQuery);
                  prepared = conBD.prepareStatement(sQuery);
                  if(sCondicion.length()!=0){
                      prepared.setInt (1,Integer.parseInt(sCondicion));
                  }    
                    rsQuery = prepared.executeQuery ( );
                  do
                    {
                        dcont++;
                    }while(rsQuery.next());
                  sArreglo= new String[dcont];
                  rsQuery.close();
                  prepared.close();
                  LOGGER.debug("Ejecuta query nisntrucciones "+sQuery);
                  prepared = conBD.prepareStatement(sQuery);
                  if(sCondicion.length()!=0){
                      prepared.setInt (1,Integer.parseInt(sCondicion));
                  }    
                    rsQuery = prepared.executeQuery ( );
                  int i=0;
                  while (rsQuery.next()) 
                    {
                        sArreglo[i++]=rsQuery.getString(2);
                    };              
                  /*for(int i=0;i<dcont-1;i++) { 
                      sArreglo[i]=rsQuery.getString(2);
                        rsQuery.ne
                      rsQuery.next();
                    }    */
          }
          catch(Exception ex)
          {
                  LOGGER.debug("existeFolio: "+ex);
                  
          }
          finally
          {
                  
                  /*try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
                  try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
                  try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
                  */
          return sArreglo; 
          }               
  }  
}
	





