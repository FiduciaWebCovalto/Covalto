package mx.com.inscitech.fiducia.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.common.beans.DocumentUpload;
import mx.com.inscitech.fiducia.common.beans.ErrorBean;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.clients.services.v1.clients.DMPServiceClient;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;

import org.springframework.web.servlet.ModelAndView;

public class DocumentsHandlerController extends JsonActionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DocumentsHandlerController.class);

    
    LoggingService log = LoggingService.getInstance();
        
    public DocumentsHandlerController() {
        super();
    }
    
    public ModelAndView getDocuments(HttpServletRequest request, HttpServletResponse response) {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "getDocuments");
        
        String fiso = request.getParameter("fiso");
        List<DocumentUpload> theDocuments = new ArrayList<>();
            
        try {
        
            DMPServiceClient dmpClient = new DMPServiceClient();
            theDocuments = dmpClient.getFisoDocuments(fiso, DMPServiceClient.Porpuse.MANT);
                    
        } catch(Exception e) {
            
            GenericResponseBean gr = new GenericResponseBean();
            gr.setCodigoError("DMP-ERR-001");
            gr.setMensajeError(e.getMessage());
            gr.setTipoError(GenericResponseBean.ERROR);
            
            return respondObject(response, gr);
        }
            
        return respondObject(response, theDocuments);
    }
    
    
    public ModelAndView uploadDocument(HttpServletRequest request, HttpServletResponse response) {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "getDocuments");

        List fileList = null;
        DiskFileUpload diskFileUpload = null;
        Map parameters = null;
        List files = null;

        if (request != null && FileUpload.isMultipartContent(request)) {

            try {

                diskFileUpload = new DiskFileUpload();
                fileList = diskFileUpload.parseRequest(request, 4096, 50000000, request.getSession()
                                                                                       .getServletContext()
                                                                                       .getRealPath("/temp/"));

                files = new ArrayList();
                parameters = new HashMap();

                for (int i = 0; i < fileList.size(); i++) {
                    if (((FileItem) fileList.get(i)).isFormField())
                        parameters.put(((FileItem) fileList.get(i)).getFieldName(), ((FileItem) fileList.get(i)).getString());
                    else {
                        //if(((FileItem)fileList.get(i)).getSize() > 0) files.add( ((FileItem)fileList.get(i)).getInputStream() );
                        if (((FileItem) fileList.get(i)).getSize() > 0)
                            files.add(fileList.get(i));
                    }
                }

            } catch (FileUploadException e) {
                LOGGER.error("Exception: ", e);
            
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

        try {
            
            ModelAndView result = super.handleRequestInternal(request, response);
            result.addObject("response", ErrorBean.ERROR_SUCCESS);
            
            return result;
            
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }

        return null;
    }
}
