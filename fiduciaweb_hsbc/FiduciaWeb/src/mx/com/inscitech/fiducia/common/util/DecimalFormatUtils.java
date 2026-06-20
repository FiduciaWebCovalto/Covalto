package mx.com.inscitech.fiducia.common.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Locale;

/**
 * Clase que contiene metodos para la manipulacion de numeros
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class DecimalFormatUtils {

    private static final String SPANISH_LOCALE = "ES";
    private static final String ENGLISH_LOCALE = "US";
    private static final String FRANCE_LOCALE = "FR";

    private static final String SPANISH_LANGUAGE = "es";
    public static final String ENGLISH_LANGUAGE = "en";
    private static final String FRANCE_LANGUAGE = "fr";

    /**
     * Patron "###.##";
     */
    public static final String FORMAT_DIGITS_WITH_POINT = "###.## ";

    /**
     * Patron "###.00";
     */
    public static final String FORMAT_DIGITS_WITH_POINT_2 = "0.00";


    /**
     * Patron "###,###.###";
     */
    public static final String FORMAT_DIGITS_WITH_MILES_SEP = "###,###.###";

    /**
     * Patron "000000.000";
     */
    public static final String FORMAT_DIGITS_WITH_ZEROS_FILLED = "000000.000";

    /**
     * Patron "$###,###.###";
     */
    public static final String FORMAT_DIGITS_WITH_CURRENCY = "$###,###.###";


    /**
     * Metodo getDefaultFormatedNumber para realizar el formateo de un valor numerico
     * considerando el lenguaje por defecto
     * @return
     * @param value
     * @param pattern
     */
    public static String getDefaultFormatedNumber(String pattern, Object value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        return myFormatter.format(value);
    }

    /**
     * Metodo getFormatedNumber para realizar el formateo de un valor numerico
     * considerando un lenguaje especificado
     * @return
     * @param loc
     * @param value
     * @param pattern
     */
    public static String getFormatedNumber(String pattern, Object value, Locale loc) {
        NumberFormat nf = NumberFormat.getNumberInstance(loc);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern(pattern);
        return df.format(value);
    }

    /**
     * Metodo getFormatedNumber para realizar el formateo de un valor numerico
     * @return
     * @param value
     * @param pattern
     */
    public static String getFormatedNumber(String pattern, Object value) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern(pattern);
        return df.format(value);
    }

    /**
     * Metodo getEnglishLocale para obtener el locale del ingles
     * @return
     */
    public static Locale getEnglishLocale() {
        Locale local = new Locale(mx.com
                                    .inscitech
                                    .fiducia
                                    .common
                                    .util
                                    .DecimalFormatUtils
                                    .ENGLISH_LANGUAGE, mx.com
                                                         .inscitech
                                                         .fiducia
                                                         .common
                                                         .util
                                                         .DecimalFormatUtils
                                                         .ENGLISH_LOCALE);
        return local;
    }

    /**
     * Metodo getSpanishLocale para obtener el locale del espanhol
     * @return
     */
    public static Locale getSpanishLocale() {
        Locale local = new Locale(mx.com
                                    .inscitech
                                    .fiducia
                                    .common
                                    .util
                                    .DecimalFormatUtils
                                    .SPANISH_LANGUAGE, mx.com
                                                         .inscitech
                                                         .fiducia
                                                         .common
                                                         .util
                                                         .DecimalFormatUtils
                                                         .SPANISH_LOCALE);
        return local;
    }

    /**
     * Metodo para redondear tipos primitivos double a un numero especifico de decimales.
     * @return El numero redondeado a la cantidad de decimales especificado.
     * @param fractionDigits El numero de decimales a los que se desea redondear el numero especificado.
     * @param doubleNumber El numero a redondear.
     */
    public static double roundDouble(double doubleNumber, int fractionDigits) {
        NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
        format.setMaximumFractionDigits(fractionDigits);
        format.setMinimumFractionDigits(2);
        String formatedNumber = format.format(doubleNumber).replaceAll("[,]", "");
        return Double.parseDouble(formatedNumber);
    }
}
