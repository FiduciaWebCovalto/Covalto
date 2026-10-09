package mx.com.inscitech.clients.util;

import mx.com.inscitech.clients.lib.MasterServices;
import mx.com.inscitech.clients.lib.servicios;
import org.junit.Assert;
import org.junit.Test;

public class OracleProxyServletTest {

    @Test
    public void testBuildTargetUrlBasic() {
        String url = OracleProxyServlet.buildTargetUrl("http://localhost:8091", "/api/roles", null);
        Assert.assertEquals("http://localhost:8091/api/roles", url);
    }

    @Test
    public void testBuildTargetUrlWithoutLeadingSlash() {
        String url = OracleProxyServlet.buildTargetUrl("http://localhost:8091", "api/roles", null);
        Assert.assertEquals("http://localhost:8091/api/roles", url);
    }

    @Test
    public void testBuildTargetUrlWithQueryString() {
        String url = OracleProxyServlet.buildTargetUrl("http://localhost:8091", "/fideicom", "buscar=100&status=A");
        Assert.assertEquals("http://localhost:8091/fideicom?buscar=100&status=A", url);
    }

    @Test
    public void testBuildTargetUrlNullPath() {
        String url = OracleProxyServlet.buildTargetUrl("http://localhost:8091", null, null);
        Assert.assertEquals("http://localhost:8091", url);
    }

    @Test
    public void testBuildTargetUrlEmptyPathWithQuery() {
        String url = OracleProxyServlet.buildTargetUrl("http://localhost:8091", "", "token=abc");
        Assert.assertEquals("http://localhost:8091?token=abc", url);
    }

    @Test
    public void testCleanTrailingSlash() {
        Assert.assertEquals("http://localhost:8091", OracleProxyServlet.cleanTrailingSlash("http://localhost:8091/"));
        Assert.assertEquals("http://localhost:8091", OracleProxyServlet.cleanTrailingSlash("http://localhost:8091"));
        Assert.assertNull(OracleProxyServlet.cleanTrailingSlash(null));
    }

    @Test
    public void testGetTargetBaseUrl() {
        String baseUrl = OracleProxyServlet.getTargetBaseUrl();
        Assert.assertNotNull(baseUrl);
        Assert.assertTrue(baseUrl.startsWith("http"));
        Assert.assertFalse("Base URL should not end with a trailing slash", baseUrl.endsWith("/"));
    }

    @Test
    public void testMasterServicesAndServiciosCompatibility() {
        MasterServices master = new MasterServices();
        Assert.assertNotNull(master);

        servicios legacy = new servicios();
        Assert.assertNotNull(legacy);
        Assert.assertTrue("servicios must extend MasterServices for backward compatibility", legacy instanceof MasterServices);
    }
}
