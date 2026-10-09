package mx.com.inscitech.fiducia.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.com.inscitech.fiducia.UploadPDF;

@WebServlet("/uploadServlet")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 1,  // 1 MB
    maxFileSize = 1024 * 1024 * 10,       // 10 MB
    maxRequestSize = 1024 * 1024 * 15     // 15 MB
)
public class PdfServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(PdfServlet.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain;charset=UTF-8");

        String id = request.getParameter("id");
        String fiso = request.getParameter("fiso");
        String persona = request.getParameter("persona");
        String token = request.getParameter("token");
        String usuario = request.getParameter("usuario");

        LOGGER.info("Peticion recibida en PdfServlet (/uploadServlet) - Usuario: {}, ID: {}, Fiso: {}, Persona: {}",
                usuario, id, fiso, persona);

        Part filePart = null;
        try {
            filePart = request.getPart("file");
        } catch (Exception e) {
            LOGGER.error("Error al obtener la parte 'file' del request: {}", e.getMessage(), e);
        }

        if (filePart == null || filePart.getSize() == 0) {
            LOGGER.warn("No se proporciono ningun archivo o el archivo esta vacio.");
            response.getWriter().println("500");
            return;
        }

        String fileName = getFileName(filePart);
        if (fileName == null || fileName.trim().isEmpty()) {
            fileName = "documento.pdf";
        }

        String contentType = filePart.getContentType();
        LOGGER.info("Archivo recibido: '{}', Tamano: {} bytes, ContentType: '{}'",
                fileName, filePart.getSize(), contentType);

        // Validar que sea un PDF
        if (!isPdf(contentType, fileName)) {
            LOGGER.warn("Validacion rechazada: El archivo no es un PDF valido. ContentType: {}, Archivo: {}",
                    contentType, fileName);
            response.getWriter().println("Error: El archivo no es un PDF valido.");
            return;
        }

        // Validar parametros obligatorios
        if (id == null || id.trim().isEmpty() || fiso == null || fiso.trim().isEmpty() || persona == null || persona.trim().isEmpty()) {
            LOGGER.warn("Parametros obligatorios incompletos o nulos: id='{}', fiso='{}', persona='{}'",
                    id, fiso, persona);
            response.getWriter().println("500");
            return;
        }

        String sRegreso = "500";
        try {
            MasterServices serv = new MasterServices();
            String queryParam = id.trim() + "&id2=" + fiso.trim() + "&id3=" + persona.trim();
            LOGGER.info("Consultando documentos existentes (caso 7) con parametros: {}", queryParam);

            String[] resultado = serv.consumo(7, queryParam, token, usuario);
            LOGGER.info("Resultado de verificacion (caso 7): {}", (resultado != null ? Arrays.toString(resultado) : "null"));

            Map<String, String> data = new HashMap<>();
            data.put("id", id.trim());
            data.put("id2", fiso.trim());
            data.put("id3", persona.trim());

            if (resultado != null && resultado.length == 0) {
                LOGGER.info("No existe documento previo registrado para el contrato. Procediendo a subir archivo: {}", fileName);
                try (InputStream fileContent = filePart.getInputStream()) {
                    sRegreso = UploadPDF.uploadFileAndData(fileContent, "file", fileName, data,
                            id.trim(), fiso.trim(), persona.trim(), token);
                    LOGGER.info("Respuesta de UploadPDF.uploadFileAndData: {}", sRegreso);

                    if (sRegreso != null && sRegreso.contains("Archivo subido:")) {
                        sRegreso = "200";
                    } else {
                        LOGGER.warn("La respuesta del servicio de carga no fue exitosa: {}", sRegreso);
                        sRegreso = "500";
                    }
                }
            } else if (resultado != null && resultado.length > 0) {
                LOGGER.info("El documento ya existe previamente para el contrato (coincidencias: {}). Retornando codigo 800.",
                        resultado.length);
                sRegreso = "800";
            } else {
                LOGGER.error("La consulta de validacion de documento (caso 7) devolvio un resultado nulo. Retornando codigo 500.");
                sRegreso = "500";
            }

        } catch (Exception e) {
            LOGGER.error("Error no controlado en PdfServlet: {}", e.getMessage(), e);
            sRegreso = "500";
        } finally {
            try {
                filePart.delete();
            } catch (Exception e) {
                LOGGER.debug("No fue posible eliminar el archivo temporal de la parte multipart: {}", e.getMessage());
            }
        }

        LOGGER.info("Finalizando PdfServlet para archivo '{}' con codigo de respuesta: {}", fileName, sRegreso);
        response.getWriter().println(sRegreso);
    }

    /**
     * Extrae el nombre original del archivo de la parte multipart de forma segura.
     */
    private String getFileName(Part part) {
        if (part == null) {
            return null;
        }
        String fileName = part.getSubmittedFileName();
        if (fileName == null || fileName.trim().isEmpty()) {
            String contentDisposition = part.getHeader("content-disposition");
            if (contentDisposition != null) {
                for (String content : contentDisposition.split(";")) {
                    if (content.trim().startsWith("filename")) {
                        fileName = content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
                        break;
                    }
                }
            }
        }
        if (fileName != null) {
            try {
                fileName = Paths.get(fileName).getFileName().toString();
            } catch (Exception e) {
                int slashIdx = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
                if (slashIdx >= 0) {
                    fileName = fileName.substring(slashIdx + 1);
                }
            }
        }
        return fileName;
    }

    /**
     * Valida si el archivo corresponde a un formato PDF basado en Content-Type o extension.
     */
    private boolean isPdf(String contentType, String fileName) {
        boolean mimeValid = contentType != null && contentType.toLowerCase().contains("pdf");
        boolean extValid = fileName != null && fileName.toLowerCase().endsWith(".pdf");
        return mimeValid || extValid;
    }
}

