package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CEDEMORO_PK", columns = { "CMO_NUM_PROGRAMA", "CMO_NUM_EMISION", "CMO_NUM_CEDEVIS", "CMO_NUM_SEC_COB" }, sequences = { "MANUAL" })
public class Cedemoro extends DomainObject {

    BigDecimal cmoNumPrograma = null;
    BigDecimal cmoNumEmision = null;
    BigDecimal cmoNumCedevis = null;
    BigDecimal cmoNumSecCob = null;
    String cmoConcepMor = null;
    BigDecimal cmoAnoInicioExt = null;
    BigDecimal cmoMesInicioExt = null;
    BigDecimal cmoDiaInicioExt = null;
    BigDecimal cmoAnoFinExt = null;
    BigDecimal cmoMesFinExt = null;
    BigDecimal cmoDiaFinExt = null;
    BigDecimal cmoNumCtas = null;
    BigDecimal cmoImpSaldo = null;
    BigDecimal choNumPrograma = null;
    BigDecimal choNumEmision = null;
    BigDecimal choNumCedevis = null;
    BigDecimal choNumSecHonor = null;
    String choConcepto = null;
    BigDecimal choImpHonorario = null;
    BigDecimal cmoAnoAltaReg = null;
    BigDecimal cmoMesAltaReg = null;
    BigDecimal cmoDiaAltaReg = null;
    BigDecimal cmoAnoUltMod = null;
    BigDecimal cmoMesUltMod = null;
    BigDecimal cmoDiaUltMod = null;
    String cmoCveStCedemoro = null;

    public Cedemoro() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmoNumPrograma(BigDecimal cmoNumPrograma) {
        this.cmoNumPrograma = cmoNumPrograma;
    }

