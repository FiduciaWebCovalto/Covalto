//balanzaComprob.java
package mx.com.inscitech.fiducia.business;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.NumberFormat;

import java.util.Vector;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;

public class balanzaComprob {
    private Connection conBD;
    private NumberFormat formatoMonto;
    private NumberFormat formatoCuentas;


    public balanzaComprob() {
        conBD = null;
    }

    /*****************************CONEXION A BASE DE DATOS**********************************/

    private void DriverIni() {
    }

    public boolean OpenBD() {
        try {
            conBD = ServiceLocator.getInstance()
                                  .getDatasource(ConfigurationService.getInstance().getProperty("systemDataSource"))
                                  .getConnection();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void CloseBD() throws SQLException {
        try {
            if (conBD != null && conBD.isClosed() == false)
                conBD.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /************************ FIN METODOS DE CONEXION A BASE DE DATOS**********************/

    public Boolean tieneAdministracion(int numFiso) {

        Statement st = null;
        ResultSet rs = null;
        String sQuery;

        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT DECODE(CTO_TIPO_ADMON,'SI',1,0) ";
            sQuery += " FROM CONTRATO";
            sQuery += " WHERE CTO_NUM_CONTRATO = " + numFiso;

            rs = st.executeQuery(sQuery);
            rs.next();
            return Boolean.valueOf(rs.getBoolean(1));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    /*****************************VERIFICA SI TIENE ADMINISTRACION PROPIA************************/

    public Vector generaBalanzaCom(int noCuenta, int anio, int mes, String tabla) {
        Vector reporte = new Vector();
        Statement st = null;
        ResultSet rs = null;
        String sQuery;
        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


            sQuery = " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " BIE_CVE_BIEN,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BIENFIDE";
            sQuery += " WHERE ";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND ";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND ";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND ";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND ";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND ";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BIE_NUM_CONTRATO  AND ";
            sQuery += " SAL_NUM_AUX2=BIE_SUB_CONTRATO AND  ";
            sQuery += " CUE_NUM_AUX3=16 AND ";
            sQuery += " SAL_NUM_AUX3=TO_NUMBER(BIE_ID_BIEN) ";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " TER_NOM_TERCERO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=12 AND";
            sQuery += " SAL_NUM_AUX3=TER_NUM_TERCERO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " TER_NOM_TERCERO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=12 AND";
            sQuery += " SAL_NUM_AUX2=TER_NUM_TERCERO AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " TER_NOM_TERCERO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=12 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX3=TER_NUM_TERCERO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " TER_NOM_TERCERO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=12 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=TER_NUM_TERCERO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " SCT_NOM_SUB_CTO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " SUBCONT";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =SCT_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=10 AND";
            sQuery += " SAL_NUM_AUX3=0 AND";
            sQuery += " SAL_NUM_AUX2=SCT_SUB_CONTRATO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
            sQuery += " and sct_cve_st_subcont<>'SUSPENDIDO'";

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " FID_NOM_FIDEICOM,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=22 AND";
            sQuery += " SAL_NUM_AUX3=FID_FIDEICOMITENTE";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " FID_NOM_FIDEICOM,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=22 AND";
            sQuery += " SAL_NUM_AUX2=FID_FIDEICOMITENTE AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " FID_NOM_FIDEICOM,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=22 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX3=FID_FIDEICOMITENTE";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " FID_NOM_FIDEICOM,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=22 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=FID_FIDEICOMITENTE AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " CPR_NOM_INTERMED,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " CONTINTE";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =CPR_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=11 AND";
            sQuery += " SAL_NUM_AUX2=CPR_SUB_CONTRATO AND  ";
            sQuery += " SAL_NUM_AUX3=CPR_CONTRATO_INTER";
            sQuery += " AND CPR_NUM_CONTRATO  =CTO_NUM_CONTRATO";
            sQuery += " AND CPR_CVE_ST_CONTINT  <> 'CANCELADO'";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " CPR_NOM_INTERMED,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " CONTINTE";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =CPR_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=11 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=CPR_SUB_CONTRATO AND";
            sQuery += " SAL_NUM_AUX3=CPR_CONTRATO_INTER";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " BEN_NOM_BENEF,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX3=23 AND";
            sQuery += " SAL_NUM_AUX2=BEN_BENEFICIARIO AND";
            sQuery += " SAL_NUM_AUX3=CTO_NUM_CONTRATO";
            sQuery += " AND BEN_NUM_CONTRATO=CTO_NUM_CONTRATO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " BEN_NOM_BENEF,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1= CTO_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX3=23 AND";
            sQuery += " SAL_NUM_AUX2=BEN_BENEFICIARIO AND ";
            sQuery += " BEN_NUM_CONTRATO=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " BEN_NOM_BENEF,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX2=23 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX3=BEN_BENEFICIARIO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " BEN_NOM_BENEF,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX2=23 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=BEN_BENEFICIARIO AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " CUE_NOM_CTA,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX2=0 AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " CUE_NOM_CTA,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=17";
            sQuery += " and SAL_NUM_AUX3 <> 0 ";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " CUE_NOM_CTA,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX2=17 AND ";
            sQuery += " CUE_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMS_NOM_EMISOR,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " NOT SAL_NUM_CTAM=1204 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=21 AND ";
            sQuery += " SAL_NUM_AUX2=EMS_NUM_EMISOR AND";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMI_DESC_EMISION,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISION,";
            sQuery += " POSICION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM=1204 AND";
            sQuery += " SAL_NUM_SCTA =1 AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=2 AND ";
            sQuery += " CUE_NUM_SCTA=1 AND ";
            sQuery += " SAL_NUM_AUX1=POS_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX2=POS_SUB_CONTRATO AND     ";
            sQuery += " SAL_NUM_AUX3 <> 0 AND ";
            sQuery += " POS_CVE_TIPO_MERCA=EMI_CVE_TIPO_MERCA AND    ";
            sQuery += " POS_NUM_INSTRUME=EMI_NUM_INSTRUME AND ";
            sQuery += " POS_NOM_PIZARRA=EMI_NOM_PIZARRA AND    ";
            sQuery += " POS_NUM_SER_EMIS=EMI_NUM_SER_EMIS AND      ";
            sQuery += " POS_NUM_CUPON_VIG=EMI_NUM_CUPON_VIG";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMS_NOM_EMISOR,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR,EMISION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=21 AND ";
            sQuery += " SAL_NUM_AUX3=EMI_NUM_SEC_EMIS AND";
            sQuery += " EMI_CVE_TIPO_MERCA=1 AND";
            sQuery += " EMI_NUM_INSTRUME=1 AND";
            sQuery += " EMI_NUM_EMISOR =EMS_NUM_EMISOR ";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMS_NOM_EMISOR,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX2=21 AND";
            sQuery += " CUE_NUM_AUX3=0 AND  ";
            sQuery += " SAL_NUM_AUX3=EMS_NUM_EMISOR";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMS_NOM_EMISOR,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX2=21 AND";
            sQuery += " CUE_NUM_AUX3=0 AND  ";
            sQuery += " SAL_NUM_AUX2=EMS_NUM_EMISOR AND";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " SCT_NOM_SUB_CTO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " SUBCONT";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =SCT_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1=5475 AND";
            sQuery += " SAL_NUM_CTAM=4201 AND";
            sQuery += " SAL_NUM_SCTA=90 AND ";
            sQuery += " SAL_NUM_SSCTA=6 AND ";
            sQuery += " CUE_NUM_AUX2=10 AND";
            sQuery += " SAL_NUM_AUX2=SCT_SUB_CONTRATO  ";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
            sQuery += " and sct_cve_st_subcont<>'SUSPENDIDO'";

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " CONT2.CTO_NOM_CONTRATO,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO CONT1,";
            sQuery += " CONTRATO CONT2";
            sQuery += " WHERE";
            sQuery += " (SAL_NUM_AUX1 = 7717 OR ";
            sQuery += " SAL_NUM_AUX1 = 50281)  AND ";
            sQuery += " SAL_NUM_AUX3 > 0 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CONT1.CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX3=CONT2.CTO_NUM_CONTRATO";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMI_DESC_EMISION,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM=1203 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=2 AND ";
            sQuery += " SAL_NUM_AUX2=0 AND";
            sQuery += " SAL_NUM_AUX3<>0 AND";
            sQuery += " EMI_CVE_TIPO_MERCA = 1 AND";
            sQuery += " EMI_NUM_INSTRUME = 2 AND";
            sQuery += " SAL_NUM_AUX3=EMI_NUM_SEC_EMIS ";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT ";
            sQuery += " DECODE(SAL_NUM_CTAM,0,'',SAL_NUM_CTAM) AS SAL_NUM_CTAM_,";
            sQuery += " DECODE(SAL_NUM_SCTA,0,'',SAL_NUM_SCTA) AS SAL_NUM_SCTA_,";
            sQuery += " DECODE(SAL_NUM_SSCTA,0,'',SAL_NUM_SSCTA) AS SAL_NUM_SSCTA_, ";
            sQuery += " DECODE(SAL_NUM_SSSCTA,0,'',SAL_NUM_SSSCTA) AS SAL_NUM_SSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSCTA,0,'',SAL_NUM_SSSSCTA) AS SAL_NUM_SSSSCTA_,";
            sQuery += " DECODE(SAL_NUM_SSSSSCTA,0,'',SAL_NUM_SSSSSCTA) AS SAL_NUM_SSSSSCTA_,";
            sQuery += " EMI_DESC_EMISION,";
            sQuery += " ' ',";
            sQuery += " DECODE(SAL_NUM_AUX2,0,'',SAL_NUM_AUX2) AS SAL_NUM_AUX2_,";
            sQuery += " DECODE(" + tabla + ".SAL_NUM_AUX3,0,''," + tabla + ".SAL_NUM_AUX3) AS SAL_NUM_AUX3_,";
            sQuery += " SAL_SALDO_INI_PER,SAL_CARGOS_PER,";
            sQuery += " SAL_ABONOS_PER,SAL_IMP_SALDO_ACT";
            sQuery +=
                " , (SAL_NUM_CTAM || TO_CHAR(SAL_NUM_SCTA,'00') || TO_CHAR(SAL_NUM_SSCTA,'00') || TO_CHAR(SAL_NUM_SSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSCTA,'00') || TO_CHAR(SAL_NUM_SSSSSCTA,'00') || TO_CHAR(SAL_NUM_AUX2,'0000000000') || TO_CHAR(SAL_NUM_AUX3,'0000000000')) AS ORDEN";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM=1204 AND ";
            sQuery += " SAL_NUM_SCTA=1 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=2 AND ";
            sQuery += " SAL_NUM_AUX3<>0 AND";
            sQuery += " EMI_CVE_TIPO_MERCA = 1 AND";
            sQuery += " EMI_NUM_INSTRUME = 1 AND";
            sQuery += " SAL_NUM_AUX3=EMI_NUM_SEC_EMIS ";
            sQuery += " and SAL_NUM_CTAM<7000  ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) ORDER BY ORDEN ASC ";


            rs = st.executeQuery(sQuery);
            while (rs.next()) {
                Vector reg = new Vector();

                reg.add(Integer.valueOf(rs.getInt(1)));
                reg.add(Integer.valueOf(rs.getInt(2)));
                reg.add(Integer.valueOf(rs.getInt(3)));
                reg.add(Integer.valueOf(rs.getInt(4)));
                reg.add(Integer.valueOf(rs.getInt(5)));
                reg.add(Integer.valueOf(rs.getInt(6)));
                reg.add((rs.getString(7)));
                reg.add((rs.getString(8)));
                reg.add((Math.round(rs.getDouble(9))) + "");
                //JJR 10/08/2005
                //reg.add( Integer.valueOf(rs.getInt(10)) );
                reg.add((Math.round(rs.getDouble(10))) + "");
                reg.add(Double.valueOf(rs.getDouble(11)));
                reg.add(Double.valueOf(rs.getDouble(12)));
                reg.add(Double.valueOf(rs.getDouble(13)));
                reg.add(Double.valueOf(rs.getDouble(14)));
                reporte.add(reg);
            }

            return reporte;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    /************************OBTIENE LOS DATOS DE LA BALANZA DE COMPROBACION********************/
    public String escribeBalanza(Vector reporte, int pagina) {
        StringBuffer escribe = new StringBuffer();
        int columna;

        try {
            formatoCuentas = NumberFormat.getInstance();
            formatoCuentas.setMaximumIntegerDigits(16);
            formatoCuentas.setMinimumIntegerDigits(1);
            formatoCuentas.setMaximumFractionDigits(2);
            formatoCuentas.setMinimumFractionDigits(2);

            int posIni = (((pagina * 16) - 15) - 1);
            int posFin = (pagina * 16 - 1);

            if (posFin >= reporte.size())
                posFin = (int) reporte.size() - 1;


            for (int fila = posIni; fila <= posFin; fila++) {
                escribe.append("<tr height='30'>");
                Vector reg = (Vector) reporte.get(fila);
                for (columna = 0; columna < reg.size(); columna++) {
                    if ((columna >= 0) && (columna <= 9)) {
                        if (columna == 0) {
                            escribe.append("<td align='center'><a href='' target='_blank' onClick='window.open(this.href,this.target)'>" + reg.get(columna).toString() +
                                           "</a></td>");
                        } else {
                            escribe.append("<td align='center'>" + reg.get(columna).toString() + "</td>");
                        }
                    } else {
                        escribe.append("<td align='right'>");
                        escribe.append(formatoCuentas.format(((Double) reg.get(columna)).doubleValue()));
                        escribe.append("</td>");
                    }
                }
                escribe.append("</tr>");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return escribe.toString();
    }

    /**************************ESCRIBE LOS DATOS EN LA BALANZA DE COMPROBACION*******************/

    public Vector generaSumas(int noCuenta, int anio, int mes, String tabla) {
        Vector sumas = new Vector();
        Statement st = null;
        ResultSet rs = null;
        String sQuery;

        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT SUM( SAL_SALDO_INI_PER ),";
            sQuery += " SUM( SAL_CARGOS_PER ) , ";
            sQuery += " SUM( SAL_ABONOS_PER ) , ";
            sQuery += " SUM( SAL_IMP_SALDO_ACT )";
            sQuery += " FROM " + tabla + ", CONTRATO ";
            sQuery += " WHERE SAL_NUM_AUX1 = CTO_NUM_CONTRATO ";
            sQuery += " AND SAL_NUM_SCTA = 0 ";
            sQuery += " AND SAL_NUM_SSCTA = 0 ";
            sQuery += " AND SAL_NUM_SSSCTA = 0 ";
            sQuery += " AND SAL_NUM_SSSSCTA = 0 ";
            sQuery += " AND SAL_NUM_SSSSSCTA = 0 ";
            sQuery += " AND SAL_NUM_AUX2 = 0";
            sQuery += " AND SAL_NUM_AUX3 = 0";
            sQuery += " AND SAL_NUM_CTAM < 7000 ";
            sQuery += " and SAL_NUM_CTAM>0  ";
            sQuery += " AND SAL_NUM_CTAM NOT IN (6205,6505,6206,6506) ";
            sQuery += " AND CTO_CVE_ST_CONTRAT = 'ACTIVO'  ";
            sQuery += " AND SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            rs = st.executeQuery(sQuery);
            while (rs.next()) {

                sumas.add(Double.valueOf(rs.getDouble(1)));
                sumas.add(Double.valueOf(rs.getDouble(2)));
                sumas.add(Double.valueOf(rs.getDouble(3)));
                sumas.add(Double.valueOf(rs.getDouble(4)));
            }

            return sumas;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    /******************************* OBTIENE LA SUMA DE LA BALANZA DE COMPROBACION****************/

    public String escribeSumasBalanza(Vector sumas) {
        StringBuffer escribe = new StringBuffer();
        formatoMonto = NumberFormat.getInstance();
        formatoMonto.setMaximumIntegerDigits(16);
        formatoMonto.setMinimumIntegerDigits(1);
        formatoMonto.setMaximumFractionDigits(2);
        formatoMonto.setMinimumFractionDigits(2);

        try {
            for (int columna = 0; columna < sumas.size(); columna++) {
                escribe.append("<td align='right'>");
                escribe.append(formatoMonto.format(Double.valueOf(sumas.get(columna).toString()).doubleValue()));
                escribe.append("</td>");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return escribe.toString();
    }

    /****************************************ESCRIBE LAS SUMAS EN EL REPORTE*********************/

    public Integer obtenPaginas(int noCuenta, int anio, int mes, String tabla) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery;
        Integer numeroRegistro = null;
        Double suma = Double.valueOf(0);

        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT";
            sQuery += " COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BIENFIDE";
            sQuery += " WHERE ";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND ";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND ";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND ";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND ";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND ";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND ";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BIE_NUM_CONTRATO  AND ";
            sQuery += " SAL_NUM_AUX2=BIE_SUB_CONTRATO AND  ";
            sQuery += " CUE_NUM_AUX3=16 AND ";
            sQuery += " SAL_NUM_AUX3=TO_NUMBER(BIE_ID_BIEN) ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=12 AND";
            sQuery += " SAL_NUM_AUX3=TER_NUM_TERCERO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=12 AND";
            sQuery += " SAL_NUM_AUX2=TER_NUM_TERCERO AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=12 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX3=TER_NUM_TERCERO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " TERCEROS";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " CTO_NUM_CONTRATO =TER_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1 =TER_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=12 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=TER_NUM_TERCERO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " SUBCONT";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =SCT_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=10 AND";
            sQuery += " SAL_NUM_AUX3=0 AND";
            sQuery += " SAL_NUM_AUX2=SCT_SUB_CONTRATO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
            sQuery += " and sct_cve_st_subcont<>'SUSPENDIDO'";

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=22 AND";
            sQuery += " SAL_NUM_AUX3=FID_FIDEICOMITENTE";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=22 AND";
            sQuery += " SAL_NUM_AUX2=FID_FIDEICOMITENTE AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=22 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX3=FID_FIDEICOMITENTE";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " FIDEICOM";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =FID_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=22 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=FID_FIDEICOMITENTE AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " CONTINTE";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =CPR_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX3=11 AND";
            sQuery += " SAL_NUM_AUX2=CPR_SUB_CONTRATO AND  ";
            sQuery += " SAL_NUM_AUX3=CPR_CONTRATO_INTER";
            sQuery += " AND CPR_NUM_CONTRATO  =CTO_NUM_CONTRATO";
            sQuery += " AND CPR_CVE_ST_CONTINT  <> 'CANCELADO'";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " CONTINTE";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =CPR_NUM_CONTRATO  AND";
            sQuery += " CUE_NUM_AUX2=11 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=CPR_SUB_CONTRATO AND";
            sQuery += " SAL_NUM_AUX3=CPR_CONTRATO_INTER";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX3=23 AND";
            sQuery += " SAL_NUM_AUX2=BEN_BENEFICIARIO AND";
            sQuery += " SAL_NUM_AUX3=CTO_NUM_CONTRATO";
            sQuery += " AND BEN_NUM_CONTRATO=CTO_NUM_CONTRATO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1= CTO_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX3=23 AND";
            sQuery += " SAL_NUM_AUX2=BEN_BENEFICIARIO AND ";
            sQuery += " BEN_NUM_CONTRATO=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX2=23 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX3=BEN_BENEFICIARIO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " BENEFICI";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX1 =BEN_NUM_CONTRATO AND";
            sQuery += " CUE_NUM_AUX2=23 AND";
            sQuery += " CUE_NUM_AUX3=0 AND ";
            sQuery += " SAL_NUM_AUX2=BEN_BENEFICIARIO AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " SAL_NUM_AUX2=0 AND ";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=17";
            sQuery += " and SAL_NUM_AUX3 <> 0 ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX2=17 AND ";
            sQuery += " CUE_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " NOT SAL_NUM_CTAM=1204 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=21 AND ";
            sQuery += " SAL_NUM_AUX2=EMS_NUM_EMISOR AND";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISION,";
            sQuery += " POSICION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM=1204 AND";
            sQuery += " SAL_NUM_SCTA =1 AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=2 AND ";
            sQuery += " CUE_NUM_SCTA=1 AND ";
            sQuery += " SAL_NUM_AUX1=POS_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX2=POS_SUB_CONTRATO AND     ";
            sQuery += " SAL_NUM_AUX3 <> 0 AND ";
            sQuery += " POS_CVE_TIPO_MERCA=EMI_CVE_TIPO_MERCA AND    ";
            sQuery += " POS_NUM_INSTRUME=EMI_NUM_INSTRUME AND ";
            sQuery += " POS_NOM_PIZARRA=EMI_NOM_PIZARRA AND    ";
            sQuery += " POS_NUM_SER_EMIS=EMI_NUM_SER_EMIS AND      ";
            sQuery += " POS_NUM_CUPON_VIG=EMI_NUM_CUPON_VIG";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR,EMISION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=21 AND ";
            sQuery += " SAL_NUM_AUX3=EMI_NUM_SEC_EMIS AND";
            sQuery += " EMI_CVE_TIPO_MERCA=1 AND";
            sQuery += " EMI_NUM_INSTRUME=1 AND";
            sQuery += " EMI_NUM_EMISOR =EMS_NUM_EMISOR ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX2=21 AND";
            sQuery += " CUE_NUM_AUX3=0 AND  ";
            sQuery += " SAL_NUM_AUX3=EMS_NUM_EMISOR";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISOR";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM NOT IN (6205,6206,6505,6506) AND";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX2=21 AND";
            sQuery += " CUE_NUM_AUX3=0 AND  ";
            sQuery += " SAL_NUM_AUX2=EMS_NUM_EMISOR AND";
            sQuery += " SAL_NUM_AUX3=0";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " SUBCONT";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1 =CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX1 =SCT_NUM_CONTRATO  AND";
            sQuery += " SAL_NUM_AUX1=5475 AND";
            sQuery += " SAL_NUM_CTAM=4201 AND";
            sQuery += " SAL_NUM_SCTA=90 AND ";
            sQuery += " SAL_NUM_SSCTA=6 AND ";
            sQuery += " CUE_NUM_AUX2=10 AND";
            sQuery += " SAL_NUM_AUX2=SCT_SUB_CONTRATO  ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);
            sQuery += " and sct_cve_st_subcont<>'SUSPENDIDO'";

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO CONT1,";
            sQuery += " CONTRATO CONT2";
            sQuery += " WHERE";
            sQuery += " (SAL_NUM_AUX1 = 7717 OR ";
            sQuery += " SAL_NUM_AUX1 = 50281)  AND ";
            sQuery += " SAL_NUM_AUX3 > 0 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CONT1.CTO_NUM_CONTRATO AND";
            sQuery += " SAL_NUM_AUX3=CONT2.CTO_NUM_CONTRATO";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM=1203 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=2 AND ";
            sQuery += " SAL_NUM_AUX2=0 AND";
            sQuery += " SAL_NUM_AUX3<>0 AND";
            sQuery += " EMI_CVE_TIPO_MERCA = 1 AND";
            sQuery += " EMI_NUM_INSTRUME = 2 AND";
            sQuery += " SAL_NUM_AUX3=EMI_NUM_SEC_EMIS ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " ) Union (";
            sQuery += " SELECT";
            sQuery += "  COUNT(*)";
            sQuery += " FROM";
            sQuery += " " + tabla + ",";
            sQuery += " CUENTACO,";
            sQuery += " CONTRATO,";
            sQuery += " EMISION";
            sQuery += " WHERE";
            sQuery += " SAL_NUM_CTAM=1204 AND ";
            sQuery += " SAL_NUM_SCTA=1 AND ";
            sQuery += " SAL_NUM_CTAM = CUE_NUM_CTAM AND";
            sQuery += " SAL_NUM_SCTA =CUE_NUM_SCTA AND";
            sQuery += " SAL_NUM_SSCTA =CUE_NUM_SSCTA AND";
            sQuery += " SAL_NUM_SSSCTA =CUE_NUM_SSSCTA AND";
            sQuery += " SAL_NUM_SSSSCTA =CUE_NUM_SSSSCTA AND";
            sQuery += " SAL_NUM_SSSSSCTA =CUE_NUM_SSSSSCTA AND";
            sQuery += " SAL_NUM_SCTA =0 AND ";
            sQuery += " SAL_NUM_SSCTA =0 AND ";
            sQuery += " SAL_NUM_AUX1=CTO_NUM_CONTRATO AND ";
            sQuery += " CUE_NUM_AUX3=2 AND ";
            sQuery += " SAL_NUM_AUX3<>0 AND";
            sQuery += " EMI_CVE_TIPO_MERCA = 1 AND";
            sQuery += " EMI_NUM_INSTRUME = 1 AND";
            sQuery += " SAL_NUM_AUX3=EMI_NUM_SEC_EMIS ";
            sQuery += " and SAL_NUM_AUX1 = " + Integer.toString(noCuenta);

            if (tabla.trim()
                     .toUpperCase()
                     .equals("SALDOSH")) {
                sQuery += " AND SAL_ANO_MOVTO= " + Integer.toString(anio);
                sQuery += " AND SAL_MES_MOVTO= " + Integer.toString(mes);
            }

            sQuery += " )";

            rs = st.executeQuery(sQuery);

            while (rs.next()) {
                suma = Double.valueOf(suma.doubleValue() + rs.getDouble(1));
            }

            numeroRegistro = Integer.valueOf((Double.valueOf(Math.ceil(suma.doubleValue() / 16.0))).intValue());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return numeroRegistro;
    }

    /*************************************OBTIENE LAS PAGINAS A IMPRIMIR*********************************/


    public String escribeEncabezado(String fideicomiso, String anio, String mesCompleto, int pag, String nombreFideicomiso, String empresa_1, String empresa_2) {
        StringBuffer escribe = new StringBuffer();
        try {
            escribe.append("<table width='899' border='0' bordercolor='#000000' align='center' bgcolor='#FFFFFF'>");
            escribe.append("<td width='738' height='0'><div align='center' class='style14'></div></td><td width='151' height='91' rowspan='7' align='center' valign='top'><img width=200 src='../../imagenes/logo_bn.jpg'></td>");
            escribe.append("</tr><tr><td><div align='center'><blockquote><div class='style14'>" + empresa_1 + "</div>");
            escribe.append("</blockquote></div></td></tr><tr><td><div align='center' class='style15'>" + empresa_2 + "</div></td></tr>");
            if (mesCompleto.trim().equals(""))
                escribe.append("</tr><tr><td><div align='center' class='style15'><span class='style16'>BALANZA DE COMPROBACION");
            else {
                escribe.append("</tr><tr><td><div align='center' class='style15'><span class='style16'>BALANZA DE COMPROBACION AL CIERRE DEL MES DE " + mesCompleto);
                escribe.append(" DEL " + anio + " </span></div></td></tr>");
            }
            escribe.append("<tr><td><div align='center' class='style18'>DETALLE DE SALDOS </div></td>");
            escribe.append("</tr><tr><td height='23'>&nbsp;</td></tr>");
            escribe.append("</tr><tr><td><div align='center' class='style15'>" + nombreFideicomiso + "</div></td>");
            escribe.append("</tr><tr><td height='23'>&nbsp;</td></tr></table>");

            if (pag == 1)
                escribe.append("<table width='900' height='25' border='0' align='center' bgcolor='#FFFFFF'>");
            else
                escribe.append("<table width='900' height='25' align='center' border='0' bgcolor='#FFFFFF' style='page-break-after:always;'>");
            escribe.append("<tr class='textohome2'>");
            escribe.append("<th width='25'>");
            escribe.append("<div align='center'><span class='style26'>CUENTA</span></div></th>");
            escribe.append("<th width='21'><div align='center'><span class='style26'>SCTA</span></div></th>");
            escribe.append("<th width='25'><div align='center'><span class='style26'>S2CTA</span></div></th>");
            escribe.append("<th width='25'><div align='center'><span class='style26'>S3CTA</span></div></th>");
            escribe.append("<th width='25'><div align='center'><span class='style26'>S4CTA</span></div></th>");
            escribe.append("<th width='25'><div align='center'><span class='style26'>S5CTA</span></div></th>");
            escribe.append("<th width='232' height='30'><div align='center'>");
            escribe.append("<p align='center'><span class='style26'>NOMBRE</span></p>");
            escribe.append("</div></td>");
            escribe.append("<th width='20'><div align='center'><span class='style26'>&nbsp;&nbsp;&nbsp;</span></div></th>");
            escribe.append("<th width='20'><div align='center'><span class='style26'>AUX2</span></div></th>");
            escribe.append("<th width='26'><div align='center'><span class='style26'>&nbsp;&nbsp;&nbsp;AUX3</span></div></th>");
            escribe.append("<th width='89'><div align='center'>");
            escribe.append("<p><span class='style26'>&nbsp;&nbsp;SALDO&nbsp;&nbsp;ANTERIOR</span></p>");
            escribe.append("</div></th>");
            escribe.append("<th width='88'><div align='center'>");
            escribe.append("<p><span class='style26'>CARGO</span></p>");
            escribe.append("</div></td>");
            escribe.append("<th width='88'><div align='center'><span class='style26'> ABONO</span></div></th>");
            escribe.append("<th width='93'><div align='center'>");
            escribe.append("<p><span class='style26'>&nbsp;&nbsp;SALDO&nbsp;&nbsp;ACTUAL</span></p>");
            escribe.append("</div></th>");
            escribe.append("</tr>");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return escribe.toString();
    }
    /*****************************ESCRIBE LOS ENCABEZADOS EN EL REPORTE****************************/
    /**************************************TERMINA CLASE*******************************************/
}
