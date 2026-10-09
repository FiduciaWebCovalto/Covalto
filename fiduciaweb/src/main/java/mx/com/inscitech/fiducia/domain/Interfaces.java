package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INTERFACES_PK", columns = { "INT_SECUENCIA" }, sequences = { "MAX" })
public class Interfaces extends DomainObject {

    BigDecimal intSecuencia = null;
    String intReferencia = null;
    String intEntSal = null;
    BigDecimal intActiva = null;
    String intPassword = null;
    String intAtributo1 = null;
    String intAtributo2 = null;
    String intAtributo3 = null;
    String intAtributo4 = null;
    String intAtributo5 = null;
    String intAtributo6 = null;
    String intDescripcion = null;
    BigDecimal intAnoAltaReg = null;
    BigDecimal intMesAltaReg = null;
    BigDecimal intDiaAltaReg = null;
    BigDecimal intAnoUltMod = null;
    BigDecimal intMesUltMod = null;
    BigDecimal intDiaUltMod = null;
    String intCveStInterfaces = null;

    public Interfaces() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntSecuencia(BigDecimal intSecuencia) {
        this.intSecuencia = intSecuencia;
    }

    public BigDecimal getIntSecuencia() {
        return this.intSecuencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntReferencia(String intReferencia) {
        this.intReferencia = intReferencia;
    }

    public String getIntReferencia() {
        return this.intReferencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntEntSal(String intEntSal) {
        this.intEntSal = intEntSal;
    }

    public String getIntEntSal() {
        return this.intEntSal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntActiva(BigDecimal intActiva) {
        this.intActiva = intActiva;
    }

    public BigDecimal getIntActiva() {
        return this.intActiva;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntPassword(String intPassword) {
        this.intPassword = intPassword;
    }

    public String getIntPassword() {
        return this.intPassword;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntAtributo1(String intAtributo1) {
        this.intAtributo1 = intAtributo1;
    }

    public String getIntAtributo1() {
        return this.intAtributo1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntAtributo2(String intAtributo2) {
        this.intAtributo2 = intAtributo2;
    }

    public String getIntAtributo2() {
        return this.intAtributo2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntAtributo3(String intAtributo3) {
        this.intAtributo3 = intAtributo3;
    }

    public String getIntAtributo3() {
        return this.intAtributo3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntAtributo4(String intAtributo4) {
        this.intAtributo4 = intAtributo4;
    }

    public String getIntAtributo4() {
        return this.intAtributo4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntAtributo5(String intAtributo5) {
        this.intAtributo5 = intAtributo5;
    }

    public String getIntAtributo5() {
        return this.intAtributo5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntAtributo6(String intAtributo6) {
        this.intAtributo6 = intAtributo6;
    }

    public String getIntAtributo6() {
        return this.intAtributo6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntDescripcion(String intDescripcion) {
        this.intDescripcion = intDescripcion;
    }

    public String getIntDescripcion() {
        return this.intDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIntAnoAltaReg(BigDecimal intAnoAltaReg) {
        this.intAnoAltaReg = intAnoAltaReg;
    }

    public BigDecimal getIntAnoAltaReg() {
        return this.intAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntMesAltaReg(BigDecimal intMesAltaReg) {
        this.intMesAltaReg = intMesAltaReg;
    }

    public BigDecimal getIntMesAltaReg() {
        return this.intMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntDiaAltaReg(BigDecimal intDiaAltaReg) {
        this.intDiaAltaReg = intDiaAltaReg;
    }

    public BigDecimal getIntDiaAltaReg() {
        return this.intDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIntAnoUltMod(BigDecimal intAnoUltMod) {
        this.intAnoUltMod = intAnoUltMod;
    }

    public BigDecimal getIntAnoUltMod() {
        return this.intAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntMesUltMod(BigDecimal intMesUltMod) {
        this.intMesUltMod = intMesUltMod;
    }

    public BigDecimal getIntMesUltMod() {
        return this.intMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntDiaUltMod(BigDecimal intDiaUltMod) {
        this.intDiaUltMod = intDiaUltMod;
    }

    public BigDecimal getIntDiaUltMod() {
        return this.intDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntCveStInterfaces(String intCveStInterfaces) {
        this.intCveStInterfaces = intCveStInterfaces;
    }

    public String getIntCveStInterfaces() {
        return this.intCveStInterfaces;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INTERFACES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIntSecuencia() != null && this.getIntSecuencia().longValue() == -999) {
            conditions += " AND INT_SECUENCIA IS NULL";
        } else if (this.getIntSecuencia() != null) {
            conditions += " AND INT_SECUENCIA = ?";
            values.add(this.getIntSecuencia());
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
        String sql = "SELECT * FROM INTERFACES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIntSecuencia() != null && this.getIntSecuencia().longValue() == -999) {
            conditions += " AND INT_SECUENCIA IS NULL";
        } else if (this.getIntSecuencia() != null) {
            conditions += " AND INT_SECUENCIA = ?";
            values.add(this.getIntSecuencia());
        }

        if (this.getIntReferencia() != null && "null".equals(this.getIntReferencia())) {
            conditions += " AND INT_REFERENCIA IS NULL";
        } else if (this.getIntReferencia() != null) {
            conditions += " AND INT_REFERENCIA = ?";
            values.add(this.getIntReferencia());
        }

        if (this.getIntEntSal() != null && "null".equals(this.getIntEntSal())) {
            conditions += " AND INT_ENT_SAL IS NULL";
        } else if (this.getIntEntSal() != null) {
            conditions += " AND INT_ENT_SAL = ?";
            values.add(this.getIntEntSal());
        }

        if (this.getIntActiva() != null && this.getIntActiva().longValue() == -999) {
            conditions += " AND INT_ACTIVA IS NULL";
        } else if (this.getIntActiva() != null) {
            conditions += " AND INT_ACTIVA = ?";
            values.add(this.getIntActiva());
        }

        if (this.getIntPassword() != null && "null".equals(this.getIntPassword())) {
            conditions += " AND INT_PASSWORD IS NULL";
        } else if (this.getIntPassword() != null) {
            conditions += " AND INT_PASSWORD = ?";
            values.add(this.getIntPassword());
        }

        if (this.getIntAtributo1() != null && "null".equals(this.getIntAtributo1())) {
            conditions += " AND INT_ATRIBUTO1 IS NULL";
        } else if (this.getIntAtributo1() != null) {
            conditions += " AND INT_ATRIBUTO1 = ?";
            values.add(this.getIntAtributo1());
        }

        if (this.getIntAtributo2() != null && "null".equals(this.getIntAtributo2())) {
            conditions += " AND INT_ATRIBUTO2 IS NULL";
        } else if (this.getIntAtributo2() != null) {
            conditions += " AND INT_ATRIBUTO2 = ?";
            values.add(this.getIntAtributo2());
        }

        if (this.getIntAtributo3() != null && "null".equals(this.getIntAtributo3())) {
            conditions += " AND INT_ATRIBUTO3 IS NULL";
        } else if (this.getIntAtributo3() != null) {
            conditions += " AND INT_ATRIBUTO3 = ?";
            values.add(this.getIntAtributo3());
        }

        if (this.getIntAtributo4() != null && "null".equals(this.getIntAtributo4())) {
            conditions += " AND INT_ATRIBUTO4 IS NULL";
        } else if (this.getIntAtributo4() != null) {
            conditions += " AND INT_ATRIBUTO4 = ?";
            values.add(this.getIntAtributo4());
        }

        if (this.getIntAtributo5() != null && "null".equals(this.getIntAtributo5())) {
            conditions += " AND INT_ATRIBUTO5 IS NULL";
        } else if (this.getIntAtributo5() != null) {
            conditions += " AND INT_ATRIBUTO5 = ?";
            values.add(this.getIntAtributo5());
        }

        if (this.getIntAtributo6() != null && "null".equals(this.getIntAtributo6())) {
            conditions += " AND INT_ATRIBUTO6 IS NULL";
        } else if (this.getIntAtributo6() != null) {
            conditions += " AND INT_ATRIBUTO6 = ?";
            values.add(this.getIntAtributo6());
        }

        if (this.getIntDescripcion() != null && "null".equals(this.getIntDescripcion())) {
            conditions += " AND INT_DESCRIPCION IS NULL";
        } else if (this.getIntDescripcion() != null) {
            conditions += " AND INT_DESCRIPCION = ?";
            values.add(this.getIntDescripcion());
        }

        if (this.getIntAnoAltaReg() != null && this.getIntAnoAltaReg().longValue() == -999) {
            conditions += " AND INT_ANO_ALTA_REG IS NULL";
        } else if (this.getIntAnoAltaReg() != null) {
            conditions += " AND INT_ANO_ALTA_REG = ?";
            values.add(this.getIntAnoAltaReg());
        }

        if (this.getIntMesAltaReg() != null && this.getIntMesAltaReg().longValue() == -999) {
            conditions += " AND INT_MES_ALTA_REG IS NULL";
        } else if (this.getIntMesAltaReg() != null) {
            conditions += " AND INT_MES_ALTA_REG = ?";
            values.add(this.getIntMesAltaReg());
        }

        if (this.getIntDiaAltaReg() != null && this.getIntDiaAltaReg().longValue() == -999) {
            conditions += " AND INT_DIA_ALTA_REG IS NULL";
        } else if (this.getIntDiaAltaReg() != null) {
            conditions += " AND INT_DIA_ALTA_REG = ?";
            values.add(this.getIntDiaAltaReg());
        }

        if (this.getIntAnoUltMod() != null && this.getIntAnoUltMod().longValue() == -999) {
            conditions += " AND INT_ANO_ULT_MOD IS NULL";
        } else if (this.getIntAnoUltMod() != null) {
            conditions += " AND INT_ANO_ULT_MOD = ?";
            values.add(this.getIntAnoUltMod());
        }

        if (this.getIntMesUltMod() != null && this.getIntMesUltMod().longValue() == -999) {
            conditions += " AND INT_MES_ULT_MOD IS NULL";
        } else if (this.getIntMesUltMod() != null) {
            conditions += " AND INT_MES_ULT_MOD = ?";
            values.add(this.getIntMesUltMod());
        }

        if (this.getIntDiaUltMod() != null && this.getIntDiaUltMod().longValue() == -999) {
            conditions += " AND INT_DIA_ULT_MOD IS NULL";
        } else if (this.getIntDiaUltMod() != null) {
            conditions += " AND INT_DIA_ULT_MOD = ?";
            values.add(this.getIntDiaUltMod());
        }

        if (this.getIntCveStInterfaces() != null && "null".equals(this.getIntCveStInterfaces())) {
            conditions += " AND INT_CVE_ST_INTERFACES IS NULL";
        } else if (this.getIntCveStInterfaces() != null) {
            conditions += " AND INT_CVE_ST_INTERFACES = ?";
            values.add(this.getIntCveStInterfaces());
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
        String sql = "UPDATE INTERFACES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INT_SECUENCIA = ?";
        pkValues.add(this.getIntSecuencia());
        fields += " INT_REFERENCIA = ?, ";
        values.add(this.getIntReferencia());
        fields += " INT_ENT_SAL = ?, ";
        values.add(this.getIntEntSal());
        fields += " INT_ACTIVA = ?, ";
        values.add(this.getIntActiva());
        fields += " INT_PASSWORD = ?, ";
        values.add(this.getIntPassword());
        fields += " INT_ATRIBUTO1 = ?, ";
        values.add(this.getIntAtributo1());
        fields += " INT_ATRIBUTO2 = ?, ";
        values.add(this.getIntAtributo2());
        fields += " INT_ATRIBUTO3 = ?, ";
        values.add(this.getIntAtributo3());
        fields += " INT_ATRIBUTO4 = ?, ";
        values.add(this.getIntAtributo4());
        fields += " INT_ATRIBUTO5 = ?, ";
        values.add(this.getIntAtributo5());
        fields += " INT_ATRIBUTO6 = ?, ";
        values.add(this.getIntAtributo6());
        fields += " INT_DESCRIPCION = ?, ";
        values.add(this.getIntDescripcion());
        fields += " INT_ANO_ALTA_REG = ?, ";
        values.add(this.getIntAnoAltaReg());
        fields += " INT_MES_ALTA_REG = ?, ";
        values.add(this.getIntMesAltaReg());
        fields += " INT_DIA_ALTA_REG = ?, ";
        values.add(this.getIntDiaAltaReg());
        fields += " INT_ANO_ULT_MOD = ?, ";
        values.add(this.getIntAnoUltMod());
        fields += " INT_MES_ULT_MOD = ?, ";
        values.add(this.getIntMesUltMod());
        fields += " INT_DIA_ULT_MOD = ?, ";
        values.add(this.getIntDiaUltMod());
        fields += " INT_CVE_ST_INTERFACES = ?, ";
        values.add(this.getIntCveStInterfaces());
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
        String sql = "INSERT INTO INTERFACES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INT_SECUENCIA";
        fieldValues += ", ?";
        values.add(this.getIntSecuencia());

        fields += ", INT_REFERENCIA";
        fieldValues += ", ?";
        values.add(this.getIntReferencia());

        fields += ", INT_ENT_SAL";
        fieldValues += ", ?";
        values.add(this.getIntEntSal());

        fields += ", INT_ACTIVA";
        fieldValues += ", ?";
        values.add(this.getIntActiva());

        fields += ", INT_PASSWORD";
        fieldValues += ", ?";
        values.add(this.getIntPassword());

        fields += ", INT_ATRIBUTO1";
        fieldValues += ", ?";
        values.add(this.getIntAtributo1());

        fields += ", INT_ATRIBUTO2";
        fieldValues += ", ?";
        values.add(this.getIntAtributo2());

        fields += ", INT_ATRIBUTO3";
        fieldValues += ", ?";
        values.add(this.getIntAtributo3());

        fields += ", INT_ATRIBUTO4";
        fieldValues += ", ?";
        values.add(this.getIntAtributo4());

        fields += ", INT_ATRIBUTO5";
        fieldValues += ", ?";
        values.add(this.getIntAtributo5());

        fields += ", INT_ATRIBUTO6";
        fieldValues += ", ?";
        values.add(this.getIntAtributo6());

        fields += ", INT_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getIntDescripcion());

        fields += ", INT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIntAnoAltaReg());

        fields += ", INT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIntMesAltaReg());

        fields += ", INT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIntDiaAltaReg());

        fields += ", INT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIntAnoUltMod());

        fields += ", INT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIntMesUltMod());

        fields += ", INT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIntDiaUltMod());

        fields += ", INT_CVE_ST_INTERFACES";
        fieldValues += ", ?";
        values.add(this.getIntCveStInterfaces());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INTERFACES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INT_SECUENCIA = ?";
        values.add(this.getIntSecuencia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Interfaces instance = (Interfaces) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIntSecuencia().equals(instance.getIntSecuencia()))
            equalObjects = false;
        if (equalObjects && !this.getIntReferencia().equals(instance.getIntReferencia()))
            equalObjects = false;
        if (equalObjects && !this.getIntEntSal().equals(instance.getIntEntSal()))
            equalObjects = false;
        if (equalObjects && !this.getIntActiva().equals(instance.getIntActiva()))
            equalObjects = false;
        if (equalObjects && !this.getIntPassword().equals(instance.getIntPassword()))
            equalObjects = false;
        if (equalObjects && !this.getIntAtributo1().equals(instance.getIntAtributo1()))
            equalObjects = false;
        if (equalObjects && !this.getIntAtributo2().equals(instance.getIntAtributo2()))
            equalObjects = false;
        if (equalObjects && !this.getIntAtributo3().equals(instance.getIntAtributo3()))
            equalObjects = false;
        if (equalObjects && !this.getIntAtributo4().equals(instance.getIntAtributo4()))
            equalObjects = false;
        if (equalObjects && !this.getIntAtributo5().equals(instance.getIntAtributo5()))
            equalObjects = false;
        if (equalObjects && !this.getIntAtributo6().equals(instance.getIntAtributo6()))
            equalObjects = false;
        if (equalObjects && !this.getIntDescripcion().equals(instance.getIntDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getIntAnoAltaReg().equals(instance.getIntAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIntMesAltaReg().equals(instance.getIntMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIntDiaAltaReg().equals(instance.getIntDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIntAnoUltMod().equals(instance.getIntAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIntMesUltMod().equals(instance.getIntMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIntDiaUltMod().equals(instance.getIntDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveStInterfaces().equals(instance.getIntCveStInterfaces()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Interfaces result = new Interfaces();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIntSecuencia((BigDecimal) objectData.getData("INT_SECUENCIA"));
        result.setIntReferencia((String) objectData.getData("INT_REFERENCIA"));
        result.setIntEntSal((String) objectData.getData("INT_ENT_SAL"));
        result.setIntActiva((BigDecimal) objectData.getData("INT_ACTIVA"));
        result.setIntPassword((String) objectData.getData("INT_PASSWORD"));
        result.setIntAtributo1((String) objectData.getData("INT_ATRIBUTO1"));
        result.setIntAtributo2((String) objectData.getData("INT_ATRIBUTO2"));
        result.setIntAtributo3((String) objectData.getData("INT_ATRIBUTO3"));
        result.setIntAtributo4((String) objectData.getData("INT_ATRIBUTO4"));
        result.setIntAtributo5((String) objectData.getData("INT_ATRIBUTO5"));
        result.setIntAtributo6((String) objectData.getData("INT_ATRIBUTO6"));
        result.setIntDescripcion((String) objectData.getData("INT_DESCRIPCION"));
        result.setIntAnoAltaReg((BigDecimal) objectData.getData("INT_ANO_ALTA_REG"));
        result.setIntMesAltaReg((BigDecimal) objectData.getData("INT_MES_ALTA_REG"));
        result.setIntDiaAltaReg((BigDecimal) objectData.getData("INT_DIA_ALTA_REG"));
        result.setIntAnoUltMod((BigDecimal) objectData.getData("INT_ANO_ULT_MOD"));
        result.setIntMesUltMod((BigDecimal) objectData.getData("INT_MES_ULT_MOD"));
        result.setIntDiaUltMod((BigDecimal) objectData.getData("INT_DIA_ULT_MOD"));
        result.setIntCveStInterfaces((String) objectData.getData("INT_CVE_ST_INTERFACES"));

        return result;

    }

}
