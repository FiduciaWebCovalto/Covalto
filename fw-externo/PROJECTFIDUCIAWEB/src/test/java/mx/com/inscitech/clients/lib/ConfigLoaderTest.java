package mx.com.inscitech.clients.lib;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConfigLoaderTest {

    private String originalApiBaseUrlProp;
    private String originalAppTimeoutProp;

    @Before
    public void setUp() {
        originalApiBaseUrlProp = System.getProperty("api.base.url");
        originalAppTimeoutProp = System.getProperty("app.timeout");
        System.clearProperty("api.base.url");
        System.clearProperty("app.timeout");
    }

    @After
    public void tearDown() {
        if (originalApiBaseUrlProp != null) {
            System.setProperty("api.base.url", originalApiBaseUrlProp);
        } else {
            System.clearProperty("api.base.url");
        }

        if (originalAppTimeoutProp != null) {
            System.setProperty("app.timeout", originalAppTimeoutProp);
        } else {
            System.clearProperty("app.timeout");
        }
    }

    @Test
    public void testGetUrlDefault() {
        String url = ConfigLoader.getUrl();
        Assert.assertNotNull(url);
        // By default should return http://localhost:8091 (from config.properties or default)
        Assert.assertTrue(url.startsWith("http"));
        Assert.assertFalse("URL should not end with trailing slash", url.endsWith("/"));
    }

    @Test
    public void testGetUrlFromSystemProperty() {
        System.setProperty("api.base.url", "https://api.covalto.com/test/");
        String url = ConfigLoader.getUrl();
        Assert.assertEquals("https://api.covalto.com/test", url);
    }

    @Test
    public void testGetTimeoutDefault() {
        int timeout = ConfigLoader.getTimeout();
        Assert.assertEquals(5000, timeout);
    }

    @Test
    public void testGetTimeoutFromSystemProperty() {
        System.setProperty("app.timeout", "15000");
        int timeout = ConfigLoader.getTimeout();
        Assert.assertEquals(15000, timeout);
    }

    @Test
    public void testGetPropertyFallback() {
        String customVal = ConfigLoader.getProperty("non.existent.key", "my-default-value");
        Assert.assertEquals("my-default-value", customVal);
    }

    @Test
    public void testGetIntPropertyFallback() {
        int customVal = ConfigLoader.getIntProperty("non.existent.int", 99);
        Assert.assertEquals(99, customVal);
    }
}
