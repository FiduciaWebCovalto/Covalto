/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.negocio;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.domain.ClavesDTO;
import mx.com.inscitech.clients.lib.servicios;

import java.io.*;
import java.text.*;
import java.util.*;
import java.sql.*;
import oracle.jdbc.driver.*;

public class RetirosDB extends FiduciaBD{
    private static final Logger LOGGER = LoggerFactory.getLogger(RetirosDB.class);

    int origen=0;//1 origen servicios y 0 query
    servicios serv = new servicios();
    String[] resultado  ={null};
   //Catalogos
	public String[] getData(int iOpcion,String sCond)
	{
		String[] sData = null;
                String[] datoscecoban = null;
		try
		{
			int i;
						
			switch (iOpcion)
			{
                                        case 1: //Obtiene el tipo de liquidacion clave 81
                                        origen=1;
                                          resultado=serv.consumo(34,"id=81&id2="+sCond);
                                            sData=new String[1];
                                          if(resultado.length>0)
                                              sData=resultado;

					sQuery = " SELECT CVE_DESC_CLAVE FROM CLAVES ";
					sQuery += " WHERE CVE_NUM_CLAVE = 81"  ;
					sQuery += " AND CVE_NUM_SEC_CLAVE = " + sCond;									
					break;
					
				case 2: // Contratos de Inversion					
					sQuery = "SELECT TO_CHAR(cpr_contrato_inter)||'-'||CPR_NOM_CONTACTO2||'-'||MON_NOM_MONEDA FROM continte,MONEDAS,F_PROPORCIONES "; 
					sQuery += " WHERE cpr_num_contrato = " + sCond;
          sQuery += " AND CPR_NUM_PAIS=MON_NUM_PAIS ";
					sQuery += " AND cpr_contrato_inter <> 1000 AND cpr_cve_st_contint='ACTIVO'";
         /////////////////////////////////////PARA DEPOSITOS
          sQuery += " AND cpr_num_contrato=FPRO_ID_FIDEICOMISO ";
          sQuery += " AND cpr_contrato_inter=FPRO_ID_CTO_INVER ";
          sQuery += " AND FPRO_PAGADOR=1 ";
          sQuery += " UNION ";
					sQuery += " SELECT TO_CHAR(cpr_contrato_inter)||'-'||CPR_NOM_CONTACTO2||'-'||MON_NOM_MONEDA FROM continte,MONEDAS"; 
					sQuery += " WHERE cpr_num_contrato = " + sCond;
          sQuery += " AND CPR_NUM_PAIS=MON_NUM_PAIS ";
					sQuery += " AND cpr_contrato_inter <> 1000 AND cpr_cve_st_contint='ACTIVO' ";
          sQuery += " AND REPLACE(TO_CHAR(cpr_num_contrato,'0000000000')||TO_CHAR(cpr_contrato_inter,'0000000000'),' ','') NOT IN";
          sQuery += " (SELECT REPLACE(TO_CHAR(FPRO_ID_FIDEICOMISO,'0000000000')||TO_CHAR(FPRO_ID_CTO_INVER,'0000000000'),' ','') FROM F_PROPORCIONES)";
          //////////////////////////////////
					sQuery += " ORDER BY 1 ASC";
					break;
					
				case 3: //  contrato de inversion
                                        origen=1;
                                        resultado=serv.consumo(13,sCond); 
                                        sData= resultado;

                                        /*origen=1;
                                        resultado=serv.consumo(8,""); 
                                        sData= resultado;                            
					sQuery = "SELECT mon_nom_moneda FROM monedas ORDER BY mon_nom_moneda ASC"; */
					break;
					
				case 4: // Paises	
                                        origen=1;
                                        resultado=serv.consumo(36,""); 
                                        sData= resultado; 
					sQuery = "SELECT distinct pai_nom_pais FROM paises ORDER BY pai_nom_pais ASC"; 
					break;
					
			case 5: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12				
					sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
					sQuery += " WHERE pfd_num_contrato=" + sCond ;
					sQuery += " AND pfd_numero_pers <> 0 ";
					sQuery += " AND pfd_tipo_pers <> '0' ";
					sQuery += " AND cdp_cve_banco=12 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
					sQuery += " and cdp_num_cuenta<>0";
					sQuery += " and cdp_estatus = 'ACEPTADA' ";
					break;
					
			case 6: //Cuentas de todos los bancos para un fideicomiso
								// Se agraga la condicon de que el numero y tipo de persona <> 0
				  sQuery = "  SELECT  substr(cdp_titular,1,20) || ' | ' || cve_desc_clave || ' | ' || cdp_num_cuenta ";
					sQuery += " FROM cuendep, perfirdi, claves";
					sQuery += " WHERE";
          sQuery += " pfd_num_contrato=" + sCond + " AND";          
          sQuery += " pfd_numero_pers <> 0 AND";
          sQuery += " pfd_numero_pers <> 0 AND";                    
          sQuery += " pfd_numero_pers <> 0 AND";
          sQuery += " pfd_tipo_pers <> '0' AND";
					sQuery += " cve_num_clave=27 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep AND";
					sQuery += " cdp_cve_banco=cve_num_sec_clave";
					sQuery += " and cdp_num_cuenta<>0";	
          sQuery += " and cdp_estatus = 'ACEPTADA'";
          sQuery += " order by cdp_titular ";
          break;
					
						
			case 7:  // PRESENTAR SOLO EL NOMBRE DE LA PERSONA, CUANDO LA FORMA DE LIQUIDACION SEA CHEQUES
 							//  Y EL TIPO DE CONTABILIDAD DETALLADA						
                                                origen=1;
                                                resultado=serv.consumo(37,sCond); 
                                                sData= resultado;
						sQuery = " SELECT TER_NOM_TERCERO,'TERCERO',";
						sQuery += " TER_NUM_TERCERO,";
						sQuery += " TER_NOM_TERCERO";
						sQuery += " FROM TERCEROS";
						sQuery += " WHERE ";
						sQuery += " TER_NUM_CONTRATO=" + sCond; 
            sQuery += " and TER_CVE_ST_TERCERO='ACTIVO'"; 
            sQuery += " order by 4 asc "; 
						break;
						
				case 8: // Conceptos de deposito				
						sQuery = "SELECT opf_descripcion FROM operfid WHERE opf_tipo_operacion = 2 AND "; 
						sQuery +=" opf_num_operacion IN (SELECT oaf_num_operacion FROM opasifir WHERE";
						sQuery += " oaf_num_contrato=" +  sCond+ ")";
						break;

			case 9: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12				
							// Generica
					sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
					sQuery += " WHERE pfd_num_contrato=" + sCond ;
					sQuery += " AND cdp_cve_banco=12 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
					sQuery += " and cdp_num_cuenta<>0";
					sQuery += " and cdp_estatus = 'ACEPTADA' ";
          sQuery += " order by cdp_titular ";
					break;																
												
			case 10: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12				
							// Detallada
					sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
					sQuery += " WHERE pfd_num_contrato=" + sCond ;
					sQuery += " AND pfd_numero_pers <> 0 ";
					sQuery += " AND pfd_tipo_pers <> '0' ";
					sQuery += " AND cdp_cve_banco=12 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
					sQuery += " and cdp_num_cuenta<>0";
					sQuery += " and cdp_estatus = 'ACEPTADA' ";
          sQuery += " order by cdp_titular ";
					break;
										
	 case 11: //Cuentas de BANXICO para un fideicomiso clave=27, subclave=164	
					 // Generica									
					sQuery = "SELECT cdp_num_cuenta FROM cuendep, perfirdi";
					sQuery += " WHERE pfd_num_contrato=" + sCond;					
					sQuery += " AND cdp_cve_banco=164 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
					sQuery += " and cdp_num_cuenta<>0";		
					break;
					
		case 12: //Cuentas de BANXICO para un fideicomiso clave=27, subclave=164		
					// Detallada								
					sQuery = "SELECT CVE_DESC_CLAVE FROM CLAVES";
					sQuery += " WHERE CVE_NUM_CLAVE=400";					
					sQuery += " AND CVE_FORMA_EMP_CVE='BANCO DE MEXICO'";
					sQuery += " ORDER BY CVE_NUM_SEC_CLAVE ASC";		
					break;
					
					
	case 13: //Cuentas de todos los bancos para un fideicomiso
					// Generica
				    sQuery = "  SELECT  substr(cdp_titular,1,20) || ' | ' || cve_desc_clave || ' | ' || cdp_num_cuenta ";
					sQuery += " FROM cuendep, perfirdi, claves";
					sQuery += " WHERE";
         			sQuery += " pfd_num_contrato=" +sCond + " AND";          
					sQuery += " cve_num_clave=27 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep AND";
					sQuery += " cdp_cve_banco=cve_num_sec_clave";
					sQuery += " and cdp_num_cuenta<>0";	
                    sQuery += " and cdp_estatus = 'ACEPTADA'";
                    sQuery += " and pfd_st = 'ACEPTADA'";

         		    sQuery += " order by cdp_titular ";
          break;
          
    case 14: //Cuentas de todos los bancos para un fideicomiso
                                        origen=1;
                                        resultado=serv.consumo(38,sCond); 
                                        sData= resultado;
                                        break;
          
		case 15: //EJERCICIOS DE FOSEG				
					sQuery = "select distinct SAL_NUM_AUX2 from SALDOS ";
 					sQuery +=" where SAL_NUM_CTAM=7000 ";
 					sQuery +=" and SAL_NUM_AUX1="+sCond;		
 					sQuery +=" order by SAL_NUM_AUX2 asc";
 					break;
 					
		case 16: //EJES DE FOSEG				
					sQuery = "select  distinct S.SAL_NUM_SCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SCTA from CUENTACO C,SALDOS S";
 					sQuery +=" where S.SAL_NUM_CTAM=7000  ";
 					sQuery +=" and S.SAL_NUM_AUX1="+sCond.substring(0,sCond.indexOf(',')).trim(); 		
 					sQuery +=" and S.SAL_NUM_AUX2="+sCond.substring(sCond.indexOf(',')+1,sCond.length()).trim();
 					sQuery +=" and S.SAL_NUM_SCTA>0 and S.SAL_NUM_SSCTA=0 and S.SAL_NUM_SSSCTA=0 and S.SAL_NUM_SSSSCTA=0 ";
 					sQuery +=" and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
 					sQuery +=" and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA ";
 					sQuery +=" and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
 					sQuery +=" order by S.SAL_NUM_SCTA  asc";
					break;
					
		case 17: //PROGRAMAS DEL EJE DE FOSEG
 					sQuery = "select distinct  S.SAL_NUM_SSCTA|| ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSCTA from CUENTACO C,SALDOS S";
 					sQuery +=" where S.SAL_NUM_CTAM=7000  ";		
 					sQuery +=" and S.SAL_NUM_AUX1="+sCond.substring(0,sCond.indexOf(',')).trim(); 		
 					sQuery +=" and S.SAL_NUM_AUX2="+sCond.substring(sCond.indexOf(',')+1,sCond.indexOf(':')).trim();
 					sQuery +=" and S.SAL_NUM_SCTA="+sCond.substring(sCond.indexOf(':')+1,sCond.length()).trim();
 					sQuery +=" and S.SAL_NUM_SSCTA<>0 and S.SAL_NUM_SSSCTA=0 and S.SAL_NUM_SSSSCTA=0 ";
 					sQuery +=" and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
 					sQuery +=" and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
 					sQuery +=" and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
 					sQuery +=" order by S.SAL_NUM_SSCTA  asc";
					break;
				
		case 18: //PROYECTOS DEL PROGRAMA DEL EJE DE FOSEG
 				  sQuery = "select  distinct S.SAL_NUM_SSSCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSSCTA from CUENTACO C,SALDOS S";
 					sQuery +=" where S.SAL_NUM_CTAM=7000  ";		
 					sQuery +=" and S.SAL_NUM_AUX1="+sCond.substring(0,sCond.indexOf(',')).trim(); 		
 					sQuery +=" and S.SAL_NUM_AUX2="+sCond.substring(sCond.indexOf(',')+1,sCond.indexOf(':')).trim();
 					sQuery +=" and S.SAL_NUM_SCTA="+sCond.substring(sCond.indexOf(':')+1,sCond.indexOf("-")).trim();
 					sQuery +=" and S.SAL_NUM_SSCTA="+sCond.substring(sCond.indexOf('-')+1,sCond.length()).trim();
 					sQuery +=" and S.SAL_NUM_SSSCTA<>0 and S.SAL_NUM_SSSSCTA=0 ";
 					sQuery +=" and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
 					sQuery +=" and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
 					sQuery +=" and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
 					sQuery +=" order by S.SAL_NUM_SSSCTA  asc";
					break;
					
				case 19: //ACCIONES DEL PROYECTO DEL PROGRAMA DEL EJE DE FOSEG				
 					sQuery = "select  distinct S.SAL_NUM_SSSSCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSSSCTA from CUENTACO C,SALDOS S";
 					sQuery +=" where S.SAL_NUM_CTAM=7000  ";		
 					sQuery +=" and S.SAL_NUM_AUX1="+sCond.substring(0,sCond.indexOf(',')).trim(); 		
 					sQuery +=" and S.SAL_NUM_AUX2="+sCond.substring(sCond.indexOf(',')+1,sCond.indexOf(':')).trim();
 					sQuery +=" and S.SAL_NUM_SCTA="+sCond.substring(sCond.indexOf(':')+1,sCond.indexOf("-")).trim();
 					sQuery +=" and S.SAL_NUM_SSCTA="+sCond.substring(sCond.indexOf('-')+1,sCond.indexOf('_')).trim();
 					sQuery +=" and S.SAL_NUM_SSSCTA="+sCond.substring(sCond.indexOf('_')+1,sCond.length()).trim()+" and S.SAL_NUM_SSSSCTA<>0 ";
 					sQuery +=" and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
 					sQuery +=" and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
 					sQuery +=" and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
 					sQuery +=" order by S.SAL_NUM_SSSSCTA asc";
					break;	 					
			case 20: //PROGRAMAS FOSEG
				sQuery = "select TO_CHAR(CVE_NUM_SEC_CLAVE,'00') from claves ";
				sQuery +=" where 	  CVE_NUM_CLAVE = 128 ";
				sQuery +=" and   CVE_PARAM1 = "+sCond;				
				break;

			case 21: //PROGRAMAS FOSEG
 						sQuery = " SELECT NVL(CVE_PARAM2,0) "
						+" FROM OPASIFIR, CLAVES "
						+" WHERE OAF_NUM_CLAVE  = CVE_NUM_CLAVE "
						+" AND OAF_NUM_OPERACION = CVE_NUM_SEC_CLAVE "
						+" AND OAF_NUM_CONTRATO = " + sCond
						+" AND OAF_NUM_CLAVE = 128"
						+" ORDER BY CVE_DESC_CLAVE";							
						break;
            
      case 22: //NUMERO SECUENCIAL CLAVE 83
            sQuery = " SELECT CVE_NUM_SEC_CLAVE "
            + " FROM CLAVES "
            + " WHERE CVE_NUM_CLAVE = 83 "
            + " AND CVE_DESC_CLAVE = '" + sCond + "'";
						break;
            
			case 23:  // INFORMACION DE TERCEROS CON CONVENIOS CIE

						sQuery = " SELECT TER_NOM_TERCERO,'TERCERO',";
						sQuery += " TER_NUM_TERCERO,";
						sQuery += " TER_NOM_TERCERO";
						sQuery += " FROM TERCEROS,CUENTAS ";
						sQuery += " WHERE ";
						sQuery += " TER_NUM_CONTRATO=" + sCond; 
            sQuery += " AND TER_NUM_CONTRATO=CBA_NUM_CONTRATO"; 
            sQuery += " AND TER_NUM_TERCERO=CBA_NUM_PERSON_FID"; 
            sQuery += " AND CBA_CVE_PERSON_FID='TERCERO'"; 
            sQuery += " AND TER_CVE_ST_TERCERO='ACTIVO'"; 
            sQuery += " AND CBA_CVE_TIPO_CTA='CONVENIO CIE'"; 
						break;
      case 24:  // PRESENTAR SOLO EL NOMBRE DE LA PERSONA, CUANDO LA FORMA DE LIQUIDACION SEA CHEQUES
 							//  Y EL TIPO DE CONTABILIDAD DETALLADA						
						sQuery += "SELECT TER_NUM_TERCERO";
						sQuery += " FROM TERCEROS";
						sQuery += " WHERE ";
						sQuery += " TER_NUM_CONTRATO=" + sCond; 
            sQuery += " and TER_CVE_ST_TERCERO='ACTIVO'"; 
						break;
                        
          case 25: //Cuentas de todos los bancos para un fideicomiso
                                              // Detallada
                                              // Se agraga la condicon de que el numero y tipo de persona <> 0
                datoscecoban=sCond.split("-");          
                                        sQuery = "  SELECT  substr(C.FCBA_TITULAR,1,20) || ' | ' || cve_desc_clave || ' | ' || C.FCBA_CLABE_CBA ";
                                              sQuery += " FROM F_CUEBAN C, F_FIDEICO_CUEBAN FXC, claves";
                                              sQuery += " WHERE";
                sQuery += " FXC.FFID_ID_FIDEICOMISO=" + datoscecoban[0] + " AND";          
                                              sQuery += " cve_num_clave=27 AND C.FCBA_CLAS_TIPO<>0 AND";
                                              sQuery += " FXC.FCBA_CLABE_CBA=C.FCBA_CLABE_CBA AND";
                                              sQuery += " C.FCBA_BANCO=cve_num_sec_clave";
                                              sQuery += " and C.FCBA_NUMERO_CTA_BAN<>0";      
                sQuery += " AND UPPER(REPLACE(C.FCBA_TITULAR,' ','')) LIKE UPPER('%"+datoscecoban[2].replaceAll(" ", "")+"%')";
                sQuery += " and C.FCBA_STATUS = 'AUTORIZADA'";         
                sQuery += " order by C.FCBA_TITULAR ASC ";
                break;                        
          case 26: //Tipos de Operacion
                sQuery = "  SELECT  CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE=1019 ";        
                sQuery += " order by CVE_NUM_SEC_CLAVE ASC ";
                break;                        
          case 27: //Tipos de cuenta cargo 
                sQuery = "  SELECT  CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE=1020 ";        
                sQuery += " order by CVE_NUM_SEC_CLAVE ASC ";
                break;   
            
          case 50://recupera numero de cuenta bancaria de la tabla f_fideico_cueban
                                        LOGGER.debug("antes cuenta bancaria param sCond: "+sCond);
                                      LOGGER.debug("cuenta bancaria param sCond: "+sCond);
                                      origen=1;
                                      resultado=serv.consumo(14,sCond); 
                                      sData= resultado;

                                   sQuery = "select substr(F.fcba_clabe_cba,7,11) as fcba_clabe_cba " 
                  + "from f_fideico_cueban F,F_CUEBAN C where C.FCBA_CLABE_CBA=F.FCBA_CLABE_CBA AND   F.ffid_id_fideicomiso = '"+sCond+"' "
                   +" order by substr(F.fcba_clabe_cba,7,11)";
           break;

            case 51:
                        origen=1;
                        resultado=serv.consumo(8,""); 
                        sData= resultado;                            
                        sQuery = "SELECT mon_nom_moneda FROM monedas ORDER BY mon_nom_moneda ASC"; 
                            break;

          case 52: //Cuentas por titular
                          origen=1;
                          resultado=serv.consumo(39,sCond); 
                          sData= resultado;
                          break;
                        
          case 53: //Cuentas por titular
                          origen=1;
                          resultado=serv.consumo(40,sCond); 
                          sData= resultado;
                          break;           
          case 54: //existencia de cuenta por fiso y cuenta
                          origen=1;
                          resultado=serv.consumo(41,sCond); 
                          sData= resultado;
                          break;                            
      }
            if(origen==0){
                    // conectandose a la base
                    if (conBD == null) if (!conectarBD()) return sData;
                    if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
                    
                    stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    String sValor="";
                    LOGGER.debug("RetirosDB sQuery getData: "+sQuery);
                    rsQuery=stQuery.executeQuery(sQuery); 
                    if(rsQuery.next())
                     {
                        rsQuery.last();                     
                        sData = new String[rsQuery.getRow()];
                        rsQuery.first();
                         i=0;
                    do
                            {
                                sData[i] = rsQuery.getString(1);
                                i++;
                            }
                    while(rsQuery.next());
                    }
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
		return sData;
	}


   // Formas de liquidacion
	public String[][] getDataFormas(int iOpcion,String sCont,String sCond)
	{
		String[][] sData = null;
		int i;
		try
		{						
			switch (iOpcion)
			{						
				case 1: // Conceptos de retiro
                                    origen=0;
                                    resultado=serv.consumo(6,"128"); //se Traen las claves 

				  //LOGGER.debug("Conceptos Deposito "+sCont);
				  sQuery = " SELECT fcma_id_padre||'-'||fcma_id_sec_catma||'-',fcma_id_sec_catma FROM F_CATMAES_FIDEIC ";
				  sQuery += " WHERE fcma_id_padre=128 and FFID_ID_FIDEICOMISO = " + sCont;
				  sQuery += " ORDER BY FCMA_ID_SEC_CATMA ASC "; 
				  break;
				
				// Formas de Liquidaci�n
				case 2: // CONTABILIDAD GENERICA
							sQuery = "SELECT DISTINCT CVE_NUM_SEC_CLAVE,CVE_PARAM1 " 
							 + " FROM PERSONASINTERNET, CLAVES"
							 + " WHERE CVE_NUM_CLAVE=74 "
               + " AND (PIN_FORMA_LIQ=CVE_NUM_SEC_CLAVE "
							 + " OR CVE_NUM_SEC_CLAVE = 21) "
							 + " AND PIN_NUM_CONTRATO = " + sCont;
             break;							
							 
			case 3: // FORMAS DE LIQUIDACION
                                                        origen=1;
                                                        resultado=serv.consumo(6,"81"); //formas de deposito 
							 sQuery = " SELECT DISTINCT CVE_NUM_SEC_CLAVE,CVE_DESC_CLAVE " 
							 + " FROM CLAVES "
							 + " WHERE CVE_NUM_CLAVE=81 "
							 + " AND CVE_FORMA_EMP_CVE = 'INTERNET'" 
               + " AND CVE_CVE_ST_CLAVE = 'ACTIVO' "
							 + sCond ;
              break;			
               
               
						
	 	  case 4: // Numero y tipo de persona  Tipo Cheque
	 	  				// Generica
	 	  				sQuery = " SELECT PIN_NUM_PERSONA, DECODE(PIN_TIPO_PERS,'TERCERO','2','1')";
							sQuery += " FROM PERSONASINTERNET";
							sQuery += " WHERE PIN_NUM_CONTRATO = " + sCont;
 							sQuery += " AND PIN_FORMA_LIQ = " + sCond ;
             break;													 
							 	 
	 	  case 5: // Numero y tipo de persona Tipo Cheque
	 	  				// Detallada
	 	  				sQuery = " SELECT TER_NUM_TERCERO, ";
							sQuery += "  DECODE(TER_NUM_TERCERO,'','','2')";
							sQuery += " FROM TERCEROS";
							sQuery += " WHERE TER_NUM_CONTRATO = " + sCont; 
 							sQuery += " AND TER_NOM_TERCERO = '" + sCond + "'";
							sQuery += " UNION ALL";
							sQuery += " SELECT BEN_BENEFICIARIO, ";
							sQuery += " DECODE(BEN_BENEFICIARIO,'','','1')";
							sQuery += " FROM BENEFICI";
							sQuery += " WHERE BEN_NUM_CONTRATO = " + sCont;
							sQuery += " AND BEN_NOM_BENEF = '" + sCond + "'";
            break;		
							
	 	  case 6: // Numero y tipo de persona Tipos diferentes de cheque
	 	  				// Generica
	 	  				sQuery = " SELECT PIN_NUM_PERSONA, DECODE(PIN_TIPO_PERS,'TERCERO','2','1')";
							sQuery += " FROM PERSONASINTERNET";
							sQuery += " WHERE PIN_NUM_CONTRATO = " + sCont;
 							sQuery += " AND PIN_FORMA_LIQ = " + sCond ;
            break;									
							
	 	  case 7: // Numero y tipo de persona, Diferentes de Cheque
	 	  				// Detallada
	 	  				sQuery = " SELECT PFD_NUMERO_PERS, decode(PFD_TIPO_PERS,'TERCERO',2,'1') ";
							sQuery += " FROM CUENDEP, PERFIRDI ";
							sQuery += " WHERE PFD_NUM_CONTRATO = " + sCont;
							//sQuery += " AND CDP_CVE_BANCO=164 " ;
							sQuery += " AND PFD_CVE_CUENDEP=CDP_CVE_CUENDEP " ;
							sQuery += " AND CDP_NUM_CUENTA<>0 " ;
							sQuery += " AND CDP_NUM_CUENTA = " + sCond ;							
            break;																
							
	 	  case 8: // Numero y tipo de persona, Diferentes de Cheque
	 	  				// Del_rubro , entidad Financiera
	 	  				sQuery = " SELECT DECODE(CPR_ENTIDAD_FIN,1,20,28), CPR_ENTIDAD_FIN ";
							sQuery += " FROM  CONTINTE ";
							sQuery += " WHERE CPR_NUM_CONTRATO = " + sCont;
							//sQuery += " AND CPR_SUB_CONTRATO =0 " ;
							sQuery += " AND CPR_CONTRATO_INTER = " + sCond ;							
            break;	
							
				// Formas de Liquidaci�n
				case 12: // CONTABILIDAD GENERICA
								// Para TBC Bancomer y Pago en Ventanilla
							sQuery = "SELECT DISTINCT DECODE(CVE_NUM_SEC_CLAVE,3,22,CVE_NUM_SEC_CLAVE), DECODE(CVE_NUM_SEC_CLAVE,3,'Pago en Ventanilla',CVE_PARAM1) " 
							 + " FROM PERSONASINTERNET, CLAVES"
							 + " WHERE PIN_FORMA_LIQ=CVE_NUM_SEC_CLAVE "
							 + " AND CVE_NUM_CLAVE=74 "
							 + " AND PIN_NUM_CONTRATO = " + sCont
							 + " AND CVE_NUM_SEC_CLAVE IN (19,3) ";
              break;																														
							 		 		
        
			case 13: // FORMAS DE LIQUIDACION
                                                        origen=1;
                                                        resultado=serv.consumo(6,"74"); //formas de deposito 
                                                          break;	
                        
			    case 14: // PERIODICIDADES
			                                     sQuery = " SELECT DISTINCT CVE_NUM_SEC_CLAVE,CVE_DESC_CLAVE " 
			                                     + " FROM CLAVES "
			                                     + " WHERE CVE_NUM_CLAVE=52 ORDER BY CVE_DESC_CLAVE ASC";
			    break;                          
               					
			}
		    if(origen==0){
                            if (conBD == null) if (!conectarBD()) return sData;
                            if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
                            
                            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                            LOGGER.debug("sQuery: "+sQuery);
                            rsQuery=stQuery.executeQuery(sQuery); 
                            
                            if(rsQuery.next())
                             {
                                            rsQuery.last();                 
                                            sData = new String[rsQuery.getRow()][2];
                                            rsQuery.first();
                                            i=0;
                                            do
                                                    {                               
                                                    switch(iOpcion){
                                                        case 1: // conceptos de retiro
                                                                sData[i][0] = rsQuery.getString(2);                     // Clave
                                                                sData[i][1] = sEncuentraDescripcion(resultado,rsQuery.getString(1));
                                                                break;
                                                        default:
                                                                sData[i][0] = rsQuery.getString(1);                     // Clave
                                                                sData[i][1] = rsQuery.getString(2);                     // Descripcion                          
                                                                break;
                                                    }
                                                    i++;
                                                    }
                                       while(rsQuery.next());
                            }                       
                }else{
                        i=0;
                        String []elemento={null};
                        switch (iOpcion)
                        {
                        case 13: case 3:// formas de retiro
                                 sData = new String[resultado.length][2];
                                 for (String item : resultado) {
                                     LOGGER.debug("FiduciaBD "+item);
                                     elemento=item.split("-");
                                     sData[i][0] = elemento[1];                     // Clave
                                     sData[i][1] = elemento[2]; 
                                     i++;
                                 }
                                 break;
                             default:
                                 LOGGER.debug("default: ");
                                 break;
                        } 
                    }      
		}
		catch (Exception ex)
		{
			LOGGER.error("Exception: ", ex);
			LOGGER.debug(sQuery);
    }
		finally
		{
		    if(origen==0){
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
                    }    
		}
		return sData;
	}


	//Consultas para obtener los datos de una cuenta	
	public String[] getDataCuenta(int iOpcion,String sCond)
		{
		int i;
		String sCve;	
		String[] sData = new String[6];
		try
		{			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			switch(iOpcion)
			{
				case 1: // Cuentas de BANXICO definidas para un fideicomiso
				
					sQuery = "SELECT CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE=400 AND CVE_CVE_ST_CLAVE='ACTIVO' AND CVE_FORMA_EMP_CVE='BANCO DE MEXICO'";
					break;
					
				case 2: // Cuentas de BANCOMER definidas para un fideicomiso
				
					sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_cve_banco=12 AND cdp_estatus='ACEPTADA' AND cdp_num_cuenta=" + sCond.substring(sCond.indexOf('|')+2,sCond.length());
					break;
					
				case 3: // Cuentas de x Banco definidas para un fideicomiso
				
					sQuery = "SELECT cve_num_sec_clave FROM claves WHERE cve_num_clave=27 AND";
					sQuery+= " cve_desc_clave='" + sCond.substring(sCond.indexOf('|')+2,sCond.lastIndexOf('|')-1) + "'";
          

					rsQuery=stQuery.executeQuery(sQuery);
					rsQuery.next();
					sCve=rsQuery.getString(1);
                                        
					sQuery = "SELECT FCBA_NUMERO_CTA_BAN FROM F_CUEBAN WHERE FCBA_STATUS='AUTORIZADA' AND FCBA_BANCO=";
            sQuery = sQuery + sCve + " AND FCBA_CLABE_CBA='";
					sQuery = sQuery + sCond.substring(sCond.lastIndexOf('|')+2,sCond.length())+"'";
					sCve="";
					break;
          
				case 4: // CONVENIOS DE BANCOMER CIE
				
						sQuery = " SELECT CBA_NUM_CUENTA AS CUENTA";
						sQuery += " FROM TERCEROS,CUENTAS ";
						sQuery += " WHERE ";
						sQuery += " TER_NUM_CONTRATO=" + sCond; 
            sQuery += " AND TER_NUM_CONTRATO=CBA_NUM_CONTRATO"; 
            sQuery += " AND TER_NUM_TERCERO=CBA_NUM_PERSON_FID"; 
            sQuery += " AND CBA_CVE_PERSON_FID='TERCERO'"; 
            sQuery += " AND CBA_CVE_TIPO_CTA='CONVENIO CIE'"; 
						break;
          
			}
			
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
			sCve=rsQuery.getString(1);
			

      if (iOpcion!=4)
      {
        sQuery = "SELECT FCBA_BANCO,NVL(FPLB_NOMBRE_PLAZA,'NO EXISTE'),'SUCURSAL',FCBA_TITULAR,FCBA_RFC";
        sQuery +=" FROM F_CUEBAN,F_PLAZAS_BANCO WHERE FCBA_STATUS='AUTORIZADA' AND FCBA_CLABE_CBA='";
        sQuery = sQuery + sCond.substring(sCond.lastIndexOf('|')+2,sCond.length())+"'";        
        sQuery +=" AND FPLB_ID_BANCO=FCBA_BANCO";
        sQuery +=" AND FPLB_ID_PLAZA=FCBA_PLAZA_CBA";
        rsQuery=stQuery.executeQuery(sQuery);
        rsQuery.next();
        
        sData[0] = (rsQuery.getString(1)==null)?"":rsQuery.getString(1);
        sData[1] = (rsQuery.getString(2)==null)?"":rsQuery.getString(2);
        sData[2] = (rsQuery.getString(3)==null)?"":rsQuery.getString(3);
        sData[3] = (rsQuery.getString(4)==null)?"":rsQuery.getString(4);
        sData[4] = (rsQuery.getString(5)==null)?"":rsQuery.getString(5);
      }
      else
        sData[0] = (sCve==null)?"":sCve;
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
		return sData;
	}
	
	
  
  public String obtenNumTercero(String iNumFid) {
    String sNumTercero = "";
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
      sQuery = " SELECT MAX(TER_NUM_TERCERO) + 1 "
             + " FROM TERCEROS"
             + " WHERE TER_NUM_CONTRATO = " + iNumFid  ;
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   sNumTercero = rsQuery.getString(1);
    }catch (Exception ex) {
			LOGGER.error("Exception: ", ex);
      LOGGER.debug("Excepci�n en obtenNumTercero");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
			try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); LOGGER.debug("Excepci�n del Finally"); }
		}
		return sNumTercero;
	}
  
