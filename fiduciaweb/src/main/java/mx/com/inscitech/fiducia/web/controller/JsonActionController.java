package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Level;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


/**
 * Clase encargada de la logica de presentacion cuando se trata del envio y recepcion de objetos JavaScript
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class JsonActionController extends MultiActionController {

    protected LoggingService logger = LoggingService.getInstance();

    /**
     * Metodo para obtener el objeto JavaScript (JSON) del request
     * @return Un objeto JSON con la informacion del request
     * @param request El request de la peticion
     */
    protected JSONObject getJSONRequestObject(HttpServletRequest request) {
        String json = request.getParameter("json");
        logger.log(this.getClass(), "request:" + json);
        //Se crea el objeto bean a partir de la cadena json
        JSONObject jsonObject = JSONObject.fromObject(json);
        return jsonObject;
    }

    /**
     * Metodo que permite obtener la vista solicitada, pasando el objeto JavaScript (JSON)
     * @return El model de spring asociado a la vista
     * @param response El objeto de response
     */
    protected ModelAndView getResponseView(Object response) {
        JSONObject jresponse = JSONObject.fromObject(response);
        logger.log(this.getClass(), "ResponseObject:" + jresponse.toString());
        return new ModelAndView("json.jsp", "json", jresponse.toString());
    }

    protected ModelAndView respondObject(HttpServletResponse response, Object object) {
        return respondObject(response, object, false);
    }
    
    /**
     * Metodo ulitlizado para responder los ojbetos JavaScript
     * @return Este metodo siempre retorna null, con el proposito de que Spring solo de la respuesta de la cadena donde se define el objeto JavaScript
     * @param object El objeto a responder
     * @param response El objeto HttpServletResponse en donde se escribira el objeto JavaScript
     */
    protected ModelAndView respondObject(HttpServletResponse response, Object object, boolean is500) {
        response.setHeader("Cache-Control", "no-cache");
        
        //response.setContentType(ConfigurationService.getInstance().getProperty("defalutContentType"));
        response.setHeader("Content-Language", "es-MX");
        response.setContentType("application/json");
        
        if(is500) response.setStatus(500);
        
        try {
            if (object instanceof List)
                response.getWriter().write(JSONArray.fromObject(object).toString());
            else
                response.getWriter().write(JSONObject.fromObject(object).toString());

            object = null;
        } catch (IOException e) {
            logger.log(Thread.currentThread().getClass(), Thread.currentThread(), Level.ERROR, e);
        }
        return null;
    }

    /**
     * Metodo que complementa los parametros del request con los atributos que se encuentran en session
     * @param session La session de Http de la cual se van a extraer los atributos
     * @param parametros El mapa que contiene los parametros de request
     */
    protected void setSessionAttributesAsParameters(HttpSession session, Map parametros) {
        Enumeration names = session.getAttributeNames();

        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            parametros.put(name, session.getAttribute(name));
        }
    }

}
