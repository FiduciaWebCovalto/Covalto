package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTACU_PK", columns = { "EST_IDENTIFICADOR" }, sequences = { "MAX" })
public class Estacu extends DomainObject {

    BigDecimal estIdentificador = null;
    String estDescripcion = null;
    BigDecimal estAnoAltaReg = null;
    BigDecimal estMesAltaReg = null;
    BigDecimal estDiaAltaReg = null;
    BigDecimal estAnoUltMod = null;
    BigDecimal estMesUltMod = null;
    BigDecimal estDiaUltMod = null;

    public Estacu() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstIdentificador(BigDecimal estIdentificador) {
        this.estIdentificador = estIdentificador;
    }

    public BigDecimal getEstIdentificador() {
        return this.estIdentificador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstDescripcion(String estDescripcion) {
        this.estDescripcion = estDescripcion;
    }

    public String getEstDescripcion() {
        return this.estDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstAnoAltaReg(BigDecimal estAnoAltaReg) {
        this.estAnoAltaReg = estAnoAltaReg;
    }

    public BigDecimal getEstAnoAltaReg() {
        return this.estAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstMesAltaReg(BigDecimal estMesAltaReg) {
        this.estMesAltaReg = estMesAltaReg;
    }

    public BigDecimal getEstMesAltaReg() {
        return this.estMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstDiaAltaReg(BigDecimal estDiaAltaReg) {
        this.estDiaAltaReg = estDiaAltaReg;
    }

    public BigDecimal getEstDiaAltaReg() {
        return this.estDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstAnoUltMod(BigDecimal estAnoUltMod) {
        this.estAnoUltMod = estAnoUltMod;
    }

    public BigDecimal getEstAnoUltMod() {
        return this.estAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstMesUltMod(BigDecimal estMesUltMod) {
        this.estMesUltMod = estMesUltMod;
    }

    public BigDecimal getEstMesUltMod() {
        return this.estMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstDiaUltMod(BigDecimal estDiaUltMod) {
        this.estDiaUltMod = estDiaUltMod;
    }

    public BigDecimal getEstDiaUltMod() {
        return this.estDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTACU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstIdentificador() != null && this.getEstIdentificador().longValue() == -999) {
            conditions += " AND EST_IDENTIFICADOR IS NULL";
        } else if (this.getEstIdentificador() != null) {
            conditions += " AND EST_IDENTIFICADOR = ?";
            values.add(this.getEstIdentificador());
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
        String sql = "SELECT * FROM ESTACU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstIdentificador() != null && this.getEstIdentificador().longValue() == -999) {
            conditions += " AND EST_IDENTIFICADOR IS NULL";
        } else if (this.getEstIdentificador() != null) {
            conditions += " AND EST_IDENTIFICADOR = ?";
            values.add(this.getEstIdentificador());
        }

        if (this.getEstDescripcion() != null && "null".equals(this.getEstDescripcion())) {
            conditions += " AND EST_DESCRIPCION IS NULL";
        } else if (this.getEstDescripcion() != null) {
            conditions += " AND EST_DESCRIPCION = ?";
            values.add(this.getEstDescripcion());
        }

        if (this.getEstAnoAltaReg() != null && this.getEstAnoAltaReg().longValue() == -999) {
            conditions += " AND EST_ANO_ALTA_REG IS NULL";
        } else if (this.getEstAnoAltaReg() != null) {
            conditions += " AND EST_ANO_ALTA_REG = ?";
            values.add(this.getEstAnoAltaReg());
        }

        if (this.getEstMesAltaReg() != null && this.getEstMesAltaReg().longValue() == -999) {
            conditions += " AND EST_MES_ALTA_REG IS NULL";
        } else if (this.getEstMesAltaReg() != null) {
            conditions += " AND EST_MES_ALTA_REG = ?";
            values.add(this.getEstMesAltaReg());
        }

        if (this.getEstDiaAltaReg() != null && this.getEstDiaAltaReg().longValue() == -999) {
            conditions += " AND EST_DIA_ALTA_REG IS NULL";
        } else if (this.getEstDiaAltaReg() != null) {
            conditions += " AND EST_DIA_ALTA_REG = ?";
            values.add(this.getEstDiaAltaReg());
        }

        if (this.getEstAnoUltMod() != null && this.getEstAnoUltMod().longValue() == -999) {
            conditions += " AND EST_ANO_ULT_MOD IS NULL";
        } else if (this.getEstAnoUltMod() != null) {
            conditions += " AND EST_ANO_ULT_MOD = ?";
            values.add(this.getEstAnoUltMod());
        }

        if (this.getEstMesUltMod() != null && this.getEstMesUltMod().longValue() == -999) {
            conditions += " AND EST_MES_ULT_MOD IS NULL";
        } else if (this.getEstMesUltMod() != null) {
            conditions += " AND EST_MES_ULT_MOD = ?";
            values.add(this.getEstMesUltMod());
        }

        if (this.getEstDiaUltMod() != null && this.getEstDiaUltMod().longValue() == -999) {
            conditions += " AND EST_DIA_ULT_MOD IS NULL";
        } else if (this.getEstDiaUltMod() != null) {
            conditions += " AND EST_DIA_ULT_MOD = ?";
            values.add(this.getEstDiaUltMod());
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
        String sql = "UPDATE ESTACU SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EST_IDENTIFICADOR = ?";
        pkValues.add(this.getEstIdentificador());
        fields += " EST_DESCRIPCION = ?, ";
        values.add(this.getEstDescripcion());
        fields += " EST_ANO_ALTA_REG = ?, ";
        values.add(this.getEstAnoAltaReg());
        fields += " EST_MES_ALTA_REG = ?, ";
        values.add(this.getEstMesAltaReg());
        fields += " EST_DIA_ALTA_REG = ?, ";
        values.add(this.getEstDiaAltaReg());
        fields += " EST_ANO_ULT_MOD = ?, ";
        values.add(this.getEstAnoUltMod());
        fields += " EST_MES_ULT_MOD = ?, ";
        values.add(this.getEstMesUltMod());
        fields += " EST_DIA_ULT_MOD = ?, ";
        values.add(this.getEstDiaUltMod());
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
        String sql = "INSERT INTO ESTACU ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EST_IDENTIFICADOR";
        fieldValues += ", ?";
        values.add(this.getEstIdentificador());

        fields += ", EST_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEstDescripcion());

        fields += ", EST_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstAnoAltaReg());

        fields += ", EST_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstMesAltaReg());

        fields += ", EST_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstDiaAltaReg());

        fields += ", EST_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstAnoUltMod());

        fields += ", EST_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstMesUltMod());

        fields += ", EST_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTACU WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EST_IDENTIFICADOR = ?";
        values.add(this.getEstIdentificador());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estacu instance = (Estacu) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstIdentificador().equals(instance.getEstIdentificador()))
            equalObjects = false;
        if (equalObjects && !this.getEstDescripcion().equals(instance.getEstDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getEstAnoAltaReg().equals(instance.getEstAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstMesAltaReg().equals(instance.getEstMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstDiaAltaReg().equals(instance.getEstDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstAnoUltMod().equals(instance.getEstAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstMesUltMod().equals(instance.getEstMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstDiaUltMod().equals(instance.getEstDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estacu result = new Estacu();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstIdentificador((BigDecimal) objectData.getData("EST_IDENTIFICADOR"));
        result.setEstDescripcion((String) objectData.getData("EST_DESCRIPCION"));
        result.setEstAnoAltaReg((BigDecimal) objectData.getData("EST_ANO_ALTA_REG"));
        result.setEstMesAltaReg((BigDecimal) objectData.getData("EST_MES_ALTA_REG"));
        result.setEstDiaAltaReg((BigDecimal) objectData.getData("EST_DIA_ALTA_REG"));
        result.setEstAnoUltMod((BigDecimal) objectData.getData("EST_ANO_ULT_MOD"));
        result.setEstMesUltMod((BigDecimal) objectData.getData("EST_MES_ULT_MOD"));
        result.setEstDiaUltMod((BigDecimal) objectData.getData("EST_DIA_ULT_MOD"));

        return result;

    }

}
