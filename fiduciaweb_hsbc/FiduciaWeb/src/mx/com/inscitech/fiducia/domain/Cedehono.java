package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CEDEHONO_PK", columns = { "CHO_NUM_PROGRAMA", "CHO_NUM_EMISION", "CHO_NUM_CEDEVIS", "CHO_NUM_SEC_HONOR" }, sequences = { "MANUAL" })
public class Cedehono extends DomainObject {

    BigDecimal choNumPrograma = null;
    BigDecimal choNumEmision = null;
    BigDecimal choNumCedevis = null;
    BigDecimal choNumSecHonor = null;
    String choConcepto = null;
    BigDecimal choImpHonorario = null;
    BigDecimal choAnoAltaReg = null;
    BigDecimal choMesAltaReg = null;
    BigDecimal choDiaAltaReg = null;
    BigDecimal choAnoUltMod = null;
    BigDecimal choMesUltMod = null;
    BigDecimal choDiaUltMod = null;
    String choCveStCedehono = null;

    public Cedehono() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumPrograma(BigDecimal choNumPrograma) {
        this.choNumPrograma = choNumPrograma;
    }

    public BigDecimal getChoNumPrograma() {
        return this.choNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumEmision(BigDecimal choNumEmision) {
        this.choNumEmision = choNumEmision;
    }

    public BigDecimal getChoNumEmision() {
        return this.choNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumCedevis(BigDecimal choNumCedevis) {
        this.choNumCedevis = choNumCedevis;
    }

    public BigDecimal getChoNumCedevis() {
        return this.choNumCedevis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumSecHonor(BigDecimal choNumSecHonor) {
        this.choNumSecHonor = choNumSecHonor;
    }

    public BigDecimal getChoNumSecHonor() {
        return this.choNumSecHonor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setChoConcepto(String choConcepto) {
        this.choConcepto = choConcepto;
    }

    public String getChoConcepto() {
        return this.choConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setChoImpHonorario(BigDecimal choImpHonorario) {
        this.choImpHonorario = choImpHonorario;
    }

    public BigDecimal getChoImpHonorario() {
        return this.choImpHonorario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setChoAnoAltaReg(BigDecimal choAnoAltaReg) {
        this.choAnoAltaReg = choAnoAltaReg;
    }

    public BigDecimal getChoAnoAltaReg() {
        return this.choAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setChoMesAltaReg(BigDecimal choMesAltaReg) {
        this.choMesAltaReg = choMesAltaReg;
    }

    public BigDecimal getChoMesAltaReg() {
        return this.choMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setChoDiaAltaReg(BigDecimal choDiaAltaReg) {
        this.choDiaAltaReg = choDiaAltaReg;
    }

    public BigDecimal getChoDiaAltaReg() {
        return this.choDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setChoAnoUltMod(BigDecimal choAnoUltMod) {
        this.choAnoUltMod = choAnoUltMod;
    }

    public BigDecimal getChoAnoUltMod() {
        return this.choAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setChoMesUltMod(BigDecimal choMesUltMod) {
        this.choMesUltMod = choMesUltMod;
    }

    public BigDecimal getChoMesUltMod() {
        return this.choMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setChoDiaUltMod(BigDecimal choDiaUltMod) {
        this.choDiaUltMod = choDiaUltMod;
    }

    public BigDecimal getChoDiaUltMod() {
        return this.choDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setChoCveStCedehono(String choCveStCedehono) {
        this.choCveStCedehono = choCveStCedehono;
    }

    public String getChoCveStCedehono() {
        return this.choCveStCedehono;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CEDEHONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getChoNumPrograma() != null && this.getChoNumPrograma().longValue() == -999) {
            conditions += " AND CHO_NUM_PROGRAMA IS NULL";
        } else if (this.getChoNumPrograma() != null) {
            conditions += " AND CHO_NUM_PROGRAMA = ?";
            values.add(this.getChoNumPrograma());
        }

        if (this.getChoNumEmision() != null && this.getChoNumEmision().longValue() == -999) {
            conditions += " AND CHO_NUM_EMISION IS NULL";
        } else if (this.getChoNumEmision() != null) {
            conditions += " AND CHO_NUM_EMISION = ?";
            values.add(this.getChoNumEmision());
        }

        if (this.getChoNumCedevis() != null && this.getChoNumCedevis().longValue() == -999) {
            conditions += " AND CHO_NUM_CEDEVIS IS NULL";
        } else if (this.getChoNumCedevis() != null) {
            conditions += " AND CHO_NUM_CEDEVIS = ?";
            values.add(this.getChoNumCedevis());
        }

        if (this.getChoNumSecHonor() != null && this.getChoNumSecHonor().longValue() == -999) {
            conditions += " AND CHO_NUM_SEC_HONOR IS NULL";
        } else if (this.getChoNumSecHonor() != null) {
            conditions += " AND CHO_NUM_SEC_HONOR = ?";
            values.add(this.getChoNumSecHonor());
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
        String sql = "SELECT * FROM CEDEHONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getChoNumPrograma() != null && this.getChoNumPrograma().longValue() == -999) {
            conditions += " AND CHO_NUM_PROGRAMA IS NULL";
        } else if (this.getChoNumPrograma() != null) {
            conditions += " AND CHO_NUM_PROGRAMA = ?";
            values.add(this.getChoNumPrograma());
        }

        if (this.getChoNumEmision() != null && this.getChoNumEmision().longValue() == -999) {
            conditions += " AND CHO_NUM_EMISION IS NULL";
        } else if (this.getChoNumEmision() != null) {
            conditions += " AND CHO_NUM_EMISION = ?";
            values.add(this.getChoNumEmision());
        }

        if (this.getChoNumCedevis() != null && this.getChoNumCedevis().longValue() == -999) {
            conditions += " AND CHO_NUM_CEDEVIS IS NULL";
        } else if (this.getChoNumCedevis() != null) {
            conditions += " AND CHO_NUM_CEDEVIS = ?";
            values.add(this.getChoNumCedevis());
        }

        if (this.getChoNumSecHonor() != null && this.getChoNumSecHonor().longValue() == -999) {
            conditions += " AND CHO_NUM_SEC_HONOR IS NULL";
        } else if (this.getChoNumSecHonor() != null) {
            conditions += " AND CHO_NUM_SEC_HONOR = ?";
            values.add(this.getChoNumSecHonor());
        }

        if (this.getChoConcepto() != null && "null".equals(this.getChoConcepto())) {
            conditions += " AND CHO_CONCEPTO IS NULL";
        } else if (this.getChoConcepto() != null) {
            conditions += " AND CHO_CONCEPTO = ?";
            values.add(this.getChoConcepto());
        }

        if (this.getChoImpHonorario() != null && this.getChoImpHonorario().longValue() == -999) {
            conditions += " AND CHO_IMP_HONORARIO IS NULL";
        } else if (this.getChoImpHonorario() != null) {
            conditions += " AND CHO_IMP_HONORARIO = ?";
            values.add(this.getChoImpHonorario());
        }

        if (this.getChoAnoAltaReg() != null && this.getChoAnoAltaReg().longValue() == -999) {
            conditions += " AND CHO_ANO_ALTA_REG IS NULL";
        } else if (this.getChoAnoAltaReg() != null) {
            conditions += " AND CHO_ANO_ALTA_REG = ?";
            values.add(this.getChoAnoAltaReg());
        }

        if (this.getChoMesAltaReg() != null && this.getChoMesAltaReg().longValue() == -999) {
            conditions += " AND CHO_MES_ALTA_REG IS NULL";
        } else if (this.getChoMesAltaReg() != null) {
            conditions += " AND CHO_MES_ALTA_REG = ?";
            values.add(this.getChoMesAltaReg());
        }

        if (this.getChoDiaAltaReg() != null && this.getChoDiaAltaReg().longValue() == -999) {
            conditions += " AND CHO_DIA_ALTA_REG IS NULL";
        } else if (this.getChoDiaAltaReg() != null) {
            conditions += " AND CHO_DIA_ALTA_REG = ?";
            values.add(this.getChoDiaAltaReg());
        }

        if (this.getChoAnoUltMod() != null && this.getChoAnoUltMod().longValue() == -999) {
            conditions += " AND CHO_ANO_ULT_MOD IS NULL";
        } else if (this.getChoAnoUltMod() != null) {
            conditions += " AND CHO_ANO_ULT_MOD = ?";
            values.add(this.getChoAnoUltMod());
        }

        if (this.getChoMesUltMod() != null && this.getChoMesUltMod().longValue() == -999) {
            conditions += " AND CHO_MES_ULT_MOD IS NULL";
        } else if (this.getChoMesUltMod() != null) {
            conditions += " AND CHO_MES_ULT_MOD = ?";
            values.add(this.getChoMesUltMod());
        }

        if (this.getChoDiaUltMod() != null && this.getChoDiaUltMod().longValue() == -999) {
            conditions += " AND CHO_DIA_ULT_MOD IS NULL";
        } else if (this.getChoDiaUltMod() != null) {
            conditions += " AND CHO_DIA_ULT_MOD = ?";
            values.add(this.getChoDiaUltMod());
        }

        if (this.getChoCveStCedehono() != null && "null".equals(this.getChoCveStCedehono())) {
            conditions += " AND CHO_CVE_ST_CEDEHONO IS NULL";
        } else if (this.getChoCveStCedehono() != null) {
            conditions += " AND CHO_CVE_ST_CEDEHONO = ?";
            values.add(this.getChoCveStCedehono());
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
        String sql = "UPDATE CEDEHONO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CHO_NUM_PROGRAMA = ?";
        pkValues.add(this.getChoNumPrograma());
        conditions += " AND CHO_NUM_EMISION = ?";
        pkValues.add(this.getChoNumEmision());
        conditions += " AND CHO_NUM_CEDEVIS = ?";
        pkValues.add(this.getChoNumCedevis());
        conditions += " AND CHO_NUM_SEC_HONOR = ?";
        pkValues.add(this.getChoNumSecHonor());
        fields += " CHO_CONCEPTO = ?, ";
        values.add(this.getChoConcepto());
        fields += " CHO_IMP_HONORARIO = ?, ";
        values.add(this.getChoImpHonorario());
        fields += " CHO_ANO_ALTA_REG = ?, ";
        values.add(this.getChoAnoAltaReg());
        fields += " CHO_MES_ALTA_REG = ?, ";
        values.add(this.getChoMesAltaReg());
        fields += " CHO_DIA_ALTA_REG = ?, ";
        values.add(this.getChoDiaAltaReg());
        fields += " CHO_ANO_ULT_MOD = ?, ";
        values.add(this.getChoAnoUltMod());
        fields += " CHO_MES_ULT_MOD = ?, ";
        values.add(this.getChoMesUltMod());
        fields += " CHO_DIA_ULT_MOD = ?, ";
        values.add(this.getChoDiaUltMod());
        fields += " CHO_CVE_ST_CEDEHONO = ?, ";
        values.add(this.getChoCveStCedehono());
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
        String sql = "INSERT INTO CEDEHONO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CHO_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getChoNumPrograma());

        fields += ", CHO_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getChoNumEmision());

        fields += ", CHO_NUM_CEDEVIS";
        fieldValues += ", ?";
        values.add(this.getChoNumCedevis());

        fields += ", CHO_NUM_SEC_HONOR";
        fieldValues += ", ?";
        values.add(this.getChoNumSecHonor());

        fields += ", CHO_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getChoConcepto());

        fields += ", CHO_IMP_HONORARIO";
        fieldValues += ", ?";
        values.add(this.getChoImpHonorario());

        fields += ", CHO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getChoAnoAltaReg());

        fields += ", CHO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getChoMesAltaReg());

        fields += ", CHO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getChoDiaAltaReg());

        fields += ", CHO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getChoAnoUltMod());

        fields += ", CHO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getChoMesUltMod());

        fields += ", CHO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getChoDiaUltMod());

        fields += ", CHO_CVE_ST_CEDEHONO";
        fieldValues += ", ?";
        values.add(this.getChoCveStCedehono());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CEDEHONO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CHO_NUM_PROGRAMA = ?";
        values.add(this.getChoNumPrograma());
        conditions += " AND CHO_NUM_EMISION = ?";
        values.add(this.getChoNumEmision());
        conditions += " AND CHO_NUM_CEDEVIS = ?";
        values.add(this.getChoNumCedevis());
        conditions += " AND CHO_NUM_SEC_HONOR = ?";
        values.add(this.getChoNumSecHonor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cedehono instance = (Cedehono) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getChoNumPrograma().equals(instance.getChoNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getChoNumEmision().equals(instance.getChoNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getChoNumCedevis().equals(instance.getChoNumCedevis()))
            equalObjects = false;
        if (equalObjects && !this.getChoNumSecHonor().equals(instance.getChoNumSecHonor()))
            equalObjects = false;
        if (equalObjects && !this.getChoConcepto().equals(instance.getChoConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getChoImpHonorario().equals(instance.getChoImpHonorario()))
            equalObjects = false;
        if (equalObjects && !this.getChoAnoAltaReg().equals(instance.getChoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getChoMesAltaReg().equals(instance.getChoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getChoDiaAltaReg().equals(instance.getChoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getChoAnoUltMod().equals(instance.getChoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getChoMesUltMod().equals(instance.getChoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getChoDiaUltMod().equals(instance.getChoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getChoCveStCedehono().equals(instance.getChoCveStCedehono()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cedehono result = new Cedehono();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setChoNumPrograma((BigDecimal) objectData.getData("CHO_NUM_PROGRAMA"));
        result.setChoNumEmision((BigDecimal) objectData.getData("CHO_NUM_EMISION"));
        result.setChoNumCedevis((BigDecimal) objectData.getData("CHO_NUM_CEDEVIS"));
        result.setChoNumSecHonor((BigDecimal) objectData.getData("CHO_NUM_SEC_HONOR"));
        result.setChoConcepto((String) objectData.getData("CHO_CONCEPTO"));
        result.setChoImpHonorario((BigDecimal) objectData.getData("CHO_IMP_HONORARIO"));
        result.setChoAnoAltaReg((BigDecimal) objectData.getData("CHO_ANO_ALTA_REG"));
        result.setChoMesAltaReg((BigDecimal) objectData.getData("CHO_MES_ALTA_REG"));
        result.setChoDiaAltaReg((BigDecimal) objectData.getData("CHO_DIA_ALTA_REG"));
        result.setChoAnoUltMod((BigDecimal) objectData.getData("CHO_ANO_ULT_MOD"));
        result.setChoMesUltMod((BigDecimal) objectData.getData("CHO_MES_ULT_MOD"));
        result.setChoDiaUltMod((BigDecimal) objectData.getData("CHO_DIA_ULT_MOD"));
        result.setChoCveStCedehono((String) objectData.getData("CHO_CVE_ST_CEDEHONO"));

        return result;

    }

}
