package mx.com.inscitech.fiducia.common.util;

public class QueryReportes {

    public String getStrTipoAdmon() {
        return "SELECT CTO_TIPO_ADMON as contrato FROM CONTRATO WHERE CTO_NUM_CONTRATO=?";
    }


    public String getStrQueryBalance(String tabla) {
        String strSQL = " SELECT " + " contrato.CTO_NUM_CONTRATO as numContrato, " + " contrato.CTO_NOM_CONTRATO as nomContrato, ";

        if (tabla.trim()
                 .toUpperCase()
                 .equals("SALDOSH"))
            strSQL +=
                " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||" + tabla + ".SAL_MES_MOVTO||'/'||" + tabla + ".SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(" + tabla +
                ".SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '||" +
                tabla + ".SAL_ANO_MOVTO as periodo, ";
        else if (tabla.trim()
                      .toUpperCase()
                      .equals("SALDOS"))
            strSQL +=
                " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as periodo, ";
        else
            strSQL +=
                " TO_CHAR(LAST_DAY(TO_DATE((select DECODE(FCO_MES_DIA,1,13,FCO_MES_DIA,FCO_MES_DIA)-1 from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select DECODE(FCO_MES_DIA,1,13,FCO_MES_DIA,FCO_MES_DIA)-1 from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as periodo, ";

        strSQL +=
            " " + tabla + ".SAL_NUM_CTAM as ctam, " + " " + tabla + ".SAL_NUM_SCTA as scta, " + " " + tabla + ".SAL_NUM_SSCTA as sscta, " + " " + tabla +
            ".SAL_NUM_SSSCTA as ssscta, " + " " + tabla + ".SAL_NUM_SSSSCTA as sssscta, " + " " + tabla + ".SAL_NUM_SSSSSCTA as ssssscta, " + " " + tabla +
            ".SAL_NUM_AUX1 as aux1, " + " " + tabla + ".SAL_NUM_AUX2 as aux2, " + " " + tabla + ".SAL_NUM_AUX3 as aux3, " + " " + tabla + ".SAL_IMP_SALDO_ACT as saldoAct" +
            " FROM " + " CONTRATO contrato, " + tabla + " " + tabla + " " + " WHERE " + " contrato.CTO_NUM_CONTRATO= ? " + " AND " + " contrato.CTO_TIPO_ADMON='NO'" + " AND " +
            " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'" + " AND " + " " + tabla + ".SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO ";

        if (tabla.trim()
                 .toUpperCase()
                 .equals("SALDOSH")) {
            strSQL += " AND " + " " + tabla + ".SAL_MES_MOVTO=? " + " AND " + " " + tabla + ".SAL_ANO_MOVTO=? ";
        }
        return strSQL;
    }


    public String getStrQueryBalanceReexpresado(String tabla) {

        String strSQL =
            " SELECT " + " CTO_NUM_CONTRATO AS NUMCONTRATO, " + " CTO_NOM_CONTRATO AS NOMCONTRATO, " +
            " RTRIM(TO_CHAR(LAST_DAY(SAL_FECHA),'DD'))||' DE '||DECODE(TO_CHAR(SAL_FECHA,'MM'),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '||TO_CHAR(SAL_FECHA,'YYYY') AS PERIODO, " +
            " SAL_NUM_CTAM AS CTAM, " + " SAL_NUM_SCTA as scta, " + " SAL_NUM_SSCTA as sscta, " + " SAL_NUM_SSSCTA as ssscta, " + " SAL_NUM_SSSSCTA as sssscta, " +
            " SAL_NUM_SSSSSCTA as ssssscta, " + " SAL_NUM_AUX1 as aux1, " + " SAL_NUM_AUX2 as aux2, " + " SAL_NUM_AUX3 as aux3, " + " SAL_IMP_SALDO_ACT as saldoAct" +
            " FROM CONTRATO, SALDOS_EXT " + " WHERE CTO_NUM_CONTRATO = ? " + " AND  CTO_TIPO_ADMON='NO'" + " AND  CTO_CVE_ST_CONTRAT='ACTIVO'" +
            " AND  SAL_NUM_AUX1 = CTO_NUM_CONTRATO ";

        return strSQL;
    }


