package mx.com.inscitech.fiducia.common.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Reporte extends QueryReportes {
    private static final Logger LOGGER = LoggerFactory.getLogger(Reporte.class);

    private boolean blnDebug = true;
    public Statement st = null;
    public ResultSet rs = null;
    private PreparedStatement prepared = null;
    Connection dbConn = null;

    public void dbConnClose() {
        try {
            if (st != null)
                st.close();
        } catch (Exception ex) {
            LOGGER.debug("st" + ex);
        }
        try {
            if (rs != null)
                rs.close();
        } catch (Exception ex) {
            LOGGER.debug("rt" + ex);
        }
        try {
            if (prepared != null)
                prepared.close();
        } catch (Exception ex) {
            LOGGER.error("Exception: ", ex);
        }
        try {
            if (dbConn != null)
                dbConn.close();
        } catch (Exception ex) {
            LOGGER.error("Exception: ", ex);
        }
    }

    public synchronized ResultSet getResultSet(int opc, DatosBD db, String tabla) throws Exception, SQLException {
        int i = 0;
        Conexion c = null;
        try {
            c = new Conexion();
            dbConn = c.conectarBD();
            if (dbConn == null) {
                LOGGER.debug(this.getClass() + "-Error es nula la conexion");
                throw new Exception("0");
            } else
                st = dbConn.createStatement();

        } catch (SQLException e) {
            LOGGER.debug(this.getClass() + "->" + e);
            throw new Exception("0");
        } catch (Exception e) {
            LOGGER.debug(this.getClass() + "->" + e);
            throw new Exception("2");
        }
        try {
            switch (opc) {

                //BALANCE GENERAL
            case 1:
                LOGGER.debug("this.getStrQueryBalance(tabla): " + this.getStrQueryBalance(tabla) + " tabla: " + tabla);
                prepared = dbConn.prepareStatement(this.getStrQueryBalance(tabla));
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue()); //CTO_NUM_CONTRATO	

                if (tabla.trim()
                         .toUpperCase()
                         .equals("SALDOSH")) {
                    prepared.setInt(2, ((Integer) db.getDatoBD(1)).intValue()); //SAL_MES_MOVTO
                    prepared.setInt(3, ((Integer) db.getDatoBD(2)).intValue()); //SAL_ANO_MOVTO
                }

                rs = prepared.executeQuery();
                break;
                //BALANCE GENERAL REEXPRESADO
            case 5:
                //LOGGER.debug("this.getStrQueryBalanceReexpresado(tabla): " + this.getStrQueryBalanceReexpresado(tabla) + " tabla: " + tabla);
                prepared = dbConn.prepareStatement(this.getStrQueryBalanceReexpresado(tabla));
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue()); //CTO_NUM_CONTRATO	

                rs = prepared.executeQuery();
                break;

                //ESTADO DE RESULTADOS
            case 2:
                //LOGGER.debug("strQueryEdoRes->" + strQueryEdoRes);
                prepared = dbConn.prepareStatement(this.getStrQueryEdoRes(tabla));
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue()); //CTO_NUM_CONTRATO	

                if (tabla.trim()
                         .toUpperCase()
                         .equals("SALDOSH")) {
                    prepared.setInt(2, ((Integer) db.getDatoBD(1)).intValue()); //SAL_MES_MOVTO
                    prepared.setInt(3, ((Integer) db.getDatoBD(2)).intValue()); //SAL_ANO_MOVTO
                }

                rs = prepared.executeQuery();
                break;

                //ESTADO DE RESULTADOS POR MES
            case 3:
                //LOGGER.debug("strQueryEdoRes->" + getStrQueryEdoResMes);
                prepared = dbConn.prepareStatement(this.getStrQueryEdoResMes(tabla));
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue()); //CTO_NUM_CONTRATO	

                if (tabla.trim()
                         .toUpperCase()
                         .equals("SALDOSH")) {
                    prepared.setInt(2, ((Integer) db.getDatoBD(1)).intValue()); //SAL_MES_MOVTO
                    prepared.setInt(3, ((Integer) db.getDatoBD(2)).intValue()); //SAL_ANO_MOVTO
                }

                rs = prepared.executeQuery();
                break;

                //ESTADO DE RESULTADOS REEXPRESADOS
            case 6:
                prepared = dbConn.prepareStatement(this.getStrQueryEdoResReexpresado(tabla));
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue()); //CTO_NUM_CONTRATO	

                rs = prepared.executeQuery();
                break;


                //TIPO DE ADMINISTRACION
            case 10:
                prepared = dbConn.prepareStatement(this.getStrTipoAdmon());
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue()); //CTO_NUM_CONTRATO(NUMERO DE FISO)	
                rs = prepared.executeQuery();
                break;


                //AVISOS INTERNET
            case 11:
                prepared = dbConn.prepareStatement(this.getStrQueryAvisos());
                rs = prepared.executeQuery();
                break;


            default:
                break;
            }
            return rs;
        } catch (SQLException e) {
            LOGGER.error("Exception: ", e);
            LOGGER.debug(this.getClass() + "->" + e + "<->opcion:" + opc);
            try {
                dbConn.close();
            } catch (Exception eCon) {
                throw new Exception("1");
            }
            throw new Exception("1");
        } catch (Exception e) {
            LOGGER.debug(this.getClass() + "->" + e + "<->opcion:" + opc);
            try {
                dbConn.close();
            } catch (Exception eCon) {
                throw new Exception("1");
            }
            throw new Exception("3");
        }
    }
}
