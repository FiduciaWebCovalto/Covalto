/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.util;
 
public class queryConsultas {

//DETALLE DE CAPTURA PARA LOS QUE NO SON DE FIRMAS MANCOMUNADAS 
										
public String queryCaptura   = " SELECT FUSU_NOMBRE_USUARIO nomUsuario"
							 + " FROM F_USUARIO U,F_BITACORA B"
							 + " WHERE "
							 + " B.FBIT_SECUENCIAL_FOLIO=?"
							 + " AND U.FUSU_ID_USUARIO=B.FUSU_ID_USUARIO"
	 				         + " ORDER BY TO_DATE(TO_CHAR(B.FBIT_FECHA,'dd/mm/yyyy hh24:mi'),'dd/mm/yyyy hh24:mi') ASC";


//Detalle de Firmas Mancomunadas 
public String queryfirmas    = " select "
							+ " FIR_FOLIO as folio,"
							+ " FIR_NUM_CONTRATO as fideicomiso,"
							+ " DECODE(FIR_USUARIO_CAPTURA,0,'CAPTURA',(select PER_NOM_USUARIO from personal where PER_NUM_USUARIO=FIR_USUARIO_CAPTURA)) as captura,"
							+ " to_char(FIR_FECHA_CAPTURA,'dd/mm/yyyy') as fechaCaptura,"
							+ " DECODE(FIR_USUARIO_FIRMA1,0,'ESPERA1',(select PER_NOM_USUARIO from personal where PER_NUM_USUARIO=FIR_USUARIO_FIRMA1)) as firma1,"
							+ " to_char(FIR_FECHA_FIRMA1,'dd/mm/yyyy') as fechaFirma1,"
							+ " DECODE(FIR_USUARIO_FIRMA2,0,'ESPERA2',(select PER_NOM_USUARIO from personal where PER_NUM_USUARIO=FIR_USUARIO_FIRMA2)) as firma2,"
							+ " to_char(FIR_FECHA_FIRMA2,'dd/mm/yyyy') as fechaFirma2," 
							+ " FIR_ST_FIRMA1 as stFirma1, "
							+ " FIR_ST_FIRMA2 as stFirma2 "
							+ " from "
							+ " FIRMAS "
							+ " where "
							+ " FIR_FOLIO=? "
							+ " and "
							+ " FIR_NUM_CONTRATO=? ";

   
//Instrucciones Pendientes de Fisos Normales   
public String strQueryInstruccEspera 	= " SELECT "
										+ " INS_NUM_FOLIO_INST AS FOLIO, "
										+ " TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA,"
										+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET','DEPOSITO','LIQUIDACION INTERNET','RETIRO',"
										+ " 'TRASPASO INTERNET','TRASPASO') AS INSTRUCCION,"
										+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2,"
										+ " 'TRASPASO INTERNET',3) AS TIPO,"
                    + " D.FDPO_IMPORTE_DEPOSITO AS IMPORTEDPO,"
                    + " R.FRET_IMP_RETIRO AS IMPORTEDEL,"
                    + " NVL(D.FDEP_MONEDA,1) AS MONDEPOSITO,"
                    + " NVL(R.FRET_MONEDA,1) AS MONRETIRO,"
                    + " INS_CVE_ST_INSTRUC AS STATUS"                
                    + " FROM"
                    + " INSTRUCC,F_DEPOSITO D,F_RETIRO R"
                    + " WHERE"
                    + " INS_NUM_CONTRATO = ? "
                    + " AND REPLACE(TO_CHAR(INS_DIA_ALTA_REG,'00')||'/'||TO_CHAR(INS_MES_ALTA_REG,'00')||'/'||TO_CHAR(INS_ANO_ALTA_REG,'0000'),' ','')= ?"
                    + " AND INS_CVE_ST_INSTRUC IN ('ESPERA') "
                    + " AND "
                    + " INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET') "
                    + " AND "
                    + " R.FRET_ID_RETIRO(+)=INS_NUM_FOLIO_INST "
                    + " AND "
                    + " D.FDPO_ID_DEPOSITO(+)=INS_NUM_FOLIO_INST "                    
										+ " ORDER BY 4,FOLIO ASC ";
										

//Instrucciones de Fisos Normales   
public String strQueryInstrucc 	= " SELECT "
								+ " INS_NUM_FOLIO_INST AS FOLIO, "
								+ " TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA,"
								+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET','DEPOSITO','LIQUIDACION INTERNET','RETIRO',"
								+ " 'TRASPASO INTERNET','TRASPASO','INSTRUCCION NO MONETARIA') AS INSTRUCCION,"
								+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2,"
								+ " 'TRASPASO INTERNET',3,4) AS TIPO,"
								+ " NVL(D.FDPO_IMPORTE_DEPOSITO,0) AS IMPORTEDPO,"
								+ " NVL(R.FRET_IMP_RETIRO,0) AS IMPORTEDEL,"
                + " NVL(D.FDEP_MONEDA,1) AS MONDEPOSITO,"
                + " NVL(R.FRET_MONEDA,1) AS MONRETIRO,"
                + " NVL(INS_CVE_ST_INSTRUC,'ACTIVO') AS STATUS"                
								+ " FROM"
								+ " INSTRUCC I,F_DEPOSITO D,F_RETIRO R,F_BITACORA_SOL B"
								+ " WHERE"
								+ " I.INS_NUM_CONTRATO = ? "
								+ " AND "
								+ " INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET','INSTRUCCION NO MONETARIA') "
								+ " AND "
								+ " R.FRET_ID_RETIRO(+)=INS_NUM_FOLIO_INST "
								+ " AND "
								+ " D.FDPO_ID_DEPOSITO(+)=INS_NUM_FOLIO_INST "
                                                                + " AND "
                                                                + " B.INS_MUM_FOLIO_INST(+)=INS_NUM_FOLIO_INST "                                  
								+ " AND "
								+ " TO_DATE(REPLACE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,' ',''),'dd/mm/yyyy') "
								+ " BETWEEN "
								+ " TO_DATE(?,'dd/mm/yyyy') "
								+ " AND "
								+ " TO_DATE(?,'dd/mm/yyyy') ";


public String strQueryInstruccPKAacuerdo = " AND "
										 + " ses_fecha=TO_DATE('?','dd/mm/yyyy') "
										 + " AND"
									     + " ses_tipo=? " 
									     + " AND"
									     + " acu_id=?" ;

								
public String strQueryInstruccOrderBy = " ORDER BY 4,FOLIO ASC ";
										

//DETALLE DEPOSITO
public String queryDetalleDeposito   = " SELECT "
									 + " TO_CHAR(FDEP_FECHA,'DD/MM/YYYY') as fecha, "
									 + " 'SI' as rutinaria,"
									 + " c2.cve_desc_clave as concepto,"
									 + " FDPO_ID_DEPOSITO as folio,"
									 + " FCIN_ID_CTO_INVERSION as contrato,"
									 + " FDPO_IMPORTE_DEPOSITO as importe,"
									 + " FDPO_CBA_INSTITUCION As numCuenta, "
									 + " c1.cve_desc_clave as nomcuenta, "
									 + " MON_NOM_MONEDA as moneda, "
                   					 + " 'PERSONA' as persona "
									 + " FROM F_DEPOSITO,claves c1,CLAVES C2,MONEDAS"
									 + " where "
									 + " FDPO_ID_DEPOSITO= ? "
									 + " AND "
									 + " FFID_ID_FIDEICOMISO= ? "
									 + " AND "
									 + " C2.CVE_NUM_SEC_CLAVE= FDPO_CONCEPTO_DEP "
									 + " AND "
									 + " c1.CVE_LIMSUP_CLAVE= FDPO_CBA_INSTITUCION "
									 + " AND "
									 + " FDEP_MONEDA= MON_NUM_PAIS "                   
									 + " AND "
									 + " c1.cve_num_clave = 303 "
									 + " AND "
									 + " c2.cve_num_clave = 75";
                  

public String queryDetalleRetiro 	= " SELECT "
 									+ " TO_CHAR(R.FRET_FECHA,'DD/MM/YYYY') as fecha, "
									+ " CXR.FCIN_ID_CTO_INVERSION as contrato,"
									+ " R.FRET_IMP_RETIRO as importe,"
									+ " 'SI' as rutinaria,"
									+ " C2.CVE_DESC_CLAVE AS concepto,"
									+ " C1.CVE_DESC_CLAVE as formaLiq,"
									+ " R.FRET_TIPO_LIQUIDACION AS claveLiquid,"
									+ " 'BANCO' AS banco,"
									+ " FCBA_CLABE_CBA AS numCta,"
									+ " R.FRET_NOM_BENEFICIARIO AS numCtaBanxico,"
									+ " R.FRET_NOM_BENEFICIARIO AS beneficiario,"//titular
									+ " 'PLAZA' AS plaza,"
									+ " 'RFC' AS rfcTEF, "
									+ " NVL(TO_CHAR(R.SES_FECHA,'DD/MM/YYYY'),'')  As fechaSesion,"
									+ " DECODE(R.SES_TIPO,'O','ORDINARIA','E','EXTRAORDINARIA',R.SES_TIPO) As tipoSesion,"
									+ " R.ACU_ID As noAcuerdo," 
                  + " R.FRET_REFERENCIA_CIE AS REFERENCIA,"
                  + " R.FRET_CONVENIO_CIE AS CONVENIO"
									+ " FROM "
									+ " instrucc I,F_RETIRO R,CLAVES C1,CLAVES C2,F_CTOINV_RET CXR"
									+ " WHERE "
									+ " R.FRET_ID_RETIRO= ? " 
									+ " AND "
									+ " R.FFID_ID_FIDEICOMISO= ? "
									+ " AND "
									+ "	I.ins_num_folio_inst=R.FRET_ID_RETIRO "
									+ " AND "
								 	+ " I.ins_num_contrato=R.FFID_ID_FIDEICOMISO "
									+ " AND "
								 	+ " R.FRET_ID_RETIRO=CXR.FRET_ID_RETIRO "                  
									+ " AND "//FORMAS DE LIQUIDACION
								 	+ " C1.CVE_NUM_CLAVE=81 AND C1.CVE_NUM_SEC_CLAVE=R.FRET_TIPO_LIQUIDACION"
									+ " AND "//CONCEPTOS DE RETIRO
								 	+ " C2.CVE_NUM_CLAVE=128 AND C2.CVE_NUM_SEC_CLAVE=R.FRET_CONCEPTO";
																	
public String queryDetalleRetiroSWIFT 	= " SELECT "
                  + " FRET_PAIS_DOMICILIARIO_SWIFT AS PAISDOM,"
                  + " FRET_CIUDAD_DOMICILIARIO_SWIFT AS CIUDADDOM,"
                  + " FRET_PLAZA_DOMICILIARIO_SWIFT AS PLAZADOM,"
                  + " FRET_SUCURSAL_DOMICILIA_SWIFT AS SUCURDOM,"
                  + " FRET_BANCO_DOMICILIARIO_SWIFT AS BANCODOM,"
                  + " FRET_CUENTA_DOMICILIARIO_SWIFT AS CTADOM,"
                  + " FRET_BRANCH_DOMICILIARIO_SWIFT AS BRANCHDOM,"
                  + " MON_NOM_MONEDA AS MONEDADOM,"
                  + " FRET_IMPORTE_ME_SWIFT AS IMPORTESWIFT,"
                  + " FRET_CODIGO_SAI_SWIFT AS CODSAI,"
                  + " FRET_TIPO_ABA_IBAN_SWIFT AS TIPOABAIBAN,"
                  + " FRET_NOM_BENEFICI_SWIFT AS NOMBENE,"
                  + " FRET_PAIS_BENEFICI_SWIFT AS PAISBENE,"
                  + " FRET_CIUDAD_BENEFICI_SWIFT AS CIUDADBENE,"
                  + " FRET_DIMICILIO_BENEFICI_SWIFT AS DOMBENE,"
                  + " FRET_TELEFONO_BENEFICI_SWIFT AS TELBENE "
                  + " FROM "
									+ " F_RETIRO,MONEDAS "
									+ " WHERE "
									+ " FRET_ID_RETIRO= ? " 
									+ " AND "
									+ " FFID_ID_FIDEICOMISO= ? "
                  + " AND MON_NUM_PAIS=FRET_MONEDA_DOMICILIARIO_SWIFT";

//DETALLE TRASPASO
public String queryDetalleTraspaso   = " SELECT "
									 + " LTRIM(TO_CHAR(dpo_dia_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(dpo_mes_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(dpo_ano_alta_reg,'0000')) as fecha, "
									 + " del_contrato_inter as ctoOrigen,"
									 + " dpo_contrato_inter as ctoDestino,"
									 + " dpo_imp_deposito as importe,"
									 + " dpo_cve_tipo_cta as instrumento "
									 + " FROM deposit,detliqui "
									 + " where "
									 + " dpo_folio_opera= ? "
									 + " AND "
									 + " dpo_num_contrato= ? "
									 + " AND "
									 + " del_folio_opera= dpo_folio_opera "
									 + " AND "
									 + " del_num_contrato= dpo_num_contrato ";
									 
									 
//CONSULTA DE SALDOS POR CONTRATOS DE INVERSION	
public String querySaldosPorContrato =  " SELECT DISTINCT cpr_contrato_inter as num_contrato,"
                              + " ((SELECT NVL(SUM(pos_costo_historic), 0)"
                              + "    FROM posicion,instrume "
                              + "   WHERE ins_cve_tipo_merca = pos_cve_tipo_merca and pos_num_contrato = cpr_num_contrato AND "
                              + "   ins_num_instrume=pos_num_instrume and POS_num_ENTID_FIN IN (1, 7) and pos_costo_historic<> 0 and "
                              + "         pos_contrato_inter = cpr_contrato_inter) + "
                              + " (SELECT NVL(SUM(cre_imp_reporto), 0)"
                              + "    FROM conrepor,instrume WHERE cre_num_contrato = cpr_num_contrato"
                              + "   AND cre_cve_tipo_merca = ins_cve_tipo_merca "
                               + " and cpr_contrato_inter = cre_contrato_inter"
                               + " AND CPR_ENTIDAD_FIN=CRE_ENTIDAD_FIN"
                               + " AND CPR_SUB_CONTRATO=CRE_SUB_CONTRATO                     "
                               + " AND CRE_ENTIDAD_FIN IN (1, 7)"
                               + " AND CPR_ENTIDAD_FIN IN (1,7)"
                               + " and cre_num_instrume = ins_num_instrume"
                               + " AND CPR_NUM_PAIS=CRE_NUM_MONEDA"
                               + " AND cpr_num_pais = mon_num_pais"
                               + " AND cre_cve_st_conrepo = 'ACTIVO'  and cre_imp_reporto<>0 ) -"
                              //SE DESCUENTA SALDO DE RETIROS DEL DIA
                              + " (SELECT NVL(SUM(RC.FCVR_IMPORTE_X_CTOINV),0) FROM F_RETIRO R,F_CTOINV_RET RC WHERE R.FFID_ID_FIDEICOMISO="
                              + " cpr_num_contrato AND RC.FCIN_ID_CTO_INVERSION=cpr_contrato_inter AND "
                              + " R.FRET_ID_RETIRO=RC.FRET_ID_RETIRO AND "
                              + " R.FRET_STATUS_RET='ACTIVO' AND "
                              + " R.FRET_FECHA=(SELECT TO_DATE(REPLACE(TO_CHAR(FCO_DIA_APLI_CONTA,'00')||'/'||"
                              + " TO_CHAR(FCO_MES_APLI_CONTA,'00')||'/'||"
                              + " TO_CHAR(FCO_ANO_APLI_CONTA,'0000'),' ' ,''),'DD/MM/YYYY')"
                              + " FROM FECCONT)) +" //TERMINA DESCUENTO POR RETIROS DEL DIA
                              //SE ACUMULAN LOS DEPOSITOS DEL DIA
                              + " (SELECT NVL(SUM(D.FDPO_IMPORTE_DEPOSITO),0) FROM F_DEPOSITO D WHERE D.FFID_ID_FIDEICOMISO="
                              + " cpr_num_contrato AND D.FCIN_ID_CTO_INVERSION=cpr_contrato_inter AND"
                              + " D.FDEP_STATUS='ACTIVO' AND "
                              + " D.FDEP_FECHA=(SELECT TO_DATE(REPLACE(TO_CHAR(FCO_DIA_APLI_CONTA,'00')||'/'||"
                              + " TO_CHAR(FCO_MES_APLI_CONTA,'00')||'/'||"
                              + " TO_CHAR(FCO_ANO_APLI_CONTA,'0000'),' ' ,''),'DD/MM/YYYY')"
                              + " FROM FECCONT))"//TERMINA ACUMULACION POR DEPOSITOS DEL DIA
                              + ") as saldo,"
                              + " cpr_num_pais as clave_moneda,"
                              + " DECODE(cpr_num_pais,1,'MN',54,'USD') as sigla_moneda,cpr_nom_contacto2 as nombrecont,mon_nom_moneda as moneda,cpr_entidad_fin as entidad "
                                + " FROM continte, monedas "
                      + " WHERE cpr_num_contrato = ? AND cpr_contrato_inter <> 1000 AND "
                      + " cpr_cve_st_contint = 'ACTIVO' AND mon_num_pais = cpr_num_pais"
                      + " ORDER BY NVL(cpr_num_pais, 0), cpr_contrato_inter ASC ";
									 

//CONSULTA DE CUENTAS PENDIENTES
 public String queryCuentasPendientes =  " SELECT C.FCBA_CLABE_CBA AS CLABE,B.FBIT_SECUENCIAL_FOLIO AS FOLIO," 
                                        + "C.FCBA_BANCO AS BANCO,C.FCBA_NUMERO_CTA_BAN AS CUENTA,C.FCBA_PLAZA_CBA AS PLAZA,'SUCURSAL' AS SUCURSAL," 
                                        + "C.FCBA_TITULAR AS TITULAR,C.FCBA_RFC AS RFC,TO_CHAR(B.FBIT_FECHA, 'DD/MM/YYYY') AS FECHA"
                                        + " FROM F_FIDEICO_CUEBAN FC, F_CUEBAN C, F_BITACORA B WHERE "
                                        + " FC.FFID_ID_FIDEICOMISO = ? "                                        
                                        + " AND C.FCBA_CLABE_CBA=FC.FCBA_CLABE_CBA"                                        
                                        +"  AND C.FCBA_STATUS = 'CAPTURADA' "
                                        + "AND C.FCBA_CLABE_CBA=B.FBIT_DESCRIPCION "
                                        +"ORDER BY C.FCBA_NUMERO_CTA_BAN, B.FBIT_SECUENCIAL_FOLIO ASC";

                      
public String queryCuentasPendientesporClave =  " SELECT C.FCBA_CLABE_CBA AS CLABE,B.FBIT_SECUENCIAL_FOLIO AS FOLIO," 
                                        + "C.FCBA_BANCO AS BANCO,C.FCBA_NUMERO_CTA_BAN AS CUENTA,C.FCBA_PLAZA_CBA AS PLAZA,'SUCURSAL' AS SUCURSAL," 
                                        + "C.FCBA_TITULAR AS TITULAR,C.FCBA_RFC AS RFC,TO_CHAR(B.FBIT_FECHA, 'DD/MM/YYYY') AS FECHA"
                                        + " FROM F_FIDEICO_CUEBAN FC, F_CUEBAN C, F_BITACORA B WHERE "
                                        + " C.FCBA_NUMERO_CTA_BAN=? AND"                                        
                                        + " FC.FFID_ID_FIDEICOMISO = ? "                                                                                
                                        + " AND C.FCBA_CLABE_CBA=FC.FCBA_CLABE_CBA"                                        
                                        +"  AND C.FCBA_STATUS = 'CAPTURADA' "
                                        + "AND C.FCBA_CLABE_CBA=B.FBIT_DESCRIPCION "
                                        +"ORDER BY C.FCBA_NUMERO_CTA_BAN, B.FBIT_SECUENCIAL_FOLIO ASC";

public String queryDetalleCuenta =  " SELECT DISTINCT C.FCBA_NUMERO_CTA_BAN as clave," 
		                                       + "C.FCBA_BANCO,"
		                                       + "C.FCBA_CLABE_CBA,"
		                                       + "C.FCBA_PLAZA_CBA,"
		                                       + "'SUCURSAL'," 
		                                       + "C.FCBA_TITULAR,"
		                                       + "C.FCBA_RFC"
		                                       + " FROM F_CUEBAN C,F_FIDEICO_CUEBAN FC WHERE "
                                           + " C.FCBA_CLABE_CBA=FC.FCBA_CLABE_CBA AND" 
		                                       + " FC.FFID_ID_FIDEICOMISO=? "
		                                       + " ORDER BY FCBA_CLABE_CBA,FCBA_NUMERO_CTA_BAN ASC";
		                                       
public String queryDetalleCuentaClabe =  " SELECT DISTINCT C.FCBA_NUMERO_CTA_BAN as clave," 
		                                       + "CV.CVE_DESC_CLAVE AS BANCO,"
		                                       + "C.FCBA_CLABE_CBA AS CLABE,"
		                                       + "PB.FPLB_NOMBRE_PLAZA AS PLAZA,"
		                                       + "'SUCURSAL' AS SUCURSAL," 
		                                       + "C.FCBA_TITULAR AS TITULAR,"
		                                       + "C.FCBA_RFC AS RFC"
		                                       + " FROM F_CUEBAN C,F_FIDEICO_CUEBAN FC,CLAVES CV,F_PLAZAS_BANCO PB WHERE "
                                           + " C.FCBA_CLABE_CBA=FC.FCBA_CLABE_CBA AND " 
                                           + " CVE_NUM_CLAVE=27 AND "
                                           + " CVE_NUM_SEC_CLAVE=C.FCBA_BANCO AND "
                                           + " PB.FPLB_ID_BANCO=C.FCBA_BANCO AND"
                                           + " PB.FPLB_ID_PLAZA=TO_NUMBER(SUBSTR(C.FCBA_CLABE_CBA,4,3)) AND"
		                                       + " FC.FFID_ID_FIDEICOMISO=? AND "
                                           + " FC.FCBA_CLABE_CBA=?"
		                                       + " ORDER BY C.FCBA_CLABE_CBA,C.FCBA_NUMERO_CTA_BAN ASC";                                           

public String queryDetalleCuentaClabe2 =  " SELECT DISTINCT C.FCBA_NUMERO_CTA_BAN as clave," 
		                                       + "CV.CVE_DESC_CLAVE AS BANCO,"
		                                       + "C.FCBA_CLABE_CBA AS CLABE,"
		                                       + "C.FCBA_PLAZA_CBA AS PLAZA,"
		                                       + "'SUCURSAL' AS SUCURSAL," 
		                                       + "C.FCBA_TITULAR AS TITULAR,"
		                                       + "C.FCBA_RFC AS RFC"
		                                       + " FROM F_CUEBAN C,CLAVES CV WHERE "
                                           + " CVE_NUM_CLAVE=27 AND "
                                           + " CVE_NUM_SEC_CLAVE=C.FCBA_BANCO AND "
                                           + " C.FCBA_CLABE_CBA=?"
		                                       + " ORDER BY C.FCBA_CLABE_CBA,C.FCBA_NUMERO_CTA_BAN ASC";                                           

                                           
public String queryDescripcionBanco = " SELECT CVE_DESC_CLAVE "
                                        + " FROM CLAVES "
                                        + " WHERE CVE_NUM_CLAVE = 27 "
                                        + " AND CVE_NUM_SEC_CLAVE NOT IN( 169, 170 ) "
                                        + " AND CVE_NUM_SEC_CLAVE=?";
                                        
public String querynumusuario = " SELECT USU_NUM_USUARIO "
                                        + " FROM USUARIOS "
                                        + " WHERE TIPO_USUARIO='INTERNET' "
                                        + " AND USU_NUM_USUARIO=? ";

public String queryCapturaCuentas   = " SELECT U.FUSU_NOMBRE_USUARIO nomUsuario"
							 + " FROM F_BITACORA B,F_USUARIO U,F_CUEBAN C"
							 + " WHERE "
							 + " U.FUSU_ID_USUARIO=B.FUSU_ID_USUARIO" 
               + " AND B.FBIT_DESCRIPCION=C.FCBA_CLABE_CBA"
               + " AND C.FCBA_NUMERO_CTA_BAN=?";

public String queryDetalleTerceros = " SELECT DISTINCT TER_NUM_TERCERO,TER_NOM_TERCERO,"
        +" TER_RFC,TER_NUM_EXT_FAX,TO_CHAR(FBIT_FECHA,'DD/MM/YYYY') AS FECHA,U.FUSU_NOMBRE_USUARIO USUARIO FROM "
        +" TERCEROS,F_BITACORA B,F_USUARIO U WHERE TER_NUM_CONTRATO=? AND TER_CVE_ST_TERCERO='CAPTURADA' AND"
        + " B.FUSU_ID_USUARIO=U.FUSU_ID_USUARIO AND "
        + " TO_CHAR(FBIT_SECUENCIAL_FOLIO)=TER_NUM_EXT_FAX AND FBIT_DESCRIPCION LIKE 'ALTA DE TERCERO CON NOMBRE %'";        

public String querynomMoneda = "SELECT mon_nom_moneda as moneda FROM monedas WHERE mon_num_pais=?";

public String queryCveMoneda = "SELECT mon_num_pais as moneda FROM monedas WHERE mon_nom_moneda=?";

public String queryConvenioTerceros = "SELECT CBA_NUM_CUENTA AS CUENTA FROM CUENTAS WHERE CBA_NUM_CONTRATO=?"
                                      + " AND CBA_CVE_PERSON_FID='TERCERO' AND CBA_NUM_PERSON_FID=?"
                                      + " AND CBA_CVE_TIPO_CTA='CONVENIO CIE'";
                                      
public String strQueryInstruccFichaUnicaFolio 	= " SELECT C.CTO_NOM_CONTRATO AS NOMFIDEICOMISO,C.CTO_NUM_CONTRATO AS NUMFIDEICOMISO,"
								+ " INS_NUM_FOLIO_INST AS FOLIO, "
								+ " TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA,"
								+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET','DEPOSITO','LIQUIDACION INTERNET','RETIRO',"
								+ " 'TRASPASO INTERNET','TRASPASO') AS INSTRUCCION,"
								+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2,"
								+ " 'TRASPASO INTERNET',3) AS TIPO,"
								+ " NVL(D.FDPO_IMPORTE_DEPOSITO,0) AS IMPORTEDPO,"
								+ " NVL(R.FRET_IMP_RETIRO,0) AS IMPORTEDEL,"
                + " NVL(T.FTSP_IMPORTE_TRASPASO,0) AS IMPORTET,"
                + " NVL(D.FDEP_MONEDA,1) AS MONDEPOSITO,"
                + " NVL(R.FRET_MONEDA,1) AS MONRETIRO,"
                + " DECODE(INS_CVE_ST_INSTRUC,'ACTIVO','PEND. POR AUTORIZAR',INS_CVE_ST_INSTRUC) AS STATUS,"
                + " NVL(T.FCIN_ID_CTO_INVERSION_ORIGEN,0) AS ORIGEN,"
                + " NVL(T.FCIN_ID_CTO_INVERSION_DESTINO,0) AS DESTINO"
								+ " FROM"
								+ " INSTRUCC,F_DEPOSITO D,F_RETIRO R,CONTRATO C,F_TRASPASO T"
								+ " WHERE"
								+ " INS_NUM_FOLIO_INST = ? "
                + " AND INS_NUM_CONTRATO=CTO_NUM_CONTRATO"                
								+ " AND "
								+ " INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET') "
								+ " AND "
								+ " R.FRET_ID_RETIRO(+)=INS_NUM_FOLIO_INST "
								+ " AND "
								+ " T.FTSP_ID_TRASPASO(+)=INS_NUM_FOLIO_INST "
								+ " AND "
								+ " D.FDPO_ID_DEPOSITO(+)=INS_NUM_FOLIO_INST ";

public String strQueryInstruccFichaUnicaFecha 	= " SELECT "
								+ " INS_NUM_FOLIO_INST AS FOLIO, "
								+ " TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA,"
								+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET','DEPOSITO','LIQUIDACION INTERNET','RETIRO',"
								+ " 'TRASPASO INTERNET','TRASPASO') AS INSTRUCCION,"
								+ " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2,"
								+ " 'TRASPASO INTERNET',3) AS TIPO,"
								+ " D.FDPO_IMPORTE_DEPOSITO AS IMPORTEDPO,"
								+ " R.FRET_IMP_RETIRO AS IMPORTEDEL,"
                + " NVL(D.FDEP_MONEDA,1) AS MONDEPOSITO,"
                + " NVL(R.FRET_MONEDA,1) AS MONRETIRO,"
                + " INS_CVE_ST_INSTRUC AS STATUS"                
								+ " FROM"
								+ " INSTRUCC,F_DEPOSITO D,F_RETIRO R"
								+ " WHERE"
								+ " INS_NUM_FOLIO_INST = ? "
								+ " AND "
								+ " INS_CVE_ST_INSTRUC IN ('ACTIVO','ACEPTADA','APLICADA') "
								+ " AND "
								+ " INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET') "
								+ " AND "
								+ " R.FRET_ID_RETIRO(+)=INS_NUM_FOLIO_INST "
								+ " AND "
								+ " D.FDPO_ID_DEPOSITO(+)=INS_NUM_FOLIO_INST "
								+ " AND "
								+ " TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy') "
								+ " = TO_DATE(?,'dd/mm/yyyy') ";

public String queryDetalleRetiroFichaUnica 	= " SELECT TO_CHAR(R.FFID_ID_FIDEICOMISO) AS FIDEICOMISO,"
 									+ " TO_CHAR(R.FRET_FECHA,'DD/MM/YYYY') as fecha, "
									+ " CXR.FCIN_ID_CTO_INVERSION as contrato,"
									+ " R.FRET_IMP_RETIRO as importe,"
									+ " 'SI' as rutinaria,"
									+ " C2.CVE_DESC_CLAVE||' '||r.FRET_DESCRIPCION AS concepto,"
									+ " C1.CVE_DESC_CLAVE as formaLiq,"
									+ " R.FRET_TIPO_LIQUIDACION AS claveLiquid,"
									+ " ' ' AS banco,"
									+ " FCBA_CLABE_CBA AS numCta,"
									+ " R.FRET_NOM_BENEFICIARIO AS numCtaBanxico,"
									+ " R.FRET_NOM_BENEFICIARIO AS beneficiario,"//titular
									+ " ' ' AS plaza,"
									+ " ' ' AS rfcTEF, "
									+ " NVL(TO_CHAR(R.SES_FECHA,'DD/MM/YYYY'),'')  As fechaSesion,"
									+ " DECODE(R.SES_TIPO,'O','ORDINARIA','E','EXTRAORDINARIA',R.SES_TIPO) As tipoSesion,"
									+ " R.ACU_ID As noAcuerdo," 
                  + " R.FRET_REFERENCIA_CIE AS REFERENCIA,"
                  + " R.FRET_CONVENIO_CIE AS CONVENIO"
									+ " FROM "
									+ " instrucc I,F_RETIRO R,CLAVES C1,CLAVES C2,F_CTOINV_RET CXR,contrato"
									+ " WHERE "
									+ " R.FRET_ID_RETIRO= ? " 
									+ " AND "
									+ "	I.ins_num_folio_inst=R.FRET_ID_RETIRO "
									+ " AND "
								 	+ " I.ins_num_contrato=R.FFID_ID_FIDEICOMISO "
									+ " AND "
								 	+ " R.FRET_ID_RETIRO=CXR.FRET_ID_RETIRO "                  
									+ " AND "//FORMAS DE LIQUIDACION
								 	+ " C1.CVE_NUM_CLAVE=81 AND C1.CVE_NUM_SEC_CLAVE=R.FRET_TIPO_LIQUIDACION"
									+ " AND "//CONCEPTOS DE RETIRO
								 	+ " C2.CVE_NUM_CLAVE=128 AND C2.CVE_NUM_SEC_CLAVE=R.FRET_CONCEPTO";
                  
public String queryDetalleDepositoFichaUnica   = " SELECT TO_CHAR(FFID_ID_FIDEICOMISO) AS FIDEICOMISO,"
									 + " TO_CHAR(FDEP_FECHA,'DD/MM/YYYY') as fecha, "
									 + " 'SI' as rutinaria,"
									 + " c2.cve_desc_clave as concepto,"
									 + " FDPO_ID_DEPOSITO as folio,"
									 + " FCIN_ID_CTO_INVERSION as contrato,"
									 + " FDPO_IMPORTE_DEPOSITO as importe,"
									 + " FDPO_CBA_INSTITUCION As numCuenta, "
									 + " c1.cve_desc_clave as nomcuenta, "
									 + " MON_NOM_MONEDA as moneda, "
                   					 + " 'PERSONA' as persona "
									 + " FROM F_DEPOSITO,claves c1,CLAVES C2,MONEDAS"
									 + " where "
									 + " FDPO_ID_DEPOSITO= ? "
									 + " AND "
									 + " C2.CVE_NUM_SEC_CLAVE= FDPO_CONCEPTO_DEP "
									 + " AND "
									 + " c1.CVE_LIMSUP_CLAVE= FDPO_CBA_INSTITUCION "
									 + " AND "
									 + " FDEP_MONEDA= MON_NUM_PAIS "                   
									 + " AND "
									 + " c1.cve_num_clave = 303 "
									 + " AND "
									 + " c2.cve_num_clave = 75";
                  
public String queryDetalleRetiroSWIFTFichaUnica 	= " SELECT "
                  + " FRET_PAIS_DOMICILIARIO_SWIFT AS PAISDOM,"
                  + " FRET_CIUDAD_DOMICILIARIO_SWIFT AS CIUDADDOM,"
                  + " FRET_PLAZA_DOMICILIARIO_SWIFT AS PLAZADOM,"
                  + " FRET_SUCURSAL_DOMICILIA_SWIFT AS SUCURDOM,"
                  + " FRET_BANCO_DOMICILIARIO_SWIFT AS BANCODOM,"
                  + " FRET_CUENTA_DOMICILIARIO_SWIFT AS CTADOM,"
                  + " FRET_BRANCH_DOMICILIARIO_SWIFT AS BRANCHDOM,"
                  + " MON_NOM_MONEDA AS MONEDADOM,"
                  + " FRET_IMPORTE_ME_SWIFT AS IMPORTESWIFT,"
                  + " FRET_CODIGO_SAI_SWIFT AS CODSAI,"
                  + " FRET_TIPO_ABA_IBAN_SWIFT AS TIPOABAIBAN,"
                  + " FRET_NOM_BENEFICI_SWIFT AS NOMBENE,"
                  + " FRET_PAIS_BENEFICI_SWIFT AS PAISBENE,"
                  + " FRET_CIUDAD_BENEFICI_SWIFT AS CIUDADBENE,"
                  + " FRET_DIMICILIO_BENEFICI_SWIFT AS DOMBENE,"
                  + " FRET_TELEFONO_BENEFICI_SWIFT AS TELBENE "
                  + " FROM "
									+ " F_RETIRO,MONEDAS "
									+ " WHERE "
									+ " FRET_ID_RETIRO= ? " 
                  + " AND MON_NUM_PAIS=FRET_MONEDA_DOMICILIARIO_SWIFT";

public String queryUsuariosAutorizaInstrucc = "SELECT A.F_AUI_SECUENCIAL||'-'||U.FUSU_NOMBRE_USUARIO  AS USUARIOS FROM "
                  + " F_USUARIO U,F_AUTORIZA_INSTRUCC A WHERE "
                  + " U.FUSU_ID_USUARIO=F_AUI_ID_USUARIO AND F_AUI_ID_INSTRUCC=?";
                  
public String queryMovMesEdoCta = "SELECT TO_CHAR(FECINI,'DD/MM/YYYY') AS FECHA,TO_CHAR(VENCIM,'DD/MM/YYYY') AS FECVENCIM,DESCRIP AS DESCR,EMISORA,TITULOS,PRECIO,"
+ "IMPORTE,TASA,PLAZO,RENDIMIENTO,ISR,IMPNETO,"
+"SALDO,ISERIE AS SERIE,CONTRATO,TO_CHAR(FECHAP,'DD/MM/YYYY') AS FECHAP,0 AS PROGRESS FROM MOVMES_MN WHERE"
+" TO_CHAR(FECHAP,'MM/YYYY')=TO_CHAR(TO_DATE(?,'MM/YYYY'),'MM/YYYY') AND CONTRATO=? ORDER BY FECINI,VENCIM ASC";

public String queryResumMovEdoCta = "SELECT MESANTERIOR AS MES,TO_CHAR(TOTVENTAS,'999999999999999999999990.00') AS VENTAS,TO_CHAR(TOTCOMPRAS,'999999999999999999999990.00') AS COMPRAS,PREMIO,"
+"ISR,SALDACTUAL AS SALDO,INVIG,INVPROM,TOTDEPOS AS DEPOSITOS,"
+"TOTRETIRO AS RETIROS,SALMESANTG AS SALDOANT,TOTGARINI AS GARINI,TOTGARFIN AS GARFIN,"
+"SALDGAR AS SALDOGAR,CONTRATO,TO_CHAR(FECHAP,'DD/MM/YYYY') AS FECHA,0 AS PROGRESS FROM RESUMEN_MN WHERE"
+" TO_CHAR(FECHAP,'MM/YYYY')=TO_CHAR(TO_DATE(?,'MM/YYYY'),'MM/YYYY') AND CONTRATO=?";

public String queryValorVigEdoCta = "SELECT TO_CHAR(FECINI,'DD/MM/YYYY') AS FECINI,TO_CHAR(VENCIM,'DD/MM/YYYY') AS FECVENCIM,DESCR AS DESCR,EMISORA,SERIE,"
+"PRECIO,IMPORTE,TASA,PLAZO,DXV AS RENDIMIENTO,PREMIO,ISR,IMPNETO,"
+"CONTRATO,TO_CHAR(FECHAP,'DD/MM/YYYY') AS FECHA,TITULOS,0 AS PROGRESS FROM VALORVIG_MN WHERE"
+" TO_CHAR(FECHAP,'MM/YYYY')=TO_CHAR(TO_DATE(?,'MM/YYYY'),'MM/YYYY') AND CONTRATO=? ORDER BY FECINI,VENCIM ASC";

public String queryMovMesEdoCtaMonExt = "SELECT TO_CHAR(TO_DATE(DIA,'DD/MM/YYYY'),'DD/MM/YYYY') AS FECHA,TO_CHAR(FVENCE,'DD/MM/YYYY') AS FECVENCIM,CONCEPTO AS DESCR,TO_CHAR(NVL(DEBE,0),'999,999,999,999,999,999,999,990.00') AS DEBE,TO_CHAR(NVL(HABER,0),'999,999,999,999,999,999,999,990.00') AS HABER,TO_CHAR(NVL(SALDO,0),'999,999,999,999,999,999,999,990.00') AS SALDO,"
+ "PLAZODIAS,TASA,TO_NUMBER(TO_CHAR(INTERES,'999,999,999,999,999,990.00'),'999,999,999,999,999,990.00') AS INTERES,ISR,TIPOCAM AS TIPOCAMB,ISRMXP,"
+"CONTRATO,FECHA,PCUENTA AS CUENTA FROM MOVMES_ME WHERE"
+" TO_CHAR(FECHA,'MM/YYYY')=TO_CHAR(TO_DATE(?,'MM/YYYY'),'MM/YYYY') AND CONTRATO=?    AND CONCEPTO<>'VISTA' ORDER BY TO_CHAR(TO_DATE(DIA,'DD/MM/YYYY'),'DD/MM/YYYY') ASC";

public String queryResumMovEdoCtaMonExt = "SELECT TO_CHAR(NVL(SALINICIAL,0),'999999999999999999999990.00') AS SALDO,TO_CHAR(NVL(RETIRO,0),'999999999999999999999990.00') AS RETIRO,TO_CHAR(NVL(DEPOSITO,0),'999999999999999999999990.00') AS DEPOSITO,INTGENE AS INTERES,"
+"ISRRETUSDLS AS ISRDLS,ISRRETMN AS ISRMON,PROMEDIO,TO_CHAR(NVL(SALDFINAL,0),'999999999999999999999990.00') AS SALDFINAL,CONTRATO FROM RESUMEN_ME WHERE"
+" CONTRATO=? AND TO_CHAR(FECHA,'MM/YYYY')=TO_CHAR(TO_DATE(?,'MM/YYYY'),'MM/YYYY')";

public String queryVerificaMonedaNacional="select count(1) as CONTRATO from movmes_mn where contrato=?";

public String queryVerificaMonedaExtranjera="SELECT COUNT(1) AS CONTRATO FROM CONTRATOFIDUCIA_ME WHERE ICONTRATO=?";

public String queryHorarioBase = "SELECT CAST(to_char(NOW(), 'HH24MI') AS NUMERIC)";

//protego
public String qryGetNomSubCta = "SELECT TO_CHAR(FSCT_ID_SUB_CUENTA)||'-'||FSCT_NOMBRE_SUB_CUENTA AS "+
        "SUBCUENTA FROM F_SUBCUENTA,CONTINTE WHERE "+ 
        "FSCT_ID_FIDEICOMISO=CPR_NUM_CONTRATO AND "+
        "FSCT_ID_SUB_CUENTA=CPR_SUB_CONTRATO AND "+
        "FSCT_STATUS='ACTIVO' "+
        "AND CPR_NUM_CONTRATO = ? "+
        "AND CPR_CONTRATO_INTER = ?";
        
