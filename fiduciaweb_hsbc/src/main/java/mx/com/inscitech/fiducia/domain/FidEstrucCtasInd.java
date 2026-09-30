package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_FID_ESTRUC_CTAS_IND", columns = { "EST_CONTRATO", "EST_NIVEL" }, sequences = { "MANUAL" })
public class FidEstrucCtasInd extends DomainObject {

    BigDecimal estContrato = null;
    BigDecimal estNivel = null;
    String estNombre = null;
    String estDescripcion = null;
    BigDecimal estLongId = null;
    String estFecAlta = null;
    String estFecUltMod = null;

    public FidEstrucCtasInd() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstContrato(BigDecimal estContrato) {
        this.estContrato = estContrato;
    }

    public BigDecimal getEstContrato() {
        return this.estContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNivel(BigDecimal estNivel) {
        this.estNivel = estNivel;
    }

    public BigDecimal getEstNivel() {
        return this.estNivel;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNombre(String estNombre) {
        this.estNombre = estNombre;
    }

    public String getEstNombre() {
        return this.estNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstDescripcion(String estDescripcion) {
        this.estDescripcion = estDescripcion;
    }

    public String getEstDescripcion() {
        return this.estDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setEstLongId(BigDecimal estLongId) {
        this.estLongId = estLongId;
    }

    public BigDecimal getEstLongId() {
        return this.estLongId;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setEstFecAlta(String estFecAlta) {
        this.estFecAlta = estFecAlta;
    }

    public String getEstFecAlta() {
        return this.estFecAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setEstFecUltMod(String estFecUltMod) {
        this.estFecUltMod = estFecUltMod;
    }

    public String getEstFecUltMod() {
        return this.estFecUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_ESTRUC_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstContrato() != null && this.getEstContrato().longValue() == -999) {
            conditions += " AND EST_CONTRATO IS NULL";
        } else if (this.getEstContrato() != null) {
            conditions += " AND EST_CONTRATO = ?";
            values.add(this.getEstContrato());
        }

        if (this.getEstNivel() != null && this.getEstNivel().longValue() == -999) {
            conditions += " AND EST_NIVEL IS NULL";
        } else if (this.getEstNivel() != null) {
            conditions += " AND EST_NIVEL = ?";
            values.add(this.getEstNivel());
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
        String sql = "SELECT * FROM FID_ESTRUC_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstContrato() != null && this.getEstContrato().longValue() == -999) {
            conditions += " AND EST_CONTRATO IS NULL";
        } else if (this.getEstContrato() != null) {
            conditions += " AND EST_CONTRATO = ?";
            values.add(this.getEstContrato());
        }

        if (this.getEstNivel() != null && this.getEstNivel().longValue() == -999) {
            conditions += " AND EST_NIVEL IS NULL";
        } else if (this.getEstNivel() != null) {
            conditions += " AND EST_NIVEL = ?";
            values.add(this.getEstNivel());
        }

        if (this.getEstNombre() != null && "null".equals(this.getEstNombre())) {
            conditions += " AND EST_NOMBRE IS NULL";
        } else if (this.getEstNombre() != null) {
            conditions += " AND EST_NOMBRE = ?";
            values.add(this.getEstNombre());
        }

        if (this.getEstDescripcion() != null && "null".equals(this.getEstDescripcion())) {
            conditions += " AND EST_DESCRIPCION IS NULL";
        } else if (this.getEstDescripcion() != null) {
            conditions += " AND EST_DESCRIPCION = ?";
            values.add(this.getEstDescripcion());
        }

        if (this.getEstLongId() != null && this.getEstLongId().longValue() == -999) {
            conditions += " AND EST_LONG_ID IS NULL";
        } else if (this.getEstLongId() != null) {
            conditions += " AND EST_LONG_ID = ?";
            values.add(this.getEstLongId());
        }

        if (this.getEstFecAlta() != null && "null".equals(this.getEstFecAlta())) {
            conditions += " AND EST_FEC_ALTA IS NULL";
        } else if (this.getEstFecAlta() != null) {
            conditions += " AND EST_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEstFecAlta());
        }

        if (this.getEstFecUltMod() != null && "null".equals(this.getEstFecUltMod())) {
            conditions += " AND EST_FEC_ULT_MOD IS NULL";
        } else if (this.getEstFecUltMod() != null) {
            conditions += " AND EST_FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEstFecUltMod());
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
        String sql = "UPDATE FID_ESTRUC_CTAS_IND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EST_CONTRATO = ?";
        pkValues.add(this.getEstContrato());
        conditions += " AND EST_NIVEL = ?";
        pkValues.add(this.getEstNivel());
        fields += " EST_NOMBRE = ?, ";
        values.add(this.getEstNombre());
        fields += " EST_DESCRIPCION = ?, ";
        values.add(this.getEstDescripcion());
        fields += " EST_LONG_ID = ?, ";
        values.add(this.getEstLongId());
        fields += " EST_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEstFecAlta());
        fields += " EST_FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEstFecUltMod());
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
        String sql = "INSERT INTO FID_ESTRUC_CTAS_IND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EST_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEstContrato());

        fields += ", EST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstNivel());

        fields += ", EST_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getEstNombre());

        fields += ", EST_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEstDescripcion());

        fields += ", EST_LONG_ID";
        fieldValues += ", ?";
        values.add(this.getEstLongId());

        fields += ", EST_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEstFecAlta());

        fields += ", EST_FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEstFecUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_ESTRUC_CTAS_IND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EST_CONTRATO = ?";
        values.add(this.getEstContrato());
        conditions += " AND EST_NIVEL = ?";
        values.add(this.getEstNivel());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidEstrucCtasInd instance = (FidEstrucCtasInd) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstContrato().equals(instance.getEstContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEstNivel().equals(instance.getEstNivel()))
            equalObjects = false;
        if (equalObjects && !this.getEstNombre().equals(instance.getEstNombre()))
            equalObjects = false;
        if (equalObjects && !this.getEstDescripcion().equals(instance.getEstDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getEstLongId().equals(instance.getEstLongId()))
            equalObjects = false;
        if (equalObjects && !this.getEstFecAlta().equals(instance.getEstFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getEstFecUltMod().equals(instance.getEstFecUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidEstrucCtasInd result = new FidEstrucCtasInd();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstContrato((BigDecimal) objectData.getData("EST_CONTRATO"));
        result.setEstNivel((BigDecimal) objectData.getData("EST_NIVEL"));
        result.setEstNombre((String) objectData.getData("EST_NOMBRE"));
        result.setEstDescripcion((String) objectData.getData("EST_DESCRIPCION"));
        result.setEstLongId((BigDecimal) objectData.getData("EST_LONG_ID"));
        result.setEstFecAlta((String) objectData.getData("EST_FEC_ALTA"));
        result.setEstFecUltMod((String) objectData.getData("EST_FEC_ULT_MOD"));

        return result;

    }

}
