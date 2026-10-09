package mx.com.inscitech.fiducia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.com.inscitech.fiducia.services.ConfigLoader;
import mx.com.inscitech.fiducia.services.MasterServices;

public class UploadPDF extends MasterServices {

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadPDF.class);
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int DEFAULT_READ_TIMEOUT = 60000; // 60 segundos

    /**
     * Envia un archivo PDF y sus metadatos a la API REST de documentos de contrato
     * mediante una solicitud multipart/form-data.
     *
     * @param inputStream Flujo de datos del archivo PDF
     * @param fileFieldName Nombre del campo del archivo en multipart (por defecto "file")
     * @param fileName Nombre del archivo a enviar
     * @param additionalData Mapa con metadatos adicionales opcionales
     * @param id Identificador de documento / folio
     * @param fiso Numero de contrato / fideicomiso
     * @param persona Numero de persona / prospecto
     * @param token Token Bearer de autenticacion
     * @return Respuesta del servicio REST remoto
     * @throws IOException Si ocurre un error de red o de flujo de datos
     */
    public static String uploadFileAndData(InputStream inputStream, 
                                           String fileFieldName,
                                           String fileName,
                                           Map<String, String> additionalData,
                                           String id, String fiso, String persona, String token) 
                                           throws IOException {

        if (inputStream == null) {
            throw new IllegalArgumentException("El InputStream del archivo no puede ser nulo.");
        }

        String apiUrl = ConfigLoader.getUploadUrl();
        LOGGER.info("URL base obtenida de ConfigLoader: {}", apiUrl);

        String targetUrl = (apiUrl.endsWith("/") ? apiUrl.substring(0, apiUrl.length() - 1) : apiUrl) 
                + "/api/documentos/contrato/upload";

        String fieldName = (fileFieldName != null && !fileFieldName.trim().isEmpty()) 
                ? fileFieldName.trim() : "file";

        String safeFileName = "documento.pdf";
        if (fileName != null && !fileName.trim().isEmpty()) {
            try {
                safeFileName = Paths.get(fileName).getFileName().toString().replace("\"", "");
            } catch (Exception e) {
                int slashIdx = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
                safeFileName = (slashIdx >= 0 ? fileName.substring(slashIdx + 1) : fileName).replace("\"", "");
            }
        }

        String safeId = id != null ? id.trim() : "";
        String safeFiso = fiso != null ? fiso.trim() : "";
        String safePersona = persona != null ? persona.trim() : "";

        LOGGER.info("Iniciando carga de archivo PDF hacia: {}", targetUrl);
        LOGGER.info("Parametros: fileName='{}', fieldName='{}', id='{}', fiso='{}', persona='{}'", 
                safeFileName, fieldName, safeId, safeFiso, safePersona);

        if (additionalData != null && !additionalData.isEmpty()) {
            LOGGER.info("Metadatos adicionales proporcionados: {}", additionalData);
        }

        String boundary = "===" + UUID.randomUUID() + "===";
        String crlf = "\r\n";
        String twoHyphens = "--";

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(targetUrl).openConnection();
            connection.setUseCaches(false);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Cache-Control", "no-cache");

            // Configurar tiempos de espera (timeouts)
            int connectTimeout = ConfigLoader.getTimeout() > 0 ? ConfigLoader.getTimeout() : 15000;
            connection.setConnectTimeout(connectTimeout);
            connection.setReadTimeout(DEFAULT_READ_TIMEOUT);

            // Establecer Token de autorizacion
            if (token != null && !token.trim().isEmpty()) {
                connection.setRequestProperty("Authorization", "Bearer " + token.trim());
            } else {
                LOGGER.warn("No se proporciono token Bearer para la peticion a {}", targetUrl);
            }
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

            // Transmision de campos y archivo
            long totalBytesEnviados = 0;
            try (OutputStream outputStream = connection.getOutputStream();
                 PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true)) {

                // 1. Campo id
                writer.append(twoHyphens).append(boundary).append(crlf);
                writer.append("Content-Disposition: form-data; name=\"id\"").append(crlf);
                writer.append("Content-Type: text/plain; charset=UTF-8").append(crlf);
                writer.append(crlf).append(safeId).append(crlf).flush();

                // 2. Campo id2 (fiso)
                writer.append(twoHyphens).append(boundary).append(crlf);
                writer.append("Content-Disposition: form-data; name=\"id2\"").append(crlf);
                writer.append("Content-Type: text/plain; charset=UTF-8").append(crlf);
                writer.append(crlf).append(safeFiso).append(crlf).flush();

                // 3. Campo id3 (persona)
                writer.append(twoHyphens).append(boundary).append(crlf);
                writer.append("Content-Disposition: form-data; name=\"id3\"").append(crlf);
                writer.append("Content-Type: text/plain; charset=UTF-8").append(crlf);
                writer.append(crlf).append(safePersona).append(crlf).flush();

                // 4. Archivo PDF desde el InputStream
                writer.append(twoHyphens).append(boundary).append(crlf);
                writer.append("Content-Disposition: form-data; name=\"")
                      .append(fieldName)
                      .append("\"; filename=\"")
                      .append(safeFileName)
                      .append("\"").append(crlf);
                writer.append("Content-Type: application/pdf").append(crlf);
                writer.append(crlf).flush();

                byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                    totalBytesEnviados += bytesRead;
                }
                outputStream.flush();
                writer.append(crlf).flush(); // Fin de la seccion del archivo

                // 5. Fin de la peticion multipart
                writer.append(twoHyphens).append(boundary).append(twoHyphens).append(crlf);
                writer.flush();
            }

            LOGGER.info("Archivo '{}' transmitido con exito. Total de bytes enviados: {}", safeFileName, totalBytesEnviados);

            // Leer respuesta remota
            int status = connection.getResponseCode();
            LOGGER.info("Codigo de respuesta HTTP recibido de {}: {}", targetUrl, status);

            StringBuilder response = new StringBuilder();
            InputStream stream = (status >= 200 && status < 300) 
                    ? connection.getInputStream() 
                    : connection.getErrorStream();

            if (stream != null) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                }
            } else {
                LOGGER.warn("Flujo de respuesta nulo para codigo HTTP: {}", status);
                response.append("HTTP Error: ").append(status);
            }

            String respuestaStr = response.toString();
            LOGGER.info("Respuesta obtenida del servicio REST: {}", respuestaStr);
            return respuestaStr;

        } catch (IOException e) {
            LOGGER.error("Error durante la conexion o carga del archivo PDF a {}: {}", targetUrl, e.getMessage(), e);
            throw e;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}