    public BigDecimal getCmoNumPrograma() {
        return this.cmoNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmoNumEmision(BigDecimal cmoNumEmision) {
        this.cmoNumEmision = cmoNumEmision;
    }

    public BigDecimal getCmoNumEmision() {
        return this.cmoNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmoNumCedevis(BigDecimal cmoNumCedevis) {
        this.cmoNumCedevis = cmoNumCedevis;
    }

    public BigDecimal getCmoNumCedevis() {
        return this.cmoNumCedevis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmoNumSecCob(BigDecimal cmoNumSecCob) {
        this.cmoNumSecCob = cmoNumSecCob;
    }

    public BigDecimal getCmoNumSecCob() {
        return this.cmoNumSecCob;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmoConcepMor(String cmoConcepMor) {
        this.cmoConcepMor = cmoConcepMor;
    }

    public String getCmoConcepMor() {
        return this.cmoConcepMor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCmoAnoInicioExt(BigDecimal cmoAnoInicioExt) {
        this.cmoAnoInicioExt = cmoAnoInicioExt;
    }

    public BigDecimal getCmoAnoInicioExt() {
        return this.cmoAnoInicioExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoMesInicioExt(BigDecimal cmoMesInicioExt) {
        this.cmoMesInicioExt = cmoMesInicioExt;
    }

    public BigDecimal getCmoMesInicioExt() {
        return this.cmoMesInicioExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoDiaInicioExt(BigDecimal cmoDiaInicioExt) {
        this.cmoDiaInicioExt = cmoDiaInicioExt;
    }

    public BigDecimal getCmoDiaInicioExt() {
        return this.cmoDiaInicioExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCmoAnoFinExt(BigDecimal cmoAnoFinExt) {
        this.cmoAnoFinExt = cmoAnoFinExt;
    }

    public BigDecimal getCmoAnoFinExt() {
        return this.cmoAnoFinExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoMesFinExt(BigDecimal cmoMesFinExt) {
        this.cmoMesFinExt = cmoMesFinExt;
    }

    public BigDecimal getCmoMesFinExt() {
        return this.cmoMesFinExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoDiaFinExt(BigDecimal cmoDiaFinExt) {
        this.cmoDiaFinExt = cmoDiaFinExt;
    }

    public BigDecimal getCmoDiaFinExt() {
        return this.cmoDiaFinExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCmoNumCtas(BigDecimal cmoNumCtas) {
        this.cmoNumCtas = cmoNumCtas;
    }

    public BigDecimal getCmoNumCtas() {
        return this.cmoNumCtas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCmoImpSaldo(BigDecimal cmoImpSaldo) {
        this.cmoImpSaldo = cmoImpSaldo;
    }

    public BigDecimal getCmoImpSaldo() {
        return this.cmoImpSaldo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumPrograma(BigDecimal choNumPrograma) {
        this.choNumPrograma = choNumPrograma;
    }

    public BigDecimal getChoNumPrograma() {
        return this.choNumPrograma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumEmision(BigDecimal choNumEmision) {
        this.choNumEmision = choNumEmision;
    }

    public BigDecimal getChoNumEmision() {
        return this.choNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setChoNumCedevis(BigDecimal choNumCedevis) {
        this.choNumCedevis = choNumCedevis;
    }

    public BigDecimal getChoNumCedevis() {
        return this.choNumCedevis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
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
    public void setCmoAnoAltaReg(BigDecimal cmoAnoAltaReg) {
        this.cmoAnoAltaReg = cmoAnoAltaReg;
    }

    public BigDecimal getCmoAnoAltaReg() {
        return this.cmoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoMesAltaReg(BigDecimal cmoMesAltaReg) {
        this.cmoMesAltaReg = cmoMesAltaReg;
    }

    public BigDecimal getCmoMesAltaReg() {
        return this.cmoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoDiaAltaReg(BigDecimal cmoDiaAltaReg) {
        this.cmoDiaAltaReg = cmoDiaAltaReg;
    }

    public BigDecimal getCmoDiaAltaReg() {
        return this.cmoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCmoAnoUltMod(BigDecimal cmoAnoUltMod) {
        this.cmoAnoUltMod = cmoAnoUltMod;
    }

    public BigDecimal getCmoAnoUltMod() {
        return this.cmoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoMesUltMod(BigDecimal cmoMesUltMod) {
        this.cmoMesUltMod = cmoMesUltMod;
    }

    public BigDecimal getCmoMesUltMod() {
        return this.cmoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCmoDiaUltMod(BigDecimal cmoDiaUltMod) {
        this.cmoDiaUltMod = cmoDiaUltMod;
    }

    public BigDecimal getCmoDiaUltMod() {
        return this.cmoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmoCveStCedemoro(String cmoCveStCedemoro) {
        this.cmoCveStCedemoro = cmoCveStCedemoro;
    }

    public String getCmoCveStCedemoro() {
        return this.cmoCveStCedemoro;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CEDEMORO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCmoNumPrograma() != null && this.getCmoNumPrograma().longValue() == -999) {
            conditions += " AND CMO_NUM_PROGRAMA IS NULL";
        } else if (this.getCmoNumPrograma() != null) {
            conditions += " AND CMO_NUM_PROGRAMA = ?";
            values.add(this.getCmoNumPrograma());
        }

        if (this.getCmoNumEmision() != null && this.getCmoNumEmision().longValue() == -999) {
            conditions += " AND CMO_NUM_EMISION IS NULL";
        } else if (this.getCmoNumEmision() != null) {
            conditions += " AND CMO_NUM_EMISION = ?";
            values.add(this.getCmoNumEmision());
        }

        if (this.getCmoNumCedevis() != null && this.getCmoNumCedevis().longValue() == -999) {
            conditions += " AND CMO_NUM_CEDEVIS IS NULL";
        } else if (this.getCmoNumCedevis() != null) {
            conditions += " AND CMO_NUM_CEDEVIS = ?";
            values.add(this.getCmoNumCedevis());
        }

        if (this.getCmoNumSecCob() != null && this.getCmoNumSecCob().longValue() == -999) {
            conditions += " AND CMO_NUM_SEC_COB IS NULL";
        } else if (this.getCmoNumSecCob() != null) {
            conditions += " AND CMO_NUM_SEC_COB = ?";
            values.add(this.getCmoNumSecCob());
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
        String sql = "SELECT * FROM CEDEMORO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCmoNumPrograma() != null && this.getCmoNumPrograma().longValue() == -999) {
            conditions += " AND CMO_NUM_PROGRAMA IS NULL";
        } else if (this.getCmoNumPrograma() != null) {
            conditions += " AND CMO_NUM_PROGRAMA = ?";
            values.add(this.getCmoNumPrograma());
        }

        if (this.getCmoNumEmision() != null && this.getCmoNumEmision().longValue() == -999) {
            conditions += " AND CMO_NUM_EMISION IS NULL";
        } else if (this.getCmoNumEmision() != null) {
            conditions += " AND CMO_NUM_EMISION = ?";
            values.add(this.getCmoNumEmision());
        }

        if (this.getCmoNumCedevis() != null && this.getCmoNumCedevis().longValue() == -999) {
            conditions += " AND CMO_NUM_CEDEVIS IS NULL";
        } else if (this.getCmoNumCedevis() != null) {
            conditions += " AND CMO_NUM_CEDEVIS = ?";
            values.add(this.getCmoNumCedevis());
        }

        if (this.getCmoNumSecCob() != null && this.getCmoNumSecCob().longValue() == -999) {
            conditions += " AND CMO_NUM_SEC_COB IS NULL";
        } else if (this.getCmoNumSecCob() != null) {
            conditions += " AND CMO_NUM_SEC_COB = ?";
            values.add(this.getCmoNumSecCob());
        }

        if (this.getCmoConcepMor() != null && "null".equals(this.getCmoConcepMor())) {
            conditions += " AND CMO_CONCEP_MOR IS NULL";
        } else if (this.getCmoConcepMor() != null) {
            conditions += " AND CMO_CONCEP_MOR = ?";
            values.add(this.getCmoConcepMor());
        }

        if (this.getCmoAnoInicioExt() != null && this.getCmoAnoInicioExt().longValue() == -999) {
            conditions += " AND CMO_ANO_INICIO_EXT IS NULL";
        } else if (this.getCmoAnoInicioExt() != null) {
            conditions += " AND CMO_ANO_INICIO_EXT = ?";
            values.add(this.getCmoAnoInicioExt());
        }

        if (this.getCmoMesInicioExt() != null && this.getCmoMesInicioExt().longValue() == -999) {
            conditions += " AND CMO_MES_INICIO_EXT IS NULL";
        } else if (this.getCmoMesInicioExt() != null) {
            conditions += " AND CMO_MES_INICIO_EXT = ?";
            values.add(this.getCmoMesInicioExt());
        }

        if (this.getCmoDiaInicioExt() != null && this.getCmoDiaInicioExt().longValue() == -999) {
            conditions += " AND CMO_DIA_INICIO_EXT IS NULL";
        } else if (this.getCmoDiaInicioExt() != null) {
            conditions += " AND CMO_DIA_INICIO_EXT = ?";
            values.add(this.getCmoDiaInicioExt());
        }

        if (this.getCmoAnoFinExt() != null && this.getCmoAnoFinExt().longValue() == -999) {
            conditions += " AND CMO_ANO_FIN_EXT IS NULL";
        } else if (this.getCmoAnoFinExt() != null) {
            conditions += " AND CMO_ANO_FIN_EXT = ?";
            values.add(this.getCmoAnoFinExt());
        }

        if (this.getCmoMesFinExt() != null && this.getCmoMesFinExt().longValue() == -999) {
            conditions += " AND CMO_MES_FIN_EXT IS NULL";
        } else if (this.getCmoMesFinExt() != null) {
            conditions += " AND CMO_MES_FIN_EXT = ?";
            values.add(this.getCmoMesFinExt());
        }

        if (this.getCmoDiaFinExt() != null && this.getCmoDiaFinExt().longValue() == -999) {
            conditions += " AND CMO_DIA_FIN_EXT IS NULL";
        } else if (this.getCmoDiaFinExt() != null) {
            conditions += " AND CMO_DIA_FIN_EXT = ?";
            values.add(this.getCmoDiaFinExt());
        }

        if (this.getCmoNumCtas() != null && this.getCmoNumCtas().longValue() == -999) {
            conditions += " AND CMO_NUM_CTAS IS NULL";
        } else if (this.getCmoNumCtas() != null) {
            conditions += " AND CMO_NUM_CTAS = ?";
            values.add(this.getCmoNumCtas());
        }

        if (this.getCmoImpSaldo() != null && this.getCmoImpSaldo().longValue() == -999) {
            conditions += " AND CMO_IMP_SALDO IS NULL";
        } else if (this.getCmoImpSaldo() != null) {
            conditions += " AND CMO_IMP_SALDO = ?";
            values.add(this.getCmoImpSaldo());
        }

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

        if (this.getCmoAnoAltaReg() != null && this.getCmoAnoAltaReg().longValue() == -999) {
            conditions += " AND CMO_ANO_ALTA_REG IS NULL";
        } else if (this.getCmoAnoAltaReg() != null) {
            conditions += " AND CMO_ANO_ALTA_REG = ?";
            values.add(this.getCmoAnoAltaReg());
        }

        if (this.getCmoMesAltaReg() != null && this.getCmoMesAltaReg().longValue() == -999) {
            conditions += " AND CMO_MES_ALTA_REG IS NULL";
        } else if (this.getCmoMesAltaReg() != null) {
            conditions += " AND CMO_MES_ALTA_REG = ?";
            values.add(this.getCmoMesAltaReg());
        }

        if (this.getCmoDiaAltaReg() != null && this.getCmoDiaAltaReg().longValue() == -999) {
            conditions += " AND CMO_DIA_ALTA_REG IS NULL";
        } else if (this.getCmoDiaAltaReg() != null) {
            conditions += " AND CMO_DIA_ALTA_REG = ?";
            values.add(this.getCmoDiaAltaReg());
        }

        if (this.getCmoAnoUltMod() != null && this.getCmoAnoUltMod().longValue() == -999) {
            conditions += " AND CMO_ANO_ULT_MOD IS NULL";
        } else if (this.getCmoAnoUltMod() != null) {
            conditions += " AND CMO_ANO_ULT_MOD = ?";
            values.add(this.getCmoAnoUltMod());
        }

        if (this.getCmoMesUltMod() != null && this.getCmoMesUltMod().longValue() == -999) {
            conditions += " AND CMO_MES_ULT_MOD IS NULL";
        } else if (this.getCmoMesUltMod() != null) {
            conditions += " AND CMO_MES_ULT_MOD = ?";
            values.add(this.getCmoMesUltMod());
        }

        if (this.getCmoDiaUltMod() != null && this.getCmoDiaUltMod().longValue() == -999) {
            conditions += " AND CMO_DIA_ULT_MOD IS NULL";
        } else if (this.getCmoDiaUltMod() != null) {
            conditions += " AND CMO_DIA_ULT_MOD = ?";
            values.add(this.getCmoDiaUltMod());
        }

        if (this.getCmoCveStCedemoro() != null && "null".equals(this.getCmoCveStCedemoro())) {
            conditions += " AND CMO_CVE_ST_CEDEMORO IS NULL";
        } else if (this.getCmoCveStCedemoro() != null) {
            conditions += " AND CMO_CVE_ST_CEDEMORO = ?";
            values.add(this.getCmoCveStCedemoro());
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
        String sql = "UPDATE CEDEMORO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CMO_NUM_PROGRAMA = ?";
        pkValues.add(this.getCmoNumPrograma());
        conditions += " AND CMO_NUM_EMISION = ?";
        pkValues.add(this.getCmoNumEmision());
        conditions += " AND CMO_NUM_CEDEVIS = ?";
        pkValues.add(this.getCmoNumCedevis());
        conditions += " AND CMO_NUM_SEC_COB = ?";
        pkValues.add(this.getCmoNumSecCob());
        fields += " CMO_CONCEP_MOR = ?, ";
        values.add(this.getCmoConcepMor());
        fields += " CMO_ANO_INICIO_EXT = ?, ";
        values.add(this.getCmoAnoInicioExt());
        fields += " CMO_MES_INICIO_EXT = ?, ";
        values.add(this.getCmoMesInicioExt());
        fields += " CMO_DIA_INICIO_EXT = ?, ";
        values.add(this.getCmoDiaInicioExt());
        fields += " CMO_ANO_FIN_EXT = ?, ";
        values.add(this.getCmoAnoFinExt());
        fields += " CMO_MES_FIN_EXT = ?, ";
        values.add(this.getCmoMesFinExt());
        fields += " CMO_DIA_FIN_EXT = ?, ";
        values.add(this.getCmoDiaFinExt());
        fields += " CMO_NUM_CTAS = ?, ";
        values.add(this.getCmoNumCtas());
        fields += " CMO_IMP_SALDO = ?, ";
        values.add(this.getCmoImpSaldo());
        fields += " CHO_NUM_PROGRAMA = ?, ";
        values.add(this.getChoNumPrograma());
        fields += " CHO_NUM_EMISION = ?, ";
        values.add(this.getChoNumEmision());
        fields += " CHO_NUM_CEDEVIS = ?, ";
        values.add(this.getChoNumCedevis());
        fields += " CHO_NUM_SEC_HONOR = ?, ";
        values.add(this.getChoNumSecHonor());
        fields += " CHO_CONCEPTO = ?, ";
        values.add(this.getChoConcepto());
        fields += " CHO_IMP_HONORARIO = ?, ";
        values.add(this.getChoImpHonorario());
        fields += " CMO_ANO_ALTA_REG = ?, ";
        values.add(this.getCmoAnoAltaReg());
        fields += " CMO_MES_ALTA_REG = ?, ";
        values.add(this.getCmoMesAltaReg());
        fields += " CMO_DIA_ALTA_REG = ?, ";
        values.add(this.getCmoDiaAltaReg());
        fields += " CMO_ANO_ULT_MOD = ?, ";
        values.add(this.getCmoAnoUltMod());
        fields += " CMO_MES_ULT_MOD = ?, ";
        values.add(this.getCmoMesUltMod());
        fields += " CMO_DIA_ULT_MOD = ?, ";
        values.add(this.getCmoDiaUltMod());
        fields += " CMO_CVE_ST_CEDEMORO = ?, ";
        values.add(this.getCmoCveStCedemoro());
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
        String sql = "INSERT INTO CEDEMORO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CMO_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCmoNumPrograma());

        fields += ", CMO_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getCmoNumEmision());

        fields += ", CMO_NUM_CEDEVIS";
        fieldValues += ", ?";
        values.add(this.getCmoNumCedevis());

        fields += ", CMO_NUM_SEC_COB";
        fieldValues += ", ?";
        values.add(this.getCmoNumSecCob());

        fields += ", CMO_CONCEP_MOR";
        fieldValues += ", ?";
        values.add(this.getCmoConcepMor());

        fields += ", CMO_ANO_INICIO_EXT";
        fieldValues += ", ?";
        values.add(this.getCmoAnoInicioExt());

        fields += ", CMO_MES_INICIO_EXT";
        fieldValues += ", ?";
        values.add(this.getCmoMesInicioExt());

        fields += ", CMO_DIA_INICIO_EXT";
        fieldValues += ", ?";
        values.add(this.getCmoDiaInicioExt());

        fields += ", CMO_ANO_FIN_EXT";
        fieldValues += ", ?";
        values.add(this.getCmoAnoFinExt());

        fields += ", CMO_MES_FIN_EXT";
        fieldValues += ", ?";
        values.add(this.getCmoMesFinExt());

        fields += ", CMO_DIA_FIN_EXT";
        fieldValues += ", ?";
        values.add(this.getCmoDiaFinExt());

        fields += ", CMO_NUM_CTAS";
        fieldValues += ", ?";
        values.add(this.getCmoNumCtas());

        fields += ", CMO_IMP_SALDO";
        fieldValues += ", ?";
        values.add(this.getCmoImpSaldo());

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

        fields += ", CMO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCmoAnoAltaReg());

        fields += ", CMO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCmoMesAltaReg());

        fields += ", CMO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCmoDiaAltaReg());

        fields += ", CMO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCmoAnoUltMod());

        fields += ", CMO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCmoMesUltMod());

        fields += ", CMO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCmoDiaUltMod());

        fields += ", CMO_CVE_ST_CEDEMORO";
        fieldValues += ", ?";
        values.add(this.getCmoCveStCedemoro());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CEDEMORO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CMO_NUM_PROGRAMA = ?";
        values.add(this.getCmoNumPrograma());
        conditions += " AND CMO_NUM_EMISION = ?";
        values.add(this.getCmoNumEmision());
        conditions += " AND CMO_NUM_CEDEVIS = ?";
        values.add(this.getCmoNumCedevis());
        conditions += " AND CMO_NUM_SEC_COB = ?";
        values.add(this.getCmoNumSecCob());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cedemoro instance = (Cedemoro) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCmoNumPrograma().equals(instance.getCmoNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCmoNumEmision().equals(instance.getCmoNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCmoNumCedevis().equals(instance.getCmoNumCedevis()))
            equalObjects = false;
        if (equalObjects && !this.getCmoNumSecCob().equals(instance.getCmoNumSecCob()))
            equalObjects = false;
        if (equalObjects && !this.getCmoConcepMor().equals(instance.getCmoConcepMor()))
            equalObjects = false;
        if (equalObjects && !this.getCmoAnoInicioExt().equals(instance.getCmoAnoInicioExt()))
            equalObjects = false;
        if (equalObjects && !this.getCmoMesInicioExt().equals(instance.getCmoMesInicioExt()))
            equalObjects = false;
        if (equalObjects && !this.getCmoDiaInicioExt().equals(instance.getCmoDiaInicioExt()))
            equalObjects = false;
        if (equalObjects && !this.getCmoAnoFinExt().equals(instance.getCmoAnoFinExt()))
            equalObjects = false;
        if (equalObjects && !this.getCmoMesFinExt().equals(instance.getCmoMesFinExt()))
            equalObjects = false;
        if (equalObjects && !this.getCmoDiaFinExt().equals(instance.getCmoDiaFinExt()))
            equalObjects = false;
        if (equalObjects && !this.getCmoNumCtas().equals(instance.getCmoNumCtas()))
            equalObjects = false;
        if (equalObjects && !this.getCmoImpSaldo().equals(instance.getCmoImpSaldo()))
            equalObjects = false;
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
        if (equalObjects && !this.getCmoAnoAltaReg().equals(instance.getCmoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCmoMesAltaReg().equals(instance.getCmoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCmoDiaAltaReg().equals(instance.getCmoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCmoAnoUltMod().equals(instance.getCmoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCmoMesUltMod().equals(instance.getCmoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCmoDiaUltMod().equals(instance.getCmoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCmoCveStCedemoro().equals(instance.getCmoCveStCedemoro()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cedemoro result = new Cedemoro();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCmoNumPrograma((BigDecimal) objectData.getData("CMO_NUM_PROGRAMA"));
        result.setCmoNumEmision((BigDecimal) objectData.getData("CMO_NUM_EMISION"));
        result.setCmoNumCedevis((BigDecimal) objectData.getData("CMO_NUM_CEDEVIS"));
        result.setCmoNumSecCob((BigDecimal) objectData.getData("CMO_NUM_SEC_COB"));
        result.setCmoConcepMor((String) objectData.getData("CMO_CONCEP_MOR"));
        result.setCmoAnoInicioExt((BigDecimal) objectData.getData("CMO_ANO_INICIO_EXT"));
        result.setCmoMesInicioExt((BigDecimal) objectData.getData("CMO_MES_INICIO_EXT"));
        result.setCmoDiaInicioExt((BigDecimal) objectData.getData("CMO_DIA_INICIO_EXT"));
        result.setCmoAnoFinExt((BigDecimal) objectData.getData("CMO_ANO_FIN_EXT"));
        result.setCmoMesFinExt((BigDecimal) objectData.getData("CMO_MES_FIN_EXT"));
        result.setCmoDiaFinExt((BigDecimal) objectData.getData("CMO_DIA_FIN_EXT"));
        result.setCmoNumCtas((BigDecimal) objectData.getData("CMO_NUM_CTAS"));
        result.setCmoImpSaldo((BigDecimal) objectData.getData("CMO_IMP_SALDO"));
        result.setChoNumPrograma((BigDecimal) objectData.getData("CHO_NUM_PROGRAMA"));
        result.setChoNumEmision((BigDecimal) objectData.getData("CHO_NUM_EMISION"));
        result.setChoNumCedevis((BigDecimal) objectData.getData("CHO_NUM_CEDEVIS"));
        result.setChoNumSecHonor((BigDecimal) objectData.getData("CHO_NUM_SEC_HONOR"));
        result.setChoConcepto((String) objectData.getData("CHO_CONCEPTO"));
        result.setChoImpHonorario((BigDecimal) objectData.getData("CHO_IMP_HONORARIO"));
        result.setCmoAnoAltaReg((BigDecimal) objectData.getData("CMO_ANO_ALTA_REG"));
        result.setCmoMesAltaReg((BigDecimal) objectData.getData("CMO_MES_ALTA_REG"));
        result.setCmoDiaAltaReg((BigDecimal) objectData.getData("CMO_DIA_ALTA_REG"));
        result.setCmoAnoUltMod((BigDecimal) objectData.getData("CMO_ANO_ULT_MOD"));
        result.setCmoMesUltMod((BigDecimal) objectData.getData("CMO_MES_ULT_MOD"));
        result.setCmoDiaUltMod((BigDecimal) objectData.getData("CMO_DIA_ULT_MOD"));
        result.setCmoCveStCedemoro((String) objectData.getData("CMO_CVE_ST_CEDEMORO"));

        return result;

    }

}
