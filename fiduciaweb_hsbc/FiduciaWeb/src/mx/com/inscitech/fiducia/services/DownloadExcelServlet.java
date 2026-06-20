package mx.com.inscitech.fiducia.services;

import java.security.Key;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@WebServlet("/downloadExcel")
public class DownloadExcelServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
            // Permitir acceso desde cualquier origen
            response.setHeader("Access-Control-Allow-Origin", "*"); 
            response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        
            String urlfinal="";
            String apiUrl = ConfigLoader.getUrl();
            System.out.println("apiUrl de archivo config "+apiUrl);

            String pathurl=apiUrl;
            // 1. Recibir tres parámetros desde HTML/JS
            String p0 = request.getParameter("caso");
            String p1 = request.getParameter("fiso");
            String p2 = request.getParameter("fechainicial");
            String p3 = request.getParameter("fechafinal");
            System.out.println("Llega al servlet DownloadExcelServlet");
            switch(Integer.valueOf(p0).intValue()){
                case 1://Cartera
                    urlfinal = 
                        pathurl+"/cartera/buscar?fiso="+p1;//fiso
                    break;
                case 2://Detalle de cartera
                    urlfinal = 
                        pathurl+"/detcart/buscar?fiso="+p1+"&fechaInicio="+p2+"&fechaFin="+p3;
                    break;
                case 3://cifras control cuentas individuales
                    urlfinal = 
                        pathurl+"/api/excel/buscar";
                    break;            
            }
            
            // 2. Consumir API REST (Simulación con API pública)
            String jsonResponse = callRestApi(urlfinal);
            // 3. Configurar respuesta para JS
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            out.print(jsonResponse);
            out.flush();
        }

        private String callRestApi(String urlString) throws IOException {
            String secret = "dennis123456789phegon123456789den1234321"; // Ejemplo
            String token = generateToken(secret, "Inmuebles@trustechcapitalmexico.com");
            URL url = new URL(urlString);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json"); // O "application/pdf"
            
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                StringBuilder sb = new StringBuilder();
                String output;
                while ((output = br.readLine()) != null) {
                    sb.append(output);
                }
                return sb.toString();
            }
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
