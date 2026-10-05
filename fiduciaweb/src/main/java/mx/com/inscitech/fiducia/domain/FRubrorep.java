package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016946", columns = { "FACO_ID_AGRUPACION" }, sequences = { "MAX" })
public class FRubrorep extends DomainObject {

    BigDecimal facoIdAgrupacion = null;
    BigDecimal facoEsEtiqueta = null;
    String facuNombreImpreso = null;
    String facoNombreAgrupacion = null;

    public FRubrorep() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacoIdAgrupacion(BigDecimal facoIdAgrupacion) {
        this.facoIdAgrupacion = facoIdAgrupacion;
    }

    public BigDecimal getFacoIdAgrupacion() {
        return this.facoIdAgrupacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFacoEsEtiqueta(BigDecimal facoEsEtiqueta) {
        this.facoEsEtiqueta = facoEsEtiqueta;
    }

    public BigDecimal getFacoEsEtiqueta() {
        return this.facoEsEtiqueta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacuNombreImpreso(String facuNombreImpreso) {
        this.facuNombreImpreso = facuNombreImpreso;
    }

    public String getFacuNombreImpreso() {
        return this.facuNombreImpreso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacoNombreAgrupacion(String facoNombreAgrupacion) {
        this.facoNombreAgrupacion = facoNombreAgrupacion;
    }

    public String getFacoNombreAgrupacion() {
        return this.facoNombreAgrupacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_RUBROREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
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
        String sql = "SELECT * FROM F_RUBROREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
        }

        if (this.getFacoEsEtiqueta() != null && this.getFacoEsEtiqueta().longValue() == -999) {
            conditions += " AND FACO_ES_ETIQUETA IS NULL";
        } else if (this.getFacoEsEtiqueta() != null) {
            conditions += " AND FACO_ES_ETIQUETA = ?";
            values.add(this.getFacoEsEtiqueta());
        }

        if (this.getFacuNombreImpreso() != null && "null".equals(this.getFacuNombreImpreso())) {
            conditions += " AND FACU_NOMBRE_IMPRESO IS NULL";
        } else if (this.getFacuNombreImpreso() != null) {
            conditions += " AND FACU_NOMBRE_IMPRESO = ?";
            values.add(this.getFacuNombreImpreso());
        }

        if (this.getFacoNombreAgrupacion() != null && "null".equals(this.getFacoNombreAgrupacion())) {
            conditions += " AND FACO_NOMBRE_AGRUPACION IS NULL";
        } else if (this.getFacoNombreAgrupacion() != null) {
            conditions += " AND FACO_NOMBRE_AGRUPACION = ?";
            values.add(this.getFacoNombreAgrupacion());
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
        String sql = "UPDATE F_RUBROREP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FACO_ID_AGRUPACION = ?";
        pkValues.add(this.getFacoIdAgrupacion());
        fields += " FACO_ES_ETIQUETA = ?, ";
        values.add(this.getFacoEsEtiqueta());
        fields += " FACU_NOMBRE_IMPRESO = ?, ";
        values.add(this.getFacuNombreImpreso());
        fields += " FACO_NOMBRE_AGRUPACION = ?, ";
        values.add(this.getFacoNombreAgrupacion());
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
        String sql = "INSERT INTO F_RUBROREP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FACO_ID_AGRUPACION";
        fieldValues += ", ?";
        values.add(this.getFacoIdAgrupacion());

        fields += ", FACO_ES_ETIQUETA";
        fieldValues += ", ?";
        values.add(this.getFacoEsEtiqueta());

        fields += ", FACU_NOMBRE_IMPRESO";
        fieldValues += ", ?";
        values.add(this.getFacuNombreImpreso());

        fields += ", FACO_NOMBRE_AGRUPACION";
        fieldValues += ", ?";
        values.add(this.getFacoNombreAgrupacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_RUBROREP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FACO_ID_AGRUPACION = ?";
        values.add(this.getFacoIdAgrupacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRubrorep instance = (FRubrorep) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFacoIdAgrupacion().equals(instance.getFacoIdAgrupacion()))
            equalObjects = false;
        if (equalObjects && !this.getFacoEsEtiqueta().equals(instance.getFacoEsEtiqueta()))
            equalObjects = false;
        if (equalObjects && !this.getFacuNombreImpreso().equals(instance.getFacuNombreImpreso()))
            equalObjects = false;
        if (equalObjects && !this.getFacoNombreAgrupacion().equals(instance.getFacoNombreAgrupacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRubrorep result = new FRubrorep();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFacoIdAgrupacion((BigDecimal) objectData.getData("FACO_ID_AGRUPACION"));
        result.setFacoEsEtiqueta((BigDecimal) objectData.getData("FACO_ES_ETIQUETA"));
        result.setFacuNombreImpreso((String) objectData.getData("FACU_NOMBRE_IMPRESO"));
        result.setFacoNombreAgrupacion((String) objectData.getData("FACO_NOMBRE_AGRUPACION"));

        return result;

    }

}