        public String queryTipoOperacionesMDC = "SELECT DISTINCT FTOP_NUM_OPER AS FTOP_NUM_OPER,FTOP_NOMBRE_TIPOPER,FTOP_ATENCION_DIAS,FTOP_BIENES FROM F_TIPOPER WHERE FTOP_TIPO_SOL=2 AND SUBSTR(FTOP_NUM_OPER,1,1)='2' ORDER BY FTOP_NOMBRE_TIPOPER ASC";
        
        
        public String querydetOperacionesMDC = "select INS_MUM_FOLIO_INST,B.INS_NUM_CONTRATO INS_NUM_CONTRATO,TO_CHAR(FBIS_FECHA_INI,'DD/MM/YYYY') FBIS_FECHA_INI "+ 
",NVL(TO_CHAR(FBIS_FECHA_FIN,'DD/MM/YYYY'),'SIN FECHA ATENCION') FBIS_FECHA_FIN,NVL(FBIS_OBSERVACION,'NINGUNA OBSERVACION') FBIS_OBSERVACION, "+ 
"E.FETA_NOMBRE_ETAPA FETA_NOMBRE_ETAPA,I.INS_NUM_OPER INS_NUM_OPER from F_BITACORA_SOL B,F_ETAPA E,INSTRUCC I WHERE I.ins_num_folio_inst=B.INS_MUM_FOLIO_INST AND B.ins_mum_folio_inst=? AND "+ 
"B.FBIS_NUM_ETAPA=E.FETA_ID_ETAPA and "+ 
"(rownum = (select max(rownum)  "+ 
"from F_BITACORA_SOL B,F_ETAPA E,INSTRUCC I WHERE I.ins_num_folio_inst=B.INS_MUM_FOLIO_INST AND B.ins_mum_folio_inst=? AND "+ 
"B.FBIS_NUM_ETAPA=E.FETA_ID_ETAPA) ) "+ 
"order by ins_mum_folio_inst desc";


