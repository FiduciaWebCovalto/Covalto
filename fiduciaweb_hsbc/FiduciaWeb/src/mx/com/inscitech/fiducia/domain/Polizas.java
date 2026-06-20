package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POLIZAS_PK", columns = { "POL_NUM_USUARIO", "POL_FOLIO_OPERA", "POL_NUM_MODULO", "POL_NUM_TRANSAC", "POL_NUM_SEC_ASIENT" }, sequences = { "MANUAL" })
public class Polizas extends DomainObject {

    BigDecimal polNumUsuario = null;
    BigDecimal polFolioOpera = null;
    BigDecimal polNumModulo = null;
    BigDecimal polNumTransac = null;
    BigDecimal polNumSecAsient = null;
    BigDecimal polNumCtam = null;
    BigDecimal polNumScta = null;
    BigDecimal polNumSscta = null;
    BigDecimal polNumSsscta = null;
    BigDecimal polNumAux1 = null;
    BigDecimal polNumAux2 = null;
    BigDecimal polNumAux3 = null;
    String polCveAplicaDat = null;
    String polCveCarAbo = null;
    BigDecimal polImpValorDato = null;
    String polDescAsiento = null;
    BigDecimal polAnoAplicacion = null;
    BigDecimal polMesAplicacion = null;
    BigDecimal polDiaAplicacion = null;
    BigDecimal polAnoFecValor = null;
    BigDecimal polMesFecValor = null;
    BigDecimal polDiaFecValor = null;
    BigDecimal polHrAplicacion = null;
    BigDecimal polMinAplicacion = null;
    BigDecimal polAnoAltaReg = null;
    BigDecimal polMesAltaReg = null;
    BigDecimal polDiaAltaReg = null;
    BigDecimal polAnoUltMod = null;
    BigDecimal polMesUltMod = null;
    BigDecimal polDiaUltMod = null;
    String polCveStPoliza = null;

    public Polizas() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumUsuario(BigDecimal polNumUsuario) {
        this.polNumUsuario = polNumUsuario;
    }

