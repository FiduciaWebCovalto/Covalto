/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.negocio;

import mx.com.inscitech.clients.lib.servicios;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import java.io.*;
import java.text.*;
import java.util.*;
import java.sql.*;

import javax.imageio.ImageIO;

import oracle.jdbc.driver.*;


public class EdoCuenta extends nFiducia{
	
    int origen=0;//1 origen servicios y 0 query
    servicios serv = new servicios();


   //Catalogos
	public String[] getData(int iOpcion,String sCond)
	{
		String[] sData = null;
		try
		{
			int i;
			switch (iOpcion)
			{
				case 1: //Cuentas BANCOMEXT
				
					sQuery = " SELECT CVE_DESC_CLAVE ";
          sQuery += " FROM CLAVES ";
          sQuery += " WHERE ";
          sQuery += " CVE_NUM_CLAVE = 403";
          sQuery += " AND CVE_LIMSUP_CLAVE IS NOT NULL ";
          break;
					
				case 2: //Cuentas de BANXICO para un fideicomiso clave=27, subclave=164
					
					sQuery = "SELECT cdp_num_cuenta FROM cuendep, perfirdi";
					sQuery += " WHERE pfd_num_contrato=" + sCond;
					sQuery += " AND cdp_cve_banco=164 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
					sQuery += " and cdp_num_cuenta<>0";		
					break;
					
				case 3: // Contratos de Inversion
					
                                    origen=1;
                                    System.out.println("Condicion caso 3"+sCond);
                                    resultado=serv.consumo(13,sCond); 
                                    sData=new String[resultado.length];
                                    sData= resultado;
                                    sQuery = "SELECT FCI_NUM_CTA||'-'||FCI_NOMBRE_CTA||'-'||FCI_MONEDA,FCI_NUM_CTA FROM F_CUENTAS_INVERSION "; 
                                    sQuery += " WHERE FCI_NUM_FIDEICOMISO = " + sCond;
                                    sQuery += " ORDER BY FCI_NUM_CTA ASC";
                                    break;
					
				case 4: // Monedas
				
					sQuery = "SELECT mon_nom_moneda FROM monedas ORDER BY mon_nom_moneda ASC"; 
					break;
					
				case 5: // Paises
				
					sQuery = "SELECT distinct pai_nom_pais FROM paises ORDER BY pai_nom_pais ASC"; 
					break;
					
				case 6: // Conceptos de deposito
				
					sQuery = " SELECT CVE_DESC_CLAVE FROM CLAVES, F_CATMAES_FIDEIC ";
          sQuery += " WHERE FCMA_ID_PADRE = CVE_NUM_CLAVE ";
          sQuery += " AND FCMA_ID_SEC_CATMA = CVE_NUM_SEC_CLAVE";
          sQuery += " AND CVE_NUM_CLAVE = 75 ";
          sQuery += " AND FFID_ID_FIDEICOMISO = " + sCond;
          sQuery += " ORDER BY FCMA_ID_SEC_CATMA ASC "; 
          break;
					
				case 7: // Conceptos de retiro
								
					sQuery = " SELECT CVE_DESC_CLAVE FROM CLAVES, F_CATMAES_FIDEIC ";
          sQuery += " WHERE FCMA_ID_PADRE = CVE_NUM_CLAVE ";
          sQuery += " AND FCMA_ID_SEC_CATMA = CVE_NUM_SEC_CLAVE";
          sQuery += " AND CVE_NUM_CLAVE = 128 ";
          sQuery += " AND FFID_ID_FIDEICOMISO = " + sCond;
          sQuery += " ORDER BY FCMA_ID_SEC_CATMA ASC "; 
          break;
          
					
				case 8: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12
				
					sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
					sQuery += " WHERE pfd_num_contrato=" + sCond ;
					sQuery += " AND cdp_cve_banco=12 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
					sQuery += " and cdp_num_cuenta<>0";
					sQuery += " and cdp_estatus = 'ACEPTADA' ";
          sQuery += " order by cdp_titular ";
					break;
					
				case 9: //Cuentas de todos los bancos para un fideicomiso
				  
          sQuery = "  SELECT  substr(cdp_titular,1,20) || ' | ' || cve_desc_clave || ' | ' || cdp_num_cuenta ";
					sQuery += " FROM cuendep, perfirdi, claves";
					sQuery += " WHERE";
          sQuery += " pfd_num_contrato=" + sCond + " AND";
					sQuery += " cve_num_clave=27 AND";
					sQuery += " pfd_cve_cuendep=cdp_cve_cuendep AND";
					sQuery += " cdp_cve_banco=cve_num_sec_clave";
					sQuery += " and cdp_num_cuenta<>0";	
          sQuery += " and cdp_estatus = 'ACEPTADA'";
          sQuery += " order by cdp_titular ";
          break;

		case 10: //Datos para cuentas individuales          
          sQuery = "SELECT SUBSTR(DAT_CLAVE,";
          sQuery += " 	   				(SELECT NVL(SUM(EST_LONG_ID),0)";
          sQuery += " 	   				FROM    FID_ESTRUC_CTAS_IND";
          sQuery += " 	   				WHERE   EST_CONTRATO = DAT_CONTRATO";
          sQuery += " 	   				AND     EST_NIVEL < DAT_NIVEL) + 1,";
          sQuery += " 						(SELECT EST_LONG_ID";
          sQuery += " 						FROM    FID_ESTRUC_CTAS_IND";
          sQuery += " 						WHERE   EST_CONTRATO = DAT_CONTRATO"; 
          sQuery += " 						AND     EST_NIVEL = DAT_NIVEL))";
          sQuery += "        || ' - ' || REPLACE(DAT_DATO,'\"','  ') ";
          sQuery += " FROM   FID_DATOS_EST_CTAS";
          sQuery += " WHERE  DAT_CONTRATO = " + sCond;
          sQuery += " CONNECT BY PRIOR DAT_ID = DAT_PARENT_ID";
          sQuery += " ORDER BY DAT_CLAVE";
          break;

				case 11: //Municipios para cuentas individuales de Fonafe
					
          //sQuery = "SELECT mun_Clave || ' - ' || mun_Nombre";
					//sQuery += " FROM municipios WHERE mun_ent_clave=" +  sCond;
					//sQuery += " ORDER BY mun_clave, mun_nombre";
					break;

				case 12: //Ejidos o inversionistas para cuentas individuales
				
					//sQuery = "SELECT inv_clave || ' - ' || inv_nombre";
					//sQuery += " FROM inversionistas";
					//sQuery += " WHERE";
					//sQuery += " inv_ent_clave=" + sCond;
					//sQuery += " AND  inv_cve_st_invers = 'ACTIVO' ORDER BY inv_clave";					
					break;				case 13: //EJERCICIOS DE FOSEG
				
					sQuery = "select distinct SAL_NUM_AUX2 from SALDOS ";
 					sQuery +=" where SAL_NUM_CTAM=7000 ";
 					sQuery +=" and SAL_NUM_AUX1="+sCond;		
 					sQuery +=" order by SAL_NUM_AUX2 asc";
					break;
					

				case 14: //EJES DE FOSEG
				
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
					
				case 15: //PROGRAMAS DEL EJE DE FOSEG
				  
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
				
				case 16: //PROYECTOS DEL PROGRAMA DEL EJE DE FOSEG
				  
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
					
				case 17: //ACCIONES DEL PROYECTO DEL PROGRAMA DEL EJE DE FOSEG
				  
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

				case 18: //UNIDADES EJECUTORAS DE LA ACCION DEL PROYECTO DEL PROGRAMA DEL EJE DE FOSEG
				  
          sQuery = "select  distinct C.CUE_NUM_SSSSSCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSSSCTA from CUENTACO C,SALDOS S";
 					sQuery +=" where S.SAL_NUM_CTAM=7000  ";		
 					sQuery +=" and S.SAL_NUM_AUX1="+sCond.substring(0,sCond.indexOf(',')).trim(); 		
 					sQuery +=" and S.SAL_NUM_AUX2="+sCond.substring(sCond.indexOf(',')+1,sCond.indexOf(':')).trim();
 					sQuery +=" and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
 					sQuery +=" and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
 					sQuery +=" and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
 					sQuery +=" and SAL_NUM_SCTA="+sCond.substring(sCond.indexOf(':')+1,sCond.indexOf("-")).trim();
 					sQuery +=" and SAL_NUM_SSCTA="+sCond.substring(sCond.indexOf('-')+1,sCond.indexOf('_')).trim();
 					sQuery +=" and SAL_NUM_SSSCTA="+sCond.substring(sCond.indexOf('_')+1,sCond.length()).trim();
 					sQuery +=" and SAL_NUM_SSSSCTA="+sCond.substring(sCond.indexOf('_')+1,sCond.length()).trim();          
 					sQuery +=" and SAL_NUM_SSSSSCTA<>0";          
 					sQuery +=" order by S.SAL_NUM_SSSSCTA asc";
					break;
					
				case 20: //EJES DEL CATALOGO FOSEG
				
					sQuery = "select  distinct C.CUE_NUM_SCTA || ' - ' || C.CUE_NOM_CTA,C.CUE_NUM_SCTA"
							+" from CUENTACO C "
 							+" where C.CUE_NUM_CTAM=7000 "
 						 	+" and C.CUE_NUM_SCTA>0 "
 							+" and C.CUE_NUM_SSCTA=0 and C.CUE_NUM_SSSCTA=0 and C.CUE_NUM_SSSSCTA=0 "
 							+" order by C.CUE_NUM_SCTA  asc";
 					
					break;
					
				case 21: //PROGRAMAS DEL EJE DEL CATALOGO FOSEG
				
				 sQuery = "select  distinct C.CUE_NUM_SSCTA || ' - ' || C.CUE_NOM_CTA,C.CUE_NUM_SSCTA"
							+" from CUENTACO C "
 							+" where C.CUE_NUM_CTAM=7000"
 						 	+" and C.CUE_NUM_SCTA="+sCond.trim()
 							+" and C.CUE_NUM_SSCTA<>0 and C.CUE_NUM_SSSCTA=0 and C.CUE_NUM_SSSSCTA=0 "
 							+" order by C.CUE_NUM_SSCTA  asc";
  					
					break;
				
				case 22: //PROYECTOS DEL PROGRAMA DEL EJE DEL CATALOGO FOSEG
				
					sQuery = "select  distinct C.CUE_NUM_SSSCTA || ' - ' || C.CUE_NOM_CTA,C.CUE_NUM_SSSCTA"
							+" from CUENTACO C "
 							+" where C.CUE_NUM_CTAM=7000"
 						 	+" and C.CUE_NUM_SCTA="+sCond.substring(0,sCond.indexOf("-")).trim()
 						 	+" and C.CUE_NUM_SSCTA="+sCond.substring(sCond.indexOf('-')+1,sCond.length()).trim()
 							+" and C.CUE_NUM_SSSCTA<>0  and C.CUE_NUM_SSSSCTA=0 "
 							+" order by C.CUE_NUM_SSSCTA  asc";
 								 					
					break;
					
				case 23: //ACCIONES DEL PROYECTO DEL PROGRAMA DEL EJE DEL CATALOGO  FOSEG								
				
        		sQuery = "select  distinct C.CUE_NUM_SSSSCTA || ' - ' || C.CUE_NOM_CTA,C.CUE_NUM_SSSSCTA "
								+" from CUENTACO C "
	 							+" where C.CUE_NUM_CTAM=7000"
	 						 	+" and C.CUE_NUM_SCTA="+sCond.substring(0,sCond.indexOf("-")).trim()
 						 		+" and C.CUE_NUM_SSCTA="+sCond.substring(sCond.indexOf('-')+1,sCond.indexOf('_')).trim()
	 							+" and C.CUE_NUM_SSSCTA="+sCond.substring(sCond.indexOf('_')+1,sCond.length()).trim()
	 							+" and C.CUE_NUM_SSSSCTA<>0 "
	 							+" order by C.CUE_NUM_SSSSCTA  asc"; 							
 							break;	 					
        
        case 24: //lista de usuarios Bitacora
					
          sQuery = " SELECT distinct FUSU_NOMBRE_USUARIO" 
                 + " FROM F_USUARIO" 
                 + " WHERE FUSU_STATUS='ACTIVO'";	
					break;
				// Se incluyo esta consulta para los traspasos inter-fideicomiso
				// Obtiene Contratos Origen
 				case 35: //TRANSFERENCIA INTER-FIDEICOMISOS								
				
        		sQuery = " SELECT DISTINCT TIF_CTO_INTER_ORIGEN"
								+" FROM CONTINTE , TRASPINTERFID "
								+" WHERE TIF_CTO_ORIGEN = CPR_NUM_CONTRATO "
								+" AND TIF_CTO_INTER_ORIGEN = CPR_CONTRATO_INTER"
								+" AND TIF_CTO_ORIGEN = " + sCond
								+" AND CPR_CVE_ST_CONTINT = 'ACTIVO'"
								+" ORDER BY TIF_CTO_INTER_ORIGEN"; 							
 							break;	
 							
 			  case 36: //TRANSFERENCIA INTER-FIDEICOMISOS			
 			  				 // Obtiene FISO destino					
					sQuery = " SELECT DISTINCT TIF_CTO_DESTINO"
							+" FROM CONTRATO , TRASPINTERFID "
							+" WHERE CTO_NUM_CONTRATO =  TIF_CTO_DESTINO"
							+" AND TIF_CTO_ORIGEN = " + sCond
							+" AND CTO_CVE_ST_CONTRAT = 'ACTIVO'"
							+" ORDER BY TIF_CTO_DESTINO"; 							
 							break;
 							
 			  case 37: //TRANSFERENCIA INTER-FIDEICOMISOS								
 			  				// OBTINE Contratos destino
							sQuery = " SELECT   DISTINCT TIF_CTO_INTER_DESTINO"
								+" FROM CONTINTE , TRASPINTERFID "
								+" WHERE TIF_CTO_DESTINO 	 = CPR_NUM_CONTRATO "
								+" AND TIF_CTO_INTER_DESTINO = CPR_CONTRATO_INTER"
								+" AND TIF_CTO_ORIGEN = " + sCond
								+" AND CPR_CVE_ST_CONTINT = 'ACTIVO'"
								+" ORDER BY TIF_CTO_INTER_DESTINO"; 							
 							break;
 			   case 38:  // Obtiene el tipo de Contabilidad del fideicomiso
		            sQuery = "SELECT NVL(CTO_TIPO_CONT,7)"
								+" FROM CONTRATO "
								+" WHERE CTO_NUM_CONTRATO = " + sCond;					
				 break;
              
        case 39: //Beneficiario y Terceros
                sQuery = " SELECT DISTINCT TER_NOM_TERCERO,PFD_TIPO_PERS," ;
						    sQuery += " PFD_NUMERO_PERS,";
						    sQuery += " TER_NOM_TERCERO";
						    sQuery += " FROM PERFIRDI, TERCEROS";
						    sQuery += " WHERE TER_NUM_CONTRATO=PFD_NUM_CONTRATO";
						    sQuery += " AND PFD_NUM_CONTRATO=" + sCond; 
						    sQuery += " AND TER_NUM_TERCERO=PFD_NUMERO_PERS";
						    sQuery += " AND PFD_TIPO_PERS<>'0'";
						    sQuery += " AND PFD_TIPO_PERS='TERCERO'";						
						    sQuery += " UNION ALL";
						    sQuery += " SELECT DISTINCT BEN_NOM_BENEF, PFD_TIPO_PERS,";
						    sQuery += " PFD_NUMERO_PERS,";
						    sQuery += " BEN_NOM_BENEF";
						    sQuery += " FROM PERFIRDI, BENEFICI";
						    sQuery += " WHERE BEN_NUM_CONTRATO=PFD_NUM_CONTRATO";
						    sQuery += " AND PFD_NUM_CONTRATO=" + sCond; 
						    sQuery += " AND BEN_BENEFICIARIO=PFD_NUMERO_PERS";
						    sQuery += " AND PFD_TIPO_PERS<>'0'" ;
						    sQuery += " AND PFD_TIPO_PERS='BENEFICIARIO'";						
						    sQuery += " UNION ALL";
						    sQuery += " SELECT BEN_NOM_BENEF,PIN_TIPO_PERS,";
						    sQuery += " PIN_NUM_PERSONA,";
						    sQuery += " BEN_NOM_BENEF";
						    sQuery += " FROM PERSONASINTERNET, BENEFICI";
						    sQuery += " WHERE BEN_NUM_CONTRATO=PIN_NUM_CONTRATO";
						    sQuery += " AND PIN_NUM_CONTRATO=" + sCond; 
						    sQuery += " AND BEN_BENEFICIARIO=PIN_NUM_PERSONA";
						    sQuery += " AND PIN_TIPO_PERS<>'0'" ;
						    sQuery += " AND PIN_TIPO_PERS='BENEFICIARIO'";
//						    sQuery += " AND PIN_TIPO_OPERACION='RETIRO'";
						    sQuery += " UNION ALL";						 
						    sQuery += " SELECT TER_NOM_TERCERO,PIN_TIPO_PERS,";
						    sQuery += " PIN_NUM_PERSONA,";
						    sQuery += " TER_NOM_TERCERO";
						    sQuery += " FROM PERSONASINTERNET, TERCEROS";
						    sQuery += " WHERE TER_NUM_CONTRATO=PIN_NUM_CONTRATO";
						    sQuery += " AND PIN_NUM_CONTRATO=" + sCond; 
						    sQuery += " AND TER_NUM_TERCERO=PIN_NUM_PERSONA";
						    sQuery += " AND PIN_TIPO_PERS<>'0'" ;
						    sQuery += " AND PIN_TIPO_PERS='TERCERO'";
//						    sQuery += " AND PIN_TIPO_OPERACION='RETIRO'";
				break;	


						case 40://Fideicomitentes
							sQuery = "SELECT TO_CHAR(FID_FIDEICOMITENTE) || ' - ' || FID_NOM_FIDEICOM";
							sQuery+= " FROM FIDEICOM WHERE FID_NUM_CONTRATO=" + sCond; 
						    sQuery+= " AND UPPER(FID_NOM_FIDEICOM) NOT LIKE '%HONORARIOS%'";
							sQuery+= " ORDER BY UPPER(FID_NOM_FIDEICOM) ASC";
						break;
						case 41://Fideicomisarios
							sQuery = "SELECT TO_CHAR(BEN_BENEFICIARIO) || ' - ' || BEN_NOM_BENEF";
							sQuery+= " FROM BENEFICI WHERE BEN_NUM_CONTRATO=" + sCond;
							sQuery+= " ORDER BY UPPER(BEN_BENEFICIARIO) ASC";
						break;	
						
						case 42://Terceros
							sQuery = "SELECT TO_CHAR(TER_NUM_TERCERO) || ' - ' || TER_NOM_TERCERO";
							sQuery+= " FROM TERCEROS WHERE TER_NUM_CONTRATO=" + sCond ;
							sQuery+= " AND UPPER(TER_NOM_TERCERO) NOT LIKE '%VARIOS%'";
							sQuery+= " AND UPPER(TER_NOM_TERCERO) NOT LIKE '%TBC%'";
							sQuery+= " AND UPPER(TER_NOM_TERCERO) NOT LIKE '%VENTANILLA%'";
							sQuery+= " AND UPPER(TER_NOM_TERCERO) NOT LIKE '%HONORARIOS%'";
							sQuery+= " ORDER BY UPPER(TER_NOM_TERCERO) ASC";
						break;
            
						case 43://Clave de moneda
              sQuery = "SELECT mon_num_pais FROM monedas WHERE mon_nom_moneda='" + sCond+ "'";
            break;

           case 44://recupera numero de cuenta en formato caracter
				   sQuery = " SELECT CVE_LIMSUP_CLAVE "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 403 "
                  + " AND CVE_DESC_CLAVE = '" + sCond + "'"; 
           break;
            case 45://recupera numero de cuenta bancaria
				   sQuery = " SELECT CPR_NUM_CUENTA "
                  + " FROM CONTINTE "
                  + " WHERE CPR_NUM_CONTRATO = '" + sCond + "'";
           break;
           
           case 46://recupera numero de cuenta bancaria de la tabla f_fideico_cueban
				   sQuery = "select substr(fcba_clabe_cba,7,11) as fcba_clabe_cba " 
                  + "from f_fideico_cueban where ffid_id_fideicomiso = '"+sCond+"'";
           break;
           
           case 47://recupera clave de la tabla f_fideico_cueban
				   sQuery = "select fcba_clabe_cba " 
                  + "from f_fideico_cueban where ffid_id_fideicomiso = '"+sCond+"'";
           break;
           
           case 48://recupera clave de la tabla claves
				   sQuery = "select to_char(cve_num_sec_clave)||'-'||cve_desc_clave as banco " + " from claves where cve_num_clave=27 order by cve_desc_clave asc";
           break;
           
           case 49://recupera las subctas dado un fideicomiso
				   sQuery = "SELECT  TO_CHAR(FSCT_ID_SUB_CUENTA)||'-'||FSCT_NOMBRE_SUB_CUENTA AS SUBCTA "
                  + "FROM F_SUBCUENTA "
                  + "WHERE FSCT_ID_FIDEICOMISO = '"+sCond+"'"
                  + " order by FSCT_ID_SUB_CUENTA";
                 
           break;
          case 50://recupera numero de cuenta bancaria de la tabla f_fideico_cueban
				   sQuery = "select substr(F.fcba_clabe_cba,7,11) as fcba_clabe_cba " 
                  + "from f_fideico_cueban F,F_CUEBAN C where C.FCBA_CLABE_CBA=F.FCBA_CLABE_CBA AND   F.ffid_id_fideicomiso = '"+sCond+"' "
                   +" order by substr(F.fcba_clabe_cba,7,11)";
           break;
           case 51://recupera numero de cuenta bancaria de la tabla f_fideico_cueban
           String datos[]=sCond.split("-");
				   sQuery = "select substr(F.fcba_clabe_cba,7,11) as fcba_clabe_cba " 
                  + "from f_fideico_cueban F,F_CUEBAN C where C.FCBA_CLABE_CBA=F.FCBA_CLABE_CBA AND   F.ffid_id_fideicomiso = '"+datos[0]+"' and C.fcba_clas_tipo="+datos[1]+" and C.fcba_num_tipo="+datos[2]+" ";
           break;
           
           case 52://recupera datos_f_empresa
				   sQuery = "SELECT EMP_NUM_EMPRESA||'-'||EMP_NOM_EMPRESA||'-'||EMP_NOM_AREA||'-'||EMP_DIRECCION||'-'||EMP_NOM_AUTORIZA||'-'||EMP_NOM_FIRMA||'-'||EMP_IDIOMA||'-'||EMP_ESTILO||'-'||EMP_FEC_CAMBIO||'-'||EMP_LLAVE_EMPRESA " 
                  + "FROM F_EMPRESA WHERE EMP_NUM_EMPRESA = "+sCond;
           break;

           case 53://recupera clave de la tabla claves
				   sQuery = "SELECT MON_NUM_PAIS||'-'||MON_NOM_MONEDA FROM MONEDAS ORDER BY MON_NUM_PAIS ASC";
           break;
           
           case 54://recupera ejecutivos
				   sQuery = "SELECT EJE_NUM_EJEC_ATENC||'-'||EJE_NOM_EJECUTIVO FROM EJECUTIV WHERE EJE_CVE_ST_EJECUTI = 'ACTIVO' ORDER BY EJE_NOM_EJECUTIVO";
           break;
          case 55://recupera todas las cuentas que coincidan
                    String[] datoscecoban=sCond.split("-");   
                    sQuery = "SELECT TO_CHAR(FID_FIDEICOMITENTE) || ' - ' || FID_NOM_FIDEICOM,FID_NOM_FIDEICOM";
                    sQuery+= " FROM FIDEICOM WHERE FID_NUM_CONTRATO=" + datoscecoban[0]; 
                    sQuery+= " AND UPPER(FID_NOM_FIDEICOM) LIKE UPPER('%"+datoscecoban[1]+"%')";
                    sQuery+= " UNION SELECT TO_CHAR(BEN_BENEFICIARIO) || ' - ' || BEN_NOM_BENEF,BEN_NOM_BENEF";
                    sQuery+= " FROM BENEFICI WHERE BEN_NUM_CONTRATO=" + datoscecoban[0];
                    sQuery+= " AND UPPER(BEN_NOM_BENEF) LIKE UPPER('%"+datoscecoban[1]+"%')";                            
                    sQuery+= " UNION SELECT TO_CHAR(TER_NUM_TERCERO) || ' - ' || TER_NOM_TERCERO,TER_NOM_TERCERO";
                    sQuery+= " FROM TERCEROS WHERE TER_NUM_CONTRATO=" + datoscecoban[0] ;
                    sQuery+= " AND UPPER(TER_NOM_TERCERO) LIKE UPPER('%"+datoscecoban[1]+"%')";                                                        
                    sQuery+= " ORDER BY 2 ASC";
                            
                        
          break;  
          case 56://recupera tipos de pago
                                  sQuery = "SELECT CVE_NUM_SEC_CLAVE||'-'||CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE=1014 ORDER BY CVE_NUM_SEC_CLAVE ASC";
          break;
        
          case 57://recupera ANTERIOR / POSTERIOR
                                  sQuery = "SELECT CVE_NUM_SEC_CLAVE||'-'||CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE=1015 ORDER BY CVE_NUM_SEC_CLAVE ASC";
          break;                        

          case 58://recupera USUARIOS PARA ENVIO CORREOS
                                  sQuery = "SELECT PER_NUM_USUARIO||'-'||PER_NOM_USUARIO FROM PERSONAL ORDER BY PER_NUM_USUARIO ASC";
          break;
                        
          case 1016://recupera las formas de inversion
              sQuery = "SELECT CVE_NUM_SEC_CLAVE || '-' || CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE = 1016 ORDER BY CVE_NUM_SEC_CLAVE ASC";
          break;
                        
          case 1017://recupera las formas de inversion
              sQuery = "SELECT CVE_NUM_SEC_CLAVE || '-' || CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE = 1017 ORDER BY CVE_NUM_SEC_CLAVE ASC";
          break;
                        
          case 1018://recupera las formas de inversion
              sQuery = "SELECT CVE_NUM_SEC_CLAVE || '-' || CVE_DESC_CLAVE FROM CLAVES WHERE CVE_NUM_CLAVE = 1018 ORDER BY CVE_NUM_SEC_CLAVE ASC";
          break;  
            
      }
            if(origen==0){
                    // conectandose a la base
                    if (conBD == null) if (!conectarBD()) return sData;
                    if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
                    
                    stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    System.out.println("EdoCuenta sQuery getData: "+sQuery);
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
			System.out.println(ex);
    }
		finally
		{
            if(origen==0){
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
                        }
		}
		return sData;
	}

	public int insertaBitacora(String[] bitacora)
	    {
	    String fecha=bitacora[0];
	    String folio=bitacora[1];
	    String numUsuario=bitacora[2];
	    String detalle=bitacora[3];
	    	
		String ipPcUsuario=bitacora[4]!=null?bitacora[4]:"";
		String queryBitacora="";
		int dia,mes,anio;
		dia = Integer.parseInt(fecha.substring(0,2));//dia
		mes = Integer.parseInt(fecha.substring(3,5));//mes
 	 	anio = Integer.parseInt(fecha.substring(6,10));//a�o

		try
		{
			// conectandose a la base
		    if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stInstrucc = conBD.createStatement();
			conBD.setAutoCommit(false);	
							
			queryBitacora  = "INSERT INTO F_BITACORA ("
							+ " FBIT_FECHA,"
							+ " FBIT_SECUENCIAL_FOLIO,"
							+ " FUSU_ID_USUARIO,"
							+ " FBIT_DESCRIPCION)"
							+ "  VALUES ("
							+ " TO_DATE('" + fecha + "','DD/MM/YYYY'),"
							+ folio + ","
							+ "'" + numUsuario + "',"
							+ "'" + detalle + "')";
			System.out.println("Query "+queryBitacora);
			iRows = stInstrucc.executeUpdate(queryBitacora);					
			
		}
		catch (Exception ex)
		{
			iRows=0;
			
			try{
				conBD.rollback();
				conBD.commit();
				System.out.println("rollback");
				}
			catch(SQLException e)
				{
						
				System.out.println("Metodo: insertaBitacora:"+e);	
				}
		}
		finally
		{
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { System.out.println("Funcion: insertaBitacora");System.out.println(ex); }
			try { conBD.setAutoCommit(true);CloseBD(); } catch (Exception ex) { System.out.println("Funcion: insertaBitacora");System.out.println(ex); }			
			return iRows;
		}
	}
   //regresa verdadero si el importe solicitado es menor o igual al Maximo Permitido para el usuario
   //regresa falso si el importe solicitado es superior al Maximo permitido para el usuario
	public boolean getImporteMaxRetiro(String numUsuario,String importeSolicitado)
	    {
		String queryImporteMaxRetiro="";
		double importeMaximo=0;

		try
		{
			// conectandose a la base
		    if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
			if(importeSolicitado==null||importeSolicitado=="")
				importeSolicitado="0";
		
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			queryImporteMaxRetiro="SELECT NVL(FUSU_IMP_MAXIMO,0) FROM F_USUARIO WHERE "
				+" FUSU_ID_USUARIO='"+numUsuario+"'";
			rsQuery=stQuery.executeQuery(queryImporteMaxRetiro);
			if(rsQuery.next())
				importeMaximo = rsQuery.getDouble(1);	

		}
		catch (Exception ex)
		{
			importeMaximo=0;
			System.out.println("Metodo: getImporteMaxRetiro:"+ex);
		}
		finally
		{
			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { System.out.println("Funcion: getImporteMaxRetiro");System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println("Funcion: getImporteMaxRetiro");System.out.println(ex); }			
		}
		
		if(importeMaximo==0)
			return true;
		
		if(Double.valueOf(importeSolicitado).doubleValue()>importeMaximo)
			return false;
		else
			return true;	
	}



    public double obtenDatosEscritura(int intOpcion, String sCond) {
    double intCve = 0;
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			switch(intOpcion) {
        case 1: //Obtener num. sec. cve 75
				   sQuery = " SELECT CVE_NUM_SEC_CLAVE "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 75 "
                  + " AND CVE_DESC_CLAVE = '" + sCond + "'"; 
           break;
					
			  case 2: // Obtener limite superior cve 303 - numero de cuenta
				   sQuery = " SELECT CVE_LIMSUP_CLAVE "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 403 "
                  + " AND CVE_DESC_CLAVE = '" + sCond + "'"; 
           break;
          
				case 3: // Obtener clave moneda
           sQuery = " SELECT CVE_300.CVE_PARAM1 " 
                  + " FROM CLAVES CVE_300, CLAVES CVE_303 "
                  + " WHERE CVE_303.CVE_NUM_CLAVE = 303 "
                  + " AND CVE_300.CVE_NUM_CLAVE = 300 "
                  + " AND TO_NUMBER(CVE_303.CVE_PARAM1) = CVE_300.CVE_NUM_SEC_CLAVE "
                  + " AND CVE_303.CVE_DESC_CLAVE = '" + sCond + "'";
           break;
        
        case 4: // Obtener el n�mero del intermediario "
           sQuery = " SELECT INT_ENTIDAD_FIN "
                    + " FROM INTERMED "
                    + " WHERE INT_INTERMEDIARIO = '" + sCond + "'";
           break;
        
       case 5: // Obtener el limite inferior para el n�mero del banco  
				   sQuery = " SELECT CVE_LIMINF_CLAVE "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 303 "
                  + " AND CVE_DESC_CLAVE = '" + sCond + "'"; 
           break;               
          
        case 6: // Obtener el par�metro1 clave 300   
           sQuery = " SELECT CVE_PARAM1 "
                    + " FROM CLAVES "
                    + " WHERE CVE_DESC_CLAVE = '" + sCond  + "'"
                    + " AND CVE_NUM_CLAVE = 303 ";
           break;   
        case 7: // Obtener el par�metro1 clave 75   
           sQuery = " SELECT DECODE(CVE_PARAM1,'',0,CVE_PARAM1) "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 75 "
                  + " AND CVE_NUM_SEC_CLAVE = " + sCond;
           break;       
        case 8: // Obtener el par�metro 3 clave 128
           sQuery = " SELECT DECODE(CVE_PARAM3,'',0,CVE_PARAM3) "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 128 "
                  + " AND CVE_NUM_SEC_CLAVE = " + sCond;          
           break;
        case 9: // Obtener el par�metro 3 de la clave 74
           sQuery = " SELECT CVE_PARAM3 "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_SEC_CLAVE = " + sCond
                  + " AND CVE_NUM_CLAVE = 74 ";
           break;
        case 10: // Obteniene el n�mero del banco de la clave 300
           sQuery = " SELECT CVE_LIMINF_CLAVE "
                  + " FROM CLAVES " 
                  + " WHERE CVE_NUM_SEC_CLAVE =  " + sCond
                  + " AND CVE_NUM_CLAVE = 300 ";
           break;
                     
      }
        
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   intCve = rsQuery.getDouble(1);
    
    }catch (Exception ex) {
			System.out.println(ex);
      System.out.println("Excepci�n en obtenDatosEscritura");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex);  }
		}
		return intCve;
	}

    public String obtenNombreIntermed(String sCond, String sCond2) {
    String nombreIntermed = " ";
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
      sQuery = " SELECT CPR_NOM_INTERMED "
             + " FROM CONTINTE "
             + " WHERE CPR_NUM_CONTRATO = " + sCond
             + " AND CPR_SUB_CONTRATO = 0 "
             + " AND CPR_CONTRATO_INTER = " + sCond2;
              
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   nombreIntermed = rsQuery.getString(1);
      
    }catch (Exception ex) {
			System.out.println(ex);
      System.out.println("Excepci�n en obtenNombreIntermed");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		return nombreIntermed;
	}
  
  public String obtenNumCuenta(int sCond) {
    String sNumCuenta = " ";
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
      sQuery = " SELECT CVE_LIMSUP_CLAVE"
             + " FROM CLAVES "
             + " WHERE CVE_NUM_CLAVE = 300"
             + " AND CVE_NUM_SEC_CLAVE = " + sCond; 
              
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   sNumCuenta = rsQuery.getString(1);
      
    }catch (Exception ex) {
			System.out.println(ex);
      System.out.println("Excepci�n en obtenNumCuenta");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); System.out.println("Excepci�n del Finally"); }
		}
		return sNumCuenta;
	}
  
  
  public String obtenNombreBanco(double iCond) {
    String sNomBanco = "";
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
      sQuery = " SELECT CVE_DESC_CLAVE "
             + " FROM CLAVES "
             + " WHERE CVE_NUM_CLAVE = 27 "
             + " AND CVE_NUM_SEC_CLAVE = " + iCond ; 
              
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   sNomBanco = rsQuery.getString(1);
      
    }catch (Exception ex) {
			System.out.println(ex);
      System.out.println("Excepci�n en obtenNombreBanco");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); System.out.println("Excepci�n del Finally"); }
		}
		return sNomBanco;
	}
  
    public int obtenDatosPersona(int intOpcion, String sCond, String sFiso) {
    int intPersona = 0;
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			switch(intOpcion) {
        case 1: // Obtener el n�mero del fideicomitente
           sQuery = " SELECT FID_FIDEICOMITENTE " 
                  + " FROM FIDEICOM "
                  + " WHERE FID_NOM_FIDEICOM = '" + sCond + "'"
                  + " AND FID_NUM_CONTRATO = " + sFiso;
           break;

        case 2: // Obtener el n�mero del tercero
           sQuery = " SELECT BEN_BENEFICIARIO " 
                  + " FROM BENEFICI "
                  + " WHERE BEN_NOM_BENEF = '" + sCond + "'"
                  + " AND BEN_NUM_CONTRATO = " + sFiso;
           break;

        case 3: // Obtener el n�mero del tercero
           sQuery = " SELECT TER_NUM_TERCERO " 
                  + " FROM TERCEROS "
                  + " WHERE TER_NOM_TERCERO = '" + sCond + "'"
                  + " AND TER_NUM_CONTRATO = " + sFiso;
           break;
      }
      
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   intPersona = rsQuery.getInt(1);
    
    }catch (Exception ex) {
			System.out.println(ex);
      System.out.println("Excepci�n en obtenDatosPersona");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex);  }
		}
		return intPersona;
	}
  
  public String obtenTipoCambio(int moneda, String fecha) {
    String sTipoCambio = "";
    int d,m,a;
    
    d=Integer.parseInt(fecha.substring(0,2));//dia
		m=Integer.parseInt(fecha.substring(3,5));//mes
		a=Integer.parseInt(fecha.substring(6,10));//a�o
    
    try {
			// conectandose a la base
      if (conBD == null) if (!conectarBD()) return "";
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return "";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
      sQuery = " SELECT TIC_IMP_TIPO_CAMB "
             + " FROM TIPOCAMB "
             + " WHERE TIC_NUM_PAIS = " + moneda
             + " AND TIC_ANO_ALTA_REG = " + a 
             + " AND TIC_MES_ALTA_REG = " + m
             + " AND TIC_DIA_ALTA_REG = " + d
             + " ORDER BY TIC_HORA_ALTA*100+TIC_MINUTO_ALTA DESC";
     //        + " AND TIC_ANO_ULT_MOD = " + a 
     //        + " AND TIC_MES_ULT_MOD = " + m
     //        + " AND TIC_DIA_ULT_MOD = " + d;
      //System.out.println("Consulta tipo de cambio: " + sQuery );
      rsQuery=stQuery.executeQuery(sQuery);
			if(rsQuery.next())
			   sTipoCambio = rsQuery.getString(1);
      
      
    }catch (Exception ex) {
			System.out.println(ex);
      System.out.println("Excepci�n en obtenCotizacion");
    } finally {
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); System.out.println("Excepci�n del Finally"); }
		}
		return sTipoCambio;
	}
  
 //funcion que devuelve el secuencial del pago  --Pago de Honorarios
	
  public String DataCombo(String[] sData)
	{
		StringBuffer s = new StringBuffer();
		int i;
		if(sData!=null)
			{
			for(i=0;i<sData.length;i++)
				s.append("<option>" + sData[i] );
			return s.toString();		
			}
		else	
			return "";		
	}	


	// genera una cadena con el codigo en html para generar un combo simple
	public String DataCombos(int iOpcion, String sCond, String sDataSelected)
	{
		String[] sData=null;
                if(iOpcion!=55)
                    sData=getData(iOpcion,sCond);
                else
                    sData=getData(iOpcion,sCond+"-"+sDataSelected);
		StringBuffer s = new StringBuffer();
		int i;
		if(sData!=null)
			{
		for(i=0;i<sData.length;i++)
		{
			
			if(sDataSelected.equals(sData[i]))
				{	
				if (iOpcion==40 || iOpcion==41 || iOpcion==42 || iOpcion==53 || iOpcion==55)
					{
					s.append("<option value=\""+ sData[i] +"\" selected>" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));
					}
				else if(iOpcion==54)// ejecutivo
          {
          s.append("<option value=\""+ sData[i].substring(0,sData[i].indexOf('-')) +"\" selected>" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));				
          }
        else
					{	
					s.append("<option value=\""+ sData[i] +"\" selected>" + sData[i] );
					}
				}		
			else
				{
				if (iOpcion==40 || iOpcion==41 || iOpcion==42 || iOpcion==53 || iOpcion==55)
					{
					s.append("<option value=\""+ sData[i] +"\">" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));
					}
				else if (iOpcion==54)// ejecutivo
          {
          s.append("<option value=\""+ sData[i].substring(0,sData[i].indexOf('-')) +"\">" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));				
          }
        else
					{	
					s.append("<option value=\""+ sData[i] +"\">" + sData[i] );
					}
				}
			
		}
		return s.toString();
			}
		else
		    return "";	
	}
	
    public String DataCombos2(int iOpcion, String sCond, String sDataSelected,String sDataSelected2)
    {
            String[] sData=null;
            sData=getData(iOpcion,sCond+"-"+sDataSelected2);
            StringBuffer s = new StringBuffer();
            int i;
            if(sData!=null)
                    {
            for(i=0;i<sData.length;i++)
            {
                if(sDataSelected!=null) {
                    if(sDataSelected.equals(sData[i]))
                            {       
                            if (iOpcion==40 || iOpcion==41 || iOpcion==42 || iOpcion==53 || iOpcion==55)
                                    {
                                    s.append("<option value=\""+ sData[i] +"\" selected>" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));
                                    }
                            else if(iOpcion==54)// ejecutivo
      {
      s.append("<option value=\""+ sData[i].substring(0,sData[i].indexOf('-')) +"\" selected>" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));                            
      }
    else
                                    {       
                                    s.append("<option value=\""+ sData[i] +"\" selected>" + sData[i] );
                                    }
                            }   
            }
                    else
                            {
                            if (iOpcion==40 || iOpcion==41 || iOpcion==42 || iOpcion==53 || iOpcion==55)
                                    {
                                    s.append("<option value=\""+ sData[i] +"\">" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));
                                    }
                            else if (iOpcion==54)// ejecutivo
      {
      s.append("<option value=\""+ sData[i].substring(0,sData[i].indexOf('-')) +"\">" + sData[i].substring(sData[i].indexOf('-')+1,sData[i].length()));                             
      }
    else
                                    {       
                                    s.append("<option value=\""+ sData[i] +"\">" + sData[i] );
                                    }
                            }
                    
            }
            return s.toString();
                    }
            else
                return "";  
    }

	//Consultas para obtener los datos de una cuenta
	
	public String[] getDataCuenta(int iOpcion,String sCond)
		{
		int i;
		String sCve;	
		String[] sData = new String[5];
		try
		{
			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			switch(iOpcion)
			{
				case 1: // Cuentas de BANXICO definidas para un fideicomiso
				
					sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_cve_banco=164 AND CDP_ESTATUS='ACEPTADA' AND cdp_num_cuenta=" + sCond;
					break;
					
				case 2: // Cuentas de BANCOMER definidas para un fideicomiso
				
					sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_cve_banco=12 AND CDP_ESTATUS='ACEPTADA' AND cdp_num_cuenta=" + sCond.substring(sCond.indexOf('|')+2,sCond.length());
					break;
					
				case 3: // Cuentas de x Banco definidas para un fideicomiso
				
					sQuery = "SELECT cve_num_sec_clave FROM claves WHERE cve_num_clave=27 AND";
					sQuery+= " cve_desc_clave='" + sCond.substring(sCond.indexOf('|')+2,sCond.lastIndexOf('|')-1) + "'";
          			System.out.println(sQuery);

					rsQuery=stQuery.executeQuery(sQuery);
					rsQuery.next();
					sCve=rsQuery.getString(1);
                                        
					sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE CDP_ESTATUS='ACEPTADA' AND cdp_cve_banco=";
					sQuery = sQuery + sCve + " AND cdp_num_cuenta=";
					sQuery = sQuery + sCond.substring(sCond.lastIndexOf('|')+2,sCond.length());
					System.out.println(sQuery);
					sCve="";
					break;
			}
			
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
			sCve=rsQuery.getString(1);
			
			sQuery = "SELECT cdp_cve_banco,cdp_plaza,cdp_sucursal,cdp_titular,cdp_rfc";
			sQuery +=" FROM cuendep WHERE CDP_ESTATUS='ACEPTADA' AND cdp_cve_cuendep=" + sCve;
			System.out.println(sQuery);
      rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
			
			sData[0] = (rsQuery.getString(1)==null)?"":rsQuery.getString(1);
			sData[1] = (rsQuery.getString(2)==null)?"":rsQuery.getString(2);
			sData[2] = (rsQuery.getString(3)==null)?"":rsQuery.getString(3);
			sData[3] = (rsQuery.getString(4)==null)?"":rsQuery.getString(4);
			sData[4] = (rsQuery.getString(5)==null)?"":rsQuery.getString(5);
		
		}
		catch (Exception ex)
		{
			System.out.println(ex);
				System.out.println(sQuery);
    }
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		return sData;
	}

	
	//Consultas para obtener los datos de una cuenta
	public String[] getDataCuentaInterbancaria(String sFid)
	{
		String[] sData = sData = new String[6];
		int i;
		String sCve;
	try
		{
			
			// conectandose a la base
		if (conBD == null) if (!conectarBD()) return sData;
		if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
		
		stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		sQuery = "SELECT cve_desc_clave || ' - ' || cdp_num_cuenta";
		sQuery += " FROM cuendep, perfirdi, claves";
		sQuery += " WHERE ";
		sQuery += " pfd_num_contrato=" + sFid + " AND";
		sQuery += " cve_num_clave=27 AND";
		sQuery += " pfd_cve_cuendep=cdp_cve_cuendep AND";
		sQuery += " cdp_cve_banco=cve_num_sec_clave";			
		sQuery += " and NVL(cdp_rfc,'1')<>'1' and";
		sQuery += " cdp_num_cuenta<>0";		
		sQuery += " and cdp_estatus='ACEPTADA' ";
		sQuery += " and pfd_st='ACEPTADA' ";
		
		rsQuery=stQuery.executeQuery(sQuery); 
		
		if(rsQuery.next())
			{
				
			sData[5] = rsQuery.getString(1);
					
			// Cuentas de x Banco definidas para un fideicomiso
			sQuery = "SELECT cve_num_sec_clave FROM claves WHERE cve_num_clave=27 AND";
			sQuery += " cve_desc_clave='" + sData[5].substring(0,sData[5].indexOf('-')-1) + "'";

			rsQuery=stQuery.executeQuery(sQuery);
			
			rsQuery.next();
			
			sCve=rsQuery.getString(1);
			
			
			sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_cve_banco=";
			sQuery += sCve + " and cdp_estatus='ACEPTADA' AND cdp_num_cuenta=";
			sQuery += sData[5].substring(sData[5].indexOf('-')+2,sData[5].length());
			
			sCve="";
			rsQuery=stQuery.executeQuery(sQuery);
			
			rsQuery.next();
			
			sCve=rsQuery.getString(1);
			
			sQuery = "SELECT cdp_cve_banco,cdp_plaza,cdp_sucursal,cdp_titular,cdp_rfc";
			sQuery +=" FROM cuendep WHERE cdp_estatus='ACEPTADA' and cdp_cve_cuendep=" + sCve;
			
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
			
			sData[0] = (rsQuery.getString(1)==null)?"":rsQuery.getString(1);
			sData[1] = (rsQuery.getString(2)==null)?"":rsQuery.getString(2);
			sData[2] = (rsQuery.getString(3)==null)?"":rsQuery.getString(3);
			sData[3] = (rsQuery.getString(4)==null)?"":rsQuery.getString(4);
			sData[4] = (rsQuery.getString(5)==null)?"":rsQuery.getString(5);
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
		return sData;
	}

	//Obtiene el detalle por contrato de inversion
	public String getDetalleCtos(String sNumFid, String sCtoInv, String sEntidad)
	{
		StringBuffer sData = new StringBuffer();
		int i;
		double dImp = 0, dTotal=0;
		try
			{
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			// Datos de los contratos de inversi�n que est�n a plazo
			
			sData.append("<table width=\"100%\" border=\"0\">");
			sData.append("<tr bgcolor=\"#999966\" class=\"celda01\">"); 
			sData.append("<td width=\"52%\" align=\"center\" >DESCRIPCI�N</td>");
			sData.append("<td width=\"16%\" align=\"center\">IMPORTE</td>");
			sData.append("<td width=\"8%\" align=\"center\" >TASA</td>");
			sData.append("<td width=\"8%\" align=\"center\" >PLAZO</td>");
			sData.append("<td width=\"16%\" align=\"center\">VENCIMIENTO</td>");
			sData.append("<td width=\"80%\" align=\"center\">DIVISA</td>");      
      sData.append("</tr>");

			
			sQuery = "SELECT /*+ CONTINTE_NU_IDX2(CPR_NUM_PAIS,CPR_ENTIDAD_FIN,";
      sQuery += " CPR_NUM_CONTRATO,CPR_CONTRATO_INTER,CPR_SUB_CONTRATO),";
      sQuery += " CONREPOR_NU_IDX3 (CRE_NUM_CONTRATO,CRE_SUB_CONTRATO,CRE_CONTRATO_INTER,CRE_ENTIDAD_FIN,CRE_CVE_TIPO_MERCA,CRE_NUM_INSTRUME,CRE_NUM_MONEDA,CRE_CVE_ST_CONREPO)*/ins_nom_instrume AS dsc, cre_imp_reporto AS importe, cre_pje_tasa_pacta AS tasa,cre_contrato_inter,";
			sQuery += " cre_num_plazo AS plazo,LTRIM(TO_CHAR(cre_dia_vencim,'00')) ||'/' ||";
			sQuery += " LTRIM(TO_CHAR(cre_mes_vencim,'00')) || '/' || cre_ano_vencim AS venc,cpr_contrato_inter,cpr_num_pais, mon_nom_moneda";
      sQuery += " FROM	instrume, conrepor, continte,monedas WHERE cre_num_contrato=" + sNumFid;
			sQuery += " AND cre_contrato_inter=" + sCtoInv + " AND cpr_contrato_inter=cre_contrato_inter AND  cre_cve_st_conrepo='ACTIVO'";
			sQuery += " AND cre_imp_reporto<>0 AND cre_cve_tipo_merca = ins_cve_tipo_merca AND cre_num_instrume = ins_num_instrume AND cpr_num_pais=mon_num_pais";
      sQuery += " AND cpr_entidad_fin=" + sEntidad;
      sQuery += " AND CRE_ENTIDAD_FIN=" + sEntidad;
			sQuery += " ORDER BY ins_nom_instrume";

			rsQuery=stQuery.executeQuery(sQuery); 
					
			while (rsQuery.next())
			{
				dImp = rsQuery.getDouble(2);
				dTotal = dTotal + dImp;
				sData.append("<tr>");
        
				sData.append("<td width=\"50%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(1) + "</td>");
				sData.append("<td width=\"16%\" align=\"right\" class=\"celda02\">" + nfFormato.format(dImp) + "</td>");
				dImp = rsQuery.getDouble(3);
				sData.append("<td width=\"10%\" align=\"right\" class=\"celda02\">" + ((String.valueOf(dImp)).replace('$',' ')).trim() + " %</td>");
				sData.append("<td width=\"8%\" align=\"right\" class=\"celda02\">" + rsQuery.getString(5)  + "</td>");
				sData.append("<td width=\"16%\" align=\"center\" class=\"celda02\">" + rsQuery.getString(6)  + "</td>");
				sData.append("<td width=\"80%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(9) + "</td>");
        sData.append("</tr>");
			
			}
			
			rsQuery.close();
			
			
			// Datos de los contratos de inversi�n que est�n a la vista
					            
			sQuery = "SELECT DISTINCT ins_nom_instrume,SUM(pos_costo_historic) AS importe,";
			sQuery +="SUM(pos_costo_historic)/SUM(DECODE(pos_posic_actual,0,1,pos_posic_actual)) AS precio,pos_nom_pizarra,cpr_contrato_inter, cpr_num_pais,";
			sQuery +="mon_nom_moneda,0,0 as plazo, '' AS venc";
      		sQuery +=" FROM instrume,posicion,continte, monedas WHERE pos_num_contrato = " + sNumFid;
			sQuery +=" AND pos_contrato_inter = " + sCtoInv + " AND cpr_contrato_inter= pos_contrato_inter AND ins_cve_tipo_merca = pos_cve_tipo_merca";
			sQuery +=" AND ins_num_instrume=pos_num_instrume AND cpr_num_pais= mon_num_pais";
      sQuery += " AND pos_costo_historic<> 0 AND cpr_entidad_fin=" + sEntidad;
      sQuery += " AND POS_NUM_ENTID_FIN=" + sEntidad;
			sQuery +=" GROUP BY ins_nom_instrume,pos_nom_pizarra,cpr_contrato_inter, cpr_num_pais, mon_nom_moneda";

			rsQuery=stQuery.executeQuery(sQuery); 


     
			while (rsQuery.next())
			{
				dImp = rsQuery.getDouble(2);
				dTotal=dTotal + dImp;
							
				sData.append("<tr>");
				
				if(rsQuery.getString(4)==null)
					sData.append("<td width=\"50%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(1) +"</td>");
				else	
					sData.append("<td width=\"50%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(1) +"<br>EMISION: "+rsQuery.getString(4)+ "</td>");	
				
				sData.append("<td width=\"16%\" align=\"right\" class=\"celda02\">" + nfFormato.format(dImp) + "</td>");
				dImp = rsQuery.getDouble(3);
				sData.append("<td width=\"10%\" class=\"celda02\">&nbsp;</td>");
				
				if(sCtoInv.equals("1001"))
					{		
					sData.append("<td width=\"8%\" class=\"celda02\">&nbsp;</td>");
					sData.append("<td width=\"16%\" class=\"celda02\">&nbsp;</td>");
					}
				else{
					sData.append("<td width=\"8%\" align=\"right\" class=\"celda02\">1<br>&nbsp;</td>");
					sData.append("<td width=\"16%\" align=\"center\" class=\"celda02\">A la vista<br&nbsp;</td>");
					sData.append("<td width=\"80%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(7) + "</td>");

          }
					
				sData.append("</tr>");

			
			}
			
            
            //Total General
            
            sData.append("<tr><td colspan=\"5\">&nbsp;</td></tr>");
            sData.append("<tr>");
            sData.append("<td width=\"52%\" align=\"right\" class=\"celda01\">IMPORTE TOTAL:</td>");
            sData.append("<td width=\"16%\" align=\"right\" class=\"celda01\">" + nfFormato.format(dTotal) + "</td>");
            sData.append("<td width=\"8%\"></td>");
            sData.append("<td width=\"8%\"></td>");
            sData.append("<td width=\"16%\"></td>");
          	sData.append("</tr>");
        	sData.append("</table>");

			return sData.toString();
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
		return sData.toString();
	}





	// Obtiene los pagos de honorarios pendientes para un fideicomiso
	
public String getHonPend(String sNumFid,String[] bitacora)
	{
		StringBuffer sData = new StringBuffer();
		int numHon=0;
		int regBitacora=0;
		try
		{
			int i;
			double dImp = 0, dTotal = 0;			
			
		     //incorporacion de la bitacora
		     regBitacora=insertaBitacora(bitacora);	
			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
		
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			stQuery_Secuen = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sData.append("<table width=\"100%\" border=\"0\">");
			sData.append("<tr class=\"celda01\" bgcolor=\"#999966\">"); 
			sData.append("<td width=\"50%\" align=\"center\" >CONCEPTO</td>");
      sData.append("<td width=\"30%\" align=\"center\" >PERIODO</td>");
      sData.append("<td width=\"20%\" align=\"center\" >IMPORTE CON IVA</td>");
      sData.append("<td width=\"20%\" align=\"center\" >DIVISA</td>");
			sData.append("</tr>");

			sQuery = "SELECT dec_concepto_hono as Concepto,";
			sQuery +=  " LTRIM(TO_CHAR(dec_dia_per_del,'00')) || '/' || LTRIM(TO_CHAR(dec_mes_per_del,'00')) || '/' || dec_ano_per_del || ' al ' ||";
			sQuery +=  " LTRIM(TO_CHAR(dec_dia_per_al,'00')) || '/' || LTRIM(TO_CHAR(dec_mes_per_al,'00')) || '/' || dec_ano_per_al AS periodo,";
			sQuery +=  " (DEC_IMP_REM_HONOR + DEC_REM_IVA_HONOR + DEC_REM_EXTEMP) AS importe,";
			sQuery +=  " dec_num_contrato,dec_cve_pers_fid,dec_num_pers_fid,";
			sQuery +=  " dec_cve_tipo_hono,dec_fec_calc_hono,dec_num_secuencial,mon_nom_moneda";
			sQuery +=  " FROM detcart, monedas WHERE dec_num_contrato = " + sNumFid;
			sQuery +=  " AND	dec_cve_calif_hono = 'PENDIENTE' AND dec_num_moneda=mon_num_pais";
			sQuery +=  " ORDER BY TO_DATE(REPLACE(TO_CHAR(DEC_DIA_PER_DEL,'00')||'/'||TO_CHAR(DEC_MES_PER_DEL,'00')||'/'||TO_CHAR(DEC_ANO_PER_DEL,'0000'),' ',''),'DD/MM/YYYY') ASC";
			
        rsQuery=stQuery.executeQuery(sQuery); 
			
			while (rsQuery.next())
			{
				dImp = rsQuery.getDouble(3);				
			
				//la siguiente condici�n se emplea para cuando
				//el ejercicio es posterior al 2001 y en ese
				//caso 
				
				//if(Double.valueOf(rsQuery.getString(8).substring(6,10)).doubleValue()>2001)
				//	dImp=dImp+(rsQuery.getDouble(3)*0.15);
				
				//se recuperan los pagos asociados a la provision
				//en cuestion
				
				/*sQuery = "SELECT (NVL(pag_imp_pago,0) + NVL(pag_imp_iva_honor,0)) ";
				sQuery +=  " FROM pagoshon WHERE ";
				sQuery +=  " pag_cve_tipo_hono ='"+rsQuery.getString(7) +"' AND";
				sQuery +=  " pag_num_pers_fid = "+rsQuery.getString(6) +" AND ";
				sQuery +=  " pag_cve_pers_fid = '"+rsQuery.getString(5) +"' AND"; 
				sQuery +=  " pag_num_contrato = "+rsQuery.getString(4) +" AND";
				sQuery +=  " pag_fec_calc_hono = '"+rsQuery.getString(8) +"' AND";
				sQuery +=  " pag_num_secuencial = "+rsQuery.getString(9);	
			
				rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				
				while (rsQuery_Secuen.next())
				{
					dImp=dImp-0;					
					//if(Double.valueOf(rsQuery.getString(8).substring(6,10)).doubleValue()>2001)
					//	dImp=dImp-(rsQuery_Secuen.getDouble(1)*0.15);
				}		
        */
				dTotal = dTotal + dImp;
				
				sData.append("<tr  class=\"celda02\">");
				sData.append("<td width=\"50%\" align=\"left\">" + rsQuery.getString(1) + "</td>");
				sData.append("<td width=\"30%\" align=\"center\">" + rsQuery.getString(2) + "</td>");
				sData.append("<td width=\"20%\" align=\"right\" >" + nfFormato.format(dImp) + "</td>");
				sData.append("<td width=\"20%\" align=\"right\" >" + rsQuery.getString(10) + "</td>");        
				sData.append("</tr>");
			}
			sData.append("<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>");
			sData.append("<tr  class=\"celda01\">");
            sData.append("<td>&nbsp;</td><td align=\"right\" >TOTAL:</td>");
            sData.append("<td align=\"right\">" + nfFormato.format(dTotal) + "</td>");
            sData.append("</tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></table>");
			return sData.toString();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			if(numHon!=0)
			{
			try { if(rsQuery_Secuen != null ) rsQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			}
			try { if(stQuery_Secuen != null ) stQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		return sData.toString();
	}




	//Recupera el nombre, mail,tipo de usuario y los fideicomisos de un usuario
	
	public String getNumFideicomisos(String sFideicomiso,int tipo,String ruta)
	{			
		if(tipo==1)
			{
			try
			{
				String numFidBalance;
				File fileBalance = new File(ruta+"balance_internet.txt");
				FileInputStream balance = new FileInputStream(fileBalance);
				DataInputStream fBalance= new DataInputStream(balance);
				int i=0;		
	   			while((numFidBalance = fBalance.readLine()) != null)
		     	{
		     	   	numFidBalance=numFidBalance.trim();
		     		if(numFidBalance.equals(sFideicomiso))
				 	{
				     balance.close();			
				     fBalance.close();
					 if(i>0)
					     return ""+i;
					 else
					     return "";
					}
	
				i++;
		   			
		     	}
				balance.close();			
				fBalance.close();     
				
			}
			catch (Exception ex)
			{
				System.out.println(ex);
				return "error";
			}				
			}
		else if(tipo==2)
		{	
			try
			{
				String dato;
				String dato2;
				File fileEAP = new File(ruta+"balanza_internet.txt");
				FileInputStream planoEA = new FileInputStream(fileEAP);
				FileInputStream planoEA2 = new FileInputStream(fileEAP);
				DataInputStream f= new DataInputStream(planoEA);
				DataInputStream f2= new DataInputStream(planoEA2);
				int i=0,tam=1;		
	   			while((dato = f.readLine()) != null)
		     	{
		   			tam++;  	
		     	}
				planoEA.close();			
				f.close();     
				String[] sData=new String[tam];     
				i=0; 			    
				int rep=0;
				while((dato = f2.readLine()) != null)
		     	{
		        	rep=0;	
		     		dato=dato.trim();			          
		     		for(int j=0;j<i;j++)
				 	{
				 		if(sData[j].equals(dato))
					 	{		
						 	rep++;
						}
				 	}
					if(rep==0)   
				    {	
				 		sData[i]=dato;
				 		i++;
					} 
				}
				f2.close();		
				int k=0;	 
				for(int l=0;l<=tam;l++)
				{
					dato=sData[l];
				 	dato2=(dato.substring(dato.indexOf('-')+1,dato.length())).trim();
				 	dato=(dato.substring(0,dato.indexOf('-'))).trim();	
				 	//numero de reporte		 
					if((Integer.valueOf(dato2).intValue())>1)
		            	k=k+((Integer.valueOf(dato2).intValue()));
		        	if(dato.equals(sFideicomiso))
				 	{				 
				 		if(l>0)
				 		{				   	
				   			return ""+k+"-"+dato2;
					 	}
				 		else
				   		{
				   			if((Integer.valueOf(dato2).intValue())>1)
				   				return "0"+"-"+dato2;
				   			else
				   				return "0"+"-1";
				  	 	}
				 	}	
					if((Integer.valueOf(dato2).intValue())==1)
						k++;		 
				}	
			}
			catch (Exception ex)
			{
				System.out.println(ex);
				return "error";
			}		
		}	
		
		else if(tipo==3)
			{
			try
			{
				String numFidEdoRes;
				File fileEdoRes = new File(ruta+"edores_internet.txt");
				FileInputStream EdoRes = new FileInputStream(fileEdoRes);
				DataInputStream fEdoRes= new DataInputStream(EdoRes);
				int i=0;		
	   			while((numFidEdoRes = fEdoRes.readLine()) != null)
		     	{
		     	   	numFidEdoRes=numFidEdoRes.trim();
		     		if(numFidEdoRes.equals(sFideicomiso))
				 	{
				     EdoRes.close();			
				     fEdoRes.close();
					 if(i>0)
					     return ""+i;
					 else
					     return "";
					}
	
				i++;
		   			
		     	}
				EdoRes.close();			
				fEdoRes.close();     
				
			}
			catch (Exception ex)
			{
				System.out.println(ex);
				return "error";
			}				
			}
			
		return "error";
}


	// Obtiene la informacion del pago de honorarios pendiente del periodo mas antiguo para un fideicomiso
	public String getPeriodoHonPend(String sNumFid)
	{
		StringBuffer sData = new StringBuffer();
		int i;
		double dImp = 0, dTotal = 0;
	    boolean adeudoPendiente=false;
		try
			{
			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
		
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stQuery_Secuen = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			
			sQuery =  "SELECT dec_concepto_hono as Concepto,";
			sQuery += " LTRIM(TO_CHAR(dec_dia_per_del,'00')) || '/' || LTRIM(TO_CHAR(dec_mes_per_del,'00')) || '/' || dec_ano_per_del || ' al ' ||";
			sQuery += " LTRIM(TO_CHAR(dec_dia_per_al,'00')) || '/' || LTRIM(TO_CHAR(dec_mes_per_al,'00')) || '/' || dec_ano_per_al AS periodo,";
			sQuery += " dec_imp_orig_honor AS importe,";
			sQuery += " dec_num_contrato,dec_cve_pers_fid,dec_num_pers_fid,";
			sQuery += " dec_cve_tipo_hono,dec_fec_calc_hono,dec_num_secuencial";
			sQuery += " FROM detcart WHERE dec_num_contrato = " + sNumFid;
			sQuery += " AND	dec_cve_calif_hono = 'PENDIENTE'";
			sQuery += " ORDER BY TO_DATE(DEC_FEC_CALC_HONO,'DD/MM/YYYY') ASC";
			
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if (rsQuery.next())
			 {
			 	adeudoPendiente=true;
				dImp = rsQuery.getDouble(3);				
				
				//la siguiente condici�n se emplea para cuando
				//el ejercicio es posterior al 2001 y en ese
				//caso 
				
				if(Double.valueOf(rsQuery.getString(8).substring(6,10)).doubleValue()>2001)
					dImp=dImp+(rsQuery.getDouble(3)*0.15);
				
				//se recuperan los pagos asociados a la provision
				//en cuestion
				
				sQuery = "SELECT (NVL(pag_imp_pago,0) + NVL(pag_imp_iva_honor,0)) ";
				sQuery +=" FROM pagoshon WHERE ";
				sQuery +=" pag_cve_tipo_hono ='"+rsQuery.getString(7) +"' AND";
				sQuery +=" pag_num_pers_fid = "+rsQuery.getString(6) +" AND ";
				sQuery +=" pag_cve_pers_fid = '"+rsQuery.getString(5) +"' AND"; 
				sQuery +=" pag_num_contrato = "+rsQuery.getString(4) +" AND";
				sQuery +=" pag_fec_calc_hono = '"+rsQuery.getString(8) +"' AND";
				sQuery +=" pag_num_secuencial = "+rsQuery.getString(9);				
				
				rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				
				while (rsQuery_Secuen.next())
					{
					dImp=dImp-rsQuery_Secuen.getDouble(1);					
					if(Double.valueOf(rsQuery.getString(8).substring(6,10)).doubleValue()>2001)
						dImp=dImp-(rsQuery_Secuen.getDouble(1)*0.15);
					}		
				dTotal = dTotal + dImp;
				
				sData.append("<table width=\"100%\" border=\"0\">");
				sData.append("<tr><td  colspan=\"2\" align=\"center\" class=\"subtitulo\">ADEUDO DE MAYOR ANTIG�EDAD:</td> </tr>");
				sData.append("<tr><td  colspan=\"2\">&nbsp;</td></tr>");
				sData.append("<tr>");
				sData.append("<td align=\"left\" class=\"textoNegrita\">CONCEPTO: </td>");
				sData.append("<td align=\"left\" class=\"texto\">" + rsQuery.getString(1)+ "</td>");
				sData.append("</tr>");
				sData.append("<tr>");
				sData.append("<td align=\"left\" class=\"textoNegrita\">PERIODO: </td>");
				sData.append("<td align=\"left\" class=\"texto\">" + rsQuery.getString(2) + "</td>");
				sData.append("</tr>");
				sData.append("<tr>");
				sData.append("<td align=\"left\" class=\"textoNegrita\">IMPORTE: </td>");
				sData.append("<td align=\"left\" class=\"texto\">" + nfFormato.format((dImp/1.15))+ "</td>");
				sData.append("</tr>");
				sData.append("<tr>");
				sData.append("<td align=\"left\" class=\"textoNegrita\">IVA: </td>");
				sData.append("<td align=\"left\" class=\"texto\">" + nfFormato.format((dImp-(dImp/1.15)))+ "</td>");
				sData.append("</tr>");
				sData.append("<tr>");
				sData.append("<td align=\"left\" class=\"textoNegrita\">IMPORTE CON IVA:</td>");
				sData.append("<td align=\"left\" class=\"texto\">" + nfFormato.format(dImp)+ "</td>");
				sData.append("</tr>");
				sData.append("</table>");
				
				return sData.toString();
				
				
			}
			else
				return "";
						
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			if(adeudoPendiente==true)
				{
			try { if(rsQuery_Secuen != null ) rsQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery_Secuen != null ) stQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
				}
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		return sData.toString();
	}


	


	//Obtiene el saldo por contrato de inversion para un fideicomiso
	public String getSaldoCtos(String sNumFid)
	{
		StringBuffer sData = new StringBuffer();
		String[] sCtos = null;
		int i;
		double dImp = 0, dTotal = 0;
		int Moneda=0;
		//recupera los contratos de inversion del fifeicomiso
		sCtos = getData(3,sNumFid);
		
		try
		{ 
		
			sData.append("<table width=\"100%\" border=\"0\">");
			sData.append("<tr bgcolor=\"#999966\" class=\"celda01\">");			
			sData.append("<td width=\"50%\" align=\"center\">CONTRATO DE INVERSI&Oacute;N</td>");
			sData.append("<td width=\"50%\" align=\"center\">SALDO</td>");
          	sData.append("</tr>");
			
			//recupera el saldo de los contratos de inversion del fideicomiso
			
			if (sCtos != null) 
				{
					
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			for (i=0;i<sCtos.length&&(((Integer.valueOf(sCtos[i]).intValue())<6000000 || (Integer.valueOf(sCtos[i]).intValue())>6999999)&&!((sCtos[i]).equals("1060140")));i++)
			{				
				Moneda=1;	
				sQuery = "SELECT NVL(SUM(pos_costo_historic),0) FROM posicion";
				sQuery +=" WHERE pos_num_contrato=" + sNumFid ;
				sQuery +=" AND pos_contrato_inter=" + sCtos[i];
				rsQuery=stQuery.executeQuery(sQuery); 
				
				if(rsQuery.next())
					{
				sData.append("<tr>");
				sData.append("<td width=\"50%\" align=\"center\" class=\"celda02\">");
				sData.append("<a href=\"javascript:Enviar('" + sCtos[i] + "')\">"); 
        	    sData.append(sCtos[i] + "</a></td>");
            	sData.append("<td width=\"50%\" align=\"right\" class=\"celda02\"> ");

				dImp = rsQuery.getDouble(1);
				rsQuery.close();
				
				sQuery = "SELECT NVL(SUM(cre_imp_reporto),0) FROM conrepor WHERE cre_num_contrato=";
				sQuery += sNumFid + " AND cre_contrato_inter=" + sCtos[i] +" AND cre_cve_st_conrepo = 'ACTIVO'";	
				
				rsQuery=stQuery.executeQuery(sQuery); 
					
				if (rsQuery.next()) 
					dImp = dImp + rsQuery.getDouble(1);
				
					}
				sData.append(nfFormato.format(dImp) + " MN </font></div></td></tr>");
				dTotal = dTotal + dImp;
					
				}
				
				
			     if(Moneda==1)
			     	{
					sData.append("<tr><td width=\"50%\" align=\"right\" class=\"celda01\">"); 
        	    	sData.append("SALDO EN MN:</td><td width=\"50%\" align=\"right\" class=\"celda01\">");
            		sData.append(nfFormato.format(dTotal) + " MN </td></tr>");
            		sData.append("<tr><td width=\"50%\" align=\"right\" class=\"celda01\">&nbsp;"); 
        	    	sData.append("</td><td width=\"50%\" align=\"right\" class=\"celda01\">&nbsp;");
        	    	sData.append("</td></tr>");
            		}
            	
            	dImp = 0;
            	dTotal = 0;	
            	
            	for (i=0;i<sCtos.length;i++)
					{
				
				if(((Integer.valueOf(sCtos[i]).intValue())>=6000000 && (Integer.valueOf(sCtos[i]).intValue())<=6999999)||((sCtos[i]).equals("1060140")))
				 {
				Moneda=2;
				
				sQuery = "SELECT NVL(SUM(pos_costo_historic),0) FROM posicion";
				sQuery +=" WHERE pos_num_contrato=" + sNumFid ;
				sQuery +=" AND pos_contrato_inter=" + sCtos[i];
				rsQuery=stQuery.executeQuery(sQuery); 
				
				if(rsQuery.next())
					{
				sData.append("<tr>");
				sData.append("<td width=\"50%\" align=\"center\" class=\"celda02\">");
				sData.append("<a href=\"javascript:Enviar('" + sCtos[i] + "')\">"); 
        	    sData.append(sCtos[i] + "</a></td>");
            	sData.append("<td width=\"50%\" align=\"right\" class=\"celda02\"> ");

				dImp = rsQuery.getDouble(1);
				rsQuery.close();
				
				sQuery = "SELECT NVL(SUM(cre_imp_reporto),0) FROM conrepor WHERE cre_num_contrato=";
				sQuery += sNumFid + " AND cre_contrato_inter=" + sCtos[i] +" AND cre_cve_st_conrepo = 'ACTIVO'";	
				
				rsQuery=stQuery.executeQuery(sQuery); 
					
				if (rsQuery.next()) 
					dImp = dImp + rsQuery.getDouble(1);
				
					}
				sData.append(nfFormato.format(dImp) + " USD </font></div></td></tr>");
				dTotal = dTotal + dImp;
					}
				}
					
				if(Moneda==2)
					{
				sData.append("<tr><td width=\"50%\" align=\"right\" class=\"celda01\">"); 
        	    sData.append("SALDO EN USD:</td><td width=\"50%\" align=\"right\" class=\"celda01\">");
            	sData.append(nfFormato.format(dTotal) + " USD </td></tr>");
            		}
            	}
            	
            	if(Moneda==0)
					{
			    sData.append("<tr><td width=\"50%\" align=\"right\" class=\"celda01\">"); 
        	    sData.append("SALDO TOTAL</td><td width=\"50%\" align=\"right\" class=\"celda01\">");
            	sData.append(0.00 + "</td></tr>");
            		}
            	sData.append("</table>");	
            	
            	
				return sData.toString();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
			return null;
		}
		finally
		{
			
			if(sCtos!=null)
			{
				try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println("rs"+ex); }
				try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println("st"+ex); }		
				try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			}
		}
	}


	// Obtiene las tasas de rendimiento
	
	public String getTasasRend(String Fecha,String[] bitacora)
	{
		StringBuffer sData = new StringBuffer();
		int regBitacora=0;
		int i,d,m,a,media=0;
		double dImp = 0, dTotal = 0;
		String[][] sData1 = null;
		String G,B;
		
			//dia	
		d=((Fecha.charAt(0)-48)*10)+(Fecha.charAt(1)-48);
			//mes
		m=((Fecha.charAt(3)-48)*10)+(Fecha.charAt(4)-48);
			//a�o
		a=((Fecha.charAt(6)-48)*1000)+((Fecha.charAt(7)-48)*100)+((Fecha.charAt(8)-48)*10)+(Fecha.charAt(9)-48);

		try
		{
			
   		     //incorporacion de la bitacora
		     regBitacora=insertaBitacora(bitacora);	

						
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
		
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sData.append("<table width=\"100%\" border=\"0\">");
			sData.append("<tr bgcolor=\"#999966\">"); 
			sData.append("<td width=\"20%\" align=\"center\" class=\"celda01\">PLAZO</td>");
            sData.append("<td width=\"40%\" align=\"center\" class=\"celda01\">GUBERNAMENTAL</td>");
            sData.append("<td width=\"40%\" align=\"center\" class=\"celda01\">BANCARIO</td>");
			sData.append("</tr>");

			sQuery = "SELECT PRE_SER_EMIS,PRE_TASA_ANUAL FROM PRECIOSM";
			sQuery +=" WHERE";
			sQuery +=" PRE_CVE_TIPO_MERCA=7";
			sQuery +=" AND PRE_ANO_PREC_EMIS="+a;
			sQuery +=" AND PRE_MES_PREC_EMIS="+m;
			sQuery +=" AND PRE_DIA_PREC_EMIS="+d;
			sQuery +=" ORDER BY PRE_NUM_INSTRUME DESC";
			
			rsQuery=stQuery.executeQuery(sQuery);
			
			if(!rsQuery.next())
				{
			
				return "<p class=\"celda01\" align=\"center\"><font color=\"#C60000\">No hay tasas disponibles para el d�a : " + Fecha+"</font></p>";
				}
		    else
		    	{
			rsQuery.last();	
			sData1 = new String[rsQuery.getRow()+1][2];
					
			i=1;
			rsQuery.first();				
			do
				{		
				sData1[i][0] = rsQuery.getString(1);
				sData1[i][1] = rsQuery.getString(2);
				i++;
				}
			while(rsQuery.next());
			
			media=i=i/2;
			
			while(i>=1)
			{
				G=sData1[i][1];
				if(G.length()>2)
				  if(G.charAt(G.length()-2)=='.')			
				   G+="0";
				B=sData1[i+media][1];
				if(B.length()>2)
				 if(B.charAt(B.length()-2)=='.')
				   B+="0";
				
				sData.append("<tr>");
				sData.append("<td width=\"20%\" align=\"center\" class=\"celda02\">" + sData1[i][0] + "</td>");
				sData.append("<td width=\"40%\" align=\"center\" class=\"celda02\">" + G + " %</td>");
				sData.append("<td width=\"40%\" align=\"center\" class=\"celda02\">" + B + " %</td>");
				sData.append("</tr>");
				i--;
			}
			sData.append("<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>");
            sData.append("</tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></table>");			

			return sData.toString();
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
		return sData.toString();
	}
	
	
	// Obtiene el total pago de honorarios del periodo mas antiguo pendiente mas antiguo
			
	public String getTotalHonPend(String sNumFid)
	{
		StringBuffer sData = new StringBuffer();
		  String sImporte="";
		try
		{
			int i;
			double dImp = 0;			
			
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
		
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stQuery_Secuen = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sQuery = "SELECT dec_concepto_hono as Concepto,";
			sQuery += " LTRIM(TO_CHAR(dec_dia_per_del,'00')) || '/' || LTRIM(TO_CHAR(dec_mes_per_del,'00')) || '/' || dec_ano_per_del || ' al ' ||";
			sQuery += " LTRIM(TO_CHAR(dec_dia_per_al,'00')) || '/' || LTRIM(TO_CHAR(dec_mes_per_al,'00')) || '/' || dec_ano_per_al AS periodo,";
			//sQuery += " (dec_imp_orig_honor + dec_orig_iva_honor) AS importe,";
      sQuery += " dec_imp_orig_honor AS importe,";
			sQuery += " dec_num_contrato,dec_cve_pers_fid,dec_num_pers_fid,";
			sQuery += " dec_cve_tipo_hono,dec_fec_calc_hono,dec_num_secuencial,mon_nom_moneda";
			sQuery += " FROM detcart, monedas WHERE dec_num_contrato = " + sNumFid;
			sQuery += " AND	dec_cve_calif_hono = 'PENDIENTE' AND dec_num_moneda=mon_num_pais";
			sQuery += " ORDER BY TO_DATE(DEC_FEC_CALC_HONO,'DD/MM/YYYY') ASC";
			
			rsQuery=stQuery.executeQuery(sQuery); 

			if (rsQuery.next())
			{
				dImp = rsQuery.getDouble(3);				
			
				if(Double.valueOf(rsQuery.getString(8).substring(6,10)).doubleValue()>2001)
					dImp=dImp+(rsQuery.getDouble(3)*0.15);
				
				//se recuperan los pagos asociados a la provision
				//en cuestion
				sQuery = "SELECT (NVL(pag_imp_pago,0) + NVL(pag_imp_iva_honor,0)) ";
				sQuery +=" FROM pagoshon WHERE ";
				sQuery +=" pag_cve_tipo_hono ='"+rsQuery.getString(7) +"' AND";
				sQuery +=" pag_num_pers_fid = "+rsQuery.getString(6) +" AND ";
				sQuery +=" pag_cve_pers_fid = '"+rsQuery.getString(5) +"' AND"; 
				sQuery +=" pag_num_contrato = "+rsQuery.getString(4) +" AND";
				sQuery +=" pag_fec_calc_hono = '"+rsQuery.getString(8) +"' AND";
				sQuery +=" pag_num_secuencial = "+rsQuery.getString(9);				
				
				rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				
				while (rsQuery_Secuen.next())
				{
					dImp=dImp-rsQuery_Secuen.getDouble(1);					
					if(Double.valueOf(rsQuery.getString(8).substring(6,10)).doubleValue()>2001)
						dImp=dImp-(rsQuery_Secuen.getDouble(1)*0.15);

				}	
              //se formatea manualmente el importe
        sQuery = "SELECT TO_CHAR("+String.valueOf(dImp)+",'999,999,999,999,999.00') FROM DUAL "; 
        rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
        
        if(rsQuery_Secuen.next())
          sImporte= rsQuery_Secuen.getString(1);
        else  
          sImporte= String.valueOf(dfFormat.format(dImp).trim());
          
        return sImporte;  
        
				//return dfFormat.format(dImp).trim();
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
			try { if(rsQuery_Secuen != null ) rsQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery_Secuen != null ) stQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	return "0.00";
	}



	public int getNumRegistros(String tabla)
	{

		try
		{
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sQuery = "select count(*) from "+tabla;		
			rsQuery=stQuery.executeQuery(sQuery); 
	
			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
			 return rsQuery.getInt(1);
			 }
		
		}
		catch (Exception ex)
		{
			System.out.println(ex);
			return 0;
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		
		return 0;
	}


	public String[] getOpcionesEncuesta()
	{
	 String[]  sOpciones = {"Deficiente","Insuficiente","Regular","Bueno","Excelente"};
	 int i;	
		try
		{
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
		
		}
		catch (Exception ex)
		{
			System.out.println(ex);
			return null;
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		
		return sOpciones;
	}		
	

	public String[] getEncuesta()
	{
	 int Reg=getNumRegistros("F_ENCUESTA")+getNumRegistros("F_OPCENC_ENCUES");
	 String []  sEncuesta =new String[Reg];
	 int i=0;
		try
		{
		if (conBD == null) if (!conectarBD()) return null;
		if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sQuery = "select FENC_ID_ENCUESTA,FENC_DESCRIPCION  from F_ENCUESTA order by FENC_ID_ENCUESTA ASC";		
			rsQuery=stQuery.executeQuery(sQuery); 
	
			rsQuery=stQuery.executeQuery(sQuery); 
			while(rsQuery.next())
			 {
			 sEncuesta[i]=""+rsQuery.getInt(1)+".-  "+rsQuery.getString(2).trim();

			 stQuery_Secuen=conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	 
			 sQuery = "select O.FOPC_ID_OPCION,O.FOPC_DESCRIPCION from F_OPCENC_ENCUES OE,F_OPCENC O";
			 sQuery += " where OE.FENC_ID_ENCUESTA="+rsQuery.getInt(1);
       sQuery += " AND OE.FOPC_ID_OPCION=O.FOPC_ID_OPCION";
			 sQuery += " order by OE.FOPC_ID_OPCION ASC";		
			 rsQuery_Secuen= stQuery_Secuen.executeQuery(sQuery);
			 while(rsQuery_Secuen.next())
			 		{
			 i++;
			 sEncuesta[i]=""+rsQuery_Secuen.getString(1).trim()+") "+rsQuery_Secuen.getString(2).trim();				 
	 		 
					}
			 
			 i++;
			 }
		   
		return sEncuesta;  
		
		}
		catch (Exception ex)
		{
			System.out.println(ex);
			return null;
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(rsQuery_Secuen != null ) rsQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery_Secuen != null ) stQuery_Secuen.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		
	
	}		


	//Si el concepto de retiro tiene programacion, validar si se puede realizar la operacion
	public String ValidRetiro(String sNumFid, String sConcepto, String sImporte)
	{
		//String sReturn="";
		try
		{

			int iPeriodo;
			String sCveConcepto="0", sSecOperacion ="";
			String sVigDe, sVigA, sPeriodoDe, sPeriodoA, sFecActual;
			
			CallableStatement spPeriodo;

			sFecActual = getFecha();

			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
			sCveConcepto=getKey(2,sConcepto);

    	//Secuencial
	   	sSecOperacion=getKey(4,sNumFid + " AND oaf_num_operacion=" + sCveConcepto + " AND oaf_automatico=0"); 
		
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			
			sQuery = "SELECT DECODE(oaf_periodicidad,'Q',14,'M',1,'T',3,'S',6,'A',12,0),";
			sQuery += "DECODE(oaf_vigencia_de,NULL,'',TO_CHAR(oaf_vigencia_de,'dd/mm/yyyy')),";
			sQuery += "DECODE(oaf_vigencia_a,NULL,'',TO_CHAR(oaf_vigencia_a,'dd/mm/yyyy'))";
			sQuery += ",oaf_imp_max_retiro";
			sQuery += " FROM opasifir WHERE oaf_num_contrato = " +  sNumFid;
			sQuery += " AND oaf_num_operacion = " +  sCveConcepto;
			sQuery += " AND oaf_automatico=0";
		
		
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
			
			//Validar el importe m�ximo
			if (rsQuery.getString(4) != null)
				if (NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue() > rsQuery.getDouble(4) )
					return "El importe m�ximo permitido para este concepto es:" + rsQuery.getString(4) ;
		/*		{
					sReturn = "El importe m�ximo permitido para este concepto es:" + rsQuery.getString(4) ;
					return sReturn ;
				}*/
			
			if (rsQuery.getInt(1) == 0) return "";
			
			
			iPeriodo = rsQuery.getInt(1);
			sVigDe =  rsQuery.getString(2);
			sVigA =  rsQuery.getString(3);
			
						
			rsQuery.close();

      spPeriodo = conBD.prepareCall( "{CALL SPGETPERIODO(?,?,?,?,?,?)}" );
			spPeriodo.clearParameters();
			
			spPeriodo.registerOutParameter( 5, Types.VARCHAR );
			spPeriodo.registerOutParameter( 6, Types.VARCHAR );
		
		
			spPeriodo.setString(1,sVigDe);
			spPeriodo.setString(2,sVigA);
			spPeriodo.setString(3,sFecActual);
			spPeriodo.setInt(4,iPeriodo);
			
			spPeriodo.execute();

			sPeriodoDe = spPeriodo.getString(5);
			sPeriodoA = spPeriodo.getString(6);
			
			if (sPeriodoDe==null || sPeriodoA==null)
				return "Esta operaci�n no esta vigente";
/*			{
				sReturn = "Esta operaci�n no esta vigente";
				return  sReturn ;
			}*/
			//System.out.println("Validando el numero de operaciones");
							
			sQuery = "SELECT COUNT(*) FROM instrucc,detliqui WHERE ins_num_contrato=" + sNumFid;
			sQuery += " AND ins_cve_tipo_instr='LIQUIDACION INTERNET' AND del_rubro = " + sCveConcepto;
			sQuery += " AND del_num_operacion=" + sSecOperacion;
			sQuery += " AND TO_DATE(TO_CHAR(del_dia_alta_reg)||'/'|| TO_CHAR(del_mes_alta_reg)||'/'|| TO_CHAR(del_ano_alta_reg),'DD/MM/YYYY') BETWEEN ";
			sQuery += "TO_DATE('" + sPeriodoDe + "','dd/mm/yyyy') AND TO_DATE('" + sPeriodoA + "','dd/mm/yyyy')";
			sQuery += " AND ins_num_contrato=del_num_contrato AND ins_num_folio_inst=del_folio_opera";
			
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();

			if (rsQuery.getInt(1) > 0 )
				return "No puede ralizar esta operaci�n debido a la periodicidad definida.";
			/*{
				sReturn = "No puede ralizar esta operaci�n debido a la periodicidad definida.";
				return  sReturn ;
			}*/
				//return "No puede ralizar esta operaci�n debido a la periodicidad definida.";
			else 
				return "";
			
		}
		catch (Exception ex)
		{
			System.out.println("Error de ValidRetiro"); 
			System.out.println(ex);
			return "";
		}
		finally
		{

			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}

	
	
	
	
	
	

	
	


  	

	/*
	07/05/2003
	Incluida para la funcionalidad de FOSEG
	Valida que exista una instruccion de retiro de SWIFT por el folio de operacion
	Parametros:  Folio de la instrucci�n
	Salida: Entero con los siguientes valores
			0 - Cuando no hay instruccion con ese folio
			1 - Cuando la instruccion existe y ya fue procesada
		   -1 - Cuando la instruccion existe pero no ha sido procesada(No hay tipo de cambio)
	*/
	public int existeSWIFT(String sFolio)
	{
		try
		{
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			sQuery = "SELECT dfo_tipocambio FROM detliqui,detfoseg WHERE del_folio_opera=" + sFolio;
			sQuery += " AND del_cve_tipo_liq=21 AND dfo_folio_opera = del_folio_opera";
			
			rsQuery=stQuery.executeQuery(sQuery); 
			if (rsQuery.next())
			{
				//En caso de que el tipo de cambio sea nulo, significa que la instrucci�n no ha sido procesada.
				if(rsQuery.getString(1)==null)
               		return -1;
               	else
               		return 1;
          	}
            else
               return 0;
		}
		catch(Exception ex)
		{
			System.out.println("ExisteSWIFT: "+ex);
			return 0;
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}		
	}
	
	/*
	Incluida para la funcionalidad de FOSEG
	Obtiene los datos de la instruccion de retiro swift para ver los montos reales de operacion
	Parametros:  Folio de la instrucci�n
	Salida: Un arreglo con los siguientes datos
			0 - Fecha
			1 - Tipo de Cambio
			2 - Moneda
			3 - Importe de origen Federal en moneda origen
			4 - Importe de origen Estatal en moneda origen
			5 - Importe de origen Rendimientos en moneda origen
			6 - Importe de origen Federal en moneda nacional
			7 - Importe de origen Estatal en moneda nacional
			8 - Importe de origen Rendimientos en moneda nacional
			9 - Importe total en moneda origen
			10 - Importe total en moneda nacional
	*/
	public String[] getDatosSWIFT(String sFolio,String sFiso)
	{
		try
		{
			String[] sData = new String[11];
			
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			sQuery  = "SELECT "
					+ " LTRIM(TO_CHAR(dfo_dia_alta_reg,'00')) || '/' || LTRIM(TO_CHAR(dfo_mes_alta_reg,'00'))|| '/' || dfo_ano_alta_reg  AS Fecha,"
					+ " dfo_tipocambio AS TipoCambio," 
					+ " del_dir_aper_cta AS Moneda, "
					+ " TO_CHAR(dfo_importe1,'999,999,999.99') AS Federal,"
					+ " TO_CHAR(dfo_importe2,'999,999,999.99') AS Estatal,"
					+ " TO_CHAR(dfo_importe3,'999,999,999.99') AS Rendimientos,"
					+ " dfo_importe1*dfo_tipocambio AS FederalMN,"
					+ " dfo_importe2*dfo_tipocambio AS EstatalMN," 
					+ " dfo_importe3*dfo_tipocambio AS RendimientosMN,"
					+ " TO_CHAR(dfo_importe1 + dfo_importe2 + dfo_importe3,'999,999,999,999.99') AS TotalOriginal,"
					+ " dfo_importe1*dfo_tipocambio + dfo_importe2*dfo_tipocambio + dfo_importe3*dfo_tipocambio AS TotalMN"
					+ " FROM detfoseg, detliqui "
					+ " WHERE "
					+ " del_folio_opera=" + sFolio 
					+ " AND "
					+ " del_num_contrato= "+sFiso
					+ " AND"
					+ " dfo_folio_opera = del_folio_opera";
			
		
			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
				{
			for(int i=0;i<11;i++)
				{
					if(i>5 && i!=9)
						sData[i]=nfFormato.format(rsQuery.getDouble(i+1));
					else
						sData[i] = rsQuery.getString(i+1);
				}
			   }
            return sData;
		}
		catch(Exception ex)
		{
			System.out.println("getDatosSWIFT: "+ex);
			return null;
		}
		finally
		{
		
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}		
	}
	



	
	

	

	/*
	15/05/2003
	Incluida para la funcionalidad de FOSEG
	Regresa los movimientos que se han realizado para un fideicomiso en un intervalo de tiempo
	Parametros:  
			1 - Fideicomiso
			2 - Fecha inicial
			3 - Fecha final
			4 - Tipo de movimientos
				1 - Movimentos reales de dinero
				2 - Compromisos y cancelaciones
				3 - Reprogramaciones
				5 - Sitaucion o estatus del movimiento. Sirve para diferenciar los movimientos que estan es espera
	Salida
			Una cadena con el codigo html que genera la tabla con la informaci�n
	Detalle: Se incorporaron las formas de liquidaci�n: dep�sito, compromisos, y asignaci�n de rendimientos
      
	*/
	public String getMovsFOSEG(String sFid, String sFechaI, String sFechaF, String sTipo, String sSituacion)
	{
		StringBuffer sData = new StringBuffer();
		try
		{	
			int i;
			double dTotal=0;
			
			sData.append("<table width=\"100%\" border=\"0\">");
			sData.append("<tr bgcolor=\"#999966\">");			
			sData.append("<td width=\"18%\" align=\"center\" class=\"celda01\">FOLIO</td>");
			sData.append("<td width=\"22%\" align=\"center\" class=\"celda01\">FECHA DE CAPTURA</td>");
			sData.append("<td width=\"30%\" align=\"center\" class=\"celda01\">INSTRUCCI&Oacute;N</td>");
			sData.append("<td width=\"30%\" align=\"center\" class=\"celda01\">IMPORTE</td>");
      		sData.append("</tr>");
          	
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			if((sTipo.equals("1") || sTipo.equals("")) )
				{
				sQuery  = "SELECT "
						+ " dpo_folio_opera,"
						+ " LTRIM(TO_CHAR(dpo_dia_alta_reg,'09')) || '/' || LTRIM(TO_CHAR(dpo_mes_alta_reg,'09')) || '/' || dpo_ano_alta_reg,"
						+ "'Deposito','$' || TO_CHAR(dpo_imp_deposito,'999,999,999,999,999.99')," 
						+ " dpo_imp_deposito"
						+ " FROM "
						+ " deposit "
						+ " WHERE "
						+ " dpo_num_contrato=" + sFid ;
				if(!sFechaI.equals("") && !sFechaF.equals(""))
					{
					sQuery += " AND "
						   + " TO_DATE(LTRIM(TO_CHAR(dpo_dia_alta_reg,'00')) || '/' || LTRIM(TO_CHAR(dpo_mes_alta_reg,'00')) || '/' || dpo_ano_alta_reg,'dd/mm/yyyy')"
						   + " BETWEEN "
						   + " TO_DATE('" + sFechaI + "','dd/mm/yyyy') "
						   + " AND "
						   + " TO_DATE('" + sFechaF + "','dd/mm/yyyy') ";
					}
				sQuery  +=" AND "
				        + " dpo_cve_st_deposi" + (sSituacion.equals("ACTIVO")?" IN ('ACTIVO','ACEPTADA','APLICADA')":("='" + sSituacion + "'"))
						+ " ORDER BY dpo_folio_opera ASC";
				
				
				rsQuery=stQuery.executeQuery(sQuery);
				
				while(rsQuery.next())
					{
					sData.append("<tr>");
					sData.append("<td width=\"20%\" align=\"center\" class=\"celda02\">");
					sData.append("<a href=\"javascript:Enviar('" + rsQuery.getString(1) + "')\">" +  rsQuery.getString(1)  + "</a></td>");
					sData.append("<td width=\"20%\" align=\"center\" class=\"celda02\">"+ rsQuery.getString(2) +"</td>");
					sData.append("<td width=\"30%\" align=\"center\" class=\"celda02\">"+ rsQuery.getString(3) +"</td>");
					sData.append("<td width=\"30%\" align=\"right\" class=\"celda02\">"+ rsQuery.getString(4) +"</td>");
	          		sData.append("</tr>");
	  	      		dTotal += rsQuery.getDouble(5);
					}
				rsQuery.close();
				}

			
			sQuery   = "SELECT "
			         + "DECODE(mfo_folio_detliqui,NULL,mfo_folio,mfo_folio_detliqui) AS Folio,"
					 + " TO_CHAR(mfo_fecha,'dd/mm/yyyy') AS Fecha,"
					 + " DECODE(mfo_tipo_oper,'D','Deposito','R','Retiro','C','Compromiso','S','Cancelaci�n de Compromiso','P','Reprogramacion','A','Asignacion','H','Honorarios') AS TipoMov,"
				     + " '$' || TO_CHAR(SUM(mfo_importe),'999,999,999,999,999.99') AS Importe,"
					 + " NVL(mfo_concepto,'0'),"
					 + " SUM(mfo_importe),"
					 + " DECODE(mfo_tipo_oper,'D',7,'R',2,'C',5,'S',6,'P',7,'A',8,'H',9) AS numTipoMov "
					 + " FROM movimifoseg"
				 	 + " WHERE mfo_num_aux1=" + sFid ;
			
			if(!sFechaI.equals("") && !sFechaF.equals(""))
				{
				sQuery += " AND "
					   + " mfo_fecha "
					   + " BETWEEN "
					   + " TO_DATE('" + sFechaI + " 00:00:00','dd/mm/yyyy hh24:mi:ss') "
					   + " AND "
					   + " TO_DATE('" + sFechaF + " 23:59:59','dd/mm/yyyy hh24:mi:ss') ";
				}
			sQuery += " AND mfo_tipo_oper != 'I' ";					
			
			if(sTipo.equals("1"))
				{
				sQuery  += " AND "
						+ " mfo_tipo_oper IN ('A','R','D','H') "
						+ " AND "
						+ " mfo_concepto IS NULL";
				}
				
			if(sTipo.equals("2"))  // Compromisos y cancelaciones
				{
				sQuery  += " AND "
						+ " mfo_tipo_oper IN ('C','S')";
				}
			if(sTipo.equals("3"))  // Reprogramaciones
				{
				sQuery  += " AND " 
						+ " mfo_tipo_oper IN ('P','D') "
						+ " AND "
						+ " (mfo_concepto='Reprogramacion Destino' OR mfo_concepto='Reprogramacion Origen')";				
				}
				
			if(sSituacion.trim().equals("ACTIVO"))
				{
				sQuery += " AND "       
				       + " mfo_cve_st_movimfo IN ('ACTIVO','ACEPTADA','APLICADA') ";

				
				}
			else	
				{
					sQuery += " AND "       
					+ " mfo_cve_st_movimfo='" + sSituacion + "' ";
	
				}
			sQuery += " GROUP BY "
					+ " mfo_folio,"
					+ " mfo_folio_detliqui,"
					+ " TO_CHAR(mfo_fecha,'dd/mm/yyyy'),"
					+ " mfo_tipo_oper,"
					+ " mfo_concepto"
					+ " ORDER BY "
					//" TO_CHAR(mfo_fecha,'dd/mm/yyyy'),"
					+ " DECODE(mfo_folio_detliqui,NULL,mfo_folio,mfo_folio_detliqui),"
					+ " numTipoMov ASC";

			rsQuery=stQuery.executeQuery(sQuery);
			
			while(rsQuery.next())
				{	
				sData.append("<tr>");
				sData.append("<td width=\"20%\" align=\"center\" class=\"celda02\">");
				sData.append("<a href=\"javascript:Enviar('" + rsQuery.getString(1) + "')\">" +  rsQuery.getString(1)  + "</a></td>");
				sData.append("<td width=\"20%\" align=\"center\" class=\"celda02\">"+ rsQuery.getString(2) +"</td>");
				if(rsQuery.getString(5).equals("Reprogramacion Destino") || rsQuery.getString(5).equals("Reprogramacion Origen"))
					{
					sData.append("<td width=\"30%\" align=\"center\" class=\"celda02\">Reprogramaci&oacute;n</td>");
					rsQuery.next();
					}
				else if(rsQuery.getString(3).equals("Asignacion")) // Asignacion de rendimientos
 				  sData.append("<td width=\"30%\" align=\"center\" class=\"celda02\">Asignaci&oacute;n de Rendimientos</td>");
        		else
				  sData.append("<td width=\"30%\" align=\"center\" class=\"celda02\">"+ rsQuery.getString(3) +"</td>");
        		sData.append("<td width=\"30%\" align=\"right\" class=\"celda02\">"+ rsQuery.getString(4) +"</td>");
        		sData.append("</tr>");
        		if((rsQuery.getString(3).equals("Deposito") || rsQuery.getString(3).equals("Cancelaci�n de Compromiso")) && !rsQuery.getString(5).equals("Reprogramacion Origen"))
         			 dTotal += rsQuery.getDouble(6);
        		else if((rsQuery.getString(3).equals("Retiro") || rsQuery.getString(3).equals("Compromiso")) && !rsQuery.getString(5).equals("Reprogramacion Origen"))
        		dTotal -= rsQuery.getDouble(6);
				}
			
			sData.append("<tr>");
			sData.append("<td colspan=\"4\">&nbsp;</td>");
			sData.append("</tr>");
			/*
			//if(sTipo.equals("1") || sTipo.equals("2"))
				{
				sData.append("<tr>");
				sData.append("<td align=\"right\" class=\"celda01\" colspan=\"3\">TOTAL:</td>");
				sData.append("<td align=\"right\" class=\"celda01\">$" + dfFormat.format(dTotal) + "</td>");
				sData.append("</tr>");
				}
			*/
		
			
		}
		catch(Exception ex)
		{
			System.out.println("getMovsFOSEG: "+ex);
			System.out.println(sQuery);
			
		}
		finally
		{
		
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println("rs"+ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println("st"+ex); }		
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			return sData.toString();

		}		
	}
	
	
	/*
	Incluida para la funcionalidad de FOSEG
	Regresa el detalle de un movimiento identificado por el folio
	Parametros:  
			1 - Folio
			2 - Bandera que indica si la informaci�n se utilizar� para la consulta (0)
			    para la autorizacion/cancelacion de instrucciones pendientes (1)
	Salida
			Una cadena con el codigo html que genera la tabla con la informaci�n
	Detalle: Se incorporaron las formas de liquidaci�n: dep�sito, compromisos, y asignaci�n de rendimientos
      
	*/
	public String getMovsDetFOSEG(String sFolio,String sFiso, int iMensaje)
	{
		StringBuffer sData = new StringBuffer();
		try
		{	
            int tipoOpera=0;
			int i, iPM=0;
			double dImpF=0, dImpE=0, dImpR=0;
			String sFolioInstrucc="0";
			String sTemp ="";
			boolean bDetSwift = false;
			
			sData.append("<table width=\"100%\" border=\"0\">");	
			sData.append("<tr>");
			sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>DATOS GENERALES</b></td>");
			sData.append("</tr>");
			sData.append("<tr>");
			sData.append("<td width=\"30%\"  class=\"celda02\">Folio:</td>");
			sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + sFolio + "</td>");
			sData.append("</tr>");
          	
            if (iMensaje==1)
                sMensaje = "Folio de Operaci�n: "+ sFolio;
          	   
			if (conBD == null) if (!conectarBD()) return sData.toString();
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData.toString();
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stQuery_Secuen = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// DATOS DEL DEPOSITO
			sQuery  = "SELECT LTRIM(TO_CHAR(dpo_dia_alta_reg,'09')) || '/' || LTRIM(TO_CHAR(dpo_mes_alta_reg,'09')) || '/' || dpo_ano_alta_reg AS Fecha,"
					+ " TO_CHAR(dpo_imp_deposito,'999999999999999.99') AS Importe, "
					+ " dpo_num_cuenta,"
					+ " dpo_contrato_inter, "
					+ " dpo_concepto, " 
					+ " dpo_cve_tipo_cta, dpo_nom_pers_fid FROM deposit"
					+ " WHERE "
					+ " dpo_folio_opera=" + sFolio 
					+ " AND"
					+ " dpo_num_Contrato=" + sFiso;
					
		
			rsQuery=stQuery.executeQuery(sQuery);
			
			//Si es un deposito y es para la charola de internet
			if(rsQuery.next()) //&& iMensaje == 1)
			    {
			    tipoOpera=1;
				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Fecha:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(1) + "</td>");
				sData.append("</tr>");		
				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Tipo:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">Deposito") ;
	            sData.append("<input type=\"hidden\" name=\"txtTipo\" value=\"Deposito\">");
	            sData.append("<input type=\"hidden\" name=\"txtTipoInstrucc\" value=\"1\">");
	            sData.append("</td>");
	          	sMensaje += "\\nTipo: Dep�sito";
	          	
	          	sQuery= " SELECT per_nom_usuario /*USE_NL(BITACORA)*/"
						+ " FROM bitacora,personal"
						+ " WHERE "
						+ " bit_seg_transac="+ sFolio
						+ " AND"
						+ " bit_id_terminal='INTERNET'"
						+ " AND per_num_usuario=bit_num_usuario"
 				        + " ORDER BY TO_DATE(BIT_DIA_TRANSAC||'/'||BIT_MES_TRANSAC||'/'||BIT_ANO_TRANSAC||' '||BIT_HORA_TRANSAC||':'||BIT_MIN_TRANSAC,'dd/mm/yyyy hh24:mi') ASC";
				
				rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				if(rsQuery_Secuen.next())
				    {
				    rsQuery_Secuen.last();
				    int size=rsQuery_Secuen.getRow();
				    rsQuery_Secuen.first();
				
					sData.append("<tr>");
					sData.append("<td width=\"30%\"  class=\"celda02\">Realizado por "+(size==1 && iMensaje!=1?" y autorizada ":"")+":</td>");
					sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery_Secuen.getString(1));
					sData.append("<input type=\"hidden\" name=\"txtUsuario\" value=\"" + rsQuery_Secuen.getString(1)+ "\">");
					sData.append("</td>");
					sData.append("</tr>");
				    }

				if(rsQuery_Secuen.next())
				    {
					sData.append("<tr>");
					sData.append("<td width=\"30%\"  class=\"celda02\">Autorizado por:</td>");
					sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery_Secuen.getString(1));
					sData.append("<input type=\"hidden\" name=\"txtUsuario2\" value=\"" + rsQuery_Secuen.getString(1)+ "\">");
					sData.append("</td>");
					sData.append("</tr>");
				    }
				if(rsQuery_Secuen.next())
				    {
					sData.append("<tr>");
					sData.append("<td width=\"30%\"  class=\"celda02\">&nbsp;</td>");
					sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery_Secuen.getString(1));
					sData.append("<input type=\"hidden\" name=\"txtUsuario3\" value=\"" + rsQuery_Secuen.getString(1)+ "\">");
					sData.append("</td>");
					sData.append("</tr>");
				    }
				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Concepto:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(5));
				sData.append("<input type=\"hidden\" name=\"txtConcepto\" value=\"" + rsQuery.getString(5)+ "\">");
				sData.append("</td>");
				sData.append("</tr>");
        
        sData.append("<tr>");   
				sData.append("<td width=\"30%\"  class=\"celda02\">Persona que deposita:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(7));
				sData.append("<input type=\"hidden\" name=\"txtPersona\" value=\"" + rsQuery.getString(7)+ "\">");
				sData.append("</td>");
				sData.append("</tr>");
        
        
        
				
				sMensaje += "\\nConcepto: " + rsQuery.getString(5);
				
				sData.append("<tr>");
				sData.append("<td colspan=\"2\">&nbsp;</td>");
				sData.append("</tr>");
					
				sData.append("<tr>");
				sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>DETALLE</b></td>");
				sData.append("</tr>");

				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Importe:</td>");
				sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\"> $"+ dfFormat.format(Double.parseDouble(rsQuery.getString(2))));
				sData.append("<input type=\"hidden\" name=\"txtImporte\" value=\"" + rsQuery.getString(2) + "\">");
				sData.append("</td></tr>");
        
				
				sMensaje += "\\nImporte: " + rsQuery.getString(2);

				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de cuenta:</td>");
				sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(3));
				sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(3) + "\">");
				sData.append("</td></tr>");

				sMensaje += "\\nN�mero de Cuenta: " + rsQuery.getString(3);

				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Dep�sito al Cto de Inversi�n:</td>");
				sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(4));
				sData.append("<input type=\"hidden\" name=\"txtCtoInv\" value=\"" + rsQuery.getString(4) + "\">");
				sData.append("</td></tr>");
				
				sMensaje += "\\nContrato de Inversi�n: " + rsQuery.getString(4);
				
				if(!rsQuery.getString(6).equals("0"))
				{
					sData.append("<tr>");
					sData.append("<td width=\"30%\"  class=\"celda02\">Instrumento:</td>");
					sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(6));
					sData.append("<input type=\"hidden\" name=\"txtInstrume\" value=\"" + rsQuery.getString(6) + "\">");
					sData.append("</td></tr>");
					
					sMensaje += "\\nInstrumento: " + rsQuery.getString(6);
				}
				
			}//FIN DEL DEPOSITO
			rsQuery.close();
			
			if(tipoOpera==0)//ver si es una operacion Foseg
			{
				
				 sQuery = "SELECT NVL(mfo_folio_detliqui,0)"
						+ "  FROM movimifoseg"
						+ " WHERE "
						+ " mfo_folio=" + sFolio
						+ " AND "
						+ " mfo_num_aux1="+sFiso;
				
				rsQuery=stQuery.executeQuery(sQuery);
				
				if(rsQuery.next())
				{
					if(!rsQuery.getString(1).equals("0"))// ES UN RETIRO
						sFolioInstrucc=rsQuery.getString(1);
				}
				else
					sFolioInstrucc=sFolio;
				
				rsQuery.close();
				
				sQuery  = "SELECT mfo_num_scta,"
				        + " mfo_num_sscta, "
				        + " mfo_num_ssscta, "
				        + " mfo_num_sssscta, "
				        + " mfo_num_aux2, "
				        + " mfo_num_aux3,"
					    + " DECODE(mfo_tipo_oper,'D','Deposito','R','Retiro','C','Compromiso','S','Cancelaci�n de Compromiso','P','Reprogramacion','A','Asignaci�n de Rendimientos','H','Honorarios') AS TipoMov,"
 					    + " LTRIM(TO_CHAR(mfo_importe,'999999999999999.99')) AS Importe,NVL(mfo_acuerdo,'  ') AS Acuerdo,"
						+ " TO_CHAR(mfo_fecha,'dd/mm/yyyy') AS Fecha, NVL(mfo_concepto,' ') AS Concepto,"
					    + " DECODE(mfo_tipo_oper,'D',7,'R',2,'C',5,'S',6,'P',7,'A',8,'H',9) AS txtTipoInstrucc,"
					    + " MFO_COMPROMETIDO AS comprometido,"
					    + " DECODE(MFO_COMPROMETIDO,'N',1,'S',2,1) AS iTipo"
						+ " FROM "
						+ " movimifoseg "
						+ " WHERE "
						+ " mfo_num_aux1="+sFiso
						+ " AND ";
						
						if(sFolioInstrucc.equals("0"))
							sQuery += "mfo_folio=" + sFolio;
						else
							sQuery += "mfo_folio_detliqui=" + sFolioInstrucc;
							
				sQuery += " ORDER BY mfo_num_aux3,TipoMov desc";
			

				rsQuery=stQuery.executeQuery(sQuery);
				
				if(rsQuery.next())//RETIROS, COMPROMISOS, CANCELACION DE COMPROMISOS, REPROGRAMACIONES, ASIGNACI�N DE RENDIMIENTOS
					{				
					sData.append("<tr>");
					sData.append("<td width=\"30%\"  class=\"celda02\">Fecha:</td>");
					sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(10) + "</td>");
					sData.append("</tr>");
		
					sData.append("<tr>");
					sData.append("<td width=\"30%\"  class=\"celda02\">Tipo:</td>");
				
					//Si es una reprogramacion
					if(rsQuery.getString(11).equals("Reprogramacion Destino") || rsQuery.getString(11).equals("Reprogramacion Origen"))
						{
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">Reprogramaci&oacuten");
						if (iMensaje==1)
							{
							sData.append("<input type=\"hidden\" name=\"txtTipo\" value=\"Reprogramacion\">");
							sData.append("<input type=\"hidden\" name=\"txtTipoInstrucc\" value=\"7\">");
							
	          				sMensaje += "\\n\\nReprogramaci�n";
	          				}
	         			sData.append("</td>");
						}
		          else
					    {
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(7));
						if (iMensaje==1)
							{
				   			sMensaje += "\\nTipo: " + rsQuery.getString(7);
				   			sData.append("<input type=\"hidden\" name=\"txtTipo\" value=\"" + rsQuery.getString(7)+ "\">");
				   			sData.append("<input type=\"hidden\" name=\"txtTipoInstrucc\" value=\"" + rsQuery.getInt("txtTipoInstrucc")+ "\">");
				   			
		        			}
	          			sData.append("</td>");
						}
				  sData.append("</tr>");
				
				
   	          	  sQuery= " SELECT per_nom_usuario /*USE_NL(BITACORA)*/"
						+ " FROM bitacora,personal"
						+ " WHERE "
						+ " bit_seg_transac="+ (!sFolioInstrucc.equals("0")?sFolioInstrucc:sFolio)
						+ " AND"
						+ " bit_id_terminal='INTERNET'"
						+ " AND per_num_usuario=bit_num_usuario"
 				        + " ORDER BY TO_DATE(BIT_DIA_TRANSAC||'/'||BIT_MES_TRANSAC||'/'||BIT_ANO_TRANSAC||' '||BIT_HORA_TRANSAC||':'||BIT_MIN_TRANSAC,'dd/mm/yyyy hh24:mi') ASC";
					
				  rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				  
				  if(rsQuery_Secuen.next())
					{
						rsQuery_Secuen.last();
				    	int size=rsQuery_Secuen.getRow();
				    	rsQuery_Secuen.first();
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Realizado "+(size==1 && iMensaje!=1?"y autorizada ":"")+"por:</td>");
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery_Secuen.getString(1));
						if(iMensaje==1)
							sData.append("<input type=\"hidden\" name=\"txtUsuario\" value=\"" + rsQuery_Secuen.getString(1)+ "\">");
						sData.append("</td>");
						sData.append("</tr>");
					}
   				if(rsQuery_Secuen.next())
  				    {
    				sData.append("<tr>");
      			    sData.append("<td width=\"30%\"  class=\"celda02\">Autorizado por:</td>");
        		    sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery_Secuen.getString(1));
          	        sData.append("<input type=\"hidden\" name=\"txtUsuario2\" value=\"" + rsQuery_Secuen.getString(1)+ "\">");
                    sData.append("</td>");
  					sData.append("</tr>");
    			    }
				if(rsQuery_Secuen.next())
  				    {
    				sData.append("<tr>");
      			    sData.append("<td width=\"30%\"  class=\"celda02\">&nbsp;</td>");
        		    sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery_Secuen.getString(1));
          	        sData.append("<input type=\"hidden\" name=\"txtUsuario3\" value=\"" + rsQuery_Secuen.getString(1)+ "\">");
                    sData.append("</td>");
  					sData.append("</tr>");
    			    }
				//El acuerdo o carta es para todos los movimientos excepto para deposito
				if(!rsQuery.getString(7).equals("Deposito") && !rsQuery.getString(11).equals("Reprogramacion Destino"))
					{
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Acuerdo de Comit&eacute o Carta de Instrucci&oacuten:</td>");
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(9));
						if(iMensaje==1)
							sData.append("<input type=\"hidden\" name=\"txtAcuerdo\" value=\"" + rsQuery.getString(9)+ "\">");
						sData.append("</td>");
						sData.append("</tr>");
					}
					
				//El concepto del gasto es solo para compromisos
				if(rsQuery.getString(7).equals("Compromiso") )
					{
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Concepto del gasto:</td>");
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(11));
						if(iMensaje==1)
							sData.append("<input type=\"hidden\" name=\"txtConcepto\" value=\"" + rsQuery.getString(11)+ "\">");
						sData.append("</td>");
						sData.append("</tr>");
					}
	
				sData.append("<tr>");
				sData.append("<td colspan=\"2\">&nbsp;</td>");
				sData.append("</tr>");
				
				if(rsQuery.getString(11).equals("Reprogramacion Origen"))
					{
					sData.append("<tr>");
					sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>PRESUPUESTO ORIGEN</b></td>");
					sData.append("</tr>");
					if (iMensaje==1)
              			sMensaje += "\\n\\nRegistro Presupuestal Origen";
					}
				else
					{
						sData.append("<tr>");
						sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>PRESUPUESTO</b></td>");
						sData.append("</tr>");
						if (iMensaje==1)
              				sMensaje += "\\n\\nRegistro Presupuestal";
					}
					
				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Ejercicio:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(5));
				if(iMensaje==1)
					sData.append("<input type=\"hidden\" name=\"txtEjercicio\" value=\"" + rsQuery.getString(5)+ "\">");
				sData.append("</td>");
				sData.append("</tr>");
					
	        	if (iMensaje==1)
	        		sMensaje += "\\n\\tEjercicio: " + rsQuery.getString(5);
	
				//Obtener nombre del eje
				sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Eje:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(1));			
				sQuery = "SELECT cue_nom_cta FROM cuentaco "
					   + " WHERE cue_num_ctam=7000 AND cue_num_scta=" + rsQuery.getString(1)
					   + " AND cue_num_sscta=0 AND cue_num_ssscta=0 AND  cue_num_sssscta=0";
					   
				rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				
				if(rsQuery_Secuen.next())
					{
					sData.append(" - " + rsQuery_Secuen.getString(1));
					if (iMensaje==1)
						{
	         		 	sMensaje += "\\n\\tEje: " + rsQuery.getString(1)  + " - " + rsQuery_Secuen.getString(1);
	          			sData.append("<input type=\"hidden\" name=\"txtEje\" value=\"" + rsQuery.getString(1)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
	         			}
	         		}	
	         rsQuery_Secuen.close();
	          	   	
	         sData.append("</td></tr>");
	          	   	
			//Obtener nombre del programa
			sData.append("<tr>");
			sData.append("<td width=\"30%\"  class=\"celda02\">Programa:</td>");
			sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(2));
			sQuery = "SELECT cue_nom_cta FROM cuentaco "
			       + " WHERE cue_num_ctam=7000 AND cue_num_scta=" + rsQuery.getString(1)
				   + " AND cue_num_sscta="+ rsQuery.getString(2) +" AND cue_num_ssscta=0 AND cue_num_sssscta=0";
				   
			rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
			if(rsQuery_Secuen.next())
				{
				sData.append(" - " + rsQuery_Secuen.getString(1));
				if (iMensaje==1)
					{
		          sMensaje += "\\n\\tPrograma: " + rsQuery.getString(2)  + " - " + rsQuery_Secuen.getString(1);
		          sData.append("<input type=\"hidden\" name=\"txtPrograma\" value=\"" + rsQuery.getString(2)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
		           }
	       		}
			rsQuery_Secuen.close();
					
			sData.append("</td></tr>");
									
			//Obtener nombre del proyecto
			sData.append("<tr>");
			sData.append("<td width=\"30%\"  class=\"celda02\">Proyecto:</td>");
			sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(3));			
			sQuery = "SELECT cue_nom_cta FROM cuentaco "
				   + " WHERE cue_num_ctam=7000 "
				   + " AND cue_num_scta=" + rsQuery.getString(1)
				   + " AND cue_num_sscta="+ rsQuery.getString(2) 
				   + " AND cue_num_ssscta="+ rsQuery.getString(3) 
				   + " AND  cue_num_sssscta=0";
			
			rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
			
			if(rsQuery_Secuen.next())
			  {
			  sData.append(" - " + rsQuery_Secuen.getString(1));
			  if (iMensaje==1)
				{
	          sMensaje += "\\n\\tProyecto: " + rsQuery.getString(3)  + " - " + rsQuery_Secuen.getString(1);
	          sData.append("<input type=\"hidden\" name=\"txtProyecto\" value=\"" + rsQuery.getString(3)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
	        	}
	          }	
			rsQuery_Secuen.close();
			sData.append("</td></tr>");
					
		    //Obtener nombre de la accion
			sData.append("<tr>");
			sData.append("<td width=\"30%\"  class=\"celda02\">Acci&oacuten:</td>");
			sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(4));			
	
			sQuery = "SELECT cue_nom_cta FROM cuentaco " 
				   + " WHERE cue_num_ctam=7000" 
				   + " AND cue_num_scta=" + rsQuery.getString(1)
				   + " AND cue_num_sscta="+ rsQuery.getString(2) 
				   + " AND cue_num_ssscta="+ rsQuery.getString(3) 
				   +" AND  cue_num_sssscta="+ rsQuery.getString(4);
				   
			rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
			if(rsQuery_Secuen.next())
			  {
			  sData.append(" - " + rsQuery_Secuen.getString(1));
			  if(iMensaje==1)
				{
		        sMensaje += "\\n\\tAccion: " + rsQuery.getString(4)  + " - " + rsQuery_Secuen.getString(1);
		        sData.append("<input type=\"hidden\" name=\"txtAccion\" value=\"" + rsQuery.getString(4)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
	        	}
	          }	
	          
			rsQuery_Secuen.close();
			
			sData.append("</td></tr>");
			
			if(rsQuery.getString(7).equals("Retiro"))
				{
				sData.append("<tr class=\"celda02\">");
				sData.append("<td >Comprometido:</td>");
				sData.append("<td >"+(rsQuery.getString("comprometido").equals("N")?"NO":"SI")+"</td>");
				sData.append("<input type=\"hidden\" name=\"txtComprometido\" value=\"" + rsQuery.getString("iTipo")+ "\">");
				sData.append("</tr>");
			    }
			
			sData.append("<tr>");
			sData.append("<td colspan=\"2\">&nbsp;</td>");
			sData.append("</tr>");
	
			//Informacion del destino cuando es reprogramacion
			if(rsQuery.getString(11).equals("Reprogramacion Origen"))
				{
				if(rsQuery.next())
	  			  {
				  sData.append("<tr>");
				  sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>PRESUPUESTO DESTINO</b></td>");
				  sData.append("</tr>");
	 			  if (iMensaje==1)
		    	   	sMensaje += "\\n\\nRegistro Presupuestal Origen";
	 			  sData.append("<tr>");
				  sData.append("<td width=\"30%\"  class=\"celda02\">Ejercicio:</td>");
				  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(5));
				 if (iMensaje==1)
				    {
					sMensaje += "\\n\\tEjercicio:" + rsQuery.getString(5);
		    	   	sData.append("<input type=\"hidden\" name=\"txtEjercicio1\" value=\"" + rsQuery.getString(5)  + "\">");
		    	    }
		    	 sData.append("</td></tr>");
		    	   			
				 //Obtener nombre del eje
				 sData.append("<tr>");
				 sData.append("<td width=\"30%\"  class=\"celda02\">Eje:</td>");
				 sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(1));			
	 			 
	 			 sQuery = "SELECT cue_nom_cta FROM cuentaco "
	 			        + " WHERE cue_num_ctam=7000 "
	 			        + " AND cue_num_scta=" + rsQuery.getString(1)
						+ " AND cue_num_sscta=0 "
						+ " AND cue_num_ssscta=0 "
						+ " AND  cue_num_sssscta=0";
						
				 rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				 if(rsQuery_Secuen.next())
				 	{
				 	sData.append(" - " + rsQuery_Secuen.getString(1));
					if (iMensaje==1)
						{
		    	   	sMensaje += "\\n\\tEje:" + rsQuery.getString(1) + " - " + rsQuery_Secuen.getString(1);
		    	   	sData.append("<input type=\"hidden\" name=\"txtEje1\" value=\"" + rsQuery.getString(1)  + " - " +  rsQuery_Secuen.getString(1) + "\">");
		    	 	 	}
		    	 	}	
		    	 	 
		    	  sData.append("</td></tr>");
				  rsQuery_Secuen.close();
						
				  //Obtener nombre del programa
				  sData.append("<tr>");
				  sData.append("<td width=\"30%\"  class=\"celda02\">Programa:</td>");
				  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(2));
	 		 	   
	 		 	  sQuery = "SELECT cue_nom_cta FROM cuentaco "
	 		 	  		 + " WHERE cue_num_ctam=7000 "
	 		 	  		 + " AND cue_num_scta=" + rsQuery.getString(1)
						 + " AND cue_num_sscta="+ rsQuery.getString(2) 
						 +" AND cue_num_ssscta=0 AND cue_num_sssscta=0";
						 
				  rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				  if(rsQuery_Secuen.next())
						sData.append(" - " + rsQuery_Secuen.getString(1));				
				
				  if(iMensaje==1)
					{
		    	   	sMensaje += "\\n\\tPrograma:" + rsQuery.getString(2) + " - " + rsQuery_Secuen.getString(1);
		    	   	sData.append("<input type=\"hidden\" name=\"txtPrograma1\" value=\"" + rsQuery.getString(2)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
		    	  	}
		    	  sData.append("</td></tr>");
		    	  rsQuery_Secuen.close();
		    	   			
				  //Obtener nombre del proyecto
				  sData.append("<tr>");
				  sData.append("<td width=\"30%\"  class=\"celda02\">Proyecto:</td>");
				  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(3));			
	  			  
	  			  sQuery = "SELECT cue_nom_cta FROM cuentaco "
	  			         + " WHERE cue_num_ctam=7000"
	  			         + " AND cue_num_scta=" + rsQuery.getString(1)
						 + " AND cue_num_sscta="+ rsQuery.getString(2) 
						 +" AND cue_num_ssscta="+ rsQuery.getString(3) 
						 +" AND  cue_num_sssscta=0";
						 
				  rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				  if(rsQuery_Secuen.next())
				  	{
					sData.append(" - " + rsQuery_Secuen.getString(1));
					if (iMensaje==1)
						{
		    	   		sMensaje += "\\n\\tProyecto:" + rsQuery.getString(3) + " - " + rsQuery_Secuen.getString(1);
		    	   		sData.append("<input type=\"hidden\" name=\"txtProyecto1\" value=\"" + rsQuery.getString(3)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
		    	  		}
		    	  	}	
		    	  rsQuery_Secuen.close();
		    	  sData.append("</td></tr>");
	
				  //Obtener nombre de la accion
				  sData.append("<tr>");
				  sData.append("<td width=\"30%\"  class=\"celda02\">Acci&oacuten:</td>");
				  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">" + rsQuery.getString(4));			
	
				  sQuery = "SELECT cue_nom_cta FROM cuentaco"
				   		 + " WHERE cue_num_ctam=7000"
				   		 + " AND cue_num_scta=" + rsQuery.getString(1)
						 + " AND cue_num_sscta="+ rsQuery.getString(2) 
						 + " AND cue_num_ssscta="+ rsQuery.getString(3) 
						 + " AND  cue_num_sssscta="+ rsQuery.getString(4);
						 
				  rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
				  if(rsQuery_Secuen.next())
				  	{
					sData.append(" - " + rsQuery_Secuen.getString(1));				
					if (iMensaje==1)
						{
		    	   		sMensaje += "\\n\\tAcci�n:" + rsQuery.getString(4) + " - " + rsQuery_Secuen.getString(1);
		    	   		sData.append("<input type=\"hidden\" name=\"txtAccion1\" value=\"" + rsQuery.getString(4)  + " - " +  rsQuery_Secuen.getString(1)+ "\">");
		    	  		}
		    	  	}	
				  rsQuery_Secuen.close();
				  sData.append("</td></tr>");
						
				  sData.append("<tr>");
				  sData.append("<td colspan=\"2\">&nbsp;</td>");
				  sData.append("</tr>");
				  }
			   }//if Informacion del destino cuando es reprogramacion
					
		 sData.append("<tr>");
		 sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>IMPORTE</b></td>");
		 sData.append("</tr>");
		 i=1;
		 String strImpFed="0";		
		 String strImpEst="0";		
		 String strImpRen="0";		
		 do
			{	
			if (i==1)
				{
				if(rsQuery.getString(6).equals("1"))
					{
					sData.append("<tr><td width=\"30%\"  class=\"celda02\">Federal:</td>");
					sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$" + dfFormat.format(Double.parseDouble(rsQuery.getString(8))) + "</td></tr>");
					dImpF=Double.valueOf(rsQuery.getString(8)).doubleValue();
					strImpFed=rsQuery.getString(8);
					}
				else
					{
					sData.append("<tr><td width=\"30%\"  class=\"celda02\">Federal:</td>");
					sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$0.00" + "</td></tr>");
					i++;
					}
		 	    }
						
			if(i==2)
				{
				if(rsQuery.getString(6).equals("2"))
			  	  {
				 sData.append("<tr><td width=\"30%\"  class=\"celda02\">Estatal:</td>");
				 sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$" + dfFormat.format(Double.parseDouble(rsQuery.getString(8))) + "</td></tr>");
				 dImpE=Double.valueOf(rsQuery.getString(8)).doubleValue();
				 strImpEst=rsQuery.getString(8);
				  }
			    else
				  {
				  sData.append("<tr><td width=\"30%\"  class=\"celda02\">Estatal:</td>");
				  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$0.00" + "</td></tr>");
				  i++;
				  }
				}
						
		    if(i==3)
			  {
			  if(rsQuery.getString(6).equals("3"))
			 	{
			 	sData.append("<tr><td width=\"30%\"  class=\"celda02\">Rendimientos:</td>");
			 	sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$" + dfFormat.format(Double.parseDouble(rsQuery.getString(8))) + "</td></tr>") ;
			 	dImpR=Double.valueOf(rsQuery.getString(8)).doubleValue();
			 	strImpRen=rsQuery.getString(8);
				}
			  else
				{
			 	sData.append("<tr><td width=\"30%\"  class=\"celda02\">Rendimientos:</td>");
			 	sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$0.00" + "</td></tr>");
			 	i++;
			    }
			  }
			i++;
		    }while(rsQuery.next() && i<4);
				
		if (i==1)
  		    {
			sData.append("<tr><td width=\"30%\"  class=\"celda02\">Federal:</td>");
			sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$0.00" + "</td></tr>");
			i++;
		    }
						
		if(i==2)
		  {
		  sData.append("<tr><td width=\"30%\"  class=\"celda02\">Estatal:</td>");
		  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$0.00" + "</td></tr>");
		  i++;
		  }
		
		if(i==3)
		  {
		  sData.append("<tr><td width=\"30%\"  class=\"celda02\">Rendimientos:</td>");
		  sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$0.00" + "</td></tr>");
		  i++;
		  }
				
	rsQuery.close();
	
	sData.append("<tr><td width=\"30%\"  class=\"celda02\">Total:</td>");
	sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">$" + dfFormat.format(dImpF + dImpE + dImpR));
				
	if (iMensaje==1)
		{
        sMensaje += "\\n\\nImporte Total:" + dfFormat.format(dImpF + dImpE + dImpR);
	    sMensaje += "\\n\\tFederal:" + dfFormat.format(dImpF);
		sMensaje += "\\n\\nEstatal:" + dfFormat.format(dImpE);
		sMensaje += "\\n\\nRendimientos:" + dfFormat.format(dImpR);
		sData.append("<input type=\"hidden\" name=\"txtImpFed\" value=\"" + strImpFed + "\">");
		sData.append("<input type=\"hidden\" name=\"txtImpEst\" value=\"" + strImpEst + "\">");
		sData.append("<input type=\"hidden\" name=\"txtImpRen\" value=\"" + strImpRen + "\">");
		sData.append("<input type=\"hidden\" name=\"txtImporte\" value=\"" + dfFormat.format(dImpF + dImpE + dImpR) + "\">");
		}	
		   		
    sData.append("</td></tr>");
				
	//Obtener detalle de la instruccion, si es un Retiro
	
	if(!sFolioInstrucc.equals("0"))
		{
		sQuery = " SELECT del_cve_tipo_liq,del_nom_pers_fid,del_nom_banco,del_num_cuenta,del_cta_banxico,"
			   + " nvl(del_nom_plaza,' '),del_dir_aper_cta,del_nom_area,del_num_sucursal,del_codigo_trans,del_cve_tipo_cta,"
			   + " del_num_pers_fid,del_num_pais,del_concepto,del_entidad_fin,del_num_iniciativa as pagosMultiples"
			   + " FROM detliqui WHERE del_folio_opera=" + sFolioInstrucc;
			   
			   
		rsQuery=stQuery.executeQuery(sQuery);
		
		if(rsQuery.next())
			{
			iPM=rsQuery.getInt("pagosMultiples");
			sData.append("<tr>");
			sData.append("<td colspan=\"2\">&nbsp;</td>");
			sData.append("</tr>");
			sData.append("<tr>");
			sData.append("<td bgcolor=\"#999966\" colspan=\"2\" align=\"center\" class=\"celda01\"><b>DETALLE</b>");
 			if(iPM==0)
              sData.append("<input type=\"hidden\" name=\"txtPM\" value=\"NO\">");
			sData.append("</td></tr>");
			if(iPM==1)
				{
	            sData.append("<tr>");
				sData.append("<td width=\"30%\"  class=\"celda02\">Pagos m�ltiples:</td>");
				sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">SI");
				sData.append("<input type=\"hidden\" name=\"txtPM\" value=\"SI\">");
				sData.append("</td></tr>");
				}
			sData.append("<tr>");
			sData.append("<td width=\"30%\"  class=\"celda02\">Concepto o Meta:</td>");
			sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(14));
			sData.append("<input type=\"hidden\" name=\"txtConcepto\" value=\"" + rsQuery.getString(14) + "\">");
			sData.append("</td></tr>");
			sData.append("<tr>");
			sData.append("<td width=\"30%\"  class=\"celda02\">Forma de liquidaci&oacuten:</td>");
			switch (rsQuery.getInt(1))
				{
				case 3: //Cheque
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">Cheque");
						sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"Cheque\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Banco:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(3));
						sData.append("<input type=\"hidden\" name=\"txtBanco\" value=\"" + rsQuery.getString(3) + "\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Beneficiario:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
						sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(2) + "\">");
						sData.append("</td></tr>");
						break;
				case 5: //SPEUA
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">SPEUA");
						sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"SPEUA\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Banco:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(3));
						sData.append("<input type=\"hidden\" name=\"txtBanco\" value=\"" + rsQuery.getString(3) + "\">");
						sData.append("</tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de cuenta:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(4));
						sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(4) + "\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Plaza:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(6));
						sData.append("<input type=\"hidden\" name=\"txtPlaza\" value=\"" + rsQuery.getString(6) + "\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Titualar:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
						sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(2) + "\">");
						sData.append("</td></tr>");
						break;
				case 18: //SIAC-Banxico
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">SIAC(Banxico)</td>");
						sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"SIAC(Banxico)\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de cuenta:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(5));
						sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(5) + "\">");
						sData.append("</td></tr>");
						sData.append("<tr>");
						sData.append("<td width=\"30%\"  class=\"celda02\">Titualar:</td>");
						sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
						sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(2) + "\">");
						sData.append("</td></tr>");
						break;
				case 19: //TBC-Bancomer
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">TBC-Bancomer");
						sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"TBC-Bancomer\">");
						sData.append("</td></tr>");
				//Si no es pago multiple
	  			 	    if (rsQuery.getInt("pagosMultiples")==0)
						   {
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de cuenta:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(4));
							sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(4) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Plaza:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(6));
							sData.append("<input type=\"hidden\" name=\"txtPlaza\" value=\"" + rsQuery.getString(6) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Titualar:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
							sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(3) + "\">");
							sData.append("</td></tr>");
							}
						break;
				case 20: //TEF
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">Transferencia Electr&oacutenica de Fondos");
						sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"Transferencia Electr�nica de Fondos\">");
						sData.append("</td></tr>");
						//Si no es pago multiple
						if (rsQuery.getInt("pagosMultiples")==0)
							{
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Banco:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(3));
							sData.append("<input type=\"hidden\" name=\"txtBanco\" value=\"" + rsQuery.getString(3) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de cuenta:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(4));
							sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(4) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Plaza:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(6));
							sData.append("<input type=\"hidden\" name=\"txtPlaza\" value=\"" + rsQuery.getString(6) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Titular:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
							sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(2) + "\">");
							sData.append("</td></tr>");
							}
						break;
				// SE INCORPORA SPEI COMO NUEVA FORMA DE LIQUIDACION Y SUSTITUYE SPEUA
				case 23: //SPEI
						sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">SPEI");
						sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"SPEI\">");
						sData.append("</td></tr>");
						//Si no es pago multiple
						if (rsQuery.getInt("pagosMultiples")==0)
							{
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Banco:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(3));
							sData.append("<input type=\"hidden\" name=\"txtBanco\" value=\"" + rsQuery.getString(3) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de cuenta:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(4));
							sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(4) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Plaza:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(6));
							sData.append("<input type=\"hidden\" name=\"txtPlaza\" value=\"" + rsQuery.getString(6) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Titular:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
							sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(2) + "\">");
							sData.append("</td></tr>");
							}
						break;
				case 21: //SWIFT
							sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">SWIFT");
							sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"SWIFT\">");
							sData.append("</td></tr>");
				
							sData.append("<tr><td width=\"30%\" align=\"left\" class=\"celda02\" colspan=\"2\">Banco Domiciliario</td></tr>");
					
							sQuery = "SELECT pai_nom_pais FROM paises WHERE pai_num_pais=" + rsQuery.getString(12);
							rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
							if(rsQuery_Secuen.next())
								{
								sData.append("<tr>");
								sData.append("<td width=\"30%\"  class=\"celda02\">Pais:</td>");
								sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery_Secuen.getString(1));
								sData.append("<input type=\"hidden\" name=\"txtPaisD\" value=\"" + rsQuery_Secuen.getString(1) + "\">");
								sData.append("</td></tr>");
								}
							rsQuery_Secuen.close();
								
							sQuery = "SELECT pai_nom_pais FROM paises WHERE pai_num_pais=" + rsQuery.getString(13);
							rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
							if(rsQuery_Secuen.next())
								{
								sTemp="<tr>";
								sTemp+="<td width=\"30%\"  class=\"celda02\">Pais:</td>";
								sTemp+="<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery_Secuen.getString(1);
								sTemp+="<input type=\"hidden\" name=\"txtPaisB\" value=\"" + rsQuery_Secuen.getString(1) + "\">";
								sTemp+="</td></tr>";
								}
							rsQuery_Secuen.close();
	
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Ciudad:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(8));
							sData.append("<input type=\"hidden\" name=\"txtCiudadD\" value=\"" + rsQuery.getString(8) + "\">");
							sData.append("</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Banco:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(3));
							sData.append("<input type=\"hidden\" name=\"txtBancoD\" value=\"" + rsQuery.getString(3) + "\">");
							sData.append("</td></tr>");
							
							sQuery = "SELECT swi_branch,swi_domicilio,swi_nom_plaza FROM detswift WHERE del_folio_opera=" + sFolioInstrucc;
							rsQuery_Secuen=stQuery_Secuen.executeQuery(sQuery);
							if(rsQuery_Secuen.next())
								{
								bDetSwift=true;
							 	sData.append("<tr>");
								sData.append("<td width=\"30%\"  class=\"celda02\">Plaza:</td>");
								sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery_Secuen.getString(3));
								sData.append("<input type=\"hidden\" name=\"txtPlazaD\" value=\"" + rsQuery_Secuen.getString(3) + "\">");
								sData.append("</td></tr>");
								}
								
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">N&uacutemero de Cuenta:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(4));
							sData.append("<input type=\"hidden\" name=\"txtCuenta\" value=\"" + rsQuery.getString(4) + "\">");
							sData.append("</td></tr>");
								
							if(bDetSwift)
								{
								sData.append("<tr>");
								sData.append("<td width=\"30%\"  class=\"celda02\">Branch:</td>");
								sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery_Secuen.getString(1));
								sData.append("<input type=\"hidden\" name=\"txtBranch\" value=\"" + rsQuery_Secuen.getString(1) + "\">");
								sData.append("</td></tr>");
								}
								
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Moneda:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(7));
							sData.append("<input type=\"hidden\" name=\"txtMoneda\" value=\"" + rsQuery.getString(7) + "\">");
							sData.append("</td></tr>");							
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">C&oacutedigo SWIFT o ABA para EUA:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(10));
							sData.append("<input type=\"hidden\" name=\"txtCodigoS\" value=\"" + rsQuery.getString(10) + "\">");
							sData.append("</td></tr>");							
			  			    sData.append("<tr><td width=\"30%\" align=\"left\" class=\"celda02\" colspan=\"2\">Datos del Beneficiario</td></tr>");
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Nombre:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(2));
							sData.append("<input type=\"hidden\" name=\"txtBene\" value=\"" + rsQuery.getString(2) + "\">");
							sData.append("</td></tr>");
						   if (!sTemp.equals(""))
									sData.append(sTemp);
									
							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Ciudad:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(6));
							sData.append("<input type=\"hidden\" name=\"txtCiudadB\" value=\"" + rsQuery.getString(6) + "\">");
							sData.append("</td></tr>");
	
	
							if(bDetSwift)
								{
								sData.append("<tr>");
								sData.append("<td width=\"30%\"  class=\"celda02\">Domicilio:</td>");
								sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery_Secuen.getString(2));
								sData.append("<input type=\"hidden\" name=\"txtDomi\" value=\"" + rsQuery_Secuen.getString(2) + "\">");
								sData.append("</td></tr>");
								}

							sData.append("<tr>");
							sData.append("<td width=\"30%\"  class=\"celda02\">Tel&eacutefono:</td>");
							sData.append("<td width=\"30%\" align=\"left\" class=\"celda02\">"+ rsQuery.getString(11));					
							sData.append("<input type=\"hidden\" name=\"txtTel\" value=\"" + rsQuery.getString(11) + "\">");
							sData.append("</td></tr>");
							break;
				case 22: //Pago en Ventanilla
							sData.append("<td width=\"70%\" align=\"left\" class=\"celda02\">Pago en Ventanilla");
							sData.append("<input type=\"hidden\" name=\"txtFormaLiq\" value=\"Pago en Ventanilla\">");
							sData.append("</td></tr>");
							break;
				}// Switch
			}// IF del next al recuperar el detalle de la instruccion
	   }// IF si es retiro, Obtener detalle de la instruccion
       if (iMensaje==1)
            sData.append("<input type=\"hidden\" name=\"txtPM\" value=\"NO\">");
	  }//next de movimidfoseg
	  
			
			//Si son instrucciones pendientes
      if (iMensaje==1)
      	{
		//Si es pagos multiples
		if(iPM==1)
			{
       		sData.append("<tr class=\"celda02\"><td colspan=\"2\" align=\"center\">&nbsp;</td></tr>");
			sData.append("<tr class=\"celda02\"><td align=\"center\" class=\"celda01\" colspan=\"2\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			sData.append("Para Enviar Archivo de Pagos Multiples, &nbsp;&nbsp;<a href=\"javascript:pagosMultiples();\">");
			sData.append("<u>click Aqu�</u></a></td></tr>");
			sData.append("<tr class=\"celda02\"><td colspan=\"2\" align=\"center\">&nbsp;</td></tr>");
			}
		}
	  }// IF (tipoOpera==0) para recuperar donde se obtienen los datos de movimifoseg
	
			
	}
	catch(Exception ex)
		{
			System.out.println("getMovsDetFOSEG: "+ex);
			System.out.println(sQuery);
			sMensaje="ERRORFS";
			sData.append("<font class=\"alerta\">Error al consultar el detalle<br>Intente mas tarde<br>Si el problema persiste: Informe a su ejecutivo de cuenta</font>");
		}
		finally
		{
			sData.append("<tr><td colspan=\"2\" align=\"center\">&nbsp;</td></tr>");
			sData.append("<tr><td colspan=\"2\" align=\"right\"><a href=\"javascript:atras()\";\" >");
			sData.append("<img src=\"imagenes/b_atras.gif\" border=0 width=\"58\"  height=\"23\" align=\"right\"></a></td></tr>");
	
			sData.append("</table>");
		    
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println("st"+ex); }		
			try { if(stQuery_Secuen != null ) stQuery_Secuen.close(); } catch (Exception ex) { System.out.println("st"+ex); }		
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			return sData.toString();
		}		
	}
	

	

