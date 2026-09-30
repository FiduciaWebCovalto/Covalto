package mx.com.inscitech.fiducia.business.test;

import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.dao.util.GenericRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class EjemploServicoImpl implements EjemploServicio {

    /**
     * Miembro para el uso del ORM de Spring, JDBCTemplate
     */
    private JdbcTemplate jdbcTemplate;

    private String queryPaises;
    private String queryAvanzado;
    private Map consultas;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public EjemploServicoImpl() {
    }

    public List ejecutaConsultaPaises() throws BusinessException {
        return jdbcTemplate.query(queryPaises, new Object[] { }, new GenericRowMapper());
    }

    public List ejecutaConsultaAvanzada(Map parametros) throws BusinessException {
        String query = queryAvanzado;

        if (parametros.get("ClavePais") != null) {
            query += " WHERE PAI_NUM_PAIS = ?";
        }

        return jdbcTemplate.query(query, parametros.values().toArray(), new GenericRowMapper());
    }

    public void setQueryPaises(String queryPaises) {
        this.queryPaises = queryPaises;
    }


    public String getQueryPaises() {
        return queryPaises;
    }


    public void setQueryAvanzado(String queryAvanzado) {
        this.queryAvanzado = queryAvanzado;
    }


    public String getQueryAvanzado() {
        return queryAvanzado;
    }


    public void setConsultas(Map consultas) {
        this.consultas = consultas;
    }


    public Map getConsultas() {
        return consultas;
    }
}
