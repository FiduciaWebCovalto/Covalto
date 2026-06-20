package mx.com.inscitech.fiducia.business.contabilidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.log4j.Level;

import org.springframework.jdbc.core.JdbcTemplate;

import mx.com.inscitech.fiducia.business.dao.util.GenericRowMapper;

/**
 *
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConsultasGeneralesContabilidad {

    private JdbcTemplate jdbcTemplate;
    private String queryConsultarPrincipalCatalogoCuentas;
    private String queryVerificaCuentaVSGuia;
    private String queryVerificaNivelesCuenta;
    private String queryVerificaExisteCuenta;
    private String queryConsultarPrincipalCatalogoGuias;
    private String queryVerificaExisteGuia;
    private String queryVerificaGuiaVSTransaccion;
    private String queryBorraEstructuraGuia;
    private String queryConsultarPrincipalEstructuraGuia;
    private LoggingService logger = LoggingService.getInstance();
    private String queryConsultarTransacciones;
    private String queryAsignaValorSecuencial;

    public ConsultasGeneralesContabilidad() {
    }

    /**
     * Funcion implementada para ejecutar una consulta avanzada(c/s parametros de búsqueda) en la pantalla
     * principal del catálogo de cuentas.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaConsultarPrincipalCatalogoCuentas(Map parametros) throws BusinessException {
        String query = queryConsultarPrincipalCatalogoCuentas;
        String queryOrder = " ORDER BY CUE_NUM_CTAM,CUE_NUM_SCTA,CUE_NUM_SSCTA,CUE_NUM_SSSCTA,CUE_NUM_SSSSCTA,CUE_NUM_SSSSSCTA,CUE_NUM_AUX1,CUE_NUM_AUX2,CUE_NUM_AUX3";
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        if (parametros.size() >= 1) {
            query += " WHERE ";
        }
        if (parametros.get("cueNumCtam") != null) {
            query += " CUE_NUM_CTAM = ?";
            parametrosQry.add(parametros.get("cueNumCtam"));
            requiereAnd = true;
        }
        if (parametros.get("cueNumScta") != null) {
            parametrosQry.add(parametros.get("cueNumScta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSscta") != null) {
            parametrosQry.add(parametros.get("cueNumSscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSsscta") != null) {
            parametrosQry.add(parametros.get("cueNumSsscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSssscta") != null) {
            parametrosQry.add(parametros.get("cueNumSssscta"));
            query += (requiereAnd ? " AND " : "") + "  CUE_NUM_SSSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSsssscta") != null) {
            parametrosQry.add(parametros.get("cueNumSsssscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSSSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNomCta") != null) {
            parametrosQry.add(parametros.get("cueNomCta"));
            query += (requiereAnd ? " AND " : "") + "  CUE_NOM_CTA = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query + queryOrder, parametrosQry.toArray(), new GenericRowMapper());
    }

    /**
     * Funcion implementada para llevar a cabo la consulta de una guia en base a una cuenta (asociación)
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaVerificaCuentaVSGuia(Map parametros) throws BusinessException {
        String query = queryVerificaCuentaVSGuia;
        List parametrosQry = new ArrayList();
        if (parametros.get("cueNumCtam") != null) {
            parametrosQry.add(parametros.get("cueNumCtam"));
        }
        if (parametros.get("cueNumScta") != null) {
            parametrosQry.add(parametros.get("cueNumScta"));
        }
        if (parametros.get("cueNumSscta") != null) {
            parametrosQry.add(parametros.get("cueNumSscta"));
        }
        if (parametros.get("cueNumSsscta") != null) {
            parametrosQry.add(parametros.get("cueNumSsscta"));
        }
        if (parametros.get("cueNumSssscta") != null) {
            parametrosQry.add(parametros.get("cueNumSssscta"));
        }
        if (parametros.get("cueNumSsssscta") != null) {
            parametrosQry.add(parametros.get("cueNumSsssscta"));
        }
        return jdbcTemplate.query(query, parametrosQry.toArray(), new GenericRowMapper());
    }

    /**
     * Funcion implementada para llevar a cabo la consulta de niveles asociados a una cuenta
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaVerificaNivelesCuenta(Map parametros) throws BusinessException {
        String query = queryVerificaNivelesCuenta;
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        if (parametros.size() >= 1) {
            query += " WHERE ";
        }
        if (parametros.get("cueNumCtam") != null && parametros.get("cueNumCtam").toString() != "0") {
            query += " CUE_NUM_CTAM = ?";
            parametrosQry.add(parametros.get("cueNumCtam"));
            requiereAnd = true;
        }
        if (parametros.get("cueNumScta") != null && parametros.get("cueNumScta").toString() != "0") {
            parametrosQry.add(parametros.get("cueNumScta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSscta") != null && parametros.get("cueNumSscta").toString() != "0") {
            parametrosQry.add(parametros.get("cueNumSscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSsscta") != null && parametros.get("cueNumSsscta").toString() != "0") {
            parametrosQry.add(parametros.get("cueNumSsscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSssscta") != null && parametros.get("cueNumSssscta").toString() != "0") {
            parametrosQry.add(parametros.get("cueNumSssscta"));
            query += (requiereAnd ? " AND " : "") + "  CUE_NUM_SSSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSsssscta") != null && parametros.get("cueNumSsssscta").toString() != "0") {
            parametrosQry.add(parametros.get("cueNumSsssscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSSSSCTA = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query, parametrosQry.toArray(), new GenericRowMapper());
    }

    /**
     * Funcion implementada para ejecutar la consulta que verificará que no exista una cuenta que nuevamente se quiere dar de alta
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaVerificaExisteCuenta(Map parametros) throws BusinessException {
        String query = queryVerificaExisteCuenta;
        String group = " GROUP BY NVL(CUE_NUM_AUX1,0),NVL(CUE_NUM_AUX2,0),NVL(CUE_NUM_AUX3,0)";
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        if (parametros.size() >= 1) {
            query += " WHERE ";
        }
        if (parametros.get("cueNumCtam") != null) {
            query += " CUE_NUM_CTAM = ?";
            parametrosQry.add(parametros.get("cueNumCtam"));
            requiereAnd = true;
        }
        if (parametros.get("cueNumScta") != null) {
            parametrosQry.add(parametros.get("cueNumScta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSscta") != null) {
            parametrosQry.add(parametros.get("cueNumSscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSsscta") != null) {
            parametrosQry.add(parametros.get("cueNumSsscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSssscta") != null) {
            parametrosQry.add(parametros.get("cueNumSssscta"));
            query += (requiereAnd ? " AND " : "") + "  CUE_NUM_SSSSCTA = ?";
            requiereAnd = true;
        }
        if (parametros.get("cueNumSsssscta") != null) {
            parametrosQry.add(parametros.get("cueNumSsssscta"));
            query += (requiereAnd ? " AND " : "") + " CUE_NUM_SSSSSCTA = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query + group, parametrosQry.toArray(), new GenericRowMapper());
    }

    /**
     * Funcion implementada para ejecutar una consulta avanzada(c/s parametros de búsqueda) en la pantalla
     * principal del catálogo de guías.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaConsultarPrincipalCatalogoGuias(Map parametros) throws BusinessException {
        String query = queryConsultarPrincipalCatalogoGuias;
        String queryOrder = " ORDER BY GUN_NUM_GUIA,GUN_NUM_GUIA";
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        if (parametros.size() >= 1) {
            query += " WHERE ";
        }
        if (parametros.get("NumGuia") != null) {
            parametrosQry.add(parametros.get("NumGuia"));
            query += " GUN_NUM_GUIA = ?";
            requiereAnd = true;
        }
        if (parametros.get("NomGuia") != null) {
            parametrosQry.add(parametros.get("NomGuia"));
            query += (requiereAnd ? " AND " : "") + " GUN_NOM_GUIA = ?";
            requiereAnd = true;
        }
        if (parametros.get("CveStGuiano") != null) {
            parametrosQry.add(parametros.get("CveStGuiano"));
            query += (requiereAnd ? " AND " : "") + " GUN_CVE_ST_GUIANO = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query + queryOrder, parametrosQry.toArray(), new GenericRowMapper());
    }

    /**
     * Funcion implementada para ejecutar la consulta que verificará que no exista una guía que nuevamente se quiere dar de alta
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaVerificaExisteGuia(String numGuia) throws BusinessException {
        return jdbcTemplate.query(queryVerificaExisteGuia, new Object[] { numGuia }, new GenericRowMapper());
    }

    /**
     * Funcion implementada para llevar a cabo la consulta de una transaccion en base a una guía (asociación)
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaVerificaGuiaVSTransaccion(String numGuia) throws BusinessException {
        return jdbcTemplate.query(queryVerificaGuiaVSTransaccion, new Object[] { numGuia }, new GenericRowMapper());
    }

    /**
     * Funcion implementada para llevar a cabo la consulta de una transaccion en base a una guía (asociación)
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public void ejecutaBorraEstructuraGuia(String numGuia) throws BusinessException {
        int result = 0;
        result = jdbcTemplate.update(queryBorraEstructuraGuia, new Object[] { numGuia });

        if (result == 0) {
            logger.log(this, Thread.currentThread(), Level.DEBUG, "No se actualizo nada");
            throw new BusinessException("9000", "No se actualizo el registro correctamente!");
        }
    }

    /**
     * Funcion implementada para ejecutar una consulta avanzada(c/s parametros de búsqueda) en la pantalla
     * de mantenimiento del catálogo de guías.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaConsultarPrincipalEstructuraGuia(String numGuia) throws BusinessException {
        return jdbcTemplate.query(queryConsultarPrincipalEstructuraGuia, new Object[] { numGuia }, new GenericRowMapper());
    }

    /**
     * Funcion implementada para ejecutar la consulta que verificará el secuencial siguiente para asignarlo a un campo correspondiente
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaAsignaValorSecuencial(String numGuia) throws BusinessException {
        return jdbcTemplate.query(queryAsignaValorSecuencial, new Object[] { numGuia }, new GenericRowMapper());
    }

    /**
     * Funcion implementada para ejecutar una consulta avanzada(c/s parametros de búsqueda) en la pantalla
     * principal de transacciones.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException
     * @return
     * @param parametros
     */
    public List ejecutaConsultarPrincipalTransacciones(Map parametros) throws BusinessException {
        String query = queryConsultarTransacciones;
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        String order = "";
        if (parametros.get("Order") != null && parametros.get("Order").toString() == "1")
            order = " ORDER BY TRS_NUM_TRANSAC";
        if (parametros.get("Order") != null && parametros.get("Order").toString() == "2")
            order = " ORDER BY TRS_NOM_TRANSAC";
        if (parametros.size() > 1) {
            query += " WHERE ";
        }
        if (parametros.get("Numero") != null) {
            query += " TRS_NUM_TRANSAC = ?";
            parametrosQry.add(parametros.get("Numero"));
            requiereAnd = true;
        }
        if (parametros.get("Nombre") != null) {
            parametrosQry.add(parametros.get("Nombre"));
            query += (requiereAnd ? " AND " : "") + " TRS_NOM_TRANSAC LIKE '%'||?||'%'";
            requiereAnd = true;
        }
        if (parametros.get("Modulo") != null) {
            parametrosQry.add(parametros.get("Modulo"));
            query += (requiereAnd ? " AND " : "") + " TRS_NUM_MODULO = ?";
            requiereAnd = true;
        }
        if (parametros.get("Guia") != null) {
            parametrosQry.add(parametros.get("Guia"));
            query += (requiereAnd ? " AND " : "") + " TRS_NUM_GUIA_CONT = ?";
            requiereAnd = true;
        }
        if (parametros.get("Status") != null) {
            parametrosQry.add(parametros.get("Status"));
            query += (requiereAnd ? " AND " : "") + "  TRS_CVE_ST_TRANSAC = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query + order, parametrosQry.toArray(), new GenericRowMapper());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }


    public void setQueryConsultarPrincipalCatalogoCuentas(String queryConsultarPrincipalCatalogoCuentas) {
        this.queryConsultarPrincipalCatalogoCuentas = queryConsultarPrincipalCatalogoCuentas;
    }


    public String getQueryConsultarPrincipalCatalogoCuentas() {
        return queryConsultarPrincipalCatalogoCuentas;
    }


    public void setQueryVerificaCuentaVSGuia(String queryVerificaCuentaVSGuia) {
        this.queryVerificaCuentaVSGuia = queryVerificaCuentaVSGuia;
    }


    public String getQueryVerificaCuentaVSGuia() {
        return queryVerificaCuentaVSGuia;
    }


    public void setQueryVerificaNivelesCuenta(String queryVerificaNivelesCuenta) {
        this.queryVerificaNivelesCuenta = queryVerificaNivelesCuenta;
    }


    public String getQueryVerificaNivelesCuenta() {
        return queryVerificaNivelesCuenta;
    }


    public void setQueryVerificaExisteCuenta(String queryVerificaExisteCuenta) {
        this.queryVerificaExisteCuenta = queryVerificaExisteCuenta;
    }


    public String getQueryVerificaExisteCuenta() {
        return queryVerificaExisteCuenta;
    }


    public void setQueryConsultarPrincipalCatalogoGuias(String queryConsultarPrincipalCatalogoGuias) {
        this.queryConsultarPrincipalCatalogoGuias = queryConsultarPrincipalCatalogoGuias;
    }


    public String getQueryConsultarPrincipalCatalogoGuias() {
        return queryConsultarPrincipalCatalogoGuias;
    }


    public void setQueryVerificaExisteGuia(String queryVerificaExisteGuia) {
        this.queryVerificaExisteGuia = queryVerificaExisteGuia;
    }


    public String getQueryVerificaExisteGuia() {
        return queryVerificaExisteGuia;
    }


    public void setQueryVerificaGuiaVSTransaccion(String queryVerificaGuiaVSTransaccion) {
        this.queryVerificaGuiaVSTransaccion = queryVerificaGuiaVSTransaccion;
    }


    public String getQueryVerificaGuiaVSTransaccion() {
        return queryVerificaGuiaVSTransaccion;
    }


    public void setQueryBorraEstructuraGuia(String queryBorraEstructuraGuia) {
        this.queryBorraEstructuraGuia = queryBorraEstructuraGuia;
    }


    public String getQueryBorraEstructuraGuia() {
        return queryBorraEstructuraGuia;
    }


    public void setQueryConsultarPrincipalEstructuraGuia(String queryConsultarPrincipalEstructuraGuia) {
        this.queryConsultarPrincipalEstructuraGuia = queryConsultarPrincipalEstructuraGuia;
    }


    public String getQueryConsultarPrincipalEstructuraGuia() {
        return queryConsultarPrincipalEstructuraGuia;
    }


    public void setQueryConsultarTransacciones(String queryConsultarTransacciones) {
        this.queryConsultarTransacciones = queryConsultarTransacciones;
    }


    public String getQueryConsultarTransacciones() {
        return queryConsultarTransacciones;
    }


    public void setQueryAsignaValorSecuencial(String queryAsignaValorSecuencial) {
        this.queryAsignaValorSecuencial = queryAsignaValorSecuencial;
    }


    public String getQueryAsignaValorSecuencial() {
        return queryAsignaValorSecuencial;
    }
}