/*******************  Metodode de traspasos Ineter fideicomisos  ****************/	


	//Obtiene el saldo por contrato de inversion para un fideicomiso
	public String[] getCtosSaldo(String Cond, String sNumFid )
	{
		String[] sData = null;
		String[] sCtos = null;
		int i;
		double dImp = 0, dTotal = 0;
		int Moneda=0;

		//recupera los contratos de inversion del fifeicomiso
		sCtos = getData(35,Cond);
		
		try
		{ 					
			
						//recupera el saldo de los contratos de inversion del fideicomiso			
			if (sCtos != null) 
				{					
						sData = new String[sCtos.length];						
						// conectandose a la base
						if (conBD == null) if (!conectarBD()) return sData ;
						if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
						
						stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

						for (i=0;i<sCtos.length&&(((Integer.valueOf(sCtos[i]).intValue())<6000000 || (Integer.valueOf(sCtos[i]).intValue())>6999999)&&!((sCtos[i]).equals("1060140")));i++)
							{			
									dImp = 0;
								 dTotal = 0;	
									sQuery = "SELECT NVL(SUM(pos_costo_historic),0) FROM posicion";
									sQuery +=" WHERE pos_num_contrato=" + sNumFid ;
									sQuery +=" AND pos_contrato_inter=" + sCtos[i];
									rsQuery=stQuery.executeQuery(sQuery); 
								
									if(rsQuery.next())
										{
												dImp = rsQuery.getDouble(1);
												rsQuery.close();
												
												sQuery = "SELECT NVL(SUM(cre_imp_reporto),0) FROM conrepor WHERE cre_num_contrato=";
												sQuery += sNumFid + " AND cre_contrato_inter=" + sCtos[i] +" AND cre_cve_st_conrepo = 'ACTIVO'";													
												rsQuery=stQuery.executeQuery(sQuery); 
												
												if (rsQuery.next()) 
												dImp = dImp + rsQuery.getDouble(1);										
										}
				
									dTotal = dTotal + dImp;					

									sData[i]= Double.toString(dTotal);			
									rsQuery.next();										
								}			            									            	
          	}
				return sData;			
		}
		
		catch (Exception ex)
		{
			System.out.println(ex);
			System.out.println("Error del metodo: getCtosSaldo"); 
			return null;
		}
		finally
		{
			
			if(sCtos!=null)
			{
				try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println("rs"+ex); }
				try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println("st"+ex); }		
				try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			}
		}
		

		
}




