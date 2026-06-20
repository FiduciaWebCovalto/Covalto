package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CARTERA_VENCIDA_PK", columns = { "CVE_NUM_CONTRATO", "CVE_NOM_CONTRATO", "CVE_ANO", "CVE_MES" }, sequences = { "MANUAL" })
public class CarteraVencida extends DomainObject {

    BigDecimal cveNumContrato = null;
    String cveNomContrato = null;
    BigDecimal cveAno = null;
    BigDecimal cveMes = null;
    BigDecimal cveAcumulado = null;
    BigDecimal cveVenc30 = null;
    BigDecimal cveVenc60 = null;
    BigDecimal cveVenc90 = null;
    BigDecimal cveVencM90Ejeact = null;
    BigDecimal cveVencM90Ejeant = null;

    public CarteraVencida() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCveNumContrato(BigDecimal cveNumContrato) {
        this.cveNumContrato = cveNumContrato;
    }

    public BigDecimal getCveNumContrato() {
        return this.cveNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveNomContrato(String cveNomContrato) {
        this.cveNomContrato = cveNomContrato;
    }

    public String getCveNomContrato() {
        return this.cveNomContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCveAno(BigDecimal cveAno) {
        this.cveAno = cveAno;
    }

    public BigDecimal getCveAno() {
        return this.cveAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCveMes(BigDecimal cveMes) {
        this.cveMes = cveMes;
    }

    public BigDecimal getCveMes() {
        return this.cveMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveAcumulado(BigDecimal cveAcumulado) {
        this.cveAcumulado = cveAcumulado;
    }

    public BigDecimal getCveAcumulado() {
        return this.cveAcumulado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveVenc30(BigDecimal cveVenc30) {
        this.cveVenc30 = cveVenc30;
    }

    public BigDecimal getCveVenc30() {
        return this.cveVenc30;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveVenc60(BigDecimal cveVenc60) {
        this.cveVenc60 = cveVenc60;
    }

    public BigDecimal getCveVenc60() {
        return this.cveVenc60;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveVenc90(BigDecimal cveVenc90) {
        this.cveVenc90 = cveVenc90;
    }

    public BigDecimal getCveVenc90() {
        return this.cveVenc90;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveVencM90Ejeact(BigDecimal cveVencM90Ejeact) {
        this.cveVencM90Ejeact = cveVencM90Ejeact;
    }

    public BigDecimal getCveVencM90Ejeact() {
        return this.cveVencM90Ejeact;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveVencM90Ejeant(BigDecimal cveVencM90Ejeant) {
        this.cveVencM90Ejeant = cveVencM90Ejeant;
    }

    public BigDecimal getCveVencM90Ejeant() {
        return this.cveVencM90Ejeant;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CARTERA_VENCIDA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCveNumContrato() != null && this.getCveNumContrato().longValue() == -999) {
            conditions += " AND CVE_NUM_CONTRATO IS NULL";
        } else if (this.getCveNumContrato() != null) {
            conditions += " AND CVE_NUM_CONTRATO = ?";
            values.add(this.getCveNumContrato());
        }

        if (this.getCveNomContrato() != null && "null".equals(this.getCveNomContrato())) {
            conditions += " AND CVE_NOM_CONTRATO IS NULL";
        } else if (this.getCveNomContrato() != null) {
            conditions += " AND CVE_NOM_CONTRATO = ?";
            values.add(this.getCveNomContrato());
        }

        if (this.getCveAno() != null && this.getCveAno().longValue() == -999) {
            conditions += " AND CVE_ANO IS NULL";
        } else if (this.getCveAno() != null) {
            conditions += " AND CVE_ANO = ?";
            values.add(this.getCveAno());
        }

        if (this.getCveMes() != null && this.getCveMes().longValue() == -999) {
            conditions += " AND CVE_MES IS NULL";
        } else if (this.getCveMes() != null) {
            conditions += " AND CVE_MES = ?";
            values.add(this.getCveMes());
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
        String sql = "SELECT * FROM CARTERA_VENCIDA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCveNumContrato() != null && this.getCveNumContrato().longValue() == -999) {
            conditions += " AND CVE_NUM_CONTRATO IS NULL";
        } else if (this.getCveNumContrato() != null) {
            conditions += " AND CVE_NUM_CONTRATO = ?";
            values.add(this.getCveNumContrato());
        }

        if (this.getCveNomContrato() != null && "null".equals(this.getCveNomContrato())) {
            conditions += " AND CVE_NOM_CONTRATO IS NULL";
        } else if (this.getCveNomContrato() != null) {
            conditions += " AND CVE_NOM_CONTRATO = ?";
            values.add(this.getCveNomContrato());
        }

        if (this.getCveAno() != null && this.getCveAno().longValue() == -999) {
            conditions += " AND CVE_ANO IS NULL";
        } else if (this.getCveAno() != null) {
            conditions += " AND CVE_ANO = ?";
            values.add(this.getCveAno());
        }

        if (this.getCveMes() != null && this.getCveMes().longValue() == -999) {
            conditions += " AND CVE_MES IS NULL";
        } else if (this.getCveMes() != null) {
            conditions += " AND CVE_MES = ?";
            values.add(this.getCveMes());
        }

        if (this.getCveAcumulado() != null && this.getCveAcumulado().longValue() == -999) {
            conditions += " AND CVE_ACUMULADO IS NULL";
        } else if (this.getCveAcumulado() != null) {
            conditions += " AND CVE_ACUMULADO = ?";
            values.add(this.getCveAcumulado());
        }

        if (this.getCveVenc30() != null && this.getCveVenc30().longValue() == -999) {
            conditions += " AND CVE_VENC_30 IS NULL";
        } else if (this.getCveVenc30() != null) {
            conditions += " AND CVE_VENC_30 = ?";
            values.add(this.getCveVenc30());
        }

        if (this.getCveVenc60() != null && this.getCveVenc60().longValue() == -999) {
            conditions += " AND CVE_VENC_60 IS NULL";
        } else if (this.getCveVenc60() != null) {
            conditions += " AND CVE_VENC_60 = ?";
            values.add(this.getCveVenc60());
        }

        if (this.getCveVenc90() != null && this.getCveVenc90().longValue() == -999) {
            conditions += " AND CVE_VENC_90 IS NULL";
        } else if (this.getCveVenc90() != null) {
            conditions += " AND CVE_VENC_90 = ?";
            values.add(this.getCveVenc90());
        }

        if (this.getCveVencM90Ejeact() != null && this.getCveVencM90Ejeact().longValue() == -999) {
            conditions += " AND CVE_VENC_M90_EJEACT IS NULL";
        } else if (this.getCveVencM90Ejeact() != null) {
            conditions += " AND CVE_VENC_M90_EJEACT = ?";
            values.add(this.getCveVencM90Ejeact());
        }

        if (this.getCveVencM90Ejeant() != null && this.getCveVencM90Ejeant().longValue() == -999) {
            conditions += " AND CVE_VENC_M90_EJEANT IS NULL";
        } else if (this.getCveVencM90Ejeant() != null) {
            conditions += " AND CVE_VENC_M90_EJEANT = ?";
            values.add(this.getCveVencM90Ejeant());
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
        String sql = "UPDATE CARTERA_VENCIDA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CVE_NUM_CONTRATO = ?";
        pkValues.add(this.getCveNumContrato());
        conditions += " AND CVE_NOM_CONTRATO = ?";
        pkValues.add(this.getCveNomContrato());
        conditions += " AND CVE_ANO = ?";
        pkValues.add(this.getCveAno());
        conditions += " AND CVE_MES = ?";
        pkValues.add(this.getCveMes());
        fields += " CVE_ACUMULADO = ?, ";
        values.add(this.getCveAcumulado());
        fields += " CVE_VENC_30 = ?, ";
        values.add(this.getCveVenc30());
        fields += " CVE_VENC_60 = ?, ";
        values.add(this.getCveVenc60());
        fields += " CVE_VENC_90 = ?, ";
        values.add(this.getCveVenc90());
        fields += " CVE_VENC_M90_EJEACT = ?, ";
        values.add(this.getCveVencM90Ejeact());
        fields += " CVE_VENC_M90_EJEANT = ?, ";
        values.add(this.getCveVencM90Ejeant());
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
        String sql = "INSERT INTO CARTERA_VENCIDA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CVE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCveNumContrato());

        fields += ", CVE_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCveNomContrato());

        fields += ", CVE_ANO";
        fieldValues += ", ?";
        values.add(this.getCveAno());

        fields += ", CVE_MES";
        fieldValues += ", ?";
        values.add(this.getCveMes());

        fields += ", CVE_ACUMULADO";
        fieldValues += ", ?";
        values.add(this.getCveAcumulado());

        fields += ", CVE_VENC_30";
        fieldValues += ", ?";
        values.add(this.getCveVenc30());

        fields += ", CVE_VENC_60";
        fieldValues += ", ?";
        values.add(this.getCveVenc60());

        fields += ", CVE_VENC_90";
        fieldValues += ", ?";
        values.add(this.getCveVenc90());

        fields += ", CVE_VENC_M90_EJEACT";
        fieldValues += ", ?";
        values.add(this.getCveVencM90Ejeact());

        fields += ", CVE_VENC_M90_EJEANT";
        fieldValues += ", ?";
        values.add(this.getCveVencM90Ejeant());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CARTERA_VENCIDA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CVE_NUM_CONTRATO = ?";
        values.add(this.getCveNumContrato());
        conditions += " AND CVE_NOM_CONTRATO = ?";
        values.add(this.getCveNomContrato());
        conditions += " AND CVE_ANO = ?";
        values.add(this.getCveAno());
        conditions += " AND CVE_MES = ?";
        values.add(this.getCveMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CarteraVencida instance = (CarteraVencida) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCveNumContrato().equals(instance.getCveNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCveNomContrato().equals(instance.getCveNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCveAno().equals(instance.getCveAno()))
            equalObjects = false;
        if (equalObjects && !this.getCveMes().equals(instance.getCveMes()))
            equalObjects = false;
        if (equalObjects && !this.getCveAcumulado().equals(instance.getCveAcumulado()))
            equalObjects = false;
        if (equalObjects && !this.getCveVenc30().equals(instance.getCveVenc30()))
            equalObjects = false;
        if (equalObjects && !this.getCveVenc60().equals(instance.getCveVenc60()))
            equalObjects = false;
        if (equalObjects && !this.getCveVenc90().equals(instance.getCveVenc90()))
            equalObjects = false;
        if (equalObjects && !this.getCveVencM90Ejeact().equals(instance.getCveVencM90Ejeact()))
            equalObjects = false;
        if (equalObjects && !this.getCveVencM90Ejeant().equals(instance.getCveVencM90Ejeant()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CarteraVencida result = new CarteraVencida();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCveNumContrato((BigDecimal) objectData.getData("CVE_NUM_CONTRATO"));
        result.setCveNomContrato((String) objectData.getData("CVE_NOM_CONTRATO"));
        result.setCveAno((BigDecimal) objectData.getData("CVE_ANO"));
        result.setCveMes((BigDecimal) objectData.getData("CVE_MES"));
        result.setCveAcumulado((BigDecimal) objectData.getData("CVE_ACUMULADO"));
        result.setCveVenc30((BigDecimal) objectData.getData("CVE_VENC_30"));
        result.setCveVenc60((BigDecimal) objectData.getData("CVE_VENC_60"));
        result.setCveVenc90((BigDecimal) objectData.getData("CVE_VENC_90"));
        result.setCveVencM90Ejeact((BigDecimal) objectData.getData("CVE_VENC_M90_EJEACT"));
        result.setCveVencM90Ejeant((BigDecimal) objectData.getData("CVE_VENC_M90_EJEANT"));

        return result;

    }

}
