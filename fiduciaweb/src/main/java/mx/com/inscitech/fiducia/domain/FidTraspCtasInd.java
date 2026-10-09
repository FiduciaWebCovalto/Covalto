package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_TRASP_CTAS_IND", columns = { "TRAS_FOLIO", "TRAS_CONTRATO" }, sequences = { "MANUAL" })
public class FidTraspCtasInd extends DomainObject {

    BigDecimal trasContrato = null;
    BigDecimal trasFolio = null;
    String trasFecOpe = null;
    String trasCveInv1 = null;
    String trasCveInv2 = null;
    BigDecimal trasImporte = null;
    String trasMotivo = null;
    String trasFecAlta = null;
    String trasFecUltMod = null;
    String trasCveStatus = null;

    public FidTraspCtasInd() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrasContrato(BigDecimal trasContrato) {
        this.trasContrato = trasContrato;
    }

    public BigDecimal getTrasContrato() {
        return this.trasContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrasFolio(BigDecimal trasFolio) {
        this.trasFolio = trasFolio;
    }

    public BigDecimal getTrasFolio() {
        return this.trasFolio;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setTrasFecOpe(String trasFecOpe) {
        this.trasFecOpe = trasFecOpe;
    }

    public String getTrasFecOpe() {
        return this.trasFecOpe;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrasCveInv1(String trasCveInv1) {
        this.trasCveInv1 = trasCveInv1;
    }

    public String getTrasCveInv1() {
        return this.trasCveInv1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrasCveInv2(String trasCveInv2) {
        this.trasCveInv2 = trasCveInv2;
    }

    public String getTrasCveInv2() {
        return this.trasCveInv2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 32, scale = 5, javaClass = BigDecimal.class)
    public void setTrasImporte(BigDecimal trasImporte) {
        this.trasImporte = trasImporte;
    }

    public BigDecimal getTrasImporte() {
        return this.trasImporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrasMotivo(String trasMotivo) {
        this.trasMotivo = trasMotivo;
    }

    public String getTrasMotivo() {
        return this.trasMotivo;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setTrasFecAlta(String trasFecAlta) {
        this.trasFecAlta = trasFecAlta;
    }

    public String getTrasFecAlta() {
        return this.trasFecAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setTrasFecUltMod(String trasFecUltMod) {
        this.trasFecUltMod = trasFecUltMod;
    }

    public String getTrasFecUltMod() {
        return this.trasFecUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrasCveStatus(String trasCveStatus) {
        this.trasCveStatus = trasCveStatus;
    }

    public String getTrasCveStatus() {
        return this.trasCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_TRASP_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrasContrato() != null && this.getTrasContrato().longValue() == -999) {
            conditions += " AND TRAS_CONTRATO IS NULL";
        } else if (this.getTrasContrato() != null) {
            conditions += " AND TRAS_CONTRATO = ?";
            values.add(this.getTrasContrato());
        }

        if (this.getTrasFolio() != null && this.getTrasFolio().longValue() == -999) {
            conditions += " AND TRAS_FOLIO IS NULL";
        } else if (this.getTrasFolio() != null) {
            conditions += " AND TRAS_FOLIO = ?";
            values.add(this.getTrasFolio());
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
        String sql = "SELECT * FROM FID_TRASP_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrasContrato() != null && this.getTrasContrato().longValue() == -999) {
            conditions += " AND TRAS_CONTRATO IS NULL";
        } else if (this.getTrasContrato() != null) {
            conditions += " AND TRAS_CONTRATO = ?";
            values.add(this.getTrasContrato());
        }

        if (this.getTrasFolio() != null && this.getTrasFolio().longValue() == -999) {
            conditions += " AND TRAS_FOLIO IS NULL";
        } else if (this.getTrasFolio() != null) {
            conditions += " AND TRAS_FOLIO = ?";
            values.add(this.getTrasFolio());
        }

        if (this.getTrasFecOpe() != null && "null".equals(this.getTrasFecOpe())) {
            conditions += " AND TRAS_FEC_OPE IS NULL";
        } else if (this.getTrasFecOpe() != null) {
            conditions += " AND TRAS_FEC_OPE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTrasFecOpe());
        }

        if (this.getTrasCveInv1() != null && "null".equals(this.getTrasCveInv1())) {
            conditions += " AND TRAS_CVE_INV_1 IS NULL";
        } else if (this.getTrasCveInv1() != null) {
            conditions += " AND TRAS_CVE_INV_1 = ?";
            values.add(this.getTrasCveInv1());
        }

        if (this.getTrasCveInv2() != null && "null".equals(this.getTrasCveInv2())) {
            conditions += " AND TRAS_CVE_INV_2 IS NULL";
        } else if (this.getTrasCveInv2() != null) {
            conditions += " AND TRAS_CVE_INV_2 = ?";
            values.add(this.getTrasCveInv2());
        }

        if (this.getTrasImporte() != null && this.getTrasImporte().longValue() == -999) {
            conditions += " AND TRAS_IMPORTE IS NULL";
        } else if (this.getTrasImporte() != null) {
            conditions += " AND TRAS_IMPORTE = ?";
            values.add(this.getTrasImporte());
        }

        if (this.getTrasMotivo() != null && "null".equals(this.getTrasMotivo())) {
            conditions += " AND TRAS_MOTIVO IS NULL";
        } else if (this.getTrasMotivo() != null) {
            conditions += " AND TRAS_MOTIVO = ?";
            values.add(this.getTrasMotivo());
        }

        if (this.getTrasFecAlta() != null && "null".equals(this.getTrasFecAlta())) {
            conditions += " AND TRAS_FEC_ALTA IS NULL";
        } else if (this.getTrasFecAlta() != null) {
            conditions += " AND TRAS_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTrasFecAlta());
        }

        if (this.getTrasFecUltMod() != null && "null".equals(this.getTrasFecUltMod())) {
            conditions += " AND TRAS_FEC_ULT_MOD IS NULL";
        } else if (this.getTrasFecUltMod() != null) {
            conditions += " AND TRAS_FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTrasFecUltMod());
        }

        if (this.getTrasCveStatus() != null && "null".equals(this.getTrasCveStatus())) {
            conditions += " AND TRAS_CVE_STATUS IS NULL";
        } else if (this.getTrasCveStatus() != null) {
            conditions += " AND TRAS_CVE_STATUS = ?";
            values.add(this.getTrasCveStatus());
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
        String sql = "UPDATE FID_TRASP_CTAS_IND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRAS_CONTRATO = ?";
        pkValues.add(this.getTrasContrato());
        conditions += " AND TRAS_FOLIO = ?";
        pkValues.add(this.getTrasFolio());
        fields += " TRAS_FEC_OPE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTrasFecOpe());
        fields += " TRAS_CVE_INV_1 = ?, ";
        values.add(this.getTrasCveInv1());
        fields += " TRAS_CVE_INV_2 = ?, ";
        values.add(this.getTrasCveInv2());
        fields += " TRAS_IMPORTE = ?, ";
        values.add(this.getTrasImporte());
        fields += " TRAS_MOTIVO = ?, ";
        values.add(this.getTrasMotivo());
        fields += " TRAS_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTrasFecAlta());
        fields += " TRAS_FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTrasFecUltMod());
        fields += " TRAS_CVE_STATUS = ?, ";
        values.add(this.getTrasCveStatus());
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
        String sql = "INSERT INTO FID_TRASP_CTAS_IND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRAS_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTrasContrato());

        fields += ", TRAS_FOLIO";
        fieldValues += ", ?";
        values.add(this.getTrasFolio());

        fields += ", TRAS_FEC_OPE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTrasFecOpe());

        fields += ", TRAS_CVE_INV_1";
        fieldValues += ", ?";
        values.add(this.getTrasCveInv1());

        fields += ", TRAS_CVE_INV_2";
        fieldValues += ", ?";
        values.add(this.getTrasCveInv2());

        fields += ", TRAS_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getTrasImporte());

        fields += ", TRAS_MOTIVO";
        fieldValues += ", ?";
        values.add(this.getTrasMotivo());

        fields += ", TRAS_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTrasFecAlta());

        fields += ", TRAS_FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTrasFecUltMod());

        fields += ", TRAS_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getTrasCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_TRASP_CTAS_IND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRAS_CONTRATO = ?";
        values.add(this.getTrasContrato());
        conditions += " AND TRAS_FOLIO = ?";
        values.add(this.getTrasFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidTraspCtasInd instance = (FidTraspCtasInd) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTrasContrato().equals(instance.getTrasContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTrasFolio().equals(instance.getTrasFolio()))
            equalObjects = false;
        if (equalObjects && !this.getTrasFecOpe().equals(instance.getTrasFecOpe()))
            equalObjects = false;
        if (equalObjects && !this.getTrasCveInv1().equals(instance.getTrasCveInv1()))
            equalObjects = false;
        if (equalObjects && !this.getTrasCveInv2().equals(instance.getTrasCveInv2()))
            equalObjects = false;
        if (equalObjects && !this.getTrasImporte().equals(instance.getTrasImporte()))
            equalObjects = false;
        if (equalObjects && !this.getTrasMotivo().equals(instance.getTrasMotivo()))
            equalObjects = false;
        if (equalObjects && !this.getTrasFecAlta().equals(instance.getTrasFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getTrasFecUltMod().equals(instance.getTrasFecUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrasCveStatus().equals(instance.getTrasCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidTraspCtasInd result = new FidTraspCtasInd();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTrasContrato((BigDecimal) objectData.getData("TRAS_CONTRATO"));
        result.setTrasFolio((BigDecimal) objectData.getData("TRAS_FOLIO"));
        result.setTrasFecOpe((String) objectData.getData("TRAS_FEC_OPE"));
        result.setTrasCveInv1((String) objectData.getData("TRAS_CVE_INV_1"));
        result.setTrasCveInv2((String) objectData.getData("TRAS_CVE_INV_2"));
        result.setTrasImporte((BigDecimal) objectData.getData("TRAS_IMPORTE"));
        result.setTrasMotivo((String) objectData.getData("TRAS_MOTIVO"));
        result.setTrasFecAlta((String) objectData.getData("TRAS_FEC_ALTA"));
        result.setTrasFecUltMod((String) objectData.getData("TRAS_FEC_ULT_MOD"));
        result.setTrasCveStatus((String) objectData.getData("TRAS_CVE_STATUS"));

        return result;

    }

}
