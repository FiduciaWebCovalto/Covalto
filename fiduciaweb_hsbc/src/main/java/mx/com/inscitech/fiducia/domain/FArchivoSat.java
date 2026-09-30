package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016351", columns = { "FAST_IDENTIFICADOR_ARCHIVO" }, sequences = { "MAX" })
public class FArchivoSat extends DomainObject {

    BigDecimal fastIdentificadorArchivo = null;
    String fastNombre = null;

    public FArchivoSat() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFastIdentificadorArchivo(BigDecimal fastIdentificadorArchivo) {
        this.fastIdentificadorArchivo = fastIdentificadorArchivo;
    }

    public BigDecimal getFastIdentificadorArchivo() {
        return this.fastIdentificadorArchivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFastNombre(String fastNombre) {
        this.fastNombre = fastNombre;
    }

    public String getFastNombre() {
        return this.fastNombre;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ARCHIVO_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFastIdentificadorArchivo() != null && this.getFastIdentificadorArchivo().longValue() == -999) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO IS NULL";
        } else if (this.getFastIdentificadorArchivo() != null) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
            values.add(this.getFastIdentificadorArchivo());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getSelect() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ARCHIVO_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFastIdentificadorArchivo() != null && this.getFastIdentificadorArchivo().longValue() == -999) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO IS NULL";
        } else if (this.getFastIdentificadorArchivo() != null) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
            values.add(this.getFastIdentificadorArchivo());
        }

        if (this.getFastNombre() != null && "null".equals(this.getFastNombre())) {
            conditions += " AND FAST_NOMBRE IS NULL";
        } else if (this.getFastNombre() != null) {
            conditions += " AND FAST_NOMBRE = ?";
            values.add(this.getFastNombre());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_ARCHIVO_SAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
        pkValues.add(this.getFastIdentificadorArchivo());
        fields += " FAST_NOMBRE = ?, ";
        values.add(this.getFastNombre());
        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;

        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(4).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getInsert() {
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_ARCHIVO_SAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FAST_IDENTIFICADOR_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getFastIdentificadorArchivo());

        fields += ", FAST_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFastNombre());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ARCHIVO_SAT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
        values.add(this.getFastIdentificadorArchivo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FArchivoSat instance = (FArchivoSat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFastIdentificadorArchivo().equals(instance.getFastIdentificadorArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getFastNombre().equals(instance.getFastNombre()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FArchivoSat result = new FArchivoSat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFastIdentificadorArchivo((BigDecimal) objectData.getData("FAST_IDENTIFICADOR_ARCHIVO"));
        result.setFastNombre((String) objectData.getData("FAST_NOMBRE"));

        return result;

    }

}
