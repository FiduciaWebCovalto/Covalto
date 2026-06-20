package mx.com.inscitech.fiducia.common.util;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Acuerdos extends QueryAcuerdos {
    public String sQuery = "";
    private boolean blnDebug = true;
    public Statement st = null;
    public ResultSet rs = null;
    private PreparedStatement prepared = null;
    public Connection dbConn = null;


    public void dbConnClose() {

        try {
            if (st != null)
                st.close();
        } catch (Exception ex) {
            System.out.println("st" + ex);
        }
        try {
            if (rs != null)
                rs.close();
        } catch (Exception ex) {
            System.out.println("rt" + ex);
        }
        try {
            if (prepared != null)
                prepared.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            if (dbConn != null)
                dbConn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    public int executeUpdate(int opc, DatosBD db) throws Exception, SQLException {
        int intNumRows = 0;
        Conexion c = null;
        //datos bitacora
        int numUsuarioBitacora = 0;
        String detalleBitacora = "";
        String funcionBitacora = "";

        try {
            c = new Conexion();

            dbConn = c.conectarBD();
            if (dbConn == null)
                System.out.println("Error es nula la conexion");
            st = dbConn.createStatement();
            dbConn.setAutoCommit(false);
        } catch (SQLException eSQL) {
            System.out.println(this.getClass() + "eSQL1:" + eSQL);
            throw new Exception("0");
        } catch (Exception e) {
            System.out.println(this.getClass() + ":e1...: " + e);
            throw new Exception("2");
        }
        try {

            switch (opc) {
                //SESIONES	
            case 1: //insert
                sQuery = strInsertSesion;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                prepared.setString(3, (String) db.getDatoBD(2));
                prepared.setString(4, (String) db.getDatoBD(3));

                numUsuarioBitacora = ((Integer) db.getDatoBD(4)).intValue();
                funcionBitacora = "REGISTRAR SESION";
                detalleBitacora = "FIDEICOMISO: " + ((Integer) db.getDatoBD(0)).intValue() + ", SESION '" + (String) db.getDatoBD(1) + "-" + (String) db.getDatoBD(2) + "'";

                break;
            case 4: //delete	
                sQuery = strDeleteSesion;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                prepared.setString(3, (String) db.getDatoBD(2));

                numUsuarioBitacora = ((Integer) db.getDatoBD(3)).intValue();
                funcionBitacora = "ELIMINAR SESION";
                detalleBitacora = "FIDEICOMISO: " + ((Integer) db.getDatoBD(0)).intValue() + ", SESION '" + (String) db.getDatoBD(1) + "-" + (String) db.getDatoBD(2) + "'";

                break;


                //ACUERDOS	

            case 11: //insert
                sQuery = strInsertAcuerdo;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                prepared.setString(3, (String) db.getDatoBD(2));
                prepared.setString(4, (String) db.getDatoBD(3));
                prepared.setString(5, (String) db.getDatoBD(4));
                prepared.setDouble(6, ((Double) db.getDatoBD(5)).doubleValue());
                prepared.setDouble(7, ((Double) db.getDatoBD(6)).doubleValue());

                numUsuarioBitacora = ((Integer) db.getDatoBD(7)).intValue();
                funcionBitacora = "REGISTRAR ACUERDO";
                detalleBitacora =
                    "FIDEICOMISO: " + ((Integer) db.getDatoBD(0)).intValue() + ", ACUERDO '" + (String) db.getDatoBD(1) + "-" + (String) db.getDatoBD(2) + "-" +
                    (String) db.getDatoBD(3) + "'";

                break;


            case 14: //delete
                sQuery = strDeleteAcuerdo;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                prepared.setString(3, (String) db.getDatoBD(2));
                prepared.setString(4, (String) db.getDatoBD(3));

                numUsuarioBitacora = ((Integer) db.getDatoBD(4)).intValue();
                funcionBitacora = "ELIMINAR ACUERDO";
                detalleBitacora =
                    "FIDEICOMISO: " + ((Integer) db.getDatoBD(0)).intValue() + ", 'ACUERDO " + (String) db.getDatoBD(1) + "-" + (String) db.getDatoBD(2) + "-" +
                    (String) db.getDatoBD(3) + "'";

                break;

            case 15: //update
                sQuery = strUpdateAcuerdo;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setString(1, (String) db.getDatoBD(4));
                prepared.setInt(2, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(3, (String) db.getDatoBD(1));
                prepared.setString(4, (String) db.getDatoBD(2));
                prepared.setString(5, (String) db.getDatoBD(3));
                numUsuarioBitacora = ((Integer) db.getDatoBD(5)).intValue();
                funcionBitacora = "CUMPLIR ACUERDO";
                detalleBitacora =
                    "FIDEICOMISO: " + ((Integer) db.getDatoBD(0)).intValue() + ", 'ACUERDO " + (String) db.getDatoBD(1) + "-" + (String) db.getDatoBD(2) + "-" +
                    (String) db.getDatoBD(3) + "'";

                break;
            }


            if (prepared != null) {
                intNumRows = prepared.executeUpdate();

                if (intNumRows <= 0) {
                    //si no realiza la actualización	
                    dbConn.rollback();
                } else {
                    sQuery = queryBitacora;
                    prepared = dbConn.prepareStatement(sQuery);
                    prepared.setInt(1, numUsuarioBitacora);
                    prepared.setString(2, funcionBitacora);
                    prepared.setString(3, detalleBitacora);
                    intNumRows = prepared.executeUpdate();
                    if (intNumRows <= 0)
                        dbConn.rollback();

                }

            }


            dbConn.commit();

            st.close();
            dbConn.close();


        }

        catch (SQLException eSQL) {
            intNumRows = 0;
            dbConn.rollback();
            dbConn.commit();
            System.out.println("intNumRows Error: " + intNumRows);
            System.out.println("Query Error: " + sQuery);
            System.out.println("Error en uSeguridad en la opcion:" + opc + "\nclase:" + this.getClass() + "\nError: " + eSQL);
            String arregloErrores[] = new String[5];
            arregloErrores[0] = "ORA-00001"; // unique constraint";
            arregloErrores[1] = "ORA-02292"; //integrity constraint
            arregloErrores[2] = "ORA-01861"; // literal";
            arregloErrores[3] = "ORA-01400"; // cannot insert NULL
            arregloErrores[4] = "ORA-00936"; // missing expression

            String errorSql = eSQL.toString();
            int intA = -1;

            try {
                System.out.println("Cerrando conexion... ");
                dbConn.close();
            } catch (Exception eCon) {
                throw new Exception("Error al Cerrar la Conexion");
            }

            for (int error = 0; error < arregloErrores.length; error++) {
                intA = errorSql.indexOf(arregloErrores[error]);

                if (intA != -1 && error == 0) {
                    intNumRows = error * (-1) - 300;
                    throw new Exception("unique constraint -300");
                }

                if (intA != -1 && error == 1) {
                    intNumRows = error * (-1) - 300;
                    throw new Exception("literal -301");
                }

                if (intA != -1 && error == 2) {
                    intNumRows = error * (-1) - 300;
                    throw new Exception("integrity constraint -302");
                }
                if (intA != -1 && error == 3) {
                    intNumRows = error * (-1) - 300;
                    throw new Exception("cannot insert NULL -303");
                }
                if (intA != -1 && error == 4) {
                    intNumRows = error * (-1) - 300;
                    throw new Exception("missing expression -304");
                }

            }
            throw new Exception(errorSql);


        } catch (Exception e) {
            System.out.println("Error en " + this.getClass().getName() + "\nError:" + e);
            try {
                System.out.println("Cerrando conexion... ");
                dbConn.close();
            } catch (Exception eCon) {
                throw new Exception("No se pudo Cerrar la Conexion");
            }
            throw new Exception("300");
        } finally {
            return intNumRows;
        }


    }


    public ResultSet getResultSet(int opc, DatosBD db) throws Exception, SQLException {

        int i = 0;
        Conexion c = null;
        try {
            c = new Conexion();
            dbConn = c.conectarBD();
            if (dbConn == null)
                System.out.println("Error es nula la conexion");
            else
                st = dbConn.createStatement();

        } catch (SQLException eSQL) {
            System.out.println(this.getClass() + "eSQL1:" + eSQL);
            throw new Exception("0");
        } catch (Exception e) {
            System.out.println(this.getClass() + ":e1...: " + e);
            throw new Exception("2");
        }
        try {

            switch (opc) {

            case 0: //VERIFICA SI EL FIDEICOMISO TIENE COMITE TECNICO

                sQuery = strExisteComiteTecnico;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                break;

                //CALENDARIO DE SesionES DE COMITE TECNICO
            case 1: // Todas
                sQuery = strQuerySesion;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                //prepared.setQueryTimeout (20);
                break;
            case 2: //Fecha
                sQuery = strQuerySesion + sAndFecha;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                break;
            case 3: //Tipo
                sQuery = strQuerySesion + sAndTipo;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                break;
            case 4: //Asunto
                sQuery = strQuerySesion + sAndAsunto + " trim(upper('%" + (String) db.getDatoBD(1) + "%'))";
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                //prepared.setString(2,(String)db.getDatoBD(1));
                break;

            case 5: //Fecha,Tipo		
                sQuery = strQuerySesion + sAndFecha + sAndTipo;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                prepared.setString(3, (String) db.getDatoBD(2));
                break;

                //Acuerdos por Sesion	

            case 10: //Fecha y Tipo de Sesion
                sQuery = strQueryAcuerdo + sAndFechaA + sAndTipoA;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                prepared.setString(3, (String) db.getDatoBD(2));
                break;


            case 11: //Todas
                sQuery = strQueryAcuerdo;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                break;


            case 12: //Fecha
                sQuery = strQueryAcuerdo + sAndFechaA;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                break;

            case 13: //Tipo de Sesion
                sQuery = strQueryAcuerdo + sAndTipoA;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));

                break;

            case 14: //Acuerdo
                sQuery = strQueryAcuerdo + sAndIdA + " trim(upper('%" + (String) db.getDatoBD(1) + "%'))";
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                //	prepared.setString(2,(String)db.getDatoBD(1));

                break;

            case 15: //Status
                sQuery = strQueryAcuerdo + sAndStatusA;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));
                break;

            case 101:

                sQuery = strQueryAcuerdo + sAndStatusDif + strIdAcuerdosOrder;
                prepared = dbConn.prepareStatement(sQuery);
                prepared.setInt(1, ((Integer) db.getDatoBD(0)).intValue());
                prepared.setString(2, (String) db.getDatoBD(1));

                break;


            default:
                break;

            }
            if (prepared != null)
                rs = prepared.executeQuery();
            return rs;
        } catch (SQLException eSQL) {
            System.out.println(this.getClass() + ":eSQL2: " + eSQL);
            System.out.println("QUERY:\n" + sQuery);
            try {
                System.out.println("Cerrando conexion... ");
                dbConn.close();
            } catch (Exception eCon) {
                throw new Exception("1");
            }
            throw new Exception("1");
        } catch (Exception e) {
            System.out.println(this.getClass() + ":e2: " + e);
            try {
                System.out.println("Cerrando conexion... ");
                dbConn.close();
            } catch (Exception eCon) {
                throw new Exception("1");
            }
            throw new Exception("3");
        }

    }

}