  public boolean insertaTercero(String iNumFid, String sNumTercero, String sPersona, String fecha) {
	  String queryPersona="";
    Statement stInstrucc = null;
    Statement stQuery = null;
    ResultSet rsQuery = null;
		int dia,mes,anio;
    int numTercero = 0;
		dia = Integer.parseInt(fecha.substring(0,2));//dia
		mes = Integer.parseInt(fecha.substring(3,5));//mes
 	 	anio = Integer.parseInt(fecha.substring(6,10));//a�o

		try{
    
      	if (conBD == null) if (!conectarBD()) return false;
				if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
				
				stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);							
				stInstrucc = conBD.createStatement();
			
			queryPersona  = "INSERT INTO TERCEROS ("
						+ " TER_NUM_CONTRATO,"       
            + " TER_NUM_TERCERO, "        
            + " TER_NUM_PAIS, "           
            + " TER_NUM_RAMA, "           
            + " TER_NUM_SRAMA, "          
            + " TER_CVE_MIGRATORIA, "
            + " TER_CVE_SEXO, "           
            + " TER_CVE_TIPO_PERS,"      
            + " TER_NOM_TERCERO,"        
            + " TER_RFC,"                
            + " TER_NOM_NACIONAL,"       
            + " TER_NUM_LADA_CASA,"      
            + " TER_NUM_TELEF_CASA,"
            + " TER_NUM_LADA_OFIC,"      
            + " TER_NUM_TELEF_OFIC,"
            + " TER_NUM_EXT_OFIC,"       
            + " TER_NUM_LADA_FAX,"       
            + " TER_NUM_TELEF_FAX,"      
            + " TER_NUM_EXT_FAX,"        
            + " TER_ANO_ALTA_REG,"       
            + " TER_MES_ALTA_REG,"       
            + " TER_DIA_ALTA_REG,"       
            + " TER_ANO_ULT_MOD, "        
            + " TER_MES_ULT_MOD, "        
            + " TER_DIA_ULT_MOD, "        
            + " TER_CVE_ST_TERCERO "
            +  " ) VALUES ("
						+  iNumFid + ","
						+ sNumTercero  + ","
						+ "0,"
						+ "37,"
						+ "0,"
						+ "'',"
					  + "'',"
						+ "'INTERNET_CHEQUE',"
						+ "'" + sPersona +"',"
						+ "'',"
						+ "'',"
            + "'',"
            + "'',"
            + "'',"
            + "'',"
            + "'',"
            + "'',"
            + "'',"
            + "'',"
            + anio + ","
						+ mes  + ","
						+ dia  + ","
						+ anio + ","
						+ mes  + ","
						+ dia  + ","
						+ "'ACTIVO')";
      stInstrucc.executeUpdate(queryPersona);	
      
      
      queryPersona = " SELECT TER_NUM_TERCERO";
			queryPersona += " FROM TERCEROS ";
			queryPersona += " WHERE TER_NUM_CONTRATO = " + iNumFid;
      queryPersona += " AND TER_NOM_TERCERO = '" + sPersona   + "'";
      queryPersona += " AND TER_CVE_ST_TERCERO  = 'ACTIVO' ";
			rsQuery = stQuery.executeQuery(queryPersona); 
      
		   
			if(	rsQuery.next())
				  numTercero = rsQuery.getInt(1);
		
			queryPersona = " INSERT INTO PERSONASINTERNET (";
      queryPersona += " PIN_NUM_CONTRATO,PIN_NUM_PERSONA, PIN_TIPO_PERS,";          
      queryPersona += " PIN_FORMA_LIQ,PIN_TIPO_OPERACION ) ";
      queryPersona += " VALUES( " + iNumFid + "," + numTercero + "," + "'TERCERO',";
      queryPersona += " 3,'RETIRO')";
      stInstrucc.executeUpdate(queryPersona);					
    }
		catch (Exception ex) {
			LOGGER.debug("Metodo: insertaTercero");
			LOGGER.debug("Error: \n"+ ex);
		} finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.debug("rsQuery"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.debug("stQuery"+ex); }
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaTerceros");LOGGER.error("Exception: ", ex); }
			try { if(conBD != null) CloseBD(); } catch (Exception ex) { LOGGER.debug("Funcion: insertaTercero");LOGGER.error("Exception: ", ex); }
		}
    return true;
	}	
  
  ///   ******  Fin de Metodos  ***** /////
	
		///   Fin de Clase 		

	/*
	Metodo: getSaldoDisponibleAcuerdoCT
	Funcion: Regresa el saldo disponible de un Acuerdo del Comite T�cnico 
	Parametros:(String numFiso,
				String fechaSesion,
				String tipoSesion,
				String noAcuerdo)
	*/		
