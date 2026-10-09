package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_MOV_CTAS_IND", columns = { "MOV_CONTRATO", "MOV_CLAVE_INV", "MOV_SECUENCIAL", "MOV_FEC_OPER" }, sequences = { "MANUAL" })
public class FidMovCtasInd extends DomainObject {

    BigDecimal movContrato = null;
    String movClaveInv = null;
    BigDecimal movSecuencial = null;
    String movFecOper = null;
    String movTipoOper = null;
    BigDecimal movImporte = null;
    String movFecAlta = null;
    String movFecUltMod = null;
    String movEstatus = null;

    public FidMovCtasInd() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovContrato(BigDecimal movContrato) {
        this.movContrato = movContrato;
    }

    public BigDecimal getMovContrato() {
        return this.movContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovClaveInv(String movClaveInv) {
        this.movClaveInv = movClaveInv;
    }

    public String getMovClaveInv() {
        return this.movClaveInv;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovSecuencial(BigDecimal movSecuencial) {
        this.movSecuencial = movSecuencial;
    }

    public BigDecimal getMovSecuencial() {
        return this.movSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setMovFecOper(String movFecOper) {
        this.movFecOper = movFecOper;
    }

    public String getMovFecOper() {
        return this.movFecOper;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovTipoOper(String movTipoOper) {
        this.movTipoOper = movTipoOper;
    }

    public String getMovTipoOper() {
        return this.movTipoOper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 8, javaClass = BigDecimal.class)
    public void setMovImporte(BigDecimal movImporte) {
        this.movImporte = movImporte;
    }

    public BigDecimal getMovImporte() {
        return this.movImporte;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setMovFecAlta(String movFecAlta) {
        this.movFecAlta = movFecAlta;
    }

    public String getMovFecAlta() {
        return this.movFecAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setMovFecUltMod(String movFecUltMod) {
        this.movFecUltMod = movFecUltMod;
    }

    public String getMovFecUltMod() {
        return this.movFecUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovEstatus(String movEstatus) {
        this.movEstatus = movEstatus;
    }

    public String getMovEstatus() {
        return this.movEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_MOV_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMovContrato() != null && this.getMovContrato().longValue() == -999) {
            conditions += " AND MOV_CONTRATO IS NULL";
        } else if (this.getMovContrato() != null) {
            conditions += " AND MOV_CONTRATO = ?";
            values.add(this.getMovContrato());
        }

        if (this.getMovClaveInv() != null && "null".equals(this.getMovClaveInv())) {
            conditions += " AND MOV_CLAVE_INV IS NULL";
        } else if (this.getMovClaveInv() != null) {
            conditions += " AND MOV_CLAVE_INV = ?";
            values.add(this.getMovClaveInv());
        }

        if (this.getMovSecuencial() != null && this.getMovSecuencial().longValue() == -999) {
            conditions += " AND MOV_SECUENCIAL IS NULL";
        } else if (this.getMovSecuencial() != null) {
            conditions += " AND MOV_SECUENCIAL = ?";
            values.add(this.getMovSecuencial());
        }

        if (this.getMovFecOper() != null && "null".equals(this.getMovFecOper())) {
            conditions += " AND MOV_FEC_OPER IS NULL";
        } else if (this.getMovFecOper() != null) {
            conditions += " AND MOV_FEC_OPER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getMovFecOper());
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
        String sql = "SELECT * FROM FID_MOV_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMovContrato() != null && this.getMovContrato().longValue() == -999) {
            conditions += " AND MOV_CONTRATO IS NULL";
        } else if (this.getMovContrato() != null) {
            conditions += " AND MOV_CONTRATO = ?";
            values.add(this.getMovContrato());
        }

        if (this.getMovClaveInv() != null && "null".equals(this.getMovClaveInv())) {
            conditions += " AND MOV_CLAVE_INV IS NULL";
        } else if (this.getMovClaveInv() != null) {
            conditions += " AND MOV_CLAVE_INV = ?";
            values.add(this.getMovClaveInv());
        }

        if (this.getMovSecuencial() != null && this.getMovSecuencial().longValue() == -999) {
            conditions += " AND MOV_SECUENCIAL IS NULL";
        } else if (this.getMovSecuencial() != null) {
            conditions += " AND MOV_SECUENCIAL = ?";
            values.add(this.getMovSecuencial());
        }

        if (this.getMovFecOper() != null && "null".equals(this.getMovFecOper())) {
            conditions += " AND MOV_FEC_OPER IS NULL";
        } else if (this.getMovFecOper() != null) {
            conditions += " AND MOV_FEC_OPER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getMovFecOper());
        }

        if (this.getMovTipoOper() != null && "null".equals(this.getMovTipoOper())) {
            conditions += " AND MOV_TIPO_OPER IS NULL";
        } else if (this.getMovTipoOper() != null) {
            conditions += " AND MOV_TIPO_OPER = ?";
            values.add(this.getMovTipoOper());
        }

        if (this.getMovImporte() != null && this.getMovImporte().longValue() == -999) {
            conditions += " AND MOV_IMPORTE IS NULL";
        } else if (this.getMovImporte() != null) {
            conditions += " AND MOV_IMPORTE = ?";
            values.add(this.getMovImporte());
        }

        if (this.getMovFecAlta() != null && "null".equals(this.getMovFecAlta())) {
            conditions += " AND MOV_FEC_ALTA IS NULL";
        } else if (this.getMovFecAlta() != null) {
            conditions += " AND MOV_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getMovFecAlta());
        }

        if (this.getMovFecUltMod() != null && "null".equals(this.getMovFecUltMod())) {
            conditions += " AND MOV_FEC_ULT_MOD IS NULL";
        } else if (this.getMovFecUltMod() != null) {
            conditions += " AND MOV_FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getMovFecUltMod());
        }

        if (this.getMovEstatus() != null && "null".equals(this.getMovEstatus())) {
            conditions += " AND MOV_ESTATUS IS NULL";
        } else if (this.getMovEstatus() != null) {
            conditions += " AND MOV_ESTATUS = ?";
            values.add(this.getMovEstatus());
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
        String sql = "UPDATE FID_MOV_CTAS_IND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MOV_CONTRATO = ?";
        pkValues.add(this.getMovContrato());
        conditions += " AND MOV_CLAVE_INV = ?";
        pkValues.add(this.getMovClaveInv());
        conditions += " AND MOV_SECUENCIAL = ?";
        pkValues.add(this.getMovSecuencial());
        conditions += " AND MOV_FEC_OPER = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getMovFecOper());
        fields += " MOV_TIPO_OPER = ?, ";
        values.add(this.getMovTipoOper());
        fields += " MOV_IMPORTE = ?, ";
        values.add(this.getMovImporte());
        fields += " MOV_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getMovFecAlta());
        fields += " MOV_FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getMovFecUltMod());
        fields += " MOV_ESTATUS = ?, ";
        values.add(this.getMovEstatus());
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
        String sql = "INSERT INTO FID_MOV_CTAS_IND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MOV_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getMovContrato());

        fields += ", MOV_CLAVE_INV";
        fieldValues += ", ?";
        values.add(this.getMovClaveInv());

        fields += ", MOV_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getMovSecuencial());

        fields += ", MOV_FEC_OPER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getMovFecOper());

        fields += ", MOV_TIPO_OPER";
        fieldValues += ", ?";
        values.add(this.getMovTipoOper());

        fields += ", MOV_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getMovImporte());

        fields += ", MOV_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getMovFecAlta());

        fields += ", MOV_FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getMovFecUltMod());

        fields += ", MOV_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getMovEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_MOV_CTAS_IND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MOV_CONTRATO = ?";
        values.add(this.getMovContrato());
        conditions += " AND MOV_CLAVE_INV = ?";
        values.add(this.getMovClaveInv());
        conditions += " AND MOV_SECUENCIAL = ?";
        values.add(this.getMovSecuencial());
        conditions += " AND MOV_FEC_OPER = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getMovFecOper());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidMovCtasInd instance = (FidMovCtasInd) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMovContrato().equals(instance.getMovContrato()))
            equalObjects = false;
        if (equalObjects && !this.getMovClaveInv().equals(instance.getMovClaveInv()))
            equalObjects = false;
        if (equalObjects && !this.getMovSecuencial().equals(instance.getMovSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getMovFecOper().equals(instance.getMovFecOper()))
            equalObjects = false;
        if (equalObjects && !this.getMovTipoOper().equals(instance.getMovTipoOper()))
            equalObjects = false;
        if (equalObjects && !this.getMovImporte().equals(instance.getMovImporte()))
            equalObjects = false;
        if (equalObjects && !this.getMovFecAlta().equals(instance.getMovFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getMovFecUltMod().equals(instance.getMovFecUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMovEstatus().equals(instance.getMovEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidMovCtasInd result = new FidMovCtasInd();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMovContrato((BigDecimal) objectData.getData("MOV_CONTRATO"));
        result.setMovClaveInv((String) objectData.getData("MOV_CLAVE_INV"));
        result.setMovSecuencial((BigDecimal) objectData.getData("MOV_SECUENCIAL"));
        result.setMovFecOper((String) objectData.getData("MOV_FEC_OPER"));
        result.setMovTipoOper((String) objectData.getData("MOV_TIPO_OPER"));
        result.setMovImporte((BigDecimal) objectData.getData("MOV_IMPORTE"));
        result.setMovFecAlta((String) objectData.getData("MOV_FEC_ALTA"));
        result.setMovFecUltMod((String) objectData.getData("MOV_FEC_ULT_MOD"));
        result.setMovEstatus((String) objectData.getData("MOV_ESTATUS"));

        return result;

    }

}
