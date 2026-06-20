package mx.com.inscitech.fiducia.web.listeners;

import java.io.File;

import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import mx.com.inscitech.fiducia.common.FiduciaWebBase;


/**
 * Clase en la que se inicializan las variables y se configura el entorno para el funcionamiento
 * de la aplciacion
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ApplicationStartUp extends FiduciaWebBase implements ServletContextListener {

    private ServletContext context = null;

    public void contextInitialized(ServletContextEvent event) {
        context = event.getServletContext();

        logSrv.log(this, Thread.currentThread(), INFO, "Starting up Fiduciario Web Application .... ");

        Locale.setDefault(new Locale("ES", "MX"));

        /*ConfigurationService.setConfigFilePath(context.getRealPath("/WEB-INF/config/fiduciario_config.xml"));
    ConfigurationService config = ConfigurationService.getInstance();

    try {

      config.loadConfiguration();

    } catch (ConfigurationException e) {
      logSrv.log(this, Thread.currentThread(), ERROR, e);
    }*/

        // Propiedad que permite establecer el factory de transformacion utilizado por FOP
        //System.setProperty("javax.xml.transform.TransformerFactory", config.getProperty("fopTransformerFactory"));
        //logSrv.log(this, Thread.currentThread(), INFO, "javax.xml.transform.TransformerFactory set to: " + config.getProperty("fopTransformerFactory"));

        /*logSrv.log(this, Thread.currentThread(), INFO, "config.getProperty(\"LoadToplinkSessions\"): " + config.getProperty("LoadToplinkSessions"));
    boolean loadToplinkSessions = new Boolean((config.getProperty("LoadToplinkSessions") == null ? "true" : config.getProperty("LoadToplinkSessions"))).booleanValue();
    logSrv.log(this, Thread.currentThread(), INFO, "loadToplinkSessions: " + loadToplinkSessions);

    if(loadToplinkSessions) {

      logSrv.log(this, Thread.currentThread(), INFO, "Toplink sessions File: " + config.getProperty("toplinkSessionsFile"));

      ClassLoader classLoader = null;

      try {

        classLoader = Thread.currentThread().getContextClassLoader(); //this.getClass().getClassLoader();

      } catch (Exception e) {
        e.printStackTrace();
      }

      try {

        logSrv.log(this, Thread.currentThread(), INFO, "property: " + config.getProperty("toplinkSessionName"));
        logSrv.log(this, Thread.currentThread(), INFO, "classloader: " + classLoader);

      } catch (Exception e) {

        logSrv.log(this, Thread.currentThread(), INFO, "----> " + config.getProperty("toplinkSessionName"));

        e.printStackTrace();

      }

    } else {
      config.setProperty("LoadToplinkSessions", "true");
    }*/

        logSrv.log(this, Thread.currentThread(), INFO, "Fiduciario Web Application Started up!");
    }

    public void contextDestroyed(ServletContextEvent event) {
        context = event.getServletContext();
    }
}
