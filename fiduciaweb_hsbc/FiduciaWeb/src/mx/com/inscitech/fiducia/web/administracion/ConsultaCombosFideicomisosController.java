package mx.com.inscitech.fiducia.web.administracion;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.administracion.ConsultaCombosFideicomisos;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.web.controller.JsonActionController;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;

/**
 * Clase implementada para cargar los combos principales de las pantallas de fideicomisos
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConsultaCombosFideicomisosController extends JsonActionController {

    private ConsultaCombosFideicomisos consultaCombosFideicomisos;

    /**
     * Funcion implementada para cargar los principales combos que podran ser tomados como criterios de consulta.
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView consultaCombosFideicomisos(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Map consultasCombos = consultaCombosFideicomisos.ejecutaConsultaCombosFideicomisos();
            return respondObject(response, consultasCombos);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public ModelAndView consultaAvanzada(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List fideicomisos = consultaCombosFideicomisos.ejecutaConsultaAvanzada(parametros);
            return respondObject(response, fideicomisos);

        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public ModelAndView consultaCombo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            String clave = jsonObject.getString("clave");
            List consultaCombo = consultaCombosFideicomisos.ejecutaConsultaCombo(clave);
            return respondObject(response, consultaCombo);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public ModelAndView cargaComboProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List consultaCombo = consultaCombosFideicomisos.ejecutaCargaComboProducto(parametros);
            return respondObject(response, consultaCombo);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public ModelAndView cargaComboActividad(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            List consultaCombo = consultaCombosFideicomisos.ejecutaCargaComboActividad();
            return respondObject(response, consultaCombo);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public void setConsultaCombosFideicomisos(ConsultaCombosFideicomisos consultaCombosFideicomisos) {
        this.consultaCombosFideicomisos = consultaCombosFideicomisos;
    }

    public ConsultaCombosFideicomisos getConsultaCombosFideicomisos() {
        return consultaCombosFideicomisos;
    }
}
