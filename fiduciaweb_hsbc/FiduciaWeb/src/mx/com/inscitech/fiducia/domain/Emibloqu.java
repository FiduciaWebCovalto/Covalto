package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMIBLOQU_PK", columns = { "EMB_CVE_TIPO_MERCA", "EMB_NUM_INSTRUME", "EMB_NUM_SEC_EMIS" }, sequences = { "MANUAL" })
public class Emibloqu extends DomainObject {

    BigDecimal embCveTipoMerca = null;
    BigDecimal embNumInstrume = null;
    BigDecimal embNumSecEmis = null;
    String embNomPizarra = null;
    String embNumSerEmis = null;
    BigDecimal embNumCuponVig = null;
    BigDecimal embAnoIniBloque = null;
    BigDecimal embMesIniBloque = null;
    BigDecimal embDiaIniBloque = null;
    BigDecimal embAnoFinBloque = null;
    BigDecimal embMesFinBloque = null;
    BigDecimal embDiaFinBloque = null;
    String embCausaBloqueo = null;
    BigDecimal embCveCompras = null;
    BigDecimal embCveVentas = null;
    BigDecimal embAnoAltaReg = null;
    BigDecimal embMesAltaReg = null;
    BigDecimal embDiaAltaReg = null;
    BigDecimal embAnoUltMod = null;
    BigDecimal embMesUltMod = null;
    BigDecimal embDiaUltMod = null;
    String embCveStCtobloq = null;

    public Emibloqu() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmbCveTipoMerca(BigDecimal embCveTipoMerca) {
        this.embCveTipoMerca = embCveTipoMerca;
    }

