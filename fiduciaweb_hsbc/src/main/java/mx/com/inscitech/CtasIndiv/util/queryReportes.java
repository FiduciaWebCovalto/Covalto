package mx.com.inscitech.CtasIndiv.util;

public class queryReportes {
   
  public String getStrTipoAdmon() {
    return "SELECT CTO_TIPO_ADMON as contrato FROM CONTRATO WHERE CTO_NUM_CONTRATO=?";
  }


  public String getStrQueryBalance(String tabla) {
    String strSQL = " SELECT "
									   + " contrato.CTO_NUM_CONTRATO as numContrato, "
									   + " contrato.CTO_NOM_CONTRATO as nomContrato, ";
                     
                     if(tabla.trim().toUpperCase().equals("SALDOSH"))
                      strSQL += " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||" + tabla + ".SAL_MES_MOVTO||'/'||" + tabla + ".SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(" + tabla + ".SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '||" + tabla + ".SAL_ANO_MOVTO as periodo, ";
                     else if(tabla.trim().toUpperCase().equals("SALDOS"))
                      strSQL += " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as periodo, ";
                     else
                      strSQL += " TO_CHAR(LAST_DAY(TO_DATE((select DECODE(FCO_MES_DIA,1,13,FCO_MES_DIA,FCO_MES_DIA)-1 from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select DECODE(FCO_MES_DIA,1,13,FCO_MES_DIA,FCO_MES_DIA)-1 from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select DECODE(FCO_MES_DIA,1,FCO_ANO_DIA-1,FCO_ANO_DIA) from FECCONT)) as periodo, ";                     
                     
									   strSQL += " " + tabla + ".SAL_NUM_CTAM as ctam, "
									   + " " + tabla + ".SAL_NUM_SCTA as scta, "
									   + " " + tabla + ".SAL_NUM_SSCTA as sscta, "
									   + " " + tabla + ".SAL_NUM_SSSCTA as ssscta, "
									   + " " + tabla + ".SAL_NUM_SSSSCTA as sssscta, "
									   + " " + tabla + ".SAL_NUM_SSSSSCTA as ssssscta, "
									   + " " + tabla + ".SAL_NUM_AUX1 as aux1, "
									   + " " + tabla + ".SAL_NUM_AUX2 as aux2, "
									   + " " + tabla + ".SAL_NUM_AUX3 as aux3, "
									   + " " + tabla + ".SAL_IMP_SALDO_ACT as saldoAct"
									   + " FROM "
									   + " CONTRATO contrato, " + tabla + " " + tabla + " "
									   + " WHERE "
									   + " contrato.CTO_NUM_CONTRATO= ? "
									   + " AND "
									   + " contrato.CTO_TIPO_ADMON='NO'"
									   //+ " AND "
									   //+ " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'"
									   + " AND "
									   + " " + tabla + ".SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO ";
                     
                     if(tabla.trim().toUpperCase().equals("SALDOSH")) {
                      strSQL += " AND "
                       + " " + tabla + ".SAL_MES_MOVTO=? "
                       + " AND "
                       + " " + tabla + ".SAL_ANO_MOVTO=? ";
                     }
    return strSQL;
  }


  public String getStrQueryEdoRes(String tabla) {
    String strSQL = " SELECT "
									   + " contrato.CTO_NUM_CONTRATO as numContrato,  "
									   + " contrato.CTO_NOM_CONTRATO as nomContrato, "
									   + " TO_CHAR(contrato.CTO_DIA_APERTURA,'00')||' DE '|| DECODE(contrato.CTO_MES_APERTURA,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')"
                     + "||' DEL '||TO_CHAR(contrato.CTO_ANO_APERTURA,'0000') as fechaAper, ";
                     
                     if(tabla.trim().toUpperCase().equals("SALDOSH"))
                      strSQL += " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||" + tabla + ".SAL_MES_MOVTO||'/'||" + tabla + ".SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(" + tabla + ".SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE') as fechaAl, ";
                     else if(tabla.trim().toUpperCase().equals("SALDOS"))
                      strSQL += " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";
                     else
                      strSQL += " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA-1 from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";                     
                      
									   strSQL += " " + tabla + ".SAL_NUM_CTAM as ctam, "
									   + " " + tabla + ".SAL_NUM_SCTA as scta, "
									   + " " + tabla + ".SAL_NUM_SSCTA as sscta, "
									   + " " + tabla + ".SAL_NUM_SSSCTA as ssscta, "
									   + " " + tabla + ".SAL_NUM_SSSSCTA as sssscta, "
									   + " " + tabla + ".SAL_NUM_SSSSSCTA as ssssscta, "
									   + " " + tabla + ".SAL_NUM_AUX1 as aux1, "
									   + " " + tabla + ".SAL_NUM_AUX2 as aux2, "
									   + " " + tabla + ".SAL_NUM_AUX3 as aux3, "
									   + " " + tabla + ".SAL_IMP_SALDO_ACT as saldoAct"
									   + " FROM "
									   + " CONTRATO contrato, " + tabla + " " + tabla + " "
									   + " WHERE "
									   + " contrato.CTO_NUM_CONTRATO= ? "
									   + " AND "
									   + " contrato.CTO_TIPO_ADMON='NO'"
									  // + " AND "
									   //+ " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'"
									   + " AND "
									   + " " + tabla + ".SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO ";
                     
                     if(tabla.trim().toUpperCase().equals("SALDOSH")) {
                       strSQL += " AND "
                       + " " + tabla + ".SAL_MES_MOVTO=? "
                       + " AND "
                       + " " + tabla + ".SAL_ANO_MOVTO=? ";
                     }
    return strSQL;
  }


