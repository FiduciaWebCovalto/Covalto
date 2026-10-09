package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AMORTIZA_PK", columns = { "AMT_NUM_CONTRATO", "AMT_NUM_DEPTO", "AMT_NUM_PARTICIP" }, sequences = { "MANUAL" })
public class Amortiza extends DomainObject {

    BigDecimal amtNumContrato = null;
    BigDecimal amtNumDepto = null;
    BigDecimal amtNumParticip = null;
    String amtCvePrestamo = null;
    String amtRefPrestamo = null;
    BigDecimal amtNumPerPresta = null;
    String amtFecAmortiza = null;
    BigDecimal amtImpPagPresta = null;
    String amtRefDoctoPago = null;
    BigDecimal amtMesAltaReg = null;
    BigDecimal amtDiaAltaReg = null;
    BigDecimal amtAnoUltMod = null;
    BigDecimal amtMesUltMod = null;
    BigDecimal amtDiaUltMod = null;
    String amtCveStAmortiz = null;

    public Amortiza() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmtNumContrato(BigDecimal amtNumContrato) {
        this.amtNumContrato = amtNumContrato;
    }

    public BigDecimal getAmtNumContrato() {
        return this.amtNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmtNumDepto(BigDecimal amtNumDepto) {
        this.amtNumDepto = amtNumDepto;
    }

    public BigDecimal getAmtNumDepto() {
        return this.amtNumDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmtNumParticip(BigDecimal amtNumParticip) {
        this.amtNumParticip = amtNumParticip;
    }

    public BigDecimal getAmtNumParticip() {
        return this.amtNumParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmtCvePrestamo(String amtCvePrestamo) {
        this.amtCvePrestamo = amtCvePrestamo;
    }

    public String getAmtCvePrestamo() {
        return this.amtCvePrestamo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmtRefPrestamo(String amtRefPrestamo) {
        this.amtRefPrestamo = amtRefPrestamo;
    }

    public String getAmtRefPrestamo() {
        return this.amtRefPrestamo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmtNumPerPresta(BigDecimal amtNumPerPresta) {
        this.amtNumPerPresta = amtNumPerPresta;
    }

    public BigDecimal getAmtNumPerPresta() {
        return this.amtNumPerPresta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmtFecAmortiza(String amtFecAmortiza) {
        this.amtFecAmortiza = amtFecAmortiza;
    }

    public String getAmtFecAmortiza() {
        return this.amtFecAmortiza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmtImpPagPresta(BigDecimal amtImpPagPresta) {
        this.amtImpPagPresta = amtImpPagPresta;
    }

    public BigDecimal getAmtImpPagPresta() {
        return this.amtImpPagPresta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmtRefDoctoPago(String amtRefDoctoPago) {
        this.amtRefDoctoPago = amtRefDoctoPago;
    }

    public String getAmtRefDoctoPago() {
        return this.amtRefDoctoPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAmtMesAltaReg(BigDecimal amtMesAltaReg) {
        this.amtMesAltaReg = amtMesAltaReg;
    }

    public BigDecimal getAmtMesAltaReg() {
        return this.amtMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAmtDiaAltaReg(BigDecimal amtDiaAltaReg) {
        this.amtDiaAltaReg = amtDiaAltaReg;
    }

    public BigDecimal getAmtDiaAltaReg() {
        return this.amtDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAmtAnoUltMod(BigDecimal amtAnoUltMod) {
        this.amtAnoUltMod = amtAnoUltMod;
    }

    public BigDecimal getAmtAnoUltMod() {
        return this.amtAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAmtMesUltMod(BigDecimal amtMesUltMod) {
        this.amtMesUltMod = amtMesUltMod;
    }

    public BigDecimal getAmtMesUltMod() {
        return this.amtMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAmtDiaUltMod(BigDecimal amtDiaUltMod) {
        this.amtDiaUltMod = amtDiaUltMod;
    }

    public BigDecimal getAmtDiaUltMod() {
        return this.amtDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmtCveStAmortiz(String amtCveStAmortiz) {
        this.amtCveStAmortiz = amtCveStAmortiz;
    }

    public String getAmtCveStAmortiz() {
        return this.amtCveStAmortiz;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AMORTIZA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAmtNumContrato() != null && this.getAmtNumContrato().longValue() == -999) {
            conditions += " AND AMT_NUM_CONTRATO IS NULL";
        } else if (this.getAmtNumContrato() != null) {
            conditions += " AND AMT_NUM_CONTRATO = ?";
            values.add(this.getAmtNumContrato());
        }

        if (this.getAmtNumDepto() != null && this.getAmtNumDepto().longValue() == -999) {
            conditions += " AND AMT_NUM_DEPTO IS NULL";
        } else if (this.getAmtNumDepto() != null) {
            conditions += " AND AMT_NUM_DEPTO = ?";
            values.add(this.getAmtNumDepto());
        }

        if (this.getAmtNumParticip() != null && this.getAmtNumParticip().longValue() == -999) {
            conditions += " AND AMT_NUM_PARTICIP IS NULL";
        } else if (this.getAmtNumParticip() != null) {
            conditions += " AND AMT_NUM_PARTICIP = ?";
            values.add(this.getAmtNumParticip());
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
        String sql = "SELECT * FROM AMORTIZA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAmtNumContrato() != null && this.getAmtNumContrato().longValue() == -999) {
            conditions += " AND AMT_NUM_CONTRATO IS NULL";
        } else if (this.getAmtNumContrato() != null) {
            conditions += " AND AMT_NUM_CONTRATO = ?";
            values.add(this.getAmtNumContrato());
        }

        if (this.getAmtNumDepto() != null && this.getAmtNumDepto().longValue() == -999) {
            conditions += " AND AMT_NUM_DEPTO IS NULL";
        } else if (this.getAmtNumDepto() != null) {
            conditions += " AND AMT_NUM_DEPTO = ?";
            values.add(this.getAmtNumDepto());
        }

        if (this.getAmtNumParticip() != null && this.getAmtNumParticip().longValue() == -999) {
            conditions += " AND AMT_NUM_PARTICIP IS NULL";
        } else if (this.getAmtNumParticip() != null) {
            conditions += " AND AMT_NUM_PARTICIP = ?";
            values.add(this.getAmtNumParticip());
        }

        if (this.getAmtCvePrestamo() != null && "null".equals(this.getAmtCvePrestamo())) {
            conditions += " AND AMT_CVE_PRESTAMO IS NULL";
        } else if (this.getAmtCvePrestamo() != null) {
            conditions += " AND AMT_CVE_PRESTAMO = ?";
            values.add(this.getAmtCvePrestamo());
        }

        if (this.getAmtRefPrestamo() != null && "null".equals(this.getAmtRefPrestamo())) {
            conditions += " AND AMT_REF_PRESTAMO IS NULL";
        } else if (this.getAmtRefPrestamo() != null) {
            conditions += " AND AMT_REF_PRESTAMO = ?";
            values.add(this.getAmtRefPrestamo());
        }

        if (this.getAmtNumPerPresta() != null && this.getAmtNumPerPresta().longValue() == -999) {
            conditions += " AND AMT_NUM_PER_PRESTA IS NULL";
        } else if (this.getAmtNumPerPresta() != null) {
            conditions += " AND AMT_NUM_PER_PRESTA = ?";
            values.add(this.getAmtNumPerPresta());
        }

        if (this.getAmtFecAmortiza() != null && "null".equals(this.getAmtFecAmortiza())) {
            conditions += " AND AMT_FEC_AMORTIZA IS NULL";
        } else if (this.getAmtFecAmortiza() != null) {
            conditions += " AND AMT_FEC_AMORTIZA = ?";
            values.add(this.getAmtFecAmortiza());
        }

        if (this.getAmtImpPagPresta() != null && this.getAmtImpPagPresta().longValue() == -999) {
            conditions += " AND AMT_IMP_PAG_PRESTA IS NULL";
        } else if (this.getAmtImpPagPresta() != null) {
            conditions += " AND AMT_IMP_PAG_PRESTA = ?";
            values.add(this.getAmtImpPagPresta());
        }

        if (this.getAmtRefDoctoPago() != null && "null".equals(this.getAmtRefDoctoPago())) {
            conditions += " AND AMT_REF_DOCTO_PAGO IS NULL";
        } else if (this.getAmtRefDoctoPago() != null) {
            conditions += " AND AMT_REF_DOCTO_PAGO = ?";
            values.add(this.getAmtRefDoctoPago());
        }

        if (this.getAmtMesAltaReg() != null && this.getAmtMesAltaReg().longValue() == -999) {
            conditions += " AND AMT_MES_ALTA_REG IS NULL";
        } else if (this.getAmtMesAltaReg() != null) {
            conditions += " AND AMT_MES_ALTA_REG = ?";
            values.add(this.getAmtMesAltaReg());
        }

        if (this.getAmtDiaAltaReg() != null && this.getAmtDiaAltaReg().longValue() == -999) {
            conditions += " AND AMT_DIA_ALTA_REG IS NULL";
        } else if (this.getAmtDiaAltaReg() != null) {
            conditions += " AND AMT_DIA_ALTA_REG = ?";
            values.add(this.getAmtDiaAltaReg());
        }

        if (this.getAmtAnoUltMod() != null && this.getAmtAnoUltMod().longValue() == -999) {
            conditions += " AND AMT_ANO_ULT_MOD IS NULL";
        } else if (this.getAmtAnoUltMod() != null) {
            conditions += " AND AMT_ANO_ULT_MOD = ?";
            values.add(this.getAmtAnoUltMod());
        }

        if (this.getAmtMesUltMod() != null && this.getAmtMesUltMod().longValue() == -999) {
            conditions += " AND AMT_MES_ULT_MOD IS NULL";
        } else if (this.getAmtMesUltMod() != null) {
            conditions += " AND AMT_MES_ULT_MOD = ?";
            values.add(this.getAmtMesUltMod());
        }

        if (this.getAmtDiaUltMod() != null && this.getAmtDiaUltMod().longValue() == -999) {
            conditions += " AND AMT_DIA_ULT_MOD IS NULL";
        } else if (this.getAmtDiaUltMod() != null) {
            conditions += " AND AMT_DIA_ULT_MOD = ?";
            values.add(this.getAmtDiaUltMod());
        }

        if (this.getAmtCveStAmortiz() != null && "null".equals(this.getAmtCveStAmortiz())) {
            conditions += " AND AMT_CVE_ST_AMORTIZ IS NULL";
        } else if (this.getAmtCveStAmortiz() != null) {
            conditions += " AND AMT_CVE_ST_AMORTIZ = ?";
            values.add(this.getAmtCveStAmortiz());
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
        String sql = "UPDATE AMORTIZA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AMT_NUM_CONTRATO = ?";
        pkValues.add(this.getAmtNumContrato());
        conditions += " AND AMT_NUM_DEPTO = ?";
        pkValues.add(this.getAmtNumDepto());
        conditions += " AND AMT_NUM_PARTICIP = ?";
        pkValues.add(this.getAmtNumParticip());
        fields += " AMT_CVE_PRESTAMO = ?, ";
        values.add(this.getAmtCvePrestamo());
        fields += " AMT_REF_PRESTAMO = ?, ";
        values.add(this.getAmtRefPrestamo());
        fields += " AMT_NUM_PER_PRESTA = ?, ";
        values.add(this.getAmtNumPerPresta());
        fields += " AMT_FEC_AMORTIZA = ?, ";
        values.add(this.getAmtFecAmortiza());
        fields += " AMT_IMP_PAG_PRESTA = ?, ";
        values.add(this.getAmtImpPagPresta());
        fields += " AMT_REF_DOCTO_PAGO = ?, ";
        values.add(this.getAmtRefDoctoPago());
        fields += " AMT_MES_ALTA_REG = ?, ";
        values.add(this.getAmtMesAltaReg());
        fields += " AMT_DIA_ALTA_REG = ?, ";
        values.add(this.getAmtDiaAltaReg());
        fields += " AMT_ANO_ULT_MOD = ?, ";
        values.add(this.getAmtAnoUltMod());
        fields += " AMT_MES_ULT_MOD = ?, ";
        values.add(this.getAmtMesUltMod());
        fields += " AMT_DIA_ULT_MOD = ?, ";
        values.add(this.getAmtDiaUltMod());
        fields += " AMT_CVE_ST_AMORTIZ = ?, ";
        values.add(this.getAmtCveStAmortiz());
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
        String sql = "INSERT INTO AMORTIZA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AMT_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAmtNumContrato());

        fields += ", AMT_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getAmtNumDepto());

        fields += ", AMT_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getAmtNumParticip());

        fields += ", AMT_CVE_PRESTAMO";
        fieldValues += ", ?";
        values.add(this.getAmtCvePrestamo());

        fields += ", AMT_REF_PRESTAMO";
        fieldValues += ", ?";
        values.add(this.getAmtRefPrestamo());

        fields += ", AMT_NUM_PER_PRESTA";
        fieldValues += ", ?";
        values.add(this.getAmtNumPerPresta());

        fields += ", AMT_FEC_AMORTIZA";
        fieldValues += ", ?";
        values.add(this.getAmtFecAmortiza());

        fields += ", AMT_IMP_PAG_PRESTA";
        fieldValues += ", ?";
        values.add(this.getAmtImpPagPresta());

        fields += ", AMT_REF_DOCTO_PAGO";
        fieldValues += ", ?";
        values.add(this.getAmtRefDoctoPago());

        fields += ", AMT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAmtMesAltaReg());

        fields += ", AMT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAmtDiaAltaReg());

        fields += ", AMT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAmtAnoUltMod());

        fields += ", AMT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAmtMesUltMod());

        fields += ", AMT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAmtDiaUltMod());

        fields += ", AMT_CVE_ST_AMORTIZ";
        fieldValues += ", ?";
        values.add(this.getAmtCveStAmortiz());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AMORTIZA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AMT_NUM_CONTRATO = ?";
        values.add(this.getAmtNumContrato());
        conditions += " AND AMT_NUM_DEPTO = ?";
        values.add(this.getAmtNumDepto());
        conditions += " AND AMT_NUM_PARTICIP = ?";
        values.add(this.getAmtNumParticip());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Amortiza instance = (Amortiza) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAmtNumContrato().equals(instance.getAmtNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAmtNumDepto().equals(instance.getAmtNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getAmtNumParticip().equals(instance.getAmtNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getAmtCvePrestamo().equals(instance.getAmtCvePrestamo()))
            equalObjects = false;
        if (equalObjects && !this.getAmtRefPrestamo().equals(instance.getAmtRefPrestamo()))
            equalObjects = false;
        if (equalObjects && !this.getAmtNumPerPresta().equals(instance.getAmtNumPerPresta()))
            equalObjects = false;
        if (equalObjects && !this.getAmtFecAmortiza().equals(instance.getAmtFecAmortiza()))
            equalObjects = false;
        if (equalObjects && !this.getAmtImpPagPresta().equals(instance.getAmtImpPagPresta()))
            equalObjects = false;
        if (equalObjects && !this.getAmtRefDoctoPago().equals(instance.getAmtRefDoctoPago()))
            equalObjects = false;
        if (equalObjects && !this.getAmtMesAltaReg().equals(instance.getAmtMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAmtDiaAltaReg().equals(instance.getAmtDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAmtAnoUltMod().equals(instance.getAmtAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAmtMesUltMod().equals(instance.getAmtMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAmtDiaUltMod().equals(instance.getAmtDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAmtCveStAmortiz().equals(instance.getAmtCveStAmortiz()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Amortiza result = new Amortiza();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAmtNumContrato((BigDecimal) objectData.getData("AMT_NUM_CONTRATO"));
        result.setAmtNumDepto((BigDecimal) objectData.getData("AMT_NUM_DEPTO"));
        result.setAmtNumParticip((BigDecimal) objectData.getData("AMT_NUM_PARTICIP"));
        result.setAmtCvePrestamo((String) objectData.getData("AMT_CVE_PRESTAMO"));
        result.setAmtRefPrestamo((String) objectData.getData("AMT_REF_PRESTAMO"));
        result.setAmtNumPerPresta((BigDecimal) objectData.getData("AMT_NUM_PER_PRESTA"));
        result.setAmtFecAmortiza((String) objectData.getData("AMT_FEC_AMORTIZA"));
        result.setAmtImpPagPresta((BigDecimal) objectData.getData("AMT_IMP_PAG_PRESTA"));
        result.setAmtRefDoctoPago((String) objectData.getData("AMT_REF_DOCTO_PAGO"));
        result.setAmtMesAltaReg((BigDecimal) objectData.getData("AMT_MES_ALTA_REG"));
        result.setAmtDiaAltaReg((BigDecimal) objectData.getData("AMT_DIA_ALTA_REG"));
        result.setAmtAnoUltMod((BigDecimal) objectData.getData("AMT_ANO_ULT_MOD"));
        result.setAmtMesUltMod((BigDecimal) objectData.getData("AMT_MES_ULT_MOD"));
        result.setAmtDiaUltMod((BigDecimal) objectData.getData("AMT_DIA_ULT_MOD"));
        result.setAmtCveStAmortiz((String) objectData.getData("AMT_CVE_ST_AMORTIZ"));

        return result;

    }

}
