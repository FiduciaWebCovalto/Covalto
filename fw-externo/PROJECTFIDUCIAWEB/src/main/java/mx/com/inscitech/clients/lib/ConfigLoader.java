package mx.com.inscitech.clients.lib;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ConfigLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigLoader.class);

    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                LOGGER.debug("Lo siento, no se pudo encontrar config.properties");
            } else {
                // Carga el archivo de propiedades
                properties.load(input);
            }
        } catch (IOException ex) {
            LOGGER.error("Exception: ", ex);
        }
    }

    public static String getUrl() {
        return properties.getProperty("api.base.url");
    }
}
