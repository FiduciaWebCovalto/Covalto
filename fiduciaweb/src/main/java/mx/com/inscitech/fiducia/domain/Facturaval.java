package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FACTURAVAL_PK", columns = { "FAC_OTPRINC", "FAC_SEC_FACTURA" }, sequences = { "MANUAL" })
public class Facturaval extends DomainObject {

    BigDecimal facSecFactura = null;
    BigDecimal facNumFactura = null;
    String facOtprinc = null;
    String facNombre = null;
    String facDomicilio = null;
    String facRfc = null;
    String facConcepto1 = null;
    BigDecimal facImpConcepto1 = null;
    BigDecimal facImpIva1 = null;
    BigDecimal facImpViatico = null;
    String facConcepto2 = null;
    BigDecimal facNumFacAnt = null;
    BigDecimal facNumMoneda = null;
    BigDecimal facFecAnoFac = null;
    BigDecimal facFecMesFac = null;
    BigDecimal facFecDiaFac = null;
    BigDecimal facAnoAltaReg = null;
    BigDecimal facMesAltaReg = null;
    BigDecimal facDiaAltaReg = null;
    BigDecimal facAnoUltMod = null;
    BigDecimal facMesUltMod = null;
    BigDecimal facDiaUltMod = null;
    String facStFactura = null;
    String facPerDel = null;
    String facPerAl = null;

    public Facturaval() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacSecFactura(BigDecimal facSecFactura) {
        this.facSecFactura = facSecFactura;
    }

