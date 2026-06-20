package mx.com.inscitech.fiducia.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.common.beans.ErrorBean;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.hsbc.services.v1.dtos.spei.SPEIMessage;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;

public class TraspasosController extends JsonActionController {
    public TraspasosController() {
        super();
    }
    
    public ModelAndView doTransfer(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "Cadena JSON: " + request.getParameter("json"));

        try {
            
            JSONObject jsonObject = getJSONRequestObject(request);
            SPEIMessage speiMessage = (SPEIMessage) JSONObject.toBean(jsonObject, SPEIMessage.class);
            sendSPEIMessage(speiMessage);
            
            return respondObject(response, speiMessage);

        } catch (BusinessException e) {
            return respondObject(response, new ErrorBean(ErrorBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }
    
    private SPEIMessage sendSPEIMessage(SPEIMessage message) throws BusinessException {
        
        if("ASNO".equals(message.getBeneficiario().getNombre())) {
            throw new BusinessException("FW-TRANSFER-001", "Error al transferir al asno solicitado");
        }        
        
        return message;
    }
}
