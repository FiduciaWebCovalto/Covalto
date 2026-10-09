package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POLINVER_PK", columns = { "PIN_NUM_TRANSAC", "PIN_NUM_MODULO", "PIN_CVE_ESTR_INVER", "PIN_NUM_SEC_INSTRU" }, sequences = { "MANUAL" })
public class Polinver extends DomainObject {

    BigDecimal pinNumTransac = null;
    BigDecimal pinNumModulo = null;
    String pinCveEstrInver = null;
    BigDecimal pinNumSecInstru = null;
    String pinCveTipoPers = null;
    String pinCvePersFid = null;
    String pinCveTipoNego = null;
    String pinCveClasProd = null;
    BigDecimal pinCveTipoMerca = null;
    BigDecimal pinNumInstrume = null;
    BigDecimal pinNumSecEmis = null;
    String pinNomPizarra = null;
    String pinNumSerEmis = null;
    BigDecimal pinNumCuponVig = null;
    BigDecimal pinNumPlazo = null;
    BigDecimal pinPjeInversion = null;
    BigDecimal pinAnoVigDel = null;
    BigDecimal pinMesVigDel = null;
    BigDecimal pinDiaVigDel = null;
    BigDecimal pinAnoVigAl = null;
    BigDecimal pinMesVigAl = null;
    BigDecimal pinDiaVigAl = null;
    BigDecimal pinHrVigenciaDe = null;
    BigDecimal pinMiVigenciaDe = null;
    BigDecimal pinAnoAltaReg = null;
    BigDecimal pinMesAltaReg = null;
    BigDecimal pinDiaAltaReg = null;
    BigDecimal pinAnoUltMod = null;
    BigDecimal pinMesUltMod = null;
    BigDecimal pinDiaUltMod = null;
    String pinCveStPolinve = null;

    public Polinver() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumTransac(BigDecimal pinNumTransac) {
        this.pinNumTransac = pinNumTransac;
    }

