package mx.com.inscitech.CtasIndiv.negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Locale;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;

public class nFiducia {
    public Connection conBD;
    public Statement stQuery;
    public ResultSet rsQuery;
    public ResultSet rsQuery_Secuen;
    public Statement stQuery_Secuen;
    public Statement stInstrucc;
    public String sQuery;
    public String sInstrucc;
    public int iRows;
    public NumberFormat nfFormato;
    public Statement stSaldo;
    public DecimalFormat dfFormat;
    public String sMensaje;
    public PreparedStatement pstQuery;

    public nFiducia() {
        conBD = null;
        stQuery = null;
        stInstrucc = null;
        stQuery_Secuen = null;
        rsQuery_Secuen = null;
        rsQuery = null;
        sQuery = null;
        sInstrucc = null;
        nfFormato = NumberFormat.getCurrencyInstance(Locale.US);
        dfFormat = new DecimalFormat("###,###,###,##0.00");
        sMensaje = "";

        DriverIni();
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
            System.out.print(e);
            return false;
        }
    }

    public void CloseBD() throws SQLException {
        try {
            if (conBD != null && conBD.isClosed() == false)
                conBD.close();
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    /***************************** FIN METODOS DE CONEXION A BASE DE DATOS**************/


    /**************************** METODOS DE FECHAS ***********************************/


    public String getFecha() {
        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //sQuery="SELECT  TO_CHAR(SYSDATE,'DD/MM/YYYY') FROM DUAL";
            sQuery = "SELECT LTRIM(TO_CHAR(FCO_DIA_DIA,'00')) || '/' || ";
            sQuery += "LTRIM(TO_CHAR(FCO_MES_DIA,'00')) || '/' || ";
            sQuery += " FCO_ANO_DIA FROM FECCONT";

            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            return rsQuery.getString(1);

        } catch (Exception ex) {
            System.out.println("Error de getFecha");
            System.out.println(ex);
            return null;
        } finally {
            //System.out.println("Cerrando finally de la base de  getFecha");
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
    }

    public String fecha() {
        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery =
                "select " + " DECODE(fco_mes_dia,1,'Enero',2,'Febrero'," +
                "3,'Marzo',4,'Abril',5,'Mayo',6,'Junio',7,'Julio'," +
                "8,'Agosto',9,'Septiembre',10,'Octubre',11,'Noviembre',12,'Diciembre','Ninguno') " +
                "||' ' ||TO_CHAR(fco_dia_dia,'00') ||', '||fco_ano_dia ||' &nbsp;&nbsp;'||TO_CHAR(SYSDATE,'HH24:MI')||' hrs ' " +
                "FROM feccont ";

            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            return rsQuery.getString(1);

        } catch (Exception ex) {
            System.out.println("Error de getFecha");
            System.out.println(ex);
            return null;
        } finally {
            //System.out.println("Cerrando finally de la base de  getFecha");
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
    }

    //regresa la hora de operación
    public String getHora() {
        String HoraActual = "";
        try {
            if (conBD == null)
                if (!OpenBD())
                    return HoraActual;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return HoraActual;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = "select to_char(sysdate,'HH24:MI') from dual";
            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next()) {
                HoraActual = (rsQuery.getString(1)).trim();
                return HoraActual;
            } else
                return HoraActual;
        } catch (Exception ex) {
            System.out.println("Error de getHora");
            System.out.println(ex);
            return HoraActual;
        } finally {
            //System.out.println("Cerrando finally de la base de getHoraOperacion");
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

    }

    /*
	   31/03/2003
	   Metodo que se agrego para tener un mecanismo que permita controlar el acceso a internet
	   desde la aplicacion de fiducia
	
	   Valida que el acceso a internet este habilitado
	*/
    public boolean getAccesoInternet() {
        boolean bResult = false;
        try {
            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            /*
			sQuery = "SELECT fco_dia_dia, fco_mes_dia, fco_ano_dia FROM feccont";
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
						
			sQuery = "SELECT ctl_cve_internet FROM controla WHERE ctl_ano_control=" + rsQuery.getString(3);
			sQuery += " AND ctl_mes_control=" + rsQuery.getString(2) + " AND ctl_dia_control=" + rsQuery.getString(1);
			///	rsQuery.close();
			*/

            /*
			Modificada por: JJR
			Fecha:03/02/2005
			*/
            sQuery = "select param_valor from param_global  where param_clave=1";


            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next()) {
                if (rsQuery.getInt(1) == 1)
                    bResult = true;
            }

        } catch (Exception ex) {
            System.out.println("getAccesoInternet: " + ex);

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

            return bResult;
        }
    }

    public boolean getHorarioOperacion() {
        boolean bandera = false;
        try {
            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT fco_dia_dia, fco_mes_dia, fco_ano_dia FROM feccont";
            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();

            sQuery = "SELECT ctl_cve_internet FROM controla WHERE ctl_ano_control=" + rsQuery.getString(3);
            sQuery += " AND ctl_mes_control=" + rsQuery.getString(2) + " AND ctl_dia_control=" + rsQuery.getString(1);


            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();

            if (rsQuery.getString(1).equals("1"))
                bandera = true;


        } catch (Exception ex) {
            System.out.println("getHorarioOperacion: " + ex);

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
            return bandera;
        }
    }


    public String getFechaHabil(String sFechaHabil) {
        String[] sData = null;

        //se recuperan las fechas que sean dias festivos
        //en el mes que corresponda a la fecha de operación

        sFechaHabil = getCalcFecha(sFechaHabil, getFeriados(sFechaHabil));
        String diaHabil = "";
        try {
            //se procede a verificar si existe un fin de semana
            //posterior a la fecha de operacion

            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT TO_CHAR(TO_DATE('" + sFechaHabil + "','DD/MM/YYYY')+1, 'DY') FROM DUAL";

            rsQuery = stQuery.executeQuery(sQuery);

            rsQuery.next();

            diaHabil = (rsQuery.getString(1)).trim();


        } catch (Exception ex) {
            System.out.println("Error de getFechaHabil");
            System.out.println(ex);
            return null;
        } finally {
            //System.out.println("Cerrando finally de la base de  getFechaHabil");
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

        if (diaHabil.equals("SAT") || diaHabil.equals("SAB"))
            sFechaHabil = getCalcFecha(sFechaHabil, 2);

        //se recuperan las fechas que sean dias festivos
        //en el mes que corresponda a la fecha de operación

        sFechaHabil = getCalcFecha(sFechaHabil, getFeriados(sFechaHabil));
        sFechaHabil = getCalcFecha(sFechaHabil, 1);


        return sFechaHabil;

    }

    private int getFeriados(String sFecha) {
        String[] sData = null;
        int dias_trans = 0, dia_fecha = 0, i = 0;
        try {
            if (conBD == null)
                if (!OpenBD())
                    return 0;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return 0;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //se recuperan las fechas que sean dias festivos
            //en el mes que corresponda a la fecha de operación

            sQuery =
                "SELECT LTRIM(to_char(FER_FEC_DIA,'00')) ||'/'|| LTRIM(to_char(FER_FEC_MES,'00')) ||'/'||" +
                sFecha.substring(6, 10) + " FROM FERIADOS";
            sQuery += " where FER_FEC_MES=" + sFecha.substring(3, 5) + "";
            sQuery += " order by FER_FEC_DIA desc";

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
                i--;

                dia_fecha = Integer.valueOf(sFecha.substring(0, 2)).intValue();

                //se determina a partir de que día debe iniciar la revision
                //de los dias feriados

                while (i >= 0) {
                    //se verifica si existe algun dia festivo posterior
                    //a la fecha de operacion	

                    if (dia_fecha + 1 == Integer.valueOf(sData[i].substring(0, 2)).intValue())
                        break;
                    i--;
                }
                while (i >= 0) {
                    //se verifica si existe algun dia festivo posterior
                    //a la fecha de operacion	

                    if (dia_fecha + 1 == Integer.valueOf(sData[i].substring(0, 2)).intValue()) {
                        dias_trans++;
                        dia_fecha++;
                    } else
                        break;
                    i--;
                }
            }

            return dias_trans;
        } catch (Exception ex) {
            System.out.println("Error de getFeriados");
            System.out.println(ex);
            return 0;
        } finally {
            //System.out.println("Cerrando finally de la base de getFeriados");
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
    }


    private String getCalcFecha(String sFecha, int dias) {
        try {
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;
            stInstrucc = conBD.createStatement();
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT TO_CHAR(to_date('" + sFecha + "','DD/MM/YYYY')+" + dias + ",'DD/MM/YYYY') FROM DUAL";
            rsQuery = stQuery.executeQuery(sQuery);

            rsQuery.next();
            return rsQuery.getString(1);
        } catch (Exception ex) {
            System.out.println("Error de getCalcFecha");
            System.out.println(ex);
            return null;
        } finally {
            ////System.out.println("Cerrando finally de la base de  getCalcFecha");
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

    }

    /*
	Metodo:getFolio
	Funcion:Regresa el numero de folio a ser asigando a  instrucciones de RETIRO,DEPOSITO,TRASPASOS,PAGO DE HONORARIOS
	*/

    /*	public String getFolio_bk()
	{
		try
		{
			String sNumFolio;
			if (conBD == null) if (!OpenBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!OpenBD()) return null;
			stInstrucc = conBD.createStatement();
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sQuery="SELECT NVL(MAX(fol_num_folio),0) + 1 FROM folios WHERE fol_tipo_folio=2";
			rsQuery=stQuery.executeQuery(sQuery);
			rsQuery.next();
			sNumFolio = rsQuery.getString(1);
			sInstrucc="UPDATE FOLIOS SET fol_num_folio=" + sNumFolio + " WHERE fol_tipo_folio=2";
			iRows = stInstrucc.executeUpdate(sInstrucc);
			if (iRows>0) return sNumFolio;
			else return null;
		}
		catch (Exception ex)
		{
			System.out.println(ex);
			return null;
		}
		finally
		{
			try { if(stInstrucc!= null ) stInstrucc.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}
  */

    public String getFolio(int iTipoFolio) {
        try {
            String sNumFolio;
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;
            stInstrucc = conBD.createStatement();
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = "SELECT NVL(MAX(fol_num_folio),0) + 1 FROM folios WHERE fol_tipo_folio=" + iTipoFolio;
            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            sNumFolio = rsQuery.getString(1);
            sInstrucc = "UPDATE FOLIOS SET fol_num_folio=" + sNumFolio + " WHERE fol_tipo_folio=" + iTipoFolio;
            iRows = stInstrucc.executeUpdate(sInstrucc);
            if (iRows > 0)
                return sNumFolio;
            else
                return null;
        } catch (Exception ex) {
            System.out.println("Error de getFolio");
            System.out.println(ex);
            return null;
        } finally {
            try {
                if (stInstrucc != null)
                    stInstrucc.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
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
    }


    /*
	Metodo: getFolioFOSEG
	Funcion:Obtiene el número de folio para el movimiento de FOSEG
	Fecha:14/05/2003
	*/
    public String getFolioFOSEG() {
        try {
            String sNumFolio;
            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;
            stInstrucc = conBD.createStatement();
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = "SELECT NVL(MAX(fol_num_folio),0) + 1 FROM folios WHERE fol_tipo_folio=10";
            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            sNumFolio = rsQuery.getString(1);
            sInstrucc = "UPDATE FOLIOS SET fol_num_folio=" + sNumFolio + " WHERE fol_tipo_folio=10";
            iRows = stInstrucc.executeUpdate(sInstrucc);
            if (iRows > 0)
                return sNumFolio;
            else
                return null;
        } catch (Exception ex) {
            System.out.println("Error de getFolioFOSEG" + ex);
            return null;
        } finally {
            try {
                if (stInstrucc != null)
                    stInstrucc.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
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
    }


    //Obtiene la clave de los catalogos

    public String getKey(int iOpcion, String sCond) {
        try {
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            switch (iOpcion) {
            case 1: // Paises

                sQuery = "SELECT pai_num_pais FROM paises WHERE pai_nom_pais='" + sCond + "'";
                break;

            case 2: // Conceptos de retiro

                sQuery = "SELECT opf_num_operacion FROM operfid WHERE opf_descripcion='" + sCond + "'";
                break;

            case 3: // Monedas

                sQuery = "SELECT mon_num_pais FROM monedas WHERE mon_nom_moneda='" + sCond + "'";
                break;

            case 4: //Secuencial de la operacion rutinaria de retiro
                sQuery = "SELECT oaf_num_intermed FROM opasifir WHERE oaf_num_contrato=" + sCond;
                break;

            case 5: //clave del banco
                sQuery = "SELECT cve_num_sec_clave FROM claves WHERE cve_num_clave=27 AND";
                sQuery += " cve_desc_clave like '%" + sCond + "%'";
                break;
            }
            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next())
                return rsQuery.getString(1);
            else
                return null;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        } finally {
            //System.out.println("Cerrando base del  finally de getKey");
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
        }
    }


    public String getNumContrato(String sFiso, String origenRecursos) {

        try {

            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return null;
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = "SELECT DISTINCT cpr_contrato_inter FROM continte ";
            sQuery += "WHERE cpr_num_contrato = " + sFiso;
            sQuery += " AND  cpr_cve_orig_rec='" + origenRecursos + "'";
            sQuery += " AND cpr_contrato_inter <> 1000";
            //sQuery += " ORDER BY cpr_contrato_inter ASC";

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next()) {
                return rsQuery.getString(1);
            } else
                return "";

        } catch (Exception ex) {
            System.out.println("Error de  getNumContrato" + ex);
            System.out.println(sQuery);
            return null;
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
    }


    //verifica si existen rendimientos por asignar
    public boolean rendimientosPendientes(String sFiso, String sContrato) {
        boolean bResultado = false;
        try {

            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = " SELECT SUM(REN_IMP_X_ASIGNAR) FROM rendimi_foseg ";
            sQuery += " WHERE  REN_NUM_FID =" + sFiso;
            sQuery += " AND   REN_NUM_CONTRATO=" + sContrato;
            sQuery += " group by REN_NUM_FID,REN_NUM_CONTRATO  ";


            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next())
                if (rsQuery.getDouble(1) > 0)
                    bResultado = true;


        } catch (Exception ex) {
            System.out.println("Error de  rendimientosPendientes" + ex);
            bResultado = false;
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
            return bResultado;
        }
    }


    public double getRendimientosContrato(String sFiso, String sEjercicio, String sContrato) {

        try {

            System.out.println("entraaaa amet");
            if (conBD == null)
                if (!OpenBD())
                    return 0;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return 0;
            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sQuery = "SELECT REN_IMP_X_ASIGNAR FROM rendimi_foseg ";
            sQuery += "WHERE  REN_NUM_FID =" + sFiso;
            sQuery += " AND   REN_NUM_CONTRATO=" + sContrato;
            sQuery += " AND   REN_EJERCICIO=" + sEjercicio;


            rsQuery = stQuery.executeQuery(sQuery);
            if (rsQuery.next()) {
                return rsQuery.getDouble(1);
            } else
                return 0;

        } catch (Exception ex) {
            System.out.println("Error de  getRendimientosContrato" + ex);
            return 0;
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
    }


    /*
	FIRMAS MANCOMUNADAS
	Metodo: firmasMancomunadas
	Funcion: Determina si es un fiso con firmas mancomunadas
	Autor:Jannett Jiménez Ruiz
	Fecha: 17/07/2004
	*/

    public boolean firmasMancomunadas(String numFiso) {
        boolean firmas = false;
        try {
            if (conBD == null)
                if (!OpenBD())
                    return firmas;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return firmas;
            stQuery = conBD.createStatement();
            rsQuery =
                stQuery.executeQuery("select nvl(CTO_FIRMAS_MANCOMUNADAS,0) as firmas from CONTRATO where CTO_NUM_CONTRATO=" +
                                     numFiso);
            if (rsQuery.next()) {
                if (rsQuery.getInt("firmas") == 1)
                    firmas = true;
            }

        } catch (Exception ex) {
            System.out.println("Funcion firmasMancomunadas, Error:");
            System.out.println(ex);
        } finally {
            //System.out.println("Cerrando finally de la base de  getFolio");
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
            return firmas;
        }
    }


    // MODIFICADA PARA CONTROL DE ACCESO POR INFOTEC ENERO 2005	
    // MODIFICADA POR JANNETT JIMENEZ RUIZ 15/03/2005
    // Modificada para Incorporación al OID 15/02/2007 EOM-JJR

    public int existeUsuario(String strUsuario) {

        int numUsuario = -1;
        /*
		 *numUsuario=-1 // el usuario no esta registrado en el sistema
		 *numUsuario=-2	// el usuario no se encuentra activo
		 *numUsuario=-3 // el susuario no tiene asignados fideicomisos
		 *numUsuario>0	// numero de usuario
		 **/
        try {


            // conectandose a la base

            if (conBD == null)
                if (!OpenBD())
                    return -1;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return -1;

            //Validación del usuario

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery =
                "SELECT usu_num_usuario as numUsuario,usu_cve_st_usuario as st FROM usuarios WHERE usu_nom_usuario='" +
                strUsuario + "'";
            sQuery += "and usu_tipo_usuario = 'INTERNET' ";

            rsQuery = stQuery.executeQuery(sQuery);


            if (rsQuery.next()) {
                numUsuario = rsQuery.getInt("numUsuario");
                if (!rsQuery.getString("st").equals("ACTIVO"))
                    numUsuario = -2;
            }


            if (numUsuario > 0) {
                sQuery = "SELECT ate_num_contrato as fiso from atencion WHERE ate_ejec_atencion=" + numUsuario;
                rsQuery = stQuery.executeQuery(sQuery);
                if (!rsQuery.next())
                    numUsuario = -3;

            }


        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println(sQuery);
        } finally {

            System.out.println("Cerrando finally de la base de existeUsuario");
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (stQuery != null) {
                    stQuery.close();
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                if (conBD != null)
                    CloseBD();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return numUsuario;
    } //fin del método de validar al usuario en el sistema


    //Recupera el nombre, mail,tipo de usuario y los fideicomisos de un usuario	

    public String[] getDatosUsuario(int iNumUser) {
        String[] sData = null;
        try {
            int i;

            if (conBD == null) {

                if (!OpenBD()) {
                    return sData;
                }
            }
            if (conBD != null && conBD.isClosed() == true) {

                if (!OpenBD()) {

                    return sData;
                }

            }


            // conectandose a la base


            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


            //Recuperando los fideicomisos
            sQuery = " SELECT cto_num_contrato || ' - ' || cto_nom_contrato,usu_nom_puesto ";
            sQuery += " ,usu_token FROM usuarios, atencion, contrato WHERE usu_num_usuario=";
            sQuery += iNumUser + " AND usu_num_usuario = ate_ejec_atencion AND";
            sQuery += " cto_cve_st_contrat='ACTIVO' AND";
            sQuery += " ate_num_contrato = cto_num_contrato ORDER BY cto_num_contrato";

            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {
                rsQuery.last();
                sData = new String[rsQuery.getRow() + 4];
                rsQuery.first();
                i = 4;
                do {
                    sData[i] = rsQuery.getString(1);
                    sData[2] = rsQuery.getString(2);
                    sData[3] = rsQuery.getString(3);
                    i++;
                } while (rsQuery.next());


                //Recuperando el nombre y el email
                sQuery = "SELECT per_nom_usuario,per_nivel_estudios FROM personal WHERE per_num_usuario=" + iNumUser;

                rsQuery = stQuery.executeQuery(sQuery);

                if (rsQuery.next()) {
                    sData[0] = rsQuery.getString(1);
                    sData[1] = rsQuery.getString(2);
                }
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


    public void actualizaUltimoAcceso(int sNumUser) {
        String fecha = getFecha();
        try {

            if (OpenBD()) {

                stInstrucc = conBD.createStatement();

                sInstrucc =
                    "UPDATE usuarios SET USU_FECHA_ULT_ACCESO=to_date('" + fecha +
                    "','dd/mm/yyyy') WHERE usu_num_usuario=" + sNumUser;

                iRows = stInstrucc.executeUpdate(sInstrucc);
            }

        } catch (Exception ex) {
            System.out.println(ex);

        } finally {

            try {
                if (stInstrucc != null)
                    stInstrucc.close();
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


    /*
    Metodo:getTipoFiso
    Funcion:Determina si el fiso es un FOSEG

    */

    public boolean getTipoFiso(String numFid) {
        try {
            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "select CTO_FOSEG from CONTRATO ";
            sQuery += " where CTO_NUM_CONTRATO=" + numFid;
            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {

                if (rsQuery.getString(1).equals("S"))
                    return true;
                else
                    return false;
            } else
                return false;
        } catch (Exception ex) {
            System.out.println("getTipoFiso: " + ex);
            return false;
        } finally {
            //System.out.println("Cerrando finally de la base de getTipoFiso");
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
    }


    //Verifica si el fideicomiso maneja cuentas individuales
    public boolean ExistenCtasInd(String sNumFid) {
        try {
            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT COUNT(*)";
            sQuery += " FROM PARAM_FISOS";
            sQuery += " WHERE CTO_NUM_CONTRATO  = " + sNumFid;
            sQuery += " AND   CTAS_INDIVIDUALES = 1";
            sQuery += " AND   ESTATUS           = 'ACTIVO'";

            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            if (rsQuery.getInt(1) > 0)
                return true;
            else
                return false;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
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
    }

    //Da formato a un importe
    public String formatImporte(String Importe) {
        char temp[] = Importe.toCharArray();
        int cont = 0;
        for (int i = (Importe.length() - 1); i >= 0; i--) {
            if (temp[i] == ',') {
                for (int x = i; x > 0; x--)
                    temp[x] = temp[x - 1];
                temp[cont] = ' ';
                cont++;
            }
        }
        Importe = new String(temp);
        Importe = Importe.trim();
        return Importe;

    }

    //Obtiene el saldo actual de un contrato
    public double getSaldoActual(String sNumFid, String sCtoInv) {

        String sFechasig = null, sFechaact = null;

        sFechaact = getFecha();
        sFechasig = getFechaHabil(sFechaact);
        int i;
        double dImp = 0, dTotal = 0;

        try {

            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return 0;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return 0;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT NVL(SUM(pos_costo_historic),0) FROM posicion";
            sQuery += " WHERE pos_num_contrato=" + sNumFid;
            sQuery += " AND pos_contrato_inter=" + sCtoInv;

            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {
                dImp = rsQuery.getDouble(1);
            }

            //se valida que la fecha del reporte corresponda
            //con la fecha de operacion o del día posterior

            sQuery = "SELECT NVL(SUM(cre_imp_reporto),0) FROM conrepor WHERE cre_num_contrato=";
            sQuery += sNumFid + " AND cre_contrato_inter=" + sCtoInv + " AND cre_cve_st_conrepo = 'ACTIVO'";
            sQuery +=
                " and (to_date(to_char(CRE_DIA_VENCIM)||'/'||to_char(CRE_MES_VENCIM)||'/'||to_char(CRE_ANO_VENCIM),'DD/MM/YYYY')=to_date('" +
                sFechasig + "','DD/MM/YYYY')";
            sQuery +=
                " or to_date(to_char(CRE_DIA_VENCIM)||'/'||to_char(CRE_MES_VENCIM)||'/'||to_char(CRE_ANO_VENCIM),'DD/MM/YYYY')=to_date('" +
                sFechaact + "','DD/MM/YYYY'))";

            rsQuery = stQuery.executeQuery(sQuery);


            if (rsQuery.next()) {
                dImp = dImp + rsQuery.getDouble(1);
            }

            return dImp;

        } catch (Exception ex) {
            System.out.println("Error de getSaldoActual");
            System.out.println(ex);
            System.out.println(sQuery);
            return 0;
        } finally {
            //System.out.println("Cerrando finally de la base de getSaldoActual");
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
    }

    //valida saldos(FEDERAL,ESTATAL Y RENDIMIENTO) de un FISO del FOSEG
    public double getSaldoRecursos(String sFiso, String Ejercicio, String Eje, String Programa, String Proyecto,
                                   String Accion, String Origen, int iTipo) {
        try {

            if (conBD == null)
                if (!OpenBD())
                    return 0;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return 0;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT ";
            switch (iTipo) {
            case 1: //Disponible
                sQuery += " sal_imp_saldo_act";
                break;
            case 2: //Comprometido
                sQuery += " sal_cargos_per";
                break;
            }
            sQuery += " from  SALDOS";
            sQuery += " where SAL_NUM_CTAM=7000";
            sQuery += " and SAL_NUM_AUX1=" + sFiso;
            sQuery += " and SAL_NUM_AUX2=" + Ejercicio;
            sQuery += " and SAL_NUM_SCTA=" + Eje;
            sQuery += " and SAL_NUM_SSCTA=" + Programa;
            sQuery += " and SAL_NUM_SSSCTA=" + Proyecto;
            sQuery += " and SAL_NUM_SSSSCTA=" + Accion;
            sQuery += " and SAL_NUM_AUX3=" + Origen;

            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next())
                return rsQuery.getDouble(1);
            else
                return 0;
        } catch (Exception ex) {
            System.out.println("getSaldoRecursos: " + ex);
            return 0;
        } finally {
            //System.out.println("Cerrando finally de la base de getSaldoRecursos");
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
    }


    public int obtenNumeroCliente(String sUser) {
        int iNumUser = 0;

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT USU_NUM_USUARIO ";
            sQuery += " FROM USUARIOS ";
            sQuery += " WHERE USU_NOM_USUARIO = '" + sUser + "'";
            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {
                iNumUser = rsQuery.getInt(1);
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
        return iNumUser;
    } /*TERMINA METODO OBTEN NUMERO CLIENTE */


    /*
    Metodo: esDeposito
    Funcion: valida si el folio pertenece a un deposito
    Autor: Jannett Jimènez Ruiz
    Fecha:21/04/2005
    */
    public boolean esDeposito(String folio) {
        boolean bReturn = false;
        try {
            if (conBD == null)
                if (!OpenBD())
                    return false;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return false;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


            sQuery =
                "select " + " NVL(COUNT(1),0) " + " from  " + " instrucc " + " where " + "INS_NUM_FOLIO_INST=" + folio +
                " AND ins_cve_tipo_instr = 'RECEPCION INTERNET'";

            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next())
                if (rsQuery.getInt(1) > 0)
                    bReturn = true;


        } catch (Exception ex) {
            System.out.println("esDeposito: " + ex);

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

            return bReturn;
        }
    }

    /* Obtiene los titulos y longitud de niveles para cuentas individuales **/
    public String[] getTitulosCtasInd(String sFid) {
        String[] sData = new String[8];
        int i;
        String sCve;
        try {
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return sData;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return sData;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT TRIM(EST_NOMBRE)";
            sQuery += " FROM FID_ESTRUC_CTAS_IND";
            sQuery += " WHERE EST_CONTRATO = " + sFid;
            sQuery += " ORDER BY EST_NIVEL ASC";

            rsQuery = stQuery.executeQuery(sQuery);

            i = 1;
            if (rsQuery.next()) {
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
    } /* Fin obtiene los titulos para niveles para cuentas individuales **/

    public int[] getLenCtasInd(String sFid) {
        int[] iData = new int[8];
        int i;
        String sCve;
        try {
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return iData;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return iData;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT EST_LONG_ID";
            sQuery += " FROM FID_ESTRUC_CTAS_IND";
            sQuery += " WHERE EST_CONTRATO = " + sFid;
            sQuery += " ORDER BY EST_NIVEL ASC ";
            rsQuery = stQuery.executeQuery(sQuery);

            i = 1;
            if (rsQuery.next()) {
                do {
                    iData[i] = rsQuery.getInt(1);
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

        try {
            // conectandose a la base
            if (conBD == null)
                if (!OpenBD())
                    return iData;
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return iData;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = "SELECT SUM(EST_LONG_ID)";
            sQuery += " FROM FID_ESTRUC_CTAS_IND";
            sQuery += " WHERE EST_CONTRATO = " + sFid;
            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {
                iData[0] = rsQuery.getInt(1);
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

        return iData;
    }
    /* Fin obtiene longitud de niveles para cuentas individuales **/

    public int obtenMoviIni(String sFiso, String sFecFidIni) {
        int iNumMovIni = 0;

        try {
            if (conBD == null)
                if (!OpenBD())
                    throw new Exception();
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    throw new Exception();

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            sQuery = " SELECT COUNT(*) ";
            sQuery += " FROM FID_MOV_CTAS_IND ";
            sQuery += " WHERE MOV_FEC_OPER = TO_DATE('" + sFecFidIni + "','DD/MM/YYYY')";
            sQuery += " AND MOV_TIPO_OPER = 'I'";
            sQuery += " AND MOV_CONTRATO = " + sFiso;
            System.out.println(sQuery);
            rsQuery = stQuery.executeQuery(sQuery);

            if (rsQuery.next()) {
                iNumMovIni = rsQuery.getInt(1);
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
        return iNumMovIni;
    } /*TERMINA MÉTODO OBTEN MOVI INI */

}/*termina clase*/