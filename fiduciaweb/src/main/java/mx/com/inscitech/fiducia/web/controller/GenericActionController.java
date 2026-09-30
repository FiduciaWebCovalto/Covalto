package mx.com.inscitech.fiducia.web.controller;

import javax.servlet.http.HttpServletRequest;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * Clase encargada de la logica de presentacion
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class GenericActionController extends MultiActionController {

    protected LoggingService log = LoggingService.getInstance();

    /**
     * Metodo para obtener el objeto JavaScript (JSON) del request
     * @return Un objeto JSON con la informacion del request
     * @param request El request de la peticion
     */
    protected JSONObject getJSONRequestObject(HttpServletRequest request) {
        String json = request.getParameter("json"); //recibimos la variable "json" del request
        log.log(this.getClass(), "request:" + json);
        //Se crea el objeto bean a partir de la cadena json
        JSONObject jsonObject = JSONObject.fromObject(json); //new JSONObject( json );
        return jsonObject;
    }

    /**
     * Metodo que permite obtener la vista solicitada, pasando el objeto JavaScript (JSON)
     * @return El model de spring asociado a la vista
     * @param response El objeto de response
     */
    protected ModelAndView getResponseView(Object response) {
        JSONObject jresponse = JSONObject.fromObject(response);
        log.log(this.getClass(), "ResponseObject:" + jresponse.toString());
        return new ModelAndView("index", "message", jresponse.toString());
    }
}
