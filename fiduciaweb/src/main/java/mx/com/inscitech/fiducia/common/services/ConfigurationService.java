package mx.com.inscitech.fiducia.common.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;

import java.util.HashMap;
import java.util.Iterator;

import mx.com.inscitech.fiducia.common.ConfigurationException;
import mx.com.inscitech.fiducia.common.FiduciaWebBase;
import mx.com.inscitech.fiducia.dml.GenericDML;
import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.dml.vo.DataSet;

import org.apache.commons.configuration.SubnodeConfiguration;
import org.apache.commons.configuration.XMLConfiguration;

/**
 * Clase que para procesar y almacenar la configuracion del sistema
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConfigurationService extends FiduciaWebBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationService.class);


    private static ConfigurationService instance = null;

    private String configFilePath = "/WEB-INF/config/fiduciario_config.xml";
    private static boolean CONFIG_LOADED_ONCE = false;

    private static HashMap<String, String> properties = null;

    private File configFile = null;

    private long lastModified = 0L;

    static {
        properties = new HashMap<String, String>();
        instance = new ConfigurationService();
    }

    private ConfigurationService() {
        super();
    }

    public static boolean isConfigLoadedOnce() {
        return CONFIG_LOADED_ONCE;
    }

    public static ConfigurationService getInstance() {
        return instance;
    }

    public ConfigurationService loadConfiguration() throws ConfigurationException {

        this.logger.info("Loading Configuration...");
        this.logger.info("Config File Path: " + this.configFilePath);

        if (this.configFile == null)
            this.configFile = new File(configFilePath);
        if (!configFile.exists())
            this.logger.fatal("Config File does not exist!");

        this.lastModified = configFile.lastModified();

        this.logger.info("Config File: " + this.configFile + " Path: " + this.configFile.getAbsolutePath());

        XMLConfiguration config = null;
        Iterator itProperties = null;
        SubnodeConfiguration property = null;

        try {

            config = new XMLConfiguration(configFile);

            this.logger.info("Reading properties...");
            itProperties = config.configurationsAt("properties.property").iterator();

            String propertyName = "", propertyValue = "";

            while (itProperties.hasNext()) {
                property = (SubnodeConfiguration) itProperties.next();

                propertyName = "" + property.getRootNode()
                                            .getAttribute(0)
                                            .getValue();
                propertyValue = property.getString("");

                this.logger.info("Configuration property " + propertyName + ": " + propertyValue);

                properties.put(propertyName, propertyValue);
            }

            CONFIG_LOADED_ONCE = true;

            this.logger.info("...Properties readed sccessfully!");
            this.logger.info("... Configuration Loaded!");

        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
            throw new ConfigurationException(e);
        }
        
        return this;
    }

    private void verificaCambios() {

        if (this.configFile != null && lastModified != configFile.lastModified()) {
            this.logger.debug("Verificar cambios de: " + configFile + " Path Value: " + configFilePath + " Path: " + this.configFile.getAbsolutePath());             
            try {
                loadConfiguration();
            } catch (ConfigurationException e) {
                LOGGER.error("Exception: ", e);
                logger.fatal(this, e);
            }
        }
    }

    public String getProperty(String key) {
        return getProperty(key, null);
    }

    public String getProperty(String key, String defaultValue) {
        verificaCambios();
        String value = properties.get(key);
        if(value == null || "".equals(value)) value = defaultValue;
        return value;
    }

    public HashMap<String, String> getPropertySet(String baseName) {
        verificaCambios();

        String key = "", value = null;

        HashMap<String, String> result = new HashMap<String, String>();
        Iterator itKeys = properties.keySet().iterator();

        while (itKeys.hasNext()) {
            key = (String) itKeys.next();
            if (key.indexOf(baseName) > -1) {
                value = "" + properties.get(key);
                result.put(key, value);
            }
        }
        return result;
    }

    public void setProperty(String key, String value) {
        XMLConfiguration config = null;

        try {
            config = new XMLConfiguration(configFile);

            Iterator itProperties = config.configurationsAt("properties.property").iterator();

            while (itProperties.hasNext()) {
                SubnodeConfiguration property = (SubnodeConfiguration) itProperties.next();
                if (!property.getRootNode()
                             .getAttribute(0)
                             .getValue()
                             .equals(key))
                    continue;

                this.logger.info("Set Configuration property \"" + key + "\"  from: " + property.getString("") + " to: " + value);

                property.getRootNode().setValue(value);

                properties.put(key, value);
            }

            config.save();

        } catch (Exception e) {
            logger.fatal(this, e);
        }
    }

    public ConfigurationService setConfigFilePath(String newConfigFilePath) {
        this.logger.info("Set Configuration file to: " + configFilePath);
        this.configFilePath = newConfigFilePath;
        return this;
    }

    public String getConfigFilePath() {
        return configFilePath;
    }
    
    public ConfigurationService loadFiduciaConfigFromDB() {
        String sql = "SELECT PARAM_CLAVE, PARAM_VALOR2 FROM PARAM_GLOBAL";
        GenericDML dml = new GenericDML();
        DataSet params = dml.getDataSet(sql);
        for(DataRow param : params.getRows()) {
            properties.put(param.getString("PARAM_CLAVE"), param.getString("PARAM_VALOR2"));
        }
        return this;
    }
    
}