public double getSaldoDisponibleAcuerdoCT(	int numFiso,
											String fechaSesion,
											String tipoSesion,
											String noAcuerdo)
		{	
		double impDisponible = 0;
		try
		{
			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return -1;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return -1;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			sQuery  = " select a.acu_monto_disponible"
					+ " from fiducia.acuerdos_ct a"
					+ " where "
					+ " a.ses_num_contrato = " + numFiso
					+ " and a.ses_fecha = to_date('" + fechaSesion + "','dd/mm/yyyy')"
					+ " and a.ses_tipo = '" + tipoSesion+"'"
					+ " and a.acu_id ='" + noAcuerdo + "'";
					 
          	rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
				{
				impDisponible = rsQuery.getDouble(1);		
				}

		
		}
		catch (Exception ex)
				{
			LOGGER.debug(ex + "\n CONSULTA:\n"+ex);			
			
    			}
		finally
				{
					try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
					try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
					try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
				}
		return impDisponible;
	}
  
  public String obtenerFechaHabilSig(String sFecha,int nMoneda,int Opcion) {
    String sFechaHabilSig = "";
    try {
   // conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
   if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
   
   
      Connection connection = null;
      
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      StringTokenizer st = new StringTokenizer("");
      CallableStatement spContabiliza;
      int nDias=0;
      int iContTemp=0,iValidaFecha=0;
      int iAuxDia=0;
      String sFechaTemp="",sFecha2="";
      //se
      spContabiliza = conBD.prepareCall( "{ call  CONTABILIDAD_FIDUCIAWEB.F_REGRESA_DIAS(?,?,?,?)}" );
      
      spContabiliza.clearParameters();   
      spContabiliza.registerOutParameter(4, Types.VARCHAR);            
      spContabiliza.setString(1, sFecha);          
      spContabiliza.setInt (2, nMoneda);          
      spContabiliza.setInt (3, Opcion);          
      spContabiliza.execute();
      
      nDias = Integer.valueOf(spContabiliza .getString(4).replaceAll(" ","")).intValue();
      spContabiliza.close();
      LOGGER.debug("opcion"+String.valueOf(nDias));
      if(nDias==1 && Opcion==1)//se contempla caso para antes de las 16:00 para 24 horas
        sFechaHabilSig=sFecha;
      else if(nDias==1 && Opcion==2)//se contempla caso para despues  de las 16:00 para 24 horas
      {
        Opcion=1;
        sFecha2=sFecha;
        while(iContTemp<Opcion)
        {
          //se valida la fecha manualmente
          stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
          sQuery  = "SELECT TO_CHAR(TO_DATE('"+sFecha2+"', 'DD/MM/YYYY')+1,'DD/MM/YYYY')"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
          {
              sFechaTemp = rsQuery.getString(1);              
          }
          rsQuery.close();
          LOGGER.debug("sFechaTemp"+sFechaTemp);
          
          sQuery  = "SELECT TO_NUMBER(TO_CHAR(TO_DATE('"+sFechaTemp+"', 'DD/MM/YYYY'), 'D'))"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
            {
              iAuxDia = rsQuery.getInt(1);  
              LOGGER.debug("Auxdia"+iAuxDia);
            
              if (!(iAuxDia==7||iAuxDia==6))
              {
                //LOGGER.debug("Auxdia1"+iAuxDia);
                sQuery="SELECT COUNT(1) "+
                "FROM FERIADOS " +
                "WHERE FER_NUM_PAIS = "+String.valueOf(nMoneda)+" AND FER_FEC_MES = SUBSTR('"+sFechaTemp+"', 4, 2) AND " +
                "FER_FEC_DIA = SUBSTR('"+sFechaTemp+"', 1, 2)";
                rsQuery_Secuen=stQuery.executeQuery(sQuery);
                
                if(rsQuery_Secuen.next())
                  if(rsQuery_Secuen.getInt(1)==0){
                    iContTemp++;
                    LOGGER.debug("sFechaTemp"+sFechaTemp);
                  }  
                LOGGER.debug("iContTemp:"+iContTemp);
                    
                rsQuery_Secuen.close();    
              }
              
            }
          rsQuery.close();
          LOGGER.debug("iContTemp:"+iContTemp);          
        
          sFecha2=sFechaTemp;  
          LOGGER.debug("sFecha2"+sFecha2);
          sFecha=sFecha2;
        }
        sFechaHabilSig=sFecha2;
        
      }
      else if(nDias==2)//se contempla caso para 48 horas , no importa si es para antes o despues de las 16:00
         sFechaHabilSig=sFecha; 
      if (nDias ==0){
        sFecha2=sFecha;
        while(iContTemp<Opcion)
        {
          //se valida la fecha manualmente
          stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
          sQuery  = "SELECT TO_CHAR(TO_DATE('"+sFecha2+"', 'DD/MM/YYYY')+1,'DD/MM/YYYY')"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
          {
              sFechaTemp = rsQuery.getString(1);              
          }
          rsQuery.close();
          LOGGER.debug("sFechaTemp"+sFechaTemp);
          
          sQuery  = "SELECT TO_NUMBER(TO_CHAR(TO_DATE('"+sFechaTemp+"', 'DD/MM/YYYY'), 'D'))"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
            {
              iAuxDia = rsQuery.getInt(1);  
              LOGGER.debug("Auxdia"+iAuxDia);
            
                if (!(iAuxDia==7||iAuxDia==6))
              {
                //LOGGER.debug("Auxdia1"+iAuxDia);
                sQuery="SELECT COUNT(1) "+
                "FROM FERIADOS " +
                "WHERE FER_NUM_PAIS = "+String.valueOf(nMoneda)+" AND FER_FEC_MES = SUBSTR('"+sFechaTemp+"', 4, 2) AND " +
                "FER_FEC_DIA = SUBSTR('"+sFechaTemp+"', 1, 2)";
                rsQuery_Secuen=stQuery.executeQuery(sQuery);
                
                if(rsQuery_Secuen.next())
                  if(rsQuery_Secuen.getInt(1)==0){
                    iContTemp++;
                    LOGGER.debug("sFechaTemp"+sFechaTemp);
                  }  
                LOGGER.debug("iContTemp:"+iContTemp);
                    
                rsQuery_Secuen.close();    
              }
              
            }
          rsQuery.close();
          LOGGER.debug("iContTemp:"+iContTemp);          
          sFecha2=sFechaTemp;  
          LOGGER.debug("sFecha2"+sFecha2);
        }
        sFechaHabilSig=sFecha2;
      }      
      else{
        //validar si el dia es habil sino recorrerlo hasta el proximo dia habil
        while(true)
        {
          stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
          sQuery  = "SELECT TO_NUMBER(TO_CHAR(TO_DATE('"+sFecha+"', 'DD/MM/YYYY'), 'D'))"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
            {
              iAuxDia = rsQuery.getInt(1);  
              LOGGER.debug(sFecha+ " Auxdia "+iAuxDia);
            
                if (!(iAuxDia==7||iAuxDia==6))
              {
                //LOGGER.debug("Auxdia1"+iAuxDia);
                sQuery="SELECT COUNT(1) "+
                "FROM FERIADOS " +
                "WHERE FER_NUM_PAIS = "+String.valueOf(nMoneda)+" AND FER_FEC_MES = SUBSTR('"+sFecha+"', 4, 2) AND " +
                "FER_FEC_DIA = SUBSTR('"+sFecha+"', 1, 2)";
                rsQuery_Secuen=stQuery.executeQuery(sQuery);
                
                if(rsQuery_Secuen.next())
                  if(rsQuery_Secuen.getInt(1)==0){
                    sFechaHabilSig=sFecha;//ndias >2
                    LOGGER.debug("sFechaTemp"+sFechaTemp);
                    break;
                  }  
                LOGGER.debug("iContTemp:"+iContTemp);
                    
                rsQuery_Secuen.close();    
              }
              
            }
          rsQuery.close();
        
          sQuery  = "SELECT TO_CHAR(TO_DATE('"+sFecha+"', 'DD/MM/YYYY')+1,'DD/MM/YYYY')"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
          {
              sFecha = rsQuery.getString(1);              
          }
          rsQuery.close();
          LOGGER.debug("sFechaTemp"+sFecha);
          
        }  
      }   
      fiduciaConnection.CloseBD();
   }catch (Exception ex) {
   LOGGER.error("Exception: ", ex);
      LOGGER.debug("Excepci�n en obtenNumTercero");
    } finally {
   try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
   try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
   try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); LOGGER.debug("Excepci�n del Finally"); }
  }
    return sFechaHabilSig;
  }
  
  public String obtenerFechaHabilSigxnDias(String sFecha,int nDias,int nMoneda) {
    String sFechaHabilSig = "";
    try {
   // conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
   if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
   
   
      Connection connection = null;
      
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      StringTokenizer st = new StringTokenizer("");
      CallableStatement spContabiliza;
      int iContTemp=0,iValidaFecha=0;
      int iAuxDia=0;
      String sFechaTemp="",sFecha2="";
    
      sQuery  = "SELECT TO_CHAR(TO_DATE('"+sFecha+"', 'DD/MM/YYYY')+"+String.valueOf(nDias)+",'DD/MM/YYYY')"
      +" FROM DUAL";
           
      rsQuery=stQuery.executeQuery(sQuery);
      if(rsQuery.next())
      {
          sFecha = rsQuery.getString(1);              
      }
      rsQuery.close();
      
        while(true)
        {
          stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
          sQuery  = "SELECT TO_NUMBER(TO_CHAR(TO_DATE('"+sFecha+"', 'DD/MM/YYYY'), 'D'))"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())//SE VALIDA QUE LA FUNCION DE ARRIBA NOS REGRESE LA SIGUIENTE FECHA
            {
              iAuxDia = rsQuery.getInt(1);  
              LOGGER.debug(sFecha+ " Auxdia "+iAuxDia);
            
              if (!(iAuxDia==7||iAuxDia==6)) //PARA PRODUCCION VALIDA SI NO ES SABADO O DOMINGO
              {
                //LOGGER.debug("Auxdia1"+iAuxDia);
                sQuery="SELECT COUNT(1) "+
                "FROM FERIADOS " +
                "WHERE FER_NUM_PAIS = "+String.valueOf(nMoneda)+" AND FER_FEC_MES = SUBSTR('"+sFecha+"', 4, 2) AND " +
                "FER_FEC_DIA = SUBSTR('"+sFecha+"', 1, 2)";
                rsQuery_Secuen=stQuery.executeQuery(sQuery);
                
                if(rsQuery_Secuen.next())
                  if(rsQuery_Secuen.getInt(1)==0){
                    sFechaHabilSig=sFecha;//ndias >2
                    LOGGER.debug("sFechaTemp"+sFechaTemp);
                    break;
                  }  
                LOGGER.debug("iContTemp:"+iContTemp);
                    
                rsQuery_Secuen.close();    
              }
              
            }
          rsQuery.close();
        
          sQuery  = "SELECT TO_CHAR(TO_DATE('"+sFecha+"', 'DD/MM/YYYY')+1,'DD/MM/YYYY')"
          +" FROM DUAL";
               
          rsQuery=stQuery.executeQuery(sQuery);
          if(rsQuery.next())
          {
              sFecha = rsQuery.getString(1);              
          }
          rsQuery.close();
          LOGGER.debug("sFechaTemp"+sFecha);
          
        }    
      fiduciaConnection.CloseBD();
   }catch (Exception ex) {
   LOGGER.error("Exception: ", ex);
      LOGGER.debug("Excepci�n en obtenNumTercero");
    } finally {
   try { if(conBD != null ) conBD.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
   try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
   try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
   try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); LOGGER.debug("Excepci�n del Finally"); }
  }
    return sFechaHabilSig;
  }	
  
}