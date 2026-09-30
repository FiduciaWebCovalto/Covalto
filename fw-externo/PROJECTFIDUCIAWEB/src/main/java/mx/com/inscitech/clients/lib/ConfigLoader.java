package mx.com.inscitech.clients.lib;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ConfigLoader {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Lo siento, no se pudo encontrar config.properties");
            } else {
                // Carga el archivo de propiedades
                properties.load(input);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("api.base.url");
    }
}
