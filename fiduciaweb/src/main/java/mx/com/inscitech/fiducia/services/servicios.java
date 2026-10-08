package mx.com.inscitech.fiducia.services;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
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
public class servicios extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(servicios.class);

    @SuppressWarnings("compatibility:-8029344130080575154")
    private static final long serialVersionUID = 1L;

    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {

            // 1. Recibir los par�metros
            String p1 = request.getParameter("param1");
            String p2 = request.getParameter("param2");
            
            String p3 = request.getParameter("param3");//token
            String p4 = request.getParameter("param4");//usuario
            LOGGER.debug("p1:"+p1);
            LOGGER.debug("p2:"+p2);
            String []sRegreso=consumo(Integer.valueOf(p1).intValue(),p2,p3,p4);
            
            // 3. Configurar la respuesta (JSON)
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            
            // Convertir array a formato JSON manualmente (para evitar dependencias extra)
            // Ejemplo simple: ["valor1", "valor2"]
            StringBuilder jsonResponse = new StringBuilder("[");
            for (int i = 0; i < sRegreso.length; i++) {
                jsonResponse.append("\"").append(sRegreso[i]).append("\"");
                if (i < sRegreso.length - 1) jsonResponse.append(",");
            }
            jsonResponse.append("]");
            
            out.print(jsonResponse.toString());
            out.flush();
        }

    public String[] consumo(int caso,String param1,String token,String usuario) {
        String resultado[]={null};
        String param0="",param2="",sResultado="";
        int cont=0;        
        String urlfinal="",jsoncadena="";
        String apiUrl = ConfigLoader.getUrl();
        LOGGER.info("apiUrl de archivo config {}", apiUrl);
        
        String url=apiUrl;

        try{
            switch(caso){
                case 1://parametro por id fideicomitente
                    urlfinal = url+"/fideicom/buscar?id="+param1;
                    break;
                case 2://parametro por id beneficiario
                    urlfinal = url+"/beneficiario/buscar?id="+param1;
                    break;            
                case 3://parametro por id terceros
                    urlfinal = url+"/Otros/buscar?id="+param1;
                    break;            
                case 4: //vista movimiento
                    urlfinal = url+"/vistas/vista7?id7="+param1;
                    break;            
                case 5: //vista comite
                    urlfinal = url+"/vistas/vista8?id8="+param1;
                    break;            
                case 6: //datos archivos para visualizar pasando el folio
                    urlfinal = url+"/api/documentos/buscar?id="+param1;
                    break;
                case 7: //datos archivos para visualizar pasando el folio contrato
                    urlfinal = url+"/api/documentos/contrato/buscardatos/id?id="+param1;
                    break;   
       
            }
               LOGGER.info("url: {}", urlfinal);

                //consumo api
                jsoncadena=consumeApiRest(urlfinal,token,usuario);
                // 2. Crear objeto Gson
                Gson gson = new GsonBuilder()
                    .serializeNulls() // Habilita la deserializaci�n de campos nulos expl�citos
                    .create();
            
                switch(caso){
                    case 1://ParamGlobal
                        // 3. Deserializar
                        //jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        Type listType = new TypeToken<List<FideicomDTO>>(){}.getType();
                        List<FideicomDTO> fideicom = gson.fromJson(jsoncadena, listType); 

                        resultado = new String[fideicom.size()];
                        cont=0;
                        for (FideicomDTO item : fideicom) {
                            resultado[cont++]="FIDEICOMITENTE-"+item.fidNomFideicom+
                                "-"+item.fidCveTipoPer;
                        }
                        break;
                    case 2://benefici
                        // 3. Deserializar
                        //jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        Type listTypeb = new TypeToken<List<BeneficiDTO>>(){}.getType();
                        List<BeneficiDTO> benefici = gson.fromJson(jsoncadena, listTypeb); 

                        resultado = new String[benefici.size()];
                        cont=0;
                        for (BeneficiDTO item : benefici) {
                            resultado[cont++]="FIDEICOMITENTE-"+item.benNomBenef+
                                "-"+item.benCveTipoPer;
                        }
                        break;
                    case 3://terceros
                        // 3. Deserializar
                        //jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        Type listTypet = new TypeToken<List<TercerosDTO>>(){}.getType();
                        List<TercerosDTO> tercero = gson.fromJson(jsoncadena, listTypet); 

                        resultado = new String[tercero.size()];
                        cont=0;
                        for (TercerosDTO item : tercero) {
                            resultado[cont++]="FIDEICOMITENTE-"+item.terNomTercero+
                                "-"+item.terCveTipoPers;
                        }
                        break;                
                    case 4://vista movimiento
                            LOGGER.debug("jsoncadena:"+jsoncadena);            
                            // Deserializar JSON a objeto Java
                            // 3. Definir el tipo de la lista (TypeToken)
                            Type typev1 = new TypeToken<List<VistaMov>>(){}.getType();
                            // 4. Deserializar
                            List<VistaMov> v1 = gson.fromJson(jsoncadena, typev1);
                            resultado = new String[v1.size()];
                            cont=0;
                            for (VistaMov item : v1) {
                                resultado[cont++]=item.folio+"-"+item.fecha+"-"+
                                    item.tipo+"-"+item.importe;
                            }
                        break;
                    case 5://vista comite
                            LOGGER.debug("jsoncadena:"+jsoncadena);            
                            // Deserializar JSON a objeto Java
                            // 3. Definir el tipo de la lista (TypeToken)
                            Type typev2 = new TypeToken<List<VistaCom>>(){}.getType();
                            // 4. Deserializar
                            List<VistaCom> v2 = gson.fromJson(jsoncadena, typev2);
                            resultado = new String[v2.size()];
                            cont=0;
                            for (VistaCom item : v2) {
                                resultado[cont++]=item.fecha+"-"+item.nombre+"-"+
                                    item.finalidad;
                            }
                        break;  
                    case 6://recuperacion de datos de documento a visualizar PdfDocumentContrato
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typevdoc = new TypeToken<List<PdfDocument>>(){}.getType();
                        // 4. Deserializar
                        List<PdfDocument> datosdocumento = gson.fromJson(jsoncadena, typevdoc);
                        resultado = new String[datosdocumento.size()];
                        cont=0;
                        for (PdfDocument item : datosdocumento) {
                            resultado[cont++]=item.nombre+"-"+item.filePath+"-"+
                                item.contentType;
                        }
                        for (String item : resultado) {
                            LOGGER.debug("salida documentos: "+item);
                        }
                    break;      
                    case 7://recuperacion de datos de documento a visualizar PdfDocumentContrato
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                    if(jsoncadena!=null){
                        Type typevdocontrato = new TypeToken<List<PdfDocumentContrato>>(){}.getType();
                        // 4. Deserializar
                        List<PdfDocumentContrato> datosdocumentoC = gson.fromJson(jsoncadena, typevdocontrato);
                        resultado = new String[datosdocumentoC.size()];
                        cont=0;
                        for (PdfDocumentContrato item : datosdocumentoC) {
                            LOGGER.debug("item opcion 7: "+item);
                            if(item!=null)
                                resultado[cont++]=item.nombre+"-"+item.filePath+"-"+item.contentType;
                        }
                        
                        for (String item : resultado) {
                            LOGGER.debug("salida documentos: "+item);
                        }                         
                    }else{
                            resultado=null;
                        }  
                        
                    break;    

                }
                
            }
            catch (Exception e) {
                        LOGGER.debug("Exception in NetClientGet:- " + e);
            }
        return resultado;
    }
    
    public String consumeApiRest(String urlfinal,String token,String usuario){
        String secret = "dennis123456789phegon123456789den1234321"; // Ejemplo
        //String token = generateToken(secret, "Inmuebles@trustechcapitalmexico.com");
        String jsoncadena ="";
        try{  
            URL url2 = new URL(urlfinal);
            HttpURLConnection conn = (HttpURLConnection) url2.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            // 2. Configurar la autenticaci�n (Bearer Token)
            conn.setRequestProperty("Authorization", "Bearer " + token);

            // 3. Verificar c�digo de respuesta
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
            }                
            // 4. Leer la respuesta
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            StringBuilder sb = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            jsoncadena = sb.toString();
            conn.disconnect();
            return jsoncadena;
            }
            catch (Exception e) {
                        LOGGER.debug("Exception in NetClientGet:- " + e);
            }
            return jsoncadena;
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
