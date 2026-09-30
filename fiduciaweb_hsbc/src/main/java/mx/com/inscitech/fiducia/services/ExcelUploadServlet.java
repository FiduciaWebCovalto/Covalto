package mx.com.inscitech.fiducia.services;

import java.io.IOException;
import java.io.InputStream;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import mx.com.inscitech.fiducia.UploadPDF;


// 1. Anotación necesaria para manejar multipart/form-data
@WebServlet("/ExcelUploadServlet")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 1,  // 1 MB: Archivos más pequeños se guardan en memoria
    maxFileSize = 1024 * 1024 * 10,       // 10 MB: Tamaño máximo por archivo
    maxRequestSize = 1024 * 1024 * 15     // 15 MB: Tamaño máximo total de la solicitud
)

public class ExcelUploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 2. Obtener el archivo del campo "file" del formulario
        Part filePart = request.getPart("file");
        String fileName = getFileName(filePart);
        String id=request.getParameter("type");
        String token=request.getParameter("token");
        String usuario=request.getParameter("usuario");        
        String origen=request.getParameter("origen");        
        String fecha=request.getParameter("fecha");        
        String fiso=request.getParameter("fideicomiso");        
        InputStream fileContent = filePart.getInputStream();
        
        // Validar que sea un PDF (opcional, pero recomendado)
        String contentType = filePart.getContentType();
        if (!"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(contentType)) {
            response.getWriter().println("Error: El archivo no es un Excel válido.");
            return;
        }
        String sRegreso="500";
        // Datos adicionales en un Map
        Map<String, String> data = new HashMap<>();
        data.put("id", id);
            UploadExcel env = new UploadExcel();
            sRegreso=env.uploadFileAndData
            (fileContent,"file",fileName,data,
             id,token,origen,fecha,fiso);
            System.out.println("sRegreso despues ws "+sRegreso);    
            if (sRegreso.contains("Archivo Cargado Correctamente")) {
                sRegreso="200";
            }
        System.out.println("sendPdfToRestApi: "+sRegreso);
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
