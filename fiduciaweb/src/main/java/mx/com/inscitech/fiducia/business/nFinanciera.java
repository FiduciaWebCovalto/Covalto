package mx.com.inscitech.fiducia.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;

import java.text.DecimalFormat;

public class nFinanciera extends nFiducia {
    private static final Logger LOGGER = LoggerFactory.getLogger(nFinanciera.class);



    /*
 METODO: getPresupuestal
 Genera el  Reporte de Situación Programático Presupuestal de los FOSEG'S
 AUTOR: EOM Y MVM
 Modificada por: Jannett Jiménez Ruiz
 Fecha:01/09/2004
 Modificada:18/10/2004
*/
    //mevm-inicio
    private DecimalFormat num = new DecimalFormat("############0.00");

    public synchronized String getPresupuestalFoseg(String[] sData) {
        String queryFinal = "";
        try {
            int i = 0, h = 0, j = 0, tempo = 0, cont_saldo = 0;
            String sQueryTemp = null, sQueryOrdena = null;
            String[][] scad_cuentas;
            String[][] scad_conceptos;
            StringBuffer sTexto = new StringBuffer("");
            DecimalFormat dfFormat = new DecimalFormat("###,##0.00");
            DecimalFormat dfFormat2 = new DecimalFormat("0.00");
            for (i = 0; i <= 3; i++) {
                if (sData[i] == null || sData[i] == "") {
                    LOGGER.debug(this.getClass() + ".getStrContenidoHtml()->Datos no completos");
                    return null;
                }
            }
            i = 0;
            sTexto.append("<title>ESTADO DE CUENTA, Fideicomiso:  \"" + sData[0] + "\" Ejercicio: " + sData[2] + "\" " + "</title>"
                          // +  "<link rel=\"stylesheet\" href=\"styles/default.css\" type=\"text/css\">"
                          + "</head>" + "<body onLoad=\"Opcion();\">" + "<table width=\"100%\" border=\"0\">" + "<tr> " + "<td  rowspan=\"4\" >&nbsp;</td>" +
                          "<td  rowspan=\"4\" colspan=4><img src=\"imagenes/logo_bn.jpg\" ></td>" +
                          "<td colspan=14  align=\"center\"  style=\"font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;\">nacional  financiera, s.n.c.</td>" +
                          "</tr>" + "<tr>" +
                          "<td  align=center colspan=14 style=\"font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;\">Dirección  Fiduciaria</td>" +
                          "</tr>" + "<tr> " +
                          "<td align=center style=\"font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;\" colspan=14> FIDEICOMISO&nbsp;&nbsp;" + sData[0] +
                          " - " + sData[1] + "&nbsp;</td>" + "</tr>" + "<tr> " +
                          "<td align=center style=\"font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;\" colspan=14> Situación Programatica Presupuestal al " +
                          sData[3] + "</td>" + "</tr>" + "<tr>" + "<td colspan=19 >&nbsp;</td>" + "</tr>" + "<tr>" +
                          "<td>&nbsp;</td><td colspan=18 style=\"font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;\">&nbsp;&nbsp;&nbsp;EJERCICIO: " + sData[2] +
                          "</td>" + "</tr>" + "<tr class=tituloRP9  bgcolor=\"#CCCCCC\"> " + "<td align=center  bgcolor=\"#FFFFFF\"> &nbsp;</td>" +
                          "<td rowspan=\"2\" align=center>EJE</td>" + "<td rowspan=\"2\" align=center>PROG.</td>" + "<td rowspan=\"2\" align=center>PROY.</td>" +
                          "<td rowspan=\"2\" align=center>ACC.</td>" + "<td rowspan=\"2\" align=center width=\"180\">NOMBRE</td>" + "<td colspan=\"4\" align=center>FEDERAL</td>" +
                          "<td colspan=\"4\" align=center>ESTATAL</td>" + "<td colspan=\"4\" align=center>RENDIMIENTOS</td>" + "<td rowspan=\"2\" align=center>TOTAL</td>" +
                          "</tr>" + "<tr class=tituloRP9  bgcolor=\"#CCCCCC\"> " + "<td align=center bgcolor=\"#FFFFFF\"> &nbsp;</td>" + "<td  align=center>ASIGNADO</td>" +
                          "<td  align=center>EJERCIDO</td>" + "<td  align=center>COMPROMETIDO</td>" + "<td  align=center>DISPONIBLE</td>" + "<td  align=center>ASIGNADO</td>" +
                          "<td  align=center>EJERCIDO</td>" + "<td  align=center>COMPROMETIDO</td>" + "<td  align=center>DISPONIBLE</td>" + "<td  align=center>ASIGNADO</td>" +
                          "<td  align=center>EJERCIDO</td>" + "<td  align=center>COMPROMETIDO</td>" + "<td  align=center>DISPONIBLE</td>" + "</tr>");

            if (conBD == null)
                if (!OpenBD())
                    return null;
            if (conBD != null && conBD.isClosed())
                if (!OpenBD())
                    return null;

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stQuery_Secuen = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //se forma el query para las condiciones en caso de que hayan
            sQueryTemp = sData[2] != "" ? " and SAL_NUM_AUX2=" + sData[2] : "";
            sQueryTemp += sData[4] != "" ? " and SAL_NUM_AUX3=" + sData[4] : "";
            sQueryTemp += sData[5] != "" ? " and SAL_NUM_SCTA=" + sData[5] : "";
            sQueryTemp += sData[6] != "" ? " and SAL_NUM_SSCTA=" + sData[6] : "";
            sQueryTemp += sData[7] != "" ? " and SAL_NUM_SSSCTA=" + sData[7] : "";
            sQueryTemp += sData[8] != "" ? " and SAL_NUM_SSSSCTA=" + sData[8] : "";
            sQuery =
                "select " + " TO_CHAR(SAL_NUM_SCTA,'00'),TO_CHAR(SAL_NUM_SSCTA,'00')," + " TO_CHAR(SAL_NUM_SSSCTA,'00')," + " TO_CHAR(SAL_NUM_SSSSCTA,'0000')," + " CUE_NOM_CTA" +
                " from saldos,cuentaco where" + " SAL_NUM_AUX1=" + sData[0] + " and SAL_NUM_CTAM=7000" + " and SAL_NUM_SSSSSCTA=0" + " and SAL_NUM_CTAM=CUE_NUM_CTAM" +
                " and SAL_NUM_SCTA=CUE_NUM_SCTA" + " and SAL_NUM_SSCTA=CUE_NUM_SSCTA" + " and SAL_NUM_SSSCTA=CUE_NUM_SSSCTA" + " and SAL_NUM_SSSSCTA=CUE_NUM_SSSSCTA" +
                " and SAL_NUM_SSSSSCTA=CUE_NUM_SSSSSCTA";

            sQueryOrdena =
                " group by " + " SAL_NUM_SCTA,SAL_NUM_SSCTA,SAL_NUM_SSSCTA," + " SAL_NUM_SSSSCTA,CUE_NOM_CTA" +
                " ORDER BY SAL_NUM_SCTA,SAL_NUM_SSCTA,SAL_NUM_SSSCTA,SAL_NUM_SSSSCTA";


            queryFinal = sQuery + sQueryTemp + sQueryOrdena;
            rsQuery_Secuen = stQuery_Secuen.executeQuery(queryFinal);

            rsQuery_Secuen.last();
            scad_conceptos = new String[rsQuery_Secuen.getRow()][18];
            tempo = rsQuery_Secuen.getRow();
            rsQuery_Secuen.first();

            for (i = 0; i < tempo; i++) {
                scad_conceptos[i][0] = "";
                scad_conceptos[i][1] = "";
                scad_conceptos[i][2] = "";
                scad_conceptos[i][3] = "";
                scad_conceptos[i][4] = "";
                scad_conceptos[i][5] = "0.00";
                scad_conceptos[i][6] = "0.00";
                scad_conceptos[i][7] = "0.00";
                scad_conceptos[i][8] = "0.00";
                scad_conceptos[i][9] = "0.00";
                scad_conceptos[i][10] = "0.00";
                scad_conceptos[i][11] = "0.00";
                scad_conceptos[i][12] = "0.00";
                scad_conceptos[i][13] = "0.00";
                scad_conceptos[i][14] = "0.00";
                scad_conceptos[i][15] = "0.00";
                scad_conceptos[i][16] = "0.00";
                scad_conceptos[i][17] = "0.00";
            }
            do {
                scad_conceptos[j][0] = rsQuery_Secuen.getString(1);
                scad_conceptos[j][1] = rsQuery_Secuen.getString(2);
                scad_conceptos[j][2] = rsQuery_Secuen.getString(3);
                scad_conceptos[j][3] = rsQuery_Secuen.getString(4);
                scad_conceptos[j++][4] = rsQuery_Secuen.getString(5);
            } while (rsQuery_Secuen.next());

            //se recuperan los saldos
            sQuery = "select ";
            sQuery += " SUM(SAL_IMP_INI_EJE),";
            sQuery += " SUM(SAL_CARGOS_PER),";
            sQuery += " SUM(SAL_IMP_CAR_EJER),";
            sQuery += " SUM(SAL_IMP_ABO_EJER)+SUM(SAL_IMP_INI_EJE),";
            sQuery += " SUM(SAL_IMP_SALDO_ACT),";
            sQuery += " TO_CHAR(SAL_NUM_SCTA,'00'),TO_CHAR(SAL_NUM_SSCTA,'00'),";
            sQuery += " TO_CHAR(SAL_NUM_SSSCTA,'00'),";
            sQuery += " TO_CHAR(SAL_NUM_SSSSCTA,'0000'),";
            sQuery += " CUE_NOM_CTA,TO_CHAR(SAL_NUM_AUX3,'0')";
            sQuery += " from saldos,cuentaco where";
            sQuery += " SAL_NUM_AUX1=" + sData[0];
            sQuery += " and SAL_NUM_CTAM=7000";
            sQuery += " and SAL_NUM_SSSSSCTA=0";
            sQuery += " and SAL_NUM_CTAM=CUE_NUM_CTAM";
            sQuery += " and SAL_NUM_SCTA=CUE_NUM_SCTA";
            sQuery += " and SAL_NUM_SSCTA=CUE_NUM_SSCTA";
            sQuery += " and SAL_NUM_SSSCTA=CUE_NUM_SSSCTA";
            sQuery += " and SAL_NUM_SSSSCTA=CUE_NUM_SSSSCTA";
            sQuery += " and SAL_NUM_SSSSSCTA=CUE_NUM_SSSSSCTA";

            sQueryOrdena = " group by ";
            sQueryOrdena += " SAL_NUM_SCTA,SAL_NUM_SSCTA,SAL_NUM_SSSCTA,";
            sQueryOrdena += " SAL_NUM_SSSSCTA,CUE_NOM_CTA,SAL_NUM_AUX3";
            sQueryOrdena += " ORDER BY SAL_NUM_SCTA,SAL_NUM_SSCTA,SAL_NUM_SSSCTA,SAL_NUM_SSSSCTA,SAL_NUM_AUX3";
            queryFinal = sQuery + sQueryTemp + sQueryOrdena;
            rsQuery = stQuery.executeQuery(sQuery + sQueryTemp + sQueryOrdena);
            rsQuery.last();
            scad_cuentas = new String[rsQuery.getRow()][10];
            tempo = rsQuery.getRow();
            rsQuery.first();

            do {
                scad_cuentas[cont_saldo][0] = rsQuery.getString(6);
                scad_cuentas[cont_saldo][1] = rsQuery.getString(7);
                scad_cuentas[cont_saldo][2] = rsQuery.getString(8);
                scad_cuentas[cont_saldo][3] = rsQuery.getString(9);
                scad_cuentas[cont_saldo][4] = rsQuery.getString(10);
                scad_cuentas[cont_saldo][5] = String.valueOf(rsQuery.getDouble(4));
                scad_cuentas[cont_saldo][6] = String.valueOf(rsQuery.getDouble(3));
                scad_cuentas[cont_saldo][7] = String.valueOf(rsQuery.getDouble(2));
                scad_cuentas[cont_saldo][8] = String.valueOf(rsQuery.getDouble(5));
                scad_cuentas[cont_saldo++][9] = rsQuery.getString(11);
            } while (rsQuery.next());

            for (i = 0; i < cont_saldo; i++) {
                for (h = 0; h < j; h++) {
                    if (scad_conceptos[h][0].equalsIgnoreCase(scad_cuentas[i][0]) && scad_conceptos[h][1].equalsIgnoreCase(scad_cuentas[i][1]) &&
                        scad_conceptos[h][2].equalsIgnoreCase(scad_cuentas[i][2]) && scad_conceptos[h][3].equalsIgnoreCase(scad_cuentas[i][3])) {
                        if (scad_cuentas[i][9].equalsIgnoreCase(" 1")) {
                            scad_conceptos[h][5] = scad_cuentas[i][5];
                            scad_conceptos[h][6] = scad_cuentas[i][6];
                            scad_conceptos[h][7] = scad_cuentas[i][7];
                            scad_conceptos[h][8] = scad_cuentas[i][8];
                            break;
                        }
                        if (scad_cuentas[i][9].equalsIgnoreCase(" 2")) {
                            scad_conceptos[h][9] = scad_cuentas[i][5];
                            scad_conceptos[h][10] = scad_cuentas[i][6];
                            scad_conceptos[h][11] = scad_cuentas[i][7];
                            scad_conceptos[h][12] = scad_cuentas[i][8];
                            break;
                        }
                        if (scad_cuentas[i][9].equalsIgnoreCase(" 3")) {
                            scad_conceptos[h][13] = scad_cuentas[i][5];
                            scad_conceptos[h][14] = scad_cuentas[i][6];
                            scad_conceptos[h][15] = scad_cuentas[i][7];
                            scad_conceptos[h][16] = scad_cuentas[i][8];
                            break;
                        }
                    }
                }
            }

            for (i = 0; i < j; i++) {
                sTexto.append("<tr class=\"textoRP\"> ");

                sTexto.append("<td align=center> &nbsp;</td>");
                sTexto.append("<td align=center>" + scad_conceptos[i][0] + "</td>");
                sTexto.append("<td align=center>" + scad_conceptos[i][1] + "</td>");
                sTexto.append("<td align=center>" + scad_conceptos[i][2] + "</td>");
                sTexto.append("<td align=center>" + scad_conceptos[i][3] + "</td>");
                sTexto.append("<td width=\"180\">" + scad_conceptos[i][4] + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][5]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][6]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][7]).doubleValue()) + "</td>");
                sTexto.append("<td align=right class=\"tituloRP\"> " + dfFormat.format(Double.valueOf(scad_conceptos[i][8]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][9]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][10]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][11]).doubleValue()) + "</td>");
                sTexto.append("<td  align=right class=\"tituloRP\"> " + dfFormat.format(Double.valueOf(scad_conceptos[i][12]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][13]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][14]).doubleValue()) + "</td>");
                sTexto.append("<td align=right> " + dfFormat.format(Double.valueOf(scad_conceptos[i][15]).doubleValue()) + "</td>");
                sTexto.append("<td  align=right class=\"tituloRP\"> " + dfFormat.format(Double.valueOf(scad_conceptos[i][16]).doubleValue()) + "</td>");
                sTexto.append("<td  align=right class=\"tituloRP\"> " +
                              dfFormat.format(Double.valueOf(scad_conceptos[i][16]).doubleValue() + Double.valueOf(scad_conceptos[i][12]).doubleValue() +
                                              Double.valueOf(scad_conceptos[i][8]).doubleValue()) + "</td>");
                sTexto.append("</tr>");
            }
            sTexto.append("</table>");
            return sTexto.toString();
        } catch (Exception ex) {

            LOGGER.debug("Error:" + this.getClass() + ".getPresupuestal:" + ex);
            LOGGER.debug(queryFinal);
            return null;
        } finally {

            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                LOGGER.debug("rsQ: " + ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                LOGGER.debug("stQ: " + ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
    } //getPresupuestal
    //mevm-fin	


    /*
 METODO: GeneraCtasInd
 gENERA UN rEPORTE FORMATO HTML de CUENTAS INDIVIDUALES
 Autor:Betzabe Rodriguez

 	
	//Genera el estado de cuenta para los inversionistas de cuentas individuales
	//Orden de parametros:
	// 0 - Numero del Fideicomiso
	// 1 - Nombre del Fideicomiso
	// 2 - Fecha inicial
	// 3 - Fecha final
	// 4 - Entidad
	// 5 - Municipio
	// 6 - Inversionista
 Moodificada por: Jannett Jiménez Ruiz
 Fecha:01/09/2004
*/


    public String getReporteCtasInd(String[] sData, String[] sNomNivel) {
        try {
            int i = 0;
            for (i = 0; i < 8; i++) {
                if (sData[i] == null || sData[i] == "") {
                    LOGGER.debug("Datos no completos");
                    return "Datos no completos";
                }
            }

            i = 0;
            int iDia;
            int iMes;
            int iAño;

            long lLong = 0;

            String sTexto = "";
            String sNiv1 = "";
            String sNiv2 = "";
            String sNiv3 = "";
            String sClave = "";

            String sPeriodo = "";

            double dDepositos = 0;
            double dRetiros = 0;
            double dIntereses = 0;
            double dISR = 0;
            double dParticipacion = 0;
            double dSaldoParcial = 0;
            double dSaldoFinal = 0;
            double dSaldoInicial = 0;
            double dParticipa = 0;

            Date dtFecha;

            sNiv1 = sData[4].substring(0, sData[4].indexOf(" "));
            sClave = sNiv1;

            if (sData[8].equals("3")) {
                sNiv2 = sData[5].substring(0, sData[5].indexOf(" "));
                sNiv3 = sData[6].substring(0, sData[6].indexOf(" "));
                sClave += sNiv2 + sNiv3;
            } else {
                sNiv2 = sData[5];
                sNiv3 = sData[6];
            }

            CallableStatement sp_Saldos;

            //Titulo del archivo
            sTexto = "<html>";
            sTexto += "<head>";
            sTexto += "<title>ESTADO DE CUENTA, Fideicomiso: \"" + sData[0] + "\" Participante: ";

            if (sData[8].equals("3"))
                sTexto += sNiv1 + " - " + sNiv2 + " - " + sNiv3;
            else
                sTexto += sNiv1;

            sTexto += "</title>";
            sTexto += "<link rel=\"stylesheet\" href=\"styles/default.css\" type=\"text/css\">";
            sTexto += "</head>";
            sTexto += "<body oncontextmenu=\"return false\" onkeydown=\"return false\">";
            sTexto += "<table width=\"100%\" border=\"0\">";
            sTexto += "<tr><td colspan=\"2\">&nbsp;</td></tr><tr><td colspan=\"2\">&nbsp;</td></tr><tr>";
            sTexto += "<td width=\"30%\">";
            sTexto += "<img src=\"imagenes/logo_bn.jpg\" width=\"121\" height=\"68\"></td>";
            sTexto += "<td width=\"70%\" align=\"center\" class=\"texto\"><b>";
            sTexto += "nacional financiera s.n.c";
            sTexto += "<br>Direcci&oacute;n Fiduciaria<br>";
            sTexto += "Estado de Cuenta";
            sTexto += "<br>del " + sData[2] + " al " + sData[3] + "</br></b></td></tr>";
            sTexto += "<tr><td colspan=\"2\">&nbsp;</td></tr><tr><td colspan=\"2\" align=\"center\" class=\"texto\"><b>" + sData[1] + "</b></td></tr>";
            sTexto += "<tr><td colspan=\"2\">&nbsp;</td></tr>";
            sTexto += "<tr><td colspan=\"2\" align=\"left\" class=\"celda03\"><b>" + sNomNivel[1] + ": " + sData[4] + "</b></td></tr>";


            if (sData[8].equals("3")) {
                sTexto += "<tr><td colspan=\"2\" align=\"left\" class=\"celda03\"><b>" + sNomNivel[2] + ": " + sData[5] + "</b></td></tr>";
                sTexto += "<tr><td colspan=\"2\" align=\"left\" class=\"celda03\"><b>" + sNomNivel[3] + ": " + sData[6] + "</b></td></tr>";
            } else

                sTexto += "</table>";

            if (conBD == null)
                if (!OpenBD())
                    return "";
            if (conBD != null && conBD.isClosed() == true)
                if (!OpenBD())
                    return "";

            stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stQuery_Secuen = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            stInstrucc = conBD.createStatement();

            //Valida si maneja participacion
            sQuery = "SELECT NVL(PCTO_PARTICIP,0) FROM PARAM_FISOS WHERE CTO_NUM_CONTRATO = " + sData[0];
            rsQuery = stQuery.executeQuery(sQuery);
            rsQuery.next();
            dParticipa = rsQuery.getDouble(1);
            rsQuery.close();

            sQuery = "DELETE FID_SAL_CTAS_IND ";
            sQuery += " WHERE SAL_CONTRATO = " + sData[0];
            sQuery += " AND SAL_CLAVE_INV  = '" + sClave + "'";

            iRows = stInstrucc.executeUpdate(sQuery);
            /*
			//Ejecutar el store procedure
			sp_Saldos = conBD.prepareCall( "{CALL sp_Act_Sal_Ctas_Ind(?,?,?,?,?,?)}" );
			sp_Saldos.clearParameters();

			
			sp_Saldos.setInt(1,Integer.parseInt(sData[0]));


      iAño = Integer.parseInt(sData[2].substring(6,10));
      iMes = Integer.parseInt(sData[2].substring(3,5));
      iDia = Integer.parseInt(sData[2].substring(0,2));
      dtFecha = new Date(iAño-1900, iMes - 1, 1);
 	  String FechaStr = "01/"+sData[2].substring(3,5)+"/"+sData[2].substring(6,10);
      sp_Saldos.setString(2, FechaStr);
	

      LOGGER.debug("Fecha del en formato correcto "+FechaStr);        	
	
	
      iAño = Integer.parseInt(sData[3].substring(6,10));
      iMes = Integer.parseInt(sData[3].substring(3,5));
      iDia = Integer.parseInt(sData[3].substring(0,2));
      dtFecha = new Date(iAño - 1900, iMes - 1, iDia);
      String FechaStr1 = sData[3].substring(0,2)+"/"+sData[3].substring(3,5)+"/"+sData[3].substring(6,10);
	  sp_Saldos.setString(3,FechaStr1);
	
	  LOGGER.debug("Fecha al en formato correcto "+FechaStr1);        	

			sp_Saldos.setString(4,sClave);
			sp_Saldos.setString(5,sClave);
			sp_Saldos.setString(6,"FALSE");
			LOGGER.debug("Inversionista "+sClave);

			//sp_Saldos.execute();
	*/
            String FechaStr = "01/" + sData[2].substring(3, 5) + "/" + sData[2].substring(6, 10);
            String FechaStr1 = sData[3].substring(0, 2) + "/" + sData[3].substring(3, 5) + "/" + sData[3].substring(6, 10);
            stInstrucc = conBD.createStatement();
            String sInstrucc =
                "BEGIN " + "SP_ACT_SAL_CTAS_IND(" + sData[0] + "," + "'" + FechaStr + "'," + "'" + FechaStr1 + "'," + "'" + sClave + "'," + "'" + sClave + "'," + "'FALSE'); " +
                "END;";
            iRows = stInstrucc.executeUpdate(sInstrucc); //inserta en instrucc
            conBD.commit();
            stInstrucc.close();
            LOGGER.debug("Instruccion completa de store " + sInstrucc);
            LOGGER.debug("Prueba" + FechaStr + "Prueba");
            LOGGER.debug("Prueba" + FechaStr1 + "Prueba");

            //Obtener los datos
            sQuery = "SELECT TO_CHAR(SAL_FECHA_OPERA,'DD/MM/YYYY')";
            sQuery += "    , SAL_TASA";
            sQuery += "    , SAL_DEPOSITOS";
            sQuery += "    , SAL_RETIROS";
            sQuery += "    , SAL_INTERESES";
            sQuery += "    , SAL_ISR";
            sQuery += "    , SAL_SALDO_PARCIAL";
            sQuery += "    , SAL_SALDO_INICIAL";
            sQuery += " FROM FID_SAL_CTAS_IND";
            sQuery += " WHERE SAL_CONTRATO = " + sData[0];
            sQuery += " AND SAL_CLAVE_INV  = '" + sClave + "'";
            sQuery += " ORDER BY TO_DATE(SAL_FECHA_OPERA,'DD/MM/YYYY') ASC";

            LOGGER.debug("Fideicomiso " + sData[0]);
            LOGGER.debug("Inversionista " + sClave);

            rsQuery = stQuery.executeQuery(sQuery);

            sTexto += "<table width=\"100%\" border=\"0\">";

            sTexto += "<tr><td colspan=\"9\">&nbsp;</td></tr>";

            sTexto += "<tr>";
            sTexto += "<td align=\"center\" class=\"celda02\"><b>Fecha</b></td>";
            sTexto += "<td align=\"center\" class=\"celda02\"><b>Tasa</b></td>";
            sTexto += "<td align=\"center\" class=\"celda02\"><b>Dep&oacute;sitos</b></td>";
            sTexto += "<td align=\"center\" class=\"celda02\"><b>Retiros</b></td>";
            sTexto += "<td align=\"center\" class=\"celda02\"><b>Intereses</b></td>";
            sTexto += "<td align=\"center\" class=\"celda02\"><b>ISR</b></td>";

            if (dParticipa > 0.001) {
                sTexto += "<td align=\"center\" class=\"celda02\"><b>Saldo Parcial</b></td>";
                sTexto += "<td align=\"center\" class=\"celda02\"><b>Partic.</b></td>";
            }

            sTexto += "<td align=\"center\"class=\"celda02\"><b>Saldo Final</b></td>";
            sTexto += "</tr>";

            if (rsQuery.next()) {
                dSaldoInicial = rsQuery.getDouble(8);
                do {
                    /*sTexto += "<tr><td colspan=\"9\">&nbsp;</td></tr>";*/
                    sTexto += "<tr>";
                    sTexto += "<td align=\"center\" class=\"celda03\">" + rsQuery.getString(1) + "</font></td>";
                    sTexto += "<td align=\"center\" class=\"celda03\">" + dfFormat.format(rsQuery.getDouble(2)) + "</font></td>";
                    sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format(rsQuery.getDouble(3)) + "</font></td>";
                    sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format(rsQuery.getDouble(4)) + "</font></td>";
                    sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format(rsQuery.getDouble(5)) + "</font></td>";
                    sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format(rsQuery.getDouble(6)) + "</font></td>";

                    if (dParticipa > 0.001) {
                        dSaldoParcial = rsQuery.getDouble(8) + rsQuery.getDouble(3) - rsQuery.getDouble(4) + rsQuery.getDouble(5) - rsQuery.getDouble(6);
                        sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format(dSaldoParcial) + "</font></td>";
                        sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format((rsQuery.getDouble(5) - rsQuery.getDouble(6)) * dParticipa / 100.00) + "</font></td>";
                    }

                    sTexto += "<td align=\"right\" class=\"celda03\">" + dfFormat.format(rsQuery.getDouble(7)) + "</font></td>";
                    sTexto += "</font></td>";

                    dDepositos += rsQuery.getDouble(3);
                    dRetiros += rsQuery.getDouble(4);
                    dIntereses += rsQuery.getDouble(5);
                    dISR += rsQuery.getDouble(6);
                    dParticipacion += ((rsQuery.getDouble(5) - rsQuery.getDouble(6)) * dParticipa) / 100;
                    dParticipacion = Double.valueOf(num.format(dParticipacion)).doubleValue();
                    dSaldoFinal = rsQuery.getDouble(7);
                } while (rsQuery.next());
            } else {
                return "";
            }

            sTexto += "<tr><td colspan=\"9\">&nbsp;</td></tr>";
            sTexto += "<tr>";
            sTexto += "<td align=\"right\" colspan=\"2\" class=\"celda03\"><b>TOTALES:</b></td>";
            sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dDepositos) + "</b></td>";
            sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dRetiros) + "</b></td>";
            sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dIntereses) + "</b></td>";
            sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dISR) + "</b></td>";

            if (dParticipa > 0.001) {
                dSaldoParcial = dSaldoFinal + dParticipacion;
                sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dSaldoParcial) + "</b></td>";
                sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dParticipacion) + "</b></td>";
            }

            sTexto += "<td align=\"right\" class=\"celda03\"><b>" + dfFormat.format(dSaldoFinal) + "</b></td>";
            sTexto += "</font></td>";

            return sTexto;
        } catch (Exception ex) {
            LOGGER.error("Exception: ", ex);
            return ex.toString();
        } finally {
            try {
                if (rsQuery != null)
                    rsQuery.close();
            } catch (Exception ex) {
                LOGGER.debug("rsQ: " + ex);
            }
            try {
                if (stQuery != null)
                    stQuery.close();
            } catch (Exception ex) {
                LOGGER.debug("stQ: " + ex);
            }
            try {
                if (rsQuery_Secuen != null)
                    rsQuery_Secuen.close();
            } catch (Exception ex) {
                LOGGER.debug("rsQS" + ex);
            }
            try {
                if (stQuery_Secuen != null)
                    stQuery_Secuen.close();
            } catch (Exception ex) {
                LOGGER.debug("stQS" + ex);
            }
            try {
                if (stInstrucc != null)
                    stInstrucc.close();
            } catch (Exception ex) {
                LOGGER.debug("stI" + ex);
            }
            try {
                CloseBD();
            } catch (Exception ex) {
                LOGGER.error("Exception: ", ex);
            }
        }
    }
}
