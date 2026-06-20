package mx.com.inscitech.fiducia.common.business;

import java.util.HashMap;

import mx.com.inscitech.fiducia.business.services.GenericDataAccessService;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class InterfaceDef {

    protected String interfaceName = "No Interface";
    protected String interfaceClass = "";

    protected GenericDataAccessService dataAccess;
    protected JdbcTemplate jdbcTemplate;

    protected int resultCode = -1; // Codigo resultado de la ejecucion del servicio
    protected String strCode = "-999"; // Codigo en string resultado de la ejecucion del servicio
    protected String description = ""; // Detalle del resultado
    protected HashMap<String, String> parameters = null;

    public InterfaceDef() {
        super();
    }

    public abstract void execute();

    public String getInterfaceName() {
        return interfaceName;
    }

    public String getInterfaceClass() {
        return interfaceClass;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void setStrCode(String strCode) {
        this.strCode = strCode;
    }

    public String getStrCode() {
        return strCode;
    }

    public void setDataAccess(GenericDataAccessService dataAccess) {
        this.dataAccess = dataAccess;
    }

    public GenericDataAccessService getDataAccess() {
        return dataAccess;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

}
