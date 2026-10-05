package mx.com.inscitech.cuentas.individuales.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;

public class TransferenciaElectronica extends nConsultas {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransferenciaElectronica.class);

    
    private LoggingService logger = null;
    
    private Connection conBD;

    Statement st = null;
    String sQuery;
    int NumUsuario = 0;


    public TransferenciaElectronica() {
        super();
        logger = LoggingService.getNewInstance();
        conBD = null;
    }

    /*****************************CONEXION A BASE DE DATOS**********************************/

    public boolean OpenBD() {
        try {
            conBD = ServiceLocator.getInstance()
                                  .getDatasource(ConfigurationService.getInstance().getProperty("systemDataSource"))
                                  .getConnection();
            return true;
        } catch (SQLException e) {
            LOGGER.error("Exception: ", e);
            return false;
        }
    }

    public void CloseBD() throws SQLException {
        try {
            if (conBD != null && conBD.isClosed() == false)
                conBD.close();
        } catch (SQLException e) {
            LOGGER.error("Exception: ", e);
        }
    }

    /************************ FIN METODOS DE CONEXION A BASE DE DATOS**********************/

    /********************************** ESCRIBE EN LA TABLA *******************************/

    public boolean registraCuenta(String folio, String cveCuendep, String numUsuario, String fideicomiso, String cuenta, String banco, String plaza, String sucursal,
                                  String titular, String rfc, boolean validacion, String sStatus, String detBitacora) {

        boolean bCta = false;
        int iRows = 0;
        boolean bValidaAsignacion = validaAsignacion(cveCuendep, fideicomiso);
        try {

            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conBD.setAutoCommit(false);
            if (validacion == true) //ALTA CUENTA NUEVA
            {
                sQuery =
                    " INSERT INTO " + " CUENDEP(" + " CDP_CVE_CUENDEP," + " CDP_CVE_BANCO," + " CDP_NUM_CUENTA, " + " CDP_PLAZA," + " CDP_SUCURSAL," + " CDP_TITULAR, " +
                    " CDP_RFC," + " CDP_ESTATUS ) " + " VALUES( " + cveCuendep + "," + banco + ", '" + cuenta + "'," + "'0'," + "'0'," + "'" + titular + "'," + "'" + rfc + "'," +
                    "'" + sStatus + "'" //MOD:20/10/2006
                    + ")";

                iRows = st.executeUpdate(sQuery);
            } else {
                iRows = 1; // LA CUENTA YA ESTA REGISTRADA EN LA BASE DE DATOS	
            }


            if (bValidaAsignacion) // SI LA ASIGNACION EXISTE CANCELADA O RECHAZADA
            {

                sQuery =
                    " UPDATE PERFIRDI SET  " + "  PFD_USU_SOLICIT='" + numUsuario + "'" + " ,PFD_FECHA_ULT_MOD=sysdate" + " ,PFD_ST='" + sStatus + "'" + " WHERE " +
                    " PFD_NUM_CONTRATO = " + fideicomiso + " AND " + " PFD_CVE_CUENDEP = " + cveCuendep;

            } else {

                sQuery =
                    " INSERT INTO PERFIRDI( PFD_NUM_CONTRATO, PFD_NUMERO_PERS, PFD_TIPO_PERS, " + " PFD_NOMBRE_FIRMA, PFD_UBICACION_FIRMA, PFD_SUB_CONTRATO, PFD_CTO_INTER," +
                    " PFD_NUM_INTERMED, PFD_CVE_CUENDEP, PFD_DESCRIPCION, PFD_USU_SOLICIT,PFD_FOLIO,PFD_FECHA_ALTA,PFD_FECHA_ULT_MOD,PFD_ST) " + " VALUES( " + fideicomiso +
                    ", 0 , '0' , '0' , '0' , 0 , 0 , 0 ," + cveCuendep + ", '0','" + numUsuario + "'," + folio + ",sysdate,sysdate,'" + sStatus + "')";

            }


            if (iRows > 0)
                iRows = st.executeUpdate(sQuery);


            //Recuperacion de numero de usuario
            //se graba en bitacora
            sQuery =
                "INSERT INTO BITACORA (" + " BIT_ANO_TRANSAC," + " BIT_MES_TRANSAC," + " BIT_DIA_TRANSAC," + " BIT_HORA_TRANSAC," + " BIT_MIN_TRANSAC," + " BIT_SEG_TRANSAC," +
                " BIT_ID_TERMINAL," + " BIT_NUM_USUARIO," + " BIT_NOM_PGM," + " BIT_CVE_FUNCION," + " BIT_DET_BITACORA," + " BIT_ANO_ALTA_REG," + " BIT_MES_ALTA_REG," +
                " BIT_DIA_ALTA_REG," + " BIT_ANO_ULT_MOD," + " BIT_MES_ULT_MOD," + " BIT_DIA_ULT_MOD," + " BIT_CVE_ST_BITACOR)" + "  VALUES (" +
                "(SELECT FCO_ANO_DIA FROM FECCONT)," + "(SELECT FCO_MES_DIA FROM FECCONT)," + "(SELECT FCO_DIA_DIA FROM FECCONT)," + "TO_NUMBER(TO_CHAR(sysdate,'HH24'))," +
                "TO_NUMBER(TO_CHAR(sysdate,'MI'))," + "TO_NUMBER(TO_CHAR(sysdate,'SS'))," + "'INTERNET'," + numUsuario + "," //numUsuario
                + "'CUENTAS TEF o SPEI'," + "'ALTA CUENTA TEF O SPEI'," + "'" + (sStatus.equals("SI") ? "CAPTURA " : "SOLICITUD ALTA ") + " CUENTA, FOLIO: " + folio + " " +
                detBitacora + "'," //detalle
                + "(SELECT FCO_ANO_DIA FROM FECCONT)," + "(SELECT FCO_MES_DIA FROM FECCONT)," + "(SELECT FCO_DIA_DIA FROM FECCONT)," + "(SELECT FCO_ANO_DIA FROM FECCONT)," +
                "(SELECT FCO_MES_DIA FROM FECCONT)," + "(SELECT FCO_DIA_DIA FROM FECCONT)," + "'ACTIVO')";

            if (iRows > 0)
                iRows = st.executeUpdate(sQuery);

            if (iRows > 0) {
                LOGGER.debug("Registro de Cta con Folio:" + folio + " NO SATISFACTORIO");
                conBD.commit();
                bCta = true;
            } else {
                conBD.rollback();
                conBD.commit();
                LOGGER.debug("Registro de Cta con Folio:" + folio + " NO SATISFACTORIO");
                bCta = false;
            }
        }

        catch (Exception ex) {
            LOGGER.debug("Error en registraCuenta:" + ex);
            LOGGER.debug("Registro de Cta con Folio:" + folio + " NO SATISFACTORIO");
            LOGGER.debug(sQuery);

            try {
                conBD.rollback();
                conBD.commit();
                LOGGER.debug("rollback");
            } catch (SQLException e) {

                LOGGER.debug("Error al realizar el roll back: :" + e);
            }
            bCta = false;
        } finally {

            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.debug("Metodo: registraCuenta");
                LOGGER.error("Exception: ", ex);
            }
            try {
                conBD.setAutoCommit(false);
                CloseBD();
            } catch (Exception ex) {
                LOGGER.debug("Metodo: registraCuenta");
                LOGGER.error("Exception: ", ex);
            }
            return bCta;
        }
    }

    /******************************* ESCRIBE TABLA *********************************************/
    /*
		  public void escribeTablaPerfirdi(String folio, String fideicomiso, String cveCuendep, String usuSolicit ,String sStatus )  {
		        Statement st = null;
		    	//ResultSet rs = null;
		    	  String    sQuery;
		
		        try {
		
		
		        } catch (Exception ex){
		            LOGGER.error("Exception: ", ex);
		        } finally {
		           // try { if(rs != null ) rs.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		            try { if(st != null ) st.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		            try { CloseBD(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
		        }
		    }	/****************************** ESCRIBE TABLA PERFIRDI *********************************/


    public int existeCuenta(String NoCuenta, String fideicomiso) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery = "";
        int existeCuenta = 0;

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT COUNT (*) " + " FROM CUENDEP " + " WHERE CDP_NUM_CUENTA = '" + NoCuenta + "'" + " AND CDP_ESTATUS NOT IN ('CANCELADA','RECHAZADA')";

            rs = st.executeQuery(sQuery);
            rs.next();

            if (rs.getInt(1) == 0) {
                existeCuenta = 1; // SI NO EXISTE, REGISTRA NUEVA  CTA
            } else {

                sQuery =
                    " SELECT COUNT(*) " + " FROM  CUENDEP,PERFIRDI " + " WHERE CDP_NUM_CUENTA = '" + NoCuenta + "'" + " AND PFD_CVE_CUENDEP = CDP_CVE_CUENDEP " +
                    " AND PFD_NUM_CONTRATO = " + fideicomiso + " AND PFD_ST NOT IN ('CANCELADA','RECHAZADA')";

                rs = st.executeQuery(sQuery);
                if (rs.next()) {
                    if (rs.getInt(1) == 0) {
                        existeCuenta = 2; // SI NO ESTA ASIGNADA A ESE FISO, ASIGNA UNICAMENTE LA CTA	    	
                    } else {
                        existeCuenta = 3; // EL FISO YA TIENE ASIGNADA LA CUENTA
                    }
                }
            }

        } catch (Exception ex) {

            LOGGER.debug("Error en existeCuenta: " + ex);
            LOGGER.debug("Query:\n" + sQuery);
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return existeCuenta;
    }

    /************************************** VALIDACION ESCRITURA *******************************/


    public String DatosBanco() {
        Statement st = null;
        ResultSet rs = null;
        String sQuery;
        Vector opcionesCombo;

        StringBuffer s = new StringBuffer();

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT DISTINCT( CVE_DESC_CLAVE ), CVE_NUM_SEC_CLAVE ";
            sQuery += " FROM CLAVES ";
            sQuery += " WHERE CVE_NUM_CLAVE = 27 ";
            sQuery += " AND CVE_NUM_SEC_CLAVE NOT IN( 169, 170 ) ";

            rs = st.executeQuery(sQuery);

            while (rs.next()) {
                s.append("<option value='" + rs.getString(2) + "'>" + rs.getString(1) + "</option>");
            }

        } catch (Exception ex) {
            LOGGER.error("Exception: ", ex);
            return null;
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return s.toString();
    }

    /********************************** COMBO BANCOS ************************/

    public String claveCuenta(String cuenta) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery;
        String id = "0";
        int numId;
        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = " SELECT CDP_CVE_CUENDEP";
            sQuery += " FROM CUENDEP ";
            sQuery += " WHERE CDP_NUM_CUENTA = trim('" + cuenta + "')";
            sQuery += " AND CDP_ESTATUS NOT IN ('CANCELADA','RECHAZADA')";

            rs = st.executeQuery(sQuery);
            //SI LA CUENTA ELECTRONICA EXISTE REGRESO EL ID DE LA CUENTA	
            if (rs.next()) {
                id = Integer.toString(rs.getInt(1));
            }

        } catch (Exception ex) {
            LOGGER.debug("claveCuenta:" + ex);
            return null;
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return id;
    }

    /**************************************OBTEN CVE CUENDEP *************************/


    public String validaSt(String folio) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery = "";
        String stCta = "";

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT PFD_ST " + " FROM PERFIRDI " + " WHERE " + " PFD_FOLIO = " + folio;
            rs = st.executeQuery(sQuery);
            if (rs.next())

                stCta = rs.getString(1);


        } catch (Exception ex) {

            LOGGER.debug("Error en validaSt: " + ex);
            LOGGER.debug("Query:\n" + sQuery);
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return stCta;
    }

    /************************************** AUTORIZACION CUENTA *******************************/


    public boolean autorizaCuenta(String folio, String cveCuendep, String accion, String numUsuario, String detBitacora) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery = "";
        String stCta = "";
        int iRows = 0;
        boolean bAutorizaCuenta = false;


        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conBD.setAutoCommit(false);
            //si la cuenta tiene status de CAPTURADA se procede a acutalizarla a PENDIENTE
            sQuery = " SELECT CDP_ESTATUS " + " FROM CUENDEP " + " WHERE " + " CDP_CVE_CUENDEP = " + cveCuendep;
            rs = st.executeQuery(sQuery);
            if (rs.next()) {
                stCta = rs.getString(1);
            }

            if (stCta.equals("CAPTURADA")) {
                sQuery = " UPDATE CUENDEP SET " + " CDP_ESTATUS='" + accion + "'" + " WHERE " + " CDP_CVE_CUENDEP = " + cveCuendep;
                if (accion.equals("CANCELADA")) {
                    sQuery =
                        sQuery +
                        " AND (SELECT COUNT(1) FROM PERFIRDI P WHERE P.PFD_CVE_CUENDEP=CDP_CVE_CUENDEP AND P.PFD_ST IN ('CAPTURADA','PENDIENTE','ACEPTADA','NO ASIGNADA'))=1";
                }
                iRows = st.executeUpdate(sQuery);
            } else {
                iRows = 1; //La cuenta tiene un st Diferente a capturada	
            }


            sQuery = " UPDATE PERFIRDI SET " + " PFD_ST='" + accion + "'" + " WHERE " + " PFD_FOLIO = " + folio;


            if (iRows > 0)
                iRows = st.executeUpdate(sQuery);


            //Recuperacion de numero de usuario
            //se graba en bitacora
            sQuery =
                "INSERT INTO BITACORA (" + " BIT_ANO_TRANSAC," + " BIT_MES_TRANSAC," + " BIT_DIA_TRANSAC," + " BIT_HORA_TRANSAC," + " BIT_MIN_TRANSAC," + " BIT_SEG_TRANSAC," +
                " BIT_ID_TERMINAL," + " BIT_NUM_USUARIO," + " BIT_NOM_PGM," + " BIT_CVE_FUNCION," + " BIT_DET_BITACORA," + " BIT_ANO_ALTA_REG," + " BIT_MES_ALTA_REG," +
                " BIT_DIA_ALTA_REG," + " BIT_ANO_ULT_MOD," + " BIT_MES_ULT_MOD," + " BIT_DIA_ULT_MOD," + " BIT_CVE_ST_BITACOR)" + "  VALUES (" +
                "(SELECT FCO_ANO_DIA FROM FECCONT)," + "(SELECT FCO_MES_DIA FROM FECCONT)," + "(SELECT FCO_DIA_DIA FROM FECCONT)," + "TO_NUMBER(TO_CHAR(sysdate,'HH24'))," +
                "TO_NUMBER(TO_CHAR(sysdate,'MI'))," + "TO_NUMBER(TO_CHAR(sysdate,'SS'))," + "'INTERNET'," + numUsuario + "," //numUsuario
                + "'CUENTAS TEF o SPEI'," + "'ALTA CUENTA TEF O SPEI'," + "'" + (accion.equals("PENDIENTE") ? "SOLICITUD ALTA " : "CANCELACION DE SOLICITUD DE  ") +
                " CUENTA, FOLIO: " + folio + " " + detBitacora + "'," //detalle
                + "(SELECT FCO_ANO_DIA FROM FECCONT)," + "(SELECT FCO_MES_DIA FROM FECCONT)," + "(SELECT FCO_DIA_DIA FROM FECCONT)," + "(SELECT FCO_ANO_DIA FROM FECCONT)," +
                "(SELECT FCO_MES_DIA FROM FECCONT)," + "(SELECT FCO_DIA_DIA FROM FECCONT)," + "'ACTIVO')";

            if (iRows > 0)
                iRows = st.executeUpdate(sQuery);

            if (iRows > 0) {
                LOGGER.debug("Autorización (" + accion + ") de Cta con Folio:" + folio + "  SATISFACTORIO");
                conBD.commit();
                bAutorizaCuenta = true;
            } else {
                conBD.rollback();
                conBD.commit();
                LOGGER.debug("Autorización (" + accion + ") de Cta con Folio:" + folio + " NO SATISFACTORIO");
                bAutorizaCuenta = false;
            }


        } catch (Exception ex) {

            LOGGER.debug("Error en autorizaCuenta:" + ex);
            LOGGER.debug("Autorización (" + accion + ") de Cta con Folio:" + folio + " NO SATISFACTORIO");
            LOGGER.debug(sQuery);

            try {
                conBD.rollback();
                conBD.commit();
                LOGGER.debug("rollback");
            } catch (SQLException e) {

                LOGGER.debug("Error al realizar el roll back: :" + e);
            }
            bAutorizaCuenta = false;
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.debug("Metodo: autorizaCuenta");
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.debug("Metodo: autorizaCuenta");
                LOGGER.error("Exception: ", ex);
            }
            try {
                conBD.setAutoCommit(false);
                CloseBD();
            } catch (Exception ex) {
                LOGGER.debug("Metodo: autorizaCuenta");
                LOGGER.error("Exception: ", ex);
            }
            return bAutorizaCuenta;
        }
    }

    private boolean validaAsignacion(String cveCuendep, String fideicomiso) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery = "";
        boolean validaAsignacion = false;

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery =
                " SELECT COUNT(*) " + " FROM  CUENDEP,PERFIRDI " + " WHERE CDP_CVE_CUENDEP = " + cveCuendep + " AND PFD_CVE_CUENDEP = CDP_CVE_CUENDEP " +
                " AND PFD_NUM_CONTRATO = " + fideicomiso + " AND PFD_ST IN ('CANCELADA','RECHAZADA')";

            rs = st.executeQuery(sQuery);
            if (rs.next()) {
                if (rs.getInt(1) > 0)
                    validaAsignacion = true; // SI NO ESTA ASIGNADA A ESE FISO, ASIGNA UNICAMENTE LA CTA	    	
            }


        } catch (Exception ex) {

            LOGGER.debug("Error en existeCuenta: " + ex);
            LOGGER.debug("Query:\n" + sQuery);
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return validaAsignacion;
    } /************************************** VALIDACION ESCRITURA *******************************/


    /******************************* FUNCION QUE REGRESA EL NOMBRE DEL BANCO ********************/

    /**
     *CREADA POR: ING. JANNETT JIMENEZ RUIZ
     *FECHA:17/11/2006
     **/

    public String getBanco(int cve) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery;
        String getBanco = null;

        StringBuffer s = new StringBuffer();

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery =
                " SELECT DISTINCT( CVE_DESC_CLAVE ) as nombreBanco " + " FROM CLAVES " + " WHERE CVE_NUM_CLAVE = 27 " + " AND CVE_NUM_SEC_CLAVE NOT IN( 169, 170 ) " +
                " AND CVE_NUM_SEC_CLAVE=" + cve;

            rs = st.executeQuery(sQuery);

            if (rs.next()) {
                getBanco = rs.getString("nombreBanco");
            }


        }

        catch (Exception ex) {
            LOGGER.error("Exception: ", ex);
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return getBanco;
    }

    /********************************** NOMBRE BANCO ************************/


    public boolean validaCta(String NoCuenta) {
        Statement st = null;
        ResultSet rs = null;
        String sQuery = "";
        boolean validaCta = false;

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            st = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT COUNT (*) " + " FROM CUENDEP " + " WHERE CDP_NUM_CUENTA = '" + NoCuenta + "'" + " AND CDP_ESTATUS ='ACEPTADA'";

            rs = st.executeQuery(sQuery);
            if (rs.next()) {
                if (rs.getInt(1) > 0)
                    validaCta = true; // SI NO EXISTE, REGISTRA NUEVA  CTA
                else
                    validaCta = false;
            }


        } catch (Exception ex) {

            LOGGER.debug("Error en existeCuenta: " + ex);
            LOGGER.debug("Query:\n" + sQuery);
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
        return validaCta;
    } /************************************** VALIDACION ESCRITURA *******************************/


    /**************************************** TERMINA CLASE **************************************/

}