  public String getStrQueryAvisos() {
    return " select A.PARAM_VALOR2 as aviso from param_global A "
		 						+  " WHERE "
		 						+  " A.PARAM_DESCRIPCION='AVISO' "
		 						+  " ORDER BY  A.PARAM_CLAVE ";
  }

public String getStrQueryEdoResMes(String tabla) {
    String strSQL = " SELECT "
									   + " contrato.CTO_NUM_CONTRATO as numContrato,  "
									   + " contrato.CTO_NOM_CONTRATO as nomContrato, "
									   + " TO_CHAR(contrato.CTO_DIA_APERTURA,'00')||' DE '|| DECODE(contrato.CTO_MES_APERTURA,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')"
                     + "||' DEL '||TO_CHAR(contrato.CTO_ANO_APERTURA,'0000') as fechaAper, ";
                     
                     if(tabla.trim().toUpperCase().equals("SALDOSH"))
                      strSQL += " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||" + tabla + ".SAL_MES_MOVTO||'/'||" + tabla + ".SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(" + tabla + ".SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE') as fechaAl, ";
                     else if(tabla.trim().toUpperCase().equals("SALDOS"))
                      strSQL += " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";
                     else
                      strSQL += " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA-1 from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";                     
                      
									   strSQL += " " + tabla + ".SAL_NUM_CTAM as ctam, "
									   + " " + tabla + ".SAL_NUM_SCTA as scta, "
									   + " " + tabla + ".SAL_NUM_SSCTA as sscta, "
									   + " " + tabla + ".SAL_NUM_SSSCTA as ssscta, "
									   + " " + tabla + ".SAL_NUM_SSSSCTA as sssscta, "
									   + " " + tabla + ".SAL_NUM_SSSSSCTA as ssssscta, "
									   + " " + tabla + ".SAL_NUM_AUX1 as aux1, "
									   + " " + tabla + ".SAL_NUM_AUX2 as aux2, "
									   + " " + tabla + ".SAL_NUM_AUX3 as aux3, "
									   + " " + tabla + ".SAL_cargos_per-"+ tabla + ".SAL_abonos_per  as saldoAct"
									   + " FROM "
									   + " CONTRATO contrato, " + tabla + " " + tabla + " "
									   + " WHERE "
									   + " contrato.CTO_NUM_CONTRATO= ? "
									   + " AND "
									   + " contrato.CTO_TIPO_ADMON='NO'"
									   //+ " AND "
									   //+ " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'"
									   + " AND "
									   + " " + tabla + ".SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO ";
                     
                     if(tabla.trim().toUpperCase().equals("SALDOSH")) {
                       strSQL += " AND "
                       + " " + tabla + ".SAL_MES_MOVTO=? "
                       + " AND "
                       + " " + tabla + ".SAL_ANO_MOVTO=? ";
                     }
    return strSQL;
  }

    public String getStrValidaCerrrado() {
      return "SELECT COUNT(1) as datos " + 
      "FROM " + 
      "FECCONT,PRECIOSM " + 
      "WHERE " + 
      "PRE_ANO_PREC_EMIS= FCO_ANO_APLI_CONTA AND " + 
      "PRE_MES_PREC_EMIS= FCO_MES_APLI_CONTA AND " + 
      "PRE_DIA_PREC_EMIS= (SELECT TO_NUMBER(TO_CHAR(LAST_DAY(TO_DATE(REPLACE(TO_CHAR(FCO_DIA_APLI_CONTA,'00')||'/'|| " + 
      "      TO_CHAR(FCO_MES_APLI_CONTA,'00')||'/'|| " + 
      "      TO_CHAR(FCO_ANO_APLI_CONTA,'0000'),' ',''),'DD/MM/YYYY')),'DD')) FROM FECCONT) ";
    }

    public String getStrVariacionPatrimonio() {
      return "SELECT FRCO_ID_REPORTE," + 
      "        REF_USUARIO,REF_NUM_FIDEICOMISO,REF_NOM_FIDEICOMISO,FACO_ID_AGRUPACION," + 
      "        REF_NOMBRE_REPORTE,REF_PERIODO_REPORTE,REF_ETIQUETA,REF_VALOR_DATO,REF_NUM_COL_DATO," + 
      "        REF_VALOR_DATO2,REF_NUM_COL_DATO2,REF_VALOR_DATO3,REF_NUM_COL_DATO3," + 
      "        REF_VALOR_DATO4,REF_NUM_COL_DATO4,REF_VALOR_DATO5,REF_NUM_COL_DATO5,REF_ORDEN_DATO," + 
      "        REF_VALOR_ETIQUETA from F_REP_EDOFINAN_VP WHERE REF_NUM_FIDEICOMISO=? order by FACO_ID_AGRUPACION";
    }


}

