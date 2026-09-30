package mx.com.inscitech.cuentas.individuales.negocio;

import java.sql.ResultSet;
import java.sql.Statement;

import mx.com.inscitech.fiducia.common.services.LoggingService;

public class RetirosDB extends FiduciaBD {

    private LoggingService logger = null;
    
    public RetirosDB() {
        super();
        logger = LoggingService.getNewInstance();
    }
    
    //Catalogos
    public String[] getData(int iOpcion, String sCond) {
        String[] sData = null;
        try {
            int i;

            switch (iOpcion) {
            case 1: //Obtiene el tipo de liquidacion clave 81
                sQuery = " SELECT TO_CHAR(CVE_PARAM2,'00') FROM CLAVES ";
                sQuery += " WHERE CVE_NUM_CLAVE = 74";
                sQuery += " AND CVE_NUM_SEC_CLAVE = " + sCond;
                break;

            case 2: // Contratos de Inversion					
                sQuery = "SELECT DISTINCT cpr_contrato_inter FROM continte ";
                sQuery += "WHERE cpr_num_contrato = " + sCond;
                sQuery += " AND cpr_contrato_inter <> 1000 AND cpr_cve_st_contint='ACTIVO'";
                sQuery += " ORDER BY cpr_contrato_inter ASC";
                break;

            case 3: // Monedas				
                sQuery = "SELECT mon_nom_moneda FROM monedas ORDER BY mon_nom_moneda ASC";
                break;

            case 4: // Paises				
                sQuery = "SELECT distinct pai_nom_pais FROM paises ORDER BY pai_nom_pais ASC";
                break;

            case 5: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12				
                sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
                sQuery += " WHERE pfd_num_contrato=" + sCond;
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


            case 7: // PRESENTAR SOLO EL NOMBRE DE LA PERSONA, CUANDO LA FORMA DE LIQUIDACION SEA CHEQUES
                //  Y EL TIPO DE CONTABILIDAD DETALLADA						
                //						sQuery = " SELECT DISTINCT TER_NOM_TERCERO,PFD_TIPO_PERS," ;
                //						sQuery += " PFD_NUMERO_PERS,";
                //						sQuery += " TER_NOM_TERCERO";
                //						sQuery += " FROM PERFIRDI, TERCEROS";
                //						sQuery += " WHERE TER_NUM_CONTRATO=PFD_NUM_CONTRATO";
                //						sQuery += " AND PFD_NUM_CONTRATO=" + sCond;
                //						sQuery += " AND TER_NUM_TERCERO=PFD_NUMERO_PERS";
                //						sQuery += " AND PFD_TIPO_PERS<>'0'";
                //						sQuery += " AND PFD_TIPO_PERS='TERCERO'";						
                //						sQuery += " UNION ALL";
                //						sQuery += " SELECT DISTINCT BEN_NOM_BENEF, PFD_TIPO_PERS,";
                //						sQuery += " PFD_NUMERO_PERS,";
                //						sQuery += " BEN_NOM_BENEF";
                //						sQuery += " FROM PERFIRDI, BENEFICI";
                //						sQuery += " WHERE BEN_NUM_CONTRATO=PFD_NUM_CONTRATO";
                //						sQuery += " AND PFD_NUM_CONTRATO=" + sCond;
                //						sQuery += " AND BEN_BENEFICIARIO=PFD_NUMERO_PERS";
                //						sQuery += " AND PFD_TIPO_PERS<>'0'" ;
                //						sQuery += " AND PFD_TIPO_PERS='BENEFICIARIO'";						
                //						sQuery += " UNION ALL";
                sQuery = " SELECT BEN_NOM_BENEF,PIN_TIPO_PERS,";
                sQuery += " PIN_NUM_PERSONA,";
                sQuery += " BEN_NOM_BENEF";
                sQuery += " FROM PERSONASINTERNET, BENEFICI";
                sQuery += " WHERE BEN_NUM_CONTRATO=PIN_NUM_CONTRATO";
                sQuery += " AND PIN_NUM_CONTRATO=" + sCond;
                sQuery += " AND BEN_BENEFICIARIO=PIN_NUM_PERSONA";
                sQuery += " AND PIN_TIPO_PERS<>'0'";
                sQuery += " AND PIN_TIPO_PERS='BENEFICIARIO'";
                sQuery += " AND PIN_TIPO_OPERACION='RETIRO'";
                sQuery += " UNION ALL";
                sQuery += " SELECT TER_NOM_TERCERO,PIN_TIPO_PERS,";
                sQuery += " PIN_NUM_PERSONA,";
                sQuery += " TER_NOM_TERCERO";
                sQuery += " FROM PERSONASINTERNET, TERCEROS";
                sQuery += " WHERE TER_NUM_CONTRATO=PIN_NUM_CONTRATO";
                sQuery += " AND PIN_NUM_CONTRATO=" + sCond;
                sQuery += " AND TER_NUM_TERCERO=PIN_NUM_PERSONA";
                sQuery += " AND PIN_TIPO_PERS<>'0'";
                sQuery += " AND PIN_TIPO_PERS='TERCERO'";
                sQuery += " AND PIN_TIPO_OPERACION='RETIRO'";
                break;

            case 8: // Conceptos de deposito				
                sQuery = "SELECT opf_descripcion FROM operfid WHERE opf_tipo_operacion = 2 AND ";
                sQuery += " opf_num_operacion IN (SELECT oaf_num_operacion FROM opasifir WHERE";
                sQuery += " oaf_num_contrato=" + sCond + ")";
                break;

            case 9: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12				
                // Generica
                sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
                sQuery += " WHERE pfd_num_contrato=" + sCond;
                sQuery += " AND cdp_cve_banco=12 AND";
                sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
                sQuery += " and cdp_num_cuenta<>0";
                sQuery += " and cdp_estatus = 'ACEPTADA' ";
                sQuery += " order by cdp_titular ";
                break;

            case 10: //Cuentas de Bancomer para un fideicomiso clave=27, subclave=12				
                // Detallada
                sQuery = "SELECT substr(cdp_titular,1,25) || ' | ' || cdp_num_cuenta FROM cuendep, perfirdi";
                sQuery += " WHERE pfd_num_contrato=" + sCond;
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
                sQuery = "SELECT cdp_num_cuenta FROM cuendep, perfirdi";
                sQuery += " WHERE pfd_num_contrato=" + sCond;
                sQuery += " AND pfd_numero_pers <> 0 ";
                sQuery += " AND pfd_tipo_pers <> '0' ";
                sQuery += " AND cdp_cve_banco=164 AND";
                sQuery += " pfd_cve_cuendep=cdp_cve_cuendep";
                sQuery += " and cdp_num_cuenta<>0";
                break;


            case 13: //Cuentas de todos los bancos para un fideicomiso
                // Generica
                sQuery = "  SELECT  substr(cdp_titular,1,20) || ' | ' || cve_desc_clave || ' | ' || cdp_num_cuenta ";
                sQuery += " FROM cuendep, perfirdi, claves";
                sQuery += " WHERE";
                sQuery += " pfd_num_contrato=" + sCond + " AND";
                sQuery += " cve_num_clave=27 AND";
                sQuery += " pfd_cve_cuendep=cdp_cve_cuendep AND";
                sQuery += " cdp_cve_banco=cve_num_sec_clave";
                sQuery += " and cdp_num_cuenta<>0";
                sQuery += " and cdp_estatus = 'ACEPTADA'";
                sQuery += " and pfd_st = 'ACEPTADA'";
                sQuery += " order by cdp_titular ";
                break;

            case 14: //Cuentas de todos los bancos para un fideicomiso
                // Detallada
                // Se agraga la condicon de que el numero y tipo de persona <> 0
                sQuery = "  SELECT  substr(cdp_titular,1,20) || ' | ' || cve_desc_clave || ' | ' || cdp_num_cuenta ";
                sQuery += " FROM cuendep, perfirdi, claves";
                sQuery += " WHERE";
                sQuery += " pfd_num_contrato=" + sCond + " AND";
                sQuery += " pfd_numero_pers <> 0 AND";
                sQuery += " pfd_tipo_pers <> '0' AND";
                sQuery += " cve_num_clave=27 AND";
                sQuery += " pfd_cve_cuendep=cdp_cve_cuendep AND";
                sQuery += " cdp_cve_banco=cve_num_sec_clave";
                sQuery += " and cdp_num_cuenta<>0";
                sQuery += " and cdp_estatus = 'ACEPTADA'";
                sQuery += " order by cdp_titular ";
                break;

            case 15: //EJERCICIOS DE FOSEG				
                sQuery = "select distinct SAL_NUM_AUX2 from SALDOS ";
                sQuery += " where SAL_NUM_CTAM=7000 ";
                sQuery += " and SAL_NUM_AUX1=" + sCond;
                sQuery += " order by SAL_NUM_AUX2 asc";
                break;

            case 16: //EJES DE FOSEG				
                sQuery = "select  distinct S.SAL_NUM_SCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SCTA from CUENTACO C,SALDOS S";
                sQuery += " where S.SAL_NUM_CTAM=7000  ";
                sQuery += " and S.SAL_NUM_AUX1=" + sCond.substring(0, sCond.indexOf(',')).trim();
                sQuery += " and S.SAL_NUM_AUX2=" + sCond.substring(sCond.indexOf(',') + 1, sCond.length()).trim();
                sQuery += " and S.SAL_NUM_SCTA>0 and S.SAL_NUM_SSCTA=0 and S.SAL_NUM_SSSCTA=0 and S.SAL_NUM_SSSSCTA=0 ";
                sQuery += " and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
                sQuery += " and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA ";
                sQuery += " and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
                sQuery += " order by S.SAL_NUM_SCTA  asc";
                break;

            case 17: //PROGRAMAS DEL EJE DE FOSEG
                sQuery = "select distinct  S.SAL_NUM_SSCTA|| ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSCTA from CUENTACO C,SALDOS S";
                sQuery += " where S.SAL_NUM_CTAM=7000  ";
                sQuery += " and S.SAL_NUM_AUX1=" + sCond.substring(0, sCond.indexOf(',')).trim();
                sQuery += " and S.SAL_NUM_AUX2=" + sCond.substring(sCond.indexOf(',') + 1, sCond.indexOf(':')).trim();
                sQuery += " and S.SAL_NUM_SCTA=" + sCond.substring(sCond.indexOf(':') + 1, sCond.length()).trim();
                sQuery += " and S.SAL_NUM_SSCTA<>0 and S.SAL_NUM_SSSCTA=0 and S.SAL_NUM_SSSSCTA=0 ";
                sQuery += " and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
                sQuery += " and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
                sQuery += " and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
                sQuery += " order by S.SAL_NUM_SSCTA  asc";
                break;

            case 18: //PROYECTOS DEL PROGRAMA DEL EJE DE FOSEG
                sQuery = "select  distinct S.SAL_NUM_SSSCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSSCTA from CUENTACO C,SALDOS S";
                sQuery += " where S.SAL_NUM_CTAM=7000  ";
                sQuery += " and S.SAL_NUM_AUX1=" + sCond.substring(0, sCond.indexOf(',')).trim();
                sQuery += " and S.SAL_NUM_AUX2=" + sCond.substring(sCond.indexOf(',') + 1, sCond.indexOf(':')).trim();
                sQuery += " and S.SAL_NUM_SCTA=" + sCond.substring(sCond.indexOf(':') + 1, sCond.indexOf("-")).trim();
                sQuery += " and S.SAL_NUM_SSCTA=" + sCond.substring(sCond.indexOf('-') + 1, sCond.length()).trim();
                sQuery += " and S.SAL_NUM_SSSCTA<>0 and S.SAL_NUM_SSSSCTA=0 ";
                sQuery += " and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
                sQuery += " and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
                sQuery += " and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
                sQuery += " order by S.SAL_NUM_SSSCTA  asc";
                break;

            case 19: //ACCIONES DEL PROYECTO DEL PROGRAMA DEL EJE DE FOSEG				
                sQuery = "select  distinct S.SAL_NUM_SSSSCTA || ' - ' || C.CUE_NOM_CTA, S.SAL_NUM_SSSSCTA from CUENTACO C,SALDOS S";
                sQuery += " where S.SAL_NUM_CTAM=7000  ";
                sQuery += " and S.SAL_NUM_AUX1=" + sCond.substring(0, sCond.indexOf(',')).trim();
                sQuery += " and S.SAL_NUM_AUX2=" + sCond.substring(sCond.indexOf(',') + 1, sCond.indexOf(':')).trim();
                sQuery += " and S.SAL_NUM_SCTA=" + sCond.substring(sCond.indexOf(':') + 1, sCond.indexOf("-")).trim();
                sQuery += " and S.SAL_NUM_SSCTA=" + sCond.substring(sCond.indexOf('-') + 1, sCond.indexOf('_')).trim();
                sQuery += " and S.SAL_NUM_SSSCTA=" + sCond.substring(sCond.indexOf('_') + 1, sCond.length()).trim() + " and S.SAL_NUM_SSSSCTA<>0 ";
                sQuery += " and S.SAL_NUM_CTAM=C.CUE_NUM_CTAM and S.SAL_NUM_SCTA=C.CUE_NUM_SCTA ";
                sQuery += " and S.SAL_NUM_SSCTA=C.CUE_NUM_SSCTA and S.SAL_NUM_SSSCTA=C.CUE_NUM_SSSCTA";
                sQuery += " and S.SAL_NUM_SSSSCTA=C.CUE_NUM_SSSSCTA ";
                sQuery += " order by S.SAL_NUM_SSSSCTA asc";
                break;
            case 20: //PROGRAMAS FOSEG
                sQuery = "select TO_CHAR(CVE_NUM_SEC_CLAVE,'00') from claves ";
                sQuery += " where 	  CVE_NUM_CLAVE = 128 ";
                sQuery += " and   CVE_PARAM1 = " + sCond;
                break;

            case 21: //PROGRAMAS FOSEG
                sQuery =
                    " SELECT NVL(CVE_PARAM2,0) " + " FROM OPASIFIR, CLAVES " + " WHERE OAF_NUM_CLAVE  = CVE_NUM_CLAVE " + " AND OAF_NUM_OPERACION = CVE_NUM_SEC_CLAVE " +
                    " AND OAF_NUM_CONTRATO = " + sCond + " AND OAF_NUM_CLAVE = 128" + " ORDER BY CVE_DESC_CLAVE";
                break;

            case 22: //NUMERO SECUENCIAL CLAVE 83
                sQuery = " SELECT CVE_NUM_SEC_CLAVE " + " FROM CLAVES " + " WHERE CVE_NUM_CLAVE = 83 " + " AND CVE_DESC_CLAVE = '" + sCond + "'";
                break;
            }
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return sData;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return sData;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next()) {
                rsQuery.last();
                sData = new String[rsQuery.getRow()];
                rsQuery.first();
                i = 0;
                do {
                    sData[i] = rsQuery.getString(1);
                    i++;
                } while (rsQuery.next());
            }

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return sData;
    }


