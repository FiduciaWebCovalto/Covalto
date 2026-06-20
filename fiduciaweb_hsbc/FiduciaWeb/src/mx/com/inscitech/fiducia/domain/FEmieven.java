package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIEVEN_PK", columns = { "EEVI_ID_PROGRAMA", "EEVI_ID_FIDEICOMISO", "EEVI_ID_EMISION", "EEVI_ID_NUM_EVENTO" }, sequences = { "MANUAL" })
public class FEmieven extends DomainObject {

    BigDecimal eeviIdPrograma = null;
    BigDecimal eeviIdFideicomiso = null;
    BigDecimal eeviIdEmision = null;
    BigDecimal eeviIdNumEvento = null;
    String eeviTextoExtra = null;
    String eeviFecEvento = null;

    public FEmieven() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeviIdPrograma(BigDecimal eeviIdPrograma) {
        this.eeviIdPrograma = eeviIdPrograma;
    }

    public BigDecimal getEeviIdPrograma() {
        return this.eeviIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeviIdFideicomiso(BigDecimal eeviIdFideicomiso) {
        this.eeviIdFideicomiso = eeviIdFideicomiso;
    }

    public BigDecimal getEeviIdFideicomiso() {
        return this.eeviIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeviIdEmision(BigDecimal eeviIdEmision) {
        this.eeviIdEmision = eeviIdEmision;
    }

    public BigDecimal getEeviIdEmision() {
        return this.eeviIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeviIdNumEvento(BigDecimal eeviIdNumEvento) {
        this.eeviIdNumEvento = eeviIdNumEvento;
    }

    public BigDecimal getEeviIdNumEvento() {
        return this.eeviIdNumEvento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeviTextoExtra(String eeviTextoExtra) {
        this.eeviTextoExtra = eeviTextoExtra;
    }

    public String getEeviTextoExtra() {
        return this.eeviTextoExtra;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeviFecEvento(String eeviFecEvento) {
        this.eeviFecEvento = eeviFecEvento;
    }

    public String getEeviFecEvento() {
        return this.eeviFecEvento;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIEVEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeviIdPrograma() != null && this.getEeviIdPrograma().longValue() == -999) {
            conditions += " AND EEVI_ID_PROGRAMA IS NULL";
        } else if (this.getEeviIdPrograma() != null) {
            conditions += " AND EEVI_ID_PROGRAMA = ?";
            values.add(this.getEeviIdPrograma());
        }

        if (this.getEeviIdFideicomiso() != null && this.getEeviIdFideicomiso().longValue() == -999) {
            conditions += " AND EEVI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeviIdFideicomiso() != null) {
            conditions += " AND EEVI_ID_FIDEICOMISO = ?";
            values.add(this.getEeviIdFideicomiso());
        }

        if (this.getEeviIdEmision() != null && this.getEeviIdEmision().longValue() == -999) {
            conditions += " AND EEVI_ID_EMISION IS NULL";
        } else if (this.getEeviIdEmision() != null) {
            conditions += " AND EEVI_ID_EMISION = ?";
            values.add(this.getEeviIdEmision());
        }

        if (this.getEeviIdNumEvento() != null && this.getEeviIdNumEvento().longValue() == -999) {
            conditions += " AND EEVI_ID_NUM_EVENTO IS NULL";
        } else if (this.getEeviIdNumEvento() != null) {
            conditions += " AND EEVI_ID_NUM_EVENTO = ?";
            values.add(this.getEeviIdNumEvento());
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
        String sql = "SELECT * FROM F_EMIEVEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeviIdPrograma() != null && this.getEeviIdPrograma().longValue() == -999) {
            conditions += " AND EEVI_ID_PROGRAMA IS NULL";
        } else if (this.getEeviIdPrograma() != null) {
            conditions += " AND EEVI_ID_PROGRAMA = ?";
            values.add(this.getEeviIdPrograma());
        }

        if (this.getEeviIdFideicomiso() != null && this.getEeviIdFideicomiso().longValue() == -999) {
            conditions += " AND EEVI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeviIdFideicomiso() != null) {
            conditions += " AND EEVI_ID_FIDEICOMISO = ?";
            values.add(this.getEeviIdFideicomiso());
        }

        if (this.getEeviIdEmision() != null && this.getEeviIdEmision().longValue() == -999) {
            conditions += " AND EEVI_ID_EMISION IS NULL";
        } else if (this.getEeviIdEmision() != null) {
            conditions += " AND EEVI_ID_EMISION = ?";
            values.add(this.getEeviIdEmision());
        }

        if (this.getEeviIdNumEvento() != null && this.getEeviIdNumEvento().longValue() == -999) {
            conditions += " AND EEVI_ID_NUM_EVENTO IS NULL";
        } else if (this.getEeviIdNumEvento() != null) {
            conditions += " AND EEVI_ID_NUM_EVENTO = ?";
            values.add(this.getEeviIdNumEvento());
        }

        if (this.getEeviTextoExtra() != null && "null".equals(this.getEeviTextoExtra())) {
            conditions += " AND EEVI_TEXTO_EXTRA IS NULL";
        } else if (this.getEeviTextoExtra() != null) {
            conditions += " AND EEVI_TEXTO_EXTRA = ?";
            values.add(this.getEeviTextoExtra());
        }

        if (this.getEeviFecEvento() != null && "null".equals(this.getEeviFecEvento())) {
            conditions += " AND EEVI_FEC_EVENTO IS NULL";
        } else if (this.getEeviFecEvento() != null) {
            conditions += " AND EEVI_FEC_EVENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeviFecEvento());
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
        String sql = "UPDATE F_EMIEVEN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEVI_ID_PROGRAMA = ?";
        pkValues.add(this.getEeviIdPrograma());
        conditions += " AND EEVI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeviIdFideicomiso());
        conditions += " AND EEVI_ID_EMISION = ?";
        pkValues.add(this.getEeviIdEmision());
        conditions += " AND EEVI_ID_NUM_EVENTO = ?";
        pkValues.add(this.getEeviIdNumEvento());
        fields += " EEVI_TEXTO_EXTRA = ?, ";
        values.add(this.getEeviTextoExtra());
        fields += " EEVI_FEC_EVENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeviFecEvento());
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
        String sql = "INSERT INTO F_EMIEVEN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEVI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeviIdPrograma());

        fields += ", EEVI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeviIdFideicomiso());

        fields += ", EEVI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeviIdEmision());

        fields += ", EEVI_ID_NUM_EVENTO";
        fieldValues += ", ?";
        values.add(this.getEeviIdNumEvento());

        fields += ", EEVI_TEXTO_EXTRA";
        fieldValues += ", ?";
        values.add(this.getEeviTextoExtra());

        fields += ", EEVI_FEC_EVENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeviFecEvento());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIEVEN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEVI_ID_PROGRAMA = ?";
        values.add(this.getEeviIdPrograma());
        conditions += " AND EEVI_ID_FIDEICOMISO = ?";
        values.add(this.getEeviIdFideicomiso());
        conditions += " AND EEVI_ID_EMISION = ?";
        values.add(this.getEeviIdEmision());
        conditions += " AND EEVI_ID_NUM_EVENTO = ?";
        values.add(this.getEeviIdNumEvento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmieven instance = (FEmieven) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeviIdPrograma().equals(instance.getEeviIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeviIdFideicomiso().equals(instance.getEeviIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeviIdEmision().equals(instance.getEeviIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeviIdNumEvento().equals(instance.getEeviIdNumEvento()))
            equalObjects = false;
        if (equalObjects && !this.getEeviTextoExtra().equals(instance.getEeviTextoExtra()))
            equalObjects = false;
        if (equalObjects && !this.getEeviFecEvento().equals(instance.getEeviFecEvento()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmieven result = new FEmieven();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeviIdPrograma((BigDecimal) objectData.getData("EEVI_ID_PROGRAMA"));
        result.setEeviIdFideicomiso((BigDecimal) objectData.getData("EEVI_ID_FIDEICOMISO"));
        result.setEeviIdEmision((BigDecimal) objectData.getData("EEVI_ID_EMISION"));
        result.setEeviIdNumEvento((BigDecimal) objectData.getData("EEVI_ID_NUM_EVENTO"));
        result.setEeviTextoExtra((String) objectData.getData("EEVI_TEXTO_EXTRA"));
        result.setEeviFecEvento((String) objectData.getData("EEVI_FEC_EVENTO"));

        return result;

    }

}
