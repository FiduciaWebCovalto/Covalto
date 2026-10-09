package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ASIENTOS_PK", columns = { "ASI_FOLIO_OPERA", "ASI_NUM_OPERACION", "ASI_SEC_OPERA", "ASI_SEC_ASIENTO", "ASI_NUM_MODULO", "ASI_TRANSACCION" },
            sequences = { "MANUAL" })
public class Asientos extends DomainObject {

    BigDecimal asiFolioOpera = null;
    BigDecimal asiNumOperacion = null;
    BigDecimal asiSecOpera = null;
    BigDecimal asiNumModulo = null;
    BigDecimal asiTransaccion = null;
    BigDecimal asiSecAsiento = null;
    BigDecimal asiNumCtam = null;
    BigDecimal asiNumScta = null;
    BigDecimal asiNumSscta = null;
    BigDecimal asiNumSsscta = null;
    BigDecimal asiNumSssscta = null;
    BigDecimal asiNumSsssscta = null;
    BigDecimal asiNumAux1 = null;
    BigDecimal asiNumAux2 = null;
    BigDecimal asiNumAux3 = null;
    String asiCveCarAbo = null;
    BigDecimal asiImpMovimiento = null;
    String asiDescAsiento = null;
    BigDecimal asiAnoAltaReg = null;
    BigDecimal asiMesAltaReg = null;
    BigDecimal asiDiaAltaReg = null;
    BigDecimal asiAnoUltMod = null;
    BigDecimal asiMesUltMod = null;
    BigDecimal asiDiaUltMod = null;
    String asiCveStMovim = null;
    BigDecimal asiFolioCto = null;

    public Asientos() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiFolioOpera(BigDecimal asiFolioOpera) {
        this.asiFolioOpera = asiFolioOpera;
    }

