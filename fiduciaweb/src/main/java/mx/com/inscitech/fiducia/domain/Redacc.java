package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REDACC_PK", columns = { "RED_NUM_REDACCION", "RED_CVE_TIPO_DOCTO" }, sequences = { "MANUAL" })
public class Redacc extends DomainObject {

    String redCveTipoDocto = null;
    BigDecimal redNumRedaccion = null;
    String redTxtRedac = null;
    BigDecimal redAnoAltaReg = null;
    BigDecimal redMesAltaReg = null;
    BigDecimal redDiaAltaReg = null;
    BigDecimal redAnoUltMod = null;
    BigDecimal redMesUltMod = null;
    BigDecimal redDiaUltMod = null;
    String redCveStRedacc = null;

    public Redacc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRedCveTipoDocto(String redCveTipoDocto) {
        this.redCveTipoDocto = redCveTipoDocto;
    }

    public String getRedCveTipoDocto() {
        return this.redCveTipoDocto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRedNumRedaccion(BigDecimal redNumRedaccion) {
        this.redNumRedaccion = redNumRedaccion;
    }

    public BigDecimal getRedNumRedaccion() {
        return this.redNumRedaccion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRedTxtRedac(String redTxtRedac) {
        this.redTxtRedac = redTxtRedac;
    }

    public String getRedTxtRedac() {
        return this.redTxtRedac;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRedAnoAltaReg(BigDecimal redAnoAltaReg) {
        this.redAnoAltaReg = redAnoAltaReg;
    }

    public BigDecimal getRedAnoAltaReg() {
        return this.redAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRedMesAltaReg(BigDecimal redMesAltaReg) {
        this.redMesAltaReg = redMesAltaReg;
    }

    public BigDecimal getRedMesAltaReg() {
        return this.redMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRedDiaAltaReg(BigDecimal redDiaAltaReg) {
        this.redDiaAltaReg = redDiaAltaReg;
    }

    public BigDecimal getRedDiaAltaReg() {
        return this.redDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRedAnoUltMod(BigDecimal redAnoUltMod) {
        this.redAnoUltMod = redAnoUltMod;
    }

    public BigDecimal getRedAnoUltMod() {
        return this.redAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRedMesUltMod(BigDecimal redMesUltMod) {
        this.redMesUltMod = redMesUltMod;
    }

    public BigDecimal getRedMesUltMod() {
        return this.redMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRedDiaUltMod(BigDecimal redDiaUltMod) {
        this.redDiaUltMod = redDiaUltMod;
    }

    public BigDecimal getRedDiaUltMod() {
        return this.redDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRedCveStRedacc(String redCveStRedacc) {
        this.redCveStRedacc = redCveStRedacc;
    }

    public String getRedCveStRedacc() {
        return this.redCveStRedacc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REDACC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRedCveTipoDocto() != null && "null".equals(this.getRedCveTipoDocto())) {
            conditions += " AND RED_CVE_TIPO_DOCTO IS NULL";
        } else if (this.getRedCveTipoDocto() != null) {
            conditions += " AND RED_CVE_TIPO_DOCTO = ?";
            values.add(this.getRedCveTipoDocto());
        }

        if (this.getRedNumRedaccion() != null && this.getRedNumRedaccion().longValue() == -999) {
            conditions += " AND RED_NUM_REDACCION IS NULL";
        } else if (this.getRedNumRedaccion() != null) {
            conditions += " AND RED_NUM_REDACCION = ?";
            values.add(this.getRedNumRedaccion());
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
        String sql = "SELECT * FROM REDACC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRedCveTipoDocto() != null && "null".equals(this.getRedCveTipoDocto())) {
            conditions += " AND RED_CVE_TIPO_DOCTO IS NULL";
        } else if (this.getRedCveTipoDocto() != null) {
            conditions += " AND RED_CVE_TIPO_DOCTO = ?";
            values.add(this.getRedCveTipoDocto());
        }

        if (this.getRedNumRedaccion() != null && this.getRedNumRedaccion().longValue() == -999) {
            conditions += " AND RED_NUM_REDACCION IS NULL";
        } else if (this.getRedNumRedaccion() != null) {
            conditions += " AND RED_NUM_REDACCION = ?";
            values.add(this.getRedNumRedaccion());
        }

        if (this.getRedTxtRedac() != null && "null".equals(this.getRedTxtRedac())) {
            conditions += " AND RED_TXT_REDAC IS NULL";
        } else if (this.getRedTxtRedac() != null) {
            conditions += " AND RED_TXT_REDAC = ?";
            values.add(this.getRedTxtRedac());
        }

        if (this.getRedAnoAltaReg() != null && this.getRedAnoAltaReg().longValue() == -999) {
            conditions += " AND RED_ANO_ALTA_REG IS NULL";
        } else if (this.getRedAnoAltaReg() != null) {
            conditions += " AND RED_ANO_ALTA_REG = ?";
            values.add(this.getRedAnoAltaReg());
        }

        if (this.getRedMesAltaReg() != null && this.getRedMesAltaReg().longValue() == -999) {
            conditions += " AND RED_MES_ALTA_REG IS NULL";
        } else if (this.getRedMesAltaReg() != null) {
            conditions += " AND RED_MES_ALTA_REG = ?";
            values.add(this.getRedMesAltaReg());
        }

        if (this.getRedDiaAltaReg() != null && this.getRedDiaAltaReg().longValue() == -999) {
            conditions += " AND RED_DIA_ALTA_REG IS NULL";
        } else if (this.getRedDiaAltaReg() != null) {
            conditions += " AND RED_DIA_ALTA_REG = ?";
            values.add(this.getRedDiaAltaReg());
        }

        if (this.getRedAnoUltMod() != null && this.getRedAnoUltMod().longValue() == -999) {
            conditions += " AND RED_ANO_ULT_MOD IS NULL";
        } else if (this.getRedAnoUltMod() != null) {
            conditions += " AND RED_ANO_ULT_MOD = ?";
            values.add(this.getRedAnoUltMod());
        }

        if (this.getRedMesUltMod() != null && this.getRedMesUltMod().longValue() == -999) {
            conditions += " AND RED_MES_ULT_MOD IS NULL";
        } else if (this.getRedMesUltMod() != null) {
            conditions += " AND RED_MES_ULT_MOD = ?";
            values.add(this.getRedMesUltMod());
        }

        if (this.getRedDiaUltMod() != null && this.getRedDiaUltMod().longValue() == -999) {
            conditions += " AND RED_DIA_ULT_MOD IS NULL";
        } else if (this.getRedDiaUltMod() != null) {
            conditions += " AND RED_DIA_ULT_MOD = ?";
            values.add(this.getRedDiaUltMod());
        }

        if (this.getRedCveStRedacc() != null && "null".equals(this.getRedCveStRedacc())) {
            conditions += " AND RED_CVE_ST_REDACC IS NULL";
        } else if (this.getRedCveStRedacc() != null) {
            conditions += " AND RED_CVE_ST_REDACC = ?";
            values.add(this.getRedCveStRedacc());
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
        String sql = "UPDATE REDACC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RED_CVE_TIPO_DOCTO = ?";
        pkValues.add(this.getRedCveTipoDocto());
        conditions += " AND RED_NUM_REDACCION = ?";
        pkValues.add(this.getRedNumRedaccion());
        fields += " RED_TXT_REDAC = ?, ";
        values.add(this.getRedTxtRedac());
        fields += " RED_ANO_ALTA_REG = ?, ";
        values.add(this.getRedAnoAltaReg());
        fields += " RED_MES_ALTA_REG = ?, ";
        values.add(this.getRedMesAltaReg());
        fields += " RED_DIA_ALTA_REG = ?, ";
        values.add(this.getRedDiaAltaReg());
        fields += " RED_ANO_ULT_MOD = ?, ";
        values.add(this.getRedAnoUltMod());
        fields += " RED_MES_ULT_MOD = ?, ";
        values.add(this.getRedMesUltMod());
        fields += " RED_DIA_ULT_MOD = ?, ";
        values.add(this.getRedDiaUltMod());
        fields += " RED_CVE_ST_REDACC = ?, ";
        values.add(this.getRedCveStRedacc());
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
        String sql = "INSERT INTO REDACC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RED_CVE_TIPO_DOCTO";
        fieldValues += ", ?";
        values.add(this.getRedCveTipoDocto());

        fields += ", RED_NUM_REDACCION";
        fieldValues += ", ?";
        values.add(this.getRedNumRedaccion());

        fields += ", RED_TXT_REDAC";
        fieldValues += ", ?";
        values.add(this.getRedTxtRedac());

        fields += ", RED_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRedAnoAltaReg());

        fields += ", RED_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRedMesAltaReg());

        fields += ", RED_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRedDiaAltaReg());

        fields += ", RED_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRedAnoUltMod());

        fields += ", RED_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRedMesUltMod());

        fields += ", RED_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRedDiaUltMod());

        fields += ", RED_CVE_ST_REDACC";
        fieldValues += ", ?";
        values.add(this.getRedCveStRedacc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REDACC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RED_CVE_TIPO_DOCTO = ?";
        values.add(this.getRedCveTipoDocto());
        conditions += " AND RED_NUM_REDACCION = ?";
        values.add(this.getRedNumRedaccion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Redacc instance = (Redacc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRedCveTipoDocto().equals(instance.getRedCveTipoDocto()))
            equalObjects = false;
        if (equalObjects && !this.getRedNumRedaccion().equals(instance.getRedNumRedaccion()))
            equalObjects = false;
        if (equalObjects && !this.getRedTxtRedac().equals(instance.getRedTxtRedac()))
            equalObjects = false;
        if (equalObjects && !this.getRedAnoAltaReg().equals(instance.getRedAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRedMesAltaReg().equals(instance.getRedMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRedDiaAltaReg().equals(instance.getRedDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRedAnoUltMod().equals(instance.getRedAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRedMesUltMod().equals(instance.getRedMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRedDiaUltMod().equals(instance.getRedDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRedCveStRedacc().equals(instance.getRedCveStRedacc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Redacc result = new Redacc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRedCveTipoDocto((String) objectData.getData("RED_CVE_TIPO_DOCTO"));
        result.setRedNumRedaccion((BigDecimal) objectData.getData("RED_NUM_REDACCION"));
        result.setRedTxtRedac((String) objectData.getData("RED_TXT_REDAC"));
        result.setRedAnoAltaReg((BigDecimal) objectData.getData("RED_ANO_ALTA_REG"));
        result.setRedMesAltaReg((BigDecimal) objectData.getData("RED_MES_ALTA_REG"));
        result.setRedDiaAltaReg((BigDecimal) objectData.getData("RED_DIA_ALTA_REG"));
        result.setRedAnoUltMod((BigDecimal) objectData.getData("RED_ANO_ULT_MOD"));
        result.setRedMesUltMod((BigDecimal) objectData.getData("RED_MES_ULT_MOD"));
        result.setRedDiaUltMod((BigDecimal) objectData.getData("RED_DIA_ULT_MOD"));
        result.setRedCveStRedacc((String) objectData.getData("RED_CVE_ST_REDACC"));

        return result;

    }

}
