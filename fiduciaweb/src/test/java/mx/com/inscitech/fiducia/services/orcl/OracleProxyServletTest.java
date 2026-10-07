package mx.com.inscitech.fiducia.services.orcl;

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
    public void testGetTargetBaseUrl() {
        String baseUrl = OracleProxyServlet.getTargetBaseUrl();
        Assert.assertNotNull(baseUrl);
        Assert.assertTrue(baseUrl.startsWith("http"));
        Assert.assertFalse("Base URL should not end with a trailing slash", baseUrl.endsWith("/"));
    }
}
