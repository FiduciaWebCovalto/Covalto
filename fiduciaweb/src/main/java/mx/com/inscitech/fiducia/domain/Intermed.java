package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INTERMED_PK", columns = { "INT_ENTIDAD_FIN" }, sequences = { "MAX" })
public class Intermed extends DomainObject {

    BigDecimal intEntidadFin = null;
    String intIntermediario = null;
    String intRfc = null;
    String intCalleNum = null;
    String intNomColonia = null;
    String intNomPoblacion = null;
    BigDecimal intCodigoPostal = null;
    BigDecimal intNumEstado = null;
    String intNomEstado = null;
    BigDecimal intNumPais = null;
    String intNomPais = null;
    String intNumCveLada = null;
    String intNumTelef = null;
    String intNumExt = null;
    BigDecimal intCveExtranjero = null;
    BigDecimal intNumPaisOrig = null;
    String intNomPaisOrig = null;
    BigDecimal intCveCheqCaja = null;
    String intCveTipCtaAl = null;
    BigDecimal intSucursalAl = null;
    BigDecimal intNumCuentaAl = null;
    BigDecimal intCveCheque = null;
    String intCveTipCtaDe = null;
    BigDecimal intSucursalDel = null;
    BigDecimal intNumCuentaDel = null;
    BigDecimal intAnoAltaReg = null;
    BigDecimal intMesAltaReg = null;
    BigDecimal intDiaAltaReg = null;
    BigDecimal intAnoUltMod = null;
    BigDecimal intMesUltMod = null;
    BigDecimal intDiaUltMod = null;
    String intCveStInterme = null;
    BigDecimal intBancoAl = null;
    BigDecimal intBancoDel = null;
    String intNomContacto = null;

    public Intermed() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntEntidadFin(BigDecimal intEntidadFin) {
        this.intEntidadFin = intEntidadFin;
    }