    public BigDecimal getPinNumTransac() {
        return this.pinNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumModulo(BigDecimal pinNumModulo) {
        this.pinNumModulo = pinNumModulo;
    }

    public BigDecimal getPinNumModulo() {
        return this.pinNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCveEstrInver(String pinCveEstrInver) {
        this.pinCveEstrInver = pinCveEstrInver;
    }

    public String getPinCveEstrInver() {
        return this.pinCveEstrInver;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumSecInstru(BigDecimal pinNumSecInstru) {
        this.pinNumSecInstru = pinNumSecInstru;
    }

    public BigDecimal getPinNumSecInstru() {
        return this.pinNumSecInstru;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCveTipoPers(String pinCveTipoPers) {
        this.pinCveTipoPers = pinCveTipoPers;
    }

    public String getPinCveTipoPers() {
        return this.pinCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCvePersFid(String pinCvePersFid) {
        this.pinCvePersFid = pinCvePersFid;
    }

    public String getPinCvePersFid() {
        return this.pinCvePersFid;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCveTipoNego(String pinCveTipoNego) {
        this.pinCveTipoNego = pinCveTipoNego;
    }

    public String getPinCveTipoNego() {
        return this.pinCveTipoNego;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCveClasProd(String pinCveClasProd) {
        this.pinCveClasProd = pinCveClasProd;
    }

    public String getPinCveClasProd() {
        return this.pinCveClasProd;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinCveTipoMerca(BigDecimal pinCveTipoMerca) {
        this.pinCveTipoMerca = pinCveTipoMerca;
    }

    public BigDecimal getPinCveTipoMerca() {
        return this.pinCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumInstrume(BigDecimal pinNumInstrume) {
        this.pinNumInstrume = pinNumInstrume;
    }

    public BigDecimal getPinNumInstrume() {
        return this.pinNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumSecEmis(BigDecimal pinNumSecEmis) {
        this.pinNumSecEmis = pinNumSecEmis;
    }

    public BigDecimal getPinNumSecEmis() {
        return this.pinNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinNomPizarra(String pinNomPizarra) {
        this.pinNomPizarra = pinNomPizarra;
    }

    public String getPinNomPizarra() {
        return this.pinNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinNumSerEmis(String pinNumSerEmis) {
        this.pinNumSerEmis = pinNumSerEmis;
    }

    public String getPinNumSerEmis() {
        return this.pinNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumCuponVig(BigDecimal pinNumCuponVig) {
        this.pinNumCuponVig = pinNumCuponVig;
    }

    public BigDecimal getPinNumCuponVig() {
        return this.pinNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumPlazo(BigDecimal pinNumPlazo) {
        this.pinNumPlazo = pinNumPlazo;
    }

    public BigDecimal getPinNumPlazo() {
        return this.pinNumPlazo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPinPjeInversion(BigDecimal pinPjeInversion) {
        this.pinPjeInversion = pinPjeInversion;
    }

    public BigDecimal getPinPjeInversion() {
        return this.pinPjeInversion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPinAnoVigDel(BigDecimal pinAnoVigDel) {
        this.pinAnoVigDel = pinAnoVigDel;
    }

    public BigDecimal getPinAnoVigDel() {
        return this.pinAnoVigDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinMesVigDel(BigDecimal pinMesVigDel) {
        this.pinMesVigDel = pinMesVigDel;
    }

    public BigDecimal getPinMesVigDel() {
        return this.pinMesVigDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinDiaVigDel(BigDecimal pinDiaVigDel) {
        this.pinDiaVigDel = pinDiaVigDel;
    }

    public BigDecimal getPinDiaVigDel() {
        return this.pinDiaVigDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPinAnoVigAl(BigDecimal pinAnoVigAl) {
        this.pinAnoVigAl = pinAnoVigAl;
    }

    public BigDecimal getPinAnoVigAl() {
        return this.pinAnoVigAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinMesVigAl(BigDecimal pinMesVigAl) {
        this.pinMesVigAl = pinMesVigAl;
    }

    public BigDecimal getPinMesVigAl() {
        return this.pinMesVigAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinDiaVigAl(BigDecimal pinDiaVigAl) {
        this.pinDiaVigAl = pinDiaVigAl;
    }

    public BigDecimal getPinDiaVigAl() {
        return this.pinDiaVigAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPinHrVigenciaDe(BigDecimal pinHrVigenciaDe) {
        this.pinHrVigenciaDe = pinHrVigenciaDe;
    }

    public BigDecimal getPinHrVigenciaDe() {
        return this.pinHrVigenciaDe;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPinMiVigenciaDe(BigDecimal pinMiVigenciaDe) {
        this.pinMiVigenciaDe = pinMiVigenciaDe;
    }

    public BigDecimal getPinMiVigenciaDe() {
        return this.pinMiVigenciaDe;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPinAnoAltaReg(BigDecimal pinAnoAltaReg) {
        this.pinAnoAltaReg = pinAnoAltaReg;
    }

    public BigDecimal getPinAnoAltaReg() {
        return this.pinAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinMesAltaReg(BigDecimal pinMesAltaReg) {
        this.pinMesAltaReg = pinMesAltaReg;
    }

    public BigDecimal getPinMesAltaReg() {
        return this.pinMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinDiaAltaReg(BigDecimal pinDiaAltaReg) {
        this.pinDiaAltaReg = pinDiaAltaReg;
    }

    public BigDecimal getPinDiaAltaReg() {
        return this.pinDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPinAnoUltMod(BigDecimal pinAnoUltMod) {
        this.pinAnoUltMod = pinAnoUltMod;
    }

    public BigDecimal getPinAnoUltMod() {
        return this.pinAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinMesUltMod(BigDecimal pinMesUltMod) {
        this.pinMesUltMod = pinMesUltMod;
    }

    public BigDecimal getPinMesUltMod() {
        return this.pinMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPinDiaUltMod(BigDecimal pinDiaUltMod) {
        this.pinDiaUltMod = pinDiaUltMod;
    }

    public BigDecimal getPinDiaUltMod() {
        return this.pinDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCveStPolinve(String pinCveStPolinve) {
        this.pinCveStPolinve = pinCveStPolinve;
    }

    public String getPinCveStPolinve() {
        return this.pinCveStPolinve;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POLINVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPinNumTransac() != null && this.getPinNumTransac().longValue() == -999) {
            conditions += " AND PIN_NUM_TRANSAC IS NULL";
        } else if (this.getPinNumTransac() != null) {
            conditions += " AND PIN_NUM_TRANSAC = ?";
            values.add(this.getPinNumTransac());
        }

        if (this.getPinNumModulo() != null && this.getPinNumModulo().longValue() == -999) {
            conditions += " AND PIN_NUM_MODULO IS NULL";
        } else if (this.getPinNumModulo() != null) {
            conditions += " AND PIN_NUM_MODULO = ?";
            values.add(this.getPinNumModulo());
        }

        if (this.getPinCveEstrInver() != null && "null".equals(this.getPinCveEstrInver())) {
            conditions += " AND PIN_CVE_ESTR_INVER IS NULL";
        } else if (this.getPinCveEstrInver() != null) {
            conditions += " AND PIN_CVE_ESTR_INVER = ?";
            values.add(this.getPinCveEstrInver());
        }

        if (this.getPinNumSecInstru() != null && this.getPinNumSecInstru().longValue() == -999) {
            conditions += " AND PIN_NUM_SEC_INSTRU IS NULL";
        } else if (this.getPinNumSecInstru() != null) {
            conditions += " AND PIN_NUM_SEC_INSTRU = ?";
            values.add(this.getPinNumSecInstru());
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
        String sql = "SELECT * FROM POLINVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPinNumTransac() != null && this.getPinNumTransac().longValue() == -999) {
            conditions += " AND PIN_NUM_TRANSAC IS NULL";
        } else if (this.getPinNumTransac() != null) {
            conditions += " AND PIN_NUM_TRANSAC = ?";
            values.add(this.getPinNumTransac());
        }

        if (this.getPinNumModulo() != null && this.getPinNumModulo().longValue() == -999) {
            conditions += " AND PIN_NUM_MODULO IS NULL";
        } else if (this.getPinNumModulo() != null) {
            conditions += " AND PIN_NUM_MODULO = ?";
            values.add(this.getPinNumModulo());
        }

        if (this.getPinCveEstrInver() != null && "null".equals(this.getPinCveEstrInver())) {
            conditions += " AND PIN_CVE_ESTR_INVER IS NULL";
        } else if (this.getPinCveEstrInver() != null) {
            conditions += " AND PIN_CVE_ESTR_INVER = ?";
            values.add(this.getPinCveEstrInver());
        }

        if (this.getPinNumSecInstru() != null && this.getPinNumSecInstru().longValue() == -999) {
            conditions += " AND PIN_NUM_SEC_INSTRU IS NULL";
        } else if (this.getPinNumSecInstru() != null) {
            conditions += " AND PIN_NUM_SEC_INSTRU = ?";
            values.add(this.getPinNumSecInstru());
        }

        if (this.getPinCveTipoPers() != null && "null".equals(this.getPinCveTipoPers())) {
            conditions += " AND PIN_CVE_TIPO_PERS IS NULL";
        } else if (this.getPinCveTipoPers() != null) {
            conditions += " AND PIN_CVE_TIPO_PERS = ?";
            values.add(this.getPinCveTipoPers());
        }

        if (this.getPinCvePersFid() != null && "null".equals(this.getPinCvePersFid())) {
            conditions += " AND PIN_CVE_PERS_FID IS NULL";
        } else if (this.getPinCvePersFid() != null) {
            conditions += " AND PIN_CVE_PERS_FID = ?";
            values.add(this.getPinCvePersFid());
        }

        if (this.getPinCveTipoNego() != null && "null".equals(this.getPinCveTipoNego())) {
            conditions += " AND PIN_CVE_TIPO_NEGO IS NULL";
        } else if (this.getPinCveTipoNego() != null) {
            conditions += " AND PIN_CVE_TIPO_NEGO = ?";
            values.add(this.getPinCveTipoNego());
        }

        if (this.getPinCveClasProd() != null && "null".equals(this.getPinCveClasProd())) {
            conditions += " AND PIN_CVE_CLAS_PROD IS NULL";
        } else if (this.getPinCveClasProd() != null) {
            conditions += " AND PIN_CVE_CLAS_PROD = ?";
            values.add(this.getPinCveClasProd());
        }

        if (this.getPinCveTipoMerca() != null && this.getPinCveTipoMerca().longValue() == -999) {
            conditions += " AND PIN_CVE_TIPO_MERCA IS NULL";
        } else if (this.getPinCveTipoMerca() != null) {
            conditions += " AND PIN_CVE_TIPO_MERCA = ?";
            values.add(this.getPinCveTipoMerca());
        }

        if (this.getPinNumInstrume() != null && this.getPinNumInstrume().longValue() == -999) {
            conditions += " AND PIN_NUM_INSTRUME IS NULL";
        } else if (this.getPinNumInstrume() != null) {
            conditions += " AND PIN_NUM_INSTRUME = ?";
            values.add(this.getPinNumInstrume());
        }

        if (this.getPinNumSecEmis() != null && this.getPinNumSecEmis().longValue() == -999) {
            conditions += " AND PIN_NUM_SEC_EMIS IS NULL";
        } else if (this.getPinNumSecEmis() != null) {
            conditions += " AND PIN_NUM_SEC_EMIS = ?";
            values.add(this.getPinNumSecEmis());
        }

        if (this.getPinNomPizarra() != null && "null".equals(this.getPinNomPizarra())) {
            conditions += " AND PIN_NOM_PIZARRA IS NULL";
        } else if (this.getPinNomPizarra() != null) {
            conditions += " AND PIN_NOM_PIZARRA = ?";
            values.add(this.getPinNomPizarra());
        }

        if (this.getPinNumSerEmis() != null && "null".equals(this.getPinNumSerEmis())) {
            conditions += " AND PIN_NUM_SER_EMIS IS NULL";
        } else if (this.getPinNumSerEmis() != null) {
            conditions += " AND PIN_NUM_SER_EMIS = ?";
            values.add(this.getPinNumSerEmis());
        }

        if (this.getPinNumCuponVig() != null && this.getPinNumCuponVig().longValue() == -999) {
            conditions += " AND PIN_NUM_CUPON_VIG IS NULL";
        } else if (this.getPinNumCuponVig() != null) {
            conditions += " AND PIN_NUM_CUPON_VIG = ?";
            values.add(this.getPinNumCuponVig());
        }

        if (this.getPinNumPlazo() != null && this.getPinNumPlazo().longValue() == -999) {
            conditions += " AND PIN_NUM_PLAZO IS NULL";
        } else if (this.getPinNumPlazo() != null) {
            conditions += " AND PIN_NUM_PLAZO = ?";
            values.add(this.getPinNumPlazo());
        }

        if (this.getPinPjeInversion() != null && this.getPinPjeInversion().longValue() == -999) {
            conditions += " AND PIN_PJE_INVERSION IS NULL";
        } else if (this.getPinPjeInversion() != null) {
            conditions += " AND PIN_PJE_INVERSION = ?";
            values.add(this.getPinPjeInversion());
        }

        if (this.getPinAnoVigDel() != null && this.getPinAnoVigDel().longValue() == -999) {
            conditions += " AND PIN_ANO_VIG_DEL IS NULL";
        } else if (this.getPinAnoVigDel() != null) {
            conditions += " AND PIN_ANO_VIG_DEL = ?";
            values.add(this.getPinAnoVigDel());
        }

        if (this.getPinMesVigDel() != null && this.getPinMesVigDel().longValue() == -999) {
            conditions += " AND PIN_MES_VIG_DEL IS NULL";
        } else if (this.getPinMesVigDel() != null) {
            conditions += " AND PIN_MES_VIG_DEL = ?";
            values.add(this.getPinMesVigDel());
        }

        if (this.getPinDiaVigDel() != null && this.getPinDiaVigDel().longValue() == -999) {
            conditions += " AND PIN_DIA_VIG_DEL IS NULL";
        } else if (this.getPinDiaVigDel() != null) {
            conditions += " AND PIN_DIA_VIG_DEL = ?";
            values.add(this.getPinDiaVigDel());
        }

        if (this.getPinAnoVigAl() != null && this.getPinAnoVigAl().longValue() == -999) {
            conditions += " AND PIN_ANO_VIG_AL IS NULL";
        } else if (this.getPinAnoVigAl() != null) {
            conditions += " AND PIN_ANO_VIG_AL = ?";
            values.add(this.getPinAnoVigAl());
        }

        if (this.getPinMesVigAl() != null && this.getPinMesVigAl().longValue() == -999) {
            conditions += " AND PIN_MES_VIG_AL IS NULL";
        } else if (this.getPinMesVigAl() != null) {
            conditions += " AND PIN_MES_VIG_AL = ?";
            values.add(this.getPinMesVigAl());
        }

        if (this.getPinDiaVigAl() != null && this.getPinDiaVigAl().longValue() == -999) {
            conditions += " AND PIN_DIA_VIG_AL IS NULL";
        } else if (this.getPinDiaVigAl() != null) {
            conditions += " AND PIN_DIA_VIG_AL = ?";
            values.add(this.getPinDiaVigAl());
        }

        if (this.getPinHrVigenciaDe() != null && this.getPinHrVigenciaDe().longValue() == -999) {
            conditions += " AND PIN_HR_VIGENCIA_DE IS NULL";
        } else if (this.getPinHrVigenciaDe() != null) {
            conditions += " AND PIN_HR_VIGENCIA_DE = ?";
            values.add(this.getPinHrVigenciaDe());
        }

        if (this.getPinMiVigenciaDe() != null && this.getPinMiVigenciaDe().longValue() == -999) {
            conditions += " AND PIN_MI_VIGENCIA_DE IS NULL";
        } else if (this.getPinMiVigenciaDe() != null) {
            conditions += " AND PIN_MI_VIGENCIA_DE = ?";
            values.add(this.getPinMiVigenciaDe());
        }

        if (this.getPinAnoAltaReg() != null && this.getPinAnoAltaReg().longValue() == -999) {
            conditions += " AND PIN_ANO_ALTA_REG IS NULL";
        } else if (this.getPinAnoAltaReg() != null) {
            conditions += " AND PIN_ANO_ALTA_REG = ?";
            values.add(this.getPinAnoAltaReg());
        }

        if (this.getPinMesAltaReg() != null && this.getPinMesAltaReg().longValue() == -999) {
            conditions += " AND PIN_MES_ALTA_REG IS NULL";
        } else if (this.getPinMesAltaReg() != null) {
            conditions += " AND PIN_MES_ALTA_REG = ?";
            values.add(this.getPinMesAltaReg());
        }

        if (this.getPinDiaAltaReg() != null && this.getPinDiaAltaReg().longValue() == -999) {
            conditions += " AND PIN_DIA_ALTA_REG IS NULL";
        } else if (this.getPinDiaAltaReg() != null) {
            conditions += " AND PIN_DIA_ALTA_REG = ?";
            values.add(this.getPinDiaAltaReg());
        }

        if (this.getPinAnoUltMod() != null && this.getPinAnoUltMod().longValue() == -999) {
            conditions += " AND PIN_ANO_ULT_MOD IS NULL";
        } else if (this.getPinAnoUltMod() != null) {
            conditions += " AND PIN_ANO_ULT_MOD = ?";
            values.add(this.getPinAnoUltMod());
        }

        if (this.getPinMesUltMod() != null && this.getPinMesUltMod().longValue() == -999) {
            conditions += " AND PIN_MES_ULT_MOD IS NULL";
        } else if (this.getPinMesUltMod() != null) {
            conditions += " AND PIN_MES_ULT_MOD = ?";
            values.add(this.getPinMesUltMod());
        }

        if (this.getPinDiaUltMod() != null && this.getPinDiaUltMod().longValue() == -999) {
            conditions += " AND PIN_DIA_ULT_MOD IS NULL";
        } else if (this.getPinDiaUltMod() != null) {
            conditions += " AND PIN_DIA_ULT_MOD = ?";
            values.add(this.getPinDiaUltMod());
        }

        if (this.getPinCveStPolinve() != null && "null".equals(this.getPinCveStPolinve())) {
            conditions += " AND PIN_CVE_ST_POLINVE IS NULL";
        } else if (this.getPinCveStPolinve() != null) {
            conditions += " AND PIN_CVE_ST_POLINVE = ?";
            values.add(this.getPinCveStPolinve());
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
        String sql = "UPDATE POLINVER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PIN_NUM_TRANSAC = ?";
        pkValues.add(this.getPinNumTransac());
        conditions += " AND PIN_NUM_MODULO = ?";
        pkValues.add(this.getPinNumModulo());
        conditions += " AND PIN_CVE_ESTR_INVER = ?";
        pkValues.add(this.getPinCveEstrInver());
        conditions += " AND PIN_NUM_SEC_INSTRU = ?";
        pkValues.add(this.getPinNumSecInstru());
        fields += " PIN_CVE_TIPO_PERS = ?, ";
        values.add(this.getPinCveTipoPers());
        fields += " PIN_CVE_PERS_FID = ?, ";
        values.add(this.getPinCvePersFid());
        fields += " PIN_CVE_TIPO_NEGO = ?, ";
        values.add(this.getPinCveTipoNego());
        fields += " PIN_CVE_CLAS_PROD = ?, ";
        values.add(this.getPinCveClasProd());
        fields += " PIN_CVE_TIPO_MERCA = ?, ";
        values.add(this.getPinCveTipoMerca());
        fields += " PIN_NUM_INSTRUME = ?, ";
        values.add(this.getPinNumInstrume());
        fields += " PIN_NUM_SEC_EMIS = ?, ";
        values.add(this.getPinNumSecEmis());
        fields += " PIN_NOM_PIZARRA = ?, ";
        values.add(this.getPinNomPizarra());
        fields += " PIN_NUM_SER_EMIS = ?, ";
        values.add(this.getPinNumSerEmis());
        fields += " PIN_NUM_CUPON_VIG = ?, ";
        values.add(this.getPinNumCuponVig());
        fields += " PIN_NUM_PLAZO = ?, ";
        values.add(this.getPinNumPlazo());
        fields += " PIN_PJE_INVERSION = ?, ";
        values.add(this.getPinPjeInversion());
        fields += " PIN_ANO_VIG_DEL = ?, ";
        values.add(this.getPinAnoVigDel());
        fields += " PIN_MES_VIG_DEL = ?, ";
        values.add(this.getPinMesVigDel());
        fields += " PIN_DIA_VIG_DEL = ?, ";
        values.add(this.getPinDiaVigDel());
        fields += " PIN_ANO_VIG_AL = ?, ";
        values.add(this.getPinAnoVigAl());
        fields += " PIN_MES_VIG_AL = ?, ";
        values.add(this.getPinMesVigAl());
        fields += " PIN_DIA_VIG_AL = ?, ";
        values.add(this.getPinDiaVigAl());
        fields += " PIN_HR_VIGENCIA_DE = ?, ";
        values.add(this.getPinHrVigenciaDe());
        fields += " PIN_MI_VIGENCIA_DE = ?, ";
        values.add(this.getPinMiVigenciaDe());
        fields += " PIN_ANO_ALTA_REG = ?, ";
        values.add(this.getPinAnoAltaReg());
        fields += " PIN_MES_ALTA_REG = ?, ";
        values.add(this.getPinMesAltaReg());
        fields += " PIN_DIA_ALTA_REG = ?, ";
        values.add(this.getPinDiaAltaReg());
        fields += " PIN_ANO_ULT_MOD = ?, ";
        values.add(this.getPinAnoUltMod());
        fields += " PIN_MES_ULT_MOD = ?, ";
        values.add(this.getPinMesUltMod());
        fields += " PIN_DIA_ULT_MOD = ?, ";
        values.add(this.getPinDiaUltMod());
        fields += " PIN_CVE_ST_POLINVE = ?, ";
        values.add(this.getPinCveStPolinve());
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
        String sql = "INSERT INTO POLINVER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PIN_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getPinNumTransac());

        fields += ", PIN_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getPinNumModulo());

        fields += ", PIN_CVE_ESTR_INVER";
        fieldValues += ", ?";
        values.add(this.getPinCveEstrInver());

        fields += ", PIN_NUM_SEC_INSTRU";
        fieldValues += ", ?";
        values.add(this.getPinNumSecInstru());

        fields += ", PIN_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getPinCveTipoPers());

        fields += ", PIN_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPinCvePersFid());

        fields += ", PIN_CVE_TIPO_NEGO";
        fieldValues += ", ?";
        values.add(this.getPinCveTipoNego());

        fields += ", PIN_CVE_CLAS_PROD";
        fieldValues += ", ?";
        values.add(this.getPinCveClasProd());

        fields += ", PIN_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getPinCveTipoMerca());

        fields += ", PIN_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getPinNumInstrume());

        fields += ", PIN_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPinNumSecEmis());

        fields += ", PIN_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPinNomPizarra());

        fields += ", PIN_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getPinNumSerEmis());

        fields += ", PIN_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getPinNumCuponVig());

        fields += ", PIN_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getPinNumPlazo());

        fields += ", PIN_PJE_INVERSION";
        fieldValues += ", ?";
        values.add(this.getPinPjeInversion());

        fields += ", PIN_ANO_VIG_DEL";
        fieldValues += ", ?";
        values.add(this.getPinAnoVigDel());

        fields += ", PIN_MES_VIG_DEL";
        fieldValues += ", ?";
        values.add(this.getPinMesVigDel());

        fields += ", PIN_DIA_VIG_DEL";
        fieldValues += ", ?";
        values.add(this.getPinDiaVigDel());

        fields += ", PIN_ANO_VIG_AL";
        fieldValues += ", ?";
        values.add(this.getPinAnoVigAl());

        fields += ", PIN_MES_VIG_AL";
        fieldValues += ", ?";
        values.add(this.getPinMesVigAl());

        fields += ", PIN_DIA_VIG_AL";
        fieldValues += ", ?";
        values.add(this.getPinDiaVigAl());

        fields += ", PIN_HR_VIGENCIA_DE";
        fieldValues += ", ?";
        values.add(this.getPinHrVigenciaDe());

        fields += ", PIN_MI_VIGENCIA_DE";
        fieldValues += ", ?";
        values.add(this.getPinMiVigenciaDe());

        fields += ", PIN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPinAnoAltaReg());

        fields += ", PIN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPinMesAltaReg());

        fields += ", PIN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPinDiaAltaReg());

        fields += ", PIN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPinAnoUltMod());

        fields += ", PIN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPinMesUltMod());

        fields += ", PIN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPinDiaUltMod());

        fields += ", PIN_CVE_ST_POLINVE";
        fieldValues += ", ?";
        values.add(this.getPinCveStPolinve());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POLINVER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PIN_NUM_TRANSAC = ?";
        values.add(this.getPinNumTransac());
        conditions += " AND PIN_NUM_MODULO = ?";
        values.add(this.getPinNumModulo());
        conditions += " AND PIN_CVE_ESTR_INVER = ?";
        values.add(this.getPinCveEstrInver());
        conditions += " AND PIN_NUM_SEC_INSTRU = ?";
        values.add(this.getPinNumSecInstru());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Polinver instance = (Polinver) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPinNumTransac().equals(instance.getPinNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumModulo().equals(instance.getPinNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveEstrInver().equals(instance.getPinCveEstrInver()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumSecInstru().equals(instance.getPinNumSecInstru()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveTipoPers().equals(instance.getPinCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getPinCvePersFid().equals(instance.getPinCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveTipoNego().equals(instance.getPinCveTipoNego()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveClasProd().equals(instance.getPinCveClasProd()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveTipoMerca().equals(instance.getPinCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumInstrume().equals(instance.getPinNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumSecEmis().equals(instance.getPinNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPinNomPizarra().equals(instance.getPinNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumSerEmis().equals(instance.getPinNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumCuponVig().equals(instance.getPinNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumPlazo().equals(instance.getPinNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getPinPjeInversion().equals(instance.getPinPjeInversion()))
            equalObjects = false;
        if (equalObjects && !this.getPinAnoVigDel().equals(instance.getPinAnoVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPinMesVigDel().equals(instance.getPinMesVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPinDiaVigDel().equals(instance.getPinDiaVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPinAnoVigAl().equals(instance.getPinAnoVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPinMesVigAl().equals(instance.getPinMesVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPinDiaVigAl().equals(instance.getPinDiaVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPinHrVigenciaDe().equals(instance.getPinHrVigenciaDe()))
            equalObjects = false;
        if (equalObjects && !this.getPinMiVigenciaDe().equals(instance.getPinMiVigenciaDe()))
            equalObjects = false;
        if (equalObjects && !this.getPinAnoAltaReg().equals(instance.getPinAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPinMesAltaReg().equals(instance.getPinMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPinDiaAltaReg().equals(instance.getPinDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPinAnoUltMod().equals(instance.getPinAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPinMesUltMod().equals(instance.getPinMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPinDiaUltMod().equals(instance.getPinDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveStPolinve().equals(instance.getPinCveStPolinve()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Polinver result = new Polinver();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPinNumTransac((BigDecimal) objectData.getData("PIN_NUM_TRANSAC"));
        result.setPinNumModulo((BigDecimal) objectData.getData("PIN_NUM_MODULO"));
        result.setPinCveEstrInver((String) objectData.getData("PIN_CVE_ESTR_INVER"));
        result.setPinNumSecInstru((BigDecimal) objectData.getData("PIN_NUM_SEC_INSTRU"));
        result.setPinCveTipoPers((String) objectData.getData("PIN_CVE_TIPO_PERS"));
        result.setPinCvePersFid((String) objectData.getData("PIN_CVE_PERS_FID"));
        result.setPinCveTipoNego((String) objectData.getData("PIN_CVE_TIPO_NEGO"));
        result.setPinCveClasProd((String) objectData.getData("PIN_CVE_CLAS_PROD"));
        result.setPinCveTipoMerca((BigDecimal) objectData.getData("PIN_CVE_TIPO_MERCA"));
        result.setPinNumInstrume((BigDecimal) objectData.getData("PIN_NUM_INSTRUME"));
        result.setPinNumSecEmis((BigDecimal) objectData.getData("PIN_NUM_SEC_EMIS"));
        result.setPinNomPizarra((String) objectData.getData("PIN_NOM_PIZARRA"));
        result.setPinNumSerEmis((String) objectData.getData("PIN_NUM_SER_EMIS"));
        result.setPinNumCuponVig((BigDecimal) objectData.getData("PIN_NUM_CUPON_VIG"));
        result.setPinNumPlazo((BigDecimal) objectData.getData("PIN_NUM_PLAZO"));
        result.setPinPjeInversion((BigDecimal) objectData.getData("PIN_PJE_INVERSION"));
        result.setPinAnoVigDel((BigDecimal) objectData.getData("PIN_ANO_VIG_DEL"));
        result.setPinMesVigDel((BigDecimal) objectData.getData("PIN_MES_VIG_DEL"));
        result.setPinDiaVigDel((BigDecimal) objectData.getData("PIN_DIA_VIG_DEL"));
        result.setPinAnoVigAl((BigDecimal) objectData.getData("PIN_ANO_VIG_AL"));
        result.setPinMesVigAl((BigDecimal) objectData.getData("PIN_MES_VIG_AL"));
        result.setPinDiaVigAl((BigDecimal) objectData.getData("PIN_DIA_VIG_AL"));
        result.setPinHrVigenciaDe((BigDecimal) objectData.getData("PIN_HR_VIGENCIA_DE"));
        result.setPinMiVigenciaDe((BigDecimal) objectData.getData("PIN_MI_VIGENCIA_DE"));
        result.setPinAnoAltaReg((BigDecimal) objectData.getData("PIN_ANO_ALTA_REG"));
        result.setPinMesAltaReg((BigDecimal) objectData.getData("PIN_MES_ALTA_REG"));
        result.setPinDiaAltaReg((BigDecimal) objectData.getData("PIN_DIA_ALTA_REG"));
        result.setPinAnoUltMod((BigDecimal) objectData.getData("PIN_ANO_ULT_MOD"));
        result.setPinMesUltMod((BigDecimal) objectData.getData("PIN_MES_ULT_MOD"));
        result.setPinDiaUltMod((BigDecimal) objectData.getData("PIN_DIA_ULT_MOD"));
        result.setPinCveStPolinve((String) objectData.getData("PIN_CVE_ST_POLINVE"));

        return result;

    }

}
