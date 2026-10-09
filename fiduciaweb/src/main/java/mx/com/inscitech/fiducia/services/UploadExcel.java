package mx.com.inscitech.fiducia.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Map;
import java.util.UUID;

public class UploadExcel extends MasterServices{
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadExcel.class);

    public static String uploadFileAndData(InputStream inputStream, 
                                           String fileFieldName,
                                           String fileName,
                                           Map<String, String> additionalData,
                                           String id,String token,String origen,
                                           String fecha,String fiso) 
                                             throws IOException {
           String secret = "dennis123456789phegon123456789den1234321";
           String apiUrl = ConfigLoader.getUrl();
           LOGGER.info("apiUrl de archivo config {}", apiUrl);           
           String targetUrl=apiUrl+"/api/excel/upload";
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
               writer.append("Content-Disposition: form-data; name=\"origen\"").append(crlf);
               writer.append("Content-Type: application/json; charset=UTF-8").append(crlf);
               writer.append(crlf).append(origen).append(crlf).flush();

               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"fecha\"").append(crlf);
               writer.append("Content-Type: application/json; charset=UTF-8").append(crlf);
               writer.append(crlf).append(fecha).append(crlf).flush();

               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"fiso\"").append(crlf);
               writer.append("Content-Type: application/json; charset=UTF-8").append(crlf);
               writer.append(crlf).append(fiso).append(crlf).flush();


               // 3. Enviar el archivo PDF desde el InputStream
               writer.append(twoHyphens).append(boundary).append(crlf);
               writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName + "\"").append(crlf);
               writer.append("Content-Type: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet").append(crlf);
               
               
               writer.append(crlf).flush();

               byte[] buffer = new byte[4096];
               int bytesRead;
               while ((bytesRead = inputStream.read(buffer)) != -1) {
                   outputStream.write(buffer, 0, bytesRead);
               }
               outputStream.flush();
               writer.append(crlf).flush(); // Fin del archivo

               // 3. Fin de la petici�n multipart
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

