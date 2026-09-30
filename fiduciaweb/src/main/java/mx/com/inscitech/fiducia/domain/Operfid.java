package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPERFID_PK", columns = { "OPF_NUM_OPERACION" }, sequences = { "MAX" })
public class Operfid extends DomainObject {

    BigDecimal opfNumOperacion = null;
    String opfDescripcion = null;
    BigDecimal opfTipoOperacion = null;

    public Operfid() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpfNumOperacion(BigDecimal opfNumOperacion) {
        this.opfNumOperacion = opfNumOperacion;
    }

    public BigDecimal getOpfNumOperacion() {
        return this.opfNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOpfDescripcion(String opfDescripcion) {
        this.opfDescripcion = opfDescripcion;
    }

    public String getOpfDescripcion() {
        return this.opfDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpfTipoOperacion(BigDecimal opfTipoOperacion) {
        this.opfTipoOperacion = opfTipoOperacion;
    }

    public BigDecimal getOpfTipoOperacion() {
        return this.opfTipoOperacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPERFID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOpfNumOperacion() != null && this.getOpfNumOperacion().longValue() == -999) {
            conditions += " AND OPF_NUM_OPERACION IS NULL";
        } else if (this.getOpfNumOperacion() != null) {
            conditions += " AND OPF_NUM_OPERACION = ?";
            values.add(this.getOpfNumOperacion());
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
        String sql = "SELECT * FROM OPERFID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOpfNumOperacion() != null && this.getOpfNumOperacion().longValue() == -999) {
            conditions += " AND OPF_NUM_OPERACION IS NULL";
        } else if (this.getOpfNumOperacion() != null) {
            conditions += " AND OPF_NUM_OPERACION = ?";
            values.add(this.getOpfNumOperacion());
        }

        if (this.getOpfDescripcion() != null && "null".equals(this.getOpfDescripcion())) {
            conditions += " AND OPF_DESCRIPCION IS NULL";
        } else if (this.getOpfDescripcion() != null) {
            conditions += " AND OPF_DESCRIPCION = ?";
            values.add(this.getOpfDescripcion());
        }

        if (this.getOpfTipoOperacion() != null && this.getOpfTipoOperacion().longValue() == -999) {
            conditions += " AND OPF_TIPO_OPERACION IS NULL";
        } else if (this.getOpfTipoOperacion() != null) {
            conditions += " AND OPF_TIPO_OPERACION = ?";
            values.add(this.getOpfTipoOperacion());
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
        String sql = "UPDATE OPERFID SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OPF_NUM_OPERACION = ?";
        pkValues.add(this.getOpfNumOperacion());
        fields += " OPF_DESCRIPCION = ?, ";
        values.add(this.getOpfDescripcion());
        fields += " OPF_TIPO_OPERACION = ?, ";
        values.add(this.getOpfTipoOperacion());
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
        String sql = "INSERT INTO OPERFID ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OPF_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOpfNumOperacion());

        fields += ", OPF_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getOpfDescripcion());

        fields += ", OPF_TIPO_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOpfTipoOperacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPERFID WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OPF_NUM_OPERACION = ?";
        values.add(this.getOpfNumOperacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Operfid instance = (Operfid) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOpfNumOperacion().equals(instance.getOpfNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getOpfDescripcion().equals(instance.getOpfDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getOpfTipoOperacion().equals(instance.getOpfTipoOperacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Operfid result = new Operfid();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOpfNumOperacion((BigDecimal) objectData.getData("OPF_NUM_OPERACION"));
        result.setOpfDescripcion((String) objectData.getData("OPF_DESCRIPCION"));
        result.setOpfTipoOperacion((BigDecimal) objectData.getData("OPF_TIPO_OPERACION"));

        return result;

    }

}
