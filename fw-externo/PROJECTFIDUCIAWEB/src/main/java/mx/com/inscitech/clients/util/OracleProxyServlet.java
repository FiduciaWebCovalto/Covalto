package mx.com.inscitech.clients.util;

import mx.com.inscitech.clients.lib.ConfigLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
import java.time.Duration;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Universal Reverse Proxy Servlet for WS_Oracle backend services.
 * <p>
 * Proxies all HTTP methods (GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD),
 * query parameters, request bodies (JSON, form data, multipart, binary),
 * and response streams (JSON, PDF, Excel) transparently between callers
 * and the WS_Oracle backend service.
 * </p>
 * <p>
 * Also provides static helper methods for server-side Java callers in
 * PROJECTFIDUCIAWEB wishing to call WS_Oracle endpoints directly.
 * </p>
 */
@WebServlet(
    name = "OracleProxyServlet",
    urlPatterns = {"/orcl/*", "/api/orcl/*"},
    asyncSupported = true
)
public class OracleProxyServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LoggerFactory.getLogger(OracleProxyServlet.class);

    /**
     * Shared thread-safe HttpClient instance for proxy forwarding and programmatic calls.
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

    private String targetBaseUrl;
    private int timeoutMs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        String configuredUrl = config.getInitParameter("targetBaseUrl");
        if (configuredUrl == null || configuredUrl.trim().isEmpty()) {
            ServletContext servletContext = config.getServletContext();
            if (servletContext != null) {
                configuredUrl = servletContext.getInitParameter("apiBaseUrlOracle");
                if (configuredUrl == null || configuredUrl.trim().isEmpty()) {
                    configuredUrl = servletContext.getInitParameter("apiBaseUrl");
                }
            }
        }

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

        LOGGER.info("OracleProxyServlet initialized. Target Base URL: '{}', Timeout: {} ms", targetBaseUrl, timeoutMs);
        LOGGER.info("URLs Base: {}, Upload: {}, Download: {}, Service: {}",
                ConfigLoader.getApiBaseUrl(),
                ConfigLoader.getUploadUrl(),
                ConfigLoader.getDownloadUrl(),
                ConfigLoader.getServiceUrl()
        );
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Always apply CORS headers to accommodate web/SPA consumers
        applyCorsHeaders(request, response);

        String method = request.getMethod().toUpperCase(Locale.ROOT);

        // Preflight OPTIONS requests are handled directly with full permissions
        if ("OPTIONS".equals(method)) {
            response.setStatus(HttpServletResponse.SC_OK);
            response.flushBuffer();
            return;
        }

        String pathInfo = request.getPathInfo();
        // If root path requested on GET, provide a lightweight health/info response
        if ((pathInfo == null || pathInfo.isEmpty() || "/".equals(pathInfo)) && "GET".equals(method)) {
            sendJsonInfo(response);
            return;
        }

        LOGGER.info("Received request for path '{}' targetBaseUrl: {}", pathInfo, this.targetBaseUrl);
        String effectiveBaseUrl = (this.targetBaseUrl != null && !this.targetBaseUrl.isEmpty())
                ? this.targetBaseUrl
                : cleanTrailingSlash(ConfigLoader.getServiceUrl());

        String targetUrl = buildTargetUrl(effectiveBaseUrl, pathInfo, request.getQueryString());
        LOGGER.info("Proxying {} {} -> {}", method, request.getRequestURI(), targetUrl);

        try {
            HttpRequest.Builder reqBuilder = HttpRequest.newBuilder()
                .uri(URI.create(targetUrl))
                .timeout(Duration.ofMillis(this.timeoutMs > 0 ? this.timeoutMs : ConfigLoader.getTimeout()));

            // Forward request headers
            copyRequestHeaders(request, reqBuilder);

            // Forward request body
            HttpRequest.BodyPublisher bodyPublisher = createBodyPublisher(request, method);
            reqBuilder.method(method, bodyPublisher);

            HttpRequest httpRequest = reqBuilder.build();
            HttpResponse<InputStream> httpResponse = HTTP_CLIENT.send(
                httpRequest,
                HttpResponse.BodyHandlers.ofInputStream()
            );

            // Copy response status and headers
            response.setStatus(httpResponse.statusCode());
            copyResponseHeaders(httpResponse, response);

            // Stream response body back to caller
            try (InputStream in = httpResponse.body();
                 OutputStream out = response.getOutputStream()) {
                in.transferTo(out);
                out.flush();
            }

        } catch (HttpConnectTimeoutException | ConnectException e) {
            LOGGER.error("Connection failed to WS_Oracle backend ({}): {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_BAD_GATEWAY, "Bad Gateway",
                "Unable to connect to WS_Oracle backend at " + targetUrl);
        } catch (HttpTimeoutException e) {
            LOGGER.error("Timeout waiting for WS_Oracle backend ({}): {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_GATEWAY_TIMEOUT, "Gateway Timeout",
                "Request timed out waiting for WS_Oracle backend at " + targetUrl);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.error("Proxy execution interrupted for {}: {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Interrupted",
                "Proxy request execution was interrupted");
        } catch (IllegalArgumentException e) {
            LOGGER.error("Invalid URL or URI syntax for proxy target {}: {}", targetUrl, e.getMessage());
            sendErrorJson(response, HttpServletResponse.SC_BAD_REQUEST, "Bad Request",
                "Invalid target URI: " + e.getMessage());
        } catch (Exception e) {
            LOGGER.error("Unexpected error proxying to {}: {}", targetUrl, e.getMessage(), e);
            sendErrorJson(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Proxy Error",
                "Unexpected proxy error: " + e.getMessage());
        }
    }

    /**
     * Builds the final destination URL by combining target base URL, path, and query string.
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

    /**
     * Copies non-restricted headers from the HttpServletRequest into the outgoing HttpRequest.
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

        // Add standard forwarding headers
        String remoteAddr = request.getRemoteAddr();
        if (remoteAddr != null && !remoteAddr.isEmpty()) {
            builder.header("X-Forwarded-For", remoteAddr);
        }
        builder.header("X-Forwarded-Proto", request.getScheme());
        String reqHost = request.getHeader("Host");
        if (reqHost != null && !reqHost.isEmpty()) {
            builder.header("X-Forwarded-Host", reqHost);
        }
    }

    /**
     * Creates an appropriate BodyPublisher depending on HTTP method and request content.
     */
    private HttpRequest.BodyPublisher createBodyPublisher(HttpServletRequest request, String method) throws IOException {
        if ("GET".equals(method) || "HEAD".equals(method) || "DELETE".equals(method)) {
            // Check if DELETE has body (rare, but supported)
            if ("DELETE".equals(method)) {
                byte[] bodyBytes = request.getInputStream().readAllBytes();
                return bodyBytes.length > 0
                    ? HttpRequest.BodyPublishers.ofByteArray(bodyBytes)
                    : HttpRequest.BodyPublishers.noBody();
            }
            return HttpRequest.BodyPublishers.noBody();
        }

        byte[] bodyBytes = request.getInputStream().readAllBytes();
        return bodyBytes.length > 0
            ? HttpRequest.BodyPublishers.ofByteArray(bodyBytes)
            : HttpRequest.BodyPublishers.noBody();
    }

    /**
     * Copies response headers from the backend HttpResponse to the client HttpServletResponse.
     */
    private void copyResponseHeaders(HttpResponse<?> httpResponse, HttpServletResponse response) {
        for (Map.Entry<String, List<String>> entry : httpResponse.headers().map().entrySet()) {
            String name = entry.getKey();
            String lower = name.toLowerCase(Locale.ROOT);
            if (HOP_BY_HOP_RESPONSE_HEADERS.contains(lower)) {
                continue;
            }
            for (String val : entry.getValue()) {
                response.addHeader(name, val);
            }
        }
    }

    /**
     * Applies open CORS headers to prevent cross-origin blocks in browser clients.
     */
    private void applyCorsHeaders(HttpServletRequest request, HttpServletResponse response) {
        String origin = request.getHeader("Origin");
        if (origin != null && !origin.trim().isEmpty()) {
            response.setHeader("Access-Control-Allow-Origin", origin.trim());
        } else {
            response.setHeader("Access-Control-Allow-Origin", "*");
        }
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Expose-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
    }

    private void sendJsonInfo(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("application/json;charset=UTF-8");
        String effectiveBaseUrl = (this.targetBaseUrl != null) ? this.targetBaseUrl : ConfigLoader.getServiceUrl();
        String json = "{\"service\":\"OracleProxyServlet\",\"status\":\"UP\",\"targetBaseUrl\":\""
            + escapeJson(effectiveBaseUrl) + "\"}";
        response.getWriter().write(json);
        response.flushBuffer();
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

    protected static String cleanTrailingSlash(String url) {
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

    // =========================================================================
    // Programmatic Java API for Server-Side Callers in PROJECTFIDUCIAWEB
    // =========================================================================

    /**
     * Executes a programmatic GET request against the WS_Oracle backend.
     *
     * @param path The endpoint path (e.g. "/api/roles" or "api/roles")
     * @return The response body as a String
     */
    public static String get(String path) throws IOException, InterruptedException {
        return send("GET", path, null, null).body();
    }

    /**
     * Executes a programmatic POST request with a JSON payload against the WS_Oracle backend.
     *
     * @param path The endpoint path (e.g. "/api/auth/login")
     * @param jsonBody The JSON payload
     * @return The response body as a String
     */
    public static String post(String path, String jsonBody) throws IOException, InterruptedException {
        Map<String, String> headers = Map.of("Content-Type", "application/json", "Accept", "application/json");
        return send("POST", path, jsonBody, headers).body();
    }

    /**
     * Executes a programmatic PUT request with a JSON payload against the WS_Oracle backend.
     *
     * @param path The endpoint path
     * @param jsonBody The JSON payload
     * @return The response body as a String
     */
    public static String put(String path, String jsonBody) throws IOException, InterruptedException {
        Map<String, String> headers = Map.of("Content-Type", "application/json", "Accept", "application/json");
        return send("PUT", path, jsonBody, headers).body();
    }

    /**
     * Executes a programmatic DELETE request against the WS_Oracle backend.
     *
     * @param path The endpoint path (e.g. "/api/roles/1")
     * @return The response body as a String
     */
    public static String delete(String path) throws IOException, InterruptedException {
        return send("DELETE", path, null, null).body();
    }

    /**
     * Executes a generic programmatic HTTP request against the WS_Oracle backend.
     *
     * @param method HTTP method (GET, POST, PUT, DELETE, PATCH, etc.)
     * @param path Endpoint path
     * @param body String body (or null if none)
     * @param headers Optional custom headers
     * @return The HttpResponse with String body
     */
    public static HttpResponse<String> send(String method, String path, String body, Map<String, String> headers)
            throws IOException, InterruptedException {

        String baseUrl = cleanTrailingSlash(ConfigLoader.getServiceUrl());
        String targetUrl = buildTargetUrl(baseUrl, path, null);

        HttpRequest.Builder builder = HttpRequest.newBuilder()
            .uri(URI.create(targetUrl))
            .timeout(Duration.ofMillis(ConfigLoader.getTimeout()));

        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String key = entry.getKey();
                if (!HOP_BY_HOP_REQUEST_HEADERS.contains(key.toLowerCase(Locale.ROOT))) {
                    builder.header(key, entry.getValue());
                }
            }
        }

        HttpRequest.BodyPublisher publisher;
        if (body != null && !body.isEmpty()) {
            publisher = HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8);
        } else {
            publisher = HttpRequest.BodyPublishers.noBody();
        }

        builder.method(method.toUpperCase(Locale.ROOT), publisher);
        return HTTP_CLIENT.send(builder.build(), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
    }

    /**
     * Returns the currently configured target base URL.
     */
    public static String getTargetBaseUrl() {
        return cleanTrailingSlash(ConfigLoader.getServiceUrl());
    }
}
