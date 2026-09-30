package mx.com.inscitech.clients.lib;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;

public class UploadPDF extends servicios{

    public String sendPdfToRestApi(InputStream fileStream, String fileName, 
                                       String description, String token) throws IOException {
            String apiUrl = ConfigLoader.getUrl();
            System.out.println("apiUrl de archivo config "+apiUrl);
            String url=apiUrl+"/api/documentos/upload";
            HttpClient client = HttpClient.newHttpClient();
            String boundary = "JavaMultipartBoundary-" + UUID.randomUUID();
            
            // --- Construir el cuerpo de la petición (Multipart/form-data) ---
            byte[] separator = ("--" + boundary + "\r\nContent-Disposition: form-data; name=")
                    .getBytes(StandardCharsets.UTF_8);
            
            ArrayList<byte[]> byteArrays = new ArrayList<>();
            
            // 2. Archivo PDF
            byteArrays.add(separator);
            byteArrays.add(("\"file\"; filename=\"" + fileName + "\"\r\n" +
                            "Content-Type: application/pdf\r\n\r\n").getBytes(StandardCharsets.UTF_8));
            byteArrays.add(fileStream.readAllBytes()); // Leer el PDF
            byteArrays.add("\r\n".getBytes(StandardCharsets.UTF_8));

            // 1. Dato Adicional (Texto)
            byteArrays.add(separator);
            byteArrays.add(("\"id\"\r\n\r\n" + description + "\r\n").getBytes(StandardCharsets.UTF_8));
            
            
            // Finalizar Boundary
            byteArrays.add(("--" + boundary + "--\r\n").getBytes(StandardCharsets.UTF_8));

            // --- Crear Request ---
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "multipart/form-data; boundary=" + boundary)
                    .header("Authorization",  "Bearer " + token) // Token de usuario
                    .POST(HttpRequest.BodyPublishers.ofByteArrays(byteArrays))
                    .build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                return  response.statusCode()+"";
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Error enviando archivo", e);
            }
        }
}