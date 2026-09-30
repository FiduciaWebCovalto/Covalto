package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INSTRUME_PK", columns = { "INS_CVE_TIPO_MERCA", "INS_NUM_INSTRUME" }, sequences = { "MANUAL" })
public class Instrume extends DomainObject {

    BigDecimal insCveTipoMerca = null;
    BigDecimal insNumInstrume = null;
    String insMnemoInstrume = null;
    String insNomInstrume = null;
    BigDecimal insValorNominal = null;
    String insCveClasifFid = null;
    BigDecimal insCveElegi30 = null;
    BigDecimal insCveRetIsr = null;
    BigDecimal insCveElegiLiq = null;
    BigDecimal insCvePagoInt = null;
    BigDecimal insCveValoriza = null;
    BigDecimal insCveAmortiza = null;
    String insCveTipoPers = null;
    String insCvePersAdq = null;
    BigDecimal insAnoAltaReg = null;
    BigDecimal insMesAltaReg = null;
    BigDecimal insDiaAltaReg = null;
    BigDecimal insAnoUltMod = null;
    BigDecimal insMesUltMod = null;
    BigDecimal insDiaUltMod = null;
    String insCveStInstrum = null;
    BigDecimal insCveBajoPar = null;

    public Instrume() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveTipoMerca(BigDecimal insCveTipoMerca) {
        this.insCveTipoMerca = insCveTipoMerca;
    }

