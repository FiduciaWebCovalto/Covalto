package mx.com.inscitech.fiducia.services;

import org.junit.Assert;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class PdfConsumerTest {

    private HttpServletRequest createMockRequest(String pathInfo, Map<String, String> params) {
        return (HttpServletRequest) Proxy.newProxyInstance(
            HttpServletRequest.class.getClassLoader(),
            new Class<?>[]{HttpServletRequest.class},
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String methodName = method.getName();
                    if ("getPathInfo".equals(methodName)) {
                        return pathInfo;
                    }
                    if ("getParameter".equals(methodName) && args != null && args.length > 0) {
                        String paramName = (String) args[0];
                        return params != null ? params.get(paramName) : null;
                    }
                    if ("getQueryString".equals(methodName)) {
                        return null;
                    }
                    if ("getRequestURI".equals(methodName)) {
                        return "/PdfConsumer" + (pathInfo != null ? pathInfo : "");
                    }
                    return null;
                }
            }
        );
    }

    @Test
    public void testBuildTargetUrlBasic() {
        String url = PdfConsumer.buildTargetUrl("http://localhost:8091", "/api/documentos/api/pdf/10", null);
        Assert.assertEquals("http://localhost:8091/api/documentos/api/pdf/10", url);
    }

    @Test
    public void testBuildTargetUrlWithQuery() {
        String url = PdfConsumer.buildTargetUrl("http://localhost:8091", "/api/documentos/buscar", "id=123");
        Assert.assertEquals("http://localhost:8091/api/documentos/buscar?id=123", url);
    }

    @Test
    public void testResolveTargetUrlLegacyParamCaso1() {
        Map<String, String> params = new HashMap<>();
        params.put("param1", "1");
        params.put("param2", "99");

        HttpServletRequest request = createMockRequest(null, params);
        String url = PdfConsumer.resolveTargetUrl(request, "http://localhost:8091");
        Assert.assertEquals("http://localhost:8091/api/documentos/api/pdf/99", url);
    }

    @Test
    public void testResolveTargetUrlLegacyParamCaso2() {
        Map<String, String> params = new HashMap<>();
        params.put("param1", "2");
        params.put("param2", "100");
        params.put("param3", "200");
        params.put("param4", "300");

        HttpServletRequest request = createMockRequest(null, params);
        String url = PdfConsumer.resolveTargetUrl(request, "http://localhost:8091");
        Assert.assertEquals("http://localhost:8091/api/documentos/contrato/api/pdf/100/200/300", url);
    }

    @Test
    public void testResolveTargetUrlNamedParamsInferredContrato() {
        Map<String, String> params = new HashMap<>();
        params.put("folio", "456");
        params.put("fiso", "789");
        params.put("persona", "12");

        HttpServletRequest request = createMockRequest(null, params);
        String url = PdfConsumer.resolveTargetUrl(request, "http://localhost:8091");
        Assert.assertEquals("http://localhost:8091/api/documentos/contrato/api/pdf/456/789/12", url);
    }

    @Test
    public void testResolveTargetUrlPathInfoContrato() {
        HttpServletRequest request = createMockRequest("/contrato/11/22/33", null);
        String url = PdfConsumer.resolveTargetUrl(request, "http://localhost:8091");
        Assert.assertEquals("http://localhost:8091/api/documentos/contrato/api/pdf/11/22/33", url);
    }

    @Test
    public void testResolveTargetUrlPathInfoDocumento() {
        HttpServletRequest request = createMockRequest("/documento/555", null);
        String url = PdfConsumer.resolveTargetUrl(request, "http://localhost:8091");
        Assert.assertEquals("http://localhost:8091/api/documentos/api/pdf/555", url);
    }

    @Test
    public void testResolveTargetUrlMissingIdReturnsNull() {
        HttpServletRequest request = createMockRequest(null, new HashMap<>());
        String url = PdfConsumer.resolveTargetUrl(request, "http://localhost:8091");
        Assert.assertNull(url);
    }

    @Test
    public void testCleanPdfExtensionDoubleExtension() {
        String result = PdfConsumer.cleanPdfExtension("contrato_123.pdf.pdf");
        Assert.assertEquals("contrato_123.pdf", result);
    }

    @Test
    public void testCleanPdfExtensionMultipleExtensions() {
        String result = PdfConsumer.cleanPdfExtension("archivo.pdf.pdf.pdf");
        Assert.assertEquals("archivo.pdf", result);
    }

    @Test
    public void testCleanPdfExtensionWithoutExtension() {
        String result = PdfConsumer.cleanPdfExtension("documento_456");
        Assert.assertEquals("documento_456.pdf", result);
    }

    @Test
    public void testCleanPdfExtensionNormal() {
        String result = PdfConsumer.cleanPdfExtension("documento.pdf");
        Assert.assertEquals("documento.pdf", result);
    }

    @Test
    public void testCleanPdfExtensionNullOrEmpty() {
        Assert.assertEquals("documento.pdf", PdfConsumer.cleanPdfExtension(null));
        Assert.assertEquals("documento.pdf", PdfConsumer.cleanPdfExtension("   "));
    }

    @Test
    public void testSanitizeContentDispositionFromFormDataWithDoublePdf() {
        String raw = "form-data; name=\"inline\"; filename=\"contrato_ABC.pdf.pdf\"";
        String sanitized = PdfConsumer.sanitizeContentDisposition(raw, "fallback.pdf");
        Assert.assertEquals("inline; filename=\"contrato_ABC.pdf\"", sanitized);
    }

    @Test
    public void testSanitizeContentDispositionForcesInline() {
        String raw = "attachment; filename=\"reporte.pdf\"";
        String sanitized = PdfConsumer.sanitizeContentDisposition(raw, "fallback.pdf");
        Assert.assertEquals("inline; filename=\"reporte.pdf\"", sanitized);
    }

    @Test
    public void testSanitizeContentDispositionNullHeaderUsesDefault() {
        String sanitized = PdfConsumer.sanitizeContentDisposition(null, "mi_doc.pdf");
        Assert.assertEquals("inline; filename=\"mi_doc.pdf\"", sanitized);
    }
}