    public BigDecimal getFacSecFactura() {
        return this.facSecFactura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumFactura(BigDecimal facNumFactura) {
        this.facNumFactura = facNumFactura;
    }

    public BigDecimal getFacNumFactura() {
        return this.facNumFactura;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacOtprinc(String facOtprinc) {
        this.facOtprinc = facOtprinc;
    }

    public String getFacOtprinc() {
        return this.facOtprinc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacNombre(String facNombre) {
        this.facNombre = facNombre;
    }

    public String getFacNombre() {
        return this.facNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacDomicilio(String facDomicilio) {
        this.facDomicilio = facDomicilio;
    }

    public String getFacDomicilio() {
        return this.facDomicilio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacRfc(String facRfc) {
        this.facRfc = facRfc;
    }

    public String getFacRfc() {
        return this.facRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacConcepto1(String facConcepto1) {
        this.facConcepto1 = facConcepto1;
    }

    public String getFacConcepto1() {
        return this.facConcepto1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImpConcepto1(BigDecimal facImpConcepto1) {
        this.facImpConcepto1 = facImpConcepto1;
    }

    public BigDecimal getFacImpConcepto1() {
        return this.facImpConcepto1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImpIva1(BigDecimal facImpIva1) {
        this.facImpIva1 = facImpIva1;
    }

    public BigDecimal getFacImpIva1() {
        return this.facImpIva1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImpViatico(BigDecimal facImpViatico) {
        this.facImpViatico = facImpViatico;
    }

    public BigDecimal getFacImpViatico() {
        return this.facImpViatico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacConcepto2(String facConcepto2) {
        this.facConcepto2 = facConcepto2;
    }

    public String getFacConcepto2() {
        return this.facConcepto2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumFacAnt(BigDecimal facNumFacAnt) {
        this.facNumFacAnt = facNumFacAnt;
    }

    public BigDecimal getFacNumFacAnt() {
        return this.facNumFacAnt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumMoneda(BigDecimal facNumMoneda) {
        this.facNumMoneda = facNumMoneda;
    }

    public BigDecimal getFacNumMoneda() {
        return this.facNumMoneda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFacFecAnoFac(BigDecimal facFecAnoFac) {
        this.facFecAnoFac = facFecAnoFac;
    }

    public BigDecimal getFacFecAnoFac() {
        return this.facFecAnoFac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacFecMesFac(BigDecimal facFecMesFac) {
        this.facFecMesFac = facFecMesFac;
    }

    public BigDecimal getFacFecMesFac() {
        return this.facFecMesFac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacFecDiaFac(BigDecimal facFecDiaFac) {
        this.facFecDiaFac = facFecDiaFac;
    }

    public BigDecimal getFacFecDiaFac() {
        return this.facFecDiaFac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFacAnoAltaReg(BigDecimal facAnoAltaReg) {
        this.facAnoAltaReg = facAnoAltaReg;
    }

    public BigDecimal getFacAnoAltaReg() {
        return this.facAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacMesAltaReg(BigDecimal facMesAltaReg) {
        this.facMesAltaReg = facMesAltaReg;
    }

    public BigDecimal getFacMesAltaReg() {
        return this.facMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacDiaAltaReg(BigDecimal facDiaAltaReg) {
        this.facDiaAltaReg = facDiaAltaReg;
    }

    public BigDecimal getFacDiaAltaReg() {
        return this.facDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFacAnoUltMod(BigDecimal facAnoUltMod) {
        this.facAnoUltMod = facAnoUltMod;
    }

    public BigDecimal getFacAnoUltMod() {
        return this.facAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacMesUltMod(BigDecimal facMesUltMod) {
        this.facMesUltMod = facMesUltMod;
    }

    public BigDecimal getFacMesUltMod() {
        return this.facMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacDiaUltMod(BigDecimal facDiaUltMod) {
        this.facDiaUltMod = facDiaUltMod;
    }

    public BigDecimal getFacDiaUltMod() {
        return this.facDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacStFactura(String facStFactura) {
        this.facStFactura = facStFactura;
    }

    public String getFacStFactura() {
        return this.facStFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacPerDel(String facPerDel) {
        this.facPerDel = facPerDel;
    }

    public String getFacPerDel() {
        return this.facPerDel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacPerAl(String facPerAl) {
        this.facPerAl = facPerAl;
    }

    public String getFacPerAl() {
        return this.facPerAl;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FACTURAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacSecFactura() != null && this.getFacSecFactura().longValue() == -999) {
            conditions += " AND FAC_SEC_FACTURA IS NULL";
        } else if (this.getFacSecFactura() != null) {
            conditions += " AND FAC_SEC_FACTURA = ?";
            values.add(this.getFacSecFactura());
        }

        if (this.getFacOtprinc() != null && "null".equals(this.getFacOtprinc())) {
            conditions += " AND FAC_OTPRINC IS NULL";
        } else if (this.getFacOtprinc() != null) {
            conditions += " AND FAC_OTPRINC = ?";
            values.add(this.getFacOtprinc());
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
        String sql = "SELECT * FROM FACTURAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacSecFactura() != null && this.getFacSecFactura().longValue() == -999) {
            conditions += " AND FAC_SEC_FACTURA IS NULL";
        } else if (this.getFacSecFactura() != null) {
            conditions += " AND FAC_SEC_FACTURA = ?";
            values.add(this.getFacSecFactura());
        }

        if (this.getFacNumFactura() != null && this.getFacNumFactura().longValue() == -999) {
            conditions += " AND FAC_NUM_FACTURA IS NULL";
        } else if (this.getFacNumFactura() != null) {
            conditions += " AND FAC_NUM_FACTURA = ?";
            values.add(this.getFacNumFactura());
        }

        if (this.getFacOtprinc() != null && "null".equals(this.getFacOtprinc())) {
            conditions += " AND FAC_OTPRINC IS NULL";
        } else if (this.getFacOtprinc() != null) {
            conditions += " AND FAC_OTPRINC = ?";
            values.add(this.getFacOtprinc());
        }

        if (this.getFacNombre() != null && "null".equals(this.getFacNombre())) {
            conditions += " AND FAC_NOMBRE IS NULL";
        } else if (this.getFacNombre() != null) {
            conditions += " AND FAC_NOMBRE = ?";
            values.add(this.getFacNombre());
        }

        if (this.getFacDomicilio() != null && "null".equals(this.getFacDomicilio())) {
            conditions += " AND FAC_DOMICILIO IS NULL";
        } else if (this.getFacDomicilio() != null) {
            conditions += " AND FAC_DOMICILIO = ?";
            values.add(this.getFacDomicilio());
        }

        if (this.getFacRfc() != null && "null".equals(this.getFacRfc())) {
            conditions += " AND FAC_RFC IS NULL";
        } else if (this.getFacRfc() != null) {
            conditions += " AND FAC_RFC = ?";
            values.add(this.getFacRfc());
        }

        if (this.getFacConcepto1() != null && "null".equals(this.getFacConcepto1())) {
            conditions += " AND FAC_CONCEPTO1 IS NULL";
        } else if (this.getFacConcepto1() != null) {
            conditions += " AND FAC_CONCEPTO1 = ?";
            values.add(this.getFacConcepto1());
        }

        if (this.getFacImpConcepto1() != null && this.getFacImpConcepto1().longValue() == -999) {
            conditions += " AND FAC_IMP_CONCEPTO1 IS NULL";
        } else if (this.getFacImpConcepto1() != null) {
            conditions += " AND FAC_IMP_CONCEPTO1 = ?";
            values.add(this.getFacImpConcepto1());
        }

        if (this.getFacImpIva1() != null && this.getFacImpIva1().longValue() == -999) {
            conditions += " AND FAC_IMP_IVA1 IS NULL";
        } else if (this.getFacImpIva1() != null) {
            conditions += " AND FAC_IMP_IVA1 = ?";
            values.add(this.getFacImpIva1());
        }

        if (this.getFacImpViatico() != null && this.getFacImpViatico().longValue() == -999) {
            conditions += " AND FAC_IMP_VIATICO IS NULL";
        } else if (this.getFacImpViatico() != null) {
            conditions += " AND FAC_IMP_VIATICO = ?";
            values.add(this.getFacImpViatico());
        }

        if (this.getFacConcepto2() != null && "null".equals(this.getFacConcepto2())) {
            conditions += " AND FAC_CONCEPTO2 IS NULL";
        } else if (this.getFacConcepto2() != null) {
            conditions += " AND FAC_CONCEPTO2 = ?";
            values.add(this.getFacConcepto2());
        }

        if (this.getFacNumFacAnt() != null && this.getFacNumFacAnt().longValue() == -999) {
            conditions += " AND FAC_NUM_FAC_ANT IS NULL";
        } else if (this.getFacNumFacAnt() != null) {
            conditions += " AND FAC_NUM_FAC_ANT = ?";
            values.add(this.getFacNumFacAnt());
        }

        if (this.getFacNumMoneda() != null && this.getFacNumMoneda().longValue() == -999) {
            conditions += " AND FAC_NUM_MONEDA IS NULL";
        } else if (this.getFacNumMoneda() != null) {
            conditions += " AND FAC_NUM_MONEDA = ?";
            values.add(this.getFacNumMoneda());
        }

        if (this.getFacFecAnoFac() != null && this.getFacFecAnoFac().longValue() == -999) {
            conditions += " AND FAC_FEC_ANO_FAC IS NULL";
        } else if (this.getFacFecAnoFac() != null) {
            conditions += " AND FAC_FEC_ANO_FAC = ?";
            values.add(this.getFacFecAnoFac());
        }

        if (this.getFacFecMesFac() != null && this.getFacFecMesFac().longValue() == -999) {
            conditions += " AND FAC_FEC_MES_FAC IS NULL";
        } else if (this.getFacFecMesFac() != null) {
            conditions += " AND FAC_FEC_MES_FAC = ?";
            values.add(this.getFacFecMesFac());
        }

        if (this.getFacFecDiaFac() != null && this.getFacFecDiaFac().longValue() == -999) {
            conditions += " AND FAC_FEC_DIA_FAC IS NULL";
        } else if (this.getFacFecDiaFac() != null) {
            conditions += " AND FAC_FEC_DIA_FAC = ?";
            values.add(this.getFacFecDiaFac());
        }

        if (this.getFacAnoAltaReg() != null && this.getFacAnoAltaReg().longValue() == -999) {
            conditions += " AND FAC_ANO_ALTA_REG IS NULL";
        } else if (this.getFacAnoAltaReg() != null) {
            conditions += " AND FAC_ANO_ALTA_REG = ?";
            values.add(this.getFacAnoAltaReg());
        }

        if (this.getFacMesAltaReg() != null && this.getFacMesAltaReg().longValue() == -999) {
            conditions += " AND FAC_MES_ALTA_REG IS NULL";
        } else if (this.getFacMesAltaReg() != null) {
            conditions += " AND FAC_MES_ALTA_REG = ?";
            values.add(this.getFacMesAltaReg());
        }

        if (this.getFacDiaAltaReg() != null && this.getFacDiaAltaReg().longValue() == -999) {
            conditions += " AND FAC_DIA_ALTA_REG IS NULL";
        } else if (this.getFacDiaAltaReg() != null) {
            conditions += " AND FAC_DIA_ALTA_REG = ?";
            values.add(this.getFacDiaAltaReg());
        }

        if (this.getFacAnoUltMod() != null && this.getFacAnoUltMod().longValue() == -999) {
            conditions += " AND FAC_ANO_ULT_MOD IS NULL";
        } else if (this.getFacAnoUltMod() != null) {
            conditions += " AND FAC_ANO_ULT_MOD = ?";
            values.add(this.getFacAnoUltMod());
        }

        if (this.getFacMesUltMod() != null && this.getFacMesUltMod().longValue() == -999) {
            conditions += " AND FAC_MES_ULT_MOD IS NULL";
        } else if (this.getFacMesUltMod() != null) {
            conditions += " AND FAC_MES_ULT_MOD = ?";
            values.add(this.getFacMesUltMod());
        }

        if (this.getFacDiaUltMod() != null && this.getFacDiaUltMod().longValue() == -999) {
            conditions += " AND FAC_DIA_ULT_MOD IS NULL";
        } else if (this.getFacDiaUltMod() != null) {
            conditions += " AND FAC_DIA_ULT_MOD = ?";
            values.add(this.getFacDiaUltMod());
        }

        if (this.getFacStFactura() != null && "null".equals(this.getFacStFactura())) {
            conditions += " AND FAC_ST_FACTURA IS NULL";
        } else if (this.getFacStFactura() != null) {
            conditions += " AND FAC_ST_FACTURA = ?";
            values.add(this.getFacStFactura());
        }

        if (this.getFacPerDel() != null && "null".equals(this.getFacPerDel())) {
            conditions += " AND FAC_PER_DEL IS NULL";
        } else if (this.getFacPerDel() != null) {
            conditions += " AND FAC_PER_DEL = ?";
            values.add(this.getFacPerDel());
        }

        if (this.getFacPerAl() != null && "null".equals(this.getFacPerAl())) {
            conditions += " AND FAC_PER_AL IS NULL";
        } else if (this.getFacPerAl() != null) {
            conditions += " AND FAC_PER_AL = ?";
            values.add(this.getFacPerAl());
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
        String sql = "UPDATE FACTURAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FAC_SEC_FACTURA = ?";
        pkValues.add(this.getFacSecFactura());
        fields += " FAC_NUM_FACTURA = ?, ";
        values.add(this.getFacNumFactura());
        conditions += " AND FAC_OTPRINC = ?";
        pkValues.add(this.getFacOtprinc());
        fields += " FAC_NOMBRE = ?, ";
        values.add(this.getFacNombre());
        fields += " FAC_DOMICILIO = ?, ";
        values.add(this.getFacDomicilio());
        fields += " FAC_RFC = ?, ";
        values.add(this.getFacRfc());
        fields += " FAC_CONCEPTO1 = ?, ";
        values.add(this.getFacConcepto1());
        fields += " FAC_IMP_CONCEPTO1 = ?, ";
        values.add(this.getFacImpConcepto1());
        fields += " FAC_IMP_IVA1 = ?, ";
        values.add(this.getFacImpIva1());
        fields += " FAC_IMP_VIATICO = ?, ";
        values.add(this.getFacImpViatico());
        fields += " FAC_CONCEPTO2 = ?, ";
        values.add(this.getFacConcepto2());
        fields += " FAC_NUM_FAC_ANT = ?, ";
        values.add(this.getFacNumFacAnt());
        fields += " FAC_NUM_MONEDA = ?, ";
        values.add(this.getFacNumMoneda());
        fields += " FAC_FEC_ANO_FAC = ?, ";
        values.add(this.getFacFecAnoFac());
        fields += " FAC_FEC_MES_FAC = ?, ";
        values.add(this.getFacFecMesFac());
        fields += " FAC_FEC_DIA_FAC = ?, ";
        values.add(this.getFacFecDiaFac());
        fields += " FAC_ANO_ALTA_REG = ?, ";
        values.add(this.getFacAnoAltaReg());
        fields += " FAC_MES_ALTA_REG = ?, ";
        values.add(this.getFacMesAltaReg());
        fields += " FAC_DIA_ALTA_REG = ?, ";
        values.add(this.getFacDiaAltaReg());
        fields += " FAC_ANO_ULT_MOD = ?, ";
        values.add(this.getFacAnoUltMod());
        fields += " FAC_MES_ULT_MOD = ?, ";
        values.add(this.getFacMesUltMod());
        fields += " FAC_DIA_ULT_MOD = ?, ";
        values.add(this.getFacDiaUltMod());
        fields += " FAC_ST_FACTURA = ?, ";
        values.add(this.getFacStFactura());
        fields += " FAC_PER_DEL = ?, ";
        values.add(this.getFacPerDel());
        fields += " FAC_PER_AL = ?, ";
        values.add(this.getFacPerAl());
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
        String sql = "INSERT INTO FACTURAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FAC_SEC_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacSecFactura());

        fields += ", FAC_NUM_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacNumFactura());

        fields += ", FAC_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getFacOtprinc());

        fields += ", FAC_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFacNombre());

        fields += ", FAC_DOMICILIO";
        fieldValues += ", ?";
        values.add(this.getFacDomicilio());

        fields += ", FAC_RFC";
        fieldValues += ", ?";
        values.add(this.getFacRfc());

        fields += ", FAC_CONCEPTO1";
        fieldValues += ", ?";
        values.add(this.getFacConcepto1());

        fields += ", FAC_IMP_CONCEPTO1";
        fieldValues += ", ?";
        values.add(this.getFacImpConcepto1());

        fields += ", FAC_IMP_IVA1";
        fieldValues += ", ?";
        values.add(this.getFacImpIva1());

        fields += ", FAC_IMP_VIATICO";
        fieldValues += ", ?";
        values.add(this.getFacImpViatico());

        fields += ", FAC_CONCEPTO2";
        fieldValues += ", ?";
        values.add(this.getFacConcepto2());

        fields += ", FAC_NUM_FAC_ANT";
        fieldValues += ", ?";
        values.add(this.getFacNumFacAnt());

        fields += ", FAC_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFacNumMoneda());

        fields += ", FAC_FEC_ANO_FAC";
        fieldValues += ", ?";
        values.add(this.getFacFecAnoFac());

        fields += ", FAC_FEC_MES_FAC";
        fieldValues += ", ?";
        values.add(this.getFacFecMesFac());

        fields += ", FAC_FEC_DIA_FAC";
        fieldValues += ", ?";
        values.add(this.getFacFecDiaFac());

        fields += ", FAC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFacAnoAltaReg());

        fields += ", FAC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFacMesAltaReg());

        fields += ", FAC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFacDiaAltaReg());

        fields += ", FAC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFacAnoUltMod());

        fields += ", FAC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFacMesUltMod());

        fields += ", FAC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFacDiaUltMod());

        fields += ", FAC_ST_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacStFactura());

        fields += ", FAC_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getFacPerDel());

        fields += ", FAC_PER_AL";
        fieldValues += ", ?";
        values.add(this.getFacPerAl());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FACTURAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FAC_SEC_FACTURA = ?";
        values.add(this.getFacSecFactura());
        conditions += " AND FAC_OTPRINC = ?";
        values.add(this.getFacOtprinc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Facturaval instance = (Facturaval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFacSecFactura().equals(instance.getFacSecFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumFactura().equals(instance.getFacNumFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacOtprinc().equals(instance.getFacOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getFacNombre().equals(instance.getFacNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFacDomicilio().equals(instance.getFacDomicilio()))
            equalObjects = false;
        if (equalObjects && !this.getFacRfc().equals(instance.getFacRfc()))
            equalObjects = false;
        if (equalObjects && !this.getFacConcepto1().equals(instance.getFacConcepto1()))
            equalObjects = false;
        if (equalObjects && !this.getFacImpConcepto1().equals(instance.getFacImpConcepto1()))
            equalObjects = false;
        if (equalObjects && !this.getFacImpIva1().equals(instance.getFacImpIva1()))
            equalObjects = false;
        if (equalObjects && !this.getFacImpViatico().equals(instance.getFacImpViatico()))
            equalObjects = false;
        if (equalObjects && !this.getFacConcepto2().equals(instance.getFacConcepto2()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumFacAnt().equals(instance.getFacNumFacAnt()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumMoneda().equals(instance.getFacNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFacFecAnoFac().equals(instance.getFacFecAnoFac()))
            equalObjects = false;
        if (equalObjects && !this.getFacFecMesFac().equals(instance.getFacFecMesFac()))
            equalObjects = false;
        if (equalObjects && !this.getFacFecDiaFac().equals(instance.getFacFecDiaFac()))
            equalObjects = false;
        if (equalObjects && !this.getFacAnoAltaReg().equals(instance.getFacAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFacMesAltaReg().equals(instance.getFacMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFacDiaAltaReg().equals(instance.getFacDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFacAnoUltMod().equals(instance.getFacAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFacMesUltMod().equals(instance.getFacMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFacDiaUltMod().equals(instance.getFacDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFacStFactura().equals(instance.getFacStFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacPerDel().equals(instance.getFacPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getFacPerAl().equals(instance.getFacPerAl()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Facturaval result = new Facturaval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFacSecFactura((BigDecimal) objectData.getData("FAC_SEC_FACTURA"));
        result.setFacNumFactura((BigDecimal) objectData.getData("FAC_NUM_FACTURA"));
        result.setFacOtprinc((String) objectData.getData("FAC_OTPRINC"));
        result.setFacNombre((String) objectData.getData("FAC_NOMBRE"));
        result.setFacDomicilio((String) objectData.getData("FAC_DOMICILIO"));
        result.setFacRfc((String) objectData.getData("FAC_RFC"));
        result.setFacConcepto1((String) objectData.getData("FAC_CONCEPTO1"));
        result.setFacImpConcepto1((BigDecimal) objectData.getData("FAC_IMP_CONCEPTO1"));
        result.setFacImpIva1((BigDecimal) objectData.getData("FAC_IMP_IVA1"));
        result.setFacImpViatico((BigDecimal) objectData.getData("FAC_IMP_VIATICO"));
        result.setFacConcepto2((String) objectData.getData("FAC_CONCEPTO2"));
        result.setFacNumFacAnt((BigDecimal) objectData.getData("FAC_NUM_FAC_ANT"));
        result.setFacNumMoneda((BigDecimal) objectData.getData("FAC_NUM_MONEDA"));
        result.setFacFecAnoFac((BigDecimal) objectData.getData("FAC_FEC_ANO_FAC"));
        result.setFacFecMesFac((BigDecimal) objectData.getData("FAC_FEC_MES_FAC"));
        result.setFacFecDiaFac((BigDecimal) objectData.getData("FAC_FEC_DIA_FAC"));
        result.setFacAnoAltaReg((BigDecimal) objectData.getData("FAC_ANO_ALTA_REG"));
        result.setFacMesAltaReg((BigDecimal) objectData.getData("FAC_MES_ALTA_REG"));
        result.setFacDiaAltaReg((BigDecimal) objectData.getData("FAC_DIA_ALTA_REG"));
        result.setFacAnoUltMod((BigDecimal) objectData.getData("FAC_ANO_ULT_MOD"));
        result.setFacMesUltMod((BigDecimal) objectData.getData("FAC_MES_ULT_MOD"));
        result.setFacDiaUltMod((BigDecimal) objectData.getData("FAC_DIA_ULT_MOD"));
        result.setFacStFactura((String) objectData.getData("FAC_ST_FACTURA"));
        result.setFacPerDel((String) objectData.getData("FAC_PER_DEL"));
        result.setFacPerAl((String) objectData.getData("FAC_PER_AL"));

        return result;

    }

}
