package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CAT_REV_X_DOC_PK", columns = { "FDOC_ID_DOCUMENTO", "FPUR_ID_PUNTOREV" }, sequences = { "MANUAL" })
public class FCatRevXDoc extends DomainObject {

    BigDecimal fdocIdDocumento = null;
    BigDecimal fpurIdPuntorev = null;

    public FCatRevXDoc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdocIdDocumento(BigDecimal fdocIdDocumento) {
        this.fdocIdDocumento = fdocIdDocumento;
    }

    public BigDecimal getFdocIdDocumento() {
        return this.fdocIdDocumento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpurIdPuntorev(BigDecimal fpurIdPuntorev) {
        this.fpurIdPuntorev = fpurIdPuntorev;
    }

    public BigDecimal getFpurIdPuntorev() {
        return this.fpurIdPuntorev;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CAT_REV_X_DOC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdocIdDocumento() != null && this.getFdocIdDocumento().longValue() == -999) {
            conditions += " AND FDOC_ID_DOCUMENTO IS NULL";
        } else if (this.getFdocIdDocumento() != null) {
            conditions += " AND FDOC_ID_DOCUMENTO = ?";
            values.add(this.getFdocIdDocumento());
        }

        if (this.getFpurIdPuntorev() != null && this.getFpurIdPuntorev().longValue() == -999) {
            conditions += " AND FPUR_ID_PUNTOREV IS NULL";
        } else if (this.getFpurIdPuntorev() != null) {
            conditions += " AND FPUR_ID_PUNTOREV = ?";
            values.add(this.getFpurIdPuntorev());
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
        String sql = "SELECT * FROM F_CAT_REV_X_DOC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdocIdDocumento() != null && this.getFdocIdDocumento().longValue() == -999) {
            conditions += " AND FDOC_ID_DOCUMENTO IS NULL";
        } else if (this.getFdocIdDocumento() != null) {
            conditions += " AND FDOC_ID_DOCUMENTO = ?";
            values.add(this.getFdocIdDocumento());
        }

        if (this.getFpurIdPuntorev() != null && this.getFpurIdPuntorev().longValue() == -999) {
            conditions += " AND FPUR_ID_PUNTOREV IS NULL";
        } else if (this.getFpurIdPuntorev() != null) {
            conditions += " AND FPUR_ID_PUNTOREV = ?";
            values.add(this.getFpurIdPuntorev());
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
        String sql = "UPDATE F_CAT_REV_X_DOC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FDOC_ID_DOCUMENTO = ?";
        pkValues.add(this.getFdocIdDocumento());
        conditions += " AND FPUR_ID_PUNTOREV = ?";
        pkValues.add(this.getFpurIdPuntorev());
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
        String sql = "INSERT INTO F_CAT_REV_X_DOC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FDOC_ID_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getFdocIdDocumento());

        fields += ", FPUR_ID_PUNTOREV";
        fieldValues += ", ?";
        values.add(this.getFpurIdPuntorev());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CAT_REV_X_DOC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FDOC_ID_DOCUMENTO = ?";
        values.add(this.getFdocIdDocumento());
        conditions += " AND FPUR_ID_PUNTOREV = ?";
        values.add(this.getFpurIdPuntorev());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCatRevXDoc instance = (FCatRevXDoc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFdocIdDocumento().equals(instance.getFdocIdDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getFpurIdPuntorev().equals(instance.getFpurIdPuntorev()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCatRevXDoc result = new FCatRevXDoc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFdocIdDocumento((BigDecimal) objectData.getData("FDOC_ID_DOCUMENTO"));
        result.setFpurIdPuntorev((BigDecimal) objectData.getData("FPUR_ID_PUNTOREV"));

        return result;

    }

}
