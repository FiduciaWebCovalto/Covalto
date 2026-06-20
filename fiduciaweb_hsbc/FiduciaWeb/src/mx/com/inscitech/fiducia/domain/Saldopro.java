package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SALDOPRO_PK", columns = { "SPR_SUB_CONTRATO", "SPR_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Saldopro extends DomainObject {

    BigDecimal sprNumContrato = null;
    BigDecimal sprSubContrato = null;
    BigDecimal sprImpSaldoAcum = null;
    BigDecimal sprNumDiasAcum = null;
    BigDecimal sprAnoAltaReg = null;
    BigDecimal sprMesAltaReg = null;
    BigDecimal sprDiaAltaReg = null;
    BigDecimal sprAnoUltMod = null;
    BigDecimal sprMesUltMod = null;
    BigDecimal sprDiaUltMod = null;
    String sprCveStSaldopr = null;

    public Saldopro() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSprNumContrato(BigDecimal sprNumContrato) {
        this.sprNumContrato = sprNumContrato;
    }

    public BigDecimal getSprNumContrato() {
        return this.sprNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSprSubContrato(BigDecimal sprSubContrato) {
        this.sprSubContrato = sprSubContrato;
    }

    public BigDecimal getSprSubContrato() {
        return this.sprSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSprImpSaldoAcum(BigDecimal sprImpSaldoAcum) {
        this.sprImpSaldoAcum = sprImpSaldoAcum;
    }

    public BigDecimal getSprImpSaldoAcum() {
        return this.sprImpSaldoAcum;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSprNumDiasAcum(BigDecimal sprNumDiasAcum) {
        this.sprNumDiasAcum = sprNumDiasAcum;
    }

    public BigDecimal getSprNumDiasAcum() {
        return this.sprNumDiasAcum;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSprAnoAltaReg(BigDecimal sprAnoAltaReg) {
        this.sprAnoAltaReg = sprAnoAltaReg;
    }

    public BigDecimal getSprAnoAltaReg() {
        return this.sprAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprMesAltaReg(BigDecimal sprMesAltaReg) {
        this.sprMesAltaReg = sprMesAltaReg;
    }

    public BigDecimal getSprMesAltaReg() {
        return this.sprMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprDiaAltaReg(BigDecimal sprDiaAltaReg) {
        this.sprDiaAltaReg = sprDiaAltaReg;
    }

    public BigDecimal getSprDiaAltaReg() {
        return this.sprDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSprAnoUltMod(BigDecimal sprAnoUltMod) {
        this.sprAnoUltMod = sprAnoUltMod;
    }

    public BigDecimal getSprAnoUltMod() {
        return this.sprAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprMesUltMod(BigDecimal sprMesUltMod) {
        this.sprMesUltMod = sprMesUltMod;
    }

    public BigDecimal getSprMesUltMod() {
        return this.sprMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprDiaUltMod(BigDecimal sprDiaUltMod) {
        this.sprDiaUltMod = sprDiaUltMod;
    }

    public BigDecimal getSprDiaUltMod() {
        return this.sprDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSprCveStSaldopr(String sprCveStSaldopr) {
        this.sprCveStSaldopr = sprCveStSaldopr;
    }

    public String getSprCveStSaldopr() {
        return this.sprCveStSaldopr;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SALDOPRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSprNumContrato() != null && this.getSprNumContrato().longValue() == -999) {
            conditions += " AND SPR_NUM_CONTRATO IS NULL";
        } else if (this.getSprNumContrato() != null) {
            conditions += " AND SPR_NUM_CONTRATO = ?";
            values.add(this.getSprNumContrato());
        }

        if (this.getSprSubContrato() != null && this.getSprSubContrato().longValue() == -999) {
            conditions += " AND SPR_SUB_CONTRATO IS NULL";
        } else if (this.getSprSubContrato() != null) {
            conditions += " AND SPR_SUB_CONTRATO = ?";
            values.add(this.getSprSubContrato());
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
        String sql = "SELECT * FROM SALDOPRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSprNumContrato() != null && this.getSprNumContrato().longValue() == -999) {
            conditions += " AND SPR_NUM_CONTRATO IS NULL";
        } else if (this.getSprNumContrato() != null) {
            conditions += " AND SPR_NUM_CONTRATO = ?";
            values.add(this.getSprNumContrato());
        }

        if (this.getSprSubContrato() != null && this.getSprSubContrato().longValue() == -999) {
            conditions += " AND SPR_SUB_CONTRATO IS NULL";
        } else if (this.getSprSubContrato() != null) {
            conditions += " AND SPR_SUB_CONTRATO = ?";
            values.add(this.getSprSubContrato());
        }

        if (this.getSprImpSaldoAcum() != null && this.getSprImpSaldoAcum().longValue() == -999) {
            conditions += " AND SPR_IMP_SALDO_ACUM IS NULL";
        } else if (this.getSprImpSaldoAcum() != null) {
            conditions += " AND SPR_IMP_SALDO_ACUM = ?";
            values.add(this.getSprImpSaldoAcum());
        }

        if (this.getSprNumDiasAcum() != null && this.getSprNumDiasAcum().longValue() == -999) {
            conditions += " AND SPR_NUM_DIAS_ACUM IS NULL";
        } else if (this.getSprNumDiasAcum() != null) {
            conditions += " AND SPR_NUM_DIAS_ACUM = ?";
            values.add(this.getSprNumDiasAcum());
        }

        if (this.getSprAnoAltaReg() != null && this.getSprAnoAltaReg().longValue() == -999) {
            conditions += " AND SPR_ANO_ALTA_REG IS NULL";
        } else if (this.getSprAnoAltaReg() != null) {
            conditions += " AND SPR_ANO_ALTA_REG = ?";
            values.add(this.getSprAnoAltaReg());
        }

        if (this.getSprMesAltaReg() != null && this.getSprMesAltaReg().longValue() == -999) {
            conditions += " AND SPR_MES_ALTA_REG IS NULL";
        } else if (this.getSprMesAltaReg() != null) {
            conditions += " AND SPR_MES_ALTA_REG = ?";
            values.add(this.getSprMesAltaReg());
        }

        if (this.getSprDiaAltaReg() != null && this.getSprDiaAltaReg().longValue() == -999) {
            conditions += " AND SPR_DIA_ALTA_REG IS NULL";
        } else if (this.getSprDiaAltaReg() != null) {
            conditions += " AND SPR_DIA_ALTA_REG = ?";
            values.add(this.getSprDiaAltaReg());
        }

        if (this.getSprAnoUltMod() != null && this.getSprAnoUltMod().longValue() == -999) {
            conditions += " AND SPR_ANO_ULT_MOD IS NULL";
        } else if (this.getSprAnoUltMod() != null) {
            conditions += " AND SPR_ANO_ULT_MOD = ?";
            values.add(this.getSprAnoUltMod());
        }

        if (this.getSprMesUltMod() != null && this.getSprMesUltMod().longValue() == -999) {
            conditions += " AND SPR_MES_ULT_MOD IS NULL";
        } else if (this.getSprMesUltMod() != null) {
            conditions += " AND SPR_MES_ULT_MOD = ?";
            values.add(this.getSprMesUltMod());
        }

        if (this.getSprDiaUltMod() != null && this.getSprDiaUltMod().longValue() == -999) {
            conditions += " AND SPR_DIA_ULT_MOD IS NULL";
        } else if (this.getSprDiaUltMod() != null) {
            conditions += " AND SPR_DIA_ULT_MOD = ?";
            values.add(this.getSprDiaUltMod());
        }

        if (this.getSprCveStSaldopr() != null && "null".equals(this.getSprCveStSaldopr())) {
            conditions += " AND SPR_CVE_ST_SALDOPR IS NULL";
        } else if (this.getSprCveStSaldopr() != null) {
            conditions += " AND SPR_CVE_ST_SALDOPR = ?";
            values.add(this.getSprCveStSaldopr());
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
        String sql = "UPDATE SALDOPRO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SPR_NUM_CONTRATO = ?";
        pkValues.add(this.getSprNumContrato());
        conditions += " AND SPR_SUB_CONTRATO = ?";
        pkValues.add(this.getSprSubContrato());
        fields += " SPR_IMP_SALDO_ACUM = ?, ";
        values.add(this.getSprImpSaldoAcum());
        fields += " SPR_NUM_DIAS_ACUM = ?, ";
        values.add(this.getSprNumDiasAcum());
        fields += " SPR_ANO_ALTA_REG = ?, ";
        values.add(this.getSprAnoAltaReg());
        fields += " SPR_MES_ALTA_REG = ?, ";
        values.add(this.getSprMesAltaReg());
        fields += " SPR_DIA_ALTA_REG = ?, ";
        values.add(this.getSprDiaAltaReg());
        fields += " SPR_ANO_ULT_MOD = ?, ";
        values.add(this.getSprAnoUltMod());
        fields += " SPR_MES_ULT_MOD = ?, ";
        values.add(this.getSprMesUltMod());
        fields += " SPR_DIA_ULT_MOD = ?, ";
        values.add(this.getSprDiaUltMod());
        fields += " SPR_CVE_ST_SALDOPR = ?, ";
        values.add(this.getSprCveStSaldopr());
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
        String sql = "INSERT INTO SALDOPRO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SPR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSprNumContrato());

        fields += ", SPR_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSprSubContrato());

        fields += ", SPR_IMP_SALDO_ACUM";
        fieldValues += ", ?";
        values.add(this.getSprImpSaldoAcum());

        fields += ", SPR_NUM_DIAS_ACUM";
        fieldValues += ", ?";
        values.add(this.getSprNumDiasAcum());

        fields += ", SPR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSprAnoAltaReg());

        fields += ", SPR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSprMesAltaReg());

        fields += ", SPR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSprDiaAltaReg());

        fields += ", SPR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSprAnoUltMod());

        fields += ", SPR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSprMesUltMod());

        fields += ", SPR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSprDiaUltMod());

        fields += ", SPR_CVE_ST_SALDOPR";
        fieldValues += ", ?";
        values.add(this.getSprCveStSaldopr());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SALDOPRO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SPR_NUM_CONTRATO = ?";
        values.add(this.getSprNumContrato());
        conditions += " AND SPR_SUB_CONTRATO = ?";
        values.add(this.getSprSubContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Saldopro instance = (Saldopro) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSprNumContrato().equals(instance.getSprNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSprSubContrato().equals(instance.getSprSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSprImpSaldoAcum().equals(instance.getSprImpSaldoAcum()))
            equalObjects = false;
        if (equalObjects && !this.getSprNumDiasAcum().equals(instance.getSprNumDiasAcum()))
            equalObjects = false;
        if (equalObjects && !this.getSprAnoAltaReg().equals(instance.getSprAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSprMesAltaReg().equals(instance.getSprMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSprDiaAltaReg().equals(instance.getSprDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSprAnoUltMod().equals(instance.getSprAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSprMesUltMod().equals(instance.getSprMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSprDiaUltMod().equals(instance.getSprDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSprCveStSaldopr().equals(instance.getSprCveStSaldopr()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Saldopro result = new Saldopro();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSprNumContrato((BigDecimal) objectData.getData("SPR_NUM_CONTRATO"));
        result.setSprSubContrato((BigDecimal) objectData.getData("SPR_SUB_CONTRATO"));
        result.setSprImpSaldoAcum((BigDecimal) objectData.getData("SPR_IMP_SALDO_ACUM"));
        result.setSprNumDiasAcum((BigDecimal) objectData.getData("SPR_NUM_DIAS_ACUM"));
        result.setSprAnoAltaReg((BigDecimal) objectData.getData("SPR_ANO_ALTA_REG"));
        result.setSprMesAltaReg((BigDecimal) objectData.getData("SPR_MES_ALTA_REG"));
        result.setSprDiaAltaReg((BigDecimal) objectData.getData("SPR_DIA_ALTA_REG"));
        result.setSprAnoUltMod((BigDecimal) objectData.getData("SPR_ANO_ULT_MOD"));
        result.setSprMesUltMod((BigDecimal) objectData.getData("SPR_MES_ULT_MOD"));
        result.setSprDiaUltMod((BigDecimal) objectData.getData("SPR_DIA_ULT_MOD"));
        result.setSprCveStSaldopr((String) objectData.getData("SPR_CVE_ST_SALDOPR"));

        return result;

    }

}
