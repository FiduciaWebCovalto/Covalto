package mx.com.inscitech.fiducia.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import mx.com.inscitech.fiducia.services.ConfigLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serial;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpConnectTimeoutException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Streaming Reverse Proxy Servlet for PDF document visualization.
 * <p>
 * Proxies PDF requests directly between client visualizers (such as VisualizadorPDF.jsp,
 * iframes, direct browser requests) and the backend REST service (WS_Oracle).
 * </p>
 * <p>
 * Operates in streaming mode (zero-buffering in memory via transferTo) to prevent
 * OutOfMemory errors on large PDFs, forwards upstream HTTP headers (Content-Type,
 * Content-Disposition, Cache-Control), manages connection timeouts, and supports
 * both legacy form parameters and direct REST path routing.
 * </p>
 */
@WebServlet(
    name = "PdfConsumer",
    urlPatterns = {"/PdfConsumer", "/PdfConsumer/*"},
    asyncSupported = true
)
public class PdfConsumer extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LoggerFactory.getLogger(PdfConsumer.class);

    /**
     * Shared thread-safe HttpClient instance with connection pooling and HTTP/1.1 keep-alive.
     */
    private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(10))
        .build();

    /**
     * Hop-by-hop and restricted request headers that should not be forwarded directly.
     */
    private static final Set<String> HOP_BY_HOP_REQUEST_HEADERS = Set.of(
        "host",
        "connection",
        "keep-alive",
        "content-length",
        "transfer-encoding",
        "expect",
        "upgrade",
        "te",
        "trailer",
        "proxy-authenticate",
        "proxy-authorization"
    );

    /**
     * Hop-by-hop response headers that must not be copied back to the client.
     */
    private static final Set<String> HOP_BY_HOP_RESPONSE_HEADERS = Set.of(
        "connection",
        "keep-alive",
        "transfer-encoding"
    );

    private static final Pattern FILENAME_PATTERN = Pattern.compile(
        "filename\\*?=['\"]?(?:UTF-8'')?([^;\\r\\n\"']+)['\"]?",
        Pattern.CASE_INSENSITIVE
    );

    private String targetBaseUrl;
    private int timeoutMs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        String configuredUrl = config.getInitParameter("targetBaseUrl");
        if (configuredUrl != null && !configuredUrl.trim().isEmpty()) {
            this.targetBaseUrl = cleanTrailingSlash(configuredUrl.trim());
        } else {
            this.targetBaseUrl = cleanTrailingSlash(ConfigLoader.getServiceUrl());
        }

        String configuredTimeout = config.getInitParameter("timeoutMs");
        if (configuredTimeout != null && !configuredTimeout.trim().isEmpty()) {
            try {
                this.timeoutMs = Integer.parseInt(configuredTimeout.trim());
            } catch (NumberFormatException e) {
                LOGGER.warn("Invalid timeoutMs init parameter '{}', using ConfigLoader timeout", configuredTimeout);
                this.timeoutMs = ConfigLoader.getTimeout();
            }
        } else {
            this.timeoutMs = ConfigLoader.getTimeout();
        }

        LOGGER.info("PdfConsumer proxy initialized. Target Base URL: '{}', Timeout: {} ms", targetBaseUrl, timeoutMs);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Always apply CORS headers to accommodate web/SPA/iframe consumers
        applyCorsHeaders(request, response);

        String method = request.getMethod().toUpperCase(Locale.ROOT);

        // Preflight OPTIONS requests are handled directly
        if ("OPTIONS".equals(method)) {
            response.setStatus(HttpServletResponse.SC_OK);
            response.flushBuffer();
            return;
        }

        processProxyRequest(request, response);
    }

    /**
     * Core proxy execution for both GET and POST requests.
     */
    private void processProxyRequest(HttpServletRequest request, HttpServletResponse response) 
            throws IOException {

        String effectiveBaseUrl = (this.targetBaseUrl != null && !this.targetBaseUrl.isEmpty())
                ? this.targetBaseUrl
                : cleanTrailingSlash(ConfigLoader.getApiBaseUrl());

        String targetUrl = resolveTargetUrl(request, effectiveBaseUrl);
        if (targetUrl == null) {
            LOGGER.warn("No se pudo resolver la URL destino del PDF para la peticion: {}", request.getRequestURI());
            sendErrorJson(response, HttpServletResponse.SC_BAD_REQUEST, "Bad Request",
                    "Parametros insuficientes para localizar el documento PDF (folio/id requerido)");
            return;
        }

        String token = resolveToken(request);
        LOGGER.info("PdfConsumer proxying {} {} -> {}", request.getMethod(), request.getRequestURI(), targetUrl);

        try {
            int effectiveTimeout = this.timeoutMs > 0 ? this.timeoutMs : ConfigLoader.getTimeout();
            HttpRequest.Builder reqBuilder = HttpRequest.newBuilder()
                .uri(URI.create(targetUrl))
                .timeout(Duration.ofMillis(effectiveTimeout > 0 ? effectiveTimeout : 30000))
                .GET();

            // Forward non-restricted request headers
            copyRequestHeaders(request, reqBuilder);

            // Ensure proper Bearer token is set
            if (token != null && !token.trim().isEmpty()) {
                reqBuilder.setHeader("Authorization", "Bearer " + token.trim());
            }

            // Ensure Accept header indicates PDF or binary
            reqBuilder.setHeader("Accept", "application/pdf, application/octet-stream, */*");

            HttpRequest httpRequest = reqBuilder.build();
            HttpResponse<InputStream> httpResponse = HTTP_CLIENT.send(
                httpRequest,
                HttpResponse.BodyHandlers.ofInputStream()
            );

            int statusCode = httpResponse.statusCode();
            LOGGER.info("Respuesta del backend WS_Oracle ({}) -> HTTP {}", targetUrl, statusCode);
            response.setStatus(statusCode);

            // Copy upstream response headers (Content-Type, Content-Disposition, Cache-Control, etc.)
            copyResponseHeaders(httpResponse, response);

            // Direct streaming via transferTo: zero-buffering in server RAM
            try (InputStream in = httpResponse.body();
                 OutputStream out = response.getOutputStream()) {
                in.transferTo(out);
                out.flush();
            }

        } catch (HttpConnectTimeoutException | ConnectException e) {
            LOGGER.error("Fallo de conexion al backend WS_Oracle ({}): {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_BAD_GATEWAY, "Bad Gateway",
                    "No fue posible conectar con el servicio backend en " + targetUrl);
        } catch (HttpTimeoutException e) {
            LOGGER.error("Tiempo de espera agotado al consultar PDF en ({}): {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_GATEWAY_TIMEOUT, "Gateway Timeout",
                    "Tiempo de espera agotado esperando el archivo PDF desde " + targetUrl);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.error("Ejecucion de proxy de PDF interrumpida para {}: {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Interrupted",
                    "La solicitud de proxy fue interrumpida");
        } catch (IllegalArgumentException e) {
            LOGGER.error("Sintaxis URI invalida para {} en PdfConsumer: {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_BAD_REQUEST, "Bad Request",
                    "URI de destino invalida: " + e.getMessage());
        } catch (Exception e) {
            LOGGER.error("Error inesperado en PdfConsumer proxy hacia {}: {}", targetUrl, e.getMessage(), e);
            sendErrorJson(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Proxy Error",
                    "Error inesperado al obtener el documento PDF: " + e.getMessage());
        }
    }

    /**
     * Resolves the target backend URL by inspecting PathInfo (direct REST mapping)
     * or query/form parameters (backward compatibility with VisualizadorPDF.jsp).
     */
    protected static String resolveTargetUrl(HttpServletRequest request, String baseUrl) {
        String pathInfo = request.getPathInfo();

        // 1. PathInfo directo (ej: /PdfConsumer/contrato/1/2/3 o /PdfConsumer/api/documentos/...)
        if (pathInfo != null && pathInfo.length() > 1 && !"/".equals(pathInfo)) {
            String cleanPath = pathInfo.startsWith("/") ? pathInfo.substring(1) : pathInfo;
            String[] parts = cleanPath.split("/");

            if ("contrato".equalsIgnoreCase(parts[0]) && parts.length >= 4) {
                // /contrato/{id}/{id2}/{id3}
                return baseUrl + "/api/documentos/contrato/api/pdf/" + parts[1] + "/" + parts[2] + "/" + parts[3];
            } else if (("documento".equalsIgnoreCase(parts[0]) || "folio".equalsIgnoreCase(parts[0])) && parts.length >= 2) {
                // /documento/{id} o /folio/{id}
                return baseUrl + "/api/documentos/api/pdf/" + parts[1];
            } else if (cleanPath.startsWith("api/")) {
                // Passthrough directo para rutas API completas
                return buildTargetUrl(baseUrl, "/" + cleanPath, request.getQueryString());
            }
        }

        // 2. Modo Parametros (compatible con VisualizadorPDF.jsp y formularios)
        String caso = getParam(request, "param1", "opcion", "caso");
        String id = getParam(request, "param2", "id", "folio");
        String fiso = getParam(request, "param3", "id2", "fiso");
        String persona = getParam(request, "param4", "id3", "persona");

        if (id == null || id.trim().isEmpty()) {
            return null;
        }

        String safeId = id.trim();
        // Si no se especifica caso pero viene id2/fiso, se infiere contrato (caso 2)
        if (caso == null || caso.trim().isEmpty()) {
            caso = (fiso != null && !fiso.trim().isEmpty()) ? "2" : "1";
        }

        if ("2".equals(caso.trim())) {
            // Documento de contrato: id / fiso / persona
            String safeFiso = (fiso != null && !fiso.trim().isEmpty()) ? fiso.trim() : "0";
            String safePersona = (persona != null && !persona.trim().isEmpty()) ? persona.trim() : "0";
            return baseUrl + "/api/documentos/contrato/api/pdf/" + safeId + "/" + safeFiso + "/" + safePersona;
        } else {
            // Caso 1: Carta instruccion / Documento general por folio
            return baseUrl + "/api/documentos/api/pdf/" + safeId;
        }
    }

    /**
     * Builds the destination URL by combining baseUrl, path, and query string.
     */
    protected static String buildTargetUrl(String baseUrl, String pathInfo, String queryString) {
        StringBuilder sb = new StringBuilder(baseUrl);
        if (pathInfo != null && !pathInfo.isEmpty()) {
            if (!pathInfo.startsWith("/")) {
                sb.append("/");
            }
            sb.append(pathInfo);
        }
        if (queryString != null && !queryString.trim().isEmpty()) {
            sb.append("?").append(queryString.trim());
        }
        return sb.toString();
    }

    private static String getParam(HttpServletRequest request, String... names) {
        for (String name : names) {
            String val = request.getParameter(name);
            if (val != null && !val.trim().isEmpty()) {
                return val.trim();
            }
        }
        return null;
    }

    /**
     * Extracts Bearer token from the Authorization header or fallback parameter.
     */
    private static String resolveToken(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.toLowerCase(Locale.ROOT).startsWith("bearer ")) {
            return authHeader.substring(7).trim();
        }
        return getParam(request, "param5", "token");
    }

    /**
     * Copies non-restricted headers from the client request to the outgoing HTTP request.
     */
    private void copyRequestHeaders(HttpServletRequest request, HttpRequest.Builder builder) {
        Enumeration<String> headerNames = request.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String headerName = headerNames.nextElement();
                String lower = headerName.toLowerCase(Locale.ROOT);
                if (HOP_BY_HOP_REQUEST_HEADERS.contains(lower)) {
                    continue;
                }
                Enumeration<String> values = request.getHeaders(headerName);
                while (values.hasMoreElements()) {
                    String value = values.nextElement();
                    builder.header(headerName, value);
                }
            }
        }
    }

    /**
     * Copies response headers from the upstream backend to the client response,
     * sanitizing Content-Disposition to inline and ensuring clean PDF headers.
     */
    private void copyResponseHeaders(HttpResponse<?> httpResponse, HttpServletResponse response) {
        int statusCode = httpResponse.statusCode();
        boolean isSuccess = (statusCode >= 200 && statusCode < 300);
        boolean dispositionSet = false;
        boolean contentTypeSet = false;

        for (Map.Entry<String, List<String>> entry : httpResponse.headers().map().entrySet()) {
            String name = entry.getKey();
            String lower = name.toLowerCase(Locale.ROOT);
            if (HOP_BY_HOP_RESPONSE_HEADERS.contains(lower)) {
                continue;
            }
            if ("content-disposition".equals(lower)) {
                String raw = entry.getValue().isEmpty() ? null : entry.getValue().get(0);
                response.setHeader("Content-Disposition", sanitizeContentDisposition(raw, "documento.pdf"));
                dispositionSet = true;
                continue;
            }
            if ("content-type".equals(lower)) {
                String ct = entry.getValue().isEmpty() ? "application/pdf" : entry.getValue().get(0);
                if (isSuccess && ct.toLowerCase(Locale.ROOT).contains("octet-stream")) {
                    ct = "application/pdf";
                }
                response.setHeader("Content-Type", ct);
                contentTypeSet = true;
                continue;
            }
            for (String val : entry.getValue()) {
                response.addHeader(name, val);
            }
        }

        if (isSuccess && !dispositionSet) {
            response.setHeader("Content-Disposition", "inline; filename=\"documento.pdf\"");
        }
        if (isSuccess && !contentTypeSet) {
            response.setContentType("application/pdf");
        }
    }

    /**
     * Sanitizes the Content-Disposition header so that:
     * 1. The disposition type is forced to 'inline' for proper in-browser rendering.
     * 2. The filename is preserved, cleaned of duplicate '.pdf' extensions, and always ends with '.pdf'.
     */
    protected static String sanitizeContentDisposition(String rawDisposition, String defaultName) {
        String filename = (defaultName != null && !defaultName.trim().isEmpty()) ? defaultName.trim() : "documento.pdf";
        if (rawDisposition != null && !rawDisposition.trim().isEmpty()) {
            Matcher matcher = FILENAME_PATTERN.matcher(rawDisposition);
            if (matcher.find()) {
                String matched = matcher.group(1).trim();
                if (!matched.isEmpty()) {
                    filename = matched;
                }
            }
        }
        filename = cleanPdfExtension(filename);
        return "inline; filename=\"" + filename + "\"";
    }

    /**
     * Cleans repeated '.pdf' extensions (e.g., 'doc.pdf.pdf' -> 'doc.pdf')
     * and guarantees that the filename ends with '.pdf'.
     */
    protected static String cleanPdfExtension(String filename) {
        if (filename == null || filename.trim().isEmpty()) {
            return "documento.pdf";
        }
        String clean = filename.trim().replace("\"", "").replace("'", "");
        while (clean.toLowerCase(Locale.ROOT).endsWith(".pdf.pdf")) {
            clean = clean.substring(0, clean.length() - 4);
        }
        if (!clean.toLowerCase(Locale.ROOT).endsWith(".pdf")) {
            clean = clean + ".pdf";
        }
        return clean;
    }

    /**
     * Applies open CORS headers for browser clients and iframes.
     */
    private void applyCorsHeaders(HttpServletRequest request, HttpServletResponse response) {
        String origin = request.getHeader("Origin");
        if (origin != null && !origin.trim().isEmpty()) {
            response.setHeader("Access-Control-Allow-Origin", origin.trim());
        } else {
            response.setHeader("Access-Control-Allow-Origin", "*");
        }
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Expose-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
    }

    private void sendErrorJson(HttpServletResponse response, int status, String error, String message) throws IOException {
        if (!response.isCommitted()) {
            response.setStatus(status);
            response.setContentType("application/json;charset=UTF-8");
            String json = String.format("{\"status\":%d,\"error\":\"%s\",\"message\":\"%s\"}",
                    status, escapeJson(error), escapeJson(message));
            response.getWriter().write(json);
            response.flushBuffer();
        }
    }

    private static String cleanTrailingSlash(String url) {
        if (url != null && url.endsWith("/")) {
            return url.substring(0, url.length() - 1);
        }
        return url;
    }

    private static String escapeJson(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\b", "\\b")
                .replace("\f", "\\f")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    /**
     * Helper method to generate signed JWT token for authentication (retained for backward compatibility).
     */
    public static String generateToken(String secretKey, String subject) {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        Key key = Keys.hmacShaKeyFor(keyBytes);

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