    public BigDecimal getInsCveTipoMerca() {
        return this.insCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumInstrume(BigDecimal insNumInstrume) {
        this.insNumInstrume = insNumInstrume;
    }

    public BigDecimal getInsNumInstrume() {
        return this.insNumInstrume;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsMnemoInstrume(String insMnemoInstrume) {
        this.insMnemoInstrume = insMnemoInstrume;
    }

    public String getInsMnemoInstrume() {
        return this.insMnemoInstrume;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsNomInstrume(String insNomInstrume) {
        this.insNomInstrume = insNomInstrume;
    }

    public String getInsNomInstrume() {
        return this.insNomInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setInsValorNominal(BigDecimal insValorNominal) {
        this.insValorNominal = insValorNominal;
    }

    public BigDecimal getInsValorNominal() {
        return this.insValorNominal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveClasifFid(String insCveClasifFid) {
        this.insCveClasifFid = insCveClasifFid;
    }

    public String getInsCveClasifFid() {
        return this.insCveClasifFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveElegi30(BigDecimal insCveElegi30) {
        this.insCveElegi30 = insCveElegi30;
    }

    public BigDecimal getInsCveElegi30() {
        return this.insCveElegi30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveRetIsr(BigDecimal insCveRetIsr) {
        this.insCveRetIsr = insCveRetIsr;
    }

    public BigDecimal getInsCveRetIsr() {
        return this.insCveRetIsr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveElegiLiq(BigDecimal insCveElegiLiq) {
        this.insCveElegiLiq = insCveElegiLiq;
    }

    public BigDecimal getInsCveElegiLiq() {
        return this.insCveElegiLiq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCvePagoInt(BigDecimal insCvePagoInt) {
        this.insCvePagoInt = insCvePagoInt;
    }

    public BigDecimal getInsCvePagoInt() {
        return this.insCvePagoInt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveValoriza(BigDecimal insCveValoriza) {
        this.insCveValoriza = insCveValoriza;
    }

    public BigDecimal getInsCveValoriza() {
        return this.insCveValoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveAmortiza(BigDecimal insCveAmortiza) {
        this.insCveAmortiza = insCveAmortiza;
    }

    public BigDecimal getInsCveAmortiza() {
        return this.insCveAmortiza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveTipoPers(String insCveTipoPers) {
        this.insCveTipoPers = insCveTipoPers;
    }

    public String getInsCveTipoPers() {
        return this.insCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCvePersAdq(String insCvePersAdq) {
        this.insCvePersAdq = insCvePersAdq;
    }

    public String getInsCvePersAdq() {
        return this.insCvePersAdq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInsAnoAltaReg(BigDecimal insAnoAltaReg) {
        this.insAnoAltaReg = insAnoAltaReg;
    }

    public BigDecimal getInsAnoAltaReg() {
        return this.insAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsMesAltaReg(BigDecimal insMesAltaReg) {
        this.insMesAltaReg = insMesAltaReg;
    }

    public BigDecimal getInsMesAltaReg() {
        return this.insMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsDiaAltaReg(BigDecimal insDiaAltaReg) {
        this.insDiaAltaReg = insDiaAltaReg;
    }

    public BigDecimal getInsDiaAltaReg() {
        return this.insDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInsAnoUltMod(BigDecimal insAnoUltMod) {
        this.insAnoUltMod = insAnoUltMod;
    }

    public BigDecimal getInsAnoUltMod() {
        return this.insAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsMesUltMod(BigDecimal insMesUltMod) {
        this.insMesUltMod = insMesUltMod;
    }

    public BigDecimal getInsMesUltMod() {
        return this.insMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsDiaUltMod(BigDecimal insDiaUltMod) {
        this.insDiaUltMod = insDiaUltMod;
    }

    public BigDecimal getInsDiaUltMod() {
        return this.insDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveStInstrum(String insCveStInstrum) {
        this.insCveStInstrum = insCveStInstrum;
    }

    public String getInsCveStInstrum() {
        return this.insCveStInstrum;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsCveBajoPar(BigDecimal insCveBajoPar) {
        this.insCveBajoPar = insCveBajoPar;
    }

    public BigDecimal getInsCveBajoPar() {
        return this.insCveBajoPar;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INSTRUME ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsCveTipoMerca() != null && this.getInsCveTipoMerca().longValue() == -999) {
            conditions += " AND INS_CVE_TIPO_MERCA IS NULL";
        } else if (this.getInsCveTipoMerca() != null) {
            conditions += " AND INS_CVE_TIPO_MERCA = ?";
            values.add(this.getInsCveTipoMerca());
        }

        if (this.getInsNumInstrume() != null && this.getInsNumInstrume().longValue() == -999) {
            conditions += " AND INS_NUM_INSTRUME IS NULL";
        } else if (this.getInsNumInstrume() != null) {
            conditions += " AND INS_NUM_INSTRUME = ?";
            values.add(this.getInsNumInstrume());
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
        String sql = "SELECT * FROM INSTRUME ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsCveTipoMerca() != null && this.getInsCveTipoMerca().longValue() == -999) {
            conditions += " AND INS_CVE_TIPO_MERCA IS NULL";
        } else if (this.getInsCveTipoMerca() != null) {
            conditions += " AND INS_CVE_TIPO_MERCA = ?";
            values.add(this.getInsCveTipoMerca());
        }

        if (this.getInsNumInstrume() != null && this.getInsNumInstrume().longValue() == -999) {
            conditions += " AND INS_NUM_INSTRUME IS NULL";
        } else if (this.getInsNumInstrume() != null) {
            conditions += " AND INS_NUM_INSTRUME = ?";
            values.add(this.getInsNumInstrume());
        }

        if (this.getInsMnemoInstrume() != null && "null".equals(this.getInsMnemoInstrume())) {
            conditions += " AND INS_MNEMO_INSTRUME IS NULL";
        } else if (this.getInsMnemoInstrume() != null) {
            conditions += " AND INS_MNEMO_INSTRUME = ?";
            values.add(this.getInsMnemoInstrume());
        }

        if (this.getInsNomInstrume() != null && "null".equals(this.getInsNomInstrume())) {
            conditions += " AND INS_NOM_INSTRUME IS NULL";
        } else if (this.getInsNomInstrume() != null) {
            conditions += " AND INS_NOM_INSTRUME = ?";
            values.add(this.getInsNomInstrume());
        }

        if (this.getInsValorNominal() != null && this.getInsValorNominal().longValue() == -999) {
            conditions += " AND INS_VALOR_NOMINAL IS NULL";
        } else if (this.getInsValorNominal() != null) {
            conditions += " AND INS_VALOR_NOMINAL = ?";
            values.add(this.getInsValorNominal());
        }

        if (this.getInsCveClasifFid() != null && "null".equals(this.getInsCveClasifFid())) {
            conditions += " AND INS_CVE_CLASIF_FID IS NULL";
        } else if (this.getInsCveClasifFid() != null) {
            conditions += " AND INS_CVE_CLASIF_FID = ?";
            values.add(this.getInsCveClasifFid());
        }

        if (this.getInsCveElegi30() != null && this.getInsCveElegi30().longValue() == -999) {
            conditions += " AND INS_CVE_ELEGI_30 IS NULL";
        } else if (this.getInsCveElegi30() != null) {
            conditions += " AND INS_CVE_ELEGI_30 = ?";
            values.add(this.getInsCveElegi30());
        }

        if (this.getInsCveRetIsr() != null && this.getInsCveRetIsr().longValue() == -999) {
            conditions += " AND INS_CVE_RET_ISR IS NULL";
        } else if (this.getInsCveRetIsr() != null) {
            conditions += " AND INS_CVE_RET_ISR = ?";
            values.add(this.getInsCveRetIsr());
        }

        if (this.getInsCveElegiLiq() != null && this.getInsCveElegiLiq().longValue() == -999) {
            conditions += " AND INS_CVE_ELEGI_LIQ IS NULL";
        } else if (this.getInsCveElegiLiq() != null) {
            conditions += " AND INS_CVE_ELEGI_LIQ = ?";
            values.add(this.getInsCveElegiLiq());
        }

        if (this.getInsCvePagoInt() != null && this.getInsCvePagoInt().longValue() == -999) {
            conditions += " AND INS_CVE_PAGO_INT IS NULL";
        } else if (this.getInsCvePagoInt() != null) {
            conditions += " AND INS_CVE_PAGO_INT = ?";
            values.add(this.getInsCvePagoInt());
        }

        if (this.getInsCveValoriza() != null && this.getInsCveValoriza().longValue() == -999) {
            conditions += " AND INS_CVE_VALORIZA IS NULL";
        } else if (this.getInsCveValoriza() != null) {
            conditions += " AND INS_CVE_VALORIZA = ?";
            values.add(this.getInsCveValoriza());
        }

        if (this.getInsCveAmortiza() != null && this.getInsCveAmortiza().longValue() == -999) {
            conditions += " AND INS_CVE_AMORTIZA IS NULL";
        } else if (this.getInsCveAmortiza() != null) {
            conditions += " AND INS_CVE_AMORTIZA = ?";
            values.add(this.getInsCveAmortiza());
        }

        if (this.getInsCveTipoPers() != null && "null".equals(this.getInsCveTipoPers())) {
            conditions += " AND INS_CVE_TIPO_PERS IS NULL";
        } else if (this.getInsCveTipoPers() != null) {
            conditions += " AND INS_CVE_TIPO_PERS = ?";
            values.add(this.getInsCveTipoPers());
        }

        if (this.getInsCvePersAdq() != null && "null".equals(this.getInsCvePersAdq())) {
            conditions += " AND INS_CVE_PERS_ADQ IS NULL";
        } else if (this.getInsCvePersAdq() != null) {
            conditions += " AND INS_CVE_PERS_ADQ = ?";
            values.add(this.getInsCvePersAdq());
        }

        if (this.getInsAnoAltaReg() != null && this.getInsAnoAltaReg().longValue() == -999) {
            conditions += " AND INS_ANO_ALTA_REG IS NULL";
        } else if (this.getInsAnoAltaReg() != null) {
            conditions += " AND INS_ANO_ALTA_REG = ?";
            values.add(this.getInsAnoAltaReg());
        }

        if (this.getInsMesAltaReg() != null && this.getInsMesAltaReg().longValue() == -999) {
            conditions += " AND INS_MES_ALTA_REG IS NULL";
        } else if (this.getInsMesAltaReg() != null) {
            conditions += " AND INS_MES_ALTA_REG = ?";
            values.add(this.getInsMesAltaReg());
        }

        if (this.getInsDiaAltaReg() != null && this.getInsDiaAltaReg().longValue() == -999) {
            conditions += " AND INS_DIA_ALTA_REG IS NULL";
        } else if (this.getInsDiaAltaReg() != null) {
            conditions += " AND INS_DIA_ALTA_REG = ?";
            values.add(this.getInsDiaAltaReg());
        }

        if (this.getInsAnoUltMod() != null && this.getInsAnoUltMod().longValue() == -999) {
            conditions += " AND INS_ANO_ULT_MOD IS NULL";
        } else if (this.getInsAnoUltMod() != null) {
            conditions += " AND INS_ANO_ULT_MOD = ?";
            values.add(this.getInsAnoUltMod());
        }

        if (this.getInsMesUltMod() != null && this.getInsMesUltMod().longValue() == -999) {
            conditions += " AND INS_MES_ULT_MOD IS NULL";
        } else if (this.getInsMesUltMod() != null) {
            conditions += " AND INS_MES_ULT_MOD = ?";
            values.add(this.getInsMesUltMod());
        }

        if (this.getInsDiaUltMod() != null && this.getInsDiaUltMod().longValue() == -999) {
            conditions += " AND INS_DIA_ULT_MOD IS NULL";
        } else if (this.getInsDiaUltMod() != null) {
            conditions += " AND INS_DIA_ULT_MOD = ?";
            values.add(this.getInsDiaUltMod());
        }

        if (this.getInsCveStInstrum() != null && "null".equals(this.getInsCveStInstrum())) {
            conditions += " AND INS_CVE_ST_INSTRUM IS NULL";
        } else if (this.getInsCveStInstrum() != null) {
            conditions += " AND INS_CVE_ST_INSTRUM = ?";
            values.add(this.getInsCveStInstrum());
        }

        if (this.getInsCveBajoPar() != null && this.getInsCveBajoPar().longValue() == -999) {
            conditions += " AND INS_CVE_BAJO_PAR IS NULL";
        } else if (this.getInsCveBajoPar() != null) {
            conditions += " AND INS_CVE_BAJO_PAR = ?";
            values.add(this.getInsCveBajoPar());
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
        String sql = "UPDATE INSTRUME SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INS_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getInsCveTipoMerca());
        conditions += " AND INS_NUM_INSTRUME = ?";
        pkValues.add(this.getInsNumInstrume());
        fields += " INS_MNEMO_INSTRUME = ?, ";
        values.add(this.getInsMnemoInstrume());
        fields += " INS_NOM_INSTRUME = ?, ";
        values.add(this.getInsNomInstrume());
        fields += " INS_VALOR_NOMINAL = ?, ";
        values.add(this.getInsValorNominal());
        fields += " INS_CVE_CLASIF_FID = ?, ";
        values.add(this.getInsCveClasifFid());
        fields += " INS_CVE_ELEGI_30 = ?, ";
        values.add(this.getInsCveElegi30());
        fields += " INS_CVE_RET_ISR = ?, ";
        values.add(this.getInsCveRetIsr());
        fields += " INS_CVE_ELEGI_LIQ = ?, ";
        values.add(this.getInsCveElegiLiq());
        fields += " INS_CVE_PAGO_INT = ?, ";
        values.add(this.getInsCvePagoInt());
        fields += " INS_CVE_VALORIZA = ?, ";
        values.add(this.getInsCveValoriza());
        fields += " INS_CVE_AMORTIZA = ?, ";
        values.add(this.getInsCveAmortiza());
        fields += " INS_CVE_TIPO_PERS = ?, ";
        values.add(this.getInsCveTipoPers());
        fields += " INS_CVE_PERS_ADQ = ?, ";
        values.add(this.getInsCvePersAdq());
        fields += " INS_ANO_ALTA_REG = ?, ";
        values.add(this.getInsAnoAltaReg());
        fields += " INS_MES_ALTA_REG = ?, ";
        values.add(this.getInsMesAltaReg());
        fields += " INS_DIA_ALTA_REG = ?, ";
        values.add(this.getInsDiaAltaReg());
        fields += " INS_ANO_ULT_MOD = ?, ";
        values.add(this.getInsAnoUltMod());
        fields += " INS_MES_ULT_MOD = ?, ";
        values.add(this.getInsMesUltMod());
        fields += " INS_DIA_ULT_MOD = ?, ";
        values.add(this.getInsDiaUltMod());
        fields += " INS_CVE_ST_INSTRUM = ?, ";
        values.add(this.getInsCveStInstrum());
        fields += " INS_CVE_BAJO_PAR = ?, ";
        values.add(this.getInsCveBajoPar());
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
        String sql = "INSERT INTO INSTRUME ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INS_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getInsCveTipoMerca());

        fields += ", INS_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getInsNumInstrume());

        fields += ", INS_MNEMO_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getInsMnemoInstrume());

        fields += ", INS_NOM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getInsNomInstrume());

        fields += ", INS_VALOR_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getInsValorNominal());

        fields += ", INS_CVE_CLASIF_FID";
        fieldValues += ", ?";
        values.add(this.getInsCveClasifFid());

        fields += ", INS_CVE_ELEGI_30";
        fieldValues += ", ?";
        values.add(this.getInsCveElegi30());

        fields += ", INS_CVE_RET_ISR";
        fieldValues += ", ?";
        values.add(this.getInsCveRetIsr());

        fields += ", INS_CVE_ELEGI_LIQ";
        fieldValues += ", ?";
        values.add(this.getInsCveElegiLiq());

        fields += ", INS_CVE_PAGO_INT";
        fieldValues += ", ?";
        values.add(this.getInsCvePagoInt());

        fields += ", INS_CVE_VALORIZA";
        fieldValues += ", ?";
        values.add(this.getInsCveValoriza());

        fields += ", INS_CVE_AMORTIZA";
        fieldValues += ", ?";
        values.add(this.getInsCveAmortiza());

        fields += ", INS_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getInsCveTipoPers());

        fields += ", INS_CVE_PERS_ADQ";
        fieldValues += ", ?";
        values.add(this.getInsCvePersAdq());

        fields += ", INS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInsAnoAltaReg());

        fields += ", INS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInsMesAltaReg());

        fields += ", INS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInsDiaAltaReg());

        fields += ", INS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInsAnoUltMod());

        fields += ", INS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInsMesUltMod());

        fields += ", INS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInsDiaUltMod());

        fields += ", INS_CVE_ST_INSTRUM";
        fieldValues += ", ?";
        values.add(this.getInsCveStInstrum());

        fields += ", INS_CVE_BAJO_PAR";
        fieldValues += ", ?";
        values.add(this.getInsCveBajoPar());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INSTRUME WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INS_CVE_TIPO_MERCA = ?";
        values.add(this.getInsCveTipoMerca());
        conditions += " AND INS_NUM_INSTRUME = ?";
        values.add(this.getInsNumInstrume());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Instrume instance = (Instrume) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getInsCveTipoMerca().equals(instance.getInsCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getInsNumInstrume().equals(instance.getInsNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getInsMnemoInstrume().equals(instance.getInsMnemoInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getInsNomInstrume().equals(instance.getInsNomInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getInsValorNominal().equals(instance.getInsValorNominal()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveClasifFid().equals(instance.getInsCveClasifFid()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveElegi30().equals(instance.getInsCveElegi30()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveRetIsr().equals(instance.getInsCveRetIsr()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveElegiLiq().equals(instance.getInsCveElegiLiq()))
            equalObjects = false;
        if (equalObjects && !this.getInsCvePagoInt().equals(instance.getInsCvePagoInt()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveValoriza().equals(instance.getInsCveValoriza()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveAmortiza().equals(instance.getInsCveAmortiza()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveTipoPers().equals(instance.getInsCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getInsCvePersAdq().equals(instance.getInsCvePersAdq()))
            equalObjects = false;
        if (equalObjects && !this.getInsAnoAltaReg().equals(instance.getInsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInsMesAltaReg().equals(instance.getInsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInsDiaAltaReg().equals(instance.getInsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInsAnoUltMod().equals(instance.getInsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInsMesUltMod().equals(instance.getInsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInsDiaUltMod().equals(instance.getInsDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveStInstrum().equals(instance.getInsCveStInstrum()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveBajoPar().equals(instance.getInsCveBajoPar()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Instrume result = new Instrume();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setInsCveTipoMerca((BigDecimal) objectData.getData("INS_CVE_TIPO_MERCA"));
        result.setInsNumInstrume((BigDecimal) objectData.getData("INS_NUM_INSTRUME"));
        result.setInsMnemoInstrume((String) objectData.getData("INS_MNEMO_INSTRUME"));
        result.setInsNomInstrume((String) objectData.getData("INS_NOM_INSTRUME"));
        result.setInsValorNominal((BigDecimal) objectData.getData("INS_VALOR_NOMINAL"));
        result.setInsCveClasifFid((String) objectData.getData("INS_CVE_CLASIF_FID"));
        result.setInsCveElegi30((BigDecimal) objectData.getData("INS_CVE_ELEGI_30"));
        result.setInsCveRetIsr((BigDecimal) objectData.getData("INS_CVE_RET_ISR"));
        result.setInsCveElegiLiq((BigDecimal) objectData.getData("INS_CVE_ELEGI_LIQ"));
        result.setInsCvePagoInt((BigDecimal) objectData.getData("INS_CVE_PAGO_INT"));
        result.setInsCveValoriza((BigDecimal) objectData.getData("INS_CVE_VALORIZA"));
        result.setInsCveAmortiza((BigDecimal) objectData.getData("INS_CVE_AMORTIZA"));
        result.setInsCveTipoPers((String) objectData.getData("INS_CVE_TIPO_PERS"));
        result.setInsCvePersAdq((String) objectData.getData("INS_CVE_PERS_ADQ"));
        result.setInsAnoAltaReg((BigDecimal) objectData.getData("INS_ANO_ALTA_REG"));
        result.setInsMesAltaReg((BigDecimal) objectData.getData("INS_MES_ALTA_REG"));
        result.setInsDiaAltaReg((BigDecimal) objectData.getData("INS_DIA_ALTA_REG"));
        result.setInsAnoUltMod((BigDecimal) objectData.getData("INS_ANO_ULT_MOD"));
        result.setInsMesUltMod((BigDecimal) objectData.getData("INS_MES_ULT_MOD"));
        result.setInsDiaUltMod((BigDecimal) objectData.getData("INS_DIA_ULT_MOD"));
        result.setInsCveStInstrum((String) objectData.getData("INS_CVE_ST_INSTRUM"));
        result.setInsCveBajoPar((BigDecimal) objectData.getData("INS_CVE_BAJO_PAR"));

        return result;

    }

}
