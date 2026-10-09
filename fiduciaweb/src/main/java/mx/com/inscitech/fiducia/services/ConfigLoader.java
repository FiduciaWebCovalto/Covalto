package mx.com.inscitech.fiducia.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Utility class to load application configuration values with the following precedence:
 * 1. Process environment variables (e.g. API_BASE_URL, APP_TIMEOUT)
 * 2. JVM system properties (e.g. -Dapi.base.url, -Dapp.timeout)
 * 3. Local .env file (if present in working directory or parent directories)
 * 4. config.properties from classpath
 * 5. Default values (URL: http://localhost:8091, timeout: 5000)
 */
public class ConfigLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigLoader.class);

    private static final String DEFAULT_URL = "http://localhost:8091";
    private static final String DEFAULT_UPLOAD_URL = "http://localhost:8091";
    private static final int DEFAULT_TIMEOUT = 5000;

    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
        // 1. Load config.properties from classpath
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input != null) {
                properties.load(input);
                LOGGER.info("config.properties loaded successfully from classpath.");
            } else {
                LOGGER.debug("config.properties not found on classpath.");
            }
        } catch (IOException ex) {
            LOGGER.warn("Failed to load config.properties: {}", ex.getMessage());
        }

        // 2. Load optional .env file if available
        loadDotEnv();
    }

    private static void loadDotEnv() {
        String[] possiblePaths = {
            ".env",
            "../.env",
            "../../.env"
        };
        for (String path : possiblePaths) {
            LOGGER.info("Searching env file '{}'", path);
            File envFile = new File(path);
            if (envFile.exists() && envFile.isFile()) {
                LOGGER.info("env file '{}' found!", path);
                try (FileInputStream fis = new FileInputStream(envFile)) {
                    Properties dotEnvProps = new Properties();
                    dotEnvProps.load(fis);
                    for (String name : dotEnvProps.stringPropertyNames()) {
                        LOGGER.info("Property name '{}'", name);
                        String resolvedValue = resolvePlaceholders(dotEnvProps.getProperty(name));
                        LOGGER.info("Property name '{}' Value: '{}'", resolvedValue);
                        if (!properties.containsKey(name) && resolvedValue != null) {
                            properties.setProperty(name, resolvedValue);
                        }
                    }
                    LOGGER.info("Loaded .env file configuration from: {}", envFile.getAbsolutePath());
                    break;
                } catch (IOException e) {
                    LOGGER.debug("Could not read .env from {}: {}", path, e.getMessage());
                }
            }
        }
    }

    private static String resolvePlaceholders(String value) {
        if (value == null) {
            return null;
        }
        value = value.trim();
        if (value.startsWith("${") && value.endsWith("}")) {
            String inner = value.substring(2, value.length() - 1).trim();
            int colonIdx = inner.indexOf(":-");
            if (colonIdx >= 0) {
                String varName = inner.substring(0, colonIdx).trim();
                String defVal = inner.substring(colonIdx + 2).trim();
                String envVal = System.getenv(varName);
                if (envVal != null && !envVal.trim().isEmpty()) {
                    return envVal.trim();
                }
                return defVal;
            } else {
                String envVal = System.getenv(inner);
                if (envVal != null && !envVal.trim().isEmpty()) {
                    return envVal.trim();
                }
                return "";
            }
        }
        return value;
    }

    /**
     * Resolves a configuration property checking in order:
     * 1. System environment variables (uppercase with underscores, or original key)
     * 2. JVM system properties (original key, or uppercase with underscores)
     * 3. Loaded properties (config.properties / .env)
     * 4. defaultValue fallback
     */
    public static String getProperty(String key, String defaultValue) {
        LOGGER.info("Environment Property '{}' Default '{}'", key, defaultValue);
        if (key == null) {
            return defaultValue;
        }

        String envKey = key.toUpperCase().replace('.', '_').replace('-', '_');
        LOGGER.info("Environment Property Key Name '{}'", envKey);

        // 1. Environment variables
        String val = System.getenv(envKey);
        LOGGER.info("Value '{}'", val);

        if (val != null && !val.trim().isEmpty()) {
            return resolvePlaceholders(val);
        }
        val = System.getenv(key);
        if (val != null && !val.trim().isEmpty()) {
            return resolvePlaceholders(val);
        }

        // 2. JVM system properties
        val = System.getProperty(key);
        if (val != null && !val.trim().isEmpty()) {
            return resolvePlaceholders(val);
        }
        val = System.getProperty(envKey);
        if (val != null && !val.trim().isEmpty()) {
            return resolvePlaceholders(val);
        }

        // 3. Properties from config.properties or .env
        val = properties.getProperty(key);
        if (val != null && !val.trim().isEmpty()) {
            return resolvePlaceholders(val);
        }
        val = properties.getProperty(envKey);
        if (val != null && !val.trim().isEmpty()) {
            return resolvePlaceholders(val);
        }

        // 4. Default fallback
        return defaultValue;
    }

    public static String getProperty(String key) {
        LOGGER.info("Key Name '{}'", key);
        return getProperty(key, null);

    }

    public static int getIntProperty(String key, int defaultValue) {
        String val = getProperty(key, null);
        if (val != null) {
            try {
                return Integer.parseInt(val.trim());
            } catch (NumberFormatException e) {
                LOGGER.warn("Invalid integer value '{}' for property '{}', falling back to default: {}", val, key, defaultValue);
            }
        }
        return defaultValue;
    }

    /**
     * Returns the base API URL (e.g. from API_BASE_URL or config.properties),
     * defaulting to http://localhost:8091.
     * Any trailing slash is trimmed to ensure consistent endpoint construction.
     */
    public static String getUrl() {
        String url = getProperty("api.base.url", DEFAULT_URL);
        LOGGER.info("api.base.url '{}'", url);
        if (url != null && url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        return url;
    }

    /**
     * Returns the base API URL (e.g. from API_BASE_URL or config.properties),
     * defaulting to http://localhost:8091.
     * Any trailing slash is trimmed to ensure consistent endpoint construction.
     */
    public static String getUploadUrl() {
        String url = getProperty("api.upload.url", DEFAULT_UPLOAD_URL);
        LOGGER.info("api.upload.url '{}'", url);
        if (url != null && url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        return url;
    }

    /**
     * Returns the application timeout in milliseconds (e.g. from APP_TIMEOUT or config.properties),
     * defaulting to 5000.
     */
    public static int getTimeout() {
        return getIntProperty("app.timeout", DEFAULT_TIMEOUT);
    }
}