    public String getStrQueryEdoRes(String tabla) {
        String strSQL =
            " SELECT " + " contrato.CTO_NUM_CONTRATO as numContrato,  " + " contrato.CTO_NOM_CONTRATO as nomContrato, " +
            " TO_CHAR(contrato.CTO_DIA_APERTURA,'00')||' DE '|| DECODE(contrato.CTO_MES_APERTURA,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')" +
            "||' DEL '||TO_CHAR(contrato.CTO_ANO_APERTURA,'0000') as fechaAper, ";

        if (tabla.trim()
                 .toUpperCase()
                 .equals("SALDOSH"))
            strSQL +=
                " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||" + tabla + ".SAL_MES_MOVTO||'/'||" + tabla + ".SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(" + tabla +
                ".SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE') as fechaAl, ";
        else if (tabla.trim()
                      .toUpperCase()
                      .equals("SALDOS"))
            strSQL +=
                " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";
        else
            strSQL +=
                " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA-1 from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";

        strSQL +=
            " " + tabla + ".SAL_NUM_CTAM as ctam, " + " " + tabla + ".SAL_NUM_SCTA as scta, " + " " + tabla + ".SAL_NUM_SSCTA as sscta, " + " " + tabla +
            ".SAL_NUM_SSSCTA as ssscta, " + " " + tabla + ".SAL_NUM_SSSSCTA as sssscta, " + " " + tabla + ".SAL_NUM_SSSSSCTA as ssssscta, " + " " + tabla +
            ".SAL_NUM_AUX1 as aux1, " + " " + tabla + ".SAL_NUM_AUX2 as aux2, " + " " + tabla + ".SAL_NUM_AUX3 as aux3, " + " " + tabla + ".SAL_IMP_SALDO_ACT as saldoAct" +
            " FROM " + " CONTRATO contrato, " + tabla + " " + tabla + " " + " WHERE " + " contrato.CTO_NUM_CONTRATO= ? " + " AND " + " contrato.CTO_TIPO_ADMON='NO'" + " AND " +
            " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'" + " AND " + " " + tabla + ".SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO ";

        if (tabla.trim()
                 .toUpperCase()
                 .equals("SALDOSH")) {
            strSQL += " AND " + " " + tabla + ".SAL_MES_MOVTO=? " + " AND " + " " + tabla + ".SAL_ANO_MOVTO=? ";
        }
        return strSQL;
    }

    public String getStrQueryEdoResReexpresado(String tabla) {

        String strSQL =
            " SELECT " + " CTO_NUM_CONTRATO AS NUMCONTRATO, " + " CTO_NOM_CONTRATO AS NOMCONTRATO, " +
            " TO_CHAR(CTO_DIA_APERTURA,'00')||' DE '|| DECODE(CTO_MES_APERTURA,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')" +
            "||' DEL '||TO_CHAR(CTO_ANO_APERTURA,'0000') as fechaAper, " +
            " RTRIM(TO_CHAR(LAST_DAY(SAL_FECHA),'DD'))||' DE '||DECODE(TO_CHAR(SAL_FECHA,'MM'),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '||TO_CHAR(SAL_FECHA,'YYYY') AS fechaAl, " +
            " SAL_NUM_CTAM AS CTAM, " + " SAL_NUM_SCTA as scta, " + " SAL_NUM_SSCTA as sscta, " + " SAL_NUM_SSSCTA as ssscta, " + " SAL_NUM_SSSSCTA as sssscta, " +
            " SAL_NUM_SSSSSCTA as ssssscta, " + " SAL_NUM_AUX1 as aux1, " + " SAL_NUM_AUX2 as aux2, " + " SAL_NUM_AUX3 as aux3, " + " SAL_IMP_SALDO_ACT as saldoAct" +
            " FROM CONTRATO, SALDOS_EXT " + " WHERE CTO_NUM_CONTRATO = ? " + " AND  CTO_TIPO_ADMON='NO'" + " AND  CTO_CVE_ST_CONTRAT='ACTIVO'" +
            " AND  SAL_NUM_AUX1 = CTO_NUM_CONTRATO ";

        return strSQL;
    }


