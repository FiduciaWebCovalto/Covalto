package mx.com.inscitech.fiducia.common.util;

import java.io.UnsupportedEncodingException;

/**
 * Clase que proporciona metodos para manipular cadenas de caracteres
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class StringUtils {
    private StringUtils() {
    }

    /**
     * Arreglo de caracteres acentuados
     */
    private static final String[] caracteres = { "Á", "É", "Í", "Ó", "Ú", "á", "é", "í", "ó", "ú", "ñ", "Ñ" };

    /**
     * Metodo que permite cambiar la codificacion del juego de caracteres
     * @return El juego de caracteres con la codificacion solicitada
     * @param encoding El codigo de la codificacion a utilizar
     * @param strIn La cadena o juego de caracteres a los que se le cambiara la codificacion
     */
    public static String getEncodedString(String strIn, String encoding) {
        try {
            return new String(strIn.getBytes(), encoding);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return strIn;
        }
    }

    /**
     * Metodo que convierte a UNICODE los caracteres especiales de una cadena de caracteres
     * @return La cadena convertida
     * @param idx El inidice que indica el lugar donde se encuentra el caracter especial
     * @param strIn La cadena que contiene el caracter especial
     */
    public static String parserUnicode(String strIn, int idx) {
        String strTmp = null;

        try {
            strTmp = new String("".getBytes(), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            strTmp = "";
        }

        int _sec = 0;
        int idxIni = 0;
        int idxTmp = 0;

        for (; _sec < caracteres.length; _sec++) {
            idxIni = strIn.indexOf(caracteres[_sec]);
            if (idxIni != -1)
                break;
        }

        if (idxIni == -1 && _sec >= 12)
            return "";

        String strCharTmp = "\\u" + ASCIItoUNICODE(caracteres[_sec]);
        String strBefore = "";
        //Cuando el caracter es el primero
        //if(idx >= 0)
        strBefore = strIn.substring(0, idxIni);

        String strAfter = strIn.substring(idxIni + 1);
        strTmp = "";
        strTmp = strTmp.concat(strBefore + strCharTmp + strAfter);

        parserUnicode(strTmp, idx + 6);

        return strTmp;
    }

    /**
     * Metodo que permite obtener el codigo UNICODE de un caracter especial
     * @return El catacter especial en UNICODE
     * @param strASCII El caracter a cambiar
     */
    public static String ASCIItoUNICODE(String strASCII) {
        if (strASCII.indexOf("Á") != -1)
            return "00C1";
        if (strASCII.indexOf("É") != -1)
            return "00C9";
        if (strASCII.indexOf("Í") != -1)
            return "00CD";
        if (strASCII.indexOf("Ó") != -1)
            return "00D3";
        if (strASCII.indexOf("Ú") != -1)
            return "00DA";
        if (strASCII.indexOf("á") != -1)
            return "00E1";
        if (strASCII.indexOf("é") != -1)
            return "00E9";
        if (strASCII.indexOf("í") != -1)
            return "00ED";
        if (strASCII.indexOf("ó") != -1)
            return "00F3";
        if (strASCII.indexOf("ú") != -1)
            return "00FA";
        if (strASCII.indexOf("ñ") != -1)
            return "00F1";
        if (strASCII.indexOf("Ñ") != -1)
            return "00D1";
        else
            return "No_UNICODE";
    }

    /**
     * Metodo que permite eliminar los caracteres especiales de una cadena
     * @return La cadena sin caracteres especiales
     * @param specialString La cadena a la que se le quitaran los caracteres especiales
     */
    public static String cleanUpString(String specialString) {
        String finalString = "";

        if (specialString != null) {
            specialString = specialString.toLowerCase();
            specialString = specialString.replace('á', 'a');
            specialString = specialString.replace('é', 'e');
            specialString = specialString.replace('í', 'i');
            specialString = specialString.replace('ó', 'o');
            specialString = specialString.replace('ú', 'u');
            specialString = specialString.replace('à', 'a');
            specialString = specialString.replace('è', 'e');
            specialString = specialString.replace('ì', 'i');
            specialString = specialString.replace('ò', 'o');
            specialString = specialString.replace('ù', 'u');
            specialString = specialString.replace('ä', 'a');
            specialString = specialString.replace('ë', 'e');
            specialString = specialString.replace('ï', 'i');
            specialString = specialString.replace('ö', 'o');
            specialString = specialString.replace('ü', 'u');
            specialString = specialString.replace('ñ', 'n');
            specialString = specialString.replace('å', 'a');

            //specialString = specialString.toUpperCase();
            finalString = "" + specialString;
        }

        return finalString;
    }

    /**
     * Metodo que cambia los caracteres especiales de una cadena a su equivalente en HTML
     * @return La cadena con los caracteres especiales en codigo HTML
     * @param _cadena La cadena a modificar
     */
    public static String cambiaCadenaHTML(String _cadena) {
        _cadena = _cadena.replaceAll("á", "&aacute;");
        _cadena = _cadena.replaceAll("é", "&eacute;");
        _cadena = _cadena.replaceAll("í", "&iacute;");
        _cadena = _cadena.replaceAll("ó", "&oacute;");
        _cadena = _cadena.replaceAll("ú", "&uacute;");
        _cadena = _cadena.replaceAll("Á", "&Aacute;");
        _cadena = _cadena.replaceAll("É", "&Eacute;");
        _cadena = _cadena.replaceAll("Í", "&Iacute;");
        _cadena = _cadena.replaceAll("Ó", "&Oacute;");
        _cadena = _cadena.replaceAll("Ú", "&Uacute;");

        _cadena = _cadena.replaceAll("ñ", "&ntilde;");
        _cadena = _cadena.replaceAll("Ñ", "&Ntilde;");

        return _cadena;
    }
}
