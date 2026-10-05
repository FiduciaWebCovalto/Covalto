package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONTINTEH_PK", columns = { "CPR_SUB_CONTRATO", "CPR_CONTRATO_INTER", "CPR_NUM_CONTRATO", "CPR_ENTIDAD_FIN" }, sequences = { "MANUAL" })
public class Continteh extends DomainObject {

    BigDecimal cprNumContrato = null;
    BigDecimal cprSubContrato = null;
    BigDecimal cprEntidadFin = null;
    BigDecimal cprContratoInter = null;
    String cprNomIntermed = null;
    String cprNomContacto1 = null;
    String cprNumCveLada1 = null;
    String cprNumTelef1 = null;
    String cprNumExt1 = null;
    String cprNomContacto2 = null;
    String cprNumCveLada2 = null;
    String cprNumTelef2 = null;
    String cprNumExt2 = null;
    String cprCveOrigRec = null;
    String cprCveFormaMan = null;
    String cprCveFormaLiq = null;
    String cprCveTipoCta = null;
    BigDecimal cprNumBanco = null;
    BigDecimal cprNumSucursal = null;
    BigDecimal cprNumCuenta = null;
    BigDecimal cprAnoApertura = null;
    BigDecimal cprMesApertura = null;
    BigDecimal cprDiaApertura = null;
    BigDecimal cprAnoVencim = null;
    BigDecimal cprMesVencim = null;
    BigDecimal cprDiaVencim = null;
    BigDecimal cprAnoCancela = null;
    BigDecimal cprMesCancela = null;
    BigDecimal cprDiaCancela = null;
    BigDecimal cprAnoAltaReg = null;
    BigDecimal cprMesAltaReg = null;
    BigDecimal cprDiaAltaReg = null;
    BigDecimal cprAnoUltMod = null;
    BigDecimal cprMesUltMod = null;
    BigDecimal cprDiaUltMod = null;
    String cprCveStContint = null;
    BigDecimal cprCveIsrExen = null;
    BigDecimal cprNumPais = null;

    public Continteh() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprNumContrato(BigDecimal cprNumContrato) {
        this.cprNumContrato = cprNumContrato;
    }

