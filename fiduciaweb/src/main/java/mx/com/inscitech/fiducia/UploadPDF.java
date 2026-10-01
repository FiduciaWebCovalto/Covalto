package mx.com.inscitech.fiducia;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import com.google.gson.Gson;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import mx.com.inscitech.fiducia.services.ConfigLoader;
import mx.com.inscitech.fiducia.services.servicios;
public class UploadPDF extends servicios{
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadPDF.class);


    public static String uploadFileAndData(InputStream inputStream, 
                                           String fileFieldName,
                                           String fileName,
                                           Map<String, String> additionalData,
                                           String id,String fiso,String persona,String token) 
                                             throws IOException {
           String secret = "dennis123456789phegon123456789den1234321";
           String apiUrl = ConfigLoader.getUrl();
           LOGGER.debug("apiUrl de archivo config "+apiUrl);
           String targetUrl=apiUrl+"/api/documentos/contrato/upload";
           //String token = generateToken(secret, "Inmuebles@trustechcapitalmexico.com");
           String boundary = "===" + UUID.randomUUID().toString() + "===";
           String crlf = "\r\n";
           String twoHyphens = "--";

           HttpURLConnection connection = (HttpURLConnection) new URL(targetUrl).openConnection();
           connection.setUseCaches(false);
           connection.setDoOutput(true);
           connection.setDoInput(true);
           connection.setRequestMethod("POST");
           connection.setRequestProperty("Connection", "Keep-Alive");
           connection.setRequestProperty("Cache-Control", "no-cache");
           // Establecer Token
           connection.setRequestProperty("Authorization", "Bearer " + token);
           connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

           try (OutputStream outputStream = connection.getOutputStream();
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true)) {

               // 1. Enviar datos JSON (serializados como parte del form-data)
               Gson gson = new Gson();
               String jsonPart = gson.toJson(additionalData);
               
               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"id\"").append(crlf);
               writer.append("Content-Type: application/json; charset=UTF-8").append(crlf);
               writer.append(crlf).append(id).append(crlf).flush();

               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"id2\"").append(crlf);
               writer.append("Content-Type: application/json; charset=UTF-8").append(crlf);
               writer.append(crlf).append(fiso).append(crlf).flush();

               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"id3\"").append(crlf);
               writer.append("Content-Type: application/json; charset=UTF-8").append(crlf);
               writer.append(crlf).append(persona).append(crlf).flush();


               // 2. Enviar el archivo PDF desde el InputStream
               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName + "\"").append(crlf);
               writer.append("Content-Type: application/pdf").append(crlf);
               writer.append(crlf).flush();

               byte[] buffer = new byte[4096];
               int bytesRead;
               while ((bytesRead = inputStream.read(buffer)) != -1) {
                   outputStream.write(buffer, 0, bytesRead);
               }
               outputStream.flush();
               writer.append(crlf).flush(); // Fin del archivo

               // 3. Fin de la petición multipart
               writer.append(twoHyphens).append(boundary).append(twoHyphens).append(crlf);
               writer.flush();
           }

           // Leer Respuesta
           StringBuilder response = new StringBuilder();
           int status = connection.getResponseCode();
           try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                   status >= 200 && status < 300 ? connection.getInputStream() : connection.getErrorStream()))) {
               String line;
               while ((line = reader.readLine()) != null) {
                   response.append(line);
               }
           }
           
           connection.disconnect();
           return response.toString();
       }
}