	    public String queryTipoOperacionesParam = "SELECT CONP_ID_CONCEPTO,CONP_NOMBRE,CONP_BASE,CONP_TABLA,NVL(CONP_COMENTARIO,'') CONP_COMENTARIO, CONP_TIPO_DATO, CONP_PADRE, CONP_OBLIGATORIO FROM F_CONINSNOMON WHERE  CONP_PADRE=0 and  FTOP_NUM_OPER=?";
	    public String queryTipoOperacionesParamHijo = "select CONP_ID_CONCEPTO,CONP_NOMBRE,CONP_BASE,CONP_TABLA,NVL(CONP_COMENTARIO,'') CONP_COMENTARIO, CONP_TIPO_DATO, CONP_PADRE , LEVEL from  HSBC.F_CONINSNOMON WHERE FTOP_NUM_OPER= ?  AND LEVEL =2 START WITH CONP_NOMBRE = ?  connect by prior  CONP_ID_CONCEPTO = CONP_PADRE";
	    
	    public String queryTipoOperacionesBienes = "SELECT FUNI_ID_SUBCUENTA,FUNI_TIPO,FUNI_ID_BIEN,FUNI_ID_EDIFICIO,FUNI_ID_DEPTO FROM F_UNIDADES WHERE FUNI_ID_FIDEICOMISO=?";
	    public String queryTipoOperacionesQuerys = "SELECT EIND_FORMA_EMP FROM F_INDICES WHERE  EIND_ID_INDICE=581 AND EIND_DESCRIPCION=?";
	    
