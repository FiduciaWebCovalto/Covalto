package mx.com.inscitech.fiducia.business.administracion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.dao.util.GenericRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Clase implementada para acceder a la bd y obtener el valor de los combos
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConsultaCombosFideicomisos {

    private JdbcTemplate jdbcTemplate;
    private String querySimple;
    private String queryAvanzado;
    private Map consultasCombos;
    private String queryCombo;
    private String queryProducto;
    private String queryActividad;
    private String queryAvanzadoFideicomisarios;

    public ConsultaCombosFideicomisos() {
    }

    public Map ejecutaConsultaCombosFideicomisos() throws BusinessException {
        Map combos = new HashMap();

        combos.put("queryTipoPersona", jdbcTemplate.query((String) consultasCombos.get("queryTipoPersona"), new Object[] { }, new GenericRowMapper()));
        combos.put("queryFormaManejo", jdbcTemplate.query((String) consultasCombos.get("queryFormaManejo"), new Object[] { }, new GenericRowMapper()));
        combos.put("queryTipoNegocio", jdbcTemplate.query((String) consultasCombos.get("queryTipoNegocio"), new Object[] { }, new GenericRowMapper()));
        combos.put("queryClasifProducto", jdbcTemplate.query((String) consultasCombos.get("queryClasifProducto"), new Object[] { }, new GenericRowMapper()));
        combos.put("queryStatus", jdbcTemplate.query((String) consultasCombos.get("queryStatus"), new Object[] { }, new GenericRowMapper()));
        combos.put("queryAvanzadoFideicomisarios", jdbcTemplate.query((String) consultasCombos.get("queryAvanzadoFideicomisarios"), new Object[] { }, new GenericRowMapper()));

        return combos;
    }

    public List ejecutaConsultaAvanzadaFideicomisarios(Map parametros) throws BusinessException {
        String query = queryAvanzadoFideicomisarios;
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        if (parametros.size() >= 1) {
            query += " WHERE ";
        }
        if (parametros.get("Fideicomiso") != null) {
            query += " BEN_NUM_CONTRATO = ?";
            parametrosQry.add(parametros.get("Fideicomiso"));
            requiereAnd = true;
        }
        if (parametros.get("NumFideicomisario") != null) {
            parametrosQry.add(parametros.get("NumFideicomisario"));
            query += (requiereAnd ? " AND " : "") + " BEN_BENEFICIARIO = ?";
            requiereAnd = true;
        }
        if (parametros.get("TNombre") != null) {
            parametrosQry.add(parametros.get("Nombre"));
            query += (requiereAnd ? " AND " : "") + " BEN_NOM_BENEF = ?";
            requiereAnd = true;
        }
        if (parametros.get("Status") != null) {
            parametrosQry.add(parametros.get("Status"));
            query += (requiereAnd ? " AND " : "") + "  BEN_CVE_ST_BENEFIC = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query, parametrosQry.toArray(), new GenericRowMapper());
    }

    public List ejecutaConsultaCombo(String clave) throws BusinessException {
        return jdbcTemplate.query(queryCombo, new Object[] { clave }, new GenericRowMapper());
    }

    public List ejecutaCargaComboProducto(Map parametros) throws BusinessException {
        List parametrosQry = new ArrayList();
        parametrosQry.add(parametros.get("tipoNegocio"));
        parametrosQry.add(parametros.get("clasifProducto"));
        return jdbcTemplate.query(queryProducto, parametrosQry.toArray(), new GenericRowMapper());
    }

    public List ejecutaCargaComboActividad() throws BusinessException {
        return jdbcTemplate.query(queryActividad, new Object[] { }, new GenericRowMapper());
    }

    public List ejecutaConsultaAvanzada(Map parametros) throws BusinessException {
        String query = queryAvanzado;
        List parametrosQry = new ArrayList();
        boolean requiereAnd = false;
        if (parametros.size() >= 1) {
            query += " WHERE ";
        }
        if (parametros.get("NumFideicomiso") != null) {
            query += " CTO_NUM_CONTRATO = ?";
            parametrosQry.add(parametros.get("NumFideicomiso"));
            requiereAnd = true;
        }
        if (parametros.get("Nombre") != null) {
            parametrosQry.add(parametros.get("Nombre"));
            query += (requiereAnd ? " AND " : "") + " CTO_NOM_CONTRATO = ?";
            requiereAnd = true;
        }
        if (parametros.get("TipoPersona") != null) {
            parametrosQry.add(parametros.get("TipoPersona"));
            query += (requiereAnd ? " AND " : "") + " CTO_CVE_TIPO_PER = ?";
            requiereAnd = true;
        }
        if (parametros.get("FormAManejo") != null) {
            parametrosQry.add(parametros.get("FormaManejo"));
            query += (requiereAnd ? " AND " : "") + " CTO_CVE_FORMA_MAN = ?";
            requiereAnd = true;
        }
        if (parametros.get("TipoNegocio") != null) {
            parametrosQry.add(parametros.get("TipoNegocio"));
            query += (requiereAnd ? " AND " : "") + "  CTO_CVE_TIPO_NEG = ?";
            requiereAnd = true;
        }
        if (parametros.get("ClasifProducto") != null) {
            parametrosQry.add(parametros.get("ClasifProducto"));
            query += (requiereAnd ? " AND " : "") + " CTO_CVE_CLAS_PROD = ?";
            requiereAnd = true;
        }
        if (parametros.get("Status") != null) {
            parametrosQry.add(parametros.get("Status"));
            query += (requiereAnd ? " AND " : "") + "  CTO_CVE_ST_CONTRAT = ?";
            requiereAnd = true;
        }
        return jdbcTemplate.query(query, parametrosQry.toArray(), new GenericRowMapper());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setConsultasCombos(Map consultasCombos) {
        this.consultasCombos = consultasCombos;
    }

    public Map getConsultasCombos() {
        return consultasCombos;
    }


    public void setQuerySimple(String querySimple) {
        this.querySimple = querySimple;
    }


    public String getQuerySimple() {
        return querySimple;
    }


    public void setQueryAvanzado(String queryAvanzado) {
        this.queryAvanzado = queryAvanzado;
    }


    public String getQueryAvanzado() {
        return queryAvanzado;
    }


    public void setQueryCombo(String queryCombo) {
        this.queryCombo = queryCombo;
    }


    public String getQueryCombo() {
        return queryCombo;
    }


    public void setQueryProducto(String queryProducto) {
        this.queryProducto = queryProducto;
    }


    public String getQueryProducto() {
        return queryProducto;
    }


    public void setQueryActividad(String queryActividad) {
        this.queryActividad = queryActividad;
    }


    public String getQueryActividad() {
        return queryActividad;
    }


    public void setQueryAvanzadoFideicomisarios(String queryAvanzadoFideicomisarios) {
        this.queryAvanzadoFideicomisarios = queryAvanzadoFideicomisarios;
    }


    public String getQueryAvanzadoFideicomisarios() {
        return queryAvanzadoFideicomisarios;
    }

}