    public String getStrQueryAvisos() {
        return " select A.PARAM_VALOR2 as aviso from param_global A " + " WHERE " + " A.PARAM_DESCRIPCION='AVISO' " + " ORDER BY  A.PARAM_CLAVE ";
    }

    public String getStrQueryEdoResMes(String tabla) {
        String strSQL =
            " SELECT " + " contrato.CTO_NUM_CONTRATO as numContrato,  " + " contrato.CTO_NOM_CONTRATO as nomContrato, " +
            " TO_CHAR(contrato.CTO_DIA_APERTURA,'00')||' DE '|| DECODE(contrato.CTO_MES_APERTURA,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')" +
            "||' DEL '||TO_CHAR(contrato.CTO_ANO_APERTURA,'0000') as fechaAper, ";

        if (tabla.trim()
                 .toUpperCase()
                 .equals("SALDOSH"))
            strSQL +=
                " RTRIM(TO_CHAR(LAST_DAY(TO_DATE('01/'||" + tabla + ".SAL_MES_MOVTO||'/'||" + tabla + ".SAL_ANO_MOVTO,'DD/MM/YYYY')),'DD'))||' DE '||DECODE(" + tabla +
                ".SAL_MES_MOVTO,1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE') as fechaAl, ";
        else if (tabla.trim()
                      .toUpperCase()
                      .equals("SALDOS"))
            strSQL +=
                " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";
        else
            strSQL +=
                " TO_CHAR(LAST_DAY(TO_DATE((select FCO_MES_DIA from FECCONT), 'MM')), 'DD') || ' DE ' ||(DECODE((select FCO_MES_DIA-1 from FECCONT),1,'ENERO',2,'FEBRERO',3,'MARZO',4,'ABRIL',5,'MAYO',6,'JUNIO',7,'JULIO',8,'AGOSTO',9,'SEPTIEMBRE',10,'OCTUBRE',11,'NOVIEMBRE',12,'DICIEMBRE')||' DEL '|| (select FCO_ANO_DIA from FECCONT)) as fechaAl, ";

        strSQL +=
            " " + tabla + ".SAL_NUM_CTAM as ctam, " + " " + tabla + ".SAL_NUM_SCTA as scta, " + " " + tabla + ".SAL_NUM_SSCTA as sscta, " + " " + tabla +
            ".SAL_NUM_SSSCTA as ssscta, " + " " + tabla + ".SAL_NUM_SSSSCTA as sssscta, " + " " + tabla + ".SAL_NUM_SSSSSCTA as ssssscta, " + " " + tabla +
            ".SAL_NUM_AUX1 as aux1, " + " " + tabla + ".SAL_NUM_AUX2 as aux2, " + " " + tabla + ".SAL_NUM_AUX3 as aux3, " + " " + tabla + ".SAL_cargos_per-" + tabla +
            ".SAL_abonos_per  as saldoAct" + " FROM " + " CONTRATO contrato, " + tabla + " " + tabla + " " + " WHERE " + " contrato.CTO_NUM_CONTRATO= ? " + " AND " +
            " contrato.CTO_TIPO_ADMON='NO'" + " AND " + " contrato.CTO_CVE_ST_CONTRAT='ACTIVO'" + " AND " + " " + tabla + ".SAL_NUM_AUX1 = contrato.CTO_NUM_CONTRATO ";

        if (tabla.trim()
                 .toUpperCase()
                 .equals("SALDOSH")) {
            strSQL += " AND " + " " + tabla + ".SAL_MES_MOVTO=? " + " AND " + " " + tabla + ".SAL_ANO_MOVTO=? ";
        }
        return strSQL;
    }

}

