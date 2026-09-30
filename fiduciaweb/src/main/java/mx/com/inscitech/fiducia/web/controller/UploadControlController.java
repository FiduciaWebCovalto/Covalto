package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.business.upload.UploadStateMonitorBean;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;

import org.springframework.web.servlet.ModelAndView;

public class UploadControlController extends JsonActionController {

    protected LoggingService logger = LoggingService.getInstance();
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, BusinessException {
        
        Object theObj = null;
        
        try {

            theObj = request.getSession().getAttribute("UploadProcessor");
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Session UploadProcessor: " + theObj + " SessionID: " + request.getSession().getId());
            
        } catch(Exception e) {
            logger.log(this, Thread.currentThread(), LoggingService.WARN, "Error al obtener la informacion sobre el progreso de carga");    
        }

        if(theObj == null) {
            UploadStateMonitorBean obj = new UploadStateMonitorBean();
            obj.setPercent(100);
            obj.setFinished(true);
            obj.setOutputMessage("No running process");
            theObj = obj;
        }
                
        return respondObject(response, theObj);
    }
    
}
