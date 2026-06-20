package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FOLIOS_PK", columns = { "FOL_TIPO_FOLIO" }, sequences = { "MAX" })
public class Folios extends DomainObject {

    BigDecimal folTipoFolio = null;
    BigDecimal folNumFolio = null;
    String folCveStFolio = null;
    BigDecimal folNumPrueba = null;

    public Folios() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFolTipoFolio(BigDecimal folTipoFolio) {
        this.folTipoFolio = folTipoFolio;
    }

    public BigDecimal getFolTipoFolio() {
        return this.folTipoFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFolNumFolio(BigDecimal folNumFolio) {
        this.folNumFolio = folNumFolio;
    }

    public BigDecimal getFolNumFolio() {
        return this.folNumFolio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFolCveStFolio(String folCveStFolio) {
        this.folCveStFolio = folCveStFolio;
    }

    public String getFolCveStFolio() {
        return this.folCveStFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFolNumPrueba(BigDecimal folNumPrueba) {
        this.folNumPrueba = folNumPrueba;
    }

    public BigDecimal getFolNumPrueba() {
        return this.folNumPrueba;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FOLIOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFolTipoFolio() != null && this.getFolTipoFolio().longValue() == -999) {
            conditions += " AND FOL_TIPO_FOLIO IS NULL";
        } else if (this.getFolTipoFolio() != null) {
            conditions += " AND FOL_TIPO_FOLIO = ?";
            values.add(this.getFolTipoFolio());
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
        String sql = "SELECT * FROM FOLIOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFolTipoFolio() != null && this.getFolTipoFolio().longValue() == -999) {
            conditions += " AND FOL_TIPO_FOLIO IS NULL";
        } else if (this.getFolTipoFolio() != null) {
            conditions += " AND FOL_TIPO_FOLIO = ?";
            values.add(this.getFolTipoFolio());
        }

        if (this.getFolNumFolio() != null && this.getFolNumFolio().longValue() == -999) {
            conditions += " AND FOL_NUM_FOLIO IS NULL";
        } else if (this.getFolNumFolio() != null) {
            conditions += " AND FOL_NUM_FOLIO = ?";
            values.add(this.getFolNumFolio());
        }

        if (this.getFolCveStFolio() != null && "null".equals(this.getFolCveStFolio())) {
            conditions += " AND FOL_CVE_ST_FOLIO IS NULL";
        } else if (this.getFolCveStFolio() != null) {
            conditions += " AND FOL_CVE_ST_FOLIO = ?";
            values.add(this.getFolCveStFolio());
        }

        if (this.getFolNumPrueba() != null && this.getFolNumPrueba().longValue() == -999) {
            conditions += " AND FOL_NUM_PRUEBA IS NULL";
        } else if (this.getFolNumPrueba() != null) {
            conditions += " AND FOL_NUM_PRUEBA = ?";
            values.add(this.getFolNumPrueba());
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
        String sql = "UPDATE FOLIOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOL_TIPO_FOLIO = ?";
        pkValues.add(this.getFolTipoFolio());
        fields += " FOL_NUM_FOLIO = ?, ";
        values.add(this.getFolNumFolio());
        fields += " FOL_CVE_ST_FOLIO = ?, ";
        values.add(this.getFolCveStFolio());
        fields += " FOL_NUM_PRUEBA = ?, ";
        values.add(this.getFolNumPrueba());
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
        String sql = "INSERT INTO FOLIOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOL_TIPO_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFolTipoFolio());

        fields += ", FOL_NUM_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFolNumFolio());

        fields += ", FOL_CVE_ST_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFolCveStFolio());

        fields += ", FOL_NUM_PRUEBA";
        fieldValues += ", ?";
        values.add(this.getFolNumPrueba());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FOLIOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOL_TIPO_FOLIO = ?";
        values.add(this.getFolTipoFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Folios instance = (Folios) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFolTipoFolio().equals(instance.getFolTipoFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFolNumFolio().equals(instance.getFolNumFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFolCveStFolio().equals(instance.getFolCveStFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFolNumPrueba().equals(instance.getFolNumPrueba()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Folios result = new Folios();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFolTipoFolio((BigDecimal) objectData.getData("FOL_TIPO_FOLIO"));
        result.setFolNumFolio((BigDecimal) objectData.getData("FOL_NUM_FOLIO"));
        result.setFolCveStFolio((String) objectData.getData("FOL_CVE_ST_FOLIO"));
        result.setFolNumPrueba((BigDecimal) objectData.getData("FOL_NUM_PRUEBA"));

        return result;

    }

}
