package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016405", columns = { "FBDE_EJERCICIO_DECLARA", "FBDE_PERIODO_DECLARA", "FBDE_TIPO_DECLARA" }, sequences = { "MANUAL" })
public class FBitacoraDeclara extends DomainObject {

    BigDecimal fbdeEjercicioDeclara = null;
    String fbdePeriodoDeclara = null;
    String fbdeTipoDeclara = null;
    String fbdeFechaDeclara = null;
    BigDecimal fbdeFolioDeclara = null;

    public FBitacoraDeclara() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbdeEjercicioDeclara(BigDecimal fbdeEjercicioDeclara) {
        this.fbdeEjercicioDeclara = fbdeEjercicioDeclara;
    }

    public BigDecimal getFbdeEjercicioDeclara() {
        return this.fbdeEjercicioDeclara;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFbdePeriodoDeclara(String fbdePeriodoDeclara) {
        this.fbdePeriodoDeclara = fbdePeriodoDeclara;
    }

    public String getFbdePeriodoDeclara() {
        return this.fbdePeriodoDeclara;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbdeTipoDeclara(String fbdeTipoDeclara) {
        this.fbdeTipoDeclara = fbdeTipoDeclara;
    }

    public String getFbdeTipoDeclara() {
        return this.fbdeTipoDeclara;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbdeFechaDeclara(String fbdeFechaDeclara) {
        this.fbdeFechaDeclara = fbdeFechaDeclara;
    }

    public String getFbdeFechaDeclara() {
        return this.fbdeFechaDeclara;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbdeFolioDeclara(BigDecimal fbdeFolioDeclara) {
        this.fbdeFolioDeclara = fbdeFolioDeclara;
    }

    public BigDecimal getFbdeFolioDeclara() {
        return this.fbdeFolioDeclara;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BITACORA_DECLARA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFbdeEjercicioDeclara() != null && this.getFbdeEjercicioDeclara().longValue() == -999) {
            conditions += " AND FBDE_EJERCICIO_DECLARA IS NULL";
        } else if (this.getFbdeEjercicioDeclara() != null) {
            conditions += " AND FBDE_EJERCICIO_DECLARA = ?";
            values.add(this.getFbdeEjercicioDeclara());
        }

        if (this.getFbdePeriodoDeclara() != null && "null".equals(this.getFbdePeriodoDeclara())) {
            conditions += " AND FBDE_PERIODO_DECLARA IS NULL";
        } else if (this.getFbdePeriodoDeclara() != null) {
            conditions += " AND FBDE_PERIODO_DECLARA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbdePeriodoDeclara());
        }

        if (this.getFbdeTipoDeclara() != null && "null".equals(this.getFbdeTipoDeclara())) {
            conditions += " AND FBDE_TIPO_DECLARA IS NULL";
        } else if (this.getFbdeTipoDeclara() != null) {
            conditions += " AND FBDE_TIPO_DECLARA = ?";
            values.add(this.getFbdeTipoDeclara());
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
        String sql = "SELECT * FROM F_BITACORA_DECLARA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFbdeEjercicioDeclara() != null && this.getFbdeEjercicioDeclara().longValue() == -999) {
            conditions += " AND FBDE_EJERCICIO_DECLARA IS NULL";
        } else if (this.getFbdeEjercicioDeclara() != null) {
            conditions += " AND FBDE_EJERCICIO_DECLARA = ?";
            values.add(this.getFbdeEjercicioDeclara());
        }

        if (this.getFbdePeriodoDeclara() != null && "null".equals(this.getFbdePeriodoDeclara())) {
            conditions += " AND FBDE_PERIODO_DECLARA IS NULL";
        } else if (this.getFbdePeriodoDeclara() != null) {
            conditions += " AND FBDE_PERIODO_DECLARA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbdePeriodoDeclara());
        }

        if (this.getFbdeTipoDeclara() != null && "null".equals(this.getFbdeTipoDeclara())) {
            conditions += " AND FBDE_TIPO_DECLARA IS NULL";
        } else if (this.getFbdeTipoDeclara() != null) {
            conditions += " AND FBDE_TIPO_DECLARA = ?";
            values.add(this.getFbdeTipoDeclara());
        }

        if (this.getFbdeFechaDeclara() != null && "null".equals(this.getFbdeFechaDeclara())) {
            conditions += " AND FBDE_FECHA_DECLARA IS NULL";
        } else if (this.getFbdeFechaDeclara() != null) {
            conditions += " AND FBDE_FECHA_DECLARA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbdeFechaDeclara());
        }

        if (this.getFbdeFolioDeclara() != null && this.getFbdeFolioDeclara().longValue() == -999) {
            conditions += " AND FBDE_FOLIO_DECLARA IS NULL";
        } else if (this.getFbdeFolioDeclara() != null) {
            conditions += " AND FBDE_FOLIO_DECLARA = ?";
            values.add(this.getFbdeFolioDeclara());
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
        String sql = "UPDATE F_BITACORA_DECLARA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FBDE_EJERCICIO_DECLARA = ?";
        pkValues.add(this.getFbdeEjercicioDeclara());
        conditions += " AND FBDE_PERIODO_DECLARA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFbdePeriodoDeclara());
        conditions += " AND FBDE_TIPO_DECLARA = ?";
        pkValues.add(this.getFbdeTipoDeclara());
        fields += " FBDE_FECHA_DECLARA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbdeFechaDeclara());
        fields += " FBDE_FOLIO_DECLARA = ?, ";
        values.add(this.getFbdeFolioDeclara());
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
        String sql = "INSERT INTO F_BITACORA_DECLARA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FBDE_EJERCICIO_DECLARA";
        fieldValues += ", ?";
        values.add(this.getFbdeEjercicioDeclara());

        fields += ", FBDE_PERIODO_DECLARA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbdePeriodoDeclara());

        fields += ", FBDE_TIPO_DECLARA";
        fieldValues += ", ?";
        values.add(this.getFbdeTipoDeclara());

        fields += ", FBDE_FECHA_DECLARA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbdeFechaDeclara());

        fields += ", FBDE_FOLIO_DECLARA";
        fieldValues += ", ?";
        values.add(this.getFbdeFolioDeclara());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_BITACORA_DECLARA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FBDE_EJERCICIO_DECLARA = ?";
        values.add(this.getFbdeEjercicioDeclara());
        conditions += " AND FBDE_PERIODO_DECLARA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFbdePeriodoDeclara());
        conditions += " AND FBDE_TIPO_DECLARA = ?";
        values.add(this.getFbdeTipoDeclara());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBitacoraDeclara instance = (FBitacoraDeclara) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFbdeEjercicioDeclara().equals(instance.getFbdeEjercicioDeclara()))
            equalObjects = false;
        if (equalObjects && !this.getFbdePeriodoDeclara().equals(instance.getFbdePeriodoDeclara()))
            equalObjects = false;
        if (equalObjects && !this.getFbdeTipoDeclara().equals(instance.getFbdeTipoDeclara()))
            equalObjects = false;
        if (equalObjects && !this.getFbdeFechaDeclara().equals(instance.getFbdeFechaDeclara()))
            equalObjects = false;
        if (equalObjects && !this.getFbdeFolioDeclara().equals(instance.getFbdeFolioDeclara()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBitacoraDeclara result = new FBitacoraDeclara();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFbdeEjercicioDeclara((BigDecimal) objectData.getData("FBDE_EJERCICIO_DECLARA"));
        result.setFbdePeriodoDeclara((String) objectData.getData("FBDE_PERIODO_DECLARA"));
        result.setFbdeTipoDeclara((String) objectData.getData("FBDE_TIPO_DECLARA"));
        result.setFbdeFechaDeclara((String) objectData.getData("FBDE_FECHA_DECLARA"));
        result.setFbdeFolioDeclara((BigDecimal) objectData.getData("FBDE_FOLIO_DECLARA"));

        return result;

    }

}