    public BigDecimal getAsiFolioOpera() {
        return this.asiFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumOperacion(BigDecimal asiNumOperacion) {
        this.asiNumOperacion = asiNumOperacion;
    }

    public BigDecimal getAsiNumOperacion() {
        return this.asiNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiSecOpera(BigDecimal asiSecOpera) {
        this.asiSecOpera = asiSecOpera;
    }

    public BigDecimal getAsiSecOpera() {
        return this.asiSecOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumModulo(BigDecimal asiNumModulo) {
        this.asiNumModulo = asiNumModulo;
    }

    public BigDecimal getAsiNumModulo() {
        return this.asiNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiTransaccion(BigDecimal asiTransaccion) {
        this.asiTransaccion = asiTransaccion;
    }

    public BigDecimal getAsiTransaccion() {
        return this.asiTransaccion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiSecAsiento(BigDecimal asiSecAsiento) {
        this.asiSecAsiento = asiSecAsiento;
    }

    public BigDecimal getAsiSecAsiento() {
        return this.asiSecAsiento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumCtam(BigDecimal asiNumCtam) {
        this.asiNumCtam = asiNumCtam;
    }

    public BigDecimal getAsiNumCtam() {
        return this.asiNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumScta(BigDecimal asiNumScta) {
        this.asiNumScta = asiNumScta;
    }

    public BigDecimal getAsiNumScta() {
        return this.asiNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumSscta(BigDecimal asiNumSscta) {
        this.asiNumSscta = asiNumSscta;
    }

    public BigDecimal getAsiNumSscta() {
        return this.asiNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumSsscta(BigDecimal asiNumSsscta) {
        this.asiNumSsscta = asiNumSsscta;
    }

    public BigDecimal getAsiNumSsscta() {
        return this.asiNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumSssscta(BigDecimal asiNumSssscta) {
        this.asiNumSssscta = asiNumSssscta;
    }

    public BigDecimal getAsiNumSssscta() {
        return this.asiNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumSsssscta(BigDecimal asiNumSsssscta) {
        this.asiNumSsssscta = asiNumSsssscta;
    }

    public BigDecimal getAsiNumSsssscta() {
        return this.asiNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumAux1(BigDecimal asiNumAux1) {
        this.asiNumAux1 = asiNumAux1;
    }

    public BigDecimal getAsiNumAux1() {
        return this.asiNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumAux2(BigDecimal asiNumAux2) {
        this.asiNumAux2 = asiNumAux2;
    }

    public BigDecimal getAsiNumAux2() {
        return this.asiNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setAsiNumAux3(BigDecimal asiNumAux3) {
        this.asiNumAux3 = asiNumAux3;
    }

    public BigDecimal getAsiNumAux3() {
        return this.asiNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAsiCveCarAbo(String asiCveCarAbo) {
        this.asiCveCarAbo = asiCveCarAbo;
    }

    public String getAsiCveCarAbo() {
        return this.asiCveCarAbo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAsiImpMovimiento(BigDecimal asiImpMovimiento) {
        this.asiImpMovimiento = asiImpMovimiento;
    }

    public BigDecimal getAsiImpMovimiento() {
        return this.asiImpMovimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAsiDescAsiento(String asiDescAsiento) {
        this.asiDescAsiento = asiDescAsiento;
    }

    public String getAsiDescAsiento() {
        return this.asiDescAsiento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAsiAnoAltaReg(BigDecimal asiAnoAltaReg) {
        this.asiAnoAltaReg = asiAnoAltaReg;
    }

    public BigDecimal getAsiAnoAltaReg() {
        return this.asiAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAsiMesAltaReg(BigDecimal asiMesAltaReg) {
        this.asiMesAltaReg = asiMesAltaReg;
    }

    public BigDecimal getAsiMesAltaReg() {
        return this.asiMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAsiDiaAltaReg(BigDecimal asiDiaAltaReg) {
        this.asiDiaAltaReg = asiDiaAltaReg;
    }

    public BigDecimal getAsiDiaAltaReg() {
        return this.asiDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAsiAnoUltMod(BigDecimal asiAnoUltMod) {
        this.asiAnoUltMod = asiAnoUltMod;
    }

    public BigDecimal getAsiAnoUltMod() {
        return this.asiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAsiMesUltMod(BigDecimal asiMesUltMod) {
        this.asiMesUltMod = asiMesUltMod;
    }

    public BigDecimal getAsiMesUltMod() {
        return this.asiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAsiDiaUltMod(BigDecimal asiDiaUltMod) {
        this.asiDiaUltMod = asiDiaUltMod;
    }

    public BigDecimal getAsiDiaUltMod() {
        return this.asiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAsiCveStMovim(String asiCveStMovim) {
        this.asiCveStMovim = asiCveStMovim;
    }

    public String getAsiCveStMovim() {
        return this.asiCveStMovim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAsiFolioCto(BigDecimal asiFolioCto) {
        this.asiFolioCto = asiFolioCto;
    }

    public BigDecimal getAsiFolioCto() {
        return this.asiFolioCto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ASIENTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAsiFolioOpera() != null && this.getAsiFolioOpera().longValue() == -999) {
            conditions += " AND ASI_FOLIO_OPERA IS NULL";
        } else if (this.getAsiFolioOpera() != null) {
            conditions += " AND ASI_FOLIO_OPERA = ?";
            values.add(this.getAsiFolioOpera());
        }

        if (this.getAsiNumOperacion() != null && this.getAsiNumOperacion().longValue() == -999) {
            conditions += " AND ASI_NUM_OPERACION IS NULL";
        } else if (this.getAsiNumOperacion() != null) {
            conditions += " AND ASI_NUM_OPERACION = ?";
            values.add(this.getAsiNumOperacion());
        }

        if (this.getAsiSecOpera() != null && this.getAsiSecOpera().longValue() == -999) {
            conditions += " AND ASI_SEC_OPERA IS NULL";
        } else if (this.getAsiSecOpera() != null) {
            conditions += " AND ASI_SEC_OPERA = ?";
            values.add(this.getAsiSecOpera());
        }

        if (this.getAsiNumModulo() != null && this.getAsiNumModulo().longValue() == -999) {
            conditions += " AND ASI_NUM_MODULO IS NULL";
        } else if (this.getAsiNumModulo() != null) {
            conditions += " AND ASI_NUM_MODULO = ?";
            values.add(this.getAsiNumModulo());
        }

        if (this.getAsiTransaccion() != null && this.getAsiTransaccion().longValue() == -999) {
            conditions += " AND ASI_TRANSACCION IS NULL";
        } else if (this.getAsiTransaccion() != null) {
            conditions += " AND ASI_TRANSACCION = ?";
            values.add(this.getAsiTransaccion());
        }

        if (this.getAsiSecAsiento() != null && this.getAsiSecAsiento().longValue() == -999) {
            conditions += " AND ASI_SEC_ASIENTO IS NULL";
        } else if (this.getAsiSecAsiento() != null) {
            conditions += " AND ASI_SEC_ASIENTO = ?";
            values.add(this.getAsiSecAsiento());
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
        String sql = "SELECT * FROM ASIENTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAsiFolioOpera() != null && this.getAsiFolioOpera().longValue() == -999) {
            conditions += " AND ASI_FOLIO_OPERA IS NULL";
        } else if (this.getAsiFolioOpera() != null) {
            conditions += " AND ASI_FOLIO_OPERA = ?";
            values.add(this.getAsiFolioOpera());
        }

        if (this.getAsiNumOperacion() != null && this.getAsiNumOperacion().longValue() == -999) {
            conditions += " AND ASI_NUM_OPERACION IS NULL";
        } else if (this.getAsiNumOperacion() != null) {
            conditions += " AND ASI_NUM_OPERACION = ?";
            values.add(this.getAsiNumOperacion());
        }

        if (this.getAsiSecOpera() != null && this.getAsiSecOpera().longValue() == -999) {
            conditions += " AND ASI_SEC_OPERA IS NULL";
        } else if (this.getAsiSecOpera() != null) {
            conditions += " AND ASI_SEC_OPERA = ?";
            values.add(this.getAsiSecOpera());
        }

        if (this.getAsiNumModulo() != null && this.getAsiNumModulo().longValue() == -999) {
            conditions += " AND ASI_NUM_MODULO IS NULL";
        } else if (this.getAsiNumModulo() != null) {
            conditions += " AND ASI_NUM_MODULO = ?";
            values.add(this.getAsiNumModulo());
        }

        if (this.getAsiTransaccion() != null && this.getAsiTransaccion().longValue() == -999) {
            conditions += " AND ASI_TRANSACCION IS NULL";
        } else if (this.getAsiTransaccion() != null) {
            conditions += " AND ASI_TRANSACCION = ?";
            values.add(this.getAsiTransaccion());
        }

        if (this.getAsiSecAsiento() != null && this.getAsiSecAsiento().longValue() == -999) {
            conditions += " AND ASI_SEC_ASIENTO IS NULL";
        } else if (this.getAsiSecAsiento() != null) {
            conditions += " AND ASI_SEC_ASIENTO = ?";
            values.add(this.getAsiSecAsiento());
        }

        if (this.getAsiNumCtam() != null && this.getAsiNumCtam().longValue() == -999) {
            conditions += " AND ASI_NUM_CTAM IS NULL";
        } else if (this.getAsiNumCtam() != null) {
            conditions += " AND ASI_NUM_CTAM = ?";
            values.add(this.getAsiNumCtam());
        }

        if (this.getAsiNumScta() != null && this.getAsiNumScta().longValue() == -999) {
            conditions += " AND ASI_NUM_SCTA IS NULL";
        } else if (this.getAsiNumScta() != null) {
            conditions += " AND ASI_NUM_SCTA = ?";
            values.add(this.getAsiNumScta());
        }

        if (this.getAsiNumSscta() != null && this.getAsiNumSscta().longValue() == -999) {
            conditions += " AND ASI_NUM_SSCTA IS NULL";
        } else if (this.getAsiNumSscta() != null) {
            conditions += " AND ASI_NUM_SSCTA = ?";
            values.add(this.getAsiNumSscta());
        }

        if (this.getAsiNumSsscta() != null && this.getAsiNumSsscta().longValue() == -999) {
            conditions += " AND ASI_NUM_SSSCTA IS NULL";
        } else if (this.getAsiNumSsscta() != null) {
            conditions += " AND ASI_NUM_SSSCTA = ?";
            values.add(this.getAsiNumSsscta());
        }

        if (this.getAsiNumSssscta() != null && this.getAsiNumSssscta().longValue() == -999) {
            conditions += " AND ASI_NUM_SSSSCTA IS NULL";
        } else if (this.getAsiNumSssscta() != null) {
            conditions += " AND ASI_NUM_SSSSCTA = ?";
            values.add(this.getAsiNumSssscta());
        }

        if (this.getAsiNumSsssscta() != null && this.getAsiNumSsssscta().longValue() == -999) {
            conditions += " AND ASI_NUM_SSSSSCTA IS NULL";
        } else if (this.getAsiNumSsssscta() != null) {
            conditions += " AND ASI_NUM_SSSSSCTA = ?";
            values.add(this.getAsiNumSsssscta());
        }

        if (this.getAsiNumAux1() != null && this.getAsiNumAux1().longValue() == -999) {
            conditions += " AND ASI_NUM_AUX1 IS NULL";
        } else if (this.getAsiNumAux1() != null) {
            conditions += " AND ASI_NUM_AUX1 = ?";
            values.add(this.getAsiNumAux1());
        }

        if (this.getAsiNumAux2() != null && this.getAsiNumAux2().longValue() == -999) {
            conditions += " AND ASI_NUM_AUX2 IS NULL";
        } else if (this.getAsiNumAux2() != null) {
            conditions += " AND ASI_NUM_AUX2 = ?";
            values.add(this.getAsiNumAux2());
        }

        if (this.getAsiNumAux3() != null && this.getAsiNumAux3().longValue() == -999) {
            conditions += " AND ASI_NUM_AUX3 IS NULL";
        } else if (this.getAsiNumAux3() != null) {
            conditions += " AND ASI_NUM_AUX3 = ?";
            values.add(this.getAsiNumAux3());
        }

        if (this.getAsiCveCarAbo() != null && "null".equals(this.getAsiCveCarAbo())) {
            conditions += " AND ASI_CVE_CAR_ABO IS NULL";
        } else if (this.getAsiCveCarAbo() != null) {
            conditions += " AND ASI_CVE_CAR_ABO = ?";
            values.add(this.getAsiCveCarAbo());
        }

        if (this.getAsiImpMovimiento() != null && this.getAsiImpMovimiento().longValue() == -999) {
            conditions += " AND ASI_IMP_MOVIMIENTO IS NULL";
        } else if (this.getAsiImpMovimiento() != null) {
            conditions += " AND ASI_IMP_MOVIMIENTO = ?";
            values.add(this.getAsiImpMovimiento());
        }

        if (this.getAsiDescAsiento() != null && "null".equals(this.getAsiDescAsiento())) {
            conditions += " AND ASI_DESC_ASIENTO IS NULL";
        } else if (this.getAsiDescAsiento() != null) {
            conditions += " AND ASI_DESC_ASIENTO = ?";
            values.add(this.getAsiDescAsiento());
        }

        if (this.getAsiAnoAltaReg() != null && this.getAsiAnoAltaReg().longValue() == -999) {
            conditions += " AND ASI_ANO_ALTA_REG IS NULL";
        } else if (this.getAsiAnoAltaReg() != null) {
            conditions += " AND ASI_ANO_ALTA_REG = ?";
            values.add(this.getAsiAnoAltaReg());
        }

        if (this.getAsiMesAltaReg() != null && this.getAsiMesAltaReg().longValue() == -999) {
            conditions += " AND ASI_MES_ALTA_REG IS NULL";
        } else if (this.getAsiMesAltaReg() != null) {
            conditions += " AND ASI_MES_ALTA_REG = ?";
            values.add(this.getAsiMesAltaReg());
        }

        if (this.getAsiDiaAltaReg() != null && this.getAsiDiaAltaReg().longValue() == -999) {
            conditions += " AND ASI_DIA_ALTA_REG IS NULL";
        } else if (this.getAsiDiaAltaReg() != null) {
            conditions += " AND ASI_DIA_ALTA_REG = ?";
            values.add(this.getAsiDiaAltaReg());
        }

        if (this.getAsiAnoUltMod() != null && this.getAsiAnoUltMod().longValue() == -999) {
            conditions += " AND ASI_ANO_ULT_MOD IS NULL";
        } else if (this.getAsiAnoUltMod() != null) {
            conditions += " AND ASI_ANO_ULT_MOD = ?";
            values.add(this.getAsiAnoUltMod());
        }

        if (this.getAsiMesUltMod() != null && this.getAsiMesUltMod().longValue() == -999) {
            conditions += " AND ASI_MES_ULT_MOD IS NULL";
        } else if (this.getAsiMesUltMod() != null) {
            conditions += " AND ASI_MES_ULT_MOD = ?";
            values.add(this.getAsiMesUltMod());
        }

        if (this.getAsiDiaUltMod() != null && this.getAsiDiaUltMod().longValue() == -999) {
            conditions += " AND ASI_DIA_ULT_MOD IS NULL";
        } else if (this.getAsiDiaUltMod() != null) {
            conditions += " AND ASI_DIA_ULT_MOD = ?";
            values.add(this.getAsiDiaUltMod());
        }

        if (this.getAsiCveStMovim() != null && "null".equals(this.getAsiCveStMovim())) {
            conditions += " AND ASI_CVE_ST_MOVIM IS NULL";
        } else if (this.getAsiCveStMovim() != null) {
            conditions += " AND ASI_CVE_ST_MOVIM = ?";
            values.add(this.getAsiCveStMovim());
        }

        if (this.getAsiFolioCto() != null && this.getAsiFolioCto().longValue() == -999) {
            conditions += " AND ASI_FOLIO_CTO IS NULL";
        } else if (this.getAsiFolioCto() != null) {
            conditions += " AND ASI_FOLIO_CTO = ?";
            values.add(this.getAsiFolioCto());
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
        String sql = "UPDATE ASIENTOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ASI_FOLIO_OPERA = ?";
        pkValues.add(this.getAsiFolioOpera());
        conditions += " AND ASI_NUM_OPERACION = ?";
        pkValues.add(this.getAsiNumOperacion());
        conditions += " AND ASI_SEC_OPERA = ?";
        pkValues.add(this.getAsiSecOpera());
        conditions += " AND ASI_NUM_MODULO = ?";
        pkValues.add(this.getAsiNumModulo());
        conditions += " AND ASI_TRANSACCION = ?";
        pkValues.add(this.getAsiTransaccion());
        conditions += " AND ASI_SEC_ASIENTO = ?";
        pkValues.add(this.getAsiSecAsiento());
        fields += " ASI_NUM_CTAM = ?, ";
        values.add(this.getAsiNumCtam());
        fields += " ASI_NUM_SCTA = ?, ";
        values.add(this.getAsiNumScta());
        fields += " ASI_NUM_SSCTA = ?, ";
        values.add(this.getAsiNumSscta());
        fields += " ASI_NUM_SSSCTA = ?, ";
        values.add(this.getAsiNumSsscta());
        fields += " ASI_NUM_SSSSCTA = ?, ";
        values.add(this.getAsiNumSssscta());
        fields += " ASI_NUM_SSSSSCTA = ?, ";
        values.add(this.getAsiNumSsssscta());
        fields += " ASI_NUM_AUX1 = ?, ";
        values.add(this.getAsiNumAux1());
        fields += " ASI_NUM_AUX2 = ?, ";
        values.add(this.getAsiNumAux2());
        fields += " ASI_NUM_AUX3 = ?, ";
        values.add(this.getAsiNumAux3());
        fields += " ASI_CVE_CAR_ABO = ?, ";
        values.add(this.getAsiCveCarAbo());
        fields += " ASI_IMP_MOVIMIENTO = ?, ";
        values.add(this.getAsiImpMovimiento());
        fields += " ASI_DESC_ASIENTO = ?, ";
        values.add(this.getAsiDescAsiento());
        fields += " ASI_ANO_ALTA_REG = ?, ";
        values.add(this.getAsiAnoAltaReg());
        fields += " ASI_MES_ALTA_REG = ?, ";
        values.add(this.getAsiMesAltaReg());
        fields += " ASI_DIA_ALTA_REG = ?, ";
        values.add(this.getAsiDiaAltaReg());
        fields += " ASI_ANO_ULT_MOD = ?, ";
        values.add(this.getAsiAnoUltMod());
        fields += " ASI_MES_ULT_MOD = ?, ";
        values.add(this.getAsiMesUltMod());
        fields += " ASI_DIA_ULT_MOD = ?, ";
        values.add(this.getAsiDiaUltMod());
        fields += " ASI_CVE_ST_MOVIM = ?, ";
        values.add(this.getAsiCveStMovim());
        fields += " ASI_FOLIO_CTO = ?, ";
        values.add(this.getAsiFolioCto());
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
        String sql = "INSERT INTO ASIENTOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ASI_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getAsiFolioOpera());

        fields += ", ASI_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getAsiNumOperacion());

        fields += ", ASI_SEC_OPERA";
        fieldValues += ", ?";
        values.add(this.getAsiSecOpera());

        fields += ", ASI_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getAsiNumModulo());

        fields += ", ASI_TRANSACCION";
        fieldValues += ", ?";
        values.add(this.getAsiTransaccion());

        fields += ", ASI_SEC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getAsiSecAsiento());

        fields += ", ASI_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getAsiNumCtam());

        fields += ", ASI_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getAsiNumScta());

        fields += ", ASI_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getAsiNumSscta());

        fields += ", ASI_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getAsiNumSsscta());

        fields += ", ASI_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getAsiNumSssscta());

        fields += ", ASI_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getAsiNumSsssscta());

        fields += ", ASI_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getAsiNumAux1());

        fields += ", ASI_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getAsiNumAux2());

        fields += ", ASI_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getAsiNumAux3());

        fields += ", ASI_CVE_CAR_ABO";
        fieldValues += ", ?";
        values.add(this.getAsiCveCarAbo());

        fields += ", ASI_IMP_MOVIMIENTO";
        fieldValues += ", ?";
        values.add(this.getAsiImpMovimiento());

        fields += ", ASI_DESC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getAsiDescAsiento());

        fields += ", ASI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAsiAnoAltaReg());

        fields += ", ASI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAsiMesAltaReg());

        fields += ", ASI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAsiDiaAltaReg());

        fields += ", ASI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAsiAnoUltMod());

        fields += ", ASI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAsiMesUltMod());

        fields += ", ASI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAsiDiaUltMod());

        fields += ", ASI_CVE_ST_MOVIM";
        fieldValues += ", ?";
        values.add(this.getAsiCveStMovim());

        fields += ", ASI_FOLIO_CTO";
        fieldValues += ", ?";
        values.add(this.getAsiFolioCto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ASIENTOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ASI_FOLIO_OPERA = ?";
        values.add(this.getAsiFolioOpera());
        conditions += " AND ASI_NUM_OPERACION = ?";
        values.add(this.getAsiNumOperacion());
        conditions += " AND ASI_SEC_OPERA = ?";
        values.add(this.getAsiSecOpera());
        conditions += " AND ASI_NUM_MODULO = ?";
        values.add(this.getAsiNumModulo());
        conditions += " AND ASI_TRANSACCION = ?";
        values.add(this.getAsiTransaccion());
        conditions += " AND ASI_SEC_ASIENTO = ?";
        values.add(this.getAsiSecAsiento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Asientos instance = (Asientos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAsiFolioOpera().equals(instance.getAsiFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumOperacion().equals(instance.getAsiNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getAsiSecOpera().equals(instance.getAsiSecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumModulo().equals(instance.getAsiNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getAsiTransaccion().equals(instance.getAsiTransaccion()))
            equalObjects = false;
        if (equalObjects && !this.getAsiSecAsiento().equals(instance.getAsiSecAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumCtam().equals(instance.getAsiNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumScta().equals(instance.getAsiNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumSscta().equals(instance.getAsiNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumSsscta().equals(instance.getAsiNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumSssscta().equals(instance.getAsiNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumSsssscta().equals(instance.getAsiNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumAux1().equals(instance.getAsiNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumAux2().equals(instance.getAsiNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getAsiNumAux3().equals(instance.getAsiNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getAsiCveCarAbo().equals(instance.getAsiCveCarAbo()))
            equalObjects = false;
        if (equalObjects && !this.getAsiImpMovimiento().equals(instance.getAsiImpMovimiento()))
            equalObjects = false;
        if (equalObjects && !this.getAsiDescAsiento().equals(instance.getAsiDescAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getAsiAnoAltaReg().equals(instance.getAsiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAsiMesAltaReg().equals(instance.getAsiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAsiDiaAltaReg().equals(instance.getAsiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAsiAnoUltMod().equals(instance.getAsiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAsiMesUltMod().equals(instance.getAsiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAsiDiaUltMod().equals(instance.getAsiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAsiCveStMovim().equals(instance.getAsiCveStMovim()))
            equalObjects = false;
        if (equalObjects && !this.getAsiFolioCto().equals(instance.getAsiFolioCto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Asientos result = new Asientos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAsiFolioOpera((BigDecimal) objectData.getData("ASI_FOLIO_OPERA"));
        result.setAsiNumOperacion((BigDecimal) objectData.getData("ASI_NUM_OPERACION"));
        result.setAsiSecOpera((BigDecimal) objectData.getData("ASI_SEC_OPERA"));
        result.setAsiNumModulo((BigDecimal) objectData.getData("ASI_NUM_MODULO"));
        result.setAsiTransaccion((BigDecimal) objectData.getData("ASI_TRANSACCION"));
        result.setAsiSecAsiento((BigDecimal) objectData.getData("ASI_SEC_ASIENTO"));
        result.setAsiNumCtam((BigDecimal) objectData.getData("ASI_NUM_CTAM"));
        result.setAsiNumScta((BigDecimal) objectData.getData("ASI_NUM_SCTA"));
        result.setAsiNumSscta((BigDecimal) objectData.getData("ASI_NUM_SSCTA"));
        result.setAsiNumSsscta((BigDecimal) objectData.getData("ASI_NUM_SSSCTA"));
        result.setAsiNumSssscta((BigDecimal) objectData.getData("ASI_NUM_SSSSCTA"));
        result.setAsiNumSsssscta((BigDecimal) objectData.getData("ASI_NUM_SSSSSCTA"));
        result.setAsiNumAux1((BigDecimal) objectData.getData("ASI_NUM_AUX1"));
        result.setAsiNumAux2((BigDecimal) objectData.getData("ASI_NUM_AUX2"));
        result.setAsiNumAux3((BigDecimal) objectData.getData("ASI_NUM_AUX3"));
        result.setAsiCveCarAbo((String) objectData.getData("ASI_CVE_CAR_ABO"));
        result.setAsiImpMovimiento((BigDecimal) objectData.getData("ASI_IMP_MOVIMIENTO"));
        result.setAsiDescAsiento((String) objectData.getData("ASI_DESC_ASIENTO"));
        result.setAsiAnoAltaReg((BigDecimal) objectData.getData("ASI_ANO_ALTA_REG"));
        result.setAsiMesAltaReg((BigDecimal) objectData.getData("ASI_MES_ALTA_REG"));
        result.setAsiDiaAltaReg((BigDecimal) objectData.getData("ASI_DIA_ALTA_REG"));
        result.setAsiAnoUltMod((BigDecimal) objectData.getData("ASI_ANO_ULT_MOD"));
        result.setAsiMesUltMod((BigDecimal) objectData.getData("ASI_MES_ULT_MOD"));
        result.setAsiDiaUltMod((BigDecimal) objectData.getData("ASI_DIA_ULT_MOD"));
        result.setAsiCveStMovim((String) objectData.getData("ASI_CVE_ST_MOVIM"));
        result.setAsiFolioCto((BigDecimal) objectData.getData("ASI_FOLIO_CTO"));

        return result;

    }

}
