package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISADIC_PK", columns = { "EAD_NUM_PROGRAMA", "EAD_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisadic extends DomainObject {

    BigDecimal eadNumPrograma = null;
    BigDecimal eadNumEmision = null;
    BigDecimal eadAumentoVals = null;
    BigDecimal eadAdicionCupon = null;
    BigDecimal eadNumTitulos = null;
    BigDecimal eadImpNominal = null;
    BigDecimal eadAnoEmision = null;
    BigDecimal eadMesEmision = null;
    BigDecimal eadDiaEmision = null;
    BigDecimal eadAnoAltaReg = null;
    BigDecimal eadMesAltaReg = null;
    BigDecimal eadDiaAltaReg = null;
    BigDecimal eadAnoUltMod = null;
    BigDecimal eadMesUltMod = null;
    BigDecimal eadDiaUltMod = null;
    String eadCveStEmisadic = null;

    public Emisadic() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEadNumPrograma(BigDecimal eadNumPrograma) {
        this.eadNumPrograma = eadNumPrograma;
    }

    public BigDecimal getEadNumPrograma() {
        return this.eadNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEadNumEmision(BigDecimal eadNumEmision) {
        this.eadNumEmision = eadNumEmision;
    }

    public BigDecimal getEadNumEmision() {
        return this.eadNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadAumentoVals(BigDecimal eadAumentoVals) {
        this.eadAumentoVals = eadAumentoVals;
    }

    public BigDecimal getEadAumentoVals() {
        return this.eadAumentoVals;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadAdicionCupon(BigDecimal eadAdicionCupon) {
        this.eadAdicionCupon = eadAdicionCupon;
    }

    public BigDecimal getEadAdicionCupon() {
        return this.eadAdicionCupon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEadNumTitulos(BigDecimal eadNumTitulos) {
        this.eadNumTitulos = eadNumTitulos;
    }

    public BigDecimal getEadNumTitulos() {
        return this.eadNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEadImpNominal(BigDecimal eadImpNominal) {
        this.eadImpNominal = eadImpNominal;
    }

    public BigDecimal getEadImpNominal() {
        return this.eadImpNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadAnoEmision(BigDecimal eadAnoEmision) {
        this.eadAnoEmision = eadAnoEmision;
    }

    public BigDecimal getEadAnoEmision() {
        return this.eadAnoEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadMesEmision(BigDecimal eadMesEmision) {
        this.eadMesEmision = eadMesEmision;
    }

    public BigDecimal getEadMesEmision() {
        return this.eadMesEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadDiaEmision(BigDecimal eadDiaEmision) {
        this.eadDiaEmision = eadDiaEmision;
    }

    public BigDecimal getEadDiaEmision() {
        return this.eadDiaEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadAnoAltaReg(BigDecimal eadAnoAltaReg) {
        this.eadAnoAltaReg = eadAnoAltaReg;
    }

    public BigDecimal getEadAnoAltaReg() {
        return this.eadAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadMesAltaReg(BigDecimal eadMesAltaReg) {
        this.eadMesAltaReg = eadMesAltaReg;
    }

    public BigDecimal getEadMesAltaReg() {
        return this.eadMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadDiaAltaReg(BigDecimal eadDiaAltaReg) {
        this.eadDiaAltaReg = eadDiaAltaReg;
    }

    public BigDecimal getEadDiaAltaReg() {
        return this.eadDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadAnoUltMod(BigDecimal eadAnoUltMod) {
        this.eadAnoUltMod = eadAnoUltMod;
    }

    public BigDecimal getEadAnoUltMod() {
        return this.eadAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEadMesUltMod(BigDecimal eadMesUltMod) {
        this.eadMesUltMod = eadMesUltMod;
    }

    public BigDecimal getEadMesUltMod() {
        return this.eadMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEadDiaUltMod(BigDecimal eadDiaUltMod) {
        this.eadDiaUltMod = eadDiaUltMod;
    }

    public BigDecimal getEadDiaUltMod() {
        return this.eadDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEadCveStEmisadic(String eadCveStEmisadic) {
        this.eadCveStEmisadic = eadCveStEmisadic;
    }

    public String getEadCveStEmisadic() {
        return this.eadCveStEmisadic;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISADIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEadNumPrograma() != null && this.getEadNumPrograma().longValue() == -999) {
            conditions += " AND EAD_NUM_PROGRAMA IS NULL";
        } else if (this.getEadNumPrograma() != null) {
            conditions += " AND EAD_NUM_PROGRAMA = ?";
            values.add(this.getEadNumPrograma());
        }

        if (this.getEadNumEmision() != null && this.getEadNumEmision().longValue() == -999) {
            conditions += " AND EAD_NUM_EMISION IS NULL";
        } else if (this.getEadNumEmision() != null) {
            conditions += " AND EAD_NUM_EMISION = ?";
            values.add(this.getEadNumEmision());
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
        String sql = "SELECT * FROM EMISADIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEadNumPrograma() != null && this.getEadNumPrograma().longValue() == -999) {
            conditions += " AND EAD_NUM_PROGRAMA IS NULL";
        } else if (this.getEadNumPrograma() != null) {
            conditions += " AND EAD_NUM_PROGRAMA = ?";
            values.add(this.getEadNumPrograma());
        }

        if (this.getEadNumEmision() != null && this.getEadNumEmision().longValue() == -999) {
            conditions += " AND EAD_NUM_EMISION IS NULL";
        } else if (this.getEadNumEmision() != null) {
            conditions += " AND EAD_NUM_EMISION = ?";
            values.add(this.getEadNumEmision());
        }

        if (this.getEadAumentoVals() != null && this.getEadAumentoVals().longValue() == -999) {
            conditions += " AND EAD_AUMENTO_VALS IS NULL";
        } else if (this.getEadAumentoVals() != null) {
            conditions += " AND EAD_AUMENTO_VALS = ?";
            values.add(this.getEadAumentoVals());
        }

        if (this.getEadAdicionCupon() != null && this.getEadAdicionCupon().longValue() == -999) {
            conditions += " AND EAD_ADICION_CUPON IS NULL";
        } else if (this.getEadAdicionCupon() != null) {
            conditions += " AND EAD_ADICION_CUPON = ?";
            values.add(this.getEadAdicionCupon());
        }

        if (this.getEadNumTitulos() != null && this.getEadNumTitulos().longValue() == -999) {
            conditions += " AND EAD_NUM_TITULOS IS NULL";
        } else if (this.getEadNumTitulos() != null) {
            conditions += " AND EAD_NUM_TITULOS = ?";
            values.add(this.getEadNumTitulos());
        }

        if (this.getEadImpNominal() != null && this.getEadImpNominal().longValue() == -999) {
            conditions += " AND EAD_IMP_NOMINAL IS NULL";
        } else if (this.getEadImpNominal() != null) {
            conditions += " AND EAD_IMP_NOMINAL = ?";
            values.add(this.getEadImpNominal());
        }

        if (this.getEadAnoEmision() != null && this.getEadAnoEmision().longValue() == -999) {
            conditions += " AND EAD_ANO_EMISION IS NULL";
        } else if (this.getEadAnoEmision() != null) {
            conditions += " AND EAD_ANO_EMISION = ?";
            values.add(this.getEadAnoEmision());
        }

        if (this.getEadMesEmision() != null && this.getEadMesEmision().longValue() == -999) {
            conditions += " AND EAD_MES_EMISION IS NULL";
        } else if (this.getEadMesEmision() != null) {
            conditions += " AND EAD_MES_EMISION = ?";
            values.add(this.getEadMesEmision());
        }

        if (this.getEadDiaEmision() != null && this.getEadDiaEmision().longValue() == -999) {
            conditions += " AND EAD_DIA_EMISION IS NULL";
        } else if (this.getEadDiaEmision() != null) {
            conditions += " AND EAD_DIA_EMISION = ?";
            values.add(this.getEadDiaEmision());
        }

        if (this.getEadAnoAltaReg() != null && this.getEadAnoAltaReg().longValue() == -999) {
            conditions += " AND EAD_ANO_ALTA_REG IS NULL";
        } else if (this.getEadAnoAltaReg() != null) {
            conditions += " AND EAD_ANO_ALTA_REG = ?";
            values.add(this.getEadAnoAltaReg());
        }

        if (this.getEadMesAltaReg() != null && this.getEadMesAltaReg().longValue() == -999) {
            conditions += " AND EAD_MES_ALTA_REG IS NULL";
        } else if (this.getEadMesAltaReg() != null) {
            conditions += " AND EAD_MES_ALTA_REG = ?";
            values.add(this.getEadMesAltaReg());
        }

        if (this.getEadDiaAltaReg() != null && this.getEadDiaAltaReg().longValue() == -999) {
            conditions += " AND EAD_DIA_ALTA_REG IS NULL";
        } else if (this.getEadDiaAltaReg() != null) {
            conditions += " AND EAD_DIA_ALTA_REG = ?";
            values.add(this.getEadDiaAltaReg());
        }

        if (this.getEadAnoUltMod() != null && this.getEadAnoUltMod().longValue() == -999) {
            conditions += " AND EAD_ANO_ULT_MOD IS NULL";
        } else if (this.getEadAnoUltMod() != null) {
            conditions += " AND EAD_ANO_ULT_MOD = ?";
            values.add(this.getEadAnoUltMod());
        }

        if (this.getEadMesUltMod() != null && this.getEadMesUltMod().longValue() == -999) {
            conditions += " AND EAD_MES_ULT_MOD IS NULL";
        } else if (this.getEadMesUltMod() != null) {
            conditions += " AND EAD_MES_ULT_MOD = ?";
            values.add(this.getEadMesUltMod());
        }

        if (this.getEadDiaUltMod() != null && this.getEadDiaUltMod().longValue() == -999) {
            conditions += " AND EAD_DIA_ULT_MOD IS NULL";
        } else if (this.getEadDiaUltMod() != null) {
            conditions += " AND EAD_DIA_ULT_MOD = ?";
            values.add(this.getEadDiaUltMod());
        }

        if (this.getEadCveStEmisadic() != null && "null".equals(this.getEadCveStEmisadic())) {
            conditions += " AND EAD_CVE_ST_EMISADIC IS NULL";
        } else if (this.getEadCveStEmisadic() != null) {
            conditions += " AND EAD_CVE_ST_EMISADIC = ?";
            values.add(this.getEadCveStEmisadic());
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
        String sql = "UPDATE EMISADIC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAD_NUM_PROGRAMA = ?";
        pkValues.add(this.getEadNumPrograma());
        conditions += " AND EAD_NUM_EMISION = ?";
        pkValues.add(this.getEadNumEmision());
        fields += " EAD_AUMENTO_VALS = ?, ";
        values.add(this.getEadAumentoVals());
        fields += " EAD_ADICION_CUPON = ?, ";
        values.add(this.getEadAdicionCupon());
        fields += " EAD_NUM_TITULOS = ?, ";
        values.add(this.getEadNumTitulos());
        fields += " EAD_IMP_NOMINAL = ?, ";
        values.add(this.getEadImpNominal());
        fields += " EAD_ANO_EMISION = ?, ";
        values.add(this.getEadAnoEmision());
        fields += " EAD_MES_EMISION = ?, ";
        values.add(this.getEadMesEmision());
        fields += " EAD_DIA_EMISION = ?, ";
        values.add(this.getEadDiaEmision());
        fields += " EAD_ANO_ALTA_REG = ?, ";
        values.add(this.getEadAnoAltaReg());
        fields += " EAD_MES_ALTA_REG = ?, ";
        values.add(this.getEadMesAltaReg());
        fields += " EAD_DIA_ALTA_REG = ?, ";
        values.add(this.getEadDiaAltaReg());
        fields += " EAD_ANO_ULT_MOD = ?, ";
        values.add(this.getEadAnoUltMod());
        fields += " EAD_MES_ULT_MOD = ?, ";
        values.add(this.getEadMesUltMod());
        fields += " EAD_DIA_ULT_MOD = ?, ";
        values.add(this.getEadDiaUltMod());
        fields += " EAD_CVE_ST_EMISADIC = ?, ";
        values.add(this.getEadCveStEmisadic());
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
        String sql = "INSERT INTO EMISADIC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAD_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEadNumPrograma());

        fields += ", EAD_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEadNumEmision());

        fields += ", EAD_AUMENTO_VALS";
        fieldValues += ", ?";
        values.add(this.getEadAumentoVals());

        fields += ", EAD_ADICION_CUPON";
        fieldValues += ", ?";
        values.add(this.getEadAdicionCupon());

        fields += ", EAD_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEadNumTitulos());

        fields += ", EAD_IMP_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getEadImpNominal());

        fields += ", EAD_ANO_EMISION";
        fieldValues += ", ?";
        values.add(this.getEadAnoEmision());

        fields += ", EAD_MES_EMISION";
        fieldValues += ", ?";
        values.add(this.getEadMesEmision());

        fields += ", EAD_DIA_EMISION";
        fieldValues += ", ?";
        values.add(this.getEadDiaEmision());

        fields += ", EAD_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEadAnoAltaReg());

        fields += ", EAD_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEadMesAltaReg());

        fields += ", EAD_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEadDiaAltaReg());

        fields += ", EAD_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEadAnoUltMod());

        fields += ", EAD_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEadMesUltMod());

        fields += ", EAD_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEadDiaUltMod());

        fields += ", EAD_CVE_ST_EMISADIC";
        fieldValues += ", ?";
        values.add(this.getEadCveStEmisadic());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISADIC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAD_NUM_PROGRAMA = ?";
        values.add(this.getEadNumPrograma());
        conditions += " AND EAD_NUM_EMISION = ?";
        values.add(this.getEadNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisadic instance = (Emisadic) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEadNumPrograma().equals(instance.getEadNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEadNumEmision().equals(instance.getEadNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEadAumentoVals().equals(instance.getEadAumentoVals()))
            equalObjects = false;
        if (equalObjects && !this.getEadAdicionCupon().equals(instance.getEadAdicionCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEadNumTitulos().equals(instance.getEadNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEadImpNominal().equals(instance.getEadImpNominal()))
            equalObjects = false;
        if (equalObjects && !this.getEadAnoEmision().equals(instance.getEadAnoEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEadMesEmision().equals(instance.getEadMesEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEadDiaEmision().equals(instance.getEadDiaEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEadAnoAltaReg().equals(instance.getEadAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEadMesAltaReg().equals(instance.getEadMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEadDiaAltaReg().equals(instance.getEadDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEadAnoUltMod().equals(instance.getEadAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEadMesUltMod().equals(instance.getEadMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEadDiaUltMod().equals(instance.getEadDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEadCveStEmisadic().equals(instance.getEadCveStEmisadic()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisadic result = new Emisadic();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEadNumPrograma((BigDecimal) objectData.getData("EAD_NUM_PROGRAMA"));
        result.setEadNumEmision((BigDecimal) objectData.getData("EAD_NUM_EMISION"));
        result.setEadAumentoVals((BigDecimal) objectData.getData("EAD_AUMENTO_VALS"));
        result.setEadAdicionCupon((BigDecimal) objectData.getData("EAD_ADICION_CUPON"));
        result.setEadNumTitulos((BigDecimal) objectData.getData("EAD_NUM_TITULOS"));
        result.setEadImpNominal((BigDecimal) objectData.getData("EAD_IMP_NOMINAL"));
        result.setEadAnoEmision((BigDecimal) objectData.getData("EAD_ANO_EMISION"));
        result.setEadMesEmision((BigDecimal) objectData.getData("EAD_MES_EMISION"));
        result.setEadDiaEmision((BigDecimal) objectData.getData("EAD_DIA_EMISION"));
        result.setEadAnoAltaReg((BigDecimal) objectData.getData("EAD_ANO_ALTA_REG"));
        result.setEadMesAltaReg((BigDecimal) objectData.getData("EAD_MES_ALTA_REG"));
        result.setEadDiaAltaReg((BigDecimal) objectData.getData("EAD_DIA_ALTA_REG"));
        result.setEadAnoUltMod((BigDecimal) objectData.getData("EAD_ANO_ULT_MOD"));
        result.setEadMesUltMod((BigDecimal) objectData.getData("EAD_MES_ULT_MOD"));
        result.setEadDiaUltMod((BigDecimal) objectData.getData("EAD_DIA_ULT_MOD"));
        result.setEadCveStEmisadic((String) objectData.getData("EAD_CVE_ST_EMISADIC"));

        return result;

    }

}