    public BigDecimal getEmbCveTipoMerca() {
        return this.embCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmbNumInstrume(BigDecimal embNumInstrume) {
        this.embNumInstrume = embNumInstrume;
    }

    public BigDecimal getEmbNumInstrume() {
        return this.embNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmbNumSecEmis(BigDecimal embNumSecEmis) {
        this.embNumSecEmis = embNumSecEmis;
    }

    public BigDecimal getEmbNumSecEmis() {
        return this.embNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmbNomPizarra(String embNomPizarra) {
        this.embNomPizarra = embNomPizarra;
    }

    public String getEmbNomPizarra() {
        return this.embNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmbNumSerEmis(String embNumSerEmis) {
        this.embNumSerEmis = embNumSerEmis;
    }

    public String getEmbNumSerEmis() {
        return this.embNumSerEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmbNumCuponVig(BigDecimal embNumCuponVig) {
        this.embNumCuponVig = embNumCuponVig;
    }

    public BigDecimal getEmbNumCuponVig() {
        return this.embNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmbAnoIniBloque(BigDecimal embAnoIniBloque) {
        this.embAnoIniBloque = embAnoIniBloque;
    }

    public BigDecimal getEmbAnoIniBloque() {
        return this.embAnoIniBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbMesIniBloque(BigDecimal embMesIniBloque) {
        this.embMesIniBloque = embMesIniBloque;
    }

    public BigDecimal getEmbMesIniBloque() {
        return this.embMesIniBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbDiaIniBloque(BigDecimal embDiaIniBloque) {
        this.embDiaIniBloque = embDiaIniBloque;
    }

    public BigDecimal getEmbDiaIniBloque() {
        return this.embDiaIniBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmbAnoFinBloque(BigDecimal embAnoFinBloque) {
        this.embAnoFinBloque = embAnoFinBloque;
    }

    public BigDecimal getEmbAnoFinBloque() {
        return this.embAnoFinBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbMesFinBloque(BigDecimal embMesFinBloque) {
        this.embMesFinBloque = embMesFinBloque;
    }

    public BigDecimal getEmbMesFinBloque() {
        return this.embMesFinBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbDiaFinBloque(BigDecimal embDiaFinBloque) {
        this.embDiaFinBloque = embDiaFinBloque;
    }

    public BigDecimal getEmbDiaFinBloque() {
        return this.embDiaFinBloque;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmbCausaBloqueo(String embCausaBloqueo) {
        this.embCausaBloqueo = embCausaBloqueo;
    }

    public String getEmbCausaBloqueo() {
        return this.embCausaBloqueo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmbCveCompras(BigDecimal embCveCompras) {
        this.embCveCompras = embCveCompras;
    }

    public BigDecimal getEmbCveCompras() {
        return this.embCveCompras;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmbCveVentas(BigDecimal embCveVentas) {
        this.embCveVentas = embCveVentas;
    }

    public BigDecimal getEmbCveVentas() {
        return this.embCveVentas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmbAnoAltaReg(BigDecimal embAnoAltaReg) {
        this.embAnoAltaReg = embAnoAltaReg;
    }

    public BigDecimal getEmbAnoAltaReg() {
        return this.embAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbMesAltaReg(BigDecimal embMesAltaReg) {
        this.embMesAltaReg = embMesAltaReg;
    }

    public BigDecimal getEmbMesAltaReg() {
        return this.embMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbDiaAltaReg(BigDecimal embDiaAltaReg) {
        this.embDiaAltaReg = embDiaAltaReg;
    }

    public BigDecimal getEmbDiaAltaReg() {
        return this.embDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmbAnoUltMod(BigDecimal embAnoUltMod) {
        this.embAnoUltMod = embAnoUltMod;
    }

    public BigDecimal getEmbAnoUltMod() {
        return this.embAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbMesUltMod(BigDecimal embMesUltMod) {
        this.embMesUltMod = embMesUltMod;
    }

    public BigDecimal getEmbMesUltMod() {
        return this.embMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmbDiaUltMod(BigDecimal embDiaUltMod) {
        this.embDiaUltMod = embDiaUltMod;
    }

    public BigDecimal getEmbDiaUltMod() {
        return this.embDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmbCveStCtobloq(String embCveStCtobloq) {
        this.embCveStCtobloq = embCveStCtobloq;
    }

    public String getEmbCveStCtobloq() {
        return this.embCveStCtobloq;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMIBLOQU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmbCveTipoMerca() != null && this.getEmbCveTipoMerca().longValue() == -999) {
            conditions += " AND EMB_CVE_TIPO_MERCA IS NULL";
        } else if (this.getEmbCveTipoMerca() != null) {
            conditions += " AND EMB_CVE_TIPO_MERCA = ?";
            values.add(this.getEmbCveTipoMerca());
        }

        if (this.getEmbNumInstrume() != null && this.getEmbNumInstrume().longValue() == -999) {
            conditions += " AND EMB_NUM_INSTRUME IS NULL";
        } else if (this.getEmbNumInstrume() != null) {
            conditions += " AND EMB_NUM_INSTRUME = ?";
            values.add(this.getEmbNumInstrume());
        }

        if (this.getEmbNumSecEmis() != null && this.getEmbNumSecEmis().longValue() == -999) {
            conditions += " AND EMB_NUM_SEC_EMIS IS NULL";
        } else if (this.getEmbNumSecEmis() != null) {
            conditions += " AND EMB_NUM_SEC_EMIS = ?";
            values.add(this.getEmbNumSecEmis());
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
        String sql = "SELECT * FROM EMIBLOQU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmbCveTipoMerca() != null && this.getEmbCveTipoMerca().longValue() == -999) {
            conditions += " AND EMB_CVE_TIPO_MERCA IS NULL";
        } else if (this.getEmbCveTipoMerca() != null) {
            conditions += " AND EMB_CVE_TIPO_MERCA = ?";
            values.add(this.getEmbCveTipoMerca());
        }

        if (this.getEmbNumInstrume() != null && this.getEmbNumInstrume().longValue() == -999) {
            conditions += " AND EMB_NUM_INSTRUME IS NULL";
        } else if (this.getEmbNumInstrume() != null) {
            conditions += " AND EMB_NUM_INSTRUME = ?";
            values.add(this.getEmbNumInstrume());
        }

        if (this.getEmbNumSecEmis() != null && this.getEmbNumSecEmis().longValue() == -999) {
            conditions += " AND EMB_NUM_SEC_EMIS IS NULL";
        } else if (this.getEmbNumSecEmis() != null) {
            conditions += " AND EMB_NUM_SEC_EMIS = ?";
            values.add(this.getEmbNumSecEmis());
        }

        if (this.getEmbNomPizarra() != null && "null".equals(this.getEmbNomPizarra())) {
            conditions += " AND EMB_NOM_PIZARRA IS NULL";
        } else if (this.getEmbNomPizarra() != null) {
            conditions += " AND EMB_NOM_PIZARRA = ?";
            values.add(this.getEmbNomPizarra());
        }

        if (this.getEmbNumSerEmis() != null && "null".equals(this.getEmbNumSerEmis())) {
            conditions += " AND EMB_NUM_SER_EMIS IS NULL";
        } else if (this.getEmbNumSerEmis() != null) {
            conditions += " AND EMB_NUM_SER_EMIS = ?";
            values.add(this.getEmbNumSerEmis());
        }

        if (this.getEmbNumCuponVig() != null && this.getEmbNumCuponVig().longValue() == -999) {
            conditions += " AND EMB_NUM_CUPON_VIG IS NULL";
        } else if (this.getEmbNumCuponVig() != null) {
            conditions += " AND EMB_NUM_CUPON_VIG = ?";
            values.add(this.getEmbNumCuponVig());
        }

        if (this.getEmbAnoIniBloque() != null && this.getEmbAnoIniBloque().longValue() == -999) {
            conditions += " AND EMB_ANO_INI_BLOQUE IS NULL";
        } else if (this.getEmbAnoIniBloque() != null) {
            conditions += " AND EMB_ANO_INI_BLOQUE = ?";
            values.add(this.getEmbAnoIniBloque());
        }

        if (this.getEmbMesIniBloque() != null && this.getEmbMesIniBloque().longValue() == -999) {
            conditions += " AND EMB_MES_INI_BLOQUE IS NULL";
        } else if (this.getEmbMesIniBloque() != null) {
            conditions += " AND EMB_MES_INI_BLOQUE = ?";
            values.add(this.getEmbMesIniBloque());
        }

        if (this.getEmbDiaIniBloque() != null && this.getEmbDiaIniBloque().longValue() == -999) {
            conditions += " AND EMB_DIA_INI_BLOQUE IS NULL";
        } else if (this.getEmbDiaIniBloque() != null) {
            conditions += " AND EMB_DIA_INI_BLOQUE = ?";
            values.add(this.getEmbDiaIniBloque());
        }

        if (this.getEmbAnoFinBloque() != null && this.getEmbAnoFinBloque().longValue() == -999) {
            conditions += " AND EMB_ANO_FIN_BLOQUE IS NULL";
        } else if (this.getEmbAnoFinBloque() != null) {
            conditions += " AND EMB_ANO_FIN_BLOQUE = ?";
            values.add(this.getEmbAnoFinBloque());
        }

        if (this.getEmbMesFinBloque() != null && this.getEmbMesFinBloque().longValue() == -999) {
            conditions += " AND EMB_MES_FIN_BLOQUE IS NULL";
        } else if (this.getEmbMesFinBloque() != null) {
            conditions += " AND EMB_MES_FIN_BLOQUE = ?";
            values.add(this.getEmbMesFinBloque());
        }

        if (this.getEmbDiaFinBloque() != null && this.getEmbDiaFinBloque().longValue() == -999) {
            conditions += " AND EMB_DIA_FIN_BLOQUE IS NULL";
        } else if (this.getEmbDiaFinBloque() != null) {
            conditions += " AND EMB_DIA_FIN_BLOQUE = ?";
            values.add(this.getEmbDiaFinBloque());
        }

        if (this.getEmbCausaBloqueo() != null && "null".equals(this.getEmbCausaBloqueo())) {
            conditions += " AND EMB_CAUSA_BLOQUEO IS NULL";
        } else if (this.getEmbCausaBloqueo() != null) {
            conditions += " AND EMB_CAUSA_BLOQUEO = ?";
            values.add(this.getEmbCausaBloqueo());
        }

        if (this.getEmbCveCompras() != null && this.getEmbCveCompras().longValue() == -999) {
            conditions += " AND EMB_CVE_COMPRAS IS NULL";
        } else if (this.getEmbCveCompras() != null) {
            conditions += " AND EMB_CVE_COMPRAS = ?";
            values.add(this.getEmbCveCompras());
        }

        if (this.getEmbCveVentas() != null && this.getEmbCveVentas().longValue() == -999) {
            conditions += " AND EMB_CVE_VENTAS IS NULL";
        } else if (this.getEmbCveVentas() != null) {
            conditions += " AND EMB_CVE_VENTAS = ?";
            values.add(this.getEmbCveVentas());
        }

        if (this.getEmbAnoAltaReg() != null && this.getEmbAnoAltaReg().longValue() == -999) {
            conditions += " AND EMB_ANO_ALTA_REG IS NULL";
        } else if (this.getEmbAnoAltaReg() != null) {
            conditions += " AND EMB_ANO_ALTA_REG = ?";
            values.add(this.getEmbAnoAltaReg());
        }

        if (this.getEmbMesAltaReg() != null && this.getEmbMesAltaReg().longValue() == -999) {
            conditions += " AND EMB_MES_ALTA_REG IS NULL";
        } else if (this.getEmbMesAltaReg() != null) {
            conditions += " AND EMB_MES_ALTA_REG = ?";
            values.add(this.getEmbMesAltaReg());
        }

        if (this.getEmbDiaAltaReg() != null && this.getEmbDiaAltaReg().longValue() == -999) {
            conditions += " AND EMB_DIA_ALTA_REG IS NULL";
        } else if (this.getEmbDiaAltaReg() != null) {
            conditions += " AND EMB_DIA_ALTA_REG = ?";
            values.add(this.getEmbDiaAltaReg());
        }

        if (this.getEmbAnoUltMod() != null && this.getEmbAnoUltMod().longValue() == -999) {
            conditions += " AND EMB_ANO_ULT_MOD IS NULL";
        } else if (this.getEmbAnoUltMod() != null) {
            conditions += " AND EMB_ANO_ULT_MOD = ?";
            values.add(this.getEmbAnoUltMod());
        }

        if (this.getEmbMesUltMod() != null && this.getEmbMesUltMod().longValue() == -999) {
            conditions += " AND EMB_MES_ULT_MOD IS NULL";
        } else if (this.getEmbMesUltMod() != null) {
            conditions += " AND EMB_MES_ULT_MOD = ?";
            values.add(this.getEmbMesUltMod());
        }

        if (this.getEmbDiaUltMod() != null && this.getEmbDiaUltMod().longValue() == -999) {
            conditions += " AND EMB_DIA_ULT_MOD IS NULL";
        } else if (this.getEmbDiaUltMod() != null) {
            conditions += " AND EMB_DIA_ULT_MOD = ?";
            values.add(this.getEmbDiaUltMod());
        }

        if (this.getEmbCveStCtobloq() != null && "null".equals(this.getEmbCveStCtobloq())) {
            conditions += " AND EMB_CVE_ST_CTOBLOQ IS NULL";
        } else if (this.getEmbCveStCtobloq() != null) {
            conditions += " AND EMB_CVE_ST_CTOBLOQ = ?";
            values.add(this.getEmbCveStCtobloq());
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
        String sql = "UPDATE EMIBLOQU SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EMB_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getEmbCveTipoMerca());
        conditions += " AND EMB_NUM_INSTRUME = ?";
        pkValues.add(this.getEmbNumInstrume());
        conditions += " AND EMB_NUM_SEC_EMIS = ?";
        pkValues.add(this.getEmbNumSecEmis());
        fields += " EMB_NOM_PIZARRA = ?, ";
        values.add(this.getEmbNomPizarra());
        fields += " EMB_NUM_SER_EMIS = ?, ";
        values.add(this.getEmbNumSerEmis());
        fields += " EMB_NUM_CUPON_VIG = ?, ";
        values.add(this.getEmbNumCuponVig());
        fields += " EMB_ANO_INI_BLOQUE = ?, ";
        values.add(this.getEmbAnoIniBloque());
        fields += " EMB_MES_INI_BLOQUE = ?, ";
        values.add(this.getEmbMesIniBloque());
        fields += " EMB_DIA_INI_BLOQUE = ?, ";
        values.add(this.getEmbDiaIniBloque());
        fields += " EMB_ANO_FIN_BLOQUE = ?, ";
        values.add(this.getEmbAnoFinBloque());
        fields += " EMB_MES_FIN_BLOQUE = ?, ";
        values.add(this.getEmbMesFinBloque());
        fields += " EMB_DIA_FIN_BLOQUE = ?, ";
        values.add(this.getEmbDiaFinBloque());
        fields += " EMB_CAUSA_BLOQUEO = ?, ";
        values.add(this.getEmbCausaBloqueo());
        fields += " EMB_CVE_COMPRAS = ?, ";
        values.add(this.getEmbCveCompras());
        fields += " EMB_CVE_VENTAS = ?, ";
        values.add(this.getEmbCveVentas());
        fields += " EMB_ANO_ALTA_REG = ?, ";
        values.add(this.getEmbAnoAltaReg());
        fields += " EMB_MES_ALTA_REG = ?, ";
        values.add(this.getEmbMesAltaReg());
        fields += " EMB_DIA_ALTA_REG = ?, ";
        values.add(this.getEmbDiaAltaReg());
        fields += " EMB_ANO_ULT_MOD = ?, ";
        values.add(this.getEmbAnoUltMod());
        fields += " EMB_MES_ULT_MOD = ?, ";
        values.add(this.getEmbMesUltMod());
        fields += " EMB_DIA_ULT_MOD = ?, ";
        values.add(this.getEmbDiaUltMod());
        fields += " EMB_CVE_ST_CTOBLOQ = ?, ";
        values.add(this.getEmbCveStCtobloq());
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
        String sql = "INSERT INTO EMIBLOQU ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EMB_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getEmbCveTipoMerca());

        fields += ", EMB_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getEmbNumInstrume());

        fields += ", EMB_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmbNumSecEmis());

        fields += ", EMB_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getEmbNomPizarra());

        fields += ", EMB_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmbNumSerEmis());

        fields += ", EMB_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getEmbNumCuponVig());

        fields += ", EMB_ANO_INI_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getEmbAnoIniBloque());

        fields += ", EMB_MES_INI_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getEmbMesIniBloque());

        fields += ", EMB_DIA_INI_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getEmbDiaIniBloque());

        fields += ", EMB_ANO_FIN_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getEmbAnoFinBloque());

        fields += ", EMB_MES_FIN_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getEmbMesFinBloque());

        fields += ", EMB_DIA_FIN_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getEmbDiaFinBloque());

        fields += ", EMB_CAUSA_BLOQUEO";
        fieldValues += ", ?";
        values.add(this.getEmbCausaBloqueo());

        fields += ", EMB_CVE_COMPRAS";
        fieldValues += ", ?";
        values.add(this.getEmbCveCompras());

        fields += ", EMB_CVE_VENTAS";
        fieldValues += ", ?";
        values.add(this.getEmbCveVentas());

        fields += ", EMB_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmbAnoAltaReg());

        fields += ", EMB_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmbMesAltaReg());

        fields += ", EMB_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmbDiaAltaReg());

        fields += ", EMB_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmbAnoUltMod());

        fields += ", EMB_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmbMesUltMod());

        fields += ", EMB_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmbDiaUltMod());

        fields += ", EMB_CVE_ST_CTOBLOQ";
        fieldValues += ", ?";
        values.add(this.getEmbCveStCtobloq());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMIBLOQU WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EMB_CVE_TIPO_MERCA = ?";
        values.add(this.getEmbCveTipoMerca());
        conditions += " AND EMB_NUM_INSTRUME = ?";
        values.add(this.getEmbNumInstrume());
        conditions += " AND EMB_NUM_SEC_EMIS = ?";
        values.add(this.getEmbNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emibloqu instance = (Emibloqu) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEmbCveTipoMerca().equals(instance.getEmbCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getEmbNumInstrume().equals(instance.getEmbNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getEmbNumSecEmis().equals(instance.getEmbNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmbNomPizarra().equals(instance.getEmbNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getEmbNumSerEmis().equals(instance.getEmbNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmbNumCuponVig().equals(instance.getEmbNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getEmbAnoIniBloque().equals(instance.getEmbAnoIniBloque()))
            equalObjects = false;
        if (equalObjects && !this.getEmbMesIniBloque().equals(instance.getEmbMesIniBloque()))
            equalObjects = false;
        if (equalObjects && !this.getEmbDiaIniBloque().equals(instance.getEmbDiaIniBloque()))
            equalObjects = false;
        if (equalObjects && !this.getEmbAnoFinBloque().equals(instance.getEmbAnoFinBloque()))
            equalObjects = false;
        if (equalObjects && !this.getEmbMesFinBloque().equals(instance.getEmbMesFinBloque()))
            equalObjects = false;
        if (equalObjects && !this.getEmbDiaFinBloque().equals(instance.getEmbDiaFinBloque()))
            equalObjects = false;
        if (equalObjects && !this.getEmbCausaBloqueo().equals(instance.getEmbCausaBloqueo()))
            equalObjects = false;
        if (equalObjects && !this.getEmbCveCompras().equals(instance.getEmbCveCompras()))
            equalObjects = false;
        if (equalObjects && !this.getEmbCveVentas().equals(instance.getEmbCveVentas()))
            equalObjects = false;
        if (equalObjects && !this.getEmbAnoAltaReg().equals(instance.getEmbAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmbMesAltaReg().equals(instance.getEmbMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmbDiaAltaReg().equals(instance.getEmbDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmbAnoUltMod().equals(instance.getEmbAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmbMesUltMod().equals(instance.getEmbMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmbDiaUltMod().equals(instance.getEmbDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmbCveStCtobloq().equals(instance.getEmbCveStCtobloq()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emibloqu result = new Emibloqu();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEmbCveTipoMerca((BigDecimal) objectData.getData("EMB_CVE_TIPO_MERCA"));
        result.setEmbNumInstrume((BigDecimal) objectData.getData("EMB_NUM_INSTRUME"));
        result.setEmbNumSecEmis((BigDecimal) objectData.getData("EMB_NUM_SEC_EMIS"));
        result.setEmbNomPizarra((String) objectData.getData("EMB_NOM_PIZARRA"));
        result.setEmbNumSerEmis((String) objectData.getData("EMB_NUM_SER_EMIS"));
        result.setEmbNumCuponVig((BigDecimal) objectData.getData("EMB_NUM_CUPON_VIG"));
        result.setEmbAnoIniBloque((BigDecimal) objectData.getData("EMB_ANO_INI_BLOQUE"));
        result.setEmbMesIniBloque((BigDecimal) objectData.getData("EMB_MES_INI_BLOQUE"));
        result.setEmbDiaIniBloque((BigDecimal) objectData.getData("EMB_DIA_INI_BLOQUE"));
        result.setEmbAnoFinBloque((BigDecimal) objectData.getData("EMB_ANO_FIN_BLOQUE"));
        result.setEmbMesFinBloque((BigDecimal) objectData.getData("EMB_MES_FIN_BLOQUE"));
        result.setEmbDiaFinBloque((BigDecimal) objectData.getData("EMB_DIA_FIN_BLOQUE"));
        result.setEmbCausaBloqueo((String) objectData.getData("EMB_CAUSA_BLOQUEO"));
        result.setEmbCveCompras((BigDecimal) objectData.getData("EMB_CVE_COMPRAS"));
        result.setEmbCveVentas((BigDecimal) objectData.getData("EMB_CVE_VENTAS"));
        result.setEmbAnoAltaReg((BigDecimal) objectData.getData("EMB_ANO_ALTA_REG"));
        result.setEmbMesAltaReg((BigDecimal) objectData.getData("EMB_MES_ALTA_REG"));
        result.setEmbDiaAltaReg((BigDecimal) objectData.getData("EMB_DIA_ALTA_REG"));
        result.setEmbAnoUltMod((BigDecimal) objectData.getData("EMB_ANO_ULT_MOD"));
        result.setEmbMesUltMod((BigDecimal) objectData.getData("EMB_MES_ULT_MOD"));
        result.setEmbDiaUltMod((BigDecimal) objectData.getData("EMB_DIA_ULT_MOD"));
        result.setEmbCveStCtobloq((String) objectData.getData("EMB_CVE_ST_CTOBLOQ"));

        return result;

    }

}
