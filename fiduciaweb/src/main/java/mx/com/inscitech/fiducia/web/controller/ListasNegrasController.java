package mx.com.inscitech.fiducia.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.clients.services.v1.clients.PepsServiceClient;
import mx.com.inscitech.clients.services.v1.dtos.peps.RequestCdd;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;

public class ListasNegrasController extends JsonActionController {
    public ListasNegrasController() {
        super();
    }
    
    public ModelAndView consultaPEPS(HttpServletRequest request, HttpServletResponse response) {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "consultaPEPS");
        
        String json = request.getParameter("json");
        JSONObject jsonObject = JSONObject.fromObject(json);
        
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Language", "es-MX");
        response.setHeader("Cache-Control", "no-cache");
        
        RequestCdd pepsRequest = (RequestCdd)JSONObject.toBean(jsonObject, RequestCdd.class);        
        PepsServiceClient peps = new PepsServiceClient();            
        return respondObject(response, peps.getConsultaPeps(pepsRequest));
    }
    
}
