package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "APLIERR_PK", columns = { "APE_ANO", "APE_MES", "APE_DIA", "APE_SECUENCIAL" }, sequences = { "MANUAL" })
public class Aplierr extends DomainObject {

    BigDecimal apeAno = null;
    BigDecimal apeMes = null;
    BigDecimal apeDia = null;
    BigDecimal apeSecuencial = null;
    BigDecimal apeNumContrato = null;
    String apeConcepto = null;
    BigDecimal apeEnteCargo = null;
    BigDecimal apeEnteAbono = null;
    BigDecimal apeImpMe = null;
    BigDecimal apeImpMn = null;
    BigDecimal apeNumCta = null;
    BigDecimal apeNumScta = null;
    BigDecimal apeNumSscta = null;
    BigDecimal apeNumSsscta = null;
    BigDecimal apeNumSssscta = null;
    BigDecimal apeNumSsssscta = null;

    public Aplierr() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeAno(BigDecimal apeAno) {
        this.apeAno = apeAno;
    }

    public BigDecimal getApeAno() {
        return this.apeAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApeMes(BigDecimal apeMes) {
        this.apeMes = apeMes;
    }

    public BigDecimal getApeMes() {
        return this.apeMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApeDia(BigDecimal apeDia) {
        this.apeDia = apeDia;
    }

    public BigDecimal getApeDia() {
        return this.apeDia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setApeSecuencial(BigDecimal apeSecuencial) {
        this.apeSecuencial = apeSecuencial;
    }

    public BigDecimal getApeSecuencial() {
        return this.apeSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumContrato(BigDecimal apeNumContrato) {
        this.apeNumContrato = apeNumContrato;
    }

    public BigDecimal getApeNumContrato() {
        return this.apeNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setApeConcepto(String apeConcepto) {
        this.apeConcepto = apeConcepto;
    }

    public String getApeConcepto() {
        return this.apeConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApeEnteCargo(BigDecimal apeEnteCargo) {
        this.apeEnteCargo = apeEnteCargo;
    }

    public BigDecimal getApeEnteCargo() {
        return this.apeEnteCargo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApeEnteAbono(BigDecimal apeEnteAbono) {
        this.apeEnteAbono = apeEnteAbono;
    }

    public BigDecimal getApeEnteAbono() {
        return this.apeEnteAbono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 15, scale = 0, javaClass = BigDecimal.class)
    public void setApeImpMe(BigDecimal apeImpMe) {
        this.apeImpMe = apeImpMe;
    }

    public BigDecimal getApeImpMe() {
        return this.apeImpMe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 15, scale = 0, javaClass = BigDecimal.class)
    public void setApeImpMn(BigDecimal apeImpMn) {
        this.apeImpMn = apeImpMn;
    }

    public BigDecimal getApeImpMn() {
        return this.apeImpMn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumCta(BigDecimal apeNumCta) {
        this.apeNumCta = apeNumCta;
    }

    public BigDecimal getApeNumCta() {
        return this.apeNumCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumScta(BigDecimal apeNumScta) {
        this.apeNumScta = apeNumScta;
    }

    public BigDecimal getApeNumScta() {
        return this.apeNumScta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumSscta(BigDecimal apeNumSscta) {
        this.apeNumSscta = apeNumSscta;
    }

    public BigDecimal getApeNumSscta() {
        return this.apeNumSscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumSsscta(BigDecimal apeNumSsscta) {
        this.apeNumSsscta = apeNumSsscta;
    }

    public BigDecimal getApeNumSsscta() {
        return this.apeNumSsscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumSssscta(BigDecimal apeNumSssscta) {
        this.apeNumSssscta = apeNumSssscta;
    }

    public BigDecimal getApeNumSssscta() {
        return this.apeNumSssscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApeNumSsssscta(BigDecimal apeNumSsssscta) {
        this.apeNumSsssscta = apeNumSsssscta;
    }

    public BigDecimal getApeNumSsssscta() {
        return this.apeNumSsssscta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APLIERR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApeAno() != null && this.getApeAno().longValue() == -999) {
            conditions += " AND APE_ANO IS NULL";
        } else if (this.getApeAno() != null) {
            conditions += " AND APE_ANO = ?";
            values.add(this.getApeAno());
        }

        if (this.getApeMes() != null && this.getApeMes().longValue() == -999) {
            conditions += " AND APE_MES IS NULL";
        } else if (this.getApeMes() != null) {
            conditions += " AND APE_MES = ?";
            values.add(this.getApeMes());
        }

        if (this.getApeDia() != null && this.getApeDia().longValue() == -999) {
            conditions += " AND APE_DIA IS NULL";
        } else if (this.getApeDia() != null) {
            conditions += " AND APE_DIA = ?";
            values.add(this.getApeDia());
        }

        if (this.getApeSecuencial() != null && this.getApeSecuencial().longValue() == -999) {
            conditions += " AND APE_SECUENCIAL IS NULL";
        } else if (this.getApeSecuencial() != null) {
            conditions += " AND APE_SECUENCIAL = ?";
            values.add(this.getApeSecuencial());
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
        String sql = "SELECT * FROM APLIERR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApeAno() != null && this.getApeAno().longValue() == -999) {
            conditions += " AND APE_ANO IS NULL";
        } else if (this.getApeAno() != null) {
            conditions += " AND APE_ANO = ?";
            values.add(this.getApeAno());
        }

        if (this.getApeMes() != null && this.getApeMes().longValue() == -999) {
            conditions += " AND APE_MES IS NULL";
        } else if (this.getApeMes() != null) {
            conditions += " AND APE_MES = ?";
            values.add(this.getApeMes());
        }

        if (this.getApeDia() != null && this.getApeDia().longValue() == -999) {
            conditions += " AND APE_DIA IS NULL";
        } else if (this.getApeDia() != null) {
            conditions += " AND APE_DIA = ?";
            values.add(this.getApeDia());
        }

        if (this.getApeSecuencial() != null && this.getApeSecuencial().longValue() == -999) {
            conditions += " AND APE_SECUENCIAL IS NULL";
        } else if (this.getApeSecuencial() != null) {
            conditions += " AND APE_SECUENCIAL = ?";
            values.add(this.getApeSecuencial());
        }

        if (this.getApeNumContrato() != null && this.getApeNumContrato().longValue() == -999) {
            conditions += " AND APE_NUM_CONTRATO IS NULL";
        } else if (this.getApeNumContrato() != null) {
            conditions += " AND APE_NUM_CONTRATO = ?";
            values.add(this.getApeNumContrato());
        }

        if (this.getApeConcepto() != null && "null".equals(this.getApeConcepto())) {
            conditions += " AND APE_CONCEPTO IS NULL";
        } else if (this.getApeConcepto() != null) {
            conditions += " AND APE_CONCEPTO = ?";
            values.add(this.getApeConcepto());
        }

        if (this.getApeEnteCargo() != null && this.getApeEnteCargo().longValue() == -999) {
            conditions += " AND APE_ENTE_CARGO IS NULL";
        } else if (this.getApeEnteCargo() != null) {
            conditions += " AND APE_ENTE_CARGO = ?";
            values.add(this.getApeEnteCargo());
        }

        if (this.getApeEnteAbono() != null && this.getApeEnteAbono().longValue() == -999) {
            conditions += " AND APE_ENTE_ABONO IS NULL";
        } else if (this.getApeEnteAbono() != null) {
            conditions += " AND APE_ENTE_ABONO = ?";
            values.add(this.getApeEnteAbono());
        }

        if (this.getApeImpMe() != null && this.getApeImpMe().longValue() == -999) {
            conditions += " AND APE_IMP_ME IS NULL";
        } else if (this.getApeImpMe() != null) {
            conditions += " AND APE_IMP_ME = ?";
            values.add(this.getApeImpMe());
        }

        if (this.getApeImpMn() != null && this.getApeImpMn().longValue() == -999) {
            conditions += " AND APE_IMP_MN IS NULL";
        } else if (this.getApeImpMn() != null) {
            conditions += " AND APE_IMP_MN = ?";
            values.add(this.getApeImpMn());
        }

        if (this.getApeNumCta() != null && this.getApeNumCta().longValue() == -999) {
            conditions += " AND APE_NUM_CTA IS NULL";
        } else if (this.getApeNumCta() != null) {
            conditions += " AND APE_NUM_CTA = ?";
            values.add(this.getApeNumCta());
        }

        if (this.getApeNumScta() != null && this.getApeNumScta().longValue() == -999) {
            conditions += " AND APE_NUM_SCTA IS NULL";
        } else if (this.getApeNumScta() != null) {
            conditions += " AND APE_NUM_SCTA = ?";
            values.add(this.getApeNumScta());
        }

        if (this.getApeNumSscta() != null && this.getApeNumSscta().longValue() == -999) {
            conditions += " AND APE_NUM_SSCTA IS NULL";
        } else if (this.getApeNumSscta() != null) {
            conditions += " AND APE_NUM_SSCTA = ?";
            values.add(this.getApeNumSscta());
        }

        if (this.getApeNumSsscta() != null && this.getApeNumSsscta().longValue() == -999) {
            conditions += " AND APE_NUM_SSSCTA IS NULL";
        } else if (this.getApeNumSsscta() != null) {
            conditions += " AND APE_NUM_SSSCTA = ?";
            values.add(this.getApeNumSsscta());
        }

        if (this.getApeNumSssscta() != null && this.getApeNumSssscta().longValue() == -999) {
            conditions += " AND APE_NUM_SSSSCTA IS NULL";
        } else if (this.getApeNumSssscta() != null) {
            conditions += " AND APE_NUM_SSSSCTA = ?";
            values.add(this.getApeNumSssscta());
        }

        if (this.getApeNumSsssscta() != null && this.getApeNumSsssscta().longValue() == -999) {
            conditions += " AND APE_NUM_SSSSSCTA IS NULL";
        } else if (this.getApeNumSsssscta() != null) {
            conditions += " AND APE_NUM_SSSSSCTA = ?";
            values.add(this.getApeNumSsssscta());
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
        String sql = "UPDATE APLIERR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APE_ANO = ?";
        pkValues.add(this.getApeAno());
        conditions += " AND APE_MES = ?";
        pkValues.add(this.getApeMes());
        conditions += " AND APE_DIA = ?";
        pkValues.add(this.getApeDia());
        conditions += " AND APE_SECUENCIAL = ?";
        pkValues.add(this.getApeSecuencial());
        fields += " APE_NUM_CONTRATO = ?, ";
        values.add(this.getApeNumContrato());
        fields += " APE_CONCEPTO = ?, ";
        values.add(this.getApeConcepto());
        fields += " APE_ENTE_CARGO = ?, ";
        values.add(this.getApeEnteCargo());
        fields += " APE_ENTE_ABONO = ?, ";
        values.add(this.getApeEnteAbono());
        fields += " APE_IMP_ME = ?, ";
        values.add(this.getApeImpMe());
        fields += " APE_IMP_MN = ?, ";
        values.add(this.getApeImpMn());
        fields += " APE_NUM_CTA = ?, ";
        values.add(this.getApeNumCta());
        fields += " APE_NUM_SCTA = ?, ";
        values.add(this.getApeNumScta());
        fields += " APE_NUM_SSCTA = ?, ";
        values.add(this.getApeNumSscta());
        fields += " APE_NUM_SSSCTA = ?, ";
        values.add(this.getApeNumSsscta());
        fields += " APE_NUM_SSSSCTA = ?, ";
        values.add(this.getApeNumSssscta());
        fields += " APE_NUM_SSSSSCTA = ?, ";
        values.add(this.getApeNumSsssscta());
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
        String sql = "INSERT INTO APLIERR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APE_ANO";
        fieldValues += ", ?";
        values.add(this.getApeAno());

        fields += ", APE_MES";
        fieldValues += ", ?";
        values.add(this.getApeMes());

        fields += ", APE_DIA";
        fieldValues += ", ?";
        values.add(this.getApeDia());

        fields += ", APE_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getApeSecuencial());

        fields += ", APE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getApeNumContrato());

        fields += ", APE_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getApeConcepto());

        fields += ", APE_ENTE_CARGO";
        fieldValues += ", ?";
        values.add(this.getApeEnteCargo());

        fields += ", APE_ENTE_ABONO";
        fieldValues += ", ?";
        values.add(this.getApeEnteAbono());

        fields += ", APE_IMP_ME";
        fieldValues += ", ?";
        values.add(this.getApeImpMe());

        fields += ", APE_IMP_MN";
        fieldValues += ", ?";
        values.add(this.getApeImpMn());

        fields += ", APE_NUM_CTA";
        fieldValues += ", ?";
        values.add(this.getApeNumCta());

        fields += ", APE_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getApeNumScta());

        fields += ", APE_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getApeNumSscta());

        fields += ", APE_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getApeNumSsscta());

        fields += ", APE_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getApeNumSssscta());

        fields += ", APE_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getApeNumSsssscta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM APLIERR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APE_ANO = ?";
        values.add(this.getApeAno());
        conditions += " AND APE_MES = ?";
        values.add(this.getApeMes());
        conditions += " AND APE_DIA = ?";
        values.add(this.getApeDia());
        conditions += " AND APE_SECUENCIAL = ?";
        values.add(this.getApeSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Aplierr instance = (Aplierr) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getApeAno().equals(instance.getApeAno()))
            equalObjects = false;
        if (equalObjects && !this.getApeMes().equals(instance.getApeMes()))
            equalObjects = false;
        if (equalObjects && !this.getApeDia().equals(instance.getApeDia()))
            equalObjects = false;
        if (equalObjects && !this.getApeSecuencial().equals(instance.getApeSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumContrato().equals(instance.getApeNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getApeConcepto().equals(instance.getApeConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getApeEnteCargo().equals(instance.getApeEnteCargo()))
            equalObjects = false;
        if (equalObjects && !this.getApeEnteAbono().equals(instance.getApeEnteAbono()))
            equalObjects = false;
        if (equalObjects && !this.getApeImpMe().equals(instance.getApeImpMe()))
            equalObjects = false;
        if (equalObjects && !this.getApeImpMn().equals(instance.getApeImpMn()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumCta().equals(instance.getApeNumCta()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumScta().equals(instance.getApeNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumSscta().equals(instance.getApeNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumSsscta().equals(instance.getApeNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumSssscta().equals(instance.getApeNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getApeNumSsssscta().equals(instance.getApeNumSsssscta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Aplierr result = new Aplierr();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setApeAno((BigDecimal) objectData.getData("APE_ANO"));
        result.setApeMes((BigDecimal) objectData.getData("APE_MES"));
        result.setApeDia((BigDecimal) objectData.getData("APE_DIA"));
        result.setApeSecuencial((BigDecimal) objectData.getData("APE_SECUENCIAL"));
        result.setApeNumContrato((BigDecimal) objectData.getData("APE_NUM_CONTRATO"));
        result.setApeConcepto((String) objectData.getData("APE_CONCEPTO"));
        result.setApeEnteCargo((BigDecimal) objectData.getData("APE_ENTE_CARGO"));
        result.setApeEnteAbono((BigDecimal) objectData.getData("APE_ENTE_ABONO"));
        result.setApeImpMe((BigDecimal) objectData.getData("APE_IMP_ME"));
        result.setApeImpMn((BigDecimal) objectData.getData("APE_IMP_MN"));
        result.setApeNumCta((BigDecimal) objectData.getData("APE_NUM_CTA"));
        result.setApeNumScta((BigDecimal) objectData.getData("APE_NUM_SCTA"));
        result.setApeNumSscta((BigDecimal) objectData.getData("APE_NUM_SSCTA"));
        result.setApeNumSsscta((BigDecimal) objectData.getData("APE_NUM_SSSCTA"));
        result.setApeNumSssscta((BigDecimal) objectData.getData("APE_NUM_SSSSCTA"));
        result.setApeNumSsssscta((BigDecimal) objectData.getData("APE_NUM_SSSSSCTA"));

        return result;

    }

}
