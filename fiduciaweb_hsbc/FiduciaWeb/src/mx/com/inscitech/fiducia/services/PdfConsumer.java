package mx.com.inscitech.fiducia.services;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import com.google.gson.Gson;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Key;
import java.util.Date;
import java.io.InputStream;
import java.io.OutputStream;

import java.nio.charset.StandardCharsets;

import javax.servlet.ServletOutputStream;

import mx.com.inscitech.fiducia.domain.FideicomDTO;

@WebServlet("/PdfConsumer")
public class PdfConsumer extends HttpServlet {

    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
            String urlfinal="";
            String apiUrl = ConfigLoader.getUrl();
            System.out.println("apiUrl de archivo config "+apiUrl);
            
            String pathurl=apiUrl;
            HttpURLConnection connection = null;
            String []sRegreso={};
            // 1. Recibir los parámetros
            String p1 = request.getParameter("param1");//caso
            String p2 = request.getParameter("param2");//folio
            String p3 = request.getParameter("param3");//fiso
            String p4 = request.getParameter("param4");//persona
            
            String p5 = request.getParameter("param5");//token
            String p6 = request.getParameter("param6");//usuario            
            String sNombrePDF="";
            String validaSalida="";
            servicios datospdf = new servicios();
            switch(Integer.valueOf(p1).intValue()){
                case 1://parametro por folio para visualizar carta instruccion
                    sRegreso=datospdf.consumo(6,p2,p5,p6);
                    break;
                case 2://parametro por folio para visualizar documentos contrato
                    //sRegreso=datospdf.consumo(7,p2+"&id2="+p3);
                    sRegreso= new String[1];
                    sRegreso[0]="validado";
                    break;

            }
            
            for (String item : sRegreso) {
                System.out.println("item:"+item);
                //validaSalida=item;
                String []sProv=item.split("-");
                sNombrePDF=sProv[0];
            }
            System.out.println("p1:"+p1);
            System.out.println("p2:"+p2);
            System.out.println("p3:"+p3);
            System.out.println("p4:"+p4);
            System.out.println("sRegreso:"+sRegreso);
                try{
                    if(sRegreso!=null){
                        switch(Integer.valueOf(p1).intValue()){
                            case 1://parametro por folio para visualizar carta instruccion
                                urlfinal = 
                                    pathurl+"/api/documentos/api/pdf/"+p2;
                                break;
                            case 2://parametro por folio para visualizar documentos contrato
                                urlfinal = 
                                    pathurl+"/api/documentos/contrato/api/pdf/"+p2+"/"+p3+"/"+p4;
                                break;
        
                        }
 
                        String secret = "dennis123456789phegon123456789den1234321"; // Ejemplo
                        String token = generateToken(secret, p6);
                        URL url = new URL(urlfinal);

                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("GET");
                        conn.setRequestProperty("Authorization", "Bearer " + p5);
                        conn.setRequestProperty("Accept", "application/json"); // O "application/pdf"
                        
                        if (conn.getResponseCode() != 200) {
                            throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
                        }
                        
                        // 2. Leer la respuesta (JSON que contiene los bytes en Base64 o flujo binario directo)
                        InputStream is = conn.getInputStream();
                        byte[] pdfBytes = readAllBytes(is);
                        conn.disconnect();

                        // --- CASO B: La API devuelve el binario directo (recomendado) ---
                        byte[] finalPdfBytes = pdfBytes; 

                        // 3. Configurar la respuesta del Servlet para el navegador
                        response.setContentType("application/pdf");
                        response.setHeader("Content-Disposition", "inline; filename=archivo_" + sNombrePDF + ".pdf");
                        response.setContentLength(finalPdfBytes.length);

                        // 4. Escribir los bytes en el flujo de salida
                        OutputStream os = response.getOutputStream();
                        os.write(finalPdfBytes);
                        os.flush();
                        os.close();                        
                    }else{
                            String miCadenaFija = "800";
                            
                            // 2. Obtener el ServletOutputStream
                            ServletOutputStream os = response.getOutputStream();
                            
                            // 3. Escribir la cadena convirtiéndola a bytes con UTF-8
                            os.write(miCadenaFija.getBytes(StandardCharsets.UTF_8));
                            os.flush();
                            os.close(); 
                    }
                
            }
            catch (Exception e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error interno");
            } 
            finally {
                    if (connection != null) connection.disconnect();
                }
        }
    
    // Método auxiliar para leer InputStream a bytes en Java nativo
        private byte[] readAllBytes(InputStream inputStream) throws IOException {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int nRead;
            byte[] data = new byte[16384];
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
            return buffer.toByteArray();
        }

    public static String generateToken(String secretKey, String subject) {
        // La clave debe ser lo suficientemente larga para el algoritmo HS256
        byte[] keyBytes = secretKey.getBytes();
        Key key = Keys.hmacShaKeyFor(keyBytes);

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1 hora
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }    
}