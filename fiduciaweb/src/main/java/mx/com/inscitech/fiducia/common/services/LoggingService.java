package mx.com.inscitech.fiducia.common.services;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Singleton used by the application lo log the messages
 * an exceptions thrown by the application based on the Log4J
 * configuration specified by the log4j.properties file.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class LoggingService {

    public static final Level DEBUG = Level.DEBUG;
    public static final Level ERROR = Level.ERROR;
    public static final Level FATAL = Level.FATAL;
    public static final Level INFO = Level.INFO;
    public static final Level WARN = Level.WARN;

    /**
     * Variable that contains the instance of the service.
     */
    private static LoggingService _instance = null;

    /**
     * Variable used to log the application messages
     */
    private Logger logger = null;

    /**
     * Static block that creates the instance of the Logging Service
     */
    static {
        _instance = new LoggingService();
    }

    /**
     * Constructor of the Logging Servie
     */
    private LoggingService() {
    }

    /**
     * Static method used to get an instance of the Logging Service
     * @return The instance of the Logging Service
     */
    public static LoggingService getInstance() {
        return _instance;
    }

    public static LoggingService getNewInstance() {
        return new LoggingService();
    }

    public void log(Class clazz, Thread thread, Level level, String message) {
        log(clazz, thread, level, message, null);
    }

    public void log(Class clazz, Thread thread, Level level, Throwable e) {
        log(clazz, thread, level, null, e);
    }

    /**
     * Method used to log an exception
     * @param message A String containing the message to be logged.
     * @param level A java.util.logging.Level object used to identify the priority of the message.
     * @param thread A java.lang.Thread object used to identify the thread that owns the message.
     * @param obj The object that throws the exception.
     */
    public void log(Object obj, Thread thread, Level level, String message) {
        log(obj, thread, level, message, null);
    }

    /**
     * Method used to log an exception
     * @param e The exception that will be logged.
     * @param level A java.util.logging.Level object used to identify the priority of the message.
     * @param thread A java.lang.Thread object used to identify the thread that owns the message.
     * @param obj The object that throws the exception.
     */
    public void log(Object obj, Thread thread, Level level, Throwable e) {
        log(obj, thread, level, null, e);
    }

    /**
     * Method used to log an exception
     * @param e The exception that will be logged.
     * @param message A String containing the message to be logged.
     * @param level A java.util.logging.Level object used to identify the priority of the message.
     * @param thread A java.lang.Thread object used to identify the thread that owns the message.
     * @param obj The object that throws the exception.
     */
    public void log(Object obj, Thread thread, Level level, String message, Throwable e) {
        log(obj.getClass(), thread, level, message, e);
    }

    @SuppressWarnings("org.adfemg.audits.java.system-out-usage")
    public void log(Class clazz, Thread thread, Level level, String message, Throwable e) {
        Logger logger = Logger.getLogger(clazz);

        System.out.println("\nClass:\t\t" + clazz.getName() + "\n" + "Thread:\t\t" + thread.getName() + "\n" + "Level:\t\t" + level + "\n" +
                           (message != null ? "Message:\t\t" + message + "\n" : "") + (e != null ? "Exception:\t\t" + e + "\n" : ""));

        logger.setLevel(level);

        if (e != null) {
            e.printStackTrace();
            logger.log(level, "[" + thread.getId() + (message != null ? "] Message: " + message + "\n" : ""), e);
        } else {
            logger.log(level, (message != null ? "Message: " + message : ""));
            //logger.debug(" Thread[" + thread.getName() + "] " + message);
        }
    }

    public void log(Class clazz, String message) {
        logger = Logger.getLogger(clazz);
        logger.debug(message);
    }

    public void log(Class clazz, Thread t, String message) {
        logger = Logger.getLogger(clazz);
        logger.debug(" Thread[" + t.getName() + "] " + message);
    }
}
