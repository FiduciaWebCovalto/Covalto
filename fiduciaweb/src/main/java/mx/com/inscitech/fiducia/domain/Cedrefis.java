package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CEDREFIS_PK", columns = { "CRF_NUM_FIDEICOM" }, sequences = { "MAX" })
public class Cedrefis extends DomainObject {

    BigDecimal crfNumFideicom = null;
    String crfIdCedula = null;
    String crfObligadFisc = null;
    String crfPartfisc = null;
    String crfRfc = null;
    String crfTitular = null;
    BigDecimal crfIsrRendim = null;
    String crfNumOficIsr = null;
    String crfFecOficIsr = null;
    String crfFecRenovIsr = null;
    BigDecimal crfAnoAltReg = null;
    BigDecimal crfMesAltReg = null;
    BigDecimal crfDiaAltReg = null;
    BigDecimal crfAnoUltMod = null;
    BigDecimal crfMesUltMod = null;
    BigDecimal crfDiaUltMod = null;
    String crfCveStCerefi = null;
    String crfCurf = null;

    public Cedrefis() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrfNumFideicom(BigDecimal crfNumFideicom) {
        this.crfNumFideicom = crfNumFideicom;
    }

    public BigDecimal getCrfNumFideicom() {
        return this.crfNumFideicom;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfIdCedula(String crfIdCedula) {
        this.crfIdCedula = crfIdCedula;
    }

    public String getCrfIdCedula() {
        return this.crfIdCedula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfObligadFisc(String crfObligadFisc) {
        this.crfObligadFisc = crfObligadFisc;
    }

    public String getCrfObligadFisc() {
        return this.crfObligadFisc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfPartfisc(String crfPartfisc) {
        this.crfPartfisc = crfPartfisc;
    }

    public String getCrfPartfisc() {
        return this.crfPartfisc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfRfc(String crfRfc) {
        this.crfRfc = crfRfc;
    }

    public String getCrfRfc() {
        return this.crfRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfTitular(String crfTitular) {
        this.crfTitular = crfTitular;
    }

    public String getCrfTitular() {
        return this.crfTitular;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCrfIsrRendim(BigDecimal crfIsrRendim) {
        this.crfIsrRendim = crfIsrRendim;
    }

    public BigDecimal getCrfIsrRendim() {
        return this.crfIsrRendim;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfNumOficIsr(String crfNumOficIsr) {
        this.crfNumOficIsr = crfNumOficIsr;
    }

    public String getCrfNumOficIsr() {
        return this.crfNumOficIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfFecOficIsr(String crfFecOficIsr) {
        this.crfFecOficIsr = crfFecOficIsr;
    }

    public String getCrfFecOficIsr() {
        return this.crfFecOficIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfFecRenovIsr(String crfFecRenovIsr) {
        this.crfFecRenovIsr = crfFecRenovIsr;
    }

    public String getCrfFecRenovIsr() {
        return this.crfFecRenovIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrfAnoAltReg(BigDecimal crfAnoAltReg) {
        this.crfAnoAltReg = crfAnoAltReg;
    }

    public BigDecimal getCrfAnoAltReg() {
        return this.crfAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrfMesAltReg(BigDecimal crfMesAltReg) {
        this.crfMesAltReg = crfMesAltReg;
    }

    public BigDecimal getCrfMesAltReg() {
        return this.crfMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrfDiaAltReg(BigDecimal crfDiaAltReg) {
        this.crfDiaAltReg = crfDiaAltReg;
    }

    public BigDecimal getCrfDiaAltReg() {
        return this.crfDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrfAnoUltMod(BigDecimal crfAnoUltMod) {
        this.crfAnoUltMod = crfAnoUltMod;
    }

    public BigDecimal getCrfAnoUltMod() {
        return this.crfAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrfMesUltMod(BigDecimal crfMesUltMod) {
        this.crfMesUltMod = crfMesUltMod;
    }

    public BigDecimal getCrfMesUltMod() {
        return this.crfMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrfDiaUltMod(BigDecimal crfDiaUltMod) {
        this.crfDiaUltMod = crfDiaUltMod;
    }

    public BigDecimal getCrfDiaUltMod() {
        return this.crfDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfCveStCerefi(String crfCveStCerefi) {
        this.crfCveStCerefi = crfCveStCerefi;
    }

    public String getCrfCveStCerefi() {
        return this.crfCveStCerefi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrfCurf(String crfCurf) {
        this.crfCurf = crfCurf;
    }

    public String getCrfCurf() {
        return this.crfCurf;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CEDREFIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrfNumFideicom() != null && this.getCrfNumFideicom().longValue() == -999) {
            conditions += " AND CRF_NUM_FIDEICOM IS NULL";
        } else if (this.getCrfNumFideicom() != null) {
            conditions += " AND CRF_NUM_FIDEICOM = ?";
            values.add(this.getCrfNumFideicom());
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
        String sql = "SELECT * FROM CEDREFIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrfNumFideicom() != null && this.getCrfNumFideicom().longValue() == -999) {
            conditions += " AND CRF_NUM_FIDEICOM IS NULL";
        } else if (this.getCrfNumFideicom() != null) {
            conditions += " AND CRF_NUM_FIDEICOM = ?";
            values.add(this.getCrfNumFideicom());
        }

        if (this.getCrfIdCedula() != null && "null".equals(this.getCrfIdCedula())) {
            conditions += " AND CRF_ID_CEDULA IS NULL";
        } else if (this.getCrfIdCedula() != null) {
            conditions += " AND CRF_ID_CEDULA = ?";
            values.add(this.getCrfIdCedula());
        }

        if (this.getCrfObligadFisc() != null && "null".equals(this.getCrfObligadFisc())) {
            conditions += " AND CRF_OBLIGAD_FISC IS NULL";
        } else if (this.getCrfObligadFisc() != null) {
            conditions += " AND CRF_OBLIGAD_FISC = ?";
            values.add(this.getCrfObligadFisc());
        }

        if (this.getCrfPartfisc() != null && "null".equals(this.getCrfPartfisc())) {
            conditions += " AND CRF_PARTFISC IS NULL";
        } else if (this.getCrfPartfisc() != null) {
            conditions += " AND CRF_PARTFISC = ?";
            values.add(this.getCrfPartfisc());
        }

        if (this.getCrfRfc() != null && "null".equals(this.getCrfRfc())) {
            conditions += " AND CRF_RFC IS NULL";
        } else if (this.getCrfRfc() != null) {
            conditions += " AND CRF_RFC = ?";
            values.add(this.getCrfRfc());
        }

        if (this.getCrfTitular() != null && "null".equals(this.getCrfTitular())) {
            conditions += " AND CRF_TITULAR IS NULL";
        } else if (this.getCrfTitular() != null) {
            conditions += " AND CRF_TITULAR = ?";
            values.add(this.getCrfTitular());
        }

        if (this.getCrfIsrRendim() != null && this.getCrfIsrRendim().longValue() == -999) {
            conditions += " AND CRF_ISR_RENDIM IS NULL";
        } else if (this.getCrfIsrRendim() != null) {
            conditions += " AND CRF_ISR_RENDIM = ?";
            values.add(this.getCrfIsrRendim());
        }

        if (this.getCrfNumOficIsr() != null && "null".equals(this.getCrfNumOficIsr())) {
            conditions += " AND CRF_NUM_OFIC_ISR IS NULL";
        } else if (this.getCrfNumOficIsr() != null) {
            conditions += " AND CRF_NUM_OFIC_ISR = ?";
            values.add(this.getCrfNumOficIsr());
        }

        if (this.getCrfFecOficIsr() != null && "null".equals(this.getCrfFecOficIsr())) {
            conditions += " AND CRF_FEC_OFIC_ISR IS NULL";
        } else if (this.getCrfFecOficIsr() != null) {
            conditions += " AND CRF_FEC_OFIC_ISR = ?";
            values.add(this.getCrfFecOficIsr());
        }

        if (this.getCrfFecRenovIsr() != null && "null".equals(this.getCrfFecRenovIsr())) {
            conditions += " AND CRF_FEC_RENOV_ISR IS NULL";
        } else if (this.getCrfFecRenovIsr() != null) {
            conditions += " AND CRF_FEC_RENOV_ISR = ?";
            values.add(this.getCrfFecRenovIsr());
        }

        if (this.getCrfAnoAltReg() != null && this.getCrfAnoAltReg().longValue() == -999) {
            conditions += " AND CRF_ANO_ALT_REG IS NULL";
        } else if (this.getCrfAnoAltReg() != null) {
            conditions += " AND CRF_ANO_ALT_REG = ?";
            values.add(this.getCrfAnoAltReg());
        }

        if (this.getCrfMesAltReg() != null && this.getCrfMesAltReg().longValue() == -999) {
            conditions += " AND CRF_MES_ALT_REG IS NULL";
        } else if (this.getCrfMesAltReg() != null) {
            conditions += " AND CRF_MES_ALT_REG = ?";
            values.add(this.getCrfMesAltReg());
        }

        if (this.getCrfDiaAltReg() != null && this.getCrfDiaAltReg().longValue() == -999) {
            conditions += " AND CRF_DIA_ALT_REG IS NULL";
        } else if (this.getCrfDiaAltReg() != null) {
            conditions += " AND CRF_DIA_ALT_REG = ?";
            values.add(this.getCrfDiaAltReg());
        }

        if (this.getCrfAnoUltMod() != null && this.getCrfAnoUltMod().longValue() == -999) {
            conditions += " AND CRF_ANO_ULT_MOD IS NULL";
        } else if (this.getCrfAnoUltMod() != null) {
            conditions += " AND CRF_ANO_ULT_MOD = ?";
            values.add(this.getCrfAnoUltMod());
        }

        if (this.getCrfMesUltMod() != null && this.getCrfMesUltMod().longValue() == -999) {
            conditions += " AND CRF_MES_ULT_MOD IS NULL";
        } else if (this.getCrfMesUltMod() != null) {
            conditions += " AND CRF_MES_ULT_MOD = ?";
            values.add(this.getCrfMesUltMod());
        }

        if (this.getCrfDiaUltMod() != null && this.getCrfDiaUltMod().longValue() == -999) {
            conditions += " AND CRF_DIA_ULT_MOD IS NULL";
        } else if (this.getCrfDiaUltMod() != null) {
            conditions += " AND CRF_DIA_ULT_MOD = ?";
            values.add(this.getCrfDiaUltMod());
        }

        if (this.getCrfCveStCerefi() != null && "null".equals(this.getCrfCveStCerefi())) {
            conditions += " AND CRF_CVE_ST_CEREFI IS NULL";
        } else if (this.getCrfCveStCerefi() != null) {
            conditions += " AND CRF_CVE_ST_CEREFI = ?";
            values.add(this.getCrfCveStCerefi());
        }

        if (this.getCrfCurf() != null && "null".equals(this.getCrfCurf())) {
            conditions += " AND CRF_CURF IS NULL";
        } else if (this.getCrfCurf() != null) {
            conditions += " AND CRF_CURF = ?";
            values.add(this.getCrfCurf());
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
        String sql = "UPDATE CEDREFIS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CRF_NUM_FIDEICOM = ?";
        pkValues.add(this.getCrfNumFideicom());
        fields += " CRF_ID_CEDULA = ?, ";
        values.add(this.getCrfIdCedula());
        fields += " CRF_OBLIGAD_FISC = ?, ";
        values.add(this.getCrfObligadFisc());
        fields += " CRF_PARTFISC = ?, ";
        values.add(this.getCrfPartfisc());
        fields += " CRF_RFC = ?, ";
        values.add(this.getCrfRfc());
        fields += " CRF_TITULAR = ?, ";
        values.add(this.getCrfTitular());
        fields += " CRF_ISR_RENDIM = ?, ";
        values.add(this.getCrfIsrRendim());
        fields += " CRF_NUM_OFIC_ISR = ?, ";
        values.add(this.getCrfNumOficIsr());
        fields += " CRF_FEC_OFIC_ISR = ?, ";
        values.add(this.getCrfFecOficIsr());
        fields += " CRF_FEC_RENOV_ISR = ?, ";
        values.add(this.getCrfFecRenovIsr());
        fields += " CRF_ANO_ALT_REG = ?, ";
        values.add(this.getCrfAnoAltReg());
        fields += " CRF_MES_ALT_REG = ?, ";
        values.add(this.getCrfMesAltReg());
        fields += " CRF_DIA_ALT_REG = ?, ";
        values.add(this.getCrfDiaAltReg());
        fields += " CRF_ANO_ULT_MOD = ?, ";
        values.add(this.getCrfAnoUltMod());
        fields += " CRF_MES_ULT_MOD = ?, ";
        values.add(this.getCrfMesUltMod());
        fields += " CRF_DIA_ULT_MOD = ?, ";
        values.add(this.getCrfDiaUltMod());
        fields += " CRF_CVE_ST_CEREFI = ?, ";
        values.add(this.getCrfCveStCerefi());
        fields += " CRF_CURF = ?, ";
        values.add(this.getCrfCurf());
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
        String sql = "INSERT INTO CEDREFIS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CRF_NUM_FIDEICOM";
        fieldValues += ", ?";
        values.add(this.getCrfNumFideicom());

        fields += ", CRF_ID_CEDULA";
        fieldValues += ", ?";
        values.add(this.getCrfIdCedula());

        fields += ", CRF_OBLIGAD_FISC";
        fieldValues += ", ?";
        values.add(this.getCrfObligadFisc());

        fields += ", CRF_PARTFISC";
        fieldValues += ", ?";
        values.add(this.getCrfPartfisc());

        fields += ", CRF_RFC";
        fieldValues += ", ?";
        values.add(this.getCrfRfc());

        fields += ", CRF_TITULAR";
        fieldValues += ", ?";
        values.add(this.getCrfTitular());

        fields += ", CRF_ISR_RENDIM";
        fieldValues += ", ?";
        values.add(this.getCrfIsrRendim());

        fields += ", CRF_NUM_OFIC_ISR";
        fieldValues += ", ?";
        values.add(this.getCrfNumOficIsr());

        fields += ", CRF_FEC_OFIC_ISR";
        fieldValues += ", ?";
        values.add(this.getCrfFecOficIsr());

        fields += ", CRF_FEC_RENOV_ISR";
        fieldValues += ", ?";
        values.add(this.getCrfFecRenovIsr());

        fields += ", CRF_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCrfAnoAltReg());

        fields += ", CRF_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCrfMesAltReg());

        fields += ", CRF_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCrfDiaAltReg());

        fields += ", CRF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrfAnoUltMod());

        fields += ", CRF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrfMesUltMod());

        fields += ", CRF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrfDiaUltMod());

        fields += ", CRF_CVE_ST_CEREFI";
        fieldValues += ", ?";
        values.add(this.getCrfCveStCerefi());

        fields += ", CRF_CURF";
        fieldValues += ", ?";
        values.add(this.getCrfCurf());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CEDREFIS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CRF_NUM_FIDEICOM = ?";
        values.add(this.getCrfNumFideicom());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cedrefis instance = (Cedrefis) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCrfNumFideicom().equals(instance.getCrfNumFideicom()))
            equalObjects = false;
        if (equalObjects && !this.getCrfIdCedula().equals(instance.getCrfIdCedula()))
            equalObjects = false;
        if (equalObjects && !this.getCrfObligadFisc().equals(instance.getCrfObligadFisc()))
            equalObjects = false;
        if (equalObjects && !this.getCrfPartfisc().equals(instance.getCrfPartfisc()))
            equalObjects = false;
        if (equalObjects && !this.getCrfRfc().equals(instance.getCrfRfc()))
            equalObjects = false;
        if (equalObjects && !this.getCrfTitular().equals(instance.getCrfTitular()))
            equalObjects = false;
        if (equalObjects && !this.getCrfIsrRendim().equals(instance.getCrfIsrRendim()))
            equalObjects = false;
        if (equalObjects && !this.getCrfNumOficIsr().equals(instance.getCrfNumOficIsr()))
            equalObjects = false;
        if (equalObjects && !this.getCrfFecOficIsr().equals(instance.getCrfFecOficIsr()))
            equalObjects = false;
        if (equalObjects && !this.getCrfFecRenovIsr().equals(instance.getCrfFecRenovIsr()))
            equalObjects = false;
        if (equalObjects && !this.getCrfAnoAltReg().equals(instance.getCrfAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrfMesAltReg().equals(instance.getCrfMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrfDiaAltReg().equals(instance.getCrfDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrfAnoUltMod().equals(instance.getCrfAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrfMesUltMod().equals(instance.getCrfMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrfDiaUltMod().equals(instance.getCrfDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrfCveStCerefi().equals(instance.getCrfCveStCerefi()))
            equalObjects = false;
        if (equalObjects && !this.getCrfCurf().equals(instance.getCrfCurf()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cedrefis result = new Cedrefis();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCrfNumFideicom((BigDecimal) objectData.getData("CRF_NUM_FIDEICOM"));
        result.setCrfIdCedula((String) objectData.getData("CRF_ID_CEDULA"));
        result.setCrfObligadFisc((String) objectData.getData("CRF_OBLIGAD_FISC"));
        result.setCrfPartfisc((String) objectData.getData("CRF_PARTFISC"));
        result.setCrfRfc((String) objectData.getData("CRF_RFC"));
        result.setCrfTitular((String) objectData.getData("CRF_TITULAR"));
        result.setCrfIsrRendim((BigDecimal) objectData.getData("CRF_ISR_RENDIM"));
        result.setCrfNumOficIsr((String) objectData.getData("CRF_NUM_OFIC_ISR"));
        result.setCrfFecOficIsr((String) objectData.getData("CRF_FEC_OFIC_ISR"));
        result.setCrfFecRenovIsr((String) objectData.getData("CRF_FEC_RENOV_ISR"));
        result.setCrfAnoAltReg((BigDecimal) objectData.getData("CRF_ANO_ALT_REG"));
        result.setCrfMesAltReg((BigDecimal) objectData.getData("CRF_MES_ALT_REG"));
        result.setCrfDiaAltReg((BigDecimal) objectData.getData("CRF_DIA_ALT_REG"));
        result.setCrfAnoUltMod((BigDecimal) objectData.getData("CRF_ANO_ULT_MOD"));
        result.setCrfMesUltMod((BigDecimal) objectData.getData("CRF_MES_ULT_MOD"));
        result.setCrfDiaUltMod((BigDecimal) objectData.getData("CRF_DIA_ULT_MOD"));
        result.setCrfCveStCerefi((String) objectData.getData("CRF_CVE_ST_CEREFI"));
        result.setCrfCurf((String) objectData.getData("CRF_CURF"));

        return result;

    }

}
