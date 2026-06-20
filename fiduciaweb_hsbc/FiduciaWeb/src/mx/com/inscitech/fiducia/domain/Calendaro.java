package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CALENDARO_PK", columns = { "CAL_NUM_USUARIO", "CAL_NUM_CALENDA", "CAL_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Calendaro extends DomainObject {

    BigDecimal calNumUsuario = null;
    BigDecimal calNumContrato = null;
    BigDecimal calNumCalenda = null;
    BigDecimal calAnoRealizop = null;
    BigDecimal calMesRealizop = null;
    BigDecimal calDiaRealizop = null;
    BigDecimal calAnoRealizoc = null;
    BigDecimal calMesRealizoc = null;
    BigDecimal calDiaRealizoc = null;
    String calNomRealizop = null;
    BigDecimal calAnoRevisop = null;
    BigDecimal calMesRevisop = null;
    BigDecimal calDiaRevisop = null;
    String calNomRevisop = null;
    BigDecimal calAnoAutorizp = null;
    BigDecimal calMesAutorizp = null;
    BigDecimal calDiaAutorizp = null;
    String calNomAutorizp = null;
    String calNomRealizoc = null;
    BigDecimal calAnoRevisoc = null;
    BigDecimal calMesRevisoc = null;
    BigDecimal calDiaRevisoc = null;
    String calNomRevisoc = null;
    BigDecimal calAnoAutorizc = null;
    BigDecimal calMesAutorizc = null;
    BigDecimal calDiaAutorizc = null;
    String calNomAutorizc = null;
    BigDecimal calAnoAltaReg = null;
    BigDecimal calMesAltaReg = null;
    BigDecimal calDiaAltaReg = null;
    BigDecimal calAnoUltMod = null;
    BigDecimal calMesUltMod = null;
    BigDecimal calDiaUltMod = null;

    public Calendaro() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumUsuario(BigDecimal calNumUsuario) {
        this.calNumUsuario = calNumUsuario;
    }

    public BigDecimal getCalNumUsuario() {
        return this.calNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumContrato(BigDecimal calNumContrato) {
        this.calNumContrato = calNumContrato;
    }

    public BigDecimal getCalNumContrato() {
        return this.calNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumCalenda(BigDecimal calNumCalenda) {
        this.calNumCalenda = calNumCalenda;
    }

    public BigDecimal getCalNumCalenda() {
        return this.calNumCalenda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoRealizop(BigDecimal calAnoRealizop) {
        this.calAnoRealizop = calAnoRealizop;
    }

    public BigDecimal getCalAnoRealizop() {
        return this.calAnoRealizop;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesRealizop(BigDecimal calMesRealizop) {
        this.calMesRealizop = calMesRealizop;
    }

    public BigDecimal getCalMesRealizop() {
        return this.calMesRealizop;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaRealizop(BigDecimal calDiaRealizop) {
        this.calDiaRealizop = calDiaRealizop;
    }

    public BigDecimal getCalDiaRealizop() {
        return this.calDiaRealizop;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoRealizoc(BigDecimal calAnoRealizoc) {
        this.calAnoRealizoc = calAnoRealizoc;
    }

    public BigDecimal getCalAnoRealizoc() {
        return this.calAnoRealizoc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesRealizoc(BigDecimal calMesRealizoc) {
        this.calMesRealizoc = calMesRealizoc;
    }

    public BigDecimal getCalMesRealizoc() {
        return this.calMesRealizoc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaRealizoc(BigDecimal calDiaRealizoc) {
        this.calDiaRealizoc = calDiaRealizoc;
    }

    public BigDecimal getCalDiaRealizoc() {
        return this.calDiaRealizoc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalNomRealizop(String calNomRealizop) {
        this.calNomRealizop = calNomRealizop;
    }

    public String getCalNomRealizop() {
        return this.calNomRealizop;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoRevisop(BigDecimal calAnoRevisop) {
        this.calAnoRevisop = calAnoRevisop;
    }

    public BigDecimal getCalAnoRevisop() {
        return this.calAnoRevisop;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesRevisop(BigDecimal calMesRevisop) {
        this.calMesRevisop = calMesRevisop;
    }

    public BigDecimal getCalMesRevisop() {
        return this.calMesRevisop;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaRevisop(BigDecimal calDiaRevisop) {
        this.calDiaRevisop = calDiaRevisop;
    }

    public BigDecimal getCalDiaRevisop() {
        return this.calDiaRevisop;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalNomRevisop(String calNomRevisop) {
        this.calNomRevisop = calNomRevisop;
    }

    public String getCalNomRevisop() {
        return this.calNomRevisop;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoAutorizp(BigDecimal calAnoAutorizp) {
        this.calAnoAutorizp = calAnoAutorizp;
    }

    public BigDecimal getCalAnoAutorizp() {
        return this.calAnoAutorizp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesAutorizp(BigDecimal calMesAutorizp) {
        this.calMesAutorizp = calMesAutorizp;
    }

    public BigDecimal getCalMesAutorizp() {
        return this.calMesAutorizp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaAutorizp(BigDecimal calDiaAutorizp) {
        this.calDiaAutorizp = calDiaAutorizp;
    }

    public BigDecimal getCalDiaAutorizp() {
        return this.calDiaAutorizp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalNomAutorizp(String calNomAutorizp) {
        this.calNomAutorizp = calNomAutorizp;
    }

    public String getCalNomAutorizp() {
        return this.calNomAutorizp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalNomRealizoc(String calNomRealizoc) {
        this.calNomRealizoc = calNomRealizoc;
    }

    public String getCalNomRealizoc() {
        return this.calNomRealizoc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoRevisoc(BigDecimal calAnoRevisoc) {
        this.calAnoRevisoc = calAnoRevisoc;
    }

    public BigDecimal getCalAnoRevisoc() {
        return this.calAnoRevisoc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesRevisoc(BigDecimal calMesRevisoc) {
        this.calMesRevisoc = calMesRevisoc;
    }

    public BigDecimal getCalMesRevisoc() {
        return this.calMesRevisoc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaRevisoc(BigDecimal calDiaRevisoc) {
        this.calDiaRevisoc = calDiaRevisoc;
    }

    public BigDecimal getCalDiaRevisoc() {
        return this.calDiaRevisoc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalNomRevisoc(String calNomRevisoc) {
        this.calNomRevisoc = calNomRevisoc;
    }

    public String getCalNomRevisoc() {
        return this.calNomRevisoc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoAutorizc(BigDecimal calAnoAutorizc) {
        this.calAnoAutorizc = calAnoAutorizc;
    }

    public BigDecimal getCalAnoAutorizc() {
        return this.calAnoAutorizc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesAutorizc(BigDecimal calMesAutorizc) {
        this.calMesAutorizc = calMesAutorizc;
    }

    public BigDecimal getCalMesAutorizc() {
        return this.calMesAutorizc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaAutorizc(BigDecimal calDiaAutorizc) {
        this.calDiaAutorizc = calDiaAutorizc;
    }

    public BigDecimal getCalDiaAutorizc() {
        return this.calDiaAutorizc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalNomAutorizc(String calNomAutorizc) {
        this.calNomAutorizc = calNomAutorizc;
    }

    public String getCalNomAutorizc() {
        return this.calNomAutorizc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoAltaReg(BigDecimal calAnoAltaReg) {
        this.calAnoAltaReg = calAnoAltaReg;
    }

    public BigDecimal getCalAnoAltaReg() {
        return this.calAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesAltaReg(BigDecimal calMesAltaReg) {
        this.calMesAltaReg = calMesAltaReg;
    }

    public BigDecimal getCalMesAltaReg() {
        return this.calMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaAltaReg(BigDecimal calDiaAltaReg) {
        this.calDiaAltaReg = calDiaAltaReg;
    }

    public BigDecimal getCalDiaAltaReg() {
        return this.calDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoUltMod(BigDecimal calAnoUltMod) {
        this.calAnoUltMod = calAnoUltMod;
    }

    public BigDecimal getCalAnoUltMod() {
        return this.calAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesUltMod(BigDecimal calMesUltMod) {
        this.calMesUltMod = calMesUltMod;
    }

    public BigDecimal getCalMesUltMod() {
        return this.calMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaUltMod(BigDecimal calDiaUltMod) {
        this.calDiaUltMod = calDiaUltMod;
    }

    public BigDecimal getCalDiaUltMod() {
        return this.calDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CALENDARO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCalNumUsuario() != null && this.getCalNumUsuario().longValue() == -999) {
            conditions += " AND CAL_NUM_USUARIO IS NULL";
        } else if (this.getCalNumUsuario() != null) {
            conditions += " AND CAL_NUM_USUARIO = ?";
            values.add(this.getCalNumUsuario());
        }

        if (this.getCalNumContrato() != null && this.getCalNumContrato().longValue() == -999) {
            conditions += " AND CAL_NUM_CONTRATO IS NULL";
        } else if (this.getCalNumContrato() != null) {
            conditions += " AND CAL_NUM_CONTRATO = ?";
            values.add(this.getCalNumContrato());
        }

        if (this.getCalNumCalenda() != null && this.getCalNumCalenda().longValue() == -999) {
            conditions += " AND CAL_NUM_CALENDA IS NULL";
        } else if (this.getCalNumCalenda() != null) {
            conditions += " AND CAL_NUM_CALENDA = ?";
            values.add(this.getCalNumCalenda());
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
        String sql = "SELECT * FROM CALENDARO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCalNumUsuario() != null && this.getCalNumUsuario().longValue() == -999) {
            conditions += " AND CAL_NUM_USUARIO IS NULL";
        } else if (this.getCalNumUsuario() != null) {
            conditions += " AND CAL_NUM_USUARIO = ?";
            values.add(this.getCalNumUsuario());
        }

        if (this.getCalNumContrato() != null && this.getCalNumContrato().longValue() == -999) {
            conditions += " AND CAL_NUM_CONTRATO IS NULL";
        } else if (this.getCalNumContrato() != null) {
            conditions += " AND CAL_NUM_CONTRATO = ?";
            values.add(this.getCalNumContrato());
        }

        if (this.getCalNumCalenda() != null && this.getCalNumCalenda().longValue() == -999) {
            conditions += " AND CAL_NUM_CALENDA IS NULL";
        } else if (this.getCalNumCalenda() != null) {
            conditions += " AND CAL_NUM_CALENDA = ?";
            values.add(this.getCalNumCalenda());
        }

        if (this.getCalAnoRealizop() != null && this.getCalAnoRealizop().longValue() == -999) {
            conditions += " AND CAL_ANO_REALIZOP IS NULL";
        } else if (this.getCalAnoRealizop() != null) {
            conditions += " AND CAL_ANO_REALIZOP = ?";
            values.add(this.getCalAnoRealizop());
        }

        if (this.getCalMesRealizop() != null && this.getCalMesRealizop().longValue() == -999) {
            conditions += " AND CAL_MES_REALIZOP IS NULL";
        } else if (this.getCalMesRealizop() != null) {
            conditions += " AND CAL_MES_REALIZOP = ?";
            values.add(this.getCalMesRealizop());
        }

        if (this.getCalDiaRealizop() != null && this.getCalDiaRealizop().longValue() == -999) {
            conditions += " AND CAL_DIA_REALIZOP IS NULL";
        } else if (this.getCalDiaRealizop() != null) {
            conditions += " AND CAL_DIA_REALIZOP = ?";
            values.add(this.getCalDiaRealizop());
        }

        if (this.getCalAnoRealizoc() != null && this.getCalAnoRealizoc().longValue() == -999) {
            conditions += " AND CAL_ANO_REALIZOC IS NULL";
        } else if (this.getCalAnoRealizoc() != null) {
            conditions += " AND CAL_ANO_REALIZOC = ?";
            values.add(this.getCalAnoRealizoc());
        }

        if (this.getCalMesRealizoc() != null && this.getCalMesRealizoc().longValue() == -999) {
            conditions += " AND CAL_MES_REALIZOC IS NULL";
        } else if (this.getCalMesRealizoc() != null) {
            conditions += " AND CAL_MES_REALIZOC = ?";
            values.add(this.getCalMesRealizoc());
        }

        if (this.getCalDiaRealizoc() != null && this.getCalDiaRealizoc().longValue() == -999) {
            conditions += " AND CAL_DIA_REALIZOC IS NULL";
        } else if (this.getCalDiaRealizoc() != null) {
            conditions += " AND CAL_DIA_REALIZOC = ?";
            values.add(this.getCalDiaRealizoc());
        }

        if (this.getCalNomRealizop() != null && "null".equals(this.getCalNomRealizop())) {
            conditions += " AND CAL_NOM_REALIZOP IS NULL";
        } else if (this.getCalNomRealizop() != null) {
            conditions += " AND CAL_NOM_REALIZOP = ?";
            values.add(this.getCalNomRealizop());
        }

        if (this.getCalAnoRevisop() != null && this.getCalAnoRevisop().longValue() == -999) {
            conditions += " AND CAL_ANO_REVISOP IS NULL";
        } else if (this.getCalAnoRevisop() != null) {
            conditions += " AND CAL_ANO_REVISOP = ?";
            values.add(this.getCalAnoRevisop());
        }

        if (this.getCalMesRevisop() != null && this.getCalMesRevisop().longValue() == -999) {
            conditions += " AND CAL_MES_REVISOP IS NULL";
        } else if (this.getCalMesRevisop() != null) {
            conditions += " AND CAL_MES_REVISOP = ?";
            values.add(this.getCalMesRevisop());
        }

        if (this.getCalDiaRevisop() != null && this.getCalDiaRevisop().longValue() == -999) {
            conditions += " AND CAL_DIA_REVISOP IS NULL";
        } else if (this.getCalDiaRevisop() != null) {
            conditions += " AND CAL_DIA_REVISOP = ?";
            values.add(this.getCalDiaRevisop());
        }

        if (this.getCalNomRevisop() != null && "null".equals(this.getCalNomRevisop())) {
            conditions += " AND CAL_NOM_REVISOP IS NULL";
        } else if (this.getCalNomRevisop() != null) {
            conditions += " AND CAL_NOM_REVISOP = ?";
            values.add(this.getCalNomRevisop());
        }

        if (this.getCalAnoAutorizp() != null && this.getCalAnoAutorizp().longValue() == -999) {
            conditions += " AND CAL_ANO_AUTORIZP IS NULL";
        } else if (this.getCalAnoAutorizp() != null) {
            conditions += " AND CAL_ANO_AUTORIZP = ?";
            values.add(this.getCalAnoAutorizp());
        }

        if (this.getCalMesAutorizp() != null && this.getCalMesAutorizp().longValue() == -999) {
            conditions += " AND CAL_MES_AUTORIZP IS NULL";
        } else if (this.getCalMesAutorizp() != null) {
            conditions += " AND CAL_MES_AUTORIZP = ?";
            values.add(this.getCalMesAutorizp());
        }

        if (this.getCalDiaAutorizp() != null && this.getCalDiaAutorizp().longValue() == -999) {
            conditions += " AND CAL_DIA_AUTORIZP IS NULL";
        } else if (this.getCalDiaAutorizp() != null) {
            conditions += " AND CAL_DIA_AUTORIZP = ?";
            values.add(this.getCalDiaAutorizp());
        }

        if (this.getCalNomAutorizp() != null && "null".equals(this.getCalNomAutorizp())) {
            conditions += " AND CAL_NOM_AUTORIZP IS NULL";
        } else if (this.getCalNomAutorizp() != null) {
            conditions += " AND CAL_NOM_AUTORIZP = ?";
            values.add(this.getCalNomAutorizp());
        }

        if (this.getCalNomRealizoc() != null && "null".equals(this.getCalNomRealizoc())) {
            conditions += " AND CAL_NOM_REALIZOC IS NULL";
        } else if (this.getCalNomRealizoc() != null) {
            conditions += " AND CAL_NOM_REALIZOC = ?";
            values.add(this.getCalNomRealizoc());
        }

        if (this.getCalAnoRevisoc() != null && this.getCalAnoRevisoc().longValue() == -999) {
            conditions += " AND CAL_ANO_REVISOC IS NULL";
        } else if (this.getCalAnoRevisoc() != null) {
            conditions += " AND CAL_ANO_REVISOC = ?";
            values.add(this.getCalAnoRevisoc());
        }

        if (this.getCalMesRevisoc() != null && this.getCalMesRevisoc().longValue() == -999) {
            conditions += " AND CAL_MES_REVISOC IS NULL";
        } else if (this.getCalMesRevisoc() != null) {
            conditions += " AND CAL_MES_REVISOC = ?";
            values.add(this.getCalMesRevisoc());
        }

        if (this.getCalDiaRevisoc() != null && this.getCalDiaRevisoc().longValue() == -999) {
            conditions += " AND CAL_DIA_REVISOC IS NULL";
        } else if (this.getCalDiaRevisoc() != null) {
            conditions += " AND CAL_DIA_REVISOC = ?";
            values.add(this.getCalDiaRevisoc());
        }

        if (this.getCalNomRevisoc() != null && "null".equals(this.getCalNomRevisoc())) {
            conditions += " AND CAL_NOM_REVISOC IS NULL";
        } else if (this.getCalNomRevisoc() != null) {
            conditions += " AND CAL_NOM_REVISOC = ?";
            values.add(this.getCalNomRevisoc());
        }

        if (this.getCalAnoAutorizc() != null && this.getCalAnoAutorizc().longValue() == -999) {
            conditions += " AND CAL_ANO_AUTORIZC IS NULL";
        } else if (this.getCalAnoAutorizc() != null) {
            conditions += " AND CAL_ANO_AUTORIZC = ?";
            values.add(this.getCalAnoAutorizc());
        }

        if (this.getCalMesAutorizc() != null && this.getCalMesAutorizc().longValue() == -999) {
            conditions += " AND CAL_MES_AUTORIZC IS NULL";
        } else if (this.getCalMesAutorizc() != null) {
            conditions += " AND CAL_MES_AUTORIZC = ?";
            values.add(this.getCalMesAutorizc());
        }

        if (this.getCalDiaAutorizc() != null && this.getCalDiaAutorizc().longValue() == -999) {
            conditions += " AND CAL_DIA_AUTORIZC IS NULL";
        } else if (this.getCalDiaAutorizc() != null) {
            conditions += " AND CAL_DIA_AUTORIZC = ?";
            values.add(this.getCalDiaAutorizc());
        }

        if (this.getCalNomAutorizc() != null && "null".equals(this.getCalNomAutorizc())) {
            conditions += " AND CAL_NOM_AUTORIZC IS NULL";
        } else if (this.getCalNomAutorizc() != null) {
            conditions += " AND CAL_NOM_AUTORIZC = ?";
            values.add(this.getCalNomAutorizc());
        }

        if (this.getCalAnoAltaReg() != null && this.getCalAnoAltaReg().longValue() == -999) {
            conditions += " AND CAL_ANO_ALTA_REG IS NULL";
        } else if (this.getCalAnoAltaReg() != null) {
            conditions += " AND CAL_ANO_ALTA_REG = ?";
            values.add(this.getCalAnoAltaReg());
        }

        if (this.getCalMesAltaReg() != null && this.getCalMesAltaReg().longValue() == -999) {
            conditions += " AND CAL_MES_ALTA_REG IS NULL";
        } else if (this.getCalMesAltaReg() != null) {
            conditions += " AND CAL_MES_ALTA_REG = ?";
            values.add(this.getCalMesAltaReg());
        }

        if (this.getCalDiaAltaReg() != null && this.getCalDiaAltaReg().longValue() == -999) {
            conditions += " AND CAL_DIA_ALTA_REG IS NULL";
        } else if (this.getCalDiaAltaReg() != null) {
            conditions += " AND CAL_DIA_ALTA_REG = ?";
            values.add(this.getCalDiaAltaReg());
        }

        if (this.getCalAnoUltMod() != null && this.getCalAnoUltMod().longValue() == -999) {
            conditions += " AND CAL_ANO_ULT_MOD IS NULL";
        } else if (this.getCalAnoUltMod() != null) {
            conditions += " AND CAL_ANO_ULT_MOD = ?";
            values.add(this.getCalAnoUltMod());
        }

        if (this.getCalMesUltMod() != null && this.getCalMesUltMod().longValue() == -999) {
            conditions += " AND CAL_MES_ULT_MOD IS NULL";
        } else if (this.getCalMesUltMod() != null) {
            conditions += " AND CAL_MES_ULT_MOD = ?";
            values.add(this.getCalMesUltMod());
        }

        if (this.getCalDiaUltMod() != null && this.getCalDiaUltMod().longValue() == -999) {
            conditions += " AND CAL_DIA_ULT_MOD IS NULL";
        } else if (this.getCalDiaUltMod() != null) {
            conditions += " AND CAL_DIA_ULT_MOD = ?";
            values.add(this.getCalDiaUltMod());
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
        String sql = "UPDATE CALENDARO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CAL_NUM_USUARIO = ?";
        pkValues.add(this.getCalNumUsuario());
        conditions += " AND CAL_NUM_CONTRATO = ?";
        pkValues.add(this.getCalNumContrato());
        conditions += " AND CAL_NUM_CALENDA = ?";
        pkValues.add(this.getCalNumCalenda());
        fields += " CAL_ANO_REALIZOP = ?, ";
        values.add(this.getCalAnoRealizop());
        fields += " CAL_MES_REALIZOP = ?, ";
        values.add(this.getCalMesRealizop());
        fields += " CAL_DIA_REALIZOP = ?, ";
        values.add(this.getCalDiaRealizop());
        fields += " CAL_ANO_REALIZOC = ?, ";
        values.add(this.getCalAnoRealizoc());
        fields += " CAL_MES_REALIZOC = ?, ";
        values.add(this.getCalMesRealizoc());
        fields += " CAL_DIA_REALIZOC = ?, ";
        values.add(this.getCalDiaRealizoc());
        fields += " CAL_NOM_REALIZOP = ?, ";
        values.add(this.getCalNomRealizop());
        fields += " CAL_ANO_REVISOP = ?, ";
        values.add(this.getCalAnoRevisop());
        fields += " CAL_MES_REVISOP = ?, ";
        values.add(this.getCalMesRevisop());
        fields += " CAL_DIA_REVISOP = ?, ";
        values.add(this.getCalDiaRevisop());
        fields += " CAL_NOM_REVISOP = ?, ";
        values.add(this.getCalNomRevisop());
        fields += " CAL_ANO_AUTORIZP = ?, ";
        values.add(this.getCalAnoAutorizp());
        fields += " CAL_MES_AUTORIZP = ?, ";
        values.add(this.getCalMesAutorizp());
        fields += " CAL_DIA_AUTORIZP = ?, ";
        values.add(this.getCalDiaAutorizp());
        fields += " CAL_NOM_AUTORIZP = ?, ";
        values.add(this.getCalNomAutorizp());
        fields += " CAL_NOM_REALIZOC = ?, ";
        values.add(this.getCalNomRealizoc());
        fields += " CAL_ANO_REVISOC = ?, ";
        values.add(this.getCalAnoRevisoc());
        fields += " CAL_MES_REVISOC = ?, ";
        values.add(this.getCalMesRevisoc());
        fields += " CAL_DIA_REVISOC = ?, ";
        values.add(this.getCalDiaRevisoc());
        fields += " CAL_NOM_REVISOC = ?, ";
        values.add(this.getCalNomRevisoc());
        fields += " CAL_ANO_AUTORIZC = ?, ";
        values.add(this.getCalAnoAutorizc());
        fields += " CAL_MES_AUTORIZC = ?, ";
        values.add(this.getCalMesAutorizc());
        fields += " CAL_DIA_AUTORIZC = ?, ";
        values.add(this.getCalDiaAutorizc());
        fields += " CAL_NOM_AUTORIZC = ?, ";
        values.add(this.getCalNomAutorizc());
        fields += " CAL_ANO_ALTA_REG = ?, ";
        values.add(this.getCalAnoAltaReg());
        fields += " CAL_MES_ALTA_REG = ?, ";
        values.add(this.getCalMesAltaReg());
        fields += " CAL_DIA_ALTA_REG = ?, ";
        values.add(this.getCalDiaAltaReg());
        fields += " CAL_ANO_ULT_MOD = ?, ";
        values.add(this.getCalAnoUltMod());
        fields += " CAL_MES_ULT_MOD = ?, ";
        values.add(this.getCalMesUltMod());
        fields += " CAL_DIA_ULT_MOD = ?, ";
        values.add(this.getCalDiaUltMod());
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
        String sql = "INSERT INTO CALENDARO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CAL_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getCalNumUsuario());

        fields += ", CAL_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCalNumContrato());

        fields += ", CAL_NUM_CALENDA";
        fieldValues += ", ?";
        values.add(this.getCalNumCalenda());

        fields += ", CAL_ANO_REALIZOP";
        fieldValues += ", ?";
        values.add(this.getCalAnoRealizop());

        fields += ", CAL_MES_REALIZOP";
        fieldValues += ", ?";
        values.add(this.getCalMesRealizop());

        fields += ", CAL_DIA_REALIZOP";
        fieldValues += ", ?";
        values.add(this.getCalDiaRealizop());

        fields += ", CAL_ANO_REALIZOC";
        fieldValues += ", ?";
        values.add(this.getCalAnoRealizoc());

        fields += ", CAL_MES_REALIZOC";
        fieldValues += ", ?";
        values.add(this.getCalMesRealizoc());

        fields += ", CAL_DIA_REALIZOC";
        fieldValues += ", ?";
        values.add(this.getCalDiaRealizoc());

        fields += ", CAL_NOM_REALIZOP";
        fieldValues += ", ?";
        values.add(this.getCalNomRealizop());

        fields += ", CAL_ANO_REVISOP";
        fieldValues += ", ?";
        values.add(this.getCalAnoRevisop());

        fields += ", CAL_MES_REVISOP";
        fieldValues += ", ?";
        values.add(this.getCalMesRevisop());

        fields += ", CAL_DIA_REVISOP";
        fieldValues += ", ?";
        values.add(this.getCalDiaRevisop());

        fields += ", CAL_NOM_REVISOP";
        fieldValues += ", ?";
        values.add(this.getCalNomRevisop());

        fields += ", CAL_ANO_AUTORIZP";
        fieldValues += ", ?";
        values.add(this.getCalAnoAutorizp());

        fields += ", CAL_MES_AUTORIZP";
        fieldValues += ", ?";
        values.add(this.getCalMesAutorizp());

        fields += ", CAL_DIA_AUTORIZP";
        fieldValues += ", ?";
        values.add(this.getCalDiaAutorizp());

        fields += ", CAL_NOM_AUTORIZP";
        fieldValues += ", ?";
        values.add(this.getCalNomAutorizp());

        fields += ", CAL_NOM_REALIZOC";
        fieldValues += ", ?";
        values.add(this.getCalNomRealizoc());

        fields += ", CAL_ANO_REVISOC";
        fieldValues += ", ?";
        values.add(this.getCalAnoRevisoc());

        fields += ", CAL_MES_REVISOC";
        fieldValues += ", ?";
        values.add(this.getCalMesRevisoc());

        fields += ", CAL_DIA_REVISOC";
        fieldValues += ", ?";
        values.add(this.getCalDiaRevisoc());

        fields += ", CAL_NOM_REVISOC";
        fieldValues += ", ?";
        values.add(this.getCalNomRevisoc());

        fields += ", CAL_ANO_AUTORIZC";
        fieldValues += ", ?";
        values.add(this.getCalAnoAutorizc());

        fields += ", CAL_MES_AUTORIZC";
        fieldValues += ", ?";
        values.add(this.getCalMesAutorizc());

        fields += ", CAL_DIA_AUTORIZC";
        fieldValues += ", ?";
        values.add(this.getCalDiaAutorizc());

        fields += ", CAL_NOM_AUTORIZC";
        fieldValues += ", ?";
        values.add(this.getCalNomAutorizc());

        fields += ", CAL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalAnoAltaReg());

        fields += ", CAL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalMesAltaReg());

        fields += ", CAL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalDiaAltaReg());

        fields += ", CAL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalAnoUltMod());

        fields += ", CAL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalMesUltMod());

        fields += ", CAL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CALENDARO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CAL_NUM_USUARIO = ?";
        values.add(this.getCalNumUsuario());
        conditions += " AND CAL_NUM_CONTRATO = ?";
        values.add(this.getCalNumContrato());
        conditions += " AND CAL_NUM_CALENDA = ?";
        values.add(this.getCalNumCalenda());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Calendaro instance = (Calendaro) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCalNumUsuario().equals(instance.getCalNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumContrato().equals(instance.getCalNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumCalenda().equals(instance.getCalNumCalenda()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoRealizop().equals(instance.getCalAnoRealizop()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesRealizop().equals(instance.getCalMesRealizop()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaRealizop().equals(instance.getCalDiaRealizop()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoRealizoc().equals(instance.getCalAnoRealizoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesRealizoc().equals(instance.getCalMesRealizoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaRealizoc().equals(instance.getCalDiaRealizoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalNomRealizop().equals(instance.getCalNomRealizop()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoRevisop().equals(instance.getCalAnoRevisop()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesRevisop().equals(instance.getCalMesRevisop()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaRevisop().equals(instance.getCalDiaRevisop()))
            equalObjects = false;
        if (equalObjects && !this.getCalNomRevisop().equals(instance.getCalNomRevisop()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoAutorizp().equals(instance.getCalAnoAutorizp()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesAutorizp().equals(instance.getCalMesAutorizp()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaAutorizp().equals(instance.getCalDiaAutorizp()))
            equalObjects = false;
        if (equalObjects && !this.getCalNomAutorizp().equals(instance.getCalNomAutorizp()))
            equalObjects = false;
        if (equalObjects && !this.getCalNomRealizoc().equals(instance.getCalNomRealizoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoRevisoc().equals(instance.getCalAnoRevisoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesRevisoc().equals(instance.getCalMesRevisoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaRevisoc().equals(instance.getCalDiaRevisoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalNomRevisoc().equals(instance.getCalNomRevisoc()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoAutorizc().equals(instance.getCalAnoAutorizc()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesAutorizc().equals(instance.getCalMesAutorizc()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaAutorizc().equals(instance.getCalDiaAutorizc()))
            equalObjects = false;
        if (equalObjects && !this.getCalNomAutorizc().equals(instance.getCalNomAutorizc()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoAltaReg().equals(instance.getCalAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesAltaReg().equals(instance.getCalMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaAltaReg().equals(instance.getCalDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoUltMod().equals(instance.getCalAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesUltMod().equals(instance.getCalMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaUltMod().equals(instance.getCalDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Calendaro result = new Calendaro();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCalNumUsuario((BigDecimal) objectData.getData("CAL_NUM_USUARIO"));
        result.setCalNumContrato((BigDecimal) objectData.getData("CAL_NUM_CONTRATO"));
        result.setCalNumCalenda((BigDecimal) objectData.getData("CAL_NUM_CALENDA"));
        result.setCalAnoRealizop((BigDecimal) objectData.getData("CAL_ANO_REALIZOP"));
        result.setCalMesRealizop((BigDecimal) objectData.getData("CAL_MES_REALIZOP"));
        result.setCalDiaRealizop((BigDecimal) objectData.getData("CAL_DIA_REALIZOP"));
        result.setCalAnoRealizoc((BigDecimal) objectData.getData("CAL_ANO_REALIZOC"));
        result.setCalMesRealizoc((BigDecimal) objectData.getData("CAL_MES_REALIZOC"));
        result.setCalDiaRealizoc((BigDecimal) objectData.getData("CAL_DIA_REALIZOC"));
        result.setCalNomRealizop((String) objectData.getData("CAL_NOM_REALIZOP"));
        result.setCalAnoRevisop((BigDecimal) objectData.getData("CAL_ANO_REVISOP"));
        result.setCalMesRevisop((BigDecimal) objectData.getData("CAL_MES_REVISOP"));
        result.setCalDiaRevisop((BigDecimal) objectData.getData("CAL_DIA_REVISOP"));
        result.setCalNomRevisop((String) objectData.getData("CAL_NOM_REVISOP"));
        result.setCalAnoAutorizp((BigDecimal) objectData.getData("CAL_ANO_AUTORIZP"));
        result.setCalMesAutorizp((BigDecimal) objectData.getData("CAL_MES_AUTORIZP"));
        result.setCalDiaAutorizp((BigDecimal) objectData.getData("CAL_DIA_AUTORIZP"));
        result.setCalNomAutorizp((String) objectData.getData("CAL_NOM_AUTORIZP"));
        result.setCalNomRealizoc((String) objectData.getData("CAL_NOM_REALIZOC"));
        result.setCalAnoRevisoc((BigDecimal) objectData.getData("CAL_ANO_REVISOC"));
        result.setCalMesRevisoc((BigDecimal) objectData.getData("CAL_MES_REVISOC"));
        result.setCalDiaRevisoc((BigDecimal) objectData.getData("CAL_DIA_REVISOC"));
        result.setCalNomRevisoc((String) objectData.getData("CAL_NOM_REVISOC"));
        result.setCalAnoAutorizc((BigDecimal) objectData.getData("CAL_ANO_AUTORIZC"));
        result.setCalMesAutorizc((BigDecimal) objectData.getData("CAL_MES_AUTORIZC"));
        result.setCalDiaAutorizc((BigDecimal) objectData.getData("CAL_DIA_AUTORIZC"));
        result.setCalNomAutorizc((String) objectData.getData("CAL_NOM_AUTORIZC"));
        result.setCalAnoAltaReg((BigDecimal) objectData.getData("CAL_ANO_ALTA_REG"));
        result.setCalMesAltaReg((BigDecimal) objectData.getData("CAL_MES_ALTA_REG"));
        result.setCalDiaAltaReg((BigDecimal) objectData.getData("CAL_DIA_ALTA_REG"));
        result.setCalAnoUltMod((BigDecimal) objectData.getData("CAL_ANO_ULT_MOD"));
        result.setCalMesUltMod((BigDecimal) objectData.getData("CAL_MES_ULT_MOD"));
        result.setCalDiaUltMod((BigDecimal) objectData.getData("CAL_DIA_ULT_MOD"));

        return result;

    }

}
