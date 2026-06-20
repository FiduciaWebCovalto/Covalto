package mx.com.inscitech.fiducia.web.controller;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.business.services.GenericDataAccessService;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ExecuteRefAsyncResponse;
import mx.com.inscitech.fiducia.common.util.ExecuteRefAsyncRunner;
import mx.com.inscitech.fiducia.common.util.XLSDataWriter;
import mx.com.inscitech.fiducia.common.util.XLSXDataWriter;
import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;


/**
 * Clase que se encarga de ejecutar las consultas generiacas del sistema, definidas en el archivo
 * WEB-INF/modules/consultas.xml; cada consulta puede o no tener parametros, los cuales son procesados
 * por el servicio de acceso a datos @see mx.gob.nafin.fiduciario.business.services.GenericDataAccessService
 * Tambien son enviados como parametros los atributos que se encuentran en session, los cuales sobreescriben a
 * los de request.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConsultasController extends JsonActionController {

    protected GenericDataAccessService genericDataAccessService;

    public void setGenericDataAccessService(GenericDataAccessService genericDataAccessService) {
        this.genericDataAccessService = genericDataAccessService;
    }

    public GenericDataAccessService getGenericDataAccessService() {
        return genericDataAccessService;
    }

    /**
     * Metodo utilizado para ejecutar las consultas definidas en el archivo de consultas.
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView ejecutaConsulta(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "Cadena JSON: " + request.getParameter("json"));

        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Language", "es-MX");
        response.setHeader("Cache-Control", "no-cache");
        
        try {
            
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            setSessionAttributesAsParameters(request.getSession(), parametros);

            List consulta = genericDataAccessService.ejecutaConsulta(parametros);
            
            return respondObject(response, consulta);

        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Metodo utilizado para ejecutar query's genericos
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView ejecutaQuery(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "Cadena JSON: " + request.getParameter("json"));
        
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Language", "es-MX");
        response.setHeader("Cache-Control", "no-cache");
        
        try {
            
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            setSessionAttributesAsParameters(request.getSession(), parametros);

            int registrosAfectados = 0;
            List result = genericDataAccessService.ejecutaQuery(parametros);
            Object firstObjet = result.isEmpty() ? new Integer(0) : result.get(0);

            if (firstObjet instanceof Integer) {
                registrosAfectados = ((Integer) firstObjet).intValue();
                return respondObject(response, GenericResponseBean.SUCCESS_BEAN);
            } else {
                return respondObject(response, result);
            }
            
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    /**
     * Metodo utilizado para ejecutar procedimientos almacenados y funciones
     * @throws java.lang.Exception
     * @return
     * @param response
     * @param request
     */
    public ModelAndView ejecutaProcedimiento(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "Cadena JSON: " + request.getParameter("json"));
        
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Language", "es-MX");
        response.setHeader("Cache-Control", "no-cache");
        
        try {
            
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            setSessionAttributesAsParameters(request.getSession(), parametros);

            return respondObject(response, genericDataAccessService.ejecutaProcedimiento(parametros));

        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }

    public ModelAndView ejecutaConsultaExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "Cadena JSON: " + request.getParameter("json"));

        response.setHeader("Cache-Control", "no-cache");        
            
        ByteArrayOutputStream outByteStream = null;
        
        try {
            
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            
            setSessionAttributesAsParameters(request.getSession(), parametros);

            //TODO: Optimizar este codigo para que no de tantas vueltas la informacion... la mejor es: De base de datos a excel sin pasar por otros componentes
            List consulta = genericDataAccessService.ejecutaConsulta(parametros);
            
            String[] tableHeaders = new String[]{};
            String[] dataFields = new String[]{};
            boolean printHeaders = true;
            
            if(request.getParameter("headers") != null) {
                tableHeaders = request.getParameter("headers").split(",");
            }
            
            if(request.getParameter("fields") != null) {
                dataFields = request.getParameter("fields").split(",");
            }
            
            if(request.getParameter("printHeaders") != null) {
                printHeaders = "false".equals(request.getParameter("printHeaders").trim().toLowerCase());
            }
            
            boolean esXLSX = false;
            if((""+request.getRequestURL()).toUpperCase().indexOf("XLSX") != -1) esXLSX = true;

            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition","attachment; filename=\"DatosFiduciarios.xls"+( esXLSX ?"x":"")+"\"");
            
            if(esXLSX) {
                XLSXDataWriter xlsx = new XLSXDataWriter();
                outByteStream = xlsx.generateExcel(consulta, tableHeaders, dataFields);
            } else {
                XLSDataWriter xlsx = new XLSDataWriter();
                outByteStream = xlsx.generateExcel(consulta, tableHeaders, dataFields);            
            }
            
            OutputStream outStream = response.getOutputStream();
            outStream.write(outByteStream.toByteArray());
            outStream.flush();
            
        } catch (BusinessException e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
        
        return null;
    }

    public ModelAndView ejecutaProcedimientoAsync(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.log(Thread.currentThread().getClass(), Thread.currentThread(), LoggingService.DEBUG, "Cadena JSON: " + request.getParameter("json"));
        
        ExecuteRefAsyncResponse responseObj = new ExecuteRefAsyncResponse();
        
        try {
            
            JSONObject jsonObject = getJSONRequestObject(request);
            Map parametros = (Map) JSONObject.toBean(jsonObject, Map.class);
            setSessionAttributesAsParameters(request.getSession(), parametros);
            
            ExecuteRefAsyncRunner runner = new ExecuteRefAsyncRunner();
            runner.getParametros().putAll(parametros);            
            runner.setDataService(genericDataAccessService);
            new Thread(runner).start();            
            
            responseObj.setMessage("Operacion solicitada iniciada exitosamente");
            responseObj.setSuccedded(true);
            
        } catch (Exception e) {
            responseObj.setErrorCode("FIDW-CON-001");
            responseObj.setErrorMessage(e.getMessage());
        }
        
        return respondObject(response, responseObj);
    }
    
}
