package mx.com.inscitech.fiducia.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import mx.com.inscitech.fiducia.domain.BeneficiDTO;
import mx.com.inscitech.fiducia.domain.FideicomDTO;
import mx.com.inscitech.fiducia.domain.PdfDocument;
import mx.com.inscitech.fiducia.domain.PdfDocumentContrato;
import mx.com.inscitech.fiducia.domain.TercerosDTO;
import mx.com.inscitech.fiducia.domain.VistaCom;
import mx.com.inscitech.fiducia.domain.VistaMov;

@WebServlet("/proceso")
public class MasterServices extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(MasterServices.class);

    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_CONNECT_TIMEOUT = 15000; // 15 segundos
    private static final int DEFAULT_READ_TIMEOUT = 30000;    // 30 segundos

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String p1 = request.getParameter("param1");
        String p2 = request.getParameter("param2");
        String p3 = request.getParameter("param3"); // token
        String p4 = request.getParameter("param4"); // usuario

        LOGGER.info("Peticion POST recibida en MasterServices (/proceso) - Caso (param1): {}, Parametro (param2): {}, Usuario (param4): {}", 
                p1, p2, p4);

        int caso = 0;
        try {
            if (p1 != null && !p1.trim().isEmpty()) {
                caso = Integer.parseInt(p1.trim());
            } else {
                LOGGER.warn("El parametro 'param1' es nulo o vacio.");
                response.getWriter().print("[]");
                return;
            }
        } catch (NumberFormatException e) {
            LOGGER.error("Formato invalido para 'param1': {}", p1, e);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().print("[]");
            return;
        }

        String[] sRegreso = consumo(caso, p2, p3, p4);

        Gson gson = new Gson();
        String jsonResponse = gson.toJson(sRegreso != null ? sRegreso : new String[0]);
        LOGGER.info("Respuesta enviada desde MasterServices (/proceso) [Total elementos: {}]: {}", 
                (sRegreso != null ? sRegreso.length : 0), jsonResponse);

        PrintWriter out = response.getWriter();
        out.print(jsonResponse);
        out.flush();
    }

    /**
     * Consume la API REST correspondiente al caso especificado y transforma
     * la respuesta en un arreglo de cadenas estructuradas para el frontend.
     *
     * @param caso Numero de operacion a ejecutar (1 a 7)
     * @param param1 Parametro principal (ID, folio, etc.)
     * @param token Token de autenticacion Bearer
     * @param usuario Nombre de usuario que realiza la operacion
     * @return Arreglo de cadenas formateadas con los datos consultados
     */
    public String[] consumo(int caso, String param1, String token, String usuario) {
        String[] resultado = null;
        String apiUrl = ConfigLoader.getUploadUrl();
        LOGGER.info("URL base obtenida de ConfigLoader: {}", apiUrl);

        String urlBase = apiUrl != null && apiUrl.endsWith("/") 
                ? apiUrl.substring(0, apiUrl.length() - 1) 
                : apiUrl;

        String safeParam = param1 != null ? param1.trim() : "";
        String urlfinal = "";

        switch (caso) {
            case 1: // Parametro por id fideicomitente
                urlfinal = urlBase + "/fideicom/buscar?id=" + safeParam;
                break;
            case 2: // Parametro por id beneficiario
                urlfinal = urlBase + "/beneficiario/buscar?id=" + safeParam;
                break;            
            case 3: // Parametro por id terceros
                urlfinal = urlBase + "/Otros/buscar?id=" + safeParam;
                break;            
            case 4: // Vista movimiento
                urlfinal = urlBase + "/vistas/vista7?id7=" + safeParam;
                break;            
            case 5: // Vista comite
                urlfinal = urlBase + "/vistas/vista8?id8=" + safeParam;
                break;            
            case 6: // Datos archivos para visualizar pasando el folio
                urlfinal = urlBase + "/api/documentos/buscar?id=" + safeParam;
                break;
            case 7: // Datos archivos para visualizar pasando el folio contrato
                urlfinal = urlBase + "/api/documentos/contrato/buscardatos/id?id=" + safeParam;
                break;
            default:
                LOGGER.warn("Caso no soportado en consumo: {}", caso);
                return new String[0];
        }

        LOGGER.info("Consumiendo endpoint para caso {}: {}", caso, urlfinal);

        try {
            String jsoncadena = consumeApiRest(urlfinal, token, usuario);
            LOGGER.info("Respuesta cruda de API (caso {}): {}", caso, jsoncadena);

            if (jsoncadena == null || jsoncadena.trim().isEmpty()) {
                LOGGER.warn("La respuesta JSON de la API fue nula o vacia para caso: {}", caso);
                return (caso == 7) ? null : new String[0];
            }

            Gson gson = new GsonBuilder()
                    .serializeNulls()
                    .create();

            int cont = 0;
            switch (caso) {
                case 1: { // Fideicomitente
                    Type listType = new TypeToken<List<FideicomDTO>>() {}.getType();
                    List<FideicomDTO> fideicom = gson.fromJson(jsoncadena, listType);
                    if (fideicom != null) {
                        resultado = new String[fideicom.size()];
                        for (FideicomDTO item : fideicom) {
                            if (item != null) {
                                String nom = item.fidNomFideicom != null ? item.fidNomFideicom : "";
                                String tipo = item.fidCveTipoPer != null ? item.fidCveTipoPer : "";
                                resultado[cont++] = "FIDEICOMITENTE-" + nom + "-" + tipo;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
                case 2: { // Beneficiarios
                    Type listType = new TypeToken<List<BeneficiDTO>>() {}.getType();
                    List<BeneficiDTO> benefici = gson.fromJson(jsoncadena, listType);
                    if (benefici != null) {
                        resultado = new String[benefici.size()];
                        for (BeneficiDTO item : benefici) {
                            if (item != null) {
                                String nom = item.benNomBenef != null ? item.benNomBenef : "";
                                String tipo = item.benCveTipoPer != null ? item.benCveTipoPer : "";
                                resultado[cont++] = "FIDEICOMITENTE-" + nom + "-" + tipo;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
                case 3: { // Terceros
                    Type listType = new TypeToken<List<TercerosDTO>>() {}.getType();
                    List<TercerosDTO> tercero = gson.fromJson(jsoncadena, listType);
                    if (tercero != null) {
                        resultado = new String[tercero.size()];
                        for (TercerosDTO item : tercero) {
                            if (item != null) {
                                String nom = item.terNomTercero != null ? item.terNomTercero : "";
                                String tipo = item.terCveTipoPers != null ? item.terCveTipoPers : "";
                                resultado[cont++] = "FIDEICOMITENTE-" + nom + "-" + tipo;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
                case 4: { // Vista movimiento
                    Type listType = new TypeToken<List<VistaMov>>() {}.getType();
                    List<VistaMov> v1 = gson.fromJson(jsoncadena, listType);
                    if (v1 != null) {
                        resultado = new String[v1.size()];
                        for (VistaMov item : v1) {
                            if (item != null) {
                                resultado[cont++] = item.folio + "-" + item.fecha + "-" + item.tipo + "-" + item.importe;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
                case 5: { // Vista comite
                    Type listType = new TypeToken<List<VistaCom>>() {}.getType();
                    List<VistaCom> v2 = gson.fromJson(jsoncadena, listType);
                    if (v2 != null) {
                        resultado = new String[v2.size()];
                        for (VistaCom item : v2) {
                            if (item != null) {
                                resultado[cont++] = item.fecha + "-" + item.nombre + "-" + item.finalidad;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
                case 6: { // Documentos por folio
                    Type listType = new TypeToken<List<PdfDocument>>() {}.getType();
                    List<PdfDocument> datosdocumento = gson.fromJson(jsoncadena, listType);
                    if (datosdocumento != null) {
                        resultado = new String[datosdocumento.size()];
                        for (PdfDocument item : datosdocumento) {
                            if (item != null) {
                                resultado[cont++] = item.nombre + "-" + item.filePath + "-" + item.contentType;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
                case 7: { // Documentos de contrato
                    Type listType = new TypeToken<List<PdfDocumentContrato>>() {}.getType();
                    List<PdfDocumentContrato> datosdocumentoC = gson.fromJson(jsoncadena, listType);
                    if (datosdocumentoC != null) {
                        resultado = new String[datosdocumentoC.size()];
                        for (PdfDocumentContrato item : datosdocumentoC) {
                            if (item != null) {
                                resultado[cont++] = item.nombre + "-" + item.filePath + "-" + item.contentType;
                            }
                        }
                    } else {
                        resultado = new String[0];
                    }
                    break;
                }
            }

            if (resultado != null) {
                LOGGER.info("Elementos procesados para caso {}: total={}", caso, resultado.length);
                for (String item : resultado) {
                    LOGGER.info("Salida datos caso {}: {}", caso, item);
                }
            } else {
                LOGGER.warn("Resultado nulo para caso {}", caso);
            }

        } catch (Exception e) {
            LOGGER.error("Error al procesar consumo caso {}: {}", caso, e.getMessage(), e);
            if (caso == 7) {
                resultado = null;
            } else {
                resultado = new String[0];
            }
        }

        return resultado;
    }

    /**
     * Realiza una peticion GET a un endpoint REST con autenticacion Bearer Token,
     * manejando tiempos de espera, codificacion UTF-8 y cierre seguro de conexiones.
     *
     * @param urlfinal URL completa del servicio REST
     * @param token Token Bearer para autorizacion
     * @param usuario Nombre de usuario
     * @return Cadena con la respuesta JSON del servicio REST
     */
    public String consumeApiRest(String urlfinal, String token, String usuario) {
        if (urlfinal == null || urlfinal.trim().isEmpty()) {
            LOGGER.warn("urlfinal es nula o vacia en consumeApiRest.");
            return "";
        }

        LOGGER.info("Invocando API REST GET: {} (usuario: {})", urlfinal, usuario);
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlfinal);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            int connectTimeout = ConfigLoader.getTimeout() > 0 ? ConfigLoader.getTimeout() : DEFAULT_CONNECT_TIMEOUT;
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(DEFAULT_READ_TIMEOUT);

            if (token != null && !token.trim().isEmpty()) {
                conn.setRequestProperty("Authorization", "Bearer " + token.trim());
            }

            int responseCode = conn.getResponseCode();
            LOGGER.info("Codigo de respuesta HTTP obtenido de {}: {}", urlfinal, responseCode);

            InputStream stream = (responseCode >= 200 && responseCode < 300) 
                    ? conn.getInputStream() 
                    : conn.getErrorStream();

            if (stream == null) {
                LOGGER.warn("El flujo de respuesta fue nulo para {}", urlfinal);
                return "";
            }

            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
                String output;
                while ((output = br.readLine()) != null) {
                    sb.append(output);
                }
            }

            String respuesta = sb.toString();
            if (responseCode >= 200 && responseCode < 300) {
                return respuesta;
            } else {
                LOGGER.error("Error devuelto por API REST [HTTP {}] desde {}: {}", responseCode, urlfinal, respuesta);
                throw new IOException("Error HTTP " + responseCode + ": " + respuesta);
            }

        } catch (Exception e) {
            LOGGER.error("Error al consumir API REST [{}]: {}", urlfinal, e.getMessage(), e);
            return null;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    /**
     * Genera un token JWT firmado para autenticacion de servicios.
     *
     * @param secretKey Clave secreta para la firma HMAC-SHA256
     * @param subject Identificador de sujeto o usuario
     * @return Token JWT serializado en formato String
     */
    public static String generateToken(String secretKey, String subject) {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        Key key = Keys.hmacShaKeyFor(keyBytes);

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1 hora
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
