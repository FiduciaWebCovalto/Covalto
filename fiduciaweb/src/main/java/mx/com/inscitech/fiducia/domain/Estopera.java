package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTOPERA_PK", columns = { "EOP_NUM_SEC_OPERA", "EOP_NUM_OPERACION" }, sequences = { "MANUAL" })
public class Estopera extends DomainObject {

    BigDecimal eopNumOperacion = null;
    BigDecimal eopNumSecOpera = null;
    BigDecimal eopNumModulo = null;
    BigDecimal eopNumTransac = null;
    BigDecimal eopDiaEjecucion = null;
    BigDecimal eopAnoAltaReg = null;
    BigDecimal eopMesAltaReg = null;
    BigDecimal eopDiaAltaReg = null;
    BigDecimal eopAnoUltMod = null;
    BigDecimal eopMesUltMod = null;
    BigDecimal eopDiaUltMod = null;
    String eopCveStEstoper = null;

    public Estopera() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEopNumOperacion(BigDecimal eopNumOperacion) {
        this.eopNumOperacion = eopNumOperacion;
    }

    public BigDecimal getEopNumOperacion() {
        return this.eopNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEopNumSecOpera(BigDecimal eopNumSecOpera) {
        this.eopNumSecOpera = eopNumSecOpera;
    }

    public BigDecimal getEopNumSecOpera() {
        return this.eopNumSecOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEopNumModulo(BigDecimal eopNumModulo) {
        this.eopNumModulo = eopNumModulo;
    }

    public BigDecimal getEopNumModulo() {
        return this.eopNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEopNumTransac(BigDecimal eopNumTransac) {
        this.eopNumTransac = eopNumTransac;
    }

    public BigDecimal getEopNumTransac() {
        return this.eopNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEopDiaEjecucion(BigDecimal eopDiaEjecucion) {
        this.eopDiaEjecucion = eopDiaEjecucion;
    }

    public BigDecimal getEopDiaEjecucion() {
        return this.eopDiaEjecucion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEopAnoAltaReg(BigDecimal eopAnoAltaReg) {
        this.eopAnoAltaReg = eopAnoAltaReg;
    }

    public BigDecimal getEopAnoAltaReg() {
        return this.eopAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEopMesAltaReg(BigDecimal eopMesAltaReg) {
        this.eopMesAltaReg = eopMesAltaReg;
    }

    public BigDecimal getEopMesAltaReg() {
        return this.eopMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEopDiaAltaReg(BigDecimal eopDiaAltaReg) {
        this.eopDiaAltaReg = eopDiaAltaReg;
    }

    public BigDecimal getEopDiaAltaReg() {
        return this.eopDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEopAnoUltMod(BigDecimal eopAnoUltMod) {
        this.eopAnoUltMod = eopAnoUltMod;
    }

    public BigDecimal getEopAnoUltMod() {
        return this.eopAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEopMesUltMod(BigDecimal eopMesUltMod) {
        this.eopMesUltMod = eopMesUltMod;
    }

    public BigDecimal getEopMesUltMod() {
        return this.eopMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEopDiaUltMod(BigDecimal eopDiaUltMod) {
        this.eopDiaUltMod = eopDiaUltMod;
    }

    public BigDecimal getEopDiaUltMod() {
        return this.eopDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEopCveStEstoper(String eopCveStEstoper) {
        this.eopCveStEstoper = eopCveStEstoper;
    }

    public String getEopCveStEstoper() {
        return this.eopCveStEstoper;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTOPERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEopNumOperacion() != null && this.getEopNumOperacion().longValue() == -999) {
            conditions += " AND EOP_NUM_OPERACION IS NULL";
        } else if (this.getEopNumOperacion() != null) {
            conditions += " AND EOP_NUM_OPERACION = ?";
            values.add(this.getEopNumOperacion());
        }

        if (this.getEopNumSecOpera() != null && this.getEopNumSecOpera().longValue() == -999) {
            conditions += " AND EOP_NUM_SEC_OPERA IS NULL";
        } else if (this.getEopNumSecOpera() != null) {
            conditions += " AND EOP_NUM_SEC_OPERA = ?";
            values.add(this.getEopNumSecOpera());
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
        String sql = "SELECT * FROM ESTOPERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEopNumOperacion() != null && this.getEopNumOperacion().longValue() == -999) {
            conditions += " AND EOP_NUM_OPERACION IS NULL";
        } else if (this.getEopNumOperacion() != null) {
            conditions += " AND EOP_NUM_OPERACION = ?";
            values.add(this.getEopNumOperacion());
        }

        if (this.getEopNumSecOpera() != null && this.getEopNumSecOpera().longValue() == -999) {
            conditions += " AND EOP_NUM_SEC_OPERA IS NULL";
        } else if (this.getEopNumSecOpera() != null) {
            conditions += " AND EOP_NUM_SEC_OPERA = ?";
            values.add(this.getEopNumSecOpera());
        }

        if (this.getEopNumModulo() != null && this.getEopNumModulo().longValue() == -999) {
            conditions += " AND EOP_NUM_MODULO IS NULL";
        } else if (this.getEopNumModulo() != null) {
            conditions += " AND EOP_NUM_MODULO = ?";
            values.add(this.getEopNumModulo());
        }

        if (this.getEopNumTransac() != null && this.getEopNumTransac().longValue() == -999) {
            conditions += " AND EOP_NUM_TRANSAC IS NULL";
        } else if (this.getEopNumTransac() != null) {
            conditions += " AND EOP_NUM_TRANSAC = ?";
            values.add(this.getEopNumTransac());
        }

        if (this.getEopDiaEjecucion() != null && this.getEopDiaEjecucion().longValue() == -999) {
            conditions += " AND EOP_DIA_EJECUCION IS NULL";
        } else if (this.getEopDiaEjecucion() != null) {
            conditions += " AND EOP_DIA_EJECUCION = ?";
            values.add(this.getEopDiaEjecucion());
        }

        if (this.getEopAnoAltaReg() != null && this.getEopAnoAltaReg().longValue() == -999) {
            conditions += " AND EOP_ANO_ALTA_REG IS NULL";
        } else if (this.getEopAnoAltaReg() != null) {
            conditions += " AND EOP_ANO_ALTA_REG = ?";
            values.add(this.getEopAnoAltaReg());
        }

        if (this.getEopMesAltaReg() != null && this.getEopMesAltaReg().longValue() == -999) {
            conditions += " AND EOP_MES_ALTA_REG IS NULL";
        } else if (this.getEopMesAltaReg() != null) {
            conditions += " AND EOP_MES_ALTA_REG = ?";
            values.add(this.getEopMesAltaReg());
        }

        if (this.getEopDiaAltaReg() != null && this.getEopDiaAltaReg().longValue() == -999) {
            conditions += " AND EOP_DIA_ALTA_REG IS NULL";
        } else if (this.getEopDiaAltaReg() != null) {
            conditions += " AND EOP_DIA_ALTA_REG = ?";
            values.add(this.getEopDiaAltaReg());
        }

        if (this.getEopAnoUltMod() != null && this.getEopAnoUltMod().longValue() == -999) {
            conditions += " AND EOP_ANO_ULT_MOD IS NULL";
        } else if (this.getEopAnoUltMod() != null) {
            conditions += " AND EOP_ANO_ULT_MOD = ?";
            values.add(this.getEopAnoUltMod());
        }

        if (this.getEopMesUltMod() != null && this.getEopMesUltMod().longValue() == -999) {
            conditions += " AND EOP_MES_ULT_MOD IS NULL";
        } else if (this.getEopMesUltMod() != null) {
            conditions += " AND EOP_MES_ULT_MOD = ?";
            values.add(this.getEopMesUltMod());
        }

        if (this.getEopDiaUltMod() != null && this.getEopDiaUltMod().longValue() == -999) {
            conditions += " AND EOP_DIA_ULT_MOD IS NULL";
        } else if (this.getEopDiaUltMod() != null) {
            conditions += " AND EOP_DIA_ULT_MOD = ?";
            values.add(this.getEopDiaUltMod());
        }

        if (this.getEopCveStEstoper() != null && "null".equals(this.getEopCveStEstoper())) {
            conditions += " AND EOP_CVE_ST_ESTOPER IS NULL";
        } else if (this.getEopCveStEstoper() != null) {
            conditions += " AND EOP_CVE_ST_ESTOPER = ?";
            values.add(this.getEopCveStEstoper());
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
        String sql = "UPDATE ESTOPERA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EOP_NUM_OPERACION = ?";
        pkValues.add(this.getEopNumOperacion());
        conditions += " AND EOP_NUM_SEC_OPERA = ?";
        pkValues.add(this.getEopNumSecOpera());
        fields += " EOP_NUM_MODULO = ?, ";
        values.add(this.getEopNumModulo());
        fields += " EOP_NUM_TRANSAC = ?, ";
        values.add(this.getEopNumTransac());
        fields += " EOP_DIA_EJECUCION = ?, ";
        values.add(this.getEopDiaEjecucion());
        fields += " EOP_ANO_ALTA_REG = ?, ";
        values.add(this.getEopAnoAltaReg());
        fields += " EOP_MES_ALTA_REG = ?, ";
        values.add(this.getEopMesAltaReg());
        fields += " EOP_DIA_ALTA_REG = ?, ";
        values.add(this.getEopDiaAltaReg());
        fields += " EOP_ANO_ULT_MOD = ?, ";
        values.add(this.getEopAnoUltMod());
        fields += " EOP_MES_ULT_MOD = ?, ";
        values.add(this.getEopMesUltMod());
        fields += " EOP_DIA_ULT_MOD = ?, ";
        values.add(this.getEopDiaUltMod());
        fields += " EOP_CVE_ST_ESTOPER = ?, ";
        values.add(this.getEopCveStEstoper());
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
        String sql = "INSERT INTO ESTOPERA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EOP_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getEopNumOperacion());

        fields += ", EOP_NUM_SEC_OPERA";
        fieldValues += ", ?";
        values.add(this.getEopNumSecOpera());

        fields += ", EOP_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getEopNumModulo());

        fields += ", EOP_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getEopNumTransac());

        fields += ", EOP_DIA_EJECUCION";
        fieldValues += ", ?";
        values.add(this.getEopDiaEjecucion());

        fields += ", EOP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEopAnoAltaReg());

        fields += ", EOP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEopMesAltaReg());

        fields += ", EOP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEopDiaAltaReg());

        fields += ", EOP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEopAnoUltMod());

        fields += ", EOP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEopMesUltMod());

        fields += ", EOP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEopDiaUltMod());

        fields += ", EOP_CVE_ST_ESTOPER";
        fieldValues += ", ?";
        values.add(this.getEopCveStEstoper());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTOPERA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EOP_NUM_OPERACION = ?";
        values.add(this.getEopNumOperacion());
        conditions += " AND EOP_NUM_SEC_OPERA = ?";
        values.add(this.getEopNumSecOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estopera instance = (Estopera) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEopNumOperacion().equals(instance.getEopNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getEopNumSecOpera().equals(instance.getEopNumSecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getEopNumModulo().equals(instance.getEopNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getEopNumTransac().equals(instance.getEopNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getEopDiaEjecucion().equals(instance.getEopDiaEjecucion()))
            equalObjects = false;
        if (equalObjects && !this.getEopAnoAltaReg().equals(instance.getEopAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEopMesAltaReg().equals(instance.getEopMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEopDiaAltaReg().equals(instance.getEopDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEopAnoUltMod().equals(instance.getEopAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEopMesUltMod().equals(instance.getEopMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEopDiaUltMod().equals(instance.getEopDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEopCveStEstoper().equals(instance.getEopCveStEstoper()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estopera result = new Estopera();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEopNumOperacion((BigDecimal) objectData.getData("EOP_NUM_OPERACION"));
        result.setEopNumSecOpera((BigDecimal) objectData.getData("EOP_NUM_SEC_OPERA"));
        result.setEopNumModulo((BigDecimal) objectData.getData("EOP_NUM_MODULO"));
        result.setEopNumTransac((BigDecimal) objectData.getData("EOP_NUM_TRANSAC"));
        result.setEopDiaEjecucion((BigDecimal) objectData.getData("EOP_DIA_EJECUCION"));
        result.setEopAnoAltaReg((BigDecimal) objectData.getData("EOP_ANO_ALTA_REG"));
        result.setEopMesAltaReg((BigDecimal) objectData.getData("EOP_MES_ALTA_REG"));
        result.setEopDiaAltaReg((BigDecimal) objectData.getData("EOP_DIA_ALTA_REG"));
        result.setEopAnoUltMod((BigDecimal) objectData.getData("EOP_ANO_ULT_MOD"));
        result.setEopMesUltMod((BigDecimal) objectData.getData("EOP_MES_ULT_MOD"));
        result.setEopDiaUltMod((BigDecimal) objectData.getData("EOP_DIA_ULT_MOD"));
        result.setEopCveStEstoper((String) objectData.getData("EOP_CVE_ST_ESTOPER"));

        return result;

    }

}
