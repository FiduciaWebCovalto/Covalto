package mx.com.inscitech.fiducia.web.contabilidad;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.contabilidad.ConsultasGeneralesContabilidad;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.web.controller.JsonActionController;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;

/**
 * Clase implementada para manipular las funciones que daran servicio al módulo de contabilidad
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConsultasGeneralesContabilidadController extends JsonActionController {

    private ConsultasGeneralesContabilidad consultas;

    public ConsultasGeneralesContabilidadController() {
    }

    /**
     * Funcion implementada para controlar la ejecucion de una consulta avanzada (consulta c/s parametros) en la pantalla
     * principal del catálogo de cuentas.
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView consultarPrincipalCatalogoCuentas(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List registros = consultas.ejecutaConsultarPrincipalCatalogoCuentas(parametros);
            return respondObject(response, registros);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para validar que una cuenta de la tabla cuentaco no tenga asociada una guia de la tabla guiacont
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView verificaCuentaVSGuia(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List resultado = consultas.ejecutaVerificaCuentaVSGuia(parametros);
            return respondObject(response, resultado);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para verificar que no existan niveles inferiores en una cuenta
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView verificaNivelesCuenta(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List resultado = consultas.ejecutaVerificaNivelesCuenta(parametros);
            return respondObject(response, resultado);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Función implementada para verificar que no exista ya la cuenta que se quiere dar de alta
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView verificaExisteCuenta(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List resultado = consultas.ejecutaVerificaExisteCuenta(parametros);
            return respondObject(response, resultado);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para controlar la ejecucion de una consulta avanzada (consulta c/s parametros) en la pantalla
     * principal del catálogo de guías.
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView consultarPrincipalCatalogoGuias(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List registros = consultas.ejecutaConsultarPrincipalCatalogoGuias(parametros);
            return respondObject(response, registros);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Función implementada para verificar que no exista ya la guía que se quiere dar de alta
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView verificaExisteGuia(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            String numGuia = jsonObject.getString("gunNumGuia");
            List resultado = consultas.ejecutaVerificaExisteGuia(numGuia);
            return respondObject(response, resultado);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para validar que una guía no tenga asociadas transacciones
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView verificaGuiaVSTransaccion(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            String numGuia = jsonObject.getString("gunNumGuia");
            List resultado = consultas.ejecutaVerificaGuiaVSTransaccion(numGuia);
            return respondObject(response, resultado);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para borrar las transacciones asociadas a determinada guía
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView borraEstructuraGuia(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            String numGuia = jsonObject.getString("gunNumGuia");
            consultas.ejecutaBorraEstructuraGuia(numGuia);
            return respondObject(response, null);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para controlar la ejecucion de una consulta avanzada (consulta c/s parametros) en la pantalla
     * de mantenimiento del catálogo de guías.
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView consultarPrincipalEstructuraGuia(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            String numGuia = jsonObject.getString("gunNumGuia");
            List registros = consultas.ejecutaConsultarPrincipalEstructuraGuia(numGuia);
            return respondObject(response, registros);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para controlar la ejecucion de una consulta avanzada (consulta c/s parametros) en la pantalla
     * de consulta de transacciones.
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView consultarPrincipalTransacciones(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            List registros = consultas.ejecutaConsultarPrincipalTransacciones(parametros);
            return respondObject(response, registros);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Funcion implementada para obtener el numero secuencial (siguiente) de un campo
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView asignaValorSecuencial(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            JSONObject jsonObject = getJSONRequestObject(request);
            String numGuia = jsonObject.getString("gunNumGuia");
            List resultado = consultas.ejecutaAsignaValorSecuencial(numGuia);
            return respondObject(response, resultado);
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public void setConsultas(ConsultasGeneralesContabilidad consultas) {
        this.consultas = consultas;
    }


    public ConsultasGeneralesContabilidad getConsultas() {
        return consultas;
    }
}
