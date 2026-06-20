package mx.com.inscitech.fiducia.business.dao.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.HashMap;

import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class GenericRowMapper implements RowMapper {

    /**
     * Implementación de la lógica de mapeo de columnas.
     * @throws java.sql.SQLException Cuando no es posible procesar el resultado
     * @return La lista que contiene los elementos resultado de la consulta
     * @param rowNum El numero de registros
     * @param rs El recordset que contiene los registros
     */
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        HashMap columInfo = new HashMap();
        ResultSetMetaData metaData = null;

        metaData = rs.getMetaData();

        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            Object obj = rs.getObject(i);

            columInfo.put(formatName(metaData.getColumnLabel(i)), obj);
        }

        return columInfo;
    }

    private String formatName(String name) {
        name = name.toLowerCase();
        while (name.indexOf("_") > -1) {
            String namePart = name.substring(name.indexOf("_") + 1);
            namePart = namePart.substring(0, 1).toUpperCase() + namePart.substring(1);
            name = name.substring(0, name.indexOf("_")) + namePart;
        }

        return name;
    }
}