    public BigDecimal getCprNumContrato() {
        return this.cprNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprSubContrato(BigDecimal cprSubContrato) {
        this.cprSubContrato = cprSubContrato;
    }

    public BigDecimal getCprSubContrato() {
        return this.cprSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprEntidadFin(BigDecimal cprEntidadFin) {
        this.cprEntidadFin = cprEntidadFin;
    }

    public BigDecimal getCprEntidadFin() {
        return this.cprEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprContratoInter(BigDecimal cprContratoInter) {
        this.cprContratoInter = cprContratoInter;
    }

    public BigDecimal getCprContratoInter() {
        return this.cprContratoInter;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNomIntermed(String cprNomIntermed) {
        this.cprNomIntermed = cprNomIntermed;
    }

    public String getCprNomIntermed() {
        return this.cprNomIntermed;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNomContacto1(String cprNomContacto1) {
        this.cprNomContacto1 = cprNomContacto1;
    }

    public String getCprNomContacto1() {
        return this.cprNomContacto1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNumCveLada1(String cprNumCveLada1) {
        this.cprNumCveLada1 = cprNumCveLada1;
    }

    public String getCprNumCveLada1() {
        return this.cprNumCveLada1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNumTelef1(String cprNumTelef1) {
        this.cprNumTelef1 = cprNumTelef1;
    }

    public String getCprNumTelef1() {
        return this.cprNumTelef1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNumExt1(String cprNumExt1) {
        this.cprNumExt1 = cprNumExt1;
    }

    public String getCprNumExt1() {
        return this.cprNumExt1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNomContacto2(String cprNomContacto2) {
        this.cprNomContacto2 = cprNomContacto2;
    }

    public String getCprNomContacto2() {
        return this.cprNomContacto2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNumCveLada2(String cprNumCveLada2) {
        this.cprNumCveLada2 = cprNumCveLada2;
    }

    public String getCprNumCveLada2() {
        return this.cprNumCveLada2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNumTelef2(String cprNumTelef2) {
        this.cprNumTelef2 = cprNumTelef2;
    }

    public String getCprNumTelef2() {
        return this.cprNumTelef2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprNumExt2(String cprNumExt2) {
        this.cprNumExt2 = cprNumExt2;
    }

    public String getCprNumExt2() {
        return this.cprNumExt2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprCveOrigRec(String cprCveOrigRec) {
        this.cprCveOrigRec = cprCveOrigRec;
    }

    public String getCprCveOrigRec() {
        return this.cprCveOrigRec;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprCveFormaMan(String cprCveFormaMan) {
        this.cprCveFormaMan = cprCveFormaMan;
    }

    public String getCprCveFormaMan() {
        return this.cprCveFormaMan;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprCveFormaLiq(String cprCveFormaLiq) {
        this.cprCveFormaLiq = cprCveFormaLiq;
    }

    public String getCprCveFormaLiq() {
        return this.cprCveFormaLiq;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprCveTipoCta(String cprCveTipoCta) {
        this.cprCveTipoCta = cprCveTipoCta;
    }

    public String getCprCveTipoCta() {
        return this.cprCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprNumBanco(BigDecimal cprNumBanco) {
        this.cprNumBanco = cprNumBanco;
    }

    public BigDecimal getCprNumBanco() {
        return this.cprNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprNumSucursal(BigDecimal cprNumSucursal) {
        this.cprNumSucursal = cprNumSucursal;
    }

    public BigDecimal getCprNumSucursal() {
        return this.cprNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprNumCuenta(BigDecimal cprNumCuenta) {
        this.cprNumCuenta = cprNumCuenta;
    }

    public BigDecimal getCprNumCuenta() {
        return this.cprNumCuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCprAnoApertura(BigDecimal cprAnoApertura) {
        this.cprAnoApertura = cprAnoApertura;
    }

    public BigDecimal getCprAnoApertura() {
        return this.cprAnoApertura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprMesApertura(BigDecimal cprMesApertura) {
        this.cprMesApertura = cprMesApertura;
    }

    public BigDecimal getCprMesApertura() {
        return this.cprMesApertura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprDiaApertura(BigDecimal cprDiaApertura) {
        this.cprDiaApertura = cprDiaApertura;
    }

    public BigDecimal getCprDiaApertura() {
        return this.cprDiaApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCprAnoVencim(BigDecimal cprAnoVencim) {
        this.cprAnoVencim = cprAnoVencim;
    }

    public BigDecimal getCprAnoVencim() {
        return this.cprAnoVencim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprMesVencim(BigDecimal cprMesVencim) {
        this.cprMesVencim = cprMesVencim;
    }

    public BigDecimal getCprMesVencim() {
        return this.cprMesVencim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprDiaVencim(BigDecimal cprDiaVencim) {
        this.cprDiaVencim = cprDiaVencim;
    }

    public BigDecimal getCprDiaVencim() {
        return this.cprDiaVencim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCprAnoCancela(BigDecimal cprAnoCancela) {
        this.cprAnoCancela = cprAnoCancela;
    }

    public BigDecimal getCprAnoCancela() {
        return this.cprAnoCancela;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprMesCancela(BigDecimal cprMesCancela) {
        this.cprMesCancela = cprMesCancela;
    }

    public BigDecimal getCprMesCancela() {
        return this.cprMesCancela;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprDiaCancela(BigDecimal cprDiaCancela) {
        this.cprDiaCancela = cprDiaCancela;
    }

    public BigDecimal getCprDiaCancela() {
        return this.cprDiaCancela;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCprAnoAltaReg(BigDecimal cprAnoAltaReg) {
        this.cprAnoAltaReg = cprAnoAltaReg;
    }

    public BigDecimal getCprAnoAltaReg() {
        return this.cprAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprMesAltaReg(BigDecimal cprMesAltaReg) {
        this.cprMesAltaReg = cprMesAltaReg;
    }

    public BigDecimal getCprMesAltaReg() {
        return this.cprMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprDiaAltaReg(BigDecimal cprDiaAltaReg) {
        this.cprDiaAltaReg = cprDiaAltaReg;
    }

    public BigDecimal getCprDiaAltaReg() {
        return this.cprDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCprAnoUltMod(BigDecimal cprAnoUltMod) {
        this.cprAnoUltMod = cprAnoUltMod;
    }

    public BigDecimal getCprAnoUltMod() {
        return this.cprAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprMesUltMod(BigDecimal cprMesUltMod) {
        this.cprMesUltMod = cprMesUltMod;
    }

    public BigDecimal getCprMesUltMod() {
        return this.cprMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCprDiaUltMod(BigDecimal cprDiaUltMod) {
        this.cprDiaUltMod = cprDiaUltMod;
    }

    public BigDecimal getCprDiaUltMod() {
        return this.cprDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCprCveStContint(String cprCveStContint) {
        this.cprCveStContint = cprCveStContint;
    }

    public String getCprCveStContint() {
        return this.cprCveStContint;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprCveIsrExen(BigDecimal cprCveIsrExen) {
        this.cprCveIsrExen = cprCveIsrExen;
    }

    public BigDecimal getCprCveIsrExen() {
        return this.cprCveIsrExen;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCprNumPais(BigDecimal cprNumPais) {
        this.cprNumPais = cprNumPais;
    }

    public BigDecimal getCprNumPais() {
        return this.cprNumPais;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTINTEH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCprNumContrato() != null && this.getCprNumContrato().longValue() == -999) {
            conditions += " AND CPR_NUM_CONTRATO IS NULL";
        } else if (this.getCprNumContrato() != null) {
            conditions += " AND CPR_NUM_CONTRATO = ?";
            values.add(this.getCprNumContrato());
        }

        if (this.getCprSubContrato() != null && this.getCprSubContrato().longValue() == -999) {
            conditions += " AND CPR_SUB_CONTRATO IS NULL";
        } else if (this.getCprSubContrato() != null) {
            conditions += " AND CPR_SUB_CONTRATO = ?";
            values.add(this.getCprSubContrato());
        }

        if (this.getCprEntidadFin() != null && this.getCprEntidadFin().longValue() == -999) {
            conditions += " AND CPR_ENTIDAD_FIN IS NULL";
        } else if (this.getCprEntidadFin() != null) {
            conditions += " AND CPR_ENTIDAD_FIN = ?";
            values.add(this.getCprEntidadFin());
        }

        if (this.getCprContratoInter() != null && this.getCprContratoInter().longValue() == -999) {
            conditions += " AND CPR_CONTRATO_INTER IS NULL";
        } else if (this.getCprContratoInter() != null) {
            conditions += " AND CPR_CONTRATO_INTER = ?";
            values.add(this.getCprContratoInter());
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
        String sql = "SELECT * FROM CONTINTEH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCprNumContrato() != null && this.getCprNumContrato().longValue() == -999) {
            conditions += " AND CPR_NUM_CONTRATO IS NULL";
        } else if (this.getCprNumContrato() != null) {
            conditions += " AND CPR_NUM_CONTRATO = ?";
            values.add(this.getCprNumContrato());
        }

        if (this.getCprSubContrato() != null && this.getCprSubContrato().longValue() == -999) {
            conditions += " AND CPR_SUB_CONTRATO IS NULL";
        } else if (this.getCprSubContrato() != null) {
            conditions += " AND CPR_SUB_CONTRATO = ?";
            values.add(this.getCprSubContrato());
        }

        if (this.getCprEntidadFin() != null && this.getCprEntidadFin().longValue() == -999) {
            conditions += " AND CPR_ENTIDAD_FIN IS NULL";
        } else if (this.getCprEntidadFin() != null) {
            conditions += " AND CPR_ENTIDAD_FIN = ?";
            values.add(this.getCprEntidadFin());
        }

        if (this.getCprContratoInter() != null && this.getCprContratoInter().longValue() == -999) {
            conditions += " AND CPR_CONTRATO_INTER IS NULL";
        } else if (this.getCprContratoInter() != null) {
            conditions += " AND CPR_CONTRATO_INTER = ?";
            values.add(this.getCprContratoInter());
        }

        if (this.getCprNomIntermed() != null && "null".equals(this.getCprNomIntermed())) {
            conditions += " AND CPR_NOM_INTERMED IS NULL";
        } else if (this.getCprNomIntermed() != null) {
            conditions += " AND CPR_NOM_INTERMED = ?";
            values.add(this.getCprNomIntermed());
        }

        if (this.getCprNomContacto1() != null && "null".equals(this.getCprNomContacto1())) {
            conditions += " AND CPR_NOM_CONTACTO1 IS NULL";
        } else if (this.getCprNomContacto1() != null) {
            conditions += " AND CPR_NOM_CONTACTO1 = ?";
            values.add(this.getCprNomContacto1());
        }

        if (this.getCprNumCveLada1() != null && "null".equals(this.getCprNumCveLada1())) {
            conditions += " AND CPR_NUM_CVE_LADA1 IS NULL";
        } else if (this.getCprNumCveLada1() != null) {
            conditions += " AND CPR_NUM_CVE_LADA1 = ?";
            values.add(this.getCprNumCveLada1());
        }

        if (this.getCprNumTelef1() != null && "null".equals(this.getCprNumTelef1())) {
            conditions += " AND CPR_NUM_TELEF1 IS NULL";
        } else if (this.getCprNumTelef1() != null) {
            conditions += " AND CPR_NUM_TELEF1 = ?";
            values.add(this.getCprNumTelef1());
        }

        if (this.getCprNumExt1() != null && "null".equals(this.getCprNumExt1())) {
            conditions += " AND CPR_NUM_EXT1 IS NULL";
        } else if (this.getCprNumExt1() != null) {
            conditions += " AND CPR_NUM_EXT1 = ?";
            values.add(this.getCprNumExt1());
        }

        if (this.getCprNomContacto2() != null && "null".equals(this.getCprNomContacto2())) {
            conditions += " AND CPR_NOM_CONTACTO2 IS NULL";
        } else if (this.getCprNomContacto2() != null) {
            conditions += " AND CPR_NOM_CONTACTO2 = ?";
            values.add(this.getCprNomContacto2());
        }

        if (this.getCprNumCveLada2() != null && "null".equals(this.getCprNumCveLada2())) {
            conditions += " AND CPR_NUM_CVE_LADA2 IS NULL";
        } else if (this.getCprNumCveLada2() != null) {
            conditions += " AND CPR_NUM_CVE_LADA2 = ?";
            values.add(this.getCprNumCveLada2());
        }

        if (this.getCprNumTelef2() != null && "null".equals(this.getCprNumTelef2())) {
            conditions += " AND CPR_NUM_TELEF2 IS NULL";
        } else if (this.getCprNumTelef2() != null) {
            conditions += " AND CPR_NUM_TELEF2 = ?";
            values.add(this.getCprNumTelef2());
        }

        if (this.getCprNumExt2() != null && "null".equals(this.getCprNumExt2())) {
            conditions += " AND CPR_NUM_EXT2 IS NULL";
        } else if (this.getCprNumExt2() != null) {
            conditions += " AND CPR_NUM_EXT2 = ?";
            values.add(this.getCprNumExt2());
        }

        if (this.getCprCveOrigRec() != null && "null".equals(this.getCprCveOrigRec())) {
            conditions += " AND CPR_CVE_ORIG_REC IS NULL";
        } else if (this.getCprCveOrigRec() != null) {
            conditions += " AND CPR_CVE_ORIG_REC = ?";
            values.add(this.getCprCveOrigRec());
        }

        if (this.getCprCveFormaMan() != null && "null".equals(this.getCprCveFormaMan())) {
            conditions += " AND CPR_CVE_FORMA_MAN IS NULL";
        } else if (this.getCprCveFormaMan() != null) {
            conditions += " AND CPR_CVE_FORMA_MAN = ?";
            values.add(this.getCprCveFormaMan());
        }

        if (this.getCprCveFormaLiq() != null && "null".equals(this.getCprCveFormaLiq())) {
            conditions += " AND CPR_CVE_FORMA_LIQ IS NULL";
        } else if (this.getCprCveFormaLiq() != null) {
            conditions += " AND CPR_CVE_FORMA_LIQ = ?";
            values.add(this.getCprCveFormaLiq());
        }

        if (this.getCprCveTipoCta() != null && "null".equals(this.getCprCveTipoCta())) {
            conditions += " AND CPR_CVE_TIPO_CTA IS NULL";
        } else if (this.getCprCveTipoCta() != null) {
            conditions += " AND CPR_CVE_TIPO_CTA = ?";
            values.add(this.getCprCveTipoCta());
        }

        if (this.getCprNumBanco() != null && this.getCprNumBanco().longValue() == -999) {
            conditions += " AND CPR_NUM_BANCO IS NULL";
        } else if (this.getCprNumBanco() != null) {
            conditions += " AND CPR_NUM_BANCO = ?";
            values.add(this.getCprNumBanco());
        }

        if (this.getCprNumSucursal() != null && this.getCprNumSucursal().longValue() == -999) {
            conditions += " AND CPR_NUM_SUCURSAL IS NULL";
        } else if (this.getCprNumSucursal() != null) {
            conditions += " AND CPR_NUM_SUCURSAL = ?";
            values.add(this.getCprNumSucursal());
        }

        if (this.getCprNumCuenta() != null && this.getCprNumCuenta().longValue() == -999) {
            conditions += " AND CPR_NUM_CUENTA IS NULL";
        } else if (this.getCprNumCuenta() != null) {
            conditions += " AND CPR_NUM_CUENTA = ?";
            values.add(this.getCprNumCuenta());
        }

        if (this.getCprAnoApertura() != null && this.getCprAnoApertura().longValue() == -999) {
            conditions += " AND CPR_ANO_APERTURA IS NULL";
        } else if (this.getCprAnoApertura() != null) {
            conditions += " AND CPR_ANO_APERTURA = ?";
            values.add(this.getCprAnoApertura());
        }

        if (this.getCprMesApertura() != null && this.getCprMesApertura().longValue() == -999) {
            conditions += " AND CPR_MES_APERTURA IS NULL";
        } else if (this.getCprMesApertura() != null) {
            conditions += " AND CPR_MES_APERTURA = ?";
            values.add(this.getCprMesApertura());
        }

        if (this.getCprDiaApertura() != null && this.getCprDiaApertura().longValue() == -999) {
            conditions += " AND CPR_DIA_APERTURA IS NULL";
        } else if (this.getCprDiaApertura() != null) {
            conditions += " AND CPR_DIA_APERTURA = ?";
            values.add(this.getCprDiaApertura());
        }

        if (this.getCprAnoVencim() != null && this.getCprAnoVencim().longValue() == -999) {
            conditions += " AND CPR_ANO_VENCIM IS NULL";
        } else if (this.getCprAnoVencim() != null) {
            conditions += " AND CPR_ANO_VENCIM = ?";
            values.add(this.getCprAnoVencim());
        }

        if (this.getCprMesVencim() != null && this.getCprMesVencim().longValue() == -999) {
            conditions += " AND CPR_MES_VENCIM IS NULL";
        } else if (this.getCprMesVencim() != null) {
            conditions += " AND CPR_MES_VENCIM = ?";
            values.add(this.getCprMesVencim());
        }

        if (this.getCprDiaVencim() != null && this.getCprDiaVencim().longValue() == -999) {
            conditions += " AND CPR_DIA_VENCIM IS NULL";
        } else if (this.getCprDiaVencim() != null) {
            conditions += " AND CPR_DIA_VENCIM = ?";
            values.add(this.getCprDiaVencim());
        }

        if (this.getCprAnoCancela() != null && this.getCprAnoCancela().longValue() == -999) {
            conditions += " AND CPR_ANO_CANCELA IS NULL";
        } else if (this.getCprAnoCancela() != null) {
            conditions += " AND CPR_ANO_CANCELA = ?";
            values.add(this.getCprAnoCancela());
        }

        if (this.getCprMesCancela() != null && this.getCprMesCancela().longValue() == -999) {
            conditions += " AND CPR_MES_CANCELA IS NULL";
        } else if (this.getCprMesCancela() != null) {
            conditions += " AND CPR_MES_CANCELA = ?";
            values.add(this.getCprMesCancela());
        }

        if (this.getCprDiaCancela() != null && this.getCprDiaCancela().longValue() == -999) {
            conditions += " AND CPR_DIA_CANCELA IS NULL";
        } else if (this.getCprDiaCancela() != null) {
            conditions += " AND CPR_DIA_CANCELA = ?";
            values.add(this.getCprDiaCancela());
        }

        if (this.getCprAnoAltaReg() != null && this.getCprAnoAltaReg().longValue() == -999) {
            conditions += " AND CPR_ANO_ALTA_REG IS NULL";
        } else if (this.getCprAnoAltaReg() != null) {
            conditions += " AND CPR_ANO_ALTA_REG = ?";
            values.add(this.getCprAnoAltaReg());
        }

        if (this.getCprMesAltaReg() != null && this.getCprMesAltaReg().longValue() == -999) {
            conditions += " AND CPR_MES_ALTA_REG IS NULL";
        } else if (this.getCprMesAltaReg() != null) {
            conditions += " AND CPR_MES_ALTA_REG = ?";
            values.add(this.getCprMesAltaReg());
        }

        if (this.getCprDiaAltaReg() != null && this.getCprDiaAltaReg().longValue() == -999) {
            conditions += " AND CPR_DIA_ALTA_REG IS NULL";
        } else if (this.getCprDiaAltaReg() != null) {
            conditions += " AND CPR_DIA_ALTA_REG = ?";
            values.add(this.getCprDiaAltaReg());
        }

        if (this.getCprAnoUltMod() != null && this.getCprAnoUltMod().longValue() == -999) {
            conditions += " AND CPR_ANO_ULT_MOD IS NULL";
        } else if (this.getCprAnoUltMod() != null) {
            conditions += " AND CPR_ANO_ULT_MOD = ?";
            values.add(this.getCprAnoUltMod());
        }

        if (this.getCprMesUltMod() != null && this.getCprMesUltMod().longValue() == -999) {
            conditions += " AND CPR_MES_ULT_MOD IS NULL";
        } else if (this.getCprMesUltMod() != null) {
            conditions += " AND CPR_MES_ULT_MOD = ?";
            values.add(this.getCprMesUltMod());
        }

        if (this.getCprDiaUltMod() != null && this.getCprDiaUltMod().longValue() == -999) {
            conditions += " AND CPR_DIA_ULT_MOD IS NULL";
        } else if (this.getCprDiaUltMod() != null) {
            conditions += " AND CPR_DIA_ULT_MOD = ?";
            values.add(this.getCprDiaUltMod());
        }

        if (this.getCprCveStContint() != null && "null".equals(this.getCprCveStContint())) {
            conditions += " AND CPR_CVE_ST_CONTINT IS NULL";
        } else if (this.getCprCveStContint() != null) {
            conditions += " AND CPR_CVE_ST_CONTINT = ?";
            values.add(this.getCprCveStContint());
        }

        if (this.getCprCveIsrExen() != null && this.getCprCveIsrExen().longValue() == -999) {
            conditions += " AND CPR_CVE_ISR_EXEN IS NULL";
        } else if (this.getCprCveIsrExen() != null) {
            conditions += " AND CPR_CVE_ISR_EXEN = ?";
            values.add(this.getCprCveIsrExen());
        }

        if (this.getCprNumPais() != null && this.getCprNumPais().longValue() == -999) {
            conditions += " AND CPR_NUM_PAIS IS NULL";
        } else if (this.getCprNumPais() != null) {
            conditions += " AND CPR_NUM_PAIS = ?";
            values.add(this.getCprNumPais());
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
        String sql = "UPDATE CONTINTEH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPR_NUM_CONTRATO = ?";
        pkValues.add(this.getCprNumContrato());
        conditions += " AND CPR_SUB_CONTRATO = ?";
        pkValues.add(this.getCprSubContrato());
        conditions += " AND CPR_ENTIDAD_FIN = ?";
        pkValues.add(this.getCprEntidadFin());
        conditions += " AND CPR_CONTRATO_INTER = ?";
        pkValues.add(this.getCprContratoInter());
        fields += " CPR_NOM_INTERMED = ?, ";
        values.add(this.getCprNomIntermed());
        fields += " CPR_NOM_CONTACTO1 = ?, ";
        values.add(this.getCprNomContacto1());
        fields += " CPR_NUM_CVE_LADA1 = ?, ";
        values.add(this.getCprNumCveLada1());
        fields += " CPR_NUM_TELEF1 = ?, ";
        values.add(this.getCprNumTelef1());
        fields += " CPR_NUM_EXT1 = ?, ";
        values.add(this.getCprNumExt1());
        fields += " CPR_NOM_CONTACTO2 = ?, ";
        values.add(this.getCprNomContacto2());
        fields += " CPR_NUM_CVE_LADA2 = ?, ";
        values.add(this.getCprNumCveLada2());
        fields += " CPR_NUM_TELEF2 = ?, ";
        values.add(this.getCprNumTelef2());
        fields += " CPR_NUM_EXT2 = ?, ";
        values.add(this.getCprNumExt2());
        fields += " CPR_CVE_ORIG_REC = ?, ";
        values.add(this.getCprCveOrigRec());
        fields += " CPR_CVE_FORMA_MAN = ?, ";
        values.add(this.getCprCveFormaMan());
        fields += " CPR_CVE_FORMA_LIQ = ?, ";
        values.add(this.getCprCveFormaLiq());
        fields += " CPR_CVE_TIPO_CTA = ?, ";
        values.add(this.getCprCveTipoCta());
        fields += " CPR_NUM_BANCO = ?, ";
        values.add(this.getCprNumBanco());
        fields += " CPR_NUM_SUCURSAL = ?, ";
        values.add(this.getCprNumSucursal());
        fields += " CPR_NUM_CUENTA = ?, ";
        values.add(this.getCprNumCuenta());
        fields += " CPR_ANO_APERTURA = ?, ";
        values.add(this.getCprAnoApertura());
        fields += " CPR_MES_APERTURA = ?, ";
        values.add(this.getCprMesApertura());
        fields += " CPR_DIA_APERTURA = ?, ";
        values.add(this.getCprDiaApertura());
        fields += " CPR_ANO_VENCIM = ?, ";
        values.add(this.getCprAnoVencim());
        fields += " CPR_MES_VENCIM = ?, ";
        values.add(this.getCprMesVencim());
        fields += " CPR_DIA_VENCIM = ?, ";
        values.add(this.getCprDiaVencim());
        fields += " CPR_ANO_CANCELA = ?, ";
        values.add(this.getCprAnoCancela());
        fields += " CPR_MES_CANCELA = ?, ";
        values.add(this.getCprMesCancela());
        fields += " CPR_DIA_CANCELA = ?, ";
        values.add(this.getCprDiaCancela());
        fields += " CPR_ANO_ALTA_REG = ?, ";
        values.add(this.getCprAnoAltaReg());
        fields += " CPR_MES_ALTA_REG = ?, ";
        values.add(this.getCprMesAltaReg());
        fields += " CPR_DIA_ALTA_REG = ?, ";
        values.add(this.getCprDiaAltaReg());
        fields += " CPR_ANO_ULT_MOD = ?, ";
        values.add(this.getCprAnoUltMod());
        fields += " CPR_MES_ULT_MOD = ?, ";
        values.add(this.getCprMesUltMod());
        fields += " CPR_DIA_ULT_MOD = ?, ";
        values.add(this.getCprDiaUltMod());
        fields += " CPR_CVE_ST_CONTINT = ?, ";
        values.add(this.getCprCveStContint());
        fields += " CPR_CVE_ISR_EXEN = ?, ";
        values.add(this.getCprCveIsrExen());
        fields += " CPR_NUM_PAIS = ?, ";
        values.add(this.getCprNumPais());
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
        String sql = "INSERT INTO CONTINTEH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCprNumContrato());

        fields += ", CPR_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCprSubContrato());

        fields += ", CPR_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCprEntidadFin());

        fields += ", CPR_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getCprContratoInter());

        fields += ", CPR_NOM_INTERMED";
        fieldValues += ", ?";
        values.add(this.getCprNomIntermed());

        fields += ", CPR_NOM_CONTACTO1";
        fieldValues += ", ?";
        values.add(this.getCprNomContacto1());

        fields += ", CPR_NUM_CVE_LADA1";
        fieldValues += ", ?";
        values.add(this.getCprNumCveLada1());

        fields += ", CPR_NUM_TELEF1";
        fieldValues += ", ?";
        values.add(this.getCprNumTelef1());

        fields += ", CPR_NUM_EXT1";
        fieldValues += ", ?";
        values.add(this.getCprNumExt1());

        fields += ", CPR_NOM_CONTACTO2";
        fieldValues += ", ?";
        values.add(this.getCprNomContacto2());

        fields += ", CPR_NUM_CVE_LADA2";
        fieldValues += ", ?";
        values.add(this.getCprNumCveLada2());

        fields += ", CPR_NUM_TELEF2";
        fieldValues += ", ?";
        values.add(this.getCprNumTelef2());

        fields += ", CPR_NUM_EXT2";
        fieldValues += ", ?";
        values.add(this.getCprNumExt2());

        fields += ", CPR_CVE_ORIG_REC";
        fieldValues += ", ?";
        values.add(this.getCprCveOrigRec());

        fields += ", CPR_CVE_FORMA_MAN";
        fieldValues += ", ?";
        values.add(this.getCprCveFormaMan());

        fields += ", CPR_CVE_FORMA_LIQ";
        fieldValues += ", ?";
        values.add(this.getCprCveFormaLiq());

        fields += ", CPR_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getCprCveTipoCta());

        fields += ", CPR_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getCprNumBanco());

        fields += ", CPR_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getCprNumSucursal());

        fields += ", CPR_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCprNumCuenta());

        fields += ", CPR_ANO_APERTURA";
        fieldValues += ", ?";
        values.add(this.getCprAnoApertura());

        fields += ", CPR_MES_APERTURA";
        fieldValues += ", ?";
        values.add(this.getCprMesApertura());

        fields += ", CPR_DIA_APERTURA";
        fieldValues += ", ?";
        values.add(this.getCprDiaApertura());

        fields += ", CPR_ANO_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCprAnoVencim());

        fields += ", CPR_MES_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCprMesVencim());

        fields += ", CPR_DIA_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCprDiaVencim());

        fields += ", CPR_ANO_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCprAnoCancela());

        fields += ", CPR_MES_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCprMesCancela());

        fields += ", CPR_DIA_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCprDiaCancela());

        fields += ", CPR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCprAnoAltaReg());

        fields += ", CPR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCprMesAltaReg());

        fields += ", CPR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCprDiaAltaReg());

        fields += ", CPR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCprAnoUltMod());

        fields += ", CPR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCprMesUltMod());

        fields += ", CPR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCprDiaUltMod());

        fields += ", CPR_CVE_ST_CONTINT";
        fieldValues += ", ?";
        values.add(this.getCprCveStContint());

        fields += ", CPR_CVE_ISR_EXEN";
        fieldValues += ", ?";
        values.add(this.getCprCveIsrExen());

        fields += ", CPR_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getCprNumPais());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONTINTEH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPR_NUM_CONTRATO = ?";
        values.add(this.getCprNumContrato());
        conditions += " AND CPR_SUB_CONTRATO = ?";
        values.add(this.getCprSubContrato());
        conditions += " AND CPR_ENTIDAD_FIN = ?";
        values.add(this.getCprEntidadFin());
        conditions += " AND CPR_CONTRATO_INTER = ?";
        values.add(this.getCprContratoInter());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Continteh instance = (Continteh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCprNumContrato().equals(instance.getCprNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCprSubContrato().equals(instance.getCprSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCprEntidadFin().equals(instance.getCprEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCprContratoInter().equals(instance.getCprContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getCprNomIntermed().equals(instance.getCprNomIntermed()))
            equalObjects = false;
        if (equalObjects && !this.getCprNomContacto1().equals(instance.getCprNomContacto1()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumCveLada1().equals(instance.getCprNumCveLada1()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumTelef1().equals(instance.getCprNumTelef1()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumExt1().equals(instance.getCprNumExt1()))
            equalObjects = false;
        if (equalObjects && !this.getCprNomContacto2().equals(instance.getCprNomContacto2()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumCveLada2().equals(instance.getCprNumCveLada2()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumTelef2().equals(instance.getCprNumTelef2()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumExt2().equals(instance.getCprNumExt2()))
            equalObjects = false;
        if (equalObjects && !this.getCprCveOrigRec().equals(instance.getCprCveOrigRec()))
            equalObjects = false;
        if (equalObjects && !this.getCprCveFormaMan().equals(instance.getCprCveFormaMan()))
            equalObjects = false;
        if (equalObjects && !this.getCprCveFormaLiq().equals(instance.getCprCveFormaLiq()))
            equalObjects = false;
        if (equalObjects && !this.getCprCveTipoCta().equals(instance.getCprCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumBanco().equals(instance.getCprNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumSucursal().equals(instance.getCprNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumCuenta().equals(instance.getCprNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getCprAnoApertura().equals(instance.getCprAnoApertura()))
            equalObjects = false;
        if (equalObjects && !this.getCprMesApertura().equals(instance.getCprMesApertura()))
            equalObjects = false;
        if (equalObjects && !this.getCprDiaApertura().equals(instance.getCprDiaApertura()))
            equalObjects = false;
        if (equalObjects && !this.getCprAnoVencim().equals(instance.getCprAnoVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCprMesVencim().equals(instance.getCprMesVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCprDiaVencim().equals(instance.getCprDiaVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCprAnoCancela().equals(instance.getCprAnoCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCprMesCancela().equals(instance.getCprMesCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCprDiaCancela().equals(instance.getCprDiaCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCprAnoAltaReg().equals(instance.getCprAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCprMesAltaReg().equals(instance.getCprMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCprDiaAltaReg().equals(instance.getCprDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCprAnoUltMod().equals(instance.getCprAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCprMesUltMod().equals(instance.getCprMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCprDiaUltMod().equals(instance.getCprDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCprCveStContint().equals(instance.getCprCveStContint()))
            equalObjects = false;
        if (equalObjects && !this.getCprCveIsrExen().equals(instance.getCprCveIsrExen()))
            equalObjects = false;
        if (equalObjects && !this.getCprNumPais().equals(instance.getCprNumPais()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Continteh result = new Continteh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCprNumContrato((BigDecimal) objectData.getData("CPR_NUM_CONTRATO"));
        result.setCprSubContrato((BigDecimal) objectData.getData("CPR_SUB_CONTRATO"));
        result.setCprEntidadFin((BigDecimal) objectData.getData("CPR_ENTIDAD_FIN"));
        result.setCprContratoInter((BigDecimal) objectData.getData("CPR_CONTRATO_INTER"));
        result.setCprNomIntermed((String) objectData.getData("CPR_NOM_INTERMED"));
        result.setCprNomContacto1((String) objectData.getData("CPR_NOM_CONTACTO1"));
        result.setCprNumCveLada1((String) objectData.getData("CPR_NUM_CVE_LADA1"));
        result.setCprNumTelef1((String) objectData.getData("CPR_NUM_TELEF1"));
        result.setCprNumExt1((String) objectData.getData("CPR_NUM_EXT1"));
        result.setCprNomContacto2((String) objectData.getData("CPR_NOM_CONTACTO2"));
        result.setCprNumCveLada2((String) objectData.getData("CPR_NUM_CVE_LADA2"));
        result.setCprNumTelef2((String) objectData.getData("CPR_NUM_TELEF2"));
        result.setCprNumExt2((String) objectData.getData("CPR_NUM_EXT2"));
        result.setCprCveOrigRec((String) objectData.getData("CPR_CVE_ORIG_REC"));
        result.setCprCveFormaMan((String) objectData.getData("CPR_CVE_FORMA_MAN"));
        result.setCprCveFormaLiq((String) objectData.getData("CPR_CVE_FORMA_LIQ"));
        result.setCprCveTipoCta((String) objectData.getData("CPR_CVE_TIPO_CTA"));
        result.setCprNumBanco((BigDecimal) objectData.getData("CPR_NUM_BANCO"));
        result.setCprNumSucursal((BigDecimal) objectData.getData("CPR_NUM_SUCURSAL"));
        result.setCprNumCuenta((BigDecimal) objectData.getData("CPR_NUM_CUENTA"));
        result.setCprAnoApertura((BigDecimal) objectData.getData("CPR_ANO_APERTURA"));
        result.setCprMesApertura((BigDecimal) objectData.getData("CPR_MES_APERTURA"));
        result.setCprDiaApertura((BigDecimal) objectData.getData("CPR_DIA_APERTURA"));
        result.setCprAnoVencim((BigDecimal) objectData.getData("CPR_ANO_VENCIM"));
        result.setCprMesVencim((BigDecimal) objectData.getData("CPR_MES_VENCIM"));
        result.setCprDiaVencim((BigDecimal) objectData.getData("CPR_DIA_VENCIM"));
        result.setCprAnoCancela((BigDecimal) objectData.getData("CPR_ANO_CANCELA"));
        result.setCprMesCancela((BigDecimal) objectData.getData("CPR_MES_CANCELA"));
        result.setCprDiaCancela((BigDecimal) objectData.getData("CPR_DIA_CANCELA"));
        result.setCprAnoAltaReg((BigDecimal) objectData.getData("CPR_ANO_ALTA_REG"));
        result.setCprMesAltaReg((BigDecimal) objectData.getData("CPR_MES_ALTA_REG"));
        result.setCprDiaAltaReg((BigDecimal) objectData.getData("CPR_DIA_ALTA_REG"));
        result.setCprAnoUltMod((BigDecimal) objectData.getData("CPR_ANO_ULT_MOD"));
        result.setCprMesUltMod((BigDecimal) objectData.getData("CPR_MES_ULT_MOD"));
        result.setCprDiaUltMod((BigDecimal) objectData.getData("CPR_DIA_ULT_MOD"));
        result.setCprCveStContint((String) objectData.getData("CPR_CVE_ST_CONTINT"));
        result.setCprCveIsrExen((BigDecimal) objectData.getData("CPR_CVE_ISR_EXEN"));
        result.setCprNumPais((BigDecimal) objectData.getData("CPR_NUM_PAIS"));

        return result;

    }

}
