package mx.com.inscitech.fiducia.web.controller.catalogos;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.test.EjemploServicio;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.web.controller.JsonActionController;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;


/**
 * Controller de ejemplo que permite correr el ejemplo
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConsultasCatalogosController extends JsonActionController {

    /**
     * Implentacion del servicio Y que sirve para consultar paises
     */
    private EjemploServicio ejemploServicio;

    /**
     * Este metodo sirve para consultar paises, saca del request el parametro X y se lo pasa al servico Y
     * @throws java.lang.Exception Cuando falla
     * @return El objeto json resultado de la consulta
     * @param response La respuesta http que se envia al cliente
     * @param request La peticion http que se recibe del cliente
     */
    public ModelAndView consultaPasies(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            List paises = ejemploServicio.ejecutaConsultaPaises();
            return respondObject(response, paises);

        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public ModelAndView consultaAvanzada(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List paises = ejemploServicio.ejecutaConsultaAvanzada(parametros);
            return respondObject(response, paises);

        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Setter de la propiedad ejemploServicio
     * @param ejemploServicio Una instancia de EjemploServicio
     */
    public void setEjemploServicio(EjemploServicio ejemploServicio) {
        this.ejemploServicio = ejemploServicio;
    }

    /**
     * Getter de la propiedad ejemploServicio
     * @return Una instancia de EjemploServicio
     */
    public EjemploServicio getEjemploServicio() {
        return ejemploServicio;
    }
}