    public BigDecimal getPolNumUsuario() {
        return this.polNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolFolioOpera(BigDecimal polFolioOpera) {
        this.polFolioOpera = polFolioOpera;
    }

    public BigDecimal getPolFolioOpera() {
        return this.polFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumModulo(BigDecimal polNumModulo) {
        this.polNumModulo = polNumModulo;
    }

    public BigDecimal getPolNumModulo() {
        return this.polNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumTransac(BigDecimal polNumTransac) {
        this.polNumTransac = polNumTransac;
    }

    public BigDecimal getPolNumTransac() {
        return this.polNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumSecAsient(BigDecimal polNumSecAsient) {
        this.polNumSecAsient = polNumSecAsient;
    }

    public BigDecimal getPolNumSecAsient() {
        return this.polNumSecAsient;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumCtam(BigDecimal polNumCtam) {
        this.polNumCtam = polNumCtam;
    }

    public BigDecimal getPolNumCtam() {
        return this.polNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumScta(BigDecimal polNumScta) {
        this.polNumScta = polNumScta;
    }

    public BigDecimal getPolNumScta() {
        return this.polNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumSscta(BigDecimal polNumSscta) {
        this.polNumSscta = polNumSscta;
    }

    public BigDecimal getPolNumSscta() {
        return this.polNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumSsscta(BigDecimal polNumSsscta) {
        this.polNumSsscta = polNumSsscta;
    }

    public BigDecimal getPolNumSsscta() {
        return this.polNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumAux1(BigDecimal polNumAux1) {
        this.polNumAux1 = polNumAux1;
    }

    public BigDecimal getPolNumAux1() {
        return this.polNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumAux2(BigDecimal polNumAux2) {
        this.polNumAux2 = polNumAux2;
    }

    public BigDecimal getPolNumAux2() {
        return this.polNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolNumAux3(BigDecimal polNumAux3) {
        this.polNumAux3 = polNumAux3;
    }

    public BigDecimal getPolNumAux3() {
        return this.polNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPolCveAplicaDat(String polCveAplicaDat) {
        this.polCveAplicaDat = polCveAplicaDat;
    }

    public String getPolCveAplicaDat() {
        return this.polCveAplicaDat;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPolCveCarAbo(String polCveCarAbo) {
        this.polCveCarAbo = polCveCarAbo;
    }

    public String getPolCveCarAbo() {
        return this.polCveCarAbo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPolImpValorDato(BigDecimal polImpValorDato) {
        this.polImpValorDato = polImpValorDato;
    }

    public BigDecimal getPolImpValorDato() {
        return this.polImpValorDato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPolDescAsiento(String polDescAsiento) {
        this.polDescAsiento = polDescAsiento;
    }

    public String getPolDescAsiento() {
        return this.polDescAsiento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPolAnoAplicacion(BigDecimal polAnoAplicacion) {
        this.polAnoAplicacion = polAnoAplicacion;
    }

    public BigDecimal getPolAnoAplicacion() {
        return this.polAnoAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolMesAplicacion(BigDecimal polMesAplicacion) {
        this.polMesAplicacion = polMesAplicacion;
    }

    public BigDecimal getPolMesAplicacion() {
        return this.polMesAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolDiaAplicacion(BigDecimal polDiaAplicacion) {
        this.polDiaAplicacion = polDiaAplicacion;
    }

    public BigDecimal getPolDiaAplicacion() {
        return this.polDiaAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPolAnoFecValor(BigDecimal polAnoFecValor) {
        this.polAnoFecValor = polAnoFecValor;
    }

    public BigDecimal getPolAnoFecValor() {
        return this.polAnoFecValor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolMesFecValor(BigDecimal polMesFecValor) {
        this.polMesFecValor = polMesFecValor;
    }

    public BigDecimal getPolMesFecValor() {
        return this.polMesFecValor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolDiaFecValor(BigDecimal polDiaFecValor) {
        this.polDiaFecValor = polDiaFecValor;
    }

    public BigDecimal getPolDiaFecValor() {
        return this.polDiaFecValor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolHrAplicacion(BigDecimal polHrAplicacion) {
        this.polHrAplicacion = polHrAplicacion;
    }

    public BigDecimal getPolHrAplicacion() {
        return this.polHrAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPolMinAplicacion(BigDecimal polMinAplicacion) {
        this.polMinAplicacion = polMinAplicacion;
    }

    public BigDecimal getPolMinAplicacion() {
        return this.polMinAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPolAnoAltaReg(BigDecimal polAnoAltaReg) {
        this.polAnoAltaReg = polAnoAltaReg;
    }

    public BigDecimal getPolAnoAltaReg() {
        return this.polAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolMesAltaReg(BigDecimal polMesAltaReg) {
        this.polMesAltaReg = polMesAltaReg;
    }

    public BigDecimal getPolMesAltaReg() {
        return this.polMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolDiaAltaReg(BigDecimal polDiaAltaReg) {
        this.polDiaAltaReg = polDiaAltaReg;
    }

    public BigDecimal getPolDiaAltaReg() {
        return this.polDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPolAnoUltMod(BigDecimal polAnoUltMod) {
        this.polAnoUltMod = polAnoUltMod;
    }

    public BigDecimal getPolAnoUltMod() {
        return this.polAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolMesUltMod(BigDecimal polMesUltMod) {
        this.polMesUltMod = polMesUltMod;
    }

    public BigDecimal getPolMesUltMod() {
        return this.polMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPolDiaUltMod(BigDecimal polDiaUltMod) {
        this.polDiaUltMod = polDiaUltMod;
    }

    public BigDecimal getPolDiaUltMod() {
        return this.polDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPolCveStPoliza(String polCveStPoliza) {
        this.polCveStPoliza = polCveStPoliza;
    }

    public String getPolCveStPoliza() {
        return this.polCveStPoliza;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POLIZAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPolNumUsuario() != null && this.getPolNumUsuario().longValue() == -999) {
            conditions += " AND POL_NUM_USUARIO IS NULL";
        } else if (this.getPolNumUsuario() != null) {
            conditions += " AND POL_NUM_USUARIO = ?";
            values.add(this.getPolNumUsuario());
        }

        if (this.getPolFolioOpera() != null && this.getPolFolioOpera().longValue() == -999) {
            conditions += " AND POL_FOLIO_OPERA IS NULL";
        } else if (this.getPolFolioOpera() != null) {
            conditions += " AND POL_FOLIO_OPERA = ?";
            values.add(this.getPolFolioOpera());
        }

        if (this.getPolNumModulo() != null && this.getPolNumModulo().longValue() == -999) {
            conditions += " AND POL_NUM_MODULO IS NULL";
        } else if (this.getPolNumModulo() != null) {
            conditions += " AND POL_NUM_MODULO = ?";
            values.add(this.getPolNumModulo());
        }

        if (this.getPolNumTransac() != null && this.getPolNumTransac().longValue() == -999) {
            conditions += " AND POL_NUM_TRANSAC IS NULL";
        } else if (this.getPolNumTransac() != null) {
            conditions += " AND POL_NUM_TRANSAC = ?";
            values.add(this.getPolNumTransac());
        }

        if (this.getPolNumSecAsient() != null && this.getPolNumSecAsient().longValue() == -999) {
            conditions += " AND POL_NUM_SEC_ASIENT IS NULL";
        } else if (this.getPolNumSecAsient() != null) {
            conditions += " AND POL_NUM_SEC_ASIENT = ?";
            values.add(this.getPolNumSecAsient());
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
        String sql = "SELECT * FROM POLIZAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPolNumUsuario() != null && this.getPolNumUsuario().longValue() == -999) {
            conditions += " AND POL_NUM_USUARIO IS NULL";
        } else if (this.getPolNumUsuario() != null) {
            conditions += " AND POL_NUM_USUARIO = ?";
            values.add(this.getPolNumUsuario());
        }

        if (this.getPolFolioOpera() != null && this.getPolFolioOpera().longValue() == -999) {
            conditions += " AND POL_FOLIO_OPERA IS NULL";
        } else if (this.getPolFolioOpera() != null) {
            conditions += " AND POL_FOLIO_OPERA = ?";
            values.add(this.getPolFolioOpera());
        }

        if (this.getPolNumModulo() != null && this.getPolNumModulo().longValue() == -999) {
            conditions += " AND POL_NUM_MODULO IS NULL";
        } else if (this.getPolNumModulo() != null) {
            conditions += " AND POL_NUM_MODULO = ?";
            values.add(this.getPolNumModulo());
        }

        if (this.getPolNumTransac() != null && this.getPolNumTransac().longValue() == -999) {
            conditions += " AND POL_NUM_TRANSAC IS NULL";
        } else if (this.getPolNumTransac() != null) {
            conditions += " AND POL_NUM_TRANSAC = ?";
            values.add(this.getPolNumTransac());
        }

        if (this.getPolNumSecAsient() != null && this.getPolNumSecAsient().longValue() == -999) {
            conditions += " AND POL_NUM_SEC_ASIENT IS NULL";
        } else if (this.getPolNumSecAsient() != null) {
            conditions += " AND POL_NUM_SEC_ASIENT = ?";
            values.add(this.getPolNumSecAsient());
        }

        if (this.getPolNumCtam() != null && this.getPolNumCtam().longValue() == -999) {
            conditions += " AND POL_NUM_CTAM IS NULL";
        } else if (this.getPolNumCtam() != null) {
            conditions += " AND POL_NUM_CTAM = ?";
            values.add(this.getPolNumCtam());
        }

        if (this.getPolNumScta() != null && this.getPolNumScta().longValue() == -999) {
            conditions += " AND POL_NUM_SCTA IS NULL";
        } else if (this.getPolNumScta() != null) {
            conditions += " AND POL_NUM_SCTA = ?";
            values.add(this.getPolNumScta());
        }

        if (this.getPolNumSscta() != null && this.getPolNumSscta().longValue() == -999) {
            conditions += " AND POL_NUM_SSCTA IS NULL";
        } else if (this.getPolNumSscta() != null) {
            conditions += " AND POL_NUM_SSCTA = ?";
            values.add(this.getPolNumSscta());
        }

        if (this.getPolNumSsscta() != null && this.getPolNumSsscta().longValue() == -999) {
            conditions += " AND POL_NUM_SSSCTA IS NULL";
        } else if (this.getPolNumSsscta() != null) {
            conditions += " AND POL_NUM_SSSCTA = ?";
            values.add(this.getPolNumSsscta());
        }

        if (this.getPolNumAux1() != null && this.getPolNumAux1().longValue() == -999) {
            conditions += " AND POL_NUM_AUX1 IS NULL";
        } else if (this.getPolNumAux1() != null) {
            conditions += " AND POL_NUM_AUX1 = ?";
            values.add(this.getPolNumAux1());
        }

        if (this.getPolNumAux2() != null && this.getPolNumAux2().longValue() == -999) {
            conditions += " AND POL_NUM_AUX2 IS NULL";
        } else if (this.getPolNumAux2() != null) {
            conditions += " AND POL_NUM_AUX2 = ?";
            values.add(this.getPolNumAux2());
        }

        if (this.getPolNumAux3() != null && this.getPolNumAux3().longValue() == -999) {
            conditions += " AND POL_NUM_AUX3 IS NULL";
        } else if (this.getPolNumAux3() != null) {
            conditions += " AND POL_NUM_AUX3 = ?";
            values.add(this.getPolNumAux3());
        }

        if (this.getPolCveAplicaDat() != null && "null".equals(this.getPolCveAplicaDat())) {
            conditions += " AND POL_CVE_APLICA_DAT IS NULL";
        } else if (this.getPolCveAplicaDat() != null) {
            conditions += " AND POL_CVE_APLICA_DAT = ?";
            values.add(this.getPolCveAplicaDat());
        }

        if (this.getPolCveCarAbo() != null && "null".equals(this.getPolCveCarAbo())) {
            conditions += " AND POL_CVE_CAR_ABO IS NULL";
        } else if (this.getPolCveCarAbo() != null) {
            conditions += " AND POL_CVE_CAR_ABO = ?";
            values.add(this.getPolCveCarAbo());
        }

        if (this.getPolImpValorDato() != null && this.getPolImpValorDato().longValue() == -999) {
            conditions += " AND POL_IMP_VALOR_DATO IS NULL";
        } else if (this.getPolImpValorDato() != null) {
            conditions += " AND POL_IMP_VALOR_DATO = ?";
            values.add(this.getPolImpValorDato());
        }

        if (this.getPolDescAsiento() != null && "null".equals(this.getPolDescAsiento())) {
            conditions += " AND POL_DESC_ASIENTO IS NULL";
        } else if (this.getPolDescAsiento() != null) {
            conditions += " AND POL_DESC_ASIENTO = ?";
            values.add(this.getPolDescAsiento());
        }

        if (this.getPolAnoAplicacion() != null && this.getPolAnoAplicacion().longValue() == -999) {
            conditions += " AND POL_ANO_APLICACION IS NULL";
        } else if (this.getPolAnoAplicacion() != null) {
            conditions += " AND POL_ANO_APLICACION = ?";
            values.add(this.getPolAnoAplicacion());
        }

        if (this.getPolMesAplicacion() != null && this.getPolMesAplicacion().longValue() == -999) {
            conditions += " AND POL_MES_APLICACION IS NULL";
        } else if (this.getPolMesAplicacion() != null) {
            conditions += " AND POL_MES_APLICACION = ?";
            values.add(this.getPolMesAplicacion());
        }

        if (this.getPolDiaAplicacion() != null && this.getPolDiaAplicacion().longValue() == -999) {
            conditions += " AND POL_DIA_APLICACION IS NULL";
        } else if (this.getPolDiaAplicacion() != null) {
            conditions += " AND POL_DIA_APLICACION = ?";
            values.add(this.getPolDiaAplicacion());
        }

        if (this.getPolAnoFecValor() != null && this.getPolAnoFecValor().longValue() == -999) {
            conditions += " AND POL_ANO_FEC_VALOR IS NULL";
        } else if (this.getPolAnoFecValor() != null) {
            conditions += " AND POL_ANO_FEC_VALOR = ?";
            values.add(this.getPolAnoFecValor());
        }

        if (this.getPolMesFecValor() != null && this.getPolMesFecValor().longValue() == -999) {
            conditions += " AND POL_MES_FEC_VALOR IS NULL";
        } else if (this.getPolMesFecValor() != null) {
            conditions += " AND POL_MES_FEC_VALOR = ?";
            values.add(this.getPolMesFecValor());
        }

        if (this.getPolDiaFecValor() != null && this.getPolDiaFecValor().longValue() == -999) {
            conditions += " AND POL_DIA_FEC_VALOR IS NULL";
        } else if (this.getPolDiaFecValor() != null) {
            conditions += " AND POL_DIA_FEC_VALOR = ?";
            values.add(this.getPolDiaFecValor());
        }

        if (this.getPolHrAplicacion() != null && this.getPolHrAplicacion().longValue() == -999) {
            conditions += " AND POL_HR_APLICACION IS NULL";
        } else if (this.getPolHrAplicacion() != null) {
            conditions += " AND POL_HR_APLICACION = ?";
            values.add(this.getPolHrAplicacion());
        }

        if (this.getPolMinAplicacion() != null && this.getPolMinAplicacion().longValue() == -999) {
            conditions += " AND POL_MIN_APLICACION IS NULL";
        } else if (this.getPolMinAplicacion() != null) {
            conditions += " AND POL_MIN_APLICACION = ?";
            values.add(this.getPolMinAplicacion());
        }

        if (this.getPolAnoAltaReg() != null && this.getPolAnoAltaReg().longValue() == -999) {
            conditions += " AND POL_ANO_ALTA_REG IS NULL";
        } else if (this.getPolAnoAltaReg() != null) {
            conditions += " AND POL_ANO_ALTA_REG = ?";
            values.add(this.getPolAnoAltaReg());
        }

        if (this.getPolMesAltaReg() != null && this.getPolMesAltaReg().longValue() == -999) {
            conditions += " AND POL_MES_ALTA_REG IS NULL";
        } else if (this.getPolMesAltaReg() != null) {
            conditions += " AND POL_MES_ALTA_REG = ?";
            values.add(this.getPolMesAltaReg());
        }

        if (this.getPolDiaAltaReg() != null && this.getPolDiaAltaReg().longValue() == -999) {
            conditions += " AND POL_DIA_ALTA_REG IS NULL";
        } else if (this.getPolDiaAltaReg() != null) {
            conditions += " AND POL_DIA_ALTA_REG = ?";
            values.add(this.getPolDiaAltaReg());
        }

        if (this.getPolAnoUltMod() != null && this.getPolAnoUltMod().longValue() == -999) {
            conditions += " AND POL_ANO_ULT_MOD IS NULL";
        } else if (this.getPolAnoUltMod() != null) {
            conditions += " AND POL_ANO_ULT_MOD = ?";
            values.add(this.getPolAnoUltMod());
        }

        if (this.getPolMesUltMod() != null && this.getPolMesUltMod().longValue() == -999) {
            conditions += " AND POL_MES_ULT_MOD IS NULL";
        } else if (this.getPolMesUltMod() != null) {
            conditions += " AND POL_MES_ULT_MOD = ?";
            values.add(this.getPolMesUltMod());
        }

        if (this.getPolDiaUltMod() != null && this.getPolDiaUltMod().longValue() == -999) {
            conditions += " AND POL_DIA_ULT_MOD IS NULL";
        } else if (this.getPolDiaUltMod() != null) {
            conditions += " AND POL_DIA_ULT_MOD = ?";
            values.add(this.getPolDiaUltMod());
        }

        if (this.getPolCveStPoliza() != null && "null".equals(this.getPolCveStPoliza())) {
            conditions += " AND POL_CVE_ST_POLIZA IS NULL";
        } else if (this.getPolCveStPoliza() != null) {
            conditions += " AND POL_CVE_ST_POLIZA = ?";
            values.add(this.getPolCveStPoliza());
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
        String sql = "UPDATE POLIZAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND POL_NUM_USUARIO = ?";
        pkValues.add(this.getPolNumUsuario());
        conditions += " AND POL_FOLIO_OPERA = ?";
        pkValues.add(this.getPolFolioOpera());
        conditions += " AND POL_NUM_MODULO = ?";
        pkValues.add(this.getPolNumModulo());
        conditions += " AND POL_NUM_TRANSAC = ?";
        pkValues.add(this.getPolNumTransac());
        conditions += " AND POL_NUM_SEC_ASIENT = ?";
        pkValues.add(this.getPolNumSecAsient());
        fields += " POL_NUM_CTAM = ?, ";
        values.add(this.getPolNumCtam());
        fields += " POL_NUM_SCTA = ?, ";
        values.add(this.getPolNumScta());
        fields += " POL_NUM_SSCTA = ?, ";
        values.add(this.getPolNumSscta());
        fields += " POL_NUM_SSSCTA = ?, ";
        values.add(this.getPolNumSsscta());
        fields += " POL_NUM_AUX1 = ?, ";
        values.add(this.getPolNumAux1());
        fields += " POL_NUM_AUX2 = ?, ";
        values.add(this.getPolNumAux2());
        fields += " POL_NUM_AUX3 = ?, ";
        values.add(this.getPolNumAux3());
        fields += " POL_CVE_APLICA_DAT = ?, ";
        values.add(this.getPolCveAplicaDat());
        fields += " POL_CVE_CAR_ABO = ?, ";
        values.add(this.getPolCveCarAbo());
        fields += " POL_IMP_VALOR_DATO = ?, ";
        values.add(this.getPolImpValorDato());
        fields += " POL_DESC_ASIENTO = ?, ";
        values.add(this.getPolDescAsiento());
        fields += " POL_ANO_APLICACION = ?, ";
        values.add(this.getPolAnoAplicacion());
        fields += " POL_MES_APLICACION = ?, ";
        values.add(this.getPolMesAplicacion());
        fields += " POL_DIA_APLICACION = ?, ";
        values.add(this.getPolDiaAplicacion());
        fields += " POL_ANO_FEC_VALOR = ?, ";
        values.add(this.getPolAnoFecValor());
        fields += " POL_MES_FEC_VALOR = ?, ";
        values.add(this.getPolMesFecValor());
        fields += " POL_DIA_FEC_VALOR = ?, ";
        values.add(this.getPolDiaFecValor());
        fields += " POL_HR_APLICACION = ?, ";
        values.add(this.getPolHrAplicacion());
        fields += " POL_MIN_APLICACION = ?, ";
        values.add(this.getPolMinAplicacion());
        fields += " POL_ANO_ALTA_REG = ?, ";
        values.add(this.getPolAnoAltaReg());
        fields += " POL_MES_ALTA_REG = ?, ";
        values.add(this.getPolMesAltaReg());
        fields += " POL_DIA_ALTA_REG = ?, ";
        values.add(this.getPolDiaAltaReg());
        fields += " POL_ANO_ULT_MOD = ?, ";
        values.add(this.getPolAnoUltMod());
        fields += " POL_MES_ULT_MOD = ?, ";
        values.add(this.getPolMesUltMod());
        fields += " POL_DIA_ULT_MOD = ?, ";
        values.add(this.getPolDiaUltMod());
        fields += " POL_CVE_ST_POLIZA = ?, ";
        values.add(this.getPolCveStPoliza());
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
        String sql = "INSERT INTO POLIZAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", POL_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getPolNumUsuario());

        fields += ", POL_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getPolFolioOpera());

        fields += ", POL_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getPolNumModulo());

        fields += ", POL_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getPolNumTransac());

        fields += ", POL_NUM_SEC_ASIENT";
        fieldValues += ", ?";
        values.add(this.getPolNumSecAsient());

        fields += ", POL_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getPolNumCtam());

        fields += ", POL_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getPolNumScta());

        fields += ", POL_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getPolNumSscta());

        fields += ", POL_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getPolNumSsscta());

        fields += ", POL_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getPolNumAux1());

        fields += ", POL_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getPolNumAux2());

        fields += ", POL_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getPolNumAux3());

        fields += ", POL_CVE_APLICA_DAT";
        fieldValues += ", ?";
        values.add(this.getPolCveAplicaDat());

        fields += ", POL_CVE_CAR_ABO";
        fieldValues += ", ?";
        values.add(this.getPolCveCarAbo());

        fields += ", POL_IMP_VALOR_DATO";
        fieldValues += ", ?";
        values.add(this.getPolImpValorDato());

        fields += ", POL_DESC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getPolDescAsiento());

        fields += ", POL_ANO_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPolAnoAplicacion());

        fields += ", POL_MES_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPolMesAplicacion());

        fields += ", POL_DIA_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPolDiaAplicacion());

        fields += ", POL_ANO_FEC_VALOR";
        fieldValues += ", ?";
        values.add(this.getPolAnoFecValor());

        fields += ", POL_MES_FEC_VALOR";
        fieldValues += ", ?";
        values.add(this.getPolMesFecValor());

        fields += ", POL_DIA_FEC_VALOR";
        fieldValues += ", ?";
        values.add(this.getPolDiaFecValor());

        fields += ", POL_HR_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPolHrAplicacion());

        fields += ", POL_MIN_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPolMinAplicacion());

        fields += ", POL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPolAnoAltaReg());

        fields += ", POL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPolMesAltaReg());

        fields += ", POL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPolDiaAltaReg());

        fields += ", POL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPolAnoUltMod());

        fields += ", POL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPolMesUltMod());

        fields += ", POL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPolDiaUltMod());

        fields += ", POL_CVE_ST_POLIZA";
        fieldValues += ", ?";
        values.add(this.getPolCveStPoliza());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POLIZAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND POL_NUM_USUARIO = ?";
        values.add(this.getPolNumUsuario());
        conditions += " AND POL_FOLIO_OPERA = ?";
        values.add(this.getPolFolioOpera());
        conditions += " AND POL_NUM_MODULO = ?";
        values.add(this.getPolNumModulo());
        conditions += " AND POL_NUM_TRANSAC = ?";
        values.add(this.getPolNumTransac());
        conditions += " AND POL_NUM_SEC_ASIENT = ?";
        values.add(this.getPolNumSecAsient());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Polizas instance = (Polizas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPolNumUsuario().equals(instance.getPolNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getPolFolioOpera().equals(instance.getPolFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumModulo().equals(instance.getPolNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumTransac().equals(instance.getPolNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumSecAsient().equals(instance.getPolNumSecAsient()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumCtam().equals(instance.getPolNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumScta().equals(instance.getPolNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumSscta().equals(instance.getPolNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumSsscta().equals(instance.getPolNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumAux1().equals(instance.getPolNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumAux2().equals(instance.getPolNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getPolNumAux3().equals(instance.getPolNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getPolCveAplicaDat().equals(instance.getPolCveAplicaDat()))
            equalObjects = false;
        if (equalObjects && !this.getPolCveCarAbo().equals(instance.getPolCveCarAbo()))
            equalObjects = false;
        if (equalObjects && !this.getPolImpValorDato().equals(instance.getPolImpValorDato()))
            equalObjects = false;
        if (equalObjects && !this.getPolDescAsiento().equals(instance.getPolDescAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getPolAnoAplicacion().equals(instance.getPolAnoAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPolMesAplicacion().equals(instance.getPolMesAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPolDiaAplicacion().equals(instance.getPolDiaAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPolAnoFecValor().equals(instance.getPolAnoFecValor()))
            equalObjects = false;
        if (equalObjects && !this.getPolMesFecValor().equals(instance.getPolMesFecValor()))
            equalObjects = false;
        if (equalObjects && !this.getPolDiaFecValor().equals(instance.getPolDiaFecValor()))
            equalObjects = false;
        if (equalObjects && !this.getPolHrAplicacion().equals(instance.getPolHrAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPolMinAplicacion().equals(instance.getPolMinAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPolAnoAltaReg().equals(instance.getPolAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPolMesAltaReg().equals(instance.getPolMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPolDiaAltaReg().equals(instance.getPolDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPolAnoUltMod().equals(instance.getPolAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPolMesUltMod().equals(instance.getPolMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPolDiaUltMod().equals(instance.getPolDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPolCveStPoliza().equals(instance.getPolCveStPoliza()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Polizas result = new Polizas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPolNumUsuario((BigDecimal) objectData.getData("POL_NUM_USUARIO"));
        result.setPolFolioOpera((BigDecimal) objectData.getData("POL_FOLIO_OPERA"));
        result.setPolNumModulo((BigDecimal) objectData.getData("POL_NUM_MODULO"));
        result.setPolNumTransac((BigDecimal) objectData.getData("POL_NUM_TRANSAC"));
        result.setPolNumSecAsient((BigDecimal) objectData.getData("POL_NUM_SEC_ASIENT"));
        result.setPolNumCtam((BigDecimal) objectData.getData("POL_NUM_CTAM"));
        result.setPolNumScta((BigDecimal) objectData.getData("POL_NUM_SCTA"));
        result.setPolNumSscta((BigDecimal) objectData.getData("POL_NUM_SSCTA"));
        result.setPolNumSsscta((BigDecimal) objectData.getData("POL_NUM_SSSCTA"));
        result.setPolNumAux1((BigDecimal) objectData.getData("POL_NUM_AUX1"));
        result.setPolNumAux2((BigDecimal) objectData.getData("POL_NUM_AUX2"));
        result.setPolNumAux3((BigDecimal) objectData.getData("POL_NUM_AUX3"));
        result.setPolCveAplicaDat((String) objectData.getData("POL_CVE_APLICA_DAT"));
        result.setPolCveCarAbo((String) objectData.getData("POL_CVE_CAR_ABO"));
        result.setPolImpValorDato((BigDecimal) objectData.getData("POL_IMP_VALOR_DATO"));
        result.setPolDescAsiento((String) objectData.getData("POL_DESC_ASIENTO"));
        result.setPolAnoAplicacion((BigDecimal) objectData.getData("POL_ANO_APLICACION"));
        result.setPolMesAplicacion((BigDecimal) objectData.getData("POL_MES_APLICACION"));
        result.setPolDiaAplicacion((BigDecimal) objectData.getData("POL_DIA_APLICACION"));
        result.setPolAnoFecValor((BigDecimal) objectData.getData("POL_ANO_FEC_VALOR"));
        result.setPolMesFecValor((BigDecimal) objectData.getData("POL_MES_FEC_VALOR"));
        result.setPolDiaFecValor((BigDecimal) objectData.getData("POL_DIA_FEC_VALOR"));
        result.setPolHrAplicacion((BigDecimal) objectData.getData("POL_HR_APLICACION"));
        result.setPolMinAplicacion((BigDecimal) objectData.getData("POL_MIN_APLICACION"));
        result.setPolAnoAltaReg((BigDecimal) objectData.getData("POL_ANO_ALTA_REG"));
        result.setPolMesAltaReg((BigDecimal) objectData.getData("POL_MES_ALTA_REG"));
        result.setPolDiaAltaReg((BigDecimal) objectData.getData("POL_DIA_ALTA_REG"));
        result.setPolAnoUltMod((BigDecimal) objectData.getData("POL_ANO_ULT_MOD"));
        result.setPolMesUltMod((BigDecimal) objectData.getData("POL_MES_ULT_MOD"));
        result.setPolDiaUltMod((BigDecimal) objectData.getData("POL_DIA_ULT_MOD"));
        result.setPolCveStPoliza((String) objectData.getData("POL_CVE_ST_POLIZA"));

        return result;

    }

}
