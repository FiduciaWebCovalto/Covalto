package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Preciosmh extends DomainObject {

    BigDecimal preCveTipoMerca = null;
    BigDecimal preNumInstrume = null;
    BigDecimal preNumSecEmis = null;
    BigDecimal preAnoPrecEmis = null;
    BigDecimal preMesPrecEmis = null;
    BigDecimal preDiaPrecEmis = null;
    String preNomPizarra = null;
    String preSerEmis = null;
    BigDecimal preNumCuponVig = null;
    BigDecimal preNumVolOpDia = null;
    BigDecimal prePrecioMaximo = null;
    BigDecimal prePrecioMinimo = null;
    BigDecimal prePrecioCierre = null;
    BigDecimal preTasaAnual = null;
    BigDecimal preAnoAltaReg = null;
    BigDecimal preMesAltaReg = null;
    BigDecimal preDiaAltaReg = null;
    BigDecimal preAnoUltMod = null;
    BigDecimal preMesUltMod = null;
    BigDecimal preDiaUltMod = null;
    BigDecimal preHrUltMod = null;
    BigDecimal preMinUltMod = null;
    String preCveStPrecio = null;

    public Preciosmh() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPreCveTipoMerca(BigDecimal preCveTipoMerca) {
        this.preCveTipoMerca = preCveTipoMerca;
    }

    public BigDecimal getPreCveTipoMerca() {
        return this.preCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPreNumInstrume(BigDecimal preNumInstrume) {
        this.preNumInstrume = preNumInstrume;
    }

    public BigDecimal getPreNumInstrume() {
        return this.preNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPreNumSecEmis(BigDecimal preNumSecEmis) {
        this.preNumSecEmis = preNumSecEmis;
    }

    public BigDecimal getPreNumSecEmis() {
        return this.preNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreAnoPrecEmis(BigDecimal preAnoPrecEmis) {
        this.preAnoPrecEmis = preAnoPrecEmis;
    }

    public BigDecimal getPreAnoPrecEmis() {
        return this.preAnoPrecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreMesPrecEmis(BigDecimal preMesPrecEmis) {
        this.preMesPrecEmis = preMesPrecEmis;
    }

    public BigDecimal getPreMesPrecEmis() {
        return this.preMesPrecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreDiaPrecEmis(BigDecimal preDiaPrecEmis) {
        this.preDiaPrecEmis = preDiaPrecEmis;
    }

    public BigDecimal getPreDiaPrecEmis() {
        return this.preDiaPrecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPreNomPizarra(String preNomPizarra) {
        this.preNomPizarra = preNomPizarra;
    }

    public String getPreNomPizarra() {
        return this.preNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPreSerEmis(String preSerEmis) {
        this.preSerEmis = preSerEmis;
    }

    public String getPreSerEmis() {
        return this.preSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPreNumCuponVig(BigDecimal preNumCuponVig) {
        this.preNumCuponVig = preNumCuponVig;
    }

    public BigDecimal getPreNumCuponVig() {
        return this.preNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPreNumVolOpDia(BigDecimal preNumVolOpDia) {
        this.preNumVolOpDia = preNumVolOpDia;
    }

    public BigDecimal getPreNumVolOpDia() {
        return this.preNumVolOpDia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setPrePrecioMaximo(BigDecimal prePrecioMaximo) {
        this.prePrecioMaximo = prePrecioMaximo;
    }

    public BigDecimal getPrePrecioMaximo() {
        return this.prePrecioMaximo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setPrePrecioMinimo(BigDecimal prePrecioMinimo) {
        this.prePrecioMinimo = prePrecioMinimo;
    }

    public BigDecimal getPrePrecioMinimo() {
        return this.prePrecioMinimo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setPrePrecioCierre(BigDecimal prePrecioCierre) {
        this.prePrecioCierre = prePrecioCierre;
    }

    public BigDecimal getPrePrecioCierre() {
        return this.prePrecioCierre;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPreTasaAnual(BigDecimal preTasaAnual) {
        this.preTasaAnual = preTasaAnual;
    }

    public BigDecimal getPreTasaAnual() {
        return this.preTasaAnual;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreAnoAltaReg(BigDecimal preAnoAltaReg) {
        this.preAnoAltaReg = preAnoAltaReg;
    }

    public BigDecimal getPreAnoAltaReg() {
        return this.preAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreMesAltaReg(BigDecimal preMesAltaReg) {
        this.preMesAltaReg = preMesAltaReg;
    }

    public BigDecimal getPreMesAltaReg() {
        return this.preMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreDiaAltaReg(BigDecimal preDiaAltaReg) {
        this.preDiaAltaReg = preDiaAltaReg;
    }

    public BigDecimal getPreDiaAltaReg() {
        return this.preDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreAnoUltMod(BigDecimal preAnoUltMod) {
        this.preAnoUltMod = preAnoUltMod;
    }

    public BigDecimal getPreAnoUltMod() {
        return this.preAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreMesUltMod(BigDecimal preMesUltMod) {
        this.preMesUltMod = preMesUltMod;
    }

    public BigDecimal getPreMesUltMod() {
        return this.preMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreDiaUltMod(BigDecimal preDiaUltMod) {
        this.preDiaUltMod = preDiaUltMod;
    }

    public BigDecimal getPreDiaUltMod() {
        return this.preDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreHrUltMod(BigDecimal preHrUltMod) {
        this.preHrUltMod = preHrUltMod;
    }

    public BigDecimal getPreHrUltMod() {
        return this.preHrUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreMinUltMod(BigDecimal preMinUltMod) {
        this.preMinUltMod = preMinUltMod;
    }

    public BigDecimal getPreMinUltMod() {
        return this.preMinUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPreCveStPrecio(String preCveStPrecio) {
        this.preCveStPrecio = preCveStPrecio;
    }

    public String getPreCveStPrecio() {
        return this.preCveStPrecio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PRECIOSMH ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM PRECIOSMH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPreCveTipoMerca() != null && this.getPreCveTipoMerca().longValue() == -999) {
            conditions += " AND PRE_CVE_TIPO_MERCA IS NULL";
        } else if (this.getPreCveTipoMerca() != null) {
            conditions += " AND PRE_CVE_TIPO_MERCA = ?";
            values.add(this.getPreCveTipoMerca());
        }

        if (this.getPreNumInstrume() != null && this.getPreNumInstrume().longValue() == -999) {
            conditions += " AND PRE_NUM_INSTRUME IS NULL";
        } else if (this.getPreNumInstrume() != null) {
            conditions += " AND PRE_NUM_INSTRUME = ?";
            values.add(this.getPreNumInstrume());
        }

        if (this.getPreNumSecEmis() != null && this.getPreNumSecEmis().longValue() == -999) {
            conditions += " AND PRE_NUM_SEC_EMIS IS NULL";
        } else if (this.getPreNumSecEmis() != null) {
            conditions += " AND PRE_NUM_SEC_EMIS = ?";
            values.add(this.getPreNumSecEmis());
        }

        if (this.getPreAnoPrecEmis() != null && this.getPreAnoPrecEmis().longValue() == -999) {
            conditions += " AND PRE_ANO_PREC_EMIS IS NULL";
        } else if (this.getPreAnoPrecEmis() != null) {
            conditions += " AND PRE_ANO_PREC_EMIS = ?";
            values.add(this.getPreAnoPrecEmis());
        }

        if (this.getPreMesPrecEmis() != null && this.getPreMesPrecEmis().longValue() == -999) {
            conditions += " AND PRE_MES_PREC_EMIS IS NULL";
        } else if (this.getPreMesPrecEmis() != null) {
            conditions += " AND PRE_MES_PREC_EMIS = ?";
            values.add(this.getPreMesPrecEmis());
        }

        if (this.getPreDiaPrecEmis() != null && this.getPreDiaPrecEmis().longValue() == -999) {
            conditions += " AND PRE_DIA_PREC_EMIS IS NULL";
        } else if (this.getPreDiaPrecEmis() != null) {
            conditions += " AND PRE_DIA_PREC_EMIS = ?";
            values.add(this.getPreDiaPrecEmis());
        }

        if (this.getPreNomPizarra() != null && "null".equals(this.getPreNomPizarra())) {
            conditions += " AND PRE_NOM_PIZARRA IS NULL";
        } else if (this.getPreNomPizarra() != null) {
            conditions += " AND PRE_NOM_PIZARRA = ?";
            values.add(this.getPreNomPizarra());
        }

        if (this.getPreSerEmis() != null && "null".equals(this.getPreSerEmis())) {
            conditions += " AND PRE_SER_EMIS IS NULL";
        } else if (this.getPreSerEmis() != null) {
            conditions += " AND PRE_SER_EMIS = ?";
            values.add(this.getPreSerEmis());
        }

        if (this.getPreNumCuponVig() != null && this.getPreNumCuponVig().longValue() == -999) {
            conditions += " AND PRE_NUM_CUPON_VIG IS NULL";
        } else if (this.getPreNumCuponVig() != null) {
            conditions += " AND PRE_NUM_CUPON_VIG = ?";
            values.add(this.getPreNumCuponVig());
        }

        if (this.getPreNumVolOpDia() != null && this.getPreNumVolOpDia().longValue() == -999) {
            conditions += " AND PRE_NUM_VOL_OP_DIA IS NULL";
        } else if (this.getPreNumVolOpDia() != null) {
            conditions += " AND PRE_NUM_VOL_OP_DIA = ?";
            values.add(this.getPreNumVolOpDia());
        }

        if (this.getPrePrecioMaximo() != null && this.getPrePrecioMaximo().longValue() == -999) {
            conditions += " AND PRE_PRECIO_MAXIMO IS NULL";
        } else if (this.getPrePrecioMaximo() != null) {
            conditions += " AND PRE_PRECIO_MAXIMO = ?";
            values.add(this.getPrePrecioMaximo());
        }

        if (this.getPrePrecioMinimo() != null && this.getPrePrecioMinimo().longValue() == -999) {
            conditions += " AND PRE_PRECIO_MINIMO IS NULL";
        } else if (this.getPrePrecioMinimo() != null) {
            conditions += " AND PRE_PRECIO_MINIMO = ?";
            values.add(this.getPrePrecioMinimo());
        }

        if (this.getPrePrecioCierre() != null && this.getPrePrecioCierre().longValue() == -999) {
            conditions += " AND PRE_PRECIO_CIERRE IS NULL";
        } else if (this.getPrePrecioCierre() != null) {
            conditions += " AND PRE_PRECIO_CIERRE = ?";
            values.add(this.getPrePrecioCierre());
        }

        if (this.getPreTasaAnual() != null && this.getPreTasaAnual().longValue() == -999) {
            conditions += " AND PRE_TASA_ANUAL IS NULL";
        } else if (this.getPreTasaAnual() != null) {
            conditions += " AND PRE_TASA_ANUAL = ?";
            values.add(this.getPreTasaAnual());
        }

        if (this.getPreAnoAltaReg() != null && this.getPreAnoAltaReg().longValue() == -999) {
            conditions += " AND PRE_ANO_ALTA_REG IS NULL";
        } else if (this.getPreAnoAltaReg() != null) {
            conditions += " AND PRE_ANO_ALTA_REG = ?";
            values.add(this.getPreAnoAltaReg());
        }

        if (this.getPreMesAltaReg() != null && this.getPreMesAltaReg().longValue() == -999) {
            conditions += " AND PRE_MES_ALTA_REG IS NULL";
        } else if (this.getPreMesAltaReg() != null) {
            conditions += " AND PRE_MES_ALTA_REG = ?";
            values.add(this.getPreMesAltaReg());
        }

        if (this.getPreDiaAltaReg() != null && this.getPreDiaAltaReg().longValue() == -999) {
            conditions += " AND PRE_DIA_ALTA_REG IS NULL";
        } else if (this.getPreDiaAltaReg() != null) {
            conditions += " AND PRE_DIA_ALTA_REG = ?";
            values.add(this.getPreDiaAltaReg());
        }

        if (this.getPreAnoUltMod() != null && this.getPreAnoUltMod().longValue() == -999) {
            conditions += " AND PRE_ANO_ULT_MOD IS NULL";
        } else if (this.getPreAnoUltMod() != null) {
            conditions += " AND PRE_ANO_ULT_MOD = ?";
            values.add(this.getPreAnoUltMod());
        }

        if (this.getPreMesUltMod() != null && this.getPreMesUltMod().longValue() == -999) {
            conditions += " AND PRE_MES_ULT_MOD IS NULL";
        } else if (this.getPreMesUltMod() != null) {
            conditions += " AND PRE_MES_ULT_MOD = ?";
            values.add(this.getPreMesUltMod());
        }

        if (this.getPreDiaUltMod() != null && this.getPreDiaUltMod().longValue() == -999) {
            conditions += " AND PRE_DIA_ULT_MOD IS NULL";
        } else if (this.getPreDiaUltMod() != null) {
            conditions += " AND PRE_DIA_ULT_MOD = ?";
            values.add(this.getPreDiaUltMod());
        }

        if (this.getPreHrUltMod() != null && this.getPreHrUltMod().longValue() == -999) {
            conditions += " AND PRE_HR_ULT_MOD IS NULL";
        } else if (this.getPreHrUltMod() != null) {
            conditions += " AND PRE_HR_ULT_MOD = ?";
            values.add(this.getPreHrUltMod());
        }

        if (this.getPreMinUltMod() != null && this.getPreMinUltMod().longValue() == -999) {
            conditions += " AND PRE_MIN_ULT_MOD IS NULL";
        } else if (this.getPreMinUltMod() != null) {
            conditions += " AND PRE_MIN_ULT_MOD = ?";
            values.add(this.getPreMinUltMod());
        }

        if (this.getPreCveStPrecio() != null && "null".equals(this.getPreCveStPrecio())) {
            conditions += " AND PRE_CVE_ST_PRECIO IS NULL";
        } else if (this.getPreCveStPrecio() != null) {
            conditions += " AND PRE_CVE_ST_PRECIO = ?";
            values.add(this.getPreCveStPrecio());
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
        String sql = "UPDATE PRECIOSMH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " PRE_CVE_TIPO_MERCA = ?, ";
        values.add(this.getPreCveTipoMerca());
        fields += " PRE_NUM_INSTRUME = ?, ";
        values.add(this.getPreNumInstrume());
        fields += " PRE_NUM_SEC_EMIS = ?, ";
        values.add(this.getPreNumSecEmis());
        fields += " PRE_ANO_PREC_EMIS = ?, ";
        values.add(this.getPreAnoPrecEmis());
        fields += " PRE_MES_PREC_EMIS = ?, ";
        values.add(this.getPreMesPrecEmis());
        fields += " PRE_DIA_PREC_EMIS = ?, ";
        values.add(this.getPreDiaPrecEmis());
        fields += " PRE_NOM_PIZARRA = ?, ";
        values.add(this.getPreNomPizarra());
        fields += " PRE_SER_EMIS = ?, ";
        values.add(this.getPreSerEmis());
        fields += " PRE_NUM_CUPON_VIG = ?, ";
        values.add(this.getPreNumCuponVig());
        fields += " PRE_NUM_VOL_OP_DIA = ?, ";
        values.add(this.getPreNumVolOpDia());
        fields += " PRE_PRECIO_MAXIMO = ?, ";
        values.add(this.getPrePrecioMaximo());
        fields += " PRE_PRECIO_MINIMO = ?, ";
        values.add(this.getPrePrecioMinimo());
        fields += " PRE_PRECIO_CIERRE = ?, ";
        values.add(this.getPrePrecioCierre());
        fields += " PRE_TASA_ANUAL = ?, ";
        values.add(this.getPreTasaAnual());
        fields += " PRE_ANO_ALTA_REG = ?, ";
        values.add(this.getPreAnoAltaReg());
        fields += " PRE_MES_ALTA_REG = ?, ";
        values.add(this.getPreMesAltaReg());
        fields += " PRE_DIA_ALTA_REG = ?, ";
        values.add(this.getPreDiaAltaReg());
        fields += " PRE_ANO_ULT_MOD = ?, ";
        values.add(this.getPreAnoUltMod());
        fields += " PRE_MES_ULT_MOD = ?, ";
        values.add(this.getPreMesUltMod());
        fields += " PRE_DIA_ULT_MOD = ?, ";
        values.add(this.getPreDiaUltMod());
        fields += " PRE_HR_ULT_MOD = ?, ";
        values.add(this.getPreHrUltMod());
        fields += " PRE_MIN_ULT_MOD = ?, ";
        values.add(this.getPreMinUltMod());
        fields += " PRE_CVE_ST_PRECIO = ?, ";
        values.add(this.getPreCveStPrecio());
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
        String sql = "INSERT INTO PRECIOSMH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRE_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getPreCveTipoMerca());

        fields += ", PRE_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getPreNumInstrume());

        fields += ", PRE_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPreNumSecEmis());

        fields += ", PRE_ANO_PREC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPreAnoPrecEmis());

        fields += ", PRE_MES_PREC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPreMesPrecEmis());

        fields += ", PRE_DIA_PREC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPreDiaPrecEmis());

        fields += ", PRE_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPreNomPizarra());

        fields += ", PRE_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getPreSerEmis());

        fields += ", PRE_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getPreNumCuponVig());

        fields += ", PRE_NUM_VOL_OP_DIA";
        fieldValues += ", ?";
        values.add(this.getPreNumVolOpDia());

        fields += ", PRE_PRECIO_MAXIMO";
        fieldValues += ", ?";
        values.add(this.getPrePrecioMaximo());

        fields += ", PRE_PRECIO_MINIMO";
        fieldValues += ", ?";
        values.add(this.getPrePrecioMinimo());

        fields += ", PRE_PRECIO_CIERRE";
        fieldValues += ", ?";
        values.add(this.getPrePrecioCierre());

        fields += ", PRE_TASA_ANUAL";
        fieldValues += ", ?";
        values.add(this.getPreTasaAnual());

        fields += ", PRE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPreAnoAltaReg());

        fields += ", PRE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPreMesAltaReg());

        fields += ", PRE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPreDiaAltaReg());

        fields += ", PRE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreAnoUltMod());

        fields += ", PRE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreMesUltMod());

        fields += ", PRE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreDiaUltMod());

        fields += ", PRE_HR_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreHrUltMod());

        fields += ", PRE_MIN_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreMinUltMod());

        fields += ", PRE_CVE_ST_PRECIO";
        fieldValues += ", ?";
        values.add(this.getPreCveStPrecio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PRECIOSMH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Preciosmh instance = (Preciosmh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPreCveTipoMerca().equals(instance.getPreCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getPreNumInstrume().equals(instance.getPreNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getPreNumSecEmis().equals(instance.getPreNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPreAnoPrecEmis().equals(instance.getPreAnoPrecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPreMesPrecEmis().equals(instance.getPreMesPrecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPreDiaPrecEmis().equals(instance.getPreDiaPrecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPreNomPizarra().equals(instance.getPreNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPreSerEmis().equals(instance.getPreSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPreNumCuponVig().equals(instance.getPreNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getPreNumVolOpDia().equals(instance.getPreNumVolOpDia()))
            equalObjects = false;
        if (equalObjects && !this.getPrePrecioMaximo().equals(instance.getPrePrecioMaximo()))
            equalObjects = false;
        if (equalObjects && !this.getPrePrecioMinimo().equals(instance.getPrePrecioMinimo()))
            equalObjects = false;
        if (equalObjects && !this.getPrePrecioCierre().equals(instance.getPrePrecioCierre()))
            equalObjects = false;
        if (equalObjects && !this.getPreTasaAnual().equals(instance.getPreTasaAnual()))
            equalObjects = false;
        if (equalObjects && !this.getPreAnoAltaReg().equals(instance.getPreAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPreMesAltaReg().equals(instance.getPreMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPreDiaAltaReg().equals(instance.getPreDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPreAnoUltMod().equals(instance.getPreAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreMesUltMod().equals(instance.getPreMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreDiaUltMod().equals(instance.getPreDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreHrUltMod().equals(instance.getPreHrUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreMinUltMod().equals(instance.getPreMinUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreCveStPrecio().equals(instance.getPreCveStPrecio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Preciosmh result = new Preciosmh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPreCveTipoMerca((BigDecimal) objectData.getData("PRE_CVE_TIPO_MERCA"));
        result.setPreNumInstrume((BigDecimal) objectData.getData("PRE_NUM_INSTRUME"));
        result.setPreNumSecEmis((BigDecimal) objectData.getData("PRE_NUM_SEC_EMIS"));
        result.setPreAnoPrecEmis((BigDecimal) objectData.getData("PRE_ANO_PREC_EMIS"));
        result.setPreMesPrecEmis((BigDecimal) objectData.getData("PRE_MES_PREC_EMIS"));
        result.setPreDiaPrecEmis((BigDecimal) objectData.getData("PRE_DIA_PREC_EMIS"));
        result.setPreNomPizarra((String) objectData.getData("PRE_NOM_PIZARRA"));
        result.setPreSerEmis((String) objectData.getData("PRE_SER_EMIS"));
        result.setPreNumCuponVig((BigDecimal) objectData.getData("PRE_NUM_CUPON_VIG"));
        result.setPreNumVolOpDia((BigDecimal) objectData.getData("PRE_NUM_VOL_OP_DIA"));
        result.setPrePrecioMaximo((BigDecimal) objectData.getData("PRE_PRECIO_MAXIMO"));
        result.setPrePrecioMinimo((BigDecimal) objectData.getData("PRE_PRECIO_MINIMO"));
        result.setPrePrecioCierre((BigDecimal) objectData.getData("PRE_PRECIO_CIERRE"));
        result.setPreTasaAnual((BigDecimal) objectData.getData("PRE_TASA_ANUAL"));
        result.setPreAnoAltaReg((BigDecimal) objectData.getData("PRE_ANO_ALTA_REG"));
        result.setPreMesAltaReg((BigDecimal) objectData.getData("PRE_MES_ALTA_REG"));
        result.setPreDiaAltaReg((BigDecimal) objectData.getData("PRE_DIA_ALTA_REG"));
        result.setPreAnoUltMod((BigDecimal) objectData.getData("PRE_ANO_ULT_MOD"));
        result.setPreMesUltMod((BigDecimal) objectData.getData("PRE_MES_ULT_MOD"));
        result.setPreDiaUltMod((BigDecimal) objectData.getData("PRE_DIA_ULT_MOD"));
        result.setPreHrUltMod((BigDecimal) objectData.getData("PRE_HR_ULT_MOD"));
        result.setPreMinUltMod((BigDecimal) objectData.getData("PRE_MIN_ULT_MOD"));
        result.setPreCveStPrecio((String) objectData.getData("PRE_CVE_ST_PRECIO"));

        return result;

    }

}
