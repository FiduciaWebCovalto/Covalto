package mx.com.inscitech.fiducia.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;

import org.springframework.web.servlet.ModelAndView;


/**
 * Clase que regresa la definicion de un objeto para poder representarlo en JavaScript mediante JSON
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ObjectDefinitionActionController extends JsonActionController {

    public ModelAndView getObjectDefinition(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //JSONObject jsonObject = getJSONRequestObject(request);
        //Object object = getObjectInstance(jsonObject.getString("className"));
        Object object = getObjectInstance(request.getParameter("class"));
        return respondObject(response, object);
    }

    private Object getObjectInstance(String className) {
        try {
            Object obj = Class.forName(className).newInstance();
            return obj;
        } catch (Exception e) {
            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, e);
        }

        return null;
    }
}
