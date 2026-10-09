package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRANSFCT_PK",
            columns =
            { "TRF_NUM_CONTRATO", "TRF_SUB_CONTRATO", "TRF_ENTIDAD_FIN", "TRF_CONTRATO_INTER", "TRF_NUM_CONTRATO_T", "TRF_SUB_CONTRATO_T", "TRF_ENTIDAD_FIN_T", "TRF_CTO_INTER_T"
    }, sequences = { "MANUAL" })
public class Transfct extends DomainObject {

    BigDecimal trfNumContrato = null;
    BigDecimal trfSubContrato = null;
    BigDecimal trfEntidadFin = null;
    BigDecimal trfContratoInter = null;
    BigDecimal trfNumContratoT = null;
    BigDecimal trfSubContratoT = null;
    BigDecimal trfEntidadFinT = null;
    BigDecimal trfCtoInterT = null;
    BigDecimal trfPjeTransfer = null;
    String trfCveStTransfct = null;

    public Transfct() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfNumContrato(BigDecimal trfNumContrato) {
        this.trfNumContrato = trfNumContrato;
    }

    public BigDecimal getTrfNumContrato() {
        return this.trfNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfSubContrato(BigDecimal trfSubContrato) {
        this.trfSubContrato = trfSubContrato;
    }

    public BigDecimal getTrfSubContrato() {
        return this.trfSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfEntidadFin(BigDecimal trfEntidadFin) {
        this.trfEntidadFin = trfEntidadFin;
    }

    public BigDecimal getTrfEntidadFin() {
        return this.trfEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfContratoInter(BigDecimal trfContratoInter) {
        this.trfContratoInter = trfContratoInter;
    }

    public BigDecimal getTrfContratoInter() {
        return this.trfContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfNumContratoT(BigDecimal trfNumContratoT) {
        this.trfNumContratoT = trfNumContratoT;
    }

    public BigDecimal getTrfNumContratoT() {
        return this.trfNumContratoT;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfSubContratoT(BigDecimal trfSubContratoT) {
        this.trfSubContratoT = trfSubContratoT;
    }

    public BigDecimal getTrfSubContratoT() {
        return this.trfSubContratoT;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfEntidadFinT(BigDecimal trfEntidadFinT) {
        this.trfEntidadFinT = trfEntidadFinT;
    }

    public BigDecimal getTrfEntidadFinT() {
        return this.trfEntidadFinT;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfCtoInterT(BigDecimal trfCtoInterT) {
        this.trfCtoInterT = trfCtoInterT;
    }

    public BigDecimal getTrfCtoInterT() {
        return this.trfCtoInterT;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setTrfPjeTransfer(BigDecimal trfPjeTransfer) {
        this.trfPjeTransfer = trfPjeTransfer;
    }

    public BigDecimal getTrfPjeTransfer() {
        return this.trfPjeTransfer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrfCveStTransfct(String trfCveStTransfct) {
        this.trfCveStTransfct = trfCveStTransfct;
    }

    public String getTrfCveStTransfct() {
        return this.trfCveStTransfct;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRANSFCT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrfNumContrato() != null && this.getTrfNumContrato().longValue() == -999) {
            conditions += " AND TRF_NUM_CONTRATO IS NULL";
        } else if (this.getTrfNumContrato() != null) {
            conditions += " AND TRF_NUM_CONTRATO = ?";
            values.add(this.getTrfNumContrato());
        }

        if (this.getTrfSubContrato() != null && this.getTrfSubContrato().longValue() == -999) {
            conditions += " AND TRF_SUB_CONTRATO IS NULL";
        } else if (this.getTrfSubContrato() != null) {
            conditions += " AND TRF_SUB_CONTRATO = ?";
            values.add(this.getTrfSubContrato());
        }

        if (this.getTrfEntidadFin() != null && this.getTrfEntidadFin().longValue() == -999) {
            conditions += " AND TRF_ENTIDAD_FIN IS NULL";
        } else if (this.getTrfEntidadFin() != null) {
            conditions += " AND TRF_ENTIDAD_FIN = ?";
            values.add(this.getTrfEntidadFin());
        }

        if (this.getTrfContratoInter() != null && this.getTrfContratoInter().longValue() == -999) {
            conditions += " AND TRF_CONTRATO_INTER IS NULL";
        } else if (this.getTrfContratoInter() != null) {
            conditions += " AND TRF_CONTRATO_INTER = ?";
            values.add(this.getTrfContratoInter());
        }

        if (this.getTrfNumContratoT() != null && this.getTrfNumContratoT().longValue() == -999) {
            conditions += " AND TRF_NUM_CONTRATO_T IS NULL";
        } else if (this.getTrfNumContratoT() != null) {
            conditions += " AND TRF_NUM_CONTRATO_T = ?";
            values.add(this.getTrfNumContratoT());
        }

        if (this.getTrfSubContratoT() != null && this.getTrfSubContratoT().longValue() == -999) {
            conditions += " AND TRF_SUB_CONTRATO_T IS NULL";
        } else if (this.getTrfSubContratoT() != null) {
            conditions += " AND TRF_SUB_CONTRATO_T = ?";
            values.add(this.getTrfSubContratoT());
        }

        if (this.getTrfEntidadFinT() != null && this.getTrfEntidadFinT().longValue() == -999) {
            conditions += " AND TRF_ENTIDAD_FIN_T IS NULL";
        } else if (this.getTrfEntidadFinT() != null) {
            conditions += " AND TRF_ENTIDAD_FIN_T = ?";
            values.add(this.getTrfEntidadFinT());
        }

        if (this.getTrfCtoInterT() != null && this.getTrfCtoInterT().longValue() == -999) {
            conditions += " AND TRF_CTO_INTER_T IS NULL";
        } else if (this.getTrfCtoInterT() != null) {
            conditions += " AND TRF_CTO_INTER_T = ?";
            values.add(this.getTrfCtoInterT());
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
        String sql = "SELECT * FROM TRANSFCT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrfNumContrato() != null && this.getTrfNumContrato().longValue() == -999) {
            conditions += " AND TRF_NUM_CONTRATO IS NULL";
        } else if (this.getTrfNumContrato() != null) {
            conditions += " AND TRF_NUM_CONTRATO = ?";
            values.add(this.getTrfNumContrato());
        }

        if (this.getTrfSubContrato() != null && this.getTrfSubContrato().longValue() == -999) {
            conditions += " AND TRF_SUB_CONTRATO IS NULL";
        } else if (this.getTrfSubContrato() != null) {
            conditions += " AND TRF_SUB_CONTRATO = ?";
            values.add(this.getTrfSubContrato());
        }

        if (this.getTrfEntidadFin() != null && this.getTrfEntidadFin().longValue() == -999) {
            conditions += " AND TRF_ENTIDAD_FIN IS NULL";
        } else if (this.getTrfEntidadFin() != null) {
            conditions += " AND TRF_ENTIDAD_FIN = ?";
            values.add(this.getTrfEntidadFin());
        }

        if (this.getTrfContratoInter() != null && this.getTrfContratoInter().longValue() == -999) {
            conditions += " AND TRF_CONTRATO_INTER IS NULL";
        } else if (this.getTrfContratoInter() != null) {
            conditions += " AND TRF_CONTRATO_INTER = ?";
            values.add(this.getTrfContratoInter());
        }

        if (this.getTrfNumContratoT() != null && this.getTrfNumContratoT().longValue() == -999) {
            conditions += " AND TRF_NUM_CONTRATO_T IS NULL";
        } else if (this.getTrfNumContratoT() != null) {
            conditions += " AND TRF_NUM_CONTRATO_T = ?";
            values.add(this.getTrfNumContratoT());
        }

        if (this.getTrfSubContratoT() != null && this.getTrfSubContratoT().longValue() == -999) {
            conditions += " AND TRF_SUB_CONTRATO_T IS NULL";
        } else if (this.getTrfSubContratoT() != null) {
            conditions += " AND TRF_SUB_CONTRATO_T = ?";
            values.add(this.getTrfSubContratoT());
        }

        if (this.getTrfEntidadFinT() != null && this.getTrfEntidadFinT().longValue() == -999) {
            conditions += " AND TRF_ENTIDAD_FIN_T IS NULL";
        } else if (this.getTrfEntidadFinT() != null) {
            conditions += " AND TRF_ENTIDAD_FIN_T = ?";
            values.add(this.getTrfEntidadFinT());
        }

        if (this.getTrfCtoInterT() != null && this.getTrfCtoInterT().longValue() == -999) {
            conditions += " AND TRF_CTO_INTER_T IS NULL";
        } else if (this.getTrfCtoInterT() != null) {
            conditions += " AND TRF_CTO_INTER_T = ?";
            values.add(this.getTrfCtoInterT());
        }

        if (this.getTrfPjeTransfer() != null && this.getTrfPjeTransfer().longValue() == -999) {
            conditions += " AND TRF_PJE_TRANSFER IS NULL";
        } else if (this.getTrfPjeTransfer() != null) {
            conditions += " AND TRF_PJE_TRANSFER = ?";
            values.add(this.getTrfPjeTransfer());
        }

        if (this.getTrfCveStTransfct() != null && "null".equals(this.getTrfCveStTransfct())) {
            conditions += " AND TRF_CVE_ST_TRANSFCT IS NULL";
        } else if (this.getTrfCveStTransfct() != null) {
            conditions += " AND TRF_CVE_ST_TRANSFCT = ?";
            values.add(this.getTrfCveStTransfct());
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
        String sql = "UPDATE TRANSFCT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRF_NUM_CONTRATO = ?";
        pkValues.add(this.getTrfNumContrato());
        conditions += " AND TRF_SUB_CONTRATO = ?";
        pkValues.add(this.getTrfSubContrato());
        conditions += " AND TRF_ENTIDAD_FIN = ?";
        pkValues.add(this.getTrfEntidadFin());
        conditions += " AND TRF_CONTRATO_INTER = ?";
        pkValues.add(this.getTrfContratoInter());
        conditions += " AND TRF_NUM_CONTRATO_T = ?";
        pkValues.add(this.getTrfNumContratoT());
        conditions += " AND TRF_SUB_CONTRATO_T = ?";
        pkValues.add(this.getTrfSubContratoT());
        conditions += " AND TRF_ENTIDAD_FIN_T = ?";
        pkValues.add(this.getTrfEntidadFinT());
        conditions += " AND TRF_CTO_INTER_T = ?";
        pkValues.add(this.getTrfCtoInterT());
        fields += " TRF_PJE_TRANSFER = ?, ";
        values.add(this.getTrfPjeTransfer());
        fields += " TRF_CVE_ST_TRANSFCT = ?, ";
        values.add(this.getTrfCveStTransfct());
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
        String sql = "INSERT INTO TRANSFCT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRF_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTrfNumContrato());

        fields += ", TRF_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTrfSubContrato());

        fields += ", TRF_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getTrfEntidadFin());

        fields += ", TRF_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getTrfContratoInter());

        fields += ", TRF_NUM_CONTRATO_T";
        fieldValues += ", ?";
        values.add(this.getTrfNumContratoT());

        fields += ", TRF_SUB_CONTRATO_T";
        fieldValues += ", ?";
        values.add(this.getTrfSubContratoT());

        fields += ", TRF_ENTIDAD_FIN_T";
        fieldValues += ", ?";
        values.add(this.getTrfEntidadFinT());

        fields += ", TRF_CTO_INTER_T";
        fieldValues += ", ?";
        values.add(this.getTrfCtoInterT());

        fields += ", TRF_PJE_TRANSFER";
        fieldValues += ", ?";
        values.add(this.getTrfPjeTransfer());

        fields += ", TRF_CVE_ST_TRANSFCT";
        fieldValues += ", ?";
        values.add(this.getTrfCveStTransfct());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRANSFCT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRF_NUM_CONTRATO = ?";
        values.add(this.getTrfNumContrato());
        conditions += " AND TRF_SUB_CONTRATO = ?";
        values.add(this.getTrfSubContrato());
        conditions += " AND TRF_ENTIDAD_FIN = ?";
        values.add(this.getTrfEntidadFin());
        conditions += " AND TRF_CONTRATO_INTER = ?";
        values.add(this.getTrfContratoInter());
        conditions += " AND TRF_NUM_CONTRATO_T = ?";
        values.add(this.getTrfNumContratoT());
        conditions += " AND TRF_SUB_CONTRATO_T = ?";
        values.add(this.getTrfSubContratoT());
        conditions += " AND TRF_ENTIDAD_FIN_T = ?";
        values.add(this.getTrfEntidadFinT());
        conditions += " AND TRF_CTO_INTER_T = ?";
        values.add(this.getTrfCtoInterT());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Transfct instance = (Transfct) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTrfNumContrato().equals(instance.getTrfNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTrfSubContrato().equals(instance.getTrfSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTrfEntidadFin().equals(instance.getTrfEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getTrfContratoInter().equals(instance.getTrfContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getTrfNumContratoT().equals(instance.getTrfNumContratoT()))
            equalObjects = false;
        if (equalObjects && !this.getTrfSubContratoT().equals(instance.getTrfSubContratoT()))
            equalObjects = false;
        if (equalObjects && !this.getTrfEntidadFinT().equals(instance.getTrfEntidadFinT()))
            equalObjects = false;
        if (equalObjects && !this.getTrfCtoInterT().equals(instance.getTrfCtoInterT()))
            equalObjects = false;
        if (equalObjects && !this.getTrfPjeTransfer().equals(instance.getTrfPjeTransfer()))
            equalObjects = false;
        if (equalObjects && !this.getTrfCveStTransfct().equals(instance.getTrfCveStTransfct()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Transfct result = new Transfct();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTrfNumContrato((BigDecimal) objectData.getData("TRF_NUM_CONTRATO"));
        result.setTrfSubContrato((BigDecimal) objectData.getData("TRF_SUB_CONTRATO"));
        result.setTrfEntidadFin((BigDecimal) objectData.getData("TRF_ENTIDAD_FIN"));
        result.setTrfContratoInter((BigDecimal) objectData.getData("TRF_CONTRATO_INTER"));
        result.setTrfNumContratoT((BigDecimal) objectData.getData("TRF_NUM_CONTRATO_T"));
        result.setTrfSubContratoT((BigDecimal) objectData.getData("TRF_SUB_CONTRATO_T"));
        result.setTrfEntidadFinT((BigDecimal) objectData.getData("TRF_ENTIDAD_FIN_T"));
        result.setTrfCtoInterT((BigDecimal) objectData.getData("TRF_CTO_INTER_T"));
        result.setTrfPjeTransfer((BigDecimal) objectData.getData("TRF_PJE_TRANSFER"));
        result.setTrfCveStTransfct((String) objectData.getData("TRF_CVE_ST_TRANSFCT"));

        return result;

    }

}
