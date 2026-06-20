package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISICAP_PK", columns = { "EDI_NUM_PROGRAMA", "EDI_NUM_EMISION", "EDI_NUM_SEC_CAPITALIZA" }, sequences = { "MANUAL" })
public class Emisicap extends DomainObject {

    BigDecimal ediNumPrograma = null;
    BigDecimal ediNumEmision = null;
    BigDecimal ediNumSecCapitaliza = null;
    BigDecimal ediPjeCapitalizacion = null;
    BigDecimal ediImpCapitalizacion = null;
    BigDecimal ediAnoCapitalizacion = null;
    BigDecimal ediMesCapitalizacion = null;
    BigDecimal ediDiaCapitalizacion = null;
    BigDecimal ediAnoAltaReg = null;
    BigDecimal ediMesAltaReg = null;
    BigDecimal ediDiaAltaReg = null;
    BigDecimal ediAnoUltMod = null;
    BigDecimal ediMesUltMod = null;
    BigDecimal ediDiaUltMod = null;
    String ediCveStEmisicap = null;

    public Emisicap() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiNumPrograma(BigDecimal ediNumPrograma) {
        this.ediNumPrograma = ediNumPrograma;
    }

    public BigDecimal getEdiNumPrograma() {
        return this.ediNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiNumEmision(BigDecimal ediNumEmision) {
        this.ediNumEmision = ediNumEmision;
    }

    public BigDecimal getEdiNumEmision() {
        return this.ediNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiNumSecCapitaliza(BigDecimal ediNumSecCapitaliza) {
        this.ediNumSecCapitaliza = ediNumSecCapitaliza;
    }

    public BigDecimal getEdiNumSecCapitaliza() {
        return this.ediNumSecCapitaliza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEdiPjeCapitalizacion(BigDecimal ediPjeCapitalizacion) {
        this.ediPjeCapitalizacion = ediPjeCapitalizacion;
    }

    public BigDecimal getEdiPjeCapitalizacion() {
        return this.ediPjeCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEdiImpCapitalizacion(BigDecimal ediImpCapitalizacion) {
        this.ediImpCapitalizacion = ediImpCapitalizacion;
    }

    public BigDecimal getEdiImpCapitalizacion() {
        return this.ediImpCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdiAnoCapitalizacion(BigDecimal ediAnoCapitalizacion) {
        this.ediAnoCapitalizacion = ediAnoCapitalizacion;
    }

    public BigDecimal getEdiAnoCapitalizacion() {
        return this.ediAnoCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiMesCapitalizacion(BigDecimal ediMesCapitalizacion) {
        this.ediMesCapitalizacion = ediMesCapitalizacion;
    }

    public BigDecimal getEdiMesCapitalizacion() {
        return this.ediMesCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiDiaCapitalizacion(BigDecimal ediDiaCapitalizacion) {
        this.ediDiaCapitalizacion = ediDiaCapitalizacion;
    }

    public BigDecimal getEdiDiaCapitalizacion() {
        return this.ediDiaCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdiAnoAltaReg(BigDecimal ediAnoAltaReg) {
        this.ediAnoAltaReg = ediAnoAltaReg;
    }

    public BigDecimal getEdiAnoAltaReg() {
        return this.ediAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiMesAltaReg(BigDecimal ediMesAltaReg) {
        this.ediMesAltaReg = ediMesAltaReg;
    }

    public BigDecimal getEdiMesAltaReg() {
        return this.ediMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiDiaAltaReg(BigDecimal ediDiaAltaReg) {
        this.ediDiaAltaReg = ediDiaAltaReg;
    }

    public BigDecimal getEdiDiaAltaReg() {
        return this.ediDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdiAnoUltMod(BigDecimal ediAnoUltMod) {
        this.ediAnoUltMod = ediAnoUltMod;
    }

    public BigDecimal getEdiAnoUltMod() {
        return this.ediAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiMesUltMod(BigDecimal ediMesUltMod) {
        this.ediMesUltMod = ediMesUltMod;
    }

    public BigDecimal getEdiMesUltMod() {
        return this.ediMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiDiaUltMod(BigDecimal ediDiaUltMod) {
        this.ediDiaUltMod = ediDiaUltMod;
    }

    public BigDecimal getEdiDiaUltMod() {
        return this.ediDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdiCveStEmisicap(String ediCveStEmisicap) {
        this.ediCveStEmisicap = ediCveStEmisicap;
    }

    public String getEdiCveStEmisicap() {
        return this.ediCveStEmisicap;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISICAP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdiNumPrograma() != null && this.getEdiNumPrograma().longValue() == -999) {
            conditions += " AND EDI_NUM_PROGRAMA IS NULL";
        } else if (this.getEdiNumPrograma() != null) {
            conditions += " AND EDI_NUM_PROGRAMA = ?";
            values.add(this.getEdiNumPrograma());
        }

        if (this.getEdiNumEmision() != null && this.getEdiNumEmision().longValue() == -999) {
            conditions += " AND EDI_NUM_EMISION IS NULL";
        } else if (this.getEdiNumEmision() != null) {
            conditions += " AND EDI_NUM_EMISION = ?";
            values.add(this.getEdiNumEmision());
        }

        if (this.getEdiNumSecCapitaliza() != null && this.getEdiNumSecCapitaliza().longValue() == -999) {
            conditions += " AND EDI_NUM_SEC_CAPITALIZA IS NULL";
        } else if (this.getEdiNumSecCapitaliza() != null) {
            conditions += " AND EDI_NUM_SEC_CAPITALIZA = ?";
            values.add(this.getEdiNumSecCapitaliza());
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
        String sql = "SELECT * FROM EMISICAP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdiNumPrograma() != null && this.getEdiNumPrograma().longValue() == -999) {
            conditions += " AND EDI_NUM_PROGRAMA IS NULL";
        } else if (this.getEdiNumPrograma() != null) {
            conditions += " AND EDI_NUM_PROGRAMA = ?";
            values.add(this.getEdiNumPrograma());
        }

        if (this.getEdiNumEmision() != null && this.getEdiNumEmision().longValue() == -999) {
            conditions += " AND EDI_NUM_EMISION IS NULL";
        } else if (this.getEdiNumEmision() != null) {
            conditions += " AND EDI_NUM_EMISION = ?";
            values.add(this.getEdiNumEmision());
        }

        if (this.getEdiNumSecCapitaliza() != null && this.getEdiNumSecCapitaliza().longValue() == -999) {
            conditions += " AND EDI_NUM_SEC_CAPITALIZA IS NULL";
        } else if (this.getEdiNumSecCapitaliza() != null) {
            conditions += " AND EDI_NUM_SEC_CAPITALIZA = ?";
            values.add(this.getEdiNumSecCapitaliza());
        }

        if (this.getEdiPjeCapitalizacion() != null && this.getEdiPjeCapitalizacion().longValue() == -999) {
            conditions += " AND EDI_PJE_CAPITALIZACION IS NULL";
        } else if (this.getEdiPjeCapitalizacion() != null) {
            conditions += " AND EDI_PJE_CAPITALIZACION = ?";
            values.add(this.getEdiPjeCapitalizacion());
        }

        if (this.getEdiImpCapitalizacion() != null && this.getEdiImpCapitalizacion().longValue() == -999) {
            conditions += " AND EDI_IMP_CAPITALIZACION IS NULL";
        } else if (this.getEdiImpCapitalizacion() != null) {
            conditions += " AND EDI_IMP_CAPITALIZACION = ?";
            values.add(this.getEdiImpCapitalizacion());
        }

        if (this.getEdiAnoCapitalizacion() != null && this.getEdiAnoCapitalizacion().longValue() == -999) {
            conditions += " AND EDI_ANO_CAPITALIZACION IS NULL";
        } else if (this.getEdiAnoCapitalizacion() != null) {
            conditions += " AND EDI_ANO_CAPITALIZACION = ?";
            values.add(this.getEdiAnoCapitalizacion());
        }

        if (this.getEdiMesCapitalizacion() != null && this.getEdiMesCapitalizacion().longValue() == -999) {
            conditions += " AND EDI_MES_CAPITALIZACION IS NULL";
        } else if (this.getEdiMesCapitalizacion() != null) {
            conditions += " AND EDI_MES_CAPITALIZACION = ?";
            values.add(this.getEdiMesCapitalizacion());
        }

        if (this.getEdiDiaCapitalizacion() != null && this.getEdiDiaCapitalizacion().longValue() == -999) {
            conditions += " AND EDI_DIA_CAPITALIZACION IS NULL";
        } else if (this.getEdiDiaCapitalizacion() != null) {
            conditions += " AND EDI_DIA_CAPITALIZACION = ?";
            values.add(this.getEdiDiaCapitalizacion());
        }

        if (this.getEdiAnoAltaReg() != null && this.getEdiAnoAltaReg().longValue() == -999) {
            conditions += " AND EDI_ANO_ALTA_REG IS NULL";
        } else if (this.getEdiAnoAltaReg() != null) {
            conditions += " AND EDI_ANO_ALTA_REG = ?";
            values.add(this.getEdiAnoAltaReg());
        }

        if (this.getEdiMesAltaReg() != null && this.getEdiMesAltaReg().longValue() == -999) {
            conditions += " AND EDI_MES_ALTA_REG IS NULL";
        } else if (this.getEdiMesAltaReg() != null) {
            conditions += " AND EDI_MES_ALTA_REG = ?";
            values.add(this.getEdiMesAltaReg());
        }

        if (this.getEdiDiaAltaReg() != null && this.getEdiDiaAltaReg().longValue() == -999) {
            conditions += " AND EDI_DIA_ALTA_REG IS NULL";
        } else if (this.getEdiDiaAltaReg() != null) {
            conditions += " AND EDI_DIA_ALTA_REG = ?";
            values.add(this.getEdiDiaAltaReg());
        }

        if (this.getEdiAnoUltMod() != null && this.getEdiAnoUltMod().longValue() == -999) {
            conditions += " AND EDI_ANO_ULT_MOD IS NULL";
        } else if (this.getEdiAnoUltMod() != null) {
            conditions += " AND EDI_ANO_ULT_MOD = ?";
            values.add(this.getEdiAnoUltMod());
        }

        if (this.getEdiMesUltMod() != null && this.getEdiMesUltMod().longValue() == -999) {
            conditions += " AND EDI_MES_ULT_MOD IS NULL";
        } else if (this.getEdiMesUltMod() != null) {
            conditions += " AND EDI_MES_ULT_MOD = ?";
            values.add(this.getEdiMesUltMod());
        }

        if (this.getEdiDiaUltMod() != null && this.getEdiDiaUltMod().longValue() == -999) {
            conditions += " AND EDI_DIA_ULT_MOD IS NULL";
        } else if (this.getEdiDiaUltMod() != null) {
            conditions += " AND EDI_DIA_ULT_MOD = ?";
            values.add(this.getEdiDiaUltMod());
        }

        if (this.getEdiCveStEmisicap() != null && "null".equals(this.getEdiCveStEmisicap())) {
            conditions += " AND EDI_CVE_ST_EMISICAP IS NULL";
        } else if (this.getEdiCveStEmisicap() != null) {
            conditions += " AND EDI_CVE_ST_EMISICAP = ?";
            values.add(this.getEdiCveStEmisicap());
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
        String sql = "UPDATE EMISICAP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDI_NUM_PROGRAMA = ?";
        pkValues.add(this.getEdiNumPrograma());
        conditions += " AND EDI_NUM_EMISION = ?";
        pkValues.add(this.getEdiNumEmision());
        conditions += " AND EDI_NUM_SEC_CAPITALIZA = ?";
        pkValues.add(this.getEdiNumSecCapitaliza());
        fields += " EDI_PJE_CAPITALIZACION = ?, ";
        values.add(this.getEdiPjeCapitalizacion());
        fields += " EDI_IMP_CAPITALIZACION = ?, ";
        values.add(this.getEdiImpCapitalizacion());
        fields += " EDI_ANO_CAPITALIZACION = ?, ";
        values.add(this.getEdiAnoCapitalizacion());
        fields += " EDI_MES_CAPITALIZACION = ?, ";
        values.add(this.getEdiMesCapitalizacion());
        fields += " EDI_DIA_CAPITALIZACION = ?, ";
        values.add(this.getEdiDiaCapitalizacion());
        fields += " EDI_ANO_ALTA_REG = ?, ";
        values.add(this.getEdiAnoAltaReg());
        fields += " EDI_MES_ALTA_REG = ?, ";
        values.add(this.getEdiMesAltaReg());
        fields += " EDI_DIA_ALTA_REG = ?, ";
        values.add(this.getEdiDiaAltaReg());
        fields += " EDI_ANO_ULT_MOD = ?, ";
        values.add(this.getEdiAnoUltMod());
        fields += " EDI_MES_ULT_MOD = ?, ";
        values.add(this.getEdiMesUltMod());
        fields += " EDI_DIA_ULT_MOD = ?, ";
        values.add(this.getEdiDiaUltMod());
        fields += " EDI_CVE_ST_EMISICAP = ?, ";
        values.add(this.getEdiCveStEmisicap());
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
        String sql = "INSERT INTO EMISICAP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDI_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEdiNumPrograma());

        fields += ", EDI_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEdiNumEmision());

        fields += ", EDI_NUM_SEC_CAPITALIZA";
        fieldValues += ", ?";
        values.add(this.getEdiNumSecCapitaliza());

        fields += ", EDI_PJE_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEdiPjeCapitalizacion());

        fields += ", EDI_IMP_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEdiImpCapitalizacion());

        fields += ", EDI_ANO_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEdiAnoCapitalizacion());

        fields += ", EDI_MES_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEdiMesCapitalizacion());

        fields += ", EDI_DIA_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEdiDiaCapitalizacion());

        fields += ", EDI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdiAnoAltaReg());

        fields += ", EDI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdiMesAltaReg());

        fields += ", EDI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdiDiaAltaReg());

        fields += ", EDI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdiAnoUltMod());

        fields += ", EDI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdiMesUltMod());

        fields += ", EDI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdiDiaUltMod());

        fields += ", EDI_CVE_ST_EMISICAP";
        fieldValues += ", ?";
        values.add(this.getEdiCveStEmisicap());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISICAP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDI_NUM_PROGRAMA = ?";
        values.add(this.getEdiNumPrograma());
        conditions += " AND EDI_NUM_EMISION = ?";
        values.add(this.getEdiNumEmision());
        conditions += " AND EDI_NUM_SEC_CAPITALIZA = ?";
        values.add(this.getEdiNumSecCapitaliza());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisicap instance = (Emisicap) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdiNumPrograma().equals(instance.getEdiNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEdiNumEmision().equals(instance.getEdiNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEdiNumSecCapitaliza().equals(instance.getEdiNumSecCapitaliza()))
            equalObjects = false;
        if (equalObjects && !this.getEdiPjeCapitalizacion().equals(instance.getEdiPjeCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdiImpCapitalizacion().equals(instance.getEdiImpCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdiAnoCapitalizacion().equals(instance.getEdiAnoCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdiMesCapitalizacion().equals(instance.getEdiMesCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdiDiaCapitalizacion().equals(instance.getEdiDiaCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdiAnoAltaReg().equals(instance.getEdiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdiMesAltaReg().equals(instance.getEdiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdiDiaAltaReg().equals(instance.getEdiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdiAnoUltMod().equals(instance.getEdiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdiMesUltMod().equals(instance.getEdiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdiDiaUltMod().equals(instance.getEdiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdiCveStEmisicap().equals(instance.getEdiCveStEmisicap()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisicap result = new Emisicap();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdiNumPrograma((BigDecimal) objectData.getData("EDI_NUM_PROGRAMA"));
        result.setEdiNumEmision((BigDecimal) objectData.getData("EDI_NUM_EMISION"));
        result.setEdiNumSecCapitaliza((BigDecimal) objectData.getData("EDI_NUM_SEC_CAPITALIZA"));
        result.setEdiPjeCapitalizacion((BigDecimal) objectData.getData("EDI_PJE_CAPITALIZACION"));
        result.setEdiImpCapitalizacion((BigDecimal) objectData.getData("EDI_IMP_CAPITALIZACION"));
        result.setEdiAnoCapitalizacion((BigDecimal) objectData.getData("EDI_ANO_CAPITALIZACION"));
        result.setEdiMesCapitalizacion((BigDecimal) objectData.getData("EDI_MES_CAPITALIZACION"));
        result.setEdiDiaCapitalizacion((BigDecimal) objectData.getData("EDI_DIA_CAPITALIZACION"));
        result.setEdiAnoAltaReg((BigDecimal) objectData.getData("EDI_ANO_ALTA_REG"));
        result.setEdiMesAltaReg((BigDecimal) objectData.getData("EDI_MES_ALTA_REG"));
        result.setEdiDiaAltaReg((BigDecimal) objectData.getData("EDI_DIA_ALTA_REG"));
        result.setEdiAnoUltMod((BigDecimal) objectData.getData("EDI_ANO_ULT_MOD"));
        result.setEdiMesUltMod((BigDecimal) objectData.getData("EDI_MES_ULT_MOD"));
        result.setEdiDiaUltMod((BigDecimal) objectData.getData("EDI_DIA_ULT_MOD"));
        result.setEdiCveStEmisicap((String) objectData.getData("EDI_CVE_ST_EMISICAP"));

        return result;

    }

}