/***************** Fin de Metodode de traspasos Ineter fideicomisos *************/

	public String getDatosMail(int noDato)
		{
		/*
		 *dato=100 IP SERVIDOR
		 *dato=101 DIRECCION DESTINO
		 **/	
		String dato=null;
	
		try
		{
		    //se recuperan los parametros globales
		    servicios serv = new servicios();
		    resultado=serv.consumo(2,String.valueOf(noDato)); 
		    dato= resultado[0];
         		 		
		}
		catch(Exception ex)
			{
			System.out.println("getIpMail: "+ex);
			dato=null;	
			}
		finally
			{
			return dato;
			}		
	}		
  

	public String getDatosParametros(int noDato)
		{
		/*
		 *dato=100 IP SERVIDOR
		 *dato=101 DIRECCION DESTINO
		 *dato=102 ESTADOS DE CUENTA TAS
		 **/	
		String dato=null;
	
		try
		{
			if (conBD == null) if (!conectarBD()) dato=null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) dato=null;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			sQuery = "select trim(param_valor2) as dato  from param_global p where p.param_clave="+ noDato;
						
			rsQuery=stQuery.executeQuery(sQuery); 
			if (rsQuery.next())
				{
				dato= rsQuery.getString("dato");
          		}
         		 		
		}
		catch(Exception ex)
			{
			System.out.println("getDatosParametros: "+ex);
			dato=null;	
			}
		finally
			{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			return dato;
			}		
	}		
