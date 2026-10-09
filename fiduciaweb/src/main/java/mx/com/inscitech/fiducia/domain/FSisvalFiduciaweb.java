package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_SISVAL_FIDUCIAWEB_PK", columns = { "FVFW_ID_OPER_SIS_VAL", "FVFW_ID_OPER_SIS_FW", "FVFW_TIPO_OPER" }, sequences = { "MANUAL" })
public class FSisvalFiduciaweb extends DomainObject {

    String fvfwIdOperSisVal = null;
    String fvfwIdOperSisFw = null;
    String fvfwTipoOper = null;
    BigDecimal fvfwNumOperacion = null;

    public FSisvalFiduciaweb() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setfvfwIdOperSisVal(String fvfwIdOperSisVal) {
        this.fvfwIdOperSisVal = fvfwIdOperSisVal;
    }

    public String getfvfwIdOperSisVal() {
        return this.fvfwIdOperSisVal;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setfvfwIdOperSisFw(String fvfwIdOperSisFw) {
        this.fvfwIdOperSisFw = fvfwIdOperSisFw;
    }

    public String getfvfwIdOperSisFw() {
        return this.fvfwIdOperSisFw;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setfvfwTipoOper(String fvfwTipoOper) {
        this.fvfwTipoOper = fvfwTipoOper;
    }

    public String getfvfwTipoOper() {
        return this.fvfwTipoOper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setfvfwNumOperacion(BigDecimal fvfwNumOperacion) {
        this.fvfwNumOperacion = fvfwNumOperacion;
    }

    public BigDecimal getfvfwNumOperacion() {
        return this.fvfwNumOperacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_SISVAL_FIDUCIAWEB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getfvfwIdOperSisVal() != null && "null".equals(this.getfvfwIdOperSisVal())) {
            conditions += " AND FVFW_ID_OPER_SIS_VAL IS NULL";
        } else if (this.getfvfwIdOperSisVal() != null) {
            conditions += " AND FVFW_ID_OPER_SIS_VAL = ?";
            values.add(this.getfvfwIdOperSisVal());
        }

        if (this.getfvfwIdOperSisFw() != null && "null".equals(this.getfvfwIdOperSisFw())) {
            conditions += " AND FVFW_ID_OPER_SIS_FW IS NULL";
        } else if (this.getfvfwIdOperSisFw() != null) {
            conditions += " AND FVFW_ID_OPER_SIS_FW = ?";
            values.add(this.getfvfwIdOperSisFw());
        }

        if (this.getfvfwTipoOper() != null && "null".equals(this.getfvfwTipoOper())) {
            conditions += " AND FVFW_TIPO_OPER IS NULL";
        } else if (this.getfvfwTipoOper() != null) {
            conditions += " AND FVFW_TIPO_OPER = ?";
            values.add(this.getfvfwTipoOper());
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
        String sql = "SELECT * FROM F_SISVAL_FIDUCIAWEB ";

        String conditions = "";
        ArrayList values = new ArrayList();


        if (this.getfvfwIdOperSisVal() != null && "null".equals(this.getfvfwIdOperSisVal())) {
            conditions += " AND FVFW_ID_OPER_SIS_VAL IS NULL";
        } else if (this.getfvfwIdOperSisVal() != null) {
            conditions += " AND FVFW_ID_OPER_SIS_VAL = ?";
            values.add(this.getfvfwIdOperSisVal());
        }

        if (this.getfvfwIdOperSisFw() != null && "null".equals(this.getfvfwIdOperSisFw())) {
            conditions += " AND FVFW_ID_OPER_SIS_FW IS NULL";
        } else if (this.getfvfwIdOperSisFw() != null) {
            conditions += " AND FVFW_ID_OPER_SIS_FW = ?";
            values.add(this.getfvfwIdOperSisFw());
        }

        if (this.getfvfwTipoOper() != null && "null".equals(this.getfvfwTipoOper())) {
            conditions += " AND FVFW_TIPO_OPER IS NULL";
        } else if (this.getfvfwTipoOper() != null) {
            conditions += " AND FVFW_TIPO_OPER = ?";
            values.add(this.getfvfwTipoOper());
        }

        if (this.getfvfwNumOperacion() != null && this.getfvfwNumOperacion().longValue() == -999) {
            conditions += " AND FVFW_NUM_OPERACION IS NULL";
        } else if (this.getfvfwNumOperacion() != null) {
            conditions += " AND FVFW_NUM_OPERACION = ?";
            values.add(this.getfvfwNumOperacion());
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
        String sql = "UPDATE F_SISVAL_FIDUCIAWEB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " FVFW_ID_OPER_SIS_VAL = ?";
        pkValues.add(this.getfvfwIdOperSisVal());
        conditions += " AND FVFW_ID_OPER_SIS_FW = ?";
        pkValues.add(this.getfvfwIdOperSisFw());
        conditions += " AND FVFW_TIPO_OPER = ?";
        pkValues.add(this.getfvfwTipoOper());
        fields += " FVFW_NUM_OPERACION = ?, ";
        values.add(this.getfvfwNumOperacion());
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
        String sql = "INSERT INTO F_SISVAL_FIDUCIAWEB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FVFW_ID_OPER_SIS_VAL";
        fieldValues += ", ?";
        values.add(this.getfvfwIdOperSisVal());

        fields += ", FVFW_ID_OPER_SIS_FW";
        fieldValues += ", ?";
        values.add(this.getfvfwIdOperSisFw());

        fields += ", FVFW_TIPO_OPER";
        fieldValues += ", ?";
        values.add(this.getfvfwTipoOper());

        fields += ", FVFW_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getfvfwNumOperacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_SISVAL_FIDUCIAWEB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FVFW_ID_OPER_SIS_VAL = ?";
        values.add(this.getfvfwIdOperSisVal());
        conditions += " AND FVFW_ID_OPER_SIS_FW  = ?";
        values.add(this.getfvfwIdOperSisFw());
        conditions += " AND FVFW_TIPO_OPER  = ?";
        values.add(this.getfvfwTipoOper());
        conditions += " AND FVFW_NUM_OPERACION  = ?";
        values.add(this.getfvfwNumOperacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FSisvalFiduciaweb instance = (FSisvalFiduciaweb) compareWith;
        boolean equalObjects = true;

        if (equalObjects && !this.getfvfwIdOperSisVal().equals(instance.getfvfwIdOperSisVal()))
            equalObjects = false;
        if (equalObjects && !this.getfvfwIdOperSisFw().equals(instance.getfvfwIdOperSisFw()))
            equalObjects = false;
        if (equalObjects && !this.getfvfwTipoOper().equals(instance.getfvfwTipoOper()))
            equalObjects = false;
        if (equalObjects && !this.getfvfwNumOperacion().equals(instance.getfvfwNumOperacion()))
            equalObjects = false;

        return equalObjects;
    }

    public Object selectAsObject() {
        FSisvalFiduciaweb result = new FSisvalFiduciaweb();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setfvfwIdOperSisVal((String) objectData.getData("FVFW_ID_OPER_SIS_VAL"));
        result.setfvfwIdOperSisFw((String) objectData.getData("FVFW_ID_OPER_SIS_FW"));
        result.setfvfwTipoOper((String) objectData.getData("FVFW_TIPO_OPER"));
        result.setfvfwNumOperacion((BigDecimal) objectData.getData("FVFW_NUM_OPERACION"));

        return result;

    }

}