    public BigDecimal getIntEntidadFin() {
        return this.intEntidadFin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntIntermediario(String intIntermediario) {
        this.intIntermediario = intIntermediario;
    }

    public String getIntIntermediario() {
        return this.intIntermediario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntRfc(String intRfc) {
        this.intRfc = intRfc;
    }

    public String getIntRfc() {
        return this.intRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntCalleNum(String intCalleNum) {
        this.intCalleNum = intCalleNum;
    }

    public String getIntCalleNum() {
        return this.intCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNomColonia(String intNomColonia) {
        this.intNomColonia = intNomColonia;
    }

    public String getIntNomColonia() {
        return this.intNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNomPoblacion(String intNomPoblacion) {
        this.intNomPoblacion = intNomPoblacion;
    }

    public String getIntNomPoblacion() {
        return this.intNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntCodigoPostal(BigDecimal intCodigoPostal) {
        this.intCodigoPostal = intCodigoPostal;
    }

    public BigDecimal getIntCodigoPostal() {
        return this.intCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumEstado(BigDecimal intNumEstado) {
        this.intNumEstado = intNumEstado;
    }

    public BigDecimal getIntNumEstado() {
        return this.intNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNomEstado(String intNomEstado) {
        this.intNomEstado = intNomEstado;
    }

    public String getIntNomEstado() {
        return this.intNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumPais(BigDecimal intNumPais) {
        this.intNumPais = intNumPais;
    }

    public BigDecimal getIntNumPais() {
        return this.intNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNomPais(String intNomPais) {
        this.intNomPais = intNomPais;
    }

    public String getIntNomPais() {
        return this.intNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNumCveLada(String intNumCveLada) {
        this.intNumCveLada = intNumCveLada;
    }

    public String getIntNumCveLada() {
        return this.intNumCveLada;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNumTelef(String intNumTelef) {
        this.intNumTelef = intNumTelef;
    }

    public String getIntNumTelef() {
        return this.intNumTelef;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNumExt(String intNumExt) {
        this.intNumExt = intNumExt;
    }

    public String getIntNumExt() {
        return this.intNumExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntCveExtranjero(BigDecimal intCveExtranjero) {
        this.intCveExtranjero = intCveExtranjero;
    }

    public BigDecimal getIntCveExtranjero() {
        return this.intCveExtranjero;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumPaisOrig(BigDecimal intNumPaisOrig) {
        this.intNumPaisOrig = intNumPaisOrig;
    }

    public BigDecimal getIntNumPaisOrig() {
        return this.intNumPaisOrig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNomPaisOrig(String intNomPaisOrig) {
        this.intNomPaisOrig = intNomPaisOrig;
    }

    public String getIntNomPaisOrig() {
        return this.intNomPaisOrig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntCveCheqCaja(BigDecimal intCveCheqCaja) {
        this.intCveCheqCaja = intCveCheqCaja;
    }

    public BigDecimal getIntCveCheqCaja() {
        return this.intCveCheqCaja;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntCveTipCtaAl(String intCveTipCtaAl) {
        this.intCveTipCtaAl = intCveTipCtaAl;
    }

    public String getIntCveTipCtaAl() {
        return this.intCveTipCtaAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntSucursalAl(BigDecimal intSucursalAl) {
        this.intSucursalAl = intSucursalAl;
    }

    public BigDecimal getIntSucursalAl() {
        return this.intSucursalAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumCuentaAl(BigDecimal intNumCuentaAl) {
        this.intNumCuentaAl = intNumCuentaAl;
    }

    public BigDecimal getIntNumCuentaAl() {
        return this.intNumCuentaAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntCveCheque(BigDecimal intCveCheque) {
        this.intCveCheque = intCveCheque;
    }

    public BigDecimal getIntCveCheque() {
        return this.intCveCheque;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntCveTipCtaDe(String intCveTipCtaDe) {
        this.intCveTipCtaDe = intCveTipCtaDe;
    }

    public String getIntCveTipCtaDe() {
        return this.intCveTipCtaDe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntSucursalDel(BigDecimal intSucursalDel) {
        this.intSucursalDel = intSucursalDel;
    }

    public BigDecimal getIntSucursalDel() {
        return this.intSucursalDel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumCuentaDel(BigDecimal intNumCuentaDel) {
        this.intNumCuentaDel = intNumCuentaDel;
    }

    public BigDecimal getIntNumCuentaDel() {
        return this.intNumCuentaDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIntAnoAltaReg(BigDecimal intAnoAltaReg) {
        this.intAnoAltaReg = intAnoAltaReg;
    }

    public BigDecimal getIntAnoAltaReg() {
        return this.intAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntMesAltaReg(BigDecimal intMesAltaReg) {
        this.intMesAltaReg = intMesAltaReg;
    }

    public BigDecimal getIntMesAltaReg() {
        return this.intMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntDiaAltaReg(BigDecimal intDiaAltaReg) {
        this.intDiaAltaReg = intDiaAltaReg;
    }

    public BigDecimal getIntDiaAltaReg() {
        return this.intDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIntAnoUltMod(BigDecimal intAnoUltMod) {
        this.intAnoUltMod = intAnoUltMod;
    }

    public BigDecimal getIntAnoUltMod() {
        return this.intAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntMesUltMod(BigDecimal intMesUltMod) {
        this.intMesUltMod = intMesUltMod;
    }

    public BigDecimal getIntMesUltMod() {
        return this.intMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIntDiaUltMod(BigDecimal intDiaUltMod) {
        this.intDiaUltMod = intDiaUltMod;
    }

    public BigDecimal getIntDiaUltMod() {
        return this.intDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntCveStInterme(String intCveStInterme) {
        this.intCveStInterme = intCveStInterme;
    }

    public String getIntCveStInterme() {
        return this.intCveStInterme;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntBancoAl(BigDecimal intBancoAl) {
        this.intBancoAl = intBancoAl;
    }

    public BigDecimal getIntBancoAl() {
        return this.intBancoAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntBancoDel(BigDecimal intBancoDel) {
        this.intBancoDel = intBancoDel;
    }

    public BigDecimal getIntBancoDel() {
        return this.intBancoDel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntNomContacto(String intNomContacto) {
        this.intNomContacto = intNomContacto;
    }

    public String getIntNomContacto() {
        return this.intNomContacto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INTERMED ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIntEntidadFin() != null && this.getIntEntidadFin().longValue() == -999) {
            conditions += " AND INT_ENTIDAD_FIN IS NULL";
        } else if (this.getIntEntidadFin() != null) {
            conditions += " AND INT_ENTIDAD_FIN = ?";
            values.add(this.getIntEntidadFin());
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
        String sql = "SELECT * FROM INTERMED ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIntEntidadFin() != null && this.getIntEntidadFin().longValue() == -999) {
            conditions += " AND INT_ENTIDAD_FIN IS NULL";
        } else if (this.getIntEntidadFin() != null) {
            conditions += " AND INT_ENTIDAD_FIN = ?";
            values.add(this.getIntEntidadFin());
        }

        if (this.getIntIntermediario() != null && "null".equals(this.getIntIntermediario())) {
            conditions += " AND INT_INTERMEDIARIO IS NULL";
        } else if (this.getIntIntermediario() != null) {
            conditions += " AND INT_INTERMEDIARIO = ?";
            values.add(this.getIntIntermediario());
        }

        if (this.getIntRfc() != null && "null".equals(this.getIntRfc())) {
            conditions += " AND INT_RFC IS NULL";
        } else if (this.getIntRfc() != null) {
            conditions += " AND INT_RFC = ?";
            values.add(this.getIntRfc());
        }

        if (this.getIntCalleNum() != null && "null".equals(this.getIntCalleNum())) {
            conditions += " AND INT_CALLE_NUM IS NULL";
        } else if (this.getIntCalleNum() != null) {
            conditions += " AND INT_CALLE_NUM = ?";
            values.add(this.getIntCalleNum());
        }

        if (this.getIntNomColonia() != null && "null".equals(this.getIntNomColonia())) {
            conditions += " AND INT_NOM_COLONIA IS NULL";
        } else if (this.getIntNomColonia() != null) {
            conditions += " AND INT_NOM_COLONIA = ?";
            values.add(this.getIntNomColonia());
        }

        if (this.getIntNomPoblacion() != null && "null".equals(this.getIntNomPoblacion())) {
            conditions += " AND INT_NOM_POBLACION IS NULL";
        } else if (this.getIntNomPoblacion() != null) {
            conditions += " AND INT_NOM_POBLACION = ?";
            values.add(this.getIntNomPoblacion());
        }

        if (this.getIntCodigoPostal() != null && this.getIntCodigoPostal().longValue() == -999) {
            conditions += " AND INT_CODIGO_POSTAL IS NULL";
        } else if (this.getIntCodigoPostal() != null) {
            conditions += " AND INT_CODIGO_POSTAL = ?";
            values.add(this.getIntCodigoPostal());
        }

        if (this.getIntNumEstado() != null && this.getIntNumEstado().longValue() == -999) {
            conditions += " AND INT_NUM_ESTADO IS NULL";
        } else if (this.getIntNumEstado() != null) {
            conditions += " AND INT_NUM_ESTADO = ?";
            values.add(this.getIntNumEstado());
        }

        if (this.getIntNomEstado() != null && "null".equals(this.getIntNomEstado())) {
            conditions += " AND INT_NOM_ESTADO IS NULL";
        } else if (this.getIntNomEstado() != null) {
            conditions += " AND INT_NOM_ESTADO = ?";
            values.add(this.getIntNomEstado());
        }

        if (this.getIntNumPais() != null && this.getIntNumPais().longValue() == -999) {
            conditions += " AND INT_NUM_PAIS IS NULL";
        } else if (this.getIntNumPais() != null) {
            conditions += " AND INT_NUM_PAIS = ?";
            values.add(this.getIntNumPais());
        }

        if (this.getIntNomPais() != null && "null".equals(this.getIntNomPais())) {
            conditions += " AND INT_NOM_PAIS IS NULL";
        } else if (this.getIntNomPais() != null) {
            conditions += " AND INT_NOM_PAIS = ?";
            values.add(this.getIntNomPais());
        }

        if (this.getIntNumCveLada() != null && "null".equals(this.getIntNumCveLada())) {
            conditions += " AND INT_NUM_CVE_LADA IS NULL";
        } else if (this.getIntNumCveLada() != null) {
            conditions += " AND INT_NUM_CVE_LADA = ?";
            values.add(this.getIntNumCveLada());
        }

        if (this.getIntNumTelef() != null && "null".equals(this.getIntNumTelef())) {
            conditions += " AND INT_NUM_TELEF IS NULL";
        } else if (this.getIntNumTelef() != null) {
            conditions += " AND INT_NUM_TELEF = ?";
            values.add(this.getIntNumTelef());
        }

        if (this.getIntNumExt() != null && "null".equals(this.getIntNumExt())) {
            conditions += " AND INT_NUM_EXT IS NULL";
        } else if (this.getIntNumExt() != null) {
            conditions += " AND INT_NUM_EXT = ?";
            values.add(this.getIntNumExt());
        }

        if (this.getIntCveExtranjero() != null && this.getIntCveExtranjero().longValue() == -999) {
            conditions += " AND INT_CVE_EXTRANJERO IS NULL";
        } else if (this.getIntCveExtranjero() != null) {
            conditions += " AND INT_CVE_EXTRANJERO = ?";
            values.add(this.getIntCveExtranjero());
        }

        if (this.getIntNumPaisOrig() != null && this.getIntNumPaisOrig().longValue() == -999) {
            conditions += " AND INT_NUM_PAIS_ORIG IS NULL";
        } else if (this.getIntNumPaisOrig() != null) {
            conditions += " AND INT_NUM_PAIS_ORIG = ?";
            values.add(this.getIntNumPaisOrig());
        }

        if (this.getIntNomPaisOrig() != null && "null".equals(this.getIntNomPaisOrig())) {
            conditions += " AND INT_NOM_PAIS_ORIG IS NULL";
        } else if (this.getIntNomPaisOrig() != null) {
            conditions += " AND INT_NOM_PAIS_ORIG = ?";
            values.add(this.getIntNomPaisOrig());
        }

        if (this.getIntCveCheqCaja() != null && this.getIntCveCheqCaja().longValue() == -999) {
            conditions += " AND INT_CVE_CHEQ_CAJA IS NULL";
        } else if (this.getIntCveCheqCaja() != null) {
            conditions += " AND INT_CVE_CHEQ_CAJA = ?";
            values.add(this.getIntCveCheqCaja());
        }

        if (this.getIntCveTipCtaAl() != null && "null".equals(this.getIntCveTipCtaAl())) {
            conditions += " AND INT_CVE_TIP_CTA_AL IS NULL";
        } else if (this.getIntCveTipCtaAl() != null) {
            conditions += " AND INT_CVE_TIP_CTA_AL = ?";
            values.add(this.getIntCveTipCtaAl());
        }

        if (this.getIntSucursalAl() != null && this.getIntSucursalAl().longValue() == -999) {
            conditions += " AND INT_SUCURSAL_AL IS NULL";
        } else if (this.getIntSucursalAl() != null) {
            conditions += " AND INT_SUCURSAL_AL = ?";
            values.add(this.getIntSucursalAl());
        }

        if (this.getIntNumCuentaAl() != null && this.getIntNumCuentaAl().longValue() == -999) {
            conditions += " AND INT_NUM_CUENTA_AL IS NULL";
        } else if (this.getIntNumCuentaAl() != null) {
            conditions += " AND INT_NUM_CUENTA_AL = ?";
            values.add(this.getIntNumCuentaAl());
        }

        if (this.getIntCveCheque() != null && this.getIntCveCheque().longValue() == -999) {
            conditions += " AND INT_CVE_CHEQUE IS NULL";
        } else if (this.getIntCveCheque() != null) {
            conditions += " AND INT_CVE_CHEQUE = ?";
            values.add(this.getIntCveCheque());
        }

        if (this.getIntCveTipCtaDe() != null && "null".equals(this.getIntCveTipCtaDe())) {
            conditions += " AND INT_CVE_TIP_CTA_DE IS NULL";
        } else if (this.getIntCveTipCtaDe() != null) {
            conditions += " AND INT_CVE_TIP_CTA_DE = ?";
            values.add(this.getIntCveTipCtaDe());
        }

        if (this.getIntSucursalDel() != null && this.getIntSucursalDel().longValue() == -999) {
            conditions += " AND INT_SUCURSAL_DEL IS NULL";
        } else if (this.getIntSucursalDel() != null) {
            conditions += " AND INT_SUCURSAL_DEL = ?";
            values.add(this.getIntSucursalDel());
        }

        if (this.getIntNumCuentaDel() != null && this.getIntNumCuentaDel().longValue() == -999) {
            conditions += " AND INT_NUM_CUENTA_DEL IS NULL";
        } else if (this.getIntNumCuentaDel() != null) {
            conditions += " AND INT_NUM_CUENTA_DEL = ?";
            values.add(this.getIntNumCuentaDel());
        }

        if (this.getIntAnoAltaReg() != null && this.getIntAnoAltaReg().longValue() == -999) {
            conditions += " AND INT_ANO_ALTA_REG IS NULL";
        } else if (this.getIntAnoAltaReg() != null) {
            conditions += " AND INT_ANO_ALTA_REG = ?";
            values.add(this.getIntAnoAltaReg());
        }

        if (this.getIntMesAltaReg() != null && this.getIntMesAltaReg().longValue() == -999) {
            conditions += " AND INT_MES_ALTA_REG IS NULL";
        } else if (this.getIntMesAltaReg() != null) {
            conditions += " AND INT_MES_ALTA_REG = ?";
            values.add(this.getIntMesAltaReg());
        }

        if (this.getIntDiaAltaReg() != null && this.getIntDiaAltaReg().longValue() == -999) {
            conditions += " AND INT_DIA_ALTA_REG IS NULL";
        } else if (this.getIntDiaAltaReg() != null) {
            conditions += " AND INT_DIA_ALTA_REG = ?";
            values.add(this.getIntDiaAltaReg());
        }

        if (this.getIntAnoUltMod() != null && this.getIntAnoUltMod().longValue() == -999) {
            conditions += " AND INT_ANO_ULT_MOD IS NULL";
        } else if (this.getIntAnoUltMod() != null) {
            conditions += " AND INT_ANO_ULT_MOD = ?";
            values.add(this.getIntAnoUltMod());
        }

        if (this.getIntMesUltMod() != null && this.getIntMesUltMod().longValue() == -999) {
            conditions += " AND INT_MES_ULT_MOD IS NULL";
        } else if (this.getIntMesUltMod() != null) {
            conditions += " AND INT_MES_ULT_MOD = ?";
            values.add(this.getIntMesUltMod());
        }

        if (this.getIntDiaUltMod() != null && this.getIntDiaUltMod().longValue() == -999) {
            conditions += " AND INT_DIA_ULT_MOD IS NULL";
        } else if (this.getIntDiaUltMod() != null) {
            conditions += " AND INT_DIA_ULT_MOD = ?";
            values.add(this.getIntDiaUltMod());
        }

        if (this.getIntCveStInterme() != null && "null".equals(this.getIntCveStInterme())) {
            conditions += " AND INT_CVE_ST_INTERME IS NULL";
        } else if (this.getIntCveStInterme() != null) {
            conditions += " AND INT_CVE_ST_INTERME = ?";
            values.add(this.getIntCveStInterme());
        }

        if (this.getIntBancoAl() != null && this.getIntBancoAl().longValue() == -999) {
            conditions += " AND INT_BANCO_AL IS NULL";
        } else if (this.getIntBancoAl() != null) {
            conditions += " AND INT_BANCO_AL = ?";
            values.add(this.getIntBancoAl());
        }

        if (this.getIntBancoDel() != null && this.getIntBancoDel().longValue() == -999) {
            conditions += " AND INT_BANCO_DEL IS NULL";
        } else if (this.getIntBancoDel() != null) {
            conditions += " AND INT_BANCO_DEL = ?";
            values.add(this.getIntBancoDel());
        }

        if (this.getIntNomContacto() != null && "null".equals(this.getIntNomContacto())) {
            conditions += " AND INT_NOM_CONTACTO IS NULL";
        } else if (this.getIntNomContacto() != null) {
            conditions += " AND INT_NOM_CONTACTO = ?";
            values.add(this.getIntNomContacto());
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
        String sql = "UPDATE INTERMED SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INT_ENTIDAD_FIN = ?";
        pkValues.add(this.getIntEntidadFin());
        fields += " INT_INTERMEDIARIO = ?, ";
        values.add(this.getIntIntermediario());
        fields += " INT_RFC = ?, ";
        values.add(this.getIntRfc());
        fields += " INT_CALLE_NUM = ?, ";
        values.add(this.getIntCalleNum());
        fields += " INT_NOM_COLONIA = ?, ";
        values.add(this.getIntNomColonia());
        fields += " INT_NOM_POBLACION = ?, ";
        values.add(this.getIntNomPoblacion());
        fields += " INT_CODIGO_POSTAL = ?, ";
        values.add(this.getIntCodigoPostal());
        fields += " INT_NUM_ESTADO = ?, ";
        values.add(this.getIntNumEstado());
        fields += " INT_NOM_ESTADO = ?, ";
        values.add(this.getIntNomEstado());
        fields += " INT_NUM_PAIS = ?, ";
        values.add(this.getIntNumPais());
        fields += " INT_NOM_PAIS = ?, ";
        values.add(this.getIntNomPais());
        fields += " INT_NUM_CVE_LADA = ?, ";
        values.add(this.getIntNumCveLada());
        fields += " INT_NUM_TELEF = ?, ";
        values.add(this.getIntNumTelef());
        fields += " INT_NUM_EXT = ?, ";
        values.add(this.getIntNumExt());
        fields += " INT_CVE_EXTRANJERO = ?, ";
        values.add(this.getIntCveExtranjero());
        fields += " INT_NUM_PAIS_ORIG = ?, ";
        values.add(this.getIntNumPaisOrig());
        fields += " INT_NOM_PAIS_ORIG = ?, ";
        values.add(this.getIntNomPaisOrig());
        fields += " INT_CVE_CHEQ_CAJA = ?, ";
        values.add(this.getIntCveCheqCaja());
        fields += " INT_CVE_TIP_CTA_AL = ?, ";
        values.add(this.getIntCveTipCtaAl());
        fields += " INT_SUCURSAL_AL = ?, ";
        values.add(this.getIntSucursalAl());
        fields += " INT_NUM_CUENTA_AL = ?, ";
        values.add(this.getIntNumCuentaAl());
        fields += " INT_CVE_CHEQUE = ?, ";
        values.add(this.getIntCveCheque());
        fields += " INT_CVE_TIP_CTA_DE = ?, ";
        values.add(this.getIntCveTipCtaDe());
        fields += " INT_SUCURSAL_DEL = ?, ";
        values.add(this.getIntSucursalDel());
        fields += " INT_NUM_CUENTA_DEL = ?, ";
        values.add(this.getIntNumCuentaDel());
        fields += " INT_ANO_ALTA_REG = ?, ";
        values.add(this.getIntAnoAltaReg());
        fields += " INT_MES_ALTA_REG = ?, ";
        values.add(this.getIntMesAltaReg());
        fields += " INT_DIA_ALTA_REG = ?, ";
        values.add(this.getIntDiaAltaReg());
        fields += " INT_ANO_ULT_MOD = ?, ";
        values.add(this.getIntAnoUltMod());
        fields += " INT_MES_ULT_MOD = ?, ";
        values.add(this.getIntMesUltMod());
        fields += " INT_DIA_ULT_MOD = ?, ";
        values.add(this.getIntDiaUltMod());
        fields += " INT_CVE_ST_INTERME = ?, ";
        values.add(this.getIntCveStInterme());
        fields += " INT_BANCO_AL = ?, ";
        values.add(this.getIntBancoAl());
        fields += " INT_BANCO_DEL = ?, ";
        values.add(this.getIntBancoDel());
        fields += " INT_NOM_CONTACTO = ?, ";
        values.add(this.getIntNomContacto());
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
        String sql = "INSERT INTO INTERMED ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INT_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getIntEntidadFin());

        fields += ", INT_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getIntIntermediario());

        fields += ", INT_RFC";
        fieldValues += ", ?";
        values.add(this.getIntRfc());

        fields += ", INT_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getIntCalleNum());

        fields += ", INT_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getIntNomColonia());

        fields += ", INT_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getIntNomPoblacion());

        fields += ", INT_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getIntCodigoPostal());

        fields += ", INT_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getIntNumEstado());

        fields += ", INT_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getIntNomEstado());

        fields += ", INT_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getIntNumPais());

        fields += ", INT_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getIntNomPais());

        fields += ", INT_NUM_CVE_LADA";
        fieldValues += ", ?";
        values.add(this.getIntNumCveLada());

        fields += ", INT_NUM_TELEF";
        fieldValues += ", ?";
        values.add(this.getIntNumTelef());

        fields += ", INT_NUM_EXT";
        fieldValues += ", ?";
        values.add(this.getIntNumExt());

        fields += ", INT_CVE_EXTRANJERO";
        fieldValues += ", ?";
        values.add(this.getIntCveExtranjero());

        fields += ", INT_NUM_PAIS_ORIG";
        fieldValues += ", ?";
        values.add(this.getIntNumPaisOrig());

        fields += ", INT_NOM_PAIS_ORIG";
        fieldValues += ", ?";
        values.add(this.getIntNomPaisOrig());

        fields += ", INT_CVE_CHEQ_CAJA";
        fieldValues += ", ?";
        values.add(this.getIntCveCheqCaja());

        fields += ", INT_CVE_TIP_CTA_AL";
        fieldValues += ", ?";
        values.add(this.getIntCveTipCtaAl());

        fields += ", INT_SUCURSAL_AL";
        fieldValues += ", ?";
        values.add(this.getIntSucursalAl());

        fields += ", INT_NUM_CUENTA_AL";
        fieldValues += ", ?";
        values.add(this.getIntNumCuentaAl());

        fields += ", INT_CVE_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getIntCveCheque());

        fields += ", INT_CVE_TIP_CTA_DE";
        fieldValues += ", ?";
        values.add(this.getIntCveTipCtaDe());

        fields += ", INT_SUCURSAL_DEL";
        fieldValues += ", ?";
        values.add(this.getIntSucursalDel());

        fields += ", INT_NUM_CUENTA_DEL";
        fieldValues += ", ?";
        values.add(this.getIntNumCuentaDel());

        fields += ", INT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIntAnoAltaReg());

        fields += ", INT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIntMesAltaReg());

        fields += ", INT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIntDiaAltaReg());

        fields += ", INT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIntAnoUltMod());

        fields += ", INT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIntMesUltMod());

        fields += ", INT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIntDiaUltMod());

        fields += ", INT_CVE_ST_INTERME";
        fieldValues += ", ?";
        values.add(this.getIntCveStInterme());

        fields += ", INT_BANCO_AL";
        fieldValues += ", ?";
        values.add(this.getIntBancoAl());

        fields += ", INT_BANCO_DEL";
        fieldValues += ", ?";
        values.add(this.getIntBancoDel());

        fields += ", INT_NOM_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getIntNomContacto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INTERMED WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INT_ENTIDAD_FIN = ?";
        values.add(this.getIntEntidadFin());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Intermed instance = (Intermed) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIntEntidadFin().equals(instance.getIntEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getIntIntermediario().equals(instance.getIntIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getIntRfc().equals(instance.getIntRfc()))
            equalObjects = false;
        if (equalObjects && !this.getIntCalleNum().equals(instance.getIntCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getIntNomColonia().equals(instance.getIntNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getIntNomPoblacion().equals(instance.getIntNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getIntCodigoPostal().equals(instance.getIntCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumEstado().equals(instance.getIntNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getIntNomEstado().equals(instance.getIntNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumPais().equals(instance.getIntNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getIntNomPais().equals(instance.getIntNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumCveLada().equals(instance.getIntNumCveLada()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumTelef().equals(instance.getIntNumTelef()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumExt().equals(instance.getIntNumExt()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveExtranjero().equals(instance.getIntCveExtranjero()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumPaisOrig().equals(instance.getIntNumPaisOrig()))
            equalObjects = false;
        if (equalObjects && !this.getIntNomPaisOrig().equals(instance.getIntNomPaisOrig()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveCheqCaja().equals(instance.getIntCveCheqCaja()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveTipCtaAl().equals(instance.getIntCveTipCtaAl()))
            equalObjects = false;
        if (equalObjects && !this.getIntSucursalAl().equals(instance.getIntSucursalAl()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumCuentaAl().equals(instance.getIntNumCuentaAl()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveCheque().equals(instance.getIntCveCheque()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveTipCtaDe().equals(instance.getIntCveTipCtaDe()))
            equalObjects = false;
        if (equalObjects && !this.getIntSucursalDel().equals(instance.getIntSucursalDel()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumCuentaDel().equals(instance.getIntNumCuentaDel()))
            equalObjects = false;
        if (equalObjects && !this.getIntAnoAltaReg().equals(instance.getIntAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIntMesAltaReg().equals(instance.getIntMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIntDiaAltaReg().equals(instance.getIntDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIntAnoUltMod().equals(instance.getIntAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIntMesUltMod().equals(instance.getIntMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIntDiaUltMod().equals(instance.getIntDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIntCveStInterme().equals(instance.getIntCveStInterme()))
            equalObjects = false;
        if (equalObjects && !this.getIntBancoAl().equals(instance.getIntBancoAl()))
            equalObjects = false;
        if (equalObjects && !this.getIntBancoDel().equals(instance.getIntBancoDel()))
            equalObjects = false;
        if (equalObjects && !this.getIntNomContacto().equals(instance.getIntNomContacto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Intermed result = new Intermed();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIntEntidadFin((BigDecimal) objectData.getData("INT_ENTIDAD_FIN"));
        result.setIntIntermediario((String) objectData.getData("INT_INTERMEDIARIO"));
        result.setIntRfc((String) objectData.getData("INT_RFC"));
        result.setIntCalleNum((String) objectData.getData("INT_CALLE_NUM"));
        result.setIntNomColonia((String) objectData.getData("INT_NOM_COLONIA"));
        result.setIntNomPoblacion((String) objectData.getData("INT_NOM_POBLACION"));
        result.setIntCodigoPostal((BigDecimal) objectData.getData("INT_CODIGO_POSTAL"));
        result.setIntNumEstado((BigDecimal) objectData.getData("INT_NUM_ESTADO"));
        result.setIntNomEstado((String) objectData.getData("INT_NOM_ESTADO"));
        result.setIntNumPais((BigDecimal) objectData.getData("INT_NUM_PAIS"));
        result.setIntNomPais((String) objectData.getData("INT_NOM_PAIS"));
        result.setIntNumCveLada((String) objectData.getData("INT_NUM_CVE_LADA"));
        result.setIntNumTelef((String) objectData.getData("INT_NUM_TELEF"));
        result.setIntNumExt((String) objectData.getData("INT_NUM_EXT"));
        result.setIntCveExtranjero((BigDecimal) objectData.getData("INT_CVE_EXTRANJERO"));
        result.setIntNumPaisOrig((BigDecimal) objectData.getData("INT_NUM_PAIS_ORIG"));
        result.setIntNomPaisOrig((String) objectData.getData("INT_NOM_PAIS_ORIG"));
        result.setIntCveCheqCaja((BigDecimal) objectData.getData("INT_CVE_CHEQ_CAJA"));
        result.setIntCveTipCtaAl((String) objectData.getData("INT_CVE_TIP_CTA_AL"));
        result.setIntSucursalAl((BigDecimal) objectData.getData("INT_SUCURSAL_AL"));
        result.setIntNumCuentaAl((BigDecimal) objectData.getData("INT_NUM_CUENTA_AL"));
        result.setIntCveCheque((BigDecimal) objectData.getData("INT_CVE_CHEQUE"));
        result.setIntCveTipCtaDe((String) objectData.getData("INT_CVE_TIP_CTA_DE"));
        result.setIntSucursalDel((BigDecimal) objectData.getData("INT_SUCURSAL_DEL"));
        result.setIntNumCuentaDel((BigDecimal) objectData.getData("INT_NUM_CUENTA_DEL"));
        result.setIntAnoAltaReg((BigDecimal) objectData.getData("INT_ANO_ALTA_REG"));
        result.setIntMesAltaReg((BigDecimal) objectData.getData("INT_MES_ALTA_REG"));
        result.setIntDiaAltaReg((BigDecimal) objectData.getData("INT_DIA_ALTA_REG"));
        result.setIntAnoUltMod((BigDecimal) objectData.getData("INT_ANO_ULT_MOD"));
        result.setIntMesUltMod((BigDecimal) objectData.getData("INT_MES_ULT_MOD"));
        result.setIntDiaUltMod((BigDecimal) objectData.getData("INT_DIA_ULT_MOD"));
        result.setIntCveStInterme((String) objectData.getData("INT_CVE_ST_INTERME"));
        result.setIntBancoAl((BigDecimal) objectData.getData("INT_BANCO_AL"));
        result.setIntBancoDel((BigDecimal) objectData.getData("INT_BANCO_DEL"));
        result.setIntNomContacto((String) objectData.getData("INT_NOM_CONTACTO"));

        return result;

    }

}
