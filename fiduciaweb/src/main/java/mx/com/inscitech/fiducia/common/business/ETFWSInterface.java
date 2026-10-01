package mx.com.inscitech.fiducia.common.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mx.com.actinver.wsetf.FaultType;
import mx.com.actinver.wsetf.WsetfProxy;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.business.dao.util.GenericRowMapper;

import org.apache.log4j.Level;


public class ETFWSInterface extends InterfaceDef {
    private static final Logger LOGGER = LoggerFactory.getLogger(ETFWSInterface.class);


    protected LoggingService logger = LoggingService.getInstance();

    public ETFWSInterface() {
        super();
        interfaceName = "ETF WebService";
    }

    public void execute() {

        WsetfProxy client = null;
        FaultType result = null;

        String serviceURL = null;
        String fecha = null;

        String sqlService = "SELECT PARAM_VALOR2 FROM PARAM_GLOBAL WHERE PARAM_DESCRIPCION = 'URL_ETFS_WS'";
        List resultSQL = new ArrayList();

        SimpleDateFormat formatter = null;

        try {

            // TODO: Validar el formato de la fecha? Desde el inicio?

            if (parameters.get("fecha") == null)
                throw new Exception("Fecha de no válida! Fecha recibida: \"" + parameters.get("fecha") + "\"");

            serviceURL = ConfigurationService.getInstance().getProperty("ETF_WEB_SERVICE_URL");
            if (serviceURL == null || "".equals(serviceURL.trim())) {
                resultSQL = jdbcTemplate.query(sqlService, new Object[] { }, new GenericRowMapper());
                serviceURL = "" + ((Map) resultSQL.get(0)).get("paramValor2");
                resultSQL.clear();
                resultSQL = null;
            }

            fecha = parameters.get("fecha").trim();

            if ("".equals(fecha))
                throw new Exception("Fecha de no válida! Fecha recibida: \"" + fecha + "\"");

            logger.log(this, Thread.currentThread(), Level.DEBUG, "ETF Web Service URL: " + serviceURL + " Fecha: " + fecha);

            formatter = new SimpleDateFormat("dd/MM/yyyy");

            client = new WsetfProxy(serviceURL);
            result = client.getWsetf().fechaMovimientos(formatter.parse(fecha));

            if ("000".equals(result.getCode())) {

                this.resultCode = 0;
                this.strCode = "0";
                this.description = "Operación realizada con éxito!";

            } else {

                this.resultCode = Integer.valueOf(result.getCode());
                this.strCode = result.getCode();
                this.description = result.getMessage();

            }

        } catch (Exception e) {

            LOGGER.debug("Clase Error: " + e.getClass().getName());
            logger.log(this, Thread.currentThread(), Level.ERROR, e);

            if (e.getClass()
                 .getName()
                 .indexOf("ClientTransportException") > -1) {

                this.resultCode = 9;
                this.strCode = "9";
                this.description = "Error de conexion con el cliente!";

            } else {

                this.resultCode = 10;
                this.strCode = "10";
                this.description = e.getMessage();

            }

        } finally {

            client = null;
            result = null;

            formatter = null;

        }
    }

}
