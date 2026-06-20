package mx.com.inscitech.fiducia.common.util;

import java.math.BigDecimal;

/**
 * Clase que contiene metodos para manipular cifras
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class MoneyUtils {

    private MoneyUtils() {
    }

    public static final int PESOS = 1;
    public static final int DOLARES = 2;
    public static final int UDIS = 3;

    // withCents = 0 -> Con centavos
    // withCents = 1 -> Sin centavos

    /**
     * Metodo que permite obtener el texto de una cantidad en diferentes monedas
     * @return El texto equivalente la cantidad
     * @param monto El monto a convertir
     * @param tipoMoneda La moneda a la que se desea convertir (MoneyUtils.PESOS, MoneyUtils.DOLARES, MoneyUtils.UDIS)
     * @param withCents True si se quieren tomar en cuenta los centavos, de lo contrario False
     */
    public static String convertToText(String monto, int tipoMoneda, boolean withCents) {

        // TODO: El monto se debe de recibir como bigdecimal y se debe de formatear con utileria que use numberFormat + Locale
        int numero;
        int decim;
        int mmillones;
        int Millones;
        int Miles;
        int Unidades;

        String num = "";
        String dec = "";

        int iPunto = monto.lastIndexOf(".");

        if (iPunto > -1) {
            num = monto.substring(0, iPunto);
            dec = monto.substring(iPunto + 1, monto.length());
        } else {
            num = monto;
            dec = "0";
        }

        numero = new Integer(num).intValue();
        decim = new Integer(dec).intValue();

        String linea = "";

        if (numero == 0)
            linea = "CERO";
        else if (numero == 1) {

            switch (tipoMoneda) {
            case 1:
                linea = "UN PESO ";
                break;
            case 2:
                linea = "UN DOLAR ";
                break;
            case 3:
                linea = "UN UDI ";
                break;
            default:
                linea = " ";
            }

            if (tipoMoneda != 3 & withCents) {
                if (tipoMoneda == 1) {
                    if (decim == 0)
                        linea += "00/100 MN";
                    else if (decim == 1)
                        linea = linea + "1/100 MN";
                    else if (decim > 1)
                        linea = linea + convert(decim) + " /100 MN";
                }

                else if (tipoMoneda == 2) {
                    if (decim == 0)
                        linea += " ";
                    else if (decim == 1)
                        linea = linea + "UN CENTAVO";
                    else if (decim > 1)
                        linea = linea + convert(decim) + " CENTAVOS";
                }
            }

            return linea;
        } else if (numero > 1)
            linea = "";

        mmillones = (numero - (numero % 1000000000)) / 1000000000;
        Millones = ((numero - (mmillones * 1000000000)) - ((numero - (mmillones * 1000000000)) % 1000000)) / 1000000;
        Miles = ((numero - ((mmillones * 1000000000) + (Millones * 1000000))) - ((numero - ((mmillones * 1000000000) + (Millones * 1000000))) % 1000)) / 1000;
        Unidades = numero - ((mmillones * 1000000000) + (Millones * 1000000) + (Miles * 1000));

        if (mmillones == 1)
            linea = linea + "MIL";
        else if (mmillones > 1)
            linea = linea + convert(mmillones) + " MIL ";

        if (Millones == 1)
            linea = linea + " UN MILLON ";
        else if (Millones > 1)
            linea = linea + convert(Millones) + " MILLONES ";
        else if (mmillones >= 1)
            linea = linea + " MILLONES ";

        if (Miles == 1)
            linea = linea + " MIL ";
        else if (Miles > 1)
            linea = linea + convert(Miles) + " MIL ";
        if (Unidades > 0)
            linea = linea + convert(Unidades);

        //linea += " PESOS ";

        switch (tipoMoneda) {
        case 1:
            //linea += " PESOS 00/100 MN";
            if (!withCents) {
                linea += " PESOS 00/MN";
            } else {
                linea += " PESOS ";
            }
            break;
        case 2:
            linea += " DOLARES ";
            break;
        case 3:
            linea += " UDIS ";
            break;
        default:
            linea += " ";
        }

        if (tipoMoneda != 3 & withCents) {


            if (tipoMoneda == 2) {
                if (decim == 0)
                    linea += "CERO CENTAVOS";
                else if (decim == 1)
                    linea = linea + "UN CENTAVO";
                else if (decim > 1)
                    linea = linea + convert(decim) + " CENTAVOS";
            } else {
                if (decim == 0)
                    linea += "00/100 MN";
                else if (decim == 1)
                    linea = linea + "1/100 MN";
                else if (decim > 1)
                    linea = linea + convert(decim) + " /100 MN";
            }
        }

        return linea;
    }

    private static String convertToText(int numero, int decim, int tipoMoneda, boolean withCents) {

        int mmillones;
        int Millones;
        int Miles;
        int Unidades;

        String linea = "";

        if (numero == 0)
            linea = "CERO";
        else if (numero == 1) {

            switch (tipoMoneda) {
            case 1:
                linea = "UN PESO ";
                break;
            case 2:
                linea = "UN DOLAR ";
                break;
            case 3:
                linea = "UN UDI ";
                break;
            default:
                linea = "UN PESO ";
            }

            if (tipoMoneda != 3 && withCents) {
                if (decim == 0)
                    linea += " CERO CENTAVOS";
                else if (decim == 1)
                    linea = linea + " UN CENTAVO";
                else if (decim > 1)
                    linea = linea + convert(decim) + " CENTAVOS";
            }

            return linea;
        } else if (numero > 1)
            linea = "";

        mmillones = (numero - (numero % 1000000000)) / 1000000000;
        Millones = ((numero - (mmillones * 1000000000)) - ((numero - (mmillones * 1000000000)) % 1000000)) / 1000000;
        Miles = ((numero - ((mmillones * 1000000000) + (Millones * 1000000))) - ((numero - ((mmillones * 1000000000) + (Millones * 1000000))) % 1000)) / 1000;
        Unidades = numero - ((mmillones * 1000000000) + (Millones * 1000000) + (Miles * 1000));

        if (mmillones == 1)
            linea = linea + "MIL";
        else if (mmillones > 1)
            linea = linea + convert(mmillones) + " MIL ";

        if (Millones == 1)
            linea = linea + " UN MILLON ";
        else if (Millones > 1)
            linea = linea + convert(Millones) + " MILLONES ";
        else if (mmillones >= 1)
            linea = linea + " MILLONES ";

        if (Miles == 1)
            linea = linea + " MIL ";
        else if (Miles > 1)
            linea = linea + convert(Miles) + " MIL ";
        if (Unidades > 0)
            linea = linea + convert(Unidades);

        //linea += " PESOS ";

        switch (tipoMoneda) {
        case 1:
            linea += " PESOS ";
            break;
        case 2:
            linea += " DOLARES ";
            break;
        case 3:
            linea += " UDIS ";
            break;
        default:
            linea += " PESOS ";
        }

        if (tipoMoneda != 3 && withCents) {
            if (decim == 0)
                linea += "CERO CENTAVOS";
            else if (decim == 1)
                linea = linea + "UN CENTAVO";
            else if (decim > 1)
                linea = linea + convert(decim) + " CENTAVOS";
        }

        return linea;
    }

    private static String convert(int valor) {
        String[] unidad;
        String[] decena;
        String[] centena;

        int uni;
        int dec;
        int cen;
        int doble;

        String linea;

        unidad = new String[16];
        decena = new String[10];
        centena = new String[10];

        unidad[1] = "UN";
        unidad[2] = "DOS";
        unidad[3] = "TRES";
        unidad[4] = "CUATRO";
        unidad[5] = "CINCO";
        unidad[6] = "SEIS";
        unidad[7] = "SIETE";
        unidad[8] = "OCHO";
        unidad[9] = "NUEVE";
        unidad[10] = "DIEZ";
        unidad[11] = "ONCE";
        unidad[12] = "DOCE";
        unidad[13] = "TRECE";
        unidad[14] = "CATORCE";
        unidad[15] = "QUINCE";

        decena[1] = "DIECI";
        decena[2] = "VEINTI";
        decena[3] = "TREINTA";
        decena[4] = "CUARENTA";
        decena[5] = "CINCUENTA";
        decena[6] = "SESENTA";
        decena[7] = "SETENTA";
        decena[8] = "OCHENTA";
        decena[9] = "NOVENTA";

        centena[1] = "CIENTO";
        centena[2] = "DOSCIENTOS";
        centena[3] = "TRESCIENTOS";
        centena[4] = "CUATROCIENTOS";
        centena[5] = "QUINIENTOS";
        centena[6] = "SEISCIENTOS";
        centena[7] = "SETECIENTOS";
        centena[8] = "OCHOCIENTOS";
        centena[9] = "NOVECIENTOS";

        if (valor == 100)
            linea = " CIEN ";
        else {

            linea = "";
            cen = (valor - (valor % 100)) / 100;
            doble = valor - (cen * 100);
            dec = (valor - (valor % 10)) / 10;
            dec = dec - (cen * 10);
            uni = valor - (dec * 10) - (cen * 100);

            if (cen > 0)
                linea = linea + centena[cen] + " ";

            if (doble > 0) {
                if (doble == 20)
                    linea = linea + " VEINTE ";
                else {
                    if (doble < 16)
                        linea = linea + unidad[doble];
                    else {
                        linea = linea + ' ' + decena[dec];
                        if (dec > 2 && uni != 0)
                            linea = linea + " Y ";
                        if (uni > 0)
                            linea = linea + unidad[uni];
                    }
                }
            }
        }

        return linea;
    }

    /**
     * Metodo que permite obtener el una cantidad con formato de dinero Ej. $ 2000.00
     * @return El texto equivalente la cantidad
     * @param amount El monto a convertir
     */
    public static String convertToMoney(BigDecimal amount) {

        // TODO: Cambiar a NumberFormat
        String numero = "";
        String data = amount.toString().trim();

        if (data.indexOf(".") == -1) {
            while (data.length() > 3) {
                String temp = "," + data.substring(data.length() - 3, data.length());
                numero = temp + numero;
                data = data.substring(0, data.length() - 3);
            }

            if (data.equals("-"))
                numero = "-" + numero.substring(1, numero.length()) + ".00";
            else
                numero = data + numero + ".00";
        } else {

            String dec = data.substring(data.indexOf("."), data.length());
            data = data.substring(0, data.indexOf("."));

            while (data.length() > 3) {
                String temp = "," + data.substring(data.length() - 3, data.length());
                numero = temp + numero;
                data = data.substring(0, data.length() - 3);
            }

            if (data.equals("-"))
                numero = "-" + numero.substring(1, numero.length()) + ".00";
            else
                numero = data + numero + dec;
        }

        return "$ " + numero;
    }
}
