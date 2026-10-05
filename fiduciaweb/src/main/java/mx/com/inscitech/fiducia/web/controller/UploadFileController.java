package mx.com.inscitech.fiducia.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.upload.UploadProcessor;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ReflectionUtils;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller encargado de procesar archivos de entrada.
 * El controller recibe y procesa el request y lo delega a la clase especificada
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class UploadFileController implements Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadFileController.class);


    protected LoggingService logger = LoggingService.getInstance();

    /**
     * Miembro para el uso del ORM de Spring, JDBCTemplate
     */
    private JdbcTemplate jdbcTemplate;

    /**
     * Metodo encargado de procesar el request y delegar el archivo recivido a la clase especificada
     * @throws java.io.IOException Cuando ocurre un error al escribir/leer el request y/o response
     * @throws javax.servlet.ServletException Cuando no es posible procesar la peticion
     * @param response La respuesta http que se le envia al cliente
     * @param request La peticion http que realiza el cliente
     * @return
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, BusinessException {

        List fileList = null;
        DiskFileUpload diskFileUpload = null;
        Map<String, String> parameters = null;
        List<File> files = null;
        UploadProcessor processor = null;
        
        String tmpLocation = request.getSession().getServletContext().getRealPath("/temp/");

        if (request != null && FileUpload.isMultipartContent(request)) {

            try {

                diskFileUpload = new DiskFileUpload();
                fileList = diskFileUpload.parseRequest(request, 4096, 50000000, tmpLocation);
                
                files = new ArrayList<>();
                parameters = new HashMap<>();

                for (int i = 0; i < fileList.size(); i++) {
                    FileItem item = (FileItem) fileList.get(i);
                    if (item.isFormField()) {
                        
                        String fieldName = item.getFieldName();
                        String fieldValue = item.getString();
                        parameters.put(fieldName, fieldValue);
                                                
                    } else {
                        if (item.getSize() > 0) {
                            
                            String fileName = new File(item.getName()).getName();
                            String filePath = tmpLocation + File.separator + fileName;
                            File storeFile = new File(filePath);
                            try {
                                item.write(storeFile);
                                files.add(storeFile);
                            } catch (Exception e) {
                                LOGGER.error("Exception: ", e);
                                throw new BusinessException("Unable to get the file from request");
                            }
                        }
                    }
                }

                if (files.size() <= 0)
                    throw new BusinessException("No se econontraron Archivos en el Request");
                if (parameters.isEmpty() || !parameters.containsKey("processor"))
                    throw new BusinessException("No Existe clase para procesar el(los) archivo(s)");

                processor = (UploadProcessor) new ReflectionUtils().getClass(parameters.get("processor")).newInstance();

                processor.setHttpRequest(request);
                processor.setHttpResponse(response);
                processor.setServletContext(request.getSession().getServletContext());
                processor.setSession(request.getSession());

                processor.setFiles(files);
                processor.setParameters(parameters);
                processor.setJdbcTemplate(jdbcTemplate);

                processor.run();

                request.getSession().setAttribute("UploadProcessor", processor);
            } catch (FileUploadException e) {
                LOGGER.error("Exception: ", e);
            } catch (InstantiationException e) {
                throw new BusinessException(e.getMessage());
            } catch (IllegalAccessException e) {
                throw new BusinessException(e.getMessage());
            } finally {
                // TODO: Ver que no le pegue al procesador del archivo
                if (files != null)
                    files.clear();
                if (parameters != null)
                    parameters.clear();

                files = null;
                parameters = null;
            }
        }


        return null;
    }


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
