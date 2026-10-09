package mx.com.inscitech.clients.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/uploadServlet")
// INSTRUMENTACIÓN: Configuración multipart para archivos
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 1,  // 1 MB
    maxFileSize = 1024 * 1024 * 10,       // 10 MB
    maxRequestSize = 1024 * 1024 * 15     // 15 MB
)
public class PdfServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(PdfServlet.class);

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Carpeta de destino en el servidor
        String uploadPath = "C:/uploads"; 
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdir();

        // Obtener el archivo del request
        Part filePart = request.getPart("file");
        String fileName = getFileName(filePart);
        String id=request.getParameter("id");
        String usuario="Inmuebles@trustechcapitalmexico.com";//request.getParameter("usuario");
        String token=request.getParameter("token");
        InputStream fileContent = filePart.getInputStream();
        String apiKey = "dennis123456789phegon123456789den1234321";

        /*LOGGER.debug("Archivo "+fileName);
        LOGGER.debug("Id: "+id);
        LOGGER.debug("Token: "+token);
        LOGGER.debug("Usuario: "+usuario);*/
        // Guardar archivo
        MasterServices serv = new MasterServices();
        String []resultado=serv.consumo(50,id);
        String sRegreso="500";
        LOGGER.debug("Existe el Folio: "+resultado.length);
        if(resultado.length==0){
            UploadPDF env = new UploadPDF();
            sRegreso=env.sendPdfToRestApi
                (fileContent, fileName, id, token);
        }
        else
            sRegreso="800";    
        LOGGER.debug("sendPdfToRestApi: "+sRegreso);
        response.getWriter().println(sRegreso);
    }

    // Método auxiliar para extraer nombre del archivo
    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}