package mx.com.inscitech.fiducia.business.services;

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
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.DateTimeUtils;
import mx.com.inscitech.fiducia.business.dao.util.GenericRowMapper;

import org.apache.log4j.Level;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Clase que permite accedaer a la base de datos por medio de un JdbcTemplate @see org.springframework.jdbc.core.JdbcTemplate
 * con sentencias SQL previamente configuradas en las propiedades de consultas y parametros
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class GenericDataAccessService {

    /**
     * Variable para acceder al servicio de logging.
     */
    private LoggingService logger;

    /**
     * Miembro para el uso del ORM de Spring, JDBCTemplate
     */
    private JdbcTemplate jdbcTemplate;

    /**
     * Mapa en el que se almacenan las consultas
     */
    private Map consultas;

    /**
     * Mapa en el que se almacenan los parametros relacionados con las consultas
     */
    private Map parametros;

    public GenericDataAccessService() {
        logger = LoggingService.getInstance();
    }

    /**
     * Metodo utilizado para mandar llamar funciones o procedimientos que requieren de parametros de salida.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException Cuando no es posible ejecutar la operacion
     * @return Una mapa o un objeto con los parametros de salida en caso de existir alguno
     * @param parametrosRequest Los parametros de entrada
     */
    public Object ejecutaProcedimiento(Map parametrosRequest) throws BusinessException {
        String query = (String) consultas.get((String) parametrosRequest.get("id"));
        if (query == null)
            throw new BusinessException("QUERY_NO_VALIDO");

        List params = (List) parametros.get((String) parametrosRequest.get("id"));
        if (params == null)
            params = new ArrayList();

        Connection cn = null;
        CallableStatement cs = null;

        int recordsAfected = 0;
        boolean haveOutParameters = false;

        int paramIndex = 1;
        int i = 0;

        ArrayList pSalida = new ArrayList();
        Object result = null;
        String parameterType = null;
        ParametroQueryBean parametro = null;
        Object parameterValue = null;

        try {
            cn = jdbcTemplate.getDataSource().getConnection();
            cs = cn.prepareCall(query);

            for (i = 0; i < params.size(); i++) {
                parametro = (ParametroQueryBean) params.get(i);

                parameterType = parametro.getType() == null ? "" : parametro.getType()
                                                                            .trim()
                                                                            .toUpperCase();

                if (parametrosRequest.containsKey(parametro.getName()) | parametro.isOut()) {
                    parameterValue = parametrosRequest.get(parametro.getName());

                    if (parametro.isOut()) {

                        haveOutParameters = true;
                        parametro.setIndex(paramIndex);
                        pSalida.add(parametro);

                        if (parameterType.equals("VARCHAR"))
                            cs.registerOutParameter(paramIndex++, Types.VARCHAR);
                        else if (parameterType.equals("NUMBER"))
                            cs.registerOutParameter(paramIndex++, Types.NUMERIC);
                        else if (parameterType.equals("DATE"))
                            cs.registerOutParameter(paramIndex++, Types.DATE);
                        else if (parameterType.equals("DOUBLE"))
                            cs.registerOutParameter(paramIndex++, Types.DOUBLE);
                        else if (parameterType.equals("BOOLEAN"))
                            cs.registerOutParameter(paramIndex++, Types.BOOLEAN);
                        else
                            cs.registerOutParameter(paramIndex++, Types.VARCHAR);

                        logger.log(this, Thread.currentThread(), Level.DEBUG,
                                   "Parameter " + parametro.getName() + " registered as OUT parameter type " + parameterType + " Index: " + paramIndex);

                    } else {

                        if ("net.sf.json.JSONNull".equals(parameterValue.getClass().getName())) {
                            String helper = null;
                            parameterValue = helper;
                        }

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
                            Date theDate = new Date(DateTimeUtils.parseDateTimeFromPattern(parametro.getPattern(), (String) parameterValue).getTime());
                            cs.setDate(paramIndex++, theDate);
                        } else if (parameterType.equals("DOUBLE"))
                            cs.setBigDecimal(paramIndex++, new BigDecimal(Double.parseDouble((String) parameterValue)));
                        else if (parameterType.equals("BOOLEAN"))
                            cs.setBoolean(paramIndex++, Boolean.getBoolean((String) parameterValue));
                        else
                            cs.setString(paramIndex++, (String) parameterValue);

                        if (parameterValue == null) {
                            logger.log(this, Thread.currentThread(), Level.DEBUG, "Parameter " + parametro.getName() + " registered as IN NULL parameter Index: " + paramIndex);
                        } else {
                            logger.log(this, Thread.currentThread(), Level.DEBUG,
                                       "Parameter " + parametro.getName() + " registered as IN parameter type: " + parameterValue.getClass() + " value: " + parameterValue +
                                       " Index: " + paramIndex);
                        }
                    }
                } else {
                    cs.setNull(paramIndex++, Types.NULL);
                    logger.log(this, Thread.currentThread(), Level.DEBUG, "Parameter " + parametro.getName() + " registered as NULL. Index: " + paramIndex);
                }
            }

            logger.log(this, Thread.currentThread(), Level.DEBUG, "Parameters Registered: " + paramIndex);

            cs.execute();

            for (i = 0; i < pSalida.size(); i++) {
                ParametroQueryBean parametroSalida = (ParametroQueryBean) pSalida.get(i);
                if (parametroSalida.getName() != null && !parametroSalida.getName()
                                                                         .trim()
                                                                         .equals("")) {
                    if (result == null)
                        result = new HashMap();
                    ((Map) result).put(parametroSalida.getName(), cs.getObject(parametroSalida.getIndex()));
                } else {
                    if (result == null)
                        result = new ArrayList();
                    ((List) result).add(i, cs.getObject(parametroSalida.getIndex()));
                }
            }

            pSalida.clear();
            pSalida = null;

        } catch (SQLException e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
            throw new BusinessException("500", e.getMessage());
        } finally {
            try {
                cs.close();
            } catch (Exception e) {
                logger.log(this, Thread.currentThread(), Level.ERROR, e);
            }
            try {
                cn.close();
            } catch (Exception e) {
                logger.log(this, Thread.currentThread(), Level.ERROR, e);
            }

            cs = null;
            cn = null;
        }

        if (result == null)
            result = GenericResponseBean.SUCCESS_BEAN;

        return result;
    }

    /**
     * Metodo que se utiliza para ejecutar sentencias SQL previamente definidas como update's, insert's y delete's en el archivo xml de consultas.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException Cuando la consutla a ejecutar no existe u ocurre un error al ejecutar la sentecia.
     * @return El numero de registros afectados.
     * @param parametrosRequest Los parametros del request entre los cuales se encuentra el identificador de la consulta a ejecutar
     * en la llave "id" del mapa asi como los demas parametros definidos en el xml.
     */
    public List ejecutaQuery(Map parametrosRequest) throws BusinessException {
        List result = new ArrayList();
        boolean isSelect = false;

        String query = (String) consultas.get(parametrosRequest.get("id"));
        if (query == null)
            throw new BusinessException("QUERY_NO_VALIDO");

        ArrayList parametrosQry = new ArrayList();

        List params = (List) parametros.get(parametrosRequest.get("id"));
        if (params == null)
            params = new ArrayList();

        ParametroQueryBean parametro = null;

        for (int i = 0; i < params.size(); i++) {
            parametro = (ParametroQueryBean) params.get(i);

            if (parametrosRequest.containsKey(parametro.getName())) {
                parametrosQry.add(parametrosRequest.get(parametro.getName()));
            } else {
                // GHR
                parametrosQry.add(null);
            }
        }

        if (query.toUpperCase().indexOf("SELECT") == 0)
            isSelect = true;

        if (isSelect)
            result = jdbcTemplate.query(query, parametrosQry.toArray(), new GenericRowMapper());
        else
            result.add(Integer.valueOf(jdbcTemplate.update(query, parametrosQry.toArray())));

        return result;
    }

    /**
     * Metodo que permite ejecutar una consulta definida en el archivo de consultas.
     * Los parametros de la consulta son asignados como se especifiquen en dicho archivo haciendo dinamicamente
     * un prepared statement y asignando los valores a cada uno de los parametros.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException En caso de que se especifique una consulta que no exista, que ocurra un error al armar o ejecutar la consulta
     * @return Una lista con los objetos resultado de la consulta
     * @param parametrosRequest Los parametros del request entre los cuales se encuentra el identificador de la consulta a ejecutar
     * en la llave "id" del mapa asi como los demas parametros definidos en el xml.
     */
    public List ejecutaConsulta(Map parametrosRequest) throws BusinessException {
        // TODO: Agregar el soporte para subqueries y para between, partir el XML de consultas
        String consultaId = (String) parametrosRequest.get("id");
        ArrayList parametrosQry = new ArrayList();

        String strParametros = "";
        String orderClause = "";
        String groupClause = "";

        String consulta = (String) consultas.get(consultaId); // TODO: Probar sin el new
        if (consulta == null)
            throw new BusinessException("CONSULTA_NO_VALIDA");

        List params = (List) parametros.get(consultaId);
        if (params == null)
            params = new ArrayList();

        boolean needsWhere = consulta.toUpperCase().indexOf("WHERE") == -1 ? true : false;

        for (int i = 0; i < params.size(); i++) {
            ParametroQueryBean parametro = (ParametroQueryBean) params.get(i);

            if (parametrosRequest.containsKey(parametro.getName())) {
                Object valor = parametrosRequest.get(parametro.getName());

                if (parametro.isOrder()) {
                    orderClause = parametro.getOrderClause();
                } else if (parametro.isGroup()) {
                    groupClause = parametro.getGroupClause();
                } else {
                    
                    if(parametro.isBuildSQL()) {
                        //TODO: Optimizar esto del Null
                        if (needsWhere) {
                            consulta += " WHERE ";
                            needsWhere = false;
    
                            if ("net.sf.json.JSONNull".equals(valor.getClass().getName())) {
                                strParametros += " " + parametro.getSqlName() + " IS NULL";
                                continue;
                            } else {
                                strParametros += " " + parametro.getSqlName() + " " + parametro.getConditionType() + " ?";
                            }
    
                        } else {
    
                            if ("net.sf.json.JSONNull".equals(valor.getClass().getName())) {
                                strParametros += " " + parametro.getClauseType() + " " + parametro.getSqlName() + " IS NULL";
                                continue;
                            } else {
                                strParametros += " " + parametro.getClauseType() + " " + parametro.getSqlName() + " " + parametro.getConditionType() + " ?";
                            }
    
                        }

                        if (parametro.getConditionType()
                                     .toUpperCase()
                                     .indexOf("LIKE") != -1) {
                            if (!(valor instanceof String))
                                throw new BusinessException("801", "El valor del parametro \"" + parametro.getName() + "\" no es valido. Se esperaba String.");
                            valor = "%" + ((String) valor).trim().toUpperCase() + "%";
                        } else if (parametro.getConditionType()
                                            .toUpperCase()
                                            .indexOf("IN") != -1) {
                            // TODO: Si es numero se envia tal cual, separado por comas, pero para Strings habra que agregarle las comillas a cada elemento
                            valor = "(" + valor + ")";
                        }

                    }
                    
                    parametrosQry.add(valor);
                }
            }
        }

        consulta += " " + strParametros + " " + (orderClause.trim().equals("") ? "" : " ORDER BY " + orderClause);
        consulta += " " + (groupClause.trim().equals("") ? "" : " GROUP BY " + groupClause);

        return jdbcTemplate.query(consulta.trim(), parametrosQry.toArray(), new GenericRowMapper());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }


    public void setConsultas(Map consultas) {
        this.consultas = consultas;
    }


    public Map getConsultas() {
        return consultas;
    }


    public void setParametros(Map parametros) {
        this.parametros = parametros;
    }


    public Map getParametros() {
        return parametros;
    }
}
