package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CTOINV_RET_PK", columns = { "FCIN_ID_CTO_INVERSION", "FRET_ID_RETIRO" }, sequences = { "MANUAL" })
public class FCtoinvRet extends DomainObject {

    BigDecimal fcinIdCtoInversion = null;
    BigDecimal fretIdRetiro = null;
    BigDecimal fcvrImporteXCtoinv = null;

    public FCtoinvRet() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcinIdCtoInversion(BigDecimal fcinIdCtoInversion) {
        this.fcinIdCtoInversion = fcinIdCtoInversion;
    }

    public BigDecimal getFcinIdCtoInversion() {
        return this.fcinIdCtoInversion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setFretIdRetiro(BigDecimal fretIdRetiro) {
        this.fretIdRetiro = fretIdRetiro;
    }

    public BigDecimal getFretIdRetiro() {
        return this.fretIdRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvrImporteXCtoinv(BigDecimal fcvrImporteXCtoinv) {
        this.fcvrImporteXCtoinv = fcvrImporteXCtoinv;
    }

    public BigDecimal getFcvrImporteXCtoinv() {
        return this.fcvrImporteXCtoinv;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CTOINV_RET ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcinIdCtoInversion() != null && this.getFcinIdCtoInversion().longValue() == -999) {
            conditions += " AND FCIN_ID_CTO_INVERSION IS NULL";
        } else if (this.getFcinIdCtoInversion() != null) {
            conditions += " AND FCIN_ID_CTO_INVERSION = ?";
            values.add(this.getFcinIdCtoInversion());
        }

        if (this.getFretIdRetiro() != null && this.getFretIdRetiro().longValue() == -999) {
            conditions += " AND FRET_ID_RETIRO IS NULL";
        } else if (this.getFretIdRetiro() != null) {
            conditions += " AND FRET_ID_RETIRO = ?";
            values.add(this.getFretIdRetiro());
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
        String sql = "SELECT * FROM F_CTOINV_RET ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcinIdCtoInversion() != null && this.getFcinIdCtoInversion().longValue() == -999) {
            conditions += " AND FCIN_ID_CTO_INVERSION IS NULL";
        } else if (this.getFcinIdCtoInversion() != null) {
            conditions += " AND FCIN_ID_CTO_INVERSION = ?";
            values.add(this.getFcinIdCtoInversion());
        }

        if (this.getFretIdRetiro() != null && this.getFretIdRetiro().longValue() == -999) {
            conditions += " AND FRET_ID_RETIRO IS NULL";
        } else if (this.getFretIdRetiro() != null) {
            conditions += " AND FRET_ID_RETIRO = ?";
            values.add(this.getFretIdRetiro());
        }

        if (this.getFcvrImporteXCtoinv() != null && this.getFcvrImporteXCtoinv().longValue() == -999) {
            conditions += " AND FCVR_IMPORTE_X_CTOINV IS NULL";
        } else if (this.getFcvrImporteXCtoinv() != null) {
            conditions += " AND FCVR_IMPORTE_X_CTOINV = ?";
            values.add(this.getFcvrImporteXCtoinv());
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
        String sql = "UPDATE F_CTOINV_RET SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCIN_ID_CTO_INVERSION = ?";
        pkValues.add(this.getFcinIdCtoInversion());
        conditions += " AND FRET_ID_RETIRO = ?";
        pkValues.add(this.getFretIdRetiro());
        fields += " FCVR_IMPORTE_X_CTOINV = ?, ";
        values.add(this.getFcvrImporteXCtoinv());
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
        String sql = "INSERT INTO F_CTOINV_RET ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCIN_ID_CTO_INVERSION";
        fieldValues += ", ?";
        values.add(this.getFcinIdCtoInversion());

        fields += ", FRET_ID_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFretIdRetiro());

        fields += ", FCVR_IMPORTE_X_CTOINV";
        fieldValues += ", ?";
        values.add(this.getFcvrImporteXCtoinv());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CTOINV_RET WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCIN_ID_CTO_INVERSION = ?";
        values.add(this.getFcinIdCtoInversion());
        conditions += " AND FRET_ID_RETIRO = ?";
        values.add(this.getFretIdRetiro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCtoinvRet instance = (FCtoinvRet) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcinIdCtoInversion().equals(instance.getFcinIdCtoInversion()))
            equalObjects = false;
        if (equalObjects && !this.getFretIdRetiro().equals(instance.getFretIdRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFcvrImporteXCtoinv().equals(instance.getFcvrImporteXCtoinv()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCtoinvRet result = new FCtoinvRet();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcinIdCtoInversion((BigDecimal) objectData.getData("FCIN_ID_CTO_INVERSION"));
        result.setFretIdRetiro((BigDecimal) objectData.getData("FRET_ID_RETIRO"));
        result.setFcvrImporteXCtoinv((BigDecimal) objectData.getData("FCVR_IMPORTE_X_CTOINV"));

        return result;

    }

}
