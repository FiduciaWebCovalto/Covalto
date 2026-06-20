package mx.com.inscitech.fiducia.common.util;

import java.util.HashMap;
import java.util.Map;

import mx.com.inscitech.fiducia.business.services.GenericDataAccessService;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.common.services.LoggingService;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;

import org.springframework.jdbc.core.JdbcTemplate;

public class ExecuteRefAsyncRunner implements Runnable {
    
    private static LoggingService logger;
    
    private static final String ERROR_MESSAGE = "Error al realizar la operacion solicitada! ErrorCode: [%s] ErrorMessage: [%s]";
    
    private JdbcTemplate jdbcTemplate;
    
    private GenericDataAccessService dataService;

    private Map parametros = null;
    
    static {
        logger = LoggingService.getNewInstance();
    }
    
    public ExecuteRefAsyncRunner() {
        super();
        parametros = new HashMap();
    }
    
    public void run() {
        
        try {
            dataService.ejecutaProcedimiento(parametros);
        } catch (BusinessException e) {            
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, String.format(ERROR_MESSAGE, GenericResponseBean.ERROR, e.getErrorCode(), e.getErrorMessage()));
        }
    }
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setDataService(GenericDataAccessService dataService) {
        this.dataService = dataService;
    }

    public GenericDataAccessService getDataService() {
        return dataService;
    }

    public void setParametros(Map parametros) {
        this.parametros = parametros;
    }

    public Map getParametros() {
        return parametros;
    }
}
