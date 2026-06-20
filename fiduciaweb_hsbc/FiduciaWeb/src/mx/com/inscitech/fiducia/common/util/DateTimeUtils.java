package mx.com.inscitech.fiducia.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/**
 * Clase que contiene metodos utilitarios que sirven para manejar fechas
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class DateTimeUtils {
    /**
     * Regresa el nombre de la zona horaria de ejecución actual.
     * @return nombre de la zona horaria
     */
    public static String getThisTimeZone() {
        return TimeZone.getDefault().getDisplayName();
    }

    /**
     * Regresa el nombre de la zona horaria de ejecución actual, en el lenguaje especificado.
     * @return nombre de la zona horaria de ejecución actual
     * @param locale Identificador del idioma requerido
     */
    public static String getThisTimeZone(Locale locale) {
        return TimeZone.getDefault().getDisplayName(locale);
    }

    /**
     * Regresa la diferencia (offset) en horas, de la zona horaria actual, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en horas.
     */
    public static int getThisTimeZoneOffsetInHours() {

        long offsetInMilis = TimeZone.getDefault().getRawOffset();

        return (int) (((offsetInMilis / 1000) / 60) / 60);
    }

    /**
     * Regresa la diferencia (offset) en minutos, de la zona horaria actual, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en minutos.
     */
    public static int getThisTimeZoneOffsetInMinutes() {

        long offsetInMilis = TimeZone.getDefault().getRawOffset();

        return (int) ((offsetInMilis / 1000) / 60);
    }

    /**
     * Regresa la diferencia (offset) en segundos, de la zona horaria actual, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en segundos.
     */
    public static int getThisTimeZoneOffsetInSeconds() {

        long offsetInMilis = TimeZone.getDefault().getRawOffset();

        return (int) (offsetInMilis / 1000);
    }

    /**
     * Regresa la diferencia (offset) en mili-segundos, de la zona horaria actual, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en mili-segundos.
     */
    public static long getThisTimeZoneOffsetInMiliSeconds() {

        long offsetInMilis = TimeZone.getDefault().getRawOffset();

        return offsetInMilis;
    }

    /**
     * Regresa la diferencia (offset) en horas, de la zona horaria especificada, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en horas.
     * @param timeZoneId nombre de la zona horaria.
     */
    public static int getTimeZoneOffsetInHours(String timeZoneId) {

        long offsetInMilis = TimeZone.getTimeZone(timeZoneId).getRawOffset();

        return (int) (((offsetInMilis / 1000) / 60) / 60);
    }

    /**
     * Regresa la diferencia (offset) en minutos, de la zona horaria especificada, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en minutos.
     * @param timeZoneId nombre de la zona horaria.
     */
    public static int getTimeZoneOffsetInMinutes(String timeZoneId) {

        long offsetInMilis = TimeZone.getTimeZone(timeZoneId).getRawOffset();

        return (int) ((offsetInMilis / 1000) / 60);
    }

    /**
     * Regresa la diferencia (offset) en segundos, de la zona horaria especificada, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en segundos.
     * @param timeZoneId nombre de la zona horaria.
     */
    public static int getTimeZoneOffsetInSeconds(String timeZoneId) {

        long offsetInMilis = TimeZone.getTimeZone(timeZoneId).getRawOffset();

        return (int) (offsetInMilis / 1000);
    }

    /**
     * Regresa la diferencia (offset) en mili-segundos, de la zona horaria especificada, con respecto al meridiano de Greenwich.
     * @return offset de la zona horaria actual en mili-segundos.
     * @param timeZoneId nombre de la zona horaria.
     */
    public static long getTimeZoneOffsetInMiliSeconds(String timeZoneId) {

        long offsetInMilis = TimeZone.getTimeZone(timeZoneId).getRawOffset();

        return offsetInMilis;
    }

    /**
     * Regresa la representación String de la fecha actual, en el formato dd-MM-yyyy.
     * @return representación String de la fecha actual.
     */
    public static String formatThisDate() {
        return (new SimpleDateFormat("YYYY-MM-DD")).format(new Date());
    }

    /**
     * Regresa la representación String de la hora actual, en el formato HH:mm:ss.
     * @return representación String de la hora actual.
     */
    public static String formatThisTime() {
        return (new SimpleDateFormat("HH:mm:ss")).format(new Date());
    }

    /**
     * Regresa la representación String de la fecha/hora actual, en el formato dd-MM-yyyy HH:mm:ss.
     * @return representación String de la fecha/hora actual.
     */
    public static String formatThisDateTime() {
        return (new SimpleDateFormat("YYYY-MM-DD HH:mm:ss")).format(new Date());
    }

    /**
     * Regresa la representación String de la fecha/hora actual, en el formato especificado.
     * @return representación String de la fecha/hora actual.
     * @param pattern patrón de formato.
     */
    public static String formatThisDateTimeFromPattern(String pattern) {
        return (new SimpleDateFormat(pattern)).format(new Date());
    }

    /**
     * Regresa la representación String de la fecha/hora actual, en el formato y lenguaje especificados.
     * @return representación String de la fecha/hora actual.
     * @param pattern Patrón de formato.
     * @param localeId Identificador del lenguaje.
     */
    public static String formatThisDateTimeFromPattern(String pattern, String localeId) {
        return (new SimpleDateFormat(pattern, new Locale(localeId))).format(new Date());
    }

    /**
     * Regresa la representación String de la fecha especificada como un objeto java.util.Date, en el formato dd-MM-yyyy.
     * @return representación String de la fecha especificada.
     * @param date Fecha especificada como un objeto java.util.Date.
     */
    public static String formatDate(Date date) {
        return (new SimpleDateFormat("YYYY-MM-DD")).format(date);
    }

    /**
     * Regresa la representación String de la Hora especificada como un objeto java.util.Date, en el formato HH:mm:ss.
     * @return representación String de la Hora especificada.
     * @param date Fecha/Hora especificada como un objeto java.util.Date.
     */
    public static String formatTime(Date date) {
        return (new SimpleDateFormat("HH:mm:ss")).format(date);
    }

    /**
     * Regresa la representación String de la Fecha/Hora especificada como un objeto java.util.Date, en el formato dd-MM-yyyy HH:mm:ss.
     * @return representación String de la Fecha/Hora especificada.
     * @param date Fecha/Hora especificada como un objeto java.util.Date.
     */
    public static String formatDateTime(Date date) {
        return (new SimpleDateFormat("YYYY-MM-DD HH:mm:ss")).format(date);
    }

    /**
     * Regresa la representación String de la Fecha/Hora especificada como un objeto java.util.Date, en el formato especificado.
     * @return representación String de la Fecha/Hora especificada, en el formato especificado.
     * @param pattern Patrón de formato.
     * @param date Fecha/Hora especificada como un objeto java.util.Date.
     */
    public static String formatDateTimeFromPattern(String pattern, Date date) {
        return (new SimpleDateFormat(pattern)).format(date);
    }


    /**
     * Regresa la representación String de la Fecha/Hora especificada como un objeto java.util.Date, en el lenguaje y formato especificados.
     * @return representación String de la Fecha/Hora especificada, en el lenguaje y formato especificados.
     * @param pattern Patrón de formato.
     * @param date Fecha/Hora especificada como un objeto java.util.Date.
     * @param localeId Identificador del lenguaje.
     */
    public static String formatDateTimeFromPattern(String pattern, Date date, Locale locale) {
        return (new SimpleDateFormat(pattern, locale)).format(date);
    }

    /**
     * Regresa el objeto java.util.Date resultado de parserar la Fecha especificada como un String en formato dd-MM-yyyy.
     * @return objeto java.util.Date resultado de parserar la Fecha especificada.
     * @param date Fecha especificada como un String en formato dd/MM/yyyy.
     */
    public static Date parseDate(String date) {
        try {
            return (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
        } catch (ParseException pe) {
            throw new RuntimeException(pe.getMessage());
        }
    }

    /**
     * Regresa el objeto java.util.Date resultado de parserar la Fecha/Hora especificada como un String en formato dd-MM-yyyy HH:mm:ss.
     * @return objeto java.util.Date resultado de parserar la Fecha/Hora especificada.
     * @param date Fecha especificada como un String en formato dd/MM/yyyy HH:mm:ss.
     */
    public static Date parseDateTime(String date) {
        try {
            return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).parse(date);
        } catch (ParseException pe) {
            throw new RuntimeException(pe.getMessage());
        }
    }

    /**
     * Regresa el objeto java.util.Date resultado de parserar la Fecha/Hora especificada como un String en el formato especificado.
     * @return objeto java.util.Date resultado de parserar la Fecha/Hora especificada.
     * @param pattern Patrón de formato.
     * @param date Fecha especificada como un String.
     */
    public static Date parseDateTimeFromPattern(String pattern, String date) {
        try {
            return (new SimpleDateFormat(pattern)).parse(date);
        } catch (ParseException pe) {
            throw new RuntimeException(pe.getMessage());
        }
    }

    /**
     * Regresa el objeto java.util.Date resultado de parserar la Fecha/Hora especificada como un String en el formato y lenguaje especificados.
     * @return objeto java.util.Date resultado de parserar la Fecha/Hora especificada.
     * @param pattern Patrón de formato.
     * @param date Fecha especificada como un String.
     * @param localeId Identificador del lenguaje.
     */
    public static Date parseDateTimeFromPattern(String pattern, String date, Locale locale) {
        try {
            return (new SimpleDateFormat(pattern, locale)).parse(date);
        } catch (ParseException pe) {
            throw new RuntimeException(pe.getMessage());
        }
    }

    /**
     * Regresa el objeto java.util.Date que representa la hora zulu actual con respecto a la zona horaria del sistema.
     * @return objeto java.util.Date que representa la hora zulu actual con respecto a la zona horaria del sistema.
     */
    public static Date getZuluDate() {
        Date date = new Date();
        long offset = getThisTimeZoneOffsetInMiliSeconds();
        long zuluTime = date.getTime() - offset;
        date.setTime(zuluTime);
        return date;
    }

    /**
     * Regresa la representación String de la Fecha que representa la hora zulu actual con respecto a la zona horaria del sistema en el formato .
     * @return representación String de la Fecha/Hora especificada, en el lenguaje y formato especificados.
     * @param pattern Patrón de formato.
     * @param date Fecha/Hora especificada como un objeto java.util.Date.
     * @param localeId Identificador del lenguaje.
     */
    public static String formatZuluDate() {
        return formatDate(getZuluDate());
    }

    public static String formatZuluTime() {
        return formatTime(getZuluDate());
    }

    public static String formatZuluDateTime() {
        return formatDateTime(getZuluDate());
    }

    public static String formatZuluDateFromPattern(String pattern) {
        return formatDateTimeFromPattern(pattern, getZuluDate());
    }

    public static String formatZuluDateFromPattern(Locale locale, String pattern) {
        return formatDateTimeFromPattern(pattern, getZuluDate(), locale);
    }

    public static Date convertLocaleToZulu(Date localeDate) {
        long offset = getThisTimeZoneOffsetInMiliSeconds();
        long zuluTime = localeDate.getTime() - offset;
        localeDate.setTime(zuluTime);
        return localeDate;
    }

    public static Date convertLocaleToZulu(Date localeDate, String timeZoneId) {
        long offset = getTimeZoneOffsetInMiliSeconds(timeZoneId);
        long zuluTime = localeDate.getTime() - offset;
        localeDate.setTime(zuluTime);
        return localeDate;
    }

    public static Date convertLocaleToZulu(Date localeDate, String timeZoneId, long dayLightTime) {
        long offset = getTimeZoneOffsetInMiliSeconds(timeZoneId);
        long zuluTime = localeDate.getTime() - (offset + dayLightTime);
        localeDate.setTime(zuluTime);
        return localeDate;
    }

    public static Date convertZuluToLocale(Date zuluDate) {
        long offset = getThisTimeZoneOffsetInMiliSeconds();
        long localeTime = zuluDate.getTime() + offset;
        zuluDate.setTime(localeTime);
        return zuluDate;
    }

    public static Date convertZuluToLocale(Date zuluDate, String timeZoneId) {
        long offset = getTimeZoneOffsetInMiliSeconds(timeZoneId);
        long localeTime = zuluDate.getTime() + offset;
        zuluDate.setTime(localeTime);
        return zuluDate;
    }

    public static Date convertZuluToLocale(Date zuluDate, String timeZoneId, long dayLightTime) {
        long offset = getTimeZoneOffsetInMiliSeconds(timeZoneId);
        long localeTime = zuluDate.getTime() + (offset + dayLightTime);
        zuluDate.setTime(localeTime);
        return zuluDate;
    }

    public static String formatDateLocaleToZulu(Date localeDate) {
        return formatDate(convertLocaleToZulu(localeDate));
    }

    public static String formatDateLocaleToZulu(Date localeDate, String timeZoneId) {
        return formatDate(convertLocaleToZulu(localeDate, timeZoneId));
    }

    public static String formatDateLocaleToZulu(Date localeDate, String timeZoneId, long dayLightTime) {
        return formatDate(convertLocaleToZulu(localeDate, timeZoneId, dayLightTime));
    }

    public static String formatTimeLocaleToZulu(Date localeDate) {
        return formatTime(convertLocaleToZulu(localeDate));
    }

    public static String formatTimeLocaleToZulu(Date localeDate, String timeZoneId) {
        return formatTime(convertLocaleToZulu(localeDate, timeZoneId));
    }

    public static String formatTimeLocaleToZulu(Date localeDate, String timeZoneId, long dayLightTime) {
        return formatTime(convertLocaleToZulu(localeDate, timeZoneId, dayLightTime));
    }

    public static String formatDateTimeLocaleToZulu(Date localeDate) {
        return formatDateTime(convertLocaleToZulu(localeDate));
    }

    public static String formatDateTimeLocaleToZulu(Date localeDate, String timeZoneId) {
        return formatDateTime(convertLocaleToZulu(localeDate, timeZoneId));
    }

    public static String formatDateTimeLocaleToZulu(Date localeDate, String timeZoneId, long dayLightTime) {
        return formatDateTime(convertLocaleToZulu(localeDate, timeZoneId, dayLightTime));
    }

    public static String formatDateTimeLocaleToZuluFromPattern(Date localeDate, String pattern) {
        return formatDateTimeFromPattern(pattern, convertLocaleToZulu(localeDate));
    }

    public static String formatDateTimeLocaleToZuluFromPattern(Date localeDate, String pattern, Locale locale) {
        return formatDateTimeFromPattern(pattern, convertLocaleToZulu(localeDate), locale);
    }

    public static String formatDateTimeLocaleToZuluFromPattern(Date localeDate, String pattern, String timeZoneId) {
        return formatDateTimeFromPattern(pattern, convertLocaleToZulu(localeDate, timeZoneId));
    }

    public static String formatDateTimeLocaleToZuluFromPattern(Date localeDate, String pattern, String timeZoneId, long dayLightTime) {
        return formatDateTimeFromPattern(pattern, convertLocaleToZulu(localeDate, timeZoneId, dayLightTime));
    }

    public static String formatDateTimeLocaleToZuluFromPattern(Date localeDate, String pattern, String timeZoneId, Locale locale) {
        return formatDateTimeFromPattern(pattern, convertLocaleToZulu(localeDate, timeZoneId), locale);
    }

    public static String formatDateZuluToLocale(Date zuluDate) {
        return formatDate(convertZuluToLocale(zuluDate));
    }

    public static String formatDateZuluToLocale(Date zuluDate, String timeZoneId) {
        return formatDate(convertZuluToLocale(zuluDate, timeZoneId));
    }

    public static String formatDateZuluToLocale(Date zuluDate, String timeZoneId, long dayLightTime) {
        return formatDate(convertZuluToLocale(zuluDate, timeZoneId, dayLightTime));
    }

    public static String formatTimeZuluToLocale(Date zuluDate) {
        return formatTime(convertZuluToLocale(zuluDate));
    }

    public static String formatTimeZuluToLocale(Date zuluDate, String timeZoneId) {
        return formatTime(convertZuluToLocale(zuluDate, timeZoneId));
    }

    public static String formatTimeZuluToLocale(Date zuluDate, String timeZoneId, long dayLightTime) {
        return formatTime(convertZuluToLocale(zuluDate, timeZoneId, dayLightTime));
    }

    public static String formatDateTimeZuluToLocale(Date zuluDate) {
        return formatDateTime(convertZuluToLocale(zuluDate));
    }

    public static String formatDateTimeZuluToLocale(Date zuluDate, String timeZoneId) {
        return formatDateTime(convertZuluToLocale(zuluDate, timeZoneId));
    }

    public static String formatDateTimeZuluToLocale(Date zuluDate, String timeZoneId, long dayLightTime) {
        return formatDateTime(convertZuluToLocale(zuluDate, timeZoneId, dayLightTime));
    }

    public static String formatDateTimeZuluToLocaleFromPattern(Date zuluDate, String pattern) {
        return formatDateTimeFromPattern(pattern, convertZuluToLocale(zuluDate));
    }

    public static String formatDateTimeZuluToLocaleFromPattern(Date zuluDate, String pattern, Locale locale) {
        return formatDateTimeFromPattern(pattern, convertZuluToLocale(zuluDate), locale);
    }

    public static String formatDateTimeZuluToLocaleFromPattern(Date zuluDate, String pattern, String timeZoneId) {
        return formatDateTimeFromPattern(pattern, convertZuluToLocale(zuluDate, timeZoneId));
    }

    public static String formatDateTimeZuluToLocaleFromPattern(Date zuluDate, String pattern, String timeZoneId, long dayLightTime) {
        return formatDateTimeFromPattern(pattern, convertZuluToLocale(zuluDate, timeZoneId, dayLightTime));
    }

    public static String formatDateTimeZuluToLocaleFromPattern(Date zuluDate, String pattern, String timeZoneId, Locale locale) {
        return formatDateTimeFromPattern(pattern, convertZuluToLocale(zuluDate, timeZoneId), locale);
    }

    public static Date parseDateLocaleToZulu(String localeDate) {
        return convertLocaleToZulu(parseDate(localeDate));
    }

    public static Date parseDateLocaleToZulu(String localeDate, String timeZoneId) {
        return convertLocaleToZulu(parseDate(localeDate), timeZoneId);
    }

    public static Date parseDateLocaleToZulu(String localeDate, String timeZoneId, long dayLightTime) {
        return convertLocaleToZulu(parseDate(localeDate), timeZoneId, dayLightTime);
    }

    public static Date parseDateTimeLocaleToZulu(String localeDate) {
        return convertLocaleToZulu(parseDateTime(localeDate));
    }

    public static Date parseDateTimeLocaleToZulu(String localeDate, String timeZoneId) {
        return convertLocaleToZulu(parseDateTime(localeDate), timeZoneId);
    }

    public static Date parseDateTimeLocaleToZulu(String localeDate, String timeZoneId, long dayLightTime) {
        return convertLocaleToZulu(parseDateTime(localeDate), timeZoneId, dayLightTime);
    }

    public static Date parseDateTimeLocaleToZuluFromPattern(String localeDate, String pattern) {
        return convertLocaleToZulu(parseDateTimeFromPattern(pattern, localeDate));
    }

    public static Date parseDateTimeLocaleToZuluFromPattern(String localeDate, String pattern, String timeZoneId) {
        return convertLocaleToZulu(parseDateTimeFromPattern(pattern, localeDate), timeZoneId);
    }

    public static Date parseDateTimeLocaleToZuluFromPattern(String localeDate, String pattern, String timeZoneId, long dayLightTime) {
        return convertLocaleToZulu(parseDateTimeFromPattern(pattern, localeDate), timeZoneId, dayLightTime);
    }

    public static Date parseDateZuluToLocale(String zuluDate) {
        return convertZuluToLocale(parseDate(zuluDate));
    }

    public static Date parseDateZuluToLocale(String zuluDate, String timeZoneId) {
        return convertZuluToLocale(parseDate(zuluDate), timeZoneId);
    }

    public static Date parseDateZuluToLocale(String zuluDate, String timeZoneId, long dayLightTime) {
        return convertZuluToLocale(parseDate(zuluDate), timeZoneId, dayLightTime);
    }

    public static Date parseDateTimeZuluToLocale(String zuluDate) {
        return convertZuluToLocale(parseDateTime(zuluDate));
    }

    public static Date parseDateTimeZuluToLocale(String zuluDate, String timeZoneId) {
        return convertZuluToLocale(parseDateTime(zuluDate), timeZoneId);
    }

    public static Date parseDateTimeZuluToLocale(String zuluDate, String timeZoneId, long dayLightTime) {
        return convertZuluToLocale(parseDateTime(zuluDate), timeZoneId, dayLightTime);
    }

    public static Date parseDateTimeZuluToLocaleFromPattern(String zuluDate, String pattern) {
        return convertZuluToLocale(parseDateTimeFromPattern(pattern, zuluDate));
    }

    public static Date parseDateTimeZuluToLocaleFromPattern(String zuluDate, String pattern, String timeZoneId) {
        return convertZuluToLocale(parseDateTimeFromPattern(pattern, zuluDate), timeZoneId);
    }

    public static Date parseDateTimeZuluToLocaleFromPattern(String zuluDate, String pattern, String timeZoneId, long dayLightTime) {
        return convertZuluToLocale(parseDateTimeFromPattern(pattern, zuluDate), timeZoneId, dayLightTime);
    }

    /**
     * Metodo para obtener la <B>fecha LOCAL umbral Inferior</B> y la <B>fecha LOCAL umbral Superior</B>, de una fecha LOCAL dada.
     * @param fecha fecha Local ingresada por el usuario e el <B>formato dd-MM-yyyy</B>
     * @return Mapa de umbrales Locales ( thresDown y thresUp)
     */
    public static Map getThresholdOfLocalDate(String date, String pattern) {

        Date cdate = DateTimeUtils.parseDateTimeFromPattern(date, pattern);

        Map threshold = new HashMap();
        Calendar cal = Calendar.getInstance();
        cal.setTime(cdate);
        cal.set(Calendar.HOUR_OF_DAY, 00);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
        threshold.put("down", new Date(cal.getTimeInMillis()));

        cal.setTime(cdate);
        cal.set(Calendar.HOUR_OF_DAY, 24);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
        threshold.put("up", new Date(cal.getTimeInMillis()));

        return threshold;

    }
}