    /*
SISTEMA: FIDUCIAWEB
clase:FiduciaBD
Creado por:


Fecha: Mayo  del 2005
Modificada por:

Fecha: Agosto 2004			
*/

    // Formas de liquidacion
    public String[][] getDataFormas(int iOpcion, String sCont, String sCond) {
        String[][] sData = null;
        int i;
        try {
            switch (iOpcion) {
            case 1: // Conceptos de retiro
                sQuery =
                    " SELECT TO_CHAR(OAF_NUM_OPERACION,'00'), CVE_DESC_CLAVE" + " FROM OPASIFIR, CLAVES " + " WHERE OAF_NUM_CLAVE  = CVE_NUM_CLAVE " +
                    " AND OAF_NUM_OPERACION = CVE_NUM_SEC_CLAVE " + " AND OAF_NUM_CONTRATO = " + sCont + " AND OAF_NUM_CLAVE = 128" + " ORDER BY CVE_DESC_CLAVE";
                break;

                // Formas de Liquidación
            case 2: // CONTABILIDAD GENERICA
                sQuery =
                    "SELECT DISTINCT CVE_NUM_SEC_CLAVE,CVE_PARAM1 " + " FROM PERSONASINTERNET, CLAVES" + " WHERE CVE_NUM_CLAVE=74 " + " AND (PIN_FORMA_LIQ=CVE_NUM_SEC_CLAVE " +
                    " OR CVE_NUM_SEC_CLAVE = 21) " + " AND PIN_NUM_CONTRATO = " + sCont;
                break;

            case 3: // CONTABILIDAD DETALLADA
                sQuery =
                    " SELECT DISTINCT CVE_NUM_SEC_CLAVE,CVE_PARAM1 " + " FROM CLAVES " + " WHERE CVE_NUM_CLAVE=74 " + " AND CVE_PARAM1 IS NOT NULL " +
                    " AND CVE_CVE_ST_CLAVE = 'ACTIVO' " + sCond;
                break;


            case 4: // Numero y tipo de persona  Tipo Cheque
                // Generica
                sQuery = " SELECT PIN_NUM_PERSONA, DECODE(PIN_TIPO_PERS,'TERCERO','2','1')";
                sQuery += " FROM PERSONASINTERNET";
                sQuery += " WHERE PIN_NUM_CONTRATO = " + sCont;
                sQuery += " AND PIN_FORMA_LIQ = " + sCond;
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
                sQuery += " AND PIN_FORMA_LIQ = " + sCond;
                break;

            case 7: // Numero y tipo de persona, Diferentes de Cheque
                // Detallada
                sQuery = " SELECT PFD_NUMERO_PERS, decode(PFD_TIPO_PERS,'TERCERO',2,'1') ";
                sQuery += " FROM CUENDEP, PERFIRDI ";
                sQuery += " WHERE PFD_NUM_CONTRATO = " + sCont;
                //sQuery += " AND CDP_CVE_BANCO=164 " ;
                sQuery += " AND PFD_CVE_CUENDEP=CDP_CVE_CUENDEP ";
                sQuery += " AND CDP_NUM_CUENTA<>0 ";
                sQuery += " AND CDP_NUM_CUENTA = " + sCond;
                break;

            case 8: // Numero y tipo de persona, Diferentes de Cheque
                // Del_rubro , entidad Financiera
                sQuery = " SELECT DECODE(CPR_ENTIDAD_FIN,1,20,28), CPR_ENTIDAD_FIN ";
                sQuery += " FROM  CONTINTE ";
                sQuery += " WHERE CPR_NUM_CONTRATO = " + sCont;
                //sQuery += " AND CPR_SUB_CONTRATO =0 " ;
                sQuery += " AND CPR_CONTRATO_INTER = " + sCond;
                break;

                // Formas de Liquidación
            case 12: // CONTABILIDAD GENERICA
                // Para TBC Bancomer y Pago en Ventanilla
                sQuery =
                    "SELECT DISTINCT DECODE(CVE_NUM_SEC_CLAVE,3,22,CVE_NUM_SEC_CLAVE), DECODE(CVE_NUM_SEC_CLAVE,3,'Pago en Ventanilla',CVE_PARAM1) " +
                    " FROM PERSONASINTERNET, CLAVES" + " WHERE PIN_FORMA_LIQ=CVE_NUM_SEC_CLAVE " + " AND CVE_NUM_CLAVE=74 " + " AND PIN_NUM_CONTRATO = " + sCont +
                    " AND CVE_NUM_SEC_CLAVE IN (19,3) ";
                break;

            }

            //System.out.println(sQuery);
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return sData;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return sData;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {
                rsQuery.last();
                sData = new String[rsQuery.getRow()][2];
                rsQuery.first();
                i = 0;

                do {
                    sData[i][0] = rsQuery.getString(1); // Clave
                    sData[i][1] = rsQuery.getString(2); // Descripcion				
                    i++;
                } while (rsQuery.next());
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println(sQuery);
        } finally {
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return sData;
    }


    //Consultas para obtener los datos de una cuenta	
    public String[] getDataCuenta(int iOpcion, String sCond) {
        int i;
        String sCve;
        String[] sData = new String[5];
        try {
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return sData;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return sData;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            switch (iOpcion) {
            case 1: // Cuentas de BANXICO definidas para un fideicomiso

                sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_cve_banco=164 AND cdp_estatus='ACEPTADA' AND cdp_num_cuenta=" + sCond;
                break;

            case 2: // Cuentas de BANCOMER definidas para un fideicomiso

                sQuery =
                    "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_cve_banco=12 AND cdp_estatus='ACEPTADA' AND cdp_num_cuenta=" +
                    sCond.substring(sCond.indexOf('|') + 2, sCond.length());
                break;

            case 3: // Cuentas de x Banco definidas para un fideicomiso

                sQuery = "SELECT cve_num_sec_clave FROM claves WHERE cve_num_clave=27 AND";
                sQuery += " cve_desc_clave='" + sCond.substring(sCond.indexOf('|') + 2, sCond.lastIndexOf('|') - 1) + "'";


                rsQuery = stQuery.executeQuery(sQuery);
                rsQuery.next();
                sCve = rsQuery.getString(1);

                sQuery = "SELECT cdp_cve_cuendep FROM cuendep WHERE cdp_estatus='ACEPTADA' AND cdp_cve_banco=";
                sQuery = sQuery + sCve + " AND cdp_num_cuenta=";
                sQuery = sQuery + sCond.substring(sCond.lastIndexOf('|') + 2, sCond.length());
                sCve = "";
                break;
            }

            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            sCve = rsQuery.getString(1);

            sQuery = "SELECT cdp_cve_banco,cdp_plaza,cdp_sucursal,cdp_titular,cdp_rfc";
            sQuery += " FROM cuendep WHERE cdp_estatus='ACEPTADA' AND cdp_cve_cuendep=" + sCve;
            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();

            sData[0] = (rsQuery.getString(1) == null) ? "" : rsQuery.getString(1);
            sData[1] = (rsQuery.getString(2) == null) ? "" : rsQuery.getString(2);
            sData[2] = (rsQuery.getString(3) == null) ? "" : rsQuery.getString(3);
            sData[3] = (rsQuery.getString(4) == null) ? "" : rsQuery.getString(4);
            sData[4] = (rsQuery.getString(5) == null) ? "" : rsQuery.getString(5);

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {

            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return sData;
    }


    public String obtenNumTercero(String iNumFid) {
        String sNumTercero = "";
        try {
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return "";
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return "";

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT MAX(TER_NUM_TERCERO) + 1 " + " FROM TERCEROS" + " WHERE TER_NUM_CONTRATO = " + iNumFid;
            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next())
                sNumTercero = rsQuery.getString(1);
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Excepción en obtenNumTercero");
        } finally {
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
                System.out.println("Excepción del Finally");
            }
        }
        return sNumTercero;
    }

    public boolean insertaTercero(String iNumFid, String sNumTercero, String sPersona, String fecha) {
        String queryPersona = "";
        Statement stInstrucc = null;
        Statement stQuery = null;
        ResultSet rsQuery = null;
        int dia, mes, anio;
        int numTercero = 0;
        dia = Integer.parseInt(fecha.substring(0, 2)); //dia
        mes = Integer.parseInt(fecha.substring(3, 5)); //mes
        anio = Integer.parseInt(fecha.substring(6, 10)); //año

        try {

            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stInstrucc = conBD.createStatement();

            queryPersona =
                "INSERT INTO TERCEROS (" + " TER_NUM_CONTRATO," + " TER_NUM_TERCERO, " + " TER_NUM_PAIS, " + " TER_NUM_RAMA, " + " TER_NUM_SRAMA, " + " TER_CVE_MIGRATORIA, " +
                " TER_CVE_SEXO, " + " TER_CVE_TIPO_PERS," + " TER_NOM_TERCERO," + " TER_RFC," + " TER_NOM_NACIONAL," + " TER_NUM_LADA_CASA," + " TER_NUM_TELEF_CASA," +
                " TER_NUM_LADA_OFIC," + " TER_NUM_TELEF_OFIC," + " TER_NUM_EXT_OFIC," + " TER_NUM_LADA_FAX," + " TER_NUM_TELEF_FAX," + " TER_NUM_EXT_FAX," + " TER_ANO_ALTA_REG," +
                " TER_MES_ALTA_REG," + " TER_DIA_ALTA_REG," + " TER_ANO_ULT_MOD, " + " TER_MES_ULT_MOD, " + " TER_DIA_ULT_MOD, " + " TER_CVE_ST_TERCERO " + " ) VALUES (" +
                iNumFid + "," + sNumTercero + "," + "0," + "37," + "0," + "''," + "''," + "'INTERNET_CHEQUE'," + "'" + sPersona + "'," + "''," + "''," + "''," + "''," + "''," +
                "''," + "''," + "''," + "''," + "''," + anio + "," + mes + "," + dia + "," + anio + "," + mes + "," + dia + "," + "'ACTIVO')";
            stInstrucc.executeUpdate(queryPersona);


            queryPersona = " SELECT TER_NUM_TERCERO";
            queryPersona += " FROM TERCEROS ";
            queryPersona += " WHERE TER_NUM_CONTRATO = " + iNumFid;
            queryPersona += " AND TER_NOM_TERCERO = '" + sPersona + "'";
            queryPersona += " AND TER_CVE_ST_TERCERO  = 'ACTIVO' ";
            rsQuery = stQuery.executeQuery(queryPersona);


            if (rsQuery.next())
                numTercero = rsQuery.getInt(1);

            queryPersona = " INSERT INTO PERSONASINTERNET (";
            queryPersona += " PIN_NUM_CONTRATO,PIN_NUM_PERSONA, PIN_TIPO_PERS,";
            queryPersona += " PIN_FORMA_LIQ,PIN_TIPO_OPERACION ) ";
            queryPersona += " VALUES( " + iNumFid + "," + numTercero + "," + "'TERCERO',";
            queryPersona += " 3,'RETIRO')";
            stInstrucc.executeUpdate(queryPersona);
        } catch (Exception ex) {
            System.out.println("Metodo: insertaTercero");
            System.out.println("Error: \n" + ex);
        } finally {
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println("rsQuery" + ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                System.out.println("stQuery" + ex);
            }
            try {
                if (stInstrucc != null)
                    stInstrucc.close();
            } catch (Exception ex) {
                System.out.println("Funcion: insertaTerceros");
                System.out.println(ex);
            }
            try {
                if (conBD != null)
                    CloseBD();
            } catch (Exception ex) {
                System.out.println("Funcion: insertaTercero");
                System.out.println(ex);
            }
        }
        return true;
    }

    ///   ******  Fin de Metodos  ***** /////

    ///   Fin de Clase 		

    /*
	Metodo: getSaldoDisponibleAcuerdoCT
	Funcion: Regresa el saldo disponible de un Acuerdo del Comite Técnico
	Autor: Jannett Jimènez Ruiz
	Fecha:20/02/2006
	Parametros:(String numFiso,
				String fechaSesion,
				String tipoSesion,
				String noAcuerdo)
	*/
    public double getSaldoDisponibleAcuerdoCT(int numFiso, String fechaSesion, String tipoSesion, String noAcuerdo) {
        double impDisponible = 0;
        try {

            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return -1;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return -1;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery =
                " select a.acu_monto_disponible" + " from fiducia.acuerdos_ct a" + " where " + " a.ses_num_contrato = " + numFiso + " and a.ses_fecha = to_date('" + fechaSesion +
                "','dd/mm/yyyy')" + " and a.ses_tipo = '" + tipoSesion + "'" + " and a.acu_id ='" + noAcuerdo + "'";

            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next()) {
                impDisponible = rsQuery.getDouble(1);
            }


        } catch (Exception ex) {
            System.out.println(ex + "\n CONSULTA:\n" + ex);

        } finally {
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return impDisponible;
    }
}
