/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.util;

public class queryReportes {
   
   public String strTipoAdmon = "SELECT CTO_TIPO_ADMON as contrato FROM CONTRATO WHERE CTO_NUM_CONTRATO=?";
   
   // Query BALANCE GENERAL
   public  String strQueryBalance =    " SELECT "
									   + " contrato.CTO_NUM_CONTRATO as numContrato, "
									   + " contrato.CTO_NOM_CONTRATO as nomContrato, "
									   + " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||saldosh.SAL_MES_MOVTO||'/'||saldosh.SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(saldosh.SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '||saldosh.SAL_ANO_MOVTO  as periodo, "
									   + " saldosh.SAL_NUM_CTAM as ctam, "
									   + " saldosh.SAL_NUM_SCTA as scta, "
									   + " saldosh.SAL_NUM_SSCTA as sscta, "
									   + " saldosh.SAL_NUM_SSSCTA as ssscta, "
									   + " saldosh.SAL_NUM_SSSSCTA as sssscta, "
									   + " saldosh.SAL_NUM_SSSSSCTA as ssssscta, "
									   + " saldosh.SAL_NUM_AUX1 as aux1, "
									   + " saldosh.SAL_NUM_AUX2 as aux2, "
									   + " saldosh.SAL_NUM_AUX3 as aux3, "
									   + " saldosh.SAL_IMP_SALDO_ACT as saldoAct"
									   + " FROM "
									   + " CONTRATO contrato, SALDOSH saldosh "
									   + " WHERE "
									   + " contrato.CTO_NUM_CONTRATO= ? "
									   + " AND "
									   + " contrato.CTO_TIPO_ADMON='NO'"
									   + " AND "
									   + " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'"
									   + " AND "
									   + " saldosh.SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO "
									   + " AND "
									   + " saldosh.SAL_MES_MOVTO=? "
									   + " AND "
									   + " saldosh.SAL_ANO_MOVTO=? ";
									   
 // Query ESTADO DE RESULTADOS
   public  String strQueryEdoRes= " SELECT "
									   + " contrato.CTO_NUM_CONTRATO as numContrato, "
									   + " contrato.CTO_NOM_CONTRATO as nomContrato, "
									   + " TO_CHAR(contrato.CTO_DIA_APERTURA,'00')||' DE '|| DECODE(contrato.CTO_MES_APERTURA,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE') as fechaAper, "
									   + " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||saldosh.SAL_MES_MOVTO||'/'||saldosh.SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(saldosh.SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '||saldosh.SAL_ANO_MOVTO as fechaAl, "
									   + " saldosh.SAL_NUM_CTAM as ctam, "
									   + " saldosh.SAL_NUM_SCTA as scta, "
									   + " saldosh.SAL_NUM_SSCTA as sscta, "
									   + " saldosh.SAL_NUM_SSSCTA as ssscta, "
									   + " saldosh.SAL_NUM_SSSSCTA as sssscta, "
									   + " saldosh.SAL_NUM_SSSSSCTA as ssssscta, "
									   + " saldosh.SAL_NUM_AUX1 as aux1, "
									   + " saldosh.SAL_NUM_AUX2 as aux2, "
									   + " saldosh.SAL_NUM_AUX3 as aux3, "
									   + " saldosh.SAL_IMP_SALDO_ACT as saldoAct"
									   + " FROM "
									   + " CONTRATO contrato, SALDOSH saldosh "
									   + " WHERE "
									   + " contrato.CTO_NUM_CONTRATO= ? "
									   + " AND "
									   + " contrato.CTO_TIPO_ADMON='NO'"
									   + " AND "
									   + " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'"
									   + " AND "
									   + " saldosh.SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO "
									   + " AND "
									   + " saldosh.SAL_MES_MOVTO=? "
									   + " AND "
									   + " saldosh.SAL_ANO_MOVTO=? ";

public String strDatosEdoFin = "SELECT REP_NUM_SUBCONT,"
                      +" REP_NUM_ORDEN,REP_NUM_GRUPO,REP_NUM_CONCEPTO,REP_NOM_CONCEPTO,"
                      +" REP_IMP_SALDO_ACT,REP_NUM_COL,GPO_SUBREPORTE,GPO_TIPO_GRUPO FROM REP_EDOS_FINANC,REP_CAT_GRUPOS WHERE REP_NUM_CONTRATO=?  AND GPO_SUBREPORTE =? "
                      +" AND REP_NUM_REPORTE=GPO_NUM_REPORTE AND REP_NUM_GRUPO=GPO_NUM_GRUPO"
                      +" ORDER BY GPO_SUBREPORTE,REP_NUM_ORDEN ASC";
                      

public String strDatosEdoFinEdoRes = "SELECT REP_NUM_SUBCONT,"
                      +" REP_NUM_ORDEN,REP_NUM_GRUPO,REP_NUM_CONCEPTO,REP_NOM_CONCEPTO,"
                      +" REP_IMP_SALDO_ACT,REP_NUM_COL,GPO_SUBREPORTE,GPO_TIPO_GRUPO FROM REP_EDOS_FINANC,REP_CAT_GRUPOS WHERE REP_NUM_CONTRATO=? AND REP_NUM_REPORTE=? "
                      +" AND REP_NUM_REPORTE=GPO_NUM_REPORTE AND REP_NUM_GRUPO=GPO_NUM_GRUPO"
                      +" ORDER BY GPO_SUBREPORTE,REP_NUM_ORDEN ASC";

public String strNumColEdoFin = "SELECT DISTINCT GPO_NUM_COL_IMPRIME AS NCOLUMNA FROM REP_CAT_GRUPOS WHERE"
                      + " GPO_NUM_REPORTE=? AND GPO_SUBREPORTE =? ";
									   
									   
 public String strQueryAvisos	=  " select A.PARAM_VALOR2 as aviso from param_global A "
		 						+  " WHERE "
		 						+  " A.PARAM_DESCRIPCION='AVISO' "
		 						+  " ORDER BY  A.PARAM_CLAVE ";									   

}

