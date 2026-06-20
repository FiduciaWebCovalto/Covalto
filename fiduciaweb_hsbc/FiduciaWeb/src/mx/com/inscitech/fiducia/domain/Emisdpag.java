package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISDPAG_PK", columns = { "EDA_NUM_PROGRAMA", "EDA_NUM_EMISION", "EDA_NUM_SEC_PERIODO" }, sequences = { "MANUAL" })
public class Emisdpag extends DomainObject {

    BigDecimal edaNumPrograma = null;
    BigDecimal edaNumEmision = null;
    BigDecimal edaNumSecPeriodo = null;
    BigDecimal edaImpPeriodo = null;
    BigDecimal edaAnoPago = null;
    BigDecimal edaMesPago = null;
    BigDecimal edaDiaPago = null;
    BigDecimal edaAnoAltaReg = null;
    BigDecimal edaMesAltaReg = null;
    BigDecimal edaDiaAltaReg = null;
    BigDecimal edaAnoUltMod = null;
    BigDecimal edaMesUltMod = null;
    BigDecimal edaDiaUltMod = null;
    String edaCveStEmisdpag = null;

    public Emisdpag() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdaNumPrograma(BigDecimal edaNumPrograma) {
        this.edaNumPrograma = edaNumPrograma;
    }

    public BigDecimal getEdaNumPrograma() {
        return this.edaNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdaNumEmision(BigDecimal edaNumEmision) {
        this.edaNumEmision = edaNumEmision;
    }

    public BigDecimal getEdaNumEmision() {
        return this.edaNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdaNumSecPeriodo(BigDecimal edaNumSecPeriodo) {
        this.edaNumSecPeriodo = edaNumSecPeriodo;
    }

    public BigDecimal getEdaNumSecPeriodo() {
        return this.edaNumSecPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEdaImpPeriodo(BigDecimal edaImpPeriodo) {
        this.edaImpPeriodo = edaImpPeriodo;
    }

    public BigDecimal getEdaImpPeriodo() {
        return this.edaImpPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdaAnoPago(BigDecimal edaAnoPago) {
        this.edaAnoPago = edaAnoPago;
    }

    public BigDecimal getEdaAnoPago() {
        return this.edaAnoPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdaMesPago(BigDecimal edaMesPago) {
        this.edaMesPago = edaMesPago;
    }

    public BigDecimal getEdaMesPago() {
        return this.edaMesPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdaDiaPago(BigDecimal edaDiaPago) {
        this.edaDiaPago = edaDiaPago;
    }

    public BigDecimal getEdaDiaPago() {
        return this.edaDiaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdaAnoAltaReg(BigDecimal edaAnoAltaReg) {
        this.edaAnoAltaReg = edaAnoAltaReg;
    }

    public BigDecimal getEdaAnoAltaReg() {
        return this.edaAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdaMesAltaReg(BigDecimal edaMesAltaReg) {
        this.edaMesAltaReg = edaMesAltaReg;
    }

    public BigDecimal getEdaMesAltaReg() {
        return this.edaMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdaDiaAltaReg(BigDecimal edaDiaAltaReg) {
        this.edaDiaAltaReg = edaDiaAltaReg;
    }

    public BigDecimal getEdaDiaAltaReg() {
        return this.edaDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdaAnoUltMod(BigDecimal edaAnoUltMod) {
        this.edaAnoUltMod = edaAnoUltMod;
    }

    public BigDecimal getEdaAnoUltMod() {
        return this.edaAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdaMesUltMod(BigDecimal edaMesUltMod) {
        this.edaMesUltMod = edaMesUltMod;
    }

    public BigDecimal getEdaMesUltMod() {
        return this.edaMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdaDiaUltMod(BigDecimal edaDiaUltMod) {
        this.edaDiaUltMod = edaDiaUltMod;
    }

    public BigDecimal getEdaDiaUltMod() {
        return this.edaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdaCveStEmisdpag(String edaCveStEmisdpag) {
        this.edaCveStEmisdpag = edaCveStEmisdpag;
    }

    public String getEdaCveStEmisdpag() {
        return this.edaCveStEmisdpag;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISDPAG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdaNumPrograma() != null && this.getEdaNumPrograma().longValue() == -999) {
            conditions += " AND EDA_NUM_PROGRAMA IS NULL";
        } else if (this.getEdaNumPrograma() != null) {
            conditions += " AND EDA_NUM_PROGRAMA = ?";
            values.add(this.getEdaNumPrograma());
        }

        if (this.getEdaNumEmision() != null && this.getEdaNumEmision().longValue() == -999) {
            conditions += " AND EDA_NUM_EMISION IS NULL";
        } else if (this.getEdaNumEmision() != null) {
            conditions += " AND EDA_NUM_EMISION = ?";
            values.add(this.getEdaNumEmision());
        }

        if (this.getEdaNumSecPeriodo() != null && this.getEdaNumSecPeriodo().longValue() == -999) {
            conditions += " AND EDA_NUM_SEC_PERIODO IS NULL";
        } else if (this.getEdaNumSecPeriodo() != null) {
            conditions += " AND EDA_NUM_SEC_PERIODO = ?";
            values.add(this.getEdaNumSecPeriodo());
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
        String sql = "SELECT * FROM EMISDPAG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdaNumPrograma() != null && this.getEdaNumPrograma().longValue() == -999) {
            conditions += " AND EDA_NUM_PROGRAMA IS NULL";
        } else if (this.getEdaNumPrograma() != null) {
            conditions += " AND EDA_NUM_PROGRAMA = ?";
            values.add(this.getEdaNumPrograma());
        }

        if (this.getEdaNumEmision() != null && this.getEdaNumEmision().longValue() == -999) {
            conditions += " AND EDA_NUM_EMISION IS NULL";
        } else if (this.getEdaNumEmision() != null) {
            conditions += " AND EDA_NUM_EMISION = ?";
            values.add(this.getEdaNumEmision());
        }

        if (this.getEdaNumSecPeriodo() != null && this.getEdaNumSecPeriodo().longValue() == -999) {
            conditions += " AND EDA_NUM_SEC_PERIODO IS NULL";
        } else if (this.getEdaNumSecPeriodo() != null) {
            conditions += " AND EDA_NUM_SEC_PERIODO = ?";
            values.add(this.getEdaNumSecPeriodo());
        }

        if (this.getEdaImpPeriodo() != null && this.getEdaImpPeriodo().longValue() == -999) {
            conditions += " AND EDA_IMP_PERIODO IS NULL";
        } else if (this.getEdaImpPeriodo() != null) {
            conditions += " AND EDA_IMP_PERIODO = ?";
            values.add(this.getEdaImpPeriodo());
        }

        if (this.getEdaAnoPago() != null && this.getEdaAnoPago().longValue() == -999) {
            conditions += " AND EDA_ANO_PAGO IS NULL";
        } else if (this.getEdaAnoPago() != null) {
            conditions += " AND EDA_ANO_PAGO = ?";
            values.add(this.getEdaAnoPago());
        }

        if (this.getEdaMesPago() != null && this.getEdaMesPago().longValue() == -999) {
            conditions += " AND EDA_MES_PAGO IS NULL";
        } else if (this.getEdaMesPago() != null) {
            conditions += " AND EDA_MES_PAGO = ?";
            values.add(this.getEdaMesPago());
        }

        if (this.getEdaDiaPago() != null && this.getEdaDiaPago().longValue() == -999) {
            conditions += " AND EDA_DIA_PAGO IS NULL";
        } else if (this.getEdaDiaPago() != null) {
            conditions += " AND EDA_DIA_PAGO = ?";
            values.add(this.getEdaDiaPago());
        }

        if (this.getEdaAnoAltaReg() != null && this.getEdaAnoAltaReg().longValue() == -999) {
            conditions += " AND EDA_ANO_ALTA_REG IS NULL";
        } else if (this.getEdaAnoAltaReg() != null) {
            conditions += " AND EDA_ANO_ALTA_REG = ?";
            values.add(this.getEdaAnoAltaReg());
        }

        if (this.getEdaMesAltaReg() != null && this.getEdaMesAltaReg().longValue() == -999) {
            conditions += " AND EDA_MES_ALTA_REG IS NULL";
        } else if (this.getEdaMesAltaReg() != null) {
            conditions += " AND EDA_MES_ALTA_REG = ?";
            values.add(this.getEdaMesAltaReg());
        }

        if (this.getEdaDiaAltaReg() != null && this.getEdaDiaAltaReg().longValue() == -999) {
            conditions += " AND EDA_DIA_ALTA_REG IS NULL";
        } else if (this.getEdaDiaAltaReg() != null) {
            conditions += " AND EDA_DIA_ALTA_REG = ?";
            values.add(this.getEdaDiaAltaReg());
        }

        if (this.getEdaAnoUltMod() != null && this.getEdaAnoUltMod().longValue() == -999) {
            conditions += " AND EDA_ANO_ULT_MOD IS NULL";
        } else if (this.getEdaAnoUltMod() != null) {
            conditions += " AND EDA_ANO_ULT_MOD = ?";
            values.add(this.getEdaAnoUltMod());
        }

        if (this.getEdaMesUltMod() != null && this.getEdaMesUltMod().longValue() == -999) {
            conditions += " AND EDA_MES_ULT_MOD IS NULL";
        } else if (this.getEdaMesUltMod() != null) {
            conditions += " AND EDA_MES_ULT_MOD = ?";
            values.add(this.getEdaMesUltMod());
        }

        if (this.getEdaDiaUltMod() != null && this.getEdaDiaUltMod().longValue() == -999) {
            conditions += " AND EDA_DIA_ULT_MOD IS NULL";
        } else if (this.getEdaDiaUltMod() != null) {
            conditions += " AND EDA_DIA_ULT_MOD = ?";
            values.add(this.getEdaDiaUltMod());
        }

        if (this.getEdaCveStEmisdpag() != null && "null".equals(this.getEdaCveStEmisdpag())) {
            conditions += " AND EDA_CVE_ST_EMISDPAG IS NULL";
        } else if (this.getEdaCveStEmisdpag() != null) {
            conditions += " AND EDA_CVE_ST_EMISDPAG = ?";
            values.add(this.getEdaCveStEmisdpag());
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
        String sql = "UPDATE EMISDPAG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDA_NUM_PROGRAMA = ?";
        pkValues.add(this.getEdaNumPrograma());
        conditions += " AND EDA_NUM_EMISION = ?";
        pkValues.add(this.getEdaNumEmision());
        conditions += " AND EDA_NUM_SEC_PERIODO = ?";
        pkValues.add(this.getEdaNumSecPeriodo());
        fields += " EDA_IMP_PERIODO = ?, ";
        values.add(this.getEdaImpPeriodo());
        fields += " EDA_ANO_PAGO = ?, ";
        values.add(this.getEdaAnoPago());
        fields += " EDA_MES_PAGO = ?, ";
        values.add(this.getEdaMesPago());
        fields += " EDA_DIA_PAGO = ?, ";
        values.add(this.getEdaDiaPago());
        fields += " EDA_ANO_ALTA_REG = ?, ";
        values.add(this.getEdaAnoAltaReg());
        fields += " EDA_MES_ALTA_REG = ?, ";
        values.add(this.getEdaMesAltaReg());
        fields += " EDA_DIA_ALTA_REG = ?, ";
        values.add(this.getEdaDiaAltaReg());
        fields += " EDA_ANO_ULT_MOD = ?, ";
        values.add(this.getEdaAnoUltMod());
        fields += " EDA_MES_ULT_MOD = ?, ";
        values.add(this.getEdaMesUltMod());
        fields += " EDA_DIA_ULT_MOD = ?, ";
        values.add(this.getEdaDiaUltMod());
        fields += " EDA_CVE_ST_EMISDPAG = ?, ";
        values.add(this.getEdaCveStEmisdpag());
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
        String sql = "INSERT INTO EMISDPAG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDA_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEdaNumPrograma());

        fields += ", EDA_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEdaNumEmision());

        fields += ", EDA_NUM_SEC_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEdaNumSecPeriodo());

        fields += ", EDA_IMP_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEdaImpPeriodo());

        fields += ", EDA_ANO_PAGO";
        fieldValues += ", ?";
        values.add(this.getEdaAnoPago());

        fields += ", EDA_MES_PAGO";
        fieldValues += ", ?";
        values.add(this.getEdaMesPago());

        fields += ", EDA_DIA_PAGO";
        fieldValues += ", ?";
        values.add(this.getEdaDiaPago());

        fields += ", EDA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdaAnoAltaReg());

        fields += ", EDA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdaMesAltaReg());

        fields += ", EDA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdaDiaAltaReg());

        fields += ", EDA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdaAnoUltMod());

        fields += ", EDA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdaMesUltMod());

        fields += ", EDA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdaDiaUltMod());

        fields += ", EDA_CVE_ST_EMISDPAG";
        fieldValues += ", ?";
        values.add(this.getEdaCveStEmisdpag());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISDPAG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDA_NUM_PROGRAMA = ?";
        values.add(this.getEdaNumPrograma());
        conditions += " AND EDA_NUM_EMISION = ?";
        values.add(this.getEdaNumEmision());
        conditions += " AND EDA_NUM_SEC_PERIODO = ?";
        values.add(this.getEdaNumSecPeriodo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisdpag instance = (Emisdpag) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdaNumPrograma().equals(instance.getEdaNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEdaNumEmision().equals(instance.getEdaNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEdaNumSecPeriodo().equals(instance.getEdaNumSecPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEdaImpPeriodo().equals(instance.getEdaImpPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEdaAnoPago().equals(instance.getEdaAnoPago()))
            equalObjects = false;
        if (equalObjects && !this.getEdaMesPago().equals(instance.getEdaMesPago()))
            equalObjects = false;
        if (equalObjects && !this.getEdaDiaPago().equals(instance.getEdaDiaPago()))
            equalObjects = false;
        if (equalObjects && !this.getEdaAnoAltaReg().equals(instance.getEdaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdaMesAltaReg().equals(instance.getEdaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdaDiaAltaReg().equals(instance.getEdaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdaAnoUltMod().equals(instance.getEdaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdaMesUltMod().equals(instance.getEdaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdaDiaUltMod().equals(instance.getEdaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdaCveStEmisdpag().equals(instance.getEdaCveStEmisdpag()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisdpag result = new Emisdpag();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdaNumPrograma((BigDecimal) objectData.getData("EDA_NUM_PROGRAMA"));
        result.setEdaNumEmision((BigDecimal) objectData.getData("EDA_NUM_EMISION"));
        result.setEdaNumSecPeriodo((BigDecimal) objectData.getData("EDA_NUM_SEC_PERIODO"));
        result.setEdaImpPeriodo((BigDecimal) objectData.getData("EDA_IMP_PERIODO"));
        result.setEdaAnoPago((BigDecimal) objectData.getData("EDA_ANO_PAGO"));
        result.setEdaMesPago((BigDecimal) objectData.getData("EDA_MES_PAGO"));
        result.setEdaDiaPago((BigDecimal) objectData.getData("EDA_DIA_PAGO"));
        result.setEdaAnoAltaReg((BigDecimal) objectData.getData("EDA_ANO_ALTA_REG"));
        result.setEdaMesAltaReg((BigDecimal) objectData.getData("EDA_MES_ALTA_REG"));
        result.setEdaDiaAltaReg((BigDecimal) objectData.getData("EDA_DIA_ALTA_REG"));
        result.setEdaAnoUltMod((BigDecimal) objectData.getData("EDA_ANO_ULT_MOD"));
        result.setEdaMesUltMod((BigDecimal) objectData.getData("EDA_MES_ULT_MOD"));
        result.setEdaDiaUltMod((BigDecimal) objectData.getData("EDA_DIA_ULT_MOD"));
        result.setEdaCveStEmisdpag((String) objectData.getData("EDA_CVE_ST_EMISDPAG"));

        return result;

    }

}
