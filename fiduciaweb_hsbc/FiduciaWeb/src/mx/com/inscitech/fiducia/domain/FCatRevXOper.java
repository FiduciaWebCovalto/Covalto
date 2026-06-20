package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CAT_REV_X_OPER_PK", columns = { "FTOP_NUM_OPER", "FETA_ID_ETAPA", "FPUR_ID_PUNTOREV" }, sequences = { "MANUAL" })
public class FCatRevXOper extends DomainObject {

    String ftopNumOper = null;
    BigDecimal fetaIdEtapa = null;
    BigDecimal fpurIdPuntorev = null;

    public FCatRevXOper() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtopNumOper(String ftopNumOper) {
        this.ftopNumOper = ftopNumOper;
    }

    public String getFtopNumOper() {
        return this.ftopNumOper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFetaIdEtapa(BigDecimal fetaIdEtapa) {
        this.fetaIdEtapa = fetaIdEtapa;
    }

    public BigDecimal getFetaIdEtapa() {
        return this.fetaIdEtapa;
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
        String sql = "SELECT * FROM F_CAT_REV_X_OPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtopNumOper() != null && "null".equals(this.getFtopNumOper())) {
            conditions += " AND FTOP_NUM_OPER IS NULL";
        } else if (this.getFtopNumOper() != null) {
            conditions += " AND FTOP_NUM_OPER = ?";
            values.add(this.getFtopNumOper());
        }

        if (this.getFetaIdEtapa() != null && this.getFetaIdEtapa().longValue() == -999) {
            conditions += " AND FETA_ID_ETAPA IS NULL";
        } else if (this.getFetaIdEtapa() != null) {
            conditions += " AND FETA_ID_ETAPA = ?";
            values.add(this.getFetaIdEtapa());
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
        String sql = "SELECT * FROM F_CAT_REV_X_OPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtopNumOper() != null && "null".equals(this.getFtopNumOper())) {
            conditions += " AND FTOP_NUM_OPER IS NULL";
        } else if (this.getFtopNumOper() != null) {
            conditions += " AND FTOP_NUM_OPER = ?";
            values.add(this.getFtopNumOper());
        }

        if (this.getFetaIdEtapa() != null && this.getFetaIdEtapa().longValue() == -999) {
            conditions += " AND FETA_ID_ETAPA IS NULL";
        } else if (this.getFetaIdEtapa() != null) {
            conditions += " AND FETA_ID_ETAPA = ?";
            values.add(this.getFetaIdEtapa());
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
        String sql = "UPDATE F_CAT_REV_X_OPER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FTOP_NUM_OPER = ?";
        pkValues.add(this.getFtopNumOper());
        conditions += " AND FETA_ID_ETAPA = ?";
        pkValues.add(this.getFetaIdEtapa());
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
        String sql = "INSERT INTO F_CAT_REV_X_OPER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FTOP_NUM_OPER";
        fieldValues += ", ?";
        values.add(this.getFtopNumOper());

        fields += ", FETA_ID_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFetaIdEtapa());

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
        String sql = "DELETE FROM F_CAT_REV_X_OPER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FTOP_NUM_OPER = ?";
        values.add(this.getFtopNumOper());
        conditions += " AND FETA_ID_ETAPA = ?";
        values.add(this.getFetaIdEtapa());
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
        FCatRevXOper instance = (FCatRevXOper) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFtopNumOper().equals(instance.getFtopNumOper()))
            equalObjects = false;
        if (equalObjects && !this.getFetaIdEtapa().equals(instance.getFetaIdEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getFpurIdPuntorev().equals(instance.getFpurIdPuntorev()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCatRevXOper result = new FCatRevXOper();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFtopNumOper((String) objectData.getData("FTOP_NUM_OPER"));
        result.setFetaIdEtapa((BigDecimal) objectData.getData("FETA_ID_ETAPA"));
        result.setFpurIdPuntorev((BigDecimal) objectData.getData("FPUR_ID_PUNTOREV"));

        return result;

    }

}