            public String queryTipoPatrimonio = "select DECODE(count(*),1,'NO AL CORRIENTE',0,'AL CORRIENTE') ESTADO from hsbc.F_BIENESGAR where FORS_CVE_STATUS<>'LIBERADO' AND FGRS_ID_FIDEICOMISO=?";
	    public String queryTipoHonorario = "SELECT DECODE(count(*),1,'NO AL CORRIENTE',0,'AL CORRIENTE') ESTADO FROM HSBC.CARTERA WHERE CAR_IMP_HONOR<>0 AND CAR_NUM_CONTRATO=?";
	    public String queryTipoContable = "select decode(sum(SAL_IMP_SALDO_ACT),0,'AL CORRIENTE','NO AL CORRRIENTE') ESTADO  from HSBC.SALDOS where SAL_IMP_SALDO_ACT<>0 and  SAL_NUM_AUX1=?";
	   
            public String queryTipoRDC = "SELECT decode(count(*),1,'NO AL CORRIENTE','AL CORRIENTE')  ESTADO FROM HSBC.FJU_RDCL WHERE FRD_ID_FIDEICOMISO=?";
	    public String queryTipoEmbargo = "SELECT decode(count(*),1,'NO AL CORRIENTE','AL CORRIENTE')  ESTADO  FROM HSBC.FJU_EMBARGOS WHERE FEM_ID_FIDEICOMISO=?";
	    public String queryTipoFiscal = "SELECT decode(count(*),1,'NO AL CORRIENTE','AL CORRIENTE')  ESTADO  FROM HSBC.F_CONTRATO_FISCAL  where FPF_FIDEICOMISO=?";
            
            
	}