public String muestraImporte (String sImporteOrig)
 {
  String sImporte="0.0";
    try
        {
			if (conBD == null) if (!conectarBD()) sImporte=null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD())sImporte=null;
			
       stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);			
      
        sQuery = "SELECT REPLACE(TO_CHAR(TO_NUMBER('"+sImporteOrig+"','999,999,999,999,999.00'),'999,999,999,999,999.00'),' ','') FROM DUAL";
      
      
        rsQuery= stQuery.executeQuery(sQuery); 
         if(rsQuery.next())
          {
            sImporte = rsQuery.getString(1);
          }
          return sImporte;
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
   return "0.0";     
 }

public String muestraImporteSinFormato (String sImporteOrig)
 {
  String sImporte="0.0";
    try
        {
			if (conBD == null) if (!conectarBD()) sImporte=null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD())sImporte=null;
			
       stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);			
      
        sQuery = "SELECT REPLACE('"+sImporteOrig+"','$','') FROM DUAL";
      
      
        rsQuery= stQuery.executeQuery(sQuery); 
         if(rsQuery.next())
          {
            sImporte = rsQuery.getString(1);
          }
          return sImporte;
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
   return "0.0";     
 }

 
   public String DataCombo2(String[] sData,String sDataSelected, boolean cboValorCompuesto)
	{
		StringBuffer s = new StringBuffer();
		int i;
    
    String llave[]=null;//variable usada cuando el valor del combo viene compuesto ej: "1-ACTIVO"
    
		if(sData!=null)
			{
			for(i=0;i<sData.length;i++){
        if(cboValorCompuesto)
          llave=sData[i].split("-");
        
        if(!cboValorCompuesto&&sDataSelected!=null&&sData[i].equals(sDataSelected))
          s.append("<option value=\""+ sData[i] +"\" selected>" + sData[i] );
        else if (cboValorCompuesto&&sDataSelected!=null&&llave[0].equals(sDataSelected))
          s.append("<option value=\""+ sData[i] +"\" selected>" + sData[i] );
        else
          s.append("<option>" + sData[i] );
      }  
			return s.toString();		
			}
		else	
			return "";		
	}


    /**
               * Leer de acuerdo con la identificaci�n de la imagen en la base de datos
               * @param strID ID de campo de imagen
               * @param w El ancho a reducir
               * @param h necesita ser reducido a la altura
         * @return
         */
       public byte[] GetImgByteById(String sAnio,String sMes,String sCuenta){
        //System.out.println("Get img data which id is " + nID);
        byte[] data = null;
        boolean bregreso = false;
        try {
                if (conBD == null) if (!conectarBD()) bregreso=true;
                if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) bregreso=true;
                
                stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);            
                Statement stmt = conBD.createStatement();
                ResultSet myResultSet = stmt.executeQuery("select FEC_ARCHIVO_A_CARGAR from F_ESTADOS_DE_CUENTAS where FEC_NUM_CUENTA="+sCuenta+
                                                          " AND FEC_ANO="+sAnio+ " AND FEC_MES="+sMes);
               
                StringBuffer myStringBuffer = new StringBuffer();
                if (myResultSet.next()) {
                    java.sql.Blob blob = myResultSet.getBlob(1);
                    InputStream inStream = blob.getBinaryStream();
                    try {
                        long nLen = blob.length();
                        int nSize = (int) nLen;
                        //System.out.println("img data size is :" + nSize);
                        data = new byte[nSize];
                        inStream.read(data);
                        inStream.close();
                    } catch (IOException e) {
                                             System.out.println ("Error al obtener datos de la imagen, raz�n:" + e.getMessage ());
                    }
                   
                    //data = ChangeImgSize(data, 300, 300);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            finally
            {
              
              try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
              try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
              try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
            }        
            return data;
    }

    /**
               * Reduce o ampl�a la imagen
               * @param data picture byte data
               * @param w El ancho a reducir
               * @param h necesita ser reducido a la altura
               * @ devuelve los datos de bytes de la imagen ampliada
         */
        private byte[] ChangeImgSize(byte[] data, int nw, int nh){
        byte[] newdata = null;
        try{ 
            
             BufferedImage bis = ImageIO.read(new ByteArrayInputStream(data));
                int w = bis.getWidth();
                int h = bis.getHeight();
                double sx = (double) nw / w;
                double sy = (double) nh / h;
                AffineTransform transform = new AffineTransform();
                transform.setToScale(sx, sy);
                AffineTransformOp ato = new AffineTransformOp(transform, null);
                             // color original
                BufferedImage bid = new BufferedImage(nw, nh, BufferedImage.TYPE_3BYTE_BGR);
                ato.filter(bis, bid);
               
                             // Convertir a byte
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(bid, "jpeg", baos);
                newdata = baos.toByteArray();
               
        }catch(IOException e){ 
             e.printStackTrace(); 
        } 
      
        return newdata;
    }


}
