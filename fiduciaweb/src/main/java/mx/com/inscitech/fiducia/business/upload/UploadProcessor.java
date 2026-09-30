package mx.com.inscitech.fiducia.business.upload;

import java.io.File;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.common.FiduciaWebBase;
import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;
import mx.com.inscitech.fiducia.common.util.DateTimeUtils;
import mx.com.inscitech.fiducia.business.dao.util.GenericRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;

/**
 * Clase que deben de extender los procesadores de archivos que son cargados al servidor.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public abstract class UploadProcessor extends FiduciaWebBase implements Runnable {

    /**
     * Variable en la que se almacenan los archivos que se van a procesar.
     */
    protected List<File> files;

    /**
     * Variable que contiene los parametros que utilizara el procesador.
     */
    protected Map<String, String> parameters;

    /**
     * Miembro para el uso del ORM de Spring, JDBCTemplate
     */
    protected JdbcTemplate jdbcTemplate;

    protected HttpServletRequest httpRequest = null;

    protected HttpServletResponse httpResponse = null;

    protected ServletContext servletContext = null;

    protected HttpSession session = null;

    public UploadProcessor() {
        super();
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }


    public List<File> getFiles() {
        return files;
    }


    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }


    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Metodo con el cual se obtiene el detalle del estado en el que se encuentra el procesador.
     * @return Un Objeto con el detalle del estado del procesador.
     */
    public abstract Object getStateInfo();

    /**
     * Metodo que se utiliza para ejecutar sentencias SQL previamente definidas como update's, insert's y delete's en el archivo xml de consultas.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException Cuando la consutla a ejecutar no existe u ocurre un error al ejecutar la sentecia.
     * @return El numero de registros afectados.
     * @param parametrosRequest Los parametros del request entre los cuales se encuentra el identificador de la consulta a ejecutar
     * en la llave "id" del mapa asi como los demas parametros definidos en el xml.
     */
    public List ejecutaQuery(String query, Object[] parametrosQry) throws BusinessException {
        List result = new ArrayList();
        boolean isSelect = false;

        if (query == null)
            throw new BusinessException("QUERY_NO_VALIDO");
        if (query.toUpperCase().indexOf("SELECT") == 0)
            isSelect = true;

        if (isSelect)
            result = jdbcTemplate.query(query, parametrosQry, new GenericRowMapper());
        else
            result.add(Integer.valueOf(jdbcTemplate.update(query, parametrosQry)));

        return result;
    }

    /**
     * Metodo utilizado para mandar llamar funciones o procedimientos que requieren de parametros de salida.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException Cuando no es posible ejecutar la operacion
     * @return Una mapa o un objeto con los parametros de salida en caso de existir alguno
     * @param parametrosRequest Los parametros de entrada
     */
    public Map ejecutaProcedimiento(String query, List<Object> parametros) throws BusinessException {

        if (query == null)
            throw new BusinessException("QUERY_NO_VALIDO");

        Connection cn = null;
        CallableStatement cs = null;

        boolean haveOutParameters = false;

        int paramIndex = 1;
        int i = 0;

        ArrayList pSalida = new ArrayList();
        Map result = null;
        Object parameterValue = null;
        String parameterType = null;
        ParametroQueryBean paramBean = null;

        try {
            cn = jdbcTemplate.getDataSource().getConnection();
            cs = cn.prepareCall(query);

            for (i = 0; i < parametros.size(); i++) {
                paramBean = (ParametroQueryBean) parametros.get(i);

                parameterType = paramBean.getType() == null ? "" : paramBean.getType()
                                                                            .trim()
                                                                            .toUpperCase();
                parameterValue = paramBean.getValue();

                if (parameterValue != null) {

                    if (paramBean.isOut()) {

                        haveOutParameters = true;
                        paramBean.setIndex(paramIndex);
                        pSalida.add(paramBean);

                        if (parameterValue instanceof String)
                            cs.registerOutParameter(paramIndex, Types.VARCHAR);
                        else if (parameterValue instanceof Long || parameterValue instanceof Integer)
                            cs.registerOutParameter(paramIndex, Types.NUMERIC);
                        else if (parameterValue instanceof Date)
                            cs.registerOutParameter(paramIndex, Types.DATE);
                        else if (parameterValue instanceof Double)
                            cs.registerOutParameter(paramIndex, Types.DOUBLE);
                        else if (parameterValue instanceof Boolean)
                            cs.registerOutParameter(paramIndex, Types.BOOLEAN);
                        else
                            cs.registerOutParameter(paramIndex, Types.VARCHAR);

                        logSrv.log(this, Thread.currentThread(), DEBUG, "Parameter " + paramBean.getName() + " registered as OUT parameter. Index: " + paramIndex);
                        paramIndex++;

                    } else {

                        if (parameterType.equals("VARCHAR"))
                            cs.setString(paramIndex++, String.valueOf(parameterValue));
                        else if (parameterType.equals("NUMBER"))
                            cs.setInt(paramIndex++, ((Integer) parameterValue).intValue());
                        else if (parameterValue instanceof Long || parameterValue instanceof Integer || parameterValue instanceof Double) {
                            if (parameterValue instanceof String)
                                cs.setLong(paramIndex++, Long.parseLong((String) parameterValue));
                            else if (parameterValue instanceof Long)
                                cs.setLong(paramIndex++, ((Long) parameterValue).longValue());
                            else if (parameterValue instanceof Integer)
                                cs.setInt(paramIndex++, ((Integer) parameterValue).intValue());
                            else if (parameterValue instanceof Double)
                                cs.setDouble(paramIndex++, ((Double) parameterValue).doubleValue());
                        } else if (parameterType.equals("DATE")) {
                            Date theDate = new Date(DateTimeUtils.parseDateTimeFromPattern(paramBean.getPattern(), (String) parameterValue).getTime());
                            cs.setDate(paramIndex++, theDate);
                        } else if (parameterType.equals("DOUBLE"))
                            cs.setBigDecimal(paramIndex++, new BigDecimal(Double.parseDouble((String) parameterValue)));
                        else if (parameterType.equals("BOOLEAN"))
                            cs.setBoolean(paramIndex++, Boolean.getBoolean((String) parameterValue));
                        else
                            cs.setString(paramIndex++, (String) parameterValue);

                        logSrv.log(this, Thread.currentThread(), DEBUG,
                                   "Parameter " + paramBean.getName() + " registered as IN parameter type: " + parameterValue.getClass() + " value: " + parameterValue +
                                   " Index: " + paramIndex);

                    }
                } else {
                    cs.setNull(paramIndex, Types.NULL);
                    logSrv.log(this, Thread.currentThread(), DEBUG, "Parameter " + paramBean.getName() + " registered as NULL. Index: " + paramIndex);
                    paramIndex++;
                }
            }

            logSrv.log(this, Thread.currentThread(), DEBUG, "Parameters Registered: " + paramIndex);

            cs.execute();

            for (i = 0; i < pSalida.size(); i++) {
                paramBean = (ParametroQueryBean) pSalida.get(i);

                if (result == null)
                    result = new HashMap();
                ((Map) result).put(paramBean.getName(), cs.getObject(paramBean.getIndex()));
            }

            pSalida.clear();
            pSalida = null;

        } catch (SQLException e) {
            logSrv.log(this, Thread.currentThread(), ERROR, e);
            throw new BusinessException("500", e.getMessage());
        } finally {
            try {
                cs.close();
            } catch (Exception e) {
            }
            try {
                cn.close();
            } catch (Exception e) {
            }

            cs = null;
            cn = null;
        }

        return result;
    }

    public void setHttpRequest(HttpServletRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public HttpServletRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpResponse(HttpServletResponse httpResponse) {
        this.httpResponse = httpResponse;
    }

    public HttpServletResponse getHttpResponse() {
        return httpResponse;
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public HttpSession getSession() {
        return session;
    }

    public String getParameter(String parameterName, String defaultValue) {
        String theValue = parameters.get(parameterName);
        if(theValue == null) theValue = defaultValue;
        return theValue;
    }

}
