package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PROGFID_PK", columns = { "EFID_ID_PROGRAMA", "EFID_ID_FIDEICOMISO" }, sequences = { "MANUAL" })
public class FProgfid extends DomainObject {

    BigDecimal efidIdPrograma = null;
    BigDecimal efidIdFideicomiso = null;
    BigDecimal efidInstitucion = null;
    String efidComentario = null;
    String efidStProgfid = null;

    public FProgfid() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfidIdPrograma(BigDecimal efidIdPrograma) {
        this.efidIdPrograma = efidIdPrograma;
    }

    public BigDecimal getEfidIdPrograma() {
        return this.efidIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfidIdFideicomiso(BigDecimal efidIdFideicomiso) {
        this.efidIdFideicomiso = efidIdFideicomiso;
    }

    public BigDecimal getEfidIdFideicomiso() {
        return this.efidIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfidInstitucion(BigDecimal efidInstitucion) {
        this.efidInstitucion = efidInstitucion;
    }

    public BigDecimal getEfidInstitucion() {
        return this.efidInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfidComentario(String efidComentario) {
        this.efidComentario = efidComentario;
    }

    public String getEfidComentario() {
        return this.efidComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfidStProgfid(String efidStProgfid) {
        this.efidStProgfid = efidStProgfid;
    }

    public String getEfidStProgfid() {
        return this.efidStProgfid;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PROGFID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfidIdPrograma() != null && this.getEfidIdPrograma().longValue() == -999) {
            conditions += " AND EFID_ID_PROGRAMA IS NULL";
        } else if (this.getEfidIdPrograma() != null) {
            conditions += " AND EFID_ID_PROGRAMA = ?";
            values.add(this.getEfidIdPrograma());
        }

        if (this.getEfidIdFideicomiso() != null && this.getEfidIdFideicomiso().longValue() == -999) {
            conditions += " AND EFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getEfidIdFideicomiso() != null) {
            conditions += " AND EFID_ID_FIDEICOMISO = ?";
            values.add(this.getEfidIdFideicomiso());
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
        String sql = "SELECT * FROM F_PROGFID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfidIdPrograma() != null && this.getEfidIdPrograma().longValue() == -999) {
            conditions += " AND EFID_ID_PROGRAMA IS NULL";
        } else if (this.getEfidIdPrograma() != null) {
            conditions += " AND EFID_ID_PROGRAMA = ?";
            values.add(this.getEfidIdPrograma());
        }

        if (this.getEfidIdFideicomiso() != null && this.getEfidIdFideicomiso().longValue() == -999) {
            conditions += " AND EFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getEfidIdFideicomiso() != null) {
            conditions += " AND EFID_ID_FIDEICOMISO = ?";
            values.add(this.getEfidIdFideicomiso());
        }

        if (this.getEfidInstitucion() != null && this.getEfidInstitucion().longValue() == -999) {
            conditions += " AND EFID_INSTITUCION IS NULL";
        } else if (this.getEfidInstitucion() != null) {
            conditions += " AND EFID_INSTITUCION = ?";
            values.add(this.getEfidInstitucion());
        }

        if (this.getEfidComentario() != null && "null".equals(this.getEfidComentario())) {
            conditions += " AND EFID_COMENTARIO IS NULL";
        } else if (this.getEfidComentario() != null) {
            conditions += " AND EFID_COMENTARIO = ?";
            values.add(this.getEfidComentario());
        }

        if (this.getEfidStProgfid() != null && "null".equals(this.getEfidStProgfid())) {
            conditions += " AND EFID_ST_PROGFID IS NULL";
        } else if (this.getEfidStProgfid() != null) {
            conditions += " AND EFID_ST_PROGFID = ?";
            values.add(this.getEfidStProgfid());
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
        String sql = "UPDATE F_PROGFID SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFID_ID_PROGRAMA = ?";
        pkValues.add(this.getEfidIdPrograma());
        conditions += " AND EFID_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEfidIdFideicomiso());
        fields += " EFID_INSTITUCION = ?, ";
        values.add(this.getEfidInstitucion());
        fields += " EFID_COMENTARIO = ?, ";
        values.add(this.getEfidComentario());
        fields += " EFID_ST_PROGFID = ?, ";
        values.add(this.getEfidStProgfid());
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
        String sql = "INSERT INTO F_PROGFID ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFID_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEfidIdPrograma());

        fields += ", EFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEfidIdFideicomiso());

        fields += ", EFID_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getEfidInstitucion());

        fields += ", EFID_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEfidComentario());

        fields += ", EFID_ST_PROGFID";
        fieldValues += ", ?";
        values.add(this.getEfidStProgfid());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PROGFID WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFID_ID_PROGRAMA = ?";
        values.add(this.getEfidIdPrograma());
        conditions += " AND EFID_ID_FIDEICOMISO = ?";
        values.add(this.getEfidIdFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FProgfid instance = (FProgfid) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEfidIdPrograma().equals(instance.getEfidIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEfidIdFideicomiso().equals(instance.getEfidIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEfidInstitucion().equals(instance.getEfidInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getEfidComentario().equals(instance.getEfidComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEfidStProgfid().equals(instance.getEfidStProgfid()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FProgfid result = new FProgfid();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEfidIdPrograma((BigDecimal) objectData.getData("EFID_ID_PROGRAMA"));
        result.setEfidIdFideicomiso((BigDecimal) objectData.getData("EFID_ID_FIDEICOMISO"));
        result.setEfidInstitucion((BigDecimal) objectData.getData("EFID_INSTITUCION"));
        result.setEfidComentario((String) objectData.getData("EFID_COMENTARIO"));
        result.setEfidStProgfid((String) objectData.getData("EFID_ST_PROGFID"));

        return result;

    }

}
