package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TIPOCAMB_PK", columns = { "TIC_ANO_ALTA_REG", "TIC_MES_ALTA_REG", "TIC_DIA_ALTA_REG", "TIC_HORA_ALTA", "TIC_MINUTO_ALTA", "TIC_NUM_PAIS" },
            sequences = { "MANUAL" })
public class Tipocamb extends DomainObject {

    BigDecimal ticNumPais = null;
    BigDecimal ticAnoAltaReg = null;
    BigDecimal ticMesAltaReg = null;
    BigDecimal ticDiaAltaReg = null;
    BigDecimal ticHoraAlta = null;
    BigDecimal ticMinutoAlta = null;
    BigDecimal ticImpTipoCamb = null;
    BigDecimal ticAnoUltMod = null;
    BigDecimal ticMesUltMod = null;
    BigDecimal ticDiaUltMod = null;
    String ticCveStTipocam = null;

    public Tipocamb() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTicNumPais(BigDecimal ticNumPais) {
        this.ticNumPais = ticNumPais;
    }

    public BigDecimal getTicNumPais() {
        return this.ticNumPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTicAnoAltaReg(BigDecimal ticAnoAltaReg) {
        this.ticAnoAltaReg = ticAnoAltaReg;
    }

    public BigDecimal getTicAnoAltaReg() {
        return this.ticAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTicMesAltaReg(BigDecimal ticMesAltaReg) {
        this.ticMesAltaReg = ticMesAltaReg;
    }

    public BigDecimal getTicMesAltaReg() {
        return this.ticMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTicDiaAltaReg(BigDecimal ticDiaAltaReg) {
        this.ticDiaAltaReg = ticDiaAltaReg;
    }

    public BigDecimal getTicDiaAltaReg() {
        return this.ticDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTicHoraAlta(BigDecimal ticHoraAlta) {
        this.ticHoraAlta = ticHoraAlta;
    }

    public BigDecimal getTicHoraAlta() {
        return this.ticHoraAlta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTicMinutoAlta(BigDecimal ticMinutoAlta) {
        this.ticMinutoAlta = ticMinutoAlta;
    }

    public BigDecimal getTicMinutoAlta() {
        return this.ticMinutoAlta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 8, javaClass = BigDecimal.class)
    public void setTicImpTipoCamb(BigDecimal ticImpTipoCamb) {
        this.ticImpTipoCamb = ticImpTipoCamb;
    }

    public BigDecimal getTicImpTipoCamb() {
        return this.ticImpTipoCamb;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTicAnoUltMod(BigDecimal ticAnoUltMod) {
        this.ticAnoUltMod = ticAnoUltMod;
    }

    public BigDecimal getTicAnoUltMod() {
        return this.ticAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTicMesUltMod(BigDecimal ticMesUltMod) {
        this.ticMesUltMod = ticMesUltMod;
    }

    public BigDecimal getTicMesUltMod() {
        return this.ticMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTicDiaUltMod(BigDecimal ticDiaUltMod) {
        this.ticDiaUltMod = ticDiaUltMod;
    }

    public BigDecimal getTicDiaUltMod() {
        return this.ticDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTicCveStTipocam(String ticCveStTipocam) {
        this.ticCveStTipocam = ticCveStTipocam;
    }

    public String getTicCveStTipocam() {
        return this.ticCveStTipocam;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TIPOCAMB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTicNumPais() != null && this.getTicNumPais().longValue() == -999) {
            conditions += " AND TIC_NUM_PAIS IS NULL";
        } else if (this.getTicNumPais() != null) {
            conditions += " AND TIC_NUM_PAIS = ?";
            values.add(this.getTicNumPais());
        }

        if (this.getTicAnoAltaReg() != null && this.getTicAnoAltaReg().longValue() == -999) {
            conditions += " AND TIC_ANO_ALTA_REG IS NULL";
        } else if (this.getTicAnoAltaReg() != null) {
            conditions += " AND TIC_ANO_ALTA_REG = ?";
            values.add(this.getTicAnoAltaReg());
        }

        if (this.getTicMesAltaReg() != null && this.getTicMesAltaReg().longValue() == -999) {
            conditions += " AND TIC_MES_ALTA_REG IS NULL";
        } else if (this.getTicMesAltaReg() != null) {
            conditions += " AND TIC_MES_ALTA_REG = ?";
            values.add(this.getTicMesAltaReg());
        }

        if (this.getTicDiaAltaReg() != null && this.getTicDiaAltaReg().longValue() == -999) {
            conditions += " AND TIC_DIA_ALTA_REG IS NULL";
        } else if (this.getTicDiaAltaReg() != null) {
            conditions += " AND TIC_DIA_ALTA_REG = ?";
            values.add(this.getTicDiaAltaReg());
        }

        if (this.getTicHoraAlta() != null && this.getTicHoraAlta().longValue() == -999) {
            conditions += " AND TIC_HORA_ALTA IS NULL";
        } else if (this.getTicHoraAlta() != null) {
            conditions += " AND TIC_HORA_ALTA = ?";
            values.add(this.getTicHoraAlta());
        }

        if (this.getTicMinutoAlta() != null && this.getTicMinutoAlta().longValue() == -999) {
            conditions += " AND TIC_MINUTO_ALTA IS NULL";
        } else if (this.getTicMinutoAlta() != null) {
            conditions += " AND TIC_MINUTO_ALTA = ?";
            values.add(this.getTicMinutoAlta());
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
        String sql = "SELECT * FROM TIPOCAMB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTicNumPais() != null && this.getTicNumPais().longValue() == -999) {
            conditions += " AND TIC_NUM_PAIS IS NULL";
        } else if (this.getTicNumPais() != null) {
            conditions += " AND TIC_NUM_PAIS = ?";
            values.add(this.getTicNumPais());
        }

        if (this.getTicAnoAltaReg() != null && this.getTicAnoAltaReg().longValue() == -999) {
            conditions += " AND TIC_ANO_ALTA_REG IS NULL";
        } else if (this.getTicAnoAltaReg() != null) {
            conditions += " AND TIC_ANO_ALTA_REG = ?";
            values.add(this.getTicAnoAltaReg());
        }

        if (this.getTicMesAltaReg() != null && this.getTicMesAltaReg().longValue() == -999) {
            conditions += " AND TIC_MES_ALTA_REG IS NULL";
        } else if (this.getTicMesAltaReg() != null) {
            conditions += " AND TIC_MES_ALTA_REG = ?";
            values.add(this.getTicMesAltaReg());
        }

        if (this.getTicDiaAltaReg() != null && this.getTicDiaAltaReg().longValue() == -999) {
            conditions += " AND TIC_DIA_ALTA_REG IS NULL";
        } else if (this.getTicDiaAltaReg() != null) {
            conditions += " AND TIC_DIA_ALTA_REG = ?";
            values.add(this.getTicDiaAltaReg());
        }

        if (this.getTicHoraAlta() != null && this.getTicHoraAlta().longValue() == -999) {
            conditions += " AND TIC_HORA_ALTA IS NULL";
        } else if (this.getTicHoraAlta() != null) {
            conditions += " AND TIC_HORA_ALTA = ?";
            values.add(this.getTicHoraAlta());
        }

        if (this.getTicMinutoAlta() != null && this.getTicMinutoAlta().longValue() == -999) {
            conditions += " AND TIC_MINUTO_ALTA IS NULL";
        } else if (this.getTicMinutoAlta() != null) {
            conditions += " AND TIC_MINUTO_ALTA = ?";
            values.add(this.getTicMinutoAlta());
        }

        if (this.getTicImpTipoCamb() != null && this.getTicImpTipoCamb().longValue() == -999) {
            conditions += " AND TIC_IMP_TIPO_CAMB IS NULL";
        } else if (this.getTicImpTipoCamb() != null) {
            conditions += " AND TIC_IMP_TIPO_CAMB = ?";
            values.add(this.getTicImpTipoCamb());
        }

        if (this.getTicAnoUltMod() != null && this.getTicAnoUltMod().longValue() == -999) {
            conditions += " AND TIC_ANO_ULT_MOD IS NULL";
        } else if (this.getTicAnoUltMod() != null) {
            conditions += " AND TIC_ANO_ULT_MOD = ?";
            values.add(this.getTicAnoUltMod());
        }

        if (this.getTicMesUltMod() != null && this.getTicMesUltMod().longValue() == -999) {
            conditions += " AND TIC_MES_ULT_MOD IS NULL";
        } else if (this.getTicMesUltMod() != null) {
            conditions += " AND TIC_MES_ULT_MOD = ?";
            values.add(this.getTicMesUltMod());
        }

        if (this.getTicDiaUltMod() != null && this.getTicDiaUltMod().longValue() == -999) {
            conditions += " AND TIC_DIA_ULT_MOD IS NULL";
        } else if (this.getTicDiaUltMod() != null) {
            conditions += " AND TIC_DIA_ULT_MOD = ?";
            values.add(this.getTicDiaUltMod());
        }

        if (this.getTicCveStTipocam() != null && "null".equals(this.getTicCveStTipocam())) {
            conditions += " AND TIC_CVE_ST_TIPOCAM IS NULL";
        } else if (this.getTicCveStTipocam() != null) {
            conditions += " AND TIC_CVE_ST_TIPOCAM = ?";
            values.add(this.getTicCveStTipocam());
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
        String sql = "UPDATE TIPOCAMB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TIC_NUM_PAIS = ?";
        pkValues.add(this.getTicNumPais());
        conditions += " AND TIC_ANO_ALTA_REG = ?";
        pkValues.add(this.getTicAnoAltaReg());
        conditions += " AND TIC_MES_ALTA_REG = ?";
        pkValues.add(this.getTicMesAltaReg());
        conditions += " AND TIC_DIA_ALTA_REG = ?";
        pkValues.add(this.getTicDiaAltaReg());
        conditions += " AND TIC_HORA_ALTA = ?";
        pkValues.add(this.getTicHoraAlta());
        conditions += " AND TIC_MINUTO_ALTA = ?";
        pkValues.add(this.getTicMinutoAlta());
        fields += " TIC_IMP_TIPO_CAMB = ?, ";
        values.add(this.getTicImpTipoCamb());
        fields += " TIC_ANO_ULT_MOD = ?, ";
        values.add(this.getTicAnoUltMod());
        fields += " TIC_MES_ULT_MOD = ?, ";
        values.add(this.getTicMesUltMod());
        fields += " TIC_DIA_ULT_MOD = ?, ";
        values.add(this.getTicDiaUltMod());
        fields += " TIC_CVE_ST_TIPOCAM = ?, ";
        values.add(this.getTicCveStTipocam());
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
        String sql = "INSERT INTO TIPOCAMB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TIC_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getTicNumPais());

        fields += ", TIC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTicAnoAltaReg());

        fields += ", TIC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTicMesAltaReg());

        fields += ", TIC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTicDiaAltaReg());

        fields += ", TIC_HORA_ALTA";
        fieldValues += ", ?";
        values.add(this.getTicHoraAlta());

        fields += ", TIC_MINUTO_ALTA";
        fieldValues += ", ?";
        values.add(this.getTicMinutoAlta());

        fields += ", TIC_IMP_TIPO_CAMB";
        fieldValues += ", ?";
        values.add(this.getTicImpTipoCamb());

        fields += ", TIC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTicAnoUltMod());

        fields += ", TIC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTicMesUltMod());

        fields += ", TIC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTicDiaUltMod());

        fields += ", TIC_CVE_ST_TIPOCAM";
        fieldValues += ", ?";
        values.add(this.getTicCveStTipocam());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TIPOCAMB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TIC_NUM_PAIS = ?";
        values.add(this.getTicNumPais());
        conditions += " AND TIC_ANO_ALTA_REG = ?";
        values.add(this.getTicAnoAltaReg());
        conditions += " AND TIC_MES_ALTA_REG = ?";
        values.add(this.getTicMesAltaReg());
        conditions += " AND TIC_DIA_ALTA_REG = ?";
        values.add(this.getTicDiaAltaReg());
        conditions += " AND TIC_HORA_ALTA = ?";
        values.add(this.getTicHoraAlta());
        conditions += " AND TIC_MINUTO_ALTA = ?";
        values.add(this.getTicMinutoAlta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tipocamb instance = (Tipocamb) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTicNumPais().equals(instance.getTicNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getTicAnoAltaReg().equals(instance.getTicAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTicMesAltaReg().equals(instance.getTicMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTicDiaAltaReg().equals(instance.getTicDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTicHoraAlta().equals(instance.getTicHoraAlta()))
            equalObjects = false;
        if (equalObjects && !this.getTicMinutoAlta().equals(instance.getTicMinutoAlta()))
            equalObjects = false;
        if (equalObjects && !this.getTicImpTipoCamb().equals(instance.getTicImpTipoCamb()))
            equalObjects = false;
        if (equalObjects && !this.getTicAnoUltMod().equals(instance.getTicAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTicMesUltMod().equals(instance.getTicMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTicDiaUltMod().equals(instance.getTicDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTicCveStTipocam().equals(instance.getTicCveStTipocam()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tipocamb result = new Tipocamb();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTicNumPais((BigDecimal) objectData.getData("TIC_NUM_PAIS"));
        result.setTicAnoAltaReg((BigDecimal) objectData.getData("TIC_ANO_ALTA_REG"));
        result.setTicMesAltaReg((BigDecimal) objectData.getData("TIC_MES_ALTA_REG"));
        result.setTicDiaAltaReg((BigDecimal) objectData.getData("TIC_DIA_ALTA_REG"));
        result.setTicHoraAlta((BigDecimal) objectData.getData("TIC_HORA_ALTA"));
        result.setTicMinutoAlta((BigDecimal) objectData.getData("TIC_MINUTO_ALTA"));
        result.setTicImpTipoCamb((BigDecimal) objectData.getData("TIC_IMP_TIPO_CAMB"));
        result.setTicAnoUltMod((BigDecimal) objectData.getData("TIC_ANO_ULT_MOD"));
        result.setTicMesUltMod((BigDecimal) objectData.getData("TIC_MES_ULT_MOD"));
        result.setTicDiaUltMod((BigDecimal) objectData.getData("TIC_DIA_ULT_MOD"));
        result.setTicCveStTipocam((String) objectData.getData("TIC_CVE_ST_TIPOCAM"));

        return result;

    }

}
